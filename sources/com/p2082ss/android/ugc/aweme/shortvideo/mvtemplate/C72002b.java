package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20725b;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20730g;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20731h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.b */
public final class C72002b implements AbstractC20731h {

    /* renamed from: a */
    public static final C72003a f161356a = new C72003a((byte) 0);

    /* renamed from: b */
    private final Paint f161357b = new Paint();

    static {
        Covode.recordClassIndex(84642);
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20731h
    /* renamed from: a */
    public final String mo34154a() {
        return "top_bottom_black_transform";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.b$a */
    public static final class C72003a {
        static {
            Covode.recordClassIndex(84643);
        }

        private C72003a() {
        }

        public /* synthetic */ C72003a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20731h
    /* renamed from: a */
    public final AbstractC20725b mo34153a(Bitmap bitmap, AbstractC20730g gVar) {
        int i;
        int i2;
        C89219l.m154721d(bitmap, "");
        C89219l.m154721d(gVar, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            i2 = (width - height) / 2;
            i = width;
        } else {
            i = height;
            i2 = 0;
        }
        AbstractC20725b a = gVar.mo34152a(width, i, Bitmap.Config.RGB_565);
        C89219l.m154716b(a, "");
        new Canvas(a.mo34145a()).drawBitmap(bitmap, new Rect(0, 0, width, height), new Rect(0, i2, width, height + i2), this.f161357b);
        return a;
    }
}
