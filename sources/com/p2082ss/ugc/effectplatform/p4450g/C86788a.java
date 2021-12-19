package com.p2082ss.ugc.effectplatform.p4450g;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.ugc.effectplatform.g.a */
public final class C86788a {
    static {
        Covode.recordClassIndex(102487);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.g.a$a */
    public static final class C86789a extends AbstractC89220m implements AbstractC89171a<Charset> {

        /* renamed from: a */
        final /* synthetic */ EnumC88043b f195695a;

        static {
            Covode.recordClassIndex(102488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86789a(EnumC88043b bVar) {
            super(0);
            this.f195695a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Charset invoke() {
            if (C86790b.f195696a[this.f195695a.ordinal()] != 1) {
                return C89338d.f202990a;
            }
            return C89338d.f202994e;
        }
    }

    /* renamed from: a */
    public static final byte[] m150337a(String str) {
        C89219l.m154719c(str, "");
        byte[] bytes = str.getBytes(C89338d.f202990a);
        C89219l.m154709a((Object) bytes, "");
        return bytes;
    }

    /* renamed from: a */
    public static final String m150336a(byte[] bArr, int i, int i2, EnumC88043b bVar) {
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(bVar, "");
        return new String(bArr, i, i2, (Charset) new C86789a(bVar).invoke());
    }
}
