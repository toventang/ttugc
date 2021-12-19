package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d */
public final class C72863d extends AbstractC14318d {

    /* renamed from: a */
    private final AbstractC74319k f163488a;

    /* renamed from: b */
    private int f163489b;

    /* renamed from: c */
    private int f163490c;

    /* renamed from: d */
    private boolean f163491d;

    /* renamed from: e */
    private PointF f163492e = new PointF(-2.0f, -2.0f);

    /* renamed from: f */
    private PointF f163493f = new PointF();

    static {
        Covode.recordClassIndex(85555);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23056b(MotionEvent motionEvent) {
        m128676a(motionEvent.getX(), motionEvent.getY());
        this.f163488a.mo116948e(this.f163493f.x / ((float) this.f163489b), this.f163493f.y / ((float) this.f163490c));
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: d */
    public final boolean mo23064d(MotionEvent motionEvent) {
        m128676a(motionEvent.getX(), motionEvent.getY());
        this.f163488a.mo116927a(0, this.f163493f.x / ((float) this.f163489b), this.f163493f.y / ((float) this.f163490c), 1);
        this.f163491d = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: e */
    public final boolean mo23067e(MotionEvent motionEvent) {
        m128676a(motionEvent.getX(), motionEvent.getY());
        this.f163488a.mo116927a(2, this.f163493f.x / ((float) this.f163489b), this.f163493f.y / ((float) this.f163490c), 1);
        this.f163491d = false;
        return false;
    }

    public C72863d(Context context, AbstractC74319k kVar) {
        this.f163489b = C40979n.m82507b(context);
        this.f163488a = kVar;
    }

    /* renamed from: a */
    private void m128676a(float f, float f2) {
        this.f163490c = C33398a.f79357a.mo59452b(C33398a.m68487c());
        int d = C33398a.f79357a.mo59453d();
        this.f163493f.set(f, f2);
        this.f163493f.offset(0.0f, (float) (-d));
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f163491d) {
            this.f163492e.x = motionEvent.getX();
            this.f163492e.y = motionEvent.getY();
            this.f163491d = false;
        }
        float x = motionEvent2.getX() - this.f163492e.x;
        float y = motionEvent2.getY() - this.f163492e.y;
        m128676a(motionEvent2.getX(), motionEvent2.getY());
        AbstractC74319k kVar = this.f163488a;
        float f3 = this.f163493f.x / ((float) this.f163489b);
        float f4 = this.f163493f.y;
        int i = this.f163490c;
        kVar.mo116925a(f3, f4 / ((float) i), x / ((float) this.f163489b), y / ((float) i));
        this.f163492e.x = motionEvent2.getX();
        this.f163492e.y = motionEvent2.getY();
        return true;
    }
}
