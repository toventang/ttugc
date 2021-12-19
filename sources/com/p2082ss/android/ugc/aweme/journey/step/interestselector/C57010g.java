package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.interest.C56801b;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56854e;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56860g;
import com.p2082ss.android.ugc.aweme.journey.C56848ah;
import com.p2082ss.android.ugc.aweme.journey.C56849ai;
import com.p2082ss.android.ugc.aweme.journey.C56852d;
import com.p2082ss.android.ugc.aweme.journey.C56877r;
import com.p2082ss.android.ugc.aweme.p2394bj.C34879a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.g */
public final class C57010g extends AbstractC56860g {

    /* renamed from: b */
    public final HashSet<C56801b> f129793b;

    /* renamed from: c */
    public List<C56849ai> f129794c;

    /* renamed from: d */
    public final AbstractC89172b<Integer, C89391z> f129795d;

    /* renamed from: e */
    public final C56877r f129796e;

    /* renamed from: f */
    public final LinearLayoutManager f129797f;

    static {
        Covode.recordClassIndex(66898);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final int mo94032a() {
        return this.f129794c.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.g$a */
    public final class C57011a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C57010g f129798a;

        static {
            Covode.recordClassIndex(66899);
        }

        /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.g$a$b */
        static final class ViewTreeObserver$OnGlobalLayoutListenerC57013b implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: a */
            final /* synthetic */ C57011a f129801a;

            /* renamed from: b */
            final /* synthetic */ StaggeredGridLayoutManager f129802b;

            /* renamed from: c */
            final /* synthetic */ int f129803c;

            static {
                Covode.recordClassIndex(66901);
            }

            ViewTreeObserver$OnGlobalLayoutListenerC57013b(C57011a aVar, StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
                this.f129801a = aVar;
                this.f129802b = staggeredGridLayoutManager;
                this.f129803c = i;
            }

            public final void onGlobalLayout() {
                int i;
                C56997f.f129760j = Math.max(C56997f.f129760j, this.f129801a.f129798a.f129797f.mo4373m() - 1);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f129802b;
                int[] b = staggeredGridLayoutManager.mo4791b(new int[staggeredGridLayoutManager.f4556a]);
                C89219l.m154716b(b, "");
                Integer b2 = C89064i.m154494b(b);
                Map<Integer, Integer> map = C56997f.f129761k;
                Integer valueOf = Integer.valueOf(this.f129803c);
                Integer num = C56997f.f129761k.get(Integer.valueOf(this.f129803c));
                int i2 = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (b2 != null) {
                    i2 = b2.intValue();
                }
                map.put(valueOf, Integer.valueOf(Math.max(i, i2)));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.g$a$a */
        public static final class C57012a extends RecyclerView.AbstractC1371n {

            /* renamed from: a */
            final /* synthetic */ StaggeredGridLayoutManager f129799a;

            /* renamed from: b */
            final /* synthetic */ int f129800b;

            static {
                Covode.recordClassIndex(66900);
            }

            C57012a(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
                this.f129799a = staggeredGridLayoutManager;
                this.f129800b = i;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                int i2;
                C89219l.m154721d(recyclerView, "");
                super.mo4753a(recyclerView, i);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f129799a;
                int[] b = staggeredGridLayoutManager.mo4791b(new int[staggeredGridLayoutManager.f4556a]);
                C89219l.m154716b(b, "");
                Integer b2 = C89064i.m154494b(b);
                Map<Integer, Integer> map = C56997f.f129761k;
                Integer valueOf = Integer.valueOf(this.f129800b);
                Integer num = C56997f.f129761k.get(Integer.valueOf(this.f129800b));
                int i3 = 0;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                if (b2 != null) {
                    i3 = b2.intValue();
                }
                map.put(valueOf, Integer.valueOf(Math.max(i2, i3)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57011a(C57010g gVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f129798a = gVar;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.eme);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setLayoutManager(new TopicInterestAdapter$TopicInterestViewHolder$1());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo94033b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abi, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C57011a(this, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56860g
    /* renamed from: a */
    public final AbstractC56854e mo93949a(ViewGroup viewGroup) {
        String str;
        C89219l.m154721d(viewGroup, "");
        String str2 = this.f129482a;
        if (str2 == null) {
            str2 = "";
        }
        C56877r rVar = this.f129796e;
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C57011a) {
            C57011a aVar = (C57011a) viewHolder;
            View view = aVar.itemView;
            C89219l.m154716b(view, "");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.eme);
            int adapterPosition = aVar.getAdapterPosition() - 1;
            C56849ai aiVar = aVar.f129798a.f129794c.get(adapterPosition);
            View view2 = aVar.itemView;
            C89219l.m154716b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.text);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(aiVar.f129459b);
            String str = aVar.f129798a.f129794c.get(aVar.getAdapterPosition() - 1).f129460c;
            if (str == null) {
                str = "";
            }
            C20766v a = C20761r.m39061a(str);
            View view3 = aVar.itemView;
            C89219l.m154716b(view3, "");
            C20766v a2 = a.mo34179a(view3.getContext().getClass().getName());
            View view4 = aVar.itemView;
            C89219l.m154716b(view4, "");
            a2.f49092E = (SmartImageView) view4.findViewById(R.id.ble);
            a2.mo34181a(new C34879a());
            List<C56848ah> list = aiVar.f129461d;
            View view5 = aVar.itemView;
            C89219l.m154716b(view5, "");
            RecyclerView recyclerView2 = (RecyclerView) view5.findViewById(R.id.eme);
            C89219l.m154716b(recyclerView2, "");
            RecyclerView.AbstractC1362i layoutManager = recyclerView2.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            C57017j jVar = new C57017j(list, aVar.f129798a.f129795d, aVar.f129798a.f129796e, adapterPosition, aVar.f129798a.f129793b, aVar.getAdapterPosition());
            C89219l.m154716b(recyclerView, "");
            recyclerView.setAdapter(jVar);
            recyclerView.mo4405a(new C57011a.C57012a(staggeredGridLayoutManager, adapterPosition));
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C57011a.ViewTreeObserver$OnGlobalLayoutListenerC57013b(aVar, staggeredGridLayoutManager, adapterPosition));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C57010g(java.util.List<com.p2082ss.android.ugc.aweme.journey.C56849ai> r2, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Integer, p4600h.C89391z> r3, com.p2082ss.android.ugc.aweme.journey.C56877r r4, androidx.recyclerview.widget.LinearLayoutManager r5) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            if (r4 == 0) goto L_0x0022
            java.lang.String r0 = r4.f129531a
        L_0x000f:
            r1.<init>(r0)
            r1.f129794c = r2
            r1.f129795d = r3
            r1.f129796e = r4
            r1.f129797f = r5
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f129793b = r0
            return
        L_0x0022:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.journey.step.interestselector.C57010g.<init>(java.util.List, h.f.a.b, com.ss.android.ugc.aweme.journey.r, androidx.recyclerview.widget.LinearLayoutManager):void");
    }
}
