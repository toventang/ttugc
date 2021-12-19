package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.C75668d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75624e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.k */
public final class C84090k {
    static {
        Covode.recordClassIndex(97983);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.k$a */
    public static final class C84091a extends AbstractC89220m implements AbstractC89172b<AbstractC75633m, Boolean> {
        public static final C84091a INSTANCE = new C84091a();

        static {
            Covode.recordClassIndex(97984);
        }

        public C84091a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC75633m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(AbstractC75633m mVar) {
            C89219l.m154721d(mVar, "");
            return mVar instanceof StickerVideoStatusHandler;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.k$b */
    public static final class C84092b extends AbstractC89220m implements AbstractC89172b<AbstractC75633m, Boolean> {
        public static final C84092b INSTANCE = new C84092b();

        static {
            Covode.recordClassIndex(97985);
        }

        public C84092b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC75633m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(AbstractC75633m mVar) {
            C89219l.m154721d(mVar, "");
            return mVar instanceof VoiceRecognizeStickerHandler;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.k$c */
    public static final class C84093c extends AbstractC89220m implements AbstractC89172b<AbstractC75633m, Boolean> {
        public static final C84093c INSTANCE = new C84093c();

        static {
            Covode.recordClassIndex(97986);
        }

        public C84093c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC75633m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(AbstractC75633m mVar) {
            C89219l.m154721d(mVar, "");
            return mVar instanceof StickerVideoStatusHandler;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.k$d */
    public static final class C84094d extends AbstractC89220m implements AbstractC89172b<AbstractC75633m, Boolean> {
        public static final C84094d INSTANCE = new C84094d();

        static {
            Covode.recordClassIndex(97987);
        }

        public C84094d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC75633m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(AbstractC75633m mVar) {
            C89219l.m154721d(mVar, "");
            return mVar instanceof C75624e;
        }
    }

    /* renamed from: b */
    public static final void m144601b(AbstractC75649i iVar) {
        C89219l.m154721d(iVar, "");
        AbstractC75633m a = iVar.mo23154a(C84093c.INSTANCE);
        if (!(a instanceof StickerVideoStatusHandler)) {
            a = null;
        }
        StickerVideoStatusHandler stickerVideoStatusHandler = (StickerVideoStatusHandler) a;
        if (stickerVideoStatusHandler != null) {
            stickerVideoStatusHandler.mo119338b();
        }
    }

    /* renamed from: a */
    public static final AVChallenge m144598a(AbstractC75649i iVar) {
        List<? extends AVChallenge> list;
        C89219l.m154721d(iVar, "");
        AbstractC75633m a = iVar.mo23154a(C84094d.INSTANCE);
        if (!(a instanceof C75624e)) {
            a = null;
        }
        C75624e eVar = (C75624e) a;
        if (eVar == null || (list = eVar.f170035a) == null) {
            return null;
        }
        return (AVChallenge) C89070n.m154583g((List) list);
    }

    /* renamed from: a */
    public static final void m144599a(AbstractC75649i iVar, PrivacyCert privacyCert) {
        C89219l.m154721d(iVar, "");
        AbstractC75633m a = iVar.mo23154a(C84092b.INSTANCE);
        if (!(a instanceof VoiceRecognizeStickerHandler)) {
            a = null;
        }
        VoiceRecognizeStickerHandler voiceRecognizeStickerHandler = (VoiceRecognizeStickerHandler) a;
        if (voiceRecognizeStickerHandler != null) {
            voiceRecognizeStickerHandler.mo119342a(new C75668d(privacyCert));
        }
    }

    /* renamed from: a */
    public static final void m144600a(AbstractC75649i iVar, boolean z) {
        C89219l.m154721d(iVar, "");
        AbstractC75633m a = iVar.mo23154a(C84091a.INSTANCE);
        if (!(a instanceof StickerVideoStatusHandler)) {
            a = null;
        }
        StickerVideoStatusHandler stickerVideoStatusHandler = (StickerVideoStatusHandler) a;
        if (stickerVideoStatusHandler != null) {
            stickerVideoStatusHandler.mo119337a(z);
        }
    }
}
