package com.p2082ss.android.ttvecamera.p2193b;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30806e;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.p2195d.C30802g;
import com.p2082ss.android.ttvecamera.p2195d.C30805h;
import com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.b.b */
public class C30781b extends AbstractC30813b {

    /* renamed from: a */
    private static final String f73710a = C30781b.class.getSimpleName();

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: U_ */
    public final int mo55744U_() {
        return super.mo55744U_();
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: V_ */
    public final int mo55745V_() {
        return super.mo55745V_();
    }

    static {
        Covode.recordClassIndex(37406);
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a.AbstractC30792a
    /* renamed from: f */
    public final int mo55647f() {
        if (this.f73826v == null) {
            this.f73829y.mo55847a(-100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f73826v.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f73826v.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
        mo55822d(this.f73826v);
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.p2195d.AbstractC30791a.AbstractC30792a
    /* renamed from: g */
    public final int mo55648g() {
        if (this.f73826v == null) {
            this.f73829y.mo55847a(-100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        if (this.f73803N) {
            mo55819b(this.f73826v);
        }
        this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
        mo55822d(this.f73826v);
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30813b
    /* renamed from: d */
    public final int mo55645d() {
        Handler handler;
        C30862c cVar = this.f73830z.f73852t;
        if (this.f73792C == null || cVar == null) {
            C30969o.m63687b(f73710a, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int a = super.mo55631a();
        if (a != 0) {
            return a;
        }
        this.f73826v = this.f73792C.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        if (cVar.f73930b.mo55876c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.mo55895c()));
        } else if (cVar.f73930b.mo55876c() == 16) {
            arrayList.add(cVar.mo55894b());
            arrayList.add(cVar.f73930b.mo55883f());
        } else {
            arrayList.add(cVar.mo55894b());
        }
        boolean z = false;
        for (Surface surface : arrayList) {
            this.f73826v.addTarget(surface);
            if (!surface.isValid()) {
                z = true;
            }
        }
        if (this.f73790A.f74153T) {
            this.f73826v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mo55711a(new Range<>(Integer.valueOf(this.f73806Q.f73613a / this.f73790A.f74180d.f73615c), Integer.valueOf(this.f73806Q.f73614b / this.f73790A.f74180d.f73615c))));
        }
        if (z) {
            C30969o.m63689d(f73710a, "start preview may be failed, surface invalid...");
        }
        this.f73810U = false;
        this.f73811V = System.currentTimeMillis();
        if (this.f73790A.f74188l) {
            handler = mo55832x();
        } else {
            handler = this.f73793D;
        }
        this.f73827w = null;
        mo55717a(arrayList, this.f73819ac, handler, false);
        if (this.f73827w == null) {
            mo55834z();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ttvecamera.p2196e.AbstractC30812a
    /* renamed from: b */
    public final void mo55643b(int i) {
        int i2 = 1;
        if (this.f73826v == null) {
            String str = f73710a;
            C30969o.m63689d(str, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: mCaptureRequestBuilder is null");
            C30969o.m63689d(str, "switchFlashMode: ".concat("CaptureRequest.Builder is null"));
            this.f73829y.mo55847a(-100, "switchFlashMode:".concat("CaptureRequest.Builder is null"));
            AbstractC30825g.AbstractC30826a aVar = this.f73829y;
            if (i == 0) {
                i2 = 0;
            }
            aVar.mo55853d(i2, "switchFlashMode:".concat("CaptureRequest.Builder is null"));
            return;
        }
        if (i == 0) {
            this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f73826v.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i != 2) {
            String str2 = f73710a;
            C30969o.m63689d(str2, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -100. Reason: not support flash mode ".concat(String.valueOf(i)));
            C30969o.m63688c(str2, "Video Mode not support this mode : ".concat(String.valueOf(i)));
            this.f73829y.mo55853d(-1, "Video Mode not support this mode : ".concat(String.valueOf(i)));
            return;
        } else {
            this.f73826v.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f73826v.set(CaptureRequest.FLASH_MODE, 2);
        }
        this.f73790A.f74161ab = i;
        this.f73829y.mo55846a(104, 0, "camera2 will change flash mode ".concat(String.valueOf(i)));
        AbstractC30813b.C30820a d = mo55822d(this.f73826v);
        this.f73829y.mo55846a(105, 0, "camera2 did change flash mode ".concat(String.valueOf(i)));
        if (!d.f73839a) {
            C30969o.m63689d(f73710a, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -418. Reason: " + d.f73840b);
            this.f73829y.mo55846a(-418, -418, "switch flash failed." + d.f73840b);
            AbstractC30825g.AbstractC30826a aVar2 = this.f73829y;
            if (i == 0) {
                i2 = 0;
            }
            aVar2.mo55853d(i2, "switch flash failed." + d.f73840b);
            return;
        }
        AbstractC30825g.AbstractC30826a aVar3 = this.f73829y;
        if (i == 0) {
            i2 = 0;
        }
        aVar3.mo55852c(i2, "torch success");
    }

    public C30781b(C30806e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, handler);
        this.f73828x = cameraManager;
        if (this.f73790A.f74190n) {
            this.f73791B = new C30805h(this);
        } else {
            this.f73791B = new C30802g(this);
        }
    }
}
