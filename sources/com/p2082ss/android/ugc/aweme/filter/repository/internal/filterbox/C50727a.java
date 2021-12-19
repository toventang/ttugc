package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50746g;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50700h;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50686a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50694b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.a */
public final class C50727a implements AbstractC50700h {

    /* renamed from: a */
    private final Map<Integer, C50694b> f117093a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<Integer, C50694b> f117094b = new LinkedHashMap();

    /* renamed from: c */
    private final List<C89378p<EffectCategoryResponse, List<C50698f>>> f117095c;

    /* renamed from: d */
    private final C50686a f117096d;

    /* renamed from: e */
    private final AbstractC50707o f117097e;

    /* renamed from: f */
    private final AbstractC50746g f117098f;

    static {
        Covode.recordClassIndex(59892);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50700h
    /* renamed from: a */
    public final C50686a mo86046a() {
        return this.f117096d;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50700h
    /* renamed from: b */
    public final void mo86048b() {
        if (!this.f117093a.isEmpty()) {
            this.f117098f.mo86103a(this.f117093a.keySet());
        }
        if (!this.f117094b.isEmpty()) {
            this.f117098f.mo86104b(this.f117094b.keySet());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50700h
    /* renamed from: a */
    public final void mo86047a(C50694b bVar) {
        C89219l.m154721d(bVar, "");
        if (!bVar.f117038c) {
            this.f117094b.remove(Integer.valueOf(bVar.f117036a.f117047a));
            this.f117093a.put(Integer.valueOf(bVar.f117036a.f117047a), bVar);
        }
        this.f117097e.mo86063a(bVar.f117036a, this.f117095c);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50700h
    /* renamed from: b */
    public final void mo86049b(C50694b bVar) {
        C89219l.m154721d(bVar, "");
        if (!bVar.f117038c) {
            this.f117094b.put(Integer.valueOf(bVar.f117036a.f117047a), bVar);
            this.f117093a.remove(Integer.valueOf(bVar.f117036a.f117047a));
            this.f117097e.mo86065a(bVar.f117036a);
        }
    }

    public C50727a(C50686a aVar, AbstractC50707o oVar, AbstractC50746g gVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        this.f117096d = aVar;
        this.f117097e = oVar;
        this.f117098f = gVar;
        List<C89378p<EffectCategoryModel, List<C50694b>>> list = aVar.f117026b;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            com.p2082ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel = (com.p2082ss.ugc.effectplatform.model.EffectCategoryModel) t.getFirst();
            C89219l.m154721d(effectCategoryModel, "");
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, 1, null);
            effectCategoryResponse.setId(effectCategoryModel.getId());
            effectCategoryResponse.setName(effectCategoryModel.getName());
            effectCategoryResponse.setKey(effectCategoryModel.getKey());
            Iterable<C50694b> iterable = (Iterable) t.getSecond();
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a(iterable, 10));
            for (C50694b bVar : iterable) {
                arrayList2.add(bVar.f117036a);
            }
            arrayList.add(C89387v.m154943a(effectCategoryResponse, arrayList2));
        }
        this.f117095c = arrayList;
    }
}
