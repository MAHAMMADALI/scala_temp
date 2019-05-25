/* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
* * monkeyTrouble(true, true) → true
* monkeyTrouble(false, false) → true
* monkeyTrouble(true, false) → false
*/
package javaPrograms.Warmup1

object MonkeyTroubleScala {
  def monkeyTrouble(aSmile: Boolean, bSmile: Boolean): Boolean = {
    if (aSmile && bSmile) return true
    if (!aSmile && !bSmile) return true
    false
  }

}
