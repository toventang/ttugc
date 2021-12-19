package com.p2082ss.android.ugc.aweme.homepage.story.icon;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.homepage.story.p3054c.C53031b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.StoryIconVM */
public final class StoryIconVM extends AssemViewModel<C53173i> {

    /* renamed from: m */
    public static final C53112a f122137m = new C53112a((byte) 0);

    /* renamed from: j */
    public Aweme f122138j;

    /* renamed from: k */
    String f122139k;

    /* renamed from: l */
    boolean f122140l;

    /* renamed from: n */
    private final AbstractC89244h f122141n = C89250i.m154773a((AbstractC89171a) C53113b.f122142a);

    static {
        Covode.recordClassIndex(62658);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C88411a mo23342g() {
        return (C88411a) this.f122141n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.StoryIconVM$a */
    public static final class C53112a {
        static {
            Covode.recordClassIndex(62659);
        }

        private C53112a() {
        }

        public /* synthetic */ C53112a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.StoryIconVM$b */
    static final class C53113b extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C53113b f122142a = new C53113b();

        static {
            Covode.recordClassIndex(62660);
        }

        C53113b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C53173i mo20674f() {
        return new C53173i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.StoryIconVM$c */
    public static final class C53114c implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ StoryIconVM f122143a;

        static {
            Covode.recordClassIndex(62661);
        }

        C53114c(StoryIconVM storyIconVM) {
            this.f122143a = storyIconVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f122143a.f122138j = null;
            this.f122143a.mo20662a(C531151.f122144a);
        }
    }

    /* renamed from: a */
    static boolean m98147a(Aweme aweme) {
        Aweme aweme2;
        UserStory userStory;
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            aweme2 = null;
        } else {
            aweme2 = UserStoryKt.currentStory(userStory);
        }
        return C76706a.m134280f(aweme2);
    }

    /* renamed from: b */
    static boolean m98148b(Aweme aweme) {
        String str;
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            str = null;
        } else {
            str = author.getUid();
        }
        return C53031b.m97957a(str);
    }
}
