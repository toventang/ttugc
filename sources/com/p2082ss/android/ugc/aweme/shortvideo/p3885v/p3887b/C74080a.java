package com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3887b;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65441dx;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.b.a */
public final class C74080a {

    /* renamed from: a */
    public static final C74080a f166300a = new C74080a();

    /* renamed from: a */
    private static boolean m130262a(int i) {
        return i == 1;
    }

    private C74080a() {
    }

    static {
        Covode.recordClassIndex(86832);
    }

    /* renamed from: a */
    private static void m130258a(C84425b bVar, SynthetiseResult synthetiseResult) {
        VideoFileInfo videoFileInfo;
        if (synthetiseResult != null && (videoFileInfo = synthetiseResult.outputVideoFileInfo) != null) {
            bVar.mo129406a("compose_fps", String.valueOf(videoFileInfo.getFps()));
            bVar.mo129406a("compose_resolution", videoFileInfo.getResolution());
            bVar.mo129403a("compose_file_bitrate", videoFileInfo.getBitrate());
            if (C80720e.m139927b(synthetiseResult.outputFile)) {
                String a = C1764a.m5929a(Locale.US, "%d", Arrays.copyOf(new Object[]{Long.valueOf(new File(synthetiseResult.outputFile).length() / 1024)}, 1));
                C89219l.m154716b(a, "");
                bVar.mo129406a("compose_file_size", a);
            }
            bVar.mo129406a("compose_file_duration", String.valueOf(videoFileInfo.getDuration()));
            bVar.mo129405a("compose_bitrate", Float.valueOf(C65441dx.m117160a()));
        }
    }

    /* renamed from: a */
    public static final void m130260a(C84425b bVar, Object obj) {
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        C89219l.m154721d(bVar, "");
        if (!(obj instanceof VideoPublishEditModel)) {
            obj = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel != null) {
            bVar.mo129406a("source_fps", String.valueOf(videoPublishEditModel.videoFps()));
            bVar.mo129406a("source_resolution", videoPublishEditModel.getVideoResolution());
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (!(previewInfo == null || (videoList = previewInfo.getVideoList()) == null || !(!videoList.isEmpty()) || (editVideoSegment = videoList.get(0)) == null)) {
                bVar.mo129406a("source_file_bitrate", String.valueOf(editVideoSegment.getVideoFileInfo().getBitrate()));
                File file = new File(editVideoSegment.getVideoPath());
                if (file.isFile() && file.exists()) {
                    String a = C1764a.m5929a(Locale.US, "%d", Arrays.copyOf(new Object[]{Long.valueOf(file.length() / 1024)}, 1));
                    C89219l.m154716b(a, "");
                    bVar.mo129406a("source_file_size", a);
                }
            }
            C69890bl.m123457a(bVar, videoPublishEditModel);
        }
    }

    /* renamed from: a */
    public static final void m130259a(C84425b bVar, SynthetiseResult synthetiseResult, Object obj) {
        C89219l.m154721d(bVar, "");
        m130260a(bVar, obj);
        m130258a(bVar, synthetiseResult);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x03f1, code lost:
        if (r4 > 0) goto L_0x03f3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m130261a(java.lang.Object r57, int r58, long r59, int r61, java.lang.String r62, long r63, long r65, long r67, long r69, long r71, long r73, boolean r75, boolean r76, int r77, boolean r78, com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult r79, com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j r80, com.p2082ss.android.ugc.aweme.shortvideo.C71813eq r81) {
        /*
        // Method dump skipped, instructions count: 1263
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3887b.C74080a.m130261a(java.lang.Object, int, long, int, java.lang.String, long, long, long, long, long, long, boolean, boolean, int, boolean, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, com.ss.android.ugc.aweme.shortvideo.j, com.ss.android.ugc.aweme.shortvideo.eq):void");
    }
}
