package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.assetpacks.ax */
final class C26790ax extends OutputStream {

    /* renamed from: a */
    private final C26818by f63524a = new C26818by();

    /* renamed from: b */
    private final File f63525b;

    /* renamed from: c */
    private final C26833cm f63526c;

    /* renamed from: d */
    private long f63527d;

    /* renamed from: e */
    private long f63528e;

    /* renamed from: f */
    private FileOutputStream f63529f;

    /* renamed from: g */
    private C26839cs f63530g;

    static {
        Covode.recordClassIndex(32265);
    }

    C26790ax(File file, C26833cm cmVar) {
        MethodCollector.m26663i(14238);
        this.f63525b = file;
        this.f63526c = cmVar;
        MethodCollector.m26664o(14238);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int min;
        int i3 = i2;
        int i4 = i;
        MethodCollector.m26663i(14246);
        while (i3 > 0) {
            if (this.f63527d == 0 && this.f63528e == 0) {
                int a = this.f63524a.mo44513a(bArr, i4, i3);
                if (a == -1) {
                    MethodCollector.m26664o(14246);
                    return;
                }
                i4 += a;
                i3 -= a;
                C26839cs a2 = this.f63524a.mo44514a();
                this.f63530g = a2;
                if (a2.f63678e) {
                    this.f63527d = 0;
                    this.f63526c.mo44531b(this.f63530g.f63679f, this.f63530g.f63679f.length);
                    this.f63528e = (long) this.f63530g.f63679f.length;
                } else if (!this.f63530g.mo44536b() || this.f63530g.mo44535a()) {
                    byte[] bArr2 = this.f63530g.f63679f;
                    this.f63526c.mo44531b(bArr2, bArr2.length);
                    this.f63527d = this.f63530g.f63675b;
                } else {
                    this.f63526c.mo44526a(this.f63530g.f63679f);
                    File file = new File(this.f63525b, this.f63530g.f63674a);
                    file.getParentFile().mkdirs();
                    this.f63527d = this.f63530g.f63675b;
                    this.f63529f = new FileOutputStream(file);
                }
            }
            if (!this.f63530g.mo44535a()) {
                if (this.f63530g.f63678e) {
                    this.f63526c.mo44523a(this.f63528e, bArr, i4, i3);
                    this.f63528e += (long) i3;
                    min = i3;
                } else if (this.f63530g.mo44536b()) {
                    min = (int) Math.min((long) i3, this.f63527d);
                    this.f63529f.write(bArr, i4, min);
                    long j = this.f63527d - ((long) min);
                    this.f63527d = j;
                    if (j == 0) {
                        this.f63529f.close();
                    }
                } else {
                    min = (int) Math.min((long) i3, this.f63527d);
                    int length = this.f63530g.f63679f.length;
                    this.f63526c.mo44523a((((long) length) + this.f63530g.f63675b) - this.f63527d, bArr, i4, min);
                    this.f63527d -= (long) min;
                }
                i4 += min;
                i3 -= min;
            }
        }
        MethodCollector.m26664o(14246);
    }
}
