package com.p2082ss.android.ugc.aweme;

import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22298d;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22319f;
import com.bytedance.sdk.p1625a.p1643f.C22375e;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.account.C29346c;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.C43200dr;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32835a;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.lego.p3392b.C58166a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.p2082ss.android.ugc.aweme.profile.model.TcmImage;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.p2082ss.android.ugc.aweme.profile.model.VideoCover;
import com.p2082ss.android.ugc.aweme.services.IAccountHelperService;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.user.C80057d;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.user.p4194a.C80039c;
import com.p2082ss.android.ugc.aweme.user.p4195b.C80045a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ao */
public abstract class AbstractC33513ao implements IAccountUserService {

    /* renamed from: a */
    private volatile boolean f79615a;

    static {
        Covode.recordClassIndex(40376);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void fetchLoginHistoryState(AbstractC1204m mVar, AbstractC89172b<? super Integer, C89391z> bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public int getCurrentLoginHistoryState() {
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean loginHistoryLegacyEnabled() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void storeUidContactPermisioned(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateLoginHistoryState(AbstractC1204m mVar, int i, AbstractC89172b<? super Integer, C89391z> bVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.ao$a */
    public static final class C33514a extends AbstractC22298d {
        static {
            Covode.recordClassIndex(40377);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo36681a(C22319f fVar, int i) {
        }

        C33514a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: e */
        public final /* synthetic */ void mo36686e(C22319f fVar) {
            C22319f fVar2 = fVar;
            if (fVar2 != null) {
                try {
                    if (fVar2.f52713b) {
                        C29346c a = C29346c.C29347a.m58778a(fVar2.f52719h);
                        C89219l.m154716b(a, "");
                        JSONObject optJSONObject = a.f53222m.optJSONObject("push_challenge_info");
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("challenge_ticket");
                            String optString2 = optJSONObject.optString("o_url");
                            C31575b.m65859a();
                            AbstractC35418cb m = C31575b.f75524a.mo57077m();
                            C89219l.m154716b(optString, "");
                            C89219l.m154716b(optString2, "");
                            m.handlePushChallengeInfo(optString, optString2);
                        }
                        if (((Boolean) C58166a.f132448h.getValue()).booleanValue()) {
                            C40780g.m82246c().execute(new RunnableC43242ds(a, "async refresh passport user info"));
                        } else {
                            C43200dr.f100693a.mo73336a(a);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public List<String> allUidList() {
        return C80064f.m138827l();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public User getCurUser() {
        return C80061e.f179403k.mo123510b();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public String getCurUserId() {
        return C80061e.f179403k.mo123517e();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public String getLastRecordedSecUid() {
        return C80064f.m138826j();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public int getUidContactPermissionCount() {
        return C43046dl.f100357a.count();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean hasUpdated() {
        return C80061e.f179403k.f179405a;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean isNewUser() {
        init();
        return C43200dr.f100693a.f100450a;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void accountUserClear() {
        C1731i.m5640b(new CallableC43199dq(C43200dr.f100693a), C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean hasCommerceVideoRights() {
        return C80061e.f179403k.mo123510b().isWithItemCommerceEntry();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean isLogin() {
        return C80064f.m138815a(C80061e.f179403k.mo123508a());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean isOnCommerceWhiteList() {
        return C80061e.f179403k.mo123510b().isWithCommerceEntry();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean getAuthGoods() {
        if (((C80061e.f179403k.mo123510b().getAuthorityStatus() >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public String getAvatarUrl() {
        String str;
        C80053c e = C80061e.m138801e(C80061e.f179403k.mo123517e());
        if (e == null || (str = e.f179388e) == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public String getLastUid() {
        C80061e eVar = C80061e.f179403k;
        String str = eVar.f179412h;
        if (str == null) {
            str = C80064f.f179418d.mo123523i();
        }
        eVar.mo123509a(str);
        String str2 = eVar.f179412h;
        if (str2 == null) {
            C89219l.m154715b();
        }
        return str2;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public String getNickName() {
        String str;
        C80053c e = C80061e.m138801e(C80061e.f179403k.mo123517e());
        if (e == null || (str = e.f179387d) == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public String getPhoneCountryCode() {
        String str;
        C80064f.C80065a f = C80061e.m138802f(C80061e.f179403k.mo123517e());
        if (f == null || (str = f.f179430e) == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public String getSessionKey() {
        String str;
        C80064f.C80065a f = C80061e.m138802f(C80061e.f179403k.mo123517e());
        if (f == null || (str = f.f179427b) == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void init() {
        if (!this.f79615a) {
            C43200dr.f100693a = new C43107dn();
            IAccountUserService.AbstractC31278a aVar = C31291a.f74993c;
            if (aVar == null) {
                C89219l.m154710a("sAccountUserChangeListener");
            }
            addUserChangeListener(aVar);
            this.f79615a = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean isOldUser() {
        User b = C80061e.f179403k.mo123510b();
        if (b == null || b.getCreateTime() < 1506787200) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void queryUser() {
        init();
        C80045a.m138782a(C80061e.f179403k.f179408d, ((IAccountHelperService) C31291a.m65463a(IAccountHelperService.class)).selfUserApi());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateFbExpireTime() {
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setFbExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateTwExpireTime() {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setTwExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateYoutubeExpireTime() {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setYoutubeExpireTime((System.currentTimeMillis() / 1000) + 2592000);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void checkIn() {
        String str;
        init();
        C80061e eVar = C80061e.f179403k;
        WeakHandler weakHandler = eVar.f179408d;
        if (eVar.mo123516d()) {
            str = C80061e.f179402j;
        } else {
            str = C80061e.f179401i;
        }
        C34608n.m70658a().mo61083a(weakHandler, new Callable(str) {
            /* class com.p2082ss.android.ugc.aweme.user.p4195b.C80045a.CallableC800516 */

            /* renamed from: a */
            final /* synthetic */ String f179380a;

            static {
                Covode.recordClassIndex(93282);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C43200dr.f100694b.mo58685b(this.f179380a);
                return null;
            }

            {
                this.f179380a = r1;
            }
        }, 113);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public String getCurSecUserId() {
        String secUid = C80061e.f179403k.mo123510b().getSecUid();
        if (!TextUtils.isEmpty(secUid)) {
            return secUid;
        }
        C80064f.C80065a f = C80061e.m138802f(C80061e.f179403k.mo123517e());
        if (f == null || TextUtils.isEmpty(f.f179431f)) {
            return "";
        }
        return f.f179431f;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean hasCurUserSetPassword() {
        return Keva.getRepo("password_status").getBoolean(C80061e.f179403k.mo123517e() + "_password_set_status", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public UserPermissionData.UserPermissionInfo queryUserPermission() {
        init();
        C29844g gVar = new C29844g(((IAccountHelperService) C31291a.m65463a(IAccountHelperService.class)).userPermissionApi());
        gVar.mo52130a("request_types", UserPermissionData.UserPermissionRequestType.DEFAULT_TYPE.toString());
        UserPermissionData.UserPermissionInfo userPermissionInfo = (UserPermissionData.UserPermissionInfo) C43200dr.f100694b.mo58679a().mo46670a(C43200dr.f100694b.mo58683a(gVar.toString()), UserPermissionData.UserPermissionInfo.class);
        C89219l.m154716b(userPermissionInfo, "");
        return userPermissionInfo;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void refreshPassportUserInfo() {
        if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
            init();
        }
        C22375e.m42171a(C31291a.m65462a()).mo36618a("polling", new C33514a());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean shouldRefresh() {
        C80061e eVar = C80061e.f179403k;
        if (!eVar.f179405a) {
            return true;
        }
        if ((eVar.f179407c < 0 || System.currentTimeMillis() - eVar.f179407c < 180000) && !eVar.f179406b) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void forceSave() {
        synchronized (C80064f.f179415a) {
            for (T t : C80064f.m138818c()) {
                t.mo123530a().mo123529d();
                t.mo123531b().mo123529d();
                t.mo123532c().mo123529d();
            }
            C80064f.m138816b().edit().putString("current_foreground_uid", C80064f.f179418d.mo123521e()).apply();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void logoutAllBackgroundUser() {
        List<String> l = C80064f.m138827l();
        if (l.size() >= 2) {
            String e = C80061e.f179403k.mo123517e();
            int size = l.size();
            while (true) {
                size--;
                if (size >= 0) {
                    String str = l.get(size);
                    if (!TextUtils.equals(str, e)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        AbstractC34889bn k = AccountService.m65215a().mo57075k();
                        k.updateMethodInfo("update_expire_time", str, Long.valueOf(currentTimeMillis));
                        k.updateMethodInfo("update_last_active_time", str, Long.valueOf(currentTimeMillis));
                        k.updateMethodInfo("update_significan_user_info", str, findSignificanUserInfo(str));
                        C80061e.f179403k.mo123514c(str);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean isNullUid(String str) {
        return C80064f.m138825h(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void addUserChangeListener(IAccountUserService.AbstractC31278a aVar) {
        C89219l.m154721d(aVar, "");
        C43200dr.m86153a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public C80053c findSignificanUserInfo(String str) {
        if (str == null) {
            C89219l.m154715b();
        }
        return C80061e.m138801e(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean isMe(String str) {
        return C13627m.m24499a(str, C80061e.f179403k.mo123517e());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void queryUserSync(User user) {
        init();
        C80061e.f179403k.mo123511b(user);
        C43200dr.m86152a(10, null, user);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurUser(User user) {
        init();
        C80061e.f179403k.mo123511b(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurUserId(String str) {
        init();
        C80061e.f179403k.mo123512b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void removeUserChangeListener(IAccountUserService.AbstractC31278a aVar) {
        C89219l.m154721d(aVar, "");
        synchronized (C43200dr.class) {
            C43200dr.f100695c.remove(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void setWithCommerceNewbieTask(boolean z) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setWithCommerceNewbieTask(z);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurAdAuthorization(boolean z) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setAdAuthorization(z);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurAllowStatus(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setAllowStatus(i);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurCanChangeSchoolInfo(boolean z) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setCanModifySchoolInfo(z);
        eVar.f179405a = true;
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurCover(List<? extends UrlModel> list) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setCoverUrls(list);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurFavoritingCount(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setFavoritingCount(eVar.mo123510b().getFavoritingCount() + i);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurFollowerCount(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setFollowerCount(eVar.mo123510b().getFollowerCount() + i);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurHideFollowingFollowerList(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setHideFollowingFollowerList(i);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurHideSearch(boolean z) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setHideSearch(z);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurProfileBadge(ProfileBadgeStruct profileBadgeStruct) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setProfileBadgeStruct(profileBadgeStruct);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurSupportedNgo(ProfileNgoStruct profileNgoStruct) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setProfileNgoStruct(profileNgoStruct);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurVideoCover(VideoCover videoCover) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setVideoCover(videoCover);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateHasFacebookToken(boolean z) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setHasFacebookToken(z);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateHasTwitterToken(boolean z) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setHasTwitterToken(z);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateHasYoutubeToken(boolean z) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setHasYoutubeToken(z);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateInsId(String str) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setInsId(str);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateLeaveTime(long j) {
        init();
        C80061e eVar = C80061e.f179403k;
        if (eVar.f179407c != -1) {
            j = eVar.f179407c;
        }
        eVar.f179407c = j;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateNotifyPrivateAccount(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setNotifyPrivateAccount(i);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateShieldCommentNotice(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setShieldCommentNotice(i);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateShieldDiggNotice(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setShieldDiggNotice(i);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateShieldFollowNotice(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setShieldFollowNotice(i);
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateUserInfo(C22507a aVar) {
        init();
        C43200dr.f100693a.mo73336a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public FollowerDetail getCurUserFollowDetail(String str) {
        C80061e eVar = C80061e.f179403k;
        if (eVar.mo123510b().getFollowerDetailList() == null) {
            return null;
        }
        for (FollowerDetail followerDetail : eVar.mo123510b().getFollowerDetailList()) {
            C89219l.m154716b(followerDetail, "");
            if (TextUtils.equals(followerDetail.getPackageName(), str)) {
                return followerDetail;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void getSetPasswordStatus(AbstractC40763cv cvVar) {
        C43200dr.f100694b.mo58687c("/passport/password/has_set/", null).mo143198a(C80039c.C80040a.f179358a).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143190a(new C80039c.C80042b(cvVar), new C80039c.C80043c(cvVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public boolean isUserEmpty(User user) {
        if (user == null || user.getUid() == null || user.getAvatarLarger() == null || user.getAvatarMedium() == null || user.getAvatarThumb() == null || user.getShortId() == null || user.getNickname() == null || user.getUniqueId() == null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void setCurUser(User user) {
        C89219l.m154721d(user, "");
        init();
        C80061e eVar = C80061e.f179403k;
        C89219l.m154721d(user, "");
        if (C80061e.m138800a(user)) {
            eVar.f179410f = user;
            eVar.f179409e = user.getUid();
            eVar.f179411g = null;
            C80064f.m138814a(user);
            eVar.f179405a = true;
            eVar.f179406b = false;
            eVar.f179407c = -1;
            eVar.mo123509a(user.getUid());
            String secUid = user.getSecUid();
            C89219l.m154716b(secUid, "");
            C80064f.m138819d(secUid);
            eVar.mo123513c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurAwemeCount(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setAwemeCount(Math.max(0, eVar.mo123510b().getAwemeCount() + i));
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurFollowingCount(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setFollowingCount(Math.max(0, eVar.mo123510b().getFollowingCount() + i));
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurNickname(String str) {
        init();
        C80061e eVar = C80061e.f179403k;
        if (!TextUtils.equals(eVar.mo123510b().getNickname(), str)) {
            eVar.mo123510b().setNickname(str);
            eVar.f179405a = true;
            C80064f.m138814a(eVar.mo123510b());
            C43200dr.m86152a(6, null, eVar.mo123510b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurRepostCount(int i) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setRepostCount(Math.max(0, eVar.mo123510b().getRepostCount() + i));
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurSecret(boolean z) {
        init();
        C80061e eVar = C80061e.f179403k;
        if (eVar.mo123510b().isSecret() != z) {
            eVar.mo123510b().setSecret(z);
            eVar.f179405a = true;
            C80064f.m138814a(eVar.mo123510b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurSignature(String str) {
        init();
        C80061e eVar = C80061e.f179403k;
        if (!TextUtils.equals(eVar.mo123510b().getSignature(), str)) {
            eVar.mo123510b().setSignature(str);
            eVar.f179405a = true;
            C80064f.m138814a(eVar.mo123510b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void queryUser(Handler handler) {
        init();
        C80045a.m138782a(handler, ((IAccountHelperService) C31291a.m65463a(IAccountHelperService.class)).selfUserApi());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateSchool(Handler handler, Map<String, String> map) {
        init();
        C80045a.m138786a(handler, map, 8);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateUserInfo(Handler handler, Map<String, String> map) {
        init();
        C80045a.m138786a(handler, map, 112);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void registerNotice(String str, int i) {
        init();
        C34608n.m70658a().mo61083a(C80061e.f179403k.f179408d, new Callable(str, i) {
            /* class com.p2082ss.android.ugc.aweme.user.p4195b.C80045a.CallableC800527 */

            /* renamed from: a */
            final /* synthetic */ String f179381a;

            /* renamed from: b */
            final /* synthetic */ int f179382b;

            static {
                Covode.recordClassIndex(93283);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(this.f179381a)) {
                    hashMap.put("phone_number", this.f179381a);
                }
                hashMap.put("login_type", String.valueOf(this.f179382b));
                C43200dr.f100694b.mo58686b(C80045a.f179363a, hashMap);
                return null;
            }

            {
                this.f179381a = r1;
                this.f179382b = r2;
            }
        }, 114);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void delete(String str, String str2) {
        C89219l.m154721d(str2, "");
        init();
        C32835a.C32836a.m67401a(C32835a.f78203b + "|delete:" + str2);
        C80061e.f179403k.mo123514c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public User queryUser(String str, boolean z) {
        init();
        if (str == null || str.length() == 0) {
            str = ((IAccountHelperService) C31291a.m65463a(IAccountHelperService.class)).selfUserApi();
        }
        User a = C80057d.m138792a(str, z);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateSecret(Handler handler, boolean z, int i) {
        updateSecret(handler, z, i, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateAllowStatus(Handler handler, int i, int i2) {
        init();
        C80045a.m138784a(handler, "allow_status", String.valueOf(i), i2, 5);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateAvatarUri(Handler handler, String str, int i) {
        init();
        C80045a.m138784a(handler, "avatar_uri", str, i, 4);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateId(Handler handler, String str, int i) {
        init();
        C80045a.m138784a(handler, "unique_id", str, i, 116);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateInsId(Handler handler, String str, int i) {
        init();
        C80045a.m138784a(handler, "ins_id", str, i, 6);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateLanguage(Handler handler, String str, int i) {
        init();
        C80045a.m138784a(handler, "language_change", str, i, 124);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateNickName(Handler handler, String str, int i) {
        init();
        C80045a.m138784a(handler, "nickname", str, i, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateSignature(Handler handler, String str, int i) {
        init();
        C80045a.m138784a(handler, "signature", str, i, 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateSupportedNgo(Handler handler, int i, int i2) {
        init();
        C80045a.m138784a(handler, "supporting_ngo_id", String.valueOf(i), i2, 12);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateProfileWidgetShouldShow(Handler handler, boolean z, int i) {
        String str;
        init();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C80045a.m138784a(handler, "badge_info", str, i, 13);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public /* synthetic */ void updateProfileWidgetId(Handler handler, Long l, int i) {
        long longValue = l.longValue();
        init();
        C80045a.m138786a(handler, C89041ag.m154428c(C89387v.m154943a("badge_info", "1"), C89387v.m154943a("profile_badge_id", String.valueOf(longValue)), C89387v.m154943a("page_from", String.valueOf(i))), 13);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        init();
        C80061e eVar = C80061e.f179403k;
        if (urlModel != null && urlModel2 != null && urlModel3 != null) {
            User b = eVar.mo123510b();
            if (!(b.getAvatarThumb() == null || b.getAvatarMedium() == null || b.getAvatarLarger() == null)) {
                UrlModel avatarThumb = b.getAvatarThumb();
                C89219l.m154716b(avatarThumb, "");
                if (!TextUtils.equals(avatarThumb.getUri(), urlModel.getUri())) {
                    UrlModel avatarMedium = b.getAvatarMedium();
                    C89219l.m154716b(avatarMedium, "");
                    if (!TextUtils.equals(avatarMedium.getUri(), urlModel2.getUri())) {
                        UrlModel avatarLarger = b.getAvatarLarger();
                        C89219l.m154716b(avatarLarger, "");
                        if (TextUtils.equals(avatarLarger.getUri(), urlModel3.getUri())) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            b.setAvatarThumb(urlModel);
            b.setAvatarMedium(urlModel2);
            b.setAvatarLarger(urlModel3);
            C80064f.m138814a(b);
            C43200dr.m86152a(7, null, b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void uploadCover(Handler handler, String str, int i, String str2) {
        init();
        C80045a.m138783a(handler, str, i, str2, (List<C29934d>) null, 126);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateSecret(Handler handler, boolean z, int i, boolean z2) {
        String str;
        init();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C80045a.m138785a(handler, "secret", str, i, 122, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCoverUri(Handler handler, String str, int i, int i2) {
        C89219l.m154721d(str, "");
        init();
        C89219l.m154721d(str, "");
        C80045a.m138786a(handler, C89041ag.m154428c(C89387v.m154943a("cover_uri", str), C89387v.m154943a("cover_source", String.valueOf(i)), C89387v.m154943a("page_from", String.valueOf(i2))), 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateNickNameWithSupplementray(Handler handler, String str, List<String> list, int i) {
        List<String> list2 = list;
        C89219l.m154721d(str, "");
        init();
        if (list2 == null) {
            list2 = C89086z.INSTANCE;
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(list2, "");
        List f = C89070n.m154580f((Iterable) list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        C80045a.m138786a(handler, C89041ag.m154428c(C89387v.m154943a("nickname", str), C89387v.m154943a("supplementary_img_uri", C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)), C89387v.m154943a("page_from", String.valueOf(i))), 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void uploadAvatar(Handler handler, String str, int i, String str2, List<? extends C29934d> list) {
        init();
        C80045a.m138783a(handler, str, i, str2, (List<C29934d>) list, 111);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void uploadVideoAvatar(Handler handler, String str, int i, String str2, List<? extends C29934d> list) {
        init();
        C80045a.m138783a(handler, str, i, str2, (List<C29934d>) list, 121);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2) {
        init();
        C80061e eVar = C80061e.f179403k;
        eVar.mo123510b().setEducation(i);
        eVar.mo123510b().setSchoolInfoShowRange(i2);
        eVar.f179405a = true;
        C80064f.m138814a(eVar.mo123510b());
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3) {
        init();
        C80045a.m138783a(handler, str, i, str2, C89070n.m154516a(new C29934d("source", str3)), 125);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void updateVideoCoverUri(Handler handler, String str, String str2, int i, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        init();
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap c = C89041ag.m154428c(C89387v.m154943a("cover_video_id", str), C89387v.m154943a("cover_video_offset", String.valueOf(i)), C89387v.m154943a("page_from", String.valueOf(i2)));
        if (!TextUtils.isEmpty(str2)) {
            c.put("cover_item_id", str2);
        }
        C80045a.m138786a(handler, c, 11);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public void uploadAvatar(Handler handler, String str, int i, String str2, List<? extends C29934d> list, String str3) {
        init();
        C34608n.m70658a().mo61083a(handler, new Callable(str, i, str2, str3, list) {
            /* class com.p2082ss.android.ugc.aweme.user.p4195b.C80045a.CallableC800505 */

            /* renamed from: a */
            final /* synthetic */ String f179375a;

            /* renamed from: b */
            final /* synthetic */ int f179376b;

            /* renamed from: c */
            final /* synthetic */ String f179377c;

            /* renamed from: d */
            final /* synthetic */ String f179378d;

            /* renamed from: e */
            final /* synthetic */ List f179379e;

            static {
                Covode.recordClassIndex(93281);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C43200dr.f100694b.mo58682a(this.f179375a, this.f179376b, this.f179377c, TcmImage.class, this.f179378d, this.f179379e);
            }

            {
                this.f179375a = r1;
                this.f179376b = r2;
                this.f179377c = r3;
                this.f179378d = r4;
                this.f179379e = r5;
            }
        }, 111);
    }
}
