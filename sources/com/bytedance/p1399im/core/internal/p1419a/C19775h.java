package com.bytedance.p1399im.core.internal.p1419a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1415g.C19699c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.h */
public final class C19775h {
    static {
        Covode.recordClassIndex(22619);
    }

    /* renamed from: com.bytedance.im.core.internal.a.h$a */
    public enum EnumC19776a {
        COLUMN_UUID("uuid", "TEXT PRIMARY KEY"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
        COLUMN_IDS_STR("ids_str", "TEXT"),
        COLUMN_SENDER_ID("sender_id", "BIGINT"),
        COLUMN_CREATED_TIME("created_time", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22620);
        }

        private EnumC19776a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    public static String m37164a() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS mention(");
        EnumC19776a[] values = EnumC19776a.values();
        for (EnumC19776a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: a */
    public static boolean m37168a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C19742b.m36977a("mention", EnumC19776a.COLUMN_UUID.key + "=?", new String[]{str});
    }

    /* renamed from: b */
    public static boolean m37169b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C19742b.m36977a("mention", EnumC19776a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
    }

    /* renamed from: a */
    public static boolean m37167a(C19538ai aiVar) {
        List<Long> mentionIds;
        boolean z = true;
        if (aiVar.isSelf() || (mentionIds = aiVar.getMentionIds()) == null || mentionIds.isEmpty() || !(mentionIds.contains(Long.valueOf(C19483d.m36365a().f46157b.mo27953a())) || mentionIds.contains(0L))) {
            return true;
        }
        Boolean bool = false;
        AbstractC19766c cVar = null;
        try {
            if (C19483d.m36365a().mo31141b().f46220aB) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC19776a.COLUMN_UUID.key, C19996e.m37758b(aiVar.getUuid()));
                contentValues.put(EnumC19776a.COLUMN_CONVERSATION_ID.key, C19996e.m37758b(aiVar.getConversationId()));
                contentValues.put(EnumC19776a.COLUMN_IDS_STR.key, C19996e.m37751a(mentionIds, ","));
                contentValues.put(EnumC19776a.COLUMN_SENDER_ID.key, Long.valueOf(aiVar.getSender()));
                contentValues.put(EnumC19776a.COLUMN_CREATED_TIME.key, Long.valueOf(aiVar.getCreatedAt()));
                if (C19742b.m36980c("mention", contentValues) <= 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } else {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb.append(" replace into mention(");
                for (EnumC19776a aVar : EnumC19776a.values()) {
                    sb.append(aVar.key).append(",");
                    sb2.append("?,");
                }
                String sb3 = sb.toString();
                String sb4 = sb2.toString();
                cVar = C19742b.m36981c(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
                if (cVar != null) {
                    cVar.mo31725a(EnumC19776a.COLUMN_UUID.ordinal() + 1, C19996e.m37758b(aiVar.getUuid()));
                    cVar.mo31725a(EnumC19776a.COLUMN_CONVERSATION_ID.ordinal() + 1, C19996e.m37758b(aiVar.getConversationId()));
                    cVar.mo31725a(EnumC19776a.COLUMN_IDS_STR.ordinal() + 1, C19996e.m37751a(mentionIds, ","));
                    cVar.mo31724a(EnumC19776a.COLUMN_SENDER_ID.ordinal() + 1, aiVar.getSender());
                    cVar.mo31724a(EnumC19776a.COLUMN_CREATED_TIME.ordinal() + 1, aiVar.getCreatedAt());
                }
                if (cVar.mo31723a() <= 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMentionDao upsert", e);
            e.printStackTrace();
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36964a((AbstractC19766c) null);
            throw th;
        }
        C19741a.m36964a(cVar);
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.p1399im.core.p1408d.C19538ai> m37165a(java.lang.String r8, long r9) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.C19775h.m37165a(java.lang.String, long):java.util.List");
    }

    /* renamed from: a */
    public static Map<String, List<C19538ai>> m37166a(List<String> list, Map<String, Long> map) {
        Exception e;
        String[] strArr = null;
        if (list.size() <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        int i = C19483d.m36365a().mo31141b().f46237ab.batchQueryEnableAndQueryLimit;
        String str = "select * from mention where " + EnumC19776a.COLUMN_CONVERSATION_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        AbstractC19751a aVar = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            if (i3 == i - 1 || i2 == list.size() - 1) {
                sb.append("'").append(list.get(i2)).append("') order by ").append(EnumC19776a.COLUMN_CREATED_TIME.key).append(" desc");
                try {
                    aVar = C19742b.m36973a(sb.toString(), strArr);
                    if (aVar != null) {
                        int a = aVar.mo31688a(EnumC19776a.COLUMN_CONVERSATION_ID.key);
                        int a2 = aVar.mo31688a(EnumC19776a.COLUMN_IDS_STR.key);
                        int a3 = aVar.mo31688a(EnumC19776a.COLUMN_UUID.key);
                        HashMap hashMap2 = new HashMap();
                        while (aVar.mo31694d()) {
                            if (C19996e.m37754a(aVar.mo31692c(a2))) {
                                String c = aVar.mo31692c(a);
                                List list2 = (List) hashMap2.get(c);
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                    hashMap2.put(c, list2);
                                }
                                list2.add(aVar.mo31692c(a3));
                            }
                        }
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            try {
                                Long l = map.get(entry.getKey());
                                List arrayList = new ArrayList();
                                if (l != null) {
                                    try {
                                        arrayList = C19777i.m37180a((List) entry.getValue(), l.longValue());
                                    } catch (Exception e2) {
                                        e = e2;
                                        try {
                                            C19512f.m36457b("imsdk", "IMMentionDao getUnreadSelfMentionedMsgMap", e);
                                            e.printStackTrace();
                                            C19510e.m36439a(e);
                                            C19741a.m36961a(aVar);
                                            sb = new StringBuilder(str);
                                            i3 = 0;
                                            i2++;
                                            strArr = null;
                                        } catch (Throwable th) {
                                            C19741a.m36961a(aVar);
                                            throw th;
                                        }
                                    }
                                }
                                hashMap.put(entry.getKey(), arrayList);
                            } catch (Exception e3) {
                                e = e3;
                                C19512f.m36457b("imsdk", "IMMentionDao getUnreadSelfMentionedMsgMap", e);
                                e.printStackTrace();
                                C19510e.m36439a(e);
                                C19741a.m36961a(aVar);
                                sb = new StringBuilder(str);
                                i3 = 0;
                                i2++;
                                strArr = null;
                            }
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    C19512f.m36457b("imsdk", "IMMentionDao getUnreadSelfMentionedMsgMap", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    sb = new StringBuilder(str);
                    i3 = 0;
                    i2++;
                    strArr = null;
                }
                C19741a.m36961a(aVar);
                sb = new StringBuilder(str);
                i3 = 0;
            } else {
                i3++;
                sb.append("'").append(list.get(i2)).append("',");
            }
            i2++;
            strArr = null;
        }
        C19699c.m36829a().mo31653a("getUnreadSelfMentionedMsgMap", currentTimeMillis);
        return hashMap;
    }
}
