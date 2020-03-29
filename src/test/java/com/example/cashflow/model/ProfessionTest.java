package com.example.cashflow.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ProfessionTest {
    private Profession profession;
    private int monthlyCashflow;
    private int initialAccount;

    public ProfessionTest(Profession profession, int monthlyCashflow, int initialAccount) {
        this.profession = profession;
        this.monthlyCashflow = monthlyCashflow;
        this.initialAccount = initialAccount;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {Profession.AIRLINE_PILOT, 3500, 6000},
                {Profession.BUSINESS_MGR, 1600, 2000},
                {Profession.DOCTOR, 4900, 8400},
                {Profession.ENGINEER, 1700, 2100},
                {Profession.JANITOR, 600, 1200},
                {Profession.LAWYER, 2400, 4400},
                {Profession.MECHANIC, 700, 1400},
                {Profession.NURSE, 1100, 1600},
                {Profession.POLICE_OFFICER, 1100, 1600},
                {Profession.SECRETARY, 900, 1600},
                {Profession.TEACHER, 1200, 1600},
                {Profession.TRUCK_DRIVER, 800, 1600}
        });
    }

    @Test
    public void testGetMonthlyCashflow(){
        Assert.assertEquals(profession.getMonthlyCashflow(), monthlyCashflow);
        Assert.assertEquals(profession.getInitialAccount(), initialAccount);
    }
}
