package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3906af;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65024b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.e */
public final class C64989e extends AbstractC64959h<EnumC65024b> {

    /* renamed from: h */
    private final AbstractC89244h f146827h = C89250i.m154773a((AbstractC89171a) C64992c.f146830a);

    static {
        Covode.recordClassIndex(76457);
    }

    /* renamed from: A */
    public final String mo104296A() {
        return (String) this.f146827h.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ AbstractC65076c mo104273v() {
        return EnumC65024b.LiveEvent;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.e$c */
    static final class C64992c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C64992c f146830a = new C64992c();

        static {
            Covode.recordClassIndex(76460);
        }

        C64992c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = SettingsManager.m29616a().mo25398a("personal_live_event_list", "");
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        if (!C80580in.m139687c()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() && mo104271t()) {
                mo104289y();
                C64314y.m116177a("show");
                return;
            }
        }
        mo104290z();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.e$b */
    static final class C64991b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64989e f146829a;

        static {
            Covode.recordClassIndex(76459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64991b(C64989e eVar) {
            super(0);
            this.f146829a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            User user;
            String str;
            C64314y.m116177a("click");
            C64615i iVar = (C64615i) C12801d.m23029f(this.f146829a, C89204ab.m154669a(AbstractC64616j.class));
            List<LiveEventStruct> list = null;
            if (iVar != null) {
                user = iVar.f146329a;
                if (user != null) {
                    list = user.getLiveEventStructList();
                }
            } else {
                user = null;
            }
            if (list != null && !list.isEmpty()) {
                LiveEventStruct liveEventStruct = list.get(0);
                if (liveEventStruct == null || (str = liveEventStruct.getId()) == null) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    C64314y.m116182a(str, "click", list.size(), C64314y.m116174a(user), list.get(0).isPaidEvent());
                }
            }
            if (!TextUtils.isEmpty(this.f146829a.mo104296A()) && !TextUtils.isEmpty(Uri.parse(this.f146829a.mo104296A()).getQueryParameter("url"))) {
                Uri build = C3906af.m9539b(Uri.parse(this.f146829a.mo104296A()), "url").buildUpon().appendQueryParameter("url", Uri.parse(this.f146829a.mo104296A()).getQueryParameter("url") + "&live_event_permission=" + (SettingsManager.m29616a().mo25400a("live_event_permission", false) ? 1 : 0)).build();
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                s.mo95830d().mo13004a(this.f146829a.az_(), build);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.e$a */
    static final class C64990a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C64990a f146828a = new C64990a();

        static {
            Covode.recordClassIndex(76458);
        }

        C64990a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_calendar_star;
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
        bVar2.mo37739a(C23005c.m43393a(C64990a.f146828a)).mo37741a((AbstractC89171a<C89391z>) new C64991b(this));
    }
}
