package com.p2082ss.android.ugc.gamora.editor.music;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.music.b */
public class C82428b extends AbstractC23520b<EditMusicViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f184362a;

    /* renamed from: b */
    public final int f184363b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f184364c = C89250i.m154773a((AbstractC89171a) new C82429a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditMusicViewModel> f184365d = C82430b.f184368a;

    /* renamed from: e */
    private final C21582f f184366e;

    static {
        Covode.recordClassIndex(96268);
    }

    /* renamed from: a */
    private final C82431c m142486a() {
        return (C82431c) this.f184364c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditMusicViewModel> mo23031b() {
        return this.f184365d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184362a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f184366e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.b$b */
    static final class C82430b extends AbstractC89220m implements AbstractC89171a<EditMusicViewModel> {

        /* renamed from: a */
        public static final C82430b f184368a = new C82430b();

        static {
            Covode.recordClassIndex(96270);
        }

        C82430b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditMusicViewModel invoke() {
            return new EditMusicViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.b$a */
    static final class C82429a extends AbstractC89220m implements AbstractC89171a<C82431c> {

        /* renamed from: a */
        final /* synthetic */ C82428b f184367a;

        static {
            Covode.recordClassIndex(96269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82429a(C82428b bVar) {
            super(0);
            this.f184367a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82431c invoke() {
            C82431c cVar = new C82431c(this.f184367a.getDiContainer());
            this.f184367a.f184362a.mo36387a(this.f184367a.f184363b, cVar, "MusicScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        C82431c a = m142486a();
        a.mo127549b().mo114978d();
        try {
            VideoPublishEditModel d = a.mo127550d();
            a.mo127549b();
            C70968bl.m125251a(d, View$OnClickListenerC72712e.m128171a());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        C82431c a = m142486a();
        AbstractC31071f value = a.mo127544C().mo114778C().getValue();
        if (a.mo127549b().f163038t == null) {
            a.mo127549b().f163038t = value;
        }
        a.mo127549b().mo114977c();
        a.mo127547F();
        EditMusicViewModel editMusicViewModel = a.f184374e;
        if (editMusicViewModel == null) {
            C89219l.m154710a("musicViewModel");
        }
        editMusicViewModel.mo127539a(C70976bp.m125317m(a.mo127550d()));
        a.mo127549b().mo114973a(1, true);
        AbstractC63154aa.AbstractC63159d dVar = a.mo127549b().f163024f;
        if (dVar != null) {
            dVar.mo101590k();
        }
    }

    public C82428b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184366e = fVar;
        this.f184362a = bVar;
    }
}
