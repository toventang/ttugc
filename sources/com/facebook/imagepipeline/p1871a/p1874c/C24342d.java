package com.facebook.imagepipeline.p1871a.p1874c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a;
import com.facebook.imagepipeline.p1871a.p1872a.C24320b;

/* renamed from: com.facebook.imagepipeline.a.c.d */
public final class C24342d {

    /* renamed from: a */
    private final AbstractC24319a f57722a;

    /* renamed from: b */
    private final AbstractC24344a f57723b;

    /* renamed from: c */
    private final Paint f57724c;

    /* renamed from: com.facebook.imagepipeline.a.c.d$a */
    public interface AbstractC24344a {
        static {
            Covode.recordClassIndex(28486);
        }

        /* renamed from: a */
        C24117a<Bitmap> mo40067a(int i);
    }

    static {
        Covode.recordClassIndex(28484);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.a.c.d$1 */
    public static /* synthetic */ class C243431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57725a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 28485(0x6f45, float:3.9916E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.imagepipeline.a.c.d$b[] r0 = com.facebook.imagepipeline.p1871a.p1874c.C24342d.EnumC24345b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.p1871a.p1874c.C24342d.C243431.f57725a = r2
                com.facebook.imagepipeline.a.c.d$b r0 = com.facebook.imagepipeline.p1871a.p1874c.C24342d.EnumC24345b.REQUIRED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.p1871a.p1874c.C24342d.C243431.f57725a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.imagepipeline.a.c.d$b r0 = com.facebook.imagepipeline.p1871a.p1874c.C24342d.EnumC24345b.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imagepipeline.p1871a.p1874c.C24342d.C243431.f57725a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.imagepipeline.a.c.d$b r0 = com.facebook.imagepipeline.p1871a.p1874c.C24342d.EnumC24345b.ABORT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imagepipeline.p1871a.p1874c.C24342d.C243431.f57725a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.imagepipeline.a.c.d$b r0 = com.facebook.imagepipeline.p1871a.p1874c.C24342d.EnumC24345b.SKIP     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1871a.p1874c.C24342d.C243431.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.a.c.d$b */
    public enum EnumC24345b {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT;

        static {
            Covode.recordClassIndex(28487);
        }
    }

    /* renamed from: a */
    private boolean m46340a(int i) {
        if (i == 0) {
            return true;
        }
        C24320b a = this.f57722a.mo40116a(i);
        C24320b a2 = this.f57722a.mo40116a(i - 1);
        if (a.f57677f == C24320b.EnumC24321a.NO_BLEND && m46341a(a)) {
            return true;
        }
        if (a2.f57678g != C24320b.EnumC24322b.DISPOSE_TO_BACKGROUND || !m46341a(a2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m46341a(C24320b bVar) {
        if (bVar.f57673b == 0 && bVar.f57674c == 0 && bVar.f57675d == this.f57722a.mo40122e() && bVar.f57676e == this.f57722a.mo40123f()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m46339a(Canvas canvas, C24320b bVar) {
        canvas.drawRect((float) bVar.f57673b, (float) bVar.f57674c, (float) (bVar.f57673b + bVar.f57675d), (float) (bVar.f57674c + bVar.f57676e), this.f57724c);
    }

    public C24342d(AbstractC24319a aVar, AbstractC24344a aVar2) {
        this.f57722a = aVar;
        this.f57723b = aVar2;
        Paint paint = new Paint();
        this.f57724c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* renamed from: a */
    private int m46338a(int i, Canvas canvas) {
        EnumC24345b bVar;
        while (i >= 0) {
            C24320b a = this.f57722a.mo40116a(i);
            C24320b.EnumC24322b bVar2 = a.f57678g;
            if (bVar2 == C24320b.EnumC24322b.DISPOSE_DO_NOT) {
                bVar = EnumC24345b.REQUIRED;
            } else if (bVar2 == C24320b.EnumC24322b.DISPOSE_TO_BACKGROUND) {
                if (m46341a(a)) {
                    bVar = EnumC24345b.NOT_REQUIRED;
                } else {
                    bVar = EnumC24345b.REQUIRED;
                }
            } else if (bVar2 == C24320b.EnumC24322b.DISPOSE_TO_PREVIOUS) {
                bVar = EnumC24345b.SKIP;
            } else {
                bVar = EnumC24345b.ABORT;
            }
            int i2 = C243431.f57725a[bVar.ordinal()];
            if (i2 == 1) {
                C24320b a2 = this.f57722a.mo40116a(i);
                C24117a<Bitmap> a3 = this.f57723b.mo40067a(i);
                if (a3 != null) {
                    try {
                        canvas.drawBitmap(a3.mo39695a(), 0.0f, 0.0f, (Paint) null);
                        if (a2.f57678g == C24320b.EnumC24322b.DISPOSE_TO_BACKGROUND) {
                            m46339a(canvas, a2);
                        }
                        return i + 1;
                    } finally {
                        a3.close();
                    }
                } else if (m46340a(i)) {
                    return i;
                }
            } else if (i2 == 2) {
                return i + 1;
            } else {
                if (i2 == 3) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo40141a(int i, Bitmap bitmap) {
        int i2;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!m46340a(i)) {
            i2 = m46338a(i - 1, canvas);
        } else {
            i2 = i;
        }
        while (i2 < i) {
            C24320b a = this.f57722a.mo40116a(i2);
            C24320b.EnumC24322b bVar = a.f57678g;
            if (bVar != C24320b.EnumC24322b.DISPOSE_TO_PREVIOUS) {
                if (a.f57677f == C24320b.EnumC24321a.NO_BLEND) {
                    m46339a(canvas, a);
                }
                this.f57722a.mo40117a(i2, canvas);
                if (bVar == C24320b.EnumC24322b.DISPOSE_TO_BACKGROUND) {
                    m46339a(canvas, a);
                }
            }
            i2++;
        }
        C24320b a2 = this.f57722a.mo40116a(i);
        if (a2.f57677f == C24320b.EnumC24321a.NO_BLEND) {
            m46339a(canvas, a2);
        }
        this.f57722a.mo40117a(i, canvas);
    }
}
