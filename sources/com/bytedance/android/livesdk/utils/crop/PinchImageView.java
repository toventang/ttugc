package com.bytedance.android.livesdk.utils.crop;

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

public class PinchImageView extends AppCompatImageView {

    /* renamed from: a */
    public View.OnClickListener f26900a;

    /* renamed from: b */
    public View.OnLongClickListener f26901b;

    /* renamed from: c */
    public Matrix f26902c = new Matrix();

    /* renamed from: d */
    public RectF f26903d;

    /* renamed from: e */
    public int f26904e = 0;

    /* renamed from: f */
    public C11250f f26905f;

    /* renamed from: g */
    C11245a f26906g;

    /* renamed from: h */
    private boolean f26907h;

    /* renamed from: i */
    private Rect f26908i;

    /* renamed from: j */
    private List<Object> f26909j;

    /* renamed from: k */
    private List<Object> f26910k;

    /* renamed from: l */
    private int f26911l;

    /* renamed from: m */
    private PointF f26912m = new PointF();

    /* renamed from: n */
    private PointF f26913n = new PointF();

    /* renamed from: o */
    private float f26914o = 0.0f;

    /* renamed from: p */
    private GestureDetector f26915p = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
        /* class com.bytedance.android.livesdk.utils.crop.PinchImageView.C112441 */

        static {
            Covode.recordClassIndex(12874);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (PinchImageView.this.f26901b != null) {
                PinchImageView.this.f26901b.onLongClick(PinchImageView.this);
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PinchImageView.this.f26900a == null) {
                return true;
            }
            PinchImageView.this.f26900a.onClick(PinchImageView.this);
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (PinchImageView.this.f26904e == 1 && (PinchImageView.this.f26905f == null || !PinchImageView.this.f26905f.isRunning())) {
                PinchImageView.this.mo17990b(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PinchImageView.this.f26904e != 0) {
                return true;
            }
            if (PinchImageView.this.f26905f != null && PinchImageView.this.f26905f.isRunning()) {
                return true;
            }
            PinchImageView pinchImageView = PinchImageView.this;
            if (!pinchImageView.mo17991b()) {
                return true;
            }
            pinchImageView.mo17992c();
            pinchImageView.f26906g = new C11245a(f / 60.0f, f2 / 60.0f);
            pinchImageView.f26906g.start();
            return true;
        }
    });

    static {
        Covode.recordClassIndex(12873);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.crop.PinchImageView$c */
    public static class C11247c extends AbstractC11248d<Matrix> {
        static {
            Covode.recordClassIndex(12877);
        }

        C11247c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.crop.PinchImageView.AbstractC11248d
        /* renamed from: a */
        public final /* synthetic */ Matrix mo18010a() {
            return new Matrix();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.crop.PinchImageView.AbstractC11248d
        /* renamed from: a */
        public final /* synthetic */ Matrix mo18011a(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.crop.PinchImageView$e */
    public static class C11249e extends AbstractC11248d<RectF> {
        static {
            Covode.recordClassIndex(12879);
        }

        C11249e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.crop.PinchImageView.AbstractC11248d
        /* renamed from: a */
        public final /* synthetic */ RectF mo18010a() {
            return new RectF();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.crop.PinchImageView.AbstractC11248d
        /* renamed from: a */
        public final /* synthetic */ RectF mo18011a(RectF rectF) {
            RectF rectF2 = rectF;
            if (rectF2 == null) {
                return new RectF();
            }
            rectF2.setEmpty();
            return rectF2;
        }
    }

    public int getPinchMode() {
        return this.f26904e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.PinchImageView$b */
    public static class C11246b {

        /* renamed from: a */
        static C11247c f26919a = new C11247c();

        /* renamed from: b */
        static C11249e f26920b = new C11249e();

        /* renamed from: b */
        public static float[] m19932b(float f, float f2, float f3, float f4) {
            return new float[]{(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        }

        /* renamed from: b */
        public static RectF m19931b() {
            return (RectF) f26920b.mo18012b();
        }

        static {
            Covode.recordClassIndex(12876);
        }

        /* renamed from: a */
        public static Matrix m19927a() {
            return (Matrix) f26919a.mo18012b();
        }

        /* renamed from: a */
        public static Matrix m19928a(Matrix matrix) {
            Matrix matrix2 = (Matrix) f26919a.mo18012b();
            if (matrix != null) {
                matrix2.set(matrix);
            }
            return matrix2;
        }

        /* renamed from: b */
        public static float[] m19933b(Matrix matrix) {
            if (matrix == null) {
                return new float[2];
            }
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }

        /* renamed from: a */
        public static RectF m19929a(float f, float f2) {
            RectF rectF = (RectF) f26920b.mo18012b();
            rectF.set(0.0f, 0.0f, f, f2);
            return rectF;
        }

        /* renamed from: a */
        public static float[] m19930a(float[] fArr, Matrix matrix) {
            if (fArr == null || matrix == null) {
                return new float[2];
            }
            float[] fArr2 = new float[2];
            Matrix a = m19927a();
            matrix.invert(a);
            a.mapPoints(fArr2, fArr);
            f26919a.mo18013b(a);
            return fArr2;
        }

        /* renamed from: a */
        public static float m19926a(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.crop.PinchImageView$d */
    public static abstract class AbstractC11248d<T> {

        /* renamed from: a */
        private int f26921a = 16;

        /* renamed from: b */
        private Queue<T> f26922b = new LinkedList();

        static {
            Covode.recordClassIndex(12878);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo18010a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo18011a(T t);

        AbstractC11248d() {
        }

        /* renamed from: b */
        public final T mo18012b() {
            if (this.f26922b.size() == 0) {
                return mo18010a();
            }
            try {
                return mo18011a(this.f26922b.poll());
            } catch (NoSuchElementException unused) {
                return mo18010a();
            }
        }

        /* renamed from: b */
        public final void mo18013b(T t) {
            if (t != null && this.f26922b.size() < this.f26921a) {
                this.f26922b.offer(t);
            }
        }
    }

    public RectF getMask() {
        if (this.f26903d != null) {
            return new RectF(this.f26903d);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo17992c() {
        C11250f fVar = this.f26905f;
        if (fVar != null) {
            fVar.cancel();
            this.f26905f = null;
        }
        C11245a aVar = this.f26906g;
        if (aVar != null) {
            aVar.cancel();
            this.f26906g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo17991b() {
        if (getDrawable() == null || getDrawable().getIntrinsicWidth() <= 0 || getDrawable().getIntrinsicHeight() <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        return true;
    }

    private float getMinScale() {
        if (!mo17991b() || this.f26908i == null) {
            return 1.0f;
        }
        float intrinsicWidth = ((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight());
        float width = ((float) getWidth()) / ((float) getHeight());
        if (intrinsicWidth >= ((float) this.f26908i.width()) / ((float) this.f26908i.height()) && intrinsicWidth >= width) {
            return ((float) this.f26908i.height()) / (((float) getWidth()) / intrinsicWidth);
        }
        return (((float) this.f26908i.width()) / ((float) getWidth())) * (((float) getWidth()) / (C11246b.m19933b(m19917a((Matrix) null))[0] * ((float) getDrawable().getIntrinsicWidth())));
    }

    /* access modifiers changed from: protected */
    public float getMaxScale() {
        float f;
        float height;
        int intrinsicHeight;
        if (mo17991b()) {
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
    public final void mo17988a() {
        List<Object> list;
        List<Object> list2 = this.f26909j;
        if (list2 != null) {
            this.f26911l++;
            Iterator<Object> it = list2.iterator();
            while (it.hasNext()) {
                it.next();
            }
            int i = this.f26911l - 1;
            this.f26911l = i;
            if (i == 0 && (list = this.f26910k) != null) {
                this.f26909j = list;
                this.f26910k = null;
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f26900a = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f26901b = onLongClickListener;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.f26908i = rect;
        if (rect != null) {
            this.f26907h = true;
        }
    }

    /* renamed from: b */
    private Matrix m19919b(Matrix matrix) {
        Matrix a = m19917a(matrix);
        a.postConcat(this.f26902c);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.crop.PinchImageView$a */
    public class C11245a extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        private float[] f26918b;

        static {
            Covode.recordClassIndex(12875);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PinchImageView pinchImageView = PinchImageView.this;
            float[] fArr = this.f26918b;
            boolean a = pinchImageView.mo17989a(fArr[0], fArr[1]);
            float[] fArr2 = this.f26918b;
            fArr2[0] = fArr2[0] * 0.9f;
            fArr2[1] = fArr2[1] * 0.9f;
            if (!a || C11246b.m19926a(0.0f, 0.0f, fArr2[0], fArr2[1]) < 1.0f) {
                valueAnimator.cancel();
            }
        }

        C11245a(float f, float f2) {
            setFloatValues(0.0f, 1.0f);
            setDuration(1000000L);
            addUpdateListener(this);
            this.f26918b = new float[]{f, f2};
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.utils.crop.PinchImageView$f */
    public class C11250f extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        private float[] f26924b;

        /* renamed from: c */
        private float[] f26925c;

        /* renamed from: d */
        private float[] f26926d;

        static {
            Covode.recordClassIndex(12880);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = 0;
            do {
                float[] fArr = this.f26926d;
                float[] fArr2 = this.f26924b;
                fArr[i] = fArr2[i] + ((this.f26925c[i] - fArr2[i]) * floatValue);
                i++;
            } while (i < 9);
            PinchImageView.this.f26902c.setValues(this.f26926d);
            PinchImageView.this.mo17988a();
            PinchImageView.this.invalidate();
        }

        C11250f(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2) {
            this(matrix, matrix2, (byte) 0);
        }

        private C11250f(Matrix matrix, Matrix matrix2, byte b) {
            this.f26924b = new float[9];
            this.f26925c = new float[9];
            this.f26926d = new float[9];
            setFloatValues(0.0f, 1.0f);
            setDuration(200L);
            addUpdateListener(this);
            matrix.getValues(this.f26924b);
            matrix2.getValues(this.f26925c);
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f26904e == 2) {
            return true;
        }
        RectF a = mo17987a((RectF) null);
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
        if (this.f26904e == 2) {
            return true;
        }
        RectF a = mo17987a((RectF) null);
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
        if (mo17991b()) {
            Matrix a = C11246b.m19927a();
            setImageMatrix(m19919b(a));
            C11246b.f26919a.mo18013b(a);
        }
        if (this.f26903d != null) {
            canvas.save();
            canvas.clipRect(this.f26903d);
            super.onDraw(canvas);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private Matrix m19917a(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (mo17991b()) {
            RectF a = C11246b.m19929a((float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            RectF a2 = C11246b.m19929a((float) getWidth(), (float) getHeight());
            matrix.setRectToRect(a, a2, Matrix.ScaleToFit.CENTER);
            C11246b.f26920b.mo18013b(a2);
            C11246b.f26920b.mo18013b(a);
        }
        return matrix;
    }

    /* renamed from: a */
    public final RectF mo17987a(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!mo17991b()) {
            return rectF;
        }
        Matrix a = C11246b.m19927a();
        m19919b(a);
        rectF.set(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        a.mapRect(rectF);
        C11246b.f26919a.mo18013b(a);
        return rectF;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 675
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.crop.PinchImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: b */
    public final void mo17990b(float f, float f2) {
        float f3;
        int width;
        float f4;
        int height;
        int width2;
        int height2;
        float f5;
        float f6;
        float f7;
        if (mo17991b()) {
            Matrix a = C11246b.m19927a();
            m19917a(a);
            float f8 = C11246b.m19933b(a)[0];
            float f9 = C11246b.m19933b(this.f26902c)[0] * f8;
            if (this.f26907h) {
                f3 = (float) this.f26908i.left;
            } else {
                f3 = 0.0f;
            }
            if (this.f26907h) {
                width = this.f26908i.right;
            } else {
                width = getWidth();
            }
            float f10 = (float) width;
            if (this.f26907h) {
                f4 = (float) this.f26908i.top;
            } else {
                f4 = 0.0f;
            }
            if (this.f26907h) {
                height = this.f26908i.bottom;
            } else {
                height = getHeight();
            }
            float f11 = (float) height;
            if (this.f26907h) {
                width2 = this.f26908i.width();
            } else {
                width2 = getWidth();
            }
            float f12 = (float) width2;
            if (this.f26907h) {
                height2 = this.f26908i.height();
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
            Matrix a2 = C11246b.m19928a(this.f26902c);
            float f14 = f8 / f9;
            a2.postScale(f14, f14, f, f2);
            float f15 = f12 / 2.0f;
            float f16 = f13 / 2.0f;
            a2.postTranslate(f15 - f, f16 - f2);
            Matrix a3 = C11246b.m19928a(a);
            a3.postConcat(a2);
            RectF a4 = C11246b.m19929a((float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
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
            mo17992c();
            C11250f fVar = new C11250f(this, this.f26902c, a2);
            this.f26905f = fVar;
            fVar.start();
            C11246b.f26920b.mo18013b(a4);
            C11246b.f26919a.mo18013b(a3);
            C11246b.f26919a.mo18013b(a2);
            C11246b.f26919a.mo18013b(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17989a(float r12, float r13) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.crop.PinchImageView.mo17989a(float, float):boolean");
    }

    /* renamed from: a */
    private void m19918a(float f, float f2, float f3, float f4) {
        this.f26914o = C11246b.m19933b(this.f26902c)[0] / C11246b.m19926a(f, f2, f3, f4);
        float[] a = C11246b.m19930a(C11246b.m19932b(f, f2, f3, f4), this.f26902c);
        this.f26913n.set(a[0], a[1]);
    }
}
