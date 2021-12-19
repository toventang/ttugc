package com.p2082ss.android.ugc.gamora.editor;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.p2082ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.C71528a;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.e */
public final class C82146e implements C71529w.AbstractC71530a {

    /* renamed from: a */
    public final ActivityC0945e f183788a;

    /* renamed from: b */
    private final AbstractC89244h f183789b = C89250i.m154773a((AbstractC89171a) new C82147a(this));

    /* renamed from: c */
    private final VideoPublishEditModel f183790c;

    static {
        Covode.recordClassIndex(95974);
    }

    /* renamed from: h */
    private final EditToolbarViewModel m142164h() {
        return (EditToolbarViewModel) this.f183789b.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.e$a */
    static final class C82147a extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82146e f183791a;

        static {
            Covode.recordClassIndex(95975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82147a(C82146e eVar) {
            super(0);
            this.f183791a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            return C20531t.m38716a(this.f183791a.f183788a).mo33800a(EditToolbarViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: a */
    public final void mo87563a() {
        m142164h().mo128251c(2, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: c */
    public final void mo87565c() {
        m142164h().mo128251c(4, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: e */
    public final void mo87567e() {
        EditPhotoCanvasPromptViewModel.C35385a.m72412a(this.f183788a).mo62287a();
        C71529w.m126422b("canvas_gesture");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: f */
    public final void mo87568f() {
        m142164h().mo128251c(15, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: g */
    public final void mo87569g() {
        m142164h().mo128251c(3, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: d */
    public final void mo87566d() {
        if (C70976bp.m125310f(this.f183790c)) {
            m142164h().mo128251c(6, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: b */
    public final void mo87564b() {
        if (!C71528a.m126417b(this.f183790c) || !C70976bp.m125300a()) {
            m142164h().mo128251c(1, true);
            return;
        }
        m142164h().f185702a.f184002a = true;
        if (C63253l.f143623a.mo73306b().mo101549h() || !m142164h().f185702a.f184003b) {
            m142164h().mo128251c(1, true);
        } else {
            m142164h().mo128243a(true);
        }
    }

    public C82146e(ActivityC0945e eVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f183788a = eVar;
        this.f183790c = videoPublishEditModel;
    }
}
