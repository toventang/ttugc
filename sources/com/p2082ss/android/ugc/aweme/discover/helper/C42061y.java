package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.y */
public final class C42061y {
    static {
        Covode.recordClassIndex(49991);
    }

    /* renamed from: a */
    public static final List<Integer> m84181a(List<? extends Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (Aweme aweme : list) {
            LiveRoomStruct newLiveRoomData = aweme != null ? aweme.getNewLiveRoomData() : null;
            C89378p<Integer, Integer> a = m84180a(newLiveRoomData);
            int i = 0;
            if (a.getFirst().intValue() == 0 || a.getSecond().intValue() == 0) {
                if (newLiveRoomData != null && newLiveRoomData.isThirdParty) {
                }
                i = 1;
            } else {
                if (a.getFirst().intValue() >= a.getSecond().intValue()) {
                }
                i = 1;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C89378p<Integer, Integer> m84180a(LiveRoomStruct liveRoomStruct) {
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        JSONObject optJSONObject;
        if (liveRoomStruct == null) {
            return new C89378p<>(0, 0);
        }
        C89378p<Integer, Integer> pVar = new C89378p<>(0, 0);
        StreamUrlStruct streamUrlStruct = liveRoomStruct.stream_url;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || (pullData = liveCoreSDKData.getPullData()) == null || (streamData = pullData.getStreamData()) == null) {
            return pVar;
        }
        try {
            JSONObject optJSONObject2 = new JSONObject(streamData).optJSONObject("data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("origin")) == null) {
                return pVar;
            }
            String optString = new JSONObject(((JSONObject) Objects.requireNonNull(optJSONObject.optJSONObject("main"))).optString("sdk_params")).optString("resolution");
            C89219l.m154716b(optString, "");
            Object[] array = C89361p.m154921c(optString, new String[]{"x"}).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return new C89378p<>(Integer.valueOf(Integer.parseInt(strArr[0])), Integer.valueOf(Integer.parseInt(strArr[1])));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return pVar;
        }
    }
}
