package com.p2082ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.k */
public final class C42462k extends AbstractC59233c<C42462k> {

    /* renamed from: a */
    public static final C42463a f98985a = new C42463a((byte) 0);

    /* renamed from: b */
    private String f98986b;

    static {
        Covode.recordClassIndex(50411);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.k$a */
    public static final class C42463a {
        static {
            Covode.recordClassIndex(50412);
        }

        private C42463a() {
        }

        public /* synthetic */ C42463a(byte b) {
            this();
        }
    }

    public C42462k() {
        super("search_music_notice");
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        String str = this.f98986b;
        if (str != null && str.length() != 0) {
            mo96786a("search_id", this.f98986b);
        }
    }

    /* renamed from: a */
    public final C42462k mo71677a(String str) {
        C89219l.m154721d(str, "");
        this.f98986b = str;
        return this;
    }
}
