package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.q */
public final class C3148q {

    /* renamed from: a */
    long f9111a;

    /* renamed from: b */
    public long f9112b;

    /* renamed from: c */
    public long f9113c;

    /* renamed from: d */
    private EnumC3144m f9114d = EnumC3144m.RESET;

    static {
        Covode.recordClassIndex(3629);
    }

    /* renamed from: c */
    public final void mo8478c() {
        this.f9114d = EnumC3144m.RESET;
        this.f9111a = 0;
        this.f9112b = 0;
        this.f9113c = 0;
    }

    /* renamed from: a */
    public final void mo8476a() {
        if (this.f9114d != EnumC3144m.STARTED) {
            this.f9114d = EnumC3144m.STARTED;
            this.f9112b = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo8477b() {
        if (this.f9114d != EnumC3144m.PAUSED) {
            this.f9114d = EnumC3144m.PAUSED;
            long currentTimeMillis = System.currentTimeMillis();
            this.f9113c = currentTimeMillis;
            long j = this.f9112b;
            if (1 <= j && currentTimeMillis > j) {
                this.f9111a += currentTimeMillis - j;
            }
        }
    }
}
