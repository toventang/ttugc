package com.p2082ss.android.vesdk.p4390f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p2082ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import java.util.List;

/* renamed from: com.ss.android.vesdk.f.b */
public interface AbstractC85465b {
    static {
        Covode.recordClassIndex(99586);
    }

    int beginGenVideoFrames(int i, int i2, boolean z, VEListener.AbstractC85240i iVar);

    int cancelGenVideoFrame(int i);

    void clearNativeFromBingo();

    int genRandomSolve();

    int genSmartCutting();

    List<VEClipAlgorithmParam> getAllVideoRangeData();

    int initBingoAlgorithm();

    int initWithAlgorithm(String[] strArr, C85581w.EnumC85613l lVar);

    int removeAllVideoSound();

    int removeMusic(int i);

    int restoreAllVideoSound();

    int setAIRotation(int i, ROTATE_DEGREE rotate_degree);

    int setMusicAndResult(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath);

    int updateAlgorithmFromNormal();
}
