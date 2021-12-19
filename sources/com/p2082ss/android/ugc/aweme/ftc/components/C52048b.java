package com.p2082ss.android.ugc.aweme.ftc.components;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.b */
public final class C52048b implements AbstractC82562e {

    /* renamed from: a */
    public final ActivityC0945e f119920a;

    /* renamed from: b */
    private final AbstractC89244h f119921b = C89250i.m154773a((AbstractC89171a) new C52051c(this));

    /* renamed from: c */
    private final AbstractC89244h f119922c = C89250i.m154773a((AbstractC89171a) new C52050b(this));

    /* renamed from: d */
    private final AbstractC89244h f119923d = C89250i.m154773a((AbstractC89171a) new C52049a(this));

    static {
        Covode.recordClassIndex(61423);
    }

    /* renamed from: a */
    private final FTCEditToolbarViewModel m96802a() {
        return (FTCEditToolbarViewModel) this.f119921b.getValue();
    }

    /* renamed from: b */
    private final FTCEditCornerViewModel m96803b() {
        return (FTCEditCornerViewModel) this.f119923d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.b$a */
    static final class C52049a extends AbstractC89220m implements AbstractC89171a<FTCEditCornerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52048b f119924a;

        static {
            Covode.recordClassIndex(61424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52049a(C52048b bVar) {
            super(0);
            this.f119924a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditCornerViewModel invoke() {
            return C20531t.m38716a(this.f119924a.f119920a).mo33800a(FTCEditCornerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.b$b */
    static final class C52050b extends AbstractC89220m implements AbstractC89171a<FTCEditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52048b f119925a;

        static {
            Covode.recordClassIndex(61425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52050b(C52048b bVar) {
            super(0);
            this.f119925a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditStickerViewModel invoke() {
            return C20531t.m38716a(this.f119925a.f119920a).mo33800a(FTCEditStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.b$c */
    static final class C52051c extends AbstractC89220m implements AbstractC89171a<FTCEditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52048b f119926a;

        static {
            Covode.recordClassIndex(61426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52051c(C52048b bVar) {
            super(0);
            this.f119926a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditToolbarViewModel invoke() {
            return C20531t.m38716a(this.f119926a.f119920a).mo33800a(FTCEditToolbarViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: a */
    public final void mo87779a(boolean z) {
        int i;
        FTCEditCornerViewModel b = m96803b();
        if (z) {
            i = C70636dh.m124833c(this.f119920a);
        } else {
            i = 0;
        }
        b.mo33689c(new FTCEditCornerViewModel.C52054c(i));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: b */
    public final void mo87780b(boolean z) {
        int c = C33398a.m68487c();
        FTCEditCornerViewModel b = m96803b();
        if (!z) {
            c = 0;
        }
        b.mo33689c(new FTCEditCornerViewModel.C52052a(c));
    }

    public C52048b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f119920a = eVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: a */
    public final void mo87778a(int i, int i2) {
        m96802a().mo33689c(new FTCEditToolbarViewModel.C52371k(i));
        ((JediViewModel) this.f119922c.getValue()).mo33689c(new FTCEditStickerViewModel.C52167d(Integer.valueOf(i)));
        m96802a().mo33689c(new FTCEditToolbarViewModel.C52367g(i2));
    }
}
