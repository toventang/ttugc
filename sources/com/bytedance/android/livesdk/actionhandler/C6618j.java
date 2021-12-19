package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.p145b.p146a.AbstractC2702b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.actionhandler.j */
public final class C6618j implements AbstractC6614f {
    static {
        Covode.recordClassIndex(7356);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("live_square", uri.getHost());
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri) {
        HashMap hashMap = new HashMap();
        hashMap.put("intercept", "new_style");
        hashMap.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", "referral_task");
        hashMap.put("enter_from_merge", uri.getQueryParameter("enter_from_merge"));
        hashMap.put("enter_method", uri.getQueryParameter("enter_method"));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28293J = uri.getQueryParameter("enter_from_merge");
        enterRoomConfig.f28233c.f28295L = uri.getQueryParameter("enter_method");
        EnterRoomLinkSession.m20943a(enterRoomConfig).mo18994a(new Event("live_square_handler", 4608, EnumC11866b.BussinessApiCall));
        if (C6193a.m13435a(AbstractC2702b.class) == null) {
            return true;
        }
        ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).getStartLiveRoomInterceptor().mo13211a(hashMap);
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        return handle(context, uri);
    }
}
