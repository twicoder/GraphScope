/*
 * Copyright 2020 Alibaba Group Holding Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.graphscope.common.ir.meta.reader;

import java.io.InputStream;
import java.util.List;

// MetaDataReader is used to read meta data from a data source (can be a local file or
// remote web service)
public interface MetaDataReader {

    // if enableProcedures is null, return all stored procedures
    List<InputStream> getStoredProcedures() throws Exception;

    InputStream getGraphSchema() throws Exception;
}