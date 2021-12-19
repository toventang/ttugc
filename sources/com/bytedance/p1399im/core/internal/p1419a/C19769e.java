package com.bytedance.p1399im.core.internal.p1419a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1421b.C19745a;
import com.bytedance.p1399im.core.internal.p1419a.p1421b.C19747b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1415g.C19699c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.e */
public final class C19769e {
    static {
        Covode.recordClassIndex(22613);
    }

    /* renamed from: a */
    public static Map<String, List<Long>> m37139a(List<String> list) {
        if (list.size() <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        int i = C19483d.m36365a().mo31141b().f46237ab.batchQueryEnableAndQueryLimit;
        String str = "select * from participant where " + EnumC19770a.COLUMN_CONVERSATION_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        AbstractC19751a aVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i2 == i - 1 || i3 == list.size() - 1) {
                sb.append("'").append(list.get(i3)).append("') order by ").append(EnumC19770a.COLUMN_SORT_ORDER.key);
                try {
                    aVar = C19742b.m36973a(sb.toString(), (String[]) null);
                    if (aVar != null) {
                        int a = aVar.mo31688a(EnumC19770a.COLUMN_CONVERSATION_ID.key);
                        int a2 = aVar.mo31688a(EnumC19770a.COLUMN_USER_ID.key);
                        while (aVar.mo31694d()) {
                            String c = aVar.mo31692c(a);
                            List list2 = (List) hashMap.get(c);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap.put(c, list2);
                            }
                            list2.add(Long.valueOf(aVar.mo31691b(a2)));
                        }
                    }
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "IMConversationMemberDao getMemberIdMap", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                } catch (Throwable th) {
                    C19741a.m36961a(aVar);
                    throw th;
                }
                C19741a.m36961a(aVar);
                sb = new StringBuilder(str);
                i2 = 0;
            } else {
                i2++;
                sb.append("'").append(list.get(i3)).append("',");
            }
        }
        C19699c.m36829a().mo31653a("getMemberIdMap", currentTimeMillis);
        return hashMap;
    }

    /* renamed from: a */
    public static List<C19537ah> m37138a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from participant where " + EnumC19770a.COLUMN_CONVERSATION_ID.key + "=? and " + EnumC19770a.COLUMN_USER_ID.key + " in (" + C19996e.m37751a(list, ",") + ") order by " + EnumC19770a.COLUMN_SORT_ORDER.key, new String[]{str});
            while (aVar.mo31694d()) {
                arrayList.add(m37134a(aVar));
            }
            C20002j.m37782c("IMConversationMemberDao getMemberList by ids, result:" + arrayList.size());
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationMemberDao getMemberList", e);
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
    public static boolean m37141a(String str, int i, List<C19537ah> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        C20002j.m37782c("IMConversationMemberDao insertOrUpdateMember, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<C19537ah> arrayList = new ArrayList();
        C19742b.m36974a("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        try {
            for (C19537ah ahVar : list) {
                if (ahVar != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(EnumC19770a.COLUMN_SORT_ORDER.key, Long.valueOf(ahVar.getSortOrder()));
                    contentValues.put(EnumC19770a.COLUMN_ROLE.key, Integer.valueOf(ahVar.getRole()));
                    contentValues.put(EnumC19770a.COLUMN_ALIAS.key, ahVar.getAlias());
                    contentValues.put(EnumC19770a.COLUMN_SEC_UID.key, ahVar.getSecUid());
                    contentValues.put(EnumC19770a.COLUMN_SILENT.key, Integer.valueOf(ahVar.getSilent()));
                    contentValues.put(EnumC19770a.COLUMN_SILENT_TIME.key, Long.valueOf(ahVar.getSilentTime()));
                    if (C19742b.m36971a("participant", contentValues, EnumC19770a.COLUMN_USER_ID.key + "=? AND " + EnumC19770a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{String.valueOf(ahVar.getUid()), str}) <= 0) {
                        ahVar.setConversationType(i);
                        arrayList.add(ahVar);
                    } else {
                        C19745a.m36988a();
                        C19483d.m36365a();
                    }
                }
            }
            for (C19537ah ahVar2 : arrayList) {
                if (C19742b.m36972a("participant", m37133a(ahVar2)) > 0) {
                    C19745a.m36988a();
                    C19483d.m36365a();
                }
            }
            C19742b.m36975a("IMConversationMemberDao.insertOrUpdateMember(String,List)", true);
            C19699c.m36829a().mo31653a("insertOrUpdateMember", currentTimeMillis);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationMemberDao", e);
            C19742b.m36975a("IMConversationMemberDao.insertOrUpdateMember(String,List)", false);
        }
        C20014q.m37816a().mo31909b(list);
        return true;
    }

    /* renamed from: a */
    private static void m37140a(AbstractC19751a aVar, Map<String, List<C19537ah>> map) {
        if (aVar != null) {
            int a = aVar.mo31688a(EnumC19770a.COLUMN_ALIAS.key);
            int a2 = aVar.mo31688a(EnumC19770a.COLUMN_CONVERSATION_ID.key);
            int a3 = aVar.mo31688a(EnumC19770a.COLUMN_ROLE.key);
            int a4 = aVar.mo31688a(EnumC19770a.COLUMN_SORT_ORDER.key);
            int a5 = aVar.mo31688a(EnumC19770a.COLUMN_USER_ID.key);
            int a6 = aVar.mo31688a(EnumC19770a.COLUMN_SEC_UID.key);
            int a7 = aVar.mo31688a(EnumC19770a.COLUMN_SILENT.key);
            int a8 = aVar.mo31688a(EnumC19770a.COLUMN_SILENT_TIME.key);
            while (aVar.mo31694d()) {
                C19537ah ahVar = new C19537ah();
                String c = aVar.mo31692c(a2);
                ahVar.setAlias(aVar.mo31692c(a));
                ahVar.setConversationId(c);
                ahVar.setRole(aVar.mo31687a(a3));
                ahVar.setSortOrder((long) aVar.mo31687a(a4));
                ahVar.setUid(aVar.mo31691b(a5));
                ahVar.setSecUid(aVar.mo31692c(a6));
                ahVar.setSilent(aVar.mo31687a(a7));
                ahVar.setSilentTime(aVar.mo31691b(a8));
                List<C19537ah> list = map.get(c);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(c, list);
                }
                list.add(ahVar);
            }
        }
    }

    /* renamed from: com.bytedance.im.core.internal.a.e$a */
    public enum EnumC19770a {
        COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
        COLUMN_SORT_ORDER("sort_order", "INTEGER"),
        COLUMN_ROLE("role", "INTEGER"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
        COLUMN_ALIAS("alias", "TEXT"),
        COLUMN_SEC_UID("sec_uid", "TEXT"),
        COLUMN_SILENT("silent", "INTEGER"),
        COLUMN_SILENT_TIME("silent_time", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22614);
        }

        private EnumC19770a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    public static String m37136a() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant(");
        EnumC19770a[] values = EnumC19770a.values();
        for (EnumC19770a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: d */
    public static boolean m37148d(String str) {
        C20002j.m37782c("IMConversationMemberDao deleteConversation, cid:".concat(String.valueOf(str)));
        boolean a = C19742b.m36977a("participant", EnumC19770a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
        if (a) {
            C19745a.m36988a();
            C19483d.m36365a();
        }
        return a;
    }

    /* renamed from: a */
    private static ContentValues m37133a(C19537ah ahVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC19770a.COLUMN_USER_ID.key, Long.valueOf(ahVar.getUid()));
        contentValues.put(EnumC19770a.COLUMN_ALIAS.key, ahVar.getAlias());
        contentValues.put(EnumC19770a.COLUMN_CONVERSATION_ID.key, ahVar.getConversationId());
        contentValues.put(EnumC19770a.COLUMN_ROLE.key, Integer.valueOf(ahVar.getRole()));
        contentValues.put(EnumC19770a.COLUMN_SORT_ORDER.key, Long.valueOf(ahVar.getSortOrder()));
        contentValues.put(EnumC19770a.COLUMN_SEC_UID.key, ahVar.getSecUid());
        contentValues.put(EnumC19770a.COLUMN_SILENT.key, Integer.valueOf(ahVar.getSilent()));
        contentValues.put(EnumC19770a.COLUMN_SILENT_TIME.key, Long.valueOf(ahVar.getSilentTime()));
        return contentValues;
    }

    /* renamed from: a */
    private static C19537ah m37134a(AbstractC19751a aVar) {
        C19537ah ahVar = new C19537ah();
        ahVar.setAlias(aVar.mo31692c(aVar.mo31688a(EnumC19770a.COLUMN_ALIAS.key)));
        ahVar.setConversationId(aVar.mo31692c(aVar.mo31688a(EnumC19770a.COLUMN_CONVERSATION_ID.key)));
        ahVar.setRole(aVar.mo31687a(aVar.mo31688a(EnumC19770a.COLUMN_ROLE.key)));
        ahVar.setSortOrder((long) aVar.mo31687a(aVar.mo31688a(EnumC19770a.COLUMN_SORT_ORDER.key)));
        ahVar.setUid(aVar.mo31691b(aVar.mo31688a(EnumC19770a.COLUMN_USER_ID.key)));
        ahVar.setSecUid(aVar.mo31692c(aVar.mo31688a(EnumC19770a.COLUMN_SEC_UID.key)));
        ahVar.setSilent(aVar.mo31687a(aVar.mo31688a(EnumC19770a.COLUMN_SILENT.key)));
        ahVar.setSilentTime(aVar.mo31691b(aVar.mo31688a(EnumC19770a.COLUMN_SILENT_TIME.key)));
        return ahVar;
    }

    /* renamed from: b */
    public static List<C19537ah> m37143b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from participant where " + EnumC19770a.COLUMN_CONVERSATION_ID.key + "=? order by " + EnumC19770a.COLUMN_SORT_ORDER.key, new String[]{str});
            while (aVar.mo31694d()) {
                arrayList.add(m37134a(aVar));
            }
            C19699c.m36829a().mo31653a("getMemberList", currentTimeMillis);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationMemberDao getMemberList", e);
            e.printStackTrace();
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: c */
    public static long m37147c(String str) {
        C20002j.m37782c("IMConversationMemberDao getLargestOrder, cid:".concat(String.valueOf(str)));
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from participant where " + EnumC19770a.COLUMN_CONVERSATION_ID.key + "=? order by " + EnumC19770a.COLUMN_SORT_ORDER.key + " desc limit 1", new String[]{str});
            if (aVar != null && aVar.mo31693c()) {
                long b = aVar.mo31691b(aVar.mo31688a(EnumC19770a.COLUMN_SORT_ORDER.key));
                C19741a.m36961a(aVar);
                return b;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMConversationMemberDao getLargestOrder", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return 0;
    }

    /* renamed from: b */
    public static Map<String, List<C19537ah>> m37144b(List<String> list) {
        if (list.size() <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        int i = C19483d.m36365a().mo31141b().f46237ab.batchQueryEnableAndQueryLimit;
        String str = "select * from participant where " + EnumC19770a.COLUMN_CONVERSATION_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        AbstractC19751a aVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i2 == i - 1 || i3 == list.size() - 1) {
                sb.append("'").append(list.get(i3)).append("') order by ").append(EnumC19770a.COLUMN_SORT_ORDER.key);
                try {
                    aVar = C19742b.m36973a(sb.toString(), (String[]) null);
                    m37140a(aVar, hashMap);
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "IMConversationMemberDao getMembersMap", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                } catch (Throwable th) {
                    C19741a.m36961a(aVar);
                    throw th;
                }
                C19741a.m36961a(aVar);
                sb = new StringBuilder(str);
                i2 = 0;
            } else {
                i2++;
                sb.append("'").append(list.get(i3)).append("',");
            }
        }
        C19699c.m36829a().mo31653a("getMembersMap", currentTimeMillis);
        return hashMap;
    }

    /* renamed from: a */
    public static List<Long> m37137a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from participant where " + EnumC19770a.COLUMN_CONVERSATION_ID.key + "=? order by " + EnumC19770a.COLUMN_SORT_ORDER.key, new String[]{str});
            int i = -1;
            while (aVar.mo31694d()) {
                if (i < 0) {
                    i = aVar.mo31688a(EnumC19770a.COLUMN_USER_ID.key);
                }
                arrayList.add(Long.valueOf(aVar.mo31691b(i)));
            }
            C19699c.m36829a().mo31653a("getMemberId", currentTimeMillis);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationMemberDao getMemberId", e);
            e.printStackTrace();
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: b */
    public static int m37142b(String str, List<Long> list) {
        int i;
        Exception e;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        C19742b.m36974a("IMConversationMemberDao.removeMember(String,List)");
        try {
            i = 0;
            for (Long l : list) {
                try {
                    if (C19742b.m36977a("participant", EnumC19770a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19770a.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(l)})) {
                        i++;
                        String.valueOf(l);
                        C19747b.m36992a();
                    }
                } catch (Exception e2) {
                    e = e2;
                    C19512f.m36457b("imsdk", "IMConversationMemberDao removeMember", e);
                    C19742b.m36975a("IMConversationMemberDao.removeMember(String,List)", false);
                    return i;
                }
            }
            C19742b.m36975a("IMConversationMemberDao.removeMember(String,List)", true);
        } catch (Exception e3) {
            e = e3;
            i = 0;
            C19512f.m36457b("imsdk", "IMConversationMemberDao removeMember", e);
            C19742b.m36975a("IMConversationMemberDao.removeMember(String,List)", false);
            return i;
        }
        return i;
    }

    /* renamed from: c */
    public static int m37146c(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Long l : list) {
            if (C19742b.m36977a("participant", EnumC19770a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19770a.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(l)})) {
                i++;
                String.valueOf(l);
                C19747b.m36992a();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static C19537ah m37135a(String str, String str2) {
        Throwable th;
        C19537ah ahVar;
        Exception e;
        AbstractC19751a aVar = null;
        C19537ah ahVar2 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        C20002j.m37782c("IMConversationMemberDao queryMember, cid:" + str + ", uid:" + str2);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AbstractC19751a a = C19742b.m36973a("select * from participant where " + EnumC19770a.COLUMN_CONVERSATION_ID.key + "=?  and " + EnumC19770a.COLUMN_USER_ID.key + "=?", new String[]{str, str2});
            while (a.mo31694d()) {
                try {
                    ahVar2 = m37134a(a);
                } catch (Exception e2) {
                    e = e2;
                    ahVar = ahVar2;
                    aVar = a;
                    try {
                        C19512f.m36457b("imsdk", "IMConversationMemberDao queryMember", e);
                        e.printStackTrace();
                        C19510e.m36439a(e);
                        C19741a.m36961a(aVar);
                        return ahVar;
                    } catch (Throwable th2) {
                        th = th2;
                        C19741a.m36961a(aVar);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aVar = a;
                    C19741a.m36961a(aVar);
                    throw th;
                }
            }
            C19699c.m36829a().mo31653a("queryMember", currentTimeMillis);
            C19741a.m36961a(a);
            return ahVar2;
        } catch (Exception e3) {
            e = e3;
            ahVar = null;
            C19512f.m36457b("imsdk", "IMConversationMemberDao queryMember", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return ahVar;
        }
    }

    /* renamed from: b */
    public static boolean m37145b(String str, int i, List<C19537ah> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        C20002j.m37782c("IMConversationMemberDao insertOrUpdateMemberNoTrans, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<C19537ah> arrayList = new ArrayList();
        for (C19537ah ahVar : list) {
            if (ahVar != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC19770a.COLUMN_SORT_ORDER.key, Long.valueOf(ahVar.getSortOrder()));
                contentValues.put(EnumC19770a.COLUMN_ROLE.key, Integer.valueOf(ahVar.getRole()));
                contentValues.put(EnumC19770a.COLUMN_ALIAS.key, ahVar.getAlias());
                contentValues.put(EnumC19770a.COLUMN_SEC_UID.key, ahVar.getSecUid());
                contentValues.put(EnumC19770a.COLUMN_SILENT.key, Integer.valueOf(ahVar.getSilent()));
                contentValues.put(EnumC19770a.COLUMN_SILENT_TIME.key, Long.valueOf(ahVar.getSilentTime()));
                if (C19742b.m36971a("participant", contentValues, EnumC19770a.COLUMN_USER_ID.key + "=? AND " + EnumC19770a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{String.valueOf(ahVar.getUid()), str}) <= 0) {
                    ahVar.setConversationType(i);
                    arrayList.add(ahVar);
                } else {
                    C19745a.m36988a();
                    C19483d.m36365a();
                }
            }
        }
        for (C19537ah ahVar2 : arrayList) {
            if (C19742b.m36972a("participant", m37133a(ahVar2)) > 0) {
                C19745a.m36988a();
                C19483d.m36365a();
            }
        }
        C19699c.m36829a().mo31653a("insertOrUpdateMemberNoTrans", currentTimeMillis);
        C20014q.m37816a().mo31909b(list);
        return true;
    }
}
