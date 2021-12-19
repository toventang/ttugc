package com.p2082ss.android.ttvecamera.p2195d;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30956m;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.d.b */
public class C30793b extends AbstractC30797d {

    /* renamed from: a */
    public final AbstractC30791a.AbstractC30792a f73726a;

    /* renamed from: b */
    public AtomicBoolean f73727b;

    static {
        Covode.recordClassIndex(37418);
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final int mo55751a() {
        return this.f73726a.mo55647f();
    }

    public C30793b(AbstractC30791a.AbstractC30792a aVar) {
        this.f73726a = aVar;
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback mo55753a(final boolean z) {
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.p2082ss.android.ttvecamera.p2195d.C30793b.C307952 */

            /* renamed from: c */
            private boolean f73735c;

            static {
                Covode.recordClassIndex(37420);
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (!z && C30793b.this.f73744c != null) {
                    C30793b.this.f73744c.f74246m.mo56059a(-411, C30793b.this.f73745d.f74181e, captureFailure.toString());
                }
                C30969o.m63689d("TEFocusAndMeterStrategy", "Manual Metering Failed: ".concat(String.valueOf(captureFailure)));
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    C30969o.m63688c("TEFocusAndMeterStrategy", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    if (!z && C30793b.this.f73744c != null && !this.f73735c) {
                        C30793b.this.f73744c.f74246m.mo56059a(C30793b.this.f73744c.mo56055a(), C30793b.this.f73745d.f74181e, "Done");
                        this.f73735c = true;
                    }
                    C30793b.this.f73726a.mo55648g();
                }
                if (C30793b.this.f73746e) {
                    C30793b.this.f73746e = C30956m.m63670a(totalCaptureResult);
                }
            }
        };
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public void mo55754a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: b */
    public final void mo55756b(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final void mo55755a(CaptureRequest.Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a
    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback mo55752a(final CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, final boolean z) {
        this.f73727b = atomicBoolean;
        return new CameraCaptureSession.CaptureCallback() {
            /* class com.p2082ss.android.ttvecamera.p2195d.C30793b.C307941 */

            /* renamed from: d */
            private int f73731d = -1;

            /* renamed from: e */
            private boolean f73732e;

            static {
                Covode.recordClassIndex(37419);
            }

            /* renamed from: a */
            private void m63286a() {
                if (C30793b.this.f73727b != null) {
                    C30793b.this.f73727b.set(false);
                }
            }

            /* renamed from: b */
            private void m63287b() {
                if (z) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    C30793b.this.f73726a.mo55757a(builder);
                }
                m63286a();
            }

            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                C30969o.m63689d("TEFocusAndMeterStrategy", "Manual Focus capture abort ");
                C30793b.this.f73744c.f74246m.mo56059a(-438, C30793b.this.f73745d.f74181e, "Manual Focus capture abort ");
                m63287b();
            }

            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                C30969o.m63687b("TEFocusAndMeterStrategy", "Focus onCaptureProgressed!");
            }

            public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                C30969o.m63687b("TEFocusAndMeterStrategy", "Focus onCaptureSequenceCompleted!");
                m63286a();
            }

            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                C30969o.m63689d("TEFocusAndMeterStrategy", "Manual Focus Failed: ".concat(String.valueOf(captureFailure)));
                C30793b.this.f73744c.f74246m.mo56059a(-411, C30793b.this.f73745d.f74181e, captureFailure.toString());
                m63287b();
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    C30969o.m63688c("TEFocusAndMeterStrategy", "Focus failed.");
                    m63286a();
                    return;
                }
                boolean z = false;
                if (this.f73731d != num.intValue()) {
                    C30969o.m63686a("TEFocusAndMeterStrategy", "Focus onCaptureCompleted! afState = ".concat(String.valueOf(num)));
                    z = true;
                }
                this.f73731d = num.intValue();
                if (z && (num.intValue() == 4 || num.intValue() == 5)) {
                    if (z) {
                        C30793b.this.f73726a.mo55757a(builder);
                    } else {
                        C30793b.this.f73726a.mo55647f();
                    }
                    if (!this.f73732e) {
                        this.f73732e = true;
                        C30793b.this.f73744c.f74246m.mo56059a(C30793b.this.f73744c.mo56055a(), C30793b.this.f73745d.f74181e, "Done");
                    }
                    m63286a();
                    C30969o.m63686a("TEFocusAndMeterStrategy", "Focus done, isLock = " + z + ", afState = " + num);
                }
                if (!(!this.f73732e || num.intValue() == 4 || num.intValue() == 5)) {
                    C30969o.m63689d("TEFocusAndMeterStrategy", "afState error!!!, may be re-auto-focus in some device, switch to caf");
                    C30793b.this.f73726a.mo55647f();
                }
                if (C30793b.this.f73746e) {
                    C30793b.this.f73746e = C30956m.m63670a(totalCaptureResult);
                }
            }

            public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                C30969o.m63687b("TEFocusAndMeterStrategy", "Focus onCaptureStarted!");
            }

            public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                C30969o.m63689d("TEFocusAndMeterStrategy", "Manual Focus capture buffer lost ");
                C30793b.this.f73744c.f74246m.mo56059a(-411, C30793b.this.f73744c.mo56055a(), "Manual Focus capture buffer lost ");
                m63287b();
            }
        };
    }
}
