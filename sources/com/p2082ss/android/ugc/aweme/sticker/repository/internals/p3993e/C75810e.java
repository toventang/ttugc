package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75460c;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75761c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75689aa;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75696e;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75713r;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75717v;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75687a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75692ad;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75722z;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75726a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75727b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.android.AbstractC89522b;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e */
public final class C75810e implements AbstractC75761c {

    /* renamed from: a */
    public final List<EffectCategoryModel> f170293a = new ArrayList();

    /* renamed from: b */
    public final Map<String, List<Effect>> f170294b = new LinkedHashMap();

    /* renamed from: c */
    public final CopyOnWriteArrayList<C75727b> f170295c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public C1213t<List<String>> f170296d;

    /* renamed from: e */
    public final AbstractC89244h<C1213t<C35324a<PanelInfoModel>>> f170297e;

    /* renamed from: f */
    public final AbstractC89244h<C1213t<C35324a<SearchEffectResponseV2>>> f170298f;

    /* renamed from: g */
    public final AbstractC89244h<C1213t<C35324a<RecommendSearchWordsResponse>>> f170299g;

    /* renamed from: h */
    public final AbstractC89244h<C1213t<C35324a<FetchHotEffectResponse>>> f170300h;

    /* renamed from: i */
    public List<String> f170301i;

    /* renamed from: j */
    public final AbstractC89244h<AbstractC75713r> f170302j;

    /* renamed from: k */
    public final AbstractC89244h<AbstractC75704j> f170303k;

    /* renamed from: l */
    public final List<EffectCategoryModel> f170304l;

    /* renamed from: m */
    private final AbstractC89244h f170305m = C89250i.m154773a((AbstractC89171a) C75817c.f170323a);

    /* renamed from: n */
    private final Map<String, Effect> f170306n = new HashMap();

    /* renamed from: o */
    private final Map<String, Effect> f170307o = new HashMap();

    /* renamed from: p */
    private AbstractC75718w f170308p;

    /* renamed from: q */
    private final C88411a f170309q;

    /* renamed from: r */
    private final AbstractC89244h f170310r;

    /* renamed from: s */
    private final AbstractC89244h<LinkedHashMap<String, C1213t<C35324a<CategoryEffectModel>>>> f170311s;

    /* renamed from: t */
    private final AbstractC89244h<AbstractC75717v> f170312t;

    static {
        Covode.recordClassIndex(88744);
    }

    /* renamed from: i */
    public final AbstractC89516am mo119517i() {
        return (AbstractC89516am) this.f170305m.getValue();
    }

    /* renamed from: j */
    public final C1213t<List<EffectCategoryModel>> mo119518j() {
        return (C1213t) this.f170310r.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: a */
    public final Map<String, Effect> mo119466a() {
        return this.f170306n;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: d */
    public final LiveData<List<String>> mo119472d() {
        return this.f170296d;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$a */
    static final class C75815a extends AbstractC89220m implements AbstractC89171a<LinkedHashMap<String, C1213t<C35324a<CategoryEffectModel>>>> {

        /* renamed from: a */
        public static final C75815a f170321a = new C75815a();

        static {
            Covode.recordClassIndex(88749);
        }

        C75815a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkedHashMap<String, C1213t<C35324a<CategoryEffectModel>>> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$d */
    static final class C75818d extends AbstractC89220m implements AbstractC89171a<C1213t<C35324a<FetchHotEffectResponse>>> {

        /* renamed from: a */
        public static final C75818d f170324a = new C75818d();

        static {
            Covode.recordClassIndex(88752);
        }

        C75818d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C35324a<FetchHotEffectResponse>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$p */
    static final class C75833p extends AbstractC89220m implements AbstractC89171a<C1213t<C35324a<PanelInfoModel>>> {

        /* renamed from: a */
        public static final C75833p f170345a = new C75833p();

        static {
            Covode.recordClassIndex(88767);
        }

        C75833p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C35324a<PanelInfoModel>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$x */
    static final class C75848x extends AbstractC89220m implements AbstractC89171a<C1213t<C35324a<RecommendSearchWordsResponse>>> {

        /* renamed from: a */
        public static final C75848x f170383a = new C75848x();

        static {
            Covode.recordClassIndex(88782);
        }

        C75848x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C35324a<RecommendSearchWordsResponse>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$y */
    static final class C75849y extends AbstractC89220m implements AbstractC89171a<C1213t<C35324a<SearchEffectResponseV2>>> {

        /* renamed from: a */
        public static final C75849y f170384a = new C75849y();

        static {
            Covode.recordClassIndex(88783);
        }

        C75849y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C35324a<SearchEffectResponseV2>> invoke() {
            return new C1213t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: e */
    public final LiveData<List<EffectCategoryModel>> mo119473e() {
        return mo119518j();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$c */
    static final class C75817c extends AbstractC89220m implements AbstractC89171a<AbstractC89516am> {

        /* renamed from: a */
        public static final C75817c f170323a = new C75817c();

        static {
            Covode.recordClassIndex(88751);
        }

        C75817c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89516am invoke() {
            return C89517an.m155448a(C89546bf.f203266a.plus(C89582cd.m155517a(null)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: c */
    public final Map<String, LiveData<C35324a<CategoryEffectModel>>> mo119471c() {
        return this.f170311s.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: f */
    public final LiveData<C35324a<SearchEffectResponseV2>> mo119474f() {
        return this.f170298f.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: g */
    public final LiveData<C35324a<RecommendSearchWordsResponse>> mo119475g() {
        return this.f170299g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$b */
    static final class C75816b extends AbstractC89220m implements AbstractC89171a<C1213t<List<? extends EffectCategoryModel>>> {

        /* renamed from: a */
        final /* synthetic */ C75810e f170322a;

        static {
            Covode.recordClassIndex(88750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75816b(C75810e eVar) {
            super(0);
            this.f170322a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<List<? extends EffectCategoryModel>> invoke() {
            C1213t tVar = new C1213t();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f170322a.f170304l);
            this.f170322a.f170303k.getValue().mo119432a(arrayList);
            tVar.setValue(arrayList);
            return tVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75761c
    /* renamed from: h */
    public final void mo119507h() {
        this.f170309q.mo142944a();
        AbstractC89516am i = mo119517i();
        AbstractC89568bz bzVar = (AbstractC89568bz) i.mo20678a().get(AbstractC89568bz.f203287c);
        if (bzVar != null) {
            bzVar.mo144011o();
            return;
        }
        throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(i)).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r0.f83351b == com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a.EnumC35325a.ERROR) goto L_0x002f;
     */
    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.LiveData<com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a<com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel>> mo119469b() {
        /*
            r2 = this;
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f170297e
            boolean r0 = r0.isInitialized()
            if (r0 == 0) goto L_0x002f
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f170297e
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x002f
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f170297e
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0027
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0027:
            com.ss.android.ugc.aweme.bw.b.a r0 = (com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a) r0
            com.ss.android.ugc.aweme.bw.b.a$a r1 = r0.f83351b
            com.ss.android.ugc.aweme.bw.b.a$a r0 = com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a.EnumC35325a.ERROR
            if (r1 != r0) goto L_0x004a
        L_0x002f:
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f170297e
            java.lang.Object r1 = r0.getValue()
            androidx.lifecycle.t r1 = (androidx.lifecycle.C1213t) r1
            com.ss.android.ugc.aweme.bw.b.a r0 = com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a.m72278a()
            r1.setValue(r0)
            com.ss.android.ugc.aweme.sticker.repository.a.w r1 = r2.f170308p
            if (r1 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.sticker.repository.c.d r0 = new com.ss.android.ugc.aweme.sticker.repository.c.d
            r0.<init>()
            r1.mo119454a(r0)
        L_0x004a:
            h.h<androidx.lifecycle.t<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel>>> r0 = r2.f170297e
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.mo119469b():androidx.lifecycle.LiveData");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: a */
    public final void mo119467a(String str) {
        C89219l.m154721d(str, "");
        AbstractC75718w wVar = this.f170308p;
        if (wVar != null) {
            wVar.mo119452a(new C75726a(str, null, true, 30));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
    /* renamed from: b */
    public final void mo119470b(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        for (T t : list) {
            this.f170307o.put(t.getEffectId(), t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$j */
    public static final class C75826j<T> implements AbstractC88433f<C89378p<? extends String, ? extends C35324a<CategoryEffectModel>>> {

        /* renamed from: a */
        final /* synthetic */ C75810e f170336a;

        static {
            Covode.recordClassIndex(88760);
        }

        C75826j(C75810e eVar) {
            this.f170336a = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$j$a */
        static final class C75827a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f170337a;

            /* renamed from: b */
            final /* synthetic */ CategoryEffectModel f170338b;

            /* renamed from: c */
            final /* synthetic */ C75826j f170339c;

            static {
                Covode.recordClassIndex(88761);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C75827a(CategoryEffectModel categoryEffectModel, AbstractC89124d dVar, C75826j jVar) {
                super(2, dVar);
                this.f170338b = categoryEffectModel;
                this.f170339c = jVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C75827a(this.f170338b, dVar, this.f170339c);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C75827a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f170337a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C75810e eVar = this.f170339c.f170336a;
                    CategoryEffectModel categoryEffectModel = this.f170338b;
                    C89219l.m154716b(categoryEffectModel, "");
                    this.f170337a = 1;
                    if (eVar.mo119515a(categoryEffectModel, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(p4600h.C89378p<? extends java.lang.String, ? extends com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a<com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel>> r6) {
            /*
                r5 = this;
                h.p r6 = (p4600h.C89378p) r6
                java.lang.Object r0 = r6.getSecond()
                com.ss.android.ugc.aweme.bw.b.a r0 = (com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a) r0
                M r4 = r0.f83350a
                com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r4 = (com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel) r4
                if (r4 == 0) goto L_0x004a
                java.util.List r1 = r4.getCollectEffects()
                if (r1 == 0) goto L_0x0019
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r0 = r5.f170336a
                r0.mo119468a(r1)
            L_0x0019:
                java.util.List r1 = r4.getBindEffects()
                if (r1 == 0) goto L_0x0024
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r0 = r5.f170336a
                r0.mo119470b(r1)
            L_0x0024:
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r0 = r5.f170336a
                java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>> r2 = r0.f170294b
                java.lang.String r1 = r4.getCategoryKey()
                java.util.List r0 = r4.getEffects()
                if (r0 != 0) goto L_0x0034
                h.a.z r0 = p4600h.p4601a.C89086z.INSTANCE
            L_0x0034:
                r2.put(r1, r0)
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r0 = r5.f170336a
                kotlinx.coroutines.am r3 = r0.mo119517i()
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e$j$a r2 = new com.ss.android.ugc.aweme.sticker.repository.internals.e.e$j$a
                r1 = 0
                r2.<init>(r4, r1, r5)
                r0 = 3
                kotlinx.coroutines.bz r0 = kotlinx.coroutines.C89622g.m155550b(r3, r1, r2, r0)
                if (r0 != 0) goto L_0x005d
            L_0x004a:
                com.ss.android.ugc.aweme.sticker.repository.internals.e.e r1 = r5.f170336a
                java.lang.Object r0 = r6.getFirst()
                java.lang.String r0 = (java.lang.String) r0
                androidx.lifecycle.t r1 = r1.mo119516b(r0)
                java.lang.Object r0 = r6.getSecond()
                r1.setValue(r0)
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.C75826j.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$e */
    static final class C75819e<T, R> implements AbstractC88434g<AbstractC75689aa<?>, C35324a<PanelInfoModel>> {

        /* renamed from: a */
        public static final C75819e f170325a = new C75819e();

        static {
            Covode.recordClassIndex(88753);
        }

        C75819e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C35324a<PanelInfoModel> apply(AbstractC75689aa<?> aaVar) {
            AbstractC75689aa<?> aaVar2 = aaVar;
            C89219l.m154721d(aaVar2, "");
            if (aaVar2 instanceof C75722z) {
                return C35324a.m72278a();
            }
            if (aaVar2 instanceof C75692ad) {
                T t = aaVar2.f170118b;
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel");
                return C35324a.m72281a((Object) t);
            } else if (aaVar2 instanceof C75687a) {
                return C35324a.m72282a((Throwable) aaVar2.f170118b);
            } else {
                throw new C89376n();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$f */
    static final class C75820f<T> implements AbstractC88433f<C35324a<FetchHotEffectResponse>> {

        /* renamed from: a */
        final /* synthetic */ C75810e f170326a;

        static {
            Covode.recordClassIndex(88754);
        }

        C75820f(C75810e eVar) {
            this.f170326a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C35324a<FetchHotEffectResponse> aVar) {
            C35324a<FetchHotEffectResponse> aVar2 = aVar;
            M m = aVar2.f83350a;
            if (m != null) {
                C75810e eVar = this.f170326a;
                C89219l.m154716b(m, "");
                C89219l.m154716b(aVar2, "");
                AbstractC89568bz unused = C89624i.m155555a(eVar.mo119517i(), null, null, new C75838t(eVar, m, aVar2, null), 3);
                return;
            }
            this.f170326a.f170300h.getValue().setValue(aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$g */
    public static final class C75821g<T> implements AbstractC88433f<AbstractC75696e.AbstractC75697a> {

        /* renamed from: a */
        final /* synthetic */ C75810e f170327a;

        static {
            Covode.recordClassIndex(88755);
        }

        C75821g(C75810e eVar) {
            this.f170327a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC75696e.AbstractC75697a aVar) {
            CategoryEffectModel categoryEffectModel;
            AbstractC75696e.AbstractC75697a aVar2 = aVar;
            if (aVar2 != null && (categoryEffectModel = C75723b.m132878b(this.f170327a).get(aVar2.mo119416a())) != null) {
                AbstractC89568bz unused = C89624i.m155555a(this.f170327a.mo119517i(), null, null, new C75822a(categoryEffectModel, null, aVar2, this), 3);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$g$a */
        public static final class C75822a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f170328a;

            /* renamed from: b */
            final /* synthetic */ CategoryEffectModel f170329b;

            /* renamed from: c */
            final /* synthetic */ AbstractC75696e.AbstractC75697a f170330c;

            /* renamed from: d */
            final /* synthetic */ C75821g f170331d;

            static {
                Covode.recordClassIndex(88756);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C75822a(CategoryEffectModel categoryEffectModel, AbstractC89124d dVar, AbstractC75696e.AbstractC75697a aVar, C75821g gVar) {
                super(2, dVar);
                this.f170329b = categoryEffectModel;
                this.f170330c = aVar;
                this.f170331d = gVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C75822a(this.f170329b, dVar, this.f170330c, this.f170331d);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C75822a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f170328a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    ArrayList arrayList = new ArrayList(this.f170329b.getEffects());
                    Iterator<T> it = this.f170330c.mo119417b().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    Map<String, List<Effect>> map = this.f170331d.f170327a.f170294b;
                    String a = this.f170330c.mo119416a();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : arrayList) {
                        if (hashSet.add(t.getEffectId())) {
                            arrayList2.add(t);
                        }
                    }
                    map.put(a, arrayList2);
                    CategoryEffectModel categoryEffectModel = this.f170329b;
                    List<Effect> list = this.f170331d.f170327a.f170294b.get(this.f170330c.mo119416a());
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    categoryEffectModel.setEffects(list);
                    AbstractC89522b bVar = C75460c.f169566a;
                    C758231 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                        /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.C75821g.C75822a.C758231 */

                        /* renamed from: a */
                        int f170332a;

                        /* renamed from: b */
                        final /* synthetic */ C75822a f170333b;

                        static {
                            Covode.recordClassIndex(88757);
                        }

                        {
                            this.f170333b = r2;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return 
                        }

                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$h */
                        static final class C75824h<T> implements AbstractC88433f<C35324a<PanelInfoModel>> {

                            /* renamed from: a */
                            final /* synthetic */ C75810e f170334a;

                            static {
                                Covode.recordClassIndex(88758);
                            }

                            C75824h(C75810e eVar) {
                                this.f170334a = eVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88433f
                            public final /* synthetic */ void accept(C35324a<PanelInfoModel> aVar) {
                                C35324a<PanelInfoModel> aVar2 = aVar;
                                M m = aVar2.f83350a;
                                if (m != null) {
                                    C75810e eVar = this.f170334a;
                                    C89219l.m154716b(m, "");
                                    C89219l.m154716b(aVar2, "");
                                    AbstractC89568bz unused = C89624i.m155555a(eVar.mo119517i(), null, null, new C75840u(eVar, m, aVar2, null), 3);
                                    return;
                                }
                                this.f170334a.f170297e.getValue().setValue(aVar2);
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$k */
                        static final class C75828k<T, R> implements AbstractC88434g<AbstractC75689aa<?>, C35324a<SearchEffectResponseV2>> {

                            /* renamed from: a */
                            public static final C75828k f170340a = new C75828k();

                            static {
                                Covode.recordClassIndex(88762);
                            }

                            C75828k() {
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88434g
                            public final /* synthetic */ C35324a<SearchEffectResponseV2> apply(AbstractC75689aa<?> aaVar) {
                                AbstractC75689aa<?> aaVar2 = aaVar;
                                C89219l.m154721d(aaVar2, "");
                                if (aaVar2 instanceof C75722z) {
                                    return C35324a.m72278a();
                                }
                                if (aaVar2 instanceof C75692ad) {
                                    T t = aaVar2.f170118b;
                                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2");
                                    return C35324a.m72281a((Object) t);
                                } else if (aaVar2 instanceof C75687a) {
                                    return C35324a.m72282a((Throwable) aaVar2.f170118b);
                                } else {
                                    throw new C89376n();
                                }
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$l */
                        static final class C75829l<T> implements AbstractC88433f<C35324a<SearchEffectResponseV2>> {

                            /* renamed from: a */
                            final /* synthetic */ C75810e f170341a;

                            static {
                                Covode.recordClassIndex(88763);
                            }

                            C75829l(C75810e eVar) {
                                this.f170341a = eVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88433f
                            public final /* synthetic */ void accept(C35324a<SearchEffectResponseV2> aVar) {
                                C35324a<SearchEffectResponseV2> aVar2 = aVar;
                                M m = aVar2.f83350a;
                                if (m != null) {
                                    C75810e eVar = this.f170341a;
                                    C89219l.m154716b(m, "");
                                    C89219l.m154716b(aVar2, "");
                                    AbstractC89568bz unused = C89624i.m155555a(eVar.mo119517i(), null, null, new C75846w(eVar, m, aVar2, null), 3);
                                    return;
                                }
                                this.f170341a.f170298f.getValue().setValue(aVar2);
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$m */
                        static final class C75830m<T, R> implements AbstractC88434g<AbstractC75689aa<?>, C35324a<RecommendSearchWordsResponse>> {

                            /* renamed from: a */
                            public static final C75830m f170342a = new C75830m();

                            static {
                                Covode.recordClassIndex(88764);
                            }

                            C75830m() {
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88434g
                            public final /* synthetic */ C35324a<RecommendSearchWordsResponse> apply(AbstractC75689aa<?> aaVar) {
                                AbstractC75689aa<?> aaVar2 = aaVar;
                                C89219l.m154721d(aaVar2, "");
                                if (aaVar2 instanceof C75722z) {
                                    return C35324a.m72278a();
                                }
                                if (aaVar2 instanceof C75692ad) {
                                    T t = aaVar2.f170118b;
                                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse");
                                    return C35324a.m72281a((Object) t);
                                } else if (aaVar2 instanceof C75687a) {
                                    return C35324a.m72282a((Throwable) aaVar2.f170118b);
                                } else {
                                    throw new C89376n();
                                }
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$n */
                        static final class C75831n<T> implements AbstractC88433f<C35324a<RecommendSearchWordsResponse>> {

                            /* renamed from: a */
                            final /* synthetic */ C75810e f170343a;

                            static {
                                Covode.recordClassIndex(88765);
                            }

                            C75831n(C75810e eVar) {
                                this.f170343a = eVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88433f
                            public final /* synthetic */ void accept(C35324a<RecommendSearchWordsResponse> aVar) {
                                C35324a<RecommendSearchWordsResponse> aVar2 = aVar;
                                if (aVar2.f83350a != null) {
                                    C75810e eVar = this.f170343a;
                                    C89219l.m154716b(aVar2, "");
                                    AbstractC89568bz unused = C89624i.m155555a(eVar.mo119517i(), null, null, new C75844v(eVar, aVar2, null), 3);
                                    return;
                                }
                                this.f170343a.f170299g.getValue().setValue(aVar2);
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$o */
                        static final class C75832o<T, R> implements AbstractC88434g<AbstractC75689aa<?>, C35324a<FetchHotEffectResponse>> {

                            /* renamed from: a */
                            public static final C75832o f170344a = new C75832o();

                            static {
                                Covode.recordClassIndex(88766);
                            }

                            C75832o() {
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88434g
                            public final /* synthetic */ C35324a<FetchHotEffectResponse> apply(AbstractC75689aa<?> aaVar) {
                                AbstractC75689aa<?> aaVar2 = aaVar;
                                C89219l.m154721d(aaVar2, "");
                                if (aaVar2 instanceof C75722z) {
                                    return C35324a.m72278a();
                                }
                                if (aaVar2 instanceof C75692ad) {
                                    T t = aaVar2.f170118b;
                                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse");
                                    return C35324a.m72281a((Object) t);
                                } else if (aaVar2 instanceof C75687a) {
                                    return C35324a.m72282a((Throwable) aaVar2.f170118b);
                                } else {
                                    throw new C89376n();
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$s */
                        public static final class C75837s extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f170348a;

                            /* renamed from: b */
                            final /* synthetic */ C75810e f170349b;

                            /* renamed from: c */
                            final /* synthetic */ String f170350c;

                            /* renamed from: d */
                            final /* synthetic */ CategoryEffectModel f170351d;

                            static {
                                Covode.recordClassIndex(88771);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C75837s(C75810e eVar, String str, CategoryEffectModel categoryEffectModel, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f170349b = eVar;
                                this.f170350c = str;
                                this.f170351d = categoryEffectModel;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C75837s(this.f170349b, this.f170350c, this.f170351d, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C75837s) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                if (this.f170348a == 0) {
                                    C89382r.m154942a(obj);
                                    this.f170349b.mo119516b(this.f170350c).setValue(C35324a.m72281a(this.f170351d));
                                    return C89391z.f203057a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$v */
                        public static final class C75844v extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f170372a;

                            /* renamed from: b */
                            final /* synthetic */ C75810e f170373b;

                            /* renamed from: c */
                            final /* synthetic */ C35324a f170374c;

                            static {
                                Covode.recordClassIndex(88778);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C75844v(C75810e eVar, C35324a aVar, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f170373b = eVar;
                                this.f170374c = aVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C75844v(this.f170373b, this.f170374c, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C75844v) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f170372a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    AbstractC89522b bVar = C75460c.f169566a;
                                    C758451 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                        /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.C75844v.C758451 */

                                        /* renamed from: a */
                                        int f170375a;

                                        /* renamed from: b */
                                        final /* synthetic */ C75844v f170376b;

                                        static {
                                            Covode.recordClassIndex(88779);
                                        }

                                        {
                                            this.f170376b = r2;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return 

                                            /* renamed from: b */
                                            public final C1213t<C35324a<CategoryEffectModel>> mo119516b(String str) {
                                                C1213t<C35324a<CategoryEffectModel>> tVar = this.f170311s.getValue().get(str);
                                                if (tVar != null) {
                                                    return tVar;
                                                }
                                                C1213t<C35324a<CategoryEffectModel>> tVar2 = new C1213t<>();
                                                this.f170311s.getValue().put(str, tVar2);
                                                return tVar2;
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$i */
                                            static final class C75825i<T, R> implements AbstractC88434g<C89378p<? extends String, ? extends AbstractC75689aa<?>>, C89378p<? extends String, ? extends C35324a<CategoryEffectModel>>> {

                                                /* renamed from: a */
                                                public static final C75825i f170335a = new C75825i();

                                                static {
                                                    Covode.recordClassIndex(88759);
                                                }

                                                C75825i() {
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                                                public final /* synthetic */ C89378p<? extends String, ? extends C35324a<CategoryEffectModel>> apply(C89378p<? extends String, ? extends AbstractC75689aa<?>> pVar) {
                                                    C89378p<? extends String, ? extends AbstractC75689aa<?>> pVar2 = pVar;
                                                    C89219l.m154721d(pVar2, "");
                                                    Object second = pVar2.getSecond();
                                                    if (second instanceof C75722z) {
                                                        return C89387v.m154943a(pVar2.getFirst(), C35324a.m72278a());
                                                    }
                                                    if (second instanceof C75692ad) {
                                                        Object first = pVar2.getFirst();
                                                        T t = ((AbstractC75689aa) pVar2.getSecond()).f170118b;
                                                        Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel");
                                                        return C89387v.m154943a(first, C35324a.m72281a((Object) t));
                                                    } else if (second instanceof C75687a) {
                                                        Object first2 = pVar2.getFirst();
                                                        T t2 = ((AbstractC75689aa) pVar2.getSecond()).f170118b;
                                                        Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.Throwable");
                                                        return C89387v.m154943a(first2, C35324a.m72282a((Throwable) t2));
                                                    } else {
                                                        throw new C89376n();
                                                    }
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$t */
                                            public static final class C75838t extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                                /* renamed from: a */
                                                int f170352a;

                                                /* renamed from: b */
                                                final /* synthetic */ C75810e f170353b;

                                                /* renamed from: c */
                                                final /* synthetic */ FetchHotEffectResponse f170354c;

                                                /* renamed from: d */
                                                final /* synthetic */ C35324a f170355d;

                                                static {
                                                    Covode.recordClassIndex(88772);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C75838t(C75810e eVar, FetchHotEffectResponse fetchHotEffectResponse, C35324a aVar, AbstractC89124d dVar) {
                                                    super(2, dVar);
                                                    this.f170353b = eVar;
                                                    this.f170354c = fetchHotEffectResponse;
                                                    this.f170355d = aVar;
                                                }

                                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                    C89219l.m154721d(dVar, "");
                                                    return new C75838t(this.f170353b, this.f170354c, this.f170355d, dVar);
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                                public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                                    return ((C75838t) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                                }

                                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                public final Object invokeSuspend(Object obj) {
                                                    EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                                    int i = this.f170352a;
                                                    if (i == 0) {
                                                        C89382r.m154942a(obj);
                                                        List<Effect> g = C89070n.m154585g((Collection) this.f170354c.getEffects());
                                                        this.f170353b.f170302j.getValue().mo119442a("", g);
                                                        this.f170354c.setEffects(g);
                                                        List<Effect> collection = this.f170354c.getCollection();
                                                        if (collection != null && !collection.isEmpty()) {
                                                            this.f170353b.mo119468a(this.f170354c.getCollection());
                                                        }
                                                        AbstractC89522b bVar = C75460c.f169566a;
                                                        C758391 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                                            /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.C75838t.C758391 */

                                                            /* renamed from: a */
                                                            int f170356a;

                                                            /* renamed from: b */
                                                            final /* synthetic */ C75838t f170357b;

                                                            static {
                                                                Covode.recordClassIndex(88773);
                                                            }

                                                            {
                                                                this.f170357b = r2;
                                                            }

                                                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                C89219l.m154721d(dVar, "");
                                                                return 

                                                                /* access modifiers changed from: package-private */
                                                                /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$u */
                                                                public static final class C75840u extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                                                    /* renamed from: a */
                                                                    int f170358a;

                                                                    /* renamed from: b */
                                                                    final /* synthetic */ C75810e f170359b;

                                                                    /* renamed from: c */
                                                                    final /* synthetic */ PanelInfoModel f170360c;

                                                                    /* renamed from: d */
                                                                    final /* synthetic */ C35324a f170361d;

                                                                    /* renamed from: e */
                                                                    private /* synthetic */ Object f170362e;

                                                                    static {
                                                                        Covode.recordClassIndex(88774);
                                                                    }

                                                                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                    C75840u(C75810e eVar, PanelInfoModel panelInfoModel, C35324a aVar, AbstractC89124d dVar) {
                                                                        super(2, dVar);
                                                                        this.f170359b = eVar;
                                                                        this.f170360c = panelInfoModel;
                                                                        this.f170361d = aVar;
                                                                    }

                                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                        C89219l.m154721d(dVar, "");
                                                                        C75840u uVar = new C75840u(this.f170359b, this.f170360c, this.f170361d, dVar);
                                                                        uVar.f170362e = obj;
                                                                        return uVar;
                                                                    }

                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                                                    public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                                                        return ((C75840u) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                                                    }

                                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                                                        int i = this.f170358a;
                                                                        if (i == 0) {
                                                                            C89382r.m154942a(obj);
                                                                            List<EffectCategoryModel> list = this.f170359b.f170293a;
                                                                            list.clear();
                                                                            Boolean.valueOf(list.addAll(this.f170360c.getCategoryList()));
                                                                            final AbstractC89531av avVar = C89624i.m155556b((AbstractC89516am) this.f170362e, null, null, new C75842a(this, null), 3);
                                                                            AbstractC89522b bVar = C75460c.f169566a;
                                                                            C758411 r0 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                                                                /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.C75840u.C758411 */

                                                                                /* renamed from: a */
                                                                                int f170363a;

                                                                                /* renamed from: b */
                                                                                final /* synthetic */ C75840u f170364b;

                                                                                static {
                                                                                    Covode.recordClassIndex(88775);
                                                                                }

                                                                                {
                                                                                    this.f170364b = r2;
                                                                                }

                                                                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                                    C89219l.m154721d(dVar, "");
                                                                                    return 

                                                                                    /* access modifiers changed from: package-private */
                                                                                    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$w */
                                                                                    public static final class C75846w extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                                                                        /* renamed from: a */
                                                                                        int f170377a;

                                                                                        /* renamed from: b */
                                                                                        final /* synthetic */ C75810e f170378b;

                                                                                        /* renamed from: c */
                                                                                        final /* synthetic */ SearchEffectResponseV2 f170379c;

                                                                                        /* renamed from: d */
                                                                                        final /* synthetic */ C35324a f170380d;

                                                                                        static {
                                                                                            Covode.recordClassIndex(88780);
                                                                                        }

                                                                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                        C75846w(C75810e eVar, SearchEffectResponseV2 searchEffectResponseV2, C35324a aVar, AbstractC89124d dVar) {
                                                                                            super(2, dVar);
                                                                                            this.f170378b = eVar;
                                                                                            this.f170379c = searchEffectResponseV2;
                                                                                            this.f170380d = aVar;
                                                                                        }

                                                                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                                            C89219l.m154721d(dVar, "");
                                                                                            return new C75846w(this.f170378b, this.f170379c, this.f170380d, dVar);
                                                                                        }

                                                                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                                                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                                                                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                                                                            return ((C75846w) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                                                                        }

                                                                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                                        public final Object invokeSuspend(Object obj) {
                                                                                            List<Effect> list;
                                                                                            List<Effect> bindEffects;
                                                                                            List<Effect> collectionList;
                                                                                            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                                                                            int i = this.f170377a;
                                                                                            if (i == 0) {
                                                                                                C89382r.m154942a(obj);
                                                                                                SearchEffectModel data = this.f170379c.getData();
                                                                                                if (data == null || (list = data.getEffectList()) == null) {
                                                                                                    list = new ArrayList<>();
                                                                                                }
                                                                                                List<Effect> g = C89070n.m154585g((Collection) list);
                                                                                                this.f170378b.f170302j.getValue().mo119442a("", g);
                                                                                                SearchEffectModel data2 = this.f170379c.getData();
                                                                                                if (data2 != null) {
                                                                                                    data2.setEffectList(g);
                                                                                                }
                                                                                                SearchEffectModel data3 = this.f170379c.getData();
                                                                                                if (!(data3 == null || (collectionList = data3.getCollectionList()) == null)) {
                                                                                                    this.f170378b.mo119468a(collectionList);
                                                                                                }
                                                                                                SearchEffectModel data4 = this.f170379c.getData();
                                                                                                if (!(data4 == null || (bindEffects = data4.getBindEffects()) == null)) {
                                                                                                    this.f170378b.mo119470b(bindEffects);
                                                                                                }
                                                                                                AbstractC89522b bVar = C75460c.f169566a;
                                                                                                C758471 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                                                                                    /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.C75846w.C758471 */

                                                                                                    /* renamed from: a */
                                                                                                    int f170381a;

                                                                                                    /* renamed from: b */
                                                                                                    final /* synthetic */ C75846w f170382b;

                                                                                                    static {
                                                                                                        Covode.recordClassIndex(88781);
                                                                                                    }

                                                                                                    {
                                                                                                        this.f170382b = r2;
                                                                                                    }

                                                                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                                                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                                                        C89219l.m154721d(dVar, "");
                                                                                                        return 

                                                                                                        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75761c
                                                                                                        /* renamed from: a */
                                                                                                        public final void mo119506a(AbstractC75749b bVar) {
                                                                                                            C89219l.m154721d(bVar, "");
                                                                                                            this.f170308p = bVar;
                                                                                                            this.f170309q.mo142945a(bVar.mo119493k().mo143292d(C75819e.f170325a).mo143261a(C88392a.m153583a()).mo143289d(new C75824h(this)));
                                                                                                            this.f170309q.mo142945a(bVar.mo119494l().mo143292d(C75825i.f170335a).mo143261a(C88392a.m153583a()).mo143289d(new C75826j(this)));
                                                                                                            this.f170309q.mo142945a(bVar.mo119495m().mo143292d(C75828k.f170340a).mo143261a(C88392a.m153583a()).mo143289d(new C75829l(this)));
                                                                                                            this.f170309q.mo142945a(bVar.mo119496n().mo143292d(C75830m.f170342a).mo143261a(C88392a.m153583a()).mo143289d(new C75831n(this)));
                                                                                                            this.f170309q.mo142945a(bVar.mo119497o().mo143292d(C75832o.f170344a).mo143261a(C88392a.m153583a()).mo143289d(new C75820f(this)));
                                                                                                            this.f170309q.mo142945a(bVar.mo119498p().mo143261a(C88392a.m153583a()).mo143254a(new C75821g(this), C88446a.f200698d));
                                                                                                        }

                                                                                                        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
                                                                                                        /* renamed from: a */
                                                                                                        public final void mo119468a(List<? extends Effect> list) {
                                                                                                            C89219l.m154721d(list, "");
                                                                                                            for (T t : list) {
                                                                                                                this.f170306n.put(t.getEffectId(), t);
                                                                                                            }
                                                                                                        }

                                                                                                        /* access modifiers changed from: package-private */
                                                                                                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$q */
                                                                                                        public static final class C75834q extends AbstractC89220m implements AbstractC89183m<String, List<? extends Effect>, List<? extends Effect>> {

                                                                                                            /* renamed from: a */
                                                                                                            final /* synthetic */ C75810e f170346a;

                                                                                                            static {
                                                                                                                Covode.recordClassIndex(88768);
                                                                                                            }

                                                                                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                                            C75834q(C75810e eVar) {
                                                                                                                super(2);
                                                                                                                this.f170346a = eVar;
                                                                                                            }

                                                                                                            /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$q$a */
                                                                                                            public static final class C75835a<T> implements Comparator<T> {
                                                                                                                static {
                                                                                                                    Covode.recordClassIndex(88769);
                                                                                                                }

                                                                                                                @Override // java.util.Comparator
                                                                                                                public final int compare(T t, T t2) {
                                                                                                                    return C89090a.m154604a(Integer.valueOf(t2.f170139c), Integer.valueOf(t.f170139c));
                                                                                                                }
                                                                                                            }

                                                                                                            /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
                                                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                                                            /* renamed from: a */
                                                                                                            public final List<Effect> invoke(String str, List<? extends Effect> list) {
                                                                                                                boolean z;
                                                                                                                C89219l.m154721d(str, "");
                                                                                                                C89219l.m154721d(list, "");
                                                                                                                CopyOnWriteArrayList<C75727b> copyOnWriteArrayList = this.f170346a.f170295c;
                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                Iterator<T> it = copyOnWriteArrayList.iterator();
                                                                                                                while (true) {
                                                                                                                    boolean z2 = false;
                                                                                                                    if (!it.hasNext()) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    T next = it.next();
                                                                                                                    try {
                                                                                                                        z2 = C89219l.m154714a((Object) str, (Object) C75723b.m132877a(this.f170346a).get(next.f170138b).getKey());
                                                                                                                    } catch (Exception unused) {
                                                                                                                    }
                                                                                                                    if (z2) {
                                                                                                                        arrayList.add(next);
                                                                                                                    }
                                                                                                                }
                                                                                                                ArrayList arrayList2 = arrayList;
                                                                                                                if (!arrayList2.isEmpty()) {
                                                                                                                    this.f170346a.f170295c.removeAll(arrayList2);
                                                                                                                }
                                                                                                                List<C75727b> a = C89070n.m154553a((Iterable) arrayList2, (Comparator) new C75835a());
                                                                                                                ArrayList arrayList3 = new ArrayList();
                                                                                                                for (C75727b bVar : a) {
                                                                                                                    C89070n.m154535a((Collection) arrayList3, (Iterable) bVar.f170137a);
                                                                                                                }
                                                                                                                HashSet hashSet = new HashSet();
                                                                                                                ArrayList<com.p2082ss.ugc.effectplatform.model.Effect> arrayList4 = new ArrayList();
                                                                                                                for (Object obj : arrayList3) {
                                                                                                                    if (hashSet.add(((EffectTemplate) obj).getEffectId())) {
                                                                                                                        arrayList4.add(obj);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (!(!arrayList4.isEmpty())) {
                                                                                                                    return list;
                                                                                                                }
                                                                                                                ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) arrayList4, 10));
                                                                                                                for (com.p2082ss.ugc.effectplatform.model.Effect effect : arrayList4) {
                                                                                                                    arrayList5.add(effect.getId());
                                                                                                                }
                                                                                                                ArrayList arrayList6 = arrayList5;
                                                                                                                ArrayList arrayList7 = new ArrayList();
                                                                                                                for (Object obj2 : list) {
                                                                                                                    com.p2082ss.ugc.effectplatform.model.Effect effect2 = (com.p2082ss.ugc.effectplatform.model.Effect) obj2;
                                                                                                                    if (arrayList6.contains(effect2.getId()) || this.f170346a.f170301i.contains(effect2.getId())) {
                                                                                                                        z = true;
                                                                                                                    } else {
                                                                                                                        z = false;
                                                                                                                    }
                                                                                                                    if (!z) {
                                                                                                                        arrayList7.add(obj2);
                                                                                                                    }
                                                                                                                }
                                                                                                                this.f170346a.f170301i = C89070n.m154585g((Collection) arrayList6);
                                                                                                                return C89070n.m154572d((Collection) arrayList4, (Iterable) arrayList7);
                                                                                                            }
                                                                                                        }

                                                                                                        /* access modifiers changed from: package-private */
                                                                                                        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$r */
                                                                                                        public static final class C75836r extends AbstractC89220m implements AbstractC89183m<String, List<? extends Effect>, List<? extends Effect>> {

                                                                                                            /* renamed from: a */
                                                                                                            final /* synthetic */ C75810e f170347a;

                                                                                                            static {
                                                                                                                Covode.recordClassIndex(88770);
                                                                                                            }

                                                                                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                                            C75836r(C75810e eVar) {
                                                                                                                super(2);
                                                                                                                this.f170347a = eVar;
                                                                                                            }

                                                                                                            /* renamed from: a */
                                                                                                            public final List<Effect> invoke(String str, List<? extends Effect> list) {
                                                                                                                C89219l.m154721d(str, "");
                                                                                                                C89219l.m154721d(list, "");
                                                                                                                List<Effect> g = C89070n.m154585g((Collection) list);
                                                                                                                this.f170347a.f170302j.getValue().mo119442a(str, g);
                                                                                                                return g;
                                                                                                            }
                                                                                                        }

                                                                                                        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
                                                                                                            if (r0.f83351b == com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a.EnumC35325a.ERROR) goto L_0x0022;
                                                                                                         */
                                                                                                        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y
                                                                                                        /* renamed from: a */
                                                                                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                                                                                        public final androidx.lifecycle.LiveData<com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a<com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel>> mo119465a(java.lang.String r7, boolean r8) {
                                                                                                            /*
                                                                                                                r6 = this;
                                                                                                                java.lang.String r0 = ""
                                                                                                                p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
                                                                                                                androidx.lifecycle.t r5 = r6.mo119516b(r7)
                                                                                                                if (r8 == 0) goto L_0x0039
                                                                                                                java.lang.Object r0 = r5.getValue()
                                                                                                                if (r0 == 0) goto L_0x0022
                                                                                                                java.lang.Object r0 = r5.getValue()
                                                                                                                if (r0 != 0) goto L_0x001a
                                                                                                                p4600h.p4611f.p4613b.C89219l.m154715b()
                                                                                                            L_0x001a:
                                                                                                                com.ss.android.ugc.aweme.bw.b.a r0 = (com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a) r0
                                                                                                                com.ss.android.ugc.aweme.bw.b.a$a r1 = r0.f83351b
                                                                                                                com.ss.android.ugc.aweme.bw.b.a$a r0 = com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a.EnumC35325a.ERROR
                                                                                                                if (r1 != r0) goto L_0x0039
                                                                                                            L_0x0022:
                                                                                                                com.ss.android.ugc.aweme.bw.b.a r0 = com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a.m72278a()
                                                                                                                r5.setValue(r0)
                                                                                                                com.ss.android.ugc.aweme.sticker.repository.a.w r4 = r6.f170308p
                                                                                                                if (r4 == 0) goto L_0x0039
                                                                                                                com.ss.android.ugc.aweme.sticker.repository.c.a r3 = new com.ss.android.ugc.aweme.sticker.repository.c.a
                                                                                                                r2 = 0
                                                                                                                r1 = 0
                                                                                                                r0 = 62
                                                                                                                r3.<init>(r7, r2, r1, r0)
                                                                                                                r4.mo119452a(r3)
                                                                                                            L_0x0039:
                                                                                                                return r5
                                                                                                            */
                                                                                                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.mo119465a(java.lang.String, boolean):androidx.lifecycle.LiveData");
                                                                                                        }

                                                                                                        /* access modifiers changed from: package-private */
                                                                                                        /* renamed from: a */
                                                                                                        public final /* synthetic */ Object mo119515a(CategoryEffectModel categoryEffectModel, AbstractC89124d<? super C89391z> dVar) {
                                                                                                            C75834q qVar = new C75834q(this);
                                                                                                            C75836r rVar = new C75836r(this);
                                                                                                            String categoryKey = categoryEffectModel.getCategoryKey();
                                                                                                            List<Effect> list = this.f170294b.get(categoryKey);
                                                                                                            if (list == null) {
                                                                                                                list = C89086z.INSTANCE;
                                                                                                            }
                                                                                                            List<Effect> a = qVar.invoke(categoryKey, list);
                                                                                                            this.f170294b.put(categoryKey, a);
                                                                                                            categoryEffectModel.setEffects(rVar.invoke(categoryKey, a));
                                                                                                            Object a2 = C89624i.m155554a(C75460c.f169566a, new C75837s(this, categoryKey, categoryEffectModel, null), dVar);
                                                                                                            if (a2 == EnumC89098a.COROUTINE_SUSPENDED) {
                                                                                                                return a2;
                                                                                                            }
                                                                                                            return C89391z.f203057a;
                                                                                                        }

                                                                                                        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.r> */
                                                                                                        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.v> */
                                                                                                        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> */
                                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                                        public C75810e(AbstractC89244h<? extends AbstractC75713r> hVar, AbstractC89244h<? extends AbstractC75717v> hVar2, AbstractC89244h<? extends AbstractC75704j> hVar3, List<EffectCategoryModel> list) {
                                                                                                            C89219l.m154721d(hVar, "");
                                                                                                            C89219l.m154721d(hVar2, "");
                                                                                                            C89219l.m154721d(hVar3, "");
                                                                                                            C89219l.m154721d(list, "");
                                                                                                            this.f170302j = hVar;
                                                                                                            this.f170312t = hVar2;
                                                                                                            this.f170303k = hVar3;
                                                                                                            this.f170304l = list;
                                                                                                            C88411a aVar = new C88411a();
                                                                                                            this.f170309q = aVar;
                                                                                                            this.f170296d = new C1213t<>();
                                                                                                            this.f170310r = C89250i.m154773a((AbstractC89171a) new C75816b(this));
                                                                                                            this.f170297e = C89250i.m154773a((AbstractC89171a) C75833p.f170345a);
                                                                                                            this.f170311s = C89250i.m154773a((AbstractC89171a) C75815a.f170321a);
                                                                                                            this.f170298f = C89250i.m154773a((AbstractC89171a) C75849y.f170384a);
                                                                                                            this.f170299g = C89250i.m154773a((AbstractC89171a) C75848x.f170383a);
                                                                                                            this.f170300h = C89250i.m154773a((AbstractC89171a) C75818d.f170324a);
                                                                                                            this.f170301i = new ArrayList();
                                                                                                            aVar.mo142945a(((AbstractC75717v) hVar2.getValue()).mo119449a().mo143261a(C88392a.m153583a()).mo143289d(new AbstractC88433f<C75727b>(this) {
                                                                                                                /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.C758111 */

                                                                                                                /* renamed from: a */
                                                                                                                final /* synthetic */ C75810e f170313a;

                                                                                                                static {
                                                                                                                    Covode.recordClassIndex(88745);
                                                                                                                }

                                                                                                                {
                                                                                                                    this.f170313a = r1;
                                                                                                                }

                                                                                                                /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$1$a */
                                                                                                                static final class C75812a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                                                                                                    /* renamed from: a */
                                                                                                                    int f170314a;

                                                                                                                    /* renamed from: b */
                                                                                                                    final /* synthetic */ CategoryEffectModel f170315b;

                                                                                                                    /* renamed from: c */
                                                                                                                    final /* synthetic */ C758111 f170316c;

                                                                                                                    static {
                                                                                                                        Covode.recordClassIndex(88746);
                                                                                                                    }

                                                                                                                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                                                    C75812a(CategoryEffectModel categoryEffectModel, AbstractC89124d dVar, C758111 r4) {
                                                                                                                        super(2, dVar);
                                                                                                                        this.f170315b = categoryEffectModel;
                                                                                                                        this.f170316c = r4;
                                                                                                                    }

                                                                                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                                                                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                                                                        C89219l.m154721d(dVar, "");
                                                                                                                        return new C75812a(this.f170315b, dVar, this.f170316c);
                                                                                                                    }

                                                                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                                                                                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                                                                                                    public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                                                                                                        return ((C75812a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                                                                                                    }

                                                                                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                                                                    public final Object invokeSuspend(Object obj) {
                                                                                                                        EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                                                                                                        int i = this.f170314a;
                                                                                                                        if (i == 0) {
                                                                                                                            C89382r.m154942a(obj);
                                                                                                                            C75810e eVar = this.f170316c.f170313a;
                                                                                                                            CategoryEffectModel categoryEffectModel = this.f170315b;
                                                                                                                            this.f170314a = 1;
                                                                                                                            if (eVar.mo119515a(categoryEffectModel, this) == aVar) {
                                                                                                                                return aVar;
                                                                                                                            }
                                                                                                                        } else if (i == 1) {
                                                                                                                            C89382r.m154942a(obj);
                                                                                                                        } else {
                                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                        }
                                                                                                                        return C89391z.f203057a;
                                                                                                                    }
                                                                                                                }

                                                                                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                                                                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                                                                                                                public final /* synthetic */ void accept(C75727b bVar) {
                                                                                                                    CategoryEffectModel categoryEffectModel;
                                                                                                                    this.f170313a.f170295c.add(bVar);
                                                                                                                    CopyOnWriteArrayList<C75727b> copyOnWriteArrayList = this.f170313a.f170295c;
                                                                                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                                                                    for (T t : copyOnWriteArrayList) {
                                                                                                                        Integer valueOf = Integer.valueOf(t.f170138b);
                                                                                                                        Object obj = linkedHashMap.get(valueOf);
                                                                                                                        if (obj == null) {
                                                                                                                            obj = new ArrayList();
                                                                                                                            linkedHashMap.put(valueOf, obj);
                                                                                                                        }
                                                                                                                        ((List) obj).add(t);
                                                                                                                    }
                                                                                                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                                                                                        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel = (com.p2082ss.ugc.effectplatform.model.EffectCategoryModel) C89070n.m154561b((List) C75723b.m132877a(this.f170313a), ((Number) entry.getKey()).intValue());
                                                                                                                        if (!(effectCategoryModel == null || (categoryEffectModel = C75723b.m132878b(this.f170313a).get(effectCategoryModel.getKey())) == null)) {
                                                                                                                            AbstractC89568bz unused = C89624i.m155555a(this.f170313a.mo119517i(), null, null, new C75812a(categoryEffectModel, null, this), 3);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }));
                                                                                                            aVar.mo142945a(((AbstractC75713r) hVar.getValue()).mo119447b().mo143261a(C88392a.m153583a()).mo143289d(new AbstractC88433f<List<? extends AbstractC75730a>>(this) {
                                                                                                                /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.C75810e.C758132 */

                                                                                                                /* renamed from: a */
                                                                                                                final /* synthetic */ C75810e f170317a;

                                                                                                                static {
                                                                                                                    Covode.recordClassIndex(88747);
                                                                                                                }

                                                                                                                {
                                                                                                                    this.f170317a = r1;
                                                                                                                }

                                                                                                                /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.e$2$a */
                                                                                                                static final class C75814a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                                                                                                    /* renamed from: a */
                                                                                                                    int f170318a;

                                                                                                                    /* renamed from: b */
                                                                                                                    final /* synthetic */ CategoryEffectModel f170319b;

                                                                                                                    /* renamed from: c */
                                                                                                                    final /* synthetic */ C758132 f170320c;

                                                                                                                    static {
                                                                                                                        Covode.recordClassIndex(88748);
                                                                                                                    }

                                                                                                                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                                                                                    C75814a(CategoryEffectModel categoryEffectModel, AbstractC89124d dVar, C758132 r4) {
                                                                                                                        super(2, dVar);
                                                                                                                        this.f170319b = categoryEffectModel;
                                                                                                                        this.f170320c = r4;
                                                                                                                    }

                                                                                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                                                                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                                                                        C89219l.m154721d(dVar, "");
                                                                                                                        return new C75814a(this.f170319b, dVar, this.f170320c);
                                                                                                                    }

                                                                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                                                                                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                                                                                                    public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                                                                                                        return ((C75814a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                                                                                                    }

                                                                                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                                                                    public final Object invokeSuspend(Object obj) {
                                                                                                                        EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                                                                                                        int i = this.f170318a;
                                                                                                                        if (i == 0) {
                                                                                                                            C89382r.m154942a(obj);
                                                                                                                            C75810e eVar = this.f170320c.f170317a;
                                                                                                                            CategoryEffectModel categoryEffectModel = this.f170319b;
                                                                                                                            this.f170318a = 1;
                                                                                                                            if (eVar.mo119515a(categoryEffectModel, this) == aVar) {
                                                                                                                                return aVar;
                                                                                                                            }
                                                                                                                        } else if (i == 1) {
                                                                                                                            C89382r.m154942a(obj);
                                                                                                                        } else {
                                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                        }
                                                                                                                        return C89391z.f203057a;
                                                                                                                    }
                                                                                                                }

                                                                                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                                                                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                                                                                                                public final /* synthetic */ void accept(List<? extends AbstractC75730a> list) {
                                                                                                                    for (Map.Entry<String, CategoryEffectModel> entry : C75723b.m132878b(this.f170317a).entrySet()) {
                                                                                                                        CategoryEffectModel value = entry.getValue();
                                                                                                                        if (value != null) {
                                                                                                                            AbstractC89568bz unused = C89624i.m155555a(this.f170317a.mo119517i(), null, null, new C75814a(value, null, this), 3);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }));
                                                                                                        }
                                                                                                    }
