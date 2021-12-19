package com.p2082ss.android.ugc.aweme.qainvitation.p3638c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.p1195a.C17151a;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.c.b */
public final class C65823b extends RecyclerView.AbstractC1350a<C17151a<IMUser>> {

    /* renamed from: a */
    public List<? extends IMUser> f148320a;

    static {
        Covode.recordClassIndex(77324);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C17151a<IMUser> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m117750a(this, viewGroup, i);
    }

    private /* synthetic */ C65823b() {
        this(C89086z.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f148320a.size();
    }

    public C65823b(List<? extends IMUser> list) {
        C89219l.m154721d(list, "");
        this.f148320a = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.c.b$a */
    public final class C65824a extends C17151a<IMUser> {

        /* renamed from: a */
        public AvatarImageWithVerify f148321a;

        /* renamed from: b */
        public TextView f148322b;

        /* renamed from: c */
        public TextView f148323c;

        /* renamed from: d */
        public TextView f148324d;

        /* renamed from: e */
        public final View f148325e;

        /* renamed from: f */
        public final C65823b f148326f;

        /* renamed from: g */
        final /* synthetic */ C65823b f148327g;

        static {
            Covode.recordClassIndex(77325);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final void mo27050a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.c.b$a$a */
        static final class View$OnClickListenerC65825a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65824a f148328a;

            /* renamed from: b */
            final /* synthetic */ IMUser f148329b;

            static {
                Covode.recordClassIndex(77326);
            }

            View$OnClickListenerC65825a(C65824a aVar, IMUser iMUser) {
                this.f148328a = aVar;
                this.f148329b = iMUser;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View view2 = this.f148328a.itemView;
                C89219l.m154716b(view2, "");
                SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + this.f148329b.getUid()).withParam("sec_uid", this.f148329b.getSecUid()).open();
                C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "qa_personal_profile").f79943a);
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
            User c = C65855a.m117775c(iMUser2);
            this.f148321a.setUserData(new UserVerify(c.getAvatarThumb(), c.getCustomVerify(), c.getEnterpriseVerifyReason(), Integer.valueOf(c.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f148321a;
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            C65855a.m117769a(avatarImageWithVerify, view3.getContext(), iMUser2.getCustomVerify(), iMUser2.getEnterpriseVerifyReason(), this.f148322b);
            C65855a.m117770a(iMUser2, this.f148322b, this.f148323c);
            if (iMUser2.getFollowStatus() == 2) {
                this.f148324d.setVisibility(0);
                StringBuilder sb = new StringBuilder(" · ");
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                this.f148324d.setText(sb.append(view4.getContext().getString(R.string.e1z)).toString());
            } else {
                this.f148324d.setVisibility(4);
            }
            this.f148325e.setOnClickListener(new View$OnClickListenerC65825a(this, iMUser2));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65824a(C65823b bVar, View view, C65823b bVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(bVar2, "");
            this.f148327g = bVar;
            this.f148325e = view;
            this.f148326f = bVar2;
            View findViewById = view.findViewById(R.id.nz);
            C89219l.m154716b(findViewById, "");
            this.f148321a = (AvatarImageWithVerify) findViewById;
            View findViewById2 = view.findViewById(R.id.cpj);
            C89219l.m154716b(findViewById2, "");
            this.f148322b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ajd);
            C89219l.m154716b(findViewById3, "");
            this.f148323c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.f_8);
            C89219l.m154716b(findViewById4, "");
            this.f148324d = (TextView) findViewById4;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C17151a<IMUser> aVar, int i) {
        C17151a<IMUser> aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        aVar2.mo27052a(this.f148320a.get(i), i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m117750a(C65823b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6780);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aqv, viewGroup, false);
        C89219l.m154716b(a2, "");
        C65824a aVar = new C65824a(bVar, a2, bVar);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(6780);
        return aVar;
    }
}
