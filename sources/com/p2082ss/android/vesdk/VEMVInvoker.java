package com.p2082ss.android.vesdk;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.common.C30651j;
import com.p2082ss.android.ttve.model.C30679g;
import com.p2082ss.android.ttve.model.MVInfoBean;
import com.p2082ss.android.ttve.model.MVResourceBean;
import com.p2082ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.p2082ss.android.ttve.nativePort.NativeCallbacks;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEMVAlgorithmConfig;
import com.p2082ss.android.vesdk.VEMVParams;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p2082ss.android.vesdk.jni.TEMVInterface;
import com.p2082ss.android.vesdk.p4390f.AbstractC85467d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.VEMVInvoker */
public class VEMVInvoker implements AbstractC85467d {
    private boolean mIsMVInit;
    private int mMVBackgroundAudioRid;
    private int mMVBackgroundAudioTrackIndex = -1;
    private List<Integer> mMVFilterIndex;
    public volatile VEListener.AbstractC85222aa mMVInitListener;
    private NativeCallbacks.AbstractC30706f mMVInitedCallback = new NativeCallbacks.AbstractC30706f() {
        /* class com.p2082ss.android.vesdk.VEMVInvoker.C852581 */

        static {
            Covode.recordClassIndex(99345);
        }

        @Override // com.p2082ss.android.ttve.nativePort.NativeCallbacks.AbstractC30706f
        /* renamed from: a */
        public final void mo55091a() {
            if (VEMVInvoker.this.mMVInitListener != null) {
                VEMVInvoker.this.mMVInitListener.mo130303a();
            }
        }
    };
    private int mMVKaraokeAudioTrackIndex = -1;
    private String mMVPath;
    private C30679g mMVResVideoInfo;
    private String[] mMVResourcePaths;
    private String[] mMVResourceTypes;
    private List<VESize> mMVSize;
    private final TEInterface mNativeEditor;
    private final TEMVInterface mNativeMVHandler;
    private final C85581w mVEEditor;
    private MVInfoBean mvInfo;
    private VEMVParams.EnumC85259a mvResolution;

    static {
        Covode.recordClassIndex(99344);
    }

    public int getMVBackgroundAudioRid() {
        return this.mMVBackgroundAudioRid;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int getMVBackgroundAudioTrackIndex() {
        return this.mMVBackgroundAudioTrackIndex;
    }

    public int getMVKaraokeAudioIndex() {
        return this.mMVKaraokeAudioTrackIndex;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public boolean isMVInitialedInternal() {
        return this.mIsMVInit;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public void clearNativeFromMV() {
        this.mNativeMVHandler.clearNative();
    }

    public MVInfoBean getMVInfo() {
        if (this.mIsMVInit) {
            MVInfoBean mVInfoBean = this.mvInfo;
            if (mVInfoBean != null) {
                return mVInfoBean;
            }
            throw new C85615x(-1, "MV resource information construction failed!");
        }
        throw new C85615x(-1, "The MV resource has not been initialized yet, please call the init2 method");
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public VEMVAudioInfo getMVOriginalBackgroundAudio() {
        C85315al.m146641c("VEEditor_VEMVInvoker", "getMVOriginalBackgroundAudio");
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return (VEMVAudioInfo) this.mNativeMVHandler.getMVOriginalBackgroundAudio();
        }
        C85315al.m146642d("VEEditor_VEMVInvoker", "getMVOriginalBackgroundAudio bad input file, please call initMV first");
        return null;
    }

    public VEMVAlgorithmConfig getServerAlgorithmConfig() {
        C85315al.m146641c("VEEditor_VEMVInvoker", "getServerAlgorithmConfig.");
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return (VEMVAlgorithmConfig) this.mNativeMVHandler.getServerAlgorithmConfig();
        }
        C85315al.m146642d("VEEditor_VEMVInvoker", "getServerAlgorithmConfig error, please call initMV first!");
        throw new IllegalStateException("getServerAlgorithmConfig, initMv is not called!");
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public void setListenerForMV(VEListener.AbstractC85222aa aaVar) {
        this.mMVInitListener = aaVar;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public void addMVFilterInternal(int i) {
        List<Integer> list = this.mMVFilterIndex;
        if (list != null) {
            list.add(Integer.valueOf(i));
        }
    }

    public VEMVInvoker(C85581w wVar) {
        this.mVEEditor = wVar;
        TEInterface tEInterface = wVar.f191765B;
        this.mNativeEditor = tEInterface;
        this.mNativeMVHandler = new TEMVInterface(tEInterface.getNativeHandler());
    }

    public int setMVAudioBeatAlgorithmResult(VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "setMVAudioBeatAlgorithmResult. beatSize : " + vEMVAudioAlgorithmResult.size);
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setMVAudioBeatAlgorithmResult(vEMVAudioAlgorithmResult);
        }
        C85315al.m146642d("VEEditor_VEMVInvoker", "setMVAudioBeatAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setMVAudioBeatAlgorithmResult, initMv is not called!");
    }

    public int setMVDataJson(String str) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "setMVDataJson. json = ".concat(String.valueOf(str)));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setMVDataJson(str);
        }
        C85315al.m146642d("VEEditor_VEMVInvoker", "setMVDataJson error, please call initMV first!");
        throw new IllegalStateException("setMVDataJson, initMv is not called!");
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int updateMVResources(VEMVParams vEMVParams) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "updateMVResources " + vEMVParams.toString());
        return reInitMV(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, null, 0, 0, vEMVParams.resMV, true, vEMVParams.isSingleVideo, vEMVParams.imgSizes, false, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds);
    }

    public int updateMVResourcesRecreateEngine(VEMVParams vEMVParams) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "updateMVResourcesRecreateEngine " + vEMVParams.toString());
        return reInitMV(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, null, 0, 0, vEMVParams.resMV, true, vEMVParams.isSingleVideo, vEMVParams.imgSizes, true, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds);
    }

    public Map<Integer, List<MVResourceBean>> getMVUserVideoInfo(String str) {
        if (!this.mIsMVInit) {
            throw new C85615x(-1, "The MV resource has not been initialized yet, please call the init2 method");
        } else if (this.mMVResVideoInfo != null) {
            HashMap hashMap = new HashMap();
            for (MVResourceBean mVResourceBean : this.mMVResVideoInfo.f73379a) {
                if (mVResourceBean.content.equals(str)) {
                    List list = (List) hashMap.get(Integer.valueOf(mVResourceBean.trackIndex));
                    if (list == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(mVResourceBean);
                        hashMap.put(Integer.valueOf(mVResourceBean.trackIndex), arrayList);
                    } else {
                        list.add(mVResourceBean);
                        hashMap.put(Integer.valueOf(mVResourceBean.trackIndex), list);
                    }
                }
            }
            return hashMap;
        } else {
            throw new C85615x(-1, "MV resource information construction failed");
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int initMV(VEMVParams vEMVParams) {
        Throwable th;
        MethodCollector.m26663i(14109);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEMVInvoker", "initMV " + vEMVParams.toString());
                try {
                    int initMVInternal = initMVInternal(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, vEMVParams.bgmPath, vEMVParams.bgmTrimIn, vEMVParams.bgmTrimOut, vEMVParams.resMV, false, vEMVParams.isSingleVideo, vEMVParams.imgSizes, vEMVParams.backVolume, vEMVParams.originalVolume, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds, vEMVParams.customRenderRes);
                    MethodCollector.m26664o(14109);
                    return initMVInternal;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.m26664o(14109);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(14109);
                throw th;
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int setMvOriginalAudio(boolean z, float f) {
        C85315al.m146637a("VEEditor_VEMVInvoker", "setMVoriginalAudio... ".concat(String.valueOf(z)));
        if (this.mIsMVInit && this.mMVResVideoInfo == null) {
            return -502;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        for (MVResourceBean mVResourceBean : this.mMVResVideoInfo.f73379a) {
            if (!arrayList.contains(Integer.valueOf(mVResourceBean.trackIndex))) {
                arrayList.add(Integer.valueOf(mVResourceBean.trackIndex));
            }
        }
        if (!z) {
            for (Integer num : arrayList) {
                this.mVEEditor.mo131645a(num.intValue(), 0, 0.0f);
            }
        } else {
            for (Integer num2 : arrayList) {
                this.mVEEditor.mo131645a(num2.intValue(), 0, f);
            }
        }
        return 0;
    }

    public int initMV(String str, String[] strArr, String[] strArr2) {
        Throwable th;
        MethodCollector.m26663i(14002);
        synchronized (this.mVEEditor) {
            try {
                try {
                    int initMVInternal = initMVInternal(str, strArr, strArr2, null, null, 0, 0, VEMVParams.EnumC85259a.RES_RANDOM, false, false, null, 1.0f, 1.0f, null, null, null, null);
                    MethodCollector.m26664o(14002);
                    return initMVInternal;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.m26664o(14002);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(14002);
                throw th;
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int updateMVBackgroundAudioTrack(String str, int i, int i2) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack");
        return reInitMV(this.mMVPath, this.mMVResourcePaths, this.mMVResourceTypes, null, str, i, i2, this.mvResolution, false, false, this.mMVSize, false, null, null, null);
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "setExternalAlgorithmResult. photoPath = " + str + ", algorithmType = " + str2 + ", filePath = " + str3);
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setExternalAlgorithmResult(str, str2, str3, -1);
        }
        C85315al.m146642d("VEEditor_VEMVInvoker", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    public int updateMVBackgroundAudioTrack2(String str, int i, int i2) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack2...");
        int reInitMV = reInitMV(this.mMVPath, this.mMVResourcePaths, this.mMVResourceTypes, null, null, 0, 0, this.mvResolution, true, false, this.mMVSize, false, null, null, null);
        if (reInitMV != 0) {
            C85315al.m146642d("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack2 failed when reinitMV !!!");
            return reInitMV;
        }
        this.mVEEditor.mo131645a(this.mMVBackgroundAudioTrackIndex, 1, 0.0f);
        return this.mVEEditor.mo131610a(str, i, i2, true);
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int updateMVResources(String str, String[] strArr, String[] strArr2) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "updateMVResources");
        return reInitMV(str, strArr, strArr2, null, null, 0, 0, VEMVParams.EnumC85259a.RES_RANDOM, true, false, null, false, null, null, null);
    }

    public int updateMVResourcesRecreateEngine(String str, String[] strArr, String[] strArr2) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "updateMVResourcesRecreateEngine");
        return reInitMV(str, strArr, strArr2, null, null, 0, 0, VEMVParams.EnumC85259a.RES_RANDOM, true, false, null, true, null, null, null);
    }

    private List<List<List<MVResourceBean>>> genMVResourceTracks(MVInfoBean mVInfoBean, List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        ArrayList<MVResourceBean> arrayList4 = mVInfoBean.resources;
        ArrayList arrayList5 = new ArrayList();
        while (arrayList5.size() != arrayList4.size()) {
            ArrayList arrayList6 = new ArrayList();
            double d = 0.0d;
            double d2 = 0.0d;
            for (MVResourceBean mVResourceBean : arrayList4) {
                if (!arrayList5.contains(Integer.valueOf(mVResourceBean.rid))) {
                    if ("video".equals(mVResourceBean.type) || "img".equals(mVResourceBean.type) || "bgimg".equals(mVResourceBean.type)) {
                        if (mVResourceBean.seqIn >= d) {
                            MVResourceBean mVResourceBean2 = new MVResourceBean();
                            mVResourceBean2.seqIn = mVResourceBean.seqIn * 1000.0d;
                            mVResourceBean2.seqOut = mVResourceBean.seqOut * 1000.0d;
                            mVResourceBean2.trimIn = mVResourceBean.trimIn * 1000.0d;
                            mVResourceBean2.trimOut = mVResourceBean.trimOut * 1000.0d;
                            mVResourceBean2.musicFadeIn = mVResourceBean.musicFadeIn * 1000.0d;
                            mVResourceBean2.musicFadeOut = mVResourceBean.musicFadeOut * 1000.0d;
                            if (mVResourceBean2.trimOut == 0.0d && ("img".equals(mVResourceBean.type) || "bgimg".equals(mVResourceBean.type))) {
                                mVResourceBean2.trimOut = mVResourceBean2.seqOut - mVResourceBean2.seqIn;
                            }
                            mVResourceBean2.content = mVResourceBean.content;
                            mVResourceBean2.type = mVResourceBean.type;
                            mVResourceBean2.rid = mVResourceBean.rid;
                            mVResourceBean2.isLoop = mVResourceBean.isLoop;
                            mVResourceBean2.isMute = mVResourceBean.isMute;
                            mVResourceBean2.timeMode = mVResourceBean.timeMode;
                            arrayList6.add(mVResourceBean2);
                            d = mVResourceBean.seqOut;
                            arrayList5.add(Integer.valueOf(mVResourceBean2.rid));
                            list.add(mVResourceBean2.content);
                        }
                    } else if (DataType.AUDIO.equals(mVResourceBean.type)) {
                        if (mVResourceBean.seqIn >= d2) {
                            ArrayList arrayList7 = new ArrayList();
                            MVResourceBean mVResourceBean3 = new MVResourceBean();
                            mVResourceBean3.seqIn = mVResourceBean.seqIn * 1000.0d;
                            mVResourceBean3.seqOut = mVResourceBean.seqOut * 1000.0d;
                            mVResourceBean3.trimIn = mVResourceBean.trimIn * 1000.0d;
                            mVResourceBean3.trimOut = mVResourceBean.trimOut * 1000.0d;
                            mVResourceBean3.musicFadeIn = mVResourceBean.musicFadeIn * 1000.0d;
                            mVResourceBean3.musicFadeOut = mVResourceBean.musicFadeOut * 1000.0d;
                            mVResourceBean3.content = mVResourceBean.content;
                            mVResourceBean3.type = mVResourceBean.type;
                            mVResourceBean3.rid = mVResourceBean.rid;
                            mVResourceBean3.isLoop = mVResourceBean.isLoop;
                            mVResourceBean3.isMute = mVResourceBean.isMute;
                            mVResourceBean3.timeMode = mVResourceBean.timeMode;
                            if (this.mMVBackgroundAudioRid == 0) {
                                this.mMVBackgroundAudioRid = mVResourceBean3.rid;
                            }
                            arrayList7.add(mVResourceBean3);
                            d2 = mVResourceBean.seqOut;
                            arrayList5.add(Integer.valueOf(mVResourceBean3.rid));
                            list2.add(mVResourceBean3.content);
                            if (arrayList7.size() > 0) {
                                arrayList3.add(arrayList7);
                            }
                        }
                    } else if ("text".equals(mVResourceBean.type)) {
                        arrayList5.add(Integer.valueOf(mVResourceBean.rid));
                    } else {
                        arrayList5.add(Integer.valueOf(mVResourceBean.rid));
                    }
                }
            }
            if (arrayList6.size() > 0) {
                arrayList2.add(arrayList6);
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int changeMvUserVideoInfoInternal(int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr, VEClipSourceParam[] vEClipSourceParamArr) {
        if (this.mMVResVideoInfo == null) {
            C85315al.m146642d("VEEditor_VEMVInvoker", "changeMvUserVideoInfo... mvResInfo was not inited!");
            return -502;
        } else if ((vEClipTimelineParamArr == null || iArr.length == vEClipTimelineParamArr.length) && (vEClipSourceParamArr == null || iArr.length == vEClipSourceParamArr.length)) {
            for (int i2 = 0; i2 < this.mMVResVideoInfo.mo55058a(); i2++) {
                int i3 = 0;
                for (int i4 : iArr) {
                    MVResourceBean a = this.mMVResVideoInfo.mo55059a(i2);
                    if (a.clipIndex == i4 && a.trackIndex == i) {
                        if (vEClipTimelineParamArr != null) {
                            a.trimIn = (double) vEClipTimelineParamArr[i3].trimIn;
                            a.trimOut = (double) vEClipTimelineParamArr[i3].trimOut;
                        }
                        if (vEClipSourceParamArr != null) {
                            a.content = vEClipSourceParamArr[i3].clipFilePath;
                        }
                        this.mMVResVideoInfo.mo55060a(i2, a);
                    }
                    i3++;
                }
            }
            return 0;
        } else {
            C85315al.m146642d("VEEditor_VEMVInvoker", "changeMvUserVideoInfo... Invalid params!");
            return -1;
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int setExternalAlgorithmResult(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "setExternalAlgorithmResult. photoPath = " + str + ", algorithmType = " + str2 + ", result = " + str3 + ", type = " + mv_reesult_in_type);
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setExternalAlgorithmResult(str, str2, str3, mv_reesult_in_type.ordinal());
        }
        C85315al.m146642d("VEEditor_VEMVInvoker", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    public int updateMVResources(String str, String[] strArr, String[] strArr2, int[] iArr, boolean z) {
        C85315al.m146641c("VEEditor_VEMVInvoker", "updateMVResources");
        return reInitMV(str, strArr, strArr2, iArr, null, 0, 0, VEMVParams.EnumC85259a.RES_RANDOM, true, z, null, false, null, null, null);
    }

    public int initMV(String str, String[] strArr, String[] strArr2, int[] iArr, boolean z) {
        Throwable th;
        MethodCollector.m26663i(13962);
        synchronized (this.mVEEditor) {
            try {
                try {
                    int initMVInternal = initMVInternal(str, strArr, strArr2, iArr, null, 0, 0, VEMVParams.EnumC85259a.RES_RANDOM, false, z, null, 1.0f, 1.0f, null, null, null, null);
                    MethodCollector.m26664o(13962);
                    return initMVInternal;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.m26664o(13962);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(13962);
                throw th;
            }
        }
    }

    @Override // com.p2082ss.android.vesdk.p4390f.AbstractC85467d
    public int initMV(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        Throwable th;
        MethodCollector.m26663i(14072);
        synchronized (this.mVEEditor) {
            try {
                try {
                    int initMVInternal = initMVInternal(str, strArr, strArr2, null, str2, i, i2, VEMVParams.EnumC85259a.RES_RANDOM, false, false, null, 1.0f, 1.0f, null, null, null, null);
                    MethodCollector.m26664o(14072);
                    return initMVInternal;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.m26664o(14072);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(14072);
                throw th;
            }
        }
    }

    private boolean genResourcesArrRepeat(MVResourceBean mVResourceBean, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i) {
        int i2 = (int) (mVResourceBean.trimOut - mVResourceBean.trimIn);
        int i3 = (int) mVResourceBean.seqIn;
        for (int i4 = 0; i4 < i; i4++) {
            strArr[i4] = mVResourceBean.content;
            iArr5[i4] = mVResourceBean.rid;
            iArr[i4] = (int) mVResourceBean.trimIn;
            iArr2[i4] = (int) mVResourceBean.trimOut;
            iArr3[i4] = i3;
            iArr4[i4] = i3 + i2;
            i3 = iArr4[i4];
        }
        int i5 = i - 1;
        iArr4[i5] = (int) mVResourceBean.seqOut;
        iArr2[i5] = (iArr4[i5] - iArr3[i5]) + iArr[i5];
        return true;
    }

    private boolean genResourcesArrCycle(MVResourceBean mVResourceBean, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i) {
        int i2 = (int) (mVResourceBean.seqOut - mVResourceBean.seqIn);
        if (i <= 0) {
            C85315al.m146642d("VEEditor_VEMVInvoker", "mvDuration invalied ...");
            return false;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + i2;
            if (i5 > i) {
                break;
            }
            iArr[i4] = (int) mVResourceBean.trimIn;
            iArr2[i4] = (int) mVResourceBean.trimOut;
            iArr3[i4] = ((int) mVResourceBean.seqIn) + i3;
            iArr4[i4] = ((int) mVResourceBean.seqOut) + i3;
            strArr[i4] = mVResourceBean.content;
            iArr5[i4] = mVResourceBean.rid;
            i4++;
            i3 = i5;
        }
        if (i3 >= i) {
            return true;
        }
        iArr[i4] = 0;
        iArr2[i4] = i - i3;
        iArr3[i4] = ((int) mVResourceBean.seqIn) + i3;
        iArr4[i4] = i;
        strArr[i4] = mVResourceBean.content;
        iArr5[i4] = mVResourceBean.rid;
        return true;
    }

    private void genResourcesArr(List<MVResourceBean> list, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i, boolean[] zArr) {
        int i2 = 0;
        for (MVResourceBean mVResourceBean : list) {
            iArr[i2] = (int) mVResourceBean.trimIn;
            iArr2[i2] = (int) mVResourceBean.trimOut;
            iArr3[i2] = (int) mVResourceBean.seqIn;
            iArr4[i2] = (int) mVResourceBean.seqOut;
            strArr[i2] = mVResourceBean.content;
            iArr5[i2] = mVResourceBean.rid;
            zArr[i2] = mVResourceBean.isMute;
            mVResourceBean.trackIndex = i;
            mVResourceBean.clipIndex = i2;
            i2++;
            if (Arrays.asList(this.mMVResourcePaths).contains(mVResourceBean.content)) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.mMVResVideoInfo.mo55058a()) {
                        break;
                    }
                    MVResourceBean a = this.mMVResVideoInfo.mo55059a(i3);
                    if (a.content.equals(mVResourceBean.content) && a.trackIndex == -1) {
                        this.mMVResVideoInfo.mo55060a(i3, mVResourceBean);
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    private int reInitMV(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, VEMVParams.EnumC85259a aVar, boolean z, boolean z2, List<VESize> list, boolean z3, String[] strArr3, int[] iArr2, float[] fArr) {
        Throwable th;
        MethodCollector.m26663i(13999);
        synchronized (this.mVEEditor) {
            try {
                C85315al.m146637a("VEEditor_VEMVInvoker", "reinitMV...");
                if (!(str == null || strArr == null)) {
                    if (strArr2 != null) {
                        this.mVEEditor.mo131589a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                        if (z3) {
                            C30651j jVar = this.mVEEditor.f191852s;
                            jVar.f73286a = -1;
                            jVar.f73287b = -1;
                            jVar.f73288c.clear();
                            jVar.f73289d.clear();
                            int releaseEngine = this.mNativeEditor.releaseEngine();
                            if (releaseEngine != 0) {
                                C85315al.m146637a("VEEditor_VEMVInvoker", "stop in reInitMV failed, ret = ".concat(String.valueOf(releaseEngine)));
                                MethodCollector.m26664o(13999);
                                return -1;
                            }
                        } else {
                            int stop = this.mNativeEditor.stop();
                            if (stop != 0) {
                                C85315al.m146637a("VEEditor_VEMVInvoker", "release in reInitMV failed, ret = ".concat(String.valueOf(stop)));
                                MethodCollector.m26664o(13999);
                                return -1;
                            }
                        }
                        this.mMVBackgroundAudioRid = 0;
                        this.mMVKaraokeAudioTrackIndex = -1;
                        int[] iArr3 = new int[this.mMVFilterIndex.size()];
                        for (int i3 = 0; i3 < this.mMVFilterIndex.size(); i3++) {
                            iArr3[i3] = this.mMVFilterIndex.get(i3).intValue();
                        }
                        this.mVEEditor.mo131619a(iArr3);
                        try {
                            int initMVInternal = initMVInternal(str, strArr, strArr2, iArr, str2, i, i2, aVar, z, z2, list, 1.0f, 1.0f, strArr3, iArr2, fArr, null);
                            if (initMVInternal != 0) {
                                C85315al.m146642d("VEEditor_VEMVInvoker", "init2 in reInitMV failed, ret = ".concat(String.valueOf(initMVInternal)));
                                MethodCollector.m26664o(13999);
                                return initMVInternal;
                            }
                            try {
                                this.mNativeEditor.createTimeline();
                                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                                this.mNativeEditor.updateTrackFilter(0, 0, false);
                                if (this.mVEEditor.mo131573J() != null) {
                                    C85581w wVar = this.mVEEditor;
                                    wVar.f191836c.mo131129a(wVar.mo131573J().f73366a, 1.0f, true);
                                }
                                MethodCollector.m26664o(13999);
                                return prepareEngine;
                            } catch (Throwable th2) {
                                th = th2;
                                MethodCollector.m26664o(13999);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            MethodCollector.m26664o(13999);
                            throw th;
                        }
                    }
                }
                C85315al.m146637a("VEEditor_VEMVInvoker", "reinitMV bad input file, please call init2 first");
                MethodCollector.m26664o(13999);
                return -205;
            } catch (Throwable th4) {
                th = th4;
                MethodCollector.m26664o(13999);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x059a, code lost:
        if (r53 > 0) goto L_0x044a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int initMVInternal(java.lang.String r66, java.lang.String[] r67, java.lang.String[] r68, int[] r69, java.lang.String r70, int r71, int r72, com.p2082ss.android.vesdk.VEMVParams.EnumC85259a r73, boolean r74, boolean r75, java.util.List<com.p2082ss.android.vesdk.VESize> r76, float r77, float r78, java.lang.String[] r79, int[] r80, float[] r81, com.p2082ss.android.vesdk.VESize r82) {
        /*
        // Method dump skipped, instructions count: 1462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEMVInvoker.initMVInternal(java.lang.String, java.lang.String[], java.lang.String[], int[], java.lang.String, int, int, com.ss.android.vesdk.VEMVParams$a, boolean, boolean, java.util.List, float, float, java.lang.String[], int[], float[], com.ss.android.vesdk.VESize):int");
    }
}
