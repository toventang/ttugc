package com.bytedance.p1399im.core.internal.p1419a.p1421b;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.p1410b.C19603a;
import com.kakao.usermgmt.StringSet;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.b.b */
public final class C19747b {

    /* renamed from: a */
    static boolean f46933a;

    static {
        Covode.recordClassIndex(22591);
    }

    /* renamed from: a */
    public static boolean m36992a() {
        if (f46933a) {
            return false;
        }
        C19483d.m36365a();
        return false;
    }

    /* renamed from: b */
    private static String m36996b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create virtual table if not exists fts_entity using fts4 (");
        EnumC19748a[] values = EnumC19748a.values();
        for (EnumC19748a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        sb.append(" notindexed=").append(EnumC19748a.COLUMN_EXTRA.key).append(",");
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: com.bytedance.im.core.internal.a.b.b$a */
    public enum EnumC19748a {
        COLUMN_ID("combined_key", "TEXT NOT NULL"),
        COLUMN_TYPE(StringSet.type, "INTEGER"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
        COLUMN_MESSAGE_UUID("message_uuid", "TEXT"),
        COLUMN_USER_ID("user_id", "TEXT"),
        COLUMN_ENTITY_ID("entity_id", "TEXT"),
        COLUMN_SEARCH_CONTENT("search_content", "TEXT"),
        COLUMN_EXTRA("extra", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22592);
        }

        private EnumC19748a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    public static void m36991a(AbstractC19759b bVar) {
        if (!C19483d.m36365a().mo31141b().f46232aN) {
            f46933a = true;
            return;
        }
        try {
            C19483d.m36365a();
            bVar.mo31714a(m36996b());
        } catch (Exception e) {
            C19512f.m36457b("IMFTSEntityDao", "createTable failed", e);
            f46933a = true;
        }
    }

    /* renamed from: a */
    private static ContentValues m36990a(C19603a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC19748a.COLUMN_ID.key, aVar.mo31384a());
        contentValues.put(EnumC19748a.COLUMN_TYPE.key, Integer.valueOf(aVar.f46572b));
        contentValues.put(EnumC19748a.COLUMN_CONVERSATION_ID.key, aVar.f46573c);
        contentValues.put(EnumC19748a.COLUMN_MESSAGE_UUID.key, aVar.f46574d);
        contentValues.put(EnumC19748a.COLUMN_USER_ID.key, aVar.f46575e);
        contentValues.put(EnumC19748a.COLUMN_ENTITY_ID.key, aVar.f46576f);
        contentValues.put(EnumC19748a.COLUMN_SEARCH_CONTENT.key, aVar.f46577g);
        contentValues.put(EnumC19748a.COLUMN_EXTRA.key, aVar.f46578h);
        return contentValues;
    }

    /* renamed from: a */
    public static boolean m36993a(List<C19603a> list) {
        if (f46933a) {
            return false;
        }
        C19512f.m36457b("imsdk", new StringBuilder("IMFTSEntityDao addFTSEntity, entityList:").append(list == null ? null : Integer.valueOf(list.size())).toString(), (Throwable) null);
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i = 0;
        for (C19603a aVar : list) {
            if (C19742b.m36972a("fts_entity", m36990a(aVar)) >= 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m36997b(List<C19603a> list) {
        if (f46933a) {
            return false;
        }
        C19512f.m36457b("imsdk", new StringBuilder("IMFTSEntityDao deleteFTSEntity, list:").append(list == null ? null : Integer.valueOf(list.size())).toString(), (Throwable) null);
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (C19603a aVar : list) {
                if (aVar != null && !TextUtils.isEmpty(aVar.mo31384a())) {
                    sb.append(",\"").append(aVar.mo31384a()).append('\"');
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return C19742b.m36979b("delete from fts_entity where " + EnumC19748a.COLUMN_ID.key + " in " + ("(" + sb2.substring(1) + ")"));
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m36994a(List<String> list, String str) {
        if (f46933a) {
            return false;
        }
        C19512f.m36457b("imsdk", new StringBuilder("IMFTSEntityDao deleteFTSEntityById, list:").append(list == null ? null : Integer.valueOf(list.size())).append(", columnKey:").append(str).toString(), (Throwable) null);
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(",\"").append(str2).append('\"');
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return C19742b.m36979b("delete from fts_entity where " + str + " in " + ("(" + sb2.substring(1) + ")"));
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m36995a(List<String> list, String str, int i) {
        if (f46933a) {
            return false;
        }
        C19512f.m36457b("imsdk", new StringBuilder("IMFTSEntityDao deleteFTSEntityByIdAndType, list:").append(list == null ? null : Integer.valueOf(list.size())).append(", columnKey:").append(str).append(", type:").append(i).toString(), (Throwable) null);
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(",\"").append(str2).append('\"');
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return C19742b.m36979b("delete from fts_entity where " + str + " in " + ("(" + sb2.substring(1) + ")") + " and " + EnumC19748a.COLUMN_TYPE.key + " =" + i);
            }
        }
        return true;
    }
}
