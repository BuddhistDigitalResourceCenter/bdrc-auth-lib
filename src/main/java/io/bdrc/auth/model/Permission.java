package io.bdrc.auth.model;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import io.bdrc.auth.rdf.RdfConstants;

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

public class Permission {

    String id;
    String appId;
    String name;
    String desc;
    Model model;

    public Permission(JsonNode json) throws JsonProcessingException {
        id = getJsonValue(json, "_id");
        name = getJsonValue(json, "name");
        desc = getJsonValue(json, "description");
        appId = getJsonValue(json, "applicationId");
        model = buildModel();
    }

    public Permission() {
        id = "";
        name = "";
        desc = "";
        appId = "";
    }

    String getJsonValue(final JsonNode json, final String key) {
        final JsonNode tmp = json.findValue(key);
        if (tmp != null) {
            return tmp.asText();
        }
        return "";
    }

    Model buildModel() {
        final Resource perm = ResourceFactory.createResource(RdfConstants.AUTH_RESOURCE_BASE + id);
        final Model res = ModelFactory.createDefaultModel();
        res.add(perm, RDF.type, RdfConstants.PERMISSION);
        res.add(perm, RDFS.label, ResourceFactory.createStringLiteral(name));
        res.add(perm, RdfConstants.DESC, ResourceFactory.createStringLiteral(desc));
        res.add(perm, RdfConstants.APPID, ResourceFactory.createResource(RdfConstants.AUTH_RESOURCE_BASE + appId));
        return res;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Model getModel() {
        return model;
    }

    public String getAppId() {
        return appId;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Permission [id=" + id + ", appId=" + appId + ", name=" + name + ", desc=" + desc + ", model=" + model
                + "]";
    }

}
