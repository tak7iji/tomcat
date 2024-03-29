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
class constants$1 {

    static final FunctionDescriptor BIO_s_file$FUNC = FunctionDescriptor.of(ADDRESS);
    static final MethodHandle BIO_s_file$MH = RuntimeHelper.downcallHandle(
        "BIO_s_file",
        constants$1.BIO_s_file$FUNC, false
    );
    static final FunctionDescriptor BIO_new_file$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle BIO_new_file$MH = RuntimeHelper.downcallHandle(
        "BIO_new_file",
        constants$1.BIO_new_file$FUNC, false
    );
    static final FunctionDescriptor BIO_new$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle BIO_new$MH = RuntimeHelper.downcallHandle(
        "BIO_new",
        constants$1.BIO_new$FUNC, false
    );
    static final FunctionDescriptor BIO_free$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS
    );
    static final MethodHandle BIO_free$MH = RuntimeHelper.downcallHandle(
        "BIO_free",
        constants$1.BIO_free$FUNC, false
    );
    static final FunctionDescriptor BIO_read$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS,
        JAVA_INT
    );
    static final MethodHandle BIO_read$MH = RuntimeHelper.downcallHandle(
        "BIO_read",
        constants$1.BIO_read$FUNC, false
    );
    static final FunctionDescriptor BIO_write$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS,
        JAVA_INT
    );
    static final MethodHandle BIO_write$MH = RuntimeHelper.downcallHandle(
        "BIO_write",
        constants$1.BIO_write$FUNC, false
    );
}


