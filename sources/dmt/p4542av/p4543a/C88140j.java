package dmt.p4542av.p4543a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEAudioEncodeSettings;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.p4543a.AbstractC88123a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.a.j */
public final class C88140j extends AbstractC88123a {

    /* renamed from: e */
    public static final C88141a f200052e = new C88141a((byte) 0);

    /* renamed from: f */
    private String f200053f;

    static {
        Covode.recordClassIndex(104168);
    }

    /* renamed from: dmt.av.a.j$a */
    public static final class C88141a {
        static {
            Covode.recordClassIndex(104169);
        }

        private C88141a() {
        }

        public /* synthetic */ C88141a(byte b) {
            this();
        }
    }

    /* renamed from: dmt.av.a.j$b */
    public static final class C88142b implements VEListener.AbstractC85248q {

        /* renamed from: a */
        final /* synthetic */ C88140j f200054a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f200055b;

        static {
            Covode.recordClassIndex(104170);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileProgress(float f) {
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileDone() {
            this.f200054a.f200027a = 0;
            this.f200055b.countDown();
        }

        C88142b(C88140j jVar, CountDownLatch countDownLatch) {
            this.f200054a = jVar;
            this.f200055b = countDownLatch;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
        public final void onCompileError(int i, int i2, float f, String str) {
            C89219l.m154721d(str, "");
            this.f200055b.countDown();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88140j(C88128c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: a */
    public final void mo142627a(VideoPublishEditModel videoPublishEditModel) {
        String str;
        C89219l.m154721d(videoPublishEditModel, "");
        super.mo142627a(videoPublishEditModel);
        StitchParams stitchParams = videoPublishEditModel.stitchParams;
        String str2 = null;
        if (stitchParams != null) {
            str = stitchParams.getConcatAudioPath();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = videoPublishEditModel.audioPath();
        } else {
            StitchParams stitchParams2 = videoPublishEditModel.stitchParams;
            if (stitchParams2 != null) {
                str2 = stitchParams2.getConcatAudioPath();
            }
        }
        this.f200053f = str2;
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: d */
    public final AbstractC88123a.C88125b mo142630d(VideoPublishEditModel videoPublishEditModel) {
        AbstractC88123a.C88125b.EnumC88126a aVar;
        AbstractC88123a.C88125b.EnumC88126a aVar2;
        C89219l.m154721d(videoPublishEditModel, "");
        if (C84902i.m145892a(this.f200053f)) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        String str = this.f200053f;
        if (str != null) {
            this.f200027a = VEUtils.transCodeAudio(str, videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        }
        if (C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        return new AbstractC88123a.C88125b("StitchSeparator", aVar, AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED, aVar2, this.f200027a);
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: c */
    public final AbstractC88123a.C88125b mo142629c(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        AbstractC88123a.C88125b.EnumC88126a aVar;
        AbstractC88123a.C88125b.EnumC88126a aVar2;
        C89219l.m154721d(videoPublishEditModel, "");
        boolean z2 = false;
        if (videoPublishEditModel.stitchParams == null || this.f200053f == null) {
            AbstractC88123a.C88125b.EnumC88126a aVar3 = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
            AbstractC88123a.C88125b.EnumC88126a aVar4 = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
            int i = this.f200027a;
            StringBuilder sb = new StringBuilder("model.stitchParams == null: ");
            if (videoPublishEditModel.stitchParams == null) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder append = sb.append(z).append("  mediaFile == null: ");
            if (this.f200053f == null) {
                z2 = true;
            }
            return new AbstractC88123a.C88125b("StitchSeparator", aVar3, aVar3, aVar4, i, append.append(z2).toString());
        }
        AbstractC88123a.C88125b.EnumC88126a aVar5 = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
        if (C84902i.m145892a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
            this.f200027a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            C85581w wVar = new C85581w(videoPublishEditModel.draftDir());
            wVar.mo131623a(new String[]{videoPublishEditModel.veAudioRecorderParam.getAudioUrl()}, new int[]{0}, new int[]{-1}, new float[]{1.0f});
            if (C84902i.m145892a(this.f200053f)) {
                aVar5 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
            } else {
                aVar5 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
            }
            String str = this.f200053f;
            int s = wVar.mo131723s();
            StitchParams stitchParams = videoPublishEditModel.stitchParams;
            if (stitchParams == null) {
                C89219l.m154715b();
            }
            int duration = s - ((int) stitchParams.getDuration());
            StitchParams stitchParams2 = videoPublishEditModel.stitchParams;
            if (stitchParams2 == null) {
                C89219l.m154715b();
            }
            int a = wVar.mo131608a(str, 0, duration, (int) stitchParams2.getDuration(), wVar.mo131723s(), false);
            wVar.mo131645a(0, 1, videoPublishEditModel.voiceVolume);
            wVar.mo131645a(a, 1, videoPublishEditModel.voiceVolume);
            wVar.mo131678d(1);
            VEAudioEncodeSettings.C85194a aVar6 = new VEAudioEncodeSettings.C85194a();
            aVar6.f190624b = 16000;
            aVar6.f190626d = 2;
            aVar6.f190625c = 128000;
            VEAudioEncodeSettings a2 = aVar6.mo130147a();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (wVar.mo131647a(videoPublishEditModel.mEncodedAudioOutputFile, a2, new C88142b(this, countDownLatch))) {
                try {
                    countDownLatch.await(40000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            wVar.mo131703j();
        }
        if (C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        return new AbstractC88123a.C88125b("StitchSeparator", aVar5, aVar, aVar2, this.f200027a, "hasOriginalSound = " + videoPublishEditModel.hasOriginalSound() + " \n voiceVolume: " + videoPublishEditModel.voiceVolume);
    }
}
