package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80257bo;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.q */
public final class C63380q extends RecyclerView.AbstractC1350a<C63381a> {

    /* renamed from: a */
    public AbstractC63382b f143908a;

    /* renamed from: b */
    public final List<LiveEventStruct> f143909b;

    /* renamed from: com.ss.android.ugc.aweme.profile.a.q$b */
    public interface AbstractC63382b {
        static {
            Covode.recordClassIndex(74673);
        }

        /* renamed from: a */
        void mo102014a(LiveEventStruct liveEventStruct);
    }

    static {
        Covode.recordClassIndex(74671);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C63381a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m114965a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f143909b.size();
    }

    public C63380q(List<LiveEventStruct> list) {
        C89219l.m154721d(list, "");
        this.f143909b = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.q$a */
    public static final class C63381a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final View f143910a;

        /* renamed from: b */
        final TuxTextView f143911b;

        /* renamed from: c */
        final TuxTextView f143912c;

        /* renamed from: d */
        public final View f143913d;

        static {
            Covode.recordClassIndex(74672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63381a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.br8);
            C89219l.m154716b(findViewById, "");
            this.f143910a = findViewById;
            View findViewById2 = view.findViewById(R.id.caz);
            C89219l.m154716b(findViewById2, "");
            this.f143911b = (TuxTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.cay);
            C89219l.m154716b(findViewById3, "");
            this.f143912c = (TuxTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.amp);
            C89219l.m154716b(findViewById4, "");
            this.f143913d = findViewById4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.q$c */
    static final class View$OnClickListenerC63383c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C63380q f143914a;

        /* renamed from: b */
        final /* synthetic */ int f143915b;

        static {
            Covode.recordClassIndex(74674);
        }

        View$OnClickListenerC63383c(C63380q qVar, int i) {
            this.f143914a = qVar;
            this.f143915b = i;
        }

        public final void onClick(View view) {
            AbstractC63382b bVar;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200) && (bVar = this.f143914a.f143908a) != null) {
                bVar.mo102014a(this.f143914a.f143909b.get(this.f143915b));
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m114965a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9046);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ao0, viewGroup, false);
        C89219l.m154716b(a2, "");
        C63381a aVar = new C63381a(a2);
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
        MethodCollector.m26664o(9046);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C63381a aVar, int i) {
        C63381a aVar2 = aVar;
        String str = "";
        C89219l.m154721d(aVar2, str);
        LiveEventStruct liveEventStruct = this.f143909b.get(i);
        C89219l.m154721d(liveEventStruct, str);
        aVar2.f143911b.setText(liveEventStruct.getTitle());
        TuxTextView tuxTextView = aVar2.f143912c;
        long startTime = liveEventStruct.getStartTime();
        long millis = TimeUnit.SECONDS.toMillis(startTime);
        if (startTime != 0) {
            if (C80257bo.m139109b(millis)) {
                str = BDDateFormat.m23653a(C80187aa.C80188a.m139009c(), millis);
            } else if (C80257bo.m139107a(millis)) {
                str = BDDateFormat.m23653a(C80187aa.C80188a.m139011d(), millis);
            } else if (C80257bo.m139111c(millis)) {
                str = BDDateFormat.m23653a(C80187aa.C80188a.m139013e(), millis);
            } else if (!C80187aa.C80188a.m139016f(millis)) {
                str = BDDateFormat.m23653a(C80187aa.C80188a.m139005a(), millis);
            } else {
                str = BDDateFormat.m23653a((BDDateFormat) C80187aa.f179645h.getValue(), millis);
            }
        }
        tuxTextView.setText(str);
        if (i == getItemCount() - 1) {
            aVar2.f143913d.setVisibility(4);
        }
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC63383c(this, i));
    }
}
