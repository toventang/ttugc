package com.bytedance.p1399im.core.internal.p1419a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1421b.C19745a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1406b.C19505b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import com.bytedance.p1399im.core.p1408d.C19532ad;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19591aq;
import com.bytedance.p1399im.core.p1408d.C19628d;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.p1408d.C19663l;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.p1415g.C19699c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.c */
public final class C19749c {
    static {
        Covode.recordClassIndex(22593);
    }

    /* renamed from: a */
    public static List<String> m37004a(boolean z) {
        Throwable th;
        AbstractC19751a aVar;
        ArrayList arrayList;
        Exception e;
        AbstractC19751a aVar2 = null;
        ArrayList arrayList2 = null;
        C19512f.m36457b("imsdk", "IMConversationDao getAllConversationIds, stranger:".concat(String.valueOf(z)), (Throwable) null);
        try {
            aVar = C19742b.m36973a("select " + EnumC19750a.COLUMN_ID.key + " from conversation_list where " + EnumC19750a.COLUMN_STRANGER.key + "=" + (z ? 1 : 0), (String[]) null);
            if (aVar != null) {
                try {
                    arrayList = new ArrayList();
                    while (aVar.mo31694d()) {
                        try {
                            arrayList.add(aVar.mo31692c(aVar.mo31688a(EnumC19750a.COLUMN_ID.key)));
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                C19512f.m36457b("imsdk", "IMConversationDao getAllConversationIds ".concat(String.valueOf(e)), (Throwable) null);
                                C19510e.m36439a(e);
                                C19741a.m36961a(aVar);
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar;
                                C19741a.m36961a(aVar2);
                                throw th;
                            }
                        }
                    }
                    arrayList2 = arrayList;
                } catch (Exception e3) {
                    e = e3;
                    arrayList = null;
                    C19512f.m36457b("imsdk", "IMConversationDao getAllConversationIds ".concat(String.valueOf(e)), (Throwable) null);
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    return arrayList;
                }
            }
            C19741a.m36961a(aVar);
            return arrayList2;
        } catch (Exception e4) {
            e = e4;
            aVar = null;
            arrayList = null;
            C19512f.m36457b("imsdk", "IMConversationDao getAllConversationIds ".concat(String.valueOf(e)), (Throwable) null);
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m37011a(String str, long j, long j2) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C20002j.m37782c("IMConversationDao updateConversationMinIndex, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC19750a.COLUMN_MIN_INDEX.key, Long.valueOf(j));
            contentValues.put(EnumC19750a.COLUMN_MIN_INDEX_V2.key, Long.valueOf(j2));
            if (C19742b.m36971a("conversation_list", contentValues, EnumC19750a.COLUMN_ID.key + "=?", new String[]{str}) > 0) {
                z = true;
            }
            C19699c.m36829a().mo31653a("updateConversationMinIndex", currentTimeMillis);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationDao updateConversationMinIndex ", e);
            C19510e.m36439a(e);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m37009a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C20002j.m37782c("IMConversationDao setConversationNoMore, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC19750a.COLUMN_HAS_MORE.key, (Integer) 0);
            if (C19742b.m36971a("conversation_list", contentValues, EnumC19750a.COLUMN_ID.key + "=? and " + EnumC19750a.COLUMN_HAS_MORE.key + "=?", new String[]{str, "1"}) > 0) {
                z = true;
            }
            C19699c.m36829a().mo31653a("setConversationNoMore", currentTimeMillis);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationDao setConversationNoMore ", e);
            C19510e.m36439a(e);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m37006a(C19538ai aiVar) {
        boolean z = false;
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            String conversationId = aiVar.getConversationId();
            C20002j.m37782c("IMConversationDao updateLastMsgToConversation:".concat(String.valueOf(conversationId)));
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC19750a.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(aiVar.getIndex()));
                contentValues.put(EnumC19750a.COLUMN_UPDATE_TIME.key, Long.valueOf(aiVar.getCreatedAt()));
                contentValues.put(EnumC19750a.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(aiVar.getOrderIndex()));
                if (C19742b.m36971a("conversation_list", contentValues, EnumC19750a.COLUMN_ID.key + "=?", new String[]{conversationId}) > 0) {
                    z = true;
                }
                C19699c.m36829a().mo31653a("updateLastMsgToConversation", currentTimeMillis);
            } catch (Exception e) {
                C19512f.m36457b("imsdk", "IMConversationDao updateLastMsgToConversation ", e);
                C19510e.m36439a(e);
            }
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m37012a(String str, long j, long j2, long j3, int i, long j4) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C20002j.m37782c("IMConversationDao updateConversationWhenRecvMsg:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC19750a.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(j2));
            contentValues.put(EnumC19750a.COLUMN_UPDATE_TIME.key, Long.valueOf(j));
            contentValues.put(EnumC19750a.COLUMN_MAX_INDEX_V2.key, Long.valueOf(j3));
            contentValues.put(EnumC19750a.COLUMN_BADGE_COUNT.key, Integer.valueOf(i));
            contentValues.put(EnumC19750a.COLUMN_UNREAD_COUNT.key, Long.valueOf(j4));
            if (C19742b.m36971a("conversation_list", contentValues, EnumC19750a.COLUMN_ID.key + "=?", new String[]{str}) > 0) {
                z = true;
            }
            C19699c.m36829a().mo31653a("updateConversationWhenRecvMsg", currentTimeMillis);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationDao updateConversationWhenRecvMsg ", e);
            C19510e.m36439a(e);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m37008a(C19638h hVar, boolean z) {
        boolean z2 = false;
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            C20002j.m37782c("IMConversationDao updateConversation:" + hVar.getConversationId());
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues f = m37027f(hVar);
                f.remove(EnumC19750a.COLUMN_ID.key);
                if (TextUtils.isEmpty(hVar.getTicket())) {
                    f.remove(EnumC19750a.COLUMN_COLUMN_TICKET.key);
                }
                if (hVar.getConversationShortId() <= 0) {
                    f.remove(EnumC19750a.COLUMN_SHORT_ID.key);
                }
                if (!z) {
                    f.remove(EnumC19750a.COLUMN_STRANGER.key);
                }
                if (C19742b.m36971a("conversation_list", f, EnumC19750a.COLUMN_ID.key + "=?", new String[]{hVar.getConversationId()}) > 0) {
                    z2 = true;
                }
                if (hVar.getCoreInfo() != null) {
                    C19743b.m36987a(hVar.getCoreInfo());
                }
                if (hVar.getSettingInfo() != null) {
                    C19773g.m37163a(hVar.getSettingInfo());
                }
                C19745a.m36988a();
                C19483d.m36365a();
                C19699c.m36829a().mo31653a("updateConversation", currentTimeMillis);
            } catch (Exception e) {
                C19512f.m36457b("imsdk", "IMConversationDao updateConversation ", e);
                e.printStackTrace();
                C19510e.m36439a(e);
            }
        }
        return z2;
    }

    /* renamed from: a */
    public static boolean m37010a(String str, long j) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            return false;
        }
        C20002j.m37782c("IMConversationDao setConversationTime, cid:" + str + ", updateTime:" + j);
        return C19742b.m36979b("update conversation_list set " + EnumC19750a.COLUMN_UPDATE_TIME.key + "=" + j + " where " + EnumC19750a.COLUMN_ID.key + "=\"" + str + "\"");
    }

    /* renamed from: a */
    public static boolean m37013a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C20002j.m37782c("IMConversationDao updateLocalExt, cid:".concat(String.valueOf(str)));
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC19750a.COLUMN_LOCAL_INFO.key, C19997f.m37771b(map));
        if (C19742b.m36971a("conversation_list", contentValues, EnumC19750a.COLUMN_ID.key + "=?", new String[]{str}) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<C19638h> m37003a(int i, int i2, long j) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        C19512f.m36457b("imsdk", "IMConversationDao getStrangerConversations, inbox:" + i + ", limit:" + i2 + ", maxUpdateTime:" + j, (Throwable) null);
        ArrayList arrayList = new ArrayList();
        try {
            String str = "select * from conversation_list where " + EnumC19750a.COLUMN_STRANGER.key + "=1 and " + EnumC19750a.COLUMN_INBOX.key + "=" + i;
            if (j != -1) {
                str = str + " and " + EnumC19750a.COLUMN_UPDATE_TIME.key + "<" + j;
            }
            aVar = C19742b.m36973a(str + " order by " + EnumC19750a.COLUMN_UPDATE_TIME.key + " desc limit " + i2, (String[]) null);
            if (aVar != null) {
                while (aVar.mo31694d()) {
                    try {
                        arrayList.add(m36998a(aVar, true));
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            C19512f.m36457b("imsdk", "IMConversationDao getStrangerConversations ".concat(String.valueOf(e)), (Throwable) null);
                            e.printStackTrace();
                            C19510e.m36439a(e);
                            C19741a.m36961a(aVar);
                            return arrayList;
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
                }
            }
            C19741a.m36961a(aVar);
        } catch (Exception e3) {
            e = e3;
            aVar = null;
            C19512f.m36457b("imsdk", "IMConversationDao getStrangerConversations ".concat(String.valueOf(e)), (Throwable) null);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            C19741a.m36961a(aVar2);
            throw th;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<C19638h> m37015b() {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        AbstractC19751a aVar2 = null;
        try {
            String str = "select * from conversation_list where " + EnumC19750a.COLUMN_STRANGER.key + "=0";
            if (C19505b.m36410b()) {
                str = str + " and " + EnumC19750a.COLUMN_IS_IN_BOX.key + "=0";
            }
            aVar = C19742b.m36973a(str + " order by " + EnumC19750a.COLUMN_UPDATE_TIME.key + " desc;", (String[]) null);
            try {
                if (C19483d.m36365a().mo31141b().f46237ab.batchQueryEnableAndQueryLimit != 0) {
                    m37005a(aVar, arrayList);
                } else if (aVar != null) {
                    while (aVar.mo31694d()) {
                        arrayList.add(m36998a(aVar, true));
                    }
                }
                C19699c.m36829a().mo31653a("getAllConversation", currentTimeMillis);
                C19741a.m36961a(aVar);
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMConversationDao getAllConversation ".concat(String.valueOf(e)), (Throwable) null);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    C20002j.m37782c("IMConversationDao getAllConversation, count:" + arrayList.size());
                    return arrayList;
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
            C19512f.m36457b("imsdk", "IMConversationDao getAllConversation ".concat(String.valueOf(e)), (Throwable) null);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            C20002j.m37782c("IMConversationDao getAllConversation, count:" + arrayList.size());
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C20002j.m37782c("IMConversationDao getAllConversation, count:" + arrayList.size());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r12 != false) goto L_0x0040;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m37019c() {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.C19749c.m37019c():boolean");
    }

    /* renamed from: d */
    public static List<C19638h> m37023d() {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        C19512f.m36457b("imsdk", "IMConversationDao getConversationBoxConversations", (Throwable) null);
        ArrayList arrayList = new ArrayList();
        try {
            aVar = C19742b.m36973a("select * from conversation_list where " + EnumC19750a.COLUMN_IS_IN_BOX.key + "=1 order by " + EnumC19750a.COLUMN_UPDATE_TIME.key + " desc", (String[]) null);
            try {
                if (C19483d.m36365a().mo31141b().f46237ab.batchQueryEnableAndQueryLimit != 0) {
                    m37005a(aVar, arrayList);
                } else if (aVar != null) {
                    while (aVar.mo31694d()) {
                        arrayList.add(m36998a(aVar, true));
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMConversationDao getConversationBoxConversations ".concat(String.valueOf(e)), (Throwable) null);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    return arrayList;
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
            C19512f.m36457b("imsdk", "IMConversationDao getConversationBoxConversations ".concat(String.valueOf(e)), (Throwable) null);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: a */
    public static List<String> m37000a() {
        Throwable th;
        ArrayList arrayList;
        AbstractC19751a aVar;
        Exception e;
        C20002j.m37782c("IMConversationDao getAllConversationId");
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar2 = null;
        try {
            aVar = C19742b.m36973a("select " + EnumC19750a.COLUMN_ID.key + " from conversation_list where " + EnumC19750a.COLUMN_STRANGER.key + "=0", (String[]) null);
            if (aVar != null) {
                try {
                    arrayList = new ArrayList();
                    while (aVar.mo31694d()) {
                        try {
                            arrayList.add(aVar.mo31692c(aVar.mo31688a(EnumC19750a.COLUMN_ID.key)));
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                C19512f.m36457b("imsdk", "IMConversationDao getAllConversationId ".concat(String.valueOf(e)), (Throwable) null);
                                e.printStackTrace();
                                C19510e.m36439a(e);
                                C19741a.m36961a(aVar);
                                return arrayList;
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
                    arrayList = null;
                    C19512f.m36457b("imsdk", "IMConversationDao getAllConversationId ".concat(String.valueOf(e)), (Throwable) null);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    return arrayList;
                }
            } else {
                arrayList = null;
            }
            C19699c.m36829a().mo31653a("getAllConversationId", currentTimeMillis);
        } catch (Exception e4) {
            e = e4;
            aVar = null;
            arrayList = null;
            C19512f.m36457b("imsdk", "IMConversationDao getAllConversationId ".concat(String.valueOf(e)), (Throwable) null);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: com.bytedance.im.core.internal.a.c$a */
    public enum EnumC19750a {
        COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
        COLUMN_SHORT_ID("short_id", "BIGINT"),
        COLUMN_CONVERSATION_TYPE(StringSet.type, "INTEGER"),
        COLUMN_LAST_MSG_INDEX("last_msg_index", "BIGINT"),
        COLUMN_UPDATE_TIME("updated_time", "INTEGER"),
        COLUMN_UNREAD_COUNT("unread_count", "INTEGER"),
        COLUMN_READ_INDEX("read_index", "BIGINT"),
        COLUMN_INBOX("inbox", "INTEGER"),
        COLUMN_MIN_INDEX("min_index", "BIGINT"),
        COLUMN_DRAFT_TIME("drafted_time", "INTEGER"),
        COLUMN_COLUMN_TICKET("ticket", "TEXT"),
        COLUMN_DRAFT_CONTENT("draft_content", "TEXT"),
        COLUMN_LOCAL_INFO("local_info", "TEXT"),
        COLUMN_IS_MEMBER("is_member", "INTEGER"),
        COLUMN_HAS_MORE("has_more", "INTEGER"),
        COLUMN_MEMBER_COUNT("member_count", "INTEGER"),
        COLUMN_STATUS("status", "INTEGER"),
        COLUMN_PARTICIPANT("participant", "TEXT"),
        COLUMN_LAST_MSG_ORDER_INDEX("last_msg_order_index", "BIGINT"),
        COLUMN_STRANGER("stranger", "INTEGER default 0"),
        COLUMN_SORT_ORDER("sort_order", "INTEGER"),
        COLUMN_MIN_INDEX_V2("min_index_v2", "BIGINT"),
        COLUMN_MAX_INDEX_V2("max_index_v2", "BIGINT"),
        COLUMN_READ_INDEX_V2("read_index_v2", "BIGINT"),
        COLUMN_BADGE_COUNT("badge_count", "INTEGER"),
        COLUMN_READ_BADGE_COUNT("read_badge_count", "INTEGER"),
        COLUMN_IS_IN_BOX("is_in_box", "INTEGER DEFAULT 0");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22594);
        }

        private EnumC19750a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: c */
    public static boolean m37020c(C19638h hVar) {
        if (hVar == null || TextUtils.isEmpty(hVar.getConversationId())) {
            return false;
        }
        return m37018b(hVar.getConversationId(), m37022d(hVar));
    }

    /* renamed from: a */
    public static boolean m37007a(C19638h hVar) {
        boolean z = false;
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            C20002j.m37782c("IMConversationDao insertConversation:" + hVar.getConversationId());
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues f = m37027f(hVar);
            if (hVar.getCoreInfo() != null) {
                C19743b.m36987a(hVar.getCoreInfo());
            }
            if (hVar.getSettingInfo() != null) {
                C19773g.m37163a(hVar.getSettingInfo());
            }
            if (C19742b.m36972a("conversation_list", f) >= 0) {
                z = true;
                C19745a.m36988a();
                C19483d.m36365a();
            }
            C19699c.m36829a().mo31653a("insertConversation", currentTimeMillis);
        }
        return z;
    }

    /* renamed from: b */
    public static long m37014b(String str) {
        long j = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C20002j.m37782c("IMConversationDao getConversationReadIndex, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select " + EnumC19750a.COLUMN_READ_INDEX.key + " from conversation_list where " + EnumC19750a.COLUMN_ID.key + "=?", new String[]{str});
            if (aVar != null && aVar.mo31693c()) {
                j = aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_READ_INDEX.key));
            }
            C19699c.m36829a().mo31653a("getConversationReadIndex", currentTimeMillis);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationDao getConversationReadIndex ", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        return j;
    }

    /* renamed from: c */
    public static boolean m37021c(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from conversation_list where " + EnumC19750a.COLUMN_ID.key + "=?", new String[]{str});
            if (aVar.mo31690b() > 0) {
                z = true;
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationDao hasLocalConversation ", e);
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a(aVar);
            throw th;
        }
        C19741a.m36961a(aVar);
        C20002j.m37782c("IMConversationDao hasLocalConversation, cid:" + str + ", result:" + z);
        return z;
    }

    /* renamed from: d */
    public static long m37022d(C19638h hVar) {
        long max;
        if (C19483d.m36365a().f46162g != null) {
            max = C19483d.m36365a().f46162g.mo31154a(hVar);
        } else {
            max = Math.max(hVar.getUpdatedTime(), hVar.getDraftTime());
            if (hVar.isStickTop()) {
                double pow = Math.pow(10.0d, 13.0d);
                double d = (double) max;
                Double.isNaN(d);
                max = (long) (pow + d);
            }
        }
        if (max <= 0) {
            C19512f.m36457b("IMConversationDao generateConversationSortOrder, sortOrder abnormal: ", String.valueOf(max), (Throwable) null);
        }
        hVar.setSortOrder(max);
        return max;
    }

    /* renamed from: f */
    public static boolean m37028f(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C19512f.m36457b("imsdk", "IMConversationDao transferStrangerConversation:".concat(String.valueOf(str)), (Throwable) null);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC19750a.COLUMN_STRANGER.key, (Integer) 0);
            if (C19742b.m36971a("conversation_list", contentValues, EnumC19750a.COLUMN_ID.key + "=?", new String[]{str}) > 0) {
                z = true;
            }
            C19512f.m36457b("imsdk", "IMConversationDao transferStrangerConversation, result:".concat(String.valueOf(z)), (Throwable) null);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationDao transferStrangerConversation ", e);
            C19510e.m36439a(e);
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m37017b(C19638h hVar) {
        boolean z = false;
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            String conversationId = hVar.getConversationId();
            C20002j.m37782c("IMConversationDao updateConversationRead, cid:".concat(String.valueOf(conversationId)));
            long currentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC19750a.COLUMN_UNREAD_COUNT.key, Long.valueOf(hVar.getUnreadCount()));
                contentValues.put(EnumC19750a.COLUMN_READ_INDEX.key, Long.valueOf(hVar.getReadIndex()));
                contentValues.put(EnumC19750a.COLUMN_READ_INDEX_V2.key, Long.valueOf(hVar.getReadIndexV2()));
                contentValues.put(EnumC19750a.COLUMN_READ_BADGE_COUNT.key, Integer.valueOf(hVar.getReadBadgeCount()));
                Map<String, String> localExt = hVar.getLocalExt();
                if (hVar.getReadBadgeCount() > 0 && !TextUtils.equals(localExt.get("s:read_badge_count_update"), "1")) {
                    localExt.put("s:read_badge_count_update", "1");
                    contentValues.put(EnumC19750a.COLUMN_LOCAL_INFO.key, C19997f.m37771b(localExt));
                    C19512f.m36457b("imsdk", "IMConversationDao updateConversationRead, read badge count updated", (Throwable) null);
                }
                if (C19742b.m36971a("conversation_list", contentValues, EnumC19750a.COLUMN_ID.key + "=?", new String[]{conversationId}) > 0) {
                    z = true;
                }
                C19699c.m36829a().mo31653a("updateConversationRead", currentTimeMillis);
            } catch (Exception e) {
                C19512f.m36457b("imsdk", "IMConversationDao updateConversationRead ", e);
                C19510e.m36439a(e);
            }
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m37024d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C20002j.m37782c("IMConversationDao dissolveConversation:".concat(String.valueOf(str)));
        return C19742b.m36979b("update conversation_list set " + EnumC19750a.COLUMN_STATUS.key + "=1 where " + EnumC19750a.COLUMN_ID.key + "=\"" + str + "\"");
    }

    /* renamed from: e */
    public static long m37025e(C19638h hVar) {
        if (hVar == null) {
            C19512f.m36457b("imsdk", "IMConversationDao computeUnreadCount conversation invalid", (Throwable) null);
            return 0;
        }
        String conversationId = hVar.getConversationId();
        long readIndex = hVar.getReadIndex();
        long maxIndexV2 = hVar.getMaxIndexV2();
        int readBadgeCount = hVar.getReadBadgeCount();
        int badgeCount = hVar.getBadgeCount();
        if (TextUtils.isEmpty(conversationId)) {
            C19512f.m36457b("imsdk", "IMConversationDao computeUnreadCount cid invalid:".concat(String.valueOf(conversationId)), (Throwable) null);
            return 0;
        }
        C20041s.m37876a();
        if (!C20041s.m37889c()) {
            long d = C19777i.m37198d(conversationId, readIndex);
            C19512f.m36457b("imsdk", "IMConversationDao computeUnreadCount cid: +" + conversationId + ", no recent messages, use readIndex, count:" + d, (Throwable) null);
            return d;
        }
        C19512f.m36457b("IMConversationDao ", "computeUnreadCount start, cid:" + conversationId + ", readBadgeCount:" + readBadgeCount + ", lastMsgBadgeCount:" + badgeCount, (Throwable) null);
        if (readBadgeCount <= 0 || badgeCount < readBadgeCount) {
            long j = C19483d.m36365a().mo31141b().f46244ai.baseIndexV2;
            long a = C19777i.m37171a(conversationId, readIndex, C19483d.m36365a().mo31141b().f46244ai.baseIndexV2);
            if (j <= 0 || maxIndexV2 < j) {
                C19512f.m36457b("imsdk", "IMConversationDao computeUnreadCount use old continue, maxIndexV2:" + maxIndexV2 + ", baseIndexV2:" + j + ", count:" + a, (Throwable) null);
                return a;
            }
            if (readBadgeCount < 0) {
                readBadgeCount = 0;
            }
            if (badgeCount < readBadgeCount) {
                C19512f.m36457b("imsdk", "IMConversationDao computeUnreadCount badge count invalid, readBadgeCount:" + readBadgeCount + ", lastMsgBadgeCount:" + badgeCount + ", count:" + a, (Throwable) null);
                new C19517i().mo31179a("im_invalid_badge_count").mo31180a("conversation_id", hVar.getConversationId()).mo31180a("read_index", String.valueOf(hVar.getReadIndex())).mo31180a("max_index", String.valueOf(hVar.getLastMessageIndex())).mo31180a("read_index_v2", String.valueOf(hVar.getReadIndexV2())).mo31180a("max_index_v2", String.valueOf(hVar.getMaxIndexV2())).mo31180a("badge_count", Integer.valueOf(hVar.getBadgeCount())).mo31180a("read_badge_count", Integer.valueOf(hVar.getReadBadgeCount())).mo31181b();
                return a;
            }
            long j2 = ((long) (badgeCount - readBadgeCount)) + a;
            C19512f.m36457b("imsdk", "IMConversationDao computeUnreadCount use mix, continuous:" + a + ", readBadgeCount:" + readBadgeCount + ", lastMsgBadgeCount:" + badgeCount + ", count:" + j2, (Throwable) null);
            return j2;
        }
        int i = badgeCount - readBadgeCount;
        C19512f.m36457b("imsdk", "IMConversationDao computeUnreadCount use badge, count:" + i, (Throwable) null);
        return (long) i;
    }

    /* renamed from: f */
    public static ContentValues m37027f(C19638h hVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC19750a.COLUMN_ID.key, C19996e.m37758b(hVar.getConversationId()));
        contentValues.put(EnumC19750a.COLUMN_SHORT_ID.key, Long.valueOf(hVar.getConversationShortId()));
        contentValues.put(EnumC19750a.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(hVar.getLastMessageIndex()));
        contentValues.put(EnumC19750a.COLUMN_UPDATE_TIME.key, Long.valueOf(hVar.getUpdatedTime()));
        contentValues.put(EnumC19750a.COLUMN_UNREAD_COUNT.key, Long.valueOf(hVar.getUnreadCount()));
        contentValues.put(EnumC19750a.COLUMN_COLUMN_TICKET.key, C19996e.m37758b(hVar.getTicket()));
        contentValues.put(EnumC19750a.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(hVar.getConversationType()));
        contentValues.put(EnumC19750a.COLUMN_DRAFT_TIME.key, Long.valueOf(hVar.getDraftTime()));
        contentValues.put(EnumC19750a.COLUMN_DRAFT_CONTENT.key, C19996e.m37758b(hVar.getDraftContent()));
        contentValues.put(EnumC19750a.COLUMN_MIN_INDEX.key, Long.valueOf(hVar.getMinIndex()));
        contentValues.put(EnumC19750a.COLUMN_LOCAL_INFO.key, C19996e.m37758b(hVar.getLocalExtStr()));
        contentValues.put(EnumC19750a.COLUMN_READ_INDEX.key, Long.valueOf(hVar.getReadIndex()));
        contentValues.put(EnumC19750a.COLUMN_INBOX.key, Integer.valueOf(hVar.getInboxType()));
        contentValues.put(EnumC19750a.COLUMN_IS_MEMBER.key, Integer.valueOf(hVar.isMember() ? 1 : 0));
        contentValues.put(EnumC19750a.COLUMN_HAS_MORE.key, Integer.valueOf(hVar.hasMore() ? 1 : 0));
        contentValues.put(EnumC19750a.COLUMN_MEMBER_COUNT.key, Integer.valueOf(hVar.getMemberCount()));
        contentValues.put(EnumC19750a.COLUMN_STATUS.key, Integer.valueOf(hVar.getStatus()));
        contentValues.put(EnumC19750a.COLUMN_PARTICIPANT.key, C19996e.m37758b(hVar.getMemberStr()));
        contentValues.put(EnumC19750a.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(hVar.getLastMessageOrderIndex()));
        contentValues.put(EnumC19750a.COLUMN_STRANGER.key, Integer.valueOf(hVar.isStranger() ? 1 : 0));
        contentValues.put(EnumC19750a.COLUMN_SORT_ORDER.key, Long.valueOf(m37022d(hVar)));
        contentValues.put(EnumC19750a.COLUMN_MIN_INDEX_V2.key, Long.valueOf(hVar.getMinIndexV2()));
        contentValues.put(EnumC19750a.COLUMN_MAX_INDEX_V2.key, Long.valueOf(hVar.getMaxIndexV2()));
        contentValues.put(EnumC19750a.COLUMN_READ_INDEX_V2.key, Long.valueOf(hVar.getReadIndexV2()));
        contentValues.put(EnumC19750a.COLUMN_BADGE_COUNT.key, Integer.valueOf(hVar.getBadgeCount()));
        contentValues.put(EnumC19750a.COLUMN_READ_BADGE_COUNT.key, Integer.valueOf(hVar.getReadBadgeCount()));
        contentValues.put(EnumC19750a.COLUMN_IS_IN_BOX.key, Integer.valueOf(hVar.isInBox() ? 1 : 0));
        return contentValues;
    }

    /* renamed from: e */
    public static boolean m37026e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C20002j.m37782c("IMConversationDao deleteConversation:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = C19742b.m36977a("conversation_list", EnumC19750a.COLUMN_ID.key + "=?", new String[]{str});
        if (a) {
            C19532ad.m36497a(str, new C19591aq(new ArrayList()));
            C19591aq aqVar = new C19591aq(new ArrayList());
            C19628d.f46650a.put(str, aqVar);
            RunnableC19987d.m37729a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0063: INVOKE  
                  (wrap: com.bytedance.im.core.d.d$1 : 0x005b: CONSTRUCTOR  (r4v1 com.bytedance.im.core.d.d$1) = (r1v5 'aqVar' com.bytedance.im.core.d.aq), (r10v0 'str' java.lang.String) call: com.bytedance.im.core.d.d.1.<init>(com.bytedance.im.core.d.aq, java.lang.String):void type: CONSTRUCTOR)
                  (null com.bytedance.im.core.internal.e.b)
                  (wrap: java.util.concurrent.Executor : 0x005f: INVOKE  (r0v12 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.a():java.util.concurrent.Executor)
                 type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b, java.util.concurrent.Executor):void in method: com.bytedance.im.core.internal.a.c.e(java.lang.String):boolean, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: CONSTRUCTOR  (r4v1 com.bytedance.im.core.d.d$1) = (r1v5 'aqVar' com.bytedance.im.core.d.aq), (r10v0 'str' java.lang.String) call: com.bytedance.im.core.d.d.1.<init>(com.bytedance.im.core.d.aq, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.a.c.e(java.lang.String):boolean, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.d.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 299
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.C19749c.m37026e(java.lang.String):boolean");
        }

        /* renamed from: a */
        public static List<C19638h> m37001a(int i) {
            Throwable th;
            AbstractC19751a aVar;
            Exception e;
            ArrayList arrayList = new ArrayList();
            AbstractC19751a aVar2 = null;
            try {
                aVar = C19742b.m36973a("select * from conversation_list where " + EnumC19750a.COLUMN_STRANGER.key + "=0 order by " + EnumC19750a.COLUMN_UPDATE_TIME.key + " desc limit " + i + ";", (String[]) null);
                if (aVar != null) {
                    while (aVar.mo31694d()) {
                        try {
                            arrayList.add(m36998a(aVar, true));
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                C19512f.m36457b("imsdk", "IMConversationDao getConversationLimit ".concat(String.valueOf(e)), (Throwable) null);
                                e.printStackTrace();
                                C19510e.m36439a(e);
                                C19741a.m36961a(aVar);
                                C20002j.m37782c("IMConversationDao getConversationLimit, limit:" + i + ", count:" + arrayList.size());
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar;
                                C19741a.m36961a(aVar2);
                                throw th;
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                aVar = null;
                C19512f.m36457b("imsdk", "IMConversationDao getConversationLimit ".concat(String.valueOf(e)), (Throwable) null);
                e.printStackTrace();
                C19510e.m36439a(e);
                C19741a.m36961a(aVar);
                C20002j.m37782c("IMConversationDao getConversationLimit, limit:" + i + ", count:" + arrayList.size());
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                C19741a.m36961a(aVar2);
                throw th;
            }
            C19741a.m36961a(aVar);
            C20002j.m37782c("IMConversationDao getConversationLimit, limit:" + i + ", count:" + arrayList.size());
            return arrayList;
        }

        /* renamed from: a */
        private static void m37005a(AbstractC19751a aVar, ArrayList<C19638h> arrayList) {
            m37016b(aVar, arrayList);
        }

        /* renamed from: a */
        public static List<C19638h> m37002a(int i, int i2) {
            return m37003a(i, i2, -1);
        }

        /* renamed from: a */
        public static C19638h m36999a(String str, boolean z) {
            Throwable th;
            C19638h hVar;
            Exception e;
            AbstractC19751a aVar = null;
            r6 = null;
            C19638h hVar2 = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C20002j.m37782c("IMConversationDao getConversation, cid:" + str + ", fullInfo:" + z);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                AbstractC19751a a = C19742b.m36973a("select * from conversation_list where " + EnumC19750a.COLUMN_ID.key + "=?", new String[]{str});
                if (a != null) {
                    try {
                        if (a.mo31693c()) {
                            hVar2 = m36998a(a, z);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        hVar = null;
                        aVar = a;
                        try {
                            C19512f.m36457b("imsdk", "IMConversationDao getConversation ", e);
                            e.printStackTrace();
                            C19510e.m36439a(e);
                            C19741a.m36961a(aVar);
                            return hVar;
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
                C19699c.m36829a().mo31653a("getConversation:".concat(String.valueOf(z)), currentTimeMillis);
                C19741a.m36961a(a);
                return hVar2;
            } catch (Exception e3) {
                e = e3;
                hVar = null;
                C19512f.m36457b("imsdk", "IMConversationDao getConversation ", e);
                e.printStackTrace();
                C19510e.m36439a(e);
                C19741a.m36961a(aVar);
                return hVar;
            }
        }

        /* renamed from: a */
        private static C19638h m36998a(AbstractC19751a aVar, boolean z) {
            boolean z2;
            boolean z3;
            boolean z4;
            if (aVar == null) {
                return null;
            }
            C19638h hVar = new C19638h();
            hVar.setConversationId(aVar.mo31692c(aVar.mo31688a(EnumC19750a.COLUMN_ID.key)));
            hVar.setConversationShortId(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_SHORT_ID.key)));
            hVar.setUpdatedTime(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_UPDATE_TIME.key)));
            hVar.setUnreadCount((long) aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_UNREAD_COUNT.key)));
            hVar.setTicket(aVar.mo31692c(aVar.mo31688a(EnumC19750a.COLUMN_COLUMN_TICKET.key)));
            hVar.setConversationType(aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_CONVERSATION_TYPE.key)));
            hVar.setDraftTime(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_DRAFT_TIME.key)));
            hVar.setDraftContent(aVar.mo31692c(aVar.mo31688a(EnumC19750a.COLUMN_DRAFT_CONTENT.key)));
            hVar.setMinIndex(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_MIN_INDEX.key)));
            hVar.setLocalExtStr(aVar.mo31692c(aVar.mo31688a(EnumC19750a.COLUMN_LOCAL_INFO.key)));
            hVar.setReadIndex(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_READ_INDEX.key)));
            hVar.setLastMessageIndex(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_LAST_MSG_INDEX.key)));
            hVar.setInboxType(aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_INBOX.key)));
            boolean z5 = false;
            if (aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_IS_MEMBER.key)) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            hVar.setIsMember(z2);
            if (aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_HAS_MORE.key)) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            hVar.setHasMore(z3);
            hVar.setMemberCount(aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_MEMBER_COUNT.key)));
            hVar.setStatus(aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_STATUS.key)));
            hVar.setMemberStr(aVar.mo31692c(aVar.mo31688a(EnumC19750a.COLUMN_PARTICIPANT.key)));
            hVar.setLastMessageOrderIndex(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_LAST_MSG_ORDER_INDEX.key)));
            if (aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_STRANGER.key)) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            hVar.setStranger(z4);
            hVar.setSortOrder(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_SORT_ORDER.key)));
            hVar.setMinIndexV2(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_MIN_INDEX_V2.key)));
            hVar.setMaxIndexV2(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_MAX_INDEX_V2.key)));
            hVar.setReadIndexV2(aVar.mo31691b(aVar.mo31688a(EnumC19750a.COLUMN_READ_INDEX_V2.key)));
            hVar.setBadgeCount(aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_BADGE_COUNT.key)));
            hVar.setReadBadgeCount(aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_READ_BADGE_COUNT.key)));
            if (aVar.mo31687a(aVar.mo31688a(EnumC19750a.COLUMN_IS_IN_BOX.key)) == 1) {
                z5 = true;
            }
            hVar.setInBox(z5);
            if (z) {
                hVar.setMemberIds(C19769e.m37137a(hVar.getConversationId()));
                if (hVar.getConversationType() == C19489e.AbstractC19490a.f46180a) {
                    hVar.setSingleChatMembers(C19769e.m37143b(hVar.getConversationId()));
                }
                hVar.setLastMessage(C19777i.m37203h(hVar.getConversationId()));
                hVar.setCoreInfo(C19743b.m36982a(hVar.getConversationId()));
                hVar.setSettingInfo(C19773g.m37159a(hVar.getConversationId()));
                hVar.setUnreadSelfMentionedMessages(C19775h.m37165a(hVar.getConversationId(), hVar.getReadIndex()));
            }
            return hVar;
        }

        /* renamed from: b */
        private static void m37016b(AbstractC19751a aVar, ArrayList<C19638h> arrayList) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (aVar != null) {
                int a = aVar.mo31688a(EnumC19750a.COLUMN_ID.key);
                int a2 = aVar.mo31688a(EnumC19750a.COLUMN_SHORT_ID.key);
                int a3 = aVar.mo31688a(EnumC19750a.COLUMN_UPDATE_TIME.key);
                int a4 = aVar.mo31688a(EnumC19750a.COLUMN_UNREAD_COUNT.key);
                int a5 = aVar.mo31688a(EnumC19750a.COLUMN_COLUMN_TICKET.key);
                int a6 = aVar.mo31688a(EnumC19750a.COLUMN_CONVERSATION_TYPE.key);
                int a7 = aVar.mo31688a(EnumC19750a.COLUMN_DRAFT_TIME.key);
                int a8 = aVar.mo31688a(EnumC19750a.COLUMN_DRAFT_CONTENT.key);
                int a9 = aVar.mo31688a(EnumC19750a.COLUMN_MIN_INDEX.key);
                int a10 = aVar.mo31688a(EnumC19750a.COLUMN_LOCAL_INFO.key);
                int a11 = aVar.mo31688a(EnumC19750a.COLUMN_READ_INDEX.key);
                int a12 = aVar.mo31688a(EnumC19750a.COLUMN_LAST_MSG_INDEX.key);
                int a13 = aVar.mo31688a(EnumC19750a.COLUMN_INBOX.key);
                int a14 = aVar.mo31688a(EnumC19750a.COLUMN_IS_MEMBER.key);
                int a15 = aVar.mo31688a(EnumC19750a.COLUMN_HAS_MORE.key);
                int a16 = aVar.mo31688a(EnumC19750a.COLUMN_MEMBER_COUNT.key);
                int a17 = aVar.mo31688a(EnumC19750a.COLUMN_STATUS.key);
                int a18 = aVar.mo31688a(EnumC19750a.COLUMN_PARTICIPANT.key);
                int a19 = aVar.mo31688a(EnumC19750a.COLUMN_LAST_MSG_ORDER_INDEX.key);
                int a20 = aVar.mo31688a(EnumC19750a.COLUMN_STRANGER.key);
                int a21 = aVar.mo31688a(EnumC19750a.COLUMN_SORT_ORDER.key);
                int a22 = aVar.mo31688a(EnumC19750a.COLUMN_MIN_INDEX_V2.key);
                int a23 = aVar.mo31688a(EnumC19750a.COLUMN_MAX_INDEX_V2.key);
                int a24 = aVar.mo31688a(EnumC19750a.COLUMN_READ_INDEX_V2.key);
                int a25 = aVar.mo31688a(EnumC19750a.COLUMN_BADGE_COUNT.key);
                int a26 = aVar.mo31688a(EnumC19750a.COLUMN_READ_BADGE_COUNT.key);
                int a27 = aVar.mo31688a(EnumC19750a.COLUMN_IS_IN_BOX.key);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashMap hashMap = new HashMap();
                if (C19483d.m36365a().mo31141b().f46237ab.fullInfoOptimizeEnable == 1) {
                    z = true;
                } else {
                    z = false;
                }
                while (true) {
                    arrayList = arrayList;
                    if (!aVar.mo31694d()) {
                        break;
                    }
                    C19638h hVar = new C19638h();
                    String c = aVar.mo31692c(a);
                    hVar.setConversationId(c);
                    hVar.setConversationShortId(aVar.mo31691b(a2));
                    hVar.setUpdatedTime(aVar.mo31691b(a3));
                    hVar.setUnreadCount((long) aVar.mo31687a(a4));
                    hVar.setTicket(aVar.mo31692c(a5));
                    hVar.setConversationType(aVar.mo31687a(a6));
                    hVar.setDraftTime(aVar.mo31691b(a7));
                    hVar.setDraftContent(aVar.mo31692c(a8));
                    hVar.setMinIndex(aVar.mo31691b(a9));
                    try {
                        hVar.setLocalExtStr(aVar.mo31692c(a10));
                    } catch (Throwable th) {
                        C19512f.m36457b("imsdk", "IMConversationDao setLocalExtStr error", th);
                        C19696b.m36821a(aVar.mo31692c(a10), th);
                    }
                    hVar.setReadIndex(aVar.mo31691b(a11));
                    hVar.setLastMessageIndex(aVar.mo31691b(a12));
                    hVar.setInboxType(aVar.mo31687a(a13));
                    if (aVar.mo31687a(a14) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hVar.setIsMember(z2);
                    if (aVar.mo31687a(a15) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    hVar.setHasMore(z3);
                    hVar.setMemberCount(aVar.mo31687a(a16));
                    hVar.setStatus(aVar.mo31687a(a17));
                    hVar.setMemberStr(aVar.mo31692c(a18));
                    hVar.setLastMessageOrderIndex(aVar.mo31691b(a19));
                    if (aVar.mo31687a(a20) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    hVar.setStranger(z4);
                    hVar.setSortOrder(aVar.mo31691b(a21));
                    hVar.setMinIndexV2(aVar.mo31691b(a22));
                    hVar.setMaxIndexV2(aVar.mo31691b(a23));
                    hVar.setReadIndexV2(aVar.mo31691b(a24));
                    hVar.setBadgeCount(aVar.mo31687a(a25));
                    hVar.setReadBadgeCount(aVar.mo31687a(a26));
                    if (aVar.mo31687a(a27) == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    hVar.setInBox(z5);
                    if (!z) {
                        hVar.setMemberIds(C19769e.m37137a(c));
                        if (hVar.getConversationType() == C19489e.AbstractC19490a.f46180a) {
                            hVar.setSingleChatMembers(C19769e.m37143b(c));
                        }
                        hVar.setLastMessage(C19777i.m37203h(c));
                        hVar.setCoreInfo(C19743b.m36982a(c));
                        hVar.setSettingInfo(C19773g.m37159a(c));
                        hVar.setUnreadSelfMentionedMessages(C19775h.m37165a(c, hVar.getReadIndex()));
                    }
                    arrayList2.add(c);
                    if (hVar.getConversationType() == C19489e.AbstractC19490a.f46180a) {
                        arrayList3.add(c);
                    }
                    hashMap.put(c, Long.valueOf(hVar.getReadIndex()));
                    arrayList.add(hVar);
                }
                if (!arrayList2.isEmpty() && z) {
                    Map<String, List<Long>> a28 = C19769e.m37139a(arrayList2);
                    Map<String, List<C19537ah>> b = C19769e.m37144b(arrayList3);
                    Map<String, C19639i> a29 = C19743b.m36985a(arrayList2);
                    Map<String, C19663l> a30 = C19773g.m37161a(arrayList2);
                    Map<String, List<C19538ai>> a31 = C19775h.m37166a(arrayList2, hashMap);
                    Iterator<C19638h> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C19638h next = it.next();
                        String conversationId = next.getConversationId();
                        if (a28 != null && !a28.isEmpty()) {
                            next.setMemberIds(a28.get(conversationId));
                        }
                        if (b != null && !b.isEmpty() && next.getConversationType() == C19489e.AbstractC19490a.f46180a) {
                            next.setSingleChatMembers(b.get(conversationId));
                        }
                        next.setLastMessage(C19777i.m37203h(next.getConversationId()));
                        if (a29 != null && !a29.isEmpty()) {
                            next.setCoreInfo(a29.get(conversationId));
                        }
                        if (a30 != null && !a30.isEmpty()) {
                            next.setSettingInfo(a30.get(conversationId));
                        }
                        if (a31 != null && !a31.isEmpty()) {
                            next.setUnreadSelfMentionedMessages(a31.get(conversationId));
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public static boolean m37018b(String str, long j) {
            C20002j.m37782c("IMConversationDao setConversationSortOrder".concat(String.valueOf(str)));
            return C19742b.m36979b("update conversation_list set " + EnumC19750a.COLUMN_SORT_ORDER.key + "=" + j + " where " + EnumC19750a.COLUMN_ID.key + "=\"" + str + "\"");
        }
    }
