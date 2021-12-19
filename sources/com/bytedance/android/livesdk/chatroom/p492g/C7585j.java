package com.bytedance.android.livesdk.chatroom.p492g;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.feed.p536l.C8641a;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNewFeedFirstFrameOpSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.j */
public final class C7585j {

    /* renamed from: a */
    public static boolean f18811a;

    static {
        Covode.recordClassIndex(8358);
    }

    /* renamed from: a */
    public static void m15585a(long j) {
        if (LiveForuTopLivesEnterOptSetting.INSTANCE.getValue() == 1) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f28233c.f28301R = j;
            enterRoomConfig.f28233c.f28365u = 0;
            enterRoomConfig.f28233c.f28320aa = "outside_with_feed";
            ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18880b(C3966y.m9669e(), enterRoomConfig);
        }
    }

    /* renamed from: b */
    public static void m15590b(long j) {
        if (LiveNewFeedFirstFrameOpSetting.INSTANCE.getValue() == 1) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f28233c.f28301R = j;
            enterRoomConfig.f28233c.f28365u = 0;
            enterRoomConfig.f28233c.f28320aa = "outside_with_feed";
            ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18880b(C3966y.m9669e(), enterRoomConfig);
        }
    }

    /* renamed from: a */
    public static String m15584a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/webcast/feed/")) {
            return str;
        }
        if (C11725f.f28051c == null) {
            C11725f.f28051c = Boolean.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline());
        }
        if (!C11725f.f28051c.booleanValue() || str.contains("&debug=true")) {
            return str;
        }
        return str + "&debug=true";
    }

    /* renamed from: a */
    public static void m15586a(long j, EnterRoomConfig enterRoomConfig) {
        System.currentTimeMillis();
        m15591b(j, enterRoomConfig);
    }

    /* renamed from: a */
    private static EnterRoomConfig m15581a(FeedItem feedItem, C2965a aVar) {
        String str = null;
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            return null;
        }
        EnterRoomConfig a = C11760a.m20717a((Room) feedItem.item, new EnterRoomConfig());
        if (aVar != null) {
            try {
                a.f28232b.f28263g = String.valueOf(aVar.mo7786a());
                if (TextUtils.isEmpty(aVar.f8720f) && !TextUtils.isEmpty(String.valueOf(aVar.mo7786a()))) {
                    aVar.f8720f = new JSONObject(aVar.mo7786a().toString()).getString("impr_id");
                }
                a.f28232b.f28257a = aVar.f8720f;
                EnterRoomConfig.RoomsData roomsData = a.f28233c;
                if (feedItem.isRecommendCard) {
                    str = "pop_card";
                }
                roomsData.f28309Z = str;
            } catch (Exception e) {
                C3854a.m9458a("NewFeedStyleEntranceUtils", e);
            }
        }
        return a;
    }

    /* renamed from: b */
    private static EnterRoomConfig m15589b(FeedItem feedItem, C2965a aVar) {
        String str = null;
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            return null;
        }
        EnterRoomConfig a = C11760a.m20718a((Room) feedItem.item, true);
        if (aVar != null) {
            try {
                a.f28232b.f28263g = String.valueOf(aVar.mo7786a());
                if (TextUtils.isEmpty(aVar.f8720f) && !TextUtils.isEmpty(String.valueOf(aVar.mo7786a()))) {
                    aVar.f8720f = new JSONObject(aVar.mo7786a().toString()).getString("impr_id");
                }
                a.f28232b.f28257a = aVar.f8720f;
                EnterRoomConfig.RoomsData roomsData = a.f28233c;
                if (feedItem.isRecommendCard) {
                    str = "pop_card";
                }
                roomsData.f28309Z = str;
            } catch (Exception e) {
                C3854a.m9458a("NewFeedStyleEntranceUtils", e);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static EnterRoomConfig m15582a(EnterRoomConfig enterRoomConfig, List<FeedItem> list) {
        if (!(enterRoomConfig == null || list == null)) {
            if (C11725f.f28051c == null) {
                C11725f.f28051c = Boolean.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).isOffline());
            }
            if (C11725f.f28051c.booleanValue()) {
                HashMap<Long, String> hashMap = new HashMap<>();
                for (int i = 0; i < list.size(); i++) {
                    FeedItem feedItem = list.get(i);
                    hashMap.put(Long.valueOf(feedItem.getRoom().getId()), feedItem.debugInfo);
                }
                enterRoomConfig.f28233c.f28313aC = hashMap;
            }
        }
        return enterRoomConfig;
    }

    /* renamed from: b */
    public static void m15591b(long j, EnterRoomConfig enterRoomConfig) {
        HashMap hashMap = new HashMap();
        if (j > 0 && enterRoomConfig != null) {
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - j));
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("anchor_id", enterRoomConfig.f28232b.f28258b);
            hashMap.put("room_id", String.valueOf(enterRoomConfig.f28233c.f28301R));
            hashMap.put("request_id", enterRoomConfig.f28232b.f28257a);
            hashMap.put("action_type", "click");
            hashMap.put("live_window_mode", "full_screen");
            hashMap.put("log_pb", enterRoomConfig.f28232b.f28263g);
            C6501b.C6502a.m13948a("livesdk_new_style_feed_duration").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* renamed from: a */
    public static void m15587a(long j, String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_from", str);
            jSONObject.put("feed_count", i);
        } catch (JSONException unused) {
        }
        C3868c.m9490a(C6542d.m13984a("ttlive_toplives_query_feed_api"), 0, SystemClock.elapsedRealtime() - j, jSONObject);
    }

    /* renamed from: a */
    public static EnterRoomConfig m15583a(List<FeedItem> list, C2965a aVar, String str, long j, Map<String, String> map) {
        FeedItem feedItem = list.get(0);
        boolean z = list.get(0).isRecommendCard;
        String str2 = null;
        EnterRoomConfig a = (feedItem == null || !(feedItem.item instanceof Room)) ? null : m15581a(feedItem, aVar);
        a.f28233c.f28284A = str;
        a.f28233c.f28298O = true;
        a.f28233c.f28300Q = "live_square";
        a.f28233c.f28306W = "full_screen";
        a.f28232b.f28279w = j;
        a.f28233c.f28293J = "live_merge";
        a.f28233c.f28295L = "live_cover";
        EnterRoomConfig.RoomsData roomsData = a.f28233c;
        if (z) {
            str2 = "pop_card";
        }
        roomsData.f28309Z = str2;
        EnterRoomConfig a2 = m15582a(a, list);
        if (map != null && map.containsKey("enter_from_merge")) {
            a2.f28233c.f28293J = map.get("enter_from_merge");
            map.remove("enter_from_merge");
        }
        SparseArray<EnterRoomConfig> sparseArray = new SparseArray<>(list.size());
        int size = list.size();
        for (int i = 1; i < size; i++) {
            EnterRoomConfig b = m15589b(list.get(i), aVar);
            if (b != null) {
                sparseArray.put(i, b);
            }
        }
        a2.f28233c.f28285B = sparseArray;
        if (aVar != null) {
            a2.f28233c.f28368x = Boolean.valueOf(aVar.hasMore);
            a2.f28233c.f28367w = aVar.f8718d;
            a2.f28233c.f28366v = aVar.f8716b;
        }
        if (map != null && !map.isEmpty() && map.containsKey("live.intent.extra.FROM_NEW_STYLE_SOURCE")) {
            String str3 = map.get("live.intent.extra.FROM_NEW_STYLE_SOURCE");
            EnterRoomConfig.RoomsData roomsData2 = a2.f28233c;
            if (str3 == null) {
                str3 = "";
            }
            roomsData2.f28299P = str3;
        }
        C11870f.C11871a.f28404a.mo19012a(new EnterRoomLinkSession(a2));
        return a2;
    }

    /* renamed from: a */
    public static void m15588a(C8641a aVar, String str, long j, Map<String, String> map, long j2) {
        if (aVar == null || C13617h.m24465a(aVar.f21360a) || aVar.f21360a.get(0) == null) {
            m15590b(-4);
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gkb);
            return;
        }
        EnterRoomConfig a = m15583a(aVar.f21360a, aVar.f21361b, m15584a(str), j2, map);
        a.f28232b.f28250G = map.get("toplive_position");
        m15591b(j, a);
        m15586a(j2, a);
        m15587a(j, "message", aVar.f21360a.size());
        a.f28233c.f28301R = aVar.f21360a.get(0).item.getId();
        a.f28233c.f28320aa = "outside_with_feed";
        ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18880b(C3966y.m9669e(), a);
    }
}
