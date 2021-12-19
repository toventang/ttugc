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
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.p1416h.C19705d;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.b */
public final class C19743b {
    static {
        Covode.recordClassIndex(22587);
    }

    /* renamed from: a */
    public static boolean m36987a(C19639i iVar) {
        boolean z = false;
        if (iVar == null || TextUtils.isEmpty(iVar.getConversationId())) {
            return false;
        }
        Boolean bool = false;
        AbstractC19766c cVar = null;
        try {
            if (C19483d.m36365a().mo31141b().f46220aB) {
                C19742b.m36974a("IMConversationCoreDao.insertOrUpdate");
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC19744a.COLUMN_ID.key, C19996e.m37758b(iVar.getConversationId()));
                contentValues.put(EnumC19744a.COLUMN_VERSION.key, Long.valueOf(iVar.getVersion()));
                contentValues.put(EnumC19744a.COLUMN_NAME.key, C19996e.m37758b(iVar.getName()));
                contentValues.put(EnumC19744a.COLUMN_DESC.key, C19996e.m37758b(iVar.getDesc()));
                contentValues.put(EnumC19744a.COLUMN_ICON.key, C19996e.m37758b(iVar.getIcon()));
                contentValues.put(EnumC19744a.COLUMN_NOTICE.key, C19996e.m37758b(iVar.getNotice()));
                contentValues.put(EnumC19744a.COLUMN_OWNER_ID.key, Long.valueOf(iVar.getOwner()));
                contentValues.put(EnumC19744a.COLUMN_SEC_OWNER.key, C19996e.m37758b(iVar.getSecOwner()));
                contentValues.put(EnumC19744a.COLUMN_SILENT.key, Integer.valueOf(iVar.getSilent()));
                contentValues.put(EnumC19744a.COLUMN_SILENT_NORMAL_ONLY.key, Integer.valueOf(iVar.getSilentNormalOnly()));
                contentValues.put(EnumC19744a.COLUMN_MODE.key, Integer.valueOf(iVar.getMode()));
                contentValues.put(EnumC19744a.COLUMN_EXT.key, C19996e.m37758b(iVar.getExtStr()));
                if (C19742b.m36980c("conversation_core", contentValues) > 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb.append(" replace into conversation_core(");
                for (EnumC19744a aVar : EnumC19744a.values()) {
                    sb.append(aVar.key).append(",");
                    sb2.append("?,");
                }
                String sb3 = sb.toString();
                String sb4 = sb2.toString();
                C19742b.m36974a("IMConversationCoreDao.insertOrUpdate");
                cVar = C19742b.m36981c(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
                if (cVar != null) {
                    cVar.mo31728d();
                    cVar.mo31725a(EnumC19744a.COLUMN_ID.ordinal() + 1, C19996e.m37758b(iVar.getConversationId()));
                    cVar.mo31724a(EnumC19744a.COLUMN_VERSION.ordinal() + 1, iVar.getVersion());
                    cVar.mo31725a(EnumC19744a.COLUMN_NAME.ordinal() + 1, C19996e.m37758b(iVar.getName()));
                    cVar.mo31725a(EnumC19744a.COLUMN_ICON.ordinal() + 1, C19996e.m37758b(iVar.getIcon()));
                    cVar.mo31725a(EnumC19744a.COLUMN_DESC.ordinal() + 1, C19996e.m37758b(iVar.getDesc()));
                    cVar.mo31725a(EnumC19744a.COLUMN_NOTICE.ordinal() + 1, C19996e.m37758b(iVar.getNotice()));
                    cVar.mo31724a(EnumC19744a.COLUMN_OWNER_ID.ordinal() + 1, iVar.getOwner());
                    cVar.mo31725a(EnumC19744a.COLUMN_SEC_OWNER.ordinal() + 1, C19996e.m37758b(iVar.getSecOwner()));
                    cVar.mo31724a(EnumC19744a.COLUMN_SILENT.ordinal() + 1, (long) iVar.getSilent());
                    cVar.mo31724a(EnumC19744a.COLUMN_SILENT_NORMAL_ONLY.ordinal() + 1, (long) iVar.getSilentNormalOnly());
                    cVar.mo31724a(EnumC19744a.COLUMN_MODE.ordinal() + 1, (long) iVar.getMode());
                    cVar.mo31725a(EnumC19744a.COLUMN_EXT.ordinal() + 1, C19996e.m37758b(iVar.getExtStr()));
                }
                if (cVar.mo31723a() > 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            if (bool.booleanValue() && C19483d.m36365a().mo31141b().f46232aN) {
                C19705d.m36852b();
            }
            C19742b.m36975a("IMConversationCoreDao.insertOrUpdate", true);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMConversationCoreDao insertOrUpdate ", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19742b.m36975a("IMConversationCoreDao.insertOrUpdate", true);
        } catch (Throwable th) {
            C19742b.m36975a("IMConversationCoreDao.insertOrUpdate", true);
            C19741a.m36964a((AbstractC19766c) null);
            throw th;
        }
        C19741a.m36964a(cVar);
        return bool.booleanValue();
    }

    /* renamed from: a */
    public static String m36983a() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_core (");
        EnumC19744a[] values = EnumC19744a.values();
        for (EnumC19744a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* renamed from: com.bytedance.im.core.internal.a.b$a */
    public enum EnumC19744a {
        COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
        COLUMN_VERSION("info_version", "BIGINT"),
        COLUMN_NAME(StringSet.name, "TEXT"),
        COLUMN_DESC("desc", "TEXT"),
        COLUMN_ICON("icon", "TEXT"),
        COLUMN_NOTICE("notice", "TEXT"),
        COLUMN_OWNER_ID("owner_id", "INTEGER DEFAULT -1"),
        COLUMN_SEC_OWNER("sec_owner", "TEXT"),
        COLUMN_SILENT("silent", "INTEGER DEFAULT 0"),
        COLUMN_SILENT_NORMAL_ONLY("silent_normal_only", "INTEGER DEFAULT 0"),
        COLUMN_MODE("mode", "INTEGER DEFAULT -1"),
        COLUMN_EXT("ext", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22588);
        }

        private EnumC19744a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    /* renamed from: a */
    public static List<C19639i> m36984a(AbstractC19751a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int a = aVar.mo31688a(EnumC19744a.COLUMN_ID.key);
        int a2 = aVar.mo31688a(EnumC19744a.COLUMN_VERSION.key);
        int a3 = aVar.mo31688a(EnumC19744a.COLUMN_NAME.key);
        int a4 = aVar.mo31688a(EnumC19744a.COLUMN_ICON.key);
        int a5 = aVar.mo31688a(EnumC19744a.COLUMN_DESC.key);
        int a6 = aVar.mo31688a(EnumC19744a.COLUMN_NOTICE.key);
        int a7 = aVar.mo31688a(EnumC19744a.COLUMN_OWNER_ID.key);
        int a8 = aVar.mo31688a(EnumC19744a.COLUMN_SEC_OWNER.key);
        int a9 = aVar.mo31688a(EnumC19744a.COLUMN_SILENT.key);
        int a10 = aVar.mo31688a(EnumC19744a.COLUMN_SILENT_NORMAL_ONLY.key);
        int a11 = aVar.mo31688a(EnumC19744a.COLUMN_MODE.key);
        int a12 = aVar.mo31688a(EnumC19744a.COLUMN_EXT.key);
        while (aVar.mo31694d()) {
            C19639i iVar = new C19639i();
            iVar.setConversationId(aVar.mo31692c(a));
            iVar.setVersion(aVar.mo31691b(a2));
            iVar.setName(aVar.mo31692c(a3));
            iVar.setIcon(aVar.mo31692c(a4));
            iVar.setDesc(aVar.mo31692c(a5));
            iVar.setNotice(aVar.mo31692c(a6));
            iVar.setOwner(aVar.mo31691b(a7));
            iVar.setSecOwner(aVar.mo31692c(a8));
            iVar.setSilent(aVar.mo31687a(a9));
            iVar.setSilentNormalOnly(aVar.mo31687a(a10));
            iVar.setMode(aVar.mo31687a(a11));
            iVar.setExtStr(aVar.mo31692c(a12));
            arrayList.add(iVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C19639i m36982a(String str) {
        Throwable th;
        AbstractC19751a aVar;
        Exception e;
        C19639i iVar = null;
        iVar = null;
        AbstractC19751a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            aVar = C19742b.m36973a("select * from conversation_core where " + EnumC19744a.COLUMN_ID.key + "=?", new String[]{str});
            try {
                if (aVar.mo31693c()) {
                    C19639i iVar2 = new C19639i();
                    iVar2.setConversationId(aVar.mo31692c(aVar.mo31688a(EnumC19744a.COLUMN_ID.key)));
                    iVar2.setVersion(aVar.mo31691b(aVar.mo31688a(EnumC19744a.COLUMN_VERSION.key)));
                    iVar2.setName(aVar.mo31692c(aVar.mo31688a(EnumC19744a.COLUMN_NAME.key)));
                    iVar2.setIcon(aVar.mo31692c(aVar.mo31688a(EnumC19744a.COLUMN_ICON.key)));
                    iVar2.setDesc(aVar.mo31692c(aVar.mo31688a(EnumC19744a.COLUMN_DESC.key)));
                    iVar2.setNotice(aVar.mo31692c(aVar.mo31688a(EnumC19744a.COLUMN_NOTICE.key)));
                    iVar2.setOwner(aVar.mo31691b(aVar.mo31688a(EnumC19744a.COLUMN_OWNER_ID.key)));
                    iVar2.setSecOwner(aVar.mo31692c(aVar.mo31688a(EnumC19744a.COLUMN_SEC_OWNER.key)));
                    iVar2.setSilent(aVar.mo31687a(aVar.mo31688a(EnumC19744a.COLUMN_SILENT.key)));
                    iVar2.setSilentNormalOnly(aVar.mo31687a(aVar.mo31688a(EnumC19744a.COLUMN_SILENT_NORMAL_ONLY.key)));
                    iVar2.setMode(aVar.mo31687a(aVar.mo31688a(EnumC19744a.COLUMN_MODE.key)));
                    iVar2.setExtStr(aVar.mo31692c(aVar.mo31688a(EnumC19744a.COLUMN_EXT.key)));
                    iVar = iVar2;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C19512f.m36457b("imsdk", "IMConversationCoreDao get ", e);
                    e.printStackTrace();
                    C19510e.m36439a(e);
                    C19741a.m36961a(aVar);
                    return iVar;
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
            C19512f.m36457b("imsdk", "IMConversationCoreDao get ", e);
            e.printStackTrace();
            C19510e.m36439a(e);
            C19741a.m36961a(aVar);
            return iVar;
        } catch (Throwable th3) {
            th = th3;
            C19741a.m36961a(aVar2);
            throw th;
        }
        C19741a.m36961a(aVar);
        return iVar;
    }

    /* renamed from: a */
    public static Map<String, C19639i> m36985a(List<String> list) {
        if (list.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i = C19483d.m36365a().mo31141b().f46237ab.batchQueryEnableAndQueryLimit;
        String str = "select * from conversation_core where " + EnumC19744a.COLUMN_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        AbstractC19751a aVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i2 == i - 1 || i3 == list.size() - 1) {
                sb.append("'").append(list.get(i3)).append("')");
                try {
                    aVar = C19742b.m36973a(sb.toString(), (String[]) null);
                    m36986a(aVar, hashMap);
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "IMConversationCoreDao getCoreInfoMap ", e);
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
    private static void m36986a(AbstractC19751a aVar, Map<String, C19639i> map) {
        if (aVar != null) {
            int a = aVar.mo31688a(EnumC19744a.COLUMN_ID.key);
            int a2 = aVar.mo31688a(EnumC19744a.COLUMN_VERSION.key);
            int a3 = aVar.mo31688a(EnumC19744a.COLUMN_NAME.key);
            int a4 = aVar.mo31688a(EnumC19744a.COLUMN_ICON.key);
            int a5 = aVar.mo31688a(EnumC19744a.COLUMN_DESC.key);
            int a6 = aVar.mo31688a(EnumC19744a.COLUMN_NOTICE.key);
            int a7 = aVar.mo31688a(EnumC19744a.COLUMN_OWNER_ID.key);
            int a8 = aVar.mo31688a(EnumC19744a.COLUMN_SEC_OWNER.key);
            int a9 = aVar.mo31688a(EnumC19744a.COLUMN_SILENT.key);
            int a10 = aVar.mo31688a(EnumC19744a.COLUMN_SILENT_NORMAL_ONLY.key);
            int a11 = aVar.mo31688a(EnumC19744a.COLUMN_MODE.key);
            int a12 = aVar.mo31688a(EnumC19744a.COLUMN_EXT.key);
            while (aVar.mo31694d()) {
                C19639i iVar = new C19639i();
                String c = aVar.mo31692c(a);
                iVar.setConversationId(c);
                iVar.setVersion(aVar.mo31691b(a2));
                iVar.setName(aVar.mo31692c(a3));
                iVar.setIcon(aVar.mo31692c(a4));
                iVar.setDesc(aVar.mo31692c(a5));
                iVar.setNotice(aVar.mo31692c(a6));
                iVar.setOwner(aVar.mo31691b(a7));
                iVar.setSecOwner(aVar.mo31692c(a8));
                iVar.setSilent(aVar.mo31687a(a9));
                iVar.setSilentNormalOnly(aVar.mo31687a(a10));
                iVar.setMode(aVar.mo31687a(a11));
                iVar.setExtStr(aVar.mo31692c(a12));
                map.put(c, iVar);
            }
        }
    }
}
