package com.p2082ss.android.ugc.aweme.utils.p4200a;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.a.b */
public final class C80184b {
    static {
        Covode.recordClassIndex(93452);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.a.b$a */
    public static class C80185a implements Handler.Callback {

        /* renamed from: a */
        Handler f179635a;

        /* renamed from: b */
        Handler.Callback f179636b;

        /* renamed from: c */
        public List<Handler.Callback> f179637c = new ArrayList();

        static {
            Covode.recordClassIndex(93453);
        }

        public final boolean handleMessage(Message message) {
            Handler handler;
            if (message == null) {
                Handler.Callback callback = this.f179636b;
                if (callback != null) {
                    return callback.handleMessage(message);
                }
                return false;
            } else if (message.what == 131 && Build.VERSION.SDK_INT == 19 && !C13627m.m24498a(Build.MODEL) && Build.MODEL.toLowerCase().trim().startsWith("vivo")) {
                try {
                    Handler.Callback callback2 = this.f179636b;
                    if ((callback2 == null || !callback2.handleMessage(message)) && (handler = this.f179635a) != null) {
                        handler.handleMessage(message);
                    }
                    return true;
                } catch (Throwable th) {
                    if (th instanceof SecurityException) {
                        return true;
                    }
                    throw th;
                }
            } else {
                for (Handler.Callback callback3 : this.f179637c) {
                    if (callback3.handleMessage(message)) {
                        return true;
                    }
                }
                Handler.Callback callback4 = this.f179636b;
                if (callback4 != null) {
                    return callback4.handleMessage(message);
                }
                return false;
            }
        }

        public C80185a(Handler handler, Handler.Callback callback) {
            this.f179635a = handler;
            this.f179636b = callback;
        }
    }
}
