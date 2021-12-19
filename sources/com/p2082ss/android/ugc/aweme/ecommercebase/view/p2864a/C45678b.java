package com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.a.b */
public final class C45678b {

    /* renamed from: d */
    public static final C45679a f106340d = new C45679a((byte) 0);

    /* renamed from: a */
    public final C45677a f106341a;

    /* renamed from: b */
    public final C45677a f106342b;

    /* renamed from: c */
    public final C45677a f106343c;

    static {
        Covode.recordClassIndex(54189);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45678b)) {
            return false;
        }
        C45678b bVar = (C45678b) obj;
        return C89219l.m154714a(this.f106341a, bVar.f106341a) && C89219l.m154714a(this.f106342b, bVar.f106342b) && C89219l.m154714a(this.f106343c, bVar.f106343c);
    }

    public final int hashCode() {
        C45677a aVar = this.f106341a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C45677a aVar2 = this.f106342b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C45677a aVar3 = this.f106343c;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TagVO(icon=" + this.f106341a + ", background=" + this.f106342b + ", tagVOText=" + this.f106343c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.a.b$a */
    public static final class C45679a {
        static {
            Covode.recordClassIndex(54190);
        }

        private C45679a() {
        }

        public /* synthetic */ C45679a(byte b) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45678b m88187a(com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionItem r8) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45678b.C45679a.m88187a(com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem):com.ss.android.ugc.aweme.ecommercebase.view.a.b");
        }
    }

    public C45678b(C45677a aVar, C45677a aVar2, C45677a aVar3) {
        this.f106341a = aVar;
        this.f106342b = aVar2;
        this.f106343c = aVar3;
    }
}
