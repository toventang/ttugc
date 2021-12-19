package com.p2082ss.android.ttvecamera.p2195d;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.d.e */
public final class C30798e extends AbstractC30797d {

    /* renamed from: a */
    public AtomicBoolean f73747a;

    /* renamed from: b */
    protected AbstractC30791a.AbstractC30792a f73748b;

    /* renamed from: f */
    public boolean f73749f = true;

    static {
        Covode.recordClassIndex(37423);
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final int mo55751a() {
        return this.f73748b.mo55647f();
    }

    public C30798e(AbstractC30791a.AbstractC30792a aVar) {
        this.f73748b = aVar;
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback mo55753a(final boolean z) {
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.p2082ss.android.ttvecamera.p2195d.C30798e.C308002 */

            static {
                Covode.recordClassIndex(37425);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && C30798e.this.f73744c != null) {
                    C30798e.this.f73744c.f74246m.mo56059a(-411, C30798e.this.f73745d.f74181e, captureFailure.toString());
                }
                C30969o.m63689d("TEImageFocus", "Manual Metering Failed: ".concat(String.valueOf(captureFailure)));
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    C30969o.m63688c("TEImageFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && C30798e.this.f73744c != null) {
                        C30798e.this.f73744c.f74246m.mo56059a(C30798e.this.f73744c.mo56055a(), C30798e.this.f73745d.f74181e, "Done");
                    }
                    C30798e.this.f73748b.mo55648g();
                }
                if (C30798e.this.f73749f) {
                    C30798e.this.f73749f = C30956m.m63670a(totalCaptureResult);
                }
            }
        };
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final void mo55754a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: b */
    public final void mo55756b(CaptureRequest.Builder builder, Rect rect) {
        if (Build.VERSION.SDK_INT >= 23) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final void mo55755a(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        builder.setTag("FOCUS_TAG");
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback mo55752a(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z) {
        this.f73747a = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.p2082ss.android.ttvecamera.p2195d.C30798e.C307991 */

            /* renamed from: d */
            private int f73753d = -1;

            /* renamed from: e */
            private boolean f73754e;

            static {
                Covode.recordClassIndex(37424);
            }

            /* renamed from: a */
            private void m63298a() {
                if (C30798e.this.f73747a != null) {
                    C30798e.this.f73747a.set(false);
                }
            }

            /* renamed from: b */
            private void m63299b() {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    C30798e.this.f73748b.mo55757a(builder);
                }
                m63298a();
            }

            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                C30969o.m63689d("TEImageFocus", "Manual Focus capture abort ");
                C30798e.this.f73744c.f74246m.mo56059a(-438, C30798e.this.f73745d.f74181e, "Manual Focus capture abort ");
                m63299b();
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                C30969o.m63689d("TEImageFocus", "Manual Focus Failed: ".concat(String.valueOf(captureFailure)));
                C30798e.this.f73744c.f74246m.mo56059a(-411, C30798e.this.f73745d.f74181e, captureFailure.toString());
                m63299b();
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || !"FOCUS_TAG".equals(captureRequest.getTag())) {
                    C30969o.m63688c("TEImageFocus", "Not focus request!");
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    C30969o.m63688c("TEImageFocus", "Focus failed.");
                    m63298a();
                    return;
                }
                if (this.f73753d != num.intValue() && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        C30798e.this.f73748b.mo55757a(builder);
                    } else {
                        C30798e.this.f73748b.mo55647f();
                    }
                    if (!this.f73754e) {
                        this.f73754e = true;
                        C30798e.this.f73744c.f74246m.mo56059a(C30798e.this.f73744c.mo56055a(), C30798e.this.f73745d.f74181e, "Done");
                    }
                    m63298a();
                    C30969o.m63686a("TEImageFocus", "Focus done, isLock = " + z + ", afState = " + num);
                }
                if (!(!this.f73754e || num.intValue() == 4 || num.intValue() == 5)) {
                    C30969o.m63689d("TEImageFocus", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    C30798e.this.f73748b.mo55647f();
                }
                this.f73753d = num.intValue();
                if (C30798e.this.f73749f) {
                    C30798e.this.f73749f = C30956m.m63670a(totalCaptureResult);
                }
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                C30969o.m63689d("TEImageFocus", "Manual Focus capture buffer lost ");
                C30798e.this.f73744c.f74246m.mo56059a(-411, C30798e.this.f73745d.f74181e, "Manual Focus capture buffer lost ");
                m63299b();
            }
        };
    }
}
