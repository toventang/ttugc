package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2784a.AbstractC42265a;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41927f;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.C58589b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.a */
public final class C42952a extends AbstractC42265a {

    /* renamed from: a */
    public static final C42953a f100160a = new C42953a((byte) 0);

    /* renamed from: b */
    private String f100161b = "";

    static {
        Covode.recordClassIndex(51081);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2784a.AbstractC42265a
    /* renamed from: a */
    public final String mo71463a() {
        return "searchEnterLiveFlow";
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.a$a */
    public static final class C42953a {
        static {
            Covode.recordClassIndex(51082);
        }

        private C42953a() {
        }

        public /* synthetic */ C42953a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2784a.AbstractC42265a
    /* renamed from: a */
    public final void mo71464a(JSONObject jSONObject, AbstractC42265a.AbstractC42266a aVar) {
        EnterRoomConfig enterRoomConfig;
        boolean z;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("log_extra");
            if (optJSONObject != null) {
                enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f28232b.f28280x = optJSONObject.optString("search_id");
                enterRoomConfig.f28232b.f28281y = optJSONObject.optString("search_keyword");
                enterRoomConfig.f28232b.f28244A = optJSONObject.optString("search_type");
                enterRoomConfig.f28232b.f28257a = optJSONObject.optString("search_id");
                enterRoomConfig.f28232b.f28258b = optJSONObject.optString("anchor_id");
                enterRoomConfig.f28233c.f28295L = optJSONObject.optString("enter_method");
                enterRoomConfig.f28233c.f28293J = optJSONObject.optString("enter_from");
            } else {
                enterRoomConfig = null;
            }
            long optLong = jSONObject.optLong("start_cursor");
            if (jSONObject.optInt("has_more") == 1) {
                z = true;
            } else {
                z = false;
            }
            LiveRoomStruct liveRoomStruct = (LiveRoomStruct) C58589b.m107696a().mo46670a(jSONObject.optString("cur_raw_data"), LiveRoomStruct.class);
            JSONArray optJSONArray = jSONObject.optJSONArray("raw_data_list");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(C58589b.m107696a().mo46670a(optJSONArray.get(i).toString(), LiveRoomStruct.class));
            }
            AbstractC81915c.m141874a(new C41927f(liveRoomStruct, arrayList, optLong, enterRoomConfig, Boolean.valueOf(z)));
        } catch (Exception e) {
            aVar.mo71465a(e.getMessage());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.mo71466a(jSONObject2);
    }
}
