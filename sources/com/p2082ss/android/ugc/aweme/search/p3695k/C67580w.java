package com.p2082ss.android.ugc.aweme.search.p3695k;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.search.k.w */
public final class C67580w extends C67540c<C67580w> {

    /* renamed from: e */
    public static final C67581a f151343e = new C67581a((byte) 0);

    /* renamed from: a */
    public int f151344a = -1;

    /* renamed from: b */
    public long f151345b = -1;

    static {
        Covode.recordClassIndex(79217);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.k.w$a */
    public static final class C67581a {
        static {
            Covode.recordClassIndex(79218);
        }

        private C67581a() {
        }

        public /* synthetic */ C67581a(byte b) {
            this();
        }
    }

    public C67580w() {
        super("music_play_time");
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c, com.p2082ss.android.ugc.aweme.search.p3695k.C67511b
    /* renamed from: a */
    public final void mo69786a() {
        super.mo69786a();
        int i = this.f151344a;
        if (i != -1) {
            mo96786a("time", String.valueOf(i));
        }
        long j = this.f151345b;
        if (j != -1) {
            mo96786a("stay_time", String.valueOf(j));
        }
    }
}
