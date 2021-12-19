package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.p1195a.C17151a;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.p2082ss.android.ugc.aweme.friends.model.HotSoonRelationNotice;
import com.p2082ss.android.ugc.aweme.friends.p3013c.C51484e;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.a.a */
public final class C51437a extends RecyclerView.AbstractC1350a<C17151a<IMUser>> {

    /* renamed from: g */
    public static final C51440b f118520g = new C51440b((byte) 0);

    /* renamed from: a */
    public int f118521a;

    /* renamed from: b */
    public List<? extends IMUser> f118522b;

    /* renamed from: c */
    public List<String> f118523c = new ArrayList();

    /* renamed from: d */
    public AtFriendsViewModel.Companion.AllFriends f118524d;

    /* renamed from: e */
    public int f118525e = -1;

    /* renamed from: f */
    final AbstractC89244h f118526f = C89250i.m154773a((AbstractC89171a) C51442d.f118543a);

    static {
        Covode.recordClassIndex(60696);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C17151a<IMUser> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m95824a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.a$b */
    public static final class C51440b {
        static {
            Covode.recordClassIndex(60699);
        }

        private C51440b() {
        }

        public /* synthetic */ C51440b(byte b) {
            this();
        }

        /* renamed from: a */
        public static User m95827a(IMUser iMUser) {
            C89219l.m154721d(iMUser, "");
            User user = new User();
            user.setUid(iMUser.getUid());
            user.setNickname(iMUser.getNickName());
            user.setSignature(iMUser.getSignature());
            user.setAvatarThumb(iMUser.getAvatarThumb());
            user.setUniqueId(iMUser.getUniqueId());
            user.setShortId(iMUser.getShortId());
            user.setFollowStatus(iMUser.getFollowStatus());
            user.setCustomVerify(iMUser.getCustomVerify());
            user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
            user.setVerificationType(iMUser.getVerificationType());
            user.setRemarkName(iMUser.getRemarkName());
            user.isBlock = iMUser.isBlock();
            user.setSecUid(iMUser.getSecUid());
            user.setRegion("");
            return user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.a$d */
    static final class C51442d extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C51442d f118543a = new C51442d();

        static {
            Covode.recordClassIndex(60701);
        }

        C51442d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<? extends IMUser> list = this.f118522b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.a$c */
    public static final class C51441c extends C17151a<IMUser> {

        /* renamed from: a */
        private final TextView f118542a;

        static {
            Covode.recordClassIndex(60700);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final void mo27050a() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51441c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.f0b);
            C89219l.m154716b(findViewById, "");
            this.f118542a = (TextView) findViewById;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final /* synthetic */ void mo27052a(IMUser iMUser, int i) {
            String notice;
            IMUser iMUser2 = iMUser;
            C89219l.m154721d(iMUser2, "");
            if (!(iMUser2 instanceof HotSoonRelationNotice)) {
                iMUser2 = null;
            }
            HotSoonRelationNotice hotSoonRelationNotice = (HotSoonRelationNotice) iMUser2;
            if (hotSoonRelationNotice != null && (notice = hotSoonRelationNotice.getNotice()) != null) {
                this.f118542a.setText(notice);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        Object obj;
        List<? extends IMUser> list = this.f118522b;
        if (list != null) {
            obj = list.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof HotSoonRelationNotice) {
            return 1;
        }
        if (this.f118521a == 1) {
            return 2;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.a$a */
    public final class C51438a extends C17151a<IMUser> {

        /* renamed from: a */
        public TextView f118527a;

        /* renamed from: b */
        public TextView f118528b;

        /* renamed from: c */
        public AvatarImageWithVerify f118529c;

        /* renamed from: d */
        public TextView f118530d;

        /* renamed from: e */
        public TextView f118531e;

        /* renamed from: f */
        public TuxIconView f118532f;

        /* renamed from: g */
        public FrameLayout f118533g;

        /* renamed from: h */
        public int f118534h = -1;

        /* renamed from: i */
        public final View f118535i;

        /* renamed from: j */
        public final C51437a f118536j;

        /* renamed from: k */
        final /* synthetic */ C51437a f118537k;

        static {
            Covode.recordClassIndex(60697);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final void mo27050a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.a.a$a$a */
        static final class View$OnClickListenerC51439a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C51438a f118538a;

            /* renamed from: b */
            final /* synthetic */ IMUser f118539b;

            /* renamed from: c */
            final /* synthetic */ User f118540c;

            /* renamed from: d */
            final /* synthetic */ String f118541d;

            static {
                Covode.recordClassIndex(60698);
            }

            View$OnClickListenerC51439a(C51438a aVar, IMUser iMUser, User user, String str) {
                this.f118538a = aVar;
                this.f118539b = iMUser;
                this.f118540c = user;
                this.f118541d = str;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f118538a.f118534h == 0) {
                    C33744d a = new C33744d().mo59983a("search_keyword", "").mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80059c(this.f118539b.getUid())).mo59983a("to_user_id", this.f118539b.getUid()).mo59980a("relation_tag", this.f118539b.getFollowStatus());
                    C89219l.m154716b(a, "");
                    C39162r.m79463b("add_video_at", C59208ac.m108761a(C80409eu.m139390a(a, this.f118540c).f79943a));
                }
                if (!this.f118539b.isMentionEnabled()) {
                    View view2 = this.f118538a.itemView;
                    C89219l.m154716b(view2, "");
                    new C23144b(view2).mo37640e(R.string.d23).mo37637b();
                } else {
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (!TextUtils.equals(g.getCurUserId(), this.f118539b.getUid())) {
                        C39162r.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f118539b.getUid()));
                        AbstractC81915c.m141874a(new C51484e(this.f118540c));
                    } else {
                        View view3 = this.f118538a.itemView;
                        C89219l.m154716b(view3, "");
                        new C23144b(view3).mo37640e(R.string.dfq).mo37637b();
                    }
                }
                C39162r.m79460a("tag_mention_head_click", new C33744d().mo59983a("previous_page", "video_edit_page").mo59983a("to_user_id", this.f118539b.getUid()).mo59983a("user_type", this.f118541d).mo59983a("search_keyword", "").mo59983a("function", "mention").mo59983a("is_valid", String.valueOf(this.f118539b.isMentionEnabled() ? 1 : 0)).mo59983a("click_type", "choose").mo59983a("enter_from", "video_post_page").f79943a);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0211, code lost:
            if (android.text.TextUtils.equals(r0, r10) == false) goto L_0x0213;
         */
        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo27052a(com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser r13, int r14) {
            /*
            // Method dump skipped, instructions count: 656
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3011a.C51437a.C51438a.mo27052a(java.lang.Object, int):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51438a(C51437a aVar, View view, C51437a aVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(aVar2, "");
            this.f118537k = aVar;
            this.f118535i = view;
            this.f118536j = aVar2;
            View findViewById = view.findViewById(R.id.dtk);
            C89219l.m154716b(findViewById, "");
            this.f118527a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.bmn);
            C89219l.m154716b(findViewById2, "");
            this.f118528b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.nz);
            C89219l.m154716b(findViewById3, "");
            this.f118529c = (AvatarImageWithVerify) findViewById3;
            View findViewById4 = view.findViewById(R.id.cpj);
            C89219l.m154716b(findViewById4, "");
            this.f118530d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ajd);
            C89219l.m154716b(findViewById5, "");
            this.f118531e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.dhg);
            C89219l.m154716b(findViewById6, "");
            this.f118532f = (TuxIconView) findViewById6;
            View findViewById7 = view.findViewById(R.id.bqn);
            C89219l.m154716b(findViewById7, "");
            this.f118533g = (FrameLayout) findViewById7;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C17151a<IMUser> aVar, int i) {
        C17151a aVar2;
        C17151a<IMUser> aVar3 = aVar;
        C89219l.m154721d(aVar3, "");
        if (!(aVar3 instanceof C51438a)) {
            aVar2 = null;
        } else {
            aVar2 = aVar3;
        }
        C51438a aVar4 = (C51438a) aVar2;
        if (aVar4 != null) {
            aVar4.f118534h = this.f118525e;
        }
        List<? extends IMUser> list = this.f118522b;
        if (list == null) {
            C89219l.m154715b();
        }
        aVar3.mo27052a(list.get(i), i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m95824a(C51437a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(7105);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 1) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_f, viewGroup, false);
            C89219l.m154716b(a, "");
            viewHolder = new C51441c(a);
        } else if (i == 2) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9f, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C51438a(aVar, a2, aVar);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9d, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C51438a(aVar, a3, aVar);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(7105);
        return viewHolder;
    }
}
