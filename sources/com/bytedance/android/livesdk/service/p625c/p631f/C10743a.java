package com.bytedance.android.livesdk.service.p625c.p631f;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.service.c.f.a */
public final class C10743a {

    /* renamed from: a */
    public AbstractC10744a f25881a;

    /* renamed from: b */
    public boolean f25882b;

    /* renamed from: c */
    public String f25883c;

    /* renamed from: d */
    public Handler f25884d;

    /* renamed from: e */
    public int f25885e;

    /* renamed from: f */
    public long f25886f;

    /* renamed from: g */
    public boolean f25887g;

    /* renamed from: h */
    public Runnable f25888h;

    /* renamed from: com.bytedance.android.livesdk.service.c.f.a$a */
    public interface AbstractC10744a {
        static {
            Covode.recordClassIndex(12341);
        }

        /* renamed from: a */
        void mo17666a(String str, int i, String str2);
    }

    static {
        Covode.recordClassIndex(12340);
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.f.a$b */
    public static class C10745b {

        /* renamed from: a */
        public static C10743a f25889a = new C10743a((byte) 0);

        static {
            Covode.recordClassIndex(12342);
        }
    }

    /* renamed from: a */
    public final void mo17665a() {
        AbstractC10744a aVar = this.f25881a;
        if (aVar != null) {
            if (this.f25882b) {
                aVar.mo17666a("convenient_gift", this.f25885e, this.f25883c);
            } else {
                aVar.mo17666a("normal_gift", this.f25885e, this.f25883c);
            }
            this.f25887g = false;
        }
    }

    private C10743a() {
        this.f25883c = "";
        this.f25884d = new Handler(Looper.getMainLooper());
        this.f25885e = 0;
        this.f25886f = 0;
        this.f25887g = false;
        this.f25888h = new RunnableC10746b(this);
    }

    /* synthetic */ C10743a(byte b) {
        this();
    }
}
