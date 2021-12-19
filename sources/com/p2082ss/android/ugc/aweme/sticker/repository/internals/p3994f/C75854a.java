package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3994f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.f.a */
public class C75854a implements AbstractC75704j {

    /* renamed from: a */
    private final LinkedHashMap<String, AbstractC75698f> f170388a;

    /* renamed from: b */
    private final Map<String, AbstractC75698f> f170389b;

    static {
        Covode.recordClassIndex(88788);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j
    /* renamed from: a */
    public final Map<String, AbstractC75698f> mo119430a() {
        return this.f170389b;
    }

    public C75854a() {
        LinkedHashMap<String, AbstractC75698f> linkedHashMap = new LinkedHashMap<>();
        this.f170388a = linkedHashMap;
        this.f170389b = linkedHashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j
    /* renamed from: b */
    public final void mo119433b() {
        Collection<AbstractC75698f> values = this.f170388a.values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().mo119422e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j
    /* renamed from: a */
    public final void mo119431a(AbstractC75698f fVar) {
        C89219l.m154721d(fVar, "");
        this.f170388a.put(fVar.mo119419b().getKey(), fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j
    /* renamed from: a */
    public void mo119432a(List<EffectCategoryModel> list) {
        int a;
        C89219l.m154721d(list, "");
        for (Map.Entry<String, AbstractC75698f> entry : this.f170389b.entrySet()) {
            AbstractC75698f value = entry.getValue();
            if (value.mo119418a() < 0 || value.mo119418a() > list.size() || (a = value.mo119418a()) < 0) {
                list.add(value.mo119419b());
            } else {
                list.add(a, value.mo119419b());
            }
        }
    }
}
