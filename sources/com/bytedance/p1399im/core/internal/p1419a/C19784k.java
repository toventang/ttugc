package com.bytedance.p1399im.core.internal.p1419a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1415g.C19699c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.k */
public final class C19784k {
    static {
        Covode.recordClassIndex(22628);
    }

    /* renamed from: a */
    public static Map<String, Map<String, List<C19536ag>>> m37220a(List<String> list) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar2 = null;
        try {
            String str = "select * from msg_property_new where " + EnumC19785a.COLUMN_MSG_UUID.key + " in (";
            for (int i = 0; i < list.size(); i++) {
                str = str + "?";
                if (i != list.size() - 1) {
                    str = str + ",";
                }
            }
            aVar = C19742b.m36973a((str + ")") + " order by " + EnumC19785a.COLUMN_CREATE_TIME.key + " asc", (String[]) list.toArray(new String[0]));
            try {
                for (C19536ag agVar : m37218a(aVar)) {
                    if (!(agVar == null || agVar.deleted == 1)) {
                        Map map = (Map) hashMap.get(agVar.msgUuid);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(agVar.msgUuid, map);
                        }
                        List list2 = (List) map.get(agVar.key);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            map.put(agVar.key, list2);
                        }
                        list2.add(agVar);
                    }
                }
                C19699c.m36829a().mo31653a("getMessagePropertiesMap", currentTimeMillis);
                C19741a.m36961a(aVar);
                return hashMap;
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMMsgPropertyDao getMessageProperties", e);
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
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                C19741a.m36961a(aVar2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            C19512f.m36457b("imsdk", "IMMsgPropertyDao getMessageProperties", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return null;
        } catch (Throwable th4) {
            th = th4;
            C19741a.m36961a(aVar2);
            throw th;
        }
    }

    /* renamed from: a */
    private static Map<String, List<C19536ag>> m37219a(String str) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar2 = null;
        try {
            aVar = C19742b.m36973a("select * from msg_property_new where " + EnumC19785a.COLUMN_MSG_UUID.key + "=? order by " + EnumC19785a.COLUMN_CREATE_TIME.key + " asc", new String[]{str});
            HashMap hashMap = null;
            while (aVar.mo31694d()) {
                try {
                    C19536ag b = m37223b(aVar);
                    if (!(b == null || b.deleted == 1)) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        List<C19536ag> list = hashMap.get(b.key);
                        if (list == null) {
                            list = new ArrayList<>();
                            hashMap.put(b.key, list);
                        }
                        list.add(b);
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C19512f.m36457b("imsdk", "IMMsgPropertyDao getMessageProperties", e);
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
            C19699c.m36829a().mo31653a("getMessageProperties", currentTimeMillis);
            C19741a.m36961a(aVar);
            return hashMap;
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            C19512f.m36457b("imsdk", "IMMsgPropertyDao getMessageProperties", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m37222a(AbstractC19766c cVar, C19536ag agVar) {
        if (cVar != null && agVar != null && !TextUtils.isEmpty(agVar.msgUuid)) {
            cVar.mo31725a(EnumC19785a.COLUMN_MSG_UUID.ordinal() + 1, C19996e.m37758b(agVar.msgUuid));
            cVar.mo31725a(EnumC19785a.COLUMN_CONVERSATION_ID.ordinal() + 1, C19996e.m37758b(agVar.conversationId));
            cVar.mo31725a(EnumC19785a.COLUMN_KEY.ordinal() + 1, C19996e.m37758b(agVar.key));
            cVar.mo31725a(EnumC19785a.COLUMN_IDEMPOTENT_ID.ordinal() + 1, C19996e.m37758b(agVar.idempotent_id));
            cVar.mo31724a(EnumC19785a.COLUMN_SENDER.ordinal() + 1, agVar.uid.longValue());
            cVar.mo31725a(EnumC19785a.COLUMN_SENDER_SEC.ordinal() + 1, C19996e.m37758b(agVar.sec_uid));
            cVar.mo31724a(EnumC19785a.COLUMN_CREATE_TIME.ordinal() + 1, agVar.create_time.longValue());
            cVar.mo31725a(EnumC19785a.COLUMN_VALUE.ordinal() + 1, C19996e.m37758b(agVar.value));
            cVar.mo31724a(EnumC19785a.COLUMN_DELETED.ordinal() + 1, (long) agVar.deleted);
            cVar.mo31724a(EnumC19785a.COLUMN_VERSION.ordinal() + 1, agVar.version);
            cVar.mo31724a(EnumC19785a.COLUMN_STATUS.ordinal() + 1, (long) agVar.status);
        }
    }

    /* renamed from: d */
    public static String m37227d() {
        return C19741a.m36960a(EnumC19785a.values().length);
    }

    /* renamed from: c */
    public static String m37226c() {
        return EnumC19785a.COLUMN_MSG_UUID.key + "=? and " + EnumC19785a.COLUMN_KEY.key + "=? and " + EnumC19785a.COLUMN_IDEMPOTENT_ID.key + "=?";
    }

    /* renamed from: b */
    public static List<String> m37224b() {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        ArrayList arrayList = new ArrayList();
        AbstractC19751a aVar2 = null;
        try {
            aVar = C19742b.m36973a("SELECT rowId," + EnumC19785a.COLUMN_MSG_UUID.key + " FROM msg_property_new", (String[]) null);
            try {
                int a = aVar.mo31688a(EnumC19785a.COLUMN_MSG_UUID.key);
                while (aVar.mo31694d()) {
                    arrayList.add(aVar.mo31692c(a));
                }
                C19741a.m36961a(aVar);
                return arrayList;
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMMsgPropertyDao  getUuidList ", e);
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
            C19512f.m36457b("imsdk", "IMMsgPropertyDao  getUuidList ", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
    }

    /* renamed from: com.bytedance.im.core.internal.a.k$a */
    public enum EnumC19785a {
        COLUMN_MSG_UUID("msg_uuid", "TEXT"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
        COLUMN_KEY("key", "TEXT"),
        COLUMN_IDEMPOTENT_ID("idempotent_id", "TEXT"),
        COLUMN_SENDER("sender", "INTEGER"),
        COLUMN_SENDER_SEC("sender_sec", "TEXT"),
        COLUMN_CREATE_TIME("create_time", "INTEGER"),
        COLUMN_VALUE("value", "TEXT"),
        COLUMN_DELETED("deleted", "INTEGER"),
        COLUMN_VERSION("version", "INTEGER"),
        COLUMN_STATUS("status", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22629);
        }

        private EnumC19785a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    public static String m37217a() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg_property_new(");
        EnumC19785a[] values = EnumC19785a.values();
        for (EnumC19785a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        sb.append("PRIMARY KEY(").append(EnumC19785a.COLUMN_MSG_UUID.key).append(",").append(EnumC19785a.COLUMN_KEY.key).append(",").append(EnumC19785a.COLUMN_IDEMPOTENT_ID.key).append("));");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m37221a(C19538ai aiVar) {
        if (aiVar != null) {
            aiVar.setPropertyItemListMap(m37219a(aiVar.getUuid()));
        }
    }

    /* renamed from: a */
    private static ContentValues m37214a(C19536ag agVar) {
        if (agVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC19785a.COLUMN_MSG_UUID.key, agVar.msgUuid);
        contentValues.put(EnumC19785a.COLUMN_CONVERSATION_ID.key, agVar.conversationId);
        contentValues.put(EnumC19785a.COLUMN_KEY.key, agVar.key);
        contentValues.put(EnumC19785a.COLUMN_IDEMPOTENT_ID.key, agVar.idempotent_id);
        contentValues.put(EnumC19785a.COLUMN_SENDER.key, agVar.uid);
        contentValues.put(EnumC19785a.COLUMN_SENDER_SEC.key, agVar.sec_uid);
        contentValues.put(EnumC19785a.COLUMN_CREATE_TIME.key, agVar.create_time);
        contentValues.put(EnumC19785a.COLUMN_VALUE.key, agVar.value);
        contentValues.put(EnumC19785a.COLUMN_DELETED.key, Integer.valueOf(agVar.deleted));
        contentValues.put(EnumC19785a.COLUMN_VERSION.key, Long.valueOf(agVar.version));
        contentValues.put(EnumC19785a.COLUMN_STATUS.key, Integer.valueOf(agVar.status));
        return contentValues;
    }

    /* renamed from: b */
    private static C19536ag m37223b(AbstractC19751a aVar) {
        if (aVar == null) {
            return null;
        }
        C19536ag agVar = new C19536ag();
        agVar.msgUuid = aVar.mo31692c(aVar.mo31688a(EnumC19785a.COLUMN_MSG_UUID.key));
        agVar.conversationId = aVar.mo31692c(aVar.mo31688a(EnumC19785a.COLUMN_CONVERSATION_ID.key));
        agVar.uid = Long.valueOf(aVar.mo31691b(aVar.mo31688a(EnumC19785a.COLUMN_SENDER.key)));
        agVar.sec_uid = aVar.mo31692c(aVar.mo31688a(EnumC19785a.COLUMN_SENDER_SEC.key));
        agVar.create_time = Long.valueOf(aVar.mo31691b(aVar.mo31688a(EnumC19785a.COLUMN_CREATE_TIME.key)));
        agVar.idempotent_id = aVar.mo31692c(aVar.mo31688a(EnumC19785a.COLUMN_IDEMPOTENT_ID.key));
        agVar.key = aVar.mo31692c(aVar.mo31688a(EnumC19785a.COLUMN_KEY.key));
        agVar.value = aVar.mo31692c(aVar.mo31688a(EnumC19785a.COLUMN_VALUE.key));
        agVar.version = aVar.mo31691b(aVar.mo31688a(EnumC19785a.COLUMN_VERSION.key));
        agVar.status = aVar.mo31687a(aVar.mo31688a(EnumC19785a.COLUMN_STATUS.key));
        agVar.deleted = aVar.mo31687a(aVar.mo31688a(EnumC19785a.COLUMN_DELETED.key));
        return agVar;
    }

    /* renamed from: b */
    public static void m37225b(C19538ai aiVar) {
        List<C19536ag> value;
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getUuid())) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean a = C19742b.m36976a();
            if (!a) {
                C19742b.m36974a("IMMsgPropertyDao.updateMessageProperty");
            }
            AbstractC19766c cVar = null;
            try {
                C19742b.m36979b("delete from msg_property_new where " + EnumC19785a.COLUMN_MSG_UUID.key + "='" + aiVar.getUuid() + "' and " + EnumC19785a.COLUMN_STATUS.key + "<>1 and " + EnumC19785a.COLUMN_STATUS.key + "<>4 and " + EnumC19785a.COLUMN_STATUS.key + "<>3");
                cVar = C19742b.m36981c("insert or ignore into msg_property_new values(" + m37227d() + ")");
                Map<String, List<C19536ag>> propertyItemListMap = aiVar.getPropertyItemListMap();
                if (propertyItemListMap != null && !propertyItemListMap.isEmpty()) {
                    for (Map.Entry<String, List<C19536ag>> entry : propertyItemListMap.entrySet()) {
                        String key = entry.getKey();
                        if (!(key == null || (value = entry.getValue()) == null)) {
                            for (C19536ag agVar : value) {
                                if (agVar != null) {
                                    agVar.msgUuid = aiVar.getUuid();
                                    agVar.conversationId = aiVar.getConversationId();
                                    agVar.key = key;
                                    if (C19483d.m36365a().mo31141b().f46220aB) {
                                        C19742b.m36972a("msg_property_new", m37214a(agVar));
                                    } else {
                                        m37222a(cVar, agVar);
                                        cVar.mo31726b();
                                    }
                                }
                            }
                        }
                    }
                }
                m37221a(aiVar);
                if (!a) {
                    C19742b.m36975a("IMMsgPropertyDao.updateMessageProperty", true);
                }
                C19699c.m36829a().mo31653a("updateMessageProperty", currentTimeMillis);
            } catch (Exception e) {
                C19512f.m36457b("imsdk", "IMMsgPropertyDao updateMessageProperty", e);
                e.printStackTrace();
                C19510e.m36439a(e);
                if (!a) {
                    C19742b.m36975a("IMMsgPropertyDao.updateMessageProperty", false);
                }
            } finally {
                C19741a.m36964a(cVar);
            }
        }
    }

    /* renamed from: a */
    private static List<C19536ag> m37218a(AbstractC19751a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int a = aVar.mo31688a(EnumC19785a.COLUMN_MSG_UUID.key);
        int a2 = aVar.mo31688a(EnumC19785a.COLUMN_CONVERSATION_ID.key);
        int a3 = aVar.mo31688a(EnumC19785a.COLUMN_SENDER.key);
        int a4 = aVar.mo31688a(EnumC19785a.COLUMN_SENDER_SEC.key);
        int a5 = aVar.mo31688a(EnumC19785a.COLUMN_CREATE_TIME.key);
        int a6 = aVar.mo31688a(EnumC19785a.COLUMN_IDEMPOTENT_ID.key);
        int a7 = aVar.mo31688a(EnumC19785a.COLUMN_KEY.key);
        int a8 = aVar.mo31688a(EnumC19785a.COLUMN_VALUE.key);
        int a9 = aVar.mo31688a(EnumC19785a.COLUMN_VERSION.key);
        int a10 = aVar.mo31688a(EnumC19785a.COLUMN_STATUS.key);
        int a11 = aVar.mo31688a(EnumC19785a.COLUMN_DELETED.key);
        while (aVar.mo31694d()) {
            C19536ag agVar = new C19536ag();
            agVar.msgUuid = aVar.mo31692c(a);
            agVar.conversationId = aVar.mo31692c(a2);
            agVar.uid = Long.valueOf(aVar.mo31691b(a3));
            agVar.sec_uid = aVar.mo31692c(a4);
            agVar.create_time = Long.valueOf(aVar.mo31691b(a5));
            agVar.idempotent_id = aVar.mo31692c(a6);
            agVar.key = aVar.mo31692c(a7);
            agVar.value = aVar.mo31692c(a8);
            agVar.version = aVar.mo31691b(a9);
            agVar.status = aVar.mo31687a(a10);
            agVar.deleted = aVar.mo31687a(a11);
            arrayList.add(agVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C19536ag m37215a(C19536ag agVar, boolean z) {
        int i;
        if (agVar == null) {
            return null;
        }
        C20002j.m37782c("IMMsgPropertyDao updateSendingProperty");
        C19536ag a = m37216a(agVar.msgUuid, agVar.key, agVar.idempotent_id);
        if (a == null) {
            return null;
        }
        if (a.status != 4) {
            a = null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            String str = EnumC19785a.COLUMN_STATUS.key;
            if (z) {
                i = 2;
            } else {
                i = 3;
            }
            contentValues.put(str, Integer.valueOf(i));
            C19742b.m36971a("msg_property_new", contentValues, m37226c(), new String[]{agVar.msgUuid, agVar.key, agVar.idempotent_id});
            return a;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgPropertyDao updateSendingProperty", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static C19536ag m37216a(String str, String str2, String str3) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            aVar = C19742b.m36973a("select * from msg_property_new where " + m37226c(), new String[]{str, str2, str3});
            if (aVar != null) {
                try {
                    if (aVar.mo31694d()) {
                        C19536ag b = m37223b(aVar);
                        C19741a.m36961a(aVar);
                        return b;
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C19512f.m36457b("imsdk", "IMMsgPropertyDao getMessageProperty", e);
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
            C19512f.m36457b("imsdk", "IMMsgPropertyDao getMessageProperty", e);
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
}
