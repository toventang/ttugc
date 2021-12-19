package com.p2082ss.android.ugc.aweme.story.archive;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel */
public final class StoryArchListViewModel extends BaseDetailShareVM<C76488h, C76487g, Long> {

    /* renamed from: m */
    private long f171719m;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel$a */
    public static final class C76451a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f171720a;

        /* renamed from: b */
        int f171721b;

        /* renamed from: c */
        final /* synthetic */ StoryArchListViewModel f171722c;

        /* renamed from: d */
        Object f171723d;

        static {
            Covode.recordClassIndex(89430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76451a(StoryArchListViewModel storyArchListViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f171722c = storyArchListViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f171720a = obj;
            this.f171721b |= Integer.MIN_VALUE;
            return this.f171722c.mo120199a(0, this);
        }
    }

    static {
        Covode.recordClassIndex(89429);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C76488h();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
        return mo120199a(0, dVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel$b */
    static final class C76452b extends AbstractC89220m implements AbstractC89172b<C76488h, C76488h> {

        /* renamed from: a */
        final /* synthetic */ C14515a f171724a;

        static {
            Covode.recordClassIndex(89431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76452b(C14515a aVar) {
            super(1);
            this.f171724a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76488h invoke(C76488h hVar) {
            C76488h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return C76488h.m134061a(hVar2, this.f171724a, null, 2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: a */
    public final /* synthetic */ Long mo70712a(C49812b bVar) {
        C89219l.m154721d(bVar, "");
        return Long.valueOf(this.f171719m);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel$c */
    static final class C76453c extends AbstractC89220m implements AbstractC89172b<C76488h, C76488h> {

        /* renamed from: a */
        final /* synthetic */ String f171725a;

        static {
            Covode.recordClassIndex(89432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76453c(String str) {
            super(1);
            this.f171725a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C76488h invoke(C76488h hVar) {
            C76488h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return C76488h.m134061a(hVar2, null, new C12776a(this.f171725a), 1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: a */
    public final int mo70711a(String str) {
        C89219l.m154721d(str, "");
        List i = mo23344i();
        int i2 = -1;
        if (i != null) {
            int i3 = 0;
            Iterator it = i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C89219l.m154714a((Object) ((C76487g) it.next()).f171767a.getAid(), (Object) str)) {
                    i2 = i3;
                    if (i2 >= 0) {
                        mo23332a(i2);
                    }
                } else {
                    i3++;
                }
            }
        }
        return i2;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<C76487g> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C76452b(aVar));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: b */
    public final /* synthetic */ Aweme mo70713b(C76487g gVar) {
        boolean z;
        C76487g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        Aweme aweme = gVar2.f171767a;
        C89219l.m154721d(aweme, "");
        if (aweme.getAwemeType() != 40 || aweme.getUserStory() != null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.setAid(aweme.getAid());
        Aweme a = AwemeService.m70060b().mo60677a(aweme);
        C89219l.m154716b(a, "");
        List c = C89070n.m154524c(a);
        Story story = aweme.getStory();
        if (story != null) {
            z = story.getViewed();
        } else {
            z = false;
        }
        UserStory userStory = new UserStory(c, 1, 0, z, 0, 0, false, false, 0, 1, null, false, false, true, 7668, null);
        C77283a.m135111b("huangxin.2020", "origin total count: " + userStory.getOriginTotalCount() + ", user story instance: " + System.identityHashCode(userStory));
        aweme2.setUserStory(userStory);
        aweme2.setAwemeType(40);
        aweme2.setAuthor(aweme.getAuthor());
        aweme2.setRequestId(aweme.getRequestId());
        return aweme2;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final /* synthetic */ Object mo23331a(Object obj, AbstractC89124d dVar) {
        return mo120199a(((Number) obj).longValue(), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095 A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0 A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo120199a(long r9, p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<java.lang.Long>> r11) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.archive.StoryArchListViewModel.mo120199a(long, h.c.d):java.lang.Object");
    }
}
