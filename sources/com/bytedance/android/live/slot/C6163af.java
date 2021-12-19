package com.bytedance.android.live.slot;

import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.slot.LiveOutsideBizRegisterPrioritySetting;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.slot.af */
public final class C6163af {

    /* renamed from: a */
    static Map<IIconSlot.EnumC6149b, Map<String, Integer>> f15392a = new HashMap();

    /* renamed from: b */
    static Map<IFrameSlot.EnumC6146b, Map<String, Integer>> f15393b = new HashMap();

    /* renamed from: c */
    static Map<String, Integer> f15394c = new HashMap();

    /* renamed from: d */
    public static int f15395d = 0;

    /* renamed from: e */
    public static int f15396e = 999;

    /* renamed from: a */
    private static Map<String, Integer> m13410a() {
        HashMap hashMap = new HashMap();
        if (2 == LiveOutsideBizRegisterPrioritySetting.INSTANCE.getValue()) {
            hashMap.put("ec_shop", 2);
            hashMap.put("business_links", 1);
        } else {
            hashMap.put("ec_shop", 1);
            hashMap.put("business_links", 2);
        }
        return hashMap;
    }

    static {
        Covode.recordClassIndex(6869);
        f15392a.put(IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR, m13410a());
        f15392a.put(IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_L2_TOOLBAR, m13410a());
        Map<IIconSlot.EnumC6149b, Map<String, Integer>> map = f15392a;
        IIconSlot.EnumC6149b bVar = IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR;
        HashMap hashMap = new HashMap();
        hashMap.put("business_links", Integer.valueOf(f15395d));
        hashMap.put("ec_shop", Integer.valueOf(f15395d));
        map.put(bVar, hashMap);
        Map<IIconSlot.EnumC6149b, Map<String, Integer>> map2 = f15392a;
        IIconSlot.EnumC6149b bVar2 = IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR;
        HashMap hashMap2 = new HashMap();
        if (2 == LiveOutsideBizRegisterPrioritySetting.INSTANCE.getValue()) {
            hashMap2.put("ec_shop", 2);
            hashMap2.put("business_links", 1);
        } else {
            hashMap2.put("ec_shop", 1);
            hashMap2.put("business_links", 2);
        }
        map2.put(bVar2, hashMap2);
        Map<IFrameSlot.EnumC6146b, Map<String, Integer>> map3 = f15393b;
        IFrameSlot.EnumC6146b bVar3 = IFrameSlot.EnumC6146b.SLOT_LIVE_BOTTOM_POP;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("business_links", Integer.valueOf(f15395d));
        hashMap3.put("ec_shop", Integer.valueOf(f15395d));
        map3.put(bVar3, hashMap3);
        f15394c.put("ec_shop", 1);
        f15394c.put("business_links", 2);
    }

    /* renamed from: a */
    public static int m13409a(String str) {
        Integer num = f15394c.get(str);
        if (num == null) {
            return f15396e;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static int m13408a(IIconSlot.EnumC6149b bVar, String str) {
        Integer num;
        Map<String, Integer> map = f15392a.get(bVar);
        if (map == null || (num = map.get(str)) == null) {
            return f15396e;
        }
        return num.intValue();
    }
}
