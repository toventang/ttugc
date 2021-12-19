package com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d.a.b */
public final class C70627b extends AbstractC14318d {

    /* renamed from: a */
    private final AbstractC74319k f158078a;

    /* renamed from: b */
    private int f158079b;

    /* renamed from: c */
    private int f158080c;

    /* renamed from: d */
    private int f158081d;

    /* renamed from: e */
    private int f158082e;

    /* renamed from: f */
    private float f158083f = 1.0f;

    /* renamed from: g */
    private float f158084g = 1.0f;

    /* renamed from: h */
    private float f158085h;

    /* renamed from: i */
    private boolean f158086i;

    /* renamed from: j */
    private PointF f158087j = new PointF(-2.0f, -2.0f);

    /* renamed from: k */
    private PointF f158088k = new PointF();

    static {
        Covode.recordClassIndex(83093);
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
        this.f158083f = 1.0f;
        this.f158084g = 1.0f;
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23055b(float f) {
        this.f158078a.mo116943c(-f);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: c */
    public final boolean mo23061c(float f) {
        this.f158078a.mo116943c(-f);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23056b(MotionEvent motionEvent) {
        m124799a(motionEvent.getX(), motionEvent.getY());
        PointF b = m124800b(this.f158088k.x, this.f158088k.y);
        this.f158078a.mo116946d(b.x, b.y);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: c */
    public final boolean mo23062c(MotionEvent motionEvent) {
        m124799a(motionEvent.getX(), motionEvent.getY());
        PointF b = m124800b(this.f158088k.x, this.f158088k.y);
        AbstractC74319k kVar = this.f158078a;
        if (kVar == null) {
            return true;
        }
        kVar.mo116950f(b.x, b.y);
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: d */
    public final boolean mo23064d(MotionEvent motionEvent) {
        m124799a(motionEvent.getX(), motionEvent.getY());
        this.f158078a.mo116927a(0, this.f158088k.x / ((float) this.f158079b), this.f158088k.y / ((float) this.f158080c), 0);
        this.f158086i = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: e */
    public final boolean mo23067e(MotionEvent motionEvent) {
        m124799a(motionEvent.getX(), motionEvent.getY());
        this.f158078a.mo116927a(2, this.f158088k.x / ((float) this.f158079b), this.f158088k.y / ((float) this.f158080c), 0);
        this.f158086i = false;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23058b(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.f158084g * scaleGestureDetector.getScaleFactor();
        this.f158084g = scaleFactor;
        this.f158078a.mo116938b(scaleFactor / this.f158083f);
        this.f158083f = this.f158084g;
        return true;
    }

    /* renamed from: a */
    private void m124799a(float f, float f2) {
        this.f158088k.set(f, f2);
        this.f158088k.offset((float) (-this.f158081d), (float) (-this.f158082e));
    }

    /* renamed from: b */
    private PointF m124800b(float f, float f2) {
        PointF pointF = new PointF();
        pointF.x = f / ((float) this.f158079b);
        pointF.y = f2 / ((float) this.f158080c);
        return pointF;
    }

    public C70627b(AbstractC74319k kVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.f158078a = kVar;
        this.f158079b = marginLayoutParams.width;
        this.f158080c = marginLayoutParams.height;
        this.f158081d = marginLayoutParams.getMarginStart();
        this.f158082e = marginLayoutParams.topMargin;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f158086i) {
            this.f158087j.x = motionEvent.getX();
            this.f158087j.y = motionEvent.getY();
            this.f158086i = false;
        }
        float x = motionEvent2.getX() - this.f158087j.x;
        float y = motionEvent2.getY() - this.f158087j.y;
        m124799a(motionEvent2.getX(), motionEvent2.getY());
        AbstractC74319k kVar = this.f158078a;
        float f3 = this.f158088k.x / ((float) this.f158079b);
        float f4 = this.f158088k.y;
        int i = this.f158080c;
        kVar.mo116925a(f3, f4 / ((float) i), x / ((float) this.f158079b), y / ((float) i));
        this.f158087j.x = motionEvent2.getX();
        this.f158087j.y = motionEvent2.getY();
        if (motionEvent == null || motionEvent.getX() == this.f158085h) {
            return true;
        }
        this.f158085h = motionEvent.getX();
        return true;
    }
}
