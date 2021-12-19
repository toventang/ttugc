package com.bytedance.android.live.broadcast.api;

import android.view.ScaleGestureDetector;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.android.live.broadcast.api.b */
public final class C3020b extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a */
    public float f8823a;

    /* renamed from: b */
    public final AbstractC3055a f8824b;

    /* renamed from: c */
    private float f8825c;

    /* renamed from: d */
    private float f8826d = -1.0f;

    /* renamed from: e */
    private final DataChannel f8827e;

    static {
        Covode.recordClassIndex(3493);
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        DataChannel dataChannel = this.f8827e;
        if (dataChannel != null) {
            dataChannel.mo28311a(C3067i.class, (Object) true);
        }
        this.f8825c = this.f8823a;
        return super.onScaleBegin(scaleGestureDetector);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int i;
        if (this.f8826d == -1.0f) {
            AbstractC3055a aVar = this.f8824b;
            if (aVar != null) {
                i = aVar.mo8300d();
            } else {
                i = -1;
            }
            this.f8826d = (float) i;
        }
        if (this.f8824b == null) {
            return false;
        }
        float f = this.f8826d;
        if (f <= 0.0f) {
            return false;
        }
        if (scaleGestureDetector == null) {
            return true;
        }
        float b = C89271h.m154768b(0.0f, ((f / 1000.0f) * (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan())) + this.f8823a);
        this.f8823a = b;
        float c = C89271h.m154771c(b, this.f8826d);
        this.f8823a = c;
        this.f8824b.mo8279a(c);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScaleEnd(android.view.ScaleGestureDetector r5) {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r4.f8827e
            if (r2 == 0) goto L_0x000e
            java.lang.Class<com.bytedance.android.live.broadcast.api.i> r1 = com.bytedance.android.live.broadcast.api.C3067i.class
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.mo28311a(r1, r0)
        L_0x000e:
            super.onScaleEnd(r5)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.f8827e
            if (r1 == 0) goto L_0x001f
            java.lang.Class<com.bytedance.android.livesdk.j.aw> r0 = com.bytedance.android.livesdk.p561j.C9029aw.class
            java.lang.Object r2 = r1.mo28318b(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x0049
        L_0x001f:
            java.lang.String r3 = "live_take_detail"
        L_0x0021:
            float r2 = r4.f8823a
            float r1 = r4.f8825c
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            java.lang.String r2 = "zoom_in"
        L_0x002b:
            java.lang.String r0 = "livesdk_zoom_in"
            com.bytedance.android.livesdk.aa.b r0 = com.bytedance.android.livesdk.p425aa.C6501b.C6502a.m13948a(r0)
            com.bytedance.android.livesdk.aa.b r1 = r0.mo12658d(r3)
            java.lang.String r0 = "hand_gesture"
            com.bytedance.android.livesdk.aa.b r0 = r1.mo12651a(r0, r2)
            r0.mo12655b()
            return
        L_0x003f:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            java.lang.String r2 = "zoom_out"
            goto L_0x002b
        L_0x0046:
            java.lang.String r2 = "no_change"
            goto L_0x002b
        L_0x0049:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0053
            java.lang.String r3 = "guest_connect"
            goto L_0x0021
        L_0x0053:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x001f
            java.lang.String r3 = "host_connect"
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.api.C3020b.onScaleEnd(android.view.ScaleGestureDetector):void");
    }

    public C3020b(AbstractC3055a aVar, DataChannel dataChannel) {
        this.f8824b = aVar;
        this.f8827e = dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28314b(C3066h.class, (AbstractC89172b) new AbstractC89172b<Float, C89391z>(this) {
                /* class com.bytedance.android.live.broadcast.api.C3020b.C30211 */

                /* renamed from: a */
                final /* synthetic */ C3020b f8828a;

                static {
                    Covode.recordClassIndex(3494);
                }

                {
                    this.f8828a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Float f) {
                    float floatValue = f.floatValue();
                    this.f8828a.f8823a = floatValue;
                    AbstractC3055a aVar = this.f8828a.f8824b;
                    if (aVar != null) {
                        aVar.mo8279a(floatValue);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }
}
