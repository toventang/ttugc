package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p2082ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g */
public final class C72449g {

    /* renamed from: d */
    public static final C72450a f162426d = new C72450a((byte) 0);

    /* renamed from: a */
    public AbstractC31071f f162427a;

    /* renamed from: b */
    public boolean f162428b;

    /* renamed from: c */
    public List<Integer> f162429c = new ArrayList();

    static {
        Covode.recordClassIndex(85123);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g$a */
    public static final class C72450a {
        static {
            Covode.recordClassIndex(85124);
        }

        private C72450a() {
        }

        public /* synthetic */ C72450a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo114722a() {
        if (this.f162427a != null && !C84904k.m145909a(this.f162429c)) {
            int size = this.f162429c.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = this.f162429c.get(i).intValue();
            }
            this.f162429c.clear();
            AbstractC31071f fVar = this.f162427a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            fVar.mo56293a(iArr);
        }
    }

    /* renamed from: a */
    public static VEImageTransformFilterParam m127825a(int i) {
        VEImageTransformFilterParam vEImageTransformFilterParam = new VEImageTransformFilterParam();
        if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN) {
            vEImageTransformFilterParam.beginScale = 1.0f;
            vEImageTransformFilterParam.endScale = 1.1f;
            return vEImageTransformFilterParam;
        } else if (i != VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
            return null;
        } else {
            vEImageTransformFilterParam.beginScale = 1.1f;
            vEImageTransformFilterParam.endScale = 1.0f;
            return vEImageTransformFilterParam;
        }
    }

    /* renamed from: b */
    private static boolean m127826b(List<? extends VideoSegment> list) {
        if (C84904k.m145909a(list)) {
            return false;
        }
        if (list == null) {
            C89219l.m154715b();
        }
        for (VideoSegment videoSegment : list) {
            if (!(videoSegment.f156717i || C84896h.m145866a(videoSegment.mo110571a(false), true))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo114723a(VideoSegment videoSegment) {
        VEImageTransformFilterParam a;
        if (C70455f.f157420d && this.f162427a != null && videoSegment != null) {
            mo114722a();
            if (this.f162428b && C84896h.m145866a(videoSegment.mo110571a(false), false) && (a = m127825a(videoSegment.f156725q)) != null) {
                AbstractC31071f fVar = this.f162427a;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                int a2 = fVar.mo56264a(0, a, (int) videoSegment.mo110578d(), (int) (videoSegment.mo110580e() - videoSegment.mo110578d()));
                AbstractC31071f fVar2 = this.f162427a;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                fVar2.mo56263a(a2, a);
                this.f162429c.add(Integer.valueOf(a2));
            }
        }
    }

    /* renamed from: a */
    public final void mo114724a(List<? extends VideoSegment> list) {
        boolean z;
        String e;
        if (!(!C70455f.f157420d || this.f162427a == null || C84904k.m145909a(list))) {
            mo114722a();
            if (this.f162428b) {
                if (list == null) {
                    C89219l.m154715b();
                }
                if (!m127826b(list)) {
                    for (VideoSegment videoSegment : list) {
                        videoSegment.f156725q = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
                    }
                    return;
                }
                int i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                long j = 0;
                for (VideoSegment videoSegment2 : list) {
                    long e2 = videoSegment2.mo110580e() - videoSegment2.mo110578d();
                    if (!videoSegment2.f156717i) {
                        String a = videoSegment2.mo110571a(false);
                        if (C84896h.m145869b(a) || !((e = C89159j.m154654e(new File(a))) == null || e.length() == 0)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (C84896h.m145866a(a, z)) {
                            videoSegment2.f156725q = i;
                            VEImageTransformFilterParam a2 = m127825a(i);
                            if (a2 != null) {
                                AbstractC31071f fVar = this.f162427a;
                                if (fVar == null) {
                                    C89219l.m154715b();
                                }
                                int a3 = fVar.mo56264a(0, a2, (int) j, (int) (j + e2));
                                AbstractC31071f fVar2 = this.f162427a;
                                if (fVar2 == null) {
                                    C89219l.m154715b();
                                }
                                fVar2.mo56263a(a3, a2);
                                this.f162429c.add(Integer.valueOf(a3));
                            }
                        } else if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
                            i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                        } else {
                            i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT;
                        }
                        j += e2;
                    }
                }
            }
        }
    }
}
