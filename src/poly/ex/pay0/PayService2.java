package poly.ex.pay0;

public class PayService2 {
    public void processPayy(String payOption, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다 : option = " + payOption + " amount = " + amount);

        Pay pay = PayStore.findPay(payOption);

        if(pay != null) {
            result = pay.pay(amount);
        }

        if(result) {
            System.out.println("결제가 성공했습니다.");
        }else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
