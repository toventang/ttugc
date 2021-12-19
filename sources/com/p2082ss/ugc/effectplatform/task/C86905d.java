package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.net.EffectListResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.d */
public final class C86905d extends AbstractC86851a<List<? extends Effect>, EffectListResponse> {

    /* renamed from: c */
    private final C86687a f195937c;

    /* renamed from: d */
    private final List<String> f195938d;

    /* renamed from: f */
    private final Map<String, String> f195939f;

    static {
        Covode.recordClassIndex(102670);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        C86695b bVar;
        String convertObjToJson;
        HashMap<String, String> a = C86992i.m150657a(this.f195937c, true);
        Map<String, String> map = this.f195939f;
        if (map != null) {
            a.putAll(map);
        }
        List<String> list = this.f195938d;
        if (!(list == null || (bVar = this.f195937c.f195461q) == null || (convertObjToJson = bVar.f195508a.convertObjToJson(list)) == null)) {
            a.put("effect_ids", convertObjToJson);
        }
        return new C86701e(C87002p.m150693a(a, this.f195937c.f195433A + this.f195937c.f195445a + "/v3/effect/list"), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ EffectListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (EffectListResponse) bVar.f195508a.convertJsonToObj(str, EffectListResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86905d(C86687a aVar, List<String> list, String str, Map<String, String> map) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195937c = aVar;
        this.f195938d = list;
        this.f195939f = map;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        C89219l.m154719c(effectListResponse2, "");
        C86993j.m150662a(this.f195937c.f195453i, effectListResponse2.getEffect_list());
        super.mo140548a(j, j2, j3, effectListResponse2);
    }
}
