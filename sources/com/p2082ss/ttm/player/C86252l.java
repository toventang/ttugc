package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ss.ttm.player.l */
public final class C86252l {

    /* renamed from: a */
    static final Pattern f192688a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    static final Map<String, Integer> f192689b;

    /* renamed from: c */
    static final Map<String, Integer> f192690c;

    static {
        Covode.recordClassIndex(101429);
        HashMap hashMap = new HashMap();
        f192690c = hashMap;
        hashMap.put("01", 1);
        hashMap.put("02", 2);
        hashMap.put("03", 4);
        hashMap.put("04", 8);
        hashMap.put("05", 16);
        hashMap.put("06", 32);
        hashMap.put("07", 64);
        hashMap.put("08", 128);
        hashMap.put("09", 256);
        HashMap hashMap2 = new HashMap();
        f192689b = hashMap2;
        hashMap2.put("00", 1);
        hashMap2.put("01", 2);
        hashMap2.put("02", 4);
        hashMap2.put("03", 8);
        hashMap2.put("04", 16);
        hashMap2.put("05", 32);
        hashMap2.put("06", 64);
        hashMap2.put("07", 128);
        hashMap2.put("08", 256);
        hashMap2.put("09", 512);
    }
}
