package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34506c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.ba */
public final class C59050ba {

    /* renamed from: a */
    private final AbstractC89244h f134425a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C59051a.f134426a);

    static {
        Covode.recordClassIndex(69395);
    }

    /* renamed from: b */
    private final AbstractC59040ay m108526b() {
        return (AbstractC59040ay) this.f134425a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.main.ba$a */
    static final class C59051a extends AbstractC89220m implements AbstractC89171a<AbstractC59040ay> {

        /* renamed from: a */
        public static final C59051a f134426a = new C59051a();

        static {
            Covode.recordClassIndex(69396);
        }

        C59051a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC59040ay invoke() {
            return C34506c.m70491a(C17867d.m33078a(), AbstractC59040ay.class);
        }
    }

    /* renamed from: a */
    public final String mo96577a() {
        String str = "";
        try {
            String d = m108526b().mo60978d(str);
            C89219l.m154716b(d, str);
            str = d;
            return str;
        } catch (Throwable th) {
            C13468b.m24211a(th, "MainTabPreferences AbstractMethodError");
            return str;
        }
    }

    /* renamed from: a */
    public final void mo96578a(String str) {
        C89219l.m154721d(str, "");
        try {
            m108526b().mo60977c(str);
        } catch (Throwable th) {
            C13468b.m24211a(th, "MainTabPreferences AbstractMethodError");
        }
    }
}
