package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.vesdk.VEMVParams */
public class VEMVParams {
    public float backVolume;
    public String bgmPath;
    public int bgmTrimIn;
    public int bgmTrimOut;
    public VESize customRenderRes;
    public List<VESize> imgSizes;
    public boolean isSingleVideo;
    public int[] karaokeAudioDurations;
    public String[] karaokeAudioPaths;
    public float[] karaokeAudioSpeeds;
    public int[] mvDuration;
    public String mvPath;
    public float originalVolume;
    public EnumC85259a resMV;
    public String[] resourcesFilePaths;
    public String[] resourcesTypes;

    static {
        Covode.recordClassIndex(99346);
    }

    public VEMVParams() {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.bgmTrimIn = -1;
        this.bgmTrimOut = -1;
    }

    /* renamed from: com.ss.android.vesdk.VEMVParams$a */
    public enum EnumC85259a {
        RES_RANDOM,
        RES_720P,
        RES_1080P,
        RES_2K,
        RES_720P_REVERSE,
        RES_FROM_TEMPLATE,
        RES_CUSTOM;

        static {
            Covode.recordClassIndex(99347);
        }
    }

    public String toString() {
        return "VEMVParams{mvPath='" + this.mvPath + '\'' + ", resourcesFilePaths=" + Arrays.toString(this.resourcesFilePaths) + ", resourcesTypes=" + Arrays.toString(this.resourcesTypes) + ", isSingleVideo=" + this.isSingleVideo + ", mvDuration=" + Arrays.toString(this.mvDuration) + ", bgmPath='" + this.bgmPath + '\'' + ", bgmTrimIn=" + this.bgmTrimIn + ", bgmTrimOut=" + this.bgmTrimOut + ", imgSizes=" + this.imgSizes + ", backVolume=" + this.backVolume + ", originalVolume=" + this.originalVolume + ", resMV=" + this.resMV + ", karaokeAudioPaths=" + Arrays.toString(this.karaokeAudioPaths) + ", karaokeAudioDurations=" + Arrays.toString(this.karaokeAudioDurations) + ", karaokeAudioSpeeds=" + Arrays.toString(this.karaokeAudioSpeeds) + ", customRenderRes=" + this.customRenderRes + '}';
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.resMV = EnumC85259a.RES_RANDOM;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, EnumC85259a aVar) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.resMV = aVar;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.bgmPath = str2;
        this.bgmTrimIn = i;
        this.bgmTrimOut = i2;
        this.resMV = EnumC85259a.RES_RANDOM;
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, int[] iArr, String[] strArr3, int[] iArr2, float[] fArr) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        if (!strArr2[0].equals("video") || iArr != null) {
            this.mvPath = str;
            this.resourcesFilePaths = strArr;
            this.resourcesTypes = strArr2;
            this.mvDuration = iArr;
            this.karaokeAudioPaths = strArr3;
            this.karaokeAudioDurations = iArr2;
            this.karaokeAudioSpeeds = fArr;
            this.resMV = EnumC85259a.RES_RANDOM;
            this.isSingleVideo = false;
            return;
        }
        throw new C85615x(-100, "Invalid params in karaoke mv mode!");
    }

    public VEMVParams(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, boolean z, int[] iArr) {
        this.backVolume = 1.0f;
        this.originalVolume = 1.0f;
        this.mvPath = str;
        this.resourcesFilePaths = strArr;
        this.resourcesTypes = strArr2;
        this.bgmPath = str2;
        this.bgmTrimIn = i;
        this.bgmTrimOut = i2;
        this.resMV = EnumC85259a.RES_RANDOM;
        this.isSingleVideo = z;
        this.mvDuration = iArr;
    }
}
