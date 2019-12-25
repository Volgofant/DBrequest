import org.junit.Assert;
import org.junit.Test;

public class mainTest {

    @Test
    public void compareCustomersShopClub() {
        GetCountCustomersShop shop = new GetCountCustomersShop();
        GetCountCustomersClub club = new GetCountCustomersClub();
        System.out.println("Расхождение в количестве : " + (Math.max(shop.getCount(), club.getCount()) - Math.min(shop.getCount(), club.getCount())));
        Assert.assertEquals(shop.getCount(), club.getCount());
    }
}
