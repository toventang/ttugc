package com.bytedance.android.livesdk.service.p625c.p629d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.service.c.d.a */
public final class C10738a {

    /* renamed from: a */
    public AbstractC10739a f25872a;

    /* renamed from: b */
    public final Handler f25873b;

    /* renamed from: c */
    public int f25874c;

    /* renamed from: d */
    public long f25875d;

    /* renamed from: e */
    public boolean f25876e;

    /* renamed from: f */
    public final Runnable f25877f;

    /* renamed from: com.bytedance.android.livesdk.service.c.d.a$a */
    public interface AbstractC10739a {
        static {
            Covode.recordClassIndex(12336);
        }

        /* renamed from: a */
        void mo17645a(int i);
    }

    static {
        Covode.recordClassIndex(12335);
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.d.a$b */
    public static class C10740b {

        /* renamed from: a */
        public static final C10738a f25878a = new C10738a((byte) 0);

        static {
            Covode.recordClassIndex(12337);
        }
    }

    /* renamed from: a */
    public final void mo17663a() {
        AbstractC10739a aVar = this.f25872a;
        if (aVar != null) {
            aVar.mo17645a(this.f25874c);
            this.f25876e = false;
        }
    }

    private C10738a() {
        this.f25873b = new Handler(Looper.getMainLooper());
        this.f25874c = 0;
        this.f25875d = 0;
        this.f25876e = false;
        this.f25877f = new RunnableC10741b(this);
    }

    /* synthetic */ C10738a(byte b) {
        this();
    }
}
