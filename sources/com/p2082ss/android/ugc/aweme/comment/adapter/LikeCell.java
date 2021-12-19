package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.comment.p2499m.AbstractC36537a;
import com.p2082ss.android.ugc.aweme.comment.util.C37199i;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.LikeListVM;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.NewFollowButton;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUser;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell */
public final class LikeCell extends PowerCell<C36213af> {

    /* renamed from: a */
    public static final C36184a f85470a = new C36184a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f85471b = C89250i.m154773a((AbstractC89171a) C36187d.f85481a);

    /* renamed from: j */
    private final AbstractC89244h f85472j = C89250i.m154773a((AbstractC89171a) new C36199l(this));

    /* renamed from: k */
    private final AbstractC89244h f85473k = C89250i.m154773a((AbstractC89171a) new C36186c(this));

    /* renamed from: l */
    private final AbstractC89244h f85474l = C89250i.m154773a((AbstractC89171a) new C36196i(this));

    /* renamed from: m */
    private final AbstractC89244h f85475m = C89250i.m154773a((AbstractC89171a) new C36195h(this));

    /* renamed from: n */
    private final AbstractC89244h f85476n = C89250i.m154773a((AbstractC89171a) new C36193f(this));

    /* renamed from: o */
    private final AbstractC89244h f85477o = C89250i.m154773a((AbstractC89171a) new C36188e(this));

    /* renamed from: p */
    private final AbstractC1214u<Boolean> f85478p = new C36194g(this);

    static {
        Covode.recordClassIndex(43446);
    }

    /* renamed from: d */
    private final LikeListVM m73746d() {
        return (LikeListVM) this.f85472j.getValue();
    }

    /* renamed from: e */
    private final SmartImageView m73747e() {
        return (SmartImageView) this.f85473k.getValue();
    }

    /* renamed from: q */
    private final MutualRelationView m73748q() {
        return (MutualRelationView) this.f85475m.getValue();
    }

    /* renamed from: a */
    public final NewFollowButton mo63336a() {
        return (NewFollowButton) this.f85476n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$a */
    public static final class C36184a {
        static {
            Covode.recordClassIndex(43447);
        }

        private C36184a() {
        }

        public /* synthetic */ C36184a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$c */
    static final class C36186c extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85480a;

        static {
            Covode.recordClassIndex(43449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36186c(LikeCell likeCell) {
            super(0);
            this.f85480a = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f85480a.itemView.findViewById(R.id.bsr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$f */
    static final class C36193f extends AbstractC89220m implements AbstractC89171a<NewFollowButton> {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85487a;

        static {
            Covode.recordClassIndex(43456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36193f(LikeCell likeCell) {
            super(0);
            this.f85487a = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NewFollowButton invoke() {
            return this.f85487a.itemView.findViewById(R.id.xm);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$h */
    static final class C36195h extends AbstractC89220m implements AbstractC89171a<MutualRelationView> {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85489a;

        static {
            Covode.recordClassIndex(43458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36195h(LikeCell likeCell) {
            super(0);
            this.f85489a = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MutualRelationView invoke() {
            return this.f85489a.itemView.findViewById(R.id.cp6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$i */
    static final class C36196i extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85490a;

        static {
            Covode.recordClassIndex(43459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36196i(LikeCell likeCell) {
            super(0);
            this.f85490a = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f85490a.itemView.findViewById(R.id.ezz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$d */
    static final class C36187d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C36187d f85481a = new C36187d();

        static {
            Covode.recordClassIndex(43450);
        }

        C36187d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (!C80580in.m139687c() && !MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false).isChatFunOfflineUnder16()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$l */
    static final class C36199l extends AbstractC89220m implements AbstractC89171a<LikeListVM> {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85493a;

        static {
            Covode.recordClassIndex(43462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36199l(LikeCell likeCell) {
            super(0);
            this.f85493a = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LikeListVM invoke() {
            View view = this.f85493a.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return LikeListVM.C37250a.m75257a((ActivityC0945e) context);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: m */
    public final void mo28074m() {
        super.mo28074m();
        m73746d().mo64813j().removeObserver(this.f85478p);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$e */
    static final class C36188e extends AbstractC89220m implements AbstractC89171a<C51086a> {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85482a;

        static {
            Covode.recordClassIndex(43451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36188e(LikeCell likeCell) {
            super(0);
            this.f85482a = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51086a invoke() {
            C51086a aVar = new C51086a(this.f85482a.mo63336a(), new C36192a(this));
            aVar.f117879e = new C51086a.AbstractC51090c(this) {
                /* class com.p2082ss.android.ugc.aweme.comment.adapter.LikeCell.C36188e.C361891 */

                /* renamed from: a */
                final /* synthetic */ C36188e f85483a;

                static {
                    Covode.recordClassIndex(43452);
                }

                {
                    this.f85483a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
                /* renamed from: a */
                public final boolean mo63341a(int i) {
                    LikeCell likeCell = this.f85483a.f85482a;
                    C36213af afVar = (C36213af) likeCell.f42160d;
                    if (afVar == null || i != 2 || !likeCell.mo63336a().getShouldShowMessageText()) {
                        C37199i.m75175b("LikeCell", "tryEnterChat invalid:" + i + ", " + likeCell.mo63336a().getShouldShowMessageText());
                        return false;
                    }
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    View view = likeCell.itemView;
                    C89219l.m154716b(view, "");
                    createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102214a(view.getContext(), IMUser.fromUser(afVar.f85524a)).mo93274c(afVar.f85525b.f85529c).mo93271b("like_list").mo93277e(afVar.f85525b.f85527a).mo93275d(AbstractC36537a.C36538a.m74365a(i, afVar.f85524a.getFollowerStatus())).mo93278f(UGCMonitor.TYPE_POST).f128281a);
                    likeCell.mo63337a(C59256u.EnumC59257a.ENTER_CHAT);
                    return true;
                }
            };
            aVar.f117878d = new C51086a.AbstractC51091d(this) {
                /* class com.p2082ss.android.ugc.aweme.comment.adapter.LikeCell.C36188e.C361902 */

                /* renamed from: a */
                final /* synthetic */ C36188e f85484a;

                static {
                    Covode.recordClassIndex(43453);
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
                {
                    this.f85484a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
                /* renamed from: a */
                public final void mo63343a(FollowStatus followStatus) {
                    C89219l.m154721d(followStatus, "");
                    this.f85484a.f85482a.mo63336a().mo73175a(followStatus.followStatus, followStatus.followerStatus);
                }
            };
            aVar.f117880f = C361913.f85485a;
            return aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$e$a */
        public static final class C36192a extends C51086a.C51094g {

            /* renamed from: a */
            final /* synthetic */ C36188e f85486a;

            static {
                Covode.recordClassIndex(43455);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C36192a(C36188e eVar) {
                this.f85486a = eVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            /* renamed from: a */
            public final void mo63346a(int i, User user) {
                String str;
                LikeCell likeCell = this.f85486a.f85482a;
                C36213af afVar = (C36213af) likeCell.f42160d;
                if (afVar != null) {
                    if (i == 0) {
                        C39162r.m79460a("follow_cancel", new C33744d().mo59983a("enter_from", afVar.f85525b.f85529c).mo59983a("enter_method", "like_list").mo59983a("group_id", afVar.f85525b.f85527a).mo59983a("to_user_id", afVar.f85524a.getUid()).mo59983a("story_type", UGCMonitor.TYPE_POST).f79943a);
                        likeCell.mo63337a(C59256u.EnumC59257a.FOLLOW_CANCEL);
                        return;
                    }
                    C59260v a = new C59260v().mo96847a(afVar.f85525b.f85529c);
                    a.f135409s = "like_list";
                    a.f135406p = afVar.f85525b.f85527a;
                    a.f135405e = afVar.f85524a.getUid();
                    a.f135223W = UGCMonitor.TYPE_POST;
                    User user2 = afVar.f85524a;
                    C89219l.m154721d(user2, "");
                    if (user2.getFollowerStatus() == 1) {
                        str = "mutual";
                    } else {
                        str = "single";
                    }
                    a.f135412v = str;
                    a.mo96792f();
                    likeCell.mo63337a(C59256u.EnumC59257a.FOLLOW);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo63338b() {
        User user;
        C36213af afVar = (C36213af) this.f42160d;
        if (afVar != null && (user = afVar.f85524a) != null && !m73746d().mo64812i().contains(user.getUid()) && mo63337a(C59256u.EnumC59257a.SHOW)) {
            Set<String> i = m73746d().mo64812i();
            String uid = user.getUid();
            C89219l.m154716b(uid, "");
            i.add(uid);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$b */
    static final class RunnableC36185b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85479a;

        static {
            Covode.recordClassIndex(43448);
        }

        RunnableC36185b(LikeCell likeCell) {
            this.f85479a = likeCell;
        }

        public final void run() {
            View view = this.f85479a.itemView;
            View view2 = this.f85479a.itemView;
            C89219l.m154716b(view2, "");
            View view3 = this.f85479a.itemView;
            C89219l.m154716b(view3, "");
            ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", view2.getResources().getColor(R.color.f), view3.getResources().getColor(R.color.c9));
            C89219l.m154716b(ofInt, "");
            ofInt.setDuration(3000L);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.start();
            C36213af afVar = (C36213af) this.f85479a.f42160d;
            if (afVar != null) {
                afVar.f85526c = false;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        super.mo28073l();
        C33943c<Boolean> j = m73746d().mo64813j();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        j.observe((AbstractC1204m) context, this.f85478p);
        if (C89219l.m154714a((Object) m73746d().mo64813j().getValue(), (Object) true)) {
            mo63338b();
        }
        C36213af afVar = (C36213af) this.f42160d;
        if (afVar != null && afVar.f85526c) {
            this.itemView.postDelayed(new RunnableC36185b(this), 150);
        }
    }

    /* renamed from: c */
    public final void mo63339c() {
        String str;
        Throwable th;
        C36213af afVar = (C36213af) this.f42160d;
        if (afVar != null) {
            User user = afVar.f85524a;
            C59252q qVar = (C59252q) new C59252q().mo96749g(afVar.f85525b.f85528b).mo96825o(afVar.f85525b.f85529c).mo96741a("click_head");
            qVar.f135285Y = "like_list";
            qVar.f135286Z = "like_list";
            qVar.f135312e = afVar.f85525b.f85527a;
            qVar.f135222V = AbstractC36537a.C36538a.m74365a(user.getFollowStatus(), user.getFollowerStatus());
            qVar.f135223W = UGCMonitor.TYPE_POST;
            qVar.mo96792f();
            mo63337a(C59256u.EnumC59257a.ENTER_PROFILE);
            if (m73745a(user)) {
                try {
                    MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scene_type", C59256u.EnumC59259c.CARD);
                    jSONObject.put("position", "like_list");
                    String recType = user.getRecType();
                    if (recType == null) {
                        recType = "";
                    }
                    jSONObject.put("rec_type", recType);
                    String relationType = matchedFriendStruct.getRelationType();
                    if (relationType == null) {
                        relationType = "";
                    }
                    jSONObject.put("relation_type", relationType);
                    jSONObject.put("to_user_id", user.getUid());
                    String requestId = user.getRequestId();
                    if (requestId == null) {
                        requestId = "";
                    }
                    jSONObject.put("req_id", requestId);
                    C80409eu.m139392a(jSONObject, user.getSocialInfo());
                    str = jSONObject.toString();
                    C89219l.m154716b(str, "");
                    try {
                        C89379q.m157068constructorimpl(C89391z.f203057a);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = "";
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                    View view = this.itemView;
                    C89219l.m154716b(view, "");
                    SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("event_keys", str).open();
                }
            } else {
                str = "";
            }
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("event_keys", str).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$j */
    static final class View$OnClickListenerC36197j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85491a;

        static {
            Covode.recordClassIndex(43460);
        }

        View$OnClickListenerC36197j(LikeCell likeCell) {
            this.f85491a = likeCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85491a.mo63339c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$k */
    static final class View$OnClickListenerC36198k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85492a;

        static {
            Covode.recordClassIndex(43461);
        }

        View$OnClickListenerC36198k(LikeCell likeCell) {
            this.f85492a = likeCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85492a.mo63339c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.LikeCell$g */
    static final class C36194g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LikeCell f85488a;

        static {
            Covode.recordClassIndex(43457);
        }

        C36194g(LikeCell likeCell) {
            this.f85488a = likeCell;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f85488a.mo63338b();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ix, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    private static boolean m73745a(User user) {
        List<MutualUser> list;
        String recommendReason;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
            if (mMutualStruct != null) {
                list = mMutualStruct.getUserList();
            } else {
                list = null;
            }
            if ((list == null || list.isEmpty()) && ((recommendReason = matchedFriendStruct.getRecommendReason()) == null || recommendReason.length() == 0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo63337a(C59256u.EnumC59257a aVar) {
        C36213af afVar = (C36213af) this.f42160d;
        if (afVar == null || !m73745a(afVar.f85524a)) {
            return false;
        }
        afVar.f85524a.getMatchedFriendStruct();
        C59256u a = new C59256u().mo96834a(afVar.f85525b.f85529c);
        a.f135352b = aVar;
        C59256u r = a.mo96840r(afVar.f85525b.f85527a);
        r.f135223W = UGCMonitor.TYPE_POST;
        C59256u a2 = r.mo96832a(afVar.f85524a);
        a2.f135350a = C59256u.EnumC59259c.CARD;
        a2.mo96838p("like_list").mo96792f();
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0088, code lost:
        if (r6 != null) goto L_0x008a;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo23350a(com.p2082ss.android.ugc.aweme.comment.adapter.C36213af r8) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.adapter.LikeCell.mo23350a(com.bytedance.ies.powerlist.b.a):void");
    }
}
