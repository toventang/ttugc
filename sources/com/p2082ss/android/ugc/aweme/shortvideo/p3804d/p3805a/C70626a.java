package com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import com.p2082ss.android.vesdk.C85392bf;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d.a.a */
public final class C70626a extends AbstractC14318d {

    /* renamed from: a */
    private final AbstractC31193a f158066a;

    /* renamed from: b */
    private int f158067b;

    /* renamed from: c */
    private int f158068c;

    /* renamed from: d */
    private float f158069d = 1.0f;

    /* renamed from: e */
    private float f158070e = 1.0f;

    /* renamed from: f */
    private int f158071f;

    /* renamed from: g */
    private int f158072g;

    /* renamed from: h */
    private float f158073h;

    /* renamed from: i */
    private boolean f158074i;

    /* renamed from: j */
    private PointF f158075j = new PointF(-2.0f, -2.0f);

    /* renamed from: k */
    private PointF f158076k = new PointF();

    /* renamed from: l */
    private Pair<Float, Float> f158077l;

    static {
        Covode.recordClassIndex(83092);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23044a() {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23048a(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23051a(C84885c cVar) {
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final void mo23052b(MotionEvent motionEvent, int[] iArr) {
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23054b() {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23045a(float f) {
        this.f158069d = 1.0f;
        this.f158070e = 1.0f;
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23055b(float f) {
        this.f158066a.mo56814e(-f, 6.0f);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: c */
    public final boolean mo23061c(float f) {
        this.f158066a.mo56814e(-f, 6.0f);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23056b(MotionEvent motionEvent) {
        m124777a(motionEvent.getX(), motionEvent.getY());
        PointF b = m124778b(this.f158076k.x, this.f158076k.y);
        this.f158066a.mo56797b(b.x, b.y);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: d */
    public final boolean mo23064d(MotionEvent motionEvent) {
        m124777a(motionEvent.getX(), motionEvent.getY());
        this.f158066a.mo56767a(0, this.f158076k.x / ((float) this.f158067b), this.f158076k.y / ((float) this.f158068c), 0);
        this.f158074i = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: c */
    public final boolean mo23062c(MotionEvent motionEvent) {
        m124777a(motionEvent.getX(), motionEvent.getY());
        PointF b = m124778b(this.f158076k.x, this.f158076k.y);
        AbstractC31193a aVar = this.f158066a;
        if (aVar == null) {
            return true;
        }
        aVar.mo56816f(b.x, b.y);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: e */
    public final boolean mo23067e(MotionEvent motionEvent) {
        m124777a(motionEvent.getX(), motionEvent.getY());
        this.f158066a.mo56767a(2, this.f158076k.x / ((float) this.f158067b), this.f158076k.y / ((float) this.f158068c), 0);
        this.f158074i = false;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23058b(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.f158070e * scaleGestureDetector.getScaleFactor();
        this.f158070e = scaleFactor;
        this.f158066a.mo56810d(scaleFactor / this.f158069d, 3.0f);
        this.f158069d = this.f158070e;
        return true;
    }

    /* renamed from: a */
    private void m124777a(float f, float f2) {
        this.f158076k.set(f, f2);
        this.f158076k.offset((float) (-this.f158071f), (float) (-this.f158072g));
    }

    /* renamed from: b */
    private PointF m124778b(float f, float f2) {
        PointF pointF = new PointF();
        pointF.x = f / ((float) this.f158067b);
        pointF.y = f2 / ((float) this.f158068c);
        return pointF;
    }

    public C70626a(AbstractC31193a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.f158066a = aVar;
        this.f158067b = marginLayoutParams.width;
        this.f158068c = marginLayoutParams.height;
        this.f158071f = marginLayoutParams.getMarginStart();
        this.f158072g = marginLayoutParams.topMargin;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14318d
    /* renamed from: a */
    public final void mo23103a(C85392bf bfVar, MotionEvent motionEvent) {
        super.mo23103a(bfVar, motionEvent);
        m124777a(bfVar.f191162c, bfVar.f191163d);
        bfVar.f191162c = this.f158076k.x / ((float) this.f158067b);
        bfVar.f191163d = this.f158076k.y / ((float) this.f158068c);
        this.f158066a.mo56791a(bfVar, motionEvent.getPointerCount());
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: c */
    public final void mo23060c(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            m124777a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            PointF b = m124778b(this.f158076k.x, this.f158076k.y);
            this.f158066a.mo56797b(b.x, b.y);
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: e */
    public final void mo23066e(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            m124777a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f158066a.mo56767a(2, this.f158076k.x / ((float) this.f158067b), this.f158076k.y / ((float) this.f158068c), 0);
            this.f158074i = false;
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: d */
    public final void mo23063d(MotionEvent motionEvent, int[] iArr) {
        if (motionEvent.getPointerCount() == 2) {
            m124777a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f158066a.mo56767a(0, this.f158076k.x / ((float) this.f158067b), this.f158076k.y / ((float) this.f158068c), 0);
            this.f158074i = true;
            this.f158077l = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final void mo23041a(MotionEvent motionEvent, int[] iArr) {
        Pair<Float, Float> pair;
        if (motionEvent.getPointerCount() == 2) {
            if (this.f158074i && (pair = this.f158077l) != null) {
                this.f158075j.x = ((Float) pair.first).floatValue() + ((float) iArr[0]);
                this.f158075j.y = ((Float) this.f158077l.second).floatValue() + ((float) iArr[1]);
                this.f158074i = false;
            }
            float x = (motionEvent.getX(1) + ((float) iArr[0])) - this.f158075j.x;
            float y = (motionEvent.getY(1) + ((float) iArr[1])) - this.f158075j.y;
            m124777a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            AbstractC31193a aVar = this.f158066a;
            float f = this.f158076k.x / ((float) this.f158067b);
            float f2 = this.f158076k.y;
            int i = this.f158068c;
            aVar.mo56765a(f, f2 / ((float) i), x / ((float) this.f158067b), y / ((float) i), 1.0f);
            this.f158075j.x = motionEvent.getX(1) + ((float) iArr[0]);
            this.f158075j.y = motionEvent.getY(1) + ((float) iArr[1]);
            Pair<Float, Float> pair2 = this.f158077l;
            if (pair2 != null && ((Float) pair2.first).floatValue() + ((float) iArr[0]) != this.f158073h) {
                this.f158073h = ((Float) this.f158077l.first).floatValue() + ((float) iArr[0]);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f158074i) {
            this.f158075j.x = motionEvent.getX();
            this.f158075j.y = motionEvent.getY();
            this.f158074i = false;
        }
        float x = motionEvent2.getX() - this.f158075j.x;
        float y = motionEvent2.getY() - this.f158075j.y;
        m124777a(motionEvent2.getX(), motionEvent2.getY());
        AbstractC31193a aVar = this.f158066a;
        float f3 = this.f158076k.x / ((float) this.f158067b);
        float f4 = this.f158076k.y;
        int i = this.f158068c;
        aVar.mo56765a(f3, f4 / ((float) i), x / ((float) this.f158067b), y / ((float) i), 1.0f);
        this.f158075j.x = motionEvent2.getX();
        this.f158075j.y = motionEvent2.getY();
        if (motionEvent == null || motionEvent.getX() == this.f158073h) {
            return true;
        }
        this.f158073h = motionEvent.getX();
        return true;
    }
}
