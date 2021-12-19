package com.bytedance.p1399im.core.internal.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.im.core.internal.utils.x */
public final class HandlerC20049x extends Handler {

    /* renamed from: a */
    WeakReference<AbstractC20050a> f47644a;

    /* renamed from: com.bytedance.im.core.internal.utils.x$a */
    public interface AbstractC20050a {
        static {
            Covode.recordClassIndex(22895);
        }

        /* renamed from: a */
        void mo31686a(Message message);
    }

    static {
        Covode.recordClassIndex(22894);
    }

    public final void handleMessage(Message message) {
        AbstractC20050a aVar = this.f47644a.get();
        if (aVar != null && message != null) {
            aVar.mo31686a(message);
        }
    }

    public HandlerC20049x(Looper looper, AbstractC20050a aVar) {
        super(looper);
        this.f47644a = new WeakReference<>(aVar);
    }
}
