package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.g */
public final class C32319g extends RecyclerView.AbstractC1350a<C32320a> {

    /* renamed from: a */
    public AbstractC32321b f77100a;

    /* renamed from: b */
    private List<C31966a> f77101b;

    /* renamed from: c */
    private int f77102c = R.layout.gj;

    /* renamed from: d */
    private Context f77103d;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.g$b */
    public interface AbstractC32321b {
        static {
            Covode.recordClassIndex(39089);
        }

        /* renamed from: a */
        void mo58394a(C31966a aVar);
    }

    static {
        Covode.recordClassIndex(39087);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C32320a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m66696a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f77101b.size();
    }

    public C32319g(List<C31966a> list) {
        this.f77101b = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.g$a */
    public class C32320a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f77104a;

        /* renamed from: b */
        public TextView f77105b;

        /* renamed from: c */
        public TextView f77106c;

        static {
            Covode.recordClassIndex(39088);
        }

        C32320a(View view) {
            super(view);
            this.f77104a = (TextView) view.findViewById(R.id.ex6);
            this.f77105b = (TextView) view.findViewById(R.id.ezz);
            this.f77106c = (TextView) view.findViewById(R.id.etr);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C32320a aVar, int i) {
        C32320a aVar2 = aVar;
        C31966a aVar3 = this.f77101b.get(i);
        if (i == 0 || !TextUtils.equals(this.f77101b.get(i - 1).f76333b, aVar3.f76333b)) {
            aVar2.f77104a.setVisibility(0);
            aVar2.f77104a.setText(aVar3.f76333b);
        } else {
            aVar2.f77104a.setVisibility(8);
        }
        if (!TextUtils.isEmpty(aVar3.f76336e)) {
            aVar2.f77105b.setText(aVar3.f76336e);
        } else {
            Context context = this.f77103d;
            if (context != null && !TextUtils.isEmpty(context.getResources().getString(aVar3.f76332a))) {
                aVar2.f77105b.setText(this.f77103d.getResources().getString(aVar3.f76332a));
            }
        }
        aVar2.f77106c.setText(aVar3.f76335d);
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC32322h(this, aVar3));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m66696a(C32319g gVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9774);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(gVar.f77102c, (ViewGroup) null);
        gVar.f77103d = viewGroup.getContext();
        C32320a aVar = new C32320a(inflate);
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
        MethodCollector.m26664o(9774);
        return aVar;
    }
}
