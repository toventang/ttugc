package com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3636a;

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
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.p1195a.C17151a;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3634a.EnumC65758a;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65796b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.a */
public final class C65783a extends RecyclerView.AbstractC1350a<C17151a<IMUser>> {

    /* renamed from: a */
    public C65796b.C65797a.C65798a f148210a;

    /* renamed from: b */
    public final C65796b f148211b;

    /* renamed from: c */
    public List<? extends IMUser> f148212c;

    static {
        Covode.recordClassIndex(77284);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C17151a<IMUser> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m117705a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f148212c.size();
    }

    public /* synthetic */ C65783a(C65796b bVar) {
        this(bVar, C89086z.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.a$a */
    public final class C65784a extends C17151a<IMUser> {

        /* renamed from: a */
        public TextView f148213a;

        /* renamed from: b */
        public AvatarImageWithVerify f148214b;

        /* renamed from: c */
        public TextView f148215c;

        /* renamed from: d */
        public TextView f148216d;

        /* renamed from: e */
        public TuxIconView f148217e;

        /* renamed from: f */
        public final View f148218f;

        /* renamed from: g */
        public final C65783a f148219g;

        /* renamed from: h */
        final /* synthetic */ C65783a f148220h;

        static {
            Covode.recordClassIndex(77285);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final void mo27050a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.a$a$b */
        static final class View$OnClickListenerC65786b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65784a f148225a;

            static {
                Covode.recordClassIndex(77287);
            }

            View$OnClickListenerC65786b(C65784a aVar) {
                this.f148225a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C89219l.m154716b(view, "");
                String string = view.getContext().getString(R.string.f23, this.f148225a.f148215c.getText());
                C89219l.m154716b(string, "");
                new C23144b(this.f148225a.f148218f).mo37635a(string).mo37634a(3000L).mo37637b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.a$a$a */
        static final class View$OnClickListenerC65785a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65784a f148221a;

            /* renamed from: b */
            final /* synthetic */ IMUser f148222b;

            /* renamed from: c */
            final /* synthetic */ C89233z.C89238e f148223c;

            /* renamed from: d */
            final /* synthetic */ int f148224d;

            static {
                Covode.recordClassIndex(77286);
            }

            View$OnClickListenerC65785a(C65784a aVar, IMUser iMUser, C89233z.C89238e eVar, int i) {
                this.f148221a = aVar;
                this.f148222b = iMUser;
                this.f148223c = eVar;
                this.f148224d = i;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f148221a.f148217e.isSelected() || !this.f148221a.f148220h.f148211b.mo104930a()) {
                    this.f148221a.f148217e.setSelected(true ^ this.f148221a.f148217e.isSelected());
                    if (this.f148221a.f148217e.isSelected()) {
                        this.f148221a.f148220h.f148211b.mo104928a(this.f148222b, this.f148223c.element);
                    } else {
                        this.f148221a.f148220h.f148211b.mo104927a(this.f148222b);
                    }
                } else {
                    new C23144b(this.f148221a.f148218f).mo37635a(this.f148221a.f148218f.getContext().getString(R.string.f21, String.valueOf(this.f148221a.f148220h.f148211b.mo104932b()))).mo37634a(3000L).mo37637b();
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final /* synthetic */ void mo27052a(IMUser iMUser, int i) {
            IMUser iMUser2 = iMUser;
            C89219l.m154721d(iMUser2, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view.setBackground(C17177c.m31711c(view2.getContext()));
            boolean z = false;
            this.f148213a.setVisibility(0);
            C65855a.m117770a(iMUser2, this.f148215c, this.f148216d);
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) EnumC65758a.Recent;
            C65796b.C65797a.C65798a aVar = this.f148219g.f148210a;
            if (aVar != null) {
                int size = aVar.f148270a.size() + aVar.f148271b.size() + aVar.f148272c.size();
                int size2 = aVar.f148270a.size();
                int size3 = aVar.f148270a.size() + aVar.f148271b.size();
                if (i >= size2 && (!aVar.f148271b.isEmpty()) && i < size3) {
                    eVar.element = (T) EnumC65758a.Recent;
                } else if (i >= size3 && (!aVar.f148272c.isEmpty()) && i < size) {
                    eVar.element = (T) EnumC65758a.Friends;
                } else if (i >= size && (!aVar.f148273d.isEmpty())) {
                    eVar.element = (T) EnumC65758a.Following;
                }
                if (i != 0 || !(!aVar.f148270a.isEmpty())) {
                    if (i == size2 && (!aVar.f148271b.isEmpty())) {
                        this.f148213a.setText(R.string.cgc);
                    } else if (i == size3 && (!aVar.f148272c.isEmpty())) {
                        this.f148213a.setText(R.string.c15);
                        eVar.element = (T) EnumC65758a.Friends;
                    } else if (i == size && (!aVar.f148273d.isEmpty())) {
                        TextView textView = this.f148213a;
                        View view3 = this.itemView;
                        C89219l.m154716b(view3, "");
                        textView.setText(view3.getContext().getString(R.string.f2h));
                        eVar.element = (T) EnumC65758a.Following;
                    }
                }
                this.f148213a.setVisibility(8);
            }
            if (!C89219l.m154714a((Object) iMUser2.isUserEnabledQAInvite(), (Object) false)) {
                FrameLayout frameLayout = (FrameLayout) this.f148218f.findViewById(R.id.f_m);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setAlpha(1.0f);
                ((FrameLayout) this.f148218f.findViewById(R.id.f_m)).setOnClickListener(new View$OnClickListenerC65785a(this, iMUser2, eVar, i));
            } else {
                FrameLayout frameLayout2 = (FrameLayout) this.f148218f.findViewById(R.id.f_m);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setAlpha(0.34f);
                ((FrameLayout) this.f148218f.findViewById(R.id.f_m)).setOnClickListener(new View$OnClickListenerC65786b(this));
            }
            User c = C65855a.m117775c(iMUser2);
            this.f148214b.setUserData(new UserVerify(c.getAvatarThumb(), c.getCustomVerify(), c.getEnterpriseVerifyReason(), Integer.valueOf(c.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f148214b;
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            C65855a.m117769a(avatarImageWithVerify, view4.getContext(), iMUser2.getCustomVerify(), iMUser2.getEnterpriseVerifyReason(), this.f148215c);
            this.f148217e.setImageResource(R.drawable.bbi);
            TuxIconView tuxIconView = this.f148217e;
            if (this.f148220h.f148211b.mo104933b(iMUser2) != null) {
                z = true;
            }
            tuxIconView.setSelected(z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65784a(C65783a aVar, View view, C65783a aVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(aVar2, "");
            this.f148220h = aVar;
            this.f148218f = view;
            this.f148219g = aVar2;
            View findViewById = view.findViewById(R.id.dtk);
            C89219l.m154716b(findViewById, "");
            this.f148213a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.nz);
            C89219l.m154716b(findViewById2, "");
            this.f148214b = (AvatarImageWithVerify) findViewById2;
            View findViewById3 = view.findViewById(R.id.cpj);
            C89219l.m154716b(findViewById3, "");
            this.f148215c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ajd);
            C89219l.m154716b(findViewById4, "");
            this.f148216d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.a4d);
            C89219l.m154716b(findViewById5, "");
            this.f148217e = (TuxIconView) findViewById5;
        }
    }

    private C65783a(C65796b bVar, List<? extends IMUser> list) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(list, "");
        this.f148211b = bVar;
        this.f148212c = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C17151a<IMUser> aVar, int i) {
        C17151a<IMUser> aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        aVar2.mo27052a(this.f148212c.get(i), i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m117705a(C65783a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6899);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar0, viewGroup, false);
        C89219l.m154716b(a2, "");
        C65784a aVar2 = new C65784a(aVar, a2, aVar);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(6899);
        return aVar2;
    }
}
