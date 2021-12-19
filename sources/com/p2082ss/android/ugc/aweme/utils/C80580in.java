package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2640d.C39239a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: com.ss.android.ugc.aweme.utils.in */
public class C80580in {

    /* renamed from: a */
    private static User f180195a;

    /* renamed from: b */
    private static User f180196b;

    /* renamed from: c */
    private static boolean f180197c;

    static {
        Covode.recordClassIndex(93853);
    }

    /* renamed from: a */
    public static boolean m139679a(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    /* renamed from: a */
    public static void m139678a() {
        f180195a = null;
        f180196b = null;
    }

    /* renamed from: e */
    public static boolean m139691e() {
        return C31575b.m65865g().isDeleteByAgeGate();
    }

    /* renamed from: b */
    public static User m139683b() {
        User user = f180196b;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            f180196b = C31575b.m65865g().getCurUser();
        }
        return f180196b;
    }

    /* renamed from: c */
    public static boolean m139687c() {
        return C31575b.m65865g().isChildrenMode();
    }

    /* renamed from: f */
    public static boolean m139692f() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser == null || !currentUser.isContentLanguageDialogShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m139689d() {
        if (C39223a.m79603q().mo68633d()) {
            return C39239a.m79629c();
        }
        return m139687c();
    }

    /* renamed from: c */
    public static UrlModel m139686c(User user) {
        UrlModel a = C80579im.m139675a(user);
        if (a != null) {
            return a;
        }
        return m139688d(user);
    }

    /* renamed from: f */
    public static boolean m139693f(User user) {
        if (user == null) {
            return false;
        }
        return m139679a(user.getFollowStatus());
    }

    /* renamed from: i */
    public static String m139696i(User user) {
        if (user == null) {
            return "";
        }
        return user.getUid();
    }

    /* renamed from: j */
    public static String m139697j(User user) {
        if (user == null) {
            return "";
        }
        return user.getNickname();
    }

    /* renamed from: k */
    public static boolean m139698k(User user) {
        if (user == null) {
            return false;
        }
        if (user.isBlock || user.isBlocked()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m139680a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        return m139679a(aweme.getAuthor().getFollowStatus());
    }

    /* renamed from: d */
    public static UrlModel m139688d(User user) {
        if (user == null) {
            return null;
        }
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger != null) {
            return avatarLarger;
        }
        UrlModel avatarMedium = user.getAvatarMedium();
        if (avatarMedium == null) {
            return user.getAvatarThumb();
        }
        return avatarMedium;
    }

    /* renamed from: e */
    public static String m139690e(User user) {
        if (user == null) {
            return "";
        }
        if (!C58071d.m104909c()) {
            return m139684b(user);
        }
        return user.getNickname();
    }

    /* renamed from: g */
    public static boolean m139694g(User user) {
        if (user == null) {
            return false;
        }
        if (user == f180195a) {
            return f180197c;
        }
        boolean equals = TextUtils.equals(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID(), user.getUid());
        f180197c = equals;
        f180195a = user;
        return equals;
    }

    /* renamed from: m */
    public static boolean m139700m(User user) {
        if (user == null || !TextUtils.equals("unique_id", user.getNameField())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m139676a(User user) {
        if (user == null) {
            return "";
        }
        if (C58071d.m104909c()) {
            return user.getNickname();
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    /* renamed from: b */
    public static String m139684b(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    /* renamed from: h */
    public static boolean m139695h(User user) {
        if (user == null || user.getAccountType() != 3 || user.getBizAccountInfo() == null || user.getBizAccountInfo().getSuggestedAccountsEntranceTipType() == 0 || TextUtils.isEmpty(user.getBizAccountInfo().getSuggestedAccountsLynxSchema())) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static String m139699l(User user) {
        StringBuilder sb = new StringBuilder();
        sb.append(" user: ");
        if (user == null) {
            sb.append(" ");
        } else {
            sb.append("{ ");
            sb.append(" uid: ");
            sb.append(user.getUid());
            sb.append(',');
            sb.append(" following_count: ");
            sb.append(user.getFollowingCount());
            sb.append(',');
            sb.append(" follower_count: ");
            sb.append(user.getFollowerCount());
            sb.append(" }");
        }
        sb.append(" time: ");
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m139681a(String str) {
        return TextUtils.equals(C31575b.m65865g().getCurUserId(), str);
    }

    /* renamed from: a */
    public static String[] m139682a(UrlModel urlModel) {
        if (urlModel == null || C34717d.m70908a(urlModel.getUrlList())) {
            return null;
        }
        return (String[]) urlModel.getUrlList().toArray(new String[urlModel.getUrlList().size()]);
    }

    /* renamed from: a */
    public static String m139677a(User user, boolean z) {
        String a;
        String str;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            a = user.getRemarkName();
        } else {
            a = m139676a(user);
        }
        if (z) {
            str = "@";
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        return str + a;
    }

    /* renamed from: b */
    public static boolean m139685b(User user, boolean z) {
        if (user == null || z || user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return false;
        }
        return true;
    }
}
