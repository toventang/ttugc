package com.p2082ss.android.ugc.aweme.editSticker.interact.view;

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
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.lang.reflect.Field;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.b */
public final class C45914b extends FrameLayout implements AbstractC45920e {

    /* renamed from: a */
    public static final C45916a f106927a = new C45916a((byte) 0);

    /* renamed from: b */
    private int f106928b;

    /* renamed from: c */
    private final int f106929c;

    /* renamed from: d */
    private RectF f106930d;

    /* renamed from: e */
    private final int f106931e;

    /* renamed from: f */
    private final Paint f106932f;

    /* renamed from: g */
    private final DashPathEffect f106933g;

    /* renamed from: h */
    private final float f106934h;

    /* renamed from: i */
    private int f106935i;

    /* renamed from: j */
    private RectF f106936j;

    /* renamed from: k */
    private final Vibrator f106937k;

    /* renamed from: l */
    private int f106938l;

    /* renamed from: m */
    private final AbstractC89244h f106939m;

    /* renamed from: n */
    private boolean f106940n;

    static {
        Covode.recordClassIndex(54440);
    }

    private final AbstractC45921f getMFakeFeedView() {
        return (AbstractC45921f) this.f106939m.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final void mo77318a(float f, float f2, float f3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: c */
    public final void mo77323c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.b$a */
    public static final class C45916a {
        static {
            Covode.recordClassIndex(54442);
        }

        private C45916a() {
        }

        public /* synthetic */ C45916a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    public final View getContentView() {
        return this;
    }

    public final int getDeltaX() {
        return this.f106935i;
    }

    public final boolean getEnableFakeFeedView() {
        return this.f106940n;
    }

    /* renamed from: d */
    private final boolean m88601d() {
        if ((this.f106938l & 128) == 128) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m88603e() {
        if ((this.f106938l & 256) == 256) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m88605f() {
        if ((this.f106938l & 64) == 64) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m88607g() {
        if ((this.f106938l & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m88609h() {
        if ((this.f106938l & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private final boolean m88611i() {
        if ((this.f106938l & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final boolean m88612j() {
        if ((this.f106938l & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final void m88613k() {
        Vibrator vibrator = this.f106937k;
        if (vibrator != null) {
            try {
                vibrator.vibrate(30);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.b$b */
    static final class C45917b extends AbstractC89220m implements AbstractC89171a<AbstractC45921f> {

        /* renamed from: a */
        final /* synthetic */ C45914b f106942a;

        /* renamed from: b */
        final /* synthetic */ Context f106943b;

        static {
            Covode.recordClassIndex(54443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45917b(C45914b bVar, Context context) {
            super(0);
            this.f106942a = bVar;
            this.f106943b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC45921f invoke() {
            AbstractC45919d dVar = C45866d.m88490c().f106822e;
            if (dVar == null) {
                return null;
            }
            AbstractC45921f a = dVar.mo77331a(this.f106943b);
            this.f106942a.addView(a.getContentView());
            return a;
        }
    }

    private final float getLeftViewXMargin() {
        Context context = getContext();
        C89219l.m154716b(context, "");
        if (C84912r.m145935c(context)) {
            return (float) this.f106931e;
        }
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        return C84912r.m145930a(context2, 8.0f);
    }

    private final float getRightViewXMargin() {
        Context context = getContext();
        C89219l.m154716b(context, "");
        if (!C84912r.m145935c(context)) {
            return (float) (getWidth() - this.f106931e);
        }
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        return ((float) getWidth()) - C84912r.m145930a(context2, 8.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: b */
    public final void mo77320b() {
        m88599c(false);
        m88597a(false);
        m88598b(false);
        m88600d(false);
        m88602e(false);
        m88604f(false);
        m88606g(false);
        m88608h(false);
        m88610i(false);
        AbstractC45921f mFakeFeedView = getMFakeFeedView();
        if (mFakeFeedView != null) {
            mFakeFeedView.mo77333b(false);
        }
        AbstractC45921f mFakeFeedView2 = getMFakeFeedView();
        if (mFakeFeedView2 != null) {
            mFakeFeedView2.mo77332a(false);
        }
        AbstractC45921f mFakeFeedView3 = getMFakeFeedView();
        if (mFakeFeedView3 != null) {
            mFakeFeedView3.mo77334c(false);
        }
    }

    /* renamed from: a */
    public final void mo77317a() {
        mo77320b();
        C89219l.m154716b(getContext(), "");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f106930d = new RectF(getLeftViewXMargin(), 0.0f, getRightViewXMargin(), ((float) getHeight()) - this.f106934h);
    }

    public final void setDeltaX(int i) {
        this.f106935i = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    public final void setEnableFakeFeedView(boolean z) {
        this.f106940n = z;
    }

    /* renamed from: a */
    private final void m88597a(boolean z) {
        int i;
        if (z) {
            if (!m88605f()) {
                m88613k();
            }
            i = this.f106938l | 64;
        } else {
            i = this.f106938l & -65;
        }
        this.f106938l = i;
        postInvalidate();
    }

    /* renamed from: b */
    private final void m88598b(boolean z) {
        int i;
        if (z) {
            if (!m88601d()) {
                m88613k();
            }
            i = this.f106938l | 128;
        } else {
            i = this.f106938l & -129;
        }
        this.f106938l = i;
        postInvalidate();
    }

    /* renamed from: c */
    private final void m88599c(boolean z) {
        int i;
        if (z) {
            if (!m88603e()) {
                m88613k();
            }
            i = this.f106938l | 256;
        } else {
            i = this.f106938l & -257;
        }
        this.f106938l = i;
        postInvalidate();
    }

    /* renamed from: d */
    private final void m88600d(boolean z) {
        int i;
        if (z) {
            i = this.f106938l | 32;
        } else {
            i = this.f106938l & -33;
        }
        this.f106938l = i;
        postInvalidate();
    }

    /* renamed from: e */
    private final void m88602e(boolean z) {
        int i;
        if (z) {
            i = this.f106938l | 16;
        } else {
            i = this.f106938l & -17;
        }
        this.f106938l = i;
        postInvalidate();
    }

    /* renamed from: f */
    private final void m88604f(boolean z) {
        int i;
        if (z) {
            if (!m88607g()) {
                m88613k();
            }
            i = this.f106938l | 8;
        } else {
            i = this.f106938l & -9;
        }
        this.f106938l = i;
        postInvalidate();
    }

    /* renamed from: g */
    private final void m88606g(boolean z) {
        int i;
        if (z) {
            if (!m88609h()) {
                m88613k();
            }
            i = this.f106938l | 4;
        } else {
            i = this.f106938l & -5;
        }
        this.f106938l = i;
        postInvalidate();
    }

    /* renamed from: h */
    private final void m88608h(boolean z) {
        int i;
        if (z) {
            if (!m88611i()) {
                m88613k();
            }
            i = this.f106938l | 2;
        } else {
            i = this.f106938l & -3;
        }
        this.f106938l = i;
        postInvalidate();
    }

    /* renamed from: i */
    private final void m88610i(boolean z) {
        int i;
        if (z) {
            if (!m88612j()) {
                m88613k();
            }
            i = this.f106938l | 1;
        } else {
            i = this.f106938l & -2;
        }
        this.f106938l = i;
        postInvalidate();
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C45914b(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10718);
        this.f106928b = 4;
        this.f106929c = -16717825;
        Paint paint = new Paint();
        this.f106932f = paint;
        this.f106936j = new RectF();
        this.f106939m = C89250i.m154773a((AbstractC89171a) new C45917b(this, context));
        this.f106928b = (int) C84912r.m145930a(context, 1.5f);
        this.f106931e = (int) C84912r.m145930a(context, 56.0f);
        paint.setColor(-16717825);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) this.f106928b);
        setWillNotDraw(false);
        this.f106934h = C84912r.m145930a(context, 201.0f);
        this.f106933g = new DashPathEffect(new float[]{C84912r.m145930a(context, 2.0f), C84912r.m145930a(context, 1.0f)}, 0.0f);
        Object a = m88596a(context, "vibrator");
        if (a != null) {
            this.f106937k = (Vibrator) a;
            post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45914b.RunnableC459151 */

                /* renamed from: a */
                final /* synthetic */ C45914b f106941a;

                static {
                    Covode.recordClassIndex(54441);
                }

                {
                    this.f106941a = r1;
                }

                public final void run() {
                    this.f106941a.mo77317a();
                }
            });
            this.f106940n = true;
            MethodCollector.m26664o(10718);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        MethodCollector.m26664o(10718);
        throw nullPointerException;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final PointF mo77315a(PointF[] pointFArr) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF a = C45883b.m88523a(pointFArr);
        a.offset(0.0f, 0.0f);
        PointF pointF = new PointF();
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        float f = a.right;
        RectF rectF = this.f106930d;
        if (rectF == null) {
            C89219l.m154715b();
        }
        if (f - rectF.right > 0.0f) {
            RectF rectF2 = this.f106930d;
            if (rectF2 == null) {
                C89219l.m154715b();
            }
            pointF.x = rectF2.right - a.right;
        }
        float f2 = a.left;
        RectF rectF3 = this.f106930d;
        if (rectF3 == null) {
            C89219l.m154715b();
        }
        if (f2 - rectF3.left < 0.0f) {
            RectF rectF4 = this.f106930d;
            if (rectF4 == null) {
                C89219l.m154715b();
            }
            pointF.x = rectF4.left - a.left;
        }
        float f3 = a.bottom;
        RectF rectF5 = this.f106930d;
        if (rectF5 == null) {
            C89219l.m154715b();
        }
        if (f3 - rectF5.bottom > 0.0f) {
            RectF rectF6 = this.f106930d;
            if (rectF6 == null) {
                C89219l.m154715b();
            }
            pointF.y = rectF6.bottom - a.bottom;
        }
        return pointF;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        boolean z;
        RectF rectF;
        RectF rectF2;
        MethodCollector.m26663i(10716);
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        this.f106932f.setPathEffect(null);
        if (m88603e()) {
            canvas.drawLine(getLeftViewXMargin(), 0.0f, getLeftViewXMargin(), (float) getHeight(), this.f106932f);
        }
        if (m88601d()) {
            canvas.drawLine(getRightViewXMargin(), 0.0f, getRightViewXMargin(), (float) getHeight(), this.f106932f);
        }
        if (m88605f()) {
            canvas.drawLine(0.0f, ((float) getHeight()) - this.f106934h, (float) getWidth(), ((float) getHeight()) - this.f106934h, this.f106932f);
        }
        if ((this.f106938l & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.drawLine(0.0f, ((float) getHeight()) / 2.0f, (float) getWidth(), ((float) getHeight()) / 2.0f, this.f106932f);
        }
        if ((this.f106938l & 16) == 16) {
            canvas.drawLine(((float) getWidth()) / 2.0f, 0.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.f106932f);
        }
        this.f106932f.setPathEffect(this.f106933g);
        if (m88607g() && (rectF2 = this.f106936j) != null) {
            float centerY = rectF2.centerY();
            float width = (float) getWidth();
            RectF rectF3 = this.f106936j;
            if (rectF3 == null) {
                C89219l.m154715b();
            }
            canvas.drawLine(0.0f, centerY, width, rectF3.centerY(), this.f106932f);
        }
        if (m88609h() && (rectF = this.f106936j) != null) {
            float centerX = rectF.centerX();
            RectF rectF4 = this.f106936j;
            if (rectF4 == null) {
                C89219l.m154715b();
            }
            canvas.drawLine(centerX, 0.0f, rectF4.centerX(), (float) getHeight(), this.f106932f);
        }
        if (m88611i() && this.f106936j != null) {
            float height = (float) getHeight();
            float height2 = (float) getHeight();
            RectF rectF5 = this.f106936j;
            if (rectF5 == null) {
                C89219l.m154715b();
            }
            float centerY2 = height2 - rectF5.centerY();
            RectF rectF6 = this.f106936j;
            if (rectF6 == null) {
                C89219l.m154715b();
            }
            float centerX2 = height - (centerY2 + rectF6.centerX());
            RectF rectF7 = this.f106936j;
            if (rectF7 == null) {
                C89219l.m154715b();
            }
            float centerX3 = rectF7.centerX();
            float height3 = (float) getHeight();
            RectF rectF8 = this.f106936j;
            if (rectF8 == null) {
                C89219l.m154715b();
            }
            canvas.drawLine(0.0f, centerX2, centerX3 + (height3 - rectF8.centerY()), (float) getHeight(), this.f106932f);
        }
        if (m88612j() && this.f106936j != null) {
            float width2 = (float) getWidth();
            float height4 = (float) getHeight();
            float width3 = (float) getWidth();
            RectF rectF9 = this.f106936j;
            if (rectF9 == null) {
                C89219l.m154715b();
            }
            float centerX4 = width3 - rectF9.centerX();
            float height5 = (float) getHeight();
            RectF rectF10 = this.f106936j;
            if (rectF10 == null) {
                C89219l.m154715b();
            }
            float centerY3 = height4 - (centerX4 + (height5 - rectF10.centerY()));
            float width4 = (float) getWidth();
            float width5 = (float) getWidth();
            RectF rectF11 = this.f106936j;
            if (rectF11 == null) {
                C89219l.m154715b();
            }
            float centerX5 = width5 - rectF11.centerX();
            float height6 = (float) getHeight();
            RectF rectF12 = this.f106936j;
            if (rectF12 == null) {
                C89219l.m154715b();
            }
            canvas.drawLine(width2, centerY3, width4 - (centerX5 + (height6 - rectF12.centerY())), (float) getHeight(), this.f106932f);
        }
        MethodCollector.m26664o(10716);
    }

    public /* synthetic */ C45914b(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final int mo77313a(PointF[] pointFArr, boolean z) {
        return mo77314a(pointFArr, z, false, false, false, false);
    }

    /* renamed from: a */
    private static Object m88596a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10866);
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
                    MethodCollector.m26664o(10866);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: b */
    public final boolean mo77321b(PointF[] pointFArr, float f) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C45883b.m88523a(pointFArr);
        C89219l.m154716b(a, "");
        if (a.isEmpty()) {
            return true;
        }
        a.offset((float) this.f106935i, 0.0f);
        if (this.f106930d == null || f < 1.0f) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f, a.centerX(), a.centerY());
        matrix.mapRect(a);
        RectF rectF = this.f106930d;
        if (rectF == null) {
            C89219l.m154715b();
        }
        return rectF.contains(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    public final boolean mo77319a(PointF[] pointFArr, float f) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C45883b.m88523a(pointFArr);
        C89219l.m154716b(a, "");
        if (a.isEmpty()) {
            return true;
        }
        a.offset((float) this.f106935i, 0.0f);
        if (this.f106930d == null) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f, a.centerX(), a.centerY());
        matrix.mapRect(a);
        RectF rectF = this.f106930d;
        if (rectF == null) {
            C89219l.m154715b();
        }
        return rectF.contains(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: b */
    public final boolean mo77322b(PointF[] pointFArr, float f, float f2) {
        if (pointFArr == null) {
            return true;
        }
        RectF a = C45883b.m88523a(pointFArr);
        C89219l.m154716b(a, "");
        if (a.isEmpty()) {
            return true;
        }
        a.offset(((float) this.f106935i) + f, f2);
        RectF rectF = this.f106930d;
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
        a.offset(f, 0.0f);
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

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d2, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        if (java.lang.Math.abs(r1 - r0.left) < 2.0f) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ce, code lost:
        if (java.lang.Math.abs(r1 - r0.right) < 2.0f) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ad  */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo77314a(android.graphics.PointF[] r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45914b.mo77314a(android.graphics.PointF[], boolean, boolean, boolean, boolean, boolean):int");
    }
}
