package br.ce.wcaquino.taskbackend.utils;

import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDatasFuturas() {
        LocalDate date = LocalDate.of(2030, 01, 01);
        System.out.println(DateUtils.isEqualOrFutureDate(date));     
    }

    @Test
    public void deveRetornarFalseParaDatasFuturas() {
        LocalDate date = LocalDate.of(2022, 01, 01);
        System.out.println(DateUtils.isEqualOrFutureDate(date));     
    }

    @Test
    public void deveRetornarTrueParaDataAtual() {
        LocalDate date = LocalDate.of(2030, 01, 01);
        System.out.println(DateUtils.isEqualOrFutureDate(date));     
    }
}
