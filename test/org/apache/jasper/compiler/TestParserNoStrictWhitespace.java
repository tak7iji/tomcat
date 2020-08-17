/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jasper.compiler;

import java.io.File;

import jakarta.servlet.ServletContext;

import org.junit.Assert;
import org.junit.Test;

import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardWrapper;
import org.apache.catalina.startup.TomcatBaseTest;
import org.apache.tomcat.util.buf.ByteChunk;

/**
 * Tests duplicate those in {@link TestParser} where the strict whitespace
 * parsing is enabled by default. Strict whitespace parsing is disabled for
 * these tests in web.xml.
 */
public class TestParserNoStrictWhitespace extends TomcatBaseTest {

    @Test
    public void testBug49297NoSpaceNotStrict() throws Exception {
        getTomcatInstanceTestWebapp(false, true);

        // Github / Travis / s390x debug code
        StandardContext ctxt = (StandardContext) getTomcatInstance().getHost().findChild("/test");
        StandardWrapper w = (StandardWrapper) ctxt.findChild("bug49297NoSpace");
        System.out.println("JSP strict whitespace: [" +  w.getInitParameter("strictWhitespace") + "]");

        File tmpJsp = new File("test/webapp/bug49nnn/bug49297NoSpace.jsp");
        System.out.println(".jsp [" + tmpJsp.lastModified() + "]");

        File tmp = (File) ctxt.getServletContext().getAttribute(ServletContext.TEMPDIR);
        File tmpJava = new File(tmp, "org/apache/jsp/bug49nnn/bug49297NoSpace_jsp.java");
        File tmpClass = new File(tmp, "org/apache/jsp/bug49nnn/bug49297NoSpace_jsp.class");
        System.out.println("before request  .java [" + tmpJava.lastModified() + "]");
        System.out.println("before request .class [" + tmpClass.lastModified() + "]");
        // debug code end

        ByteChunk res = new ByteChunk();
        int sc = getUrl("http://localhost:" + getPort() +
                "/test/bug49nnn/bug49297NoSpace.jsp", res, null);

        // Github / Travis / s390x debug code
        System.out.println("after request  .java [" + tmpJava.lastModified() + "]");
        System.out.println("after request .class [" + tmpClass.lastModified() + "]");
        // debug code end

        Assert.assertEquals(200, sc);
        assertEcho(res.toString(), "Hello World");
    }

    /** Assertion for text printed by tags:echo */
    private static void assertEcho(String result, String expected) {
        Assert.assertTrue(result.indexOf("<p>" + expected + "</p>") > 0);
    }
}
