/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.model.net.ssh.config;

import org.jkiss.code.NotNull;

public record SSHPortForwardConfiguration(@NotNull String localHost, int localPort, @NotNull String remoteHost, int remotePort) {
    public static final String LOCAL_HOST = "127.0.0.1";

    @Override
    public String toString() {
        return localHost + ":" + localPort + " <- " + remoteHost + ":" + remotePort;
    }
}
