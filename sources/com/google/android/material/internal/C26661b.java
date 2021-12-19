package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.C0405al;
import androidx.core.p035f.AbstractC0679e;
import androidx.core.p035f.C0680f;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.material.internal.b */
public final class C26661b {

    /* renamed from: A */
    private static final Paint f63129A = null;

    /* renamed from: z */
    private static final boolean f63130z = false;

    /* renamed from: B */
    private final View f63131B;

    /* renamed from: C */
    private final RectF f63132C;

    /* renamed from: D */
    private float f63133D;

    /* renamed from: E */
    private float f63134E;

    /* renamed from: F */
    private float f63135F;

    /* renamed from: G */
    private float f63136G;

    /* renamed from: H */
    private Typeface f63137H;

    /* renamed from: I */
    private boolean f63138I;

    /* renamed from: J */
    private float f63139J;

    /* renamed from: K */
    private float f63140K;

    /* renamed from: L */
    private final TextPaint f63141L;

    /* renamed from: M */
    private TimeInterpolator f63142M;

    /* renamed from: N */
    private float f63143N;

    /* renamed from: O */
    private float f63144O;

    /* renamed from: P */
    private float f63145P;

    /* renamed from: Q */
    private int f63146Q;

    /* renamed from: R */
    private float f63147R;

    /* renamed from: S */
    private float f63148S;

    /* renamed from: T */
    private float f63149T;

    /* renamed from: U */
    private int f63150U;

    /* renamed from: a */
    public boolean f63151a;

    /* renamed from: b */
    public float f63152b;

    /* renamed from: c */
    public final Rect f63153c;

    /* renamed from: d */
    public final Rect f63154d;

    /* renamed from: e */
    public int f63155e = 16;

    /* renamed from: f */
    public int f63156f = 16;

    /* renamed from: g */
    public float f63157g = 15.0f;

    /* renamed from: h */
    public float f63158h = 15.0f;

    /* renamed from: i */
    public ColorStateList f63159i;

    /* renamed from: j */
    public ColorStateList f63160j;

    /* renamed from: k */
    public float f63161k;

    /* renamed from: l */
    public float f63162l;

    /* renamed from: m */
    public Typeface f63163m;

    /* renamed from: n */
    public Typeface f63164n;

    /* renamed from: o */
    public CharSequence f63165o;

    /* renamed from: p */
    public CharSequence f63166p;

    /* renamed from: q */
    public boolean f63167q;

    /* renamed from: r */
    public Bitmap f63168r;

    /* renamed from: s */
    public Paint f63169s;

    /* renamed from: t */
    public float f63170t;

    /* renamed from: u */
    public float f63171u;

    /* renamed from: v */
    public int[] f63172v;

    /* renamed from: w */
    public boolean f63173w;

    /* renamed from: x */
    public final TextPaint f63174x;

    /* renamed from: y */
    public TimeInterpolator f63175y;

    /* renamed from: b */
    public final void mo44155b() {
        m52921a(this.f63152b);
    }

    static {
        Covode.recordClassIndex(32117);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: d */
    public final void mo44159d() {
        Bitmap bitmap = this.f63168r;
        if (bitmap != null) {
            bitmap.recycle();
            this.f63168r = null;
        }
    }

    /* renamed from: e */
    private int m52928e() {
        int[] iArr = this.f63172v;
        if (iArr != null) {
            return this.f63159i.getColorForState(iArr, 0);
        }
        return this.f63159i.getDefaultColor();
    }

    /* renamed from: f */
    private int m52930f() {
        int[] iArr = this.f63172v;
        if (iArr != null) {
            return this.f63160j.getColorForState(iArr, 0);
        }
        return this.f63160j.getDefaultColor();
    }

    /* renamed from: c */
    public final void mo44157c() {
        if (this.f63131B.getHeight() > 0 && this.f63131B.getWidth() > 0) {
            m52931g();
            mo44155b();
        }
    }

    /* renamed from: h */
    private void m52932h() {
        MethodCollector.m26663i(12733);
        if (this.f63168r != null || this.f63153c.isEmpty() || TextUtils.isEmpty(this.f63166p)) {
            MethodCollector.m26664o(12733);
            return;
        }
        m52921a(0.0f);
        this.f63170t = this.f63174x.ascent();
        this.f63139J = this.f63174x.descent();
        TextPaint textPaint = this.f63174x;
        CharSequence charSequence = this.f63166p;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.f63139J - this.f63170t);
        if (round <= 0 || round2 <= 0) {
            MethodCollector.m26664o(12733);
            return;
        }
        this.f63168r = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f63168r);
        CharSequence charSequence2 = this.f63166p;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f63174x.descent(), this.f63174x);
        if (this.f63169s == null) {
            this.f63169s = new Paint(3);
        }
        MethodCollector.m26664o(12733);
    }

    /* renamed from: g */
    private void m52931g() {
        float f;
        float f2 = this.f63140K;
        m52927d(this.f63158h);
        CharSequence charSequence = this.f63166p;
        float f3 = 0.0f;
        if (charSequence != null) {
            f = this.f63174x.measureText(charSequence, 0, charSequence.length());
        } else {
            f = 0.0f;
        }
        int a = C0774e.m2693a(this.f63156f, this.f63138I ? 1 : 0);
        int i = a & 112;
        if (i == 48) {
            this.f63134E = ((float) this.f63154d.top) - this.f63174x.ascent();
        } else if (i != 80) {
            this.f63134E = ((float) this.f63154d.centerY()) + (((this.f63174x.descent() - this.f63174x.ascent()) / 2.0f) - this.f63174x.descent());
        } else {
            this.f63134E = (float) this.f63154d.bottom;
        }
        int i2 = a & 8388615;
        if (i2 == 1) {
            this.f63136G = ((float) this.f63154d.centerX()) - (f / 2.0f);
        } else if (i2 != 5) {
            this.f63136G = (float) this.f63154d.left;
        } else {
            this.f63136G = ((float) this.f63154d.right) - f;
        }
        m52927d(this.f63157g);
        CharSequence charSequence2 = this.f63166p;
        if (charSequence2 != null) {
            f3 = this.f63174x.measureText(charSequence2, 0, charSequence2.length());
        }
        int a2 = C0774e.m2693a(this.f63155e, this.f63138I ? 1 : 0);
        int i3 = a2 & 112;
        if (i3 == 48) {
            this.f63133D = ((float) this.f63153c.top) - this.f63174x.ascent();
        } else if (i3 != 80) {
            this.f63133D = ((float) this.f63153c.centerY()) + (((this.f63174x.descent() - this.f63174x.ascent()) / 2.0f) - this.f63174x.descent());
        } else {
            this.f63133D = (float) this.f63153c.bottom;
        }
        int i4 = a2 & 8388615;
        if (i4 == 1) {
            this.f63135F = ((float) this.f63153c.centerX()) - (f3 / 2.0f);
        } else if (i4 != 5) {
            this.f63135F = (float) this.f63153c.left;
        } else {
            this.f63135F = ((float) this.f63153c.right) - f3;
        }
        mo44159d();
        m52926c(f2);
    }

    /* renamed from: a */
    public final void mo44153a() {
        boolean z;
        if (this.f63154d.width() <= 0 || this.f63154d.height() <= 0 || this.f63153c.width() <= 0 || this.f63153c.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f63151a = z;
    }

    /* renamed from: b */
    public final void mo44156b(int i) {
        if (this.f63156f != i) {
            this.f63156f = i;
            mo44157c();
        }
    }

    /* renamed from: c */
    private void m52926c(float f) {
        boolean z;
        m52927d(f);
        if (!f63130z || this.f63171u == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f63167q = z;
        if (z) {
            m52932h();
        }
        C0792v.m2764c(this.f63131B);
    }

    public C26661b(View view) {
        this.f63131B = view;
        TextPaint textPaint = new TextPaint(129);
        this.f63174x = textPaint;
        this.f63141L = new TextPaint(textPaint);
        this.f63154d = new Rect();
        this.f63153c = new Rect();
        this.f63132C = new RectF();
    }

    /* renamed from: e */
    private Typeface m52929e(int i) {
        TypedArray obtainStyledAttributes = this.f63131B.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m52921a(float f) {
        m52925b(f);
        this.f63161k = m52919a(this.f63135F, this.f63136G, f, this.f63142M);
        this.f63162l = m52919a(this.f63133D, this.f63134E, f, this.f63142M);
        m52926c(m52919a(this.f63157g, this.f63158h, f, this.f63175y));
        if (this.f63160j != this.f63159i) {
            this.f63174x.setColor(m52920a(m52928e(), m52930f(), f));
        } else {
            this.f63174x.setColor(m52930f());
        }
        this.f63174x.setShadowLayer(m52919a(this.f63147R, this.f63143N, f, null), m52919a(this.f63148S, this.f63144O, f, null), m52919a(this.f63149T, this.f63145P, f, null), m52920a(this.f63150U, this.f63146Q, f));
        C0792v.m2764c(this.f63131B);
    }

    /* renamed from: b */
    private void m52925b(float f) {
        this.f63132C.left = m52919a((float) this.f63153c.left, (float) this.f63154d.left, f, this.f63142M);
        this.f63132C.top = m52919a(this.f63133D, this.f63134E, f, this.f63142M);
        this.f63132C.right = m52919a((float) this.f63153c.right, (float) this.f63154d.right, f, this.f63142M);
        this.f63132C.bottom = m52919a((float) this.f63153c.bottom, (float) this.f63154d.bottom, f, this.f63142M);
    }

    /* renamed from: c */
    public final void mo44158c(int i) {
        C0405al a = C0405al.m1464a(this.f63131B.getContext(), i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk});
        if (a.mo1837f(3)) {
            this.f63160j = a.mo1835e(3);
        }
        if (a.mo1837f(0)) {
            this.f63158h = (float) a.mo1834e(0, (int) this.f63158h);
        }
        this.f63146Q = a.mo1824a(6, 0);
        this.f63144O = a.mo1823a(7, 0.0f);
        this.f63145P = a.mo1823a(8, 0.0f);
        this.f63143N = a.mo1823a(9, 0.0f);
        a.f1585a.recycle();
        int i2 = Build.VERSION.SDK_INT;
        this.f63163m = m52929e(i);
        mo44157c();
    }

    /* renamed from: d */
    public final void mo44160d(int i) {
        C0405al a = C0405al.m1464a(this.f63131B.getContext(), i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk});
        if (a.mo1837f(3)) {
            this.f63159i = a.mo1835e(3);
        }
        if (a.mo1837f(0)) {
            this.f63157g = (float) a.mo1834e(0, (int) this.f63157g);
        }
        this.f63150U = a.mo1824a(6, 0);
        this.f63148S = a.mo1823a(7, 0.0f);
        this.f63149T = a.mo1823a(8, 0.0f);
        this.f63147R = a.mo1823a(9, 0.0f);
        a.f1585a.recycle();
        int i2 = Build.VERSION.SDK_INT;
        this.f63164n = m52929e(i);
        mo44157c();
    }

    /* renamed from: d */
    private void m52927d(float f) {
        float f2;
        boolean z;
        if (this.f63165o != null) {
            float width = (float) this.f63154d.width();
            float width2 = (float) this.f63153c.width();
            boolean z2 = true;
            if (m52922a(f, this.f63158h)) {
                f2 = this.f63158h;
                this.f63171u = 1.0f;
                Typeface typeface = this.f63137H;
                Typeface typeface2 = this.f63163m;
                if (typeface != typeface2) {
                    this.f63137H = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                f2 = this.f63157g;
                Typeface typeface3 = this.f63137H;
                Typeface typeface4 = this.f63164n;
                if (typeface3 != typeface4) {
                    this.f63137H = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (m52922a(f, f2)) {
                    this.f63171u = 1.0f;
                } else {
                    this.f63171u = f / this.f63157g;
                }
                float f3 = this.f63158h / this.f63157g;
                width = width2 * f3 > width ? Math.min(width / f3, width2) : width2;
            }
            if (width > 0.0f) {
                if (this.f63140K != f2 || this.f63173w || z) {
                    z = true;
                } else {
                    z = false;
                }
                this.f63140K = f2;
                this.f63173w = false;
            }
            if (this.f63166p == null || z) {
                this.f63174x.setTextSize(this.f63140K);
                this.f63174x.setTypeface(this.f63137H);
                TextPaint textPaint = this.f63174x;
                if (this.f63171u == 1.0f) {
                    z2 = false;
                }
                textPaint.setLinearText(z2);
                CharSequence ellipsize = TextUtils.ellipsize(this.f63165o, this.f63174x, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f63166p)) {
                    this.f63166p = ellipsize;
                    this.f63138I = m52924a(ellipsize);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m52924a(CharSequence charSequence) {
        AbstractC0679e eVar;
        if (C0792v.m2768e(this.f63131B) == 1) {
            eVar = C0680f.f2738d;
        } else {
            eVar = C0680f.f2737c;
        }
        return eVar.mo2717a(charSequence, charSequence.length());
    }

    /* renamed from: a */
    public final void mo44154a(int i) {
        if (this.f63155e != i) {
            this.f63155e = i;
            mo44157c();
        }
    }

    /* renamed from: a */
    private static boolean m52922a(float f, float f2) {
        if (Math.abs(f - f2) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m52920a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m52919a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static boolean m52923a(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }
}
