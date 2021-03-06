package client.net.sf.saxon.ce.xmldom;

/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.xml.client.CDATASection;
import com.google.gwt.xml.client.Comment;
import com.google.gwt.xml.client.DOMException;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.DocumentFragment;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.Node;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.xml.client.ProcessingInstruction;
import com.google.gwt.xml.client.Text;

/**
 * This class wraps the native Document object.
 */
class DocumentImpl extends NodeXml implements Document {

  protected DocumentImpl(JavaScriptObject o) {
    super(o);
  }

  /**
   * This function delegates to the native method
   * <code>createCDATASection</code> in XMLParserImpl.
   */
  public CDATASection createCDATASection(String data) {
    try {
      return (CDATASection) NodeXml.build(XMLParserImpl.createCDATASection(
          this.getJsObject(), data));
    } catch (JavaScriptException e) {
      throw new DOMNodeExceptionXml(DOMException.INVALID_CHARACTER_ERR, e, this);
    }
  }

  /**
   * This function delegates to the native method <code>createComment</code>
   * in XMLParserImpl.
   */
  public Comment createComment(String data) {
    try {
      return (Comment) NodeXml.build(XMLParserImpl.createComment(
          this.getJsObject(), data));
    } catch (JavaScriptException e) {
      throw new DOMNodeExceptionXml(DOMException.INVALID_CHARACTER_ERR, e, this);
    }
  }

  /**
   * This function delegates to the native method
   * <code>createDocumentFragment</code> in XMLParserImpl.
   */
  public DocumentFragment createDocumentFragment() {
    try {
      return (DocumentFragment) NodeXml.build(XMLParserImpl.createDocumentFragment(this.getJsObject()));
    } catch (JavaScriptException e) {
      throw new DOMNodeExceptionXml(DOMException.INVALID_CHARACTER_ERR, e, this);
    }
  }

  /**
   * This function delegates to the native method <code>createElement</code>
   * in XMLParserImpl.
   */
  public Element createElement(String tagName) {
    try {
      return (Element) NodeXml.build(XMLParserImpl.createElement(
          this.getJsObject(), tagName));
    } catch (JavaScriptException e) {
      throw new DOMNodeExceptionXml(DOMException.INVALID_CHARACTER_ERR, e, this);
    }
  }

  /**
   * This function delegates to the native method
   * <code>createProcessingInstruction</code> in XMLParserImpl.
   */
  public ProcessingInstruction createProcessingInstruction(String target,
      String data) {
    try {
      return (ProcessingInstruction) NodeXml.build(XMLParserImpl.createProcessingInstruction(
          this.getJsObject(), target, data));
    } catch (JavaScriptException e) {
      throw new DOMNodeExceptionXml(DOMException.INVALID_CHARACTER_ERR, e, this);
    }
  }

  /**
   * This function delegates to the native method <code>createTextNode</code>
   * in XMLParserImpl.
   */
  public Text createTextNode(String data) {
    try {
      return (Text) NodeXml.build(XMLParserImpl.createTextNode(
          this.getJsObject(), data));
    } catch (JavaScriptException e) {
      throw new DOMNodeExceptionXml(DOMException.INVALID_CHARACTER_ERR, e, this);
    }
  }

  /**
   * This function delegates to the native method
   * <code>getDocumentElement</code> in XMLParserImpl.
   */
  public Element getDocumentElement() {
    return (Element) NodeXml.build(XMLParserImpl.getDocumentElement(this.getJsObject()));
  }

  /**
   * This function delegates to the native method <code>getElementById</code>
   * in XMLParserImpl.
   */
  public Element getElementById(String elementId) {
    return (Element) NodeXml.build(XMLParserImpl.getElementById(
        this.getJsObject(), elementId));
  }

  /**
   * This function delegates to the native method
   * <code>getElementsByTagName</code> in XMLParserImpl.
   */
  public NodeList getElementsByTagName(String tagName) {
    return new NodeListImpl(XMLParserImpl.getElementsByTagName(
        this.getJsObject(), tagName));
  }

  /**
   * This function delegates to the native method <code>importNode</code> in
   * XMLParserImpl.
   */
  public Node importNode(Node importedNode, boolean deep) {
    try {
      return NodeXml.build(XMLParserImpl.importNode(this.getJsObject(),
          ((DomItemXml) importedNode).getJsObject(), deep));
    } catch (JavaScriptException e) {
      throw new DOMNodeExceptionXml(DOMException.INVALID_STATE_ERR, e, this);
    }
  }
}

// This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
// If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
// This Source Code Form is “Incompatible With Secondary Licenses”, as defined by the Mozilla Public License, v. 2.0.

