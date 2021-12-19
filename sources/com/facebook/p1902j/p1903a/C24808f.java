package com.facebook.p1902j.p1903a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileInputStream;

/* renamed from: com.facebook.j.a.f */
final class C24808f {

    /* renamed from: a */
    FileInputStream f58863a;

    /* renamed from: b */
    int f58864b;

    /* renamed from: c */
    int f58865c;

    /* renamed from: d */
    private byte[] f58866d = new byte[512];

    static {
        Covode.recordClassIndex(28961);
    }

    /* renamed from: a */
    public final void mo40621a() {
        MethodCollector.m26663i(1473);
        if (this.f58864b >= this.f58865c) {
            this.f58865c = this.f58863a.read(this.f58866d);
            this.f58864b = 0;
        }
        while (true) {
            int i = this.f58865c;
            if (i == -1) {
                break;
            }
            byte[] bArr = this.f58866d;
            int i2 = this.f58864b;
            if (bArr[i2] == 10) {
                break;
            }
            int i3 = i2 + 1;
            this.f58864b = i3;
            if (i3 >= i) {
                this.f58865c = this.f58863a.read(bArr);
                this.f58864b = 0;
            }
        }
        this.f58864b++;
        MethodCollector.m26664o(1473);
    }

    /* renamed from: a */
    public final int mo40620a(byte[] bArr) {
        int i;
        MethodCollector.m26663i(1469);
        if (this.f58864b >= this.f58865c) {
            this.f58865c = this.f58863a.read(this.f58866d);
            this.f58864b = 0;
        }
        int i2 = 0;
        while (true) {
            i = this.f58865c;
            if (i == -1 || i2 >= bArr.length) {
                break;
            }
            byte[] bArr2 = this.f58866d;
            int i3 = this.f58864b;
            if (bArr2[i3] == 10) {
                break;
            }
            bArr[i2] = bArr2[i3];
            int i4 = i3 + 1;
            this.f58864b = i4;
            if (i4 >= i) {
                this.f58865c = this.f58863a.read(bArr2);
                this.f58864b = 0;
            }
            i2++;
        }
        this.f58864b++;
        if (i == -1) {
            MethodCollector.m26664o(1469);
            return -1;
        }
        MethodCollector.m26664o(1469);
        return i2;
    }
}
