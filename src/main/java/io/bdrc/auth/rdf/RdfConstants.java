package io.bdrc.auth.rdf;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

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

public class RdfConstants {

    public static final String AUTH_RESOURCE_BASE = "http://purl.bdrc.io/resource-nc/auth/";
    public static final String AUTH_VOC_BASE = "http://purl.bdrc.io/ontology/ext/auth/";
    public static final Resource APPLICATION = ResourceFactory.createResource(AUTH_VOC_BASE + "Application");
    public static final Resource PERMISSION = ResourceFactory.createResource(AUTH_VOC_BASE + "Permission");
    public static final Resource ROLE = ResourceFactory.createResource(AUTH_VOC_BASE + "Role");
    public static final Resource GROUP = ResourceFactory.createResource(AUTH_VOC_BASE + "Group");
    public static final Resource USER = ResourceFactory.createResource(AUTH_VOC_BASE + "UserProfile");
    public static final Resource ENDPOINT = ResourceFactory.createResource(AUTH_VOC_BASE + "Endpoint");
    public static final Resource RES_ACCESS = ResourceFactory.createResource(AUTH_VOC_BASE + "ResourceAccess");

    public final static Property APPID = ResourceFactory.createProperty(AUTH_VOC_BASE + "appId");
    public final static String APPID_URI = AUTH_VOC_BASE + "appId";
    public final static Property AUTHID = ResourceFactory.createProperty(AUTH_VOC_BASE + "authId");
    public final static Property APPTYPE = ResourceFactory.createProperty(AUTH_VOC_BASE + "appType");
    public final static Property PATH = ResourceFactory.createProperty(AUTH_VOC_BASE + "path");
    public final static String PATH_URI = AUTH_VOC_BASE + "path";
    public final static Property FOR_ROLE = ResourceFactory.createProperty(AUTH_VOC_BASE + "forRole");
    public final static String FOR_ROLE_URI = AUTH_VOC_BASE + "forRole";
    public final static Property FOR_GROUP = ResourceFactory.createProperty(AUTH_VOC_BASE + "forGroup");
    public final static String FOR_GROUP_URI = AUTH_VOC_BASE + "forGroup";
    public final static Property FOR_PERM = ResourceFactory.createProperty(AUTH_VOC_BASE + "forPermission");
    public final static String FOR_PERM_URI = AUTH_VOC_BASE + "forPermission";
    public final static Property DESC = ResourceFactory.createProperty(AUTH_VOC_BASE + "desc");
    public final static Property HAS_MEMBER = ResourceFactory.createProperty(AUTH_VOC_BASE + "hasMember");
    public final static Property HAS_ROLE = ResourceFactory.createProperty(AUTH_VOC_BASE + "hasRole");
    public final static Property HAS_PERMISSION = ResourceFactory.createProperty(AUTH_VOC_BASE + "hasPermission");
    public final static Property IS_SOCIAL = ResourceFactory.createProperty(AUTH_VOC_BASE + "isSocial");
    public final static Property PROVIDER = ResourceFactory.createProperty(AUTH_VOC_BASE + "provider");
    public final static Property CONNECTION = ResourceFactory.createProperty(AUTH_VOC_BASE + "connection");
    public final static Property POLICY = ResourceFactory.createProperty(AUTH_VOC_BASE + "policy");
    public final static String POLICY_URI = AUTH_VOC_BASE + "policy";
    public final static Property PERSONAL_ACCESS = ResourceFactory.createProperty(AUTH_VOC_BASE + "personalAccess");
    public final static String PERSONAL_ACCESS_URI = AUTH_VOC_BASE + "personalAccess";
    public final static Property ANY_STATUS = ResourceFactory.createProperty(AUTH_VOC_BASE + "forAnyStatus");
    public final static String ANY_STATUS_URI = AUTH_VOC_BASE + "forAnyStatus";

    public static final String RESTRICTED_SEALED = "AccessRestrictedSealed";
    public static final String RESTRICTED_CHINA = "AccessRestrictedInChina";
    public static final String OPEN = "AccessOpen";
    public static final String RESTRICTED_TEMP = "AccessRestrictedTemporarily";
    public static final String RESTRICTED_BY_QUALITY = "AccessRestrictedByQuality";
    public static final String MIXED = "AccessMixed";
    public static final String RESTRICTED_BY_TBRC = "AccessRestrictedByTbrc";
    public static final String FAIR_USE = "AccessFairUse";

    public static final String STATUS_RELEASED = "StatusReleased";

}