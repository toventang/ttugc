package com.p2082ss.android.ugc.aweme.relation.recommend;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66895d;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.t */
public final class C67017t extends RecyclerView.ViewHolder {

    /* renamed from: a */
    C51086a f150346a = new C51086a(this.f150352g, new C51086a.C51094g(this) {
        /* class com.p2082ss.android.ugc.aweme.relation.recommend.C67017t.C670181 */

        /* renamed from: a */
        final /* synthetic */ C67017t f150353a;

        static {
            Covode.recordClassIndex(78595);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f150353a = r1;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            C66870b.m118588b(this.f150353a.f150349d, EnumC66892b.RECOMMEND.getValue());
            if (i == 1) {
                C66895d.m118641a(user, this.f150353a.f150348c, this.f150353a.f150349d);
                this.f150353a.mo105886a(user, C59256u.EnumC59257a.FOLLOW);
                return;
            }
            C66895d.m118643b(user, this.f150353a.f150348c, this.f150353a.f150349d);
            this.f150353a.mo105886a(user, C59256u.EnumC59257a.FOLLOW_CANCEL);
        }
    });

    /* renamed from: b */
    User f150347b;

    /* renamed from: c */
    public int f150348c;

    /* renamed from: d */
    public final int f150349d;

    /* renamed from: e */
    public final AbstractC66614a f150350e;

    /* renamed from: f */
    public final AbstractC89172b<User, C89391z> f150351f;

    /* renamed from: g */
    private AbstractC51346a f150352g;

    static {
        Covode.recordClassIndex(78594);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.t$a */
    public static final class C67020a implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ C67017t f150355a;

        /* renamed from: b */
        final /* synthetic */ User f150356b;

        static {
            Covode.recordClassIndex(78597);
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
                this.f150355a.f150350e.mo61442a(followStatus.followStatus, followStatus.followerStatus, null);
            }
        }

        C67020a(C67017t tVar, User user) {
            this.f150355a = tVar;
            this.f150356b = user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.t$b */
    static final class C67021b implements C51086a.AbstractC51092e {

        /* renamed from: a */
        final /* synthetic */ C67017t f150357a;

        /* renamed from: b */
        final /* synthetic */ User f150358b;

        static {
            Covode.recordClassIndex(78598);
        }

        C67021b(C67017t tVar, User user) {
            this.f150357a = tVar;
            this.f150358b = user;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            int i = this.f150357a.f150349d;
            String uid = this.f150358b.getUid();
            C89219l.m154716b(uid, "");
            C66895d.m118640a(i, uid, this.f150358b.getFollowStatus());
        }
    }

    /* renamed from: a */
    public final void mo105886a(User user, C59256u.EnumC59257a aVar) {
        String str;
        C59256u a = new C59256u().mo96834a("on_boarding");
        a.f135350a = C59256u.EnumC59259c.CARD;
        a.f135352b = aVar;
        if (this.f150349d == 2) {
            if (user != null) {
                user.setRecType("1-2");
            }
        } else if (user != null) {
            user.setRecType("1-1");
        }
        C59256u a2 = a.mo96832a(user);
        if (user != null) {
            str = user.getRequestId();
        } else {
            str = null;
        }
        a2.mo96841s(str).mo96792f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.profile.model.User, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67017t(int i, AbstractC66614a aVar, AbstractC89172b<? super User, C89391z> bVar) {
        super(aVar.getView());
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f150349d = i;
        this.f150350e = aVar;
        this.f150351f = bVar;
        this.f150352g = aVar.getFollowBtn();
        aVar.mo61445a(false);
        aVar.getView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.relation.recommend.C67017t.View$OnAttachStateChangeListenerC670192 */

            /* renamed from: a */
            final /* synthetic */ C67017t f150354a;

            static {
                Covode.recordClassIndex(78596);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f150354a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                C67017t tVar = this.f150354a;
                User user = tVar.f150347b;
                if (user != null) {
                    tVar.f150351f.invoke(user);
                }
            }
        });
    }
}
