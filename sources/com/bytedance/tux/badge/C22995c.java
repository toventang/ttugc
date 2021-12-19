package com.bytedance.tux.badge;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22978b;
import com.bytedance.tux.p1708b.C22982f;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1711d.C23011a;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.badge.c */
public final class C22995c extends Drawable {

    /* renamed from: j */
    public static final C22996a f54401j = new C22996a((byte) 0);

    /* renamed from: a */
    public int f54402a;

    /* renamed from: b */
    public int f54403b;

    /* renamed from: c */
    public int f54404c;

    /* renamed from: d */
    public String f54405d = "";

    /* renamed from: e */
    public float f54406e;

    /* renamed from: f */
    public float f54407f;

    /* renamed from: g */
    public int f54408g;

    /* renamed from: h */
    public int f54409h;

    /* renamed from: i */
    public int f54410i;

    /* renamed from: k */
    private final Paint f54411k;

    /* renamed from: l */
    private final Path f54412l;

    /* renamed from: m */
    private final RectF f54413m;

    /* renamed from: n */
    private final Matrix f54414n;

    /* renamed from: o */
    private float f54415o;

    static {
        Covode.recordClassIndex(26914);
    }

    public final int getOpacity() {
        return -1;
    }

    /* renamed from: com.bytedance.tux.badge.c$a */
    public static final class C22996a {
        static {
            Covode.recordClassIndex(26915);
        }

        private C22996a() {
        }

        public /* synthetic */ C22996a(byte b) {
            this();
        }
    }

    public final int getIntrinsicHeight() {
        return this.f54403b;
    }

    public final int getIntrinsicWidth() {
        return this.f54404c;
    }

    public final int getMinimumHeight() {
        return this.f54403b;
    }

    public final int getMinimumWidth() {
        return this.f54404c;
    }

    public final int getAlpha() {
        return this.f54411k.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f54411k.getColorFilter();
    }

    /* renamed from: a */
    public final void mo37336a() {
        int length = this.f54405d.length();
        if (length == 0) {
            int i = this.f54410i;
            this.f54404c = i;
            this.f54403b = i;
        } else if (length != 1) {
            this.f54403b = (int) ((float) Math.ceil((double) this.f54415o));
            float measureText = this.f54411k.measureText(this.f54405d);
            double d = (double) this.f54415o;
            Double.isNaN(d);
            double d2 = (double) measureText;
            Double.isNaN(d2);
            this.f54404c = (int) Math.ceil((d * 0.6666666666666666d) + d2);
        } else {
            this.f54404c = (int) ((float) Math.ceil((double) this.f54415o));
            this.f54403b = (int) ((float) Math.ceil((double) this.f54415o));
        }
    }

    /* renamed from: b */
    private final void m43372b() {
        Map<Integer, Object> map;
        Paint paint = this.f54411k;
        int i = this.f54402a;
        C89219l.m154719c(paint, "");
        C22978b a = C22982f.m43324a((int) R.attr.ap2, i);
        if (a == null || (map = a.f54330a) == null) {
            C89041ag.m154415a();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == C22983g.m43334h().f54332a) {
                    C22983g.m43334h();
                    Object value = entry.getValue();
                    C89219l.m154719c(value, "");
                    float floatValue = ((Number) value).floatValue();
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    paint.setTextSize(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
                } else if (intValue == C22983g.m43336j().f54332a) {
                    C22983g.m43336j();
                    Object value2 = entry.getValue();
                    C89219l.m154719c(value2, "");
                    Typeface a2 = C23011a.m43398a((String) value2);
                    if (a2 != null) {
                        paint.setTypeface(a2);
                    }
                } else {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        float f = this.f54411k.getFontMetrics().descent - this.f54411k.getFontMetrics().ascent;
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        this.f54415o = f + TypedValue.applyDimension(1, 3.0f, system2.getDisplayMetrics());
    }

    /* renamed from: a */
    public final void mo37337a(String str) {
        C89219l.m154719c(str, "");
        this.f54405d = str;
    }

    public final void setAlpha(int i) {
        this.f54411k.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f54411k.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        canvas.translate(this.f54406e, this.f54407f);
        int length = this.f54405d.length();
        if (length == 0) {
            float f = ((float) this.f54410i) / 2.0f;
            this.f54411k.setColor(this.f54409h);
            canvas.drawCircle(f, f, f, this.f54411k);
        } else if (length != 1) {
            float measureText = this.f54411k.measureText(this.f54405d);
            float f2 = this.f54415o;
            double d = (double) f2;
            Double.isNaN(d);
            double d2 = (double) measureText;
            Double.isNaN(d2);
            float f3 = (float) ((d * 0.6666666666666666d) + d2);
            float f4 = f2 / 2.0f;
            this.f54411k.setColor(this.f54409h);
            RectF rectF = this.f54413m;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            float f5 = f4 * 2.0f;
            rectF.right = f5;
            rectF.bottom = f5;
            canvas.drawArc(this.f54413m, 90.0f, 180.0f, true, this.f54411k);
            canvas.drawRect(f4, 0.0f, f3 - f4, this.f54415o, this.f54411k);
            RectF rectF2 = this.f54413m;
            rectF2.left = f3 - f5;
            rectF2.top = 0.0f;
            rectF2.right = f3;
            rectF2.bottom = f5;
            canvas.drawArc(this.f54413m, -90.0f, 180.0f, true, this.f54411k);
            this.f54411k.setColor(this.f54408g);
            Paint paint = this.f54411k;
            String str = this.f54405d;
            paint.getTextPath(str, 0, str.length(), 0.0f, 0.0f, this.f54412l);
            this.f54412l.computeBounds(this.f54413m, true);
            this.f54414n.reset();
            this.f54414n.setTranslate(((f3 - this.f54413m.width()) / 2.0f) - this.f54413m.left, ((this.f54415o - this.f54413m.height()) / 2.0f) - this.f54413m.top);
            this.f54412l.transform(this.f54414n);
            canvas.drawPath(this.f54412l, this.f54411k);
        } else {
            float f6 = this.f54415o / 2.0f;
            this.f54411k.setColor(this.f54409h);
            canvas.drawCircle(f6, f6, f6, this.f54411k);
            this.f54411k.setColor(this.f54408g);
            Paint paint2 = this.f54411k;
            String str2 = this.f54405d;
            paint2.getTextPath(str2, 0, str2.length(), 0.0f, 0.0f, this.f54412l);
            this.f54412l.computeBounds(this.f54413m, true);
            float height = (this.f54415o - this.f54413m.height()) / 2.0f;
            float width = (this.f54415o - this.f54413m.width()) / 2.0f;
            if (C89219l.m154714a((Object) this.f54405d, (Object) "1")) {
                width *= 0.9f;
            }
            this.f54414n.reset();
            this.f54414n.setTranslate(width - this.f54413m.left, height - this.f54413m.top);
            this.f54412l.transform(this.f54414n);
            this.f54411k.setColor(this.f54408g);
            canvas.drawPath(this.f54412l, this.f54411k);
        }
        canvas.translate(-this.f54406e, -this.f54407f);
    }

    public C22995c(int i, int i2, int i3, int i4) {
        this.f54408g = i2;
        this.f54409h = i3;
        this.f54410i = i4;
        this.f54402a = i;
        Paint paint = new Paint();
        this.f54411k = paint;
        this.f54412l = new Path();
        this.f54413m = new RectF();
        this.f54414n = new Matrix();
        paint.setAntiAlias(true);
        m43372b();
    }
}
