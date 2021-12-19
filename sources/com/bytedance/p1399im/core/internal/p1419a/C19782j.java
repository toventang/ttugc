package com.bytedance.p1399im.core.internal.p1419a;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.j */
public final class C19782j {
    static {
        Covode.recordClassIndex(22626);
    }

    /* renamed from: com.bytedance.im.core.internal.a.j$a */
    public enum EnumC19783a {
        COLUMN_MSG_ID("uuid", "TEXT"),
        COLUMN_KEY("key", "TEXT"),
        COLUMN_VALUE("value", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22627);
        }

        private EnumC19783a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: b */
    public static String[] m37213b() {
        return new String[]{"create index msg_ky_id_index on message_kv(" + EnumC19783a.COLUMN_MSG_ID.key + ")", "create index msg_ky_key_index on message_kv(" + EnumC19783a.COLUMN_KEY.key + ")"};
    }

    /* renamed from: a */
    public static String m37208a() {
        StringBuilder sb = new StringBuilder("create table if not exists message_kv(");
        EnumC19783a[] values = EnumC19783a.values();
        for (EnumC19783a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        sb.append("primary key(").append(EnumC19783a.COLUMN_MSG_ID.key).append(",").append(EnumC19783a.COLUMN_KEY.key).append("));");
        return sb.toString();
    }

    /* renamed from: a */
    public static List<Pair<String, String>> m37210a(String str) {
        AbstractC19751a aVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            aVar = C19742b.m36973a("select * from message_kv where " + EnumC19783a.COLUMN_KEY.key + "=?", new String[]{str});
            while (aVar.mo31694d()) {
                arrayList.add(new Pair(aVar.mo31692c(aVar.mo31688a(EnumC19783a.COLUMN_MSG_ID.key)), aVar.mo31692c(aVar.mo31688a(EnumC19783a.COLUMN_VALUE.key))));
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgKvDaoget", e);
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
    public static String m37209a(String str, String str2) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            aVar = C19742b.m36973a("select value from message_kv where " + EnumC19783a.COLUMN_MSG_ID.key + "=? AND " + EnumC19783a.COLUMN_KEY.key + "=?", new String[]{str, str2});
            try {
                if (aVar.mo31693c()) {
                    String c = aVar.mo31692c(aVar.mo31688a(EnumC19783a.COLUMN_VALUE.key));
                    C19741a.m36961a(aVar);
                    return c;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMMsgKvDaoget", e);
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
            C19512f.m36457b("imsdk", "IMMsgKvDaoget", e);
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

    /* renamed from: b */
    private static boolean m37212b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C19512f.m36457b("IMMsgKvDao", "delete invalid:" + str + ", " + str2, (Throwable) null);
            return false;
        }
        try {
            boolean b = C19742b.m36979b("delete from message_kv where " + EnumC19783a.COLUMN_MSG_ID.key + "=\"" + str + "\" AND " + EnumC19783a.COLUMN_KEY.key + "=\"" + str2 + "\"");
            if (!b) {
                C19512f.m36457b("imsdk", "IMMsgKvDaodelete failed:" + str + ", " + str2, (Throwable) null);
            }
            return b;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMMsgKvDao", (Throwable) null);
            e.printStackTrace();
            C19510e.m36439a(e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m37211a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return m37212b(str, str2);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C19512f.m36457b("imsdk", "IMMsgKvDaoinsertOrUpdate params invalid, cid:" + str + ", key:" + str2, (Throwable) null);
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC19783a.COLUMN_MSG_ID.key, str);
        contentValues.put(EnumC19783a.COLUMN_KEY.key, str2);
        contentValues.put(EnumC19783a.COLUMN_VALUE.key, str3);
        long c = C19742b.m36980c("message_kv", contentValues);
        if (c < 0) {
            C19512f.m36457b("imsdk", "IMMsgKvDaoinsertOrUpdate failed, cid:" + str + ", key:" + str2 + ", value:" + str3 + ", result:" + c, (Throwable) null);
        }
        if (c > 0) {
            return true;
        }
        return false;
    }
}
