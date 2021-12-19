package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.session.C11865a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.actionhandler.q */
public final class C6625q implements AbstractC6614f {
    static {
        Covode.recordClassIndex(7363);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean canHandle(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals("live", str)) {
            return true;
        }
        if (uri != null) {
            str2 = uri.getHost();
        } else {
            str2 = null;
        }
        if (!TextUtils.equals("webcast_room", str2)) {
            return false;
        }
        if (uri != null) {
            str3 = uri.getPath();
        } else {
            str3 = null;
        }
        if (!TextUtils.equals("/", str3)) {
            if (uri != null) {
                str4 = uri.getPath();
            }
            if (TextUtils.equals("", str4)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(uri, "");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C11865a.m20954a(enterRoomConfig, uri);
        return m14107a(enterRoomConfig, context, uri);
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public final boolean handle(Context context, Uri uri, Map<String, String> map) {
        Boolean bool;
        C89219l.m154721d(context, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(map, "");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C11865a.m20954a(enterRoomConfig, uri);
        String str = map.get("from_notification");
        if (str != null) {
            bool = Boolean.valueOf(Boolean.parseBoolean(str));
        } else {
            bool = null;
        }
        if (uri.getQueryParameter("enter_from_merge") == null && C89219l.m154714a((Object) bool, (Object) true)) {
            enterRoomConfig.f28233c.f28293J = "push";
        }
        if (uri.getQueryParameter("enter_method") == null && C89219l.m154714a((Object) bool, (Object) true)) {
            enterRoomConfig.f28233c.f28295L = "push";
        }
        return m14107a(enterRoomConfig, context, uri);
    }

    /* renamed from: a */
    private static boolean m14107a(EnterRoomConfig enterRoomConfig, Context context, Uri uri) {
        long j;
        Long g;
        C11738s.C11739a aVar;
        C11199a.m19846a(uri, enterRoomConfig);
        HashMap hashMap = new HashMap();
        String uri2 = uri.toString();
        C89219l.m154716b(uri2, "");
        hashMap.put("schema_uri", uri2);
        C3868c.m9491a("ttlive_push_event_schema", 0, hashMap);
        String queryParameter = uri.getQueryParameter("slim_room");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            String a = C11266h.m19967a(queryParameter);
            C89219l.m154716b(a, "");
            try {
                Object a2 = C11116a.m19745a(a, SlimRoom.class);
                C89219l.m154716b(a2, "");
                SlimRoom slimRoom = (SlimRoom) a2;
                C89219l.m154721d(enterRoomConfig, "");
                if (slimRoom != null) {
                    enterRoomConfig.f28231a.f28386m = true;
                    enterRoomConfig.f28231a.f28385l = slimRoom.getId();
                    enterRoomConfig.f28231a.f28375b = slimRoom.buildPullUrl();
                    enterRoomConfig.f28231a.f28376c = slimRoom.getSdkParams();
                    enterRoomConfig.f28231a.f28377d = slimRoom.getMultiStreamData();
                    enterRoomConfig.f28231a.f28379f = slimRoom.getMultiStreamDefaultQualitySdkKey();
                    C11738s streamUrlExtraSafely = slimRoom.getStreamUrlExtraSafely();
                    if (streamUrlExtraSafely != null) {
                        aVar = streamUrlExtraSafely.f28106n;
                    } else {
                        aVar = null;
                    }
                    C89219l.m154716b(aVar, "");
                    if (aVar != null) {
                        enterRoomConfig.f28231a.f28380g = aVar.f28114a;
                        enterRoomConfig.f28231a.f28381h = aVar.f28115b;
                        enterRoomConfig.f28231a.f28382i = aVar.f28116c;
                    }
                    enterRoomConfig.f28231a.f28383j = slimRoom.getStreamType().ordinal();
                }
            } catch (Exception unused) {
                if (Logger.debug()) {
                    C3854a.m9453a(3, "RoomActionHandler2", "parseObject error");
                }
            }
        }
        String queryParameter2 = uri.getQueryParameter("unique_id");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        C89219l.m154716b(queryParameter2, "");
        String c = C89361p.m154920c(queryParameter2, "@", "");
        String str = enterRoomConfig.f28232b.f28258b;
        if (str == null || (g = C89361p.m154865g(str)) == null) {
            j = -1;
        } else {
            j = g.longValue();
        }
        if (enterRoomConfig.f28233c.f28301R <= 0) {
            if (!TextUtils.isEmpty(c)) {
                ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18878a(context, enterRoomConfig, c);
                return true;
            } else if (!TextUtils.isEmpty(enterRoomConfig.f28232b.f28258b)) {
                ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18877a(context, enterRoomConfig, j);
                return true;
            }
        }
        if (enterRoomConfig.f28233c.f28301R > 0) {
            return ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18879a(context, enterRoomConfig);
        }
        return false;
    }
}
