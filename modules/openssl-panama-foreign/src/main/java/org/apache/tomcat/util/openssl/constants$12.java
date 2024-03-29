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
class constants$12 {

    static final FunctionDescriptor SSL_CTX_set_timeout$FUNC = FunctionDescriptor.of(JAVA_LONG,
        ADDRESS,
        JAVA_LONG
    );
    static final MethodHandle SSL_CTX_set_timeout$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_set_timeout",
        constants$12.SSL_CTX_set_timeout$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_get_timeout$FUNC = FunctionDescriptor.of(JAVA_LONG,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_get_timeout$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_get_timeout",
        constants$12.SSL_CTX_get_timeout$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_get_cert_store$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_get_cert_store$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_get_cert_store",
        constants$12.SSL_CTX_get_cert_store$FUNC, false
    );
    static final FunctionDescriptor SSL_get_current_cipher$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_get_current_cipher$MH = RuntimeHelper.downcallHandle(
        "SSL_get_current_cipher",
        constants$12.SSL_get_current_cipher$FUNC, false
    );
    static final FunctionDescriptor SSL_CIPHER_get_name$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_CIPHER_get_name$MH = RuntimeHelper.downcallHandle(
        "SSL_CIPHER_get_name",
        constants$12.SSL_CIPHER_get_name$FUNC, false
    );
    static final FunctionDescriptor SSL_CIPHER_get_kx_nid$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS
    );
    static final MethodHandle SSL_CIPHER_get_kx_nid$MH = RuntimeHelper.downcallHandle(
        "SSL_CIPHER_get_kx_nid",
        constants$12.SSL_CIPHER_get_kx_nid$FUNC, false
    );
}


