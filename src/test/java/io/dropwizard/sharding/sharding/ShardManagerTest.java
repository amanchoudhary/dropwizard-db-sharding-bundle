/*
 * Copyright 2016 Santanu Sinha <santanu.sinha@gmail.com>
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
 *
 */

package io.dropwizard.sharding.sharding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShardManagerTest {

   @Test
    public void testShardForBucket() throws Exception {
        ShardManager shardManager = new ShardManager(5);
        System.out.println(shardManager);
        assertEquals(0, shardManager.shardForBucket(100));
    }
}