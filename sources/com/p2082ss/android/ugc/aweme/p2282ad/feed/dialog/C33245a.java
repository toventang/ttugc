package com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog;

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
import com.p2082ss.android.ugc.aweme.commercialize.model.C38233d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.a */
public final class C33245a extends RecyclerView.AbstractC1350a<C33246a> {

    /* renamed from: a */
    public final List<C38233d> f78985a;

    /* renamed from: b */
    public final AbstractC89187q<String, String, Integer, C89391z> f78986b;

    static {
        Covode.recordClassIndex(40071);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C33246a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m68172a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f78985a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.a$a */
    public static final class C33246a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(40072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33246a(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.a$b */
    static final class View$OnClickListenerC33247b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33245a f78987a;

        /* renamed from: b */
        final /* synthetic */ int f78988b;

        static {
            Covode.recordClassIndex(40073);
        }

        View$OnClickListenerC33247b(C33245a aVar, int i) {
            this.f78987a = aVar;
            this.f78988b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89187q<String, String, Integer, C89391z> qVar = this.f78987a.f78986b;
            String toast = this.f78987a.f78985a.get(this.f78988b).getToast();
            String str = "";
            if (toast == null) {
                toast = str;
            }
            String key = this.f78987a.f78985a.get(this.f78988b).getKey();
            if (key != null) {
                str = key;
            }
            qVar.invoke(toast, str, Integer.valueOf(this.f78988b));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.q<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C33245a(List<C38233d> list, AbstractC89187q<? super String, ? super String, ? super Integer, C89391z> qVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        this.f78985a = list;
        this.f78986b = qVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C33246a aVar, int i) {
        C33246a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        View view = aVar2.itemView;
        if (!(view instanceof TextView)) {
            view = null;
        }
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText(this.f78985a.get(i).getReason());
            textView.setOnClickListener(new View$OnClickListenerC33247b(this, i));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m68172a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8314);
        C89219l.m154721d(viewGroup, "");
        TextView textView = (TextView) C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.x6, viewGroup, false).findViewById(R.id.am5);
        C89219l.m154716b(textView, "");
        C33246a aVar = new C33246a(textView);
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
        MethodCollector.m26664o(8314);
        return aVar;
    }
}
