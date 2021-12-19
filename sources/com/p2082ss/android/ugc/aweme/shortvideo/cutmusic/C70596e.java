package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e */
public final class C70596e extends View {

    /* renamed from: a */
    private TextPaint f157984a;

    /* renamed from: b */
    private Path f157985b;

    /* renamed from: c */
    private Paint f157986c;

    /* renamed from: d */
    private Paint f157987d;

    /* renamed from: e */
    private String f157988e;

    /* renamed from: f */
    private int f157989f;

    /* renamed from: g */
    private int f157990g;

    /* renamed from: h */
    private int f157991h;

    /* renamed from: i */
    private int f157992i;

    /* renamed from: j */
    private int f157993j;

    /* renamed from: k */
    private int f157994k;

    /* renamed from: l */
    private int f157995l;

    /* renamed from: m */
    private int f157996m;

    /* renamed from: n */
    private int f157997n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$a */
    public static final class C70597a {

        /* renamed from: a */
        public int f157998a;

        /* renamed from: b */
        public int f157999b;

        /* renamed from: c */
        public int f158000c;

        /* renamed from: d */
        public int f158001d;

        /* renamed from: e */
        public int f158002e;

        /* renamed from: f */
        public int f158003f;

        /* renamed from: g */
        public int f158004g;

        /* renamed from: h */
        public int f158005h;

        /* renamed from: i */
        public int f158006i;

        static {
            Covode.recordClassIndex(83063);
        }
    }

    static {
        Covode.recordClassIndex(83062);
    }

    public final void setText(String str) {
        this.f157988e = str;
        invalidate();
    }

    public final void setBgColor(int i) {
        Paint paint = this.f157986c;
        if (paint == null) {
            C89219l.m154710a("mBgPaint");
        }
        paint.setColor(i);
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.f157984a;
        if (textPaint == null) {
            C89219l.m154710a("textPaint");
        }
        textPaint.setColor(i);
        invalidate();
    }

    public final void setTextSize(int i) {
        TextPaint textPaint = this.f157984a;
        if (textPaint == null) {
            C89219l.m154710a("textPaint");
        }
        textPaint.setTextSize((float) i);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C70596e(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7122);
        TextPaint textPaint = new TextPaint();
        this.f157984a = textPaint;
        textPaint.setAntiAlias(true);
        this.f157986c = new Paint();
        this.f157985b = new Path();
        Paint paint = this.f157986c;
        if (paint == null) {
            C89219l.m154710a("mBgPaint");
        }
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f157987d = paint2;
        paint2.setAntiAlias(true);
        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41573g);
        if (a != null) {
            try {
                TextPaint textPaint2 = this.f157984a;
                if (textPaint2 == null) {
                    C89219l.m154710a("textPaint");
                }
                textPaint2.setTypeface(a);
                MethodCollector.m26664o(7122);
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        MethodCollector.m26664o(7122);
    }

    public final void setAttribute(C70597a aVar) {
        C89219l.m154721d(aVar, "");
        this.f157995l = aVar.f158004g;
        this.f157996m = aVar.f158005h;
        this.f157993j = aVar.f158002e;
        this.f157992i = aVar.f158001d;
        this.f157989f = aVar.f157998a;
        this.f157990g = aVar.f157999b;
        this.f157991h = aVar.f158000c;
        this.f157997n = aVar.f158006i;
        Paint paint = this.f157986c;
        if (paint == null) {
            C89219l.m154710a("mBgPaint");
        }
        paint.setColor(this.f157996m);
        Paint paint2 = this.f157987d;
        if (paint2 == null) {
            C89219l.m154710a("anglePaint");
        }
        paint2.setColor(this.f157996m);
        TextPaint textPaint = this.f157984a;
        if (textPaint == null) {
            C89219l.m154710a("textPaint");
        }
        textPaint.setColor(this.f157995l);
        TextPaint textPaint2 = this.f157984a;
        if (textPaint2 == null) {
            C89219l.m154710a("textPaint");
        }
        textPaint2.setTextSize((float) this.f157997n);
        this.f157994k = aVar.f158003f;
        Paint paint3 = this.f157987d;
        if (paint3 == null) {
            C89219l.m154710a("anglePaint");
        }
        paint3.setPathEffect(new CornerPathEffect((float) this.f157994k));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        if (!TextUtils.isEmpty(this.f157988e)) {
            TextPaint textPaint = this.f157984a;
            if (textPaint == null) {
                C89219l.m154710a("textPaint");
                C89219l.m154715b();
            }
            int measureText = ((int) textPaint.measureText(this.f157988e)) + (this.f157992i * 2);
            Rect rect = new Rect();
            TextPaint textPaint2 = this.f157984a;
            if (textPaint2 == null) {
                C89219l.m154710a("textPaint");
            }
            String str = this.f157988e;
            if (str == null) {
                C89219l.m154715b();
            }
            textPaint2.getTextBounds(str, 0, str.length(), rect);
            int height = rect.height() + (this.f157992i * 2);
            int i = this.f157993j;
            float f = (float) height;
            RectF rectF = new RectF((float) i, 0.0f, (float) (i + measureText), f);
            int i2 = this.f157993j;
            float f2 = (float) i2;
            float f3 = (float) i2;
            Paint paint = this.f157986c;
            if (paint == null) {
                C89219l.m154710a("mBgPaint");
            }
            canvas.drawRoundRect(rectF, f2, f3, paint);
            Path path = this.f157985b;
            if (path == null) {
                C89219l.m154710a("anglePath");
            }
            path.moveTo((float) (this.f157991h + this.f157989f + this.f157993j), f);
            Path path2 = this.f157985b;
            if (path2 == null) {
                C89219l.m154710a("anglePath");
            }
            path2.lineTo((float) (this.f157991h + (this.f157989f / 2) + this.f157993j), (float) (this.f157990g + height));
            Path path3 = this.f157985b;
            if (path3 == null) {
                C89219l.m154710a("anglePath");
            }
            path3.lineTo((float) (this.f157991h + this.f157993j), f);
            Path path4 = this.f157985b;
            if (path4 == null) {
                C89219l.m154710a("anglePath");
            }
            Paint paint2 = this.f157987d;
            if (paint2 == null) {
                C89219l.m154710a("anglePaint");
            }
            canvas.drawPath(path4, paint2);
            String str2 = this.f157988e;
            if (str2 == null) {
                C89219l.m154715b();
            }
            String str3 = this.f157988e;
            if (str3 == null) {
                C89219l.m154715b();
            }
            int length = str3.length();
            int i3 = this.f157992i;
            float f4 = (float) (this.f157993j + i3);
            float f5 = (float) ((height - i3) - 4);
            TextPaint textPaint3 = this.f157984a;
            if (textPaint3 == null) {
                C89219l.m154710a("textPaint");
                C89219l.m154715b();
            }
            canvas.drawText(str2, 0, length, f4, f5, (Paint) textPaint3);
        }
    }

    public /* synthetic */ C70596e(Context context, byte b) {
        this(context);
    }

    public final void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(this.f157988e)) {
            setMeasuredDimension(0, 0);
            return;
        }
        TextPaint textPaint = this.f157984a;
        if (textPaint == null) {
            C89219l.m154710a("textPaint");
            C89219l.m154715b();
        }
        int measureText = ((int) textPaint.measureText(this.f157988e)) + (this.f157992i * 2) + (this.f157993j * 2);
        Rect rect = new Rect();
        TextPaint textPaint2 = this.f157984a;
        if (textPaint2 == null) {
            C89219l.m154710a("textPaint");
            C89219l.m154715b();
        }
        String str = this.f157988e;
        if (str == null) {
            C89219l.m154715b();
        }
        textPaint2.getTextBounds(str, 0, str.length(), rect);
        setMeasuredDimension(measureText, rect.height() + (this.f157992i * 2) + this.f157990g);
    }
}
