package com.p2082ss.android.ugc.gamora.editor.toolbar;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.experiment.C46787cd;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.gamora.editor.C83098t;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.b */
public final class C83158b implements AbstractC83251y {

    /* renamed from: a */
    final AbstractC89244h f185820a = C89250i.m154773a((AbstractC89171a) new C83159a(this));

    /* renamed from: b */
    public final ActivityC0945e f185821b;

    /* renamed from: c */
    private final AbstractC89244h f185822c = C89250i.m154773a((AbstractC89171a) new C83160b(this));

    /* renamed from: d */
    private final AbstractC89244h f185823d = C89250i.m154773a((AbstractC89171a) new C83161c(this));

    /* renamed from: e */
    private final AbstractC89244h f185824e = C89250i.m154773a((AbstractC89171a) new C83162d(this));

    /* renamed from: f */
    private final AbstractC89244h f185825f = C89250i.m154773a((AbstractC89171a) new C83163e(this));

    /* renamed from: g */
    private final AbstractC89244h f185826g = C89250i.m154773a((AbstractC89171a) new C83164f(this));

    static {
        Covode.recordClassIndex(97042);
    }

    /* renamed from: b */
    private final EditStickerViewModel m143568b() {
        return (EditStickerViewModel) this.f185822c.getValue();
    }

    /* renamed from: c */
    private final EditToolbarViewModel m143569c() {
        return (EditToolbarViewModel) this.f185824e.getValue();
    }

    /* renamed from: d */
    private final EditStickerViewModel m143570d() {
        return (EditStickerViewModel) this.f185825f.getValue();
    }

    /* renamed from: e */
    private final VideoPublishEditModel m143571e() {
        return (VideoPublishEditModel) this.f185826g.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83251y
    /* renamed from: a */
    public final void mo88190a() {
        m143569c().mo128236a();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.b$a */
    static final class C83159a extends AbstractC89220m implements AbstractC89171a<C21582f> {

        /* renamed from: a */
        final /* synthetic */ C83158b f185827a;

        static {
            Covode.recordClassIndex(97043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83159a(C83158b bVar) {
            super(0);
            this.f185827a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C21582f invoke() {
            return C2552c.m7463b(this.f185827a.f185821b);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.b$b */
    static final class C83160b extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83158b f185828a;

        static {
            Covode.recordClassIndex(97044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83160b(C83158b bVar) {
            super(0);
            this.f185828a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return C20531t.m38716a(this.f185828a.f185821b).mo33800a(EditStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.b$c */
    static final class C83161c extends AbstractC89220m implements AbstractC89171a<EditTextStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83158b f185829a;

        static {
            Covode.recordClassIndex(97045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83161c(C83158b bVar) {
            super(0);
            this.f185829a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditTextStickerViewModel invoke() {
            return C20531t.m38716a(this.f185829a.f185821b).mo33800a(EditTextStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.b$d */
    static final class C83162d extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83158b f185830a;

        static {
            Covode.recordClassIndex(97046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83162d(C83158b bVar) {
            super(0);
            this.f185830a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            return C20531t.m38716a(this.f185830a.f185821b).mo33800a(EditToolbarViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.b$e */
    static final class C83163e extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83158b f185831a;

        static {
            Covode.recordClassIndex(97047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83163e(C83158b bVar) {
            super(0);
            this.f185831a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return C20531t.m38716a(this.f185831a.f185821b).mo33800a(EditStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.b$f */
    static final class C83164f extends AbstractC89220m implements AbstractC89171a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C83158b f185832a;

        static {
            Covode.recordClassIndex(97048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83164f(C83158b bVar) {
            super(0);
            this.f185832a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            C21582f fVar = (C21582f) this.f185832a.f185820a.getValue();
            if (fVar == null) {
                C89219l.m154715b();
            }
            Object a = fVar.mo35249a((Type) VideoPublishEditModel.class, (String) null);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    public C83158b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f185821b = eVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83251y
    /* renamed from: a */
    public final void mo88191a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        VideoPublishEditModel e = m143571e();
        if (!z2) {
            Boolean value = m143570d().mo127691n().getValue();
            if (value == null || !value.booleanValue()) {
                Boolean value2 = m143570d().mo127692o().getValue();
                if (value2 == null || !value2.booleanValue()) {
                    m143568b().mo127684g().setValue(Boolean.valueOf(z3));
                } else {
                    m143568b().mo127690m().setValue(Boolean.valueOf(z3));
                }
            } else {
                m143568b().mo127689l().setValue(Boolean.valueOf(z3));
            }
        }
        if (!z) {
            ((EditTextStickerViewModel) this.f185823d.getValue()).mo77639n();
        }
        boolean isDuet = e.isDuet();
        boolean isReaction = e.isReaction();
        boolean b = C70976bp.m125305b(e);
        m143569c().mo128260j().setValue(Boolean.valueOf(z));
        m143569c().mo128244b();
        m143569c().mo33689c(new EditToolbarViewModel.C83106h(z));
        if ((!e.isMvThemeVideoType() || (m143571e().isPhotoMvMode && m143571e().getOriginal() == 1)) && !e.isStickPointMode && !e.isCutSameVideoType() && ((!e.isDuet() || e.duetFilesExist()) && !e.isCutSameVideoType())) {
            z4 = false;
        } else {
            z4 = true;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        AbstractC63218be storyService = createIAVServiceProxybyMonsterPlugin.getStoryService();
        if (storyService.mo93868b() || storyService.mo93869c() || storyService.mo93870d()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4) {
            m143569c().mo128248b(false);
        } else if (e.mIsFromDraft && !C46787cd.m90133a()) {
            EditToolbarViewModel c = m143569c();
            if (!z || isReaction || b || e.isUploadVideo()) {
                z6 = false;
            } else {
                z6 = true;
            }
            c.mo128248b(z6);
        } else if (e.draftFromShoot && !z5) {
            m143569c().mo128248b(z);
        }
        if (C70976bp.m125316l(e)) {
            AbstractC82427a aVar = (AbstractC82427a) ApiCenter.C2545a.m7450a(this.f185821b).mo7015b(AbstractC82427a.class);
            if (aVar != null) {
                aVar.mo127539a(C70976bp.m125302a(e, e.mMusicPath));
            }
        } else {
            if (!C83098t.m143514b(e)) {
                m143569c().mo128246b(8, C70976bp.m125302a(e, e.mMusicPath));
                if (m143571e().getVideoLength() > e.mCurMusicLength) {
                    m143569c().mo128254d(8, false);
                }
            }
            EditToolbarViewModel c2 = m143569c();
            if (!z || isDuet || isReaction || b) {
                z7 = false;
            } else {
                z7 = true;
            }
            c2.mo128238a(8, z7);
        }
        if (C70976bp.m125310f(e)) {
            EditToolbarViewModel c3 = m143569c();
            if (!z || b) {
                z9 = false;
            } else {
                z9 = true;
            }
            c3.mo128238a(6, z9);
        }
        if (C70976bp.m125312h(e)) {
            if (e.veAudioRecorderParam == null || !e.veAudioRecorderParam.hasRecord()) {
                m143569c().mo128254d(6, false);
            } else {
                m143569c().mo128254d(6, true);
            }
        }
        if ((!e.hasOriginalAudio() || e.voiceVolume <= 0.0f) && !e.hasRecord()) {
            m143569c().mo128254d(11, false);
        } else {
            m143569c().mo128254d(11, true);
        }
        if (e.isStickPointMode) {
            m143569c().mo128254d(1, false);
        } else {
            m143569c().mo128254d(1, true);
        }
        m143569c().mo128246b(7, !e.isStickPointMode);
        m143569c().mo128238a(7, z);
        m143569c().mo128238a(11, z);
        m143569c().mo128238a(5, z);
        m143569c().mo128257g().setValue(Boolean.valueOf(z));
        EditToolbarViewModel c4 = m143569c();
        if (!z || isDuet || isReaction || b) {
            z8 = false;
        } else {
            z8 = true;
        }
        c4.mo128238a(1, z8);
        m143569c().mo128238a(2, z);
        if (!z) {
            m143569c().mo128251c(2, false);
        }
        m143569c().mo128238a(4, z);
        m143569c().mo128238a(3, z);
    }
}
