package com.bytedance.p1399im.core.p1416h;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19743b;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1408d.C19639i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.h.a */
public final class C19700a {
    static {
        Covode.recordClassIndex(22544);
    }

    private C19700a() {
    }

    /* renamed from: com.bytedance.im.core.h.a$a */
    public static class C19702a {

        /* renamed from: a */
        public static final C19700a f46847a = new C19700a((byte) 0);

        static {
            Covode.recordClassIndex(22546);
        }
    }

    /* renamed from: a */
    private static String m36841a() {
        if (!C19483d.m36365a().mo31141b().f46232aN) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE VIRTUAL TABLE IF NOT EXISTS fts_group_index_table USING fts4(");
        if (C19483d.m36365a().mo31141b().f46267g) {
            sb.append("tokenize=mmicu,");
        }
        sb.append("fts_name);");
        return sb.toString();
    }

    /* renamed from: b */
    private static List<String> m36843b() {
        if (!C19483d.m36365a().mo31141b().f46232aN) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER conversation_bu BEFORE UPDATE ON conversation_core BEGIN\n  DELETE FROM fts_group_index_table WHERE rowid=old.").append(C19743b.EnumC19744a.COLUMN_ID.key).append(";\nEND;");
        arrayList.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TRIGGER conversation_bd BEFORE DELETE ON conversation_core BEGIN\n  DELETE FROM fts_group_index_table WHERE rowid=old.").append(C19743b.EnumC19744a.COLUMN_ID.key).append(";\nEND;");
        arrayList.add(sb2.toString());
        return arrayList;
    }

    /* synthetic */ C19700a(byte b) {
        this();
    }

    /* renamed from: a */
    public static void m36842a(AbstractC19759b bVar) {
        if (C19483d.m36365a().mo31141b().f46232aN) {
            bVar.mo31714a(m36841a());
            for (String str : m36843b()) {
                bVar.mo31714a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo31657a(AbstractC19759b bVar, int i) {
        if (C19483d.m36365a().mo31141b().f46232aN && i < 33) {
            bVar.mo31714a(m36841a());
            for (String str : m36843b()) {
                bVar.mo31714a(str);
            }
            RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
                /* class com.bytedance.p1399im.core.p1416h.C19700a.C197011 */

                static {
                    Covode.recordClassIndex(22545);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Boolean mo31187a() {
                    System.currentTimeMillis();
                    List<C19639i> a = C19743b.m36984a(C19742b.m36973a("SELECT * FROM conversation_core", (String[]) null));
                    if (C19483d.m36365a().mo31141b().f46232aN) {
                        C19705d.m36852b();
                    }
                    a.size();
                    if (C19483d.m36365a().f46157b.mo27960b() != null) {
                        C19483d.m36365a().f46157b.mo27960b();
                    }
                    return true;
                }
            }, (AbstractC19985b) null);
        }
    }
}
