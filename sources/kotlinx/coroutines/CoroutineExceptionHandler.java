package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89127f;

public interface CoroutineExceptionHandler extends AbstractC89127f.AbstractC89130b {

    /* renamed from: c */
    public static final C89450a f203145c = C89450a.f203146a;

    static {
        Covode.recordClassIndex(105535);
    }

    void handleException(AbstractC89127f fVar, Throwable th);

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C89450a implements AbstractC89127f.AbstractC89132c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C89450a f203146a = new C89450a();

        private C89450a() {
        }

        static {
            Covode.recordClassIndex(105536);
        }
    }
}
