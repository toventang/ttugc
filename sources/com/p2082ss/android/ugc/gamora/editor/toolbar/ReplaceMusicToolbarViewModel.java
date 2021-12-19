package com.p2082ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarViewModel */
public final class ReplaceMusicToolbarViewModel extends LifecycleAwareViewModel<ReplaceMusicEditToolbarState> implements AbstractC83135aa {
    static {
        Covode.recordClassIndex(97009);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83135aa
    /* renamed from: a */
    public final void mo128277a() {
        mo33689c(C83127a.f185749a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ReplaceMusicEditToolbarState(new AbstractC23517a.C23519b(), null, null, null, 14, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarViewModel$a */
    static final class C83127a extends AbstractC89220m implements AbstractC89172b<ReplaceMusicEditToolbarState, ReplaceMusicEditToolbarState> {

        /* renamed from: a */
        public static final C83127a f185749a = new C83127a();

        static {
            Covode.recordClassIndex(97010);
        }

        C83127a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ReplaceMusicEditToolbarState invoke(ReplaceMusicEditToolbarState replaceMusicEditToolbarState) {
            ReplaceMusicEditToolbarState replaceMusicEditToolbarState2 = replaceMusicEditToolbarState;
            C89219l.m154721d(replaceMusicEditToolbarState2, "");
            return ReplaceMusicEditToolbarState.copy$default(replaceMusicEditToolbarState2, null, null, new C20526p(), null, 11, null);
        }
    }
}
