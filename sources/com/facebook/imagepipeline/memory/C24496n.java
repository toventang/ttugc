package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24107d;
import com.facebook.common.p1836h.AbstractC24120c;
import com.facebook.common.p1836h.C24117a;

/* renamed from: com.facebook.imagepipeline.memory.n */
public final class C24496n {

    /* renamed from: a */
    final C24498a f58201a;

    /* renamed from: b */
    private final AbstractC24120c<byte[]> f58202b;

    static {
        Covode.recordClassIndex(28640);
    }

    /* renamed from: com.facebook.imagepipeline.memory.n$a */
    static class C24498a extends C24499o {
        static {
            Covode.recordClassIndex(28642);
        }

        /* access modifiers changed from: package-private */
        @Override // com.facebook.imagepipeline.memory.AbstractC24472a
        /* renamed from: e */
        public final C24487f<byte[]> mo40345e(int i) {
            return new C24511z(i, this.f58127b.f58173g);
        }

        public C24498a(AbstractC24107d dVar, C24480ad adVar, AbstractC24481ae aeVar) {
            super(dVar, adVar, aeVar);
        }
    }

    /* renamed from: a */
    public final C24117a<byte[]> mo40374a(int i) {
        return C24117a.m45707a(this.f58201a.mo39664a(i), this.f58202b);
    }

    public C24496n(AbstractC24107d dVar, C24480ad adVar) {
        boolean z;
        if (adVar.f58173g > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        this.f58201a = new C24498a(dVar, adVar, C24510y.m46846a());
        this.f58202b = new AbstractC24120c<byte[]>() {
            /* class com.facebook.imagepipeline.memory.C24496n.C244971 */

            static {
                Covode.recordClassIndex(28641);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.p1836h.AbstractC24120c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo39665a(byte[] bArr) {
                C24496n.this.f58201a.mo39665a(bArr);
            }
        };
    }
}
