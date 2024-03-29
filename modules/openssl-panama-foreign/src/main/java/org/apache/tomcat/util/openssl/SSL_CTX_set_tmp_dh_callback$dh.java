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
public interface SSL_CTX_set_tmp_dh_callback$dh {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2);
    static NativeSymbol allocate(SSL_CTX_set_tmp_dh_callback$dh fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(SSL_CTX_set_tmp_dh_callback$dh.class, fi, constants$21.SSL_CTX_set_tmp_dh_callback$dh$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static SSL_CTX_set_tmp_dh_callback$dh ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("SSL_CTX_set_tmp_dh_callback$dh::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$21.SSL_CTX_set_tmp_dh_callback$dh$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


