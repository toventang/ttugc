package com.lynx.tasm.image.p2061b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.image.AbstractC28814d;
import com.lynx.tasm.image.C28794b;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.image.b.g */
public final class C28803g extends AbstractC28814d {

    /* renamed from: b */
    private final Matrix f67962b = new Matrix();

    /* renamed from: c */
    private final Rect f67963c = new Rect();

    /* renamed from: d */
    private final Rect f67964d = new Rect();

    static {
        Covode.recordClassIndex(34910);
    }

    public C28803g() {
        super(null);
    }

    /* renamed from: com.lynx.tasm.image.b.g$1 */
    static /* synthetic */ class C288041 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67965a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 34911(0x885f, float:4.8921E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.tasm.image.b$b[] r0 = com.lynx.tasm.image.C28794b.EnumC28796b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.image.p2061b.C28803g.C288041.f67965a = r2
                com.lynx.tasm.image.b$b r0 = com.lynx.tasm.image.C28794b.EnumC28796b.ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.image.p2061b.C28803g.C288041.f67965a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.tasm.image.b$b r0 = com.lynx.tasm.image.C28794b.EnumC28796b.ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.lynx.tasm.image.p2061b.C28803g.C288041.f67965a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.lynx.tasm.image.b$b r0 = com.lynx.tasm.image.C28794b.EnumC28796b.SCALE_TO_FILL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.p2061b.C28803g.C288041.<clinit>():void");
        }
    }

    @Override // com.lynx.tasm.image.AbstractC28814d
    /* renamed from: b */
    public final void mo49912b(Canvas canvas, Bitmap bitmap, C28794b bVar) {
        boolean z;
        float f;
        int i = bVar.f67939l;
        int i2 = bVar.f67940m;
        int i3 = bVar.f67941n;
        int i4 = bVar.f67942o;
        int i5 = bVar.f67931d;
        int i6 = bVar.f67932e;
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            z = false;
        } else {
            z = true;
            i5 = Math.max(0, (i5 - i) - i3);
            i6 = Math.max(0, (i6 - i2) - i4);
            canvas.save();
            canvas.translate((float) i, (float) i2);
            canvas.clipRect(0, 0, i5, i6);
        }
        float[] fArr = bVar.f67933f;
        if (fArr != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f2 = (float) height;
            int ceil = (int) Math.ceil((double) (fArr[0] * f2));
            float f3 = (float) width;
            int floor = (int) Math.floor((double) (fArr[1] * f3));
            int floor2 = (int) Math.floor((double) (fArr[2] * f2));
            int ceil2 = (int) Math.ceil((double) (fArr[3] * f3));
            this.f67963c.left = 0;
            this.f67963c.top = 0;
            this.f67963c.right = ceil2;
            this.f67963c.bottom = ceil;
            Rect rect = this.f67963c;
            canvas.drawBitmap(bitmap, rect, rect, (Paint) null);
            int i7 = width - floor;
            this.f67963c.left = i7;
            this.f67963c.top = 0;
            this.f67963c.right = width;
            this.f67963c.bottom = ceil;
            int i8 = i5 - floor;
            this.f67964d.left = i8;
            this.f67964d.top = 0;
            this.f67964d.right = i5;
            this.f67964d.bottom = ceil;
            canvas.drawBitmap(bitmap, this.f67963c, this.f67964d, (Paint) null);
            this.f67963c.left = i7;
            int i9 = height - floor2;
            this.f67963c.top = i9;
            this.f67963c.right = width;
            this.f67963c.bottom = height;
            this.f67964d.left = i8;
            int i10 = i6 - floor2;
            this.f67964d.top = i10;
            this.f67964d.right = i5;
            this.f67964d.bottom = i6;
            canvas.drawBitmap(bitmap, this.f67963c, this.f67964d, (Paint) null);
            this.f67963c.left = 0;
            this.f67963c.top = i9;
            this.f67963c.right = ceil2;
            this.f67963c.bottom = height;
            this.f67964d.left = 0;
            this.f67964d.top = i10;
            this.f67964d.right = ceil2;
            this.f67964d.bottom = i6;
            canvas.drawBitmap(bitmap, this.f67963c, this.f67964d, (Paint) null);
            this.f67963c.left = ceil2;
            this.f67963c.top = 0;
            this.f67963c.right = i7;
            this.f67963c.bottom = ceil;
            this.f67964d.left = ceil2;
            this.f67964d.top = 0;
            this.f67964d.right = i8;
            this.f67964d.bottom = ceil;
            canvas.drawBitmap(bitmap, this.f67963c, this.f67964d, (Paint) null);
            this.f67963c.left = i7;
            this.f67963c.top = ceil;
            this.f67963c.right = width;
            this.f67963c.bottom = i9;
            this.f67964d.left = i8;
            this.f67964d.top = ceil;
            this.f67964d.right = i5;
            this.f67964d.bottom = i10;
            canvas.drawBitmap(bitmap, this.f67963c, this.f67964d, (Paint) null);
            this.f67963c.left = ceil2;
            this.f67963c.top = i9;
            this.f67963c.right = i7;
            this.f67963c.bottom = height;
            this.f67964d.left = ceil2;
            this.f67964d.top = i10;
            this.f67964d.right = i8;
            this.f67964d.bottom = i6;
            canvas.drawBitmap(bitmap, this.f67963c, this.f67964d, (Paint) null);
            this.f67963c.left = 0;
            this.f67963c.top = ceil;
            this.f67963c.right = ceil2;
            this.f67963c.bottom = i9;
            this.f67964d.left = 0;
            this.f67964d.top = ceil;
            this.f67964d.right = ceil2;
            this.f67964d.bottom = i10;
            canvas.drawBitmap(bitmap, this.f67963c, this.f67964d, (Paint) null);
            this.f67963c.left = ceil2;
            this.f67963c.top = ceil;
            this.f67963c.right = i7;
            this.f67963c.bottom = i9;
            this.f67964d.left = ceil2;
            this.f67964d.top = ceil;
            this.f67964d.right = i8;
            this.f67964d.bottom = i10;
            canvas.drawBitmap(bitmap, this.f67963c, this.f67964d, (Paint) null);
        } else {
            this.f67962b.reset();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            int i11 = C288041.f67965a[bVar.f67929b.ordinal()];
            float f4 = 1.0f;
            if (i11 == 1) {
                f4 = Math.min(((float) i5) / ((float) width2), ((float) i6) / ((float) height2));
                f = f4;
            } else if (i11 == 2) {
                f4 = Math.max(((float) i5) / ((float) width2), ((float) i6) / ((float) height2));
                f = f4;
            } else if (i11 != 3) {
                f = 1.0f;
            } else {
                f4 = ((float) i5) / ((float) width2);
                f = ((float) i6) / ((float) height2);
            }
            this.f67962b.setTranslate(((float) (i5 - width2)) / 2.0f, ((float) (i6 - height2)) / 2.0f);
            this.f67962b.preScale(f4, f, ((float) width2) / 2.0f, ((float) height2) / 2.0f);
            canvas.drawBitmap(bitmap, this.f67962b, null);
        }
        if (z) {
            canvas.restore();
        }
    }
}
