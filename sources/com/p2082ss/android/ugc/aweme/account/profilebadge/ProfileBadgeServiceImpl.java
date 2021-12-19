package com.p2082ss.android.ugc.aweme.account.profilebadge;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IProfileBadgeService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.profilebadge.UserGetApi;
import com.p2082ss.android.ugc.aweme.profile.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl */
public final class ProfileBadgeServiceImpl implements WeakHandler.IHandler, IProfileBadgeService {

    /* renamed from: a */
    final List<IProfileBadgeService.AbstractC31281c> f78352a = new ArrayList();

    /* renamed from: b */
    private Handler f78353b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final List<WeakReference<IProfileBadgeService.AbstractC31280b>> f78354c = new ArrayList();

    /* renamed from: d */
    private final List<WeakReference<IProfileBadgeService.AbstractC31279a>> f78355d = new ArrayList();

    /* renamed from: e */
    private ProfileBadgeStruct f78356e;

    /* renamed from: com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl$d */
    static final class C32933d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32933d f78360a = new C32933d();

        static {
            Covode.recordClassIndex(39722);
        }

        C32933d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39718);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl$a */
    public static final class RunnableC32930a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileBadgeServiceImpl f78357a;

        static {
            Covode.recordClassIndex(39719);
        }

        RunnableC32930a(ProfileBadgeServiceImpl profileBadgeServiceImpl) {
            this.f78357a = profileBadgeServiceImpl;
        }

        public final void run() {
            this.f78357a.mo58700b(false, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl$b */
    public static final class RunnableC32931b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileBadgeServiceImpl f78358a;

        static {
            Covode.recordClassIndex(39720);
        }

        RunnableC32931b(ProfileBadgeServiceImpl profileBadgeServiceImpl) {
            this.f78358a = profileBadgeServiceImpl;
        }

        public final void run() {
            this.f78358a.mo58699a(false, (ProfileBadgeStruct) null);
        }
    }

    /* renamed from: c */
    private final void m67563c() {
        this.f78353b.post(new RunnableC32931b(this));
    }

    /* renamed from: d */
    private final void m67564d() {
        this.f78353b.post(new RunnableC32930a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl$e */
    public static final class RunnableC32934e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileBadgeServiceImpl f78361a;

        /* renamed from: b */
        final /* synthetic */ ProfileBadgeStruct f78362b;

        static {
            Covode.recordClassIndex(39723);
        }

        RunnableC32934e(ProfileBadgeServiceImpl profileBadgeServiceImpl, ProfileBadgeStruct profileBadgeStruct) {
            this.f78361a = profileBadgeServiceImpl;
            this.f78362b = profileBadgeStruct;
        }

        public final void run() {
            MethodCollector.m26663i(12328);
            this.f78361a.mo58699a(true, this.f78362b);
            this.f78361a.mo58700b(true, this.f78362b);
            ProfileBadgeServiceImpl profileBadgeServiceImpl = this.f78361a;
            ProfileBadgeStruct profileBadgeStruct = this.f78362b;
            synchronized (profileBadgeServiceImpl.f78352a) {
                try {
                    for (IProfileBadgeService.AbstractC31281c cVar : profileBadgeServiceImpl.f78352a) {
                        cVar.mo56081a(profileBadgeStruct);
                    }
                } finally {
                    MethodCollector.m26664o(12328);
                }
            }
        }
    }

    /* renamed from: b */
    public static IProfileBadgeService m67562b() {
        MethodCollector.m26663i(12973);
        Object a = C81908b.m141854a(IProfileBadgeService.class, false);
        if (a != null) {
            IProfileBadgeService iProfileBadgeService = (IProfileBadgeService) a;
            MethodCollector.m26664o(12973);
            return iProfileBadgeService;
        }
        if (C81908b.f183123F == null) {
            synchronized (IProfileBadgeService.class) {
                try {
                    if (C81908b.f183123F == null) {
                        C81908b.f183123F = new ProfileBadgeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12973);
                    throw th;
                }
            }
        }
        ProfileBadgeServiceImpl profileBadgeServiceImpl = (ProfileBadgeServiceImpl) C81908b.f183123F;
        MethodCollector.m26664o(12973);
        return profileBadgeServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService
    /* renamed from: a */
    public final void mo57236a() {
        UserGetApi.C32935a.m67573a().getSelf().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C32932c(this), C32933d.f78360a);
    }

    /* renamed from: a */
    private final void m67560a(Boolean bool) {
        ProfileBadgeStruct profileBadgeStruct;
        if (!(bool == null || (profileBadgeStruct = this.f78356e) == null)) {
            profileBadgeStruct.setShouldShow(bool.booleanValue());
        }
        mo58698a(this.f78356e);
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService
    /* renamed from: b */
    public final void mo57240b(IProfileBadgeService.AbstractC31281c cVar) {
        MethodCollector.m26663i(12794);
        C89219l.m154721d(cVar, "");
        synchronized (this.f78352a) {
            try {
                this.f78352a.remove(cVar);
            } finally {
                MethodCollector.m26664o(12794);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl$c */
    static final class C32932c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileBadgeServiceImpl f78359a;

        static {
            Covode.recordClassIndex(39721);
        }

        C32932c(ProfileBadgeServiceImpl profileBadgeServiceImpl) {
            this.f78359a = profileBadgeServiceImpl;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            User user = ((UserGetResponse) obj).getUser();
            if (user != null) {
                this.f78359a.mo58698a(user.getProfileBadge());
                IVideoGiftService l = VideoGiftService.m120814l();
                if (user.getVideoGiftStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                l.mo108902a(z);
            }
        }
    }

    /* renamed from: a */
    private final void m67561a(Long l) {
        ProfileBadgeStruct profileBadgeStruct;
        if (!(l == null || (profileBadgeStruct = this.f78356e) == null)) {
            profileBadgeStruct.setId(l.longValue());
        }
        mo58698a(this.f78356e);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Boolean bool;
        Boolean bool2;
        C89219l.m154721d(message, "");
        if (message.obj instanceof Exception) {
            m67563c();
            m67564d();
            return;
        }
        Long l = null;
        if (message.obj instanceof User) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            ProfileBadgeStruct profileBadge = ((User) obj).getProfileBadge();
            if (profileBadge != null) {
                bool2 = Boolean.valueOf(profileBadge.getShouldShow());
            } else {
                bool2 = null;
            }
            m67560a(bool2);
            Object obj2 = message.obj;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            ProfileBadgeStruct profileBadge2 = ((User) obj2).getProfileBadge();
            if (profileBadge2 != null) {
                l = Long.valueOf(profileBadge2.getId());
            }
            m67561a(l);
        } else if (message.obj instanceof UserResponse) {
            Object obj3 = message.obj;
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
            int action = ((UserResponse) obj3).getAction();
            if (action == 1) {
                m67563c();
                m67564d();
            } else if (action != 2) {
                Object obj4 = message.obj;
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                User user = ((UserResponse) obj4).getUser();
                C89219l.m154716b(user, "");
                ProfileBadgeStruct profileBadge3 = user.getProfileBadge();
                if (profileBadge3 != null) {
                    bool = Boolean.valueOf(profileBadge3.getShouldShow());
                } else {
                    bool = null;
                }
                m67560a(bool);
                Object obj5 = message.obj;
                Objects.requireNonNull(obj5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                User user2 = ((UserResponse) obj5).getUser();
                C89219l.m154716b(user2, "");
                ProfileBadgeStruct profileBadge4 = user2.getProfileBadge();
                if (profileBadge4 != null) {
                    l = Long.valueOf(profileBadge4.getId());
                }
                m67561a(l);
            } else {
                m67563c();
                m67564d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService
    /* renamed from: a */
    public final void mo57238a(IProfileBadgeService.AbstractC31281c cVar) {
        MethodCollector.m26663i(12793);
        C89219l.m154721d(cVar, "");
        synchronized (this.f78352a) {
            try {
                this.f78352a.add(cVar);
            } finally {
                MethodCollector.m26664o(12793);
            }
        }
    }

    /* renamed from: a */
    public final void mo58698a(ProfileBadgeStruct profileBadgeStruct) {
        AccountService.m65215a().mo57069e().updateCurProfileBadge(profileBadgeStruct);
        this.f78353b.post(new RunnableC32934e(this, profileBadgeStruct));
    }

    /* renamed from: b */
    public final synchronized void mo58700b(boolean z, ProfileBadgeStruct profileBadgeStruct) {
        MethodCollector.m26663i(12885);
        for (WeakReference<IProfileBadgeService.AbstractC31279a> weakReference : this.f78355d) {
            IProfileBadgeService.AbstractC31279a aVar = weakReference.get();
            if (aVar != null) {
                if (z) {
                    aVar.mo57242a(profileBadgeStruct);
                } else {
                    aVar.mo57241a();
                }
            }
        }
        MethodCollector.m26664o(12885);
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService
    /* renamed from: a */
    public final void mo57237a(long j, IProfileBadgeService.AbstractC31279a aVar) {
        C89219l.m154721d(aVar, "");
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        User curUser = e.getCurUser();
        C89219l.m154716b(curUser, "");
        this.f78356e = curUser.getProfileBadge();
        C31575b.m65865g().updateProfileWidgetId(new WeakHandler(this), Long.valueOf(j), 0);
        this.f78355d.add(new WeakReference<>(aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService
    /* renamed from: a */
    public final void mo57239a(boolean z, IProfileBadgeService.AbstractC31280b bVar) {
        MethodCollector.m26663i(12679);
        C89219l.m154721d(bVar, "");
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        User curUser = e.getCurUser();
        C89219l.m154716b(curUser, "");
        this.f78356e = curUser.getProfileBadge();
        C31575b.m65865g().updateProfileWidgetShouldShow(new WeakHandler(this), z, 0);
        synchronized (this.f78354c) {
            try {
                this.f78354c.add(new WeakReference<>(bVar));
            } finally {
                MethodCollector.m26664o(12679);
            }
        }
    }

    /* renamed from: a */
    public final void mo58699a(boolean z, ProfileBadgeStruct profileBadgeStruct) {
        MethodCollector.m26663i(12884);
        synchronized (this.f78354c) {
            try {
                for (WeakReference<IProfileBadgeService.AbstractC31280b> weakReference : this.f78354c) {
                    IProfileBadgeService.AbstractC31280b bVar = weakReference.get();
                    if (bVar != null) {
                        if (z) {
                            bVar.mo56084a(profileBadgeStruct);
                        } else {
                            bVar.mo56083a();
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(12884);
            }
        }
    }
}
