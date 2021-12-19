package com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.asve.recorder.view.AbstractC31257g;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a.a */
public final class C72744a {

    /* renamed from: a */
    ActivityC0218d f163104a;

    /* renamed from: b */
    public final C72796k f163105b;

    /* renamed from: c */
    public ASCameraView f163106c;

    /* renamed from: d */
    C72750f f163107d;

    /* renamed from: e */
    public ValueAnimator f163108e;

    /* renamed from: f */
    boolean f163109f;

    /* renamed from: g */
    public AbstractC14318d f163110g = new AbstractC14318d() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a.C72744a.C727451 */

        /* renamed from: a */
        boolean f163112a;

        /* renamed from: b */
        boolean f163113b;

        static {
            Covode.recordClassIndex(85431);
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: a */
        public final boolean mo23046a(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: a */
        public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: a */
        public final boolean mo23049a(C84882b bVar) {
            if (!this.f163112a) {
                return false;
            }
            C72744a.this.mo115041a().mo56860b(bVar.f189709i.x, bVar.f189709i.y);
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: b */
        public final void mo23053b(C84882b bVar) {
            if (this.f163112a) {
                this.f163112a = false;
                this.f163113b = true;
                C72744a.this.mo115041a().mo56859b();
                C72744a.this.f163105b.mo22779a(new C14171ac(true));
            }
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: b */
        public final boolean mo23056b(MotionEvent motionEvent) {
            C72744a.this.f163105b.mo22776a(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: a */
        public final boolean mo23050a(C84882b bVar, float f, float f2) {
            C72744a aVar = C72744a.this;
            if (aVar.f163105b.f163306G && !aVar.f163105b.f163307H) {
                boolean a = C72744a.this.mo115041a().mo56858a(f, f2);
                this.f163112a = a;
                if (a) {
                    C72744a aVar2 = C72744a.this;
                    if (aVar2.f163107d != null) {
                        aVar2.f163107d.mo115046a(false);
                    }
                    C72744a.this.f163105b.mo22779a(new C14171ac(false));
                }
            }
            return this.f163112a;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: b */
        public final boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f163113b) {
                return false;
            }
            this.f163113b = false;
            return true;
        }
    };

    /* renamed from: h */
    private AbstractC31257g f163111h;

    static {
        Covode.recordClassIndex(85430);
    }

    /* renamed from: a */
    public final AbstractC31257g mo115041a() {
        if (this.f163111h == null) {
            this.f163111h = this.f163106c.getGestureDispatcher();
        }
        return this.f163111h;
    }

    public C72744a(ActivityC0218d dVar, ASCameraView aSCameraView, C72796k kVar) {
        this.f163104a = dVar;
        this.f163105b = kVar;
        this.f163106c = aSCameraView;
        kVar.f163371e.mo7036a(this.f163104a, new C72746b(this));
        kVar.f163375i.mo7019b(this.f163110g);
    }
}
