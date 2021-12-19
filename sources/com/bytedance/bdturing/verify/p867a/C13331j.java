package com.bytedance.bdturing.verify.p867a;

import com.bytedance.bdturing.p866f.C13284b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.verify.a.j */
public final class C13331j extends AbstractC13322a {

    /* renamed from: f */
    public final String f32591f;

    /* renamed from: g */
    private AbstractC13322a f32592g;

    /* renamed from: h */
    private int f32593h;

    static {
        Covode.recordClassIndex(15299);
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: d */
    public final int mo21497d() {
        return this.f32593h;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: a */
    public final boolean mo21494a() {
        AbstractC13322a aVar = this.f32592g;
        if (aVar != null) {
            return aVar.mo21494a();
        }
        return false;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: b */
    public final int mo21495b() {
        AbstractC13322a aVar = this.f32592g;
        if (aVar != null) {
            return aVar.mo21495b();
        }
        return 0;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: c */
    public final String mo21496c() {
        String c;
        AbstractC13322a aVar = this.f32592g;
        if (aVar == null || (c = aVar.mo21496c()) == null) {
            return "";
        }
        return c;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: a */
    public final void mo21493a(boolean z) {
        AbstractC13322a aVar = this.f32592g;
        if (aVar != null) {
            aVar.mo21493a(z);
        }
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: a */
    public final void mo21492a(StringBuilder sb) {
        C89219l.m154719c(sb, "");
        AbstractC13322a aVar = this.f32592g;
        if (aVar != null) {
            aVar.mo21492a(sb);
        }
        C13284b.m23896a(sb, "verify_data", this.f32591f);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        if (r4.equals("whirl") != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        if (r4.equals("slide") != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        if (r4.equals("text") != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0102, code lost:
        if (r4.equals("3d") != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0104, code lost:
        r10.f32592g = new com.bytedance.bdturing.verify.p867a.C13327f();
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0131 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C13331j(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.verify.p867a.C13331j.<init>(java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13331j(String str, byte b) {
        this(str);
        C89219l.m154719c(str, "");
    }
}
