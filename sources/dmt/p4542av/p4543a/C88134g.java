package dmt.p4542av.p4543a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.p4543a.AbstractC88123a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.a.g */
public final class C88134g extends AbstractC88123a {

    /* renamed from: e */
    public static final C88135a f200045e = new C88135a((byte) 0);

    static {
        Covode.recordClassIndex(104162);
    }

    /* renamed from: dmt.av.a.g$a */
    public static final class C88135a {
        static {
            Covode.recordClassIndex(104163);
        }

        private C88135a() {
        }

        public /* synthetic */ C88135a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88134g(C88128c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: d */
    public final AbstractC88123a.C88125b mo142630d(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f200027a = 0;
        AbstractC88123a.C88125b.EnumC88126a aVar = AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED;
        return new AbstractC88123a.C88125b("MVSeparator", aVar, aVar, AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED, this.f200027a);
    }

    @Override // dmt.p4542av.p4543a.AbstractC88123a
    /* renamed from: c */
    public final AbstractC88123a.C88125b mo142629c(VideoPublishEditModel videoPublishEditModel) {
        AbstractC88123a.C88125b.EnumC88126a aVar;
        AbstractC88123a.C88125b.EnumC88126a aVar2;
        C89219l.m154721d(videoPublishEditModel, "");
        if (C84902i.m145892a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        this.f200027a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        if (C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.EXIT;
        } else {
            aVar2 = AbstractC88123a.C88125b.EnumC88126a.ABSENCE;
        }
        return new AbstractC88123a.C88125b("MVSeparator", AbstractC88123a.C88125b.EnumC88126a.NO_NEEDED, aVar, aVar2, this.f200027a);
    }
}
