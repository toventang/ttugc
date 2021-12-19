package com.bytedance.android.livesdk.p476c;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.c.a */
public final class C7250a extends AbstractC7252c {
    static {
        Covode.recordClassIndex(7998);
    }

    public C7250a(List<C7256g> list) {
        super(list);
    }

    @Override // com.bytedance.android.livesdk.p476c.AbstractC7252c
    /* renamed from: a */
    public final C7256g mo13454a(float f) {
        int length = this.f18050a.length;
        if (length < 2) {
            return new C7256g(0.0f, 0.0f);
        }
        for (int i = 0; i < length; i++) {
            if (this.f18051b[i] == null) {
                this.f18051b[i] = new C7256g();
            }
            C7256g gVar = this.f18051b[i];
            C7256g gVar2 = this.f18050a[i];
            gVar.f18057a = gVar2.f18057a;
            gVar.f18058b = gVar2.f18058b;
        }
        C7256g[] gVarArr = this.f18051b;
        int length2 = gVarArr.length;
        for (int i2 = 1; i2 <= length2; i2++) {
            int i3 = 0;
            while (i3 < length2 - i2) {
                float f2 = 1.0f - f;
                int i4 = i3 + 1;
                gVarArr[i3].f18057a = (gVarArr[i3].f18057a * f2) + (gVarArr[i4].f18057a * f);
                gVarArr[i3].f18058b = (f2 * gVarArr[i3].f18058b) + (gVarArr[i4].f18058b * f);
                i3 = i4;
            }
        }
        return gVarArr[0];
    }
}
