package com.bytedance.hybrid.spark;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1110d.C15564o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d */
public final class C15534d {

    /* renamed from: a */
    public static AbstractC15528b f37882a;

    /* renamed from: b */
    public static AbstractC15504a f37883b;

    /* renamed from: c */
    public static final C15535a f37884c = new C15535a((byte) 0);

    static {
        Covode.recordClassIndex(17796);
    }

    /* renamed from: com.bytedance.hybrid.spark.d$a */
    public static final class C15535a {
        static {
            Covode.recordClassIndex(17797);
        }

        private C15535a() {
        }

        public /* synthetic */ C15535a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d$b */
    public static final class C15536b {

        /* renamed from: a */
        public int f37885a;

        /* renamed from: b */
        public C15564o.C15565a.EnumC15566a f37886b;

        static {
            Covode.recordClassIndex(17798);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15536b)) {
                return false;
            }
            C15536b bVar = (C15536b) obj;
            return this.f37885a == bVar.f37885a && C89219l.m154714a(this.f37886b, bVar.f37886b);
        }

        public final int hashCode() {
            int i = this.f37885a * 31;
            C15564o.C15565a.EnumC15566a aVar = this.f37886b;
            return i + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "DefaultUIConfig(defaultStatusBarBgColor=" + this.f37885a + ", defaultStatusFontMode=" + this.f37886b + ")";
        }

        public /* synthetic */ C15536b() {
            this(C15564o.C15565a.EnumC15566a.DARK);
        }

        private C15536b(C15564o.C15565a.EnumC15566a aVar) {
            C89219l.m154719c(aVar, "");
            this.f37885a = 0;
            this.f37886b = aVar;
        }
    }
}
