package com.p2082ss.android.ttve.nativePort;

import android.os.Handler;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.model.EnumC30678f;
import com.p2082ss.android.vesdk.C85310ah;
import com.p2082ss.android.vesdk.C85521l;
import com.p2082ss.android.vesdk.audio.AbstractC85332b;
import com.p2082ss.android.vesdk.audio.AbstractC85334d;
import com.p2082ss.android.vesdk.audio.C85341i;

/* renamed from: com.ss.android.ttve.nativePort.TEAudioCaptureInterface */
public class TEAudioCaptureInterface implements AbstractC85332b {
    private AbstractC85334d mCallback;
    private long mHandle;

    private native long nativeCreate(boolean z, boolean z2);

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, int i, int i2, int i3, int i4);

    private native int nativeStart(long j);

    private native int nativeStop(long j);

    public void setAudioDevice(C85341i iVar) {
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85332b
    public void setHandler(Handler handler) {
    }

    public void release() {
        release(null);
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    static {
        Covode.recordClassIndex(37288);
        C30731d.m63118c();
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85332b
    public void setAudioCallback(AbstractC85334d dVar) {
        this.mCallback = dVar;
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public int stop(PrivacyCert privacyCert) {
        MethodCollector.m26663i(9176);
        int nativeStop = nativeStop(this.mHandle);
        MethodCollector.m26664o(9176);
        return nativeStop;
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public void release(PrivacyCert privacyCert) {
        MethodCollector.m26663i(9026);
        nativeDestroy(this.mHandle);
        this.mHandle = 0;
        MethodCollector.m26664o(9026);
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public int start(PrivacyCert privacyCert) {
        MethodCollector.m26663i(8875);
        int nativeStart = nativeStart(this.mHandle);
        AbstractC85334d dVar = this.mCallback;
        if (dVar != null) {
            dVar.mo130665a(C85310ah.f190926N, nativeStart, 0.0d, "");
        }
        MethodCollector.m26664o(8875);
        return nativeStart;
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public int init(C85521l lVar) {
        boolean z;
        MethodCollector.m26663i(9478);
        if (TESystemUtils.getOutputAudioDeviceType() == EnumC30678f.WIRED.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        long nativeCreate = nativeCreate(lVar.f191582h, z);
        this.mHandle = nativeCreate;
        int nativeInit = nativeInit(nativeCreate, lVar.f191576b, lVar.f191575a, lVar.f191577c, lVar.f191580f);
        AbstractC85334d dVar = this.mCallback;
        if (dVar != null) {
            dVar.mo130665a(C85310ah.f190925M, nativeInit, 0.0d, lVar);
        }
        MethodCollector.m26664o(9478);
        return nativeInit;
    }

    public void onNativeExtCallback(int i, int i2) {
        AbstractC85334d dVar = this.mCallback;
        if (dVar == null) {
            return;
        }
        if (i == C85310ah.f190931S) {
            dVar.mo130666a(C85310ah.f190931S, i2, "");
        } else {
            dVar.mo130665a(i, i2, 0.0d, "");
        }
    }
}
