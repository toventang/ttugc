package com.p2082ss.android.medialib.NativePort;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.AbstractC29982b;
import com.p2082ss.android.medialib.C29974a;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.NativePort.HWAvcNativeBridge */
public class HWAvcNativeBridge implements AbstractC29982b {
    private C29974a mAVCEncoder;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(36399);
    }

    /* renamed from: com_ss_android_medialib_NativePort_HWAvcNativeBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m60492x680d263a(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public int getProfile() {
        return 0;
    }

    public native int nativeSetCodecConfig(long j, ByteBuffer byteBuffer, int i);

    public native int nativeSetColorFormat(long j, int i);

    public native int nativeSetHardEncoderStatus(long j, boolean z);

    public native void nativeSwapGlBuffer(long j);

    public native int nativeWriteFile(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public void onEncoderData(ByteBuffer byteBuffer, int i, boolean z) {
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public void onEncoderData(byte[] bArr, int i, boolean z) {
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public Surface onInitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        return null;
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public void onWriteFile(ByteBuffer byteBuffer, long j, long j2, int i, boolean z) {
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public void onSwapGlBuffers() {
        MethodCollector.m26663i(91);
        nativeSwapGlBuffer(this.mNativePtr);
        MethodCollector.m26664o(91);
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public void onUninitHardEncoder() {
        C29974a aVar = this.mAVCEncoder;
        if (aVar != null) {
            aVar.mo52780c();
            this.mAVCEncoder = null;
        }
    }

    public HWAvcNativeBridge(long j) {
        this.mNativePtr = j;
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public void setColorFormat(int i) {
        MethodCollector.m26663i(45);
        nativeSetColorFormat(this.mNativePtr, i);
        MethodCollector.m26664o(45);
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public void onSetCodecConfig(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(79);
        nativeSetCodecConfig(this.mNativePtr, byteBuffer, byteBuffer.remaining());
        MethodCollector.m26664o(79);
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public int onEncoderData(int i, int i2, int i3, boolean z) {
        C29974a aVar = this.mAVCEncoder;
        if (aVar == null) {
            return 0;
        }
        aVar.mo52775a(i, i2, i3, z);
        return 0;
    }

    @Override // com.p2082ss.android.medialib.AbstractC29982b
    public void onWriteFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
        MethodCollector.m26663i(86);
        nativeWriteFile(this.mNativePtr, byteBuffer, byteBuffer.remaining(), i, i2, i3);
        MethodCollector.m26664o(86);
    }

    public Surface onInitHardEncoder(int i, int i2, int i3, int i4, boolean z) {
        MethodCollector.m26663i(54);
        if (this.mAVCEncoder == null) {
            C29974a aVar = new C29974a();
            this.mAVCEncoder = aVar;
            aVar.f71497h = i4;
        }
        C29974a.f71489a = this;
        Surface a = this.mAVCEncoder.mo52777a(i, i2, i3, 1, 1, i4, z);
        if (a == null) {
            this.mAVCEncoder = null;
            nativeSetHardEncoderStatus(this.mNativePtr, false);
            MethodCollector.m26664o(54);
            return null;
        }
        m60492x680d263a("HWAvcNativeBridge", "====== initAVCEncoder succeed ======");
        nativeSetHardEncoderStatus(this.mNativePtr, true);
        m60492x680d263a("HWAvcNativeBridge", "MarkManager onInitHardEncoder == exit");
        MethodCollector.m26664o(54);
        return a;
    }
}
