package com.orangehrmtestcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.orangehrmbasictest.Basepage;
import com.orangehrmbasictest.Excel_reader;

public class Testcase1 extends Basepage
{
@Test
public void Testcase01() throws IOException, Exception
{
	pim.clickpim().click();
pim.addemp().click();
pim.firstname().sendKeys(Excel_reader.Readdata("Sheet1", 1, 0));
pim.middlename().sendKeys(Excel_reader.Readdata("Sheet1", 1, 1));
pim.lastname().sendKeys(Excel_reader.Readdata("Sheet1", 1, 2));

}
}
