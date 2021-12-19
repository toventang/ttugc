package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.ag */
public final class C86876ag extends AbstractC86851a<SearchEffectResponse, SearchEffectResponse> {

    /* renamed from: c */
    private final C86687a f195872c;

    /* renamed from: d */
    private final String f195873d;

    /* renamed from: f */
    private final String f195874f;

    /* renamed from: g */
    private final int f195875g;

    /* renamed from: h */
    private final int f195876h;

    /* renamed from: i */
    private final Map<String, String> f195877i;

    static {
        Covode.recordClassIndex(102641);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: e */
    public final int mo140552e() {
        return 10014;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f195872c, true);
        a.put("panel", this.f195873d);
        a.put("keyword", this.f195874f);
        a.put("cursor", String.valueOf(this.f195876h));
        a.put("count", String.valueOf(this.f195875g));
        Map<String, String> map = this.f195877i;
        if (map != null) {
            a.putAll(map);
        }
        return new C86701e(C87002p.m150693a(a, this.f195872c.f195433A + this.f195872c.f195445a + "/search"), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ SearchEffectResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (SearchEffectResponse) bVar.f195508a.convertJsonToObj(str, SearchEffectResponse.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, SearchEffectResponse searchEffectResponse) {
        SearchEffectResponse searchEffectResponse2 = searchEffectResponse;
        C89219l.m154719c(searchEffectResponse2, "");
        C86993j.m150661a(this.f195872c.f195453i, this.f195873d, searchEffectResponse2.getEffect_list());
        C86993j.m150661a(this.f195872c.f195453i, this.f195873d, searchEffectResponse2.getCollection_list());
        C86993j.m150661a(this.f195872c.f195453i, this.f195873d, searchEffectResponse2.getBind_effects());
        super.mo140548a(j, j2, j3, searchEffectResponse2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86876ag(C86687a aVar, String str, String str2, int i, int i2, Map<String, String> map, String str3) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str3);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f195872c = aVar;
        this.f195873d = str;
        this.f195874f = str2;
        this.f195875g = i;
        this.f195876h = i2;
        this.f195877i = map;
    }
}
