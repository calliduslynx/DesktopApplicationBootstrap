package de.mabe.catstore

import org.junit.Assert.assertEquals
import org.junit.Test

class BillingServiceTest {
  private val billingService = BillingService()

  @Test fun `addNumbers works with positive numbers`() {
    assertEquals(6, billingService.addNumbers(2, 4))
  }

  @Test fun `addNumbers works with positive number and zero`() {
    assertEquals(2, billingService.addNumbers(2, 0))
    assertEquals(2, billingService.addNumbers(0, 2))
  }
}