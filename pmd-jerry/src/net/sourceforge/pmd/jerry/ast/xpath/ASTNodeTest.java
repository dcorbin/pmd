/* Generated By:JJTree: Do not edit this line. ASTNodeTest.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTNodeTest extends SimpleNode {
  public ASTNodeTest(int id) {
    super(id);
  }

  public ASTNodeTest(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
