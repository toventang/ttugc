package com.p2082ss.android.ugc.aweme.journey.step.p3296e;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
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
import com.p2082ss.android.ugc.aweme.journey.C56843ac;
import com.p2082ss.android.ugc.aweme.journey.C56852d;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57047a;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57049c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.e.a */
public final class C56921a extends AbstractC56860g {

    /* renamed from: b */
    public Integer f129625b;

    /* renamed from: c */
    public Integer f129626c;

    /* renamed from: d */
    public final List<C56843ac> f129627d;

    /* renamed from: e */
    public final String f129628e;

    /* renamed from: f */
    public final String f129629f;

    /* renamed from: g */
    public final AbstractC89172b<Integer, C89391z> f129630g;

    static {
        Covode.recordClassIndex(66808);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final int mo94032a() {
        return this.f129627d.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo94033b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abf, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C56922a(this, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final AbstractC56854e mo93949a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        String str = this.f129482a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f129629f;
        if (str2 == null) {
            str2 = "";
        }
        C56852d a = C56852d.C56853a.m103099a(viewGroup, str, str2);
        View view = a.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        View view2 = a.itemView;
        C89219l.m154716b(view2, "");
        marginLayoutParams.bottomMargin = (int) C13628n.m24520b(view2.getContext(), 48.0f);
        View view3 = a.itemView;
        C89219l.m154716b(view3, "");
        view3.setLayoutParams(marginLayoutParams);
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.a$a */
    public final class C56922a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C56921a f129631a;

        /* renamed from: b */
        private final C57047a f129632b;

        /* renamed from: c */
        private final C57049c f129633c;

        static {
            Covode.recordClassIndex(66809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56922a(C56921a aVar, final View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f129631a = aVar;
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C89219l.m154721d(context, "");
            C57047a aVar2 = new C57047a(C13628n.m24520b(context, 8.0f), BlurMaskFilter.Blur.NORMAL, C13628n.m24520b(context, 2.0f), Color.parseColor("#1f000000"), C13628n.m24520b(context, 2.0f));
            this.f129632b = aVar2;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            Context context2 = view2.getContext();
            C89219l.m154716b(context2, "");
            C57049c cVar = new C57049c(context2.getResources().getColor(R.color.l), aVar2);
            this.f129633c = cVar;
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            Context context3 = view3.getContext();
            C89219l.m154716b(context3, "");
            cVar.mo94209a(context3.getResources().getColor(R.color.b6));
            view.setBackground(cVar);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.journey.step.p3296e.C56921a.C56922a.View$OnClickListenerC569231 */

                /* renamed from: a */
                final /* synthetic */ C56922a f129634a;

                static {
                    Covode.recordClassIndex(66810);
                }

                {
                    this.f129634a = r1;
                }

                public final void onClick(View view) {
                    Integer num;
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f129634a.getAdapterPosition() - 1;
                    ImageView imageView = (ImageView) view.findViewById(R.id.a5_);
                    C89219l.m154716b(imageView, "");
                    boolean z = !imageView.isSelected();
                    if (adapterPosition >= 0) {
                        C56921a aVar = this.f129634a.f129631a;
                        Integer num2 = null;
                        if (z) {
                            num = this.f129634a.f129631a.f129627d.get(adapterPosition).f129437a;
                        } else {
                            num = null;
                        }
                        aVar.f129625b = num;
                        C56921a aVar2 = this.f129634a.f129631a;
                        if (z) {
                            num2 = Integer.valueOf(adapterPosition);
                        }
                        aVar2.f129626c = num2;
                        this.f129634a.f129631a.notifyDataSetChanged();
                        this.f129634a.f129631a.f129630g.invoke(this.f129634a.f129631a.f129625b);
                    }
                }
            });
            view.setLayerType(1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C56922a) {
            C56922a aVar = (C56922a) viewHolder;
            boolean z = true;
            int adapterPosition = aVar.getAdapterPosition() - 1;
            View view = aVar.itemView;
            C89219l.m154716b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.b9s);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(aVar.f129631a.f129627d.get(adapterPosition).f129438b);
            View view2 = aVar.itemView;
            C89219l.m154716b(view2, "");
            ImageView imageView = (ImageView) view2.findViewById(R.id.a5_);
            C89219l.m154716b(imageView, "");
            Integer num = aVar.f129631a.f129626c;
            if (num == null || num.intValue() != adapterPosition) {
                z = false;
            }
            imageView.setSelected(z);
            View view3 = aVar.itemView;
            C89219l.m154716b(view3, "");
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (adapterPosition == 0) {
                marginLayoutParams.topMargin = 0;
            } else {
                View view4 = aVar.itemView;
                C89219l.m154716b(view4, "");
                marginLayoutParams.topMargin = -((int) C13628n.m24520b(view4.getContext(), 8.0f));
            }
            View view5 = aVar.itemView;
            C89219l.m154716b(view5, "");
            view5.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56921a(List<C56843ac> list, String str, String str2, AbstractC89172b<? super Integer, C89391z> bVar) {
        super(str);
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        this.f129627d = list;
        this.f129628e = str;
        this.f129629f = str2;
        this.f129630g = bVar;
    }
}
