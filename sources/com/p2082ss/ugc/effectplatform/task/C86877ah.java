package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.ah */
public final class C86877ah extends AbstractC86851a<SearchEffectResponseV2, SearchEffectResponseV2> {

    /* renamed from: c */
    private final C86687a f195878c;

    /* renamed from: d */
    private final String f195879d;

    /* renamed from: f */
    private final String f195880f;

    /* renamed from: g */
    private final int f195881g;

    /* renamed from: h */
    private final int f195882h;

    /* renamed from: i */
    private final Map<String, String> f195883i;

    /* renamed from: j */
    private final String f195884j;

    static {
        Covode.recordClassIndex(102642);
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
        String str;
        HashMap<String, String> a = C86992i.m150657a(this.f195878c, true);
        String str2 = this.f195879d;
        if (str2 != null) {
            a.put("search_id", str2);
        }
        a.put("keyword", this.f195880f);
        a.put("cursor", String.valueOf(this.f195882h));
        a.put("count", String.valueOf(this.f195881g));
        Map<String, String> map = this.f195883i;
        if (map != null) {
            a.putAll(map);
        }
        String str3 = this.f195884j;
        if (str3 == null || C89361p.m154870a((CharSequence) str3)) {
            str = this.f195878c.f195433A + this.f195878c.f195445a + "/search/effects";
        } else {
            str = this.f195884j + "/aweme/v1/search/effect/";
        }
        return new C86701e(C87002p.m150693a(a, str), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ SearchEffectResponseV2 mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (SearchEffectResponseV2) bVar.f195508a.convertJsonToObj(str, SearchEffectResponseV2.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86877ah(C86687a aVar, String str, String str2, int i, int i2, Map<String, String> map, String str3, String str4) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str3);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f195878c = aVar;
        this.f195879d = str;
        this.f195880f = str2;
        this.f195881g = i;
        this.f195882h = i2;
        this.f195883i = map;
        this.f195884j = str4;
    }
}
