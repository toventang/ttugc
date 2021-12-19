package com.p2082ss.android.ugc.aweme.account.unbind;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.unbind.b */
public final class C33010b extends RecyclerView.AbstractC1350a<C33011a> {

    /* renamed from: a */
    private final String[] f78549a;

    static {
        Covode.recordClassIndex(39816);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C33011a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m67649a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f78549a.length;
    }

    public C33010b(String[] strArr) {
        C89219l.m154721d(strArr, "");
        this.f78549a = strArr;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.b$a */
    public static final class C33011a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TuxTextView f78550a;

        static {
            Covode.recordClassIndex(39817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33011a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.f90);
            C89219l.m154716b(findViewById, "");
            this.f78550a = (TuxTextView) findViewById;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C33011a aVar, int i) {
        C33011a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        aVar2.f78550a.setText(this.f78549a[i]);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m67649a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10173);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.gq, viewGroup, false);
        C89219l.m154716b(a2, "");
        C33011a aVar = new C33011a(a2);
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
        MethodCollector.m26664o(10173);
        return aVar;
    }
}
