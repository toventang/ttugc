package com.p2082ss.android.ugc.aweme;

import android.os.Handler;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.p2082ss.android.ugc.aweme.profile.model.VideoCover;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.IAccountUserService */
public interface IAccountUserService {

    /* renamed from: com.ss.android.ugc.aweme.IAccountUserService$a */
    public interface AbstractC31278a {
        static {
            Covode.recordClassIndex(37940);
        }

        /* renamed from: a */
        void mo57195a(int i, User user, User user2);
    }

    static {
        Covode.recordClassIndex(37939);
    }

    void accountUserClear();

    void addUserChangeListener(AbstractC31278a aVar);

    List<String> allUidList();

    void checkIn();

    void clear(String str);

    void delete(String str, String str2);

    void fetchLoginHistoryState(AbstractC1204m mVar, AbstractC89172b<Integer, C89391z> bVar);

    C80053c findSignificanUserInfo(String str);

    void forceSave();

    boolean getAuthGoods();

    String getAvatarUrl();

    String getCurSecUserId();

    User getCurUser();

    FollowerDetail getCurUserFollowDetail(String str);

    String getCurUserId();

    int getCurrentLoginHistoryState();

    String getLastRecordedSecUid();

    String getLastUid();

    String getNickName();

    String getPhoneCountryCode();

    String getSessionKey();

    void getSetPasswordStatus(AbstractC40763cv cvVar);

    int getUidContactPermissionCount();

    boolean hasCommerceVideoRights();

    boolean hasCurUserSetPassword();

    boolean hasUpdated();

    void init();

    boolean isChildrenMode();

    boolean isDeleteByAgeGate();

    boolean isLogin();

    boolean isMe(String str);

    boolean isNewUser();

    boolean isNullUid(String str);

    boolean isOldUser();

    boolean isOnCommerceWhiteList();

    boolean isUidContactPermisioned();

    boolean isUserEmpty(User user);

    boolean loginHistoryLegacyEnabled();

    void logoutAllBackgroundUser();

    User queryUser(String str, boolean z);

    void queryUser();

    void queryUser(Handler handler);

    UserPermissionData.UserPermissionInfo queryUserPermission();

    void queryUserSync(User user);

    void queryVerifyStatus(AbstractC40795cw cwVar, boolean z);

    void refreshPassportUserInfo();

    void registerNotice(String str, int i);

    void removeUserChangeListener(AbstractC31278a aVar);

    void setCurUser(User user);

    void setWithCommerceNewbieTask(boolean z);

    boolean shouldRefresh();

    void storeUidContactPermisioned(boolean z);

    void updateAllowStatus(Handler handler, int i, int i2);

    void updateAvatarUri(Handler handler, String str, int i);

    void updateCoverUri(Handler handler, String str, int i, int i2);

    void updateCurAdAuthorization(boolean z);

    void updateCurAllowStatus(int i);

    void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3);

    void updateCurAwemeCount(int i);

    void updateCurCanChangeSchoolInfo(boolean z);

    void updateCurCover(List<UrlModel> list);

    void updateCurFavoritingCount(int i);

    void updateCurFollowerCount(int i);

    void updateCurFollowingCount(int i);

    void updateCurHideFollowingFollowerList(int i);

    void updateCurHideSearch(boolean z);

    void updateCurNickname(String str);

    void updateCurProfileBadge(ProfileBadgeStruct profileBadgeStruct);

    void updateCurRepostCount(int i);

    void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2);

    void updateCurSecret(boolean z);

    void updateCurSignature(String str);

    void updateCurSupportedNgo(ProfileNgoStruct profileNgoStruct);

    void updateCurUser(User user);

    void updateCurUserId(String str);

    void updateCurVideoCover(VideoCover videoCover);

    void updateFbExpireTime();

    void updateHasFacebookToken(boolean z);

    void updateHasTwitterToken(boolean z);

    void updateHasYoutubeToken(boolean z);

    void updateId(Handler handler, String str, int i);

    void updateInsId(Handler handler, String str, int i);

    void updateInsId(String str);

    void updateLanguage(Handler handler, String str, int i);

    void updateLeaveTime(long j);

    void updateLoginHistoryState(AbstractC1204m mVar, int i, AbstractC89172b<Integer, C89391z> bVar);

    void updateNickName(Handler handler, String str, int i);

    void updateNickNameWithSupplementray(Handler handler, String str, List<String> list, int i);

    void updateNotifyPrivateAccount(int i);

    void updateProfileWidgetId(Handler handler, Long l, int i);

    void updateProfileWidgetShouldShow(Handler handler, boolean z, int i);

    void updateSchool(Handler handler, Map<String, String> map);

    void updateSecret(Handler handler, boolean z, int i);

    void updateSecret(Handler handler, boolean z, int i, boolean z2);

    void updateShieldCommentNotice(int i);

    void updateShieldDiggNotice(int i);

    void updateShieldFollowNotice(int i);

    void updateSignature(Handler handler, String str, int i);

    void updateSupportedNgo(Handler handler, int i, int i2);

    void updateTwExpireTime();

    void updateUserInfo(Handler handler, Map<String, String> map);

    void updateUserInfo(C22507a aVar);

    void updateVideoCoverUri(Handler handler, String str, String str2, int i, int i2);

    void updateYoutubeExpireTime();

    void uploadAvatar(Handler handler, String str, int i, String str2, List<C29934d> list);

    void uploadAvatar(Handler handler, String str, int i, String str2, List<C29934d> list, String str3);

    void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3);

    void uploadCover(Handler handler, String str, int i, String str2);

    void uploadVideoAvatar(Handler handler, String str, int i, String str2, List<C29934d> list);
}
