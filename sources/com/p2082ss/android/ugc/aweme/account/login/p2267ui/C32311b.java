package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.b */
public final class C32311b extends RecyclerView.AbstractC1350a<C32313a> {

    /* renamed from: a */
    public AbstractC32314b f77086a;

    /* renamed from: b */
    private List<C31966a> f77087b;

    /* renamed from: c */
    private int f77088c = R.layout.gj;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.b$b */
    public interface AbstractC32314b {
        static {
            Covode.recordClassIndex(39082);
        }

        /* renamed from: a */
        void mo58391a(C31966a aVar);
    }

    static {
        Covode.recordClassIndex(39079);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C32313a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m66692a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f77087b.size();
    }

    public C32311b(List<C31966a> list) {
        this.f77087b = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.b$a */
    public class C32313a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f77091a;

        /* renamed from: b */
        public TextView f77092b;

        /* renamed from: c */
        public TextView f77093c;

        static {
            Covode.recordClassIndex(39081);
        }

        public C32313a(View view) {
            super(view);
            this.f77091a = (TextView) view.findViewById(R.id.ex6);
            this.f77092b = (TextView) view.findViewById(R.id.ezz);
            this.f77093c = (TextView) view.findViewById(R.id.etr);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C32313a aVar, int i) {
        C32313a aVar2 = aVar;
        final C31966a aVar3 = this.f77087b.get(i);
        if (i == 0 || !TextUtils.equals(this.f77087b.get(i - 1).f76333b, aVar3.f76333b)) {
            aVar2.f77091a.setVisibility(0);
            aVar2.f77091a.setText(aVar3.f76333b);
        } else {
            aVar2.f77091a.setVisibility(8);
        }
        if (aVar3.f76333b.isEmpty()) {
            aVar2.f77091a.setVisibility(8);
        }
        if (!TextUtils.isEmpty(aVar3.f76336e)) {
            aVar2.f77092b.setText(aVar3.f76336e);
        } else {
            aVar2.f77092b.setText(aVar3.f76332a);
        }
        aVar2.f77093c.setText(aVar3.f76335d);
        aVar2.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32311b.View$OnClickListenerC323121 */

            static {
                Covode.recordClassIndex(39080);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (C32311b.this.f77086a != null) {
                    C32311b.this.f77086a.mo58391a(aVar3);
                }
            }
        });
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m66692a(C32311b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9918);
        C32313a aVar = new C32313a(LayoutInflater.from(viewGroup.getContext()).inflate(bVar.f77088c, (ViewGroup) null));
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
        MethodCollector.m26664o(9918);
        return aVar;
    }
}
