package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.I18nFollowUserBtn;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.aw */
public final class C51704aw extends AbstractC51756y {

    /* renamed from: a */
    public String f119186a;

    /* renamed from: b */
    public AbstractC34478k<User> f119187b;

    /* renamed from: c */
    public final int f119188c;

    /* renamed from: d */
    public int f119189d;

    /* renamed from: e */
    public HashMap<String, Boolean> f119190e;

    /* renamed from: f */
    public AbstractC51706a f119191f;

    /* renamed from: g */
    private User f119192g;

    /* renamed from: h */
    private final C51086a f119193h;

    /* renamed from: i */
    private boolean f119194i;

    /* renamed from: j */
    private SparseArray f119195j;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aw$a */
    public interface AbstractC51706a {
        static {
            Covode.recordClassIndex(61069);
        }
    }

    static {
        Covode.recordClassIndex(61067);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y
    /* renamed from: a */
    public final View mo87435a(int i) {
        if (this.f119195j == null) {
            this.f119195j = new SparseArray();
        }
        View view = (View) this.f119195j.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119195j.put(i, findViewById);
        return findViewById;
    }

    public final User getData() {
        return this.f119192g;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y
    public final View getRecommendItemView() {
        return this;
    }

    public final void setFollowStatusChangeCallback(AbstractC51706a aVar) {
        this.f119191f = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y
    public final void setIgnoreRecFriendsCardExp(boolean z) {
        this.f119194i = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y
    public final void setListener(AbstractC34478k<User> kVar) {
        this.f119187b = kVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y
    public final void setPositionInApiList(int i) {
        this.f119189d = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y
    public final void setEnterFrom(String str) {
        C89219l.m154721d(str, "");
        this.f119186a = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aw$b */
    static final class C51707b implements C51086a.AbstractC51089b {

        /* renamed from: a */
        final /* synthetic */ C51704aw f119197a;

        /* renamed from: b */
        final /* synthetic */ User f119198b;

        static {
            Covode.recordClassIndex(61070);
        }

        C51707b(C51704aw awVar, User user) {
            this.f119197a = awVar;
            this.f119198b = user;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51089b
        /* renamed from: a */
        public final void mo70873a(FollowStatus followStatus) {
            if (followStatus != null) {
                HashMap<String, Boolean> hashMap = this.f119197a.f119190e;
                if (hashMap != null) {
                    hashMap.put(this.f119198b.getUid(), true);
                }
                this.f119197a.mo87436b(followStatus.followStatus);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aw$d */
    static final class View$OnClickListenerC51709d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51704aw f119201a;

        /* renamed from: b */
        final /* synthetic */ User f119202b;

        static {
            Covode.recordClassIndex(61072);
        }

        View$OnClickListenerC51709d(C51704aw awVar, User user) {
            this.f119201a = awVar;
            this.f119202b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC34478k<User> kVar = this.f119201a.f119187b;
            if (kVar != null) {
                kVar.mo60910a(101, this.f119202b, this.f119201a.f119189d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aw$e */
    static final class View$OnClickListenerC51710e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51704aw f119203a;

        /* renamed from: b */
        final /* synthetic */ User f119204b;

        static {
            Covode.recordClassIndex(61073);
        }

        View$OnClickListenerC51710e(C51704aw awVar, User user) {
            this.f119203a = awVar;
            this.f119204b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC34478k<User> kVar = this.f119203a.f119187b;
            if (kVar != null) {
                kVar.mo60910a(101, this.f119204b, this.f119203a.f119189d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aw$f */
    static final class View$OnClickListenerC51711f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51704aw f119205a;

        /* renamed from: b */
        final /* synthetic */ User f119206b;

        static {
            Covode.recordClassIndex(61074);
        }

        View$OnClickListenerC51711f(C51704aw awVar, User user) {
            this.f119205a = awVar;
            this.f119206b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC34478k<User> kVar = this.f119205a.f119187b;
            if (kVar != null) {
                kVar.mo60910a(101, this.f119206b, this.f119205a.f119189d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aw$c */
    static final class C51708c implements C51086a.AbstractC51092e {

        /* renamed from: a */
        final /* synthetic */ C51704aw f119199a;

        /* renamed from: b */
        final /* synthetic */ User f119200b;

        static {
            Covode.recordClassIndex(61071);
        }

        C51708c(C51704aw awVar, User user) {
            this.f119199a = awVar;
            this.f119200b = user;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            AbstractC34478k<User> kVar = this.f119199a.f119187b;
            if (kVar != null) {
                kVar.mo60911a(followStatus, this.f119200b.getUid(), this.f119199a.f119186a);
            }
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            C89219l.m154716b(followStatus, "");
            createIIMServicebyMonsterPlugin.storeFollowStatus(followStatus);
        }
    }

    /* renamed from: b */
    public final void mo87436b(int i) {
        if (mo87435a(R.id.xm) instanceof I18nFollowUserBtn) {
            I18nFollowUserBtn i18nFollowUserBtn = (I18nFollowUserBtn) mo87435a(R.id.xm);
            if (i == 0 || i == 1 || i == 4) {
                i18nFollowUserBtn.mo86709d();
            } else {
                i18nFollowUserBtn.mo86709d();
            }
        }
        FollowUserBtn followUserBtn = (FollowUserBtn) mo87435a(R.id.xm);
        User user = this.f119192g;
        if (user == null) {
            C89219l.m154715b();
        }
        followUserBtn.mo73175a(i, user.getFollowerStatus());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x010c, code lost:
        if (r2 != 3) goto L_0x010e;
     */
    @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setData(com.p2082ss.android.ugc.aweme.profile.model.User r10) {
        /*
        // Method dump skipped, instructions count: 537
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3022ui.C51704aw.setData(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C51704aw(Context context, HashMap<String, Boolean> hashMap) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(hashMap, "");
        MethodCollector.m26663i(6320);
        this.f119186a = "";
        this.f119188c = 12;
        LayoutInflater.from(context).inflate(R.layout.a2m, this);
        ((FollowUserBtn) mo87435a(R.id.xm)).mo86695c();
        this.f119190e = hashMap;
        this.f119193h = new C51086a((FollowUserBtn) mo87435a(R.id.xm), new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.C51704aw.C517051 */

            /* renamed from: a */
            final /* synthetic */ C51704aw f119196a;

            static {
                Covode.recordClassIndex(61068);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                return this.f119196a.f119186a;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final int getFollowFromType() {
                return this.f119196a.f119188c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f119196a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            /* renamed from: a */
            public final void mo63346a(int i, User user) {
                C89219l.m154721d(user, "");
                AbstractC34478k<User> kVar = this.f119196a.f119187b;
                if (kVar != null) {
                    kVar.mo60910a(100, user, this.f119196a.f119189d);
                }
            }
        });
        MethodCollector.m26664o(6320);
    }

    public /* synthetic */ C51704aw(Context context, HashMap hashMap, byte b) {
        this(context, hashMap);
    }
}
