package com.bytedance.p1399im.core.p1416h;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.p1404a.C19483d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.h.b */
public final class C19703b {
    static {
        Covode.recordClassIndex(22547);
    }

    /* renamed from: a */
    public static void m36846a() {
        if (C19483d.m36365a().mo31141b().f46232aN) {
            C19705d.m36851a();
        }
    }

    /* renamed from: c */
    private static List<String> m36850c() {
        if (!C19483d.m36365a().mo31141b().f46232aN) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP TRIGGER IF EXISTS msg_ad;");
        arrayList.add("DROP TRIGGER IF EXISTS msg_au;");
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER msg_ad AFTER DELETE ON msg BEGIN\n  DELETE FROM fts_msg_index_table WHERE rowid=old.").append("rowid;\nEND;");
        arrayList.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TRIGGER msg_au AFTER UPDATE ON msg\nFOR EACH ROW WHEN (new.").append(C19777i.EnumC19780a.COLUMN_DELETED.key).append("=1 OR new.").append(C19777i.EnumC19780a.COLUMN_NET_STATUS.key).append("=1)\nBEGIN\n  DELETE FROM fts_msg_index_table where rowid=new.rowid;\nEND;");
        arrayList.add(sb2.toString());
        return arrayList;
    }

    /* renamed from: b */
    private static String m36849b() {
        if (!C19483d.m36365a().mo31141b().f46232aN) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE VIRTUAL TABLE IF NOT EXISTS fts_msg_index_table USING fts4(");
        if (C19483d.m36365a().mo31141b().f46267g) {
            sb.append("tokenize=mmicu,");
        }
        sb.append(C19777i.EnumC19780a.COLUMN_CONVERSATION_ID.key).append(",");
        sb.append(C19777i.EnumC19780a.COLUMN_CREATE_TIME.key).append(",");
        sb.append("fts_search_content,");
        sb.append(C19777i.EnumC19780a.COLUMN_MSG_ID.key).append(",");
        sb.append("notindexed=").append(C19777i.EnumC19780a.COLUMN_CONVERSATION_ID.key).append(",");
        sb.append("notindexed=").append(C19777i.EnumC19780a.COLUMN_MSG_ID.key).append(",");
        sb.append("notindexed=").append(C19777i.EnumC19780a.COLUMN_CREATE_TIME.key).append(");");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m36847a(AbstractC19759b bVar) {
        if (C19483d.m36365a().mo31141b().f46232aN) {
            bVar.mo31714a(m36849b());
            for (String str : m36850c()) {
                bVar.mo31714a(str);
            }
        }
    }

    /* renamed from: a */
    public static void m36848a(AbstractC19759b bVar, int i) {
        if (C19483d.m36365a().mo31141b().f46232aN && i < 38) {
            bVar.mo31714a(m36849b());
            for (String str : m36850c()) {
                bVar.mo31714a(str);
            }
        }
    }
}
