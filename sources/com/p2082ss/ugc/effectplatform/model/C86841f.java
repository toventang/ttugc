package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import p4519d.p4520a.p4521a.C87989b;
import p4519d.p4520a.p4534g.C88067b;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.f */
public final class C86841f {

    /* renamed from: a */
    public C88067b<String, C86842a> f195762a = new C88067b<>();

    /* renamed from: b */
    public C87989b<String, ModelInfo> f195763b = new C87989b<>();

    static {
        Covode.recordClassIndex(102566);
    }

    /* renamed from: com.ss.ugc.effectplatform.model.f$a */
    public static final class C86842a {

        /* renamed from: a */
        public ModelInfo f195764a;

        static {
            Covode.recordClassIndex(102567);
        }

        public final int hashCode() {
            return this.f195764a.hashCode();
        }

        public C86842a(ModelInfo modelInfo) {
            C89219l.m154719c(modelInfo, "");
            this.f195764a = modelInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                return C89219l.m154714a(this.f195764a, ((C86842a) obj).f195764a);
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: a */
    public final void mo140163a(C88067b<String, C86842a> bVar) {
        C89219l.m154719c(bVar, "");
        this.f195762a = bVar;
        this.f195763b.clear();
        for (T t : bVar.mo142621a()) {
            this.f195763b.put(t.f195764a.getName(), t.f195764a);
        }
    }

    /* renamed from: a */
    public final ExtendedUrlModel mo140162a(String str) {
        C89219l.m154719c(str, "");
        for (T t : this.f195762a.mo142621a()) {
            if (C89219l.m154714a((Object) t.f195764a.getName(), (Object) str)) {
                return t.f195764a.getFile_url();
            }
        }
        throw new IllegalArgumentException("modelName " + str + " doesn't exist");
    }
}
