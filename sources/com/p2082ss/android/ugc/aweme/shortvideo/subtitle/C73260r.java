package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3487n.C61293b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65429dl;
import com.p2082ss.android.ugc.aweme.property.C65495r;
import com.p2082ss.android.ugc.aweme.property.C65496s;
import com.p2082ss.android.ugc.aweme.property.C65497t;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73849b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.ttuploader.TTVideoInfo;
import com.p2082ss.ttuploader.TTVideoUploader;
import com.p2082ss.ttuploader.TTVideoUploaderListener;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.r */
public final class C73260r {

    /* renamed from: a */
    public static final C73261a f164507a = new C73261a((byte) 0);

    /* renamed from: b */
    private final C61293b f164508b = new C61293b();

    /* renamed from: c */
    private volatile C85581w f164509c;

    /* renamed from: d */
    private final AbstractC89244h f164510d = C89250i.m154773a((AbstractC89171a) C73263c.f164514a);

    static {
        Covode.recordClassIndex(85978);
    }

    /* renamed from: c */
    private final SubtitleApi m129322c() {
        return (SubtitleApi) this.f164510d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.r$a */
    public static final class C73261a {
        static {
            Covode.recordClassIndex(85979);
        }

        private C73261a() {
        }

        /* renamed from: a */
        public static void m129327a() {
            C73991bj.m130133d("RecognizeCaptionExecutor delete audio file");
            C80720e.m139931c(new File(C70638dj.f158101d + "output.aac").getPath());
            C80720e.m139931c(new File(C70638dj.f158101d + "origin.aac").getPath());
            C80720e.m139931c(new File(C70638dj.f158101d + "outputmix.aac").getPath());
        }

        public /* synthetic */ C73261a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C73230i<String> mo115776a(String str, int i, int i2) {
        C89219l.m154721d(str, "");
        try {
            T t = m129322c().submit(str, i, i2).execute().f52262b;
            if (t != null) {
                if (t.f164519a != 0 || t.f164520b.f164501a.length() <= 0) {
                    return new C73230i<>(1, null, null, 6);
                }
                return new C73230i<>(0, null, t.f164520b.f164501a, 3);
            }
        } catch (Exception e) {
            C73991bj.m130129a(e);
        }
        return new C73230i<>(-1, null, null, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.r$c */
    static final class C73263c extends AbstractC89220m implements AbstractC89171a<SubtitleApi> {

        /* renamed from: a */
        public static final C73263c f164514a = new C73263c();

        static {
            Covode.recordClassIndex(85981);
        }

        C73263c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SubtitleApi invoke() {
            AbstractC63196au C = C63244g.m114602a().mo73257C();
            AVApi b = AVApiImpl.m123134b();
            C89219l.m154716b(b, "");
            String a = b.mo109850a();
            C89219l.m154716b(a, "");
            return C.createRetrofit(a, true, SubtitleApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.r$b */
    public static final class C73262b implements VEListener.AbstractC85248q {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f164511a;

        /* renamed from: b */
        final /* synthetic */ String f164512b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f164513c;

        static {
            Covode.recordClassIndex(85980);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileDone() {
            this.f164511a.element = (T) this.f164512b;
            C73991bj.m130133d("RecognizeCaptionExecutor extractAudio compile audio done streamAudioPath " + ((String) this.f164511a.element));
            this.f164513c.countDown();
        }

        C73262b(C89233z.C89238e eVar, String str, CountDownLatch countDownLatch) {
            this.f164511a = eVar;
            this.f164512b = str;
            this.f164513c = countDownLatch;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            C73991bj.m130131b("RecognizeCaptionExecutor subtitle mix fail, code =".concat(String.valueOf(i)));
            this.f164513c.countDown();
        }
    }

    /* renamed from: b */
    public final void mo115777b() {
        C73991bj.m130133d("RecognizeCaptionExecutor stopExtractAudio mVeEditor: " + this.f164509c);
        C85581w wVar = this.f164509c;
        if (wVar != null) {
            wVar.mo131696h();
        }
        C85581w wVar2 = this.f164509c;
        if (wVar2 != null) {
            wVar2.mo131703j();
        }
        this.f164509c = null;
    }

    /* renamed from: a */
    public static C73230i<C65616g> m129318a() {
        try {
            return new C73230i<>(0, "", new TTUploaderService().mo110066a().get());
        } catch (Exception e) {
            C73991bj.m130129a(e);
            return new C73230i<>(1, "request upload config failed", null, 4);
        }
    }

    /* renamed from: a */
    private static boolean m129321a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C73230i<List<C75313h>> mo115775a(String str) {
        C89219l.m154721d(str, "");
        try {
            T t = m129322c().query(str).execute().f52262b;
            if (t != null) {
                if (t.f164519a == 0) {
                    return new C73230i<>(0, null, t.f164520b.f164504d, 3);
                }
                return new C73230i<>(t.f164519a, null, null, 6);
            }
        } catch (Exception e) {
            C73991bj.m130129a(e);
        }
        return new C73230i<>(-1, null, null, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.r$d */
    public static final class C73264d implements TTVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ C65614f f164515a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f164516b;

        /* renamed from: c */
        final /* synthetic */ TTVideoUploader f164517c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f164518d;

        static {
            Covode.recordClassIndex(85982);
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final String getStringFromExtern(int i) {
            return null;
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onLog(int i, int i2, String str) {
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onUploadVideoStage(int i, long j) {
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final int videoUploadCheckNetState(int i, int i2) {
            return C73849b.m129923a(this.f164515a, "SubtitleOriginalSoundUpload");
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i == 0) {
                C89233z.C89238e eVar = this.f164516b;
                if (tTVideoInfo == null) {
                    C89219l.m154715b();
                }
                eVar.element = (T) tTVideoInfo.mTosKey;
            } else if (i != 2) {
                return;
            }
            this.f164517c.close();
            this.f164518d.countDown();
        }

        C73264d(C65614f fVar, C89233z.C89238e eVar, TTVideoUploader tTVideoUploader, CountDownLatch countDownLatch) {
            this.f164515a = fVar;
            this.f164516b = eVar;
            this.f164517c = tTVideoUploader;
            this.f164518d = countDownLatch;
        }
    }

    /* renamed from: a */
    private static int m129317a(String str, String str2) {
        if (C65429dl.m117146a()) {
            return C61293b.m110947a("Caption", str, str2, C65496s.m117220a(), C65495r.m117219a(), C65497t.m117221a());
        }
        return C61293b.m110947a("Caption", str, str2, 1, -1, 16000);
    }

    /* renamed from: a */
    public static C73230i<String> m129319a(String str, C65614f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        if (VEUtils.checkAudioFile(str) != 0) {
            return new C73230i<>(1, "audio file is not valid", null, 4);
        }
        TTVideoUploader tTVideoUploader = new TTVideoUploader();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        try {
            tTVideoUploader.setListener(new C73264d(fVar, eVar, tTVideoUploader, countDownLatch));
            tTVideoUploader.setMaxFailTime(fVar.f147893h);
            tTVideoUploader.setSliceSize(fVar.f147891f);
            tTVideoUploader.setFileUploadDomain(fVar.f147887b);
            tTVideoUploader.setVideoUploadDomain(fVar.f147888c);
            tTVideoUploader.setSliceTimeout(fVar.f147889d);
            tTVideoUploader.setPathName(str);
            tTVideoUploader.setFileRetryCount(1);
            tTVideoUploader.setUserKey(fVar.f147878A);
            tTVideoUploader.setAuthorization(fVar.f147879B);
            tTVideoUploader.setSocketNum(1);
            tTVideoUploader.start();
            try {
                countDownLatch.await(40000, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                C73991bj.m130129a(e);
            }
            T t = eVar.element;
            if (t == null || t.length() == 0) {
                return new C73230i<>(1, "upload failed", null, 4);
            }
            return new C73230i<>(0, null, eVar.element, 3);
        } catch (Exception e2) {
            tTVideoUploader.close();
            return new C73230i<>(1, String.valueOf(e2.getMessage()), null, 4);
        }
    }

    /* renamed from: a */
    private static void m129320a(EditPreviewInfo editPreviewInfo, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        int size = editPreviewInfo.getVideoList().size();
        for (int i = 0; i < size; i++) {
            EditVideoSegment editVideoSegment = editPreviewInfo.getVideoList().get(i);
            strArr[i] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    C89219l.m154715b();
                }
                jArr[i] = videoCutInfo.getStart();
                jArr2[i] = videoCutInfo.getEnd();
                fArr[i] = videoCutInfo.getSpeed();
            } else {
                jArr[i] = -1;
                jArr2[i] = -1;
                fArr[i] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() > 0 || editPreviewInfo.getSceneOut() > 0) {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
            return;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
    }

    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73230i<java.lang.String> mo115774a(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r35, int r36, int r37, int r38, int r39, p4600h.p4611f.p4612a.AbstractC89171a<java.lang.Boolean> r40) {
        /*
        // Method dump skipped, instructions count: 990
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73260r.mo115774a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int, int, int, int, h.f.a.a):com.ss.android.ugc.aweme.shortvideo.subtitle.i");
    }
}
