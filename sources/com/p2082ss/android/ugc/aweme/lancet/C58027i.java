package com.p2082ss.android.ugc.aweme.lancet;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.lancet.i */
public final class C58027i {

    /* renamed from: a */
    public static volatile boolean f132246a = true;

    /* renamed from: b */
    public static volatile boolean f132247b;

    static {
        Covode.recordClassIndex(68062);
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.i$a */
    public static class HandlerC58028a extends Handler {

        /* renamed from: a */
        private Handler f132248a;

        static {
            Covode.recordClassIndex(68063);
        }

        public final void handleMessage(Message message) {
            Handler handler = this.f132248a;
            if (handler != null) {
                handler.handleMessage(message);
            }
        }

        public HandlerC58028a(Handler handler) {
            super(Looper.getMainLooper());
            this.f132248a = handler;
        }
    }
}
