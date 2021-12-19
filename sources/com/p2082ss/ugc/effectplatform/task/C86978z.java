package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.net.ModfifyFavoriteResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.z */
public final class C86978z extends AbstractC86851a<List<? extends String>, ModfifyFavoriteResponse> {

    /* renamed from: c */
    public final C86687a f196123c;

    /* renamed from: d */
    public final String f196124d;

    /* renamed from: f */
    public final List<String> f196125f;

    /* renamed from: g */
    private final String f196126g;

    /* renamed from: h */
    private final boolean f196127h;

    /* renamed from: i */
    private final Map<String, String> f196128i = null;

    static {
        Covode.recordClassIndex(102743);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.z$a */
    static final class C86979a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86978z f196129a;

        static {
            Covode.recordClassIndex(102744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86979a(C86978z zVar) {
            super(0);
            this.f196129a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196129a.f196123c.f195443K.mo140035a(this.f196129a.f196124d);
            if (a != null) {
                a.onSuccess(this.f196129a.f196125f);
            }
            this.f196129a.f196123c.f195443K.mo140037b(this.f196129a.f196124d);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(C86992i.m150656a(this.f196123c));
        String str = this.f196126g;
        if (str != null) {
            hashMap.put("panel", str);
        }
        hashMap.put("effect_ids", this.f196125f);
        hashMap.put(StringSet.type, Integer.valueOf(this.f196127h ? 1 : 0));
        Map<String, String> map = this.f196128i;
        if (map != null) {
            hashMap.putAll(map);
        }
        return new C86701e(this.f196123c.f195433A + this.f196123c.f195445a + "/v3/effect/favorite", EnumC86699c.POST, hashMap, "application/json", false, 36);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ ModfifyFavoriteResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (ModfifyFavoriteResponse) bVar.f195508a.convertJsonToObj(str, ModfifyFavoriteResponse.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, ModfifyFavoriteResponse modfifyFavoriteResponse) {
        C89219l.m154719c(modfifyFavoriteResponse, "");
        m150523a(new C86979a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86978z(C86687a aVar, String str, String str2, List<String> list, boolean z, Map<String, String> map) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(list, "");
        this.f196123c = aVar;
        this.f196126g = str;
        this.f196124d = str2;
        this.f196125f = list;
        this.f196127h = z;
    }
}
