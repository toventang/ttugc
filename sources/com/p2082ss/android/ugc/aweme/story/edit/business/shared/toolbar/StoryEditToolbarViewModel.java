package com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel */
public final class StoryEditToolbarViewModel extends LifecycleAwareViewModel<StoryEditToolbarState> implements AbstractC77066d {

    /* renamed from: a */
    private final C1213t<C77092n> f172847a = new C1213t<>();

    static {
        Covode.recordClassIndex(90042);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d
    /* renamed from: a */
    public final LiveData<C77092n> mo120595a() {
        return this.f172847a;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new StoryEditToolbarState(new AbstractC23517a.C23519b(), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
    }

    /* renamed from: a */
    public final void mo120596a(int i) {
        mo33689c(new C77049h(i));
    }

    /* renamed from: b */
    public final void mo120600b(int i) {
        mo33689c(new C77043b(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d
    /* renamed from: c */
    public final void mo120602c(boolean z) {
        mo33689c(new C77046e(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d
    /* renamed from: d */
    public final void mo120603d(boolean z) {
        mo33689c(new C77045d(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel$f */
    static final class C77047f extends AbstractC89220m implements AbstractC89172b<StoryEditToolbarState, StoryEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f172853a;

        static {
            Covode.recordClassIndex(90048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77047f(List list) {
            super(1);
            this.f172853a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            C89219l.m154721d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, this.f172853a, null, null, null, null, null, null, null, null, null, null, 4093, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d
    /* renamed from: a */
    public final void mo120597a(C77092n nVar) {
        C89219l.m154721d(nVar, "");
        this.f172847a.setValue(nVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d
    /* renamed from: b */
    public final void mo120601b(boolean z) {
        mo33689c(new C77042a(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel$a */
    static final class C77042a extends AbstractC89220m implements AbstractC89172b<StoryEditToolbarState, StoryEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f172848a;

        static {
            Covode.recordClassIndex(90043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77042a(boolean z) {
            super(1);
            this.f172848a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            C89219l.m154721d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, Boolean.valueOf(this.f172848a), null, null, null, null, 3967, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel$b */
    static final class C77043b extends AbstractC89220m implements AbstractC89172b<StoryEditToolbarState, StoryEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f172849a;

        static {
            Covode.recordClassIndex(90044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77043b(int i) {
            super(1);
            this.f172849a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            C89219l.m154721d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, Integer.valueOf(this.f172849a), null, null, null, null, null, null, null, null, 4087, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel$c */
    static final class C77044c extends AbstractC89220m implements AbstractC89172b<StoryEditToolbarState, StoryEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f172850a;

        static {
            Covode.recordClassIndex(90045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77044c(boolean z) {
            super(1);
            this.f172850a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            C89219l.m154721d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f172850a), 2047, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel$d */
    static final class C77045d extends AbstractC89220m implements AbstractC89172b<StoryEditToolbarState, StoryEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f172851a;

        static {
            Covode.recordClassIndex(90046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77045d(boolean z) {
            super(1);
            this.f172851a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            C89219l.m154721d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f172851a), null, 3071, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel$e */
    static final class C77046e extends AbstractC89220m implements AbstractC89172b<StoryEditToolbarState, StoryEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f172852a;

        static {
            Covode.recordClassIndex(90047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77046e(boolean z) {
            super(1);
            this.f172852a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            C89219l.m154721d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f172852a), null, null, 3583, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel$g */
    static final class C77048g extends AbstractC89220m implements AbstractC89172b<StoryEditToolbarState, StoryEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f172854a;

        static {
            Covode.recordClassIndex(90049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77048g(boolean z) {
            super(1);
            this.f172854a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            C89219l.m154721d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f172854a), null, null, null, 3839, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel$h */
    static final class C77049h extends AbstractC89220m implements AbstractC89172b<StoryEditToolbarState, StoryEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f172855a;

        static {
            Covode.recordClassIndex(90050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77049h(int i) {
            super(1);
            this.f172855a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            C89219l.m154721d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, Integer.valueOf(this.f172855a), null, null, null, null, null, null, null, null, null, 4091, null);
        }
    }

    /* renamed from: a */
    public final void mo120598a(List<C77093o> list) {
        C89219l.m154721d(list, "");
        mo33689c(new C77047f(list));
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d
    /* renamed from: a */
    public final void mo120599a(boolean z) {
        mo33689c(new C77048g(z));
    }
}
