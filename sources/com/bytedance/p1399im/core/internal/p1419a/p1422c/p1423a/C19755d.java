package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.p1424b.p1426b.C19764b;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19509d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.tencent.wcdb.C87266h;
import com.tencent.wcdb.database.AbstractC87255i;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.RepairKit;
import java.io.File;

/* renamed from: com.bytedance.im.core.internal.a.c.a.d */
public final class C19755d extends AbstractC87255i implements AbstractC19752a {

    /* renamed from: a */
    public static int f46939a;

    /* renamed from: b */
    public static volatile boolean f46940b;

    /* renamed from: g */
    private static final C19753b f46941g = new C19753b() {
        /* class com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.C19755d.C197561 */

        static {
            Covode.recordClassIndex(22600);
        }

        @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.C19753b, com.tencent.wcdb.AbstractC87265g
        /* renamed from: a */
        public final void mo31697a(SQLiteDatabase sQLiteDatabase) {
            if (!C19755d.f46940b) {
                C19755d.f46940b = true;
                boolean d = C19755d.m37044d(sQLiteDatabase);
                C19512f.m36457b("imsdk", "LocalWcdbOpenHelper onCorruption, tryRepair result:".concat(String.valueOf(d)), (Throwable) null);
                C19509d dVar = new C19509d();
                dVar.f46304a = "core";
                dVar.f46305b = "db_repair";
                dVar.mo31164a("repair_result", String.valueOf(d)).mo31164a("repair_count", Integer.valueOf(Math.min(C19755d.f46939a, 1000))).mo31165a();
                if (!d) {
                    super.mo31697a(sQLiteDatabase);
                    C19483d.m36365a().mo31140a(false);
                }
                C19755d.f46940b = false;
            }
        }
    };

    /* renamed from: d */
    private C19764b f46942d = new C19764b();

    /* renamed from: e */
    private String f46943e;

    /* renamed from: f */
    private boolean f46944f = false;

    static {
        Covode.recordClassIndex(22599);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.AbstractC19752a
    /* renamed from: a */
    public final AbstractC19759b mo31695a() {
        C19764b bVar = this.f46942d;
        bVar.f46949a = mo141244b();
        return bVar;
    }

    @Override // com.tencent.wcdb.database.AbstractC87255i, com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.AbstractC19752a
    public final void close() {
        C19512f.m36457b("imsdk", "LocalWcdbOpenHelper close", (Throwable) null);
        super.close();
    }

    /* renamed from: e */
    private static void m37045e(SQLiteDatabase sQLiteDatabase) {
        if (C19483d.m36365a().mo31141b().f46243ah) {
            sQLiteDatabase.mo141206b(false);
        } else {
            sQLiteDatabase.mo141206b(true);
        }
    }

    @Override // com.tencent.wcdb.database.AbstractC87255i
    /* renamed from: b */
    public final void mo31706b(SQLiteDatabase sQLiteDatabase) {
        C19512f.m36457b("imsdk", "LocalWcdbOpenHelper onConfigure", (Throwable) null);
        if (C19483d.m36365a().mo31141b().f46243ah) {
            sQLiteDatabase.mo141217o();
        }
    }

    @Override // com.tencent.wcdb.database.AbstractC87255i
    /* renamed from: c */
    public final void mo31708c(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(10754);
        C19512f.m36457b("imsdk", "LocalWcdbOpenHelper onOpen", (Throwable) null);
        RepairKit.nativeSaveMaster(sQLiteDatabase.mo141198a("backupMaster", true), sQLiteDatabase.mo141216n() + "-mbak", null);
        sQLiteDatabase.mo141205b().mo141264c();
        MethodCollector.m26664o(10754);
    }

    /* renamed from: a */
    private static boolean m37043a(File file) {
        MethodCollector.m26663i(10904);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(10904);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(10904);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b3, code lost:
        if (r4 == null) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7 A[Catch:{ SQLiteException -> 0x019d, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d A[Catch:{ SQLiteException -> 0x019d, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01aa  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m37044d(com.tencent.wcdb.database.SQLiteDatabase r20) {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.C19755d.m37044d(com.tencent.wcdb.database.SQLiteDatabase):boolean");
    }

    @Override // com.tencent.wcdb.database.AbstractC87255i
    /* renamed from: a */
    public final void mo31704a(SQLiteDatabase sQLiteDatabase) {
        C19512f.m36457b("imsdk", "LocalWcdbOpenHelper onCreate, mEncrypted:" + this.f46944f + ", mOldDatabaseName:" + this.f46943e, (Throwable) null);
        this.f46942d.f46949a = sQLiteDatabase;
        if (!this.f46944f || TextUtils.isEmpty(this.f46943e)) {
            C19741a.m36958a();
            C19741a.m36962a(this.f46942d);
            return;
        }
        File databasePath = C19483d.m36365a().f46156a.getDatabasePath(this.f46943e);
        if (databasePath.exists()) {
            m37042a(this.f46942d, databasePath);
            return;
        }
        C19741a.m36958a();
        C19741a.m36962a(this.f46942d);
    }

    public C19755d(Context context, String str) {
        super(context, str, null, f46941g);
        C19512f.m36457b("imsdk", "LocalWcdbOpenHelper constructor, has not password", (Throwable) null);
        this.f46943e = str;
    }

    /* renamed from: a */
    private static boolean m37042a(C19764b bVar, File file) {
        try {
            C19512f.m36457b("imsdk", "LocalWcdbOpenHelper migrate start", (Throwable) null);
            SQLiteDatabase sQLiteDatabase = bVar.f46949a;
            sQLiteDatabase.mo141209g();
            sQLiteDatabase.mo141203b(C1764a.m5928a("ATTACH DATABASE %s AS old KEY '';", new Object[]{C87266h.m151445a(file.getPath())}));
            m37045e(sQLiteDatabase);
            C87266h.m151448b(sQLiteDatabase, "SELECT sqlcipher_export('main', 'old');");
            sQLiteDatabase.mo141210h();
            sQLiteDatabase.mo141209g();
            int a = (int) C87266h.m151444a(sQLiteDatabase, "PRAGMA old.user_version;");
            sQLiteDatabase.mo141203b("DETACH DATABASE old;");
            m37043a(file);
            m37045e(sQLiteDatabase);
            C19512f.m36457b("imsdk", "LocalWcdbOpenHelper migrate end, oldVersion:" + a + ", newVersion:38", (Throwable) null);
            if (a > 38) {
                C19741a.m36958a().mo31682a(a, 38);
            } else if (a < 38) {
                C19741a.m36958a();
                C19741a.m36963a(bVar, a, 38);
            }
            new C19517i().mo31179a("imsdk_db_migrate_encrypted_result").mo31180a("imsdk_result", 1).mo31181b();
            return true;
        } catch (Exception e) {
            new C19517i().mo31179a("imsdk_db_migrate_encrypted_result").mo31180a("imsdk_result", 0).mo31180a("error_msg", Log.getStackTraceString(e)).mo31181b();
            C19483d.m36365a().mo31140a(true);
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.tencent.wcdb.database.AbstractC87255i
    /* renamed from: a */
    public final void mo31705a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C19512f.m36457b("imsdk", "LocalWcdbOpenHelper onUpgrade", (Throwable) null);
        C19741a.m36958a();
        C19764b bVar = this.f46942d;
        bVar.f46949a = sQLiteDatabase;
        C19741a.m36963a(bVar, i, i2);
    }

    public C19755d(Context context, String str, byte[] bArr) {
        super(context, "encrypted_".concat(String.valueOf(str)), bArr, f46941g);
        C19512f.m36457b("imsdk", "LocalWcdbOpenHelper constructor, has password", (Throwable) null);
        this.f46943e = str;
        this.f46944f = true;
    }

    @Override // com.tencent.wcdb.database.AbstractC87255i
    /* renamed from: b */
    public final void mo31707b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C19512f.m36457b("imsdk", "LocalWcdbOpenHelper onDowngrade", (Throwable) null);
        C19741a a = C19741a.m36958a();
        this.f46942d.f46949a = sQLiteDatabase;
        a.mo31682a(i, i2);
    }
}
