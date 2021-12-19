package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.common.AbstractC30641b;
import com.p2082ss.android.ttve.nativePort.NativeCallbacks;

/* renamed from: com.ss.android.ttve.nativePort.TENativeServiceBase */
public class TENativeServiceBase {
    protected NativeCallbacks.AbstractC30701a mAudioExtendToFileCallback;
    protected NativeCallbacks.AbstractC30703c mEncoderDataCallback;
    protected NativeCallbacks.AbstractC30702b mExtractFrameProcessCallback;
    protected NativeCallbacks.AbstractC30704d mGetImageCallback;
    protected NativeCallbacks.AbstractC30705e mKeyFrameCallback;
    protected NativeCallbacks.AbstractC30706f mMVInitedCallback;
    protected NativeCallbacks.AbstractC30707g mMattingCallback;
    protected AbstractC30641b mOnErrorListener;
    protected AbstractC30641b mOnInfoListener;
    protected NativeCallbacks.AbstractC30708h mOpenGLCallback;
    protected NativeCallbacks.AbstractC30704d mSeekFrameCallback;

    static {
        Covode.recordClassIndex(37304);
    }

    public void nativeCallback_onAudioExtendToFileCancel() {
    }

    public void nativeCallback_onAudioExtendToFileFinish(boolean z) {
    }

    public void nativeCallback_onAudioExtendToFileProcess(float f) {
    }

    public void nativeCallback_onOpenGLDrawBefore(int i, double d) {
    }

    public void nativeCallback_onPreviewSurface(int i) {
    }

    public NativeCallbacks.AbstractC30703c getEncoderDataListener() {
        return this.mEncoderDataCallback;
    }

    public AbstractC30641b getErrorListener() {
        return this.mOnErrorListener;
    }

    public AbstractC30641b getInfoListener() {
        return this.mOnInfoListener;
    }

    public NativeCallbacks.AbstractC30708h getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public void nativeCallback_onMVInited() {
        NativeCallbacks.AbstractC30706f fVar = this.mMVInitedCallback;
        if (fVar != null) {
            fVar.mo55091a();
        }
    }

    public void nativeCallback_onMattingStartedCallback() {
        NativeCallbacks.AbstractC30707g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.mo55093b();
        }
    }

    public void setAudioExtendToFileCallback(NativeCallbacks.AbstractC30701a aVar) {
        this.mAudioExtendToFileCallback = aVar;
    }

    public void setEncoderDataListener(NativeCallbacks.AbstractC30703c cVar) {
        this.mEncoderDataCallback = cVar;
    }

    public void setErrorListener(AbstractC30641b bVar) {
        this.mOnErrorListener = bVar;
    }

    public void setExtractFrameProcessCallback(NativeCallbacks.AbstractC30702b bVar) {
        this.mExtractFrameProcessCallback = bVar;
    }

    public void setGetImageCallback(NativeCallbacks.AbstractC30704d dVar) {
        this.mGetImageCallback = dVar;
    }

    public void setGetSeekFrameCallback(NativeCallbacks.AbstractC30704d dVar) {
        this.mGetImageCallback = dVar;
    }

    public void setInfoListener(AbstractC30641b bVar) {
        this.mOnInfoListener = bVar;
    }

    public void setKeyFrameCallback(NativeCallbacks.AbstractC30705e eVar) {
        this.mKeyFrameCallback = eVar;
    }

    public void setMattingCallback(NativeCallbacks.AbstractC30707g gVar) {
        this.mMattingCallback = gVar;
    }

    public void setOpenGLListeners(NativeCallbacks.AbstractC30708h hVar) {
        this.mOpenGLCallback = hVar;
    }

    public void setSeekFrameCallback(NativeCallbacks.AbstractC30704d dVar) {
        this.mSeekFrameCallback = dVar;
    }

    public void setmMVInitedCallback(NativeCallbacks.AbstractC30706f fVar) {
        this.mMVInitedCallback = fVar;
    }

    public void nativeCallback_onExtractFrameProcess(float f) {
        NativeCallbacks.AbstractC30702b bVar = this.mExtractFrameProcessCallback;
        if (bVar != null) {
            bVar.mo55086a(f);
        }
    }

    public void nativeCallback_onMattingDoneCallback(float f) {
        NativeCallbacks.AbstractC30707g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.mo55094c();
        }
    }

    public void nativeCallback_onOpenGLCreate(int i) {
        NativeCallbacks.AbstractC30708h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.mo55096a(i);
        }
    }

    public void nativeCallback_onOpenGLDestroy(int i) {
        NativeCallbacks.AbstractC30708h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.mo55098b(i);
        }
    }

    public void nativeCallback_onOpenGLDrawAfter(int i, double d) {
        NativeCallbacks.AbstractC30708h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.mo55097a(i, d);
        }
    }

    public void nativeCallback_onDisplayCallback(int i, int i2, int i3) {
        NativeCallbacks.AbstractC30705e eVar = this.mKeyFrameCallback;
        if (eVar != null) {
            eVar.mo55089a(i, i2, i3);
        }
    }

    public void nativeCallback_onMattingErrorCallback(int i, int i2, float f) {
        NativeCallbacks.AbstractC30707g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.mo55092a();
        }
    }

    public void nativeCallback_onProcessCallback(int i, int i2, String str) {
        NativeCallbacks.AbstractC30705e eVar = this.mKeyFrameCallback;
        if (eVar != null) {
            eVar.mo55090a(i, i2, str);
        }
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f) {
        AbstractC30641b bVar = this.mOnInfoListener;
        if (bVar != null) {
            bVar.mo54931a(i, i2, f, null);
        }
    }

    public void nativeCallback_onCompressBuffer(byte[] bArr, int i, int i2, boolean z) {
        NativeCallbacks.AbstractC30703c cVar = this.mEncoderDataCallback;
        if (cVar != null) {
            cVar.mo55087a(bArr, i, i2, z);
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f, String str) {
        AbstractC30641b bVar = this.mOnErrorListener;
        if (bVar != null) {
            bVar.mo54931a(i, i2, f, str);
        }
    }

    public void nativeCallback_onMattingProgressCallback(int i, float f, float f2, boolean z) {
        NativeCallbacks.AbstractC30707g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.mo55095d();
        }
    }

    public int nativeCallback_onImageData(byte[] bArr, int i, int i2, int i3, float f) {
        NativeCallbacks.AbstractC30704d dVar = this.mGetImageCallback;
        if (dVar != null) {
            return dVar.mo55088a(bArr, i2, i3);
        }
        return 0;
    }

    public int nativeCallback_onSeekFrameData(byte[] bArr, int i, int i2, int i3, float f) {
        NativeCallbacks.AbstractC30704d dVar = this.mSeekFrameCallback;
        if (dVar != null) {
            return dVar.mo55088a(bArr, i2, i3);
        }
        return 0;
    }
}
