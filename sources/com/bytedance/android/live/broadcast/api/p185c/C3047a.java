package com.bytedance.android.live.broadcast.api.p185c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.api.c.a */
public final class C3047a {

    /* renamed from: a */
    public static final Handler f8887a = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.android.live.broadcast.api.p185c.C3047a.HandlerC30481 */

        /* renamed from: a */
        private HashMap<String, String> f8888a = new HashMap<>(10);

        static {
            Covode.recordClassIndex(3526);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1 || i == 2) {
                Pair pair = (Pair) message.obj;
                this.f8888a.put(pair.first, pair.second);
            } else if (i == 3) {
                C6501b.C6502a.m13948a("livesdk_performance_anchor_create_room_duration").mo12652a((Map<String, String>) this.f8888a).mo12655b();
                this.f8888a = new HashMap<>(10);
            }
        }
    };

    /* renamed from: a */
    public static void m8355a() {
        Handler handler = f8887a;
        handler.sendMessage(Message.obtain(handler, 3));
    }

    static {
        Covode.recordClassIndex(3525);
    }

    /* renamed from: a */
    public static void m8356a(String str, String str2) {
        Handler handler = f8887a;
        Message obtain = Message.obtain(handler, 2);
        obtain.obj = new Pair(str, str2);
        handler.sendMessage(obtain);
    }
}
