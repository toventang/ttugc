package com.p2082ss.android.ugc.aweme.journey.step.p3294c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56854e;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56860g;
import com.p2082ss.android.ugc.aweme.journey.C56852d;
import com.p2082ss.android.ugc.aweme.journey.C56862i;
import com.p2082ss.android.ugc.aweme.journey.C56863j;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57047a;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57048b;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57049c;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.c.a */
public final class C56901a extends AbstractC56860g {

    /* renamed from: b */
    public final LinkedHashSet<Integer> f129598b;

    /* renamed from: c */
    public final AbstractC89172b<Integer, C89391z> f129599c;

    /* renamed from: d */
    public final C56863j f129600d;

    /* renamed from: e */
    private final List<C56862i> f129601e;

    static {
        Covode.recordClassIndex(66788);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final int mo94032a() {
        return this.f129601e.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo94033b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abe, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C56902a(this, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final /* synthetic */ AbstractC56854e mo93949a(ViewGroup viewGroup) {
        String str;
        C89219l.m154721d(viewGroup, "");
        String str2 = this.f129482a;
        if (str2 == null) {
            str2 = "";
        }
        C56863j jVar = this.f129600d;
        if (jVar == null || (str = jVar.f129489b) == null) {
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

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.a$a */
    public final class C56902a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C56901a f129602a;

        /* renamed from: b */
        private final C57047a f129603b;

        /* renamed from: c */
        private final C57049c f129604c;

        static {
            Covode.recordClassIndex(66789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56902a(C56901a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f129602a = aVar;
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C57047a a = C57048b.m103398a(context);
            this.f129603b = a;
            C57049c cVar = new C57049c(view.getResources().getColor(R.color.l), a);
            this.f129604c = cVar;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            Context context2 = view2.getContext();
            C89219l.m154716b(context2, "");
            cVar.mo94209a(context2.getResources().getColor(R.color.b6));
            view.setBackground(cVar);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.journey.step.p3294c.C56901a.C56902a.View$OnClickListenerC569031 */

                /* renamed from: a */
                final /* synthetic */ C56902a f129605a;

                static {
                    Covode.recordClassIndex(66790);
                }

                {
                    this.f129605a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f129605a.getAdapterPosition() - 1;
                    View view2 = this.f129605a.itemView;
                    C89219l.m154716b(view2, "");
                    ImageView imageView = (ImageView) view2.findViewById(R.id.a4j);
                    C89219l.m154716b(imageView, "");
                    if (imageView.isSelected()) {
                        this.f129605a.f129602a.f129598b.remove(Integer.valueOf(adapterPosition));
                    } else {
                        this.f129605a.f129602a.f129598b.add(Integer.valueOf(adapterPosition));
                    }
                    View view3 = this.f129605a.itemView;
                    C89219l.m154716b(view3, "");
                    ImageView imageView2 = (ImageView) view3.findViewById(R.id.a4j);
                    C89219l.m154716b(imageView2, "");
                    View view4 = this.f129605a.itemView;
                    C89219l.m154716b(view4, "");
                    ImageView imageView3 = (ImageView) view4.findViewById(R.id.a4j);
                    C89219l.m154716b(imageView3, "");
                    imageView2.setSelected(!imageView3.isSelected());
                    this.f129605a.f129602a.f129599c.invoke(Integer.valueOf(this.f129605a.f129602a.f129598b.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C56902a) {
            C56902a aVar = (C56902a) viewHolder;
            int i2 = i - 1;
            C56862i iVar = this.f129601e.get(i2);
            boolean contains = this.f129598b.contains(Integer.valueOf(i2));
            C89219l.m154721d(iVar, "");
            View view = aVar.itemView;
            C89219l.m154716b(view, "");
            ImageView imageView = (ImageView) view.findViewById(R.id.a4j);
            C89219l.m154716b(imageView, "");
            imageView.setSelected(contains);
            View view2 = aVar.itemView;
            C89219l.m154716b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.avs);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(iVar.f129486b);
            View view3 = aVar.itemView;
            C89219l.m154716b(view3, "");
            TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.cg_);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(iVar.f129487c);
            View view4 = aVar.itemView;
            C89219l.m154716b(view4, "");
            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int adapterPosition = aVar.getAdapterPosition() - 1;
            if (adapterPosition <= 1) {
                marginLayoutParams.topMargin = 0;
            } else {
                View view5 = aVar.itemView;
                C89219l.m154716b(view5, "");
                marginLayoutParams.topMargin = -((int) C13628n.m24520b(view5.getContext(), 8.0f));
            }
            if (adapterPosition % 2 == 0) {
                marginLayoutParams.leftMargin = 0;
            } else {
                View view6 = aVar.itemView;
                C89219l.m154716b(view6, "");
                marginLayoutParams.leftMargin = -((int) C13628n.m24520b(view6.getContext(), 0.0f));
            }
            View view7 = aVar.itemView;
            C89219l.m154716b(view7, "");
            view7.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56901a(java.util.List<com.p2082ss.android.ugc.aweme.journey.C56862i> r2, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Integer, p4600h.C89391z> r3, com.p2082ss.android.ugc.aweme.journey.C56863j r4) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            if (r4 == 0) goto L_0x001d
            java.lang.String r0 = r4.f129488a
        L_0x000c:
            r1.<init>(r0)
            r1.f129601e = r2
            r1.f129599c = r3
            r1.f129600d = r4
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f129598b = r0
            return
        L_0x001d:
            r0 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.journey.step.p3294c.C56901a.<init>(java.util.List, h.f.a.b, com.ss.android.ugc.aweme.journey.j):void");
    }
}
