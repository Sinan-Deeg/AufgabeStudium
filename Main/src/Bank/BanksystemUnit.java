package de.hs_mannheim.informatik.bank.facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

class BanksystemUnit {
  
  Banksystem bs;
  @BeforeEach
  public void setUp() {
    bs = new Banksystem();
  }

  @Test
  public void testEinzahlen() {
    bs.einzahlen(500);
    assertEquals(500, bs.getKontostand());
    
  }

  @Test
  public void testNegativEinzahlen() {
    bs.einzahlen(-400);
    assertEquals(-400, bs.getKontostand());
  }

}