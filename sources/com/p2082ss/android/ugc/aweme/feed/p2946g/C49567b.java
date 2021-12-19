package com.p2082ss.android.ugc.aweme.feed.p2946g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.experiment.AbstractC49503af;
import com.p2082ss.android.ugc.aweme.p2715cs.C40750c;
import com.p2082ss.android.ugc.aweme.p2715cs.C40755d;

/* renamed from: com.ss.android.ugc.aweme.feed.g.b */
public class C49567b {

    /* renamed from: f */
    public static final String f114014f = C49567b.class.getSimpleName();

    /* renamed from: a */
    public int f114015a;

    /* renamed from: b */
    public int f114016b;

    /* renamed from: c */
    public int f114017c;

    /* renamed from: d */
    public int f114018d;

    /* renamed from: e */
    public C49566a<String, C49569b> f114019e;

    /* renamed from: g */
    private int f114020g;

    /* renamed from: h */
    private long f114021h;

    /* renamed from: com.ss.android.ugc.aweme.feed.g.b$b */
    public static final class C49569b {

        /* renamed from: a */
        public int f114023a;

        /* renamed from: b */
        public int f114024b;

        /* renamed from: c */
        public int f114025c;

        /* renamed from: d */
        public int f114026d;

        /* renamed from: e */
        public int f114027e;

        /* renamed from: f */
        public int f114028f;

        static {
            Covode.recordClassIndex(58410);
        }

        private C49569b() {
        }

        public /* synthetic */ C49569b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.g.b$a */
    public static final class C49568a {

        /* renamed from: a */
        public static final C49567b f114022a = new C49567b((byte) 0);

        static {
            Covode.recordClassIndex(58409);
        }
    }

    static {
        Covode.recordClassIndex(58408);
    }

    private C49567b() {
        this.f114019e = new C49566a<>();
        this.f114021h = -1;
    }

    /* synthetic */ C49567b(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo81321a(String str) {
        if (AbstractC49503af.f113865a) {
            C49569b a = this.f114019e.mo81318a(str);
            if (a == null) {
                a = new C49569b((byte) 0);
                this.f114019e.mo81319a(str, a);
            }
            this.f114020g++;
            a.f114023a = 1;
            C40755d.RunnableC40756a a2 = C40755d.m82216a().mo69986a(str, C40750c.EnumC40751a.PROFILE);
            if (a2 != null) {
                a2.f95408a.mo69991a();
            }
        }
    }
}
