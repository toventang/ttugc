package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.net.EffectListResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.p */
public final class C86953p extends AbstractC86851a<List<? extends Effect>, EffectListResponse> {

    /* renamed from: c */
    public final C86687a f196045c;

    /* renamed from: d */
    public final String f196046d;

    /* renamed from: f */
    private final List<String> f196047f;

    /* renamed from: g */
    private final Map<String, String> f196048g;

    /* renamed from: h */
    private final boolean f196049h;

    static {
        Covode.recordClassIndex(102718);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: e */
    public final int mo140552e() {
        return 10014;
    }

    /* renamed from: com.ss.ugc.effectplatform.task.p$a */
    static final class C86954a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86953p f196050a;

        /* renamed from: b */
        final /* synthetic */ C86840e f196051b;

        static {
            Covode.recordClassIndex(102719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86954a(C86953p pVar, C86840e eVar) {
            super(0);
            this.f196050a = pVar;
            this.f196051b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196050a.f196045c.f195443K.mo140035a(this.f196050a.f196046d);
            if (a != null) {
                a.onFail(null, this.f196051b);
            }
            this.f196050a.f196045c.f195443K.mo140037b(this.f196050a.f196046d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.p$b */
    static final class C86955b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86953p f196052a;

        /* renamed from: b */
        final /* synthetic */ EffectListResponse f196053b;

        static {
            Covode.recordClassIndex(102720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86955b(C86953p pVar, EffectListResponse effectListResponse) {
            super(0);
            this.f196052a = pVar;
            this.f196053b = effectListResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196052a.f196045c.f195443K.mo140035a(this.f196052a.f196046d);
            if (a != null) {
                a.onSuccess(this.f196053b);
            }
            this.f196052a.f196045c.f195443K.mo140037b(this.f196052a.f196046d);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        String str;
        C86695b bVar;
        String convertObjToJson;
        HashMap<String, String> a = C86992i.m150657a(this.f196045c, true);
        Map<String, String> map = this.f196048g;
        if (map != null) {
            a.putAll(map);
        }
        List<String> list = this.f196047f;
        if (!(list == null || (bVar = this.f196045c.f195461q) == null || (convertObjToJson = bVar.f195508a.convertObjToJson(list)) == null)) {
            if (this.f196049h) {
                a.put("effect_ids", convertObjToJson);
            } else {
                a.put("resource_ids", convertObjToJson);
            }
        }
        StringBuilder append = new StringBuilder().append(this.f196045c.f195433A).append(this.f196045c.f195445a);
        if (this.f196049h) {
            str = "/v3/effect/list";
        } else {
            str = "/v3/effect/listByResourceId";
        }
        return new C86701e(C87002p.m150693a(a, append.append(str).toString()), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ EffectListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (EffectListResponse) bVar.f195508a.convertJsonToObj(str, EffectListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final void mo140549a(String str, String str2, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        m150523a(new C86954a(this, eVar));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        C89219l.m154719c(effectListResponse2, "");
        C86993j.m150662a(this.f196045c.f195453i, effectListResponse2.getEffect_list());
        C86993j.m150662a(this.f196045c.f195453i, effectListResponse2.getCollection_list());
        m150523a(new C86955b(this, effectListResponse2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86953p(C86687a aVar, List<String> list, String str, Map<String, String> map, boolean z) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f196045c = aVar;
        this.f196047f = list;
        this.f196046d = str;
        this.f196048g = map;
        this.f196049h = z;
    }
}
