package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//component scan 의 대상이 된다.
@Service
@RequiredArgsConstructor
public class OrderServiceV0 {

    //orderRepositoryV0 를 사용하기 때문에 의존관계가 주입이 되어야한다.
    private final OrderRepositoryV0 orderRepositoryV0;

    public void orderItem(String itemId) {
        orderRepositoryV0.save(itemId);
    }
}
