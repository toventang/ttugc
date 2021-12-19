package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65077d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.d */
public final class C64986d extends AbstractC64959h<EnumC65077d> {
    static {
        Covode.recordClassIndex(76454);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ AbstractC65076c mo104273v() {
        return EnumC65077d.FindFriends;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h
    /* renamed from: w */
    public final List<EnumC65077d> mo104287w() {
        return C89086z.INSTANCE;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h
    /* renamed from: x */
    public final List<EnumC65077d> mo104288x() {
        return C89070n.m154516a(EnumC65077d.SuggestBA);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        if (mo104271t() && !C80580in.m139687c() && !C51648a.f118980a.mo87338r()) {
            mo104289y();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.d$b */
    static final class C64988b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64986d f146826a;

        static {
            Covode.recordClassIndex(76456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64988b(C64986d dVar) {
            super(0);
            this.f146826a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            SmartRouter.buildRoute(this.f146826a.az_(), "//friends/find").withParam("previous_page", "personal_homepage").open();
            C59206ab.m108755a("click_add_friends").mo96746b("enter_from", "personal_homepage").mo96792f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.d$a */
    static final class C64987a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C64987a f146825a = new C64987a();

        static {
            Covode.recordClassIndex(76455);
        }

        C64987a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_person_plus;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: a */
    public final /* synthetic */ void mo104269a(C23187b bVar) {
        C23187b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        bVar2.mo37739a(C23005c.m43393a(C64987a.f146825a)).mo37741a((AbstractC89171a<C89391z>) new C64988b(this));
    }
}
