package com.facebook.p1844d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.d.e */
public interface AbstractC24160e<T> {
    static {
        Covode.recordClassIndex(28291);
    }

    void onCancellation(AbstractC24157c<T> cVar);

    void onFailure(AbstractC24157c<T> cVar);

    void onNewResult(AbstractC24157c<T> cVar);

    void onProgressUpdate(AbstractC24157c<T> cVar);
}
