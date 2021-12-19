package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;

/* renamed from: com.bytedance.retrofit2.b */
public interface AbstractC21983b<T> extends Cloneable {
    static {
        Covode.recordClassIndex(25672);
    }

    void cancel();

    @Override // java.lang.Object
    AbstractC21983b<T> clone();

    void enqueue(AbstractC22030d<T> dVar);

    C22099u<T> execute();

    boolean isCanceled();

    Request request();
}
