package client.net.sf.saxon.ce.tree.linked;
import client.net.sf.saxon.ce.om.SequenceIterator;
import client.net.sf.saxon.ce.pattern.NodeTest;

final class DescendantEnumeration extends TreeEnumeration {

    private NodeImpl root;
    private boolean includeSelf;

    public DescendantEnumeration(NodeImpl node, NodeTest nodeTest, boolean includeSelf) {
        super(node, nodeTest);
        root = node;
        this.includeSelf = includeSelf;
        if (!includeSelf || !conforms(node)) {
            advance();
        }
    }

    protected void step() {
        next = next.getNextInDocument(root);
    }

    /**
    * Get another enumeration of the same nodes
    */

    public SequenceIterator getAnother() {
        return new DescendantEnumeration(start, nodeTest, includeSelf);
    }
}

// This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
// If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
// This Source Code Form is “Incompatible With Secondary Licenses”, as defined by the Mozilla Public License, v. 2.0.
