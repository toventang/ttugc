package p4593g.p4594a.p4595a.p4596a.p4598b;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

/* renamed from: g.a.a.a.b.a */
public class C88989a extends AbstractC88995b {

    /* renamed from: a */
    protected ScaleGestureDetector f202060a;

    /* renamed from: b */
    protected GestureDetector f202061b;

    /* renamed from: c */
    protected int f202062c;

    /* renamed from: d */
    protected float f202063d;

    /* renamed from: e */
    protected int f202064e;

    /* renamed from: f */
    protected GestureDetector.OnGestureListener f202065f;

    /* renamed from: g */
    protected ScaleGestureDetector.OnScaleGestureListener f202066g;

    /* renamed from: h */
    protected boolean f202067h;

    /* renamed from: i */
    protected boolean f202068i;

    /* renamed from: j */
    protected boolean f202069j;

    /* renamed from: k */
    public AbstractC88991b f202070k;

    /* renamed from: l */
    public AbstractC88992c f202071l;

    /* renamed from: g.a.a.a.b.a$b */
    public interface AbstractC88991b {
        static {
            Covode.recordClassIndex(105033);
        }
    }

    /* renamed from: g.a.a.a.b.a$c */
    public interface AbstractC88992c {
        static {
            Covode.recordClassIndex(105034);
        }

        /* renamed from: a */
        void mo142511a();
    }

    static {
        Covode.recordClassIndex(105031);
    }

    public boolean getDoubleTapEnabled() {
        return this.f202067h;
    }

    /* access modifiers changed from: protected */
    public GestureDetector.OnGestureListener getGestureListener() {
        return new C88990a();
    }

    /* access modifiers changed from: protected */
    public ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new C88993d();
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f202067h = z;
    }

    public void setDoubleTapListener(AbstractC88991b bVar) {
        this.f202070k = bVar;
    }

    public void setScaleEnabled(boolean z) {
        this.f202068i = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f202069j = z;
    }

    public void setSingleTapListener(AbstractC88992c cVar) {
        this.f202071l = cVar;
    }

    /* renamed from: g.a.a.a.b.a$a */
    public class C88990a extends GestureDetector.SimpleOnGestureListener {
        static {
            Covode.recordClassIndex(105032);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        public C88990a() {
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (C88989a.this.f202071l == null) {
                return true;
            }
            C88989a.this.f202071l.mo142511a();
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (C88989a.this.isLongClickable() && !C88989a.this.f202060a.isInProgress()) {
                C88989a.this.setPressed(true);
                C88989a.this.performLongClick();
            }
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (C88989a.this.f202067h) {
                C88989a.this.f202096s = true;
                float scale = C88989a.this.getScale();
                C88989a aVar = C88989a.this;
                C88989a.this.mo143343a(Math.min(C88989a.this.getMaxScale(), Math.max(aVar.mo143307a(scale, aVar.getMaxScale()), C88989a.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), 200.0f);
                C88989a.this.invalidate();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C88989a.this.f202069j && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !C88989a.this.f202060a.isInProgress() && C88989a.this.getScale() != 1.0f) {
                return C88989a.this.mo143312a(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C88989a.this.f202069j && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !C88989a.this.f202060a.isInProgress()) {
                return C88989a.this.mo143313b(f, f2);
            }
            return false;
        }
    }

    /* renamed from: g.a.a.a.b.a$d */
    public class C88993d extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        /* renamed from: a */
        protected boolean f202073a;

        static {
            Covode.recordClassIndex(105035);
        }

        public C88993d() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = C88989a.this.getScale() * scaleGestureDetector.getScaleFactor();
            if (C88989a.this.f202068i) {
                if (!this.f202073a) {
                    this.f202073a = true;
                } else if (currentSpan != 0.0f) {
                    C88989a.this.f202096s = true;
                    C88989a.this.mo143342a(Math.min(C88989a.this.getMaxScale(), Math.max(scale, C88989a.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    C88989a.this.f202064e = 1;
                    C88989a.this.invalidate();
                    return true;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // p4593g.p4594a.p4595a.p4596a.p4598b.AbstractC88995b
    /* renamed from: a */
    public final void mo143308a(float f) {
        if (f < getMinScale()) {
            mo143346b(getMinScale());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f202060a.onTouchEvent(motionEvent);
        if (!this.f202060a.isInProgress()) {
            this.f202061b.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1 && getScale() < getMinScale()) {
            mo143346b(getMinScale());
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo143311a(int i) {
        RectF bitmapRect = getBitmapRect();
        mo143344a(bitmapRect, this.f202103z);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.right < ((float) rect.right) || i >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.f202103z.left)) > 1.0d) {
                return true;
            }
            return false;
        } else if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public C88989a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo143307a(float f, float f2) {
        if (this.f202064e == 1) {
            float f3 = this.f202063d;
            if ((2.0f * f3) + f <= f2) {
                return f + f3;
            }
            this.f202064e = -1;
            return f2;
        }
        this.f202064e = 1;
        return 1.0f;
    }

    /* renamed from: b */
    public final boolean mo143313b(float f, float f2) {
        if (getScale() == 1.0f) {
            return false;
        }
        this.f202096s = true;
        mo143348c(-f, -f2);
        invalidate();
        return true;
    }

    private C88989a(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.f202067h = true;
        this.f202068i = true;
        this.f202069j = true;
    }

    /* access modifiers changed from: protected */
    @Override // p4593g.p4594a.p4595a.p4596a.p4598b.AbstractC88995b
    /* renamed from: a */
    public final void mo143309a(Context context, AttributeSet attributeSet, int i) {
        super.mo143309a(context, attributeSet, i);
        this.f202062c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f202065f = getGestureListener();
        this.f202066g = getScaleListener();
        this.f202060a = new ScaleGestureDetector(getContext(), this.f202066g);
        this.f202061b = new GestureDetector(getContext(), this.f202065f, null, true);
        this.f202064e = 1;
    }

    /* access modifiers changed from: protected */
    @Override // p4593g.p4594a.p4595a.p4596a.p4598b.AbstractC88995b
    /* renamed from: a */
    public final void mo143310a(Drawable drawable, Matrix matrix, float f, float f2) {
        super.mo143310a(drawable, matrix, f, f2);
        this.f202063d = getMaxScale() / 3.0f;
    }

    /* renamed from: a */
    public final boolean mo143312a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
            return false;
        }
        this.f202096s = true;
        mo143349d(x / 2.0f, y / 2.0f);
        invalidate();
        return true;
    }
}
