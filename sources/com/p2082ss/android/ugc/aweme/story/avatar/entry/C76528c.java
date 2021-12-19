package com.p2082ss.android.ugc.aweme.story.avatar.entry;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76547g;
import com.p2082ss.android.ugc.aweme.story.avatar.C76494a;
import com.p2082ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76619a;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76620b;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76626d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4054h.C77278d;
import com.p2082ss.android.ugc.aweme.story.userstory.C77693b;
import com.p2082ss.android.ugc.aweme.story.userstory.api.UserStoryApi;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.C77697a;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.c */
public final class C76528c implements AbstractC76506d, AbstractC76547g {

    /* renamed from: a */
    public final EnumC76533d f171834a;

    /* renamed from: b */
    public final StoryRingUserStoryViewModel f171835b;

    /* renamed from: c */
    public final StoryRingStatusViewModel f171836c;

    /* renamed from: d */
    public final AbstractC76526a f171837d;

    /* renamed from: e */
    AbstractC89172b<? super Aweme, C89391z> f171838e;

    /* renamed from: f */
    private final StoryBrandView f171839f;

    /* renamed from: g */
    private final /* synthetic */ AbstractC76508e f171840g;

    static {
        Covode.recordClassIndex(89513);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76547g
    /* renamed from: a */
    public final boolean mo80537a(String str, HashMap<String, String> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        return this.f171840g.mo80537a(str, hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d
    /* renamed from: a */
    public final void mo120242a(AbstractC89172b<? super Aweme, C89391z> bVar) {
        this.f171838e = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.c$b */
    public static final class View$OnAttachStateChangeListenerC76532b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C76528c f171845a;

        static {
            Covode.recordClassIndex(89517);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC76532b(C76528c cVar) {
            this.f171845a = cVar;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f171845a.mo120243a("story_show");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.c$a */
    static final class View$OnClickListenerC76531a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76528c f171843a;

        /* renamed from: b */
        final /* synthetic */ AbstractC76508e f171844b;

        static {
            Covode.recordClassIndex(89516);
        }

        View$OnClickListenerC76531a(C76528c cVar, AbstractC76508e eVar) {
            this.f171843a = cVar;
            this.f171844b = eVar;
        }

        public final void onClick(View view) {
            List<Aweme> stories;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                Activity topActivity = ActivityStack.getTopActivity();
                if (!(topActivity instanceof ActivityC0218d)) {
                    topActivity = null;
                }
                ActivityC0218d dVar = (ActivityC0218d) topActivity;
                if (dVar == null || dVar.isFinishing()) {
                    return;
                }
                if (!C80422fe.m139425a(dVar)) {
                    new C23144b(dVar).mo37640e(R.string.dcq).mo37637b();
                    return;
                }
                Aweme value = this.f171843a.f171835b.f171799a.getValue();
                if (value != null) {
                    C89219l.m154716b(value, "");
                    UserStory userStory = value.getUserStory();
                    if (!(userStory == null || (stories = userStory.getStories()) == null)) {
                        Iterator<T> it = stories.iterator();
                        while (it.hasNext()) {
                            it.next().setUserStory(null);
                        }
                    }
                    C50529ae.f116790a = new C76527b(value);
                    SmartRoute buildRoute = SmartRouter.buildRoute(dVar, "aweme://story/detail");
                    EnumC76533d dVar2 = this.f171843a.f171834a;
                    C89219l.m154716b(buildRoute, "");
                    dVar2.onEnterPlayer(buildRoute);
                    this.f171844b.mo80535a(buildRoute, value);
                    buildRoute.open();
                    this.f171843a.mo120243a("story_click");
                }
            }
        }
    }

    public C76528c(AbstractC76508e eVar) {
        AbstractC76526a iVar;
        C89219l.m154721d(eVar, "");
        this.f171840g = eVar;
        EnumC76533d a = C76539e.m134143a(eVar.mo80539c());
        this.f171834a = a;
        StoryBrandView a2 = eVar.mo80534a();
        this.f171839f = a2;
        StoryRingUserStoryViewModel storyRingUserStoryViewModel = new StoryRingUserStoryViewModel(eVar);
        this.f171835b = storyRingUserStoryViewModel;
        C89219l.m154721d(eVar, "");
        StoryRingStatusViewModel storyRingStatusViewModel = new StoryRingStatusViewModel(eVar, (byte) 0);
        this.f171836c = storyRingStatusViewModel;
        C89219l.m154721d(eVar, "");
        int i = C76544j.f171857a[eVar.mo80539c().ordinal()];
        if (i == 1) {
            iVar = new C76543i(eVar);
        } else if (i != 2) {
            iVar = new C76541g(eVar);
        } else {
            iVar = new C76542h(eVar);
        }
        this.f171837d = iVar;
        AbstractC1204m b = eVar.mo80538b();
        storyRingUserStoryViewModel.f171799a.observe(b, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.story.avatar.entry.C76528c.C765291 */

            /* renamed from: a */
            final /* synthetic */ C76528c f171841a;

            static {
                Covode.recordClassIndex(89514);
            }

            {
                this.f171841a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                Aweme aweme = (Aweme) obj;
                AbstractC89172b<? super Aweme, C89391z> bVar = this.f171841a.f171838e;
                if (bVar != null) {
                    bVar.invoke(aweme);
                }
                StoryRingStatusViewModel storyRingStatusViewModel = this.f171841a.f171836c;
                storyRingStatusViewModel.f171794b = aweme;
                storyRingStatusViewModel.mo120245b();
            }
        });
        storyRingStatusViewModel.f171793a.observe(b, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.story.avatar.entry.C76528c.C765302 */

            /* renamed from: a */
            final /* synthetic */ C76528c f171842a;

            static {
                Covode.recordClassIndex(89515);
            }

            {
                this.f171842a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                C76545k kVar = (C76545k) obj;
                AbstractC76526a aVar = this.f171842a.f171837d;
                C89219l.m154716b(kVar, "");
                aVar.mo120253a(kVar);
                this.f171842a.mo120243a("story_show");
            }
        });
        a2.setThemeType(a.getThemeType());
        if (a.getRingWidth() > 0.0f) {
            a2.setRingWidth(a.getRingWidth());
        }
        a2.setOnClickListener(new View$OnClickListenerC76531a(this, eVar));
        a2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC76532b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d
    /* renamed from: a */
    public final void mo120240a(Aweme aweme) {
        String uid;
        AbstractC89277c a;
        C89219l.m154721d(aweme, "");
        this.f171836c.mo120244a(aweme.getAuthor());
        StoryRingUserStoryViewModel storyRingUserStoryViewModel = this.f171835b;
        C89219l.m154721d(aweme, "");
        storyRingUserStoryViewModel.f171801c = aweme.getAuthor();
        storyRingUserStoryViewModel.mo120247a(aweme);
        User user = storyRingUserStoryViewModel.f171801c;
        if (user != null && (uid = user.getUid()) != null) {
            if (!C76706a.m134275a(uid)) {
                C76494a.f171782d.mo120234a(storyRingUserStoryViewModel, uid);
                return;
            }
            AbstractC89290k[] kVarArr = new AbstractC89290k[0];
            C77693b bVar = C77693b.f174258c;
            if (C89219l.m154714a(C89204ab.m154669a(C76620b.class), C89204ab.m154669a(C76620b.class))) {
                a = C89204ab.m154669a(C76620b.class);
            } else {
                a = C89204ab.m154669a(C76619a.class);
            }
            StoryReceiver storyReceiver = new StoryReceiver(uid, storyRingUserStoryViewModel, bVar);
            if (C89219l.m154714a(a, C89204ab.m154669a(C76620b.class))) {
                bVar.mo120328a((AbstractC76618d) storyRingUserStoryViewModel, storyReceiver);
            }
            AbstractC88412b a2 = bVar.mo120326a().mo143268a(new StoryRingUserStoryViewModel.C76517g(uid, bVar)).mo143292d(new StoryRingUserStoryViewModel.C76518h(kVarArr)).mo143263a(bVar.f171955b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new StoryRingUserStoryViewModel.C76519i(storyRingUserStoryViewModel), StoryRingUserStoryViewModel.C76520j.f171816a);
            C89219l.m154716b(a2, "");
            C76626d.m134214a(a2, storyReceiver);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d
    /* renamed from: a */
    public final void mo120243a(String str) {
        User user;
        EnumC79475a aVar;
        boolean z;
        String str2;
        String requestId;
        String str3 = "";
        C89219l.m154721d(str, str3);
        if (this.f171839f.isAttachedToWindow() && this.f171839f.getVisibility() == 0) {
            Aweme value = this.f171835b.f171799a.getValue();
            if ((value != null && (user = value.getAuthor()) != null) || (user = this.f171835b.f171801c) != null) {
                C76545k value2 = this.f171836c.f171793a.getValue();
                if (value2 != null) {
                    aVar = value2.f171859b;
                } else {
                    aVar = null;
                }
                if (aVar == EnumC79475a.BRAND_RING || aVar == EnumC79475a.PRORGRESS) {
                    z = true;
                } else {
                    z = false;
                }
                HashMap<String, String> hashMap = new HashMap<>();
                String uid = user.getUid();
                if (uid == null) {
                    uid = str3;
                }
                hashMap.put("author_id", uid);
                hashMap.put("follow_status", String.valueOf(C76494a.m134080b(user)));
                Aweme value3 = this.f171835b.f171799a.getValue();
                if (!(value3 == null || (requestId = value3.getRequestId()) == null)) {
                    str3 = requestId;
                }
                hashMap.put("req_id", str3);
                if (z) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                hashMap.put("is_unread", str2);
                if (mo80537a(str, hashMap)) {
                    C39162r.m79460a(str, hashMap);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d
    /* renamed from: a */
    public final void mo120241a(User user, boolean z) {
        String uid;
        AbstractC89277c a;
        StoryRingUserStoryViewModel.C76512b bVar;
        String uid2;
        this.f171836c.mo120244a(user);
        StoryRingUserStoryViewModel storyRingUserStoryViewModel = this.f171835b;
        storyRingUserStoryViewModel.f171801c = user;
        if (user == null || (uid = user.getUid()) == null || !StoryRingUserStoryViewModel.C76511a.m134134a(user)) {
            storyRingUserStoryViewModel.mo120247a((Aweme) null);
            C76494a.f171782d.mo120230a(storyRingUserStoryViewModel);
            return;
        }
        if (!C76706a.m134275a(user.getUid())) {
            C76494a.f171782d.mo120234a(storyRingUserStoryViewModel, uid);
        } else {
            String uid3 = user.getUid();
            C89219l.m154716b(uid3, "");
            AbstractC89290k[] kVarArr = new AbstractC89290k[0];
            C77693b bVar2 = C77693b.f174258c;
            if (C89219l.m154714a(C89204ab.m154669a(C76620b.class), C89204ab.m154669a(C76620b.class))) {
                a = C89204ab.m154669a(C76620b.class);
            } else {
                a = C89204ab.m154669a(C76619a.class);
            }
            StoryReceiver storyReceiver = new StoryReceiver(uid3, storyRingUserStoryViewModel, bVar2);
            if (C89219l.m154714a(a, C89204ab.m154669a(C76620b.class))) {
                bVar2.mo120328a((AbstractC76618d) storyRingUserStoryViewModel, storyReceiver);
            }
            AbstractC88412b a2 = bVar2.mo120326a().mo143268a(new StoryRingUserStoryViewModel.C76513c(uid3, bVar2)).mo143292d(new StoryRingUserStoryViewModel.C76514d(kVarArr)).mo143263a(bVar2.f171955b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new StoryRingUserStoryViewModel.C76515e(storyRingUserStoryViewModel), StoryRingUserStoryViewModel.C76516f.f171811a);
            C89219l.m154716b(a2, "");
            C76626d.m134214a(a2, storyReceiver);
        }
        StoryRingUserStoryViewModel.C76512b bVar3 = storyRingUserStoryViewModel.f171802d;
        if (bVar3 != null) {
            C89219l.m154721d(uid, "");
            if (!C89219l.m154714a((Object) uid, (Object) bVar3.f171805a)) {
                bVar = new StoryRingUserStoryViewModel.C76512b(uid, z);
            } else if (!z && bVar3.f171806b) {
                bVar = new StoryRingUserStoryViewModel.C76512b(uid, z);
            } else {
                return;
            }
        } else {
            bVar = new StoryRingUserStoryViewModel.C76512b(uid, z);
        }
        storyRingUserStoryViewModel.f171802d = bVar;
        if (C76706a.m134275a(uid)) {
            MineUserStoryFetcher mineUserStoryFetcher = storyRingUserStoryViewModel.f171803e;
            if (z) {
                StoryRingUserStoryViewModel.C76521k kVar = new StoryRingUserStoryViewModel.C76521k(storyRingUserStoryViewModel, z, uid);
                C89219l.m154721d(kVar, "");
                Aweme clone = C77697a.m135717a().clone();
                C89219l.m154716b(clone, "");
                kVar.invoke(clone);
                return;
            }
            StoryRingUserStoryViewModel.C76522l lVar = new StoryRingUserStoryViewModel.C76522l(storyRingUserStoryViewModel, z, uid);
            StoryRingUserStoryViewModel.C76523m mVar = new StoryRingUserStoryViewModel.C76523m(storyRingUserStoryViewModel, z, uid);
            C89219l.m154721d(lVar, "");
            C89219l.m154721d(mVar, "");
            User b = C80580in.m139683b();
            if (b != null && (uid2 = b.getUid()) != null && uid2.length() != 0) {
                AbstractC88412b a3 = UserStoryApi.f174256a.getUserStories(C89070n.m154516a(uid2).toString()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new MineUserStoryFetcher.C77695a(lVar), new MineUserStoryFetcher.C77696b(mVar));
                C89219l.m154716b(a3, "");
                C88934a.m154195a(a3, mineUserStoryFetcher.f174259a);
                return;
            }
            return;
        }
        AbstractC88412b a4 = C77278d.f173366a.mo120172a(uid, z).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new StoryRingUserStoryViewModel.C76524n(storyRingUserStoryViewModel, uid, z), new StoryRingUserStoryViewModel.C76525o(storyRingUserStoryViewModel, uid, z));
        C89219l.m154716b(a4, "");
        C88934a.m154195a(a4, storyRingUserStoryViewModel.f171800b);
    }
}
