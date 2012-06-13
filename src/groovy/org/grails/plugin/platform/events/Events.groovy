/* Copyright 2011-2012 the original author or authors:
 *
 *    Marc Palmer (marc@grailsrocks.com)
 *    Stéphane Maldini (stephane.maldini@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.plugin.platform.events

import org.grails.plugin.platform.events.EventReply

interface Events {
    EventReply event(String scope, String topic)
    EventReply event(String scope, String topic, data)
    EventReply event(String scope, String topic, data, Map params)
    EventReply eventAsync(String scope, String topic)
    EventReply eventAsync(String scope, String topic, data)
    EventReply eventAsync(String scope, String topic, data, Map params)
    void eventAsyncWithCallback(String scope, String topic, Closure callback) 
    void eventAsyncWithCallback(String scope, String topic, data, Closure callback) 
    void eventAsyncWithCallback(String scope, String topic, data, Closure callback, Map params)
    
    Object[] waitFor(EventReply... replies)
    
    // ***** Not sure about these *****
    String addListener(String scope, String topic, Closure callback)
    int removeListeners(String callbackId)
    int countListeners(String callbackId)
}