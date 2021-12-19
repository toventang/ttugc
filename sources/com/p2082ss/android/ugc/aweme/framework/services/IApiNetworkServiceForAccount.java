package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.profile.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount */
public interface IApiNetworkServiceForAccount {
    static {
        Covode.recordClassIndex(60665);
    }

    void executeGetForCheck(String str);

    User executeGetJSONObject(String str);

    User executePostJSONObjectForUser(String str, List<C29934d> list);

    UserResponse executePostJSONObjectForUserResponse(String str, List<C29934d> list);

    void registerNotice(String str, int i);

    AvatarUri uploadAvatar(String str, int i, String str2, List<C29934d> list);
}
