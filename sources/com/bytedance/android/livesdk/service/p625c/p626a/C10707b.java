package com.bytedance.android.livesdk.service.p625c.p626a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.service.c.a.b */
public final class C10707b {

    /* renamed from: a */
    private AbstractC10708a f25785a;

    /* renamed from: b */
    private boolean f25786b;

    /* renamed from: c */
    private final Handler f25787c;

    /* renamed from: d */
    private int f25788d;

    /* renamed from: e */
    private long f25789e;

    /* renamed from: f */
    private boolean f25790f;

    /* renamed from: g */
    private final Runnable f25791g;

    /* renamed from: com.bytedance.android.livesdk.service.c.a.b$a */
    public interface AbstractC10708a {
        static {
            Covode.recordClassIndex(12305);
        }

        /* renamed from: a */
        void mo17635a(String str, int i);
    }

    static {
        Covode.recordClassIndex(12304);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.c.a.b$b */
    public static class C10709b {

        /* renamed from: a */
        public static final C10707b f25792a = new C10707b((byte) 0);

        static {
            Covode.recordClassIndex(12306);
        }
    }

    private C10707b() {
        this.f25787c = new Handler(Looper.getMainLooper());
        this.f25788d = 0;
        this.f25789e = 0;
        this.f25790f = false;
        this.f25791g = new RunnableC10710c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17633a() {
        if (this.f25785a != null && GiftManager.inst().findGiftById(this.f25789e) != null) {
            if (this.f25786b) {
                this.f25785a.mo17635a("convenient_gift", this.f25788d);
            } else {
                this.f25785a.mo17635a("normal_gift", this.f25788d);
            }
            this.f25790f = false;
        }
    }

    /* synthetic */ C10707b(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo17634a(long j, boolean z, AbstractC10708a aVar) {
        if (this.f25790f) {
            if (j != this.f25789e) {
                this.f25787c.removeCallbacks(this.f25791g);
                mo17633a();
            } else {
                this.f25788d++;
                this.f25787c.removeCallbacks(this.f25791g);
                this.f25787c.postDelayed(this.f25791g, 3000);
                return;
            }
        }
        this.f25785a = aVar;
        this.f25788d = 1;
        this.f25790f = true;
        this.f25787c.postDelayed(this.f25791g, 3000);
        if (j != this.f25789e) {
            this.f25789e = j;
        }
        this.f25786b = z;
    }
}
