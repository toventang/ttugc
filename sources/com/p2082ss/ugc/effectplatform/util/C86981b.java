package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.ugc.effectplatform.util.b */
public final class C86981b {
    static {
        Covode.recordClassIndex(102747);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.util.b$a */
    public static final class C86982a extends AbstractC89220m implements AbstractC89171a<Charset> {

        /* renamed from: a */
        final /* synthetic */ EnumC88043b f196131a;

        static {
            Covode.recordClassIndex(102748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86982a(EnumC88043b bVar) {
            super(0);
            this.f196131a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Charset invoke() {
            if (C86983c.f196132a[this.f196131a.ordinal()] != 1) {
                return C89338d.f202990a;
            }
            return C89338d.f202994e;
        }
    }

    /* renamed from: a */
    public static final String m150635a(byte[] bArr, EnumC88043b bVar) {
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(bVar, "");
        return new String(bArr, (Charset) new C86982a(bVar).invoke());
    }
}
