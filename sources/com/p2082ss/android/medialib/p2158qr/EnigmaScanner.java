package com.p2082ss.android.medialib.p2158qr;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.medialib.qr.EnigmaScanner */
public class EnigmaScanner implements MessageCenter.Listener {
    private AbstractC30052a listener;

    /* renamed from: com.ss.android.medialib.qr.EnigmaScanner$a */
    public interface AbstractC30052a {
        static {
            Covode.recordClassIndex(36539);
        }
    }

    static {
        Covode.recordClassIndex(36538);
    }

    private void setScanMode() {
    }

    public void enableCameraScan(boolean z) {
    }

    public void enableCameraScanWithRequirement(boolean z, long j) {
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i, int i2, int i3, String str) {
    }

    public void startScan(Context context, Object obj, SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
    }

    public void startScan(String str, ScanSettings scanSettings, long j) {
    }

    public void stop() {
    }

    public EnumC30053b getScanMode() {
        return EnumC30053b.CAMERA;
    }

    public void release() {
        MessageCenter.removeListener(this);
    }

    private synchronized void onResult() {
        MethodCollector.m26663i(1852);
        MethodCollector.m26664o(1852);
    }

    public synchronized void stopCameraScan() {
        MethodCollector.m26663i(1767);
        MethodCollector.m26664o(1767);
    }

    public synchronized void stopPicScan() {
        MethodCollector.m26663i(1665);
        MethodCollector.m26664o(1665);
    }

    /* renamed from: com.ss.android.medialib.qr.EnigmaScanner$b */
    public enum EnumC30053b {
        CAMERA,
        PICTURE;

        static {
            Covode.recordClassIndex(36540);
        }
    }

    public void setListener(AbstractC30052a aVar) {
        this.listener = aVar;
    }
}
