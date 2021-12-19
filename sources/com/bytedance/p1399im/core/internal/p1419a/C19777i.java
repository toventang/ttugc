package com.bytedance.p1399im.core.internal.p1419a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1421b.C19745a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1430c.C19946a;
import com.bytedance.p1399im.core.internal.utils.C19995d;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20043t;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19590ap;
import com.bytedance.p1399im.core.p1415g.C19699c;
import com.bytedance.p1399im.core.p1416h.C19703b;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.i */
public final class C19777i {
    static {
        Covode.recordClassIndex(22621);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x03c5, code lost:
        if (r0 > 0) goto L_0x03c7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m37185a(com.bytedance.p1399im.core.p1408d.C19538ai r16, boolean r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 1113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.C19777i.m37185a(com.bytedance.im.core.d.ai, boolean, boolean):boolean");
    }

    /* renamed from: a */
    public static boolean m37184a(C19538ai aiVar) {
        boolean z = false;
        if (aiVar != null && !aiVar.invalid()) {
            C20043t.m37921a().mo31917a(aiVar);
            long currentTimeMillis = System.currentTimeMillis();
            m37190b(aiVar);
            long a = C19742b.m36972a("msg", m37194c(aiVar));
            aiVar.setRowId(a);
            C19775h.m37167a(aiVar);
            if (a >= 0) {
                z = true;
                C19703b.m36846a();
                if (aiVar.getDeleted() == 0) {
                    C19745a.m36988a();
                    C19483d.m36365a();
                }
            }
            Map<String, List<C19536ag>> propertyItemListMap = aiVar.getPropertyItemListMap();
            if (propertyItemListMap != null && !propertyItemListMap.isEmpty()) {
                C19784k.m37225b(aiVar);
            }
            if (z && aiVar.getAttachments() != null) {
                z = C19739a.m36953a(aiVar.getAttachments());
            }
            C19699c.m36829a().mo31653a("insertMessage", currentTimeMillis);
            C20002j.m37782c("IMMsgDao insertMessage, svrId:" + aiVar.getMsgId() + ", uuid:" + aiVar.getUuid() + ", result:" + z);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m37186a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean b = C19742b.m36979b("update msg set " + EnumC19780a.COLUMN_DELETED.key + "=1 where " + EnumC19780a.COLUMN_MSG_ID.key + "=\"" + str + "\"");
        if (b) {
            C19775h.m37168a(str);
            C19745a.m36988a();
            C19483d.m36365a();
        }
        C20002j.m37782c("IMMsgDao deleteMsg, uuid:" + str + ", result:" + b);
        return b;
    }

    /* renamed from: a */
    public static List<C19538ai> m37180a(List<String> list, long j) {
        AbstractC19751a aVar = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            aVar = C19742b.m36973a("select rowid,* from msg where " + EnumC19780a.COLUMN_MSG_ID.key + " in ('" + C19996e.m37751a(list, "','") + "')  AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + ">? order by " + EnumC19780a.COLUMN_ORDER_INDEX.key + " desc, " + EnumC19780a.COLUMN_CREATE_TIME.key + " desc", new String[]{"0", "0", String.valueOf(j)});
            if (C19483d.m36365a().mo31141b().f46258aw) {
                m37181a(aVar, arrayList);
            } else {
                while (aVar.mo31694d()) {
                    arrayList.add(m37173a(aVar));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao getMsgList", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: a */
    public static void m37183a(String str, List<Long> list) {
        if (!C19995d.m37744a(list)) {
            AbstractC19751a aVar = null;
            try {
                aVar = C19742b.m36973a("select * from msg where " + EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key + " in('" + C19996e.m37751a(list, "','") + "') AND " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
                int a = aVar.mo31688a(EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key);
                while (aVar.mo31694d()) {
                    list.remove(Long.valueOf(aVar.mo31691b(a)));
                }
            } catch (Exception e) {
                e.printStackTrace();
                C19512f.m36457b("imsdk", "IMMsgDao checkMissedMsgIndexV2List", e);
                C19510e.m36439a(e);
            } finally {
                C19741a.m36961a(aVar);
            }
        }
    }

    /* renamed from: a */
    public static List<Long> m37179a(String str, C19590ap apVar) {
        AbstractC19751a aVar = null;
        if (TextUtils.isEmpty(str) || !apVar.isValid()) {
            C19512f.m36457b("imsdk", "IMMsgDao getIndexV2ListByRange, invalid cid:" + str + ", range:" + apVar, (Throwable) null);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            aVar = C19742b.m36973a("select * from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key + ">=? AND " + EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key + "<=? order by " + EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key + " asc", new String[]{str, String.valueOf(apVar.start), String.valueOf(apVar.end)});
            int a = aVar.mo31688a(EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key);
            while (aVar.mo31694d()) {
                long b = aVar.mo31691b(a);
                if (b >= apVar.start && b <= apVar.end) {
                    arrayList.add(Long.valueOf(b));
                }
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao getIndexV2ListByRange", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: a */
    public static List<C19538ai> m37177a(String str, long j, long j2, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        AbstractC19751a aVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = "select rowid,* from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + "<? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + ">=?";
            if (iArr != null && iArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    sb.append(iArr[i2]);
                    if (i2 < iArr.length - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                str2 = str2 + " AND " + EnumC19780a.COLUMN_MSG_TYPE.key + " IN " + sb.toString();
            }
            aVar = C19742b.m36973a(str2 + " order by " + EnumC19780a.COLUMN_ORDER_INDEX.key + " desc, " + EnumC19780a.COLUMN_CREATE_TIME.key + " desc limit " + i, new String[]{str, "0", "0", String.valueOf(j), String.valueOf(j2)});
            if (C19483d.m36365a().mo31141b().f46258aw) {
                m37181a(aVar, arrayList);
            } else {
                while (aVar.mo31694d()) {
                    arrayList.add(m37173a(aVar));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao queryOlderMessageList", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        C20002j.m37782c("IMMsgDao queryOlderMessageList, cid:" + str + ", index:" + j + ", minIndex:" + j2 + ", limit:" + i + ", count:" + arrayList.size());
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0215 A[EDGE_INSN: B:43:0x0215->B:25:0x0215 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m37182a(com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a r32, java.util.List<com.bytedance.p1399im.core.p1408d.C19538ai> r33, boolean r34) {
        /*
        // Method dump skipped, instructions count: 628
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.C19777i.m37182a(com.bytedance.im.core.internal.a.c.a, java.util.List, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.im.core.internal.a.i$b */
    public enum EnumC19781b {
        FLAG_ATTACHMENT(1),
        FLAG_MSG_PROPERTY(2);
        

        /* renamed from: c */
        public long f46962c;

        static {
            Covode.recordClassIndex(22625);
        }

        private EnumC19781b(long j) {
            this.f46962c = j;
        }
    }

    /* renamed from: a */
    public static int m37170a() {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        try {
            aVar = C19742b.m36973a("select * from msg", (String[]) null);
            try {
                int b = aVar.mo31690b();
                C19741a.m36961a(aVar);
                return b;
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMMsgDao getAllMsgCount", e);
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    C19512f.m36457b("imsdk", "IMMsgDao getAllMsgCount 0", (Throwable) null);
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    C19741a.m36961a(aVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            C19512f.m36457b("imsdk", "IMMsgDao getAllMsgCount", e);
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            C19512f.m36457b("imsdk", "IMMsgDao getAllMsgCount 0", (Throwable) null);
            return 0;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
    }

    /* renamed from: com.bytedance.im.core.internal.a.i$a */
    public enum EnumC19780a {
        COLUMN_MSG_ID("msg_uuid", "TEXT PRIMARY KEY"),
        COLUMN_SERVER_ID("msg_server_id", "BIGINT"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
        COLUMN_CONVERSATION_SHORT_ID("conversation_short_id", "BIGINT"),
        COLUMN_CONVERSATION_TYPE("conversation_type", "INTEGER"),
        COLUMN_MSG_TYPE(StringSet.type, "INTEGER"),
        COLUMN_INNER_INDEX("index_in_conversation", "BIGINT"),
        COLUMN_ORDER_INDEX("order_index", "BIGINT"),
        COLUMN_STATUS("status", "INTEGER"),
        COLUMN_NET_STATUS("net_status", "INTEGER"),
        COLUMN_VERSION("version", "INTEGER"),
        COLUMN_DELETED("deleted", "INTEGER"),
        COLUMN_CREATE_TIME("created_time", "INTEGER"),
        COLUMN_SENDER("sender", "BIGINT"),
        COLUMN_CONTENT("content", "TEXT"),
        COLUMN_EXT("ext", "TEXT"),
        COLUMN_LOCAL_INFO("local_info", "TEXT"),
        COLUMN_READ_STATUS("read_status", "INTEGER"),
        COLUMN_SEC_SENDER("sec_sender", "TEXT"),
        COLUMN_PROPERTY_LIST("property_list", "TEXT"),
        COLUMN_INDEX_IN_CONVERSATION_V2("index_in_conversation_v2", "BIGINT default -1"),
        COLUMN_TABLE_FLAG("table_flag", "BIGINT default 0");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22624);
        }

        private EnumC19780a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: b */
    public static boolean m37191b() {
        List<String> a = C19739a.m36950a();
        List<String> b = C19784k.m37224b();
        Map<String, Long> d = m37199d();
        HashMap hashMap = null;
        if (d != null && a != null && b != null) {
            HashMap hashMap2 = new HashMap();
            if (!d.isEmpty() && (!a.isEmpty() || !b.isEmpty())) {
                Iterator<Map.Entry<String, Long>> it = d.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, Long> next = it.next();
                    String key = next.getKey();
                    long longValue = next.getValue().longValue();
                    if (!a.contains(key)) {
                        longValue &= EnumC19781b.FLAG_ATTACHMENT.f46962c ^ -1;
                        hashMap2.put(key, Long.valueOf(longValue));
                    } else if (!C19996e.m37752a(longValue, EnumC19781b.FLAG_ATTACHMENT.f46962c)) {
                        longValue |= EnumC19781b.FLAG_ATTACHMENT.f46962c;
                        hashMap2.put(key, Long.valueOf(longValue));
                    }
                    if (!b.contains(key)) {
                        hashMap2.put(key, Long.valueOf(longValue & (-1 ^ EnumC19781b.FLAG_MSG_PROPERTY.f46962c)));
                    } else if (!C19996e.m37752a(longValue, EnumC19781b.FLAG_MSG_PROPERTY.f46962c)) {
                        hashMap2.put(key, Long.valueOf(longValue | EnumC19781b.FLAG_MSG_PROPERTY.f46962c));
                    }
                    if (!C19946a.m37585b()) {
                        break;
                    }
                }
            }
            hashMap = hashMap2;
        }
        if (hashMap == null) {
            return false;
        }
        boolean z = true;
        if (hashMap.isEmpty()) {
            return true;
        }
        try {
            C19742b.m36974a("IMMsgDao updateTableFlag");
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC19780a.COLUMN_TABLE_FLAG.key, (Long) entry.getValue());
                if (C19742b.m36971a("msg", contentValues, EnumC19780a.COLUMN_MSG_ID.key + "=?", new String[]{(String) entry.getKey()}) >= 0) {
                    if (!C19946a.m37585b()) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z = false;
            C19742b.m36975a("IMMsgDao updateTableFlag", z);
            return z;
        } catch (Exception e) {
            C19742b.m36975a("IMMsgDao updateTableFlag", false);
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao updateTableFlag", e);
            C19510e.m36439a(e);
            return false;
        }
    }

    /* renamed from: c */
    public static String m37196c() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg(");
        EnumC19780a[] values = EnumC19780a.values();
        for (EnumC19780a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: d */
    private static Map<String, Long> m37199d() {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        HashMap hashMap = new HashMap();
        AbstractC19751a aVar2 = null;
        try {
            aVar = C19742b.m36973a("SELECT rowId," + EnumC19780a.COLUMN_MSG_ID.key + "," + EnumC19780a.COLUMN_TABLE_FLAG.key + " FROM msg", (String[]) null);
            if (aVar != null) {
                try {
                    int a = aVar.mo31688a(EnumC19780a.COLUMN_MSG_ID.key);
                    int a2 = aVar.mo31688a(EnumC19780a.COLUMN_TABLE_FLAG.key);
                    while (true) {
                        if (!aVar.mo31694d()) {
                            break;
                        }
                        hashMap.put(aVar.mo31692c(a), Long.valueOf(aVar.mo31691b(a2)));
                        if (!C19946a.m37585b()) {
                            hashMap = null;
                            break;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        C19512f.m36457b("imsdk", "IMMsgDao getOldFlagMap", e);
                        C19510e.m36439a(e);
                        C19741a.m36961a(aVar);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        C19741a.m36961a(aVar2);
                        throw th;
                    }
                }
            }
            C19741a.m36961a(aVar);
            return hashMap;
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao getOldFlagMap", e);
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
    }

    /* renamed from: b */
    private static void m37190b(C19538ai aiVar) {
        if (aiVar != null) {
            long j = 0;
            if (aiVar.getAttachments() != null && !aiVar.getAttachments().isEmpty()) {
                j = 0 | EnumC19781b.FLAG_ATTACHMENT.f46962c;
            }
            if (aiVar.getPropertyItemListMap() != null && !aiVar.getPropertyItemListMap().isEmpty()) {
                j |= EnumC19781b.FLAG_MSG_PROPERTY.f46962c;
            }
            aiVar.setTableFlag(j);
        }
    }

    /* renamed from: j */
    public static boolean m37205j(String str) {
        return C19742b.m36979b("update msg set " + EnumC19780a.COLUMN_READ_STATUS.key + "=1 where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "='" + str + "'");
    }

    /* renamed from: a */
    public static C19538ai m37172a(long j) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar2 = null;
        try {
            aVar = C19742b.m36973a("select rowid,* from msg where " + EnumC19780a.COLUMN_SERVER_ID.key + "=?", new String[]{String.valueOf(j)});
            try {
                if (aVar.mo31693c()) {
                    C19538ai a = m37173a(aVar);
                    C19699c.m36829a().mo31653a("getMsg", currentTimeMillis);
                    C19741a.m36961a(aVar);
                    return a;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMMsgDao getMsg", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    C19741a.m36961a(aVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            C19512f.m36457b("imsdk", "IMMsgDao getMsg", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C19741a.m36961a(aVar);
        return null;
    }

    /* renamed from: c */
    public static C19538ai m37195c(String str) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aVar = C19742b.m36973a("select rowid,* from msg where " + EnumC19780a.COLUMN_MSG_ID.key + "=?", new String[]{str});
            if (aVar != null) {
                try {
                    if (aVar.mo31693c()) {
                        C19538ai a = m37173a(aVar);
                        C19699c.m36829a().mo31653a("getMsg", currentTimeMillis);
                        C19741a.m36961a(aVar);
                        return a;
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C19512f.m36457b("imsdk", "IMMsgDao getMsg", e);
                        e.printStackTrace();
                        C19510e.m36439a(e);
                        C19741a.m36961a(aVar);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        C19741a.m36961a(aVar2);
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            C19512f.m36457b("imsdk", "IMMsgDao getMsg", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C19741a.m36961a(aVar);
        return null;
    }

    /* renamed from: g */
    public static long m37202g(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select " + EnumC19780a.COLUMN_ORDER_INDEX.key + " from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? order by " + EnumC19780a.COLUMN_ORDER_INDEX.key + " asc limit 1", new String[]{str});
            if (aVar != null && aVar.mo31693c()) {
                long b = aVar.mo31691b(aVar.mo31688a(EnumC19780a.COLUMN_ORDER_INDEX.key));
                C19741a.m36961a(aVar);
                return b;
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao getMinOrderIndex", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return 0;
    }

    /* renamed from: i */
    public static boolean m37204i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select rowid,* from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=? limit 1", new String[]{str, "0", "0"});
            if (aVar.mo31693c()) {
                C19741a.m36961a(aVar);
                return true;
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao hasMsgByConversation", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return false;
    }

    /* renamed from: k */
    private static long m37206k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select rowid from msg where " + EnumC19780a.COLUMN_MSG_ID.key + "=?", new String[]{str});
            if (aVar != null && aVar.mo31693c()) {
                long b = aVar.mo31691b(aVar.mo31688a("rowid"));
                C19741a.m36961a(aVar);
                return b;
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao getRowid", e);
            e.printStackTrace();
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return -1;
    }

    /* renamed from: d */
    public static long m37197d(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select " + EnumC19780a.COLUMN_INNER_INDEX.key + " from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + ">? order by " + EnumC19780a.COLUMN_INNER_INDEX.key + " asc, " + EnumC19780a.COLUMN_CREATE_TIME.key + " asc limit 1", new String[]{str, "10000000"});
            if (aVar.mo31693c()) {
                j = aVar.mo31691b(aVar.mo31688a(EnumC19780a.COLUMN_INNER_INDEX.key));
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao getLegalOldestIndex", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        C20002j.m37782c("IMMsgDao getLegalOldestIndex, cid:" + str + ", index:" + j);
        return j;
    }

    /* renamed from: e */
    public static long m37200e(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? order by " + EnumC19780a.COLUMN_ORDER_INDEX.key + " desc, " + EnumC19780a.COLUMN_CREATE_TIME.key + " desc limit 1", new String[]{str});
            if (aVar != null && aVar.mo31693c()) {
                j = aVar.mo31691b(aVar.mo31688a(EnumC19780a.COLUMN_INNER_INDEX.key));
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao getLastMsgIndex", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        C20002j.m37782c("IMMsgDao getLastMsgIndex, cid:" + str + ", index:" + j);
        return j;
    }

    /* renamed from: f */
    public static long m37201f(String str) {
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select max(" + EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key + ") as " + EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key + " from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
            if (aVar != null && aVar.mo31693c()) {
                j = aVar.mo31691b(aVar.mo31688a(EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key));
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao getMaxIndexV2", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        C20002j.m37782c("IMMsgDao getMaxIndexV2, cid:" + str + ", indexV2:" + j);
        return j;
    }

    /* renamed from: h */
    public static C19538ai m37203h(String str) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aVar = C19742b.m36973a("select rowid,* from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=? order by " + EnumC19780a.COLUMN_ORDER_INDEX.key + " desc, " + EnumC19780a.COLUMN_CREATE_TIME.key + " desc limit 1", new String[]{str, "0", "0"});
            try {
                if (aVar.mo31693c()) {
                    C19538ai a = m37173a(aVar);
                    C19699c.m36829a().mo31653a("getLastShowMsg", currentTimeMillis);
                    C19741a.m36961a(aVar);
                    return a;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMMsgDao getLastShowMsg", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    C19741a.m36961a(aVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            C19512f.m36457b("imsdk", "IMMsgDao getLastShowMsg", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C19741a.m36961a(aVar);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x015a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.p1399im.core.p1408d.C19538ai m37173a(com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a r6) {
        /*
        // Method dump skipped, instructions count: 461
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.C19777i.m37173a(com.bytedance.im.core.internal.a.c.a):com.bytedance.im.core.d.ai");
    }

    /* renamed from: c */
    private static ContentValues m37194c(C19538ai aiVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC19780a.COLUMN_MSG_ID.key, aiVar.getUuid());
        contentValues.put(EnumC19780a.COLUMN_SERVER_ID.key, Long.valueOf(aiVar.getMsgId()));
        contentValues.put(EnumC19780a.COLUMN_CONVERSATION_ID.key, aiVar.getConversationId());
        contentValues.put(EnumC19780a.COLUMN_CONVERSATION_SHORT_ID.key, Long.valueOf(aiVar.getConversationShortId()));
        contentValues.put(EnumC19780a.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(aiVar.getConversationType()));
        contentValues.put(EnumC19780a.COLUMN_MSG_TYPE.key, Integer.valueOf(aiVar.getMsgType()));
        contentValues.put(EnumC19780a.COLUMN_INNER_INDEX.key, Long.valueOf(aiVar.getIndex()));
        contentValues.put(EnumC19780a.COLUMN_ORDER_INDEX.key, Long.valueOf(aiVar.getOrderIndex()));
        contentValues.put(EnumC19780a.COLUMN_STATUS.key, Integer.valueOf(aiVar.getMsgStatus()));
        contentValues.put(EnumC19780a.COLUMN_NET_STATUS.key, Integer.valueOf(aiVar.getSvrStatus()));
        contentValues.put(EnumC19780a.COLUMN_VERSION.key, Long.valueOf(aiVar.getVersion()));
        contentValues.put(EnumC19780a.COLUMN_DELETED.key, Integer.valueOf(aiVar.getDeleted()));
        contentValues.put(EnumC19780a.COLUMN_CREATE_TIME.key, Long.valueOf(aiVar.getCreatedAt()));
        contentValues.put(EnumC19780a.COLUMN_SENDER.key, Long.valueOf(aiVar.getSender()));
        contentValues.put(EnumC19780a.COLUMN_CONTENT.key, aiVar.getContent());
        contentValues.put(EnumC19780a.COLUMN_EXT.key, aiVar.getExtStr());
        contentValues.put(EnumC19780a.COLUMN_LOCAL_INFO.key, aiVar.getLocalExtStr());
        contentValues.put(EnumC19780a.COLUMN_READ_STATUS.key, Integer.valueOf(aiVar.getReadStatus()));
        contentValues.put(EnumC19780a.COLUMN_SEC_SENDER.key, aiVar.getSecSender());
        contentValues.put(EnumC19780a.COLUMN_PROPERTY_LIST.key, "");
        contentValues.put(EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key, Long.valueOf(aiVar.getIndexInConversationV2()));
        contentValues.put(EnumC19780a.COLUMN_TABLE_FLAG.key, Long.valueOf(aiVar.getTableFlag()));
        return contentValues;
    }

    /* renamed from: b */
    public static boolean m37192b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = C19742b.m36977a("msg", EnumC19780a.COLUMN_MSG_TYPE.key + "=?", new String[]{str});
        C19699c.m36829a().mo31653a("deleteMsgByType", currentTimeMillis);
        return a;
    }

    /* renamed from: a */
    private static void m37181a(AbstractC19751a aVar, List<C19538ai> list) {
        m37182a(aVar, list, true);
    }

    /* renamed from: b */
    public static long m37188b(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select " + EnumC19780a.COLUMN_INNER_INDEX.key + " from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key + "=?", new String[]{str, String.valueOf(j)});
            if (aVar != null && aVar.mo31693c()) {
                long b = aVar.mo31691b(aVar.mo31688a(EnumC19780a.COLUMN_INNER_INDEX.key));
                C19741a.m36961a(aVar);
                return b;
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao getIndexByIndexV2", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return 0;
    }

    /* renamed from: c */
    public static long m37193c(String str, long j) {
        C20002j.m37782c("IMMsgDao getOrderIndex, convId:" + str + ", mgsIndex:" + j);
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select " + EnumC19780a.COLUMN_ORDER_INDEX.key + " from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + "=? order by " + EnumC19780a.COLUMN_ORDER_INDEX.key + " desc, " + EnumC19780a.COLUMN_CREATE_TIME.key + " desc limit 1", new String[]{str, "0", "0", String.valueOf(j)});
            if (aVar.mo31693c()) {
                long b = aVar.mo31691b(aVar.mo31688a(EnumC19780a.COLUMN_ORDER_INDEX.key));
                C19741a.m36961a(aVar);
                return b;
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgDao getOrderIndex", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return 0;
    }

    /* renamed from: d */
    public static long m37198d(String str, long j) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar2 = null;
        try {
            aVar = C19742b.m36973a("select * from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + ">? AND " + EnumC19780a.COLUMN_SENDER.key + "!=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=? AND " + EnumC19780a.COLUMN_READ_STATUS.key + "=?", new String[]{str, "0", String.valueOf(j), String.valueOf(C19483d.m36365a().f46157b.mo27953a()), "0", "0"});
            try {
                int b = aVar.mo31690b();
                C19699c.m36829a().mo31653a("computeUnreadMsgCount", currentTimeMillis);
                long j2 = (long) b;
                C19741a.m36961a(aVar);
                return j2;
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    C19512f.m36457b("imsdk", "IMMsgDao computeUnreadMsgCount error", (Throwable) null);
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    C20002j.m37782c("IMMsgDao computeUnreadMsgCount:0, cid:".concat(String.valueOf(str)));
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    C19741a.m36961a(aVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao computeUnreadMsgCount error", (Throwable) null);
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            C20002j.m37782c("IMMsgDao computeUnreadMsgCount:0, cid:".concat(String.valueOf(str)));
            return 0;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
    }

    /* renamed from: a */
    public static C19538ai m37174a(String str, long j) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        if (j <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aVar = C19742b.m36973a("select rowid,* from msg where " + EnumC19780a.COLUMN_INNER_INDEX.key + "=? and " + EnumC19780a.COLUMN_CONVERSATION_ID.key + " =?  and " + EnumC19780a.COLUMN_SERVER_ID.key + " >0 ", new String[]{String.valueOf(j), str});
            try {
                if (aVar.mo31693c()) {
                    C19538ai a = m37173a(aVar);
                    C19699c.m36829a().mo31653a("getMsg", currentTimeMillis);
                    C19741a.m36961a(aVar);
                    return a;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMMsgDao getMsg", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    C19741a.m36961a(aVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            C19512f.m36457b("imsdk", "IMMsgDao getMsg", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C19741a.m36961a(aVar);
        return null;
    }

    /* renamed from: a */
    public static List<C19538ai> m37175a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            aVar = C19742b.m36973a(("select rowid,* from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=?") + " order by " + EnumC19780a.COLUMN_ORDER_INDEX.key + " desc, " + EnumC19780a.COLUMN_CREATE_TIME.key + " desc limit " + i, new String[]{str, "0", "0"});
            if (C19483d.m36365a().mo31141b().f46258aw) {
                m37181a(aVar, arrayList);
            } else {
                while (aVar.mo31694d()) {
                    arrayList.add(m37173a(aVar));
                }
            }
            C19699c.m36829a().mo31653a("initMessageList", currentTimeMillis);
        } catch (Exception e) {
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao initMessageList", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        C20002j.m37782c("IMMsgDao initMessageList, cid:" + str + ", limit:" + i + ", count:" + arrayList.size());
        return arrayList;
    }

    /* renamed from: b */
    public static int m37187b(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + "<=? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + ">=?", new String[]{str, String.valueOf(j2), String.valueOf(j)});
            return aVar.mo31690b();
        } catch (Exception e) {
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao computeMsgCount", e);
            C19510e.m36439a(e);
            return -1;
        } finally {
            C19741a.m36961a(aVar);
        }
    }

    /* renamed from: a */
    public static long m37171a(String str, long j, long j2) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar2 = null;
        try {
            String str2 = "select * from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_INNER_INDEX.key + ">? AND " + EnumC19780a.COLUMN_INDEX_IN_CONVERSATION_V2.key + "<? AND " + EnumC19780a.COLUMN_SENDER.key + "!=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=? AND " + EnumC19780a.COLUMN_READ_STATUS.key + "=?";
            String[] strArr = new String[7];
            strArr[0] = str;
            strArr[1] = "0";
            strArr[2] = String.valueOf(j);
            if (j2 <= 0) {
                j2 = Long.MAX_VALUE;
            }
            strArr[3] = String.valueOf(j2);
            strArr[4] = String.valueOf(C19483d.m36365a().f46157b.mo27953a());
            strArr[5] = "0";
            strArr[6] = "0";
            aVar = C19742b.m36973a(str2, strArr);
            try {
                int b = aVar.mo31690b();
                C19699c.m36829a().mo31653a("computeUnreadMsgCount2", currentTimeMillis);
                long j3 = (long) b;
                C19741a.m36961a(aVar);
                return j3;
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    C19512f.m36457b("imsdk", "IMMsgDao computeUnreadMsgCount2 error", (Throwable) null);
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    C20002j.m37782c("IMMsgDao computeUnreadMsgCount2:0, cid:".concat(String.valueOf(str)));
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    C19741a.m36961a(aVar2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao computeUnreadMsgCount2 error", (Throwable) null);
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            C20002j.m37782c("IMMsgDao computeUnreadMsgCount2:0, cid:".concat(String.valueOf(str)));
            return 0;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
    }

    /* renamed from: a */
    public static List<C19538ai> m37176a(String str, long j, long j2, int i) {
        return m37178a(str, j, j2, i, null, true);
    }

    /* renamed from: a */
    public static List<C19538ai> m37178a(String str, long j, long j2, int i, int[] iArr, boolean z) {
        return m37189b(str, j, j2, i, iArr, z);
    }

    /* renamed from: b */
    private static List<C19538ai> m37189b(String str, long j, long j2, int i, int[] iArr, boolean z) {
        int i2 = i;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i2 <= 0) {
            i2 = 20;
        }
        AbstractC19751a aVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = (("select rowid,* from msg where " + EnumC19780a.COLUMN_CONVERSATION_ID.key + "=? AND " + EnumC19780a.COLUMN_DELETED.key + "=? AND " + EnumC19780a.COLUMN_NET_STATUS.key + "=?") + " AND " + EnumC19780a.COLUMN_INNER_INDEX.key + ">?") + " AND " + EnumC19780a.COLUMN_INNER_INDEX.key + "<=?";
            int i3 = 0;
            if (iArr != null && iArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    sb.append(iArr[i4]);
                    if (i4 < iArr.length - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                str2 = str2 + " AND " + EnumC19780a.COLUMN_MSG_TYPE.key + " IN " + sb.toString();
            }
            String str3 = str2 + " order by " + EnumC19780a.COLUMN_ORDER_INDEX.key + " asc, " + EnumC19780a.COLUMN_CREATE_TIME.key + " asc";
            if (z) {
                str3 = str3 + " limit " + i2;
            }
            aVar = C19742b.m36973a(str3, new String[]{str, "0", "0", String.valueOf(j), String.valueOf(j2)});
            if (C19483d.m36365a().mo31141b().f46258aw) {
                m37181a(aVar, arrayList);
                Collections.reverse(arrayList);
            } else {
                C19538ai[] aiVarArr = new C19538ai[aVar.mo31690b()];
                while (aVar.mo31694d()) {
                    aiVarArr[(aVar.mo31690b() - 1) - i3] = m37173a(aVar);
                    i3++;
                }
                arrayList.addAll(Arrays.asList(aiVarArr));
            }
        } catch (Exception e) {
            e.printStackTrace();
            C19512f.m36457b("imsdk", "IMMsgDao queryNewerMessageList", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        C20002j.m37782c("IMMsgDao queryNewerMessageList, cid:" + str + ", startIndex:" + j + ", limit:" + i2 + ", count:" + arrayList.size());
        return arrayList;
    }
}
