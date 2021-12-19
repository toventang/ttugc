package com.bytedance.android.p150e.p151a.p152a;

import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.e.a.a.c */
public final class C2725c extends C2726d.AbstractC2727a {

    /* renamed from: b */
    private final byte[] f8132b = new byte[256];

    /* renamed from: c */
    private final InputStream f8133c;

    /* renamed from: d */
    private final int f8134d;

    /* renamed from: e */
    private int f8135e;

    static {
        Covode.recordClassIndex(3151);
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: a */
    public final boolean mo7300a() {
        if (this.f8134d - this.f8135e > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: b */
    public final byte mo7301b() {
        MethodCollector.m26663i(6869);
        this.f8135e++;
        byte read = (byte) this.f8133c.read();
        MethodCollector.m26664o(6869);
        return read;
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: a */
    public final void mo7299a(long j) {
        this.f8135e = (int) (((long) this.f8135e) + j);
        this.f8133c.skip(j);
    }

    C2725c(InputStream inputStream) {
        int i;
        this.f8133c = inputStream;
        try {
            i = inputStream.available();
        } catch (IOException unused) {
            i = -1;
        }
        this.f8134d = i;
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: b */
    public final byte[] mo7302b(long j) {
        MethodCollector.m26663i(7007);
        this.f8135e = (int) (((long) this.f8135e) + j);
        byte[] bArr = new byte[((int) j)];
        this.f8133c.read(bArr);
        MethodCollector.m26664o(7007);
        return bArr;
    }

    @Override // com.bytedance.android.p150e.p151a.p152a.C2726d.AbstractC2728b
    /* renamed from: c */
    public final String mo7303c(long j) {
        byte[] bArr;
        MethodCollector.m26663i(7164);
        this.f8135e = (int) (((long) this.f8135e) + j);
        if (j > 256) {
            int i = (int) j;
            bArr = new byte[i];
            this.f8133c.read(bArr, 0, i);
        } else {
            this.f8133c.read(this.f8132b, 0, (int) j);
            bArr = this.f8132b;
        }
        String str = new String(bArr, 0, (int) j, f8136a);
        MethodCollector.m26664o(7164);
        return str;
    }
}
