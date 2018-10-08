package io.bdrc.auth;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*******************************************************************************
 * Copyright (c) 2018 Buddhist Digital Resource Center (BDRC)
 * 
 * If this file is a derivation of another work the license header will appear
 * below; otherwise, this work is licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.
 * 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

public class AuthProps {

    static Properties authProp;

    public final static Logger log = LoggerFactory.getLogger(BdrcJwks.class.getName());

    static {
        final InputStream input = AuthProps.class.getClassLoader().getResourceAsStream("auth.properties");
        try {
            final Properties props = new Properties();
            props.load(input);
            input.close();
            final String propFile = props.getProperty("propertyPath") + props.getProperty("testPropFile");
            final InputStream authInput = new FileInputStream(propFile);
            authProp = new Properties(props);
            authProp.load(authInput);
            authInput.close();
        } catch (IOException e) {
            log.error("initialization error", e);
        }
    }

    public static String getProperty(final String prop) {
        return authProp.getProperty(prop);
    }

}
