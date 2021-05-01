package com.eu.aula.exercicios.o2ConversorTempo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversorTempoTest {

  @Test
  void converterHoraEmMinuto() {
    assertEquals(180, ConversorTempo.horaEmMinuto(3));
  }

  @Test
  void converterHoraEmSegundo() {
    assertEquals(10800, ConversorTempo.horaEmSegundo(3));
  }

  @Test
  void converterHoraEmMilisegundos() {
    assertEquals(10800000, ConversorTempo.horaEmMilisegundos(3));
  }

  @Test
  void converterMinutoEmHora() {
    assertEquals(10800000, ConversorTempo.horaEmMilisegundos(3));
  }

  @Test
  void converterMinutoEmSegundo() {
    assertEquals(180, ConversorTempo.minutoEmSegundo(3));
  }

  @Test
  void converterMinutoEmMilisegundo() {
    assertEquals(180000, ConversorTempo.minutoEmMilisegundo(3));
  }

  @Test
  void converterSegundoEmHora() {
    assertEquals(3, ConversorTempo.segundoEmHora(10800));
  }

  @Test
  void converterSegundoEmMinuto() {
    assertEquals(3, ConversorTempo.segundoEmMinuto(180));
  }

  @Test
  void converterSegundoEmMilisegundo() {
    assertEquals(3000, ConversorTempo.segundoEmMilisegundo(3));
  }

  @Test
  void converterMilisegundoEmSegundo() {
    assertEquals(3, ConversorTempo.milisegundoEmSegundo(3000));
  }

  @Test
  void converterMilisegundoEmMinuto() {
    assertEquals(3, ConversorTempo.milisegundoEmMinuto(180000));
  }

  @Test
  void converterMilisegundoEmHora() {
    assertEquals(3, ConversorTempo.milisegundoEmHora(10800000));
  }
}
