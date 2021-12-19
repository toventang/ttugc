package com.p2082ss.android.ugc.aweme.ftc.components.audioeffect;

import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70835b;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import dmt.p4542av.video.C88288n;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel */
public final class FTCEditAudioEffectViewModel extends LifecycleAwareViewModel<FTCEditAudioEffectState> implements AbstractC21566a, AbstractC51986e {

    /* renamed from: a */
    private final AbstractC89244h f119713a = C89250i.m154774a(EnumC89331m.NONE, new C51966a(this));

    /* renamed from: b */
    private final C2559g<CategoryPageModel> f119714b = new C2563k();

    /* renamed from: c */
    private final C21582f f119715c;

    static {
        Covode.recordClassIndex(61337);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119715c;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.AbstractC51986e
    /* renamed from: a */
    public final void mo87697a() {
        mo33690d(C51968c.f119718a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditAudioEffectState(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel$a */
    public static final class C51966a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119716a;

        static {
            Covode.recordClassIndex(61338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51966a(AbstractC21566a aVar) {
            super(0);
            this.f119716a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119716a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel.C51966a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel$b */
    static final class C51967b extends AbstractC89220m implements AbstractC89172b<FTCEditAudioEffectState, FTCEditAudioEffectState> {

        /* renamed from: a */
        public static final C51967b f119717a = new C51967b();

        static {
            Covode.recordClassIndex(61339);
        }

        C51967b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditAudioEffectState invoke(FTCEditAudioEffectState fTCEditAudioEffectState) {
            FTCEditAudioEffectState fTCEditAudioEffectState2 = fTCEditAudioEffectState;
            C89219l.m154721d(fTCEditAudioEffectState2, "");
            return FTCEditAudioEffectState.copy$default(fTCEditAudioEffectState2, new C20526p(), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel$c */
    static final class C51968c extends AbstractC89220m implements AbstractC89172b<FTCEditAudioEffectState, FTCEditAudioEffectState> {

        /* renamed from: a */
        public static final C51968c f119718a = new C51968c();

        static {
            Covode.recordClassIndex(61340);
        }

        C51968c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditAudioEffectState invoke(FTCEditAudioEffectState fTCEditAudioEffectState) {
            FTCEditAudioEffectState fTCEditAudioEffectState2 = fTCEditAudioEffectState;
            C89219l.m154721d(fTCEditAudioEffectState2, "");
            return FTCEditAudioEffectState.copy$default(fTCEditAudioEffectState2, null, new AbstractC23517a.C23519b(), 1, null);
        }
    }

    public FTCEditAudioEffectViewModel(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f119715c = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.AbstractC51986e
    /* renamed from: a */
    public final void mo87698a(VideoPublishEditModel videoPublishEditModel) {
        ((AbstractC72510a) this.f119713a.getValue()).mo114801a(C88288n.C88289a.m153423a());
        C70835b.m125100a(videoPublishEditModel);
        mo33690d(C51967b.f119717a);
    }
}
