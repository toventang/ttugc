package com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.b.a */
public final class C72782a {

    /* renamed from: a */
    public static final C72782a f163203a = new C72782a();

    private C72782a() {
    }

    static {
        Covode.recordClassIndex(85468);
    }

    /* renamed from: b */
    public static final boolean m128364b(StitchParams stitchParams) {
        if (stitchParams == null || stitchParams.getMusic() == null || !stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m128361a(StitchParams stitchParams) {
        int i;
        VideoFileInfo videoFileInfo;
        if (stitchParams == null) {
            return 0;
        }
        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
        if (videoSegment == null || (videoFileInfo = videoSegment.getVideoFileInfo()) == null) {
            i = 0;
        } else {
            i = (int) videoFileInfo.getDuration();
        }
        return i + Math.max(stitchParams.getMusicStart(), 0);
    }

    /* renamed from: a */
    private static C89378p<Long, Long> m128362a(StitchParams stitchParams, long j, long j2, long j3) {
        long j4;
        long musicStart;
        VideoFileInfo videoFileInfo;
        C89219l.m154721d(stitchParams, "");
        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
        if (videoSegment == null || (videoFileInfo = videoSegment.getVideoFileInfo()) == null) {
            j4 = 0;
        } else {
            j4 = videoFileInfo.getDuration();
        }
        long j5 = j - j4;
        if (j3 > 0) {
            musicStart = Math.min((j2 - ((long) stitchParams.getMusicStart())) - j4, j3 - j4);
        } else {
            musicStart = (j2 - ((long) stitchParams.getMusicStart())) - j4;
        }
        if (musicStart >= 3000) {
            j5 = Math.min(j5, musicStart);
        }
        return new C89378p<>(Long.valueOf(j5), Long.valueOf(j5 + j4));
    }

    /* renamed from: a */
    public static final C89386u<Long, Long, Long> m128363a(StitchParams stitchParams, String str, C69905c cVar, long j) {
        long j2;
        C89219l.m154721d(stitchParams, "");
        long b = (long) C63238c.f143581h.mo101542b(str);
        if (cVar != null) {
            j2 = (long) cVar.getShootDuration();
        } else {
            j2 = b;
        }
        C89378p<Long, Long> a = m128362a(stitchParams, j, b, j2);
        return new C89386u<>(Long.valueOf(b), Long.valueOf(a.component1().longValue()), Long.valueOf(a.component2().longValue()));
    }
}
