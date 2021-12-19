package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.NiceWidthTextView;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.MultiAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.k */
public final class C36985k extends RecyclerView.AbstractC1350a<C36986a> {

    /* renamed from: a */
    public C36960g f87098a;

    /* renamed from: b */
    public AbstractC89172b<? super C36954a, C89391z> f87099b;

    /* renamed from: c */
    private List<C36954a> f87100c = C89086z.INSTANCE;

    /* renamed from: d */
    private final int f87101d = 4;

    static {
        Covode.recordClassIndex(44333);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return i == 0 ? 1 : 0;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C36986a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m74639a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (this.f87098a == null) {
            return this.f87100c.size();
        }
        return this.f87100c.size() + 1;
    }

    /* renamed from: a */
    public final void mo64483a(List<C36954a> list) {
        C89219l.m154721d(list, "");
        this.f87100c = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.k$b */
    static final class View$OnClickListenerC36987b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36985k f87114a;

        /* renamed from: b */
        final /* synthetic */ C36954a f87115b;

        static {
            Covode.recordClassIndex(44335);
        }

        View$OnClickListenerC36987b(C36985k kVar, C36954a aVar) {
            this.f87114a = kVar;
            this.f87115b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C36954a aVar = this.f87115b;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo64442a("gift");
            AbstractC89172b<? super C36954a, C89391z> bVar = this.f87114a.f87099b;
            if (bVar != null) {
                bVar.invoke(this.f87115b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.k$c */
    static final class View$OnClickListenerC36988c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36985k f87116a;

        /* renamed from: b */
        final /* synthetic */ C36954a f87117b;

        static {
            Covode.recordClassIndex(44336);
        }

        View$OnClickListenerC36988c(C36985k kVar, C36954a aVar) {
            this.f87116a = kVar;
            this.f87117b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C36954a aVar = this.f87117b;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo64442a("gift");
            AbstractC89172b<? super C36954a, C89391z> bVar = this.f87116a.f87099b;
            if (bVar != null) {
                bVar.invoke(this.f87117b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.k$d */
    static final class View$OnClickListenerC36989d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36985k f87118a;

        /* renamed from: b */
        final /* synthetic */ C36954a f87119b;

        static {
            Covode.recordClassIndex(44337);
        }

        View$OnClickListenerC36989d(C36985k kVar, C36954a aVar) {
            this.f87118a = kVar;
            this.f87119b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C36954a aVar = this.f87119b;
            if (aVar == null) {
                C89219l.m154715b();
            }
            aVar.mo64442a("avatar");
            AbstractC89172b<? super C36954a, C89391z> bVar = this.f87118a.f87099b;
            if (bVar != null) {
                bVar.invoke(this.f87119b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.k$a */
    public final class C36986a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final SmartAvatarImageView f87102a;

        /* renamed from: b */
        public final MultiAvatarView f87103b;

        /* renamed from: c */
        public final NiceWidthTextView f87104c;

        /* renamed from: d */
        public final TuxTextView f87105d;

        /* renamed from: e */
        public final ConstraintLayout f87106e;

        /* renamed from: f */
        public final AvatarImageView f87107f;

        /* renamed from: g */
        public final AvatarImageView f87108g;

        /* renamed from: h */
        public final AvatarImageView f87109h;

        /* renamed from: i */
        public final SmartAvatarImageView f87110i;

        /* renamed from: j */
        public final TuxTextView f87111j;

        /* renamed from: k */
        public final TuxTextView f87112k;

        /* renamed from: l */
        final /* synthetic */ C36985k f87113l;

        static {
            Covode.recordClassIndex(44334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36986a(C36985k kVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f87113l = kVar;
            this.f87102a = (SmartAvatarImageView) view.findViewById(R.id.d5e);
            this.f87103b = (MultiAvatarView) view.findViewById(R.id.d5d);
            this.f87104c = (NiceWidthTextView) view.findViewById(R.id.d5f);
            this.f87105d = (TuxTextView) view.findViewById(R.id.d5g);
            this.f87106e = (ConstraintLayout) view.findViewById(R.id.ebv);
            this.f87107f = (AvatarImageView) view.findViewById(R.id.ebs);
            this.f87108g = (AvatarImageView) view.findViewById(R.id.ebt);
            this.f87109h = (AvatarImageView) view.findViewById(R.id.ebu);
            this.f87110i = (SmartAvatarImageView) view.findViewById(R.id.ba_);
            this.f87111j = (TuxTextView) view.findViewById(R.id.fai);
            this.f87112k = (TuxTextView) view.findViewById(R.id.dvr);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0214, code lost:
        if (r0 == null) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x027e, code lost:
        if (r9 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r0 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0102, code lost:
        if (r0 == null) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0170  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.p2082ss.android.ugc.aweme.comment.supporterpanel.C36985k.C36986a r13, int r14) {
        /*
        // Method dump skipped, instructions count: 664
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.supporterpanel.C36985k.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m74639a(C36985k kVar, ViewGroup viewGroup, int i) {
        View view;
        MethodCollector.m26663i(9563);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i != 1 || kVar.f87098a == null) {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.jm, viewGroup, false);
        } else {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.jn, viewGroup, false);
        }
        C89219l.m154716b(view, "");
        C36986a aVar = new C36986a(kVar, view);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.m26664o(9563);
        return aVar;
    }
}
