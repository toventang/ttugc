package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryModel;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.p2082ss.ugc.effectplatform.model.EffectChannelModel;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.util.C86989g;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.util.ArrayList;
import java.util.List;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.m */
public final class C86941m extends AbstractC86891b {

    /* renamed from: c */
    public static final C86942a f196022c = new C86942a((byte) 0);

    /* renamed from: a */
    public final C86687a f196023a;

    /* renamed from: b */
    public final String f196024b;

    /* renamed from: d */
    private final String f196025d;

    static {
        Covode.recordClassIndex(102706);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.m$a */
    public static final class C86942a {
        static {
            Covode.recordClassIndex(102707);
        }

        private C86942a() {
        }

        public /* synthetic */ C86942a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.m$b */
    static final class C86943b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86941m f196026a;

        static {
            Covode.recordClassIndex(102708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86943b(C86941m mVar) {
            super(0);
            this.f196026a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f196026a.f196023a.f195443K.mo140037b(this.f196026a.f196024b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86943b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.m$c */
    public static final class C86944c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86941m f196027a;

        /* renamed from: b */
        final /* synthetic */ C86840e f196028b;

        static {
            Covode.recordClassIndex(102709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86944c(C86941m mVar, C86840e eVar) {
            super(0);
            this.f196027a = mVar;
            this.f196028b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196027a.f196023a.f195443K.mo140035a(this.f196027a.f196024b);
            if (a != null) {
                a.onFail(null, this.f196028b);
            }
            this.f196027a.f196023a.f195443K.mo140037b(this.f196027a.f196024b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.m$d */
    public static final class C86945d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86941m f196029a;

        /* renamed from: b */
        final /* synthetic */ EffectChannelResponse f196030b;

        static {
            Covode.recordClassIndex(102710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86945d(C86941m mVar, EffectChannelResponse effectChannelResponse) {
            super(0);
            this.f196029a = mVar;
            this.f196030b = effectChannelResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196029a.f196023a.f195443K.mo140035a(this.f196029a.f196024b);
            if (a != null) {
                a.onSuccess(this.f196030b);
            }
            this.f196029a.f196023a.f195443K.mo140037b(this.f196029a.f196024b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private final EffectChannelModel m150576c() {
        String b;
        AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f196023a.f195467w);
        if (fVar == null || (b = fVar.mo140007b(C86989g.m150648a(this.f196023a.f195450f, this.f196025d))) == null) {
            return null;
        }
        try {
            C86695b bVar = this.f196023a.f195461q;
            if (bVar != null) {
                return (EffectChannelModel) bVar.f195508a.convertJsonToObj(b, EffectChannelModel.class);
            }
            return null;
        } catch (Exception e) {
            C88060b.m153136a("FetchDownloadedEffectListTask", "Json Parse Exception: ".concat(String.valueOf(e)), null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        V v;
        if (C87007u.m150697a(this.f196025d)) {
            m150575a(new C86840e(10007));
            return;
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, null, null, null, null, null, 511, null);
        EffectChannelModel c = m150576c();
        if (c == null || !c.checkValued()) {
            m150575a(new C86840e(10004));
            return;
        }
        List<Effect> effect_list = c.getEffect_list();
        ArrayList arrayList = new ArrayList();
        if (!(effect_list == null || (v = this.f196023a.f195467w.f199870a) == null)) {
            for (Effect effect : effect_list) {
                if (v.mo140013e(effect.getId())) {
                    arrayList.add(effect);
                }
            }
        }
        if (arrayList.isEmpty()) {
            m150574a(new EffectChannelResponse(this.f196025d, null, null, null, null, null, null, null, null, 510, null));
            return;
        }
        effectChannelResponse.setAll_category_effects(arrayList);
        effectChannelResponse.setCategory_responses(m150572a(c, arrayList));
        effectChannelResponse.setPanel(this.f196025d);
        effectChannelResponse.setPanel_model(c.getPanel_model());
        m150574a(effectChannelResponse);
    }

    /* renamed from: a */
    private final void m150574a(EffectChannelResponse effectChannelResponse) {
        m150523a(new C86945d(this, effectChannelResponse));
    }

    /* renamed from: a */
    private final void m150575a(C86840e eVar) {
        m150523a(new C86944c(this, eVar));
    }

    /* renamed from: a */
    private static List<Effect> m150573a(List<String> list, List<? extends Effect> list2) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (String str : list) {
            for (Effect effect : list2) {
                if (C89219l.m154714a((Object) str, (Object) effect.getEffect_id())) {
                    arrayList.add(effect);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<EffectCategoryResponse> m150572a(EffectChannelModel effectChannelModel, List<? extends Effect> list) {
        List<EffectCategoryModel> category_list = effectChannelModel.getCategory_list();
        ArrayList arrayList = new ArrayList();
        for (EffectCategoryModel effectCategoryModel : category_list) {
            if (effectCategoryModel.checkValued()) {
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(effectCategoryModel.getId(), effectCategoryModel.getName(), effectCategoryModel.getKey(), null, null, null, null, m150573a(effectCategoryModel.getEffects(), list), effectCategoryModel.getTags(), effectCategoryModel.getTags_updated_at(), null, false, null, 7288, null);
                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86941m(C86687a aVar, String str, String str2) {
        super(str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str2, "");
        this.f196023a = aVar;
        this.f196025d = str;
        this.f196024b = str2;
    }
}
