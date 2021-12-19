package com.p2082ss.android.ugc.aweme.net;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.AbstractC15295a;
import com.bytedance.ttnet.p1701b.C22931b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.ugc.aweme.net.f */
final /* synthetic */ class RunnableC61342f implements Runnable {

    /* renamed from: a */
    private final String f139315a;

    static {
        Covode.recordClassIndex(71975);
    }

    RunnableC61342f(String str) {
        this.f139315a = str;
    }

    public final void run() {
        String str = this.f139315a;
        String uid = C80580in.m139683b().getUid();
        String str2 = C22931b.f54196b;
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.toLowerCase();
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("operation", "Monitor Event");
        arrayMap.put("uid", uid);
        arrayMap.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        arrayMap.put("region_source", C22931b.f54197c);
        arrayMap.put("region_code", str2);
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = C61337e.f139307d.matcher(str);
            if (matcher.find() && matcher.groupCount() >= 4) {
                arrayMap.put("url", matcher.group(1).replaceAll("\\\\", ""));
                arrayMap.put("logId", matcher.group(2));
                arrayMap.put("new_region_code", matcher.group(3));
                arrayMap.put("new_region_source", matcher.group(4));
            }
        }
        AbstractC15295a.get().recordRegionEvent(arrayMap);
    }
}
