package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3336d.p3337a.C57403a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.c */
public final class C57392c extends RecyclerView.AbstractC1350a<C57393a> {

    /* renamed from: a */
    public final List<C57403a> f130837a = new ArrayList();

    /* renamed from: b */
    public final Context f130838b;

    static {
        Covode.recordClassIndex(67312);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C57393a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m104016a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f130837a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.c$b */
    static final class View$OnClickListenerC57394b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57403a f130841a;

        static {
            Covode.recordClassIndex(67314);
        }

        View$OnClickListenerC57394b(C57403a aVar) {
            this.f130841a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super View, C89391z> bVar = this.f130841a.f130850a;
            if (bVar != null) {
                C89219l.m154716b(view, "");
                bVar.invoke(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.c$c */
    static final class View$OnClickListenerC57395c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57403a f130842a;

        static {
            Covode.recordClassIndex(67315);
        }

        View$OnClickListenerC57395c(C57403a aVar) {
            this.f130842a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super View, C89391z> bVar = this.f130842a.f130850a;
            if (bVar != null) {
                C89219l.m154716b(view, "");
                bVar.invoke(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.c$d */
    static final class View$OnClickListenerC57396d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57403a f130843a;

        static {
            Covode.recordClassIndex(67316);
        }

        View$OnClickListenerC57396d(C57403a aVar) {
            this.f130843a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super View, C89391z> bVar = this.f130843a.f130850a;
            if (bVar != null) {
                C89219l.m154716b(view, "");
                bVar.invoke(view);
            }
        }
    }

    public C57392c(Context context) {
        C89219l.m154721d(context, "");
        this.f130838b = context;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.c$a */
    public static final class C57393a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f130839a;

        /* renamed from: b */
        public final TextView f130840b;

        static {
            Covode.recordClassIndex(67313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57393a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.clw);
            C89219l.m154716b(findViewById, "");
            this.f130839a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.clx);
            C89219l.m154716b(findViewById2, "");
            this.f130840b = (TextView) findViewById2;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C57393a aVar, int i) {
        C57393a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C57403a aVar3 = this.f130837a.get(i);
        aVar2.f130839a.setImageDrawable(C0643b.m2369a(this.f130838b, aVar3.f130851b));
        aVar2.f130840b.setText(this.f130838b.getString(aVar3.f130852c));
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC57394b(aVar3));
        aVar2.f130839a.setOnClickListener(new View$OnClickListenerC57395c(aVar3));
        aVar2.f130840b.setOnClickListener(new View$OnClickListenerC57396d(aVar3));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m104016a(C57392c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(7572);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(cVar.f130838b), R.layout.acz, viewGroup, false);
        C89219l.m154716b(a2, "");
        C57393a aVar = new C57393a(a2);
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
        MethodCollector.m26664o(7572);
        return aVar;
    }
}
