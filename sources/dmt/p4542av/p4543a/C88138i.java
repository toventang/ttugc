package dmt.p4542av.p4543a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.p4543a.AbstractC88123a;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.a.i */
public final class C88138i extends AbstractC88123a {

    /* renamed from: f */
    public static final C88139a f200050f = new C88139a((byte) 0);

    /* renamed from: e */
    public VERecordData f200051e;

    static {
        Covode.recordClassIndex(104166);
    }

    /* renamed from: dmt.av.a.i$a */
    public static final class C88139a {
        static {
            Covode.recordClassIndex(104167);
        }

        private C88139a() {
        }

        public /* synthetic */ C88139a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88138i(C88128c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: a */
    public final void mo142627a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        super.mo142627a(videoPublishEditModel);
        MultiEditVideoRecordData multiEditVideoRecordData = videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData;
        C89219l.m154716b(multiEditVideoRecordData, "");
        this.f200051e = C71493a.m126273a(multiEditVideoRecordData);
        MultiEditVideoRecordData multiEditVideoRecordData2 = videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData;
        C89219l.m154716b(multiEditVideoRecordData2, "");
        Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData2.getPlayInOutTime();
        C89219l.m154716b(playInOutTime, "");
        VERecordData vERecordData = this.f200051e;
        if (vERecordData == null) {
            C89219l.m154710a("recordData");
        }
        vERecordData.mo130356a(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: d */
    public final AbstractC88123a.C88125b mo142630d(VideoPublishEditModel videoPublishEditModel) {
        AbstractC88123a.C88125b.EnumC88126a aVar;
        AbstractC88123a.C88125b.EnumC88126a aVar2;
        C89219l.m154721d(videoPublishEditModel, "");
        VERecordData vERecordData = this.f200051e;
        if (vERecordData == null) {
            C89219l.m154710a("recordData");
        }
        if (C84902i.m145892a(vERecordData.f190797e)) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        String str = videoPublishEditModel.mEncodedAudioOutputFile;
        VERecordData vERecordData2 = this.f200051e;
        if (vERecordData2 == null) {
            C89219l.m154710a("recordData");
        }
        this.f200027a = VEUtils.getAudioFromRecordData(str, vERecordData2, 1, 88200, 44100);
        if (C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        return new AbstractC88123a.C88125b("RecordVideoSeparator", aVar, AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED, aVar2, this.f200027a);
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: c */
    public final AbstractC88123a.C88125b mo142629c(VideoPublishEditModel videoPublishEditModel) {
        AbstractC88123a.C88125b.EnumC88126a aVar;
        AbstractC88123a.C88125b.EnumC88126a aVar2;
        C89219l.m154721d(videoPublishEditModel, "");
        AbstractC88123a.C88125b.EnumC88126a aVar3 = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
        if (C84902i.m145892a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        if (videoPublishEditModel.voiceVolume == 0.0f || !videoPublishEditModel.hasOriginalSound()) {
            this.f200027a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            VERecordData vERecordData = this.f200051e;
            if (vERecordData == null) {
                C89219l.m154710a("recordData");
            }
            if (C84902i.m145892a(vERecordData.f190797e)) {
                aVar3 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
            } else {
                aVar3 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
            }
            String str = this.f200029c.f200040a + System.currentTimeMillis() + "_a";
            VERecordData vERecordData2 = this.f200051e;
            if (vERecordData2 == null) {
                C89219l.m154710a("recordData");
            }
            this.f200027a = VEUtils.getAudioFromRecordData(str, vERecordData2, 1, 88200, 44100);
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
        return new AbstractC88123a.C88125b("RecordVideoSeparator", aVar3, aVar, aVar2, this.f200027a, "hasOriginalSound = " + videoPublishEditModel.hasOriginalSound() + " \n voiceVolume: " + videoPublishEditModel.voiceVolume);
    }
}
