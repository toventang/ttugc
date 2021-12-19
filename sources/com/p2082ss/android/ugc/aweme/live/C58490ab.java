package com.p2082ss.android.ugc.aweme.live;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.live.ab */
public final class C58490ab {

    /* renamed from: a */
    static HashMap<String, Integer> f133166a;

    static {
        Covode.recordClassIndex(68781);
        HashMap<String, Integer> hashMap = new HashMap<>();
        f133166a = hashMap;
        hashMap.put("pm_livecard_end_subtitle_2", Integer.valueOf((int) R.string.ebb));
        f133166a.put("pm_livecard_end_subtitle_1", Integer.valueOf((int) R.string.eba));
        f133166a.put("pm_following_livecard_watch_guide2", Integer.valueOf((int) R.string.e1y));
        f133166a.put("pm_following_livecard_live_end", Integer.valueOf((int) R.string.e1t));
        f133166a.put("pm_following_livecard_live_icon", Integer.valueOf((int) R.string.e1v));
        f133166a.put("pm_following_livecard_watch_guide", Integer.valueOf((int) R.string.e1x));
        f133166a.put("pm_following_livecard_live_icon_backup", Integer.valueOf((int) R.string.e1w));
        f133166a.put("pm_following_livecard_live_end_guide", Integer.valueOf((int) R.string.e1u));
        f133166a.put("pm_live_mt_events_live_consumer_event_end", Integer.valueOf((int) R.string.e74));
        f133166a.put("pm_mt_live_events_live_consumer_live_events", Integer.valueOf((int) R.string.e75));
        f133166a.put("pm_mt_live_events_live_consumer_registered", Integer.valueOf((int) R.string.e76));
        f133166a.put("pm_live_mt_events_mixed_card", Integer.valueOf((int) R.string.e77));
        f133166a.put("ttlive_core_network_unavailable", Integer.valueOf((int) R.string.gj1));
    }

    /* renamed from: a */
    private static int m107311a(String str) {
        Integer num = f133166a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static String m107312a(Context context, String str) {
        int a = m107311a(str);
        if (a == 0) {
            return "";
        }
        return context.getString(a);
    }
}
