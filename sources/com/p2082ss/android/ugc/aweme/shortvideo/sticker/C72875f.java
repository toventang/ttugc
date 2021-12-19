package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.vesdk.C85392bf;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.f */
public final class C72875f extends AbstractC14318d {

    /* renamed from: a */
    private final AbstractC31193a f163515a;

    /* renamed from: b */
    private int f163516b;

    /* renamed from: c */
    private int f163517c;

    /* renamed from: d */
    private boolean f163518d;

    /* renamed from: e */
    private PointF f163519e = new PointF(-2.0f, -2.0f);

    /* renamed from: f */
    private PointF f163520f = new PointF();

    static {
        Covode.recordClassIndex(85567);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: b */
    public final boolean mo23056b(MotionEvent motionEvent) {
        m128698a(motionEvent.getX(), motionEvent.getY());
        this.f163515a.mo56805c(this.f163520f.x / ((float) this.f163516b), this.f163520f.y / ((float) this.f163517c));
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: d */
    public final boolean mo23064d(MotionEvent motionEvent) {
        m128698a(motionEvent.getX(), motionEvent.getY());
        this.f163515a.mo56767a(0, this.f163520f.x / ((float) this.f163516b), this.f163520f.y / ((float) this.f163517c), 1);
        this.f163518d = true;
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: e */
    public final boolean mo23067e(MotionEvent motionEvent) {
        m128698a(motionEvent.getX(), motionEvent.getY());
        this.f163515a.mo56767a(2, this.f163520f.x / ((float) this.f163516b), this.f163520f.y / ((float) this.f163517c), 1);
        this.f163518d = false;
        return false;
    }

    public C72875f(Context context, AbstractC31193a aVar) {
        this.f163516b = C40979n.m82507b(context);
        this.f163515a = aVar;
    }

    /* renamed from: a */
    private void m128698a(float f, float f2) {
        this.f163517c = C33398a.f79357a.mo59452b(C33398a.m68487c());
        int d = C33398a.f79357a.mo59453d();
        this.f163520f.set(f, f2);
        this.f163520f.offset(0.0f, (float) (-d));
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14318d
    /* renamed from: a */
    public final void mo23103a(C85392bf bfVar, MotionEvent motionEvent) {
        super.mo23103a(bfVar, motionEvent);
        m128698a(bfVar.f191162c, bfVar.f191163d);
        bfVar.f191162c = this.f163520f.x / ((float) this.f163516b);
        bfVar.f191163d = this.f163520f.y / ((float) this.f163517c);
        this.f163515a.mo56791a(bfVar, motionEvent.getPointerCount());
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: a */
    public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f163518d) {
            this.f163519e.x = motionEvent.getX();
            this.f163519e.y = motionEvent.getY();
            this.f163518d = false;
        }
        float x = motionEvent2.getX() - this.f163519e.x;
        float y = motionEvent2.getY() - this.f163519e.y;
        m128698a(motionEvent2.getX(), motionEvent2.getY());
        AbstractC31193a aVar = this.f163515a;
        float f3 = this.f163520f.x / ((float) this.f163516b);
        float f4 = this.f163520f.y;
        int i = this.f163517c;
        aVar.mo56765a(f3, f4 / ((float) i), x / ((float) this.f163516b), y / ((float) i), 1.0f);
        this.f163519e.x = motionEvent2.getX();
        this.f163519e.y = motionEvent2.getY();
        return true;
    }
}
