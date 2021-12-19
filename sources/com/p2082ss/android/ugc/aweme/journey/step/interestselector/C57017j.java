package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.interest.C56801b;
import com.p2082ss.android.ugc.aweme.journey.C56848ah;
import com.p2082ss.android.ugc.aweme.journey.C56877r;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57047a;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57048b;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57049c;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.j */
public final class C57017j extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List<C56848ah> f129805a;

    /* renamed from: b */
    public final AbstractC89172b<Integer, C89391z> f129806b;

    /* renamed from: c */
    public final C56877r f129807c;

    /* renamed from: d */
    public final int f129808d;

    /* renamed from: e */
    public HashSet<C56801b> f129809e;

    /* renamed from: f */
    public final int f129810f;

    static {
        Covode.recordClassIndex(66905);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m103361a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<C56848ah> list = this.f129805a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.j$a */
    public final class C57018a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final int f129811a;

        /* renamed from: b */
        final /* synthetic */ C57017j f129812b;

        /* renamed from: c */
        private final C57047a f129813c;

        /* renamed from: d */
        private final C57049c f129814d;

        /* renamed from: e */
        private final C57049c f129815e;

        static {
            Covode.recordClassIndex(66906);
        }

        /* renamed from: a */
        public final void mo94176a(boolean z) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bph);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setSelected(z);
            if (z) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.bph);
                C89219l.m154716b(linearLayout2, "");
                linearLayout2.setBackground(this.f129815e);
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(R.id.bph);
                C89219l.m154716b(linearLayout3, "");
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                ((TuxTextView) linearLayout3.findViewById(R.id.text)).setTextColor(view4.getResources().getColor(R.color.a9));
                return;
            }
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            LinearLayout linearLayout4 = (LinearLayout) view5.findViewById(R.id.bph);
            C89219l.m154716b(linearLayout4, "");
            linearLayout4.setBackground(this.f129814d);
            View view6 = this.itemView;
            C89219l.m154716b(view6, "");
            LinearLayout linearLayout5 = (LinearLayout) view6.findViewById(R.id.bph);
            C89219l.m154716b(linearLayout5, "");
            View view7 = this.itemView;
            C89219l.m154716b(view7, "");
            Context context = view7.getContext();
            C89219l.m154716b(context, "");
            ((TuxTextView) linearLayout5.findViewById(R.id.text)).setTextColor(context.getResources().getColor(R.color.bx));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57018a(C57017j jVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f129812b = jVar;
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C57047a a = C57048b.m103398a(context);
            this.f129813c = a;
            C57049c cVar = new C57049c(view.getResources().getColor(R.color.l), a);
            this.f129814d = cVar;
            this.f129815e = new C57049c(view.getResources().getColor(R.color.bh), a);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            this.f129811a = (int) C13628n.m24520b(view2.getContext(), 28.0f);
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            Context context2 = view3.getContext();
            C89219l.m154716b(context2, "");
            cVar.mo94209a(context2.getResources().getColor(R.color.b6));
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.journey.step.interestselector.C57017j.C57018a.View$OnClickListenerC570191 */

                /* renamed from: a */
                final /* synthetic */ C57018a f129816a;

                static {
                    Covode.recordClassIndex(66907);
                }

                {
                    this.f129816a = r1;
                }

                public final void onClick(View view) {
                    C56848ah ahVar;
                    String str;
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f129816a.getAdapterPosition();
                    View view2 = this.f129816a.itemView;
                    String str2 = "";
                    C89219l.m154716b(view2, str2);
                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.bph);
                    C89219l.m154716b(linearLayout, str2);
                    boolean isSelected = linearLayout.isSelected();
                    int i = this.f129816a.f129812b.f129808d;
                    List<C56848ah> list = this.f129816a.f129812b.f129805a;
                    if (!(list == null || (ahVar = list.get(adapterPosition)) == null || (str = ahVar.f129453a) == null)) {
                        str2 = str;
                    }
                    C56801b bVar = new C56801b(i, str2, adapterPosition);
                    if (isSelected) {
                        this.f129816a.f129812b.f129809e.remove(bVar);
                    } else {
                        this.f129816a.f129812b.f129809e.add(bVar);
                    }
                    this.f129816a.mo94176a(!isSelected);
                    this.f129816a.f129812b.f129806b.invoke(Integer.valueOf(this.f129816a.f129812b.f129809e.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C56848ah ahVar;
        C56848ah ahVar2;
        String str;
        String str2 = "";
        C89219l.m154721d(viewHolder, str2);
        if (viewHolder instanceof C57018a) {
            C57018a aVar = (C57018a) viewHolder;
            int adapterPosition = aVar.getAdapterPosition();
            List<C56848ah> list = aVar.f129812b.f129805a;
            String str3 = null;
            if (list != null) {
                ahVar = list.get(adapterPosition);
            } else {
                ahVar = null;
            }
            View view = aVar.itemView;
            C89219l.m154716b(view, str2);
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.text);
            C89219l.m154716b(tuxTextView, str2);
            if (ahVar != null) {
                str3 = ahVar.f129454b;
            }
            tuxTextView.setText(str3);
            int i2 = aVar.f129812b.f129808d;
            List<C56848ah> list2 = aVar.f129812b.f129805a;
            if (!(list2 == null || (ahVar2 = list2.get(adapterPosition)) == null || (str = ahVar2.f129453a) == null)) {
                str2 = str;
            }
            aVar.mo94176a(aVar.f129812b.f129809e.contains(new C56801b(i2, str2, adapterPosition)));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m103361a(C57017j jVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5651);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abh, viewGroup, false);
        C89219l.m154716b(a2, "");
        C57018a aVar = new C57018a(jVar, a2);
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
        MethodCollector.m26664o(5651);
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57017j(List<C56848ah> list, AbstractC89172b<? super Integer, C89391z> bVar, C56877r rVar, int i, HashSet<C56801b> hashSet, int i2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hashSet, "");
        this.f129805a = list;
        this.f129806b = bVar;
        this.f129807c = rVar;
        this.f129808d = i;
        this.f129809e = hashSet;
        this.f129810f = i2;
    }
}
