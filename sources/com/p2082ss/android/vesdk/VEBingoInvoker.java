package com.p2082ss.android.vesdk;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.C30004e;
import com.p2082ss.android.ttve.common.C30640a;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ttve.nativePort.C30720a;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p2082ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p2082ss.android.vesdk.jni.TEBingoInterface;
import com.p2082ss.android.vesdk.p4390f.AbstractC85465b;
import com.p2082ss.android.vesdk.runtime.C85553b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.VEBingoInvoker */
public class VEBingoInvoker implements AbstractC85465b {
    private int frameCountCur;
    public Map<Integer, Boolean> genFrameMap = new HashMap();
    public final TEBingoInterface mNativeBingoHandler;
    private final TEInterface mNativeEditor;
    private final C85581w mVEEditor;

    static {
        Covode.recordClassIndex(99251);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public void clearNativeFromBingo() {
        this.mNativeBingoHandler.clearNative();
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int initBingoAlgorithm() {
        C85315al.m146637a("VEEditor_VEBingoInvoker", "initBingoAlgorithm");
        int initBingoAlgorithm = this.mNativeBingoHandler.initBingoAlgorithm();
        if (initBingoAlgorithm != 0) {
            C85315al.m146642d("VEEditor_VEBingoInvoker", "initBingoAlgorithm failed, ret = ".concat(String.valueOf(initBingoAlgorithm)));
        }
        return initBingoAlgorithm;
    }

    /* renamed from: com.ss.android.vesdk.VEBingoInvoker$3 */
    static /* synthetic */ class C852003 {

        /* renamed from: a */
        static final /* synthetic */ int[] f190667a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 99256(0x183b8, float:1.39087E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.vesdk.ROTATE_DEGREE[] r0 = com.p2082ss.android.vesdk.ROTATE_DEGREE.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.vesdk.VEBingoInvoker.C852003.f190667a = r2
                com.ss.android.vesdk.ROTATE_DEGREE r0 = com.p2082ss.android.vesdk.ROTATE_DEGREE.ROTATE_NONE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.vesdk.VEBingoInvoker.C852003.f190667a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.vesdk.ROTATE_DEGREE r0 = com.p2082ss.android.vesdk.ROTATE_DEGREE.ROTATE_90     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.vesdk.VEBingoInvoker.C852003.f190667a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.vesdk.ROTATE_DEGREE r0 = com.p2082ss.android.vesdk.ROTATE_DEGREE.ROTATE_180     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.vesdk.VEBingoInvoker.C852003.f190667a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.vesdk.ROTATE_DEGREE r0 = com.p2082ss.android.vesdk.ROTATE_DEGREE.ROTATE_270     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEBingoInvoker.C852003.<clinit>():void");
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public List<VEClipAlgorithmParam> getAllVideoRangeData() {
        C85315al.m146641c("VEEditor_VEBingoInvoker", "getAllVideoRangeData");
        List<VEClipAlgorithmParam> allVideoRangeData = this.mNativeBingoHandler.getAllVideoRangeData();
        for (int i = 0; i < allVideoRangeData.size(); i++) {
            C85315al.m146641c("VEEditor_VEBingoInvoker", "rangData: " + allVideoRangeData.get(i).toString());
        }
        return allVideoRangeData;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int updateAlgorithmFromNormal() {
        int updateAlgorithmFromNormal;
        MethodCollector.m26663i(14229);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146641c("VEEditor_VEBingoInvoker", "updateAlgorithmFromNormal");
                updateAlgorithmFromNormal = this.mNativeBingoHandler.updateAlgorithmFromNormal();
                if (updateAlgorithmFromNormal != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "updateAlgorithmFromNormal failed, ret = ".concat(String.valueOf(updateAlgorithmFromNormal)));
                }
            } finally {
                MethodCollector.m26664o(14229);
            }
        }
        return updateAlgorithmFromNormal;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int genRandomSolve() {
        MethodCollector.m26663i(14211);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146641c("VEEditor_VEBingoInvoker", "genRandomSolve");
                this.mNativeEditor.stop();
                int randomSolve = this.mNativeBingoHandler.getRandomSolve();
                if (randomSolve != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "getRandomSolve failed, ret = ".concat(String.valueOf(randomSolve)));
                    return randomSolve;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.m26664o(14211);
                return prepareEngine;
            } finally {
                MethodCollector.m26664o(14211);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int genSmartCutting() {
        MethodCollector.m26663i(14222);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146641c("VEEditor_VEBingoInvoker", "genSmartCutting");
                this.mNativeEditor.stop();
                int genAISolve = this.mNativeBingoHandler.genAISolve();
                if (genAISolve != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "genSmartCutting failed, ret = ".concat(String.valueOf(genAISolve)));
                    return genAISolve;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.m26664o(14222);
                return prepareEngine;
            } finally {
                MethodCollector.m26664o(14222);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int removeAllVideoSound() {
        MethodCollector.m26663i(14185);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146641c("VEEditor_VEBingoInvoker", "removeAllVideoSound");
                this.mNativeEditor.stop();
                int removeAllVideoSound = this.mNativeBingoHandler.removeAllVideoSound();
                if (removeAllVideoSound != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "removeAllVideoSound failed, ret = ".concat(String.valueOf(removeAllVideoSound)));
                    return removeAllVideoSound;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.m26664o(14185);
                return prepareEngine;
            } finally {
                MethodCollector.m26664o(14185);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int restoreAllVideoSound() {
        MethodCollector.m26663i(14201);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146641c("VEEditor_VEBingoInvoker", "restoreAllVideoSound");
                this.mNativeEditor.stop();
                int restoreAllVideoSound = this.mNativeBingoHandler.restoreAllVideoSound();
                if (restoreAllVideoSound != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "restoreAllVideoSound failed, ret = ".concat(String.valueOf(restoreAllVideoSound)));
                    return restoreAllVideoSound;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.m26664o(14201);
                return prepareEngine;
            } finally {
                MethodCollector.m26664o(14201);
            }
        }
    }

    public VEBingoInvoker(C85581w wVar) {
        this.mVEEditor = wVar;
        TEInterface tEInterface = wVar.f191765B;
        this.mNativeEditor = tEInterface;
        this.mNativeBingoHandler = new TEBingoInterface(tEInterface);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int cancelGenVideoFrame(int i) {
        C85315al.m146641c("VEEditor_VEBingoInvoker", "cancelGenVideoFrame... index: ".concat(String.valueOf(i)));
        if (C85376ax.f191105f) {
            return this.mNativeBingoHandler.cancelExtractVideoFrames(i);
        }
        this.genFrameMap.put(Integer.valueOf(i), false);
        this.frameCountCur = 0;
        return 0;
    }

    public int checkScoresFile(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        C85315al.m146641c("VEEditor_VEBingoInvoker", "checkScoresFile filePath:".concat(String.valueOf(str)));
        int checkScoresFile = this.mNativeBingoHandler.checkScoresFile(str);
        if (checkScoresFile != 0) {
            C85315al.m146642d("VEEditor_VEBingoInvoker", "checkScoresFile failed, ret = ".concat(String.valueOf(checkScoresFile)));
        }
        return checkScoresFile;
    }

    public int setInterimScoresToFile(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        C85315al.m146641c("VEEditor_VEBingoInvoker", "setInterimScoresToFile filePath:".concat(String.valueOf(str)));
        int interimScoresToFile = this.mNativeBingoHandler.setInterimScoresToFile(str);
        if (interimScoresToFile != 0) {
            C85315al.m146642d("VEEditor_VEBingoInvoker", "setInterimScoresToFile failed, ret = ".concat(String.valueOf(interimScoresToFile)));
        }
        return interimScoresToFile;
    }

    public int setMusicCropRatio(int i) {
        C85315al.m146641c("VEEditor_VEBingoInvoker", "setMusicCropRatio crop:".concat(String.valueOf(i)));
        int musicCropRatio = this.mNativeBingoHandler.setMusicCropRatio(i);
        if (musicCropRatio != 0) {
            C85315al.m146642d("VEEditor_VEBingoInvoker", "setMusicCropRatio failed, ret = ".concat(String.valueOf(musicCropRatio)));
        }
        return musicCropRatio;
    }

    public int addVideoClipWithAlgorithm(String[] strArr) {
        MethodCollector.m26663i(13689);
        synchronized (this.mVEEditor) {
            try {
                if (strArr.length == 0) {
                    return -100;
                }
                for (int i = 0; i < strArr.length; i++) {
                    C85315al.m146641c("VEEditor_VEBingoInvoker", "addVidoeClipWithAlgorithm...  i: " + i + " path: " + strArr[i]);
                }
                this.mNativeEditor.stop();
                int addVidoeClipWithAlgorithm = this.mNativeBingoHandler.addVidoeClipWithAlgorithm(strArr);
                if (addVidoeClipWithAlgorithm != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "addVidoeClipWithAlgorithm failed, ret = ".concat(String.valueOf(addVidoeClipWithAlgorithm)));
                    MethodCollector.m26664o(13689);
                    return addVidoeClipWithAlgorithm;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.m26664o(13689);
                return prepareEngine;
            } finally {
                MethodCollector.m26664o(13689);
            }
        }
    }

    public int deleteVideoClipWithAlgorithm(int i) {
        MethodCollector.m26663i(13751);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146641c("VEEditor_VEBingoInvoker", "deleteVideoClipWithAlgorithm... ".concat(String.valueOf(i)));
                if (i < 0) {
                    return -100;
                }
                this.mNativeEditor.stop();
                int deleteVideoClipWithAlgorithm = this.mNativeBingoHandler.deleteVideoClipWithAlgorithm(i);
                if (deleteVideoClipWithAlgorithm != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "deleteVideoClipWithAlgorithm failed, ret = ".concat(String.valueOf(deleteVideoClipWithAlgorithm)));
                    MethodCollector.m26664o(13751);
                    return deleteVideoClipWithAlgorithm;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.m26664o(13751);
                return prepareEngine;
            } finally {
                MethodCollector.m26664o(13751);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int removeMusic(int i) {
        MethodCollector.m26663i(14168);
        synchronized (this.mVEEditor) {
            try {
                this.mNativeEditor.stop();
                C85315al.m146641c("VEEditor_VEBingoInvoker", "removeMusic index: ".concat(String.valueOf(i)));
                int removeMusic = this.mNativeBingoHandler.removeMusic(i);
                if (removeMusic != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "removeMusic failed, ret = ".concat(String.valueOf(removeMusic)));
                    return removeMusic;
                }
                this.mNativeEditor.prepareEngine(0);
                MethodCollector.m26664o(14168);
                return 0;
            } finally {
                MethodCollector.m26664o(14168);
            }
        }
    }

    public int moveVideoClipWithAlgorithm(int i, int i2) {
        MethodCollector.m26663i(13807);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146641c("VEEditor_VEBingoInvoker", "moveVideoClipWithAlgorithm... from: " + i + " to: " + i2);
                if (i != i2 && i >= 0) {
                    if (i2 >= 0) {
                        this.mNativeEditor.stop();
                        int moveVideoClipWithAlgorithm = this.mNativeBingoHandler.moveVideoClipWithAlgorithm(i, i2);
                        if (moveVideoClipWithAlgorithm != 0) {
                            C85315al.m146642d("VEEditor_VEBingoInvoker", "moveVideoClipWithAlgorithm failed, ret = ".concat(String.valueOf(moveVideoClipWithAlgorithm)));
                            MethodCollector.m26664o(13807);
                            return moveVideoClipWithAlgorithm;
                        }
                        int prepareEngine = this.mNativeEditor.prepareEngine(0);
                        MethodCollector.m26664o(13807);
                        return prepareEngine;
                    }
                }
                return -100;
            } finally {
                MethodCollector.m26664o(13807);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int setAIRotation(int i, ROTATE_DEGREE rotate_degree) {
        C85315al.m146641c("VEEditor_VEBingoInvoker", "setAIRotation index:" + i + " rotation: " + rotate_degree);
        int i2 = C852003.f190667a[rotate_degree.ordinal()];
        int i3 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 90;
            } else if (i2 == 3) {
                i3 = LiveFeedRefreshTimeSetting.DEFAULT;
            } else if (i2 == 4) {
                i3 = 270;
            }
        }
        int aIRotation = this.mNativeBingoHandler.setAIRotation(i, i3);
        if (aIRotation != 0) {
            C85315al.m146642d("VEEditor_VEBingoInvoker", "setAIRotation failed, ret = ".concat(String.valueOf(aIRotation)));
        }
        return aIRotation;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int initWithAlgorithm(String[] strArr, C85581w.EnumC85613l lVar) {
        MethodCollector.m26663i(13627);
        synchronized (this.mVEEditor) {
            try {
                TEMonitorInvoker.nativeReset(1);
                C30695h.m63060a(1);
                if (strArr.length == 0) {
                    return -100;
                }
                C85315al.m146641c("VEEditor_VEBingoInvoker", "initWithAlgorithm... ".concat(String.valueOf(lVar)));
                for (int i = 0; i < strArr.length; i++) {
                    C85315al.m146641c("VEEditor_VEBingoInvoker", "initWithAlgorithm...  i: " + i + " path: " + strArr[i]);
                }
                this.mVEEditor.f191772I = System.currentTimeMillis();
                this.mVEEditor.f191773J = System.currentTimeMillis();
                int initVideoEditorWithAlgorithm = this.mNativeBingoHandler.initVideoEditorWithAlgorithm(strArr, lVar.ordinal());
                if (initVideoEditorWithAlgorithm != 0) {
                    C85315al.m146642d("VEEditor_VEBingoInvoker", "initVideoEditorWithAlgorithm failed, ret = ".concat(String.valueOf(initVideoEditorWithAlgorithm)));
                    this.mVEEditor.f191783T = false;
                    MethodCollector.m26664o(13627);
                    return initVideoEditorWithAlgorithm;
                }
                this.mVEEditor.f191783T = true;
                C85553b bVar = this.mVEEditor.f191838e;
                bVar.f191686g = false;
                bVar.f191690k = 0;
                bVar.f191689j = 0;
                this.mVEEditor.f191780Q = lVar;
                this.mVEEditor.mo131574K();
                this.mVEEditor.f191764A = 0;
                int L = this.mVEEditor.mo131575L();
                MethodCollector.m26664o(13627);
                return L;
            } finally {
                MethodCollector.m26664o(13627);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int setMusicAndResult(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        MethodCollector.m26663i(13847);
        synchronized (this.mVEEditor) {
            try {
                this.mNativeEditor.stop();
                C85315al.m146641c("VEEditor_VEBingoInvoker", "setMusicAndResult... audioFilePath: " + str + " trimIn: " + i + " trimOut: " + i2 + " " + vEAlgorithmPath.toString());
                if ((vEAlgorithmPath.getVeBeatsPath() == null || C30004e.m60552a(vEAlgorithmPath.getVeBeatsPath())) && ((vEAlgorithmPath.getDownBeatsPath() == null || C30004e.m60552a(vEAlgorithmPath.getDownBeatsPath())) && ((vEAlgorithmPath.getNoStrengthBeatsPath() == null || C30004e.m60552a(vEAlgorithmPath.getNoStrengthBeatsPath())) && ((vEAlgorithmPath.getManMadePath() == null || C30004e.m60552a(vEAlgorithmPath.getManMadePath())) && (vEAlgorithmPath.getOnlineBeatsPath() == null || C30004e.m60552a(vEAlgorithmPath.getOnlineBeatsPath())))))) {
                    int musicAndResult = this.mNativeBingoHandler.setMusicAndResult(str, i, i2, vEAlgorithmPath.getVeBeatsPath(), vEAlgorithmPath.getDownBeatsPath(), vEAlgorithmPath.getNoStrengthBeatsPath(), vEAlgorithmPath.getOnlineBeatsPath(), vEAlgorithmPath.getManMadePath(), vEAlgorithmPath.getType(), vEAlgorithmPath.getMode());
                    if (musicAndResult < 0) {
                        C85315al.m146642d("VEEditor_VEBingoInvoker", "setMusicAndResult failed, ret = ".concat(String.valueOf(musicAndResult)));
                        MethodCollector.m26664o(13847);
                        return musicAndResult;
                    }
                    int prepareEngine = this.mNativeEditor.prepareEngine(0);
                    MethodCollector.m26664o(13847);
                    return prepareEngine;
                }
                C85315al.m146642d("VEEditor_VEBingoInvoker", "file is not exist !");
                return -100;
            } finally {
                MethodCollector.m26664o(13847);
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85465b
    public int beginGenVideoFrames(final int i, int i2, boolean z, final VEListener.AbstractC85240i iVar) {
        final int i3;
        final int i4;
        int i5;
        int i6;
        int i7;
        C85315al.m146641c("VEEditor_VEBingoInvoker", "beginGenVideoFrames...:" + i + ", second:" + i2 + ", hasHWDecode:" + z);
        int i8 = 1;
        if (C85376ax.f191105f) {
            if (!z) {
                i8 = 4;
            }
            if (Build.VERSION.SDK_INT < 23) {
                i7 = 2;
                i8 = 2;
            } else {
                i7 = 4;
            }
            return this.mNativeBingoHandler.extractVideoFrames(i, 1000000 * i2, 2, i7, i8, iVar);
        }
        this.genFrameMap.put(Integer.valueOf(i), true);
        final String clipPath = this.mNativeBingoHandler.getClipPath(i);
        if (clipPath.equals("")) {
            C85315al.m146642d("VEEditor_VEBingoInvoker", "getClipPath wrong index: ".concat(String.valueOf(i)));
            return -100;
        }
        final int[] iArr = new int[10];
        TEVideoUtils.getVideoFileInfo(clipPath, iArr);
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            C85315al.m146642d("VEEditor_VEBingoInvoker", "beginGenVideoFrames error for invalid video size");
            return -1;
        }
        if (iArr[0] > iArr[1]) {
            double d = (double) iArr[0];
            Double.isNaN(d);
            double d2 = (double) iArr[1];
            Double.isNaN(d2);
            int i9 = (int) (d2 / (d / 320.0d));
            int i10 = i9 % 16;
            if (i10 >= 8) {
                i9 += 16;
            }
            i4 = i9 - i10;
            i3 = 320;
        } else {
            double d3 = (double) iArr[1];
            Double.isNaN(d3);
            double d4 = (double) iArr[0];
            Double.isNaN(d4);
            int i11 = (int) (d4 / (d3 / 320.0d));
            int i12 = i11 % 16;
            if (i12 >= 8) {
                i11 += 16;
            }
            i3 = i11 - i12;
            i4 = 320;
        }
        int i13 = 3;
        final int i14 = (iArr[3] / (i2 * 1000)) + 1;
        if (z) {
            i5 = i14 / 3;
        } else {
            i13 = i14;
            i5 = i13;
        }
        C85315al.m146641c("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i + " second:" + i2 + " hasHWDecode:" + z + " beginGenVideoFrames HWSteps:" + i5);
        final long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < i14; i15 += i13) {
            arrayList.add(Integer.valueOf(i15 * 1000));
        }
        if (arrayList.size() > 0 && ((Integer) arrayList.get(arrayList.size() - 1)).intValue() > 1000) {
            arrayList.set(arrayList.size() - 1, Integer.valueOf(((Integer) arrayList.get(arrayList.size() - 1)).intValue() - 1000));
        }
        final int[] iArr2 = new int[arrayList.size()];
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            iArr2[i16] = ((Integer) arrayList.get(i16)).intValue();
            C85315al.m146637a("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i + " softList value:" + iArr2[i16]);
        }
        final long[] jArr = {System.currentTimeMillis()};
        new Thread(new Runnable() {
            /* class com.p2082ss.android.vesdk.VEBingoInvoker.RunnableC851961 */

            static {
                Covode.recordClassIndex(99252);
            }

            public final void run() {
                final ByteBuffer[] byteBufferArr = {null};
                final float[] fArr = {0.0f};
                TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
                tEVideoUtilsCallback.setListener(new AbstractC85304ab() {
                    /* class com.p2082ss.android.vesdk.VEBingoInvoker.RunnableC851961.C851971 */

                    static {
                        Covode.recordClassIndex(99253);
                    }

                    @Override // com.p2082ss.android.vesdk.AbstractC85304ab
                    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                        C85315al.m146637a("frameProcessSoft" + i, " cost time :" + (System.currentTimeMillis() - jArr[0]) + " ptsMs: " + i3);
                        jArr[0] = System.currentTimeMillis();
                        ByteBuffer[] byteBufferArr = byteBufferArr;
                        if (byteBufferArr[0] == null) {
                            byteBufferArr[0] = byteBuffer;
                            fArr[0] = (float) i3;
                            return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i)).booleanValue();
                        }
                        VEBingoInvoker.this.mNativeBingoHandler.processBingoFrames(byteBufferArr[0], byteBuffer, i, i2, fArr[0], clipPath);
                        byteBufferArr[0] = null;
                        fArr[0] = 0.0f;
                        VEBingoInvoker.this.progressBack(iVar, i14, i, currentTimeMillis, iArr);
                        return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i)).booleanValue();
                    }
                });
                TEVideoUtils.getVideoFramesMore(clipPath, iArr2, i3, i4, false, false, 2, true, tEVideoUtilsCallback);
            }
        }).start();
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i17 = 0; i17 < i5; i17++) {
                int i18 = i17 * 1000;
                if (!arrayList.contains(Integer.valueOf(i18))) {
                    arrayList2.add(Integer.valueOf(i18));
                    C85315al.m146637a("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i + " hwListOne value:" + i18);
                }
            }
            int i19 = i5;
            while (true) {
                i6 = i5 * 2;
                if (i19 >= i6) {
                    break;
                }
                int i20 = i19 * 1000;
                if (!arrayList.contains(Integer.valueOf(i20))) {
                    arrayList3.add(Integer.valueOf(i20));
                    C85315al.m146637a("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i + " hwListTwo value:" + i20);
                }
                i19++;
            }
            while (i6 < i14) {
                int i21 = i6 * 1000;
                if (!arrayList.contains(Integer.valueOf(i21))) {
                    arrayList4.add(Integer.valueOf(i21));
                    C85315al.m146637a("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i + " hwListThree value:" + i21);
                }
                i6++;
            }
            beginGenFrameHW(clipPath, arrayList2, i3, i4, 2, i14, i, 1, iArr, currentTimeMillis, iVar);
            beginGenFrameHW(clipPath, arrayList3, i3, i4, 2, i14, i, 2, iArr, currentTimeMillis, iVar);
            beginGenFrameHW(clipPath, arrayList4, i3, i4, 2, i14, i, 3, iArr, currentTimeMillis, iVar);
        }
        return 0;
    }

    public void progressBack(VEListener.AbstractC85240i iVar, int i, int i2, long j, int[] iArr) {
        MethodCollector.m26663i(14239);
        synchronized (this.mVEEditor) {
            try {
                float f = (float) i;
                float f2 = ((float) (this.frameCountCur + 1)) / f;
                C85315al.m146641c("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i2 + " count:" + this.frameCountCur + " steps:" + i + " progress:" + f2);
                if (f2 <= 1.0f && this.genFrameMap.get(Integer.valueOf(i2)).booleanValue()) {
                    C85315al.m146641c("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i2 + " progressBack < 1 count:" + this.frameCountCur + " steps:" + i + " progress:" + f2);
                    int i3 = this.frameCountCur + 1;
                    this.frameCountCur = i3;
                    iVar.mo111019a(((float) i3) / f);
                }
                if (f2 == 1.0f) {
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    C85315al.m146641c("VEEditor_VEBingoInvoker", "bingo extractFrame " + i2 + " progressBack == 1, count:" + this.frameCountCur + " steps:" + i + " progress:" + f2 + ", cost:" + currentTimeMillis);
                    this.frameCountCur = 0;
                    this.genFrameMap.put(Integer.valueOf(i2), false);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("src_width", iArr[0]);
                        jSONObject.put("src_height", iArr[1]);
                        jSONObject.put("src_duration", iArr[3]);
                        jSONObject.put("all_frame_count", i);
                        jSONObject.put("all_cost_ms", currentTimeMillis);
                        jSONObject.put("mean_cost_ms", (double) (((float) currentTimeMillis) / f));
                        C30683b.m63033a("vesdk_event_editor_extract_frame_time", jSONObject, "performance", false, true);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                MethodCollector.m26664o(14239);
            }
        }
    }

    private void beginGenFrameHW(final String str, List<Integer> list, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int[] iArr, final long j, final VEListener.AbstractC85240i iVar) {
        final int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = list.get(i7).intValue();
        }
        new Thread(new Runnable() {
            /* class com.p2082ss.android.vesdk.VEBingoInvoker.RunnableC851982 */

            static {
                Covode.recordClassIndex(99254);
            }

            public final void run() {
                boolean z;
                final ByteBuffer[] byteBufferArr = {null};
                final float[] fArr = {0.0f};
                final long[] jArr = {System.currentTimeMillis()};
                C30720a aVar = new C30720a(str, iArr2, i, i2, i3, i5, new AbstractC85304ab() {
                    /* class com.p2082ss.android.vesdk.VEBingoInvoker.RunnableC851982.C851991 */

                    static {
                        Covode.recordClassIndex(99255);
                    }

                    @Override // com.p2082ss.android.vesdk.AbstractC85304ab
                    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                        String str;
                        String str2 = "frameProcessHW" + i5 + "_" + i6;
                        StringBuilder append = new StringBuilder(" cost time :").append(System.currentTimeMillis() - jArr[0]).append(" ptsMs: ").append(i3).append(" frame is ");
                        if (byteBuffer == null) {
                            str = "null";
                        } else {
                            str = "not null";
                        }
                        C85315al.m146637a(str2, append.append(str).toString());
                        jArr[0] = System.currentTimeMillis();
                        if (byteBuffer == null) {
                            byteBufferArr[0] = null;
                            VEBingoInvoker.this.progressBack(iVar, i4, i5, j, iArr);
                            return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i5)).booleanValue();
                        }
                        ByteBuffer[] byteBufferArr = byteBufferArr;
                        if (byteBufferArr[0] == null) {
                            byteBufferArr[0] = byteBuffer;
                            fArr[0] = (float) i3;
                            return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i5)).booleanValue();
                        }
                        VEBingoInvoker.this.mNativeBingoHandler.processBingoFrames(byteBufferArr[0], byteBuffer, i, i2, fArr[0], str);
                        byteBufferArr[0] = null;
                        fArr[0] = 0.0f;
                        VEBingoInvoker.this.progressBack(iVar, i4, i5, j, iArr);
                        return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i5)).booleanValue();
                    }
                });
                try {
                    C85315al.m146637a(aVar.f73480b, "method start begin");
                    if (aVar.f73482f.length <= 0) {
                        C85315al.m146637a(aVar.f73480b, "ptsMs.length is wrong: " + aVar.f73482f.length);
                        return;
                    }
                    if (C30720a.f73477c == null || C30720a.f73478d == null) {
                        String lowerCase = C30640a.m62975a().toLowerCase();
                        if (lowerCase.contains("qualcomm")) {
                            C30720a.f73477c = "qualcomm";
                            if (lowerCase.contains("sdm660")) {
                                C30720a.f73478d = "sdm660";
                            } else if (lowerCase.contains("msm8994")) {
                                C30720a.f73478d = "msm8994";
                            } else if (lowerCase.contains("sdm845")) {
                                C30720a.f73478d = "sdm845";
                            } else if (lowerCase.contains("sm8150")) {
                                C30720a.f73478d = "sm8150";
                            } else {
                                C30720a.f73478d = "";
                            }
                        }
                    }
                    aVar.f73493q = System.currentTimeMillis();
                    MediaExtractor mediaExtractor = new MediaExtractor();
                    mediaExtractor.setDataSource(aVar.f73481e);
                    int i = aVar.f73483g;
                    int i2 = aVar.f73484h;
                    MediaFormat mediaFormat = null;
                    for (int i3 = 0; i3 < mediaExtractor.getTrackCount(); i3++) {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                        if (trackFormat.getString("mime").startsWith("video")) {
                            aVar.f73495s = trackFormat.getInteger("width");
                            aVar.f73496t = trackFormat.getInteger("height");
                            aVar.f73494r = trackFormat.getInteger("rotation-degrees");
                            if (aVar.f73494r != 0) {
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((aVar.f73483g * aVar.f73484h) * 3) / 2);
                                allocateDirect.clear();
                                aVar.f73491o = VEFrame.createByteBufferFrame(allocateDirect, aVar.f73483g, aVar.f73484h, 0, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
                                if (aVar.f73494r == 90 || aVar.f73494r == 270) {
                                    i = aVar.f73484h;
                                    i2 = aVar.f73483g;
                                }
                            }
                            mediaExtractor.selectTrack(i3);
                            mediaFormat = trackFormat;
                        }
                    }
                    if (aVar.f73489m == null) {
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i * i2) * 3) / 2);
                        allocateDirect2.clear();
                        aVar.f73489m = VEFrame.createByteBufferFrame(allocateDirect2, i, i2, aVar.f73494r, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
                    }
                    aVar.f73492p = MediaCodec.createDecoderByType("video/avc");
                    ArrayList arrayList = new ArrayList();
                    mediaExtractor.seekTo((long) aVar.f73482f[0], 2);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = aVar.f73486j;
                    while (true) {
                        long sampleTime = mediaExtractor.getSampleTime();
                        if (sampleTime < 0 && mediaExtractor.advance()) {
                            aVar.f73502z = true;
                            break;
                        }
                        arrayList2.add(Long.valueOf(sampleTime));
                        if (mediaExtractor.getSampleFlags() == 1) {
                            z = true;
                            arrayList.add(Long.valueOf(sampleTime));
                        } else {
                            z = false;
                        }
                        if (sampleTime > ((long) aVar.f73482f[aVar.f73482f.length - 1]) && z) {
                            i4--;
                        }
                        if (mediaExtractor.advance()) {
                            if (i4 <= 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (aVar.f73502z) {
                        C85315al.m146637a(aVar.f73480b, "start wrong");
                        aVar.mo55439b();
                        return;
                    }
                    Collections.sort(arrayList2);
                    int length = aVar.f73482f.length;
                    List[] listArr = new List[length];
                    int size = arrayList2.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < size && i6 < aVar.f73482f.length) {
                        if (((Long) arrayList2.get(i5)).longValue() < ((long) aVar.f73482f[i6])) {
                            i5++;
                        } else {
                            if (listArr[i6] == null) {
                                listArr[i6] = new ArrayList();
                            }
                            for (int i7 = 0; i7 < aVar.f73486j; i7++) {
                                int i8 = i5 + i7;
                                if (i8 < size) {
                                    listArr[i6].add(arrayList2.get(i8));
                                }
                            }
                            i5++;
                            i6++;
                        }
                    }
                    if (listArr[aVar.f73482f.length - 1] != null && listArr[aVar.f73482f.length - 1].size() == 1) {
                        listArr[aVar.f73482f.length - 1].add(listArr[aVar.f73482f.length - 1].get(0));
                        listArr[aVar.f73482f.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
                    }
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        C85315al.m146637a(aVar.f73480b, "pts value:" + arrayList2.get(i9));
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        List list = listArr[i10];
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            C85315al.m146637a(aVar.f73480b, "sensArray i: " + i11 + " value: " + list.get(i11).toString());
                        }
                    }
                    mediaExtractor.seekTo((long) aVar.f73482f[0], 0);
                    aVar.f73497u = new HandlerThread("MediaCodec Callback");
                    C85315al.m146637a(aVar.f73480b, "getVideoFramesHW: mCodecHandlerThread = " + aVar.f73497u.getThreadId() + ", curr-threadId = " + aVar.f73479a);
                    aVar.f73497u.start();
                    aVar.f73492p.setCallback(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02f8: INVOKE  
                          (wrap: android.media.MediaCodec : 0x02f1: IGET  (r1v13 android.media.MediaCodec) = (r3v1 'aVar' com.ss.android.ttve.nativePort.a) com.ss.android.ttve.nativePort.a.p android.media.MediaCodec)
                          (wrap: com.ss.android.ttve.nativePort.a$1 : 0x02f5: CONSTRUCTOR  (r0v52 com.ss.android.ttve.nativePort.a$1) = 
                          (r3v1 'aVar' com.ss.android.ttve.nativePort.a)
                          (r4v1 'mediaExtractor' android.media.MediaExtractor)
                          (r6v4 'listArr' java.util.List[])
                          (r7v3 'arrayList' java.util.ArrayList)
                         call: com.ss.android.ttve.nativePort.a.1.<init>(com.ss.android.ttve.nativePort.a, android.media.MediaExtractor, java.util.List[], java.util.List):void type: CONSTRUCTOR)
                          (wrap: android.os.Handler : 0x02ee: CONSTRUCTOR  (r8v6 android.os.Handler) = 
                          (wrap: android.os.Looper : 0x02ea: INVOKE  (r0v51 android.os.Looper) = 
                          (wrap: android.os.HandlerThread : 0x02e8: IGET  (r0v50 android.os.HandlerThread) = (r3v1 'aVar' com.ss.android.ttve.nativePort.a) com.ss.android.ttve.nativePort.a.u android.os.HandlerThread)
                         type: VIRTUAL call: android.os.HandlerThread.getLooper():android.os.Looper)
                         call: android.os.Handler.<init>(android.os.Looper):void type: CONSTRUCTOR)
                         type: VIRTUAL call: android.media.MediaCodec.setCallback(android.media.MediaCodec$Callback, android.os.Handler):void in method: com.ss.android.vesdk.VEBingoInvoker.2.run():void, file: classes8.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02f5: CONSTRUCTOR  (r0v52 com.ss.android.ttve.nativePort.a$1) = 
                          (r3v1 'aVar' com.ss.android.ttve.nativePort.a)
                          (r4v1 'mediaExtractor' android.media.MediaExtractor)
                          (r6v4 'listArr' java.util.List[])
                          (r7v3 'arrayList' java.util.ArrayList)
                         call: com.ss.android.ttve.nativePort.a.1.<init>(com.ss.android.ttve.nativePort.a, android.media.MediaExtractor, java.util.List[], java.util.List):void type: CONSTRUCTOR in method: com.ss.android.vesdk.VEBingoInvoker.2.run():void, file: classes8.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 27 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ttve.nativePort.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 33 more
                        */
                    /*
                    // Method dump skipped, instructions count: 940
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEBingoInvoker.RunnableC851982.run():void");
                }
            }).start();
        }
    }
