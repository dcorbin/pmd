/* Generated By:JJTree: Do not edit this line. ASTKindTest.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTKindTest extends SimpleNode {
  public ASTKindTest(int id) {
    super(id);
  }

  public ASTKindTest(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
