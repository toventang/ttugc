package com.facebook.imagepipeline.p1888m;

import android.graphics.Bitmap;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;

/* renamed from: com.facebook.imagepipeline.m.b */
public class C24471b extends AbstractC24635a {

    /* renamed from: a */
    private final int f58123a;

    /* renamed from: b */
    private final int f58124b;

    /* renamed from: c */
    private AbstractC24026e f58125c;

    static {
        Covode.recordClassIndex(28614);
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public AbstractC24026e getPostprocessorCacheKey() {
        if (this.f58125c == null) {
            this.f58125c = new C24031j(C1764a.m5929a(null, "i%dr%d", new Object[]{Integer.valueOf(this.f58123a), Integer.valueOf(this.f58124b)}));
        }
        return this.f58125c;
    }

    public C24471b(int i) {
        this(i, (byte) 0);
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a
    public void process(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.f58123a, this.f58124b);
    }

    private C24471b(int i, byte b) {
        boolean z = true;
        C24091i.m45620a(true);
        C24091i.m45620a(i <= 0 ? false : z);
        this.f58123a = 3;
        this.f58124b = i;
    }
}
