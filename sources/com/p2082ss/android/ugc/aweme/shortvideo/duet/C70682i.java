package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.vesdk.C85392bf;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.i */
public final class C70682i extends AbstractC14318d {

    /* renamed from: a */
    private int f158204a;

    /* renamed from: b */
    private int f158205b;

    /* renamed from: c */
    private boolean f158206c;

    /* renamed from: d */
    private final PointF f158207d = new PointF(-2.0f, -2.0f);

    /* renamed from: e */
    private float f158208e;

    /* renamed from: f */
    private final PointF f158209f = new PointF();

    /* renamed from: g */
    private Pair<Float, Float> f158210g;

    /* renamed from: h */
    private final AbstractC31193a f158211h;

    /* renamed from: i */
    private final ViewGroup.MarginLayoutParams f158212i;

    static {
        Covode.recordClassIndex(83153);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: d */
    public final boolean mo23064d(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        m124911a(motionEvent.getX(), motionEvent.getY());
        this.f158211h.mo56767a(0, this.f158209f.x / ((float) this.f158204a), this.f158209f.y / ((float) this.f158205b), 0);
        this.f158206c = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: e */
    public final boolean mo23067e(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        m124911a(motionEvent.getX(), motionEvent.getY());
        this.f158211h.mo56767a(2, this.f158209f.x / ((float) this.f158204a), this.f158209f.y / ((float) this.f158205b), 1);
        this.f158206c = false;
        return false;
    }

    /* renamed from: a */
    private final void m124911a(float f, float f2) {
        this.f158209f.set(f, f2);
        this.f158209f.offset(-((float) this.f158212i.getMarginStart()), -((float) this.f158212i.topMargin));
    }

    public C70682i(AbstractC31193a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(marginLayoutParams, "");
        this.f158211h = aVar;
        this.f158212i = marginLayoutParams;
        Float valueOf = Float.valueOf(-2.0f);
        this.f158210g = new Pair<>(valueOf, valueOf);
        this.f158204a = marginLayoutParams.width;
        this.f158205b = marginLayoutParams.height;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14318d
    /* renamed from: a */
    public final void mo23103a(C85392bf bfVar, MotionEvent motionEvent) {
        C89219l.m154721d(bfVar, "");
        C89219l.m154721d(motionEvent, "");
        super.mo23103a(bfVar, motionEvent);
        m124911a(bfVar.f191162c, bfVar.f191163d);
        bfVar.f191162c = this.f158209f.x / ((float) this.f158204a);
        bfVar.f191163d = this.f158209f.y / ((float) this.f158205b);
        this.f158211h.mo56791a(bfVar, motionEvent.getPointerCount());
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: e */
    public final void mo23066e(MotionEvent motionEvent, int[] iArr) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(iArr, "");
        if (motionEvent.getPointerCount() == 2) {
            m124911a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f158211h.mo56767a(2, this.f158209f.x / ((float) this.f158204a), this.f158209f.y / ((float) this.f158205b), 0);
            this.f158206c = false;
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: d */
    public final void mo23063d(MotionEvent motionEvent, int[] iArr) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(iArr, "");
        if (motionEvent.getPointerCount() == 2) {
            m124911a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            this.f158211h.mo56767a(0, this.f158209f.x / ((float) this.f158204a), this.f158209f.y / ((float) this.f158205b), 0);
            this.f158206c = true;
            this.f158210g = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final void mo23041a(MotionEvent motionEvent, int[] iArr) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(iArr, "");
        if (motionEvent.getPointerCount() == 2) {
            if (this.f158206c) {
                this.f158207d.x = ((Number) this.f158210g.first).floatValue() + ((float) iArr[0]);
                this.f158207d.y = ((Number) this.f158210g.second).floatValue() + ((float) iArr[1]);
                this.f158206c = false;
            }
            float x = (motionEvent.getX(1) + ((float) iArr[0])) - this.f158207d.x;
            float y = (motionEvent.getY(1) + ((float) iArr[1])) - this.f158207d.y;
            m124911a(motionEvent.getX(1) + ((float) iArr[0]), motionEvent.getY(1) + ((float) iArr[1]));
            AbstractC31193a aVar = this.f158211h;
            float f = this.f158209f.x / ((float) this.f158204a);
            float f2 = this.f158209f.y;
            int i = this.f158205b;
            aVar.mo56765a(f, f2 / ((float) i), x / ((float) this.f158204a), y / ((float) i), 1.0f);
            this.f158207d.x = motionEvent.getX(1) + ((float) iArr[0]);
            this.f158207d.y = motionEvent.getY(1) + ((float) iArr[1]);
            if (((Number) this.f158210g.first).floatValue() + ((float) iArr[0]) != this.f158208e) {
                this.f158208e = ((Number) this.f158210g.first).floatValue() + ((float) iArr[0]);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C89219l.m154721d(motionEvent2, "");
        if (this.f158206c) {
            PointF pointF = this.f158207d;
            if (motionEvent == null) {
                C89219l.m154715b();
            }
            pointF.x = motionEvent.getX();
            this.f158207d.y = motionEvent.getY();
            this.f158206c = false;
        }
        float x = motionEvent2.getX() - this.f158207d.x;
        float y = motionEvent2.getY() - this.f158207d.y;
        m124911a(motionEvent2.getX(), motionEvent2.getY());
        AbstractC31193a aVar = this.f158211h;
        float f3 = this.f158209f.x / ((float) this.f158204a);
        float f4 = this.f158209f.y;
        int i = this.f158205b;
        aVar.mo56765a(f3, f4 / ((float) i), x / ((float) this.f158204a), y / ((float) i), 1.0f);
        this.f158207d.x = motionEvent2.getX();
        this.f158207d.y = motionEvent2.getY();
        if (!(motionEvent == null || motionEvent.getX() == this.f158208e)) {
            this.f158208e = motionEvent.getX();
        }
        return false;
    }
}
