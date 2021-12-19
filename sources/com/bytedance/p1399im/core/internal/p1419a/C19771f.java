package com.bytedance.p1399im.core.internal.p1419a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19589ao;
import com.bytedance.p1399im.core.p1415g.C19699c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.f */
public final class C19771f {
    static {
        Covode.recordClassIndex(22615);
    }

    /* renamed from: a */
    public static boolean m37154a(String str, Map<Long, C19589ao> map) {
        AbstractC19766c cVar;
        Throwable th;
        Exception e;
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet(m37156b(str));
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.addAll(hashSet2);
        hashSet3.removeAll(hashSet);
        ArrayList arrayList = new ArrayList(hashSet3);
        ArrayList<C19589ao> arrayList2 = new ArrayList(map.values());
        HashSet<C19589ao> hashSet4 = new HashSet();
        C19742b.m36974a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)");
        try {
            if (!arrayList2.isEmpty()) {
                cVar = C19742b.m36981c("update participant_read set " + EnumC19772a.COLUMN_MIN_INDEX.key + "=?," + EnumC19772a.COLUMN_READ_INDEX.key + "=?," + EnumC19772a.COLUMN_READ_ORDER.key + "=? where " + EnumC19772a.COLUMN_USER_ID.key + "=? and " + EnumC19772a.COLUMN_CONVERSATION_ID.key + "=?");
                try {
                    for (C19589ao aoVar : arrayList2) {
                        if (aoVar != null) {
                            cVar.mo31728d();
                            cVar.mo31724a(1, aoVar.f46507c);
                            cVar.mo31724a(2, aoVar.f46508d);
                            cVar.mo31724a(3, aoVar.f46509e);
                            cVar.mo31724a(4, aoVar.f46506b);
                            cVar.mo31725a(5, str);
                            if (cVar.mo31723a() <= 0) {
                                hashSet4.add(aoVar);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C19512f.m36457b("imsdk", "IMConversationMemberReadDao insertOrUpdateMemberRead", e);
                        C19742b.m36975a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", false);
                        C19741a.m36964a(cVar);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        C19741a.m36964a(cVar);
                        throw th;
                    }
                }
            } else {
                cVar = null;
            }
            if (!hashSet4.isEmpty()) {
                if (cVar != null) {
                    cVar.mo31727c();
                }
                cVar = C19742b.m36981c("insert or ignore into participant_read values(" + C19741a.m36960a(EnumC19772a.values().length) + ")");
                for (C19589ao aoVar2 : hashSet4) {
                    cVar.mo31728d();
                    cVar.mo31724a(1, aoVar2.f46506b);
                    cVar.mo31725a(2, aoVar2.f46505a);
                    cVar.mo31724a(3, aoVar2.f46507c);
                    cVar.mo31724a(4, aoVar2.f46508d);
                    cVar.mo31724a(5, aoVar2.f46509e);
                    cVar.mo31726b();
                }
            }
            m37155b(str, arrayList);
            C19742b.m36975a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", true);
            C20002j.m37782c("IMConversationMemberReadDao insertOrUpdateMemberRead end");
            C19699c.m36829a().mo31653a("insertOrUpdateMemberRead", currentTimeMillis);
        } catch (Exception e3) {
            e = e3;
            cVar = null;
            C19512f.m36457b("imsdk", "IMConversationMemberReadDao insertOrUpdateMemberRead", e);
            C19742b.m36975a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", false);
            C19741a.m36964a(cVar);
            return true;
        } catch (Throwable th3) {
            th = th3;
            cVar = null;
            C19741a.m36964a(cVar);
            throw th;
        }
        C19741a.m36964a(cVar);
        return true;
    }

    /* renamed from: com.bytedance.im.core.internal.a.f$a */
    public enum EnumC19772a {
        COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
        COLUMN_MIN_INDEX("min_index", "INTEGER"),
        COLUMN_READ_INDEX("read_index", "INTEGER"),
        COLUMN_READ_ORDER("read_order", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22616);
        }

        private EnumC19772a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    public static String m37151a() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant_read(");
        EnumC19772a[] values = EnumC19772a.values();
        for (EnumC19772a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: a */
    private static C19589ao m37150a(AbstractC19751a aVar) {
        C19589ao aoVar = new C19589ao();
        aoVar.f46505a = aVar.mo31692c(aVar.mo31688a(EnumC19772a.COLUMN_CONVERSATION_ID.key));
        aoVar.f46506b = aVar.mo31691b(aVar.mo31688a(EnumC19772a.COLUMN_USER_ID.key));
        aoVar.mo31359a(aVar.mo31691b(aVar.mo31688a(EnumC19772a.COLUMN_MIN_INDEX.key)));
        aoVar.mo31360b(aVar.mo31691b(aVar.mo31688a(EnumC19772a.COLUMN_READ_INDEX.key)));
        aoVar.mo31363c(aVar.mo31691b(aVar.mo31688a(EnumC19772a.COLUMN_READ_ORDER.key)));
        return aoVar;
    }

    /* renamed from: b */
    private static List<Long> m37156b(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from participant_read where " + EnumC19772a.COLUMN_CONVERSATION_ID.key + "=? ", new String[]{str});
            int i = -1;
            while (aVar.mo31694d()) {
                if (i < 0) {
                    i = aVar.mo31688a(EnumC19772a.COLUMN_USER_ID.key);
                }
                arrayList.add(Long.valueOf(aVar.mo31691b(i)));
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationMemberReadDao getMemberIdList", e);
            e.printStackTrace();
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: a */
    public static HashMap<String, HashMap<Long, C19589ao>> m37152a(List<String> list) {
        HashMap<String, HashMap<Long, C19589ao>> hashMap = new HashMap<>();
        AbstractC19751a aVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("select * from participant_read where " + EnumC19772a.COLUMN_CONVERSATION_ID.key + " in ( ");
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    sb.append("? )");
                } else {
                    sb.append("? ,");
                }
            }
            aVar = C19742b.m36973a(sb.toString(), (String[]) list.toArray(new String[list.size()]));
            ArrayList<C19589ao> arrayList = new ArrayList();
            while (aVar.mo31694d()) {
                arrayList.add(m37150a(aVar));
            }
            for (C19589ao aoVar : arrayList) {
                String str = aoVar.f46505a;
                if (!hashMap.containsKey(str)) {
                    HashMap<Long, C19589ao> hashMap2 = new HashMap<>();
                    hashMap2.put(Long.valueOf(aoVar.f46506b), aoVar);
                    hashMap.put(str, hashMap2);
                } else {
                    hashMap.get(str).put(Long.valueOf(aoVar.f46506b), aoVar);
                }
            }
            return hashMap;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationMemberReadDao getMemberList", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            return hashMap;
        } finally {
            C19741a.m36961a(aVar);
        }
    }

    /* renamed from: a */
    private static List<C19589ao> m37153a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from participant_read where " + EnumC19772a.COLUMN_CONVERSATION_ID.key + "=? ", new String[]{str});
            while (aVar.mo31694d()) {
                arrayList.add(m37150a(aVar));
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationMemberReadDao getMemberList", e);
            e.printStackTrace();
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: a */
    public static int m37149a(String str, List<Long> list) {
        int i;
        Exception e;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        C19742b.m36974a("IMConversationMemberReadDao.removeMember(String, List)");
        try {
            Iterator<Long> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                try {
                    if (C19742b.m36977a("participant_read", EnumC19772a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19772a.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(it.next())})) {
                        i++;
                    }
                } catch (Exception e2) {
                    e = e2;
                    C19512f.m36457b("imsdk", "IMConversationMemberReadDao removeMember", e);
                    C19742b.m36975a("IMConversationMemberReadDao.removeMember(String, List)", false);
                    return i;
                }
            }
            C19742b.m36975a("IMConversationMemberReadDao.removeMember(String, List)", true);
        } catch (Exception e3) {
            e = e3;
            i = 0;
            C19512f.m36457b("imsdk", "IMConversationMemberReadDao removeMember", e);
            C19742b.m36975a("IMConversationMemberReadDao.removeMember(String, List)", false);
            return i;
        }
        return i;
    }

    /* renamed from: b */
    private static int m37155b(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Long l : list) {
            if (C19742b.m36977a("participant_read", EnumC19772a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19772a.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(l)})) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static Map<Long, C19589ao> m37158c(String str, Map<Long, C19589ao> map) {
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<C19589ao> a = m37153a(str);
        if (!a.isEmpty()) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C19589ao aoVar = a.get(i);
                if (aoVar != null) {
                    long j = aoVar.f46506b;
                    if (map == null) {
                        map = new HashMap<>();
                        map.put(Long.valueOf(j), aoVar.clone());
                    } else {
                        C19589ao aoVar2 = map.get(Long.valueOf(j));
                        if (aoVar2 == null) {
                            aoVar2 = new C19589ao();
                        }
                        aoVar2.f46505a = aoVar.f46505a;
                        aoVar2.f46506b = aoVar.f46506b;
                        aoVar2.mo31359a(aoVar.f46507c);
                        aoVar2.mo31360b(aoVar.f46508d);
                        aoVar2.mo31363c(aoVar.f46509e);
                        map.put(Long.valueOf(j), aoVar2);
                    }
                }
            }
        }
        C19699c.m36829a().mo31653a("loadIndexInfoToMap", currentTimeMillis);
        return map;
    }

    /* renamed from: b */
    public static boolean m37157b(String str, Map<Long, C19589ao> map) {
        AbstractC19766c cVar;
        Throwable th;
        Exception e;
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<C19589ao> arrayList = new ArrayList(map.values());
        HashSet<C19589ao> hashSet = new HashSet();
        C19742b.m36974a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)");
        try {
            C19742b.m36977a("participant_read", C19749c.EnumC19750a.COLUMN_ID.key + "=?", new String[]{str});
            if (!arrayList.isEmpty()) {
                cVar = C19742b.m36981c("update participant_read set " + EnumC19772a.COLUMN_READ_INDEX.key + "=?," + EnumC19772a.COLUMN_READ_ORDER.key + "=?," + EnumC19772a.COLUMN_MIN_INDEX.key + "=? where " + EnumC19772a.COLUMN_USER_ID.key + "=? and " + EnumC19772a.COLUMN_CONVERSATION_ID.key + "=?");
                try {
                    for (C19589ao aoVar : arrayList) {
                        if (aoVar != null) {
                            cVar.mo31728d();
                            cVar.mo31724a(1, aoVar.f46508d);
                            cVar.mo31724a(2, aoVar.f46509e);
                            cVar.mo31724a(3, aoVar.f46507c);
                            cVar.mo31724a(4, aoVar.f46506b);
                            cVar.mo31725a(5, str);
                            if (cVar.mo31723a() <= 0) {
                                hashSet.add(aoVar);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C19512f.m36457b("imsdk", "IMConversationMemberReadDao insertOrUpdateMemberRead", e);
                        C19742b.m36975a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", false);
                        C19741a.m36964a(cVar);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        C19741a.m36964a(cVar);
                        throw th;
                    }
                }
            } else {
                cVar = null;
            }
            if (!hashSet.isEmpty()) {
                if (cVar != null) {
                    cVar.mo31727c();
                }
                cVar = C19742b.m36981c("insert or ignore into participant_read values(" + C19741a.m36960a(EnumC19772a.values().length) + ")");
                for (C19589ao aoVar2 : hashSet) {
                    cVar.mo31728d();
                    cVar.mo31724a(1, aoVar2.f46506b);
                    cVar.mo31725a(2, aoVar2.f46505a);
                    cVar.mo31724a(3, aoVar2.f46507c);
                    cVar.mo31724a(4, aoVar2.f46508d);
                    cVar.mo31724a(5, aoVar2.f46509e);
                    cVar.mo31726b();
                }
            }
            C19742b.m36975a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", true);
            C20002j.m37782c("IMConversationMemberReadDao insertOrUpdateMemberRead end");
            C19699c.m36829a().mo31653a("insertOrUpdateMemberRead", currentTimeMillis);
        } catch (Exception e3) {
            e = e3;
            cVar = null;
            C19512f.m36457b("imsdk", "IMConversationMemberReadDao insertOrUpdateMemberRead", e);
            C19742b.m36975a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", false);
            C19741a.m36964a(cVar);
            return true;
        } catch (Throwable th3) {
            th = th3;
            cVar = null;
            C19741a.m36964a(cVar);
            throw th;
        }
        C19741a.m36964a(cVar);
        return true;
    }
}
