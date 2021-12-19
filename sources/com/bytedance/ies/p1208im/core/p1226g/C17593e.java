package com.bytedance.ies.p1208im.core.p1226g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17426e;
import com.bytedance.ies.p1208im.core.api.p1216f.C17457c;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.g.e */
public final class C17593e implements C17438g.AbstractC17440b {

    /* renamed from: a */
    private final C17587d f42081a;

    static {
        Covode.recordClassIndex(20082);
    }

    public C17593e() {
        int i = C17587d.f42051l + 1;
        C17587d.f42051l = i;
        this.f42081a = new C17587d(i, (byte) 0);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.C17438g.AbstractC17440b
    /* renamed from: a */
    public final void mo27818a() {
        C17583c.m32615a(this.f42081a);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.C17438g.AbstractC17440b
    /* renamed from: a */
    public final C17438g.AbstractC17440b mo27814a(ReferenceInfo referenceInfo) {
        this.f42081a.f42061i = referenceInfo;
        return this;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.C17438g.AbstractC17440b
    /* renamed from: b */
    public final C17438g.AbstractC17440b mo27820b(String str) {
        this.f42081a.f42053a = str;
        return this;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.C17438g.AbstractC17440b
    /* renamed from: a */
    public final C17438g.AbstractC17440b mo27813a(C17457c cVar) {
        List<? extends C17457c> list;
        C17587d dVar = this.f42081a;
        if (cVar != null) {
            list = C89070n.m154516a(cVar);
        } else {
            list = null;
        }
        dVar.f42054b = list;
        return this;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.C17438g.AbstractC17440b
    /* renamed from: a */
    public final C17438g.AbstractC17440b mo27815a(String str) {
        this.f42081a.f42053a = AbstractC17427b.C17428a.m32310b(str);
        return this;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.C17438g.AbstractC17440b
    /* renamed from: a */
    public final C17438g.AbstractC17440b mo27816a(List<? extends C17457c> list) {
        this.f42081a.f42054b = list;
        return this;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.C17438g.AbstractC17440b
    /* renamed from: a */
    public final C17438g.AbstractC17440b mo27817a(Map<String, String> map) {
        this.f42081a.f42057e = map;
        return this;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.C17438g.AbstractC17440b
    /* renamed from: a */
    public final void mo27819a(AbstractC17426e eVar) {
        C89219l.m154721d(eVar, "");
        C17587d dVar = this.f42081a;
        C89219l.m154721d(eVar, "");
        dVar.f42060h = eVar;
        C17583c.m32615a(dVar);
    }
}
