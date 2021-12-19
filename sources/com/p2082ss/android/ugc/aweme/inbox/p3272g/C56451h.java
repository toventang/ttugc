package com.p2082ss.android.ugc.aweme.inbox.p3272g;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.AbstractC56312af;
import com.p2082ss.android.ugc.aweme.inbox.C56398e;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.g.h */
public final class C56451h extends AbstractC56447g<AbstractC56312af> {

    /* renamed from: g */
    public C51086a f128728g = new C51086a(this.f128731j, new C51086a.C51094g(this) {
        /* class com.p2082ss.android.ugc.aweme.inbox.p3272g.C56451h.C564521 */

        /* renamed from: a */
        final /* synthetic */ C56451h f128732a;

        static {
            Covode.recordClassIndex(66272);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f128732a = r1;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            C56451h.m102421h();
            C39162r.m79452a().execute(new RunnableC56460g(this.f128732a));
        }
    });

    /* renamed from: h */
    public Map<String, String> f128729h = new LinkedHashMap();

    /* renamed from: i */
    public final AbstractC66614a f128730i;

    /* renamed from: j */
    private AbstractC51346a f128731j;

    static {
        Covode.recordClassIndex(66271);
    }

    /* renamed from: h */
    public static void m102421h() {
        C56407f.m102373a(C56454a.f128734a);
    }

    /* renamed from: f */
    public final User mo93417f() {
        return ((AbstractC56312af) mo93413c()).f128464a;
    }

    /* renamed from: g */
    public final void mo93418g() {
        C39162r.m79452a().execute(new RunnableC56458e(this));
    }

    /* renamed from: i */
    public final boolean mo93419i() {
        Context requireContext = mo93414d().requireContext();
        C89219l.m154716b(requireContext, "");
        if (C80422fe.m139425a(requireContext)) {
            return false;
        }
        new C23144b(mo93414d()).mo37640e(R.string.dcq).mo37637b();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.g.h$e */
    public static final class RunnableC56458e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56451h f128740a;

        static {
            Covode.recordClassIndex(66278);
        }

        RunnableC56458e(C56451h hVar) {
            this.f128740a = hVar;
        }

        public final void run() {
            String str;
            C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("rec_type", this.f128740a.mo93417f().getRecType()).mo59983a("rec_uid", this.f128740a.mo93417f().getUid());
            RecommendUserVM e = this.f128740a.mo93415e();
            String uid = this.f128740a.mo93417f().getUid();
            String str2 = "";
            C89219l.m154716b(uid, str2);
            C39162r.m79460a("close_recommend_user_cell", a.mo59980a("impr_order", e.mo93319a(uid)).mo59983a("relation_type", this.f128740a.mo93417f().getFriendTypeStr()).mo59983a("req_id", this.f128740a.mo93417f().getRequestId()).f79943a);
            C59256u a2 = new C59256u().mo96834a("notification_page");
            a2.f135350a = C59256u.EnumC59259c.CARD;
            a2.f135352b = C59256u.EnumC59257a.CLOSE;
            C59256u s = a2.mo96832a(this.f128740a.mo93417f()).mo96841s(this.f128740a.mo93417f().getRequestId());
            Map<String, String> map = this.f128740a.f128729h;
            if (!(map == null || (str = map.get("position")) == null)) {
                str2 = str;
            }
            s.mo96838p(str2).mo96792f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.h$f */
    static final class RunnableC56459f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56451h f128741a;

        /* renamed from: b */
        final /* synthetic */ User f128742b;

        /* renamed from: c */
        final /* synthetic */ int f128743c;

        static {
            Covode.recordClassIndex(66279);
        }

        RunnableC56459f(C56451h hVar, User user, int i) {
            this.f128741a = hVar;
            this.f128742b = user;
            this.f128743c = i;
        }

        public final void run() {
            String str;
            C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("rec_type", this.f128742b.getRecType()).mo59983a("to_user_id", this.f128742b.getUid()).mo59980a("impr_order", this.f128743c).mo59983a("req_id", this.f128742b.getRequestId()).mo59983a("impr_id", this.f128742b.getUid()).mo59983a("relation_type", this.f128742b.getFriendTypeStr()).mo59980a("follow_status", this.f128742b.getFollowStatus());
            String str2 = "";
            C89219l.m154716b(a, str2);
            C39162r.m79460a("enter_personal_detail", C80409eu.m139390a(a, this.f128742b).f79943a);
            C59256u a2 = new C59256u().mo96834a("notification_page");
            a2.f135350a = C59256u.EnumC59259c.CARD;
            a2.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
            C59256u s = a2.mo96832a(this.f128742b).mo96841s(this.f128742b.getRequestId());
            Map<String, String> map = this.f128741a.f128729h;
            if (!(map == null || (str = map.get("position")) == null)) {
                str2 = str;
            }
            s.mo96838p(str2).mo96792f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final void mo93405a() {
        int followStatus;
        String str;
        if (mo93413c().f128462c == -2) {
            RecommendUserVM e = mo93415e();
            User user = ((AbstractC56312af) mo93413c()).f128464a;
            C89219l.m154721d(user, "");
            if (user.getUid() != null && !e.mo93323b().contains(user.getUid())) {
                Set<String> b = e.mo93323b();
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                b.add(uid);
                C89219l.m154721d(user, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "notification_page");
                String uid2 = user.getUid();
                C89219l.m154716b(uid2, "");
                linkedHashMap.put("to_user_id", uid2);
                if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
                    followStatus = 3;
                } else {
                    followStatus = user.getFollowStatus();
                }
                linkedHashMap.put("follow_status", String.valueOf(followStatus));
                if (user.isPrivateAccount()) {
                    str = "1";
                } else {
                    str = "0";
                }
                linkedHashMap.put("is_private_account", str);
                C39162r.m79460a("invite_follow_cell_show", linkedHashMap);
            }
        } else if (mo93413c().f128462c == 2 && mo93417f().isShould_write_impr()) {
            C61504e.C61505a.f139616a.mo99160a(1, mo93417f().getUid());
            RecommendUserVM e2 = mo93415e();
            if (e2 != null) {
                User user2 = ((AbstractC56312af) mo93413c()).f128464a;
                Map<String, String> map = this.f128729h;
                C89219l.m154721d(user2, "");
                C89219l.m154721d(map, "");
                if (!e2.f128412h.contains(user2.getUid())) {
                    C39162r.m79452a().execute(new RecommendUserVM.RunnableC56294f(e2, user2, map));
                    Set<String> set = e2.f128412h;
                    String uid3 = user2.getUid();
                    C89219l.m154716b(uid3, "");
                    set.add(uid3);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.h$g */
    static final class RunnableC56460g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56451h f128744a;

        static {
            Covode.recordClassIndex(66280);
        }

        RunnableC56460g(C56451h hVar) {
            this.f128744a = hVar;
        }

        public final void run() {
            String str;
            String str2;
            String str3;
            C59256u.EnumC59257a aVar;
            String str4;
            if (this.f128744a.mo93417f().getFollowerStatus() == 1) {
                str = "mutual";
            } else {
                str = "single";
            }
            if (this.f128744a.mo93417f().getFollowStatus() == 0) {
                str2 = "follow";
            } else {
                str2 = "follow_cancel";
            }
            C33744d a = new C33744d().mo59983a("enter_method", "follow_button").mo59983a("enter_from", "notification_page").mo59983a("rec_type", this.f128744a.mo93417f().getRecType()).mo59983a("to_user_id", this.f128744a.mo93417f().getUid());
            RecommendUserVM e = this.f128744a.mo93415e();
            String uid = this.f128744a.mo93417f().getUid();
            String str5 = "";
            C89219l.m154716b(uid, str5);
            C33744d a2 = a.mo59980a("impr_order", e.mo93319a(uid)).mo59983a("req_id", this.f128744a.mo93417f().getRequestId()).mo59983a("relation_type", this.f128744a.mo93417f().getFriendTypeStr());
            Map<String, String> map = this.f128744a.f128729h;
            if (map == null || (str3 = map.get("position")) == null) {
                str3 = str5;
            }
            C39162r.m79460a(str2, a2.mo59983a("position", str3).mo59983a("follow_type", str).f79943a);
            C59256u a3 = new C59256u().mo96834a("notification_page");
            a3.f135350a = C59256u.EnumC59259c.CARD;
            if (this.f128744a.mo93417f().getFollowStatus() == 0) {
                aVar = C59256u.EnumC59257a.FOLLOW;
            } else {
                aVar = C59256u.EnumC59257a.FOLLOW_CANCEL;
            }
            a3.f135352b = aVar;
            C59256u s = a3.mo96832a(this.f128744a.mo93417f()).mo96841s(this.f128744a.mo93417f().getRequestId());
            Map<String, String> map2 = this.f128744a.f128729h;
            if (!(map2 == null || (str4 = map2.get("position")) == null)) {
                str5 = str4;
            }
            s.mo96838p(str5).mo96792f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.h$c */
    public static final class C56456c implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ C56451h f128737a;

        static {
            Covode.recordClassIndex(66276);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56456c(C56451h hVar) {
            this.f128737a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            if (followStatus != null) {
                this.f128737a.f128730i.mo61442a(followStatus.followStatus, followStatus.followerStatus, null);
            }
            C51648a aVar = C51648a.f118980a;
            View view = this.f128737a.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            aVar.mo87304a(3, "notification_page", "follow", context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.g.h$a */
    public static final class C56454a extends AbstractC89220m implements AbstractC89172b<C56398e.C56399a, C89391z> {

        /* renamed from: a */
        public static final C56454a f128734a = new C56454a();

        static {
            Covode.recordClassIndex(66274);
        }

        C56454a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56398e.C56399a aVar) {
            C56398e.C56399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo93389b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: b */
    public final void mo93408b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo93408b(bVar);
        this.f128730i.mo61443a(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.h$b */
    static final class C56455b implements C51086a.AbstractC51090c {

        /* renamed from: a */
        final /* synthetic */ C56451h f128735a;

        /* renamed from: b */
        final /* synthetic */ boolean f128736b;

        static {
            Covode.recordClassIndex(66275);
        }

        C56455b(C56451h hVar, boolean z) {
            this.f128735a = hVar;
            this.f128736b = z;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
        /* renamed from: a */
        public final boolean mo63341a(int i) {
            INoticeService f = NoticeServiceImpl.m112566f();
            View view = this.f128735a.itemView;
            C89219l.m154716b(view, "");
            return INoticeService.C61609a.m111607a(f, view.getContext(), this.f128735a.mo93417f(), null, null, !this.f128736b, 12);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final /* synthetic */ void mo93406a(AbstractC56312af afVar) {
        AbstractC56312af afVar2 = afVar;
        C89219l.m154721d(afVar2, "");
        this.f128729h = afVar2.f128463d;
        boolean d = IMUnder16ProxyImpl.m102047n().mo93022d();
        if (C80580in.m139687c() || d) {
            this.f128730i.mo61445a(false);
        } else {
            this.f128730i.mo61445a(true);
        }
        this.f128730i.mo61444a(mo93417f());
        C51086a aVar = this.f128728g;
        if (aVar != null) {
            aVar.mo86508a(mo93417f());
        }
        C51086a aVar2 = this.f128728g;
        if (aVar2 != null) {
            aVar2.f117879e = new C56455b(this, d);
        }
        C51086a aVar3 = this.f128728g;
        if (aVar3 != null) {
            aVar3.f117878d = new C56456c(this);
        }
        this.f128730i.setEventListener(new C56457d(this, afVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.h$d */
    static final class C56457d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56451h f128738a;

        /* renamed from: b */
        final /* synthetic */ AbstractC56312af f128739b;

        static {
            Covode.recordClassIndex(66277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56457d(C56451h hVar, AbstractC56312af afVar) {
            super(1);
            this.f128738a = hVar;
            this.f128739b = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            String str;
            boolean z;
            int intValue = num.intValue();
            if (intValue == C51700au.f119172d) {
                User f = this.f128738a.mo93417f();
                C51086a aVar = this.f128738a.f128728g;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                String uid = f.getUid();
                String secUid = f.getSecUid();
                int followStatus = f.getFollowStatus();
                int followerStatus = f.getFollowerStatus();
                if (f.isSecret() || f.isPrivateAccount()) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo86509a(uid, secUid, followStatus, followerStatus, z);
            } else if (intValue == C51700au.f119171c) {
                C56451h.m102421h();
                C56451h hVar = this.f128738a;
                User f2 = hVar.mo93417f();
                SmartRoute withParam = SmartRouter.buildRoute(hVar.mo93414d().requireActivity(), "aweme://user/profile/" + f2.getUid()).withParam("sec_user_id", f2.getSecUid()).withParam("from_recommend_card", 1).withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", f2.getRecommendReason()).withParam("extra_mutual_relation", f2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_from_type", "list").withParam("enter_from_request_id", this.f128739b.f128465b);
                Map<String, String> map = hVar.f128729h;
                if (map == null || (str = map.get("position")) == null) {
                    str = "";
                }
                withParam.withParam("position", str).withParam("recommend_enter_profile_params", new C66623g("notification_page", null, C59256u.EnumC59259c.CARD, f2.getRecType(), C66623g.C66624a.m118386a(f2), f2.getUid(), null, null, f2.getRequestId(), null, f2.getFriendTypeStr(), f2.getSocialInfo())).open();
                C56451h hVar2 = this.f128738a;
                User f3 = hVar2.mo93417f();
                RecommendUserVM e = this.f128738a.mo93415e();
                String uid2 = this.f128738a.mo93417f().getUid();
                C89219l.m154716b(uid2, "");
                C39162r.m79452a().execute(new RunnableC56459f(hVar2, f3, e.mo93319a(uid2)));
            } else if (intValue == C51700au.f119173e && !this.f128738a.mo93419i()) {
                this.f128738a.mo93415e().mo93322a(this.f128739b);
                this.f128738a.mo93418g();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56451h(AbstractC66614a aVar, int i) {
        super(aVar.getView());
        C89219l.m154721d(aVar, "");
        this.f128730i = aVar;
        this.f128731j = aVar.getFollowBtn();
        if (i == 9) {
            mo93412a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.inbox.p3272g.C56451h.C564532 */

                /* renamed from: a */
                final /* synthetic */ C56451h f128733a;

                static {
                    Covode.recordClassIndex(66273);
                }

                {
                    this.f128733a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f128733a.mo93418g();
                    return C89391z.f203057a;
                }
            });
        }
    }
}
