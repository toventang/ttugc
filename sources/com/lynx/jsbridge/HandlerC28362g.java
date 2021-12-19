package com.lynx.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.jsbridge.g */
public class HandlerC28362g extends Handler {

    /* renamed from: a */
    WeakReference<AbstractC28363a> f66614a;

    /* renamed from: com.lynx.jsbridge.g$a */
    public interface AbstractC28363a {
        static {
            Covode.recordClassIndex(34338);
        }

        void handleMsg(Message message);
    }

    static {
        Covode.recordClassIndex(34337);
    }

    public void handleMessage(Message message) {
        AbstractC28363a aVar = this.f66614a.get();
        if (aVar != null && message != null) {
            aVar.handleMsg(message);
        }
    }

    public HandlerC28362g(Looper looper, AbstractC28363a aVar) {
        super(looper);
        this.f66614a = new WeakReference<>(aVar);
    }
}
