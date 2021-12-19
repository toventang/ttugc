package com.bytedance.p1399im.core.internal.p1419a.p1420a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1419a.C19739a;
import com.bytedance.p1399im.core.internal.p1419a.C19743b;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19767d;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1419a.C19771f;
import com.bytedance.p1399im.core.internal.p1419a.C19773g;
import com.bytedance.p1399im.core.internal.p1419a.C19775h;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1419a.C19782j;
import com.bytedance.p1399im.core.internal.p1419a.C19784k;
import com.bytedance.p1399im.core.internal.p1419a.p1421b.C19747b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.AbstractC19752a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.C19754c;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.C19755d;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import com.bytedance.p1399im.core.p1415g.C19696b;
import com.bytedance.p1399im.core.p1416h.C19700a;
import com.bytedance.p1399im.core.p1416h.C19703b;
import java.io.File;

/* renamed from: com.bytedance.im.core.internal.a.a.a */
public class C19741a {

    /* renamed from: a */
    private static volatile C19741a f46923a;

    /* renamed from: b */
    private String f46924b;

    /* renamed from: c */
    private AbstractC19752a f46925c;

    static {
        Covode.recordClassIndex(22585);
    }

    private C19741a() {
    }

    /* renamed from: a */
    public final void mo31682a(int i, int i2) {
        C19512f.m36457b("imsdk", "IMDBHelper onDowngrade, oldVersion:" + i + ",newVersion:" + i2 + ", mDBName:" + this.f46924b, (Throwable) null);
        if (!C19696b.f46837b) {
            new C19517i().mo31179a("im_sdk_db_downgrade").mo31180a("old_version", Integer.valueOf(i)).mo31180a("new_version", Integer.valueOf(i2)).mo31181b();
        }
        C19696b.f46837b = true;
        C19483d.m36365a().mo31140a(true);
    }

    /* renamed from: c */
    public final AbstractC19759b mo31684c() {
        AbstractC19752a e = m36966e();
        if (e == null) {
            return null;
        }
        return e.mo31695a();
    }

    /* renamed from: a */
    public static C19741a m36958a() {
        MethodCollector.m26663i(8413);
        if (f46923a == null) {
            synchronized (C19741a.class) {
                try {
                    if (f46923a == null) {
                        f46923a = new C19741a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8413);
                    throw th;
                }
            }
        }
        C19741a aVar = f46923a;
        MethodCollector.m26664o(8413);
        return aVar;
    }

    /* renamed from: b */
    public final long mo31683b() {
        try {
            File databasePath = C19483d.m36365a().f46156a.getDatabasePath(this.f46924b);
            if (databasePath == null || !databasePath.exists() || !databasePath.isFile()) {
                return 0;
            }
            return databasePath.length() / 1024;
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBHelper getDBSize", e);
            C19510e.m36439a(e);
            return 0;
        }
    }

    /* renamed from: d */
    public final void mo31685d() {
        C19512f.m36457b("imsdk", "IMDBHelper deleteDatabase start", (Throwable) null);
        AbstractC19752a aVar = this.f46925c;
        if (aVar != null) {
            aVar.close();
        }
        C19483d.m36365a().f46156a.deleteDatabase(this.f46924b);
        C19483d.m36365a().f46156a.deleteDatabase("encrypted_" + this.f46924b);
        this.f46925c = null;
        C19512f.m36457b("imsdk", "IMDBHelper deleteDatabase end", (Throwable) null);
    }

    /* renamed from: e */
    private synchronized AbstractC19752a m36966e() {
        String str;
        MethodCollector.m26663i(8561);
        long a = C19483d.m36365a().f46157b.mo27953a();
        if (a <= 0) {
            C19512f.m36457b("imsdk", "IMDBHelper getDBName, uid invalid: ".concat(String.valueOf(a)), (Throwable) null);
            str = null;
        } else {
            str = a + "_im.db";
            if (!C19483d.m36365a().f46157b.mo27966g()) {
                str = "sub_".concat(String.valueOf(str));
            }
        }
        if (TextUtils.isEmpty(str)) {
            C19512f.m36457b("imsdk", "IMDBHelper getOpenHelper, db name invalid", (Throwable) null);
            MethodCollector.m26664o(8561);
            return null;
        }
        try {
            if (this.f46925c == null) {
                C19512f.m36457b("imsdk", "IMDBHelper getOpenHelper, create new:".concat(String.valueOf(str)), (Throwable) null);
                AbstractC19752a a2 = m36959a(str);
                this.f46925c = a2;
                MethodCollector.m26664o(8561);
                return a2;
            } else if (str.equals(this.f46924b)) {
                AbstractC19752a aVar = this.f46925c;
                MethodCollector.m26664o(8561);
                return aVar;
            } else {
                C19512f.m36457b("imsdk", "IMDBHelper getOpenHelper, close previous:" + this.f46924b + ", create new:" + str, (Throwable) null);
                this.f46925c.close();
                this.f46925c = m36959a(str);
                AbstractC19752a aVar2 = this.f46925c;
                MethodCollector.m26664o(8561);
                return aVar2;
            }
        } catch (Exception e) {
            C19512f.m36457b("imsdk", "IMDBHelper getOpenHelper", e);
        }
    }

    /* renamed from: a */
    public static String m36960a(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i2 > i3) {
                return sb.toString();
            }
            sb.append("?");
            if (i2 != i3) {
                sb.append(",");
            }
            i2++;
        }
    }

    /* renamed from: a */
    private AbstractC19752a m36959a(String str) {
        C19512f.m36457b("imsdk", "IMDBHelper createOpenHelper, dbName:".concat(String.valueOf(str)), (Throwable) null);
        C19483d.m36365a().f46157b.mo27971l();
        this.f46924b = str;
        Context context = C19483d.m36365a().f46156a;
        if (!C19483d.m36365a().mo31141b().f46267g) {
            return new C19754c(context, this.f46924b);
        }
        String str2 = C19483d.m36365a().mo31141b().f46193B;
        if (TextUtils.isEmpty(str2)) {
            return new C19755d(context, this.f46924b);
        }
        return new C19755d(context, this.f46924b, str2.getBytes());
    }

    /* renamed from: a */
    public static void m36961a(AbstractC19751a aVar) {
        if (aVar != null) {
            try {
                aVar.mo31689a();
            } catch (Exception e) {
                C19512f.m36457b("imsdk", "close cursor", e);
                C19510e.m36439a(e);
            }
        }
    }

    /* renamed from: b */
    private static void m36965b(AbstractC19759b bVar) {
        int i = 0;
        String[] strArr = {"CREATE INDEX UID_INDEX ON msg(" + C19777i.EnumC19780a.COLUMN_SERVER_ID.key + ")", "CREATE INDEX MSG_UUID_INDEX ON msg(" + C19777i.EnumC19780a.COLUMN_MSG_ID.key + ")", "CREATE INDEX CONVERSATION_INDEX ON msg(" + C19777i.EnumC19780a.COLUMN_CONVERSATION_ID.key + "," + C19777i.EnumC19780a.COLUMN_INNER_INDEX.key + ")"};
        int i2 = 0;
        do {
            bVar.mo31714a(strArr[i2]);
            i2++;
        } while (i2 < 3);
        String[] strArr2 = {"create index MEMBER_CONVERSATION_INDEX on participant(" + C19769e.EnumC19770a.COLUMN_CONVERSATION_ID.key + ")", "create index USER_ID_INDEX on participant(" + C19769e.EnumC19770a.COLUMN_USER_ID.key + ")"};
        int i3 = 0;
        do {
            bVar.mo31714a(strArr2[i3]);
            i3++;
        } while (i3 < 2);
        bVar.mo31714a(C19767d.m37131b());
        String[] b = C19782j.m37213b();
        do {
            bVar.mo31714a(b[i]);
            i++;
        } while (i < 2);
        bVar.mo31714a(C19739a.m36956c());
    }

    /* renamed from: a */
    public static void m36962a(AbstractC19759b bVar) {
        C19512f.m36457b("imsdk", "IMDBHelper onCreate", (Throwable) null);
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_list (");
        C19749c.EnumC19750a[] values = C19749c.EnumC19750a.values();
        for (C19749c.EnumC19750a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        C20041s.m37876a();
        C20041s.m37900h();
        bVar.mo31714a(sb2.substring(0, sb2.length() - 1) + ");");
        bVar.mo31714a(C19777i.m37196c());
        bVar.mo31714a(C19739a.m36954b());
        bVar.mo31714a(C19769e.m37136a());
        bVar.mo31714a(C19743b.m36983a());
        bVar.mo31714a(C19773g.m37160a());
        C19747b.m36991a(bVar);
        bVar.mo31714a(C19775h.m37164a());
        bVar.mo31714a(C19771f.m37151a());
        bVar.mo31714a(C19784k.m37217a());
        bVar.mo31714a(C19767d.m37128a());
        bVar.mo31714a(C19782j.m37208a());
        m36965b(bVar);
        C19700a.m36842a(bVar);
        C19703b.m36847a(bVar);
    }

    /* renamed from: a */
    public static void m36964a(AbstractC19766c cVar) {
        if (cVar != null) {
            try {
                cVar.mo31727c();
            } catch (Exception e) {
                C19512f.m36457b("imsdk", "close sqLiteStatement", e);
                C19510e.m36439a(e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00aa A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m36963a(com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 801
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a.m36963a(com.bytedance.im.core.internal.a.c.b, int, int):void");
    }
}
