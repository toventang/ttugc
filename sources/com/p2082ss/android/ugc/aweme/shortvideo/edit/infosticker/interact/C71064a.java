package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a */
public final class C71064a {
    static {
        Covode.recordClassIndex(83563);
    }

    /* renamed from: a */
    public static final LinkedHashMap<String, List<InteractStickerStruct>> m125525a(Map<String, ? extends InteractStickerStruct> map) {
        LinkedHashMap<String, List<InteractStickerStruct>> linkedHashMap = new LinkedHashMap<>();
        if (map == null) {
            return linkedHashMap;
        }
        for (T t : map.keySet()) {
            if (linkedHashMap.get(t) == null) {
                linkedHashMap.put(t, new ArrayList());
            }
            Object obj = map.get(t);
            if (obj != null) {
                List<InteractStickerStruct> list = linkedHashMap.get(t);
                if (list == null) {
                    C89219l.m154715b();
                }
                list.add(obj);
            }
        }
        return linkedHashMap;
    }
}
