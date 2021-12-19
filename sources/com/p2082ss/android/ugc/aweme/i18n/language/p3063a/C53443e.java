package com.p2082ss.android.ugc.aweme.i18n.language.p3063a;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.e */
public final class C53443e extends RecyclerView.AbstractC1350a<C53444a> {

    /* renamed from: a */
    Context f122657a;

    /* renamed from: b */
    Dialog f122658b;

    /* renamed from: c */
    private List<AbstractC58069b> f122659c;

    static {
        Covode.recordClassIndex(63012);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C53444a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m98628a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f122659c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.i18n.language.a.e$a */
    public static class C53444a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f122660a;

        static {
            Covode.recordClassIndex(63013);
        }

        C53444a(View view) {
            super(view);
            this.f122660a = (TextView) view.findViewById(R.id.c2n);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C53444a aVar, int i) {
        C53444a aVar2 = aVar;
        AbstractC58069b bVar = this.f122659c.get(i);
        aVar2.f122660a.setText(bVar.mo90021e());
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC53445f(this, bVar));
    }

    public C53443e(Context context, List<AbstractC58069b> list, Dialog dialog) {
        this.f122657a = context;
        this.f122659c = list;
        this.f122658b = dialog;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m98628a(C53443e eVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(7005);
        C53444a aVar = new C53444a(C1764a.m5927a(LayoutInflater.from(eVar.f122657a), R.layout.md, viewGroup, false));
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
        MethodCollector.m26664o(7005);
        return aVar;
    }
}
