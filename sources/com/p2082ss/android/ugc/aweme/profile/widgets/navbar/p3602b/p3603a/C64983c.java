package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a;

import android.os.Build;
import android.view.View;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65077d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.c */
public final class C64983c extends AbstractC64959h<EnumC65077d> {
    static {
        Covode.recordClassIndex(76451);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ AbstractC65076c mo104273v() {
        return EnumC65077d.Back;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        View u;
        super.mo20518f();
        if (!mo104271t()) {
            if (Build.VERSION.SDK_INT >= 26 && (u = mo104272u()) != null) {
                u.setDefaultFocusHighlightEnabled(false);
            }
            mo104289y();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.c$b */
    static final class C64985b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64983c f146824a;

        static {
            Covode.recordClassIndex(76453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64985b(C64983c cVar) {
            super(0);
            this.f146824a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (MSAdaptionService.m97895c().mo89377c(this.f146824a.az_())) {
                SmartRouter.buildRoute(this.f146824a.az_(), "//duo").withParam("duo_type", "duo_back").open();
            } else {
                ((AbstractC64313x) C12801d.m23018a(this.f146824a, C89204ab.m154669a(AbstractC64313x.class))).mo103799p();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.c$a */
    static final class C64984a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C64984a f146823a = new C64984a();

        static {
            Covode.recordClassIndex(76452);
        }

        C64984a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_arrow_left_ltr;
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
        bVar2.mo37739a(C23005c.m43393a(C64984a.f146823a)).mo37741a((AbstractC89171a<C89391z>) new C64985b(this));
    }
}
