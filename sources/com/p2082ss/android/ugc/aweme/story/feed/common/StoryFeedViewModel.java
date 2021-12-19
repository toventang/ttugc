package com.p2082ss.android.ugc.aweme.story.feed.common;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.api.StoryApi;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.AbstractC76621c;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d;
import com.p2082ss.android.ugc.aweme.story.publish.C77428e;
import com.p2082ss.android.ugc.aweme.story.publish.C77429f;
import com.p2082ss.android.ugc.aweme.story.publish.EnumC77446i;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89284h;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel */
public final class StoryFeedViewModel extends DataCenter implements AbstractC76618d {

    /* renamed from: h */
    public static final C77170b f173108h = new C77170b((byte) 0);

    /* renamed from: c */
    public final Map<String, Aweme> f173109c = new LinkedHashMap();

    /* renamed from: d */
    public final Map<String, UserStory> f173110d = new LinkedHashMap();

    /* renamed from: e */
    final Map<String, List<C77232q>> f173111e = new LinkedHashMap();

    /* renamed from: f */
    public final C77229p f173112f;

    /* renamed from: g */
    boolean f173113g;

    /* renamed from: i */
    private final String f173114i;

    /* renamed from: j */
    private final String f173115j;

    /* renamed from: k */
    private final AbstractC89244h f173116k = C89250i.m154773a((AbstractC89171a) C77173e.f173123a);

    /* renamed from: l */
    private final C88411a f173117l = new C88411a();

    /* renamed from: m */
    private final AbstractC1204m f173118m;

    /* renamed from: n */
    private final C49812b f173119n;

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$l */
    public static final class C77182l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C77182l f173145a = new C77182l();

        static {
            Covode.recordClassIndex(90192);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(90178);
    }

    /* renamed from: a */
    public final ValueAnimator mo120780a() {
        return (ValueAnimator) this.f173116k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$b */
    public static final class C77170b {
        static {
            Covode.recordClassIndex(90180);
        }

        private C77170b() {
        }

        public /* synthetic */ C77170b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$k */
    public static final class C77179k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryFeedViewModel f173133a;

        /* renamed from: b */
        final /* synthetic */ String f173134b;

        static {
            Covode.recordClassIndex(90189);
        }

        public C77179k(StoryFeedViewModel storyFeedViewModel, String str) {
            this.f173133a = storyFeedViewModel;
            this.f173134b = str;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$k$b */
        static final class C77181b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ UserStory f173140a;

            /* renamed from: b */
            final /* synthetic */ Aweme f173141b;

            /* renamed from: c */
            final /* synthetic */ List f173142c;

            /* renamed from: d */
            final /* synthetic */ Aweme f173143d;

            /* renamed from: e */
            final /* synthetic */ C77179k f173144e;

            static {
                Covode.recordClassIndex(90191);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77181b(UserStory userStory, Aweme aweme, List list, Aweme aweme2, C77179k kVar) {
                super(0);
                this.f173140a = userStory;
                this.f173141b = aweme;
                this.f173142c = list;
                this.f173143d = aweme2;
                this.f173144e = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f173144e.f173133a.mo60191a("ON_CURRENT_INFO_CHANGED", (Object) this.f173140a);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$k$a */
        static final class C77180a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ UserStory f173135a;

            /* renamed from: b */
            final /* synthetic */ Aweme f173136b;

            /* renamed from: c */
            final /* synthetic */ List f173137c;

            /* renamed from: d */
            final /* synthetic */ Aweme f173138d;

            /* renamed from: e */
            final /* synthetic */ C77179k f173139e;

            static {
                Covode.recordClassIndex(90190);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77180a(UserStory userStory, Aweme aweme, List list, Aweme aweme2, C77179k kVar) {
                super(0);
                this.f173135a = userStory;
                this.f173136b = aweme;
                this.f173137c = list;
                this.f173138d = aweme2;
                this.f173139e = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f173139e.f173133a.mo120790f(this.f173139e.f173134b);
                this.f173139e.f173133a.mo60191a("LOAD_USER_STORY_SUCCESS", (Object) this.f173135a);
                return C89391z.f203057a;
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            UserStory userStory;
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            List<AbstractC89290k<SUBSCRIBE_DATA, ?>> list = aVar.f171957a;
            Aweme clone = aVar.f171959c.clone();
            C89219l.m154716b(clone, "");
            Aweme aweme = this.f173133a.f173109c.get(this.f173134b);
            if (aweme != null && (userStory = clone.getUserStory()) != null && (!C89219l.m154714a(aweme.getUserStory(), userStory))) {
                aweme.setUserStory(userStory);
                AbstractC89290k[] kVarArr = {C77219f.f173240a, C77221h.f173242a, C77222i.f173243a, C77223j.f173244a, C77224k.f173245a, C77225l.f173246a, C77226m.f173247a, C77227n.f173248a};
                C77180a aVar2 = new C77180a(userStory, aweme, list, clone, this);
                C89219l.m154721d(list, "");
                C89219l.m154721d(kVarArr, "");
                C89219l.m154721d(aVar2, "");
                Iterator<T> it = list.iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    int i = 0;
                    while (true) {
                        if (C89219l.m154714a((Object) next, (Object) kVarArr[i])) {
                            aVar2.invoke();
                            break loop0;
                        } else {
                            i++;
                            if (i >= 8) {
                            }
                        }
                    }
                }
                AbstractC89284h hVar = C77220g.f173241a;
                C77181b bVar = new C77181b(userStory, aweme, list, clone, this);
                C89219l.m154721d(list, "");
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(bVar, "");
                if (list.contains(hVar)) {
                    bVar.invoke();
                }
            }
        }
    }

    /* renamed from: h */
    private boolean m134860h() {
        return TextUtils.equals("homepage_follow", this.f173114i);
    }

    /* renamed from: b */
    public final boolean mo120783b() {
        return TextUtils.equals("westwindow", this.f173114i);
    }

    /* renamed from: d */
    public final boolean mo120787d() {
        return TextUtils.equals("story_archive", this.f173114i);
    }

    /* renamed from: f */
    public final boolean mo120791f() {
        return C89219l.m154714a((Object) this.f173119n.getFrom(), (Object) "STORY_ENTRANCE_DEFAULT");
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f173118m.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f173117l.mo142944a();
        C77429f.m135381e(this.f173115j);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$e */
    static final class C77173e extends AbstractC89220m implements AbstractC89171a<ValueAnimator> {

        /* renamed from: a */
        public static final C77173e f173123a = new C77173e();

        static {
            Covode.recordClassIndex(90183);
        }

        C77173e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ValueAnimator invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(5000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            return ofFloat;
        }
    }

    /* renamed from: g */
    private boolean m134859g() {
        if (!TextUtils.equals("personal_homepage", this.f173114i) || !C76660b.m134246f()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo120784c() {
        if (!TextUtils.equals("personal_homepage", this.f173114i) || C76660b.m134246f()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo120788e() {
        if (TextUtils.equals("homepage_follow", this.f173114i) || TextUtils.equals("homepage_hot", this.f173114i)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$a */
    public static final class C77169a implements AbstractC77426d {

        /* renamed from: a */
        final /* synthetic */ StoryFeedViewModel f173120a;

        static {
            Covode.recordClassIndex(90179);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89655a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89656a(float f) {
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89658a(EnumC77446i iVar) {
            C89219l.m154721d(iVar, "");
        }

        C77169a(StoryFeedViewModel storyFeedViewModel) {
            this.f173120a = storyFeedViewModel;
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89657a(int i) {
            this.f173120a.mo60191a("UPLOADING_USER_STORY_ALL_SUCCESS", Integer.valueOf(i));
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89659a(String str) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: c */
        public final void mo89662c(String str, C77428e eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(eVar, "");
            this.f173120a.mo60191a("UPLOADING_LOCAL_VIDEO_READY", str);
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: b */
        public final void mo89661b(String str, C77428e eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(eVar, "");
            if (eVar.f173722b == EnumC77446i.SUCCESS) {
                Aweme aweme = eVar.f173724d;
                if (aweme != null) {
                    this.f173120a.mo60191a("UPLOADING_USER_STORY_SUCCESS", new C89378p(str, aweme));
                }
            } else if (eVar.f173722b == EnumC77446i.FAILED) {
                this.f173120a.mo60191a("UPLOADING_USER_STORY_FAIL", C89387v.m154943a(str, eVar.f173723c));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
        /* renamed from: a */
        public final void mo89660a(String str, C77428e eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(eVar, "");
            if (eVar.f173724d != null) {
                this.f173120a.mo60191a("UPLOADING_USER_STORY_PROGRESS", C89387v.m154943a(str, Float.valueOf(eVar.f173721a)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$c */
    static final class C77171c extends AbstractC89220m implements AbstractC89172b<UserStory, UserStory> {

        /* renamed from: a */
        final /* synthetic */ UserStory f173121a;

        static {
            Covode.recordClassIndex(90181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77171c(UserStory userStory) {
            super(1);
            this.f173121a = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            C89219l.m154721d(userStory, "");
            return UserStoryKt.copyAll(this.f173121a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$d */
    static final class C77172d extends AbstractC89220m implements AbstractC89172b<UserStory, UserStory> {

        /* renamed from: a */
        final /* synthetic */ UserStory f173122a;

        static {
            Covode.recordClassIndex(90182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77172d(UserStory userStory) {
            super(1);
            this.f173122a = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            C89219l.m154721d(userStory, "");
            return UserStoryKt.copyAll(this.f173122a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$g */
    public static final class C77175g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryFeedViewModel f173127a;

        /* renamed from: b */
        final /* synthetic */ String f173128b;

        static {
            Covode.recordClassIndex(90185);
        }

        C77175g(StoryFeedViewModel storyFeedViewModel, String str) {
            this.f173127a = storyFeedViewModel;
            this.f173128b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f173127a.mo120790f(this.f173128b);
            this.f173127a.mo60191a("LOAD_USER_STORY_FAIL", (Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$h */
    static final class C77176h extends AbstractC89220m implements AbstractC89172b<UserStory, UserStory> {

        /* renamed from: a */
        final /* synthetic */ UserStory f173129a;

        static {
            Covode.recordClassIndex(90186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77176h(UserStory userStory) {
            super(1);
            this.f173129a = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            C89219l.m154721d(userStory, "");
            return UserStoryKt.copyAll(this.f173129a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$j */
    public static final class C77178j<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k[] f173132a;

        static {
            Covode.recordClassIndex(90188);
        }

        public C77178j(AbstractC89290k[] kVarArr) {
            this.f173132a = kVarArr;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            return AbstractC76621c.C76622a.m134212a(aVar.f171957a, aVar.f171958b, aVar.f171959c, this.f173132a);
        }
    }

    /* renamed from: h */
    public static boolean m134861h(String str) {
        String str2;
        C89219l.m154721d(str, "");
        User b = C80580in.m139683b();
        if (b != null) {
            str2 = b.getUid();
        } else {
            str2 = null;
        }
        return TextUtils.equals(str, str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$i */
    public static final class C77177i<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ Object f173130a;

        /* renamed from: b */
        final /* synthetic */ AbstractC76621c f173131b;

        static {
            Covode.recordClassIndex(90187);
        }

        public C77177i(Object obj, AbstractC76621c cVar) {
            this.f173130a = obj;
            this.f173131b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            if (!C89219l.m154714a(this.f173131b.mo120327a((Object) aVar.f171958b, (Object) aVar.f171959c), this.f173130a) || !(!aVar.f171957a.isEmpty())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static String m134856a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        User author = aweme.getAuthor();
        if (author != null) {
            String uid = author.getUid();
            C89219l.m154716b(uid, "");
            return uid;
        }
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return "";
        }
        C89219l.m154716b(userStory, "");
        if (userStory.getStories().size() <= 0) {
            return "";
        }
        String authorUid = userStory.getStories().get(0).getAuthorUid();
        C89219l.m154716b(authorUid, "");
        return authorUid;
    }

    /* renamed from: c */
    public final boolean mo120785c(String str) {
        UserStory userStory;
        C89219l.m154721d(str, "");
        Aweme aweme = this.f173109c.get(str);
        if (aweme == null || (userStory = aweme.getUserStory()) == null || !userStory.getShouldShowGuide() || !mo120788e()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo120789e(String str) {
        Aweme aweme;
        UserStory userStory;
        C89219l.m154721d(str, "");
        if (!(m134861h(str) || (aweme = this.f173109c.get(str)) == null || (userStory = aweme.getUserStory()) == null)) {
            C89219l.m154716b(userStory, "");
            if (userStory.hasDiffForLoad(this.f173110d.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo120792g(String str) {
        C89219l.m154721d(str, "");
        if (!m134861h(str) || C77429f.f173727b.size() <= 0) {
            return false;
        }
        if (mo120783b() || mo120784c()) {
            return true;
        }
        if ((!C76660b.m134246f() || (!m134860h() && !m134859g())) && !this.f173119n.isShouldQueryMyStoryFromCache()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final Aweme m134862i(String str) {
        User author;
        Aweme aweme = new Aweme();
        aweme.setAwemeType(40);
        aweme.setStoryFakeAweme(true);
        aweme.setFakeAid(UUID.randomUUID().toString());
        Story story = new Story(0, false, 0, false, 0, false, false, false, false, 511, null);
        story.setFaked(true);
        aweme.setStory(story);
        Aweme aweme2 = this.f173109c.get(str);
        if (!(aweme2 == null || (author = aweme2.getAuthor()) == null)) {
            aweme.setAuthor(author);
        }
        return aweme;
    }

    /* renamed from: f */
    public final List<C77232q> mo120790f(String str) {
        UserStory userStory;
        Aweme aweme = this.f173109c.get(str);
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return new ArrayList();
        }
        C89219l.m154716b(userStory, "");
        int totalCount = (int) userStory.getTotalCount();
        userStory.getTotalCount();
        C77429f.f173727b.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < totalCount; i3++) {
            long j = (long) i3;
            if (j >= userStory.getCurrentPosition() && j < ((long) userStory.getStories().size()) + userStory.getCurrentPosition()) {
                String aid = userStory.getStories().get(i).getAid();
                if (aid == null) {
                    aid = "";
                }
                arrayList.add(new C77232q(aid, EnumC77233r.LOADED));
                i++;
            } else if (!mo120792g(str) || i3 < totalCount - C77429f.f173727b.size()) {
                arrayList.add(new C77232q("", EnumC77233r.UNLOADING));
            } else {
                String aid2 = C77429f.f173727b.get(i2).getAid();
                if (aid2 == null) {
                    aid2 = "";
                }
                arrayList.add(new C77232q(aid2, EnumC77233r.PUBLISH));
                i2++;
            }
        }
        this.f173111e.put(str, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel$f */
    public static final class C77174f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryFeedViewModel f173124a;

        /* renamed from: b */
        final /* synthetic */ String f173125b;

        /* renamed from: c */
        final /* synthetic */ boolean f173126c;

        static {
            Covode.recordClassIndex(90184);
        }

        C77174f(StoryFeedViewModel storyFeedViewModel, String str, boolean z) {
            this.f173124a = storyFeedViewModel;
            this.f173125b = str;
            this.f173126c = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0144  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0154  */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r37) {
            /*
            // Method dump skipped, instructions count: 447
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel.C77174f.accept(java.lang.Object):void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.feed.model.Aweme> mo120786d(java.lang.String r35) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel.mo120786d(java.lang.String):java.util.List");
    }

    public StoryFeedViewModel(AbstractC1204m mVar, C49812b bVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        this.f173118m = mVar;
        this.f173119n = bVar;
        String eventType = bVar.getEventType();
        this.f173114i = eventType;
        String str = eventType + ":story_feed_view_model";
        this.f173115j = str;
        this.f80259a = mVar;
        if (mo120784c() || mo120783b()) {
            C77429f.f173733h.mo120167a(str, new C77169a(this));
        }
        this.f173112f = new C77229p();
    }

    /* renamed from: a */
    private final void m134858a(String str, boolean z) {
        UserStory userStory;
        long currentPosition;
        long currentPosition2;
        Aweme aweme = this.f173109c.get(str);
        if (!(aweme == null || (userStory = aweme.getUserStory()) == null)) {
            C89219l.m154716b(userStory, "");
            List<C77232q> list = this.f173111e.get(str);
            if (list == null) {
                list = mo120790f(str);
            }
            if (z) {
                if (userStory.getCurrentPosition() < 5) {
                    currentPosition2 = 0;
                } else {
                    currentPosition2 = (userStory.getCurrentPosition() + 1) - 5;
                }
                int currentPosition3 = (int) userStory.getCurrentPosition();
                for (int i = (int) currentPosition2; i < currentPosition3; i++) {
                    if (i < list.size()) {
                        list.set(i, new C77232q("", EnumC77233r.LOADING));
                    }
                }
                return;
            }
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) + 5 >= userStory.getTotalCount()) {
                currentPosition = userStory.getTotalCount();
            } else {
                currentPosition = userStory.getCurrentPosition() + ((long) userStory.getStories().size()) + 5;
            }
            int i2 = (int) currentPosition;
            for (int size = userStory.getStories().size() + ((int) userStory.getCurrentPosition()); size < i2; size++) {
                if (size < list.size() && list.get(size).f173254b == EnumC77233r.UNLOADING) {
                    list.get(size).mo120830a(EnumC77233r.LOADING);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo120779a(String str, List<? extends Aweme> list) {
        UserStory userStory;
        int currentPosition;
        T t;
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        Aweme aweme = this.f173109c.get(str);
        int i = 0;
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return 0;
        }
        C89219l.m154716b(userStory, "");
        Integer currentIndex = UserStoryKt.currentIndex(userStory);
        if (currentIndex != null) {
            currentPosition = currentIndex.intValue();
        } else {
            currentPosition = (int) userStory.getCurrentPosition();
        }
        int size = list.size();
        Integer num = null;
        if (1 <= size && currentPosition >= size) {
            currentPosition = list.size() - 1;
            t = (Aweme) list.get(currentPosition);
        } else if (currentPosition < 0 || currentPosition >= list.size()) {
            currentPosition = -1;
            t = null;
        } else {
            t = (Aweme) list.get(currentPosition);
        }
        if (mo120792g(str) && C77429f.f173727b.size() > 0) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = next;
                Story story = t2.getStory();
                if (story != null && story.isPublishing()) {
                    currentPosition = i;
                    t = t2;
                    break;
                }
                i = i2;
            }
        }
        if (currentPosition >= 0) {
            num = Integer.valueOf(currentPosition);
        }
        C77229p.m135002a(str, userStory, num, t);
        return currentPosition;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo120782a(String str, UserStory userStory) {
        if (mo120792g(str)) {
            userStory.setTotalCount((userStory.getOriginTotalCount() + ((long) C77429f.f173727b.size())) - ((long) C77429f.f173733h.mo120164a(userStory, true)));
            mo120790f(str);
        }
    }

    /* renamed from: a */
    private final void m134857a(String str, long j, boolean z) {
        m134858a(str, z);
        AbstractC88412b a = StoryApi.f171712a.getUserStory(str, j, z, 5).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77174f(this, str, z), new C77175g(this, str));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f173117l);
    }

    /* renamed from: a */
    public final void mo120781a(String str, int i, List<? extends Aweme> list) {
        UserStory userStory;
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        Aweme aweme = this.f173109c.get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            C89219l.m154716b(userStory, "");
            List<C77232q> list2 = this.f173111e.get(str);
            if (list2 == null) {
                list2 = mo120790f(str);
            }
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) < userStory.getTotalCount() && ((long) (i + 1)) >= userStory.getCurrentPosition() + ((long) userStory.getStories().size()) && userStory.getHasMoreAfter() && ((int) userStory.getCurrentPosition()) + userStory.getStories().size() < list2.size() && list2.get(((int) userStory.getCurrentPosition()) + userStory.getStories().size()).f173254b == EnumC77233r.UNLOADING) {
                m134857a(str, userStory.getMaxCursor(), false);
            }
            if (userStory.getCurrentPosition() != 0 && ((long) (i - 1)) <= userStory.getCurrentPosition() && userStory.getHasMoreBefore() && ((int) userStory.getCurrentPosition()) - 1 < list2.size() && list2.get(((int) userStory.getCurrentPosition()) - 1).f173254b == EnumC77233r.UNLOADING) {
                m134857a(str, userStory.getMinCursor(), true);
            }
        }
    }
}
