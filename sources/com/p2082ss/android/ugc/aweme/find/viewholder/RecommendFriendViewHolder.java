package com.p2082ss.android.ugc.aweme.find.viewholder;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.find.viewmodel.C51034a;
import com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder */
public final class RecommendFriendViewHolder extends FindFriendsBaseViewHolder implements AbstractC33974au {

    /* renamed from: c */
    public C51086a f117676c = new C51086a(this.f117683j, new C51086a.C51094g(this) {
        /* class com.p2082ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder.C510121 */

        /* renamed from: a */
        final /* synthetic */ RecommendFriendViewHolder f117684a;

        static {
            Covode.recordClassIndex(60194);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f117684a = r1;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            if (i == 1) {
                C51488a.m95928b(user, this.f117684a.f117678e, this.f117684a.f117679f, "find_friends");
                this.f117684a.mo86347a(user, C59256u.EnumC59257a.FOLLOW);
                return;
            }
            C51488a.m95936c(user, this.f117684a.f117678e, this.f117684a.f117679f, "find_friends");
            this.f117684a.mo86347a(user, C59256u.EnumC59257a.FOLLOW_CANCEL);
        }
    });

    /* renamed from: d */
    public User f117677d;

    /* renamed from: e */
    public int f117678e;

    /* renamed from: f */
    public String f117679f = "suggest_account";

    /* renamed from: g */
    public final AbstractC66614a f117680g;

    /* renamed from: h */
    public final AbstractC89171a<Boolean> f117681h;

    /* renamed from: i */
    public final AbstractC89188r<User, Integer, String, String, C89391z> f117682i;

    /* renamed from: j */
    private AbstractC51346a f117683j;

    static {
        Covode.recordClassIndex(60193);
    }

    @Override // com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsBaseViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder$a */
    public static final class C51015a implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendViewHolder f117687a;

        /* renamed from: b */
        final /* synthetic */ User f117688b;

        static {
            Covode.recordClassIndex(60197);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            if (followStatus != null) {
                this.f117687a.f117680g.mo61442a(followStatus.followStatus, followStatus.followerStatus, null);
            }
        }

        public C51015a(RecommendFriendViewHolder recommendFriendViewHolder, User user) {
            this.f117687a = recommendFriendViewHolder;
            this.f117688b = user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder$b */
    public static final class C51016b implements C51086a.AbstractC51092e {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendViewHolder f117689a;

        static {
            Covode.recordClassIndex(60198);
        }

        public C51016b(RecommendFriendViewHolder recommendFriendViewHolder) {
            this.f117689a = recommendFriendViewHolder;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            C89219l.m154716b(followStatus, "");
            String str = followStatus.userId;
            C89219l.m154716b(str, "");
            if (followStatus.followStatus == 0) {
                C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("to_user_id", str).f79943a);
            } else {
                C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("to_user_id", str).f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder$d */
    public static final class C51018d extends AbstractC89220m implements AbstractC89172b<FindFriendsState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendViewHolder f117692a;

        /* renamed from: b */
        final /* synthetic */ String f117693b;

        static {
            Covode.recordClassIndex(60200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51018d(RecommendFriendViewHolder recommendFriendViewHolder, String str) {
            super(1);
            this.f117692a = recommendFriendViewHolder;
            this.f117693b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
            int i;
            String str;
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            List<C51034a> list = findFriendsState2.getList();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.f117718b == 2) {
                    arrayList.add(next);
                }
            }
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                User user = ((C51034a) obj).f117717a;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, this.f117693b)) {
                    this.f117692a.f117678e = i;
                }
                i = i2;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder$c */
    public static final class C51017c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendViewHolder f117690a;

        /* renamed from: b */
        final /* synthetic */ User f117691b;

        static {
            Covode.recordClassIndex(60199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51017c(RecommendFriendViewHolder recommendFriendViewHolder, User user) {
            super(1);
            this.f117690a = recommendFriendViewHolder;
            this.f117691b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == C51700au.f119171c) {
                C51488a.m95939d(this.f117691b, this.f117690a.f117678e, this.f117690a.f117679f, "find_friends");
                this.f117690a.mo86347a(this.f117691b, C59256u.EnumC59257a.ENTER_PROFILE);
                View view = this.f117690a.itemView;
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                SmartRouter.buildRoute((Activity) context, "aweme://user/profile/" + this.f117691b.getUid()).withParam("sec_user_id", this.f117691b.getSecUid()).withParam("enter_from", "find_friends_page").withParam("extra_mutual_relation", this.f117691b.getMutualStruct()).withParam("recommend_enter_profile_params", new C66623g("find_friends_page", null, C59256u.EnumC59259c.CARD, this.f117691b.getRecType(), C66623g.C66624a.m118386a(this.f117691b), this.f117691b.getUid(), null, null, this.f117691b.getRequestId(), null, this.f117691b.getFriendTypeStr(), this.f117691b.getSocialInfo())).open();
            } else if (intValue == C51700au.f119173e) {
                C66652b bVar = C66652b.f149825a;
                String uid = this.f117691b.getUid();
                C89219l.m154716b(uid, "");
                bVar.mo105655a(uid, this.f117691b.getSecUid());
                User user = this.f117691b;
                int i = this.f117690a.f117678e;
                String str = this.f117690a.f117679f;
                C89219l.m154721d(str, "");
                if (user != null) {
                    C39162r.m79460a("close_recommend_user_cell", new C33744d().mo59983a("enter_from", "find_friends_page").mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59980a("impr_order", i).mo59983a("req_id", user.getRequestId()).mo59983a("relation_type", user.getFriendTypeStr()).mo59983a("tab_name", "find_friends").mo59983a("section", str).f79943a);
                }
                this.f117690a.mo86347a(this.f117691b, C59256u.EnumC59257a.CLOSE);
                FindFriendsViewModel findFriendsViewModel = this.f117690a.f117639a;
                findFriendsViewModel.mo33687b_(new FindFriendsViewModel.C51024b(findFriendsViewModel, this.f117690a.getAdapterPosition() - 1));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo86347a(User user, C59256u.EnumC59257a aVar) {
        String str;
        C59256u a = new C59256u().mo96839q(this.f117639a.f117700c).mo96834a("find_friends_page");
        a.f135350a = C59256u.EnumC59259c.CARD;
        a.f135352b = aVar;
        C59256u a2 = a.mo96832a(user);
        if (user != null) {
            str = user.getRequestId();
        } else {
            str = null;
        }
        a2.mo96841s(str).mo96792f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.r<? super com.ss.android.ugc.aweme.profile.model.User, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendFriendViewHolder(AbstractC66614a aVar, AbstractC89171a<Boolean> aVar2, AbstractC89188r<? super User, ? super Integer, ? super String, ? super String, C89391z> rVar) {
        super(aVar.getView());
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(rVar, "");
        this.f117680g = aVar;
        this.f117681h = aVar2;
        this.f117682i = rVar;
        this.f117683j = aVar.getFollowBtn();
        if (!IMUnder16ProxyImpl.m102047n().mo93022d()) {
            aVar.mo61445a(true);
            C51086a aVar3 = this.f117676c;
            if (aVar3 != null) {
                aVar3.f117879e = new C51086a.AbstractC51090c(this) {
                    /* class com.p2082ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder.C510132 */

                    /* renamed from: a */
                    final /* synthetic */ RecommendFriendViewHolder f117685a;

                    static {
                        Covode.recordClassIndex(60195);
                    }

                    {
                        this.f117685a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
                    /* renamed from: a */
                    public final boolean mo63341a(int i) {
                        if (i != 2) {
                            return false;
                        }
                        if (this.f117685a.f117677d != null) {
                            RecommendFriendViewHolder recommendFriendViewHolder = this.f117685a;
                            User user = recommendFriendViewHolder.f117677d;
                            if (user == null) {
                                C89219l.m154715b();
                            }
                            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
                            if (createIMainServiceHelperbyMonsterPlugin == null || !createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() || createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                                C89219l.m154716b(createIIMServicebyMonsterPlugin, "");
                                IIMAdapterService d = IMAdapterServiceImpl.m101068d();
                                if (!(d == null || !d.mo90129a() || createIIMServicebyMonsterPlugin == null)) {
                                    IIMService createIIMServicebyMonsterPlugin2 = IMService.createIIMServicebyMonsterPlugin(false);
                                    View view = recommendFriendViewHolder.itemView;
                                    C89219l.m154716b(view, "");
                                    createIIMServicebyMonsterPlugin2.startChat(C56245a.C56247b.m102214a(view.getContext(), IMUser.fromUser(user)).mo93274c("find_friends_page").mo93271b("button").f128281a);
                                    recommendFriendViewHolder.mo86347a(user, C59256u.EnumC59257a.ENTER_CHAT);
                                }
                            } else {
                                createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
                            }
                        }
                        return true;
                    }
                };
            }
        } else {
            aVar.mo61445a(false);
        }
        aVar.getView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder.View$OnAttachStateChangeListenerC510143 */

            /* renamed from: a */
            final /* synthetic */ RecommendFriendViewHolder f117686a;

            static {
                Covode.recordClassIndex(60196);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f117686a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                String str;
                User user;
                RecommendFriendViewHolder recommendFriendViewHolder = this.f117686a;
                if (!recommendFriendViewHolder.f117681h.invoke().booleanValue() && (user = recommendFriendViewHolder.f117677d) != null) {
                    recommendFriendViewHolder.f117682i.mo8774a(user, Integer.valueOf(recommendFriendViewHolder.f117678e), recommendFriendViewHolder.f117679f, recommendFriendViewHolder.f117639a.f117700c);
                }
                User user2 = recommendFriendViewHolder.f117677d;
                if (user2 != null && user2.isShould_write_impr()) {
                    C61504e eVar = C61504e.C61505a.f139616a;
                    User user3 = recommendFriendViewHolder.f117677d;
                    if (user3 != null) {
                        str = user3.getUid();
                    } else {
                        str = null;
                    }
                    eVar.mo99160a(1, str);
                }
            }
        });
    }
}
