package com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.p4156c;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75695d;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75700g;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75726a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a */
public final class C79323a implements AbstractC75698f {

    /* renamed from: f */
    public static final C79324a f178225f = new C79324a((byte) 0);

    /* renamed from: b */
    final AbstractC89244h f178226b = C89250i.m154773a((AbstractC89171a) new C79328d(this));

    /* renamed from: c */
    public final C88958b<CategoryEffectModel> f178227c;

    /* renamed from: d */
    final Effect f178228d;

    /* renamed from: e */
    public final ActivityC0945e f178229e;

    /* renamed from: g */
    private final EffectCategoryModel f178230g = C75700g.m132814a(new C79325b(this));

    /* renamed from: h */
    private final AbstractC75695d f178231h;

    /* renamed from: i */
    private final List<AbstractC75730a> f178232i;

    static {
        Covode.recordClassIndex(92514);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: a */
    public final int mo119418a() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: e */
    public final void mo119422e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a$a */
    public static final class C79324a {
        static {
            Covode.recordClassIndex(92515);
        }

        private C79324a() {
        }

        public /* synthetic */ C79324a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: b */
    public final EffectCategoryModel mo119419b() {
        return this.f178230g;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: c */
    public final List<AbstractC75730a> mo119420c() {
        return this.f178232i;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f
    /* renamed from: d */
    public final AbstractC75695d mo119421d() {
        return this.f178231h;
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a$d */
    static final class C79328d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C79323a f178236a;

        static {
            Covode.recordClassIndex(92519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79328d(C79323a aVar) {
            super(0);
            this.f178236a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string = this.f178236a.f178229e.getString(R.string.p);
            C89219l.m154716b(string, "");
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a$c */
    public static final class C79326c implements AbstractC75695d {

        /* renamed from: a */
        final /* synthetic */ C79323a f178234a;

        static {
            Covode.recordClassIndex(92517);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C79326c(C79323a aVar) {
            this.f178234a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75695d
        /* renamed from: a */
        public final AbstractC88979t<CategoryEffectModel> mo119415a(C75726a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC88979t<CategoryEffectModel> c = this.f178234a.f178227c.mo143285c((AbstractC88433f<? super AbstractC88412b>) new C79327a(this));
            C89219l.m154716b(c, "");
            return c;
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a$c$a */
        static final class C79327a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C79326c f178235a;

            static {
                Covode.recordClassIndex(92518);
            }

            C79327a(C79326c cVar) {
                this.f178235a = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C79323a aVar = this.f178235a.f178234a;
                C88958b<CategoryEffectModel> bVar = aVar.f178227c;
                Effect effect = aVar.f178228d;
                CategoryEffectModel categoryEffectModel = new CategoryEffectModel(null, 1, null);
                categoryEffectModel.setCategoryKey("category:ttep");
                categoryEffectModel.setEffects(C89070n.m154516a(effect));
                categoryEffectModel.setCollectEffects(new ArrayList());
                categoryEffectModel.setBindEffects(new ArrayList());
                bVar.onNext(categoryEffectModel);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a$b */
    static final class C79325b extends AbstractC89220m implements AbstractC89172b<EffectCategoryModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79323a f178233a;

        static {
            Covode.recordClassIndex(92516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79325b(C79323a aVar) {
            super(1);
            this.f178233a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EffectCategoryModel effectCategoryModel) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            C89219l.m154721d(effectCategoryModel2, "");
            effectCategoryModel2.setId("0");
            effectCategoryModel2.setKey("category:ttep");
            effectCategoryModel2.setName((String) this.f178233a.f178226b.getValue());
            return C89391z.f203057a;
        }
    }

    public C79323a(Effect effect, ActivityC0945e eVar) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(eVar, "");
        this.f178228d = effect;
        this.f178229e = eVar;
        C88958b<CategoryEffectModel> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f178227c = bVar;
        this.f178231h = new C79326c(this);
    }
}
