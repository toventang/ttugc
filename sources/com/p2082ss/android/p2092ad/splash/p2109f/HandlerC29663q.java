package com.p2082ss.android.p2092ad.splash.p2109f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.f.q */
public final class HandlerC29663q extends Handler {

    /* renamed from: a */
    private WeakReference<AbstractC29664a> f70738a;

    /* renamed from: com.ss.android.ad.splash.f.q$a */
    public interface AbstractC29664a {
        static {
            Covode.recordClassIndex(36060);
        }

        /* renamed from: a */
        void mo28809a(Message message);
    }

    static {
        Covode.recordClassIndex(36059);
    }

    public final void handleMessage(Message message) {
        AbstractC29664a aVar = this.f70738a.get();
        if (aVar != null && message != null) {
            aVar.mo28809a(message);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandlerC29663q(com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.AbstractC29664a r2) {
        /*
            r1 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x000e
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x000a:
            r1.<init>(r0, r2)
            return
        L_0x000e:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.<init>(com.ss.android.ad.splash.f.q$a):void");
    }

    public HandlerC29663q(Looper looper, AbstractC29664a aVar) {
        super(looper);
        this.f70738a = new WeakReference<>(aVar);
    }
}
