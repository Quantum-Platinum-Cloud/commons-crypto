/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.commons.crypto.jna;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.apache.commons.crypto.stream.PositionedCryptoInputStreamTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 */
public class PositionedCryptoInputStreamJnaTest extends PositionedCryptoInputStreamTest {

    @Test
    public void doTest() throws Exception {
        testCipher(OpenSslJnaCipher.class.getName());
    }

    @BeforeEach
    public void init() {
        assumeTrue(OpenSslJna.isEnabled());
    }

}
