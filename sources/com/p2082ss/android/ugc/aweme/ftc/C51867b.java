package com.p2082ss.android.ugc.aweme.ftc;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.b */
public final class C51867b implements C71529w.AbstractC71530a {

    /* renamed from: a */
    public final ActivityC0945e f119510a;

    /* renamed from: b */
    private final AbstractC89244h f119511b = C89250i.m154773a((AbstractC89171a) new C51868a(this));

    /* renamed from: c */
    private final VideoPublishEditModel f119512c;

    static {
        Covode.recordClassIndex(61236);
    }

    /* renamed from: h */
    private final FTCEditToolbarViewModel m96541h() {
        return (FTCEditToolbarViewModel) this.f119511b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: c */
    public final void mo87565c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: e */
    public final void mo87567e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: f */
    public final void mo87568f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b$a */
    static final class C51868a extends AbstractC89220m implements AbstractC89171a<FTCEditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C51867b f119513a;

        static {
            Covode.recordClassIndex(61237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51868a(C51867b bVar) {
            super(0);
            this.f119513a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditToolbarViewModel invoke() {
            return C20531t.m38716a(this.f119513a.f119510a).mo33800a(FTCEditToolbarViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: a */
    public final void mo87563a() {
        m96541h().mo88156c(2, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: b */
    public final void mo87564b() {
        m96541h().mo88156c(1, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: g */
    public final void mo87569g() {
        m96541h().mo88156c(3, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.AbstractC71530a
    /* renamed from: d */
    public final void mo87566d() {
        if (C70976bp.m125310f(this.f119512c)) {
            m96541h().mo88156c(6, true);
        }
    }

    public C51867b(ActivityC0945e eVar, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f119510a = eVar;
        this.f119512c = videoPublishEditModel;
    }
}
