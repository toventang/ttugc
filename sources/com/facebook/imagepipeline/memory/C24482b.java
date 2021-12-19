package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1836h.AbstractC24120c;
import com.facebook.imageutils.C24656a;

/* renamed from: com.facebook.imagepipeline.memory.b */
public class C24482b {

    /* renamed from: a */
    public final AbstractC24120c<Bitmap> f58174a;

    /* renamed from: b */
    private int f58175b;

    /* renamed from: c */
    private long f58176c;

    /* renamed from: d */
    private final int f58177d;

    /* renamed from: e */
    private final int f58178e;

    static {
        Covode.recordClassIndex(28626);
    }

    /* renamed from: a */
    public final synchronized int mo40359a() {
        int i;
        MethodCollector.m26663i(6002);
        i = this.f58175b;
        MethodCollector.m26664o(6002);
        return i;
    }

    /* renamed from: b */
    public final synchronized long mo40361b() {
        long j;
        MethodCollector.m26663i(6151);
        j = this.f58176c;
        MethodCollector.m26664o(6151);
        return j;
    }

    /* renamed from: c */
    public final synchronized int mo40363c() {
        int i;
        MethodCollector.m26663i(6294);
        i = this.f58177d;
        MethodCollector.m26664o(6294);
        return i;
    }

    /* renamed from: d */
    public final synchronized int mo40364d() {
        int i;
        MethodCollector.m26663i(6295);
        i = this.f58178e;
        MethodCollector.m26664o(6295);
        return i;
    }

    /* renamed from: a */
    public final synchronized boolean mo40360a(Bitmap bitmap) {
        MethodCollector.m26663i(5859);
        int a = C24656a.m47171a(bitmap);
        int i = this.f58175b;
        if (i < this.f58177d) {
            long j = this.f58176c;
            long j2 = (long) a;
            if (j + j2 <= ((long) this.f58178e)) {
                this.f58175b = i + 1;
                this.f58176c = j + j2;
                MethodCollector.m26664o(5859);
                return true;
            }
        }
        MethodCollector.m26664o(5859);
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo40362b(Bitmap bitmap) {
        boolean z;
        boolean z2;
        MethodCollector.m26663i(5861);
        int a = C24656a.m47171a(bitmap);
        if (this.f58175b > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45621a(z, "No bitmaps registered.");
        long j = (long) a;
        if (j <= this.f58176c) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Integer.valueOf(a), Long.valueOf(this.f58176c)};
        if (z2) {
            this.f58176c -= j;
            this.f58175b--;
            MethodCollector.m26664o(5861);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C24091i.m45619a("Bitmap size bigger than the total registered size: %d, %d", objArr));
            MethodCollector.m26664o(5861);
            throw illegalArgumentException;
        }
    }

    public C24482b(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        C24091i.m45620a(i2 <= 0 ? false : z2);
        this.f58177d = i;
        this.f58178e = i2;
        this.f58174a = new AbstractC24120c<Bitmap>() {
            /* class com.facebook.imagepipeline.memory.C24482b.C244831 */

            static {
                Covode.recordClassIndex(28627);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.p1836h.AbstractC24120c
            /* renamed from: a */
            public final /* synthetic */ void mo39665a(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                try {
                    C24482b.this.mo40362b(bitmap2);
                } finally {
                    bitmap2.recycle();
                }
            }
        };
    }
}
