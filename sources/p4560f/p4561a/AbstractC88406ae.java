package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.ae */
public interface AbstractC88406ae<T> {
    static {
        Covode.recordClassIndex(104448);
    }

    void onError(Throwable th);

    void onSubscribe(AbstractC88412b bVar);

    void onSuccess(T t);
}
