package com.sc4nam.module
package flexfly

import java.io.File
import syntax.{RuleGenerator, IdResolver, RuleTransducer}

/** Outputs FlexFly RUL2 code to 'target/Sec7j_FLEXFly_MANAGED.txt'
  */
object CompileFlexFlyCode extends AbstractMain {

  lazy val resolve: IdResolver = new FlexFlyResolver
  val generator = new FlexFlyRuleGenerator(_)
  lazy val file = new File("target/Sec7j_FLEXFly_MANAGED.txt")

}
