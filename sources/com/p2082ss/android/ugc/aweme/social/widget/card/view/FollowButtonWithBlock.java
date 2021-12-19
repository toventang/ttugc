package com.p2082ss.android.ugc.aweme.social.widget.card.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.NewFollowButton;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock */
public final class FollowButtonWithBlock extends NewFollowButton implements C51086a.AbstractC51093f {

    /* renamed from: e */
    public AbstractC89172b<? super FollowStatus, C89391z> f168329e;

    /* renamed from: f */
    private AbstractC89172b<? super Integer, C89391z> f168330f;

    /* renamed from: g */
    private final AbstractC89244h f168331g;

    static {
        Covode.recordClassIndex(87737);
    }

    public FollowButtonWithBlock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
    public final String getEnterFrom() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
    public final String getEnterMethod() {
        return "";
    }

    public final C51086a getFollowBlock() {
        return (C51086a) this.f168331g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
    public final int getFollowFromType() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock$a */
    static final class C74877a extends AbstractC89220m implements AbstractC89171a<C51086a> {

        /* renamed from: a */
        final /* synthetic */ FollowButtonWithBlock f168332a;

        static {
            Covode.recordClassIndex(87738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74877a(FollowButtonWithBlock followButtonWithBlock) {
            super(0);
            this.f168332a = followButtonWithBlock;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51086a invoke() {
            FollowButtonWithBlock followButtonWithBlock = this.f168332a;
            return new C51086a(followButtonWithBlock, followButtonWithBlock);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock$c */
    public static final class C74879c implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ FollowButtonWithBlock f168335a;

        static {
            Covode.recordClassIndex(87740);
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
        C74879c(FollowButtonWithBlock followButtonWithBlock) {
            this.f168335a = followButtonWithBlock;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            C89219l.m154721d(followStatus, "");
            AbstractC89172b<? super FollowStatus, C89391z> bVar = this.f168335a.f168329e;
            if (bVar != null) {
                bVar.invoke(followStatus);
            }
            this.f168335a.mo73175a(followStatus.followStatus, followStatus.followerStatus);
        }
    }

    public final void setMobListener(AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f168330f = bVar;
    }

    public final void setOnClickListener(AbstractC89172b<? super FollowStatus, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f168329e = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock$b */
    public static final class C74878b implements C51086a.AbstractC51090c {

        /* renamed from: a */
        final /* synthetic */ FollowButtonWithBlock f168333a;

        /* renamed from: b */
        final /* synthetic */ User f168334b;

        static {
            Covode.recordClassIndex(87739);
        }

        C74878b(FollowButtonWithBlock followButtonWithBlock, User user) {
            this.f168333a = followButtonWithBlock;
            this.f168334b = user;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
        /* renamed from: a */
        public final boolean mo63341a(int i) {
            return INoticeService.C61609a.m111607a(NoticeServiceImpl.m112566f(), this.f168333a.getContext(), this.f168334b, null, null, this.f168333a.getShouldShowMessageText(), 12);
        }
    }

    public final void setListener(User user) {
        getFollowBlock().f117879e = new C74878b(this, user);
        getFollowBlock().f117878d = new C74879c(this);
        getFollowBlock().f117880f = C74880d.f168336a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.FollowButtonWithBlock$d */
    public static final class C74880d implements C51086a.AbstractC51092e {

        /* renamed from: a */
        public static final C74880d f168336a = new C74880d();

        static {
            Covode.recordClassIndex(87741);
        }

        C74880d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            C89219l.m154716b(followStatus, "");
            if (followStatus.followStatus == 0) {
                C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "following_list").mo59983a("to_user_id", followStatus.userId).f79943a);
            } else {
                C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "following_list").mo59983a("to_user_id", followStatus.userId).f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
    /* renamed from: a */
    public final void mo63346a(int i, User user) {
        AbstractC89172b<? super Integer, C89391z> bVar = this.f168330f;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }

    private /* synthetic */ FollowButtonWithBlock(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FollowButtonWithBlock(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, (int) R.attr.bo);
        C89219l.m154721d(context, "");
        this.f168331g = C89250i.m154773a((AbstractC89171a) new C74877a(this));
    }
}
