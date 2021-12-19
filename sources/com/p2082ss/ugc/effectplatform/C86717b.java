package com.p2082ss.ugc.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.algorithm.C86706c;
import com.p2082ss.ugc.effectplatform.model.C86838c;
import com.p2082ss.ugc.effectplatform.model.C86839d;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4444b.C86751d;
import com.p2082ss.ugc.effectplatform.p4444b.C86752e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86797f;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g;
import com.p2082ss.ugc.effectplatform.p4453j.C86803a;
import com.p2082ss.ugc.effectplatform.p4453j.C86811b;
import com.p2082ss.ugc.effectplatform.p4453j.C86812c;
import com.p2082ss.ugc.effectplatform.p4453j.C86813d;
import com.p2082ss.ugc.effectplatform.p4453j.C86814e;
import com.p2082ss.ugc.effectplatform.p4453j.C86815f;
import com.p2082ss.ugc.effectplatform.p4453j.C86816g;
import com.p2082ss.ugc.effectplatform.p4455l.C86824a;
import com.p2082ss.ugc.effectplatform.task.AbstractC86891b;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.util.C86989g;
import com.p2082ss.ugc.effectplatform.util.C86990h;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import com.p2082ss.ugc.effectplatform.util.EnumC87003q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b;
import p4519d.p4520a.p4522b.p4524b.C87994a;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.b */
public final class C86717b {

    /* renamed from: c */
    public static final C86719a f195549c = new C86719a((byte) 0);

    /* renamed from: i */
    private static final String f195550i = f195550i;

    /* renamed from: a */
    public final AbstractC89244h f195551a = C89250i.m154773a((AbstractC89171a) new C86720b(this));

    /* renamed from: b */
    public final C86687a f195552b;

    /* renamed from: d */
    private final AbstractC89244h f195553d = C89250i.m154773a((AbstractC89171a) new C86724f(this));

    /* renamed from: e */
    private final AbstractC89244h f195554e = C89250i.m154773a((AbstractC89171a) new C86722d(this));

    /* renamed from: f */
    private final AbstractC89244h f195555f = C89250i.m154773a((AbstractC89171a) new C86733m(this));

    /* renamed from: g */
    private final AbstractC89244h f195556g = C89250i.m154773a((AbstractC89171a) new C86732l(this));

    /* renamed from: h */
    private final AbstractC89244h f195557h = C89250i.m154773a((AbstractC89171a) C86723e.f195562a);

    /* renamed from: a */
    public final C86814e mo139960a() {
        return (C86814e) this.f195553d.getValue();
    }

    /* renamed from: b */
    public final C86812c mo139967b() {
        return (C86812c) this.f195554e.getValue();
    }

    /* renamed from: c */
    public final C86816g mo139968c() {
        return (C86816g) this.f195555f.getValue();
    }

    /* renamed from: d */
    public final C86813d mo139969d() {
        return (C86813d) this.f195557h.getValue();
    }

    /* renamed from: com.ss.ugc.effectplatform.b$a */
    public static final class C86719a {
        static {
            Covode.recordClassIndex(102418);
        }

        private C86719a() {
        }

        public /* synthetic */ C86719a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$e */
    static final class C86723e extends AbstractC89220m implements AbstractC89171a<C86813d> {

        /* renamed from: a */
        public static final C86723e f195562a = new C86723e();

        static {
            Covode.recordClassIndex(102422);
        }

        C86723e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86813d invoke() {
            return new C86813d();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$d */
    static final class C86722d extends AbstractC89220m implements AbstractC89171a<C86812c> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195561a;

        static {
            Covode.recordClassIndex(102421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86722d(C86717b bVar) {
            super(0);
            this.f195561a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86812c invoke() {
            return new C86812c(this.f195561a.f195552b);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$f */
    static final class C86724f extends AbstractC89220m implements AbstractC89171a<C86814e> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195563a;

        static {
            Covode.recordClassIndex(102423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86724f(C86717b bVar) {
            super(0);
            this.f195563a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86814e invoke() {
            return new C86814e(this.f195563a.f195552b);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$l */
    static final class C86732l extends AbstractC89220m implements AbstractC89171a<C86815f> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195578a;

        static {
            Covode.recordClassIndex(102431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86732l(C86717b bVar) {
            super(0);
            this.f195578a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86815f invoke() {
            return new C86815f(this.f195578a.f195552b);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$m */
    static final class C86733m extends AbstractC89220m implements AbstractC89171a<C86816g> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195579a;

        static {
            Covode.recordClassIndex(102432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86733m(C86717b bVar) {
            super(0);
            this.f195579a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86816g invoke() {
            return new C86816g(this.f195579a.f195552b);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$b */
    static final class C86720b extends AbstractC89220m implements AbstractC89171a<C86803a> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195558a;

        static {
            Covode.recordClassIndex(102419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86720b(C86717b bVar) {
            super(0);
            this.f195558a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86803a invoke() {
            if (!C86803a.C86804a.m150367b()) {
                C86803a.C86804a.m150366a(this.f195558a.f195552b);
            }
            return C86803a.C86804a.m150365a();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$c */
    public static final class C86721c extends AbstractC86891b {

        /* renamed from: a */
        final /* synthetic */ C86717b f195559a;

        /* renamed from: b */
        final /* synthetic */ String f195560b;

        static {
            Covode.recordClassIndex(102420);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: b */
        public final void mo139953b() {
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: a */
        public final void mo139952a() {
            AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f195559a.f195552b.f195467w);
            if (fVar != null) {
                fVar.mo140012e();
            }
            C86706c.m150201a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86721c(C86717b bVar, String str, String str2) {
            super(str2);
            this.f195559a = bVar;
            this.f195560b = str;
        }
    }

    static {
        Covode.recordClassIndex(102416);
    }

    /* renamed from: com.ss.ugc.effectplatform.b$j */
    public static final class C86729j implements AbstractC86796e<EffectChannelResponse> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195570a;

        /* renamed from: b */
        final /* synthetic */ boolean f195571b;

        /* renamed from: c */
        final /* synthetic */ AbstractC86796e f195572c;

        static {
            Covode.recordClassIndex(102428);
        }

        /* renamed from: com.ss.ugc.effectplatform.b$j$a */
        public static final class C86730a implements AbstractC86797f<List<? extends Effect>> {

            /* renamed from: a */
            final /* synthetic */ C86729j f195573a;

            /* renamed from: b */
            final /* synthetic */ EffectChannelResponse f195574b;

            /* renamed from: c */
            private final C87991a<String> f195575c = new C87991a<>(null);

            static {
                Covode.recordClassIndex(102429);
            }

            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86797f
            /* renamed from: b */
            public final void mo139971b() {
                AbstractC86755f fVar;
                V v = this.f195575c.f199870a;
                if (v != null && (fVar = (AbstractC86755f) C87993b.m153064a(this.f195573a.f195570a.f195552b.f195467w)) != null) {
                    fVar.mo140005a(C86989g.m150648a(this.f195573a.f195570a.f195552b.f195450f, this.f195574b.getPanel()), (String) v);
                }
            }

            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86797f
            /* renamed from: a */
            public final void mo139970a() {
                String str;
                String a = C86989g.m150648a(this.f195573a.f195570a.f195552b.f195450f, this.f195574b.getPanel());
                AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f195573a.f195570a.f195552b.f195467w);
                if (fVar != null) {
                    str = fVar.mo140007b(a);
                } else {
                    str = null;
                }
                C87993b.m153065a(this.f195575c, str);
                AbstractC86755f fVar2 = (AbstractC86755f) C87993b.m153064a(this.f195573a.f195570a.f195552b.f195467w);
                if (fVar2 != null) {
                    fVar2.mo140011d(a);
                }
            }

            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
            public final /* synthetic */ void onSuccess(Object obj) {
                List<? extends Effect> list = (List) obj;
                C89219l.m154719c(list, "");
                EffectChannelResponse effectChannelResponse = this.f195574b;
                effectChannelResponse.setAll_category_effects(list);
                for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategory_responses()) {
                    ArrayList arrayList = new ArrayList();
                    List<Effect> total_effects = effectCategoryResponse.getTotal_effects();
                    if (total_effects != null) {
                        for (Effect effect : total_effects) {
                            if (list.contains(effect)) {
                                arrayList.add(effect);
                            }
                        }
                    }
                    effectCategoryResponse.setTotal_effects(arrayList);
                }
                AbstractC86796e eVar = this.f195573a.f195572c;
                if (eVar != null) {
                    eVar.onSuccess(effectChannelResponse);
                }
            }

            C86730a(C86729j jVar, EffectChannelResponse effectChannelResponse) {
                this.f195573a = jVar;
                this.f195574b = effectChannelResponse;
            }

            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
            public final /* synthetic */ void onFail(Object obj, C86840e eVar) {
                C89219l.m154719c(eVar, "");
                AbstractC86796e eVar2 = this.f195573a.f195572c;
                if (eVar2 != null) {
                    eVar2.onFail(null, eVar);
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            V v = (V) effectChannelResponse;
            C89219l.m154719c(v, "");
            this.f195570a.mo139969d().f195724a.f199870a = v;
            if (this.f195571b) {
                List<Effect> all_category_effects = v.getAll_category_effects();
                ArrayList arrayList = new ArrayList();
                for (Effect effect : all_category_effects) {
                    if (!C86811b.m150376a(C86839d.m150405a(effect))) {
                        arrayList.add(effect);
                    }
                }
                this.f195570a.mo139964a(arrayList, new C86730a(this, v), null);
                return;
            }
            AbstractC86796e eVar = this.f195572c;
            if (eVar != null) {
                eVar.onSuccess(v);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(EffectChannelResponse effectChannelResponse, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            AbstractC86796e eVar2 = this.f195572c;
            if (eVar2 != null) {
                eVar2.onFail(effectChannelResponse, eVar);
            }
        }

        public C86729j(C86717b bVar, boolean z, AbstractC86796e eVar) {
            this.f195570a = bVar;
            this.f195571b = z;
            this.f195572c = eVar;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$h */
    public static final class C86726h implements AbstractC86796e<Effect> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195565a;

        /* renamed from: b */
        final /* synthetic */ AbstractC86796e f195566b;

        static {
            Covode.recordClassIndex(102425);
        }

        /* renamed from: com.ss.ugc.effectplatform.b$h$a */
        public static final class C86727a implements AbstractC86798g {

            /* renamed from: a */
            final /* synthetic */ C86726h f195567a;

            static {
                Covode.recordClassIndex(102426);
            }

            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g
            public final void onProgress(Effect effect, int i, long j) {
            }

            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g
            public final void onStart(Effect effect) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C86727a(C86726h hVar) {
                this.f195567a = hVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
            public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
                AbstractC86796e eVar;
                if (effect != null && (eVar = this.f195567a.f195566b) != null) {
                    eVar.onSuccess(effect);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
            public final /* synthetic */ void onFail(Effect effect, C86840e eVar) {
                C89219l.m154719c(eVar, "");
                AbstractC86796e eVar2 = this.f195567a.f195566b;
                if (eVar2 != null) {
                    eVar2.onFail(effect, eVar);
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            C89219l.m154719c(effect2, "");
            this.f195565a.mo139961a(effect2, new C86727a(this));
        }

        public C86726h(C86717b bVar, AbstractC86796e eVar) {
            this.f195565a = bVar;
            this.f195566b = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(Effect effect, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            AbstractC86796e eVar2 = this.f195566b;
            if (eVar2 != null) {
                eVar2.onFail(effect, eVar);
            }
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$g */
    public static final class C86725g implements AbstractC86796e<List<? extends Effect>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC86798g f195564a;

        static {
            Covode.recordClassIndex(102424);
        }

        public C86725g(AbstractC86798g gVar) {
            this.f195564a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            C89219l.m154719c(list2, "");
            if (!list2.isEmpty()) {
                AbstractC86798g gVar = this.f195564a;
                if (gVar != null) {
                    gVar.onSuccess(list2.get(0));
                    return;
                }
                return;
            }
            AbstractC86798g gVar2 = this.f195564a;
            if (gVar2 != null) {
                gVar2.onFail(null, new C86840e(1));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(List<? extends Effect> list, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            AbstractC86798g gVar = this.f195564a;
            if (gVar != null) {
                gVar.onFail(null, eVar);
            }
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$i */
    public static final class C86728i implements AbstractC86796e<List<? extends Effect>> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195568a;

        /* renamed from: b */
        final /* synthetic */ AbstractC86796e f195569b;

        static {
            Covode.recordClassIndex(102427);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            C89219l.m154719c(list2, "");
            this.f195568a.mo139964a(list2, this.f195569b, null);
        }

        C86728i(C86717b bVar, AbstractC86796e eVar) {
            this.f195568a = bVar;
            this.f195569b = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(List<? extends Effect> list, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            AbstractC86796e eVar2 = this.f195569b;
            if (eVar2 != null) {
                eVar2.onFail(list, eVar);
            }
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$k */
    public static final class C86731k implements AbstractC86796e<EffectChannelResponse> {

        /* renamed from: a */
        final /* synthetic */ C86717b f195576a;

        /* renamed from: b */
        final /* synthetic */ AbstractC86796e f195577b;

        static {
            Covode.recordClassIndex(102430);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.ugc.effectplatform.model.EffectChannelResponse */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            C89219l.m154719c(effectChannelResponse, "");
            this.f195576a.mo139969d().f195724a.f199870a = effectChannelResponse;
            AbstractC86796e eVar = this.f195577b;
            if (eVar != null) {
                eVar.onSuccess(effectChannelResponse);
            }
        }

        public C86731k(C86717b bVar, AbstractC86796e eVar) {
            this.f195576a = bVar;
            this.f195577b = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(EffectChannelResponse effectChannelResponse, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            AbstractC86796e eVar2 = this.f195577b;
            if (eVar2 != null) {
                eVar2.onFail(effectChannelResponse, eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo139962a(String str) {
        C89219l.m154719c(str, "");
        AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f195552b.f195467w);
        if (fVar != null) {
            fVar.mo140011d("effect_version".concat(String.valueOf(str)));
        }
    }

    public C86717b(C86687a aVar) {
        C89219l.m154719c(aVar, "");
        this.f195552b = aVar;
        if (aVar == null) {
            throw new IllegalArgumentException("EffectConfiguration Error! Not set configuration");
        } else if (aVar.f195433A == null) {
            throw new IllegalArgumentException("EffectConfiguration Error! Not set host !!!");
        } else if (aVar.f195461q == null) {
            throw new IllegalArgumentException("EffectConfiguration Error! Not set json convert");
        } else if (!C87007u.m150697a(aVar.f195453i)) {
            if (!C88045d.m153118f(aVar.f195453i)) {
                C88045d.m153117e(aVar.f195453i);
                if (!C88045d.m153118f(aVar.f195453i)) {
                    C88060b.m153136a(f195550i, "Cache directory error" + aVar.f195453i, null);
                }
            }
            if (!C88045d.m153118f(aVar.f195440H)) {
                C88045d.m153117e(aVar.f195440H);
            }
            if (aVar.f195470z == null) {
                AbstractExecutorC87997b bVar = aVar.f195465u;
                aVar.f195470z = new C86882al.C86883a().mo140601a(bVar == null ? new C87994a() : bVar).mo140602a();
            }
            String str = aVar.f195453i;
            if (!C88045d.m153118f(aVar.f195453i)) {
                C88045d.m153117e(aVar.f195453i);
                if (!C88045d.m153118f(aVar.f195453i)) {
                    C88060b.m153136a(f195550i, "Cache directory error" + aVar.f195453i, null);
                }
            }
            if (aVar.f195467w.f199870a == null) {
                if (C86751d.m150298a(str) == null) {
                    C86751d.m150299a(str, new C86752e(aVar));
                }
                C87993b.m153065a(aVar.f195467w, C86751d.m150298a(str));
            } else {
                C86751d.m150299a(str, (AbstractC86755f) C87993b.m153064a(aVar.f195467w));
            }
            EnumC87003q qVar = EnumC87003q.ANDROID;
            if (qVar == qVar) {
                C86990h.f196147b.f199870a = aVar.f195463s.f199870a;
                C86756c.f195652a = new AbstractC86780f() {
                    /* class com.p2082ss.ugc.effectplatform.C86717b.C867181 */

                    static {
                        Covode.recordClassIndex(102417);
                    }

                    @Override // com.p2082ss.ugc.effectplatform.AbstractC86780f
                    public final String decrypt(String str) {
                        return C86990h.m150652a(C86990h.f196148c, str);
                    }

                    @Override // com.p2082ss.ugc.effectplatform.AbstractC86780f
                    public final String decrypt(String str, String str2) {
                        C89219l.m154719c(str2, "");
                        return C86990h.f196148c.mo140619a(str, str2);
                    }
                };
            }
        } else {
            throw new IllegalArgumentException("EffectConfiguration Error! Cache directory error");
        }
    }

    /* renamed from: a */
    public final boolean mo139966a(Effect effect) {
        boolean z;
        C89219l.m154719c(effect, "");
        if (C89361p.m154870a((CharSequence) effect.getUnzipPath())) {
            return false;
        }
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = C86811b.m150375a(effect);
        if (aVar.element) {
            UrlModel trans_file_url = effect.getTrans_file_url();
            if (trans_file_url == null || trans_file_url.getUri() == null) {
                C86824a.m150396a(effect);
            } else {
                if (!aVar.element || !C86811b.m150377a(this.f195552b.f195453i, effect)) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.element = z;
                if (aVar.element) {
                    C86824a.m150398b(effect);
                }
            }
            mo139960a().mo140048a(effect, true, (AbstractC86798g) null);
        }
        if (!aVar.element || !C86993j.m150664a(effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo139961a(Effect effect, AbstractC86798g gVar) {
        C89219l.m154719c(effect, "");
        mo139960a().mo140048a(effect, false, gVar);
    }

    /* renamed from: a */
    public final void mo139964a(List<? extends Effect> list, AbstractC86796e<List<Effect>> eVar, C86838c cVar) {
        C89219l.m154719c(list, "");
        mo139960a().mo140050a(list, cVar, eVar);
    }

    /* renamed from: a */
    public final void mo139963a(String str, List<String> list, boolean z, AbstractC86796e<List<String>> eVar) {
        C89219l.m154719c(list, "");
        mo139968c().mo140052a(str, list, z, eVar);
    }

    /* renamed from: a */
    public final void mo139965a(List<String> list, boolean z, Map<String, String> map, AbstractC86796e<List<Effect>> eVar) {
        C89219l.m154719c(list, "");
        if (z) {
            mo139960a().mo140051a(list, map, new C86728i(this, eVar));
            return;
        }
        mo139960a().mo140051a(list, map, eVar);
    }
}
