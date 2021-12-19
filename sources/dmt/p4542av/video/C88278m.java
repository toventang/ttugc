package dmt.p4542av.video;

import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65329a;
import com.p2082ss.android.ugc.aweme.property.C65345ao;
import com.p2082ss.android.ugc.aweme.property.C65346ap;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65380bt;
import com.p2082ss.android.ugc.aweme.property.C65402co;
import com.p2082ss.android.ugc.aweme.property.C65441dx;
import com.p2082ss.android.ugc.aweme.property.C65442dy;
import com.p2082ss.android.ugc.aweme.property.C65443dz;
import com.p2082ss.android.ugc.aweme.property.C65445ea;
import com.p2082ss.android.ugc.aweme.property.C65446eb;
import com.p2082ss.android.ugc.aweme.property.C65459en;
import com.p2082ss.android.ugc.aweme.property.C65472ey;
import com.p2082ss.android.ugc.aweme.property.C65475h;
import com.p2082ss.android.ugc.aweme.property.C65502y;
import com.p2082ss.android.ugc.aweme.publish.C65687t;
import com.p2082ss.android.ugc.aweme.settings.C68741g;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70973bm;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70979br;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72598ae;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72775au;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73838ab;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.m */
public final class C88278m {
    static {
        Covode.recordClassIndex(104313);
    }

    /* renamed from: a */
    private static final void m153405a(VEVideoEncodeSettings vEVideoEncodeSettings, VEWatermarkParam vEWatermarkParam, Integer num, SynthetiseResult synthetiseResult, String str, boolean z, Float f) {
        List<AbstractC72598ae> list;
        List<AbstractC72598ae> list2;
        vEVideoEncodeSettings.setWatermark(vEWatermarkParam);
        if ((str == null || ((list2 = synthetiseResult.smartCompileSettings) != null && !list2.isEmpty())) && num != null) {
            m153406a("modifySettings preCompileCrf: ".concat(String.valueOf(num)));
            vEVideoEncodeSettings.setVideoSWOptCrf(num.intValue());
        }
        if (f != null) {
            C73991bj.m130128a("HardcodeAdaptive -> modifySettings, use hardcoded adaptive strategies");
            return;
        }
        C73991bj.m130128a("HardcodeAdaptive -> modifySettings, use hardcoded strategies");
        if (!(num == null && str == null) && (((list = synthetiseResult.smartCompileSettings) == null || list.isEmpty()) && C68741g.m121174a())) {
            vEVideoEncodeSettings.setVideoHwEnc(false);
            m153406a("modifySettings sw");
        } else if (vEVideoEncodeSettings.isSupportHwEnc() && z) {
            vEVideoEncodeSettings.setVideoHwEnc(true);
            m153406a("modifySettings hw");
        }
    }

    /* renamed from: a */
    public static final boolean m153407a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.isPhotoMvMode && C65402co.C65403a.m117104a().f147549a) {
            return true;
        }
        AbstractC70977bq a = C70979br.m125332a(videoPublishEditModel);
        int b = a.mo112110b(false);
        int a2 = a.mo112107a(false);
        Math.max(b, a2);
        int min = Math.min(b, a2);
        int i = 720;
        int[] a3 = C65357b.m117044a(C65502y.m117230a());
        if (a3 != null) {
            Math.max(a3[0], a3[1]);
            i = Math.min(a3[0], a3[1]);
        }
        return min > i || C88168aj.m153239c(videoPublishEditModel.videoPath()) > C65475h.m117202a();
    }

    /* renamed from: a */
    public static final boolean m153408a(Object obj) {
        boolean z;
        boolean a = SettingsManager.m29616a().mo25400a("enable_high_quality_video", false);
        boolean a2 = C65687t.m117579a();
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if ((m153412d(videoPublishEditModel) && C65345ao.m117031a()) || (m153413e(videoPublishEditModel) && C65346ap.m117032a())) {
                z = true;
                if (a || !a2 || !z) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (a) {
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m153410b(VideoPublishEditModel videoPublishEditModel) {
        if (!m153407a(videoPublishEditModel) || !m153408a((Object) videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m153413e(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mOrigin == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$b */
    public static final class C88280b extends AbstractC89220m implements AbstractC89172b<CompileProbeResult, Integer> {

        /* renamed from: a */
        public static final C88280b f200313a = new C88280b();

        static {
            Covode.recordClassIndex(104315);
        }

        C88280b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(CompileProbeResult compileProbeResult) {
            return m153415a(compileProbeResult);
        }

        /* renamed from: a */
        public static Integer m153415a(CompileProbeResult compileProbeResult) {
            CompileProbeResult.ResultData data;
            if (compileProbeResult == null || compileProbeResult.getStatus().getState() != CompileProbeResult.State.SUCCESS || (data = compileProbeResult.getData()) == null) {
                return null;
            }
            return Integer.valueOf(data.getCrf());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$c */
    public static final class C88281c extends AbstractC89220m implements AbstractC89172b<HardcodeAdaptiveResult, Float> {

        /* renamed from: a */
        public static final C88281c f200314a = new C88281c();

        static {
            Covode.recordClassIndex(104316);
        }

        C88281c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Float invoke(HardcodeAdaptiveResult hardcodeAdaptiveResult) {
            return m153416a(hardcodeAdaptiveResult);
        }

        /* renamed from: a */
        public static Float m153416a(HardcodeAdaptiveResult hardcodeAdaptiveResult) {
            if (hardcodeAdaptiveResult == null || hardcodeAdaptiveResult.getPreBitrateStatus() == -1.0f) {
                return null;
            }
            return Float.valueOf(hardcodeAdaptiveResult.getPreBitrateStatus());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$f */
    public static final class C88284f extends AbstractC89220m implements AbstractC89172b<VEVideoEncodeSettings.C85292a, C89391z> {

        /* renamed from: a */
        public static final C88284f f200317a = new C88284f();

        static {
            Covode.recordClassIndex(104319);
        }

        C88284f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(VEVideoEncodeSettings.C85292a aVar) {
            m153419a(aVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m153419a(VEVideoEncodeSettings.C85292a aVar) {
            C89219l.m154721d(aVar, "");
            VEVideoEncodeSettings.ENCODE_PRESET a = C88241c.m153351a(C65445ea.m117164a());
            if (a != null) {
                aVar.mo130578a(a);
            }
        }
    }

    /* renamed from: a */
    private static final void m153406a(String str) {
        C73991bj.m130133d("SynthesisSettingsResolver" + ' ' + str);
    }

    /* renamed from: d */
    private static boolean m153412d(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!videoPublishEditModel.isUploadVideo() || videoPublishEditModel.isPhotoMvMode) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$a */
    public static final class C88279a extends AbstractC89220m implements AbstractC89172b<VideoPublishEditModel, C89391z> {

        /* renamed from: a */
        public static final C88279a f200312a = new C88279a();

        static {
            Covode.recordClassIndex(104314);
        }

        C88279a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(VideoPublishEditModel videoPublishEditModel) {
            m153414a(videoPublishEditModel);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m153414a(VideoPublishEditModel videoPublishEditModel) {
            C89219l.m154721d(videoPublishEditModel, "");
            if (videoPublishEditModel.compileProbeResult != null) {
                CompileProbeResult compileProbeResult = videoPublishEditModel.compileProbeResult;
                if (compileProbeResult == null) {
                    C89219l.m154715b();
                }
                if (compileProbeResult.getStatus().getState() == CompileProbeResult.State.SUCCESS) {
                    return;
                }
            }
            C73838ab.m129901a(videoPublishEditModel.uploadSpeedInfo);
        }
    }

    /* renamed from: c */
    public static final boolean m153411c(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        if (videoPublishEditModel.hasInfoStickers()) {
            C89219l.m154721d(videoPublishEditModel, "");
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        C89219l.m154716b(next, "");
                        if (!next.isTextSticker()) {
                            break;
                        }
                    }
                }
            }
            return true;
        }
        if (!C13617h.m24465a(videoPublishEditModel.mEffectList)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static final void m153401a(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings) {
        videoPublishEditModel.isSyntheticHardEncode = vEVideoEncodeSettings.getVideoCompileEncodeSetting().useHWEncoder;
    }

    /* renamed from: a */
    public static final void m153400a(VideoPublishEditModel videoPublishEditModel, C84425b bVar) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(bVar, "");
        if (videoPublishEditModel.uploadSpeedInfo != null) {
            C88279a.m153414a(videoPublishEditModel);
            bVar.mo129404a("upload_probe_speed", videoPublishEditModel.uploadSpeedInfo.getSpeed()).mo129403a("used_compiler_setting_group", videoPublishEditModel.uploadSpeedInfo.getUsedCompilerSettingGroup());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$e */
    public static final class C88283e extends AbstractC89220m implements AbstractC89183m<VideoPublishEditModel, VEVideoEncodeSettings.C85292a, C89391z> {

        /* renamed from: a */
        public static final C88283e f200316a = new C88283e();

        static {
            Covode.recordClassIndex(104318);
        }

        C88283e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.C85292a aVar) {
            m153418a(videoPublishEditModel, aVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m153418a(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.C85292a aVar) {
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(aVar, "");
            if (!C65357b.m117046b() || C65357b.f147489a) {
                aVar.mo130588b(false).mo130577a(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, C65446eb.m117165a());
            } else {
                C65329a aVar2 = C63238c.f143572J;
                C89219l.m154716b(aVar2, "");
                float f = aVar2.f147453a;
                if (f <= 0.0f) {
                    f = C65441dx.m117160a();
                }
                aVar.mo130588b(true).mo130577a(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, C88241c.m153350a(f));
                aVar.mo130579a(C72775au.m128327b());
            }
            aVar.mo130574a(C65443dz.m117162a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$g */
    public static final class C88285g extends AbstractC89220m implements AbstractC89183m<VideoPublishEditModel, VEVideoEncodeSettings.C85292a, C89391z> {

        /* renamed from: a */
        public static final C88285g f200318a = new C88285g();

        static {
            Covode.recordClassIndex(104320);
        }

        C88285g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.C85292a aVar) {
            m153420a(videoPublishEditModel, aVar);
            return C89391z.f203057a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m153420a(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2, com.p2082ss.android.vesdk.VEVideoEncodeSettings.C85292a r3) {
            /*
            // Method dump skipped, instructions count: 135
            */
            throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.C88278m.C88285g.m153420a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.vesdk.VEVideoEncodeSettings$a):void");
        }
    }

    /* renamed from: b */
    public static final void m153409b(VideoPublishEditModel videoPublishEditModel, C84425b bVar) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(bVar, "");
        CompileProbeResult compileProbeResult = videoPublishEditModel.compileProbeResult;
        if (compileProbeResult != null) {
            bVar.mo129403a("pre_code", compileProbeResult.getStatus().getVeCode()).mo129403a("pre_tools_code", compileProbeResult.getStatus().getToolsCode());
            CompileProbeResult.ResultData data = compileProbeResult.getData();
            if (data != null) {
                bVar.mo129403a("pre_crf", data.getCrf()).mo129405a("pre_bitrate", Float.valueOf(data.getVideoBitrate())).mo129403a("pre_duration", data.getDurationMs()).mo129405a("min_optBitrate", Float.valueOf(data.getOptBitrateFromVE().getMinOptBitrate())).mo129405a("optBitrate", Float.valueOf(data.getOptBitrateFromVE().getOptBitrate())).mo129405a("min_optBitrate_HD", Float.valueOf(data.getOptBitrateFromVE().getMinOptBitrateHD())).mo129405a("optBitrate_HD", Float.valueOf(data.getOptBitrateFromVE().getOptBitrateHD()));
            }
        }
    }

    /* renamed from: a */
    public static final void m153402a(VideoPublishEditModel videoPublishEditModel, Integer[] numArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(numArr, "");
        if (videoPublishEditModel.mWatermarkVideoWidth <= 0 || videoPublishEditModel.mWatermarkVideoHeight <= 0) {
            videoPublishEditModel.mWatermarkVideoWidth = numArr[0].intValue();
            boolean z2 = true;
            videoPublishEditModel.mWatermarkVideoHeight = numArr[1].intValue();
            long j = -1;
            String a = C65472ey.m117198a();
            if (a == null || a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            Object obj = null;
            if (!z) {
                try {
                    obj = C63238c.f143575b.mo46670a(a, WatermarkResSetting.class);
                } catch (Exception unused) {
                    C84911q.m145926b("Json AB ConfigError， Config:".concat(String.valueOf(a)));
                }
            }
            WatermarkResSetting watermarkResSetting = (WatermarkResSetting) obj;
            int i5 = -1;
            if (watermarkResSetting != null) {
                j = C80720e.m139940f();
                if (j >= ((long) watermarkResSetting.getMinAllowDiskMB()) * 1024 * 1024) {
                    AbstractC70977bq a2 = C70979br.m125332a(videoPublishEditModel);
                    i5 = a2.mo112110b(false);
                    i4 = a2.mo112107a(false);
                    int max = Math.max(i5, i4);
                    int min = Math.min(i5, i4);
                    i3 = watermarkResSetting.getHeight();
                    i2 = watermarkResSetting.getWidth();
                    int max2 = Math.max(i3, i2);
                    int min2 = Math.min(i3, i2);
                    if (max < max2 || min < min2) {
                        z2 = false;
                    } else if (videoPublishEditModel.mWatermarkVideoWidth >= videoPublishEditModel.mWatermarkVideoHeight) {
                        videoPublishEditModel.mWatermarkVideoWidth = max2;
                        videoPublishEditModel.mWatermarkVideoHeight = min2;
                    } else {
                        videoPublishEditModel.mWatermarkVideoWidth = min2;
                        videoPublishEditModel.mWatermarkVideoHeight = max2;
                    }
                } else {
                    i4 = -1;
                    z2 = false;
                    i2 = -1;
                    i3 = -1;
                }
                i = i5;
                i5 = i4;
            } else {
                i = -1;
                z2 = false;
                i2 = -1;
                i3 = -1;
            }
            C73991bj.m130128a("CalculateWatermarkSize useWatermarkSetting:" + z2 + ' ' + "sourceWidth:" + i5 + " sourceHeight:" + i + ' ' + "targetWidth:" + i2 + " targetHeight:" + i3 + ' ' + "width:" + videoPublishEditModel.mWatermarkVideoWidth + " height:" + videoPublishEditModel.mWatermarkVideoHeight + ' ' + "sdAvailableSize:" + j);
            return;
        }
        C73991bj.m130128a("CalculateWatermarkSize exist width:" + videoPublishEditModel.mWatermarkVideoWidth + " height:" + videoPublishEditModel.mWatermarkVideoHeight + ' ');
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$h */
    public static final class C88286h extends AbstractC89220m implements AbstractC89187q<VideoPublishEditModel, VEVideoEncodeSettings.C85292a, Integer[], C89391z> {

        /* renamed from: a */
        public static final C88286h f200319a = new C88286h();

        static {
            Covode.recordClassIndex(104321);
        }

        C88286h() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.C85292a aVar, Integer[] numArr) {
            m153421a(videoPublishEditModel, aVar, numArr);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m153421a(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.C85292a aVar, Integer[] numArr) {
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(numArr, "");
            C88278m.m153402a(videoPublishEditModel, numArr);
            aVar.mo130586b(videoPublishEditModel.mWatermarkVideoWidth, videoPublishEditModel.mWatermarkVideoHeight);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$d */
    public static final class C88282d extends AbstractC89220m implements AbstractC89187q<VideoPublishEditModel, int[], VEVideoEncodeSettings.C85292a, C89391z> {

        /* renamed from: a */
        public static final C88282d f200315a = new C88282d();

        static {
            Covode.recordClassIndex(104317);
        }

        C88282d() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(VideoPublishEditModel videoPublishEditModel, int[] iArr, VEVideoEncodeSettings.C85292a aVar) {
            m153417a(videoPublishEditModel, iArr, aVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m153417a(VideoPublishEditModel videoPublishEditModel, int[] iArr, VEVideoEncodeSettings.C85292a aVar) {
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(iArr, "");
            C89219l.m154721d(aVar, "");
            if (C71817eu.m126804o(videoPublishEditModel) || (C70973bm.m125284a(videoPublishEditModel) && (iArr[0] > videoPublishEditModel.videoWidth() || iArr[1] > videoPublishEditModel.videoHeight()))) {
                aVar.mo130597f(3).mo130571a().mo130584b();
            } else if (videoPublishEditModel.isFastImport || videoPublishEditModel.isDuet() || videoPublishEditModel.isStitchMode()) {
                aVar.mo130597f(1);
            }
            if (videoPublishEditModel.canvasVideoData != null) {
                aVar.mo130597f(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.m$i */
    public static final class C88287i extends AbstractC89220m implements AbstractC89187q<VideoPublishEditModel, String, VEVideoEncodeSettings.C85292a, C89391z> {

        /* renamed from: a */
        public static final C88287i f200320a = new C88287i();

        static {
            Covode.recordClassIndex(104322);
        }

        C88287i() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(VideoPublishEditModel videoPublishEditModel, String str, VEVideoEncodeSettings.C85292a aVar) {
            m153422a(videoPublishEditModel, str, aVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m153422a(VideoPublishEditModel videoPublishEditModel, String str, VEVideoEncodeSettings.C85292a aVar) {
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar, "");
            if (videoPublishEditModel.mOrigin == 1) {
                if (C71817eu.m126804o(videoPublishEditModel)) {
                    aVar.mo130582a(false);
                    return;
                }
                File file = new File(str);
                if (!file.exists() || !file.isDirectory()) {
                    file.mkdirs();
                }
                aVar.mo130582a(true);
            } else if (videoPublishEditModel.isUseMultiEdit()) {
                aVar.mo130583a(false, C65459en.m117178a());
            }
        }
    }

    /* renamed from: a */
    private static final void m153404a(VEVideoEncodeSettings vEVideoEncodeSettings, VideoPublishEditModel videoPublishEditModel, HardcodeAdaptiveResult hardcodeAdaptiveResult) {
        CompileProbeResult.ResultData data;
        float optBitrate;
        CompileProbeResult compileProbeResult = videoPublishEditModel.compileProbeResult;
        if (!hardcodeAdaptiveResult.getNeedSetHwOptBitrate() || compileProbeResult == null || ((data = compileProbeResult.getData()) != null && data.getVersion() == 1)) {
            C73991bj.m130128a("HardcodeAdaptive -> SynthesisSettingResolver: isHardcodeAdaptiveV2() = " + C65380bt.m117077a() + " and needSetHwOptBitrate = " + hardcodeAdaptiveResult.getNeedSetHwOptBitrate());
            videoPublishEditModel.hardcodeAdaptiveResult = null;
            return;
        }
        boolean a = m153408a((Object) videoPublishEditModel);
        CompileProbeResult.ResultData data2 = compileProbeResult.getData();
        if (data2 != null) {
            OptBitrateFromVE optBitrateFromVE = data2.getOptBitrateFromVE();
            if (a) {
                optBitrate = optBitrateFromVE.getOptBitrateHD();
            } else {
                optBitrate = optBitrateFromVE.getOptBitrate();
            }
            float videoHWoptBitrate = vEVideoEncodeSettings.setVideoHWoptBitrate(Math.min(data2.getEncodeWidth(), data2.getEncodeHeight()), optBitrate, a);
            hardcodeAdaptiveResult.setHwOptBitrate(optBitrate);
            hardcodeAdaptiveResult.setPreBitrateStatus(videoHWoptBitrate);
            videoPublishEditModel.hardcodeAdaptiveResult = hardcodeAdaptiveResult;
            C73991bj.m130128a("HardcodeAdaptive -> SynthesisSettingResolver: setVideoHWoptBitrate(" + optBitrate + "); preBitrateStatus = " + videoHWoptBitrate);
        }
    }

    /* renamed from: a */
    public static final VEVideoEncodeSettings m153398a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, VEWatermarkParam vEWatermarkParam, AbstractC31071f fVar, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(synthetiseResult, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        boolean A = fVar.mo56240A();
        String str2 = fVar.mo56300a().f191680a;
        C89219l.m154716b(str2, "");
        VEVideoEncodeSettings a = m153399a(videoPublishEditModel, synthetiseResult, vEWatermarkParam, str2, A);
        List<AbstractC72598ae> list = synthetiseResult.smartCompileSettings;
        if (list != null && !list.isEmpty() && (C89070n.m154579f((List) list) instanceof AbstractC72598ae.C72600b) && !fVar.mo56314a(a) && list.size() >= 2) {
            List<AbstractC72598ae> list2 = synthetiseResult.smartCompileSettings;
            if (list2 != null) {
                list2.remove(0);
            }
            m153406a("resetExternalSettings");
            String str3 = fVar.mo56300a().f191680a;
            C89219l.m154716b(str3, "");
            a = m153399a(videoPublishEditModel, synthetiseResult, vEWatermarkParam, str3, A);
        }
        List<AbstractC72598ae> list3 = synthetiseResult.smartCompileSettings;
        if (list3 != null && !list3.isEmpty()) {
            C84425b a2 = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("publish_id", str);
            List<AbstractC72598ae> list4 = synthetiseResult.smartCompileSettings;
            if (list4 == null) {
                C89219l.m154715b();
            }
            C39162r.m79460a("smart_compile_result", a2.mo129406a("compile_label", list4.get(0).f162756a).f188764a);
        }
        return a;
    }

    /* renamed from: a */
    private static final VEVideoEncodeSettings m153399a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, VEWatermarkParam vEWatermarkParam, String str, boolean z) {
        Integer a = C88280b.m153415a(videoPublishEditModel.compileProbeResult);
        String a2 = C73838ab.m129901a(videoPublishEditModel.uploadSpeedInfo);
        HardcodeAdaptiveResult hardcodeAdaptiveResult = new HardcodeAdaptiveResult(0.0f, 0.0f, false, 7, null);
        VEVideoEncodeSettings d = m153397a(videoPublishEditModel, synthetiseResult, a, a2, str, hardcodeAdaptiveResult).mo130594d();
        C89219l.m154716b(d, "");
        m153404a(d, videoPublishEditModel, hardcodeAdaptiveResult);
        m153405a(d, vEWatermarkParam, a, synthetiseResult, a2, z, C88281c.m153416a(videoPublishEditModel.hardcodeAdaptiveResult));
        m153401a(videoPublishEditModel, d);
        return d;
    }

    /* renamed from: a */
    private static final VEVideoEncodeSettings.C85292a m153397a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, Integer num, String str, String str2, HardcodeAdaptiveResult hardcodeAdaptiveResult) {
        int[] b = C88257f.m153369b(videoPublishEditModel);
        VEVideoEncodeSettings.C85292a aVar = new VEVideoEncodeSettings.C85292a(2);
        aVar.mo130598g(C65442dy.m117161a());
        aVar.mo130573a(b[0], b[1]);
        C88282d.m153417a(videoPublishEditModel, b, aVar);
        C88283e.m153418a(videoPublishEditModel, aVar);
        C88284f.m153419a(aVar);
        C88285g.m153420a(videoPublishEditModel, aVar);
        C88286h.m153421a(videoPublishEditModel, aVar, new Integer[]{Integer.valueOf(b[0]), Integer.valueOf(b[1])});
        m153403a(aVar, synthetiseResult, num, str, videoPublishEditModel, hardcodeAdaptiveResult);
        C88287i.m153422a(videoPublishEditModel, str2, aVar);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m153403a(com.p2082ss.android.vesdk.VEVideoEncodeSettings.C85292a r8, com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult r9, java.lang.Integer r10, java.lang.String r11, com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, com.p2082ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult r13) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.C88278m.m153403a(com.ss.android.vesdk.VEVideoEncodeSettings$a, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult):void");
    }
}
