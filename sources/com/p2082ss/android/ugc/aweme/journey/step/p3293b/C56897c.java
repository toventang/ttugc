package com.p2082ss.android.ugc.aweme.journey.step.p3293b;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.b.c */
public final class C56897c implements AbstractC56900c<C56892b, AbstractC56899d> {

    /* renamed from: a */
    private C56892b f129596a;

    static {
        Covode.recordClassIndex(66784);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final AbstractC89172b<AbstractC56899d, C89391z> mo94106a() {
        return C56898a.f129597a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.b.c$a */
    static final class C56898a extends AbstractC89220m implements AbstractC89172b<AbstractC56899d, C89391z> {

        /* renamed from: a */
        public static final C56898a f129597a = new C56898a();

        static {
            Covode.recordClassIndex(66785);
        }

        C56898a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC56899d dVar) {
            C89219l.m154721d(dVar, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.journey.l] */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c
    /* renamed from: a */
    public final /* synthetic */ long mo94105a(AbstractC56899d dVar) {
        C89219l.m154721d(dVar, "");
        return 0;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: b */
    public final /* synthetic */ Object mo51983b(Object obj) {
        C89219l.m154721d(obj, "");
        C56892b bVar = new C56892b();
        this.f129596a = bVar;
        return bVar;
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: c */
    public final /* synthetic */ void mo51984c(Object obj) {
        AbstractC56899d dVar = (AbstractC56899d) obj;
        C89219l.m154721d(dVar, "");
        AbstractC89172b<Fragment, C89391z> f = dVar.mo94080f();
        C56892b bVar = this.f129596a;
        if (bVar == null) {
            C89219l.m154715b();
        }
        f.invoke(bVar);
    }

    @Override // com.p2082ss.android.p2124c.p2125a.AbstractC29740a
    /* renamed from: a */
    public final /* synthetic */ boolean mo51982a(Object obj) {
        AbstractC56899d dVar = (AbstractC56899d) obj;
        C89219l.m154721d(dVar, "");
        String h = SettingServiceImpl.m120782v().mo108872h();
        Locale locale = Locale.ROOT;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(h, "null cannot be cast to non-null type java.lang.String");
        String upperCase = h.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        if (TextUtils.equals("EN", upperCase) && TextUtils.equals("MY", C58071d.m104913g()) && dVar.mo94067a() && !dVar.mo94072c().contains(Integer.valueOf(EnumC29737c.JOURNEY_APP_LANGUAGE_ID.getId()))) {
            return true;
        }
        return false;
    }
}
