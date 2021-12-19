package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView */
public class PinchImageView extends AppCompatImageView {

    /* renamed from: a */
    public View.OnClickListener f145807a;

    /* renamed from: b */
    public View.OnLongClickListener f145808b;

    /* renamed from: c */
    public Matrix f145809c = new Matrix();

    /* renamed from: d */
    public RectF f145810d;

    /* renamed from: e */
    public int f145811e = 0;

    /* renamed from: f */
    public C64337f f145812f;

    /* renamed from: g */
    C64332a f145813g;

    /* renamed from: h */
    private boolean f145814h;

    /* renamed from: i */
    private Rect f145815i;

    /* renamed from: j */
    private List<Object> f145816j;

    /* renamed from: k */
    private List<Object> f145817k;

    /* renamed from: l */
    private int f145818l;

    /* renamed from: m */
    private PointF f145819m = new PointF();

    /* renamed from: n */
    private PointF f145820n = new PointF();

    /* renamed from: o */
    private float f145821o = 0.0f;

    /* renamed from: p */
    private GestureDetector f145822p = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
        /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PinchImageView.C643311 */

        static {
            Covode.recordClassIndex(75781);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (PinchImageView.this.f145808b != null) {
                PinchImageView.this.f145808b.onLongClick(PinchImageView.this);
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PinchImageView.this.f145807a == null) {
                return true;
            }
            PinchImageView.this.f145807a.onClick(PinchImageView.this);
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (PinchImageView.this.f145811e == 1 && (PinchImageView.this.f145812f == null || !PinchImageView.this.f145812f.isRunning())) {
                PinchImageView.this.mo103852b(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PinchImageView.this.f145811e != 0) {
                return true;
            }
            if (PinchImageView.this.f145812f != null && PinchImageView.this.f145812f.isRunning()) {
                return true;
            }
            PinchImageView pinchImageView = PinchImageView.this;
            if (!pinchImageView.mo103853b()) {
                return true;
            }
            pinchImageView.mo103854c();
            pinchImageView.f145813g = new C64332a(f / 60.0f, f2 / 60.0f);
            pinchImageView.f145813g.start();
            return true;
        }
    });

    static {
        Covode.recordClassIndex(75780);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$c */
    public static class C64334c extends AbstractC64335d<Matrix> {
        static {
            Covode.recordClassIndex(75784);
        }

        C64334c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PinchImageView.AbstractC64335d
        /* renamed from: a */
        public final /* synthetic */ Matrix mo103872a() {
            return new Matrix();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PinchImageView.AbstractC64335d
        /* renamed from: a */
        public final /* synthetic */ Matrix mo103873a(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$e */
    public static class C64336e extends AbstractC64335d<RectF> {
        static {
            Covode.recordClassIndex(75786);
        }

        C64336e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PinchImageView.AbstractC64335d
        /* renamed from: a */
        public final /* synthetic */ RectF mo103872a() {
            return new RectF();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PinchImageView.AbstractC64335d
        /* renamed from: a */
        public final /* synthetic */ RectF mo103873a(RectF rectF) {
            RectF rectF2 = rectF;
            if (rectF2 == null) {
                return new RectF();
            }
            rectF2.setEmpty();
            return rectF2;
        }
    }

    public int getPinchMode() {
        return this.f145811e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$b */
    public static class C64333b {

        /* renamed from: a */
        static C64334c f145826a = new C64334c();

        /* renamed from: b */
        static C64336e f145827b = new C64336e();

        /* renamed from: b */
        public static float[] m116211b(float f, float f2, float f3, float f4) {
            return new float[]{(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        }

        /* renamed from: b */
        public static RectF m116210b() {
            return (RectF) f145827b.mo103874b();
        }

        static {
            Covode.recordClassIndex(75783);
        }

        /* renamed from: a */
        public static Matrix m116206a() {
            return (Matrix) f145826a.mo103874b();
        }

        /* renamed from: a */
        public static Matrix m116207a(Matrix matrix) {
            Matrix matrix2 = (Matrix) f145826a.mo103874b();
            if (matrix != null) {
                matrix2.set(matrix);
            }
            return matrix2;
        }

        /* renamed from: b */
        public static float[] m116212b(Matrix matrix) {
            if (matrix == null) {
                return new float[2];
            }
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }

        /* renamed from: a */
        public static RectF m116208a(float f, float f2) {
            RectF rectF = (RectF) f145827b.mo103874b();
            rectF.set(0.0f, 0.0f, f, f2);
            return rectF;
        }

        /* renamed from: a */
        public static float[] m116209a(float[] fArr, Matrix matrix) {
            if (fArr == null || matrix == null) {
                return new float[2];
            }
            float[] fArr2 = new float[2];
            Matrix a = m116206a();
            matrix.invert(a);
            a.mapPoints(fArr2, fArr);
            f145826a.mo103875b(a);
            return fArr2;
        }

        /* renamed from: a */
        public static float m116205a(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$d */
    public static abstract class AbstractC64335d<T> {

        /* renamed from: a */
        private int f145828a = 16;

        /* renamed from: b */
        private Queue<T> f145829b = new LinkedList();

        static {
            Covode.recordClassIndex(75785);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo103872a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo103873a(T t);

        AbstractC64335d() {
        }

        /* renamed from: b */
        public final T mo103874b() {
            if (this.f145829b.size() == 0) {
                return mo103872a();
            }
            try {
                return mo103873a(this.f145829b.poll());
            } catch (NoSuchElementException unused) {
                return mo103872a();
            }
        }

        /* renamed from: b */
        public final void mo103875b(T t) {
            if (t != null && this.f145829b.size() < this.f145828a) {
                this.f145829b.offer(t);
            }
        }
    }

    public RectF getMask() {
        if (this.f145810d != null) {
            return new RectF(this.f145810d);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo103854c() {
        C64337f fVar = this.f145812f;
        if (fVar != null) {
            fVar.cancel();
            this.f145812f = null;
        }
        C64332a aVar = this.f145813g;
        if (aVar != null) {
            aVar.cancel();
            this.f145813g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo103853b() {
        if (getDrawable() == null || getDrawable().getIntrinsicWidth() <= 0 || getDrawable().getIntrinsicHeight() <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        return true;
    }

    private float getMinScale() {
        if (!mo103853b() || this.f145815i == null) {
            return 1.0f;
        }
        float intrinsicWidth = ((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight());
        float width = ((float) getWidth()) / ((float) getHeight());
        if (intrinsicWidth >= ((float) this.f145815i.width()) / ((float) this.f145815i.height()) && intrinsicWidth >= width) {
            return ((float) this.f145815i.height()) / (((float) getWidth()) / intrinsicWidth);
        }
        return (((float) this.f145815i.width()) / ((float) getWidth())) * (((float) getWidth()) / (C64333b.m116212b(m116196a((Matrix) null))[0] * ((float) getDrawable().getIntrinsicWidth())));
    }

    /* access modifiers changed from: protected */
    public float getMaxScale() {
        float f;
        float height;
        int intrinsicHeight;
        if (mo103853b()) {
            if (((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight()) < ((float) getWidth()) / ((float) getHeight())) {
                height = (float) getWidth();
                intrinsicHeight = getDrawable().getIntrinsicWidth();
            } else {
                height = (float) getHeight();
                intrinsicHeight = getDrawable().getIntrinsicHeight();
            }
            f = height / ((float) intrinsicHeight);
        } else {
            f = 4.0f;
        }
        return Math.max(f, 4.0f);
    }

    /* renamed from: a */
    public final void mo103850a() {
        List<Object> list;
        List<Object> list2 = this.f145816j;
        if (list2 != null) {
            this.f145818l++;
            Iterator<Object> it = list2.iterator();
            while (it.hasNext()) {
                it.next();
            }
            int i = this.f145818l - 1;
            this.f145818l = i;
            if (i == 0 && (list = this.f145817k) != null) {
                this.f145816j = list;
                this.f145817k = null;
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f145807a = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f145808b = onLongClickListener;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.f145815i = rect;
        if (rect != null) {
            this.f145814h = true;
        }
    }

    /* renamed from: b */
    private Matrix m116198b(Matrix matrix) {
        Matrix a = m116196a(matrix);
        a.postConcat(this.f145809c);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$a */
    public class C64332a extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        private float[] f145825b;

        static {
            Covode.recordClassIndex(75782);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PinchImageView pinchImageView = PinchImageView.this;
            float[] fArr = this.f145825b;
            boolean a = pinchImageView.mo103851a(fArr[0], fArr[1]);
            float[] fArr2 = this.f145825b;
            fArr2[0] = fArr2[0] * 0.9f;
            fArr2[1] = fArr2[1] * 0.9f;
            if (!a || C64333b.m116205a(0.0f, 0.0f, fArr2[0], fArr2[1]) < 1.0f) {
                valueAnimator.cancel();
            }
        }

        C64332a(float f, float f2) {
            setFloatValues(0.0f, 1.0f);
            setDuration(1000000L);
            addUpdateListener(this);
            this.f145825b = new float[]{f, f2};
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$f */
    public class C64337f extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        private float[] f145831b;

        /* renamed from: c */
        private float[] f145832c;

        /* renamed from: d */
        private float[] f145833d;

        static {
            Covode.recordClassIndex(75787);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = 0;
            do {
                float[] fArr = this.f145833d;
                float[] fArr2 = this.f145831b;
                fArr[i] = fArr2[i] + ((this.f145832c[i] - fArr2[i]) * floatValue);
                i++;
            } while (i < 9);
            PinchImageView.this.f145809c.setValues(this.f145833d);
            PinchImageView.this.mo103850a();
            PinchImageView.this.invalidate();
        }

        C64337f(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2) {
            this(matrix, matrix2, (byte) 0);
        }

        private C64337f(Matrix matrix, Matrix matrix2, byte b) {
            this.f145831b = new float[9];
            this.f145832c = new float[9];
            this.f145833d = new float[9];
            setFloatValues(0.0f, 1.0f);
            setDuration(200L);
            addUpdateListener(this);
            matrix.getValues(this.f145831b);
            matrix2.getValues(this.f145832c);
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f145811e == 2) {
            return true;
        }
        RectF a = mo103849a((RectF) null);
        if (a == null || a.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (a.right > ((float) getWidth())) {
                return true;
            }
            return false;
        } else if (a.left < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f145811e == 2) {
            return true;
        }
        RectF a = mo103849a((RectF) null);
        if (a == null || a.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (a.bottom > ((float) getHeight())) {
                return true;
            }
            return false;
        } else if (a.top < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (mo103853b()) {
            Matrix a = C64333b.m116206a();
            setImageMatrix(m116198b(a));
            C64333b.f145826a.mo103875b(a);
        }
        if (this.f145810d != null) {
            canvas.save();
            canvas.clipRect(this.f145810d);
            super.onDraw(canvas);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private Matrix m116196a(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (mo103853b()) {
            RectF a = C64333b.m116208a((float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            RectF a2 = C64333b.m116208a((float) getWidth(), (float) getHeight());
            matrix.setRectToRect(a, a2, Matrix.ScaleToFit.CENTER);
            C64333b.f145827b.mo103875b(a2);
            C64333b.f145827b.mo103875b(a);
        }
        return matrix;
    }

    /* renamed from: a */
    public final RectF mo103849a(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!mo103853b()) {
            return rectF;
        }
        Matrix a = C64333b.m116206a();
        m116198b(a);
        rectF.set(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        a.mapRect(rectF);
        C64333b.f145826a.mo103875b(a);
        return rectF;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 675
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PinchImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: b */
    public final void mo103852b(float f, float f2) {
        float f3;
        int width;
        float f4;
        int height;
        int width2;
        int height2;
        float f5;
        float f6;
        float f7;
        if (mo103853b()) {
            Matrix a = C64333b.m116206a();
            m116196a(a);
            float f8 = C64333b.m116212b(a)[0];
            float f9 = C64333b.m116212b(this.f145809c)[0] * f8;
            if (this.f145814h) {
                f3 = (float) this.f145815i.left;
            } else {
                f3 = 0.0f;
            }
            if (this.f145814h) {
                width = this.f145815i.right;
            } else {
                width = getWidth();
            }
            float f10 = (float) width;
            if (this.f145814h) {
                f4 = (float) this.f145815i.top;
            } else {
                f4 = 0.0f;
            }
            if (this.f145814h) {
                height = this.f145815i.bottom;
            } else {
                height = getHeight();
            }
            float f11 = (float) height;
            if (this.f145814h) {
                width2 = this.f145815i.width();
            } else {
                width2 = getWidth();
            }
            float f12 = (float) width2;
            if (this.f145814h) {
                height2 = this.f145815i.height();
            } else {
                height2 = getHeight();
            }
            float f13 = (float) height2;
            float maxScale = getMaxScale();
            if (f9 < getMaxScale()) {
                f5 = getMaxScale();
            } else {
                f5 = f8;
            }
            if (f5 <= maxScale) {
                maxScale = f5;
            }
            if (maxScale >= f8) {
                f8 = maxScale;
            }
            Matrix a2 = C64333b.m116207a(this.f145809c);
            float f14 = f8 / f9;
            a2.postScale(f14, f14, f, f2);
            float f15 = f12 / 2.0f;
            float f16 = f13 / 2.0f;
            a2.postTranslate(f15 - f, f16 - f2);
            Matrix a3 = C64333b.m116207a(a);
            a3.postConcat(a2);
            RectF a4 = C64333b.m116208a((float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            a3.mapRect(a4);
            if (a4.right - a4.left < f12) {
                f6 = f15 - ((a4.right + a4.left) / 2.0f);
            } else if (a4.left > f3) {
                f6 = f3 - a4.left;
            } else if (a4.right < f10) {
                f6 = f10 - a4.right;
            } else {
                f6 = 0.0f;
            }
            if (a4.bottom - a4.top < f13) {
                f7 = f16 - ((a4.bottom + a4.top) / 2.0f);
            } else if (a4.top > f4) {
                f7 = f4 - a4.top;
            } else if (a4.bottom < f11) {
                f7 = f11 - a4.bottom;
            } else {
                f7 = 0.0f;
            }
            a2.postTranslate(f6, f7);
            mo103854c();
            C64337f fVar = new C64337f(this, this.f145809c, a2);
            this.f145812f = fVar;
            fVar.start();
            C64333b.f145827b.mo103875b(a4);
            C64333b.f145826a.mo103875b(a3);
            C64333b.f145826a.mo103875b(a2);
            C64333b.f145826a.mo103875b(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103851a(float r12, float r13) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PinchImageView.mo103851a(float, float):boolean");
    }

    /* renamed from: a */
    private void m116197a(float f, float f2, float f3, float f4) {
        this.f145821o = C64333b.m116212b(this.f145809c)[0] / C64333b.m116205a(f, f2, f3, f4);
        float[] a = C64333b.m116209a(C64333b.m116211b(f, f2, f3, f4), this.f145809c);
        this.f145820n.set(a[0], a[1]);
    }
}
