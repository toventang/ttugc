package com.p2082ss.android.ugc.aweme.ftc.components.toolbar;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.gamora.editor.C83098t;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83251y;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.q */
public final class C52427q implements AbstractC83251y {

    /* renamed from: a */
    final AbstractC89244h f120744a = C89250i.m154773a((AbstractC89171a) new C52428a(this));

    /* renamed from: b */
    public final ActivityC0945e f120745b;

    /* renamed from: c */
    private final AbstractC89244h f120746c = C89250i.m154773a((AbstractC89171a) new C52429b(this));

    /* renamed from: d */
    private final AbstractC89244h f120747d = C89250i.m154773a((AbstractC89171a) new C52430c(this));

    /* renamed from: e */
    private final AbstractC89244h f120748e = C89250i.m154773a((AbstractC89171a) new C52431d(this));

    /* renamed from: f */
    private final AbstractC89244h f120749f = C89250i.m154773a((AbstractC89171a) new C52432e(this));

    /* renamed from: g */
    private final AbstractC89244h f120750g = C89250i.m154773a((AbstractC89171a) new C52433f(this));

    static {
        Covode.recordClassIndex(61819);
    }

    /* renamed from: b */
    private final FTCEditStickerViewModel m97326b() {
        return (FTCEditStickerViewModel) this.f120746c.getValue();
    }

    /* renamed from: c */
    private final FTCEditToolbarViewModel m97327c() {
        return (FTCEditToolbarViewModel) this.f120748e.getValue();
    }

    /* renamed from: d */
    private final FTCEditStickerViewModel m97328d() {
        return (FTCEditStickerViewModel) this.f120749f.getValue();
    }

    /* renamed from: e */
    private final VideoPublishEditModel m97329e() {
        return (VideoPublishEditModel) this.f120750g.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83251y
    /* renamed from: a */
    public final void mo88190a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.q$a */
    static final class C52428a extends AbstractC89220m implements AbstractC89171a<C21582f> {

        /* renamed from: a */
        final /* synthetic */ C52427q f120751a;

        static {
            Covode.recordClassIndex(61820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52428a(C52427q qVar) {
            super(0);
            this.f120751a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C21582f invoke() {
            return C2552c.m7463b(this.f120751a.f120745b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.q$b */
    static final class C52429b extends AbstractC89220m implements AbstractC89171a<FTCEditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52427q f120752a;

        static {
            Covode.recordClassIndex(61821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52429b(C52427q qVar) {
            super(0);
            this.f120752a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditStickerViewModel invoke() {
            return C20531t.m38716a(this.f120752a.f120745b).mo33800a(FTCEditStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.q$c */
    static final class C52430c extends AbstractC89220m implements AbstractC89171a<FTCEditTextStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52427q f120753a;

        static {
            Covode.recordClassIndex(61822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52430c(C52427q qVar) {
            super(0);
            this.f120753a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditTextStickerViewModel invoke() {
            return C20531t.m38716a(this.f120753a.f120745b).mo33800a(FTCEditTextStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.q$d */
    static final class C52431d extends AbstractC89220m implements AbstractC89171a<FTCEditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52427q f120754a;

        static {
            Covode.recordClassIndex(61823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52431d(C52427q qVar) {
            super(0);
            this.f120754a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditToolbarViewModel invoke() {
            return C20531t.m38716a(this.f120754a.f120745b).mo33800a(FTCEditToolbarViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.q$e */
    static final class C52432e extends AbstractC89220m implements AbstractC89171a<FTCEditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52427q f120755a;

        static {
            Covode.recordClassIndex(61824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52432e(C52427q qVar) {
            super(0);
            this.f120755a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditStickerViewModel invoke() {
            return C1181ae.m3881a(this.f120755a.f120745b, (C1175ad.AbstractC1177b) null).mo3983a(FTCEditStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.q$f */
    static final class C52433f extends AbstractC89220m implements AbstractC89171a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C52427q f120756a;

        static {
            Covode.recordClassIndex(61825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52433f(C52427q qVar) {
            super(0);
            this.f120756a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            C21582f fVar = (C21582f) this.f120756a.f120744a.getValue();
            if (fVar == null) {
                C89219l.m154715b();
            }
            Object a = fVar.mo35249a((Type) VideoPublishEditModel.class, (String) null);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    public C52427q(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f120745b = eVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83251y
    /* renamed from: a */
    public final void mo88191a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        VideoPublishEditModel e = m97329e();
        if (!z2) {
            Boolean value = m97328d().mo87903i().getValue();
            if (value == null || !value.booleanValue()) {
                Boolean value2 = m97328d().mo87904j().getValue();
                if (value2 == null || !value2.booleanValue()) {
                    m97326b().mo87900b().setValue(Boolean.valueOf(z3));
                } else {
                    m97326b().mo87902h().setValue(Boolean.valueOf(z3));
                }
            } else {
                m97326b().mo87901g().setValue(Boolean.valueOf(z3));
            }
        }
        if (!z) {
            ((FTCEditTextStickerViewModel) this.f120747d.getValue()).mo88060k();
        }
        m97327c().mo88163l().setValue(Boolean.valueOf(z));
        m97327c().mo88148a();
        m97327c().mo33689c(new FTCEditToolbarViewModel.C52365e(z));
        if (e.mIsFromDraft) {
            FTCEditToolbarViewModel c = m97327c();
            if (!z || e.isUploadVideo()) {
                z4 = false;
            } else {
                z4 = true;
            }
            c.mo88153a(z4);
        }
        if (!C70976bp.m125304b()) {
            if (!C83098t.m143514b(e)) {
                m97327c().mo88155b(8, C70976bp.m125302a(e, e.mMusicPath));
                if (m97329e().getVideoLength() > e.mCurMusicLength) {
                    m97327c().mo88157d(8, false);
                }
            }
            m97327c().mo88150a(8, z);
        }
        if (C70976bp.m125310f(e)) {
            m97327c().mo88150a(6, z);
        }
        if (C70976bp.m125312h(e)) {
            if (e.veAudioRecorderParam == null || !e.veAudioRecorderParam.hasRecord()) {
                m97327c().mo88157d(6, false);
            } else {
                m97327c().mo88157d(6, true);
            }
        }
        m97327c().mo88155b(7, true);
        m97327c().mo88150a(7, z);
        m97327c().mo88150a(5, z);
        m97327c().mo88158g().setValue(Boolean.valueOf(z));
        m97327c().mo88150a(1, z);
        m97327c().mo88150a(2, z);
        if (!z) {
            m97327c().mo88156c(2, false);
        }
        m97327c().mo88150a(3, z);
    }
}
