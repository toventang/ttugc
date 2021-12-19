package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p684f.AbstractC11670a;
import com.bytedance.android.livesdkapi.depend.p684f.AbstractC11671b;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.p695c.AbstractC11800a;
import com.bytedance.android.livesdkapi.host.p695c.AbstractC11801b;
import com.bytedance.android.livesdkapi.model.C11839e;
import com.bytedance.android.livesdkapi.p699l.AbstractC11827c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34576g;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.ag */
public final class C58670ag implements IHostUser {

    /* renamed from: a */
    private C58672b f133582a;

    /* renamed from: b */
    private C58671a f133583b;

    static {
        Covode.recordClassIndex(68972);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean interceptOperation(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void markAsOutOfDate(boolean z) {
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void setRoomAttrsAdminFlag(int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void updateUser(AbstractC2994b bVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.ag$a */
    public static final class C58671a implements AbstractC90252i, AbstractC90253j {

        /* renamed from: a */
        public AbstractC11670a f133584a;

        static {
            Covode.recordClassIndex(68973);
        }

        @Override // org.greenrobot.eventbus.AbstractC90252i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(298, new RunnableC90250g(C58671a.class, "onEvent", C35503c.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        private C58671a() {
        }

        /* synthetic */ C58671a(byte b) {
            this();
        }

        @AbstractC90264r
        public final void onEvent(C35503c cVar) {
            if (this.f133584a != null && (cVar.f83729b instanceof User)) {
                C11688a aVar = new C11688a();
                aVar.f27934e = cVar.f83728a;
                String uid = ((User) cVar.f83729b).getUid();
                if (uid != null) {
                    aVar.f27930a = Long.parseLong(uid);
                }
                this.f133584a.mo17914a(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.ag$b */
    public static final class C58672b implements AbstractC11671b, AbstractC90252i, AbstractC90253j {

        /* renamed from: a */
        public AbstractC11671b f133585a;

        static {
            Covode.recordClassIndex(68974);
        }

        @Override // org.greenrobot.eventbus.AbstractC90252i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(51, new RunnableC90250g(C58672b.class, "onEvent", C34572c.class, ThreadMode.POSTING, 0, false));
            hashMap.put(209, new RunnableC90250g(C58672b.class, "onEvent", C34576g.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        private C58672b() {
        }

        /* synthetic */ C58672b(byte b) {
            this();
        }

        @Override // com.bytedance.android.livesdkapi.depend.p684f.AbstractC11671b
        /* renamed from: a */
        public final void mo17913a(boolean z) {
            AbstractC11671b bVar = this.f133585a;
            if (bVar != null) {
                bVar.mo17913a(z);
            }
        }

        @AbstractC90264r
        public final void onEvent(C34576g gVar) {
            mo17913a(false);
        }

        @AbstractC90264r
        public final void onEvent(C34572c cVar) {
            mo17913a(BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin());
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isDeleteByAgeGate() {
        return C80580in.m139691e();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isMinorMode() {
        return C80580in.m139687c();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final AbstractC2994b getCurUser() {
        return C58702s.m107859a(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final long getCurUserId() {
        return Long.parseLong(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isLogin() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final int getCurUserMode() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || createIUserServicebyMonsterPlugin.getCurrentUser() == null) {
            return -1;
        }
        return createIUserServicebyMonsterPlugin.getCurrentUser().getUserMode();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final List<C11839e> getAllFriends() {
        List<IMUser> allFriends = IMService.createIIMServicebyMonsterPlugin(false).getAllFriends();
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : allFriends) {
            if (!IMUser.isInvalidUser(iMUser.getUid())) {
                arrayList.add(new C11839e(Long.valueOf(Long.parseLong(iMUser.getUid())), iMUser.getSecUid(), iMUser.getNickName(), iMUser.getUniqueId(), new ImageModel(iMUser.getAvatarThumb().getUri(), iMUser.getAvatarThumb().getUrlList())));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void requestLivePermission(AbstractC11827c cVar) {
        LiveOuterService.m107269s().mo95829c().mo96128a(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unRegisterCurrentUserUpdateListener(AbstractC11671b bVar) {
        C58672b bVar2 = this.f133582a;
        if (bVar2 != null) {
            EventBus.m156962a().mo145395b(bVar2);
            bVar2.f133585a = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unRegisterFollowStatusListener(AbstractC11670a aVar) {
        C58671a aVar2 = this.f133583b;
        if (aVar2 != null) {
            EventBus.m156962a().mo145395b(aVar2);
            aVar2.f133584a = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerFollowStatusListener(AbstractC11670a aVar) {
        if (this.f133583b == null) {
            this.f133583b = new C58671a((byte) 0);
        }
        this.f133583b.f133584a = aVar;
        EventBus.m156966a(EventBus.m156962a(), this.f133583b);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerCurrentUserUpdateListener(AbstractC11671b bVar) {
        if (this.f133582a == null) {
            this.f133582a = new C58672b((byte) 0);
        }
        this.f133582a.f133585a = bVar;
        C58672b bVar2 = this.f133582a;
        if (!EventBus.m156962a().mo145393a(bVar2)) {
            EventBus.m156966a(EventBus.m156962a(), bVar2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void onFollowStatusChanged(int i, long j) {
        FollowStatus followStatus = new FollowStatus();
        followStatus.userId = String.valueOf(j);
        followStatus.followStatus = i;
        new FollowStatusEvent(followStatus).post();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unFollowWithConfirm(Activity activity, int i, long j, AbstractC11801b bVar) {
        bVar.mo17910a();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void login(ActivityC0945e eVar, AbstractC11800a aVar, String str, String str2, int i, String str3, String str4, String str5) {
        C58957c.m108320a(eVar, str4, "live_room", (Bundle) null, new C58673ah(aVar));
    }
}
