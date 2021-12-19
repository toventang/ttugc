package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63754k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65024b;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64533h;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.i */
public final class C65008i extends AbstractC64959h<EnumC65024b> {
    static {
        Covode.recordClassIndex(76476);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ AbstractC65076c mo104273v() {
        return EnumC65024b.Setting;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        if (mo104271t()) {
            mo104289y();
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C65016j.f146861a, new C65011c(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.i$b */
    static final class C65010b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65008i f146853a;

        static {
            Covode.recordClassIndex(76478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65010b(C65008i iVar) {
            super(0);
            this.f146853a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC1174ac a;
            C65008i iVar = this.f146853a;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin() || C63754k.f144519b) {
                iVar.mo104301a("click_button");
            } else {
                Fragment a2 = C12777b.m22999a((AbstractC1204m) iVar);
                if (a2 != null) {
                    C1175ad a3 = C1181ae.m3879a(a2, (C1175ad.AbstractC1177b) null);
                    String name = ProfileViewModel.class.getName();
                    if (ProfileViewModel.class.equals(ScopeViewModel.class)) {
                        a = a3.mo3984a(name, ProfileViewModel.class);
                    } else {
                        a = a3.mo3984a(name, ProfileViewModel.class);
                        C1171ab.m3870a(a, a3);
                    }
                    C89219l.m154716b(a, "");
                    C65012d dVar = new C65012d(iVar);
                    C89219l.m154721d(dVar, "");
                    ((JediViewModel) a).mo33687b_(dVar);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.i$a */
    static final class C65009a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C65009a f146852a = new C65009a();

        static {
            Covode.recordClassIndex(76477);
        }

        C65009a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_3_lines_horizontal_2;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.i$c */
    static final class C65011c extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65008i f146854a;

        static {
            Covode.recordClassIndex(76479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65011c(C65008i iVar) {
            super(1);
            this.f146854a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            if (aVar != null) {
                C65008i iVar = this.f146854a;
                if (C68432f.f153189a.mo108865b()) {
                    iVar.mo104270a(true);
                } else {
                    iVar.mo104270a(false);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: a */
    public final /* synthetic */ void mo104269a(C23187b bVar) {
        C23187b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        bVar2.mo37739a(C23005c.m43393a(C65009a.f146852a)).mo37741a((AbstractC89171a<C89391z>) new C65010b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.i$d */
    static final class C65012d extends AbstractC89220m implements AbstractC89172b<ProfileState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65008i f146855a;

        static {
            Covode.recordClassIndex(76480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65012d(C65008i iVar) {
            super(1);
            this.f146855a = iVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.i$d$a */
        static final class C65015a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C65012d f146859a;

            /* renamed from: b */
            final /* synthetic */ User f146860b;

            static {
                Covode.recordClassIndex(76483);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65015a(C65012d dVar, User user) {
                super(1);
                this.f146859a = dVar;
                this.f146860b = user;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(View view) {
                C89219l.m154721d(view, "");
                C65008i iVar = this.f146859a.f146855a;
                User user = this.f146860b;
                String uuid = UUID.randomUUID().toString();
                C89219l.m154716b(uuid, "");
                boolean z = false;
                C39162r.m79460a("enter_creator_account", C89041ag.m154427b(C89387v.m154943a("enter_from", "personal_homepage"), C89387v.m154943a("enter_method", "click_panel_button"), C89387v.m154943a("process_id", uuid)));
                SmartRoute withParam = SmartRouter.buildRoute(iVar.az_(), "aweme://creatortools").withParam("bundle_process_id", uuid).withParam("HAS_PRELOAD", true).withParam("PRO_ENTER_FROM", "creator_tools");
                int proAccountUpdateNotificationStatus = user.getProAccountUpdateNotificationStatus();
                if ((proAccountUpdateNotificationStatus == 1 || proAccountUpdateNotificationStatus == 2) && SettingServiceImpl.m120782v().mo108868d()) {
                    z = true;
                }
                withParam.withParam("bundle_show_account_dialog_when_start", z).open();
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r8 = r11.getUser();
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileState r11) {
            /*
            // Method dump skipped, instructions count: 277
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C65008i.C65012d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo104301a(String str) {
        String str2;
        C39162r.m79460a("enter_setting_page", C89041ag.m154427b(C89387v.m154943a("previous_page", "personal_homepage"), C89387v.m154943a("enter_from", "personal_homepage"), C89387v.m154943a("enter_method", str)));
        C29823c.m60080a(az_(), "set", "personal_homepage");
        AbstractC64533h hVar = (AbstractC64533h) C12801d.m23028e(this, C89204ab.m154669a(AbstractC64533h.class));
        if (hVar != null) {
            hVar.mo104115P();
        }
        Context az_ = az_();
        if (C80580in.m139687c()) {
            str2 = "//childrenmode/setting";
        } else {
            str2 = "//setting";
        }
        SmartRouter.buildRoute(az_, str2).open();
    }
}
