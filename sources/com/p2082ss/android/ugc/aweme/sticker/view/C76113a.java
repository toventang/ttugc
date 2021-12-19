package com.p2082ss.android.ugc.aweme.sticker.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.asve.p2217f.C31094b;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.a */
public class C76113a extends FrameLayout implements AbstractC45920e {

    /* renamed from: a */
    protected RectF f171002a;

    /* renamed from: b */
    protected Paint f171003b;

    /* renamed from: c */
    protected int f171004c;

    /* renamed from: d */
    protected RectF f171005d;

    /* renamed from: e */
    PointF[] f171006e;

    /* renamed from: f */
    protected AbstractC45921f f171007f;

    /* renamed from: g */
    private int f171008g;

    /* renamed from: h */
    private int f171009h;

    /* renamed from: i */
    private int f171010i;

    /* renamed from: j */
    private DashPathEffect f171011j;

    /* renamed from: k */
    private int f171012k;

    /* renamed from: l */
    private Vibrator f171013l;

    /* renamed from: m */
    private int f171014m;

    /* renamed from: n */
    private int f171015n;

    /* renamed from: o */
    private boolean f171016o;

    static {
        Covode.recordClassIndex(89061);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    public View getContentView() {
        return this;
    }

    public int getDeltaX() {
        return this.f171004c;
    }

    public boolean getEnableFakeFeedView() {
        return this.f171016o;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final boolean mo77319a(PointF[] pointFArr, float f) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C45883b.m88523a(pointFArr);
        if (a.isEmpty()) {
            return true;
        }
        a.offset((float) this.f171004c, 0.0f);
        if (this.f171002a == null) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f, a.centerX(), a.centerY());
        matrix.mapRect(a);
        return this.f171002a.contains(a);
    }

    /* renamed from: a */
    public void mo119845a(Canvas canvas) {
        canvas.drawLine(0.0f, this.f171002a.top, (float) getWidth(), this.f171002a.top, this.f171003b);
    }

    /* renamed from: a */
    public boolean mo119846a() {
        return Math.abs(this.f171005d.top - this.f171002a.top) < 2.0f;
    }

    /* renamed from: d */
    private boolean m133471d() {
        if ((this.f171014m & 128) == 128) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m133473e() {
        if ((this.f171014m & 256) == 256) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m133475f() {
        if ((this.f171014m & 512) == 512) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m133477g() {
        if ((this.f171014m & 64) == 64) {
            return true;
        }
        return false;
    }

    public static int getTbMargin() {
        return (int) C13628n.m24520b(C40963b.m82473a(), 201.0f);
    }

    /* renamed from: h */
    private boolean m133479h() {
        if ((this.f171014m & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m133481i() {
        if ((this.f171014m & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m133483j() {
        if ((this.f171014m & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m133484k() {
        if ((this.f171014m & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void m133485l() {
        Vibrator vibrator = this.f171013l;
        if (vibrator != null) {
            try {
                vibrator.vibrate(30);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: c */
    public final void mo77323c() {
        int i = this.f171015n & -49;
        this.f171015n = i;
        this.f171014m = i & this.f171014m;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public float getLeftViewXMargin() {
        if (C78099c.m136517a(getContext())) {
            return (float) this.f171010i;
        }
        return C13628n.m24520b(getContext(), 8.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: b */
    public final void mo77320b() {
        m133470d(false);
        m133469c(false);
        m133467a(false);
        m133468b(false);
        m133472e(false);
        m133474f(false);
        m133476g(false);
        m133478h(false);
        m133480i(false);
        m133482j(false);
        AbstractC45921f fVar = this.f171007f;
        if (fVar != null && this.f171016o) {
            fVar.mo77333b(false);
            this.f171007f.mo77332a(false);
            this.f171007f.mo77334c(false);
        }
    }

    /* access modifiers changed from: protected */
    public float getRightViewXMargin() {
        if (C78099c.m136517a(getContext())) {
            return ((float) C70636dh.m124831b(getContext())) - C13628n.m24520b(getContext(), 8.0f);
        }
        return (float) (C70636dh.m124831b(getContext()) - this.f171010i);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo77320b();
        if (!C31094b.f74512b) {
            mo119848c(getContext());
        }
        Context context = getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C70636dh.m124831b(getContext()), m133465a(getContext()));
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        if (!C31094b.f74512b) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C70636dh.m124831b(getContext()), m133465a(getContext()));
            layoutParams2.gravity = 1;
            AbstractC45921f fVar = this.f171007f;
            if (fVar != null && this.f171016o) {
                fVar.getContentView().setLayoutParams(layoutParams2);
            }
        }
        mo119847b(context);
    }

    public void setDeltaX(int i) {
        this.f171004c = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    public void setEnableFakeFeedView(boolean z) {
        this.f171016o = z;
    }

    public C76113a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static int m133465a(Context context) {
        int i;
        if (C45890g.f106878a != null) {
            i = C45890g.f106878a.mo59453d();
        } else {
            i = 0;
        }
        return C70636dh.m124828a(context) - i;
    }

    /* renamed from: b */
    private void m133468b(boolean z) {
        if (z) {
            if (!m133471d()) {
                m133485l();
            }
            this.f171014m |= 128;
        } else {
            this.f171014m &= -129;
        }
        postInvalidate();
    }

    /* renamed from: c */
    private void m133469c(boolean z) {
        if (z) {
            if (!m133475f()) {
                m133485l();
            }
            this.f171014m |= 512;
        } else {
            this.f171014m &= -513;
        }
        postInvalidate();
    }

    /* renamed from: d */
    private void m133470d(boolean z) {
        if (z) {
            if (!m133473e()) {
                m133485l();
            }
            this.f171014m |= 256;
        } else {
            this.f171014m &= -257;
        }
        postInvalidate();
    }

    /* renamed from: e */
    private void m133472e(boolean z) {
        if (z) {
            this.f171014m |= 32;
        } else {
            this.f171014m &= -33;
        }
        postInvalidate();
    }

    /* renamed from: f */
    private void m133474f(boolean z) {
        if (z) {
            this.f171014m |= 16;
        } else {
            this.f171014m &= -17;
        }
        postInvalidate();
    }

    /* renamed from: g */
    private void m133476g(boolean z) {
        if (z) {
            if (!m133479h()) {
                m133485l();
            }
            this.f171014m |= 8;
        } else {
            this.f171014m &= -9;
        }
        postInvalidate();
    }

    /* renamed from: h */
    private void m133478h(boolean z) {
        if (z) {
            if (!m133481i()) {
                m133485l();
            }
            this.f171014m |= 4;
        } else {
            this.f171014m &= -5;
        }
        postInvalidate();
    }

    /* renamed from: i */
    private void m133480i(boolean z) {
        if (z) {
            if (!m133483j()) {
                m133485l();
            }
            this.f171014m |= 2;
        } else {
            this.f171014m &= -3;
        }
        postInvalidate();
    }

    /* renamed from: j */
    private void m133482j(boolean z) {
        if (z) {
            if (!m133484k()) {
                m133485l();
            }
            this.f171014m |= 1;
        } else {
            this.f171014m &= -2;
        }
        postInvalidate();
    }

    /* renamed from: a */
    private void m133467a(boolean z) {
        if (z) {
            if (!m133477g()) {
                m133485l();
            }
            this.f171014m |= 64;
        } else {
            this.f171014m &= -65;
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo119848c(Context context) {
        if (this.f171007f == null && this.f171016o) {
            this.f171007f = new C76138d(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C70636dh.m124831b(getContext()), m133465a(context));
            layoutParams.gravity = 1;
            this.f171007f.getContentView().setLayoutParams(layoutParams);
            addView(this.f171007f.getContentView());
        }
    }

    /* renamed from: b */
    public void mo119847b(Context context) {
        if (this.f171002a == null) {
            this.f171002a = new RectF(getLeftViewXMargin(), (float) (-C70636dh.m124828a(getContext())), getRightViewXMargin(), (float) (m133465a(context) - this.f171012k));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final float mo77312a(float f) {
        if (Math.abs(f - 0.0f) < 1.0f) {
            return 0.0f;
        }
        if (Math.abs(Math.abs(f) - 90.0f) < 1.0f) {
            return 90.0f;
        }
        if (Math.abs(f - 45.0f) < 1.0f) {
            return 45.0f;
        }
        if (Math.abs(f - -45.0f) < 1.0f) {
            return -45.0f;
        }
        return f;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final PointF mo77315a(PointF[] pointFArr) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a = C45883b.m88523a(pointFArr);
        a.offset((float) this.f171004c, 0.0f);
        PointF pointF = new PointF();
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        if (a.right - this.f171002a.right > 0.0f) {
            pointF.x = this.f171002a.right - a.right;
        }
        if (a.left - this.f171002a.left < 0.0f) {
            pointF.x = this.f171002a.left - a.left;
        }
        if (a.bottom - this.f171002a.bottom > 0.0f) {
            pointF.y = this.f171002a.bottom - a.bottom;
        }
        return pointF;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        RectF rectF;
        RectF rectF2;
        MethodCollector.m26663i(12605);
        super.onDraw(canvas);
        this.f171003b.setPathEffect(null);
        if (m133475f()) {
            mo119845a(canvas);
        }
        if (m133473e()) {
            canvas.drawLine(this.f171002a.left, 0.0f, this.f171002a.left, (float) getHeight(), this.f171003b);
        }
        if (m133471d()) {
            canvas.drawLine(this.f171002a.right, 0.0f, this.f171002a.right, (float) getHeight(), this.f171003b);
        }
        if (m133477g()) {
            canvas.drawLine(0.0f, this.f171002a.bottom, (float) getWidth(), this.f171002a.bottom, this.f171003b);
        }
        if ((this.f171014m & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.drawLine(0.0f, ((float) getHeight()) / 2.0f, (float) getWidth(), ((float) getHeight()) / 2.0f, this.f171003b);
        }
        if ((this.f171014m & 16) == 16) {
            canvas.drawLine(((float) getWidth()) / 2.0f, 0.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.f171003b);
        }
        this.f171003b.setPathEffect(this.f171011j);
        if (m133479h() && (rectF2 = this.f171005d) != null) {
            canvas.drawLine(0.0f, rectF2.centerY(), (float) getWidth(), this.f171005d.centerY(), this.f171003b);
        }
        if (m133481i() && (rectF = this.f171005d) != null) {
            canvas.drawLine(rectF.centerX(), 0.0f, this.f171005d.centerX(), (float) getHeight(), this.f171003b);
        }
        if (m133483j() && this.f171005d != null) {
            canvas.drawLine(0.0f, ((float) getHeight()) - ((((float) getHeight()) - this.f171005d.centerY()) + this.f171005d.centerX()), this.f171005d.centerX() + (((float) getHeight()) - this.f171005d.centerY()), (float) getHeight(), this.f171003b);
        }
        if (m133484k() && this.f171005d != null) {
            canvas.drawLine((float) getWidth(), ((float) getHeight()) - ((((float) getWidth()) - this.f171005d.centerX()) + (((float) getHeight()) - this.f171005d.centerY())), ((float) getWidth()) - ((((float) getWidth()) - this.f171005d.centerX()) + (((float) getHeight()) - this.f171005d.centerY())), (float) getHeight(), this.f171003b);
        }
        MethodCollector.m26664o(12605);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final int mo77313a(PointF[] pointFArr, boolean z) {
        return mo77314a(pointFArr, z, false, false, false, false);
    }

    /* renamed from: a */
    private static Object m133466a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12216);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(12216);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public C76113a(Context context, AttributeSet attributeSet) {
        super(context, null);
        MethodCollector.m26663i(12214);
        this.f171008g = 4;
        this.f171009h = -16717825;
        this.f171003b = new Paint();
        this.f171005d = new RectF();
        this.f171014m = 0;
        this.f171015n = -1;
        this.f171016o = true;
        this.f171008g = (int) C13628n.m24520b(context, 1.5f);
        this.f171010i = (int) C13628n.m24520b(context, 56.0f);
        this.f171003b.setColor(this.f171009h);
        this.f171003b.setAntiAlias(true);
        this.f171003b.setStyle(Paint.Style.STROKE);
        this.f171003b.setStrokeWidth((float) this.f171008g);
        setWillNotDraw(false);
        this.f171012k = (int) C13628n.m24520b(context, 201.0f);
        this.f171011j = new DashPathEffect(new float[]{C13628n.m24520b(context, 2.0f), C13628n.m24520b(context, 1.0f)}, 0.0f);
        this.f171013l = (Vibrator) m133466a(context, "vibrator");
        MethodCollector.m26664o(12214);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: b */
    public final boolean mo77321b(PointF[] pointFArr, float f) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C45883b.m88523a(pointFArr);
        if (a.isEmpty()) {
            return true;
        }
        a.offset((float) this.f171004c, 0.0f);
        if (this.f171002a == null || f < 1.0f) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f, a.centerX(), a.centerY());
        matrix.mapRect(a);
        return this.f171002a.contains(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: b */
    public boolean mo77322b(PointF[] pointFArr, float f, float f2) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C45883b.m88523a(pointFArr);
        if (a.isEmpty()) {
            return true;
        }
        a.offset(((float) this.f171004c) + f, f2);
        RectF rectF = this.f171002a;
        if (rectF == null) {
            return true;
        }
        return rectF.contains(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final PointF mo77316a(PointF[] pointFArr, float f, float f2) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a = C45883b.m88523a(pointFArr);
        a.offset((float) this.f171004c, 0.0f);
        PointF pointF = new PointF();
        pointF.x = f;
        pointF.y = f2;
        if (Math.abs(((Math.abs(a.bottom - a.top) / 2.0f) + a.top) - (((float) getHeight()) / 2.0f)) < 1.0f) {
            pointF.y = (((float) getHeight()) / 2.0f) - (((a.bottom - a.top) / 2.0f) + a.top);
        }
        if (Math.abs(((Math.abs(a.right - a.left) / 2.0f) + a.left) - (((float) getWidth()) / 2.0f)) < 1.0f) {
            pointF.x = (((float) getWidth()) / 2.0f) - (((a.right - a.left) / 2.0f) + a.left);
        }
        return pointF;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final void mo77318a(float f, float f2, float f3) {
        if (f == Float.MIN_VALUE) {
            f = (float) (-getHeight());
        }
        if (f2 == Float.MIN_VALUE) {
            f2 = getRightViewXMargin();
        }
        if (f3 == Float.MIN_VALUE) {
            f3 = (float) (m133465a(getContext()) - this.f171012k);
        }
        this.f171002a = new RectF(0.0f, f, f2, f3);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final int mo77314a(PointF[] pointFArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        int i2 = -1;
        if (pointFArr == null) {
            return -1;
        }
        RectF a = C45883b.m88523a(pointFArr);
        this.f171005d = a;
        if (a.isEmpty()) {
            return -1;
        }
        this.f171005d.offset((float) this.f171004c, 0.0f);
        this.f171006e = pointFArr;
        if (this.f171002a == null) {
            return -1;
        }
        if (!z3 || !mo119846a()) {
            m133469c(false);
        } else {
            m133469c(true);
        }
        if (!z2 || Math.abs(this.f171005d.left - this.f171002a.left) >= 2.0f) {
            m133470d(false);
        } else {
            m133470d(true);
        }
        if (!z4 || Math.abs(this.f171005d.right - this.f171002a.right) >= 2.0f) {
            m133468b(false);
        } else {
            m133468b(true);
        }
        if (!z5 || Math.abs(this.f171005d.bottom - this.f171002a.bottom) >= 2.0f) {
            m133467a(false);
        } else {
            m133467a(true);
        }
        if (!C78099c.m136517a(getContext()) ? this.f171005d.right >= this.f171002a.right || Math.abs(this.f171005d.right - this.f171002a.right) < 2.0f : this.f171005d.left <= this.f171002a.left || Math.abs(this.f171005d.left - this.f171002a.left) < 2.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f171005d.bottom >= this.f171002a.bottom || Math.abs(this.f171005d.bottom - this.f171002a.bottom) < 2.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f171005d.top <= this.f171002a.top || Math.abs(this.f171005d.top - this.f171002a.top) < 2.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z6 || z7 || z8) {
            mo119848c(getContext());
        }
        AbstractC45921f fVar = this.f171007f;
        if (fVar != null && this.f171016o) {
            fVar.mo77332a(z6);
            this.f171007f.mo77333b(z7);
            this.f171007f.mo77334c(z8);
        }
        if (z) {
            int round = Math.round((float) ((Math.atan((double) ((pointFArr[1].y - pointFArr[0].y) / (pointFArr[1].x - pointFArr[0].x))) / 3.141592653589793d) * 180.0d));
            float f = (float) round;
            if (Math.abs(f - 0.0f) < 1.0f) {
                m133476g(true);
                i2 = 4;
            } else {
                m133476g(false);
            }
            if (Math.abs(((float) Math.abs(round)) - 90.0f) < 1.0f) {
                m133478h(true);
                i2 = 4;
            } else {
                m133478h(false);
            }
            if (Math.abs(f - 45.0f) < 1.0f) {
                m133480i(true);
                i = 4;
            } else {
                m133480i(false);
                i = i2;
            }
            if (Math.abs(f - -45.0f) < 1.0f) {
                m133482j(true);
                return 4;
            }
            m133482j(false);
            return i;
        }
        if (Math.abs(((Math.abs(this.f171005d.bottom - this.f171005d.top) / 2.0f) + this.f171005d.top) - (((float) getHeight()) / 2.0f)) >= 2.0f || (this.f171015n & 32) == 0) {
            m133472e(false);
        } else {
            m133472e(true);
            i2 = 3;
        }
        if (Math.abs(((Math.abs(this.f171005d.right - this.f171005d.left) / 2.0f) + this.f171005d.left) - (((float) getWidth()) / 2.0f)) >= 2.0f || (this.f171015n & 16) == 0) {
            m133474f(false);
            return i2;
        }
        m133474f(true);
        return 3;
    }
}
