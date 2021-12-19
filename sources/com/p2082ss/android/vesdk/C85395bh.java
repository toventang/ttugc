package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.bh */
public class C85395bh {

    /* renamed from: a */
    private Map<EnumC85396a, C85398c<?>> f191168a = new HashMap();

    static {
        Covode.recordClassIndex(99507);
    }

    /* renamed from: com.ss.android.vesdk.bh$a */
    public enum EnumC85396a {
        ConfigID_UseImageAllocator("UseImageAllocator"),
        ConfigID_UseMultiEffectOpt("UseMultiEffectOpt"),
        ConfigID_PreLoadNextClip("PreLoadNextClip"),
        ConfigID_EnableHighSpeedChange("vesdk_high_speed_change_opt"),
        ConfigID_EnableEditorFpsLog("EnableEditorFpsLog"),
        ConfigID_EnableVideoOutputCallback("EnableVideoOutputCallback"),
        ConfigID_MaxAudioReaderCount("MaxAudioReaderCount"),
        ConfigID_MaxSoftwareVideoReaderCount("MaxSoftwareVideoReaderCount"),
        ConfigID_MaxSoftwareFreeReaderCount("MaxSoftwareFreeReaderCount"),
        ConfigID_MaxPreloadReaderCount("veabtest_crossplat_maxPreloadReaderCnt"),
        ConfigID_MaxHwReaderCount("MaxHwReaderCount"),
        ConfigID_MaxImageTextureBufferCount("MaxImageTextureBufferCount"),
        ConfigID_SetDropFramePara("SetDropFramePara"),
        ConfigID_DelayTimeThreshold("DelayTimeThreshold"),
        ConfigID_MaxDropFrameCount("MaxDropFrameCount"),
        ConfigID_MaxTexturePoolCount("MaxTexturePoolCount"),
        ConfigID_TexturePoolCleanCount("TexturePoolCleanCount"),
        ConfigID_UseMultiThreadPool("UseMultiThreadPool"),
        ConfigID_EnableFirstFrameOpt("EnableFirstFrameOpt"),
        ConfigID_MaxImageTextureBufferWidth("MaxImageTextureBufferWidth"),
        ConfigID_MaxImageTextureBufferHeight("MaxImageTextureBufferHeight"),
        ConfigID_MaxCacheFrameCount("vesdk_max_cache_count"),
        ConfigID_UseEffectTransiton("UseEffectTransiton"),
        ConfigID_UseRefaCanvasWrap("UseRefaCanvasWrap"),
        ConfigID_CacheGLContext("CacheGlContext"),
        ConfigID_EnbaleInfoStickerTrans("EnbaleInfoStickerTrans"),
        ConfigID_OpenSeekTimeOpt("OpenSeekTimeOpt"),
        ConfigID_UseGaussianOpt("UseGaussianOpt"),
        ConfigID_UseNewEngineEffectOpt("UseNewEngineEffectOpt"),
        ConfigID_CacheGlProgram("CacheGlProgram"),
        ConfigID_OutResolutionBase4("ve_enable_render_encode_resolution_align4"),
        ConfigID_EffectUseAmazingMV("EffectUseAmazingMV"),
        ConfigID_ForceDropFrameWithoutAudio("ForceDropFrameWithoutAudio"),
        ConfigID_UseAudioSDKApiV2("aeabtest_v2api"),
        ConfigID_SeekPredictOpt("vesdk_seek_predict_opt"),
        ConfigID_LowPhoneOpt("LowPhoneOpt"),
        ConfigID_CrossplatGLBaseFBO("crossplat_glbase_fbo"),
        ConfigID_EnableRenderlib("enable_render_lib"),
        ConfigID_EnableAGFXContext("EnableAGFXContext"),
        ConfigID_EnableAGFXMetal("vesdk_use_agfxmetal"),
        ConfigID_LoadImageOptimize("LoadImageOptimize"),
        ConfigID_GraphRefactor("s_bGraphRefactor"),
        ConfigID_EnableCompileByte264("compile_probe_use_byte264"),
        ConfigID_EnableByte264("use_byte264"),
        ConfigID_ColorSpaceRepair("color_space"),
        ConfigID_ColorSpaceRepairFor2020("ve_color_space_for_2020"),
        ConfigID_NewAudioMixer("vesdk_audiomix_replace"),
        ConfigID_OptimizeSRVUM("optimize srv_um crash"),
        ConfigID_AudioHwEncoder("vesdk_audio_hw_encoder"),
        ConfigID_SetStickerResolutionWithHeight("SetStickerResolutionWithHeight"),
        ConfigID_EnableMultiThreadDecode("EnableMultiThreadDecode"),
        ConfigID_EnableAudioGBURefactor("ve_enable_audio_gbu_refactor"),
        ConfigID_EnableHWPlaybackDropFrame("ve_enable_hwdecode_playback_dropframe_opt"),
        ConfigID_EnableSeekAndPreloadOpt("EnableSeekAndPreloadOpt"),
        ConfigID_EnableHdrVsOptimization("veabtest_hdr_vs_optimization"),
        ConfigID_EnableApplHdrSupport("vesdk_enable_apple_hdr_support"),
        ConfigID_EnableFileInfoCache("ve_enable_file_info_cache"),
        ConfigID_PinRefactor("ve_enable_pin_refactor"),
        ConfigID_EnablePBO("EnablePBO"),
        ConfigID_EnableHdrToneMapping("EnableHdrToneMapping"),
        ConfigID_CreateDecoderByName("create_by_codec_name"),
        ConfigID_EnableDisplayP3ReEncode("ve_enable_p3_re_encode"),
        ConfigID_EnableDisplayP3Render("EnableDisplayP3Render"),
        ConfigID_EnableAudioDisplayCallBack("EnableAudioDisplayCallBack"),
        ConfigID_EnableTransitionKeyframe("EnableTransitionKeyframe"),
        ConfigID_EnableCrossplatInputCompile("EnableCrossplatInputCompile"),
        ConfigID_CompileReport("ve_compile_report"),
        ConfigID_EnableiOSEditFirstFrameOpt("veabtest_crossplatEditFirstFrameOptimize"),
        ConfigID_EnableSkipUnitPassthrough("EnableSkipUnitPassthrough"),
        ConfigID_EnableReEncodeOpt("EnableReEncodeOpt"),
        ConfigID_ForceDetectFace("ve_enable_face_detection"),
        ConfigID_EnableStickerAmazing("EnableStickerAmazing"),
        ConfigID_EnableGlobalEffect("EnableGlobalEffect"),
        ConfigID_EnableAdaptiveEncodeLevel("ve_enable_adaptive_encode_level"),
        ConfigID_EnableImportParallelCompile("veEnableImportParallelCompile"),
        ConfigID_StickerPinPreviewMode("StickerPinPreviewMode"),
        ConfigID_VeabtestEnableupsamplingopt("veabtest_enableUpSamplingOpt"),
        ConfigID_VeabtestEnablepreviewqualityopt("veabtest_enablePreviewQualityOpt"),
        ConfigID_VeabtestEnablecrossplatcanvasopt("veabtest_enableCrossplatCanvasOpt"),
        ConfigID_VeabtestEnablecrossplatcanvasdownscaleopt("veabtest_enableCrossplatCanvasDownscaleOpt");
        

        /* renamed from: a */
        private String f191170a;

        public final String value() {
            return this.f191170a;
        }

        static {
            Covode.recordClassIndex(99508);
        }

        private EnumC85396a(String str) {
            this.f191170a = str;
        }
    }

    /* renamed from: com.ss.android.vesdk.bh$b */
    public enum EnumC85397b {
        BOOLEAN(0),
        INTEGER(1);
        

        /* renamed from: a */
        private int f191172a;

        public final int value() {
            return this.f191172a;
        }

        static {
            Covode.recordClassIndex(99509);
        }

        private EnumC85397b(int i) {
            this.f191172a = i;
        }
    }

    /* renamed from: a */
    public final C85398c<?>[] mo130885a() {
        Collection<C85398c<?>> values = this.f191168a.values();
        C85398c<?>[] cVarArr = new C85398c[values.size()];
        values.toArray(cVarArr);
        return cVarArr;
    }

    /* renamed from: com.ss.android.vesdk.bh$c */
    public static class C85398c<T> {

        /* renamed from: a */
        public EnumC85397b f191173a;

        /* renamed from: b */
        public T f191174b;

        /* renamed from: c */
        public EnumC85396a f191175c;

        static {
            Covode.recordClassIndex(99510);
        }

        public final String toString() {
            return "VEUserConfigItem{dataType=" + this.f191173a + ", value=" + ((Object) this.f191174b) + ", id=" + this.f191175c + '}';
        }

        public C85398c(EnumC85396a aVar, T t) {
            if (t instanceof Boolean) {
                this.f191173a = EnumC85397b.BOOLEAN;
            } else if (t instanceof Integer) {
                this.f191173a = EnumC85397b.INTEGER;
            } else {
                throw new IllegalArgumentException("illegal value type");
            }
            this.f191175c = aVar;
            this.f191174b = t;
        }
    }

    /* renamed from: a */
    public final C85395bh mo130884a(C85398c<?> cVar) {
        this.f191168a.put(cVar.f191175c, cVar);
        return this;
    }
}
