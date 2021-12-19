package com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3636a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.p1195a.C17151a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3634a.EnumC65758a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65796b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.c */
public final class C65791c extends AbstractC39063h {

    /* renamed from: a */
    public List<? extends IMUser> f148234a;

    /* renamed from: b */
    public List<? extends C67679e> f148235b;

    /* renamed from: c */
    public LogPbBean f148236c;

    /* renamed from: d */
    public String f148237d;

    /* renamed from: e */
    public String f148238e = "";

    /* renamed from: f */
    public final C65796b f148239f;

    static {
        Covode.recordClassIndex(77292);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.c$a */
    public final class C65792a extends C17151a<IMUser> {

        /* renamed from: a */
        public TextView f148240a;

        /* renamed from: b */
        public AvatarImageWithVerify f148241b;

        /* renamed from: c */
        public TextView f148242c;

        /* renamed from: d */
        public TextView f148243d;

        /* renamed from: e */
        public TuxIconView f148244e;

        /* renamed from: f */
        public String f148245f = "";

        /* renamed from: g */
        public final View f148246g;

        /* renamed from: h */
        public final C65791c f148247h;

        /* renamed from: i */
        final /* synthetic */ C65791c f148248i;

        /* renamed from: j */
        private final AbstractC89244h f148249j = C89250i.m154773a((AbstractC89171a) new C65795c(this));

        static {
            Covode.recordClassIndex(77293);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final void mo27050a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.c$a$c */
        static final class C65795c extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            final /* synthetic */ C65792a f148254a;

            static {
                Covode.recordClassIndex(77296);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C65795c(C65792a aVar) {
                super(0);
                this.f148254a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(C0643b.m2378c(this.f148254a.f148246g.getContext(), R.color.al));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.c$a$b */
        public static final class View$OnClickListenerC65794b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65792a f148253a;

            static {
                Covode.recordClassIndex(77295);
            }

            View$OnClickListenerC65794b(C65792a aVar) {
                this.f148253a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C89219l.m154716b(view, "");
                String string = view.getContext().getString(R.string.f23, this.f148253a.f148242c.getText());
                C89219l.m154716b(string, "");
                new C23144b(this.f148253a.f148246g).mo37635a(string).mo37634a(3000L).mo37637b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.c$a$a */
        public static final class View$OnClickListenerC65793a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65792a f148250a;

            /* renamed from: b */
            final /* synthetic */ int f148251b;

            /* renamed from: c */
            final /* synthetic */ IMUser f148252c;

            static {
                Covode.recordClassIndex(77294);
            }

            View$OnClickListenerC65793a(C65792a aVar, int i, IMUser iMUser) {
                this.f148250a = aVar;
                this.f148251b = i;
                this.f148252c = iMUser;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                int i = 0;
                if (this.f148250a.f148244e.isSelected() || !this.f148250a.f148248i.f148239f.mo104930a()) {
                    this.f148250a.f148244e.setSelected(true ^ this.f148250a.f148244e.isSelected());
                    if (this.f148250a.f148244e.isSelected()) {
                        EnumC65758a aVar = EnumC65758a.Following;
                        int i2 = this.f148251b;
                        List<? extends IMUser> list = this.f148250a.f148247h.f148234a;
                        if (list != null) {
                            i = list.size();
                        }
                        if (i2 >= i) {
                            aVar = EnumC65758a.Search;
                        }
                        this.f148250a.f148248i.f148239f.mo104928a(this.f148252c, aVar);
                        return;
                    }
                    this.f148250a.f148248i.f148239f.mo104927a(this.f148252c);
                    return;
                }
                new C23144b(this.f148250a.f148246g).mo37635a(this.f148250a.f148246g.getContext().getString(R.string.f21, String.valueOf(this.f148250a.f148248i.f148239f.mo104932b()))).mo37634a(3000L).mo37637b();
            }
        }

        /* renamed from: a */
        private static void m117714a(TextView textView, String str) {
            textView.setText(str);
        }

        /* renamed from: b */
        private static void m117715b(TextView textView, String str) {
            textView.setVisibility(0);
            textView.setText(str);
            if (TextUtils.isEmpty(textView.getText())) {
                textView.setVisibility(8);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo104922a(IMUser iMUser, int i) {
            boolean z;
            String a = C65855a.m117767a(iMUser);
            String b = C65855a.m117772b(iMUser);
            m117714a(this.f148242c, a);
            m117715b(this.f148243d, b);
            View view = this.itemView;
            C89219l.m154716b(view, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view.setBackground(C17177c.m31711c(view2.getContext()));
            User c = C65855a.m117775c(iMUser);
            this.f148241b.setUserData(new UserVerify(c.getAvatarThumb(), c.getCustomVerify(), c.getEnterpriseVerifyReason(), Integer.valueOf(c.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f148241b;
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            C65855a.m117769a(avatarImageWithVerify, view3.getContext(), c.getCustomVerify(), c.getEnterpriseVerifyReason(), this.f148242c);
            this.f148244e.setImageResource(R.drawable.bbi);
            TuxIconView tuxIconView = this.f148244e;
            if (this.f148248i.f148239f.mo104933b(iMUser) != null) {
                z = true;
            } else {
                z = false;
            }
            tuxIconView.setSelected(z);
            if (!C89219l.m154714a((Object) iMUser.isUserEnabledQAInvite(), (Object) false)) {
                FrameLayout frameLayout = (FrameLayout) this.f148246g.findViewById(R.id.f_m);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setAlpha(1.0f);
                ((FrameLayout) this.f148246g.findViewById(R.id.f_m)).setOnClickListener(new View$OnClickListenerC65793a(this, i, iMUser));
                return;
            }
            FrameLayout frameLayout2 = (FrameLayout) this.f148246g.findViewById(R.id.f_m);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setAlpha(0.34f);
            ((FrameLayout) this.f148246g.findViewById(R.id.f_m)).setOnClickListener(new View$OnClickListenerC65794b(this));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65792a(C65791c cVar, View view, C65791c cVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(cVar2, "");
            this.f148248i = cVar;
            this.f148246g = view;
            this.f148247h = cVar2;
            View findViewById = view.findViewById(R.id.dtk);
            C89219l.m154716b(findViewById, "");
            this.f148240a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.nz);
            C89219l.m154716b(findViewById2, "");
            this.f148241b = (AvatarImageWithVerify) findViewById2;
            View findViewById3 = view.findViewById(R.id.cpj);
            C89219l.m154716b(findViewById3, "");
            this.f148242c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ajd);
            C89219l.m154716b(findViewById4, "");
            this.f148243d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.a4d);
            C89219l.m154716b(findViewById5, "");
            this.f148244e = (TuxIconView) findViewById5;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60933c() {
        int i;
        List<? extends IMUser> list = this.f148234a;
        int i2 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List<? extends C67679e> list2 = this.f148235b;
        if (list2 != null) {
            i2 = list2.size();
        }
        return i + i2;
    }

    public C65791c(C65796b bVar) {
        C89219l.m154721d(bVar, "");
        this.f148239f = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar0, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65792a(this, a, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        List<? extends IMUser> list = this.f148234a;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (viewHolder instanceof C65792a) {
            C65792a aVar = (C65792a) viewHolder;
            String str = this.f148238e;
            String str2 = "";
            C89219l.m154721d(str, str2);
            aVar.f148245f = str;
            if (i < i2) {
                List<? extends IMUser> list2 = this.f148234a;
                if (list2 != null) {
                    IMUser iMUser = (IMUser) list2.get(i);
                    C89219l.m154721d(iMUser, str2);
                    if (i == 0) {
                        aVar.f148240a.setVisibility(0);
                        aVar.f148240a.setText(R.string.f2h);
                    } else {
                        aVar.f148240a.setVisibility(8);
                    }
                    aVar.mo104922a(iMUser, i);
                    return;
                }
                return;
            }
            List<? extends C67679e> list3 = this.f148235b;
            if (list3 != null) {
                C67679e eVar = (C67679e) list3.get(i - i2);
                C89219l.m154721d(eVar, str2);
                C67684i iVar = eVar.f151672g;
                C89219l.m154716b(iVar, str2);
                int mentionBlockType = (int) iVar.getMentionBlockType();
                IMUser iMUser2 = new IMUser();
                iMUser2.setUid(iVar.getUserId());
                iMUser2.setSecUid(iVar.getSecUserId());
                iMUser2.setNickName(iVar.getUserNickname());
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(iVar.getUserAvatarUri());
                boolean z = true;
                urlModel.setUrlList(C89070n.m154522b(iVar.getUserAvatarUri(), iVar.getUserAvatarUri()));
                iMUser2.setAvatarThumb(urlModel);
                iMUser2.setUniqueId(iVar.getUsername());
                iMUser2.setSearchType(1);
                if (iVar.isVerifiedUser()) {
                    str2 = "verified";
                }
                iMUser2.setCustomVerify(str2);
                if (mentionBlockType != 0) {
                    z = false;
                }
                iMUser2.setUserEnabledQAInvite(Boolean.valueOf(z));
                List<? extends IMUser> list4 = aVar.f148247h.f148234a;
                if (list4 != null) {
                    i3 = list4.size();
                } else {
                    i3 = 0;
                }
                if (i == i3) {
                    aVar.f148240a.setVisibility(0);
                    aVar.f148240a.setText(R.string.f2a);
                } else {
                    aVar.f148240a.setVisibility(8);
                }
                aVar.mo104922a(iMUser2, i);
            }
        }
    }
}
