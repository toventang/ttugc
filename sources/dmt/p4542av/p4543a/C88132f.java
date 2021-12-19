package dmt.p4542av.p4543a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.p4543a.AbstractC88123a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.a.f */
public final class C88132f extends AbstractC88123a {

    /* renamed from: e */
    public static final C88133a f200044e = new C88133a((byte) 0);

    static {
        Covode.recordClassIndex(104160);
    }

    /* renamed from: dmt.av.a.f$a */
    public static final class C88133a {
        static {
            Covode.recordClassIndex(104161);
        }

        private C88133a() {
        }

        public /* synthetic */ C88133a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88132f(C88128c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: d */
    public final AbstractC88123a.C88125b mo142630d(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        AbstractC88123a.C88125b.EnumC88126a aVar;
        C89219l.m154721d(videoPublishEditModel, "");
        if (C71817eu.m126799j(videoPublishEditModel)) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            C89219l.m154716b(previewInfo, "");
            videoList = C88131e.m153202a(previewInfo);
        } else {
            videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        }
        int size = videoList.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[2];
        float[] fArr = new float[size];
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        C89219l.m154716b(previewInfo2, "");
        m153203a(previewInfo2, videoList, strArr, jArr, jArr2, fArr, jArr3);
        this.f200027a = VEUtils.detachAudioFromVideos(videoPublishEditModel.mEncodedAudioOutputFile, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
        if (C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        AbstractC88123a.C88125b.EnumC88126a aVar2 = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
        return new AbstractC88123a.C88125b("FastImportSeparator", aVar2, aVar2, aVar, this.f200027a, "startSimple");
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: c */
    public final AbstractC88123a.C88125b mo142629c(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        AbstractC88123a.C88125b.EnumC88126a aVar;
        AbstractC88123a.C88125b.EnumC88126a aVar2;
        C89219l.m154721d(videoPublishEditModel, "");
        if (C71817eu.m126799j(videoPublishEditModel)) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            C89219l.m154716b(previewInfo, "");
            videoList = C88131e.m153202a(previewInfo);
        } else {
            videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        }
        int size = videoList.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[2];
        float[] fArr = new float[size];
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        C89219l.m154716b(previewInfo2, "");
        m153203a(previewInfo2, videoList, strArr, jArr, jArr2, fArr, jArr3);
        String str = this.f200029c.f200040a + System.currentTimeMillis() + "_a";
        AbstractC88123a.C88125b.EnumC88126a aVar3 = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
        if (C84902i.m145892a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        if (videoPublishEditModel.voiceVolume == 0.0f) {
            this.f200027a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            this.f200027a = VEUtils.detachAudioFromVideos(str, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
            if (C84902i.m145892a(str)) {
                aVar3 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
            } else {
                aVar3 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
            this.f200028b = VEUtils.mixAudio(arrayList, videoPublishEditModel.mEncodedAudioOutputFile, null);
            C80720e.m139931c(str);
        }
        if (C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        return new AbstractC88123a.C88125b("FastImportSeparator", aVar3, aVar, aVar2, this.f200027a, "voiceVolume: " + videoPublishEditModel.voiceVolume);
    }

    /* renamed from: a */
    private static void m153203a(EditPreviewInfo editPreviewInfo, List<? extends EditVideoSegment> list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) list.get(i);
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
}
