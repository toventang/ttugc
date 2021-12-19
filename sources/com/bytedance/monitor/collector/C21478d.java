package com.bytedance.monitor.collector;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.monitor.collector.d */
public final class C21478d {

    /* renamed from: a */
    public static Handler f50919a;

    /* renamed from: b */
    public static final HandlerC21479a f50920b = new HandlerC21479a((byte) 0);

    /* renamed from: c */
    public static Object f50921c = null;

    /* renamed from: d */
    public static volatile boolean f50922d = false;

    /* renamed from: e */
    public static int f50923e = 0;

    /* renamed from: f */
    public static int f50924f = 1;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.monitor.collector.d$a */
    public static class HandlerC21479a extends Handler {
        static {
            Covode.recordClassIndex(25106);
        }

        private HandlerC21479a() {
        }

        /* synthetic */ HandlerC21479a(byte b) {
            this();
        }

        public final void handleMessage(Message message) {
            C21478d.f50919a.handleMessage(message);
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            if (message.getCallback() != C21478d.f50921c || !C21478d.f50922d) {
                return super.sendMessageAtTime(message, j);
            }
            if (C21478d.f50924f == 0) {
                return sendMessageAtFrontOfQueue(message);
            }
            Message a = C21498i.m40382a(C21498i.m40383a());
            if (a == null) {
                return sendMessageAtFrontOfQueue(message);
            }
            return super.sendMessageAtTime(message, Math.min(a.getWhen() + ((long) C21478d.f50923e), j));
        }
    }

    static {
        Covode.recordClassIndex(25105);
    }
}
