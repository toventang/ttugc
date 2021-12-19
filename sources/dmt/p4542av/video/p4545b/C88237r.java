package dmt.p4542av.video.p4545b;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31079j;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import dmt.p4542av.video.VEPreviewMusicParams;
import dmt.p4542av.video.VEPreviewParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.r */
public final class C88237r extends AbstractC88181j {

    /* renamed from: H */
    private int f200261H;

    /* renamed from: I */
    private int f200262I;

    /* renamed from: J */
    private int f200263J = -1;

    /* renamed from: K */
    private int f200264K = -1;

    /* renamed from: L */
    private int f200265L = -1;

    /* renamed from: M */
    private int f200266M = -1;

    /* renamed from: N */
    private int f200267N = -1;

    /* renamed from: O */
    private int f200268O = -1;

    /* renamed from: P */
    private int f200269P = -1;

    /* renamed from: Q */
    private int f200270Q;

    /* renamed from: R */
    private int f200271R;

    /* renamed from: S */
    private int f200272S = -1;

    static {
        Covode.recordClassIndex(104272);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C88237r(dmt.p4542av.video.p4545b.C88238s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82247d()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r2.<init>(r3, r0)
            r0 = -1
            r2.f200263J = r0
            r2.f200264K = r0
            r2.f200265L = r0
            r2.f200266M = r0
            r2.f200267N = r0
            r2.f200268O = r0
            r2.f200269P = r0
            r2.f200272S = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.C88237r.<init>(dmt.av.video.b.s):void");
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142732a(VEVolumeChangeOp vEVolumeChangeOp) {
        C89219l.m154721d(vEVolumeChangeOp, "");
        if (vEVolumeChangeOp.mStart < 0 || vEVolumeChangeOp.mEnd < 0 || vEVolumeChangeOp.mStart >= vEVolumeChangeOp.mEnd) {
            if (vEVolumeChangeOp.mType == 0) {
                mo142743c().mo56313a(mo142743c().mo56300a().f191689j, mo142743c().mo56300a().f191690k, vEVolumeChangeOp.mVolume);
            } else if (vEVolumeChangeOp.mType == 1) {
                mo142743c().mo56313a(this.f200148i, 1, vEVolumeChangeOp.mVolume);
            }
            return false;
        }
        m153345a(mo142743c(), vEVolumeChangeOp);
        return false;
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final boolean mo142733a(VEPreviewMusicParams vEPreviewMusicParams) {
        C89219l.m154721d(vEPreviewMusicParams, "");
        if (this.f200148i != -1) {
            mo142743c().mo56351e(this.f200148i);
            this.f200148i = -1;
        }
        if (vEPreviewMusicParams.f200081a == null) {
            return false;
        }
        if (vEPreviewMusicParams.f200084d <= 0 || Math.abs(vEPreviewMusicParams.f200083c - vEPreviewMusicParams.f200084d) < 1000) {
            AbstractC31071f c = mo142743c();
            String str = vEPreviewMusicParams.f200081a;
            C89219l.m154716b(str, "");
            this.f200148i = c.mo56287a(str, vEPreviewMusicParams.f200082b, vEPreviewMusicParams.f200082b + vEPreviewMusicParams.f200083c, false);
        } else {
            AbstractC31071f c2 = mo142743c();
            String str2 = vEPreviewMusicParams.f200081a;
            C89219l.m154716b(str2, "");
            this.f200148i = c2.mo56287a(str2, vEPreviewMusicParams.f200082b, vEPreviewMusicParams.f200082b + vEPreviewMusicParams.f200084d, false);
        }
        mo142743c().mo56313a(this.f200148i, 1, vEPreviewMusicParams.f200085e);
        if (vEPreviewMusicParams.f200090j >= 0 && vEPreviewMusicParams.f200091k >= 0 && vEPreviewMusicParams.f200090j < vEPreviewMusicParams.f200091k) {
            VEAudioVolumeFilterParam vEAudioVolumeFilterParam = new VEAudioVolumeFilterParam();
            vEAudioVolumeFilterParam.volume = 0.0f;
            if (vEPreviewMusicParams.f200090j == this.f200261H && vEPreviewMusicParams.f200091k == this.f200262I && this.f200263J >= 0) {
                mo142743c().mo56263a(this.f200263J, vEAudioVolumeFilterParam);
            } else {
                this.f200261H = vEPreviewMusicParams.f200090j;
                this.f200262I = vEPreviewMusicParams.f200091k;
                this.f200263J = mo142743c().mo56264a(1, vEAudioVolumeFilterParam, this.f200261H, this.f200262I + 100);
                mo142743c().mo56263a(this.f200263J, vEAudioVolumeFilterParam);
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m153345a(AbstractC31071f fVar, VEVolumeChangeOp vEVolumeChangeOp) {
        VEAudioVolumeFilterParam vEAudioVolumeFilterParam = new VEAudioVolumeFilterParam();
        vEAudioVolumeFilterParam.volume = vEVolumeChangeOp.mVolume;
        int i = vEVolumeChangeOp.mVoiceType;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (vEVolumeChangeOp.mStart == this.f200270Q && vEVolumeChangeOp.mEnd == this.f200271R) {
                        fVar.mo56263a(this.f200272S, vEAudioVolumeFilterParam);
                        return;
                    }
                    this.f200270Q = vEVolumeChangeOp.mStart;
                    int i2 = vEVolumeChangeOp.mEnd;
                    this.f200271R = i2;
                    int a = fVar.mo56264a(1, vEAudioVolumeFilterParam, this.f200270Q, i2);
                    this.f200272S = a;
                    fVar.mo56263a(a, vEAudioVolumeFilterParam);
                }
            } else if (vEVolumeChangeOp.mStart == this.f200267N && vEVolumeChangeOp.mEnd == this.f200268O) {
                fVar.mo56263a(this.f200269P, vEAudioVolumeFilterParam);
            } else {
                this.f200267N = vEVolumeChangeOp.mStart;
                int i3 = vEVolumeChangeOp.mEnd;
                this.f200268O = i3;
                int a2 = fVar.mo56264a(1, vEAudioVolumeFilterParam, this.f200267N, i3);
                this.f200269P = a2;
                fVar.mo56263a(a2, vEAudioVolumeFilterParam);
            }
        } else if (vEVolumeChangeOp.mStart == this.f200264K && vEVolumeChangeOp.mEnd == this.f200265L) {
            fVar.mo56263a(this.f200266M, vEAudioVolumeFilterParam);
        } else {
            this.f200264K = vEVolumeChangeOp.mStart;
            int i4 = vEVolumeChangeOp.mEnd;
            this.f200265L = i4;
            int a3 = fVar.mo56264a(1, vEAudioVolumeFilterParam, this.f200264K, i4);
            this.f200266M = a3;
            fVar.mo56263a(a3, vEAudioVolumeFilterParam);
        }
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final int mo142714a(Context context, AbstractC14088a aVar, SurfaceView surfaceView, AbstractC1204m mVar) {
        C89219l.m154721d(aVar, "");
        super.mo142714a(context, aVar, surfaceView, mVar);
        C31079j jVar = new C31079j(aVar.getVideoPaths());
        jVar.mo56409a(C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
        jVar.f74442d = aVar.getAudioPaths();
        int a = mo142743c().mo56274a(jVar);
        AbstractC31071f c = mo142743c();
        VEPreviewParams vEPreviewParams = (VEPreviewParams) aVar;
        if (vEPreviewParams.stitchParams != null && (vEPreviewParams.mPageType != 1 || vEPreviewParams.mIsFromDraft)) {
            StitchParams stitchParams = vEPreviewParams.stitchParams;
            float f = vEPreviewParams.mVolume;
            float f2 = vEPreviewParams.mMusicVolume;
            String musicPath = stitchParams.getMusicPath();
            if (musicPath == null) {
                musicPath = "";
            }
            String[] videoPaths = vEPreviewParams.getVideoPaths();
            C89219l.m154716b(videoPaths, "");
            long j = 0;
            for (String str : videoPaths) {
                j += C71413b.m126117a(str).getDuration();
            }
            int i = (int) j;
            long duration = stitchParams.getDuration();
            if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0 || musicPath.length() <= 0) {
                int i2 = (int) duration;
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2, 0, i2, 1);
                C89219l.m154716b(ofVoice, "");
                m153345a(c, ofVoice);
                int i3 = (int) (duration + 100);
                VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(f, i3, i, 2);
                C89219l.m154716b(ofVoice2, "");
                m153345a(c, ofVoice2);
                VEVolumeChangeOp ofVoice3 = VEVolumeChangeOp.ofVoice(0.0f, i2, i3, 3);
                C89219l.m154716b(ofVoice3, "");
                m153345a(c, ofVoice3);
            } else if (C80720e.m139927b(musicPath)) {
                if (this.f200148i != -1) {
                    mo142743c().mo56351e(this.f200148i);
                    this.f200148i = -1;
                }
                this.f200148i = c.mo56287a(musicPath, stitchParams.getMusicStart(), stitchParams.getMusicStart() + i, false);
                c.mo56313a(this.f200148i, 1, f2);
                c.mo56313a(c.mo56300a().f191689j, c.mo56300a().f191690k, f);
            }
        }
        return a;
    }
}
