package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3161b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a */
public final class C54925a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public AbstractC34478k<User> f125736a;

    /* renamed from: b */
    public C51086a f125737b = new C51086a(this.f125740e, new C51086a.C51094g(this) {
        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3161b.C54925a.C549261 */

        /* renamed from: a */
        final /* synthetic */ C54925a f125741a;

        static {
            Covode.recordClassIndex(64648);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f125741a = r1;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            AbstractC34478k<User> kVar = this.f125741a.f125736a;
            if (kVar != null) {
                int position = this.f125741a.getPosition();
                this.f125741a.f125738c.getView();
                kVar.mo60910a(100, user, position);
            }
        }
    });

    /* renamed from: c */
    public final AbstractC66614a f125738c;

    /* renamed from: d */
    public final RecommendFriendInDMViewModel f125739d;

    /* renamed from: e */
    private AbstractC51346a f125740e;

    static {
        Covode.recordClassIndex(64647);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a$b */
    public static final class C54928b implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ C54925a f125745a;

        /* renamed from: b */
        final /* synthetic */ User f125746b;

        static {
            Covode.recordClassIndex(64650);
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
                IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                this.f125745a.f125738c.mo61442a(followStatus.followStatus, followStatus.followerStatus, followStatus.userId);
            }
        }

        public C54928b(C54925a aVar, User user) {
            this.f125745a = aVar;
            this.f125746b = user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a$d */
    public static final class C54930d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54925a f125749a;

        /* renamed from: b */
        final /* synthetic */ User f125750b;

        static {
            Covode.recordClassIndex(64652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54930d(C54925a aVar, User user) {
            super(1);
            this.f125749a = aVar;
            this.f125750b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int i;
            int intValue = num.intValue();
            if (intValue == C51700au.f119171c) {
                i = 101;
            } else if (intValue == C51700au.f119173e) {
                i = 102;
            } else if (intValue == C51700au.f119175g) {
                i = 103;
            } else {
                i = -1;
            }
            AbstractC34478k<User> kVar = this.f125749a.f125736a;
            if (kVar != null) {
                User user = this.f125750b;
                int position = this.f125749a.getPosition();
                this.f125749a.f125738c.getView();
                kVar.mo60910a(i, user, position);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a$a */
    public static final class C54927a implements C51086a.AbstractC51090c {

        /* renamed from: a */
        final /* synthetic */ C54925a f125742a;

        /* renamed from: b */
        final /* synthetic */ User f125743b;

        /* renamed from: c */
        final /* synthetic */ boolean f125744c;

        static {
            Covode.recordClassIndex(64649);
        }

        public C54927a(C54925a aVar, User user, boolean z) {
            this.f125742a = aVar;
            this.f125743b = user;
            this.f125744c = z;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
        /* renamed from: a */
        public final boolean mo63341a(int i) {
            INoticeService f = NoticeServiceImpl.m112566f();
            View view = this.f125742a.itemView;
            C89219l.m154716b(view, "");
            boolean a = INoticeService.C61609a.m111607a(f, view.getContext(), this.f125743b, "message_rec", null, !this.f125744c, 8);
            if (a) {
                User user = this.f125743b;
                C59256u a2 = new C59256u().mo96839q("notification_page").mo96834a("message_rec");
                a2.f135350a = C59256u.EnumC59259c.CARD;
                a2.f135352b = C59256u.EnumC59257a.ENTER_CHAT;
                a2.mo96832a(user).mo96841s(user.getRequestId()).mo96792f();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a$c */
    public static final class C54929c implements C51086a.AbstractC51092e {

        /* renamed from: a */
        final /* synthetic */ C54925a f125747a;

        /* renamed from: b */
        final /* synthetic */ User f125748b;

        static {
            Covode.recordClassIndex(64651);
        }

        public C54929c(C54925a aVar, User user) {
            this.f125747a = aVar;
            this.f125748b = user;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            String uid = this.f125748b.getUid();
            C89219l.m154716b(uid, "");
            C89219l.m154716b(followStatus, "");
            if (followStatus.followStatus == 0) {
                C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "message_rec").mo59983a("to_user_id", uid).f79943a);
            } else {
                C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "message_rec").mo59983a("to_user_id", uid).f79943a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54925a(AbstractC66614a aVar, RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
        super(aVar.getView());
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(recommendFriendInDMViewModel, "");
        this.f125738c = aVar;
        this.f125739d = recommendFriendInDMViewModel;
        this.f125740e = aVar.getFollowBtn();
    }
}
