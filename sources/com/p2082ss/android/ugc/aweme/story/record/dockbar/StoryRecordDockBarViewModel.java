package com.p2082ss.android.ugc.aweme.story.record.dockbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarViewModel */
public final class StoryRecordDockBarViewModel extends BaseJediViewModel<StoryRecordDockBarState> {
    static {
        Covode.recordClassIndex(90535);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new StoryRecordDockBarState(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarViewModel$a */
    static final class C77499a extends AbstractC89220m implements AbstractC89172b<StoryRecordDockBarState, StoryRecordDockBarState> {

        /* renamed from: a */
        public static final C77499a f173841a = new C77499a();

        static {
            Covode.recordClassIndex(90536);
        }

        C77499a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StoryRecordDockBarState invoke(StoryRecordDockBarState storyRecordDockBarState) {
            StoryRecordDockBarState storyRecordDockBarState2 = storyRecordDockBarState;
            C89219l.m154721d(storyRecordDockBarState2, "");
            return storyRecordDockBarState2.copy(new C20526p());
        }
    }
}
