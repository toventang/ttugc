package com.bytedance.android.livesdkapi.depend.p679c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdkapi.depend.c.a */
public class HandlerC11626a extends Handler {

    /* renamed from: a */
    WeakReference<AbstractC11627a> f27776a;

    /* renamed from: com.bytedance.android.livesdkapi.depend.c.a$a */
    public interface AbstractC11627a {
        static {
            Covode.recordClassIndex(13294);
        }

        void handleMsg(Message message);
    }

    static {
        Covode.recordClassIndex(13293);
    }

    public void handleMessage(Message message) {
        AbstractC11627a aVar = this.f27776a.get();
        if (aVar != null && message != null) {
            aVar.handleMsg(message);
        }
    }

    public HandlerC11626a(AbstractC11627a aVar) {
        this.f27776a = new WeakReference<>(aVar);
    }

    public HandlerC11626a(Looper looper, AbstractC11627a aVar) {
        super(looper);
        this.f27776a = new WeakReference<>(aVar);
    }
}
