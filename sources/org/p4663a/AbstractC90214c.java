package org.p4663a;

import com.bytedance.covode.number.Covode;

/* renamed from: org.a.c */
public interface AbstractC90214c<T> {
    static {
        Covode.recordClassIndex(106388);
    }

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(AbstractC90215d dVar);
}
