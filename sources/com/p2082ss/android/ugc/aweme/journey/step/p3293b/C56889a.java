package com.p2082ss.android.ugc.aweme.journey.step.p3293b;

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
import com.p2082ss.android.ugc.aweme.journey.AbstractC56854e;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56860g;
import com.p2082ss.android.ugc.aweme.journey.C56852d;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57047a;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57048b;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57049c;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.b.a */
public final class C56889a extends AbstractC56860g {

    /* renamed from: b */
    public AbstractC58069b f129583b;

    /* renamed from: c */
    public final List<AbstractC58069b> f129584c;

    /* renamed from: d */
    public final AbstractC89172b<AbstractC58069b, C89391z> f129585d;

    static {
        Covode.recordClassIndex(66776);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final int mo94032a() {
        return this.f129584c.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo94033b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abd, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C56890a(this, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final /* synthetic */ AbstractC56854e mo93949a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        String str = this.f129482a;
        if (str == null) {
            str = "";
        }
        C56852d a = C56852d.C56853a.m103099a(viewGroup, str, "");
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

    /* renamed from: com.ss.android.ugc.aweme.journey.step.b.a$a */
    public final class C56890a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C56889a f129586a;

        /* renamed from: b */
        private final C57047a f129587b;

        /* renamed from: c */
        private final C57049c f129588c;

        static {
            Covode.recordClassIndex(66777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56890a(C56889a aVar, final View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f129586a = aVar;
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C57047a a = C57048b.m103398a(context);
            this.f129587b = a;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            Context context2 = view2.getContext();
            C89219l.m154716b(context2, "");
            C57049c cVar = new C57049c(context2.getResources().getColor(R.color.l), a);
            this.f129588c = cVar;
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            Context context3 = view3.getContext();
            C89219l.m154716b(context3, "");
            cVar.mo94209a(context3.getResources().getColor(R.color.b6));
            view.setBackground(cVar);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.journey.step.p3293b.C56889a.C56890a.View$OnClickListenerC568911 */

                /* renamed from: a */
                final /* synthetic */ C56890a f129589a;

                static {
                    Covode.recordClassIndex(66778);
                }

                {
                    this.f129589a = r1;
                }

                public final void onClick(View view) {
                    AbstractC58069b bVar;
                    ClickAgent.onClick(view);
                    ImageView imageView = (ImageView) view.findViewById(R.id.a5_);
                    C89219l.m154716b(imageView, "");
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.a5_);
                    C89219l.m154716b(imageView2, "");
                    imageView.setSelected(!imageView2.isSelected());
                    int adapterPosition = this.f129589a.getAdapterPosition() - 1;
                    if (adapterPosition >= 0) {
                        C56889a aVar = this.f129589a.f129586a;
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.a5_);
                        C89219l.m154716b(imageView3, "");
                        if (imageView3.isSelected()) {
                            bVar = this.f129589a.f129586a.f129584c.get(adapterPosition);
                        } else {
                            bVar = null;
                        }
                        aVar.f129583b = bVar;
                        this.f129589a.f129586a.notifyDataSetChanged();
                        this.f129589a.f129586a.f129585d.invoke(this.f129589a.f129586a.f129583b);
                    }
                }
            });
            view.setLayerType(1, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006a, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1, (java.lang.Object) r0.mo90022f()) != false) goto L_0x006c;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.journey.step.p3293b.C56889a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.language.b> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.language.b, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56889a(List<? extends AbstractC58069b> list, AbstractC89172b<? super AbstractC58069b, C89391z> bVar, String str) {
        super(str);
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        this.f129584c = list;
        this.f129585d = bVar;
    }
}
