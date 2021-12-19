package com.bytedance.android.livesdkapi.session;

import android.net.Uri;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdkapi.session.a */
public final class C11865a {
    static {
        Covode.recordClassIndex(13583);
    }

    /* renamed from: a */
    public static final void m20954a(EnterRoomConfig enterRoomConfig, Uri uri) {
        long j;
        Object obj;
        Integer e;
        Long g;
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(uri, "");
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
        String queryParameter = uri.getQueryParameter("room_id");
        if (queryParameter == null || (g = C89361p.m154865g(queryParameter)) == null) {
            j = -1;
        } else {
            j = g.longValue();
        }
        roomsData.f28301R = j;
        int i = -1;
        if (enterRoomConfig.f28233c.f28301R > 0) {
            enterRoomConfig.f28233c.f28362r = -1;
        }
        enterRoomConfig.f28232b.f28273q = uri.getQueryParameter("inner_push_type");
        enterRoomConfig.f28232b.f28274r = uri.getQueryParameter("gd_label");
        enterRoomConfig.f28232b.f28258b = uri.getQueryParameter("user_id");
        enterRoomConfig.f28232b.f28269m = uri.getQueryParameter("enter_from_module");
        enterRoomConfig.f28232b.f28257a = uri.getQueryParameter("request_id");
        enterRoomConfig.f28232b.f28263g = uri.getQueryParameter("log_pb");
        enterRoomConfig.f28232b.f28272p = uri.getQueryParameter("top_message_type");
        enterRoomConfig.f28232b.f28276t = uri.getQueryParameter("pop_type");
        enterRoomConfig.f28232b.f28259c = uri.getQueryParameter("video_id");
        enterRoomConfig.f28232b.f28265i = uri.getQueryParameter("request_page");
        enterRoomConfig.f28232b.f28266j = uri.getQueryParameter("anchor_type");
        enterRoomConfig.f28232b.f28251H = uri.getQueryParameter("magic3_source");
        enterRoomConfig.f28232b.f28252I = uri.getQueryParameter("magic3_activityId");
        enterRoomConfig.f28232b.f28253J = uri.getQueryParameter("magic3_comptype");
        enterRoomConfig.f28232b.f28280x = uri.getQueryParameter("search_id");
        enterRoomConfig.f28232b.f28282z = uri.getQueryParameter("search_result_id");
        enterRoomConfig.f28233c.f28287D = uri.getQueryParameter("user_id");
        enterRoomConfig.f28233c.f28307X = uri.getQueryParameter("enter_live_source");
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
        String queryParameter2 = uri.getQueryParameter("enter_from_merge");
        String str = "webview";
        if (queryParameter2 == null) {
            queryParameter2 = str;
        }
        roomsData2.f28293J = queryParameter2;
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.f28233c;
        String queryParameter3 = uri.getQueryParameter("enter_method");
        if (queryParameter3 != null) {
            str = queryParameter3;
        }
        roomsData3.f28295L = str;
        enterRoomConfig.f28233c.f28355k = uri.getQueryParameter("tip");
        enterRoomConfig.f28233c.f28354j = uri.getQueryParameter("tip_i18n");
        enterRoomConfig.f28233c.f28353i = uri.getQueryParameter("back_room");
        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.f28233c;
        String queryParameter4 = uri.getQueryParameter("tab_index");
        if (!(queryParameter4 == null || (e = C89361p.m154863e(queryParameter4)) == null)) {
            i = e.intValue();
        }
        roomsData4.f28364t = i;
        enterRoomConfig.f28233c.f28303T = uri.getQueryParameter("backurl");
        EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.f28233c;
        try {
            String queryParameter5 = uri.getQueryParameter("extra_params");
            if (queryParameter5 == null) {
                queryParameter5 = "{}";
            }
            obj = C89379q.m157068constructorimpl(new JSONObject(queryParameter5).getString("auto_route_schema"));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        roomsData5.f28316aF = (String) obj;
    }
}
