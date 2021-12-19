package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.actionhandler.r */
public class C6626r implements AbstractC6615g {
    static {
        Covode.recordClassIndex(7364);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public boolean canHandle(Uri uri) {
        return TextUtils.equals("webcast_profile", uri.getHost());
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public boolean handle(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("user_id");
        long j = 0;
        try {
            if (!TextUtils.isEmpty(queryParameter)) {
                j = Long.parseLong(queryParameter);
            }
        } catch (Throwable unused) {
        }
        String queryParameter2 = uri.getQueryParameter("sec_user_id");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(queryParameter2)) {
            hashMap.put("sec_user_id", queryParameter2);
        }
        return m14108a(j, uri.getQueryParameter(StringSet.type), hashMap);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }

    /* renamed from: a */
    public static boolean m14108a(long j, String str, Map<String, String> map) {
        boolean z;
        Object b = DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (j == 0) {
            j = C11115u.m19743a().mo17915b().mo13161c();
        }
        if (!map.containsKey("show_follow") || !Boolean.parseBoolean(map.get("show_follow"))) {
            z = false;
        } else {
            z = true;
        }
        if (b == null || !TextUtils.equals(str, "half")) {
            ((IHostAction) C6193a.m13435a(IHostAction.class)).openUserProfilePage(j, map);
        } else {
            UserProfileEvent userProfileEvent = new UserProfileEvent(j);
            if (z) {
                userProfileEvent.mSource = "mic_room";
            }
            if (!TextUtils.isEmpty(map.get("click_user_position"))) {
                userProfileEvent.mClickUserPosition = map.get("click_user_position");
            }
            C6779a.m14563a().mo13053a(userProfileEvent);
        }
        return true;
    }
}
