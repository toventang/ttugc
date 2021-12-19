package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1458h.AbstractC20270e;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50746g;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50812b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50686a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50694b;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88967f;
import p4600h.AbstractC89244h;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e */
public final class C50733e extends AbstractC20270e<C50686a> implements AbstractC50746g {

    /* renamed from: a */
    private final AbstractC89244h<FilterBoxApi> f117115a;

    /* renamed from: b */
    private final C50732d f117116b;

    /* renamed from: f */
    private final AbstractC27255q<AbstractC84398d> f117117f;

    static {
        Covode.recordClassIndex(59898);
    }

    /* renamed from: c */
    public final void mo86105c() {
        String b = this.f117116b.f117111e.mo5560b();
        C89219l.m154716b(b, "");
        this.f117117f.mo5560b().mo78910a(b, false, false, C50740f.f117124a);
    }

    @Override // com.bytedance.jedi.p1445a.p1458h.AbstractC20266a
    /* renamed from: b */
    public final AbstractC88979t<C50686a> mo33640b() {
        String b = this.f117116b.f117114h.mo5560b();
        C89219l.m154716b(b, "");
        String b2 = this.f117116b.f117112f.mo5560b();
        C89219l.m154716b(b2, "");
        String b3 = this.f117116b.f117110d.mo5560b();
        C89219l.m154716b(b3, "");
        String b4 = this.f117116b.f117109c.mo5560b();
        C89219l.m154716b(b4, "");
        String b5 = this.f117116b.f117111e.mo5560b();
        C89219l.m154716b(b5, "");
        AbstractC88979t<R> d = this.f117115a.getValue().listFilterBox(b, b2, b3, b4, b5).mo142925c(C50738e.f117122a).mo142930d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$a */
    static final class C50734a<T> implements AbstractC88433f<BaseNetResponse> {

        /* renamed from: a */
        final /* synthetic */ C50733e f117118a;

        static {
            Covode.recordClassIndex(59899);
        }

        C50734a(C50733e eVar) {
            this.f117118a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(BaseNetResponse baseNetResponse) {
            this.f117118a.mo86105c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$b */
    static final class C50735b<T, R> implements AbstractC88434g<BaseNetResponse, Object> {

        /* renamed from: a */
        public static final C50735b f117119a = new C50735b();

        static {
            Covode.recordClassIndex(59900);
        }

        C50735b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(BaseNetResponse baseNetResponse) {
            BaseNetResponse baseNetResponse2 = baseNetResponse;
            C89219l.m154721d(baseNetResponse2, "");
            return baseNetResponse2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$c */
    static final class C50736c<T> implements AbstractC88433f<BaseNetResponse> {

        /* renamed from: a */
        final /* synthetic */ C50733e f117120a;

        static {
            Covode.recordClassIndex(59901);
        }

        C50736c(C50733e eVar) {
            this.f117120a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(BaseNetResponse baseNetResponse) {
            this.f117120a.mo86105c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$d */
    static final class C50737d<T, R> implements AbstractC88434g<BaseNetResponse, Object> {

        /* renamed from: a */
        public static final C50737d f117121a = new C50737d();

        static {
            Covode.recordClassIndex(59902);
        }

        C50737d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(BaseNetResponse baseNetResponse) {
            BaseNetResponse baseNetResponse2 = baseNetResponse;
            C89219l.m154721d(baseNetResponse2, "");
            return baseNetResponse2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50746g
    /* renamed from: b */
    public final AbstractC88403ab<Object> mo86104b(Set<Integer> set) {
        C89219l.m154721d(set, "");
        if (set.isEmpty()) {
            AbstractC88403ab<Object> a = AbstractC88403ab.m153601a((AbstractC88984x) C88925a.m154171a(C88790v.f201616a));
            C89219l.m154716b(a, "");
            return a;
        }
        C88967f fVar = new C88967f();
        C89219l.m154716b(fVar, "");
        this.f117115a.getValue().updateFilterBox(m95048a(set, EnumC50745j.REMOVE)).mo142920b(new C50736c(this)).mo142925c(C50737d.f117121a).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo116431a_(fVar);
        AbstractC88403ab<Object> cM_ = fVar.cM_();
        C89219l.m154716b(cM_, "");
        return cM_;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$e */
    static final class C50738e<T, R> implements AbstractC88434g<C50742g, C50686a> {

        /* renamed from: a */
        public static final C50738e f117122a = new C50738e();

        static {
            Covode.recordClassIndex(59903);
        }

        C50738e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C50686a apply(C50742g gVar) {
            C50742g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            ArrayList<T> arrayList = new ArrayList();
            for (T t : gVar2.getData().getCategory()) {
                List<Effect> effects = gVar2.getData().getEffects();
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : effects) {
                    T t3 = t2;
                    if ((t3 instanceof FilterEffect) && t.getEffects().contains(t3.getEffectId())) {
                        arrayList2.add(t2);
                    }
                }
                List a = C89070n.m154553a((Iterable) arrayList2, (Comparator) new C50739a(t));
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) a, 10));
                for (T t4 : a) {
                    Objects.requireNonNull(t4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
                    T t5 = t4;
                    C89219l.m154721d(t5, "");
                    arrayList3.add(new C50694b(C50812b.m95166a((Effect) t5), t5.getChecked(), t5.getBuildIn()));
                }
                arrayList.add(C89387v.m154943a(t, arrayList3));
            }
            ArrayList arrayList4 = new ArrayList();
            for (T t6 : arrayList) {
                C89070n.m154535a((Collection) arrayList4, (Iterable) ((List) t6.getSecond()));
            }
            return new C50686a(arrayList4, arrayList);
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$e$a */
        public static final class C50739a<T> implements Comparator<T> {

            /* renamed from: a */
            final /* synthetic */ EffectCategoryModel f117123a;

            static {
                Covode.recordClassIndex(59904);
            }

            public C50739a(EffectCategoryModel effectCategoryModel) {
                this.f117123a = effectCategoryModel;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C89090a.m154604a(Integer.valueOf(this.f117123a.getEffects().indexOf(t.getEffectId())), Integer.valueOf(this.f117123a.getEffects().indexOf(t2.getEffectId())));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50746g
    /* renamed from: a */
    public final AbstractC88403ab<Object> mo86103a(Set<Integer> set) {
        C89219l.m154721d(set, "");
        if (set.isEmpty()) {
            AbstractC88403ab<Object> a = AbstractC88403ab.m153601a((AbstractC88984x) C88925a.m154171a(C88790v.f201616a));
            C89219l.m154716b(a, "");
            return a;
        }
        C88967f fVar = new C88967f();
        C89219l.m154716b(fVar, "");
        this.f117115a.getValue().updateFilterBox(m95048a(set, EnumC50745j.INSERT)).mo142920b(new C50734a(this)).mo142925c(C50735b.f117119a).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo116431a_(fVar);
        AbstractC88403ab<Object> cM_ = fVar.cM_();
        C89219l.m154716b(cM_, "");
        return cM_;
    }

    /* renamed from: a */
    private final C50744i m95048a(Set<Integer> set, EnumC50745j jVar) {
        String a = C89070n.m154551a(set, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        int i = jVar.f117137c;
        String b = this.f117116b.f117107a.mo5560b();
        C89219l.m154716b(b, "");
        String b2 = this.f117116b.f117111e.mo5560b();
        C89219l.m154716b(b2, "");
        String b3 = this.f117116b.f117112f.mo5560b();
        C89219l.m154716b(b3, "");
        String b4 = this.f117116b.f117113g.mo5560b();
        C89219l.m154716b(b4, "");
        String b5 = this.f117116b.f117109c.mo5560b();
        C89219l.m154716b(b5, "");
        String b6 = this.f117116b.f117114h.mo5560b();
        C89219l.m154716b(b6, "");
        String b7 = this.f117116b.f117110d.mo5560b();
        C89219l.m154716b(b7, "");
        return new C50744i(a, i, b, b2, b3, b4, b5, b6, b7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi> */
    /* JADX WARN: Multi-variable type inference failed */
    public C50733e(AbstractC89244h<? extends FilterBoxApi> hVar, C50732d dVar, AbstractC27255q<AbstractC84398d> qVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(qVar, "");
        this.f117115a = hVar;
        this.f117116b = dVar;
        this.f117117f = qVar;
    }
}
