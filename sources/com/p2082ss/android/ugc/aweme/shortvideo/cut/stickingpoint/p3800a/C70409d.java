package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78102c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85581w;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d */
public final class C70409d extends C70408c {

    /* renamed from: a */
    private int f157347a;

    /* renamed from: b */
    private VideoSegment f157348b;

    /* renamed from: c */
    private final AbstractC31071f f157349c;

    /* renamed from: d */
    private C85391be f157350d;

    static {
        Covode.recordClassIndex(82852);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70408c, com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110542a(boolean z, boolean z2, List<? extends VideoSegment> list) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70408c, com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110538a(List<? extends VideoSegment> list) {
        if (!C84904k.m145909a(list)) {
            C78102c.m136524b(this.f157350d, list);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70408c, com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: c */
    public final void mo110547c(int i, int i2) {
        this.f157349c.mo56323b(i, i2);
    }

    public C70409d(AbstractC31071f fVar, C85391be beVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(beVar, "");
        this.f157349c = fVar;
        this.f157350d = beVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70408c, com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110540a(List<? extends VideoSegment> list, boolean z) {
        C78102c.m136522a(this.f157350d, list);
        this.f157349c.mo56277a(this.f157350d);
        if (z) {
            this.f157349c.mo56265a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
        }
        AbstractC70076i.C70077a.m123719a(this, 0.0f, 0.0f, 0.0f, 30);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70408c, com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110536a(int i, VideoSegment videoSegment) {
        C89219l.m154721d(videoSegment, "");
        this.f157348b = videoSegment;
        this.f157347a = i;
        int i2 = videoSegment.f156718j;
        videoSegment.f156718j = 0;
        C78102c.m136521a(this.f157350d, i, videoSegment);
        this.f157349c.mo56278a(this.f157350d, (int) videoSegment.mo110578d(), (int) videoSegment.mo110580e());
        videoSegment.f156718j = i2;
        AbstractC70076i.C70077a.m123719a(this, (float) videoSegment.f156718j, videoSegment.f156719k, videoSegment.f156720l, 24);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70408c, com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i
    /* renamed from: a */
    public final void mo110535a(int i, int i2, List<? extends VideoSegment> list) {
        List<? extends VideoSegment> list2;
        C89219l.m154721d(list, "");
        int size = list.size();
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int[] iArr3 = new int[size];
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        int i3 = 0;
        if (list2 != null) {
            int i4 = 0;
            for (T t : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                strArr[i4] = t2.mo110571a(false).toString();
                iArr[i4] = (int) t2.mo110578d();
                iArr2[i4] = (int) t2.mo110580e();
                fArr[i4] = t2.mo110582f();
                iArr3[i4] = t2.f156718j;
                i4 = i5;
            }
        }
        C85391be beVar = new C85391be(strArr);
        C78102c.m136523a(beVar, list, iArr, iArr2, fArr, iArr3);
        this.f157350d = beVar;
        for (T t3 : list) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C89070n.m154520a();
            }
            this.f157350d.f191149b[i3] = t3.f156709a;
            i3 = i6;
        }
    }
}
