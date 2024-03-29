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

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$17 {

    static final FunctionDescriptor SSL_write$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS,
        JAVA_INT
    );
    static final MethodHandle SSL_write$MH = RuntimeHelper.downcallHandle(
        "SSL_write",
        constants$17.SSL_write$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_ctrl$FUNC = FunctionDescriptor.of(JAVA_LONG,
        ADDRESS,
        JAVA_INT,
        JAVA_LONG,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_ctrl$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_ctrl",
        constants$17.SSL_CTX_ctrl$FUNC, false
    );
    static final FunctionDescriptor SSL_get_version$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_get_version$MH = RuntimeHelper.downcallHandle(
        "SSL_get_version",
        constants$17.SSL_get_version$FUNC, false
    );
    static final FunctionDescriptor TLS_server_method$FUNC = FunctionDescriptor.of(ADDRESS);
    static final MethodHandle TLS_server_method$MH = RuntimeHelper.downcallHandle(
        "TLS_server_method",
        constants$17.TLS_server_method$FUNC, false
    );
    static final FunctionDescriptor SSL_get_ciphers$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_get_ciphers$MH = RuntimeHelper.downcallHandle(
        "SSL_get_ciphers",
        constants$17.SSL_get_ciphers$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_get_ciphers$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_get_ciphers$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_get_ciphers",
        constants$17.SSL_CTX_get_ciphers$FUNC, false
    );
}


