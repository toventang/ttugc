package com.p2082ss.android.ugc.aweme.qainvitation.p3639d;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.p1195a.C17151a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.I18nFollowUserBtn;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.d.b */
public final class C65833b extends AbstractC39063h {

    /* renamed from: a */
    public final C88411a f148349a;

    /* renamed from: b */
    public List<? extends IMUser> f148350b;

    static {
        Covode.recordClassIndex(77334);
    }

    private /* synthetic */ C65833b() {
        this(C89086z.INSTANCE);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60933c() {
        return this.f148350b.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.b$a */
    public final class C65834a extends C17151a<IMUser> {

        /* renamed from: a */
        public AvatarImageWithVerify f148351a;

        /* renamed from: b */
        public TextView f148352b;

        /* renamed from: c */
        public TextView f148353c;

        /* renamed from: d */
        public I18nFollowUserBtn f148354d;

        /* renamed from: e */
        public final View f148355e;

        /* renamed from: f */
        public final C65833b f148356f;

        /* renamed from: g */
        public final List<IMUser> f148357g;

        /* renamed from: h */
        final /* synthetic */ C65833b f148358h;

        static {
            Covode.recordClassIndex(77335);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final void mo27050a() {
        }

        /* renamed from: b */
        public final void mo104976b() {
            new C23144b(this.f148355e).mo37640e(R.string.fz3).mo37634a(3000L).mo37637b();
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.b$a$d */
        static final class C65838d<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65834a f148369a;

            static {
                Covode.recordClassIndex(77339);
            }

            C65838d(C65834a aVar) {
                this.f148369a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f148369a.mo104976b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.b$a$a */
        public static final class View$OnClickListenerC65835a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ IMUser f148359a;

            /* renamed from: b */
            final /* synthetic */ C65834a f148360b;

            /* renamed from: c */
            final /* synthetic */ int f148361c;

            static {
                Covode.recordClassIndex(77336);
            }

            View$OnClickListenerC65835a(IMUser iMUser, C65834a aVar, int i) {
                this.f148359a = iMUser;
                this.f148360b = aVar;
                this.f148361c = i;
            }

            public final void onClick(View view) {
                int i;
                ClickAgent.onClick(view);
                C65834a aVar = this.f148360b;
                IMUser iMUser = this.f148359a;
                int i2 = this.f148361c;
                List<IMUser> list = aVar.f148357g;
                C65833b bVar = this.f148360b.f148356f;
                C89219l.m154721d(iMUser, "");
                C89219l.m154721d(list, "");
                C89219l.m154721d(bVar, "");
                if (iMUser.getFollowStatus() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                IUserService d = UserService.m138861d();
                String uid = iMUser.getUid();
                C89219l.m154716b(uid, "");
                String secUid = iMUser.getSecUid();
                C89219l.m154716b(secUid, "");
                AbstractC88412b a = d.mo123563a(uid, secUid, i, -1, 0, "", -1).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C65837c(aVar, iMUser, list, i2, bVar), new C65838d(aVar));
                C89219l.m154716b(a, "");
                bVar.f148349a.mo142945a(a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.b$a$b */
        public static final class View$OnClickListenerC65836b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65834a f148362a;

            /* renamed from: b */
            final /* synthetic */ IMUser f148363b;

            static {
                Covode.recordClassIndex(77337);
            }

            View$OnClickListenerC65836b(C65834a aVar, IMUser iMUser) {
                this.f148362a = aVar;
                this.f148363b = iMUser;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View view2 = this.f148362a.itemView;
                C89219l.m154716b(view2, "");
                SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + this.f148363b.getUid()).withParam("sec_uid", this.f148363b.getSecUid()).open();
                C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "qa_personal_profile").f79943a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.b$a$c */
        static final class C65837c<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65834a f148364a;

            /* renamed from: b */
            final /* synthetic */ IMUser f148365b;

            /* renamed from: c */
            final /* synthetic */ List f148366c;

            /* renamed from: d */
            final /* synthetic */ int f148367d;

            /* renamed from: e */
            final /* synthetic */ C65833b f148368e;

            static {
                Covode.recordClassIndex(77338);
            }

            C65837c(C65834a aVar, IMUser iMUser, List list, int i, C65833b bVar) {
                this.f148364a = aVar;
                this.f148365b = iMUser;
                this.f148366c = list;
                this.f148367d = i;
                this.f148368e = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                FollowStatus followStatus = (FollowStatus) obj;
                if (followStatus != null) {
                    this.f148365b.setFollowStatus(followStatus.followStatus);
                    List<? extends IMUser> g = C89070n.m154585g((Collection) this.f148366c);
                    g.set(this.f148367d, this.f148365b);
                    this.f148368e.mo104974a(g);
                    this.f148368e.notifyDataSetChanged();
                    C33744d a = new C33744d().mo59983a("enter_from", "qa_personal_profile");
                    if (this.f148365b.getFollowStatus() == 0) {
                        str = "follow";
                    } else {
                        str = "unfollow";
                    }
                    C39162r.m79460a(str, a.f79943a);
                    return;
                }
                this.f148364a.mo104976b();
            }
        }

        /* renamed from: a */
        public final void mo27052a(IMUser iMUser, int i) {
            C89219l.m154721d(iMUser, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view.setBackground(C17177c.m31711c(view2.getContext()));
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            I18nFollowUserBtn i18nFollowUserBtn = (I18nFollowUserBtn) view3.findViewById(R.id.xm);
            C89219l.m154716b(i18nFollowUserBtn, "");
            int i2 = 0;
            i18nFollowUserBtn.setVisibility(0);
            User c = C65855a.m117775c(iMUser);
            this.f148351a.setUserData(new UserVerify(c.getAvatarThumb(), c.getCustomVerify(), c.getEnterpriseVerifyReason(), Integer.valueOf(c.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f148351a;
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            C65855a.m117769a(avatarImageWithVerify, view4.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f148352b);
            C65855a.m117770a(iMUser, this.f148352b, this.f148353c);
            String uid = iMUser.getUid();
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            if (TextUtils.equals(uid, e.getCurUserId())) {
                this.f148354d.setVisibility(8);
            } else {
                this.f148354d.setVisibility(0);
                I18nFollowUserBtn i18nFollowUserBtn2 = this.f148354d;
                int followStatus = iMUser.getFollowStatus();
                if (iMUser.getFollowerStatus() == 1) {
                    i2 = 1;
                }
                i18nFollowUserBtn2.mo73175a(followStatus, i2);
            }
            this.f148354d.setOnClickListener(new View$OnClickListenerC65835a(iMUser, this, i));
            this.f148355e.setOnClickListener(new View$OnClickListenerC65836b(this, iMUser));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65834a(C65833b bVar, View view, C65833b bVar2, List<? extends IMUser> list) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(list, "");
            this.f148358h = bVar;
            this.f148355e = view;
            this.f148356f = bVar2;
            this.f148357g = list;
            View findViewById = view.findViewById(R.id.nz);
            C89219l.m154716b(findViewById, "");
            this.f148351a = (AvatarImageWithVerify) findViewById;
            View findViewById2 = view.findViewById(R.id.cpj);
            C89219l.m154716b(findViewById2, "");
            this.f148352b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ajd);
            C89219l.m154716b(findViewById3, "");
            this.f148353c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.xm);
            C89219l.m154716b(findViewById4, "");
            this.f148354d = (I18nFollowUserBtn) findViewById4;
        }
    }

    /* renamed from: a */
    public final void mo104974a(List<? extends IMUser> list) {
        C89219l.m154721d(list, "");
        this.f148350b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f148349a.dispose();
    }

    public C65833b(List<? extends IMUser> list) {
        C89219l.m154721d(list, "");
        this.f148350b = list;
        this.f148349a = new C88411a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aqx, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65834a(this, a, this, this.f148350b);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qainvitation.invitedYou.QAInvitedYouUsersListAdapter.QAInvitedYouUsersListViewHolder");
        ((C65834a) viewHolder).mo27052a((IMUser) this.f148350b.get(i), i);
    }
}
