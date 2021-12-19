package com.p2082ss.android.ugc.gamora.editor.rootscene;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.rootscene.b */
public final class C82556b implements AbstractC82562e {

    /* renamed from: a */
    public final ActivityC0945e f184647a;

    /* renamed from: b */
    private final AbstractC89244h f184648b = C89250i.m154773a((AbstractC89171a) new C82559c(this));

    /* renamed from: c */
    private final AbstractC89244h f184649c = C89250i.m154773a((AbstractC89171a) new C82558b(this));

    /* renamed from: d */
    private final AbstractC89244h f184650d = C89250i.m154773a((AbstractC89171a) new C82557a(this));

    static {
        Covode.recordClassIndex(96401);
    }

    /* renamed from: a */
    private final EditToolbarViewModel m142711a() {
        return (EditToolbarViewModel) this.f184648b.getValue();
    }

    /* renamed from: b */
    private final EditCornerViewModel m142712b() {
        return (EditCornerViewModel) this.f184650d.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.rootscene.b$a */
    static final class C82557a extends AbstractC89220m implements AbstractC89171a<EditCornerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82556b f184651a;

        static {
            Covode.recordClassIndex(96402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82557a(C82556b bVar) {
            super(0);
            this.f184651a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditCornerViewModel invoke() {
            return C20531t.m38716a(this.f184651a.f184647a).mo33800a(EditCornerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.rootscene.b$b */
    static final class C82558b extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82556b f184652a;

        static {
            Covode.recordClassIndex(96403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82558b(C82556b bVar) {
            super(0);
            this.f184652a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return C20531t.m38716a(this.f184652a.f184647a).mo33800a(EditStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.rootscene.b$c */
    static final class C82559c extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82556b f184653a;

        static {
            Covode.recordClassIndex(96404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82559c(C82556b bVar) {
            super(0);
            this.f184653a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            return C20531t.m38716a(this.f184653a.f184647a).mo33800a(EditToolbarViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: a */
    public final void mo87779a(boolean z) {
        int i;
        EditCornerViewModel b = m142712b();
        if (z) {
            i = C70636dh.m124833c(this.f184647a);
        } else {
            i = 0;
        }
        b.mo127318a(i);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: b */
    public final void mo87780b(boolean z) {
        int c = C33398a.m68487c();
        EditCornerViewModel b = m142712b();
        if (!z) {
            c = 0;
        }
        b.mo127320b(c);
    }

    public C82556b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f184647a = eVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: a */
    public final void mo87778a(int i, int i2) {
        m142711a().mo33689c(new EditToolbarViewModel.C83114p(i));
        ((EditStickerViewModel) this.f184649c.getValue()).mo127676a(Integer.valueOf(i));
        m142711a().mo33689c(new EditToolbarViewModel.C83108j(i2));
    }
}
