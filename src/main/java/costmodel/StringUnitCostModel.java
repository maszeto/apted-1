/* MIT License
 *
 * Copyright (c) 2017 Database Research Group Salzburg
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cost;

import cost.CostModel;
import node.Node;
import node.StringNodeData;

/**
 * This is a unit-nost model defined on string labels.
 *
 * @see CostModel
 * @see StringNodeData
 */
public class StringUnitCostModel implements CostModel<Node<StringNodeData>> {

  /**
   * Calculates the cost of deleting a node.
   *
   * @param n a node considered to be deleted.
   * @return 1 - a fixed cost of deleting a node.
   */
  public float del(Node<StringNodeData> n) {
    return 1.0f;
  }

  /**
   * Calculates the cost of inserting a node.
   *
   * @param n a node considered to be inserted.
   * @return 1 - a fixed cost of inserting a node.
   */
  public float ins(Node<StringNodeData> n) {
    return 1.0f;
  }

  /**
   * Calculates the cost of renaming (mapping) two nodes.
   *
   * @param n1 a source node for rename (mapping).
   * @param n2 a destination node for rename (mapping).
   * @return 1 if labels of renamed nodes are equal, and 0 otherwise.
   */
  public float ren(Node<StringNodeData> n1, Node<StringNodeData> n2) {
    return n1.getNodeData().getLabel() == n2.getNodeData().getLabel() ? 0.0f : 1.0f;
  }
}
