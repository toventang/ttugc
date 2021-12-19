package com.p2082ss.android.ugc.p4317j;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.j.a */
public final class C84122a {

    /* renamed from: a */
    public static final String f187728a = "ug_resource";

    /* renamed from: b */
    public static final String f187729b;

    /* renamed from: c */
    public static final C84122a f187730c = new C84122a();

    /* renamed from: d */
    private static final String f187731d = "UGGeckoUtils";

    /* renamed from: com.ss.android.ugc.j.a$a */
    public interface AbstractC84123a {
        static {
            Covode.recordClassIndex(98021);
        }

        /* renamed from: a */
        void mo56076a();
    }

    private C84122a() {
    }

    /* renamed from: a */
    public static boolean m144659a() {
        return C80333dc.m139274a(f187729b, f187728a);
    }

    static {
        Covode.recordClassIndex(98020);
        C81631k kVar = C81631k.f182525a;
        C89219l.m154716b(kVar, "");
        f187729b = kVar.mo125297c();
    }

    /* renamed from: com.ss.android.ugc.j.a$b */
    public static final class C84124b extends AbstractC14933a {

        /* renamed from: a */
        final /* synthetic */ AbstractC84123a f187732a;

        static {
            Covode.recordClassIndex(98022);
        }

        public C84124b(AbstractC84123a aVar) {
            this.f187732a = aVar;
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24050a(String str, long j) {
            super.mo24050a(str, j);
            this.f187732a.mo56076a();
        }
    }
}
