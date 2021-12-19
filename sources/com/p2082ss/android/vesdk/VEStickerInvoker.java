package com.p2082ss.android.vesdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ttve.monitor.C30696i;
import com.p2082ss.android.ttve.nativePort.NativeCallbacks;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import com.p2082ss.android.vesdk.jni.TEStikcerInterface;
import com.p2082ss.android.vesdk.model.BefTextLayout;
import com.p2082ss.android.vesdk.model.BefTextLayoutResult;
import com.p2082ss.android.vesdk.p4390f.AbstractC85469f;
import com.p2082ss.android.vesdk.p4391g.C85509a;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.VEStickerInvoker */
public class VEStickerInvoker implements AbstractC85469f {
    private final TEInterface mNativeEditor;
    private final TEStikcerInterface mNativeStickerHandler;
    private int mStickerAnimationPreviewDuration = 3000;
    private float mStickerAnimationPreviewFps = 30.0f;
    private final C85581w mVEEditor;

    static {
        Covode.recordClassIndex(99366);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public void clearNativeFromSticker() {
        this.mNativeStickerHandler.f191565a = 0;
    }

    public int get2DBrushStrokeCount() {
        return this.mNativeStickerHandler.mo131377a();
    }

    public boolean is2DBrushEmpty() {
        if (this.mNativeStickerHandler.mo131377a() == 0) {
            return true;
        }
        return false;
    }

    public int begin2DBrush() {
        MethodCollector.m26663i(14252);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(14252);
            return -112;
        }
        int nativeBegin2DBrush = tEStikcerInterface.nativeBegin2DBrush(tEStikcerInterface.f191565a);
        MethodCollector.m26664o(14252);
        return nativeBegin2DBrush;
    }

    public int getTextLimitCount() {
        MethodCollector.m26663i(10197);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(10197);
            return -112;
        }
        int nativeGetTextLimitCount = tEStikcerInterface.nativeGetTextLimitCount(tEStikcerInterface.f191565a);
        MethodCollector.m26664o(10197);
        return nativeGetTextLimitCount;
    }

    public int undo2DBrush() {
        MethodCollector.m26663i(14275);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(14275);
            return -112;
        }
        int nativeUndo2DBrush = tEStikcerInterface.nativeUndo2DBrush(tEStikcerInterface.f191565a);
        MethodCollector.m26664o(14275);
        return nativeUndo2DBrush;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int addInfoStickerWithBuffer() {
        int i;
        MethodCollector.m26663i(12822);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoStickerWithBuffer...");
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i = -112;
                } else {
                    i = tEStikcerInterface.nativeAddInfoStickerWithBuffer(tEStikcerInterface.f191565a);
                }
            } finally {
                MethodCollector.m26664o(12822);
            }
        }
        return i;
    }

    public int stopStickerAnimationPreview() {
        int a;
        MethodCollector.m26663i(14380);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "stopStickerAnimationPreview");
                a = this.mNativeStickerHandler.mo131379a(false, 0, 0);
            } finally {
                MethodCollector.m26664o(14380);
            }
        }
        return a;
    }

    public VEStickerInvoker(C85581w wVar) {
        this.mVEEditor = wVar;
        TEInterface tEInterface = wVar.f191765B;
        this.mNativeEditor = tEInterface;
        this.mNativeStickerHandler = new TEStikcerInterface(tEInterface.getNativeHandler());
    }

    public int end2DBrush(String str) {
        MethodCollector.m26663i(14253);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(14253);
            return -112;
        }
        int nativeEnd2DBrush = tEStikcerInterface.nativeEnd2DBrush(tEStikcerInterface.f191565a, str);
        MethodCollector.m26664o(14253);
        return nativeEnd2DBrush;
    }

    public int notifyHideKeyBoard(boolean z) {
        MethodCollector.m26663i(10195);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(10195);
            return -112;
        }
        int nativeNotifyHideKeyBoard = tEStikcerInterface.nativeNotifyHideKeyBoard(tEStikcerInterface.f191565a, z);
        MethodCollector.m26664o(10195);
        return nativeNotifyHideKeyBoard;
    }

    public int set2DBrushCanvasAlpha(float f) {
        MethodCollector.m26663i(14267);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(14267);
            return -112;
        }
        int nativeSet2DBrushCanvasColor = tEStikcerInterface.nativeSet2DBrushCanvasColor(tEStikcerInterface.f191565a, f);
        MethodCollector.m26664o(14267);
        return nativeSet2DBrushCanvasColor;
    }

    public int set2DBrushSize(float f) {
        MethodCollector.m26663i(14254);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(14254);
            return -112;
        }
        int nativeSet2DBrushSize = tEStikcerInterface.nativeSet2DBrushSize(tEStikcerInterface.f191565a, f);
        MethodCollector.m26664o(14254);
        return nativeSet2DBrushSize;
    }

    public int setLanguage(String str) {
        MethodCollector.m26663i(10196);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(10196);
            return -112;
        }
        int nativeSetLanguage = tEStikcerInterface.nativeSetLanguage(tEStikcerInterface.f191565a, str);
        MethodCollector.m26664o(10196);
        return nativeSetLanguage;
    }

    public int addEmojiSticker(String str) {
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addEmojiSticker... utf8Code: ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            return addInfoSticker(str, new String[]{"lv_emoji"});
        }
        C85315al.m146642d("VEEditor_VEStickerInvoker", "addEmojiSticker error, utf8Code is null");
        return -100;
    }

    public int addTextSticker(String str) {
        int addInfoSticker;
        MethodCollector.m26663i(13911);
        if (TextUtils.isEmpty(str)) {
            C85315al.m146642d("VEEditor_VEStickerInvoker", "addTextSticker error, json is null");
            MethodCollector.m26664o(13911);
            return -100;
        }
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "addTextSticker...");
                addInfoSticker = addInfoSticker(str, new String[]{"lv_new_text"});
            } finally {
                MethodCollector.m26664o(13911);
            }
        }
        return addInfoSticker;
    }

    public int deleteSticker(int i) {
        MethodCollector.m26663i(14383);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "deleteSticker...");
        if (i < 0) {
            MethodCollector.m26664o(14383);
            return -100;
        }
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(14383);
            return -112;
        }
        int nativeDeleteSubTrack = tEStikcerInterface.nativeDeleteSubTrack(tEStikcerInterface.f191565a, i);
        MethodCollector.m26664o(14383);
        return nativeDeleteSubTrack;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public float[] getInfoStickerBoundingBox(int i) {
        float[] a;
        MethodCollector.m26663i(13956);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "getInfoStickerBoundingBox... index: ".concat(String.valueOf(i)));
                if (i >= 0) {
                    a = this.mNativeStickerHandler.mo131381a(i, true);
                } else {
                    C85615x xVar = new C85615x(-100, "");
                    MethodCollector.m26664o(13956);
                    throw xVar;
                }
            } finally {
                MethodCollector.m26664o(13956);
            }
        }
        return a;
    }

    public float[] getInfoStickerBoundingBoxWithoutRotate(int i) {
        float[] a;
        MethodCollector.m26663i(14041);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "getInfoStickerBoundingBox... index:".concat(String.valueOf(i)));
                if (i >= 0) {
                    a = this.mNativeStickerHandler.mo131381a(i, false);
                } else {
                    C85615x xVar = new C85615x(-100, "");
                    MethodCollector.m26664o(14041);
                    throw xVar;
                }
            } finally {
                MethodCollector.m26664o(14041);
            }
        }
        return a;
    }

    public int getTextContent(C85581w.AbstractC85605d dVar) {
        MethodCollector.m26663i(10352);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(10352);
            return -112;
        }
        tEStikcerInterface.nativeGetTextContentCallback(tEStikcerInterface.f191565a, new NativeCallbacks.OnARTextContentCallback(dVar) {
            /* class com.p2082ss.android.vesdk.jni.TEStikcerInterface.C855171 */

            /* renamed from: a */
            final /* synthetic */ C85581w.AbstractC85605d f191567a;

            static {
                Covode.recordClassIndex(99677);
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.OnARTextContentCallback
            public final void onResult(String[] strArr) {
            }

            {
                this.f191567a = r2;
            }
        });
        MethodCollector.m26664o(10352);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public boolean isInfoStickerAnimatable(int i) {
        boolean z;
        MethodCollector.m26663i(13354);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "isInfoStickerAnimatable...");
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                z = false;
                if (tEStikcerInterface.f191565a != 0) {
                    if (tEStikcerInterface.f191566b >= 0) {
                        z = tEStikcerInterface.nativeIsInfoStickerAnimatable(tEStikcerInterface.f191565a, i);
                    }
                }
            } finally {
                MethodCollector.m26664o(13354);
            }
        }
        return z;
    }

    public int pauseEffectAudio(boolean z) {
        int nativePauseEffectAudio;
        MethodCollector.m26663i(14245);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "pauseEffectAudio");
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            nativePauseEffectAudio = -112;
        } else {
            nativePauseEffectAudio = tEStikcerInterface.nativePauseEffectAudio(tEStikcerInterface.f191565a, z);
            if (nativePauseEffectAudio == 0) {
                MethodCollector.m26664o(14245);
                return nativePauseEffectAudio;
            }
        }
        C85315al.m146642d("VEEditor_VEStickerInvoker", "pauseEffectAudio failed, ret = ".concat(String.valueOf(nativePauseEffectAudio)));
        MethodCollector.m26664o(14245);
        return nativePauseEffectAudio;
    }

    public int pauseInfoStickerAnimation(boolean z) {
        int i;
        MethodCollector.m26663i(13555);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "pauseInfoStickerAnimation...");
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i = -105;
                } else {
                    i = tEStikcerInterface.nativePauseInfoStickerAnimation(tEStikcerInterface.f191565a, z);
                }
            } finally {
                MethodCollector.m26664o(13555);
            }
        }
        return i;
    }

    public int set2DBrushColor(int i) {
        MethodCollector.m26663i(14266);
        float f = ((float) ((i >>> 24) & 255)) * 0.003921569f;
        float f2 = ((float) ((i >>> 16) & 255)) * 0.003921569f;
        float f3 = ((float) ((i >>> 8) & 255)) * 0.003921569f;
        float f4 = ((float) (i & 255)) * 0.003921569f;
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(14266);
            return -112;
        }
        int nativeSet2DBrushColor = tEStikcerInterface.nativeSet2DBrushColor(tEStikcerInterface.f191565a, f2, f3, f4, f);
        MethodCollector.m26664o(14266);
        return nativeSet2DBrushColor;
    }

    public int setEffectBgmEnable(boolean z) {
        int nativeSetEffectBgmEnable;
        MethodCollector.m26663i(14251);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            nativeSetEffectBgmEnable = -112;
        } else {
            nativeSetEffectBgmEnable = tEStikcerInterface.nativeSetEffectBgmEnable(tEStikcerInterface.f191565a, z);
            if (nativeSetEffectBgmEnable == 0) {
                MethodCollector.m26664o(14251);
                return nativeSetEffectBgmEnable;
            }
        }
        C85315al.m146642d("VEEditor_VEStickerInvoker", "setEffectBgmEnable failed, ret = ".concat(String.valueOf(nativeSetEffectBgmEnable)));
        MethodCollector.m26664o(14251);
        return nativeSetEffectBgmEnable;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setInfoStickerBufferCallback(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        MethodCollector.m26663i(13236);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "setInfoStickerBufferCallback...");
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(13236);
            return -112;
        }
        int nativeSetInfoStickerBufferCallback = tEStikcerInterface.nativeSetInfoStickerBufferCallback(tEStikcerInterface.f191565a, vEInfoStickerBufferListener);
        MethodCollector.m26664o(13236);
        return nativeSetInfoStickerBufferCallback;
    }

    public int setInfoStickerCallSync(boolean z) {
        int i;
        MethodCollector.m26663i(14386);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "setInfoStickerCallSync... ".concat(String.valueOf(z)));
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i = -112;
                } else {
                    i = tEStikcerInterface.nativeSetInfoStickerCallSync(tEStikcerInterface.f191565a, z);
                }
            } finally {
                MethodCollector.m26664o(14386);
            }
        }
        return i;
    }

    public int setTextBitmapCallback(C85581w.AbstractC85604c cVar) {
        MethodCollector.m26663i(10493);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            MethodCollector.m26664o(10493);
            return -112;
        }
        tEStikcerInterface.nativeSetTextBitmapCallback(tEStikcerInterface.f191565a, new NativeCallbacks.OnARTextBitmapCallback(cVar) {
            /* class com.p2082ss.android.vesdk.jni.TEStikcerInterface.C855182 */

            /* renamed from: a */
            final /* synthetic */ C85581w.AbstractC85604c f191569a;

            static {
                Covode.recordClassIndex(99678);
            }

            {
                this.f191569a = r2;
            }

            @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.OnARTextBitmapCallback
            public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                C85581w.AbstractC85604c cVar = this.f191569a;
                if (cVar != null) {
                    return cVar.mo131754a();
                }
                return null;
            }
        });
        MethodCollector.m26664o(10493);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int beginInfoStickerPin(int i) {
        int i2;
        MethodCollector.m26663i(11247);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin beginInfoStickerPin... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(11247);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i2 = -105;
                } else {
                    int nativeBeginInfoStickerPin = tEStikcerInterface.nativeBeginInfoStickerPin(tEStikcerInterface.f191565a, i);
                    if (nativeBeginInfoStickerPin != 0) {
                        i2 = -1;
                    } else {
                        MethodCollector.m26664o(11247);
                        return nativeBeginInfoStickerPin;
                    }
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin beginInfoStickerPin... faild ret:".concat(String.valueOf(i2)));
                return i2;
            } finally {
                MethodCollector.m26664o(11247);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int cancelInfoStickerPin(int i) {
        int i2;
        MethodCollector.m26663i(11404);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin cancelInfoStickerPin... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(11404);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i2 = -105;
                } else {
                    int nativeCancelInfoStickerPin = tEStikcerInterface.nativeCancelInfoStickerPin(tEStikcerInterface.f191565a, i);
                    if (nativeCancelInfoStickerPin != 0) {
                        i2 = -1;
                    } else {
                        MethodCollector.m26664o(11404);
                        return nativeCancelInfoStickerPin;
                    }
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin cancelInfoStickerPin... faild ret:".concat(String.valueOf(i2)));
                return i2;
            } finally {
                MethodCollector.m26664o(11404);
            }
        }
    }

    public int getInfoStickerPinState(int i) {
        int i2;
        MethodCollector.m26663i(14149);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinState... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(14149);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i2 = -105;
                } else {
                    i2 = tEStikcerInterface.nativeGetInfoStickerPinState(tEStikcerInterface.f191565a, i);
                    if (i2 >= 0) {
                        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinState... state:".concat(String.valueOf(i2)));
                        MethodCollector.m26664o(14149);
                        return i2;
                    }
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinState... faild ret:".concat(String.valueOf(i2)));
                return i2;
            } finally {
                MethodCollector.m26664o(14149);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public float getInfoStickerRotate(int i) {
        float f;
        MethodCollector.m26663i(14374);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerRotate... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(14374);
                return -100.0f;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    f = -112.0f;
                } else if (tEStikcerInterface.f191566b < 0) {
                    f = -105.0f;
                } else {
                    f = tEStikcerInterface.nativeGetInfoStickerRotate(tEStikcerInterface.f191565a, i);
                }
                C85315al.m146637a("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerRotate... ret:".concat(String.valueOf(f)));
                return f;
            } finally {
                MethodCollector.m26664o(14374);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public float getInfoStickerScale(int i) {
        float f;
        MethodCollector.m26663i(14373);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerScale... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(14373);
                return -100.0f;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    f = -112.0f;
                } else if (tEStikcerInterface.f191566b < 0) {
                    f = -105.0f;
                } else {
                    f = tEStikcerInterface.nativeGetInfoStickerScale(tEStikcerInterface.f191565a, i);
                    if (f < 0.0f) {
                        f = -1.0f;
                    } else if (f >= 0.0f) {
                        MethodCollector.m26664o(14373);
                        return f;
                    }
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerScale... faild ret:".concat(String.valueOf(f)));
                return f;
            } finally {
                MethodCollector.m26664o(14373);
            }
        }
    }

    public String getInfoStickerTemplateParams(int i) {
        String nativeGetInfoStickerTemplateParam;
        MethodCollector.m26663i(10038);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "getInfoStickerTemplateParams... index: ".concat(String.valueOf(i)));
                if (i >= 0) {
                    TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                    if (tEStikcerInterface.f191565a == 0) {
                        nativeGetInfoStickerTemplateParam = "";
                    } else if (tEStikcerInterface.f191566b < 0) {
                        nativeGetInfoStickerTemplateParam = "";
                    } else {
                        nativeGetInfoStickerTemplateParam = tEStikcerInterface.nativeGetInfoStickerTemplateParam(tEStikcerInterface.f191565a, i);
                    }
                } else {
                    C85615x xVar = new C85615x(-100, "");
                    MethodCollector.m26664o(10038);
                    throw xVar;
                }
            } finally {
                MethodCollector.m26664o(10038);
            }
        }
        return nativeGetInfoStickerTemplateParam;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public boolean getInfoStickerVisible(int i) {
        MethodCollector.m26663i(14372);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerVisible... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            boolean z = true;
            if (i < 0) {
                MethodCollector.m26664o(14372);
                return true;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a != 0) {
                    if (tEStikcerInterface.f191566b >= 0) {
                        z = tEStikcerInterface.nativeGetInfoStickerVisible(tEStikcerInterface.f191565a, i);
                    }
                }
                C85315al.m146637a("VEEditor_VEStickerInvoker", "infoStickerPin  getInfoStickerVisible... ret:".concat(String.valueOf(z)));
                return z;
            } finally {
                MethodCollector.m26664o(14372);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int removeInfoSticker(int i) {
        int i2;
        MethodCollector.m26663i(13870);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "removeInfoSticker... index: ".concat(String.valueOf(i)));
                if (i < 0) {
                    return -100;
                }
                this.mVEEditor.f191816ac.mo55068a(1, i);
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i2 = -105;
                } else {
                    i2 = tEStikcerInterface.nativeRemoveInfoSticker(tEStikcerInterface.f191565a, i);
                }
                MethodCollector.m26664o(13870);
                return i2;
            } finally {
                MethodCollector.m26664o(13870);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setInfoStickerRestoreMode(int i) {
        int i2;
        MethodCollector.m26663i(14376);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "infoStickerPin setInfoStickerRestoreMode... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(14376);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i2 = -105;
                } else {
                    int nativeSetInfoStickerRestoreMode = tEStikcerInterface.nativeSetInfoStickerRestoreMode(tEStikcerInterface.f191565a, i);
                    if (nativeSetInfoStickerRestoreMode != 0) {
                        i2 = -1;
                    } else {
                        MethodCollector.m26664o(14376);
                        return nativeSetInfoStickerRestoreMode;
                    }
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin setInfoStickerRestoreMode... faild ret:".concat(String.valueOf(i2)));
                return i2;
            } finally {
                MethodCollector.m26664o(14376);
            }
        }
    }

    public int stopInfoStickerPin(int i) {
        int i2;
        MethodCollector.m26663i(12572);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin stopInfoStickerPin... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(12572);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i2 = -105;
                } else {
                    int nativeStopInfoStickerPin = tEStikcerInterface.nativeStopInfoStickerPin(tEStikcerInterface.f191565a, i);
                    if (nativeStopInfoStickerPin != 0) {
                        i2 = -1;
                    } else {
                        MethodCollector.m26664o(12572);
                        return nativeStopInfoStickerPin;
                    }
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin stopInfoStickerPin... faild ret:".concat(String.valueOf(i2)));
                return i2;
            } finally {
                MethodCollector.m26664o(12572);
            }
        }
    }

    public String getInfoStickerTemplateParams(String str) {
        String nativeGetInfoStickerTemplateParamWithPath;
        MethodCollector.m26663i(10040);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "[getInfoStickerTemplateParams] path: ".concat(String.valueOf(str)));
                if (str.trim().length() != 0) {
                    TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                    if (tEStikcerInterface.f191565a == 0) {
                        C85315al.m146642d("TEMVInterface", "[getInfoStickerTemplateParam] mNative wrong value");
                        nativeGetInfoStickerTemplateParamWithPath = "";
                    } else if (tEStikcerInterface.f191566b < 0) {
                        C85315al.m146642d("TEMVInterface", "[getInfoStickerTemplateParam] no host tack");
                        nativeGetInfoStickerTemplateParamWithPath = "";
                    } else {
                        nativeGetInfoStickerTemplateParamWithPath = tEStikcerInterface.nativeGetInfoStickerTemplateParamWithPath(tEStikcerInterface.f191565a, str);
                    }
                } else {
                    C85615x xVar = new C85615x(-100, "empty or blank path");
                    MethodCollector.m26664o(10040);
                    throw xVar;
                }
            } finally {
                MethodCollector.m26664o(10040);
            }
        }
        return nativeGetInfoStickerTemplateParamWithPath;
    }

    public int enableStickerResourceLoadSync(int i, boolean z) {
        return this.mNativeEditor.setFilterParam(i, "effect sync load resource", String.valueOf(z));
    }

    public int addInfoStickerOrEmoji(String str, String str2) {
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoStickerOrEmoji... path: " + str + ", utf8Code: " + str2);
        if (TextUtils.isEmpty(str)) {
            return addEmojiSticker(str2);
        }
        return addInfoSticker(str, new String[]{"default"});
    }

    public int forceUpdateInfoSticker(int i, boolean z) {
        String str;
        MethodCollector.m26663i(9878);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "forceUpdateInfoSticker... index: ".concat(String.valueOf(i)));
                if (i < 0) {
                    return -100;
                }
                TEInterface tEInterface = this.mNativeEditor;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                int filterParam = tEInterface.setFilterParam(i, "entity data force update", str);
                MethodCollector.m26664o(9878);
                return filterParam;
            } finally {
                MethodCollector.m26664o(9878);
            }
        }
    }

    public int setInfoStickerTemplateParams(int i, String str) {
        MethodCollector.m26663i(10034);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "setInfoStickerTemplateParams... index: ".concat(String.valueOf(i)));
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity template param", str);
                MethodCollector.m26664o(10034);
                return filterParam;
            } finally {
                MethodCollector.m26664o(10034);
            }
        }
    }

    public int setSrtFont(int i, String str) {
        MethodCollector.m26663i(14187);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setSrtFont");
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity srt font", str);
                MethodCollector.m26664o(14187);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14187);
            }
        }
    }

    public int setSrtManipulateState(int i, boolean z) {
        MethodCollector.m26663i(14234);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setSrtManipulateState");
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity srt manipulate state", String.valueOf(z));
                MethodCollector.m26664o(14234);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14234);
            }
        }
    }

    public int setStickerAnimator(int i, VEStickerAnimator vEStickerAnimator) {
        int nativeGetSubTrackFilter;
        MethodCollector.m26663i(14333);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "addAnimator...");
        if (i < 0 || vEStickerAnimator == null) {
            MethodCollector.m26664o(14333);
            return -100;
        }
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f191565a == 0) {
            nativeGetSubTrackFilter = -112;
        } else {
            nativeGetSubTrackFilter = tEStikcerInterface.nativeGetSubTrackFilter(tEStikcerInterface.f191565a, i);
            if (nativeGetSubTrackFilter >= 0) {
                int filterParam = this.mNativeEditor.setFilterParam(nativeGetSubTrackFilter, "animator", vEStickerAnimator);
                MethodCollector.m26664o(14333);
                return filterParam;
            }
        }
        MethodCollector.m26664o(14333);
        return nativeGetSubTrackFilter;
    }

    public int startStickerAnimationPreview(int i, int i2) {
        int a;
        MethodCollector.m26663i(14379);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "startStickerAnimationPreview duration:" + i + ", mode:" + i2);
                this.mStickerAnimationPreviewDuration = i;
                a = this.mNativeStickerHandler.mo131379a(true, i, i2);
            } finally {
                MethodCollector.m26664o(14379);
            }
        }
        return a;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int addInfoSticker(String str, String[] strArr) {
        int a;
        int i;
        MethodCollector.m26663i(13828);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13828);
            return -100;
        }
        C30689e.m63052a("iesve_veeditor_import_sticker", 1, (C85509a) null);
        synchronized (this.mVEEditor) {
            try {
                a = this.mNativeStickerHandler.mo131378a(str, strArr);
            } finally {
                MethodCollector.m26664o(13828);
            }
        }
        C30696i.C30697a aVar = new C30696i.C30697a();
        aVar.f73425a = str;
        this.mVEEditor.f191816ac.mo55069a(1, a, aVar);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoSticker success with index ".concat(String.valueOf(a)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (a >= 0) {
                i = 0;
            } else {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            C30683b.m63032a("vesdk_event_editor_info_sticker", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return a;
    }

    public int addTextStickerWithInitInfo(String str, String str2) {
        int addInfoStickerWithInitInfo;
        MethodCollector.m26663i(9876);
        if (TextUtils.isEmpty(str)) {
            C85315al.m146642d("VEEditor_VEStickerInvoker", "addTextSticker error, json is null");
            MethodCollector.m26664o(9876);
            return -100;
        } else if (TextUtils.isEmpty(str2)) {
            C85315al.m146642d("VEEditor_VEStickerInvoker", "addTextSticker error, initInfoJson is null");
            MethodCollector.m26664o(9876);
            return -100;
        } else {
            synchronized (this.mVEEditor) {
                try {
                    C85315al.m146637a("VEEditor_VEStickerInvoker", "addTextSticker...");
                    addInfoStickerWithInitInfo = addInfoStickerWithInitInfo(str, new String[]{"lv_new_text"}, str2);
                } finally {
                    MethodCollector.m26664o(9876);
                }
            }
            return addInfoStickerWithInitInfo;
        }
    }

    public int enableStickerAnimationPreview(int i, boolean z) {
        int i2;
        MethodCollector.m26663i(14378);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "enableStickerAnimationPreview index:" + i + ", enable:" + z);
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else {
                    i2 = tEStikcerInterface.nativeSetInfoStickerAnimationPreview(tEStikcerInterface.f191565a, i, z);
                }
            } finally {
                MethodCollector.m26664o(14378);
            }
        }
        return i2;
    }

    public int getInfoStickerFlip(int i, boolean[] zArr) {
        MethodCollector.m26663i(14368);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "getInfoStickerFlip...");
                int i2 = -100;
                if (i < 0 || zArr.length != 2) {
                    return -100;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b >= 0 && (i2 = tEStikcerInterface.nativeGetInfoStickerFlip(tEStikcerInterface.f191565a, i, zArr)) != 0) {
                    i2 = -1;
                }
                MethodCollector.m26664o(14368);
                return i2;
            } finally {
                MethodCollector.m26664o(14368);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int getInfoStickerPinData(int i, ByteBuffer[] byteBufferArr) {
        int i2;
        MethodCollector.m26663i(14147);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinData... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(14147);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i2 = -105;
                } else {
                    i2 = tEStikcerInterface.nativeGetInfoStickerPinData(tEStikcerInterface.f191565a, i, byteBufferArr);
                    if (i2 >= 0) {
                        MethodCollector.m26664o(14147);
                        return i2;
                    }
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinData... faild ");
                return i2;
            } finally {
                MethodCollector.m26664o(14147);
            }
        }
    }

    public int getInfoStickerPosition(int i, float[] fArr) {
        MethodCollector.m26663i(14371);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "getInfoStickerPosition...");
                int i2 = -100;
                if (i < 0 || fArr.length != 2) {
                    return -100;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b >= 0 && (i2 = tEStikcerInterface.nativeGetInfoStickerPosition(tEStikcerInterface.f191565a, i, fArr)) != 0) {
                    i2 = -1;
                }
                MethodCollector.m26664o(14371);
                return i2;
            } finally {
                MethodCollector.m26664o(14371);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int getSrtInfoStickerInitPosition(int i, float[] fArr) {
        MethodCollector.m26663i(14243);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "getSrtInfoStickerInitPosition...");
                int i2 = -100;
                if (i < 0 || fArr.length != 2) {
                    return -100;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b >= 0 && (i2 = tEStikcerInterface.nativeGetSrtInfoStickerInitPosition(tEStikcerInterface.f191565a, i, fArr)) != 0) {
                    i2 = -1;
                }
                MethodCollector.m26664o(14243);
                return i2;
            } finally {
                MethodCollector.m26664o(14243);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int restoreInfoStickerPinWithData(int i, ByteBuffer byteBuffer) {
        int i2;
        MethodCollector.m26663i(12675);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin setInfoStickerPinWithFile... index:".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(12675);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b < 0) {
                    i2 = -105;
                } else {
                    int nativeRestoreInfoStickerPinWithJson = tEStikcerInterface.nativeRestoreInfoStickerPinWithJson(tEStikcerInterface.f191565a, i, byteBuffer, byteBuffer.capacity());
                    if (nativeRestoreInfoStickerPinWithJson != 0) {
                        i2 = -1;
                    } else {
                        MethodCollector.m26664o(12675);
                        return nativeRestoreInfoStickerPinWithJson;
                    }
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin setInfoStickerPinWithFile... faild ret:".concat(String.valueOf(i2)));
                return i2;
            } finally {
                MethodCollector.m26664o(12675);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setInfoStickerAlpha(int i, float f) {
        MethodCollector.m26663i(14355);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setInfoStickerAlpha... index: " + i + "alpha: " + f);
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity alpha", String.valueOf(f));
                MethodCollector.m26664o(14355);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14355);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setInfoStickerLayer(int i, int i2) {
        MethodCollector.m26663i(14358);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setInfoStickerLayer... index: " + i + "layer: " + i2);
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity layer", String.valueOf(i2));
                MethodCollector.m26664o(14358);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14358);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setInfoStickerRotation(int i, float f) {
        MethodCollector.m26663i(14343);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setInfoStickerRotation... index: " + i + "degree: " + f);
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity rotation", String.valueOf(f));
                MethodCollector.m26664o(14343);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14343);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setInfoStickerScale(int i, float f) {
        MethodCollector.m26663i(14349);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setInfoStickerScale... index: " + i + "scale: " + f);
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity scale x", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity scale y", String.valueOf(f));
                MethodCollector.m26664o(14349);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14349);
            }
        }
    }

    public float setInfoStickerScaleSync(int i, float f) {
        float f2;
        MethodCollector.m26663i(14352);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setInfoStickerScaleSync... index: " + i + "scale: " + f);
                if (i < 0) {
                    return -100.0f;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    f2 = -112.0f;
                } else {
                    f2 = tEStikcerInterface.nativeSetInfoStickerScale(tEStikcerInterface.f191565a, i, f);
                }
                MethodCollector.m26664o(14352);
                return f2;
            } finally {
                MethodCollector.m26664o(14352);
            }
        }
    }

    public int setInfoStickerVisible(int i, boolean z) {
        MethodCollector.m26663i(14384);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "setInfoStickerVisible... index: " + i + " visible: " + z);
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity visible", String.valueOf(z));
                MethodCollector.m26664o(14384);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14384);
            }
        }
    }

    public int setStickerPinArea(int i, VEStickerPinAreaParam vEStickerPinAreaParam) {
        int i2;
        MethodCollector.m26663i(10804);
        C85315al.m146641c("VEEditor_VEStickerInvoker", "infoStickerPin, setStickerPinArea, index: ".concat(String.valueOf(i)));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                MethodCollector.m26664o(10804);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else {
                    i2 = tEStikcerInterface.nativeSetStickerPinArea(tEStikcerInterface.f191565a, i, vEStickerPinAreaParam);
                    if (i2 != 0) {
                        i2 = -1;
                    }
                    return i2;
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "infoStickerPin, setStickerPinArea, fail, ret: ".concat(String.valueOf(i2)));
                return i2;
            } finally {
                MethodCollector.m26664o(10804);
            }
        }
    }

    public int updateTextSticker(int i, String str) {
        MethodCollector.m26663i(13216);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "updateTextSticker... index: ".concat(String.valueOf(i)));
                int i2 = -100;
                if (i < 0) {
                    return -100;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f191566b >= 0 && (i2 = tEStikcerInterface.nativeUpdateTextSticker(tEStikcerInterface.f191565a, i, str)) != 0) {
                    i2 = -1;
                }
                MethodCollector.m26664o(13216);
                return i2;
            } finally {
                MethodCollector.m26664o(13216);
            }
        }
    }

    public int addInfoStickerTemplate(String str, String str2) {
        int a;
        MethodCollector.m26663i(10036);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoStickerTemplate ... path : " + str + " params: " + str2);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(10036);
            return -100;
        }
        C30689e.m63052a("iesve_veeditor_import_sticker", 1, (C85509a) null);
        int i = 0;
        String[] strArr = {"lv_info_sticker_template", str2};
        synchronized (this.mVEEditor) {
            try {
                a = this.mNativeStickerHandler.mo131378a(str, strArr);
            } finally {
                MethodCollector.m26664o(10036);
            }
        }
        C30696i.C30697a aVar = new C30696i.C30697a();
        aVar.f73425a = str;
        this.mVEEditor.f191816ac.mo55069a(1, a, aVar);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoStickerTemplate success with index ".concat(String.valueOf(a)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (a < 0) {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            C30683b.m63032a("vesdk_event_editor_info_sticker", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return a;
    }

    public int setSrtColor(int i, int i2) {
        MethodCollector.m26663i(14207);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setSrtColor");
                if (i < 0) {
                    return -100;
                }
                C85315al.m146642d("VEEditor_VEStickerInvoker", "");
                int i3 = (i2 >>> 24) & 255;
                int i4 = (i2 >>> 16) & 255;
                int i5 = (i2 >>> 8) & 255;
                int i6 = i2 & 255;
                C85315al.m146642d("VEEditor_VEStickerInvoker", "aa=" + i3 + ", rr=" + i4 + ", gg=" + i5 + ", bb=" + i6);
                float f = ((float) i3) * 0.003921569f;
                float f2 = ((float) i4) * 0.003921569f;
                float f3 = ((float) i5) * 0.003921569f;
                float f4 = ((float) i6) * 0.003921569f;
                C85315al.m146642d("VEEditor_VEStickerInvoker", "a=" + f + ", r=" + f2 + ", g=" + f3 + ", b=" + f4);
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity srt color a", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity srt color r", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i, "entity srt color g", String.valueOf(f3)) + this.mNativeEditor.setFilterParam(i, "entity srt color b", String.valueOf(f4));
                MethodCollector.m26664o(14207);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14207);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r4 != 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setEffectFontPath(int r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            r7 = 14381(0x382d, float:2.0152E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r7)
            com.ss.android.vesdk.w r3 = r8.mVEEditor
            monitor-enter(r3)
            com.ss.android.vesdk.jni.TEStikcerInterface r6 = r8.mNativeStickerHandler     // Catch:{ all -> 0x0043 }
            long r0 = r6.f191565a     // Catch:{ all -> 0x0043 }
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0015
            r4 = -112(0xffffffffffffff90, float:NaN)
            goto L_0x001d
        L_0x0015:
            long r0 = r6.f191565a     // Catch:{ all -> 0x0043 }
            int r4 = r6.nativeSetEffectFontPath(r0, r10, r11)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x002c
        L_0x001d:
            java.lang.String r2 = "VEEditor_VEStickerInvoker"
            java.lang.String r1 = "setEffectFontPath failed, ret = "
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0043 }
            com.p2082ss.android.vesdk.C85315al.m146642d(r2, r0)     // Catch:{ all -> 0x0043 }
        L_0x002c:
            com.ss.android.ttve.nativePort.TEInterface r1 = r8.mNativeEditor     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "effect font path"
            r1.setFilterParam(r9, r0, r10)     // Catch:{ all -> 0x0043 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r8.mNativeEditor     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "effect face index"
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0043 }
            r2.setFilterParam(r9, r1, r0)     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
            return r4
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEStickerInvoker.setEffectFontPath(int, java.lang.String, int):int");
    }

    public int setInfoStickerFlip(int i, boolean z, boolean z2) {
        String str;
        String str2;
        MethodCollector.m26663i(14360);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "setInfoStickerFlip... index: " + i + "flipX: " + z + "flipY: " + z2);
                if (i < 0) {
                    C85315al.m146642d("VEEditor_VEStickerInvoker", "setInfoStickerFlip... failed index is wrong : ".concat(String.valueOf(i)));
                    return -100;
                }
                TEInterface tEInterface = this.mNativeEditor;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                int filterParam = tEInterface.setFilterParam(i, "entity flip x", str);
                TEInterface tEInterface2 = this.mNativeEditor;
                if (z2) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                int filterParam2 = filterParam + tEInterface2.setFilterParam(i, "entity flip y", str2);
                MethodCollector.m26664o(14360);
                return filterParam2;
            } finally {
                MethodCollector.m26664o(14360);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setInfoStickerPosition(int i, float f, float f2) {
        MethodCollector.m26663i(14337);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "setInfoStickerPosition... index: " + i + "offsetX: " + f + "offsetY: " + f2);
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity position x", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity position y", String.valueOf(f2));
                MethodCollector.m26664o(14337);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14337);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setInfoStickerTime(int i, int i2, int i3) {
        MethodCollector.m26663i(14346);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "setInfoStickerTime... index: " + i + "startTime: " + i2 + "endTime: " + i3);
                if (i < 0) {
                    return -100;
                }
                C30696i.C30697a aVar = this.mVEEditor.f191816ac.f73423b.get(Integer.valueOf(i));
                if (aVar != null) {
                    aVar.f73426b = i2;
                    aVar.f73427c = i3 - i2;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity start time", String.valueOf(i2)) + this.mNativeEditor.setFilterParam(i, "entity end time", String.valueOf(i3));
                MethodCollector.m26664o(14346);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14346);
            }
        }
    }

    public int setSrtInfo(int i, int i2, String str) {
        MethodCollector.m26663i(14169);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setSrtInfo");
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity audio start time", String.valueOf(i2)) + this.mNativeEditor.setFilterParam(i, "entity srt info", str) + this.mNativeEditor.setFilterParam(i, "entity srt", "true");
                MethodCollector.m26664o(14169);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14169);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int setSrtInitialPosition(int i, float f, float f2) {
        MethodCollector.m26663i(14236);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setSrtInitialPosition");
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity srt initial position x", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity srt initial position y", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i, "entity srt first", "true");
                MethodCollector.m26664o(14236);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14236);
            }
        }
    }

    public int addInfoStickerWithInitInfo(String str, String[] strArr, String str2) {
        int length;
        int a;
        MethodCollector.m26663i(14390);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoStickerWithInitInfo ...");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(14390);
            return -100;
        }
        C30689e.m63052a("iesve_veeditor_import_sticker", 1, (C85509a) null);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        if (strArr == null) {
            length = 0;
        } else {
            length = strArr.length;
        }
        int max = Math.max(5, length);
        for (int i2 = 0; i2 < max; i2++) {
            if (i2 < length) {
                linkedList.add(strArr[i2]);
            } else {
                linkedList.add("");
            }
        }
        linkedList.add(4, str2);
        String[] strArr2 = (String[]) linkedList.toArray(new String[0]);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoStickerWithInitInfo ... params: " + linkedList.toString());
        synchronized (this.mVEEditor) {
            try {
                a = this.mNativeStickerHandler.mo131378a(str, strArr2);
            } finally {
                MethodCollector.m26664o(14390);
            }
        }
        C30696i.C30697a aVar = new C30696i.C30697a();
        aVar.f73425a = str;
        this.mVEEditor.f191816ac.mo55069a(1, a, aVar);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addInfoStickerWithInitInfo success with index ".concat(String.valueOf(a)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (a < 0) {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            C30683b.m63032a("vesdk_event_editor_info_sticker", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int addImageSticker(String str, float f, float f2, float f3, float f4) {
        int a;
        MethodCollector.m26663i(12999);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addImageSticker...");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(12999);
            return -100;
        }
        C30689e.m63052a("iesve_veeditor_import_sticker", 1, (C85509a) null);
        String[] strArr = {String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), "0"};
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("width", (double) f3);
            jSONObject.put("height", (double) f4);
            C30683b.m63032a("vesdk_event_editor_image_sticker", jSONObject, "behavior");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        synchronized (this.mVEEditor) {
            try {
                a = this.mNativeStickerHandler.mo131378a(str, strArr);
            } finally {
                MethodCollector.m26664o(12999);
            }
        }
        return a;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85469f
    public int addImageStickerWithRatio(String str, float f, float f2, float f3, float f4) {
        int a;
        MethodCollector.m26663i(13159);
        C85315al.m146637a("VEEditor_VEStickerInvoker", "addImageStickerWithRatio...");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13159);
            return -100;
        }
        C30689e.m63052a("iesve_veeditor_import_sticker", 1, (C85509a) null);
        String[] strArr = {String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), "1"};
        synchronized (this.mVEEditor) {
            try {
                a = this.mNativeStickerHandler.mo131378a(str, strArr);
            } finally {
                MethodCollector.m26664o(13159);
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r4 != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setEffectInputText(int r15, java.lang.String r16, int r17, int r18, java.lang.String r19) {
        /*
            r14 = this;
            r6 = 14382(0x382e, float:2.0153E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            com.ss.android.vesdk.w r3 = r14.mVEEditor
            monitor-enter(r3)
            com.ss.android.vesdk.jni.TEStikcerInterface r7 = r14.mNativeStickerHandler     // Catch:{ all -> 0x005d }
            long r1 = r7.f191565a     // Catch:{ all -> 0x005d }
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            if (r0 != 0) goto L_0x001d
            r4 = -112(0xffffffffffffff90, float:NaN)
            goto L_0x0025
        L_0x001d:
            long r8 = r7.f191565a     // Catch:{ all -> 0x005d }
            int r4 = r7.nativeSetEffectInputText(r8, r10, r11, r12, r13)     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x0034
        L_0x0025:
            java.lang.String r2 = "VEEditor_VEStickerInvoker"
            java.lang.String r1 = "setEffectInputText failed, ret = "
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x005d }
            com.p2082ss.android.vesdk.C85315al.m146642d(r2, r0)     // Catch:{ all -> 0x005d }
        L_0x0034:
            com.ss.android.ttve.nativePort.TEInterface r1 = r14.mNativeEditor     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "effect inputtext"
            r1.setFilterParam(r15, r0, r10)     // Catch:{ all -> 0x005d }
            com.ss.android.ttve.nativePort.TEInterface r2 = r14.mNativeEditor     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "effect inputtext arg1"
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x005d }
            r2.setFilterParam(r15, r1, r0)     // Catch:{ all -> 0x005d }
            com.ss.android.ttve.nativePort.TEInterface r2 = r14.mNativeEditor     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "effect inputtext arg2"
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x005d }
            r2.setFilterParam(r15, r1, r0)     // Catch:{ all -> 0x005d }
            com.ss.android.ttve.nativePort.TEInterface r1 = r14.mNativeEditor     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "effect inputtext arg3"
            r1.setFilterParam(r15, r0, r13)     // Catch:{ all -> 0x005d }
            monitor-exit(r3)     // Catch:{ all -> 0x005d }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r4
        L_0x005d:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEStickerInvoker.setEffectInputText(int, java.lang.String, int, int, java.lang.String):int");
    }

    public int setSrtAudioInfo(int i, int i2, int i3, int i4, int i5, boolean z) {
        MethodCollector.m26663i(14228);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146639b("VEEditor_VEStickerInvoker", "setSrtAudioInfo");
                if (i < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i, "entity srt audio index", String.valueOf(i2)) + this.mNativeEditor.setFilterParam(i, "entity srt audio seqIn", String.valueOf(i3)) + this.mNativeEditor.setFilterParam(i, "entity srt audio trimIn", String.valueOf(i4)) + this.mNativeEditor.setFilterParam(i, "entity srt audio trimOut", String.valueOf(i5)) + this.mNativeEditor.setFilterParam(i, "entity srt audio cycle", String.valueOf(z));
                MethodCollector.m26664o(14228);
                return filterParam;
            } finally {
                MethodCollector.m26664o(14228);
            }
        }
    }

    public int setStickerAnimation(int i, boolean z, String str, int i2, String str2, int i3) {
        int i4;
        MethodCollector.m26663i(14377);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEStickerInvoker", "setStickerAnimation... index:" + i + ", loop:" + z + ", inPath:" + str + ", inDuration:" + i2 + ", outPath:" + str2 + ", outDuration:" + i3);
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f191565a == 0) {
                    i4 = -112;
                } else {
                    i4 = tEStikcerInterface.nativeSetInfoStickerAnimationParam(tEStikcerInterface.f191565a, i, z, str, i2, str2, i3, 0);
                }
            } finally {
                MethodCollector.m26664o(14377);
            }
        }
        return i4;
    }

    public int addSticker(String str, int i, int i2, float f, float f2, float f3, float f4) {
        return addSticker(str, i, i2, 0, i2 - i, f, f2, f3, f4);
    }

    public int addExtRes(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        C85315al.m146641c("VEEditor_VEStickerInvoker", "addSticker...");
        if (i > i2 || i < 0 || TextUtils.isEmpty(str)) {
            return -100;
        }
        C30689e.m63052a("iesve_veeditor_import_sticker", 1, (C85509a) null);
        return this.mNativeStickerHandler.mo131380a(new String[]{str}, new int[]{i}, new int[]{i2}, new int[]{i3}, new int[]{i4}, (double) f3, (double) f4, (double) f, (double) f2);
    }

    public int addSticker(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        C85315al.m146641c("VEEditor_VEStickerInvoker", "addSticker...");
        if (i > i2 || i < 0 || TextUtils.isEmpty(str)) {
            return -100;
        }
        C30689e.m63052a("iesve_veeditor_import_sticker", 1, (C85509a) null);
        return this.mNativeStickerHandler.mo131380a(new String[]{str}, new int[]{i}, new int[]{i2}, new int[]{i3}, new int[]{i4}, (double) f3, (double) f4, (double) f, (double) f2);
    }
}
