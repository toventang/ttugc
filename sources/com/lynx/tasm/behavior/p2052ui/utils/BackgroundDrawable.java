package com.lynx.tasm.behavior.p2052ui.utils;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28591d;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.utils.C28916c;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable */
public class BackgroundDrawable extends Drawable {

    /* renamed from: a */
    public C28691f f67602a;

    /* renamed from: b */
    public EnumC28687c[] f67603b;

    /* renamed from: c */
    public C28680b f67604c;

    /* renamed from: d */
    public boolean f67605d = true;

    /* renamed from: e */
    public int f67606e = 0;

    /* renamed from: f */
    public C28591d f67607f = null;

    /* renamed from: g */
    public C28683b f67608g;

    /* renamed from: h */
    public int f67609h;

    /* renamed from: i */
    private C28691f f67610i;

    /* renamed from: j */
    private C28691f f67611j;

    /* renamed from: k */
    private C28691f f67612k;

    /* renamed from: l */
    private PathEffect f67613l;

    /* renamed from: m */
    private C28680b f67614m;

    /* renamed from: n */
    private Map<C28680b.EnumC28681a, C28680b> f67615n;

    /* renamed from: o */
    private Path f67616o;

    /* renamed from: p */
    private Path f67617p;

    /* renamed from: q */
    private PointF f67618q;

    /* renamed from: r */
    private PointF f67619r;

    /* renamed from: s */
    private PointF f67620s;

    /* renamed from: t */
    private PointF f67621t;

    /* renamed from: u */
    private final Paint f67622u = new Paint(1);

    /* renamed from: v */
    private int f67623v = 255;

    /* renamed from: w */
    private final AbstractC28520j f67624w;

    /* renamed from: x */
    private float f67625x;

    static {
        Covode.recordClassIndex(34753);
    }

    /* renamed from: a */
    private static int m57398a(float f, float f2) {
        return ((((int) f) << 24) & -16777216) | (((int) f2) & 16777215);
    }

    /* renamed from: a */
    private static int m57399a(int i) {
        return (i & -16777216) | ((16711422 & i) >> 1);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getAlpha() {
        return this.f67623v;
    }

    /* renamed from: a */
    public final void mo49750a(int i, float f) {
        if (this.f67610i == null) {
            this.f67610i = new C28691f();
        }
        if (!C28916c.m57920a(this.f67610i.f67664a[i], f)) {
            this.f67610i.mo49782a(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.f67605d = true;
            }
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo49752a(int i, C28683b.C28684a aVar) {
        if (i > 0 && i <= 8) {
            C28683b bVar = this.f67608g;
            if (bVar == null) {
                this.f67608g = new C28683b();
                m57408c();
            } else {
                bVar.f67646d = null;
            }
            C28683b bVar2 = this.f67608g;
            int i2 = i - 1;
            if (i2 >= 0 && i2 < 8) {
                if (bVar2.f67645c == null) {
                    bVar2.f67645c = new C28683b.C28684a[8];
                }
                if (aVar == null) {
                    aVar = new C28683b.C28684a();
                }
                C28683b.C28684a aVar2 = bVar2.f67645c[i2];
                if (aVar2 == null || !C28916c.m57920a(aVar.f67650a, aVar2.f67650a) || !C28916c.m57920a(aVar.f67651b, aVar2.f67651b) || aVar.f67652c != aVar2.f67652c || aVar.f67653d != aVar2.f67653d) {
                    bVar2.f67645c[i2] = aVar;
                    this.f67605d = true;
                    invalidateSelf();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo49753a() {
        int i = 0;
        if (this.f67608g == null) {
            return false;
        }
        if (!this.f67605d) {
            return true;
        }
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return false;
        }
        this.f67605d = false;
        RectF b = mo49754b();
        m57408c();
        C28683b bVar = this.f67608g;
        float[] a = bVar != null ? bVar.mo49770a() : null;
        if (this.f67604c == null) {
            this.f67604c = new C28680b();
        }
        this.f67604c.mo49764a(bounds, a, b, 1.0f);
        if (this.f67614m == null) {
            this.f67614m = new C28680b();
        }
        this.f67614m.mo49764a(bounds, a, b, 0.0f);
        C28683b bVar2 = this.f67608g;
        if (bVar2 != null && bVar2.mo49771b()) {
            m57401a(C28680b.EnumC28681a.CENTER, bounds, a, b);
            if (this.f67603b != null) {
                boolean z = false;
                boolean z2 = false;
                do {
                    EnumC28687c cVar = this.f67603b[i];
                    if (cVar != null) {
                        if (cVar == EnumC28687c.DOUBLE) {
                            z = true;
                        } else if (cVar == EnumC28687c.GROOVE || cVar == EnumC28687c.RIDGE) {
                            z2 = true;
                        }
                    }
                    i++;
                } while (i <= 8);
                if (z) {
                    m57401a(C28680b.EnumC28681a.INNER3, bounds, a, b);
                    m57401a(C28680b.EnumC28681a.OUTER3, bounds, a, b);
                }
                if (z2) {
                    m57401a(C28680b.EnumC28681a.INNER2, bounds, a, b);
                    m57401a(C28680b.EnumC28681a.OUTER2, bounds, a, b);
                }
            }
        }
        Path path = this.f67616o;
        if (path == null) {
            this.f67616o = new Path();
        } else {
            path.reset();
        }
        this.f67616o.addRoundRect(new RectF(bounds), C28680b.m57417a(a, b, -0.5f), Path.Direction.CW);
        m57409d();
        return true;
    }

    /* renamed from: a */
    private void m57404a(Canvas canvas, int i, float f, int i2, int i3, boolean z) {
        this.f67622u.setPathEffect(null);
        this.f67622u.setStyle(Paint.Style.STROKE);
        this.f67622u.setStrokeWidth(f);
        boolean z2 = true;
        if (!(i == 1 || i == 0)) {
            z2 = false;
        }
        this.f67622u.setColor(C28689d.m57434a(z2 ? i3 : i2, this.f67623v));
        C28680b a = m57400a(z ? C28680b.EnumC28681a.OUTER3 : C28680b.EnumC28681a.OUTER2);
        if (a != null) {
            a.mo49763a(canvas, this.f67622u);
        }
        Paint paint = this.f67622u;
        if (!z2) {
            i2 = i3;
        }
        paint.setColor(C28689d.m57434a(i2, this.f67623v));
        C28680b a2 = m57400a(z ? C28680b.EnumC28681a.INNER3 : C28680b.EnumC28681a.INNER2);
        if (a2 != null) {
            a2.mo49763a(canvas, this.f67622u);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r5 == null) goto L_0x000d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m57405a(android.graphics.Canvas r18, int r19, int r20, float r21, float r22) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable.m57405a(android.graphics.Canvas, int, int, float, float):void");
    }

    /* renamed from: a */
    public final void mo49751a(int i, float f, float f2) {
        if (this.f67611j == null) {
            this.f67611j = new C28691f(0.0f);
        }
        if (!C28916c.m57920a(this.f67611j.f67664a[i], f)) {
            this.f67611j.mo49782a(i, f);
            invalidateSelf();
        }
        if (this.f67612k == null) {
            this.f67612k = new C28691f(255.0f);
        }
        if (!C28916c.m57920a(this.f67612k.f67664a[i], f2)) {
            this.f67612k.mo49782a(i, f2);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        int a = C28689d.m57434a(this.f67606e, this.f67623v) >>> 24;
        if (a == 255) {
            return -1;
        }
        if (a == 0) {
            return -2;
        }
        return -3;
    }

    /* renamed from: c */
    private void m57408c() {
        if (this.f67608g != null) {
            Rect bounds = getBounds();
            int i = 0;
            if (this.f67609h == 1) {
                i = 0 | C28683b.f67643a;
            }
            this.f67608g.mo49769a(i);
            this.f67608g.mo49768a((float) bounds.width(), (float) bounds.height());
        }
    }

    /* renamed from: e */
    private boolean m57410e() {
        EnumC28687c cVar;
        EnumC28687c cVar2;
        EnumC28687c cVar3;
        EnumC28687c[] cVarArr = this.f67603b;
        if (cVarArr == null) {
            return true;
        }
        EnumC28687c cVar4 = cVarArr[8];
        if (cVarArr[0] != null) {
            cVar = cVarArr[0];
        } else {
            cVar = cVar4;
        }
        if (cVarArr[2] != null) {
            cVar2 = cVarArr[2];
        } else {
            cVar2 = cVar4;
        }
        if (cVar2 != cVar) {
            return false;
        }
        if (cVarArr[1] != null) {
            cVar3 = cVarArr[1];
        } else {
            cVar3 = cVar4;
        }
        if (cVar3 != cVar) {
            return false;
        }
        if (cVarArr[3] != null) {
            cVar4 = cVarArr[3];
        }
        if (cVar4 != cVar) {
            return false;
        }
        if (cVar == null || cVar.isSolidDashedOrDotted()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$b */
    public static class C28680b {

        /* renamed from: a */
        public RectF f67629a;

        /* renamed from: b */
        public float[] f67630b;

        /* renamed from: c */
        public Path f67631c;

        /* renamed from: d */
        public boolean f67632d;

        static {
            Covode.recordClassIndex(34756);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$b$a */
        public enum EnumC28681a {
            CENTER,
            INNER2,
            OUTER2,
            INNER3,
            OUTER3;

            static {
                Covode.recordClassIndex(34757);
            }
        }

        /* renamed from: a */
        private static boolean m57416a(float[] fArr) {
            for (int i = 2; i <= 6; i += 2) {
                float f = fArr[i] - fArr[0];
                if (f <= 1.0E-4f && f >= -1.0E-4f) {
                    float f2 = fArr[i + 1] - fArr[1];
                    if (f2 <= 1.0E-4f && f2 >= -1.0E-4f) {
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo49763a(Canvas canvas, Paint paint) {
            if (this.f67632d) {
                RectF rectF = this.f67629a;
                float[] fArr = this.f67630b;
                canvas.drawRoundRect(rectF, fArr[0], fArr[1], paint);
                return;
            }
            canvas.drawPath(this.f67631c, paint);
        }

        /* renamed from: a */
        public static float[] m57417a(float[] fArr, RectF rectF, float f) {
            return new float[]{Math.max(fArr[0] - (rectF.left * f), 0.0f), Math.max(fArr[1] - (rectF.top * f), 0.0f), Math.max(fArr[2] - (rectF.right * f), 0.0f), Math.max(fArr[3] - (rectF.top * f), 0.0f), Math.max(fArr[4] - (rectF.right * f), 0.0f), Math.max(fArr[5] - (rectF.bottom * f), 0.0f), Math.max(fArr[6] - (rectF.left * f), 0.0f), Math.max(fArr[7] - (rectF.bottom * f), 0.0f)};
        }

        /* renamed from: a */
        public final void mo49764a(Rect rect, float[] fArr, RectF rectF, float f) {
            if (this.f67629a == null) {
                this.f67629a = new RectF();
            }
            this.f67629a.left = ((float) rect.left) + (rectF.left * f);
            this.f67629a.top = ((float) rect.top) + (rectF.top * f);
            this.f67629a.right = ((float) rect.right) - (rectF.right * f);
            this.f67629a.bottom = ((float) rect.bottom) - (rectF.bottom * f);
            float[] a = m57417a(fArr, rectF, f);
            this.f67630b = a;
            this.f67632d = m57416a(a);
            Path path = this.f67631c;
            if (path == null) {
                this.f67631c = new Path();
            } else {
                path.reset();
            }
            this.f67631c.addRoundRect(this.f67629a, this.f67630b, Path.Direction.CW);
        }
    }

    /* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$a */
    public enum EnumC28679a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END;

        static {
            Covode.recordClassIndex(34755);
        }
    }

    /* renamed from: b */
    public final RectF mo49754b() {
        float a = m57396a(0.0f, 8);
        float a2 = m57396a(a, 1);
        float a3 = m57396a(a, 3);
        float a4 = m57396a(a, 0);
        float a5 = m57396a(a, 2);
        Rect bounds = getBounds();
        float f = a4 + a5;
        if (f > ((float) bounds.width()) && bounds.width() > 0) {
            float width = ((float) bounds.width()) / f;
            a4 *= width;
            a5 *= width;
        }
        float f2 = a2 + a3;
        if (f2 > ((float) bounds.height()) && bounds.height() > 0) {
            float height = ((float) bounds.height()) / f2;
            a2 *= height;
            a3 *= height;
        }
        return new RectF(a4, a2, a5, a3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$1 */
    public static /* synthetic */ class C286781 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67626a;

        /* renamed from: b */
        static final /* synthetic */ int[] f67627b;

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00ad */
        static {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable.C286781.<clinit>():void");
        }
    }

    /* renamed from: d */
    private void m57409d() {
        RectF rectF = this.f67604c.f67629a;
        RectF rectF2 = this.f67614m.f67629a;
        float[] fArr = this.f67604c.f67630b;
        if (this.f67618q == null) {
            this.f67618q = new PointF();
        }
        this.f67618q.x = this.f67604c.f67629a.left;
        this.f67618q.y = this.f67604c.f67629a.top;
        m57402a((double) rectF.left, (double) rectF.top, (double) (rectF.left + (fArr[0] * 2.0f)), (double) (rectF.top + (fArr[1] * 2.0f)), (double) rectF2.left, (double) rectF2.top, (double) rectF.left, (double) rectF.top, this.f67618q);
        if (this.f67621t == null) {
            this.f67621t = new PointF();
        }
        this.f67621t.x = rectF.left;
        this.f67621t.y = rectF.bottom;
        m57402a((double) rectF.left, (double) (rectF.bottom - (fArr[6] * 2.0f)), (double) (rectF.left + (fArr[7] * 2.0f)), (double) rectF.bottom, (double) rectF2.left, (double) rectF2.bottom, (double) rectF.left, (double) rectF.bottom, this.f67621t);
        if (this.f67619r == null) {
            this.f67619r = new PointF();
        }
        this.f67619r.x = rectF.right;
        this.f67619r.y = rectF.top;
        m57402a((double) (rectF.right - (fArr[2] * 2.0f)), (double) rectF.top, (double) rectF.right, (double) (rectF.top + (fArr[3] * 2.0f)), (double) rectF2.right, (double) rectF2.top, (double) rectF.right, (double) rectF.top, this.f67619r);
        if (this.f67620s == null) {
            this.f67620s = new PointF();
        }
        this.f67620s.x = rectF.right;
        this.f67620s.y = rectF.bottom;
        m57402a((double) (rectF.right - (fArr[4] * 2.0f)), (double) (rectF.bottom - (fArr[5] * 2.0f)), (double) rectF.right, (double) rectF.bottom, (double) rectF2.right, (double) rectF2.bottom, (double) rectF.right, (double) rectF.bottom, this.f67620s);
    }

    public void setColor(int i) {
        this.f67606e = i;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f67605d = true;
        this.f67607f.mo49415a(rect);
    }

    public void setAlpha(int i) {
        if (i != this.f67623v) {
            this.f67623v = i;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    private EnumC28687c m57406b(int i) {
        EnumC28687c cVar;
        EnumC28687c[] cVarArr = this.f67603b;
        if (cVarArr != null) {
            if (cVarArr[i] != null) {
                cVar = cVarArr[i];
            } else {
                cVar = cVarArr[8];
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return EnumC28687c.SOLID;
    }

    /* renamed from: c */
    private int m57407c(int i) {
        float f;
        float f2;
        C28691f fVar = this.f67611j;
        if (fVar != null) {
            f = fVar.mo49781a(i);
        } else {
            f = 0.0f;
        }
        C28691f fVar2 = this.f67612k;
        if (fVar2 != null) {
            f2 = fVar2.mo49781a(i);
        } else {
            f2 = 255.0f;
        }
        return m57398a(f2, f);
    }

    /* renamed from: a */
    private static int m57397a(float f) {
        if (f <= 0.1f || f >= 1.0f) {
            return Math.round(f);
        }
        return 1;
    }

    public void getOutline(Outline outline) {
        Path path;
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if (this.f67608g == null || !mo49753a() || (path = this.f67616o) == null) {
            outline.setRect(getBounds());
        } else {
            outline.setConvexPath(path);
        }
    }

    /* renamed from: a */
    private C28680b m57400a(C28680b.EnumC28681a aVar) {
        Map<C28680b.EnumC28681a, C28680b> map;
        if (aVar == null || (map = this.f67615n) == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0496, code lost:
        if (r15 != false) goto L_0x0473;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r58) {
        /*
        // Method dump skipped, instructions count: 1873
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable.draw(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    private float m57396a(float f, int i) {
        C28691f fVar = this.f67602a;
        if (fVar == null) {
            return f;
        }
        float f2 = fVar.f67664a[i];
        if (C28542g.m57093a(f2)) {
            return f;
        }
        return f2;
    }

    public BackgroundDrawable(AbstractC28520j jVar, float f) {
        this.f67624w = jVar;
        this.f67625x = f;
        this.f67607f = new C28591d(jVar, this, f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3 == null) goto L_0x0011;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable.C28680b m57401a(com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable.C28680b.EnumC28681a r5, android.graphics.Rect r6, float[] r7, android.graphics.RectF r8) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable.m57401a(com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$b$a, android.graphics.Rect, float[], android.graphics.RectF):com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$b");
    }

    /* renamed from: a */
    private static void m57402a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (!Double.isNaN(d21) && !Double.isNaN(d22)) {
            pointF.x = (float) d21;
            pointF.y = (float) d22;
        }
    }

    /* renamed from: a */
    private void m57403a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
        if (z) {
            C28680b bVar = this.f67614m;
            if (bVar != null) {
                canvas.clipPath(bVar.f67631c, Region.Op.INTERSECT);
            }
            C28680b bVar2 = this.f67604c;
            if (bVar2 != null) {
                canvas.clipPath(bVar2.f67631c, Region.Op.DIFFERENCE);
            }
        }
        if (this.f67617p == null) {
            this.f67617p = new Path();
        }
        this.f67617p.reset();
        this.f67617p.moveTo(f, f2);
        this.f67617p.lineTo(f3, f4);
        this.f67617p.lineTo(f5, f6);
        this.f67617p.lineTo(f7, f8);
        this.f67617p.lineTo(f, f2);
        canvas.clipPath(this.f67617p);
    }
}
