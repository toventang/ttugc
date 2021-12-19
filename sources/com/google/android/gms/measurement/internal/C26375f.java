package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f */
public final class C26375f extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C26348e f61978a;

    static {
        Covode.recordClassIndex(31797);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        MethodCollector.m26663i(7000);
        C26495jl jlVar = this.f61978a.f61817i;
        boolean z = true;
        if (jlVar.f62349b != 0 && jlVar.f62348a.mo41858b() - jlVar.f62349b < 3600000) {
            z = false;
        }
        if (z) {
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                MethodCollector.m26664o(7000);
                return writableDatabase;
            } catch (SQLiteException unused) {
                this.f61978a.f61817i.mo43460a();
                this.f61978a.mo43016q().f61827c.mo43169a("Opening the database failed, dropping and recreating it");
                if (!m51888a(this.f61978a.mo43012m().getDatabasePath("google_app_measurement.db"))) {
                    this.f61978a.mo43016q().f61827c.mo43170a("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    SQLiteDatabase writableDatabase2 = super.getWritableDatabase();
                    this.f61978a.f61817i.f62349b = 0;
                    MethodCollector.m26664o(7000);
                    return writableDatabase2;
                } catch (SQLiteException e) {
                    this.f61978a.mo43016q().f61827c.mo43170a("Failed to open freshly created database", e);
                    MethodCollector.m26664o(7000);
                    throw e;
                }
            }
        } else {
            SQLiteException sQLiteException = new SQLiteException("Database open failed");
            MethodCollector.m26664o(7000);
            throw sQLiteException;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C26456i.m52166a(this.f61978a.mo43016q(), sQLiteDatabase);
    }

    /* renamed from: a */
    private static boolean m51888a(File file) {
        MethodCollector.m26663i(7158);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7158);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7158);
        return delete;
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C26348e.f61809a);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C26348e.f61810b);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C26348e.f61811c);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C26348e.f61813e);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C26348e.f61812d);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C26348e.f61814f);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C26348e.f61815g);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C26348e.f61816h);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        C26456i.m52167a(this.f61978a.mo43016q(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26375f(C26348e eVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f61978a = eVar;
    }
}
