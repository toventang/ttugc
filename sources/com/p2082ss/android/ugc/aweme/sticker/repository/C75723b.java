package com.p2082ss.android.ugc.aweme.sticker.repository;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.b */
public final class C75723b {
    static {
        Covode.recordClassIndex(88654);
    }

    /* renamed from: a */
    public static final List<EffectCategoryModel> m132877a(AbstractC75720y yVar) {
        C89219l.m154721d(yVar, "");
        List<EffectCategoryModel> value = yVar.mo119473e().getValue();
        if (value == null) {
            return C89086z.INSTANCE;
        }
        return value;
    }

    /* renamed from: b */
    public static final Map<String, CategoryEffectModel> m132878b(AbstractC75720y yVar) {
        M m;
        C89219l.m154721d(yVar, "");
        Map<String, LiveData<C35324a<CategoryEffectModel>>> c = yVar.mo119471c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89041ag.m154411a(c.size()));
        for (T t : c.entrySet()) {
            Object key = t.getKey();
            C35324a aVar = (C35324a) ((LiveData) t.getValue()).getValue();
            if (aVar != null) {
                m = aVar.f83350a;
            } else {
                m = null;
            }
            linkedHashMap.put(key, m);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final CategoryEffectModel m132876a(AbstractC75720y yVar, String str) {
        C35324a<CategoryEffectModel> value;
        C89219l.m154721d(yVar, "");
        if (str == null || (value = yVar.mo119465a(str, false).getValue()) == null) {
            return null;
        }
        return value.f83350a;
    }
}
