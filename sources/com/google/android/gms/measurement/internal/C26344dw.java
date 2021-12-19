package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.dw */
public final class C26344dw extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C26345dx f61803a;

    static {
        Covode.recordClassIndex(31766);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        MethodCollector.m26663i(6730);
        try {
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            MethodCollector.m26664o(6730);
            return writableDatabase;
        } catch (SQLiteDatabaseLockedException e) {
            MethodCollector.m26664o(6730);
            throw e;
        } catch (SQLiteException unused) {
            this.f61803a.mo43016q().f61827c.mo43169a("Opening the local database failed, dropping and recreating it");
            if (!m51578a(this.f61803a.mo43012m().getDatabasePath("google_app_measurement_local.db"))) {
                this.f61803a.mo43016q().f61827c.mo43170a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                SQLiteDatabase writableDatabase2 = super.getWritableDatabase();
                MethodCollector.m26664o(6730);
                return writableDatabase2;
            } catch (SQLiteException e2) {
                this.f61803a.mo43016q().f61827c.mo43170a("Failed to open local database. Events will bypass local storage", e2);
                MethodCollector.m26664o(6730);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C26456i.m52166a(this.f61803a.mo43016q(), sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C26456i.m52167a(this.f61803a.mo43016q(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    /* renamed from: a */
    private static boolean m51578a(File file) {
        MethodCollector.m26663i(6877);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(6877);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(6877);
        return delete;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26344dw(C26345dx dxVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f61803a = dxVar;
    }
}
