package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.model.BefTextLayout;
import com.p2082ss.android.vesdk.model.BefTextLayoutResult;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks */
public class NativeCallbacks {

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$IAudioCaptureCallback */
    public interface IAudioCaptureCallback {
        static {
            Covode.recordClassIndex(37273);
        }

        void onReceive(ByteBuffer byteBuffer);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$ICameraFrameCallback */
    public interface ICameraFrameCallback {
        static {
            Covode.recordClassIndex(37274);
        }

        void onResult(ByteBuffer byteBuffer, int i, int i2, long j);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$IFrameEffectCallback */
    public interface IFrameEffectCallback {
        static {
            Covode.recordClassIndex(37275);
        }

        void onResult(long j);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$IGetFrameCallback */
    public interface IGetFrameCallback {
        static {
            Covode.recordClassIndex(37276);
        }

        void onResult(int[] iArr, int i, int i2, long j);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$ILensCallback */
    public interface ILensCallback {
        static {
            Covode.recordClassIndex(37277);
        }

        void onError(int i, int i2, String str);

        void onInfo(int i, int i2, int i3, String str);

        void onSuccess(int i, float f, int i2);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$OnARTextBitmapCallback */
    public interface OnARTextBitmapCallback {
        static {
            Covode.recordClassIndex(37278);
        }

        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$OnARTextContentCallback */
    public interface OnARTextContentCallback {
        static {
            Covode.recordClassIndex(37279);
        }

        void onResult(String[] strArr);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$a */
    public interface AbstractC30701a {
        static {
            Covode.recordClassIndex(37280);
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$b */
    public interface AbstractC30702b {
        static {
            Covode.recordClassIndex(37281);
        }

        /* renamed from: a */
        void mo55086a(float f);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$c */
    public interface AbstractC30703c {
        static {
            Covode.recordClassIndex(37282);
        }

        /* renamed from: a */
        int mo55087a(byte[] bArr, int i, int i2, boolean z);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$d */
    public interface AbstractC30704d {
        static {
            Covode.recordClassIndex(37283);
        }

        /* renamed from: a */
        int mo55088a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$e */
    public interface AbstractC30705e {
        static {
            Covode.recordClassIndex(37284);
        }

        /* renamed from: a */
        void mo55089a(int i, int i2, int i3);

        /* renamed from: a */
        void mo55090a(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$f */
    public interface AbstractC30706f {
        static {
            Covode.recordClassIndex(37285);
        }

        /* renamed from: a */
        void mo55091a();
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$g */
    public interface AbstractC30707g {
        static {
            Covode.recordClassIndex(37286);
        }

        /* renamed from: a */
        int mo55092a();

        /* renamed from: b */
        int mo55093b();

        /* renamed from: c */
        int mo55094c();

        /* renamed from: d */
        int mo55095d();
    }

    /* renamed from: com.ss.android.ttve.nativePort.NativeCallbacks$h */
    public interface AbstractC30708h {
        static {
            Covode.recordClassIndex(37287);
        }

        /* renamed from: a */
        int mo55096a(int i);

        /* renamed from: a */
        int mo55097a(int i, double d);

        /* renamed from: b */
        int mo55098b(int i);
    }

    static {
        Covode.recordClassIndex(37272);
    }
}
