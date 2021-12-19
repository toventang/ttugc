package com.ttnet.org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ttnet.org.chromium.base.n */
public final class HandlerC87473n extends Handler {

    /* renamed from: a */
    WeakReference<AbstractC87474a> f198404a;

    /* renamed from: com.ttnet.org.chromium.base.n$a */
    public interface AbstractC87474a {
        static {
            Covode.recordClassIndex(103418);
        }
    }

    static {
        Covode.recordClassIndex(103417);
    }

    public final void handleMessage(Message message) {
        this.f198404a.get();
    }

    public HandlerC87473n(Looper looper, AbstractC87474a aVar) {
        super(looper);
        this.f198404a = new WeakReference<>(aVar);
    }
}
