package com.p2082ss.android.ugc.aweme.geofencing.p3045a;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.a.a */
public final class C52870a extends RecyclerView.AbstractC1350a<C52871a> {

    /* renamed from: a */
    public List<C52891a> f121625a;

    /* renamed from: b */
    final Context f121626b;

    /* renamed from: c */
    private final boolean f121627c;

    static {
        Covode.recordClassIndex(62274);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C52871a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m97725a(viewGroup, i);
    }

    /* renamed from: a */
    public final List<C52891a> mo88539a() {
        return C89070n.m154590j(this.f121625a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f121625a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.a$a */
    public static final class C52871a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f121628a;

        /* renamed from: b */
        public final ImageView f121629b;

        static {
            Covode.recordClassIndex(62275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52871a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.b_4);
            C89219l.m154716b(findViewById, "");
            this.f121628a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.b_0);
            C89219l.m154716b(findViewById2, "");
            this.f121629b = (ImageView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.a$d */
    static final class View$OnClickListenerC52874d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52870a f121633a;

        /* renamed from: b */
        final /* synthetic */ C52891a f121634b;

        static {
            Covode.recordClassIndex(62278);
        }

        View$OnClickListenerC52874d(C52870a aVar, C52891a aVar2) {
            this.f121633a = aVar;
            this.f121634b = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C52870a aVar = this.f121633a;
            C52891a aVar2 = this.f121634b;
            C17197a.C17200a aVar3 = new C17197a.C17200a(aVar.f121626b);
            aVar3.f41071b = aVar.f121626b.getString(R.string.ga6, aVar2.getTranslation());
            aVar3.mo27190a(R.string.ga7, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC52872b(aVar, aVar2), false).mo27195b(R.string.ga5, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC52873c.f121632a, false).mo27193a().mo27185c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.a$c */
    static final class DialogInterface$OnClickListenerC52873c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC52873c f121632a = new DialogInterface$OnClickListenerC52873c();

        static {
            Covode.recordClassIndex(62277);
        }

        DialogInterface$OnClickListenerC52873c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.a$b */
    static final class DialogInterface$OnClickListenerC52872b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52870a f121630a;

        /* renamed from: b */
        final /* synthetic */ C52891a f121631b;

        static {
            Covode.recordClassIndex(62276);
        }

        DialogInterface$OnClickListenerC52872b(C52870a aVar, C52891a aVar2) {
            this.f121630a = aVar;
            this.f121631b = aVar2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f121630a.f121625a.remove(this.f121631b);
            this.f121630a.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C52871a aVar, int i) {
        C52871a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C52891a aVar3 = this.f121625a.get(i);
        aVar2.f121628a.setText(aVar3.getTranslation());
        if (this.f121627c) {
            aVar2.f121629b.setVisibility(8);
        } else {
            aVar2.f121629b.setOnClickListener(new View$OnClickListenerC52874d(this, aVar3));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m97725a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10132);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_c, viewGroup, false);
        C89219l.m154716b(a2, "");
        C52871a aVar = new C52871a(a2);
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
        MethodCollector.m26664o(10132);
        return aVar;
    }

    public C52870a(Context context, boolean z, List<C52891a> list) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        this.f121626b = context;
        this.f121627c = z;
        this.f121625a = C89070n.m154585g((Collection) list);
    }
}
