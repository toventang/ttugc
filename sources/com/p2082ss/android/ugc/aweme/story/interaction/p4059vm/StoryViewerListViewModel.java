package com.p2082ss.android.ugc.aweme.story.interaction.p4059vm;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33946d;
import com.p2082ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.p2082ss.android.ugc.aweme.story.model.C77385h;
import com.p2082ss.android.ugc.aweme.story.model.C77386i;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryViewerListViewModel */
public final class StoryViewerListViewModel extends IStoryViewerListViewModel {

    /* renamed from: f */
    public static final C77345a f173537f = new C77345a((byte) 0);

    /* renamed from: g */
    private final C88411a f173538g = new C88411a();

    /* renamed from: h */
    private final AbstractC1204m f173539h;

    static {
        Covode.recordClassIndex(90371);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryViewerListViewModel$a */
    public static final class C77345a {
        static {
            Covode.recordClassIndex(90372);
        }

        private C77345a() {
        }

        public /* synthetic */ C77345a(byte b) {
            this();
        }

        /* renamed from: a */
        public static StoryViewerListViewModel m135239a(ActivityC0945e eVar, AbstractC1183ag agVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(agVar, "");
            AbstractC1174ac a = C33946d.m69515a(eVar, agVar, new C77350c(eVar)).mo3983a(StoryViewerListViewModel.class);
            C89219l.m154716b(a, "");
            return (StoryViewerListViewModel) a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f173538g.mo142944a();
    }

    public StoryViewerListViewModel(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f173539h = mVar;
        this.f80259a = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryViewerListViewModel$c */
    static final class C77347c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryViewerListViewModel f173543a;

        /* renamed from: b */
        final /* synthetic */ long f173544b;

        /* renamed from: c */
        final /* synthetic */ String f173545c;

        static {
            Covode.recordClassIndex(90374);
        }

        C77347c(StoryViewerListViewModel storyViewerListViewModel, long j, String str) {
            this.f173543a = storyViewerListViewModel;
            this.f173544b = j;
            this.f173545c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f173544b == 0) {
                this.f173543a.mo60191a("REFRESH_STORY_VIEWER_LIST_FAIL", this.f173545c);
                ((IStoryViewerListViewModel) this.f173543a).f171711d.put(this.f173545c, 3);
                return;
            }
            this.f173543a.mo60191a("LOAD_MORE_STORY_VIEWER_LIST_FAIL", this.f173545c);
            ((IStoryViewerListViewModel) this.f173543a).f171711d.put(this.f173545c, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.StoryViewerListViewModel$b */
    static final class C77346b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryViewerListViewModel f173540a;

        /* renamed from: b */
        final /* synthetic */ String f173541b;

        /* renamed from: c */
        final /* synthetic */ long f173542c;

        static {
            Covode.recordClassIndex(90373);
        }

        C77346b(StoryViewerListViewModel storyViewerListViewModel, String str, long j) {
            this.f173540a = storyViewerListViewModel;
            this.f173541b = str;
            this.f173542c = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C77386i iVar = (C77386i) obj;
            ((IStoryViewerListViewModel) this.f173540a).f171711d.put(this.f173541b, 2);
            if (this.f173542c == 0) {
                Map<String, C77386i> map = ((IStoryViewerListViewModel) this.f173540a).f171710c;
                String str = this.f173541b;
                C89219l.m154716b(iVar, "");
                map.put(str, iVar);
                this.f173540a.mo60191a("REFRESH_STORY_VIEWER_LIST_SUCCESS", new C89378p(this.f173541b, iVar));
                return;
            }
            C77386i iVar2 = ((IStoryViewerListViewModel) this.f173540a).f171710c.get(this.f173541b);
            if (iVar2 != null) {
                iVar2.setTotal(iVar.getTotal());
                iVar2.setCursor(iVar.getCursor());
                List<C77385h> viewerList = iVar2.getViewerList();
                if (viewerList != null) {
                    List<C77385h> viewerList2 = iVar.getViewerList();
                    if (viewerList2 == null) {
                        viewerList2 = C89086z.INSTANCE;
                    }
                    viewerList.addAll(viewerList2);
                }
            }
            this.f173540a.mo60191a("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS", new C89378p(this.f173541b, iVar));
        }
    }

    /* renamed from: a */
    public final void mo120924a(String str, long j) {
        int i;
        C89219l.m154721d(str, "");
        Integer num = ((IStoryViewerListViewModel) this).f171711d.get(str);
        if (num != null) {
            i = num.intValue();
            if (i == 0) {
                return;
            }
        } else {
            i = -1;
        }
        if (i != 1) {
            if (j == 0) {
                ((IStoryViewerListViewModel) this).f171711d.put(str, 0);
            } else {
                ((IStoryViewerListViewModel) this).f171711d.put(str, 1);
            }
            if (TextUtils.isEmpty(str)) {
                C77283a.m135112c("StoryViewerListViewModel", "dz[story id is empty]");
                return;
            }
            AbstractC88412b a = StoryInteractionApi.f173406a.getStoryViewerList(str, j, 30, null).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77346b(this, str, j), new C77347c(this, j, str));
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, this.f173538g);
        }
    }
}
