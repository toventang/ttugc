package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56854e;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56860g;
import com.p2082ss.android.ugc.aweme.journey.C56852d;
import com.p2082ss.android.ugc.aweme.journey.C56877r;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import com.p2082ss.android.ugc.aweme.journey.p3291a.C56836b;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57047a;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57048b;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57049c;
import com.p2082ss.android.ugc.aweme.p2394bj.C34879a;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.a */
public class C56969a extends AbstractC56860g {

    /* renamed from: b */
    public final LinkedHashSet<Integer> f129703b;

    /* renamed from: c */
    public final LinkedHashSet<Integer> f129704c;

    /* renamed from: d */
    public List<C57054w> f129705d;

    /* renamed from: e */
    public final AbstractC89172b<Integer, C89391z> f129706e;

    /* renamed from: f */
    public final C56877r f129707f;

    static {
        Covode.recordClassIndex(66857);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final int mo94032a() {
        return this.f129705d.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo94033b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abg, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C56970a(this, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public AbstractC56854e mo93949a(ViewGroup viewGroup) {
        String str;
        C89219l.m154721d(viewGroup, "");
        String str2 = this.f129482a;
        if (str2 == null) {
            str2 = "";
        }
        C56877r rVar = this.f129707f;
        if (rVar == null || (str = rVar.f129532b) == null) {
            str = "";
        }
        C56852d a = C56852d.C56853a.m103099a(viewGroup, str2, str);
        View view = a.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        View view2 = a.itemView;
        C89219l.m154716b(view2, "");
        marginLayoutParams.bottomMargin = (int) C13628n.m24520b(view2.getContext(), 28.0f);
        View view3 = a.itemView;
        C89219l.m154716b(view3, "");
        view3.setLayoutParams(marginLayoutParams);
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.a$a */
    public final class C56970a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final int f129708a;

        /* renamed from: b */
        final /* synthetic */ C56969a f129709b;

        /* renamed from: c */
        private final C57047a f129710c;

        /* renamed from: d */
        private final C57049c f129711d;

        /* renamed from: e */
        private final C57049c f129712e;

        static {
            Covode.recordClassIndex(66858);
        }

        /* renamed from: a */
        public final void mo94155a(boolean z) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bpj);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setSelected(z);
            if (C56836b.m103086a()) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.bpj);
                C89219l.m154716b(linearLayout2, "");
                SmartImageView smartImageView = (SmartImageView) linearLayout2.findViewById(R.id.ble);
                C89219l.m154716b(smartImageView, "");
                smartImageView.setVisibility(0);
            } else {
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(R.id.bpj);
                C89219l.m154716b(linearLayout3, "");
                SmartImageView smartImageView2 = (SmartImageView) linearLayout3.findViewById(R.id.ble);
                C89219l.m154716b(smartImageView2, "");
                smartImageView2.setVisibility(8);
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                LinearLayout linearLayout4 = (LinearLayout) view4.findViewById(R.id.bpj);
                C89219l.m154716b(linearLayout4, "");
                TuxTextView tuxTextView = (TuxTextView) linearLayout4.findViewById(R.id.text);
                C89219l.m154716b(tuxTextView, "");
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())));
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                C23163i.m43668b(tuxTextView, valueOf, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()))), null, false, 26);
            }
            if (z) {
                View view5 = this.itemView;
                C89219l.m154716b(view5, "");
                LinearLayout linearLayout5 = (LinearLayout) view5.findViewById(R.id.bpj);
                C89219l.m154716b(linearLayout5, "");
                linearLayout5.setBackground(this.f129712e);
                View view6 = this.itemView;
                C89219l.m154716b(view6, "");
                LinearLayout linearLayout6 = (LinearLayout) view6.findViewById(R.id.bpj);
                C89219l.m154716b(linearLayout6, "");
                View view7 = this.itemView;
                C89219l.m154716b(view7, "");
                ((TuxTextView) linearLayout6.findViewById(R.id.text)).setTextColor(view7.getResources().getColor(R.color.a9));
                if (C56836b.m103086a()) {
                    View view8 = this.itemView;
                    C89219l.m154716b(view8, "");
                    LinearLayout linearLayout7 = (LinearLayout) view8.findViewById(R.id.bpj);
                    C89219l.m154716b(linearLayout7, "");
                    ((SimpleDraweeView) linearLayout7.findViewById(R.id.ble)).setActualImageResource(2131232206);
                    return;
                }
                return;
            }
            View view9 = this.itemView;
            C89219l.m154716b(view9, "");
            LinearLayout linearLayout8 = (LinearLayout) view9.findViewById(R.id.bpj);
            C89219l.m154716b(linearLayout8, "");
            linearLayout8.setBackground(this.f129711d);
            View view10 = this.itemView;
            C89219l.m154716b(view10, "");
            LinearLayout linearLayout9 = (LinearLayout) view10.findViewById(R.id.bpj);
            C89219l.m154716b(linearLayout9, "");
            View view11 = this.itemView;
            C89219l.m154716b(view11, "");
            Context context = view11.getContext();
            C89219l.m154716b(context, "");
            ((TuxTextView) linearLayout9.findViewById(R.id.text)).setTextColor(context.getResources().getColor(R.color.bx));
            if (C56836b.m103086a()) {
                String str = this.f129709b.f129705d.get(getAdapterPosition() - 1).f129914c;
                if (str == null) {
                    str = "";
                }
                C20766v a = C20761r.m39061a(str);
                int i = this.f129708a;
                C20766v a2 = a.mo34176a(i, i);
                View view12 = this.itemView;
                C89219l.m154716b(view12, "");
                C20766v a3 = a2.mo34179a(view12.getContext().getClass().getName());
                View view13 = this.itemView;
                C89219l.m154716b(view13, "");
                LinearLayout linearLayout10 = (LinearLayout) view13.findViewById(R.id.bpj);
                C89219l.m154716b(linearLayout10, "");
                a3.f49092E = (SmartImageView) linearLayout10.findViewById(R.id.ble);
                a3.mo34181a(new C34879a());
                return;
            }
            View view14 = this.itemView;
            C89219l.m154716b(view14, "");
            LinearLayout linearLayout11 = (LinearLayout) view14.findViewById(R.id.bpj);
            C89219l.m154716b(linearLayout11, "");
            SmartImageView smartImageView3 = (SmartImageView) linearLayout11.findViewById(R.id.ble);
            C89219l.m154716b(smartImageView3, "");
            smartImageView3.setVisibility(8);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56970a(C56969a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f129709b = aVar;
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C57047a a = C57048b.m103398a(context);
            this.f129710c = a;
            C57049c cVar = new C57049c(view.getResources().getColor(R.color.l), a);
            this.f129711d = cVar;
            this.f129712e = new C57049c(view.getResources().getColor(R.color.bh), a);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            this.f129708a = (int) C13628n.m24520b(view2.getContext(), 28.0f);
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            Context context2 = view3.getContext();
            C89219l.m154716b(context2, "");
            cVar.mo94209a(context2.getResources().getColor(R.color.b6));
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56969a.C56970a.View$OnClickListenerC569711 */

                /* renamed from: a */
                final /* synthetic */ C56970a f129713a;

                static {
                    Covode.recordClassIndex(66859);
                }

                {
                    this.f129713a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f129713a.getAdapterPosition() - 1;
                    View view2 = this.f129713a.itemView;
                    C89219l.m154716b(view2, "");
                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.bpj);
                    C89219l.m154716b(linearLayout, "");
                    boolean isSelected = linearLayout.isSelected();
                    if (isSelected) {
                        this.f129713a.f129709b.f129704c.remove(Integer.valueOf(adapterPosition));
                    } else {
                        this.f129713a.f129709b.f129704c.add(Integer.valueOf(adapterPosition));
                    }
                    this.f129713a.mo94155a(!isSelected);
                    this.f129713a.f129709b.f129706e.invoke(Integer.valueOf(this.f129713a.f129709b.f129704c.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C56970a) {
            C56970a aVar = (C56970a) viewHolder;
            int adapterPosition = aVar.getAdapterPosition() - 1;
            View view = aVar.itemView;
            C89219l.m154716b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.text);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(aVar.f129709b.f129705d.get(adapterPosition).f129913b);
            aVar.mo94155a(aVar.f129709b.f129704c.contains(Integer.valueOf(adapterPosition)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56969a(java.util.List<com.p2082ss.android.ugc.aweme.journey.C57054w> r6, boolean r7, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Integer, p4600h.C89391z> r8, com.p2082ss.android.ugc.aweme.journey.C56877r r9) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
            if (r9 == 0) goto L_0x0057
            java.lang.String r0 = r9.f129531a
        L_0x000c:
            r5.<init>(r0)
            r5.f129705d = r6
            r5.f129706e = r8
            r5.f129707f = r9
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r5.f129703b = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r5.f129704c = r0
            if (r7 == 0) goto L_0x0059
            java.util.List<com.ss.android.ugc.aweme.journey.w> r0 = r5.f129705d
            r4 = 0
            java.util.Iterator r3 = r0.iterator()
        L_0x002c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r3.next()
            int r2 = r4 + 1
            if (r4 >= 0) goto L_0x003d
            p4600h.p4601a.C89070n.m154520a()
        L_0x003d:
            com.ss.android.ugc.aweme.journey.w r0 = (com.p2082ss.android.ugc.aweme.journey.C57054w) r0
            java.lang.Boolean r1 = r0.f129917f
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            if (r0 == 0) goto L_0x0055
            java.util.LinkedHashSet<java.lang.Integer> r1 = r5.f129703b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.add(r0)
        L_0x0055:
            r4 = r2
            goto L_0x002c
        L_0x0057:
            r0 = 0
            goto L_0x000c
        L_0x0059:
            java.util.LinkedHashSet<java.lang.Integer> r1 = r5.f129704c
            java.util.LinkedHashSet<java.lang.Integer> r0 = r5.f129703b
            r1.addAll(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56969a.<init>(java.util.List, boolean, h.f.a.b, com.ss.android.ugc.aweme.journey.r):void");
    }
}
