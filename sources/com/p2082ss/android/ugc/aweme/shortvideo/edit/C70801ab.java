package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.runtime.C85553b;
import java.util.List;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ab */
public final class C70801ab implements AbstractC71531x {

    /* renamed from: a */
    public C1743j<Boolean> f158547a = new C1743j<>();

    /* renamed from: b */
    public boolean f158548b;

    /* renamed from: c */
    private AbstractC31071f f158549c;

    /* renamed from: d */
    private final AbstractC31071f f158550d;

    /* renamed from: e */
    private final EditPreviewInfo f158551e;

    static {
        Covode.recordClassIndex(83286);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: c */
    public final String[] mo111962c() {
        return this.f158550d.mo56362g();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: d */
    public final String[] mo111963d() {
        return this.f158550d.mo56365h();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: e */
    public final String[] mo111964e() {
        return this.f158550d.mo56367i();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: b */
    public final boolean mo111961b() {
        if (mo111962c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71531x
    /* renamed from: a */
    public final C1731i<Boolean> mo111960a() {
        int i;
        VEVideoEncodeSettings d;
        if (mo111962c() != null) {
            this.f158548b = true;
            this.f158547a.mo5555a((Boolean) true);
        } else if (this.f158549c == null) {
            int[] iArr = (this.f158551e.getSceneIn() > 0 || this.f158551e.getSceneOut() > 0) ? new int[]{(int) this.f158551e.getSceneIn(), (int) this.f158551e.getSceneOut()} : new int[]{0, this.f158550d.mo56368j()};
            int i2 = iArr[0];
            int i3 = iArr[1];
            VESize vESize = new VESize(-1, -1);
            List<EditVideoSegment> videoList = this.f158551e.getVideoList();
            if (videoList != null && !videoList.isEmpty()) {
                EditVideoSegment editVideoSegment = this.f158551e.getVideoList().get(0);
                VESize vESize2 = new VESize(editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight());
                vESize = new VESize(this.f158551e.getPreviewWidth(), this.f158551e.getPreviewHeight());
                float f = ((float) vESize2.width) / ((float) vESize2.height);
                float f2 = ((float) vESize.width) / ((float) vESize.height);
                if (f > f2) {
                    if (vESize2.width <= vESize.width) {
                        vESize2.height = (int) (((float) vESize2.width) / f2);
                    }
                } else if (vESize2.height <= vESize.height) {
                    vESize2.width = (int) (((float) vESize2.height) * f2);
                }
                vESize = vESize2;
            }
            C85553b a = this.f158550d.mo56300a();
            String[] strArr = new String[this.f158551e.getVideoList().size()];
            int i4 = 0;
            for (T t : this.f158551e.getVideoList()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C89070n.m154520a();
                }
                strArr[i4] = t.getVideoPath();
                i4 = i5;
            }
            C85391be beVar = new C85391be(strArr);
            int i6 = 0;
            for (T t2 : this.f158551e.getVideoList()) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    C89070n.m154520a();
                }
                VideoCutInfo videoCutInfo = t2.getVideoCutInfo();
                if (videoCutInfo != null) {
                    beVar.f191152e[i6] = (int) videoCutInfo.getStart();
                    beVar.f191153f[i6] = (int) videoCutInfo.getEnd();
                    beVar.f191156i[i6] = (double) videoCutInfo.getSpeed();
                    beVar.f191158k[i6] = C70504v.C70505a.m124383a(videoCutInfo.getRotate());
                }
                i6 = i7;
            }
            int i8 = vESize.width;
            int i9 = vESize.height;
            C70802a aVar = new C70802a(this);
            C89219l.m154721d(a, "");
            C89219l.m154721d(beVar, "");
            if (beVar.f191148a == null || beVar.f191148a.length <= 1) {
                i = 0;
                d = new VEVideoEncodeSettings.C85292a(2).mo130573a(-1, -1).mo130572a(30).mo130588b(false).mo130590c(13).mo130598g(1).mo130589c().mo130579a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo130578a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo130583a(false, false).mo130594d();
            } else {
                i = 0;
                d = new VEVideoEncodeSettings.C85292a(2).mo130573a(i8, i9).mo130597f(1).mo130572a(30).mo130588b(false).mo130590c(13).mo130598g(1).mo130589c().mo130579a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).mo130578a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).mo130583a(false, false).mo130594d();
            }
            C85315al.m146641c("VEEditor", "genReverseVideo2 with param:startTime:" + i2 + "endTime:" + i3);
            float[] fArr = new float[beVar.f191156i.length];
            while (i < beVar.f191156i.length) {
                fArr[i] = (float) beVar.f191156i[i];
                i++;
            }
            C85581w wVar = new C85581w(a.f191680a);
            int a2 = wVar.mo131625a(beVar.f191148a, beVar.f191152e, beVar.f191153f, (String[]) null, beVar.f191150c, beVar.f191154g, beVar.f191155h, fArr, fArr, beVar.f191158k, C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
            C31060a aVar2 = null;
            if (a2 != 0) {
                C85315al.m146642d("VEEditor", "genReverseVideo2 init2 error:".concat(String.valueOf(a2)));
            } else {
                wVar.f191837d.mo130872b(i2, i3, C85581w.EnumC85608g.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                C85581w a3 = C85581w.m147494a(wVar, a, d, aVar);
                if (a3 != null) {
                    aVar2 = new C31060a(a3);
                }
            }
            this.f158549c = aVar2;
        }
        C1731i<TResult> iVar = this.f158547a.f5610a;
        C89219l.m154716b(iVar, "");
        return iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ab$a */
    public static final class C70802a implements VEListener.AbstractC85249r {

        /* renamed from: a */
        final /* synthetic */ C70801ab f158552a;

        static {
            Covode.recordClassIndex(83287);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70802a(C70801ab abVar) {
            this.f158552a = abVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85249r
        /* renamed from: a */
        public final void mo111965a(int i) {
            boolean z;
            C70801ab abVar = this.f158552a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            abVar.f158548b = z;
            this.f158552a.f158547a.mo5555a(Boolean.valueOf(this.f158552a.f158548b));
        }
    }

    public C70801ab(AbstractC31071f fVar, EditPreviewInfo editPreviewInfo) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(editPreviewInfo, "");
        this.f158550d = fVar;
        this.f158551e = editPreviewInfo;
    }
}
