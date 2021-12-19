package com.bytedance.p1399im.core.internal.p1419a;

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
import com.bytedance.p1399im.core.p1408d.C19663l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.g */
public final class C19773g {
    static {
        Covode.recordClassIndex(22617);
    }

    /* renamed from: com.bytedance.im.core.internal.a.g$a */
    public enum EnumC19774a {
        COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
        COLUMN_VERSION("info_version", "BIGINT"),
        COLUMN_STICK_TOP("stick_top", "INTEGER"),
        COLUMN_MUTE("mute", "INTEGER"),
        COLUMN_EXT("ext", "TEXT"),
        COLUMN_FAVORITE("favor", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22618);
        }

        private EnumC19774a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    public static String m37160a() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_setting (");
        EnumC19774a[] values = EnumC19774a.values();
        for (EnumC19774a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: a */
    public static C19663l m37159a(String str) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        C19663l lVar = null;
        lVar = null;
        AbstractC19751a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            aVar = C19742b.m36973a("select * from conversation_setting where " + EnumC19774a.COLUMN_ID.key + "=?", new String[]{str});
            try {
                if (aVar.mo31693c()) {
                    C19663l lVar2 = new C19663l();
                    lVar2.setConversationId(aVar.mo31692c(aVar.mo31688a(EnumC19774a.COLUMN_ID.key)));
                    lVar2.setVersion(aVar.mo31691b(aVar.mo31688a(EnumC19774a.COLUMN_VERSION.key)));
                    lVar2.setStickTop(aVar.mo31687a(aVar.mo31688a(EnumC19774a.COLUMN_STICK_TOP.key)));
                    lVar2.setMute(aVar.mo31687a(aVar.mo31688a(EnumC19774a.COLUMN_MUTE.key)));
                    lVar2.setExtStr(aVar.mo31692c(aVar.mo31688a(EnumC19774a.COLUMN_EXT.key)));
                    lVar2.setFavor(aVar.mo31687a(aVar.mo31688a(EnumC19774a.COLUMN_FAVORITE.key)));
                    lVar = lVar2;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMConversationSettingDao get ", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    return lVar;
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
            C19512f.m36457b("imsdk", "IMConversationSettingDao get ", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return lVar;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C19741a.m36961a(aVar);
        return lVar;
    }

    /* renamed from: a */
    public static Map<String, C19663l> m37161a(List<String> list) {
        if (list.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i = C19483d.m36365a().mo31141b().f46237ab.batchQueryEnableAndQueryLimit;
        String str = "select * from conversation_setting where " + EnumC19774a.COLUMN_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        AbstractC19751a aVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i2 == i - 1 || i3 == list.size() - 1) {
                sb.append("'").append(list.get(i3)).append("')");
                try {
                    aVar = C19742b.m36973a(sb.toString(), (String[]) null);
                    m37162a(aVar, hashMap);
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "IMConversationSettingDao getSettingInfoMap ", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                } catch (Throwable th) {
                    C19741a.m36961a(aVar);
                    throw th;
                }
                C19741a.m36961a(aVar);
                sb = new StringBuilder(str);
                i2 = 0;
            } else {
                i2++;
                sb.append("'").append(list.get(i3)).append("',");
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m37163a(C19663l lVar) {
        boolean z = false;
        if (lVar == null || TextUtils.isEmpty(lVar.getConversationId())) {
            return false;
        }
        Boolean bool = false;
        AbstractC19766c cVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into conversation_setting(");
            for (EnumC19774a aVar : EnumC19774a.values()) {
                sb.append(aVar.key).append(",");
                sb2.append("?,");
            }
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            cVar = C19742b.m36981c(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
            if (cVar != null) {
                cVar.mo31728d();
                cVar.mo31725a(EnumC19774a.COLUMN_ID.ordinal() + 1, C19996e.m37758b(lVar.getConversationId()));
                cVar.mo31724a(EnumC19774a.COLUMN_VERSION.ordinal() + 1, lVar.getVersion());
                cVar.mo31724a(EnumC19774a.COLUMN_STICK_TOP.ordinal() + 1, (long) lVar.getStickTop());
                cVar.mo31724a(EnumC19774a.COLUMN_MUTE.ordinal() + 1, (long) lVar.getMute());
                cVar.mo31725a(EnumC19774a.COLUMN_EXT.ordinal() + 1, C19996e.m37758b(lVar.getExtStr()));
                cVar.mo31724a(EnumC19774a.COLUMN_FAVORITE.ordinal() + 1, (long) lVar.getFavor());
            }
            if (cVar.mo31723a() > 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationSettingDao insertOrUpdate", e);
            e.printStackTrace();
            C19510e.m36439a(e);
        } catch (Throwable th) {
            C19741a.m36964a((AbstractC19766c) null);
            throw th;
        }
        C19741a.m36964a(cVar);
        return bool.booleanValue();
    }

    /* renamed from: a */
    private static void m37162a(AbstractC19751a aVar, Map<String, C19663l> map) {
        if (aVar != null) {
            int a = aVar.mo31688a(EnumC19774a.COLUMN_ID.key);
            int a2 = aVar.mo31688a(EnumC19774a.COLUMN_VERSION.key);
            int a3 = aVar.mo31688a(EnumC19774a.COLUMN_STICK_TOP.key);
            int a4 = aVar.mo31688a(EnumC19774a.COLUMN_MUTE.key);
            int a5 = aVar.mo31688a(EnumC19774a.COLUMN_EXT.key);
            int a6 = aVar.mo31688a(EnumC19774a.COLUMN_FAVORITE.key);
            while (aVar.mo31694d()) {
                C19663l lVar = new C19663l();
                String c = aVar.mo31692c(a);
                lVar.setConversationId(c);
                lVar.setVersion(aVar.mo31691b(a2));
                lVar.setStickTop(aVar.mo31687a(a3));
                lVar.setMute(aVar.mo31687a(a4));
                lVar.setExtStr(aVar.mo31692c(a5));
                lVar.setFavor(aVar.mo31687a(a6));
                map.put(c, lVar);
            }
        }
    }
}
