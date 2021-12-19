package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.ae */
public final class C86874ae extends AbstractC86851a<RecommendSearchWordsResponse, RecommendSearchWordsResponse> {

    /* renamed from: c */
    private final C86687a f195862c;

    static {
        Covode.recordClassIndex(102639);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: e */
    public final int mo140552e() {
        return 10003;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        return new C86701e(C87002p.m150693a(C86992i.m150657a(this.f195862c, true), this.f195862c.f195433A + this.f195862c.f195445a + "/search/recommend"), EnumC86699c.GET, null, null, false, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86874ae(C86687a aVar, String str) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195862c = aVar;
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ RecommendSearchWordsResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (RecommendSearchWordsResponse) bVar.f195508a.convertJsonToObj(str, RecommendSearchWordsResponse.class);
    }
}
