package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import kotlinx.coroutines.AbstractC89587ci;

public interface MainDispatcherFactory {
    static {
        Covode.recordClassIndex(105717);
    }

    AbstractC89587ci createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
