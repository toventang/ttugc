package com.p2082ss.android.ugc.aweme.story.edit;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.e */
public final class C77142e implements AbstractC82562e {

    /* renamed from: a */
    public final ActivityC0945e f173012a;

    /* renamed from: b */
    private final AbstractC89244h f173013b = C89250i.m154773a((AbstractC89171a) new C77143a(this));

    static {
        Covode.recordClassIndex(90147);
    }

    /* renamed from: a */
    private final StoryEditToolbarViewModel m134743a() {
        return (StoryEditToolbarViewModel) this.f173013b.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: a */
    public final void mo87779a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: b */
    public final void mo87780b(boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.e$a */
    static final class C77143a extends AbstractC89220m implements AbstractC89171a<StoryEditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C77142e f173014a;

        static {
            Covode.recordClassIndex(90148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77143a(C77142e eVar) {
            super(0);
            this.f173014a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StoryEditToolbarViewModel invoke() {
            return C20531t.m38716a(this.f173014a.f173012a).mo33800a(StoryEditToolbarViewModel.class);
        }
    }

    /* renamed from: b */
    private final EditStickerViewModel m134744b() {
        JediViewModel a = C20531t.m38716a(this.f173012a).mo33800a(EditStickerViewModel.class);
        C89219l.m154716b(a, "");
        return (EditStickerViewModel) a;
    }

    public C77142e(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f173012a = eVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82562e
    /* renamed from: a */
    public final void mo87778a(int i, int i2) {
        m134743a().mo120596a(i);
        m134743a().mo120600b(i2);
        m134744b().mo127676a(Integer.valueOf(i));
    }
}
