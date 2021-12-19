package com.p2082ss.ugc.effectplatform;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.d */
public final class C86758d {
    static {
        Covode.recordClassIndex(102457);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.d$a */
    public static final class C86759a extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC86780f f195656a;

        /* renamed from: b */
        final /* synthetic */ String f195657b;

        static {
            Covode.recordClassIndex(102458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86759a(AbstractC86780f fVar, String str) {
            super(1);
            this.f195656a = fVar;
            this.f195657b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            C89219l.m154719c(str2, "");
            String decrypt = this.f195656a.decrypt(str2, this.f195657b);
            if (decrypt == null) {
                return "";
            }
            return decrypt;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.d$b */
    public static final class C86760b extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C86760b f195658a = new C86760b();

        static {
            Covode.recordClassIndex(102459);
        }

        C86760b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            String str2 = str;
            C89219l.m154719c(str2, "");
            return Boolean.valueOf(!C89361p.m154870a((CharSequence) str2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (p4600h.p4622m.C89361p.m154870a((java.lang.CharSequence) r0) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r5 = "760.0.0.148-alpha.2-mt";
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.String> m150314a(com.p2082ss.ugc.effectplatform.AbstractC86780f r3, java.util.List<java.lang.String> r4, java.lang.String r5) {
        /*
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r3, r1)
            p4600h.p4611f.p4613b.C89219l.m154719c(r5, r1)
            if (r4 != 0) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            boolean r0 = com.p2082ss.ugc.effectplatform.p4447d.C86761a.f195659a
            if (r0 == 0) goto L_0x003d
            p4600h.p4611f.p4613b.C89219l.m154719c(r3, r1)
            p4600h.p4611f.p4613b.C89219l.m154719c(r4, r1)
            p4600h.p4611f.p4613b.C89219l.m154719c(r5, r1)
            java.util.Iterator r2 = r4.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r1)
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = r3.decrypt(r1, r5)
            if (r0 == 0) goto L_0x003b
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r0)
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            java.lang.String r5 = "760.0.0.148-alpha.2-mt"
        L_0x003d:
            h.l.h r1 = p4600h.p4601a.C89070n.m154598r(r4)
            com.ss.ugc.effectplatform.d$a r0 = new com.ss.ugc.effectplatform.d$a
            r0.<init>(r3, r5)
            h.l.h r1 = p4600h.p4621l.C89309k.m154810e(r1, r0)
            com.ss.ugc.effectplatform.d$b r0 = com.p2082ss.ugc.effectplatform.C86758d.C86760b.f195658a
            h.l.h r0 = p4600h.p4621l.C89309k.m154799a(r1, r0)
            java.util.List r0 = p4600h.p4621l.C89309k.m154813g(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.C86758d.m150314a(com.ss.ugc.effectplatform.f, java.util.List, java.lang.String):java.util.List");
    }
}
