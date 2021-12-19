package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.z */
public interface AbstractC88986z<T> {
    static {
        Covode.recordClassIndex(105028);
    }

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(AbstractC88412b bVar);
}
