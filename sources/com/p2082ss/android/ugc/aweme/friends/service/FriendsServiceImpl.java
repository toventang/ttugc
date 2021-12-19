package com.p2082ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.C13606e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46816cy;
import com.p2082ss.android.ugc.aweme.experiment.C46912et;
import com.p2082ss.android.ugc.aweme.experiment.C46927fd;
import com.p2082ss.android.ugc.aweme.find.p2992ui.FindFriendsActivity;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51479c;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51538a;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51539b;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c;
import com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.ContactInvitationItemView;
import com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationReflowHelper;
import com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.ThirdPartInvitationItemView;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p2082ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51502a;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51519c;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51523e;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51526g;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51530h;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51535i;
import com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51755x;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51691as;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.ContactsActivity;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteFriendsActivity;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51779c;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.C51782f;
import com.p2082ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63849o;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.relation.C66823a;
import com.p2082ss.android.ugc.aweme.relation.C66865b;
import com.p2082ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse;
import com.p2082ss.android.ugc.aweme.relation.api.RelationApi;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import com.p2082ss.android.ugc.aweme.social.monitor.C74740e;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.C79548f;
import com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl */
public final class FriendsServiceImpl implements IFriendsService {

    /* renamed from: a */
    private AbstractC51649b f118949a;

    static {
        Covode.recordClassIndex(60971);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: c */
    public final Class<? extends AbstractC79495a> mo87320c() {
        return ContactUFR.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: d */
    public final AbstractC51479c mo87322d() {
        return C79519c.C79520a.f178475a;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: f */
    public final Class<? extends AbstractC79495a> mo87326f() {
        return C79496a.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: g */
    public final AbstractC51485d mo87327g() {
        return C79519c.C79521b.f178476a;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: n */
    public final boolean mo87334n() {
        return C51526g.f118739a;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87308a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C51506b.m95976a(str, z, "", "", "");
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final boolean mo87309a(Activity activity) {
        C89219l.m154721d(activity, "");
        return C80241be.m139079a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87305a(Activity activity, AbstractC51735f fVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fVar, "");
        C80241be.m139078a(activity, fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87304a(int i, String str, String str2, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        C46927fd a = C51530h.f118755e.mo87028a(i);
        if (C46912et.m90214a()) {
            if (!a.f109358a && !a.f109359b) {
                return;
            }
        } else if (!a.f109358a) {
            return;
        }
        C17205a aVar = C17205a.C17206a.f41116a;
        DialogContext.C17204a aVar2 = new DialogContext.C17204a((ActivityC0945e) context);
        aVar2.f41106a = AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION;
        aVar.mo27209a(aVar2.mo27207a(new C51630c(a, str, str2, context)));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final boolean mo87310a(User user) {
        if (user == null || user.getFollowerCount() < 1000) {
            return true;
        }
        return (user == null || user.getMutualStruct() == null) ? false : true;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final C89378p<String, HashMap<String, Object>> mo87302a(String str, C89378p<String, ? extends HashMap<String, Object>> pVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(pVar, "");
        return InvitationReflowHelper.C51548a.m96062a(str, pVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87307a(AbstractC51499g gVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(gVar, "");
        C79548f.f178522a.add(new C13606e<>(gVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87303a(int i, String str, ActivityC0945e eVar) {
        C89219l.m154721d(str, "");
        if (eVar != null && i != 0) {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(eVar);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION;
            aVar.mo27209a(aVar2.mo27208a(new C51631d(i, str, eVar), false));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final boolean mo87311a(boolean z) {
        int b;
        int b2;
        if (((Boolean) C46816cy.f109066a.getValue()).booleanValue()) {
            if (!C66865b.m118578f() && C66865b.f150137a.getBoolean("key_cache_ready_" + C66865b.m118581i(), false) && !C66865b.m118579g() && (!z ? C66865b.m118574b() == 4 : !(2 > (b2 = C66865b.m118574b()) || 3 < b2)) && !C80580in.m139691e()) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    return true;
                }
            }
            return false;
        }
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        return g2.isLogin() && !C80580in.m139691e() && !C66865b.m118578f() && C66865b.f150137a.getBoolean(new StringBuilder("key_cache_ready_").append(C66865b.m118581i()).toString(), false) && !C66865b.m118579g() && (!z ? C66865b.m118574b() == 4 : !(2 > (b = C66865b.m118574b()) || 3 < b));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final void mo87306a(C46927fd fdVar, String str, String str2, Context context) {
        C89219l.m154721d(fdVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        C17205a aVar = C17205a.C17206a.f41116a;
        DialogContext.C17204a aVar2 = new DialogContext.C17204a((ActivityC0945e) context);
        aVar2.f41106a = AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION;
        aVar.mo27209a(aVar2.mo27207a(new C51632e(fdVar, str, str2, context)));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final IContactService mo87313b() {
        return new ContactServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: e */
    public final boolean mo87325e() {
        return C79519c.C79520a.f178475a.mo86982a();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: i */
    public final AbstractC51754w mo87329i() {
        return new C63849o();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: j */
    public final IFriendsService.AbstractC51638b mo87330j() {
        return C66890a.C66891a.m118631a();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: k */
    public final IFriendsService.AbstractC51640d mo87331k() {
        return C51503a.C51504a.m95974a();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: l */
    public final boolean mo87332l() {
        return C51506b.m95979b();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: m */
    public final boolean mo87333m() {
        return C51526g.m95989a();
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: p */
    public final AbstractC51779c mo87336p() {
        return C51782f.C51783a.m96476a();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$c */
    public static final class C51630c implements AbstractC17207b.AbstractC17211c {

        /* renamed from: a */
        final /* synthetic */ C46927fd f118954a;

        /* renamed from: b */
        final /* synthetic */ String f118955b;

        /* renamed from: c */
        final /* synthetic */ String f118956c;

        /* renamed from: d */
        final /* synthetic */ Context f118957d;

        static {
            Covode.recordClassIndex(60975);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            C51530h.f118755e.mo87029a(this.f118954a, this.f118955b, this.f118956c, (ActivityC0945e) this.f118957d);
        }

        C51630c(C46927fd fdVar, String str, String str2, Context context) {
            this.f118954a = fdVar;
            this.f118955b = str;
            this.f118956c = str2;
            this.f118957d = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$e */
    public static final class C51632e implements AbstractC17207b.AbstractC17211c {

        /* renamed from: a */
        final /* synthetic */ C46927fd f118961a;

        /* renamed from: b */
        final /* synthetic */ String f118962b;

        /* renamed from: c */
        final /* synthetic */ String f118963c;

        /* renamed from: d */
        final /* synthetic */ Context f118964d;

        static {
            Covode.recordClassIndex(60977);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            C51530h.f118755e.mo87029a(this.f118961a, this.f118962b, this.f118963c, (ActivityC0945e) this.f118964d);
        }

        C51632e(C46927fd fdVar, String str, String str2, Context context) {
            this.f118961a = fdVar;
            this.f118962b = str;
            this.f118963c = str2;
            this.f118964d = context;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: r */
    public final boolean mo87338r() {
        if (SettingsManager.m29616a().mo25394a("hide_find_friends_entrance", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: s */
    public final AbstractC51649b mo87339s() {
        if (this.f118949a == null) {
            this.f118949a = new SocialFriendsService();
        }
        return this.f118949a;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: h */
    public final long mo87328h() {
        return C16048b.m29633a().mo25413a(true, "facebook_upload_interval", 0L) * 1000;
    }

    /* renamed from: u */
    public static IFriendsService m96115u() {
        MethodCollector.m26663i(10150);
        Object a = C81908b.m141854a(IFriendsService.class, false);
        if (a != null) {
            IFriendsService iFriendsService = (IFriendsService) a;
            MethodCollector.m26664o(10150);
            return iFriendsService;
        }
        if (C81908b.f183240bq == null) {
            synchronized (IFriendsService.class) {
                try {
                    if (C81908b.f183240bq == null) {
                        C81908b.f183240bq = new FriendsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10150);
                    throw th;
                }
            }
        }
        FriendsServiceImpl friendsServiceImpl = (FriendsServiceImpl) C81908b.f183240bq;
        MethodCollector.m26664o(10150);
        return friendsServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: o */
    public final int mo87335o() {
        C51535i a;
        int a2 = C51526g.m95987a("homepage_hot");
        if (a2 == 1) {
            C51535i a3 = C51502a.m95971a();
            if (a3 != null && a3.f118769b) {
                return a3.f118770c;
            }
        } else if (a2 == 2 && (a = C51523e.m95984a()) != null && a.f118769b) {
            return a.f118770c;
        } else {
            return Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: q */
    public final void mo87337q() {
        C66865b.f150137a.storeBoolean("key_rec_friends_has_shown_" + C66865b.m118581i(), true);
        C66865b.f150137a.storeBoolean("key_cache_ready_" + C66865b.m118581i(), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: t */
    public final void mo87340t() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin() && !C66865b.m118578f()) {
            int a = SettingsManager.m29616a().mo25394a("obtain_friends_strategy_when_upgrading", 0);
            if (C66865b.f150137a.getBoolean("key_new_version", false) && a > 1) {
                C66865b.f150137a.storeInt("key_display_strategy", a);
                C66865b.f150137a.storeLong("key_rec_friends_frequency", SettingsManager.m29616a().mo25395a("obtain_friends_strategy_when_upgrading_frequency", 30L));
                boolean c = C66865b.m118575c();
                boolean d = C66865b.m118576d();
                C66865b.f150137a.storeString("key_check_status", "value_check_start");
                C51648a.f118980a.mo87300a().mo142915a(new C66865b.C66866a(c, d), C66865b.C66867b.f150143a);
                if (c || d) {
                    C66865b.m118573a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$d */
    public static final class C51631d implements AbstractC17207b.AbstractC17211c {

        /* renamed from: a */
        final /* synthetic */ int f118958a;

        /* renamed from: b */
        final /* synthetic */ String f118959b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f118960c;

        static {
            Covode.recordClassIndex(60976);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            boolean z;
            int i = this.f118958a;
            String str = this.f118959b;
            ActivityC0945e eVar = this.f118960c;
            C89219l.m154721d(str, "");
            C89219l.m154721d(eVar, "");
            boolean z2 = false;
            if (i == 1) {
                User b = C80580in.m139683b();
                C89219l.m154716b(b, "");
                C51526g.f118740b = C79515b.m138229a(eVar, ContactUFR.class, b.getUid(), str, "auto", true, true, null).mo143289d(new C51526g.C51527a(str));
                C51526g.m95992b(0);
            } else if (i == 2) {
                C79519c.C79521b bVar = C79519c.C79521b.f178476a;
                User b2 = C80580in.m139683b();
                C89219l.m154716b(b2, "");
                if (TextUtils.isEmpty(bVar.mo86987a(b2.getUid())) || !C79519c.C79521b.f178476a.mo86991a()) {
                    z = false;
                } else {
                    z = true;
                }
                boolean equals = TextUtils.equals(str, "others_homepage");
                if (Keva.getRepo("friendslist_permission_keva_name").getLong("facebook_next_time_key", 0) < System.currentTimeMillis()) {
                    z2 = true;
                }
                if (z || (!equals && !z2)) {
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION);
                    return;
                }
                User b3 = C80580in.m139683b();
                C89219l.m154716b(b3, "");
                C51526g.f118741c = C79515b.m138229a(eVar, C79496a.class, b3.getUid(), str, "auto", true, true, null).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C51526g.C51528b(str));
                C51526g.m95992b(1);
            }
        }

        C51631d(int i, String str, ActivityC0945e eVar) {
            this.f118958a = i;
            this.f118959b = str;
            this.f118960c = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC88403ab<CheckMatchedFriendsResponse> mo87300a() {
        AbstractC88403ab<CheckMatchedFriendsResponse> a = RelationApi.C66859a.m118565a().checkMatchedFriends().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final C46927fd mo87295a(int i) {
        return C51530h.f118755e.mo87028a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: c */
    public final void mo87321c(boolean z) {
        C51526g.f118739a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: d */
    public final void mo87323d(int i) {
        C51526g.m95992b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final int mo87293a(String str) {
        C89219l.m154721d(str, "");
        return C51526g.m95987a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final AbstractC51538a mo87312b(Context context) {
        C89219l.m154721d(context, "");
        return new ContactInvitationItemView(context, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: c */
    public final AbstractC88979t<List<Friend>> mo87319c(int i) {
        AbstractC88979t<List<Friend>> a = AbstractC88979t.m154294a(new C51628b(i));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$b */
    static final class C51628b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ int f118952a;

        static {
            Covode.recordClassIndex(60973);
        }

        C51628b(int i) {
            this.f118952a = i;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<List<Friend>> vVar) {
            C89219l.m154721d(vVar, "");
            new InviteContactFriendsModel("contact").uploadContacts(true, this.f118952a).mo5532a(new AbstractC1729g() {
                /* class com.p2082ss.android.ugc.aweme.friends.service.FriendsServiceImpl.C51628b.C516291 */

                static {
                    Covode.recordClassIndex(60974);
                }

                @Override // p077b.AbstractC1729g
                public final /* synthetic */ Object then(C1731i iVar) {
                    Object obj;
                    C89219l.m154716b(iVar, "");
                    if (iVar.mo5544c()) {
                        AbstractC88982v vVar = vVar;
                        C89219l.m154716b(vVar, "");
                        Exception e = iVar.mo5546e();
                        if (e == null) {
                            e = new IllegalStateException("Unknown error");
                        }
                        C39077ac.m79343a(vVar, (Throwable) e);
                    } else {
                        FriendList friendList = (FriendList) iVar.mo5545d();
                        if (friendList == null || (obj = friendList.getFriends()) == null) {
                            obj = C89086z.INSTANCE;
                        }
                        AbstractC88982v vVar2 = vVar;
                        C89219l.m154716b(vVar2, "");
                        C39077ac.m79342a(vVar2, obj);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$f */
    static final class C51633f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f118965a;

        static {
            Covode.recordClassIndex(60978);
        }

        C51633f(String str) {
            this.f118965a = str;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = r7.f118965a
                java.lang.String r1 = "guide"
                java.lang.String r2 = "contact"
                java.lang.String r3 = "did"
                java.lang.String r4 = ""
                java.lang.String r5 = "auto"
                r6 = 1
                com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95916a(r0, r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.service.FriendsServiceImpl.C51633f.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$g */
    static final class C51634g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f118966a;

        /* renamed from: b */
        final /* synthetic */ AbstractC74739d f118967b;

        static {
            Covode.recordClassIndex(60979);
        }

        C51634g(String str, AbstractC74739d dVar) {
            this.f118966a = str;
            this.f118967b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            C51488a.m95930b(this.f118966a, "guide", "contact", "", "did", "auto", null);
            return C66870b.m118586a(this.f118967b, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final AbstractC88979t<UploadContactsResult> mo87314b(int i) {
        AbstractC88979t<UploadContactsResult> a = AbstractC88979t.m154294a(new C51627a(this, i));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$h */
    static final class C51635h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC74739d f118968a;

        static {
            Covode.recordClassIndex(60980);
        }

        C51635h(AbstractC74739d dVar) {
            this.f118968a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!C13603b.m24435a((Collection) list)) {
                return C51519c.m95981a(list, this.f118968a, 0);
            }
            AbstractC88979t b = AbstractC88979t.m154310b(new C66823a());
            C89219l.m154716b(b, "");
            return b;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC51539b mo87296a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return new InvitationReflowHelper(new WeakReference(eVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final void mo87315b(AbstractC51499g gVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(gVar, "");
        C79548f.f178522a.remove(new C13606e(gVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl$a */
    static final class C51627a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ FriendsServiceImpl f118950a;

        /* renamed from: b */
        final /* synthetic */ int f118951b;

        static {
            Covode.recordClassIndex(60972);
        }

        C51627a(FriendsServiceImpl friendsServiceImpl, int i) {
            this.f118950a = friendsServiceImpl;
            this.f118951b = i;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<UploadContactsResult> vVar) {
            Object obj;
            C89219l.m154721d(vVar, "");
            C74740e eVar = C74740e.f167996b;
            int i = this.f118951b;
            UUID randomUUID = UUID.randomUUID();
            C89219l.m154716b(randomUUID, "");
            AbstractC74739d a = eVar.mo117778a(i, randomUUID);
            try {
                a.mo117782a();
                List<ContactModelV2> a2 = C80241be.m139077a(C17867d.m33078a(), a, false);
                C89219l.m154716b(a2, "");
                if (C13603b.m24435a((Collection) a2)) {
                    vVar.mo143031a(new UploadContactsResult());
                } else {
                    vVar.mo143031a(UploadContactsApi.m95880a(a2, a, 0, this.f118951b));
                    a.mo117789e();
                }
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            Throwable r0 = C89379q.m157071exceptionOrNullimpl(obj);
            if (r0 != null) {
                vVar.mo143024a(r0);
                a.mo117783a(r0);
            }
            a.mo117791g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC51540c mo87297a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        return new ThirdPartInvitationItemView(fragment);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: f.a.t<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final void mo87316b(String str) {
        C89219l.m154721d(str, "");
        C79519c.C79520a.m138231a(true);
        C74740e eVar = C74740e.f167996b;
        int a = C66870b.m118583a();
        UUID randomUUID = UUID.randomUUID();
        C89219l.m154716b(randomUUID, "");
        AbstractC74739d a2 = eVar.mo117778a(a, randomUUID);
        AbstractC88433f<Object> fVar = C88446a.f200698d;
        AbstractC51474a.m95881a().syncSocialRelationStatusInRx(1, true).mo143264a(new C51633f(str)).mo143267a((AbstractC88434g<? super BaseResponse, ? extends AbstractC88984x<? extends R>>) new C51634g(str, a2), false).mo143267a((AbstractC88434g<? super R, ? extends AbstractC88984x<? extends R>>) new C51635h(a2), false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(fVar, fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: d */
    public final void mo87324d(boolean z) {
        if (C79519c.C79521b.f178476a.mo86991a()) {
            C39162r.m79460a("switch_sync_auth", new C33744d().mo59983a("enter_from", "privacy_setting").mo59983a("method", "auto").mo59983a("to_status", "off").mo59983a("platform", "facebook").f79943a);
            C79519c.C79521b.f178476a.mo86990a(z);
            AbstractC88979t<BaseResponse> b = AbstractC51474a.m95881a().syncSocialRelationStatusInRx(2, Boolean.valueOf(z)).mo143278b(C88925a.m154180b(C88946a.f201991c));
            AbstractC88433f<? super BaseResponse> fVar = C88446a.f200698d;
            b.mo143254a(fVar, (AbstractC88433f<? super Throwable>) fVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC51755x mo87298a(Context context) {
        C89219l.m154721d(context, "");
        return new C51691as(context, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final void mo87317b(boolean z) {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    socialPlatformSetting.setSyncStatus(z);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: b */
    public final boolean mo87318b(Activity activity) {
        if ((activity instanceof ContactsActivity) || (activity instanceof InviteFriendsActivity)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC88979t<FriendList<Friend>> mo87301a(String str, int i) {
        C89219l.m154721d(str, "");
        AbstractC88979t<FriendList<Friend>> socialFriendsWithScene = AbstractC51474a.m95881a().getSocialFriendsWithScene("facebook", C79519c.C79521b.f178476a.mo86987a(str), null, Long.valueOf(C79519c.C79521b.f178476a.mo86995d(str)), Integer.valueOf(i));
        C89219l.m154716b(socialFriendsWithScene, "");
        return socialFriendsWithScene;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final AbstractC51756y mo87299a(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hashMap, "");
        return (AbstractC51756y) RecommendUserServiceImpl.m118456b().mo105664a(context, hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService
    /* renamed from: a */
    public final Intent mo87294a(Context context, int i, int i2, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (context == null) {
            return null;
        }
        Intent intent = new Intent(context, FindFriendsActivity.class);
        intent.putExtra("previous_page", str2);
        return intent;
    }
}
