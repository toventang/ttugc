package com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.feed.p.b.f */
public final class C49806f {

    /* renamed from: a */
    public static AtomicBoolean f114571a = new AtomicBoolean(false);

    /* renamed from: b */
    public static AtomicBoolean f114572b = new AtomicBoolean(true);

    /* renamed from: c */
    public static AtomicBoolean f114573c = new AtomicBoolean(true);

    /* renamed from: d */
    public static HandlerC49807a f114574d;

    /* renamed from: e */
    public static Object f114575e = new Object();

    /* renamed from: f */
    private static AtomicBoolean f114576f = new AtomicBoolean(false);

    /* renamed from: g */
    private static AtomicBoolean f114577g = new AtomicBoolean(false);

    /* renamed from: h */
    private static AtomicBoolean f114578h = new AtomicBoolean(false);

    /* renamed from: i */
    private static AtomicBoolean f114579i = new AtomicBoolean(true);

    /* renamed from: a */
    public static Boolean m93265a() {
        if (!C49783b.m93234a()) {
            return true;
        }
        return Boolean.valueOf(f114571a.get());
    }

    static {
        Covode.recordClassIndex(58911);
    }

    /* renamed from: b */
    public static Boolean m93267b() {
        if (!C49783b.m93234a()) {
            return false;
        }
        if (f114576f.get()) {
            return Boolean.valueOf(f114572b.get());
        }
        if (f114577g.get()) {
            return Boolean.valueOf(f114573c.get());
        }
        if (f114578h.get()) {
            return Boolean.valueOf(f114579i.get());
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.f$b */
    static class C49808b extends RuntimeException {
        static {
            Covode.recordClassIndex(58913);
        }

        C49808b(String str) {
            super(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.f$a */
    public static class HandlerC49807a extends Handler {

        /* renamed from: a */
        public Handler f114580a;

        static {
            Covode.recordClassIndex(58912);
        }

        private HandlerC49807a(Handler handler) {
            this.f114580a = handler;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C49806f.f114574d = null;
            this.f114580a.handleMessage(message);
        }

        public /* synthetic */ HandlerC49807a(Handler handler, byte b) {
            this(handler);
        }
    }

    /* renamed from: a */
    public static void m93266a(Boolean bool) {
        f114576f.set(bool.booleanValue());
    }

    /* renamed from: b */
    public static void m93268b(Boolean bool) {
        f114577g.set(bool.booleanValue());
    }
}
