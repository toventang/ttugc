package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20375am;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84640a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84691c;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.C84689h;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84630a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85013c;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.C85023h;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.a */
public final class C84723a extends AbstractC84650b<Effect> implements AbstractC84630a<EffectCategoryResponse, Effect>, AbstractC84691c {

    /* renamed from: A */
    private final AbstractC1204m f189303A;

    /* renamed from: B */
    private final AbstractC84640a<EffectCategoryResponse, Effect> f189304B;

    /* renamed from: C */
    private final int f189305C;

    /* renamed from: D */
    private final boolean f189306D = true;

    /* renamed from: E */
    private final boolean f189307E;

    /* renamed from: a */
    public List<C89378p<EffectCategoryResponse, List<Effect>>> f189308a;

    /* renamed from: b */
    final boolean f189309b;

    /* renamed from: c */
    private AbstractC85013c<EffectCategoryResponse> f189310c;

    /* renamed from: v */
    private C84729c f189311v;

    /* renamed from: w */
    private C84729c f189312w;

    /* renamed from: x */
    private final C88958b<List<C89378p<EffectCategoryResponse, List<Effect>>>> f189313x;

    /* renamed from: y */
    private boolean f189314y;

    /* renamed from: z */
    private View f189315z;

    static {
        Covode.recordClassIndex(98699);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: c */
    public final AbstractC1204m mo114480c() {
        return this.f189303A;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: d */
    public final int mo114481d() {
        return this.f189305C;
    }

    /* renamed from: y */
    public final void mo129641y() {
        mo129585t();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84630a
    /* renamed from: a */
    public final /* synthetic */ void mo129530a(Effect effect, int i) {
        C89219l.m154721d(effect, "");
        int i2 = 0;
        for (C89378p pVar : C89070n.m154571d((Iterable) this.f189308a, i)) {
            i2 += ((List) pVar.component2()).size();
        }
        List a = mo129583r().mo129934a();
        int size = a.size();
        while (i2 < size) {
            if (!C89219l.m154714a((Object) ((C20375am) a.get(i2)).f48260a, (Object) effect)) {
                i2++;
            } else if (i2 >= 0) {
                RecyclerView.AbstractC1362i layoutManager = mo129581p().getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    linearLayoutManager.mo4347a(mo129577b(i2), 0);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84630a
    /* renamed from: a */
    public final AbstractC88979t<List<C89378p<EffectCategoryResponse, List<Effect>>>> mo129529a() {
        AbstractC88979t<List<C89378p<EffectCategoryResponse, List<Effect>>>> c = this.f189313x.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: w */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> mo129588w() {
        C84724a aVar = new C84724a(this, super.mo129588w());
        this.f189310c = aVar;
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final void mo114479b() {
        LiveData<List<C89378p<EffectCategoryResponse, List<Effect>>>> a;
        super.mo114479b();
        AbstractC84640a<EffectCategoryResponse, Effect> aVar = this.f189304B;
        if (!(aVar == null || (a = aVar.mo129555a()) == null)) {
            a.removeObservers(this.f189303A);
        }
        this.f189314y = false;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84691c
    /* renamed from: e */
    public final void mo129602e() {
        if (this.f189307E && !this.f189314y) {
            this.f189314y = true;
            mo114475a(this.f189303A);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: t */
    public final void mo129585t() {
        super.mo129585t();
        if (this.f189309b) {
            View findViewById = mo129580o().findViewById(R.id.ayh);
            C89219l.m154716b(findViewById, "");
            View findViewById2 = findViewById.findViewById(R.id.e8w);
            C89219l.m154716b(findViewById2, "");
            this.f189311v = new C84729c(findViewById, (TextView) findViewById2);
            View findViewById3 = mo129580o().findViewById(R.id.ayc);
            C89219l.m154716b(findViewById3, "");
            View findViewById4 = findViewById3.findViewById(R.id.e8w);
            C89219l.m154716b(findViewById4, "");
            this.f189312w = new C84729c(findViewById3, (TextView) findViewById4);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.a$c */
    public static final class C84726c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C84723a f189318a;

        static {
            Covode.recordClassIndex(98702);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84726c(C84723a aVar) {
            this.f189318a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            int k;
            View c;
            C89219l.m154721d(recyclerView, "");
            if (!this.f189318a.f189308a.isEmpty()) {
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null && (c = linearLayoutManager.mo4358c((k = linearLayoutManager.mo4371k()))) != null) {
                    this.f189318a.mo129638a(k, c);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.a$b */
    static final class C84725b<T> implements AbstractC1214u<List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends Effect>>>> {

        /* renamed from: a */
        final /* synthetic */ C84723a f189317a;

        static {
            Covode.recordClassIndex(98701);
        }

        C84725b(C84723a aVar) {
            this.f189317a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.ugc.tools.infosticker.view.internal.main.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
            List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list2 = list;
            C84723a aVar = this.f189317a;
            if (list2 == null) {
                list2 = C89086z.INSTANCE;
            }
            aVar.mo129640b((List<? extends C89378p<EffectCategoryResponse, ? extends List<? extends Effect>>>) list2);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: b */
    public final int mo129577b(int i) {
        int b = super.mo129577b(i);
        AbstractC85013c<EffectCategoryResponse> cVar = this.f189310c;
        if (cVar != null) {
            return cVar.mo129941b(b);
        }
        return b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: c */
    public final int mo129579c(int i) {
        AbstractC85013c<EffectCategoryResponse> cVar = this.f189310c;
        if (cVar != null) {
            i = cVar.mo129938a(i);
        }
        return super.mo129579c(i);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final View mo129572a(ViewGroup viewGroup) {
        if (!this.f189309b) {
            return super.mo129572a(viewGroup);
        }
        View a = C1764a.m5927a(LayoutInflater.from(this.f189154s), R.layout.b3n, viewGroup, this.f189306D);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.a$a */
    final class C84724a extends AbstractC85013c<EffectCategoryResponse> {

        /* renamed from: a */
        final /* synthetic */ C84723a f189316a;

        static {
            Covode.recordClassIndex(98700);
        }

        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85013c
        /* renamed from: a */
        public final RecyclerView.ViewHolder mo86248a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            C84723a aVar = this.f189316a;
            C89219l.m154721d(viewGroup, "");
            if (aVar.f189309b) {
                View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3w, viewGroup, false);
                TextView textView = (TextView) a.findViewById(R.id.e8w);
                C89219l.m154716b(a, "");
                C89219l.m154716b(textView, "");
                return new C84729c(a, textView);
            }
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8u, viewGroup, false);
            C89219l.m154716b(a2, "");
            return new C85023h(a2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84724a(C84723a aVar, RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar2) {
            super(aVar2);
            C89219l.m154721d(aVar2, "");
            this.f189316a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
        @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85013c
        /* renamed from: a */
        public final /* synthetic */ void mo86249a(RecyclerView.ViewHolder viewHolder, EffectCategoryResponse effectCategoryResponse) {
            EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(effectCategoryResponse2, "");
            this.f189316a.mo129639a(viewHolder, effectCategoryResponse2);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView mo114472a(View view) {
        C89219l.m154721d(view, "");
        RecyclerView a = super.mo114472a(view);
        if (this.f189305C >= 4) {
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            a.setFadingEdgeLength((int) C84912r.m145930a(context, 4.0f));
            a.setVerticalFadingEdgeEnabled(true);
            Context context2 = view.getContext();
            C89219l.m154716b(context2, "");
            int a2 = (int) C84912r.m145930a(context2, 3.0f);
            a.setPadding(a2, 0, a2, 0);
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final void mo114475a(AbstractC1204m mVar) {
        LiveData<List<C89378p<EffectCategoryResponse, List<Effect>>>> a;
        C89219l.m154721d(mVar, "");
        super.mo114475a(mVar);
        AbstractC84640a<EffectCategoryResponse, Effect> aVar = this.f189304B;
        if (!(aVar == null || (a = aVar.mo129555a()) == null)) {
            a.observe(mVar, new C84725b(this));
        }
        if (this.f189309b) {
            mo129581p().mo4405a(new C84726c(this));
        }
    }

    /* renamed from: b */
    public final void mo129640b(List<? extends C89378p<EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
        View view;
        View view2;
        View view3;
        View view4;
        this.f189308a.clear();
        List<C89378p<EffectCategoryResponse, List<Effect>>> list2 = this.f189308a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!((Collection) t.getSecond()).isEmpty()) {
                arrayList.add(t);
            }
        }
        list2.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (C89378p<EffectCategoryResponse, List<Effect>> pVar : this.f189308a) {
            if (i != 0) {
                arrayList2.add(C89387v.m154943a(Integer.valueOf(i - 1), pVar.getFirst()));
            }
            i += pVar.getSecond().size();
        }
        AbstractC85013c<EffectCategoryResponse> cVar = this.f189310c;
        if (cVar != null) {
            cVar.mo129940a(arrayList2);
        }
        if (this.f189309b) {
            if (this.f189308a.isEmpty()) {
                C84729c cVar2 = this.f189311v;
                if (!(cVar2 == null || (view4 = cVar2.itemView) == null)) {
                    view4.setVisibility(8);
                }
                C84729c cVar3 = this.f189312w;
                if (!(cVar3 == null || (view3 = cVar3.itemView) == null)) {
                    view3.setVisibility(8);
                }
            } else {
                C84729c cVar4 = this.f189311v;
                if (!(cVar4 == null || (view2 = cVar4.itemView) == null)) {
                    view2.setVisibility(0);
                }
                C84729c cVar5 = this.f189311v;
                if (cVar5 == null) {
                    C89219l.m154715b();
                }
                mo129639a(cVar5, (EffectCategoryResponse) ((C89378p) C89070n.m154579f((List) this.f189308a)).getFirst());
                C84729c cVar6 = this.f189312w;
                if (!(cVar6 == null || (view = cVar6.itemView) == null)) {
                    view.setVisibility(4);
                }
            }
            this.f189313x.onNext(this.f189308a);
            return;
        }
        this.f189313x.onNext(C89086z.INSTANCE);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo114471a(ViewGroup viewGroup, AbstractC89187q<? super Effect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        C89378p<FrameLayout, C85037b> a;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(qVar, "");
        if (this.f189305C >= 4) {
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            a = C84689h.m145533b(context);
        } else {
            Context context2 = viewGroup.getContext();
            C89219l.m154716b(context2, "");
            a = C84689h.m145531a(context2);
        }
        return new C84811n(a.component1(), a.component2(), qVar);
    }

    /* renamed from: a */
    public final void mo129638a(int i, View view) {
        Object next;
        EffectCategoryResponse effectCategoryResponse;
        AbstractC85013c<EffectCategoryResponse> cVar = this.f189310c;
        if (cVar != null) {
            Map<Integer, DATA> map = cVar.f190189b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, DATA> entry : map.entrySet()) {
                if (entry.getKey().intValue() < i) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                    do {
                        Object next2 = it.next();
                        int intValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                        if (intValue < intValue2) {
                            next = next2;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Map.Entry entry2 = (Map.Entry) next;
            C89378p pVar = entry2 != null ? new C89378p(entry2.getKey(), entry2.getValue()) : null;
            C84729c cVar2 = this.f189311v;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            if (pVar == null || (effectCategoryResponse = (EffectCategoryResponse) pVar.getSecond()) == null) {
                effectCategoryResponse = (EffectCategoryResponse) ((C89378p) C89070n.m154579f((List) this.f189308a)).getFirst();
            }
            mo129639a(cVar2, effectCategoryResponse);
            DATA data = cVar.f190189b.get(Integer.valueOf(i));
            if (data != null) {
                int top = view.getTop();
                C84729c cVar3 = this.f189312w;
                if (cVar3 == null) {
                    C89219l.m154715b();
                }
                View view2 = cVar3.itemView;
                C89219l.m154716b(view2, "");
                if (top > (-view2.getMeasuredHeight())) {
                    C84729c cVar4 = this.f189311v;
                    if (cVar4 == null) {
                        C89219l.m154715b();
                    }
                    View view3 = cVar4.itemView;
                    C89219l.m154716b(view3, "");
                    view3.setTranslationY((float) view.getTop());
                    C84729c cVar5 = this.f189312w;
                    if (cVar5 == null) {
                        C89219l.m154715b();
                    }
                    View view4 = cVar5.itemView;
                    C89219l.m154716b(view4, "");
                    view4.setVisibility(0);
                    C84729c cVar6 = this.f189312w;
                    if (cVar6 == null) {
                        C89219l.m154715b();
                    }
                    View view5 = cVar6.itemView;
                    C89219l.m154716b(view5, "");
                    view5.setTranslationY((float) view.getTop());
                    C84729c cVar7 = this.f189312w;
                    if (cVar7 == null) {
                        C89219l.m154715b();
                    }
                    mo129639a((RecyclerView.ViewHolder) cVar7, (EffectCategoryResponse) data);
                    view.setVisibility(4);
                    this.f189315z = view;
                    return;
                }
            }
            C84729c cVar8 = this.f189311v;
            if (cVar8 == null) {
                C89219l.m154715b();
            }
            View view6 = cVar8.itemView;
            C89219l.m154716b(view6, "");
            view6.setTranslationY(0.0f);
            C84729c cVar9 = this.f189312w;
            if (cVar9 == null) {
                C89219l.m154715b();
            }
            View view7 = cVar9.itemView;
            C89219l.m154716b(view7, "");
            view7.setVisibility(4);
            View view8 = this.f189315z;
            if (view8 != null) {
                view8.setVisibility(0);
            }
            this.f189315z = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo129639a(RecyclerView.ViewHolder viewHolder, EffectCategoryResponse effectCategoryResponse) {
        TextView textView;
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(effectCategoryResponse, "");
        if (this.f189309b) {
            if (!(viewHolder instanceof C84729c)) {
                viewHolder = null;
            }
            C84729c cVar = (C84729c) viewHolder;
            if (cVar != null && (textView = cVar.f189322a) != null) {
                textView.setText(effectCategoryResponse.getName());
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84650b
    /* renamed from: a */
    public final /* synthetic */ void mo114476a(RecyclerView.ViewHolder viewHolder, int i, Effect effect, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        if (!(viewHolder instanceof C84811n)) {
            viewHolder = null;
        }
        AbstractC84686f fVar = (AbstractC84686f) viewHolder;
        if (fVar != null) {
            fVar.mo129601a(effect, i, cVar, num);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84723a(Context context, AbstractC1204m mVar, AbstractC84640a<EffectCategoryResponse, Effect> aVar, AbstractC84700k<Effect> kVar, ViewGroup viewGroup, int i, boolean z, boolean z2, AbstractC89172b<? super AbstractC84650b.C84654c, C89391z> bVar) {
        super(context, mVar, aVar, kVar, viewGroup, i, true, false, true, bVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        this.f189303A = mVar;
        this.f189304B = aVar;
        this.f189305C = i;
        this.f189309b = z;
        this.f189307E = z2;
        this.f189308a = new ArrayList();
        C88958b<List<C89378p<EffectCategoryResponse, List<Effect>>>> bVar2 = new C88958b<>();
        C89219l.m154716b(bVar2, "");
        this.f189313x = bVar2;
    }
}
