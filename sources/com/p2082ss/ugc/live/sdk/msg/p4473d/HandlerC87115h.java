package com.p2082ss.ugc.live.sdk.msg.p4473d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.ugc.live.sdk.msg.d.h */
public final class HandlerC87115h extends Handler {

    /* renamed from: a */
    WeakReference<AbstractC87116a> f196388a;

    /* renamed from: com.ss.ugc.live.sdk.msg.d.h$a */
    public interface AbstractC87116a {
        static {
            Covode.recordClassIndex(102912);
        }

        /* renamed from: a */
        void mo140801a(Message message);
    }

    static {
        Covode.recordClassIndex(102911);
    }

    public final void handleMessage(Message message) {
        AbstractC87116a aVar = this.f196388a.get();
        if (aVar != null && message != null) {
            aVar.mo140801a(message);
        }
    }

    public HandlerC87115h(Looper looper, AbstractC87116a aVar) {
        super(looper);
        this.f196388a = new WeakReference<>(aVar);
    }
}
