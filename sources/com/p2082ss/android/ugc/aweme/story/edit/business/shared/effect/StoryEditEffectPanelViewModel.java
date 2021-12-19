package com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.EffectModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b;
import com.p2082ss.android.ugc.aweme.story.edit.C76748b;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view.AbstractC77000a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.C77092n;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel */
public final class StoryEditEffectPanelViewModel extends LifecycleAwareViewModel<StoryEditEffectPanelState> implements AbstractC21566a, AbstractC76981a, AbstractC77000a, AbstractC77135b, AbstractC77135b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172710a = {new C89232y(StoryEditEffectPanelViewModel.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new C89232y(StoryEditEffectPanelViewModel.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0)};

    /* renamed from: b */
    private final AbstractC89248d f172711b = C21572a.m40504a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: c */
    private final AbstractC89248d f172712c = C21572a.m40504a(getDiContainer(), StoryEditModel.class);

    /* renamed from: d */
    private final AbstractC89244h f172713d = C89250i.m154774a(EnumC89331m.NONE, new C76977a(this));

    /* renamed from: e */
    private final AbstractC89244h f172714e = C89250i.m154773a((AbstractC89171a) C76978b.f172717a);

    /* renamed from: f */
    private final C21582f f172715f;

    static {
        Covode.recordClassIndex(89974);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view.AbstractC77000a
    /* renamed from: b */
    public final AbstractC46355b mo120531b() {
        return (AbstractC46355b) this.f172714e.getValue();
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172715f;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel$b */
    static final class C76978b extends AbstractC89220m implements AbstractC89171a<C76992e> {

        /* renamed from: a */
        public static final C76978b f172717a = new C76978b();

        static {
            Covode.recordClassIndex(89976);
        }

        C76978b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76992e invoke() {
            return new C76992e();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    private final void onDestroy() {
        mo120531b().mo78863a();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.AbstractC76981a
    /* renamed from: a */
    public final void mo120529a() {
        mo33689c(C76980d.f172719a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new StoryEditEffectPanelState(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel$a */
    public static final class C76977a extends AbstractC89220m implements AbstractC89171a<AbstractC77066d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172716a;

        static {
            Covode.recordClassIndex(89975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76977a(AbstractC21566a aVar) {
            super(0);
            this.f172716a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172716a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel.C76977a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        getLifecycle().mo4012a(this);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77117a
    public final /* synthetic */ VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172711b.mo23374a(this, f172710a[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view.AbstractC77000a
    /* renamed from: h */
    public final void mo120533h() {
        ((AbstractC77066d) this.f172713d.getValue()).mo120597a(new C77092n(100, "click_panel"));
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view.AbstractC77000a
    /* renamed from: g */
    public final void mo120532g() {
        boolean z;
        AbstractC31071f a;
        VEEditClip c = C77134a.m134738c(this);
        if (c != null) {
            ArrayList<EffectPointModel> effectList = c.f172984g.getEffectList();
            if (effectList == null || effectList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!(!(!z) || effectList == null || (a = C77134a.m134735a(c)) == null)) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) effectList, 10));
                Iterator<T> it = effectList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(it.next().getIndex()));
                }
                a.mo56293a(C89070n.m154578e((Collection<Integer>) arrayList));
            }
            c.f172984g.setEffectList(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel$c */
    static final class C76979c extends AbstractC89220m implements AbstractC89172b<StoryEditEffectPanelState, StoryEditEffectPanelState> {

        /* renamed from: a */
        public static final C76979c f172718a = new C76979c();

        static {
            Covode.recordClassIndex(89977);
        }

        C76979c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditEffectPanelState invoke(StoryEditEffectPanelState storyEditEffectPanelState) {
            StoryEditEffectPanelState storyEditEffectPanelState2 = storyEditEffectPanelState;
            C89219l.m154721d(storyEditEffectPanelState2, "");
            return StoryEditEffectPanelState.copy$default(storyEditEffectPanelState2, null, new C20526p(), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel$d */
    static final class C76980d extends AbstractC89220m implements AbstractC89172b<StoryEditEffectPanelState, StoryEditEffectPanelState> {

        /* renamed from: a */
        public static final C76980d f172719a = new C76980d();

        static {
            Covode.recordClassIndex(89978);
        }

        C76980d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditEffectPanelState invoke(StoryEditEffectPanelState storyEditEffectPanelState) {
            StoryEditEffectPanelState storyEditEffectPanelState2 = storyEditEffectPanelState;
            C89219l.m154721d(storyEditEffectPanelState2, "");
            return StoryEditEffectPanelState.copy$default(storyEditEffectPanelState2, new AbstractC23517a.C23519b(), null, 2, null);
        }
    }

    public StoryEditEffectPanelViewModel(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172715f = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view.AbstractC77000a
    /* renamed from: a */
    public final void mo120530a(EffectModel effectModel) {
        AbstractC31071f a;
        C89219l.m154721d(effectModel, "");
        VEEditClip c = C77134a.m134738c(this);
        if (c != null && (a = C77134a.m134735a(c)) != null) {
            mo120532g();
            int j = a.mo56368j();
            int[] a2 = a.mo56318a(new int[]{0}, new int[]{j}, new String[]{effectModel.resDir});
            if (a2.length != 0) {
                EffectPointModel effectPointModel = new EffectPointModel();
                effectPointModel.setName(effectModel.name);
                effectPointModel.setKey(effectModel.key);
                effectPointModel.setExtra(effectModel.extra);
                effectPointModel.setType(effectModel.type);
                effectPointModel.setCategory(effectModel.category);
                effectPointModel.setIndex(a2[0]);
                effectPointModel.setUiStartPoint(0);
                effectPointModel.setUiEndPoint(j);
                effectPointModel.setStartPoint(0);
                effectPointModel.setEndPoint(j);
                effectPointModel.setFromEnd(false);
                effectPointModel.setSelectedColor(0);
                effectPointModel.setDuration(j - 0);
                effectPointModel.setResDir(effectModel.resDir);
                StoryEditClipModel d = C77134a.m134739d(this);
                if (d != null) {
                    d.setEffectList(C89070n.m154525d(effectPointModel));
                }
                StoryEditModel storyEditModel = (StoryEditModel) this.f172712c.mo23374a(this, f172710a[1]);
                String str = effectModel.name;
                C89219l.m154716b(str, "");
                String str2 = effectModel.key;
                C89219l.m154716b(str2, "");
                C89219l.m154721d(storyEditModel, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C76748b.m134344a("effect_click", storyEditModel, new C76748b.C76752d(str, str2));
            }
        }
    }
}
