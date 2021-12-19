package com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar;

import android.content.Context;
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
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69576b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.d */
public final class C69676d extends RecyclerView.AbstractC1350a<C69677a> {

    /* renamed from: a */
    public List<? extends AbstractC69581b> f155535a;

    /* renamed from: b */
    public final AbstractC69681f f155536b;

    /* renamed from: c */
    private final Context f155537c;

    /* renamed from: d */
    private final boolean f155538d;

    /* renamed from: e */
    private final boolean f155539e;

    /* renamed from: f */
    private final int f155540f;

    static {
        Covode.recordClassIndex(82052);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C69677a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m123071a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f155535a.size();
    }

    /* renamed from: a */
    public final void mo109821a(List<? extends AbstractC69581b> list) {
        C89219l.m154721d(list, "");
        this.f155535a = list;
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.d$b */
    static final class View$OnClickListenerC69678b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C69676d f155543a;

        /* renamed from: b */
        final /* synthetic */ int f155544b;

        static {
            Covode.recordClassIndex(82054);
        }

        View$OnClickListenerC69678b(C69676d dVar, int i) {
            this.f155543a = dVar;
            this.f155544b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C69576b.m122788a(view, 1200)) {
                this.f155543a.f155536b.mo87413a_((AbstractC69581b) this.f155543a.f155535a.get(this.f155544b));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.d$a */
    public static final class C69677a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RemoteImageView f155541a;

        /* renamed from: b */
        public final TextView f155542b;

        static {
            Covode.recordClassIndex(82053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69677a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.dxh);
            C89219l.m154716b(findViewById, "");
            this.f155541a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.dxi);
            C89219l.m154716b(findViewById2, "");
            this.f155542b = (TextView) findViewById2;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d6, code lost:
        if (r15 == (r13.f155535a.size() - 1)) goto L_0x00b2;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.C69676d.C69677a r14, int r15) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.C69676d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m123071a(C69676d dVar, ViewGroup viewGroup, int i) {
        int color;
        MethodCollector.m26663i(4612);
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ah8, viewGroup, false);
        C89219l.m154716b(a, "");
        C69677a aVar = new C69677a(a);
        if (dVar.f155539e) {
            aVar.f155542b.setVisibility(8);
        } else {
            a.getLayoutParams().width = dVar.f155537c.getResources().getDimensionPixelOffset(R.dimen.s_);
        }
        if (dVar.f155538d) {
            int dimensionPixelOffset = dVar.f155537c.getResources().getDimensionPixelOffset(R.dimen.s9);
            aVar.f155541a.getLayoutParams().height = dimensionPixelOffset;
            aVar.f155541a.getLayoutParams().width = dimensionPixelOffset;
        }
        TextView textView = aVar.f155542b;
        Integer valueOf = Integer.valueOf(dVar.f155540f);
        boolean z = true;
        if (valueOf.intValue() == 0 || valueOf == null) {
            color = viewGroup.getResources().getColor(R.color.a3);
        } else {
            color = valueOf.intValue();
        }
        textView.setTextColor(color);
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
        MethodCollector.m26664o(4612);
        return aVar;
    }

    public /* synthetic */ C69676d(Context context, AbstractC69681f fVar, boolean z, boolean z2) {
        this(context, fVar, z, z2, 0);
    }

    public C69676d(Context context, AbstractC69681f fVar, boolean z, boolean z2, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(fVar, "");
        this.f155537c = context;
        this.f155536b = fVar;
        this.f155538d = z;
        this.f155539e = z2;
        this.f155540f = i;
        this.f155535a = C89086z.INSTANCE;
    }
}
