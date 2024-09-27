package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

//component scan 의 대상이 된다.
@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {

    //저장 로직
    public void save(String itemId) {
        if (itemId.equals("ex")) {
            //item.Id가 "ex" 라는 로직이 넘어오면 예외를 터트림
            throw new IllegalStateException("예외 발생!");
        }
        //상품을 저장하는데 1초 정도 걸린다.
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
