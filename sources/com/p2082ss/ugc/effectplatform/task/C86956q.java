package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.q */
public final class C86956q extends AbstractC86851a<FetchFavoriteListResponse, FetchFavoriteListResponse> {

    /* renamed from: c */
    private final C86687a f196054c;

    /* renamed from: d */
    private final String f196055d;

    /* renamed from: f */
    private final String f196056f;

    /* renamed from: g */
    private final Map<String, String> f196057g = null;

    static {
        Covode.recordClassIndex(102721);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: d */
    public final int mo140551d() {
        return this.f196054c.f195458n;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f196054c, true);
        String str = this.f196055d;
        if (str != null) {
            a.put("panel", str);
        }
        Map<String, String> map = this.f196057g;
        if (map != null) {
            a.putAll(map);
        }
        return new C86701e(C87002p.m150693a(a, this.f196054c.f195433A + this.f196054c.f195445a + "/v3/effect/my"), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ FetchFavoriteListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (FetchFavoriteListResponse) bVar.f195508a.convertJsonToObj(str, FetchFavoriteListResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86956q(C86687a aVar, String str, String str2) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str2, "");
        this.f196054c = aVar;
        this.f196055d = str;
        this.f196056f = str2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, FetchFavoriteListResponse fetchFavoriteListResponse) {
        FetchFavoriteListResponse fetchFavoriteListResponse2 = fetchFavoriteListResponse;
        C89219l.m154719c(fetchFavoriteListResponse2, "");
        C86993j.m150662a(this.f196054c.f195453i, fetchFavoriteListResponse2.getEffect_list());
        C86993j.m150662a(this.f196054c.f195453i, fetchFavoriteListResponse2.getCollection_effects());
        super.mo140548a(j, j2, j3, fetchFavoriteListResponse2);
    }
}
