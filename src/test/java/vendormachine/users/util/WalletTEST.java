package vendormachine.users.util;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class WalletTEST {

   
    	
    	@Test
    	void emptyConstructorTEST() {
    		Wallet wallet = new Wallet();
    		assertTrue(wallet instanceof Wallet);
    	}
    	

		@Test
    	void ContructorTEST1() {
    		Wallet wallet1 = new Wallet(0.1f);
    		String expected = "Wallet [brand=Generic, storedCredit=0.1]";
    		assertEquals(expected, wallet1.toString());
    	}
    	
    	@Test
    	void ContructorTest2() {
    		Wallet wallet2 = new Wallet("LV", 0.5f);
    		String expected = "Wallet [brand=LV, storedCredit=0.5]";
    		assertEquals(expected, wallet2.toString());
    	}
    	
    	@Test
    	void CreditTESTAdd() {
    		Wallet wallet = new Wallet(0.5f);
    		wallet.addCredit(1f);
    		String expected = "Wallet [brand=Generic, storedCredit=1.5]";
    		assertEquals(expected, wallet.toString());
    	}
    	
    	@Test
    	void CreditTESTGet() {
    		Wallet wallet = new Wallet(0.5f);
    		wallet.getCredit(0.5f);
    		assertEquals(0.0f, wallet.getCredit(0.5f));
    	}
    	
    	@Test
    	void getAllCreditTEST() {
    		Wallet wallet = new Wallet(0.5f);
    		wallet.getAllCredit();
    		assertEquals(0.5f, wallet.getAllCredit());
    	}
    	
    	@Test
    	void getBrandTEST() {
    		Wallet wallet = new Wallet("Tesco Value",0.5f);
    		wallet.getBrand();
    		assertEquals("Tesco Value",wallet.getBrand());
    	}
    	
    	@Test
    	void setCreditTEST() {
    		Wallet wallet = new Wallet("Tesco Value",0.5f);
    		wallet.setCredit(1.5f);
    		assertEquals(1.5f,wallet.getAllCredit());
    	}
    	
    	@Test
    	void setBrandTEST() {
    		Wallet wallet = new Wallet("Tesco Value",0.5f);
    		wallet.setBrand("Tesco Finest");
    		assertEquals("Tesco Finest", wallet.getBrand());
    	}
    	

    }

