package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.l */
public final class C55671l {

    /* renamed from: c */
    public static final C55672a f126991c = new C55672a((byte) 0);

    /* renamed from: a */
    public final C19536ag f126992a;

    /* renamed from: b */
    public final String f126993b;

    static {
        Covode.recordClassIndex(65454);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.l$a */
    public static final class C55672a {
        static {
            Covode.recordClassIndex(65455);
        }

        private C55672a() {
        }

        public /* synthetic */ C55672a(byte b) {
            this();
        }

        /* renamed from: a */
        private static /* synthetic */ Map m101431a(Map map) {
            return m101432a(map, C55197c.m100919b().toString());
        }

        /* renamed from: a */
        public static C55648b m101429a(Map<String, ? extends List<? extends C19536ag>> map, Map<String, ? extends List<? extends C19536ag>> map2) {
            Map map3;
            Map map4;
            Integer num;
            if (map != null) {
                try {
                    map3 = m101431a(map);
                } catch (Exception e) {
                    C51423a.m95786a(e);
                    return null;
                }
            } else {
                map3 = null;
            }
            if (map2 != null) {
                map4 = m101431a(map2);
            } else {
                map4 = null;
            }
            ArrayList arrayList = new ArrayList();
            List<C55674n> a = m101430a(map3, map4, EnumC55647a.REMOVE);
            List<C55674n> a2 = m101430a(map4, map3, EnumC55647a.ADD);
            C55673m.m101433a(arrayList, a);
            C55673m.m101433a(arrayList, a2);
            if (map4 != null) {
                num = Integer.valueOf(map4.size());
            } else {
                num = null;
            }
            return new C55648b(arrayList, num);
        }

        /* renamed from: a */
        private static Map<String, C19536ag> m101432a(Map<String, ? extends List<? extends C19536ag>> map, String str) {
            ArrayList arrayList;
            if (map == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, ? extends List<? extends C19536ag>> entry : map.entrySet()) {
                List list = (List) entry.getValue();
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        if (!TextUtils.equals(String.valueOf(((C19536ag) obj).uid.longValue()), str)) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = C89086z.INSTANCE;
                }
                C89070n.m154535a((Collection) arrayList2, arrayList);
            }
            ArrayList arrayList4 = arrayList2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) arrayList4, 10)), 16));
            for (Object obj2 : arrayList4) {
                C19536ag agVar = (C19536ag) obj2;
                linkedHashMap.put(agVar.key + agVar.msgUuid + agVar.conversationId + agVar.idempotent_id, obj2);
            }
            return linkedHashMap;
        }

        /* renamed from: a */
        private static List<C55674n> m101430a(Map<String, ? extends C19536ag> map, Map<String, ? extends C19536ag> map2, EnumC55647a aVar) {
            if (map == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends C19536ag> entry : map.entrySet()) {
                String key = entry.getKey();
                if (map2 == null || !map2.containsKey(key)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = ((C19536ag) entry2.getValue()).key;
                C89219l.m154716b(str, "");
                arrayList.add(new C55674n(new C55671l((C19536ag) entry2.getValue(), str), aVar));
            }
            return arrayList;
        }
    }

    public C55671l(C19536ag agVar, String str) {
        C89219l.m154721d(agVar, "");
        C89219l.m154721d(str, "");
        this.f126992a = agVar;
        this.f126993b = str;
    }
}
