package com.bytedance.android.p150e.p151a.p152a;

import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.e.a.a.a */
public final class C2723a extends C2726d.AbstractC2727a {

    /* renamed from: b */
    private final byte[] f8130b;

    /* renamed from: c */
    private int f8131c;

    static {
        Covode.recordClassIndex(3149);
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: a */
    public final boolean mo7300a() {
        if (this.f8130b.length - this.f8131c > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: b */
    public final byte mo7301b() {
        byte[] bArr = this.f8130b;
        int i = this.f8131c;
        this.f8131c = i + 1;
        return bArr[i];
    }

    C2723a(byte[] bArr) {
        this.f8130b = bArr;
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: a */
    public final void mo7299a(long j) {
        this.f8131c = (int) (((long) this.f8131c) + j);
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: b */
    public final byte[] mo7302b(long j) {
        int i = (int) j;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f8130b, this.f8131c, bArr, 0, i);
        this.f8131c += i;
        return bArr;
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: c */
    public final String mo7303c(long j) {
        String str = new String(this.f8130b, this.f8131c, (int) j, f8136a);
        this.f8131c = (int) (((long) this.f8131c) + j);
        return str;
    }
}
