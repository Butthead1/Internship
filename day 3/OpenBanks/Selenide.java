package OpenBanks;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

import OpenBanks.OpenBank;

@Test
public class Selenide {
    @Test
    public void selenide() {
        OpenBank openBank = open("https://www.open.ru", OpenBank.class);
        System.out.println("USD: " + openBank.getUsdBuy() + " / " + openBank.getUsdTrade());
        System.out.println("EUR: " + openBank.getEurBuy() + " / " + openBank.getEurTrade());
        Assert.assertTrue(openBank.getUsdBuy() < openBank.getUsdTrade());
        Assert.assertTrue(openBank.getEurBuy() < openBank.getEurTrade());

    }


}
