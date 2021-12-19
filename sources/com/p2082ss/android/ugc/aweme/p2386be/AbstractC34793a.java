package com.p2082ss.android.ugc.aweme.p2386be;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.p2727db.AbstractC40940e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.be.a */
public abstract class AbstractC34793a implements AbstractC17641a {

    /* renamed from: a */
    public AbstractC40940e f82131a;

    /* renamed from: b */
    public String f82132b;

    /* renamed from: c */
    private final boolean f82133c;

    /* renamed from: d */
    private final boolean f82134d;

    /* renamed from: e */
    private final Object f82135e;

    static {
        Covode.recordClassIndex(41789);
    }

    public AbstractC34793a() {
        this(false, false, null, null, 15);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    /* renamed from: a */
    public boolean mo61500a() {
        return this.f82133c;
    }

    /* renamed from: b */
    public boolean mo61501b() {
        return this.f82134d;
    }

    /* renamed from: c */
    public Object mo61502c() {
        return this.f82135e;
    }

    /* renamed from: a */
    public final void mo61499a(String str) {
        C89219l.m154721d(str, "");
        this.f82132b = str;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    private AbstractC34793a(boolean z, boolean z2, Object obj, String str) {
        C89219l.m154721d(str, "");
        this.f82133c = z;
        this.f82134d = z2;
        this.f82135e = obj;
        this.f82132b = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AbstractC34793a(boolean r2, boolean r3, java.lang.Object r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000a
            r3 = 1
        L_0x000a:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x000f
            r4 = 0
        L_0x000f:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x0020
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r0)
        L_0x0020:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a.<init>(boolean, boolean, java.lang.Object, java.lang.String, int):void");
    }
}
