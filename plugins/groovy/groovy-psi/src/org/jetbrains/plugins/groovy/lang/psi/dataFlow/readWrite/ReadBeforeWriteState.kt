// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.jetbrains.plugins.groovy.lang.psi.dataFlow.readWrite

import java.util.*

class ReadBeforeWriteState(
  val writes: BitSet = BitSet(),
  val reads: BitSet = BitSet()
) : Cloneable {

  public override fun clone(): ReadBeforeWriteState = ReadBeforeWriteState(writes.clone() as BitSet, reads.clone() as BitSet)

  override fun toString(): String = "(writes=$writes, reads=$reads)"
}
