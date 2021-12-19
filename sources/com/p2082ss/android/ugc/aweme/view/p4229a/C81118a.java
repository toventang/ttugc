package com.p2082ss.android.ugc.aweme.view.p4229a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.common.C39082ag;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.model.C60143e;
import com.p2082ss.android.ugc.aweme.model.C60145g;
import com.p2082ss.android.ugc.aweme.model.C60147i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.a.a */
public final class C81118a extends RecyclerView.AbstractC1350a<C81119a> {

    /* renamed from: a */
    public final C60145g f181277a;

    /* renamed from: b */
    public final AbstractC81121b f181278b;

    static {
        Covode.recordClassIndex(94446);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C81119a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m140880a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f181277a.f137090a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.a$a */
    public static final class C81119a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final SmartRoundImageView f181279a;

        /* renamed from: b */
        final RoundedFrameLayout f181280b;

        /* renamed from: c */
        final View f181281c;

        /* renamed from: d */
        final float f181282d;

        static {
            Covode.recordClassIndex(94447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81119a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f181279a = (SmartRoundImageView) view.findViewById(R.id.d7y);
            this.f181280b = (RoundedFrameLayout) view.findViewById(R.id.d80);
            this.f181281c = view.findViewById(R.id.d7z);
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            this.f181282d = C39082ag.C39083a.m79347a(context, 22.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.a$b */
    static final class View$OnClickListenerC81120b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81118a f181283a;

        /* renamed from: b */
        final /* synthetic */ int f181284b;

        static {
            Covode.recordClassIndex(94448);
        }

        View$OnClickListenerC81120b(C81118a aVar, int i) {
            this.f181283a = aVar;
            this.f181284b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f181283a.notifyDataSetChanged();
            AbstractC81121b bVar = this.f181283a.f181278b;
            C60143e eVar = this.f181283a.f181277a.f137090a.get(this.f181284b);
            C89219l.m154716b(eVar, "");
            bVar.mo124587a(eVar);
        }
    }

    public C81118a(C60145g gVar, AbstractC81121b bVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        this.f181277a = gVar;
        this.f181278b = bVar;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m140880a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(145);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoo, viewGroup, false);
        C89219l.m154716b(a2, "");
        C81119a aVar = new C81119a(a2);
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
        MethodCollector.m26664o(145);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C81119a aVar, int i) {
        C81119a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C60143e eVar = this.f181277a.f137090a.get(i);
        C89219l.m154716b(eVar, "");
        C60143e eVar2 = eVar;
        boolean a = C89219l.m154714a(eVar2, this.f181277a.f137091b);
        C89219l.m154721d(eVar2, "");
        RoundedFrameLayout roundedFrameLayout = aVar2.f181280b;
        C89219l.m154716b(roundedFrameLayout, "");
        roundedFrameLayout.setRotation(0.0f);
        RoundedFrameLayout roundedFrameLayout2 = aVar2.f181280b;
        C89219l.m154716b(roundedFrameLayout2, "");
        roundedFrameLayout2.setVisibility(0);
        SmartRoundImageView smartRoundImageView = aVar2.f181279a;
        C89219l.m154716b(smartRoundImageView, "");
        smartRoundImageView.setVisibility(8);
        View view = aVar2.f181281c;
        C89219l.m154716b(view, "");
        view.setVisibility(8);
        if (a) {
            View view2 = aVar2.f181281c;
            C89219l.m154716b(view2, "");
            view2.setVisibility(0);
        }
        aVar2.f181280b.setRadius((int) aVar2.f181282d);
        C20745e.C20746a aVar3 = new C20745e.C20746a();
        aVar3.f48957a = true;
        aVar3.f48961e = aVar2.f181282d;
        C20745e a2 = aVar3.mo34169a();
        aVar2.f181279a.setCircleOptions(a2);
        if (eVar2 instanceof C60147i) {
            C60147i iVar = (C60147i) eVar2;
            GradientDrawable gradientDrawable = new GradientDrawable();
            int[] iArr = new int[iVar.f137096e.size()];
            int size = iVar.f137096e.size();
            for (int i2 = 0; i2 < size; i2++) {
                C60143e eVar3 = iVar.f137096e.get(i2);
                C89219l.m154716b(eVar3, "");
                C60143e eVar4 = eVar3;
                if (eVar4.f137085a != null) {
                    iArr[i2] = Color.parseColor(eVar4.f137085a);
                }
            }
            gradientDrawable.setColors(iArr);
            RoundedFrameLayout roundedFrameLayout3 = aVar2.f181280b;
            C89219l.m154716b(roundedFrameLayout3, "");
            roundedFrameLayout3.setBackground(gradientDrawable);
            RoundedFrameLayout roundedFrameLayout4 = aVar2.f181280b;
            C89219l.m154716b(roundedFrameLayout4, "");
            roundedFrameLayout4.setRotation((float) iVar.f137095d);
        } else if (eVar2.f137086b != null) {
            SmartRoundImageView smartRoundImageView2 = aVar2.f181279a;
            C89219l.m154716b(smartRoundImageView2, "");
            smartRoundImageView2.setVisibility(0);
            RoundedFrameLayout roundedFrameLayout5 = aVar2.f181280b;
            C89219l.m154716b(roundedFrameLayout5, "");
            roundedFrameLayout5.setVisibility(8);
            C20766v a3 = C20761r.m39057a(Uri.parse(eVar2.f137086b));
            SmartRoundImageView smartRoundImageView3 = aVar2.f181279a;
            C89219l.m154716b(smartRoundImageView3, "");
            a3.f49105b = smartRoundImageView3.getContext();
            a3.f49092E = aVar2.f181279a;
            a3.f49126w = a2;
            a3.mo34186c();
        } else if (eVar2.f137085a != null) {
            SmartRoundImageView smartRoundImageView4 = aVar2.f181279a;
            C89219l.m154716b(smartRoundImageView4, "");
            smartRoundImageView4.setVisibility(8);
            RoundedFrameLayout roundedFrameLayout6 = aVar2.f181280b;
            C89219l.m154716b(roundedFrameLayout6, "");
            roundedFrameLayout6.setVisibility(0);
            aVar2.f181280b.setBackgroundColor(Color.parseColor(eVar2.f137085a));
        }
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC81120b(this, i));
    }
}
