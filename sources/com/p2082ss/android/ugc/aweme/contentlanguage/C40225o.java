package com.p2082ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34506c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59040ay;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.o */
public final class C40225o {

    /* renamed from: a */
    private final AbstractC89244h f94421a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C40226a.f94422a);

    static {
        Covode.recordClassIndex(48021);
    }

    /* renamed from: e */
    private final AbstractC59040ay m81335e() {
        return (AbstractC59040ay) this.f94421a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.o$a */
    static final class C40226a extends AbstractC89220m implements AbstractC89171a<AbstractC59040ay> {

        /* renamed from: a */
        public static final C40226a f94422a = new C40226a();

        static {
            Covode.recordClassIndex(48022);
        }

        C40226a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC59040ay invoke() {
            return C34506c.m70491a(C17867d.m33078a(), AbstractC59040ay.class);
        }
    }

    /* renamed from: d */
    public final void mo69428d() {
        try {
            m81335e().mo60982g();
        } catch (Throwable th) {
            C13468b.m24211a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: b */
    public final String mo69426b() {
        String str = "";
        try {
            String d = m81335e().mo60978d(str);
            C89219l.m154716b(d, str);
            str = d;
            return str;
        } catch (Throwable th) {
            C13468b.m24211a(th, "MainTabPreferences AbstractMethodError");
            return str;
        }
    }

    /* renamed from: c */
    public final boolean mo69427c() {
        try {
            return m81335e().mo60981f();
        } catch (Throwable th) {
            C13468b.m24211a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo69425a() {
        try {
            return m81335e().mo60980e();
        } catch (Throwable th) {
            C13468b.m24211a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo69424a(boolean z) {
        try {
            m81335e().mo60972a(z);
        } catch (Throwable th) {
            C13468b.m24211a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: a */
    public final void mo69423a(String str) {
        C89219l.m154721d(str, "");
        try {
            m81335e().mo60977c(str);
        } catch (Throwable th) {
            C13468b.m24211a(th, "MainTabPreferences AbstractMethodError");
        }
    }
}
