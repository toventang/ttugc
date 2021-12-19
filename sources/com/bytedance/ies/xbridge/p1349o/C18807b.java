package com.bytedance.ies.xbridge.p1349o;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18467c;
import com.bytedance.ies.xbridge.C18513f;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.o.b */
public final class C18807b {

    /* renamed from: a */
    public static final C18807b f44595a = new C18807b();

    private C18807b() {
    }

    static {
        Covode.recordClassIndex(21503);
    }

    /* renamed from: com.bytedance.ies.xbridge.o.b$a */
    public static final class C18808a implements AbstractC18467c {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f44596a;

        /* renamed from: b */
        final /* synthetic */ C18513f f44597b;

        /* renamed from: c */
        final /* synthetic */ EnumC18483e f44598c;

        /* renamed from: d */
        final /* synthetic */ C18742c f44599d;

        static {
            Covode.recordClassIndex(21504);
        }

        @Override // com.bytedance.ies.xbridge.AbstractC18467c
        /* renamed from: a */
        public final AbstractC18400b mo13408a() {
            AbstractC18400b bVar = (AbstractC18400b) ((Class) this.f44596a.getValue()).newInstance();
            bVar.mo29430a(this.f44599d);
            C89219l.m154709a((Object) bVar, "");
            return bVar;
        }

        public C18808a(Map.Entry entry, C18513f fVar, EnumC18483e eVar, C18742c cVar) {
            this.f44596a = entry;
            this.f44597b = fVar;
            this.f44598c = eVar;
            this.f44599d = cVar;
        }
    }
}
