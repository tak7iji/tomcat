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
class constants$6 {

    static final FunctionDescriptor DH_set0_pqg$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle DH_set0_pqg$MH = RuntimeHelper.downcallHandle(
        "DH_set0_pqg",
        constants$6.DH_set0_pqg$FUNC, false
    );
    static final FunctionDescriptor X509_STORE_set_flags$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        JAVA_LONG
    );
    static final MethodHandle X509_STORE_set_flags$MH = RuntimeHelper.downcallHandle(
        "X509_STORE_set_flags",
        constants$6.X509_STORE_set_flags$FUNC, false
    );
    static final FunctionDescriptor X509_STORE_CTX_get0_untrusted$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle X509_STORE_CTX_get0_untrusted$MH = RuntimeHelper.downcallHandle(
        "X509_STORE_CTX_get0_untrusted",
        constants$6.X509_STORE_CTX_get0_untrusted$FUNC, false
    );
    static final FunctionDescriptor X509_STORE_add_lookup$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle X509_STORE_add_lookup$MH = RuntimeHelper.downcallHandle(
        "X509_STORE_add_lookup",
        constants$6.X509_STORE_add_lookup$FUNC, false
    );
    static final FunctionDescriptor X509_LOOKUP_hash_dir$FUNC = FunctionDescriptor.of(ADDRESS);
    static final MethodHandle X509_LOOKUP_hash_dir$MH = RuntimeHelper.downcallHandle(
        "X509_LOOKUP_hash_dir",
        constants$6.X509_LOOKUP_hash_dir$FUNC, false
    );
    static final FunctionDescriptor X509_LOOKUP_file$FUNC = FunctionDescriptor.of(ADDRESS);
    static final MethodHandle X509_LOOKUP_file$MH = RuntimeHelper.downcallHandle(
        "X509_LOOKUP_file",
        constants$6.X509_LOOKUP_file$FUNC, false
    );
}


