package com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3636a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.p1195a.C17151a;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.qainvitation.p3635b.C65796b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.b */
public final class C65787b extends RecyclerView.AbstractC1350a<C17151a<IMUser>> {

    /* renamed from: a */
    public final C65796b f148226a;

    /* renamed from: b */
    public List<? extends IMUser> f148227b;

    static {
        Covode.recordClassIndex(77288);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C17151a<IMUser> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m117708a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f148227b.size();
    }

    public /* synthetic */ C65787b(C65796b bVar) {
        this(bVar, C89086z.INSTANCE);
    }

    /* renamed from: a */
    public final void mo104920a(List<? extends IMUser> list) {
        C89219l.m154721d(list, "");
        this.f148227b = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.b$a */
    public final class C65788a extends C17151a<IMUser> {

        /* renamed from: a */
        public final View f148228a;

        /* renamed from: b */
        public final AbstractC89172b<IMUser, C89391z> f148229b;

        /* renamed from: c */
        final /* synthetic */ C65787b f148230c;

        static {
            Covode.recordClassIndex(77289);
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.b$a$a */
        static final class View$OnClickListenerC65789a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65788a f148231a;

            /* renamed from: b */
            final /* synthetic */ IMUser f148232b;

            static {
                Covode.recordClassIndex(77290);
            }

            View$OnClickListenerC65789a(C65788a aVar, IMUser iMUser) {
                this.f148231a = aVar;
                this.f148232b = iMUser;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f148231a.f148229b.invoke(this.f148232b);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final /* synthetic */ void mo27051a(IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            if (iMUser2 != null) {
                View view = this.itemView;
                C89219l.m154716b(view, "");
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.cpq);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(C65855a.m117767a(iMUser2));
                this.itemView.setOnClickListener(new View$OnClickListenerC65789a(this, iMUser2));
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                C34577e.m70592a((RemoteImageView) view2.findViewById(R.id.ob), iMUser2.getDisplayAvatar());
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.IMUser, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65788a(C65787b bVar, View view, AbstractC89172b<? super IMUser, C89391z> bVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(bVar2, "");
            this.f148230c = bVar;
            this.f148228a = view;
            this.f148229b = bVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.b$b */
    public static final class C65790b extends AbstractC89220m implements AbstractC89172b<IMUser, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65787b f148233a;

        static {
            Covode.recordClassIndex(77291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65790b(C65787b bVar) {
            super(1);
            this.f148233a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            C89219l.m154721d(iMUser2, "");
            this.f148233a.f148226a.f148265j.f148275f.indexOf(iMUser2);
            this.f148233a.f148226a.mo104927a(iMUser2);
            return C89391z.f203057a;
        }
    }

    private C65787b(C65796b bVar, List<? extends IMUser> list) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(list, "");
        this.f148226a = bVar;
        this.f148227b = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C17151a<IMUser> aVar, int i) {
        C17151a<IMUser> aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        aVar2.mo27051a(this.f148227b.get(i));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m117708a(C65787b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6940);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aqz, viewGroup, false);
        C89219l.m154716b(a2, "");
        C65788a aVar = new C65788a(bVar, a2, new C65790b(bVar));
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
        MethodCollector.m26664o(6940);
        return aVar;
    }
}
