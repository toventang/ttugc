package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
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

/* renamed from: com.ss.ugc.effectplatform.task.ac */
public final class C86868ac extends AbstractC86851a<List<? extends Effect>, EffectListResponse> {

    /* renamed from: c */
    public final C86687a f195850c;

    /* renamed from: d */
    public final String f195851d;

    /* renamed from: f */
    private final Map<String, String> f195852f;

    static {
        Covode.recordClassIndex(102633);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: e */
    public final int mo140552e() {
        return 10003;
    }

    /* renamed from: com.ss.ugc.effectplatform.task.ac$a */
    static final class C86869a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86868ac f195853a;

        /* renamed from: b */
        final /* synthetic */ EffectListResponse f195854b;

        static {
            Covode.recordClassIndex(102634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86869a(C86868ac acVar, EffectListResponse effectListResponse) {
            super(0);
            this.f195853a = acVar;
            this.f195854b = effectListResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195853a.f195850c.f195443K.mo140035a(this.f195853a.f195851d);
            if (a != null) {
                a.onSuccess(this.f195854b);
            }
            this.f195853a.f195850c.f195443K.mo140037b(this.f195853a.f195851d);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f195850c, true);
        Map<String, String> map = this.f195852f;
        if (map != null && (true ^ map.isEmpty())) {
            a.putAll(this.f195852f);
        }
        return new C86701e(C87002p.m150693a(a, this.f195850c.f195433A + this.f195850c.f195445a + "/user/usedSticker"), EnumC86699c.GET, null, null, false, 60);
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
    public C86868ac(C86687a aVar, Map<String, String> map, String str) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195850c = aVar;
        this.f195852f = map;
        this.f195851d = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        C89219l.m154719c(effectListResponse2, "");
        String str = this.f195850c.f195453i;
        C86993j.m150662a(str, effectListResponse2.getEffect_list());
        C86993j.m150662a(str, effectListResponse2.getCollection_list());
        m150523a(new C86869a(this, effectListResponse2));
    }
}
