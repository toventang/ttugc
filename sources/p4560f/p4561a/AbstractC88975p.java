package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.p */
public interface AbstractC88975p<T> {
    static {
        Covode.recordClassIndex(105017);
    }

    void onComplete();

    void onError(Throwable th);

    void onSubscribe(AbstractC88412b bVar);

    void onSuccess(T t);
}
