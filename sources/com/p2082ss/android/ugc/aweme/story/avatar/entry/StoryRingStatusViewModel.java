package com.p2082ss.android.ugc.aweme.story.avatar.entry;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.story.avatar.C76494a;
import com.p2082ss.android.ugc.aweme.story.avatar.EnumC76586o;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d;
import com.p2082ss.android.ugc.aweme.story.publish.C77428e;
import com.p2082ss.android.ugc.aweme.story.publish.C77429f;
import com.p2082ss.android.ugc.aweme.story.publish.EnumC77446i;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingStatusViewModel */
public final class StoryRingStatusViewModel implements AbstractC33974au, AbstractC77426d {

    /* renamed from: c */
    public static final C76510a f171792c = new C76510a((byte) 0);

    /* renamed from: a */
    final C1213t<C76545k> f171793a;

    /* renamed from: b */
    Aweme f171794b;

    /* renamed from: d */
    private final EnumC76586o f171795d;

    /* renamed from: e */
    private final boolean f171796e;

    /* renamed from: f */
    private boolean f171797f;

    static {
        Covode.recordClassIndex(89493);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
    /* renamed from: a */
    public final void mo89657a(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
    /* renamed from: a */
    public final void mo89660a(String str, C77428e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
    /* renamed from: b */
    public final void mo89661b(String str, C77428e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingStatusViewModel$a */
    public static final class C76510a {
        static {
            Covode.recordClassIndex(89494);
        }

        private C76510a() {
        }

        public /* synthetic */ C76510a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m134127a(Aweme aweme) {
            User author;
            boolean z = true;
            if (aweme != null && (author = aweme.getAuthor()) != null && !author.isBlock() && !author.isBlocked()) {
                z = false;
                if (author.getUid() == null) {
                }
            }
            return z;
        }

        /* renamed from: b */
        public static boolean m134128b(Aweme aweme) {
            String str;
            if (aweme == null) {
                return false;
            }
            User author = aweme.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            boolean a = C76706a.m134275a(str);
            if (!m134129c(aweme) || (a && (!C77429f.f173727b.isEmpty()))) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private static boolean m134129c(Aweme aweme) {
            UserStory userStory;
            if (aweme == null || (userStory = aweme.getUserStory()) == null) {
                return true;
            }
            C89219l.m154716b(userStory, "");
            if (userStory.getTotalCount() >= 1 || userStory.getHasMoreBefore() || userStory.getHasMoreAfter()) {
                return false;
            }
            return true;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void clear() {
        m134115a(false);
    }

    /* renamed from: c */
    private final boolean m134116c() {
        if (!this.f171797f || !this.f171796e) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
    /* renamed from: a */
    public final void mo89655a() {
        m134114a(new C76545k(true, EnumC79475a.PRORGRESS, 4));
    }

    /* renamed from: b */
    public final void mo120245b() {
        C76545k kVar;
        Aweme aweme = this.f171794b;
        if (C76510a.m134127a(aweme) || !C76510a.m134128b(aweme)) {
            kVar = new C76545k(false, (EnumC79475a) null, 6);
        } else if (m134116c() && C77429f.f173730e) {
            kVar = new C76545k(true, EnumC79475a.PRORGRESS, C77429f.m135379d());
        } else if (!m134116c() || !C77429f.m135378c()) {
            if (aweme == null) {
                C89219l.m154715b();
            }
            if (C76494a.m134078a(aweme)) {
                kVar = new C76545k(true, EnumC79475a.GRAY_RING, 4);
            } else {
                kVar = new C76545k(true, EnumC79475a.BRAND_RING, 4);
            }
        } else {
            kVar = new C76545k(true, EnumC79475a.RED_RING, 4);
        }
        m134114a(kVar);
    }

    /* renamed from: a */
    private static /* synthetic */ void m134113a(StoryRingStatusViewModel storyRingStatusViewModel) {
        storyRingStatusViewModel.m134115a(storyRingStatusViewModel.m134116c());
    }

    /* renamed from: a */
    private final void m134114a(C76545k kVar) {
        if (!C89219l.m154714a(this.f171793a.getValue(), kVar)) {
            this.f171793a.setValue(kVar);
        }
    }

    private StoryRingStatusViewModel(AbstractC76508e eVar) {
        this.f171793a = new C1213t<>();
        EnumC76586o c = eVar.mo80539c();
        this.f171795d = c;
        boolean mayShowPublishProgress = C76539e.m134143a(c).getMayShowPublishProgress();
        this.f171796e = mayShowPublishProgress;
        if (mayShowPublishProgress) {
            eVar.mo80538b().getLifecycle().mo4012a(this);
        }
    }

    /* renamed from: a */
    private final void m134115a(boolean z) {
        String valueOf = String.valueOf(hashCode());
        if (z) {
            C77429f.f173733h.mo120167a(valueOf, this);
        } else {
            C77429f.m135381e(valueOf);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
    /* renamed from: a */
    public final void mo89656a(float f) {
        m134114a(new C76545k(true, EnumC79475a.PRORGRESS, f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120244a(com.p2082ss.android.ugc.aweme.profile.model.User r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.story.avatar.o r1 = r4.f171795d
            com.ss.android.ugc.aweme.story.avatar.o r0 = com.p2082ss.android.ugc.aweme.story.avatar.EnumC76586o.WESTWINDOW
            if (r1 == r0) goto L_0x000c
            boolean r0 = com.p2082ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel.C76511a.m134134a(r5)
            if (r0 == 0) goto L_0x004b
        L_0x000c:
            r3 = 1
        L_0x000d:
            r2 = 0
            if (r3 == 0) goto L_0x0041
            if (r5 == 0) goto L_0x003f
            java.lang.String r1 = r5.getUid()
        L_0x0016:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f171794b
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r0.getUid()
        L_0x0024:
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            if (r0 == 0) goto L_0x0041
            r4.mo120245b()
        L_0x002d:
            if (r5 == 0) goto L_0x0033
            java.lang.String r2 = r5.getUid()
        L_0x0033:
            boolean r0 = com.p2082ss.android.ugc.aweme.story.p4025d.C76706a.m134275a(r2)
            r4.f171797f = r0
            m134113a(r4)
            return
        L_0x003d:
            r0 = r2
            goto L_0x0024
        L_0x003f:
            r1 = r2
            goto L_0x0016
        L_0x0041:
            com.ss.android.ugc.aweme.story.avatar.entry.k r1 = new com.ss.android.ugc.aweme.story.avatar.entry.k
            r0 = 6
            r1.<init>(r3, r2, r0)
            r4.m134114a(r1)
            goto L_0x002d
        L_0x004b:
            r3 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.avatar.entry.StoryRingStatusViewModel.mo120244a(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
    /* renamed from: a */
    public final void mo89658a(EnumC77446i iVar) {
        C89219l.m154721d(iVar, "");
        mo120245b();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
    /* renamed from: a */
    public final void mo89659a(String str) {
        C89219l.m154721d(str, "");
        mo120245b();
    }

    public /* synthetic */ StoryRingStatusViewModel(AbstractC76508e eVar, byte b) {
        this(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77426d
    /* renamed from: c */
    public final void mo89662c(String str, C77428e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
        AbstractC77426d.C77427a.m135370a(str, eVar);
    }
}
