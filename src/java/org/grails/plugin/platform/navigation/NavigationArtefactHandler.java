/* Copyright 2011-2012 the original author or authors:
 *
 *    Marc Palmer (marc@grailsrocks.com)
 *    Stéphane Maldini (smaldini@vmware.com)
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
package org.grails.plugin.platform.navigation;

import org.codehaus.groovy.grails.commons.*;
import org.codehaus.groovy.grails.commons.ArtefactHandlerAdapter;

public class NavigationArtefactHandler extends ArtefactHandlerAdapter {

    static public final String TYPE = "Navigation";
    static public final String SUFFIX = "Navigation";
    
    public NavigationArtefactHandler() {
        super(TYPE, NavigationClass.class, DefaultNavigationClass.class, SUFFIX, true);
    }
    
    @Override
    public String getPluginName() {
        return "platformCore";
    }
}