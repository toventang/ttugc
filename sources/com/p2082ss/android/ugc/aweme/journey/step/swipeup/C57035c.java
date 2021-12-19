package com.p2082ss.android.ugc.aweme.journey.step.swipeup;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import java.util.Locale;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.c */
public final class C57035c implements AbstractC56900c<C57023b, AbstractC57037d> {

    /* renamed from: a */
    private C57023b f129864a;

    static {
        Covode.recordClassIndex(66924);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC57037d, C89391z> mo94106a() {
        return new C57036a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC57037d dVar) {
        C89219l.m154721d(dVar, "");
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.c$a */
    static final class C57036a extends AbstractC89220m implements AbstractC89172b<AbstractC57037d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57035c f129865a;

        static {
            Covode.recordClassIndex(66925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57036a(C57035c cVar) {
            super(1);
            this.f129865a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC57037d dVar) {
            AbstractC57037d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (!C57035c.m103374a(dVar2)) {
                dVar2.mo94090p().invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static boolean m103374a(AbstractC57037d dVar) {
        AbstractC58069b n = dVar.mo94088n();
        if (n == null || TextUtils.equals(n.mo90022f(), dVar.mo94089o().mo90022f())) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC57037d dVar = (AbstractC57037d) obj;
        C89219l.m154721d(dVar, "");
        AbstractC89172b<Fragment, C89391z> f = dVar.mo94080f();
        C57023b bVar = this.f129864a;
        if (bVar == null) {
            C89219l.m154715b();
        }
        f.invoke(bVar);
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC57037d dVar = (AbstractC57037d) obj;
        C89219l.m154721d(dVar, "");
        if (!dVar.mo94087m() && !dVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_SWIPE_UP_ID.getId())) && !dVar.mo94068b().mo70121W_()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        AbstractC57037d dVar = (AbstractC57037d) obj;
        C89219l.m154721d(dVar, "");
        this.f129864a = new C57023b();
        if (!m103374a(dVar)) {
            int i = Build.VERSION.SDK_INT;
            AbstractC58069b n = dVar.mo94088n();
            if (n != null) {
                Locale c = n.mo90019c();
                Context context = dVar.mo94086l().invoke().get();
                if (context != null) {
                    Resources resources = context.getResources();
                    C89219l.m154716b(resources, "");
                    Configuration configuration = new Configuration(resources.getConfiguration());
                    configuration.setLocale(c);
                    C57023b bVar = this.f129864a;
                    if (bVar == null) {
                        C89219l.m154715b();
                    }
                    bVar.f129847l = context.createConfigurationContext(configuration);
                }
            }
        }
        return this.f129864a;
    }
}
