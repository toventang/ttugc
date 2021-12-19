package com.p2082ss.android.vesdk.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.NativeCallbacks;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85615x;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.vesdk.jni.TEStikcerInterface */
public class TEStikcerInterface {

    /* renamed from: a */
    public long f191565a;

    /* renamed from: b */
    public int f191566b;

    static {
        Covode.recordClassIndex(99676);
    }

    private native int nativeAddInfoSticker(long j, String str, String[] strArr);

    private native int nativeAddSubTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeControlInfoStickerAnimationPreview(long j, boolean z, int i, int i2);

    private native int nativeGet2DBrushStrokeCount(long j);

    private native float[] nativeGetInfoStickerBoundingBox(long j, int i);

    private native float[] nativeGetInfoStickerBoundingBoxWithoutRotate(long j, int i);

    private native int nativeRemoveInfoStickerWithBuffer(long j, int i);

    private native int nativeSetInfoStickerFlip(long j, int i, boolean z, boolean z2);

    public native int nativeAddInfoStickerWithBuffer(long j);

    public native int nativeBegin2DBrush(long j);

    public native int nativeBeginInfoStickerPin(long j, int i);

    public native int nativeCancelInfoStickerPin(long j, int i);

    public native int nativeDeleteSubTrack(long j, int i);

    public native int nativeEnd2DBrush(long j, String str);

    public native int nativeGetInfoStickerFlip(long j, int i, boolean[] zArr);

    public native int nativeGetInfoStickerPinData(long j, int i, ByteBuffer[] byteBufferArr);

    public native int nativeGetInfoStickerPinState(long j, int i);

    public native int nativeGetInfoStickerPosition(long j, int i, float[] fArr);

    public native float nativeGetInfoStickerRotate(long j, int i);

    public native float nativeGetInfoStickerScale(long j, int i);

    public native String nativeGetInfoStickerTemplateParam(long j, int i);

    public native String nativeGetInfoStickerTemplateParamWithPath(long j, String str);

    public native boolean nativeGetInfoStickerVisible(long j, int i);

    public native int nativeGetSrtInfoStickerInitPosition(long j, int i, float[] fArr);

    public native int nativeGetSubTrackFilter(long j, int i);

    public native int nativeGetTextContentCallback(long j, NativeCallbacks.OnARTextContentCallback onARTextContentCallback);

    public native int nativeGetTextLimitCount(long j);

    public native boolean nativeIsInfoStickerAnimatable(long j, int i);

    public native int nativeNotifyHideKeyBoard(long j, boolean z);

    public native int nativePauseEffectAudio(long j, boolean z);

    public native int nativePauseInfoStickerAnimation(long j, boolean z);

    public native int nativeRemoveInfoSticker(long j, int i);

    public native int nativeRestoreInfoStickerPinWithJson(long j, int i, ByteBuffer byteBuffer, int i2);

    public native int nativeSet2DBrushCanvasColor(long j, float f);

    public native int nativeSet2DBrushColor(long j, float f, float f2, float f3, float f4);

    public native int nativeSet2DBrushSize(long j, float f);

    public native int nativeSetEffectBgmEnable(long j, boolean z);

    public native int nativeSetEffectFontPath(long j, String str, int i);

    public native int nativeSetEffectInputText(long j, String str, int i, int i2, String str2);

    public native int nativeSetInfoStickerAnimationParam(long j, int i, boolean z, String str, int i2, String str2, int i3, int i4);

    public native int nativeSetInfoStickerAnimationPreview(long j, int i, boolean z);

    public native int nativeSetInfoStickerBufferCallback(long j, VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    public native int nativeSetInfoStickerCallSync(long j, boolean z);

    public native int nativeSetInfoStickerRestoreMode(long j, int i);

    public native float nativeSetInfoStickerScale(long j, int i, float f);

    public native int nativeSetLanguage(long j, String str);

    public native int nativeSetStickerPinArea(long j, int i, VEStickerPinAreaParam vEStickerPinAreaParam);

    public native int nativeSetTextBitmapCallback(long j, NativeCallbacks.OnARTextBitmapCallback onARTextBitmapCallback);

    public native int nativeStopInfoStickerPin(long j, int i);

    public native int nativeUndo2DBrush(long j);

    public native int nativeUpdateTextSticker(long j, int i, String str);

    /* renamed from: a */
    public final int mo131377a() {
        MethodCollector.m26663i(12030);
        long j = this.f191565a;
        if (j == 0) {
            MethodCollector.m26664o(12030);
            return -112;
        }
        int nativeGet2DBrushStrokeCount = nativeGet2DBrushStrokeCount(j);
        MethodCollector.m26664o(12030);
        return nativeGet2DBrushStrokeCount;
    }

    public TEStikcerInterface(long j) {
        this.f191565a = j;
        C85315al.m146637a("TEMVInterface", "enable public pin adaptor:true");
    }

    /* renamed from: a */
    public final int mo131378a(String str, String[] strArr) {
        MethodCollector.m26663i(11557);
        long j = this.f191565a;
        if (j == 0) {
            MethodCollector.m26664o(11557);
            return -112;
        } else if (this.f191566b < 0) {
            MethodCollector.m26664o(11557);
            return -105;
        } else {
            int nativeAddInfoSticker = nativeAddInfoSticker(j, str, strArr);
            MethodCollector.m26664o(11557);
            return nativeAddInfoSticker;
        }
    }

    /* renamed from: a */
    public final float[] mo131381a(int i, boolean z) {
        float[] nativeGetInfoStickerBoundingBoxWithoutRotate;
        MethodCollector.m26663i(11559);
        long j = this.f191565a;
        if (j == 0) {
            C85615x xVar = new C85615x(-112, "");
            MethodCollector.m26664o(11559);
            throw xVar;
        } else if (this.f191566b >= 0) {
            if (z) {
                nativeGetInfoStickerBoundingBoxWithoutRotate = nativeGetInfoStickerBoundingBox(j, i);
            } else {
                nativeGetInfoStickerBoundingBoxWithoutRotate = nativeGetInfoStickerBoundingBoxWithoutRotate(j, i);
            }
            if (nativeGetInfoStickerBoundingBoxWithoutRotate[0] == 0.0f) {
                float[] fArr = new float[4];
                System.arraycopy(nativeGetInfoStickerBoundingBoxWithoutRotate, 1, fArr, 0, 4);
                MethodCollector.m26664o(11559);
                return fArr;
            }
            C85615x xVar2 = new C85615x(-1, "native getInfoStickerBoundingBox failed: " + nativeGetInfoStickerBoundingBoxWithoutRotate[0] + " index: " + i);
            MethodCollector.m26664o(11559);
            throw xVar2;
        } else {
            C85615x xVar3 = new C85615x(-100, "");
            MethodCollector.m26664o(11559);
            throw xVar3;
        }
    }

    /* renamed from: a */
    public final int mo131379a(boolean z, int i, int i2) {
        MethodCollector.m26663i(11721);
        long j = this.f191565a;
        if (j == 0) {
            MethodCollector.m26664o(11721);
            return -112;
        }
        int nativeControlInfoStickerAnimationPreview = nativeControlInfoStickerAnimationPreview(j, z, i, i2);
        MethodCollector.m26664o(11721);
        return nativeControlInfoStickerAnimationPreview;
    }

    /* renamed from: a */
    public final int mo131380a(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4) {
        MethodCollector.m26663i(11893);
        long j = this.f191565a;
        if (j == 0) {
            MethodCollector.m26664o(11893);
            return -112;
        }
        int i = this.f191566b;
        if (i < 0) {
            MethodCollector.m26664o(11893);
            return -105;
        }
        int nativeAddSubTrack = nativeAddSubTrack(j, strArr, null, iArr, iArr2, iArr3, iArr4, d, d2, d3, d4, 0, i);
        MethodCollector.m26664o(11893);
        return nativeAddSubTrack;
    }
}
