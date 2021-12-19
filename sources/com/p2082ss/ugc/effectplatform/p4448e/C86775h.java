package com.p2082ss.ugc.effectplatform.p4448e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4444b.C86751d;
import com.p2082ss.ugc.effectplatform.p4444b.C86752e;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86735a;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.e.h */
public final class C86775h implements AbstractC86779j {

    /* renamed from: b */
    public static final C86776a f195690b = new C86776a((byte) 0);

    /* renamed from: a */
    public final Effect f195691a;

    static {
        Covode.recordClassIndex(102474);
    }

    /* renamed from: com.ss.ugc.effectplatform.e.h$a */
    public static final class C86776a {
        static {
            Covode.recordClassIndex(102475);
        }

        private C86776a() {
        }

        public /* synthetic */ C86776a(byte b) {
            this();
        }
    }

    public C86775h(Effect effect) {
        C89219l.m154719c(effect, "");
        this.f195691a = effect;
    }

    /* renamed from: com.ss.ugc.effectplatform.e.h$b */
    static final class C86777b extends AbstractC89220m implements AbstractC89183m<Integer, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC86768c f195692a;

        static {
            Covode.recordClassIndex(102476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86777b(AbstractC86768c cVar) {
            super(2);
            this.f195692a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Long l) {
            int intValue = num.intValue();
            long longValue = l.longValue();
            AbstractC86768c cVar = this.f195692a;
            if (cVar != null) {
                cVar.mo140019a(intValue, longValue);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4448e.AbstractC86779j
    /* renamed from: a */
    public final String mo140021a(C88044c cVar, long j, AbstractC86768c cVar2) {
        C89219l.m154719c(cVar, "");
        String b = C86994k.m150674b(this.f195691a.getZipPath());
        if (b == null) {
            return null;
        }
        AbstractC86755f a = C86751d.m150298a(b);
        if (a instanceof C86752e) {
            Effect effect = this.f195691a;
            return ((C86752e) a).mo140016a(effect, cVar, effect.getFile_url().getUri(), j, new C86777b(cVar2));
        }
        String a2 = C86735a.C86736a.m150258a(this.f195691a.getId() + ".zip");
        if (a != null) {
            a.mo140004a(a2, cVar);
        }
        return this.f195691a.getZipPath();
    }
}
