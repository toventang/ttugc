package com.p2082ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65329a;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65441dx;
import com.p2082ss.android.ugc.aweme.property.C65446eb;
import com.p2082ss.android.ugc.aweme.property.C65475h;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69892bn;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72775au;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4050b.C77264a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import dmt.p4542av.video.C88168aj;
import java.io.File;
import java.io.InputStream;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
public final class ImVideoCompileService {
    public static final Companion Companion = new Companion(null);
    public static final AbstractC89244h instance$delegate = C89250i.m154773a((AbstractC89171a) ImVideoCompileService$Companion$instance$2.INSTANCE);
    private static final String sDir = (C80720e.m139928c(C80720e.f180465a) + "/im/video/");
    public boolean isHardCodeFallback;

    /* renamed from: com_ss_android_ugc_aweme_services_video_ImVideoCompileService_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m120132x620521f(String str, String str2) {
        return 0;
    }

    public static final ImVideoCompileService getInstance() {
        return Companion.getInstance();
    }

    private final int toVESDKVideoBitrateFromSyntheticVideoBitrate(float f) {
        return (int) (f * 4.0f * 1000.0f * 1000.0f);
    }

    private final int toVESDKVideoBitrateFromSyntheticVideoQuality(int i) {
        return i;
    }

    /* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(80019);
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final ImVideoCompileService getInstance() {
            return (ImVideoCompileService) ImVideoCompileService.instance$delegate.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    private final VEVideoEncodeSettings.ENCODE_PROFILE getEncodeProfile() {
        VEVideoEncodeSettings.ENCODE_PROFILE b = C72775au.m128327b();
        C89219l.m154716b(b, "");
        return b;
    }

    private final C89378p<Integer, Integer> getDefaultOutputVideoSize() {
        return C89387v.m154943a(720, 1280);
    }

    private final C89378p<VEVideoEncodeSettings.ENCODE_BITRATE_MODE, Integer> getSoftEncodeBitrateConfig() {
        return new C89378p<>(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, Integer.valueOf(toVESDKVideoBitrateFromSyntheticVideoQuality(C65446eb.m117165a())));
    }

    private final boolean getUseHardwareEncode() {
        if (!C65357b.m117046b() || C65357b.f147489a || this.isHardCodeFallback) {
            return false;
        }
        return true;
    }

    public final C85581w createVEEditor() {
        C85581w wVar = new C85581w(getCompileWorkSpace());
        wVar.mo131618a(false);
        wVar.mo131678d(0);
        wVar.mo131684e(true);
        return wVar;
    }

    public final String getOutputVideoFilePath() {
        String str = sDir;
        C80720e.m139917a(str, false);
        return str + System.currentTimeMillis();
    }

    static {
        Covode.recordClassIndex(80018);
    }

    private final String getCompileWorkSpace() {
        File a = C80720e.m139917a(sDir + "compile/", false);
        C89219l.m154716b(a, "");
        String absolutePath = a.getAbsolutePath();
        C89219l.m154716b(absolutePath, "");
        return absolutePath;
    }

    private final C89378p<VEVideoEncodeSettings.ENCODE_BITRATE_MODE, Integer> getHardEncodeBitrateConfig() {
        C65329a aVar = C63238c.f143572J;
        C89219l.m154716b(aVar, "");
        float f = aVar.f147453a;
        if (f <= 0.0f) {
            f = C65441dx.m117160a();
        }
        return new C89378p<>(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, Integer.valueOf(toVESDKVideoBitrateFromSyntheticVideoBitrate(f)));
    }

    private final AbstractC88979t<Boolean> getVideoWidthHeight(IAVProcessService.CompileParam compileParam) {
        AbstractC88979t<Boolean> a = AbstractC88979t.m154294a(new ImVideoCompileService$getVideoWidthHeight$1(this, compileParam));
        C89219l.m154716b(a, "");
        return a;
    }

    private final <T> void safeOnComplete(AbstractC88982v<T> vVar) {
        if (!vVar.isDisposed()) {
            vVar.mo143023a();
        }
    }

    private final boolean enableRemux(IAVProcessService.CompileParam compileParam) {
        if (C88168aj.m153239c(compileParam.getRawVideoPath()) * 1000 > C65475h.m117202a()) {
            return true;
        }
        return false;
    }

    public final AbstractC88979t<IAVProcessService.CompileResult> compileImVideo(IAVProcessService.CompileParam compileParam) {
        C89219l.m154721d(compileParam, "");
        AbstractC88979t<IAVProcessService.CompileResult> a = AbstractC88979t.m154294a(new ImVideoCompileService$compileImVideo$1(this, new IAVProcessService.CompileResult()));
        C89219l.m154716b(a, "");
        return a;
    }

    private final String getVideoFileMD5(String str) {
        File file = new File(str);
        m120132x620521f("ImVideoCompileService", "getVideoFileMD5: fileExist=" + file.exists());
        if (file.length() > 524288) {
            return C69892bn.m123463a(C77264a.m135062a((InputStream) C77264a.m135060a(new File(str))));
        }
        return C69892bn.m123461a(file);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_video_ImVideoCompileService_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m120133xa5e899ee(File file) {
        MethodCollector.m26663i(9730);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(9730);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(9730);
        return delete;
    }

    public final VEVideoEncodeSettings createEncodeSettings(IAVProcessService.CompileParam compileParam) {
        VEVideoEncodeSettings.C85292a aVar = new VEVideoEncodeSettings.C85292a(2);
        boolean useHardwareEncode = getUseHardwareEncode();
        aVar.mo130588b(useHardwareEncode);
        if (useHardwareEncode) {
            aVar.mo130579a(getEncodeProfile());
            C89378p<VEVideoEncodeSettings.ENCODE_BITRATE_MODE, Integer> hardEncodeBitrateConfig = getHardEncodeBitrateConfig();
            aVar.mo130577a(hardEncodeBitrateConfig.getFirst(), hardEncodeBitrateConfig.getSecond().intValue());
        } else {
            C89378p<VEVideoEncodeSettings.ENCODE_BITRATE_MODE, Integer> softEncodeBitrateConfig = getSoftEncodeBitrateConfig();
            aVar.mo130577a(softEncodeBitrateConfig.getFirst(), softEncodeBitrateConfig.getSecond().intValue());
        }
        C89378p<Integer, Integer> outputVideoSize = outputVideoSize(compileParam);
        aVar.mo130573a(outputVideoSize.getFirst().intValue(), outputVideoSize.getSecond().intValue());
        aVar.mo130583a(enableRemux(compileParam), true);
        VEVideoEncodeSettings d = aVar.mo130594d();
        C89219l.m154716b(d, "");
        return d;
    }

    public final C89378p<Integer, Integer> outputVideoSize(IAVProcessService.CompileParam compileParam) {
        if (compileParam.getVideoWidth() < 0 || compileParam.getVideoHeight() < 0) {
            C40970e.m82485a("ImVideoCompileService outputVideoSize use default");
            return getDefaultOutputVideoSize();
        }
        int videoWidth = compileParam.getVideoWidth();
        int videoHeight = compileParam.getVideoHeight();
        if (compileParam.getVideoWidth() > 720) {
            videoHeight = (int) ((((float) compileParam.getVideoHeight()) * 720.0f) / ((float) compileParam.getVideoWidth()));
            videoWidth = 720;
        } else if (compileParam.getVideoHeight() > 1280) {
            videoWidth = (int) ((((float) compileParam.getVideoWidth()) * 1280.0f) / ((float) compileParam.getVideoHeight()));
            videoHeight = 1280;
        }
        return C89387v.m154943a(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
    }

    public final <T> void safeOnSingleNext(AbstractC88982v<T> vVar, T t) {
        safeOnNext(vVar, t);
        safeOnComplete(vVar);
    }

    private final AbstractC88979t<Boolean> compileVideo(IAVProcessService.CompileParam compileParam, IAVProcessService.CompileResult compileResult) {
        AbstractC88979t<Boolean> a = AbstractC88979t.m154294a(new ImVideoCompileService$compileVideo$1(this, compileParam, compileResult));
        C89219l.m154716b(a, "");
        return a;
    }

    private final <T> void safeOnNext(AbstractC88982v<T> vVar, T t) {
        if (!vVar.isDisposed()) {
            vVar.mo143031a((Object) t);
        }
    }

    public final <T> void safeOnError(AbstractC88982v<T> vVar, Throwable th) {
        if (!vVar.isDisposed()) {
            vVar.mo143024a(th);
        }
    }

    public final int initVEEditor(C85581w wVar, String str) {
        C85315al.m146637a("VEEditor", "setEnableEffectTransition: false");
        TEInterface.setEnableEffectTransition(false);
        return wVar.mo131628a(new String[]{str}, (String[]) null, (String[]) null, C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r3 == null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void saveBitmapToLocal(android.graphics.Bitmap r6, java.lang.String r7) {
        /*
            r5 = this;
            r4 = 9726(0x25fe, float:1.3629E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0013
            m120133xa5e899ee(r1)
        L_0x0013:
            r3 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0030 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0030 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r0 = 80
            r6.compress(r1, r0, r2)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r2.flush()     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r2.close()     // Catch:{ Exception -> 0x003d }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x002a:
            r1 = move-exception
            r3 = r2
            goto L_0x004c
        L_0x002d:
            r0 = move-exception
            r3 = r2
            goto L_0x0031
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            com.p2082ss.android.ugc.aweme.p2730de.C40970e.m82487a(r0)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0045
            r3.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x003d:
            r0 = move-exception
            r0.printStackTrace()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0045:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0049:
            r1 = move-exception
            if (r3 == 0) goto L_0x0054
        L_0x004c:
            r3.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.video.ImVideoCompileService.saveBitmapToLocal(android.graphics.Bitmap, java.lang.String):void");
    }

    private final AbstractC88979t<String> getVideoCover(String str, int i, int i2) {
        AbstractC88979t<String> a = AbstractC88979t.m154294a(new ImVideoCompileService$getVideoCover$1(this, str, i, i2));
        C89219l.m154716b(a, "");
        return a;
    }

    public final Bitmap scaleBitmap(Bitmap bitmap, int i, int i2) {
        float f;
        float height;
        MethodCollector.m26663i(9882);
        if (i <= 0 || i2 <= 0 || bitmap.getWidth() < i || bitmap.getHeight() < i2) {
            MethodCollector.m26664o(9882);
            return bitmap;
        }
        if (bitmap.getWidth() < bitmap.getHeight()) {
            height = (float) i;
            f = (height / ((float) bitmap.getWidth())) * ((float) bitmap.getHeight());
        } else {
            f = (float) i2;
            height = (f / ((float) bitmap.getHeight())) * ((float) bitmap.getWidth());
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) height, (int) f, true);
        C89219l.m154716b(createScaledBitmap, "");
        MethodCollector.m26664o(9882);
        return createScaledBitmap;
    }

    static /* synthetic */ AbstractC88979t getVideoCover$default(ImVideoCompileService imVideoCompileService, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return imVideoCompileService.getVideoCover(str, i, i2);
    }
}
