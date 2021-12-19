package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.metrics.i */
public final class C59243i extends AbstractC59233c<C59243i> {

    /* renamed from: a */
    public static final C59244a f135231a = new C59244a((byte) 0);

    /* renamed from: b */
    private String f135232b;

    static {
        Covode.recordClassIndex(69606);
    }

    /* renamed from: com.ss.android.ugc.aweme.metrics.i$a */
    public static final class C59244a {
        static {
            Covode.recordClassIndex(69607);
        }

        private C59244a() {
        }

        public /* synthetic */ C59244a(byte b) {
            this();
        }
    }

    public C59243i() {
        super("create_new_collection");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        if (this.f135169h != null) {
            mo96786a("enter_from", this.f135169h);
        }
        if (this.f135169h != null) {
            mo96786a("is_blank", this.f135232b);
        }
    }

    /* renamed from: a */
    public final C59243i mo96812a(String str) {
        this.f135169h = str;
        return this;
    }

    /* renamed from: a */
    public final C59243i mo96811a(Integer num) {
        this.f135232b = String.valueOf(num);
        return this;
    }
}
