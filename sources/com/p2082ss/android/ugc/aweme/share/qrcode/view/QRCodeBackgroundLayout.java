package com.p2082ss.android.ugc.aweme.share.qrcode.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout */
public final class QRCodeBackgroundLayout extends RelativeLayout {

    /* renamed from: k */
    public static final C69398a f155008k = new C69398a((byte) 0);

    /* renamed from: a */
    public int f155009a;

    /* renamed from: b */
    public Paint f155010b;

    /* renamed from: c */
    public Paint f155011c;

    /* renamed from: d */
    public float f155012d;

    /* renamed from: e */
    public float f155013e;

    /* renamed from: f */
    public float f155014f;

    /* renamed from: g */
    public float f155015g;

    /* renamed from: h */
    public float f155016h;

    /* renamed from: i */
    public boolean f155017i;

    /* renamed from: j */
    public final SharedPreferences f155018j;

    /* renamed from: l */
    private final C69399b[] f155019l;

    /* renamed from: m */
    private float f155020m;

    /* renamed from: n */
    private final C69400c f155021n;

    static {
        Covode.recordClassIndex(81732);
    }

    public QRCodeBackgroundLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout$a */
    public static final class C69398a {
        static {
            Covode.recordClassIndex(81733);
        }

        private C69398a() {
        }

        public /* synthetic */ C69398a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout$c */
    public static final class C69400c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ QRCodeBackgroundLayout f155024a;

        static {
            Covode.recordClassIndex(81735);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69400c(QRCodeBackgroundLayout qRCodeBackgroundLayout) {
            this.f155024a = qRCodeBackgroundLayout;
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f155024a.f155017i = true;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f155024a.f155010b.setShader(this.f155024a.f155011c.getShader());
            QRCodeBackgroundLayout qRCodeBackgroundLayout = this.f155024a;
            qRCodeBackgroundLayout.f155015g = qRCodeBackgroundLayout.f155013e;
            QRCodeBackgroundLayout qRCodeBackgroundLayout2 = this.f155024a;
            qRCodeBackgroundLayout2.f155016h = qRCodeBackgroundLayout2.f155014f;
            this.f155024a.f155012d = 0.0f;
            this.f155024a.f155017i = false;
            SharedPreferences.Editor edit = this.f155024a.f155018j.edit();
            edit.putFloat("qr_code_background_sp_center_x", this.f155024a.f155015g);
            edit.putFloat("qr_code_background_sp_center_y", this.f155024a.f155016h);
            edit.putInt("qr_code_background_sp_color_index", this.f155024a.f155009a);
            edit.apply();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout$d */
    static final class C69401d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ QRCodeBackgroundLayout f155025a;

        static {
            Covode.recordClassIndex(81736);
        }

        C69401d(QRCodeBackgroundLayout qRCodeBackgroundLayout) {
            this.f155025a = qRCodeBackgroundLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            QRCodeBackgroundLayout qRCodeBackgroundLayout = this.f155025a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            qRCodeBackgroundLayout.f155012d = ((Float) animatedValue).floatValue();
            this.f155025a.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(6897);
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawCircle(this.f155015g, this.f155016h, this.f155020m, this.f155010b);
        }
        float f = this.f155012d;
        if (f <= 0.0f || f > this.f155020m || canvas == null) {
            MethodCollector.m26664o(6897);
            return;
        }
        canvas.drawCircle(this.f155013e, this.f155014f, f, this.f155011c);
        MethodCollector.m26664o(6897);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (this.f155017i) {
            return super.onTouchEvent(motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
            if (valueOf.intValue() == 0) {
                this.f155013e = motionEvent.getX();
                this.f155014f = motionEvent.getY();
                return true;
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                int i = this.f155009a + 1;
                this.f155009a = i;
                C69399b[] bVarArr = this.f155019l;
                if (i >= bVarArr.length) {
                    int length = i - bVarArr.length;
                    this.f155009a = i - bVarArr.length;
                    i = length;
                }
                this.f155009a = i;
                this.f155011c.setShader(m122590a(this.f155013e, this.f155014f, i));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f155020m);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(600L);
                ofFloat.addUpdateListener(new C69401d(this));
                ofFloat.addListener(this.f155021n);
                ofFloat.start();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.view.QRCodeBackgroundLayout$b */
    public static final class C69399b {

        /* renamed from: a */
        public final int f155022a;

        /* renamed from: b */
        public final int f155023b;

        static {
            Covode.recordClassIndex(81734);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C69399b)) {
                return false;
            }
            C69399b bVar = (C69399b) obj;
            return this.f155022a == bVar.f155022a && this.f155023b == bVar.f155023b;
        }

        public final int hashCode() {
            return (this.f155022a * 31) + this.f155023b;
        }

        public final String toString() {
            return "RadialColor(centerColor=" + this.f155022a + ", edgeColor=" + this.f155023b + ")";
        }

        public C69399b(int i, int i2) {
            this.f155022a = i;
            this.f155023b = i2;
        }
    }

    private /* synthetic */ QRCodeBackgroundLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* renamed from: a */
    private final RadialGradient m122590a(float f, float f2, int i) {
        return new RadialGradient(f, f2, this.f155020m, this.f155019l[i].f155022a, this.f155019l[i].f155023b, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private QRCodeBackgroundLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6901);
        this.f155019l = new C69399b[]{new C69399b(Color.parseColor("#FF92A7"), Color.parseColor("#FE2C55")), new C69399b(Color.parseColor("#FFC059"), Color.parseColor("#D95C34")), new C69399b(Color.parseColor("#67CC8F"), Color.parseColor("#08843A")), new C69399b(Color.parseColor("#5D7CE8"), Color.parseColor("#5927A9")), new C69399b(Color.parseColor("#30C3EA"), Color.parseColor("#148FC3"))};
        int b = C34723i.m70928b(context);
        int f = C34723i.m70933f(context);
        this.f155020m = (float) Math.sqrt((double) ((float) ((b * b) + (f * f))));
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        SharedPreferences a = C34822d.m71158a(applicationContext, "qr_code_background_sp_name", 0);
        C89219l.m154716b(a, "");
        this.f155018j = a;
        this.f155015g = a.getFloat("qr_code_background_sp_center_x", (float) b);
        this.f155016h = a.getFloat("qr_code_background_sp_center_y", 0.0f);
        this.f155009a = a.getInt("qr_code_background_sp_color_index", 0);
        Paint paint = new Paint(1);
        this.f155010b = paint;
        paint.setShader(m122590a(this.f155015g, this.f155016h, this.f155009a));
        this.f155011c = new Paint(1);
        setWillNotDraw(false);
        this.f155021n = new C69400c(this);
        MethodCollector.m26664o(6901);
    }
}
