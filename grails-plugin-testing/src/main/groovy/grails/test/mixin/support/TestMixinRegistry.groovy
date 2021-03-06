/*
 * Copyright 2014 original authors
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
package grails.test.mixin.support

/**
 * A registry for TestMixin instances
 *
 * @author Graeme Rocher
 * @since 3.0
 */
interface TestMixinRegistry {

    /**
     * Registers a new mixin for the given type
     *
     * @param artefactType The artefact type
     * @param mixin The mixin
     */
    void registerMixin(String artefactType, Class mixin)
}
