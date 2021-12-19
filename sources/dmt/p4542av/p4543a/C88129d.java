package dmt.p4542av.p4543a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.p4543a.AbstractC88123a;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.a.d */
public final class C88129d extends AbstractC88123a {

    /* renamed from: f */
    public static final C88130a f200042f = new C88130a((byte) 0);

    /* renamed from: e */
    public String f200043e;

    static {
        Covode.recordClassIndex(104157);
    }

    /* renamed from: dmt.av.a.d$a */
    public static final class C88130a {
        static {
            Covode.recordClassIndex(104158);
        }

        private C88130a() {
        }

        public /* synthetic */ C88130a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88129d(C88128c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: a */
    public final void mo142627a(VideoPublishEditModel videoPublishEditModel) {
        String audioPath;
        C89219l.m154721d(videoPublishEditModel, "");
        super.mo142627a(videoPublishEditModel);
        if (TextUtils.isEmpty(videoPublishEditModel.audioPath())) {
            audioPath = videoPublishEditModel.videoPath().toString();
        } else {
            audioPath = videoPublishEditModel.audioPath();
        }
        this.f200043e = audioPath;
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: d */
    public final AbstractC88123a.C88125b mo142630d(VideoPublishEditModel videoPublishEditModel) {
        AbstractC88123a.C88125b.EnumC88126a aVar;
        AbstractC88123a.C88125b.EnumC88126a aVar2;
        C89219l.m154721d(videoPublishEditModel, "");
        if (C84902i.m145892a(this.f200043e)) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        String str = this.f200043e;
        if (str != null) {
            this.f200027a = VEUtils.transCodeAudio(str, videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        }
        if (C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        return new AbstractC88123a.C88125b("DefaultSeparator", aVar, AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED, aVar2, this.f200027a);
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: c */
    public final AbstractC88123a.C88125b mo142629c(VideoPublishEditModel videoPublishEditModel) {
        AbstractC88123a.C88125b.EnumC88126a aVar;
        AbstractC88123a.C88125b.EnumC88126a aVar2;
        C89219l.m154721d(videoPublishEditModel, "");
        if (this.f200043e == null) {
            AbstractC88123a.C88125b.EnumC88126a aVar3 = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
            return new AbstractC88123a.C88125b("DefaultSeparator", aVar3, aVar3, AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED, this.f200027a, "mediaFile == null: true");
        }
        AbstractC88123a.C88125b.EnumC88126a aVar4 = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
        if (C84902i.m145892a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
            this.f200027a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            if (C84902i.m145892a(this.f200043e)) {
                aVar4 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
            } else {
                aVar4 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
            }
            this.f200027a = -999;
            ArrayList arrayList = new ArrayList();
            String str = this.f200043e;
            if (str == null) {
                C89219l.m154715b();
            }
            arrayList.add(str);
            arrayList.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
            this.f200028b = VEUtils.mixAudio(arrayList, videoPublishEditModel.mEncodedAudioOutputFile, null);
        }
        if (C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        return new AbstractC88123a.C88125b("DefaultSeparator", aVar4, aVar, aVar2, this.f200027a, "hasOriginalSound = " + videoPublishEditModel.hasOriginalSound() + " \n voiceVolume: " + videoPublishEditModel.voiceVolume);
    }
}
