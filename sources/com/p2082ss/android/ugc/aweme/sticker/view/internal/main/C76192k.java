package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75710p;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.k */
public final class C76192k implements AbstractC76150f {

    /* renamed from: a */
    public final C1213t<Map<String, C89378p<EnumC84444c, Integer>>> f171161a = new C1213t<>();

    /* renamed from: b */
    private final C1213t<C89386u<Effect, EnumC84444c, Integer>> f171162b = new C1213t<>();

    /* renamed from: c */
    private final AbstractC75710p f171163c;

    static {
        Covode.recordClassIndex(89142);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f
    /* renamed from: a */
    public final LiveData<C89386u<Effect, EnumC84444c, Integer>> mo119906a() {
        return this.f171162b;
    }

    public C76192k(AbstractC75710p pVar) {
        C89219l.m154721d(pVar, "");
        this.f171163c = pVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f
    /* renamed from: a */
    public final C89378p<EnumC84444c, Integer> mo119907a(Effect effect) {
        C89378p<EnumC84444c, Integer> pVar;
        C89219l.m154721d(effect, "");
        effect.getName();
        Map<String, C89378p<EnumC84444c, Integer>> value = this.f171161a.getValue();
        if (value == null || (pVar = value.get(effect.getId())) == null) {
            effect.getName();
            if (this.f171163c.mo119440b(effect)) {
                pVar = C89387v.m154943a(EnumC84444c.UNKNOWN, 0);
            } else {
                pVar = C89387v.m154943a(EnumC84444c.NOT_DOWNLOAD, 0);
            }
            mo119908a(effect, pVar.component1(), pVar.component2(), false);
        }
        return pVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f
    /* renamed from: a */
    public final void mo119908a(Effect effect, EnumC84444c cVar, Integer num, boolean z) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        Map<String, C89378p<EnumC84444c, Integer>> value = this.f171161a.getValue();
        if (value == null) {
            value = new ConcurrentHashMap<>();
        }
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Pair<com.ss.android.ugc.tools.repository.api.CommonDataState, kotlin.Int?>>");
        Map<String, C89378p<EnumC84444c, Integer>> h = C89206ad.m154686h(value);
        h.put(effect.getId(), C89387v.m154943a(cVar, num));
        this.f171161a.postValue(h);
        if (z) {
            this.f171162b.postValue(new C89386u<>(effect, cVar, num));
        }
    }
}
