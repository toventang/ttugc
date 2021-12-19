package com.bytedance.p1399im.core.internal.p1419a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19625c;
import com.bytedance.p1399im.core.p1415g.C19699c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a */
public final class C19739a {
    static {
        Covode.recordClassIndex(22583);
    }

    /* renamed from: c */
    public static String m36956c() {
        return "create index attchment_index on attchment(" + EnumC19740a.COLUMN_UUID.key + ")";
    }

    /* renamed from: a */
    public static List<String> m36950a() {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        ArrayList arrayList = new ArrayList();
        AbstractC19751a aVar2 = null;
        try {
            aVar = C19742b.m36973a("SELECT rowId," + EnumC19740a.COLUMN_UUID.key + " FROM attchment", (String[]) null);
            try {
                int a = aVar.mo31688a(EnumC19740a.COLUMN_UUID.key);
                while (aVar.mo31694d()) {
                    arrayList.add(aVar.mo31692c(a));
                }
                C19741a.m36961a(aVar);
                return arrayList;
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMAttachmentDao getUuidList ", e);
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
            C19512f.m36457b("imsdk", "IMAttachmentDao getUuidList ", e);
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

    /* renamed from: b */
    public static String m36954b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists attchment (");
        EnumC19740a[] values = EnumC19740a.values();
        for (EnumC19740a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: com.bytedance.im.core.internal.a.a$a */
    public enum EnumC19740a {
        COLUMN_UUID("uuid", "TEXT NOT NULL"),
        COLUMN_LOCAL_URI("local_uri", "TEXT"),
        COLUMN_REMOTE_URI("remote_uri", "TEXT"),
        COLUMN_SIZE("size", "BIGINT"),
        COLUMN_TYPE(StringSet.type, "TEXT"),
        COLUMN_HASH("hash", "TEXT"),
        COLUMN_INDEX("position", "INTEGER"),
        COLUMN_STATUS("status", "INTEGER"),
        COLUMN_EXT("ext", "TEXT"),
        COLUMN_DISPLAY_TYPE("display_type", "TEXT"),
        COLUMN_MIME_TYPE("mime_type", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22584);
        }

        private EnumC19740a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    private static List<C19625c> m36951a(AbstractC19751a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int a = aVar.mo31688a(EnumC19740a.COLUMN_UUID.key);
        int a2 = aVar.mo31688a(EnumC19740a.COLUMN_LOCAL_URI.key);
        int a3 = aVar.mo31688a(EnumC19740a.COLUMN_REMOTE_URI.key);
        int a4 = aVar.mo31688a(EnumC19740a.COLUMN_INDEX.key);
        int a5 = aVar.mo31688a(EnumC19740a.COLUMN_SIZE.key);
        int a6 = aVar.mo31688a(EnumC19740a.COLUMN_TYPE.key);
        int a7 = aVar.mo31688a(EnumC19740a.COLUMN_EXT.key);
        int a8 = aVar.mo31688a(EnumC19740a.COLUMN_STATUS.key);
        int a9 = aVar.mo31688a(EnumC19740a.COLUMN_HASH.key);
        int a10 = aVar.mo31688a(EnumC19740a.COLUMN_DISPLAY_TYPE.key);
        int a11 = aVar.mo31688a(EnumC19740a.COLUMN_MIME_TYPE.key);
        while (aVar.mo31694d()) {
            C19625c cVar = new C19625c();
            cVar.setMsgUuid(aVar.mo31692c(a));
            cVar.setLocalPath(aVar.mo31692c(a2));
            cVar.setRemoteUrl(aVar.mo31692c(a3));
            cVar.setIndex(aVar.mo31687a(a4));
            cVar.setLength(aVar.mo31691b(a5));
            cVar.setType(aVar.mo31692c(a6));
            cVar.setExtStr(aVar.mo31692c(a7));
            cVar.setStatus(aVar.mo31687a(a8));
            cVar.setHash(aVar.mo31692c(a9));
            cVar.setDisplayType(aVar.mo31692c(a10));
            cVar.setMimeType(aVar.mo31692c(a11));
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m36955b(List<C19625c> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (C19625c cVar : list) {
            if (cVar != null && !TextUtils.isEmpty(cVar.getMsgUuid())) {
                sb.append(",\"").append(cVar.getMsgUuid()).append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return false;
        }
        if (C19742b.m36979b("delete from attchment where " + EnumC19740a.COLUMN_UUID.key + " in " + ("(" + sb2.substring(1) + ")"))) {
            return m36953a(list);
        }
        return false;
    }

    /* renamed from: c */
    public static Map<String, List<C19625c>> m36957c(List<String> list) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19751a aVar = null;
        try {
            String str = "select * from attchment where " + EnumC19740a.COLUMN_UUID.key + " in (";
            for (int i = 0; i < list.size(); i++) {
                str = str + "?";
                if (i != list.size() - 1) {
                    str = str + ",";
                }
            }
            aVar = C19742b.m36973a(str + ")", (String[]) list.toArray(new String[0]));
            for (C19625c cVar : m36951a(aVar)) {
                List list2 = (List) hashMap.get(cVar.getMsgUuid());
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(cVar.getMsgUuid(), list2);
                }
                list2.add(cVar);
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMAttachmentDao getAttachments2 ", e);
            e.printStackTrace();
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36961a((AbstractC19751a) null);
            throw th;
        }
        C19741a.m36961a(aVar);
        C19699c.m36829a().mo31653a("getAttachmentsMap", currentTimeMillis);
        return hashMap;
    }

    /* renamed from: a */
    public static List<C19625c> m36952a(String str) {
        Throwable th;
        Exception e;
        ArrayList arrayList = new ArrayList();
        AbstractC19751a aVar = null;
        try {
            aVar = C19742b.m36973a("select * from attchment where " + EnumC19740a.COLUMN_UUID.key + "=?", new String[]{str});
            while (aVar.mo31694d()) {
                try {
                    C19625c cVar = new C19625c();
                    cVar.setMsgUuid(aVar.mo31692c(aVar.mo31688a(EnumC19740a.COLUMN_UUID.key)));
                    cVar.setLocalPath(aVar.mo31692c(aVar.mo31688a(EnumC19740a.COLUMN_LOCAL_URI.key)));
                    cVar.setRemoteUrl(aVar.mo31692c(aVar.mo31688a(EnumC19740a.COLUMN_REMOTE_URI.key)));
                    cVar.setIndex(aVar.mo31687a(aVar.mo31688a(EnumC19740a.COLUMN_INDEX.key)));
                    cVar.setLength(aVar.mo31691b(aVar.mo31688a(EnumC19740a.COLUMN_SIZE.key)));
                    cVar.setType(aVar.mo31692c(aVar.mo31688a(EnumC19740a.COLUMN_TYPE.key)));
                    cVar.setExtStr(aVar.mo31692c(aVar.mo31688a(EnumC19740a.COLUMN_EXT.key)));
                    cVar.setStatus(aVar.mo31687a(aVar.mo31688a(EnumC19740a.COLUMN_STATUS.key)));
                    cVar.setHash(aVar.mo31692c(aVar.mo31688a(EnumC19740a.COLUMN_HASH.key)));
                    cVar.setDisplayType(aVar.mo31692c(aVar.mo31688a(EnumC19740a.COLUMN_DISPLAY_TYPE.key)));
                    cVar.setMimeType(aVar.mo31692c(aVar.mo31688a(EnumC19740a.COLUMN_MIME_TYPE.key)));
                    arrayList.add(cVar);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C19512f.m36457b("imsdk", "IMAttachmentDao getAttachments ", e);
                        e.printStackTrace();
                        C19510e.m36439a(e);
                        C19741a.m36961a(aVar);
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        C19741a.m36961a(aVar);
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            C19512f.m36457b("imsdk", "IMAttachmentDao getAttachments ", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar);
            throw th;
        }
        C19741a.m36961a(aVar);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m36953a(List<C19625c> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i = 0;
        for (C19625c cVar : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC19740a.COLUMN_UUID.key, cVar.getMsgUuid());
            contentValues.put(EnumC19740a.COLUMN_LOCAL_URI.key, cVar.getLocalPath());
            contentValues.put(EnumC19740a.COLUMN_REMOTE_URI.key, cVar.getRemoteUrl());
            contentValues.put(EnumC19740a.COLUMN_HASH.key, cVar.getHash());
            contentValues.put(EnumC19740a.COLUMN_INDEX.key, Integer.valueOf(cVar.getIndex()));
            contentValues.put(EnumC19740a.COLUMN_EXT.key, cVar.getExtStr());
            contentValues.put(EnumC19740a.COLUMN_STATUS.key, Integer.valueOf(cVar.getStatus()));
            contentValues.put(EnumC19740a.COLUMN_TYPE.key, cVar.getType());
            contentValues.put(EnumC19740a.COLUMN_SIZE.key, Long.valueOf(cVar.getLength()));
            contentValues.put(EnumC19740a.COLUMN_DISPLAY_TYPE.key, cVar.getDisplayType());
            contentValues.put(EnumC19740a.COLUMN_MIME_TYPE.key, cVar.getMimeType());
            if (C19742b.m36972a("attchment", contentValues) >= 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return true;
        }
        return false;
    }
}
