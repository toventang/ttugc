package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3101a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53870b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a.a */
public final class C53879a extends RecyclerView.AbstractC1350a<View$OnClickListenerC53880a> {

    /* renamed from: a */
    public AbstractC53881b f123545a;

    /* renamed from: b */
    public List<C53870b> f123546b = C89086z.INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a.a$b */
    public interface AbstractC53881b {
        static {
            Covode.recordClassIndex(63544);
        }

        /* renamed from: a */
        void mo91040a(int i);
    }

    static {
        Covode.recordClassIndex(63542);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ View$OnClickListenerC53880a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m99140a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f123546b.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a.a$a */
    public static final class View$OnClickListenerC53880a extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final C53879a f123547a;

        static {
            Covode.recordClassIndex(63543);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC53881b bVar = this.f123547a.f123545a;
            if (bVar != null) {
                bVar.mo91040a(getAdapterPosition());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public View$OnClickListenerC53880a(C53879a aVar, View view) {
            super(view);
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(view, "");
            this.f123547a = aVar;
            view.setOnClickListener(this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(View$OnClickListenerC53880a aVar, int i) {
        View$OnClickListenerC53880a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        int i2 = this.f123546b.get(i).f123519b;
        int i3 = R.string.a9;
        if (i2 == 1) {
            i3 = R.string.h0y;
        } else if (i2 == 2) {
            i3 = R.string.fci;
        } else if (i2 == 3) {
            i3 = R.string.v4;
        }
        View view = aVar2.itemView;
        C89219l.m154716b(view, "");
        ((TuxTextView) view.findViewById(R.id.f2o)).setText(i3);
        String str = this.f123546b.get(i).f123521d;
        if (str == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        View view2 = aVar2.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.esm);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
        String str2 = this.f123546b.get(i).f123520c;
        if (str2 == null) {
            str2 = "";
        }
        C89219l.m154721d(str2, "");
        View view3 = aVar2.itemView;
        C89219l.m154716b(view3, "");
        TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.exx);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(str2);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m99140a(C53879a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3492);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8b, viewGroup, false);
        C89219l.m154716b(a2, "");
        View$OnClickListenerC53880a aVar2 = new View$OnClickListenerC53880a(aVar, a2);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(3492);
        return aVar2;
    }
}
