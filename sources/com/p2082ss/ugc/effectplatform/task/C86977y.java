package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.ResourceListModel;
import com.p2082ss.ugc.effectplatform.model.net.ResourceListResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.y */
public final class C86977y extends AbstractC86851a<ResourceListModel, ResourceListResponse> {

    /* renamed from: c */
    private final C86687a f196121c;

    /* renamed from: d */
    private final Map<String, String> f196122d;

    static {
        Covode.recordClassIndex(102742);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f196121c, true);
        Map<String, String> map = this.f196122d;
        if (map != null) {
            a.putAll(map);
        }
        return new C86701e(C87002p.m150693a(a, this.f196121c.f195433A + this.f196121c.f195445a + "/moji/resource"), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ ResourceListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (ResourceListResponse) bVar.f195508a.convertJsonToObj(str, ResourceListResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86977y(C86687a aVar, String str, Map<String, String> map) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f196121c = aVar;
        this.f196122d = map;
    }
}
