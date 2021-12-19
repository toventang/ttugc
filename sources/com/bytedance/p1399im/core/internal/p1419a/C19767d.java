package com.bytedance.p1399im.core.internal.p1419a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;

/* renamed from: com.bytedance.im.core.internal.a.d */
public final class C19767d {
    static {
        Covode.recordClassIndex(22611);
    }

    /* renamed from: b */
    public static String m37131b() {
        return "create index id_index on conversation_kv(" + EnumC19768a.COLUMN_CONV_ID.key + ")";
    }

    /* renamed from: com.bytedance.im.core.internal.a.d$a */
    public enum EnumC19768a {
        COLUMN_CONV_ID("conv_id", "TEXT"),
        COLUMN_KEY("key", "TEXT"),
        COLUMN_VALUE("value", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22612);
        }

        private EnumC19768a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    public static String m37128a() {
        StringBuilder sb = new StringBuilder("create table if not exists conversation_kv(");
        EnumC19768a[] values = EnumC19768a.values();
        for (EnumC19768a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        sb.append("primary key(").append(EnumC19768a.COLUMN_CONV_ID.key).append(",").append(EnumC19768a.COLUMN_KEY.key).append("));");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m37129a(String str, String str2) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        AbstractC19751a aVar2 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            aVar = C19742b.m36973a("select value from conversation_kv where " + EnumC19768a.COLUMN_CONV_ID.key + "=? AND " + EnumC19768a.COLUMN_KEY.key + "=?", new String[]{str, str2});
            try {
                if (aVar.mo31693c()) {
                    String c = aVar.mo31692c(aVar.mo31688a(EnumC19768a.COLUMN_VALUE.key));
                    C19741a.m36961a(aVar);
                    return c;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMConversationKvDao get", e);
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
            C19512f.m36457b("imsdk", "IMConversationKvDao get", e);
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
    private static boolean m37132b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C19512f.m36457b("IMConversationKvDao ", "delete invalid:" + str + ", " + str2, (Throwable) null);
            return false;
        }
        try {
            boolean b = C19742b.m36979b("delete from conversation_kv where " + EnumC19768a.COLUMN_CONV_ID.key + "=\"" + str + "\" AND " + EnumC19768a.COLUMN_KEY.key + "=\"" + str2 + "\"");
            if (!b) {
                C19512f.m36457b("imsdk", "IMConversationKvDao delete failed:" + str + ", " + str2, (Throwable) null);
            }
            return b;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationKvDao ", (Throwable) null);
            e.printStackTrace();
            C19510e.m36439a(e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m37130a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return m37132b(str, str2);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C19512f.m36457b("imsdk", "IMConversationKvDao insertOrUpdate params invalid, cid:" + str + ", key:" + str2, (Throwable) null);
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC19768a.COLUMN_CONV_ID.key, str);
        contentValues.put(EnumC19768a.COLUMN_KEY.key, str2);
        contentValues.put(EnumC19768a.COLUMN_VALUE.key, str3);
        long c = C19742b.m36980c("conversation_kv", contentValues);
        if (c < 0) {
            C19512f.m36457b("imsdk", "IMConversationKvDao insertOrUpdate failed, cid:" + str + ", key:" + str2 + ", value:" + str3 + ", result:" + c, (Throwable) null);
        }
        if (c > 0) {
            return true;
        }
        return false;
    }
}
