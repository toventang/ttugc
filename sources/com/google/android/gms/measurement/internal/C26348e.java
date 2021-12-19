package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.p025c.C0484a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import com.google.android.gms.internal.measurement.C25773am;
import com.google.android.gms.internal.measurement.C25802av;
import com.google.android.gms.internal.measurement.C26098kj;
import com.google.android.gms.internal.measurement.C26155mm;
import com.kakao.usermgmt.StringSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e */
public final class C26348e extends AbstractC26500jp {

    /* renamed from: a */
    static final String[] f61809a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: b */
    static final String[] f61810b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: c */
    static final String[] f61811c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: d */
    static final String[] f61812d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: e */
    static final String[] f61813e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: f */
    static final String[] f61814f = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: g */
    static final String[] f61815g = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: h */
    static final String[] f61816h = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: i */
    final C26495jl f61817i = new C26495jl(mo43011l());

    /* renamed from: k */
    private final C26375f f61818k = new C26375f(this, mo43012m(), "google_app_measurement.db");

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26500jp
    /* renamed from: d */
    public final boolean mo43092d() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0133  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C26526l mo43070a(java.lang.String r27, java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43070a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.l");
    }

    /* renamed from: a */
    public final void mo43077a(C26526l lVar) {
        MethodCollector.m26663i(5134);
        C25565r.m49314a(lVar);
        mo43002c();
        mo43486B();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.f62443a);
        contentValues.put(StringSet.name, lVar.f62444b);
        contentValues.put("lifetime_count", Long.valueOf(lVar.f62445c));
        contentValues.put("current_bundle_count", Long.valueOf(lVar.f62446d));
        contentValues.put("last_fire_timestamp", Long.valueOf(lVar.f62448f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(lVar.f62449g));
        contentValues.put("last_bundled_day", lVar.f62450h);
        contentValues.put("last_sampled_complex_event_id", lVar.f62451i);
        contentValues.put("last_sampling_rate", lVar.f62452j);
        contentValues.put("current_session_count", Long.valueOf(lVar.f62447e));
        contentValues.put("last_exempt_from_sampling", (lVar.f62453k == null || !lVar.f62453k.booleanValue()) ? null : 1L);
        try {
            if (mo43105h().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert/update event aggregates (got -1). appId", C26350eb.m51691a(lVar.f62443a));
            }
            MethodCollector.m26664o(5134);
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing event aggregates. appId", C26350eb.m51691a(lVar.f62443a), e);
            MethodCollector.m26664o(5134);
        }
    }

    /* renamed from: a */
    public final boolean mo43081a(C26507jw jwVar) {
        MethodCollector.m26663i(5209);
        C25565r.m49314a(jwVar);
        mo43002c();
        mo43486B();
        if (mo43090c(jwVar.f62391a, jwVar.f62393c) == null) {
            if (C26510jz.m52394a(jwVar.f62393c)) {
                long b = m51640b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{jwVar.f62391a});
                C26524km s = mo43018s();
                String str = jwVar.f62391a;
                C26098kj.m51128b();
                int i = 25;
                if (s.mo43641d(null, C26530p.f62499aK)) {
                    i = s.mo43631a(str, C26530p.f62468G, 25, 100);
                }
                if (b >= ((long) i)) {
                    MethodCollector.m26664o(5209);
                    return false;
                }
            } else if (!"_npa".equals(jwVar.f62393c)) {
                if (m51640b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{jwVar.f62391a, jwVar.f62392b}) >= 25) {
                    MethodCollector.m26664o(5209);
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", jwVar.f62391a);
        contentValues.put("origin", jwVar.f62392b);
        contentValues.put(StringSet.name, jwVar.f62393c);
        contentValues.put("set_timestamp", Long.valueOf(jwVar.f62394d));
        m51637a(contentValues, "value", jwVar.f62395e);
        try {
            if (mo43105h().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert/update user property (got -1). appId", C26350eb.m51691a(jwVar.f62391a));
            }
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing user property. appId", C26350eb.m51691a(jwVar.f62391a), e);
        }
        MethodCollector.m26664o(5209);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C26507jw> mo43072a(java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43072a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f5, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        r0 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        if (r5 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5317);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0128, code lost:
        if (r5 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5317);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0130, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0134, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        r11.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b A[Catch:{ all -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0134 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C26507jw> mo43074a(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43074a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo43083a(zzw zzw) {
        MethodCollector.m26663i(5432);
        C25565r.m49314a(zzw);
        mo43002c();
        mo43486B();
        if (mo43090c(zzw.f62612a, zzw.f62614c.f62582a) == null) {
            if (m51640b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzw.f62612a}) >= 1000) {
                MethodCollector.m26664o(5432);
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzw.f62612a);
        contentValues.put("origin", zzw.f62613b);
        contentValues.put(StringSet.name, zzw.f62614c.f62582a);
        m51637a(contentValues, "value", zzw.f62614c.mo43675a());
        contentValues.put("active", Boolean.valueOf(zzw.f62616e));
        contentValues.put("trigger_event_name", zzw.f62617f);
        contentValues.put("trigger_timeout", Long.valueOf(zzw.f62619h));
        mo43014o();
        contentValues.put("timed_out_event", C26510jz.m52397a((Parcelable) zzw.f62618g));
        contentValues.put("creation_timestamp", Long.valueOf(zzw.f62615d));
        mo43014o();
        contentValues.put("triggered_event", C26510jz.m52397a((Parcelable) zzw.f62620i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzw.f62614c.f62583b));
        contentValues.put("time_to_live", Long.valueOf(zzw.f62621j));
        mo43014o();
        contentValues.put("expired_event", C26510jz.m52397a((Parcelable) zzw.f62622k));
        try {
            if (mo43105h().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert/update conditional user property (got -1)", C26350eb.m51691a(zzw.f62612a));
            }
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing conditional user property", C26350eb.m51691a(zzw.f62612a), e);
        }
        MethodCollector.m26664o(5432);
        return true;
    }

    /* renamed from: a */
    public final List<zzw> mo43075a(String str, String[] strArr) {
        MethodCollector.m26663i(5941);
        mo43002c();
        mo43486B();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor query = mo43105h().query("conditional_properties", new String[]{"app_id", "origin", StringSet.name, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            if (!query.moveToFirst()) {
                query.close();
                MethodCollector.m26664o(5941);
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    String string3 = query.getString(2);
                    Object a = m51636a(query, 3);
                    if (query.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = query.getString(5);
                    long j = query.getLong(6);
                    long j2 = query.getLong(8);
                    arrayList.add(new zzw(string, string2, new zzkr(string3, query.getLong(10), a, string2), j2, z, string4, (zzao) mo43176L_().mo43491a(query.getBlob(7), zzao.CREATOR), j, (zzao) mo43176L_().mo43491a(query.getBlob(9), zzao.CREATOR), query.getLong(11), (zzao) mo43176L_().mo43491a(query.getBlob(12), zzao.CREATOR)));
                    if (!query.moveToNext()) {
                        break;
                    }
                } else {
                    mo43016q().f61827c.mo43170a("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            query.close();
            MethodCollector.m26664o(5941);
            return arrayList;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43170a("Error querying conditional user property value", e);
            List<zzw> emptyList = Collections.emptyList();
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(5941);
            return emptyList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(5941);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo43076a(C26351ec ecVar) {
        MethodCollector.m26663i(6266);
        C25565r.m49314a(ecVar);
        mo43002c();
        mo43486B();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ecVar.mo43125b());
        contentValues.put("app_instance_id", ecVar.mo43129c());
        contentValues.put("gmp_app_id", ecVar.mo43133d());
        contentValues.put("resettable_device_id_hash", ecVar.mo43142g());
        contentValues.put("last_bundle_index", Long.valueOf(ecVar.mo43160r()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(ecVar.mo43148i()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(ecVar.mo43151j()));
        contentValues.put("app_version", ecVar.mo43153k());
        contentValues.put("app_store", ecVar.mo43155m());
        contentValues.put("gmp_version", Long.valueOf(ecVar.mo43156n()));
        contentValues.put("dev_cert_hash", Long.valueOf(ecVar.mo43157o()));
        contentValues.put("measurement_enabled", Boolean.valueOf(ecVar.mo43159q()));
        ecVar.f61844a.mo43015p().mo43002c();
        contentValues.put("day", Long.valueOf(ecVar.f61846c));
        ecVar.f61844a.mo43015p().mo43002c();
        contentValues.put("daily_public_events_count", Long.valueOf(ecVar.f61847d));
        ecVar.f61844a.mo43015p().mo43002c();
        contentValues.put("daily_events_count", Long.valueOf(ecVar.f61848e));
        ecVar.f61844a.mo43015p().mo43002c();
        contentValues.put("daily_conversions_count", Long.valueOf(ecVar.f61849f));
        contentValues.put("config_fetched_time", Long.valueOf(ecVar.mo43161s()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(ecVar.mo43162t()));
        contentValues.put("app_version_int", Long.valueOf(ecVar.mo43154l()));
        contentValues.put("firebase_instance_id", ecVar.mo43145h());
        ecVar.f61844a.mo43015p().mo43002c();
        contentValues.put("daily_error_events_count", Long.valueOf(ecVar.f61850g));
        ecVar.f61844a.mo43015p().mo43002c();
        contentValues.put("daily_realtime_events_count", Long.valueOf(ecVar.f61851h));
        contentValues.put("health_monitor_sample", ecVar.mo43164v());
        contentValues.put("android_id", Long.valueOf(ecVar.mo43165w()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(ecVar.mo43166x()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(ecVar.mo43167y()));
        contentValues.put("admob_app_id", ecVar.mo43136e());
        contentValues.put("dynamite_version", Long.valueOf(ecVar.mo43158p()));
        if (ecVar.mo43119A() != null) {
            if (ecVar.mo43119A().size() == 0) {
                mo43016q().f61830f.mo43170a("Safelisted events should not be an empty list. appId", ecVar.mo43125b());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", ecVar.mo43119A()));
            }
        }
        C26155mm.m51249b();
        if (mo43018s().mo43641d(ecVar.mo43125b(), C26530p.f62529ao)) {
            contentValues.put("ga_app_id", ecVar.mo43139f());
        }
        try {
            SQLiteDatabase h = mo43105h();
            if (((long) h.update("apps", contentValues, "app_id = ?", new String[]{ecVar.mo43125b()})) == 0 && h.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert/update app (got -1). appId", C26350eb.m51691a(ecVar.mo43125b()));
            }
            MethodCollector.m26664o(6266);
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing app. appId", C26350eb.m51691a(ecVar.mo43125b()), e);
            MethodCollector.m26664o(6266);
        }
    }

    /* renamed from: a */
    public final C26321d mo43068a(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        MethodCollector.m26663i(6271);
        C25565r.m49316a(str);
        mo43002c();
        mo43486B();
        String[] strArr = {str};
        C26321d dVar = new C26321d();
        Cursor cursor = null;
        try {
            SQLiteDatabase h = mo43105h();
            Cursor query = h.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            if (!query.moveToFirst()) {
                mo43016q().f61830f.mo43170a("Not updating daily counts, app is not known. appId", C26350eb.m51691a(str));
                query.close();
                MethodCollector.m26664o(6271);
                return dVar;
            }
            if (query.getLong(0) == j) {
                dVar.f61762b = query.getLong(1);
                dVar.f61761a = query.getLong(2);
                dVar.f61763c = query.getLong(3);
                dVar.f61764d = query.getLong(4);
                dVar.f61765e = query.getLong(5);
            }
            if (z) {
                dVar.f61762b += j2;
            }
            if (z2) {
                dVar.f61761a += j2;
            }
            if (z3) {
                dVar.f61763c += j2;
            }
            if (z4) {
                dVar.f61764d += j2;
            }
            if (z5) {
                dVar.f61765e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(dVar.f61761a));
            contentValues.put("daily_events_count", Long.valueOf(dVar.f61762b));
            contentValues.put("daily_conversions_count", Long.valueOf(dVar.f61763c));
            contentValues.put("daily_error_events_count", Long.valueOf(dVar.f61764d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(dVar.f61765e));
            h.update("apps", contentValues, "app_id=?", strArr);
            query.close();
            MethodCollector.m26664o(6271);
            return dVar;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error updating daily counts. appId", C26350eb.m51691a(str), e);
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(6271);
            return dVar;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(6271);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo43080a(C25802av.C25815g gVar, boolean z) {
        MethodCollector.m26663i(6567);
        mo43002c();
        mo43486B();
        C25565r.m49314a(gVar);
        C25565r.m49316a(gVar.zzs);
        C25565r.m49320a(gVar.mo42095a());
        mo43109u();
        long a = mo43011l().mo41857a();
        if (gVar.zzj < a - C26524km.m52496i() || gVar.zzj > C26524km.m52496i() + a) {
            mo43016q().f61830f.mo43172a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C26350eb.m51691a(gVar.zzs), Long.valueOf(a), Long.valueOf(gVar.zzj));
        }
        try {
            byte[] c = mo43176L_().mo43503c(gVar.mo42364h());
            mo43016q().f61835k.mo43170a("Saving bundle, size", Integer.valueOf(c.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", gVar.zzs);
            contentValues.put("bundle_end_timestamp", Long.valueOf(gVar.zzj));
            contentValues.put("data", c);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (gVar.mo42096b()) {
                contentValues.put("retry_count", Integer.valueOf(gVar.zzao));
            }
            try {
                if (mo43105h().insert("queue", null, contentValues) == -1) {
                    mo43016q().f61827c.mo43170a("Failed to insert bundle (got -1). appId", C26350eb.m51691a(gVar.zzs));
                    MethodCollector.m26664o(6567);
                    return false;
                }
                MethodCollector.m26664o(6567);
                return true;
            } catch (SQLiteException e) {
                mo43016q().f61827c.mo43171a("Error storing bundle. appId", C26350eb.m51691a(gVar.zzs), e);
                MethodCollector.m26664o(6567);
                return false;
            }
        } catch (IOException e2) {
            mo43016q().f61827c.mo43171a("Data loss. Failed to serialize bundle. appId", C26350eb.m51691a(gVar.zzs), e2);
            MethodCollector.m26664o(6567);
            return false;
        }
    }

    /* renamed from: a */
    public final List<Pair<C25802av.C25815g, Long>> mo43073a(String str, int i, int i2) {
        MethodCollector.m26663i(6573);
        mo43002c();
        mo43486B();
        C25565r.m49324b(i > 0);
        C25565r.m49324b(i2 > 0);
        C25565r.m49316a(str);
        Cursor cursor = null;
        try {
            Cursor query = mo43105h().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            if (!query.moveToFirst()) {
                List<Pair<C25802av.C25815g, Long>> emptyList = Collections.emptyList();
                query.close();
                MethodCollector.m26664o(6573);
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            do {
                long j = query.getLong(0);
                try {
                    byte[] b = mo43176L_().mo43502b(query.getBlob(1));
                    if (!arrayList.isEmpty() && b.length + i3 > i2) {
                        break;
                    }
                    try {
                        C25802av.C25815g.C25816a aVar = (C25802av.C25815g.C25816a) C26506jv.m52332a(C25802av.C25815g.m49893c(), b);
                        if (!query.isNull(2)) {
                            aVar.mo42136h(query.getInt(2));
                        }
                        i3 += b.length;
                        arrayList.add(Pair.create((C25802av.C25815g) ((AbstractC25981gj) aVar.mo42629w()), Long.valueOf(j)));
                    } catch (IOException e) {
                        mo43016q().f61827c.mo43171a("Failed to merge queued bundle. appId", C26350eb.m51691a(str), e);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } catch (IOException e2) {
                    mo43016q().f61827c.mo43171a("Failed to unzip queued bundle. appId", C26350eb.m51691a(str), e2);
                }
            } while (i3 <= i2);
            query.close();
            MethodCollector.m26664o(6573);
            return arrayList;
        } catch (SQLiteException e3) {
            mo43016q().f61827c.mo43171a("Error querying bundles. appId", C26350eb.m51691a(str), e3);
            List<Pair<C25802av.C25815g, Long>> emptyList2 = Collections.emptyList();
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(6573);
            return emptyList2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(6573);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43079a(List<Long> list) {
        MethodCollector.m26663i(6723);
        mo43002c();
        mo43486B();
        C25565r.m49314a(list);
        if (list.size() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given Integer is zero");
            MethodCollector.m26664o(6723);
            throw illegalArgumentException;
        } else if (!m51634D()) {
            MethodCollector.m26664o(6723);
        } else {
            String join = TextUtils.join(",", list);
            String sb = new StringBuilder(String.valueOf(join).length() + 2).append("(").append(join).append(")").toString();
            if (m51640b(new StringBuilder(String.valueOf(sb).length() + 80).append("SELECT COUNT(1) FROM queue WHERE rowid IN ").append(sb).append(" AND retry_count =  2147483647 LIMIT 1").toString(), (String[]) null) > 0) {
                mo43016q().f61830f.mo43169a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                mo43105h().execSQL(new StringBuilder(String.valueOf(sb).length() + 127).append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ").append(sb).append(" AND (retry_count IS NULL OR retry_count < 2147483647)").toString());
                MethodCollector.m26664o(6723);
            } catch (SQLiteException e) {
                mo43016q().f61827c.mo43170a("Error incrementing retry count. error", e);
                MethodCollector.m26664o(6723);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo43071a(long r8) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43071a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C25802av.C25807c, java.lang.Long> mo43067a(java.lang.String r9, java.lang.Long r10) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43067a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: a */
    public final boolean mo43085a(String str, Long l, long j, C25802av.C25807c cVar) {
        MethodCollector.m26663i(7672);
        mo43002c();
        mo43486B();
        C25565r.m49314a(cVar);
        C25565r.m49316a(str);
        C25565r.m49314a(l);
        byte[] h = cVar.mo42364h();
        mo43016q().f61835k.mo43171a("Saving complex main event, appId, data size", mo43013n().mo43062a(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", h);
        try {
            if (mo43105h().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert complex main event (got -1). appId", C26350eb.m51691a(str));
                MethodCollector.m26664o(7672);
                return false;
            }
            MethodCollector.m26664o(7672);
            return true;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing complex main event. appId", C26350eb.m51691a(str), e);
            MethodCollector.m26664o(7672);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43084a(String str, Bundle bundle) {
        MethodCollector.m26663i(7674);
        mo43002c();
        mo43486B();
        byte[] h = mo43176L_().mo43492a(new C26527m(this.f62077z, "", str, "dep", 0, 0, bundle)).mo42364h();
        mo43016q().f61835k.mo43171a("Saving default event parameters, appId, data size", mo43013n().mo43062a(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", h);
        try {
            if (mo43105h().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert default event parameters (got -1). appId", C26350eb.m51691a(str));
                MethodCollector.m26664o(7674);
                return false;
            }
            MethodCollector.m26664o(7674);
            return true;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing default event parameters. appId", C26350eb.m51691a(str), e);
            MethodCollector.m26664o(7674);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo43082a(C26527m mVar, long j, boolean z) {
        MethodCollector.m26663i(7681);
        mo43002c();
        mo43486B();
        C25565r.m49314a(mVar);
        C25565r.m49316a(mVar.f62454a);
        byte[] h = mo43176L_().mo43492a(mVar).mo42364h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", mVar.f62454a);
        contentValues.put(StringSet.name, mVar.f62455b);
        contentValues.put("timestamp", Long.valueOf(mVar.f62456c));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", h);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (mo43105h().insert("raw_events", null, contentValues) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert raw event (got -1). appId", C26350eb.m51691a(mVar.f62454a));
                MethodCollector.m26664o(7681);
                return false;
            }
            MethodCollector.m26664o(7681);
            return true;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing raw event. appId", C26350eb.m51691a(mVar.f62454a), e);
            MethodCollector.m26664o(7681);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: java.util.List<com.google.android.gms.internal.measurement.am$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43078a(String str, List<C25773am.C25774a> list) {
        boolean z;
        MethodCollector.m26663i(7818);
        C25565r.m49314a(list);
        for (int i = 0; i < list.size(); i++) {
            C25773am.C25774a.C25775a aVar = (C25773am.C25774a.C25775a) ((AbstractC25981gj) list.get(i)).mo42620l();
            if (aVar.mo42011b() != 0) {
                for (int i2 = 0; i2 < aVar.mo42011b(); i2++) {
                    C25773am.C25776b.C25777a aVar2 = (C25773am.C25776b.C25777a) aVar.mo42012b(i2).mo42620l();
                    C25773am.C25776b.C25777a aVar3 = (C25773am.C25776b.C25777a) ((AbstractC25981gj.AbstractC25982a) aVar2.clone());
                    String a = C26407ge.m51981a(aVar2.mo42007a());
                    if (a != null) {
                        aVar3.mo42018a(a);
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i3 = 0; i3 < aVar2.mo42020b(); i3++) {
                        C25773am.C25778c a2 = aVar2.mo42019a(i3);
                        String a3 = C26444ho.m52082a(a2.zzg, C26406gd.f62080a, C26406gd.f62081b);
                        if (a3 != null) {
                            aVar3.mo42017a(i3, (C25773am.C25778c) ((AbstractC25981gj) ((C25773am.C25778c.C25779a) a2.mo42620l()).mo42018a(a3).mo42629w()));
                            z = true;
                        }
                    }
                    if (z) {
                        aVar = aVar.mo42008a(i2, aVar3);
                        list.set(i, (AbstractC25981gj) aVar.mo42629w());
                    }
                }
            }
            if (aVar.mo42007a() != 0) {
                for (int i4 = 0; i4 < aVar.mo42007a(); i4++) {
                    C25773am.C25783e a4 = aVar.mo42010a(i4);
                    String a5 = C26444ho.m52082a(a4.zze, C26409gg.f62087a, C26409gg.f62088b);
                    if (a5 != null) {
                        aVar = aVar.mo42009a(i4, ((C25773am.C25783e.C25784a) a4.mo42620l()).mo42018a(a5));
                        list.set(i, (AbstractC25981gj) aVar.mo42629w());
                    }
                }
            }
        }
        mo43486B();
        mo43002c();
        C25565r.m49316a(str);
        C25565r.m49314a(list);
        SQLiteDatabase h = mo43105h();
        h.beginTransaction();
        try {
            mo43486B();
            mo43002c();
            C25565r.m49316a(str);
            SQLiteDatabase h2 = mo43105h();
            h2.delete("property_filters", "app_id=?", new String[]{str});
            h2.delete("event_filters", "app_id=?", new String[]{str});
            for (C25773am.C25774a aVar4 : list) {
                mo43486B();
                mo43002c();
                C25565r.m49316a(str);
                C25565r.m49314a(aVar4);
                if (aVar4.mo42006a()) {
                    int i5 = aVar4.zzd;
                    Iterator<C25773am.C25776b> it = aVar4.zzf.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().mo42013a()) {
                                mo43016q().f61830f.mo43171a("Event filter with no ID. Audience definition ignored. appId, audienceId", C26350eb.m51691a(str), Integer.valueOf(i5));
                                break;
                            }
                        } else {
                            Iterator<C25773am.C25783e> it2 = aVar4.zze.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().mo42034a()) {
                                        mo43016q().f61830f.mo43171a("Property filter with no ID. Audience definition ignored. appId, audienceId", C26350eb.m51691a(str), Integer.valueOf(i5));
                                        break;
                                    }
                                } else {
                                    Iterator<C25773am.C25776b> it3 = aVar4.zzf.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!m51638a(str, i5, it3.next())) {
                                                break;
                                            }
                                        } else {
                                            for (C25773am.C25783e eVar : aVar4.zze) {
                                                if (!m51639a(str, i5, eVar)) {
                                                }
                                            }
                                        }
                                    }
                                    mo43486B();
                                    mo43002c();
                                    C25565r.m49316a(str);
                                    SQLiteDatabase h3 = mo43105h();
                                    h3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i5)});
                                    h3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i5)});
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    mo43016q().f61830f.mo43170a("Audience with no ID. appId", C26350eb.m51691a(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C25773am.C25774a aVar5 : list) {
                arrayList.add(aVar5.mo42006a() ? Integer.valueOf(aVar5.zzd) : null);
            }
            m51641b(str, arrayList);
            h.setTransactionSuccessful();
        } finally {
            h.endTransaction();
            MethodCollector.m26664o(7818);
        }
    }

    /* renamed from: D */
    private final boolean m51634D() {
        return mo43012m().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: f */
    public final void mo43099f() {
        mo43486B();
        mo43105h().setTransactionSuccessful();
    }

    /* renamed from: v */
    public final long mo43110v() {
        return m51635a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: w */
    public final long mo43111w() {
        return m51635a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: e */
    public final void mo43096e() {
        MethodCollector.m26663i(5056);
        mo43486B();
        mo43105h().beginTransaction();
        MethodCollector.m26664o(5056);
    }

    /* renamed from: g */
    public final void mo43102g() {
        MethodCollector.m26663i(5061);
        mo43486B();
        mo43105h().endTransaction();
        MethodCollector.m26664o(5061);
    }

    /* renamed from: j */
    public final boolean mo43108j() {
        if (m51640b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final boolean mo43112x() {
        if (m51640b("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo43113y() {
        if (m51640b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final SQLiteDatabase mo43105h() {
        mo43002c();
        try {
            return this.f61818k.getWritableDatabase();
        } catch (SQLiteException e) {
            mo43016q().f61830f.mo43170a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo43107i() {
        /*
            r6 = this;
            r5 = 6569(0x19a9, float:9.205E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            android.database.sqlite.SQLiteDatabase r1 = r6.mo43105h()
            r4 = 0
            java.lang.String r0 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r3 = r1.rawQuery(r0, r4)     // Catch:{ SQLiteException -> 0x002e, all -> 0x002b }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0029 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0029 }
            r3.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r0
        L_0x0022:
            r3.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        L_0x0029:
            r2 = move-exception
            goto L_0x0030
        L_0x002b:
            r0 = move-exception
            r3 = r4
            goto L_0x0045
        L_0x002e:
            r2 = move-exception
            r3 = r4
        L_0x0030:
            com.google.android.gms.measurement.internal.eb r0 = r6.mo43016q()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.measurement.internal.ee r1 = r0.f61827c     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "Database error getting next bundle app id"
            r1.mo43170a(r0, r2)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0040
            r3.close()
        L_0x0040:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            if (r3 == 0) goto L_0x004a
            r3.close()
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43107i():java.lang.String");
    }

    /* renamed from: z */
    public final long mo43114z() {
        MethodCollector.m26663i(7668);
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo43105h().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                MethodCollector.m26664o(7668);
                return -1;
            }
            long j = rawQuery.getLong(0);
            rawQuery.close();
            MethodCollector.m26664o(7668);
            return j;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43170a("Error querying raw events", e);
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(7668);
            return -1;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(7668);
            throw th;
        }
    }

    static {
        Covode.recordClassIndex(31770);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo43109u() {
        int delete;
        MethodCollector.m26663i(6720);
        mo43002c();
        mo43486B();
        if (!m51634D()) {
            MethodCollector.m26664o(6720);
            return;
        }
        long a = mo43017r().f61907g.mo43209a();
        long b = mo43011l().mo41858b();
        if (Math.abs(b - a) > C26530p.f62564y.mo43024a(null).longValue()) {
            mo43017r().f61907g.mo43210a(b);
            mo43002c();
            mo43486B();
            if (m51634D() && (delete = mo43105h().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo43011l().mo41857a()), String.valueOf(C26524km.m52496i())})) > 0) {
                mo43016q().f61835k.mo43170a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
        MethodCollector.m26664o(6720);
    }

    C26348e(C26498jo joVar) {
        super(joVar);
    }

    /* renamed from: h */
    public final long mo43103h(String str) {
        C25565r.m49316a(str);
        return m51635a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* renamed from: c */
    public final long mo43089c(String str) {
        MethodCollector.m26663i(6268);
        C25565r.m49316a(str);
        mo43002c();
        mo43486B();
        try {
            long delete = (long) mo43105h().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo43018s().mo43636b(str, C26530p.f62555p))))});
            MethodCollector.m26664o(6268);
            return delete;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error deleting over the limit events. appId", C26350eb.m51691a(str), e);
            MethodCollector.m26664o(6268);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo43093d(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43093d(java.lang.String):byte[]");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Map<Integer, List<C25773am.C25776b>> mo43095e(String str) {
        MethodCollector.m26663i(6876);
        C25565r.m49316a(str);
        C0484a aVar = new C0484a();
        Cursor cursor = null;
        try {
            Cursor query = mo43105h().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
            if (!query.moveToFirst()) {
                Map<Integer, List<C25773am.C25776b>> emptyMap = Collections.emptyMap();
                query.close();
                MethodCollector.m26664o(6876);
                return emptyMap;
            }
            do {
                try {
                    C25773am.C25776b bVar = (C25773am.C25776b) ((AbstractC25981gj) ((C25773am.C25776b.C25777a) C26506jv.m52332a(C25773am.C25776b.m49762e(), query.getBlob(1))).mo42629w());
                    if (bVar.mo42015c()) {
                        int i = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i), list);
                        }
                        list.add(bVar);
                    }
                } catch (IOException e) {
                    mo43016q().f61827c.mo43171a("Failed to merge filter. appId", C26350eb.m51691a(str), e);
                }
            } while (query.moveToNext());
            query.close();
            MethodCollector.m26664o(6876);
            return aVar;
        } catch (SQLiteException e2) {
            mo43016q().f61827c.mo43171a("Database error querying filters. appId", C26350eb.m51691a(str), e2);
            Map<Integer, List<C25773am.C25776b>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(6876);
            return emptyMap2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(6876);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mo43097f(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43097f(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.C25802av.C25820i> mo43100g(java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43100g(java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo43106i(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43106i(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0267, code lost:
        if (r0.equals(r1) == false) goto L_0x0269;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00fd A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ff A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011c A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011e A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x013b A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x013d A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x015a A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x015c A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x017c A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0180 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a8 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01aa A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c7 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01c9 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01e6 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0200 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0215 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x023e A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x025b A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0286 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02a0 A[Catch:{ SQLiteException -> 0x02b6 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C26351ec mo43086b(java.lang.String r51) {
        /*
        // Method dump skipped, instructions count: 746
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43086b(java.lang.String):com.google.android.gms.measurement.internal.ec");
    }

    /* renamed from: a */
    public final long mo43066a(C25802av.C25815g gVar) {
        MethodCollector.m26663i(7331);
        mo43002c();
        mo43486B();
        C25565r.m49314a(gVar);
        C25565r.m49316a(gVar.zzs);
        byte[] h = gVar.mo42364h();
        long a = mo43176L_().mo43490a(h);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gVar.zzs);
        contentValues.put("metadata_fingerprint", Long.valueOf(a));
        contentValues.put("metadata", h);
        try {
            mo43105h().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            MethodCollector.m26664o(7331);
            return a;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing raw event metadata. appId", C26350eb.m51691a(gVar.zzs), e);
            MethodCollector.m26664o(7331);
            throw e;
        }
    }

    /* renamed from: b */
    private final long m51640b(String str, String[] strArr) {
        MethodCollector.m26663i(5085);
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo43105h().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                MethodCollector.m26664o(5085);
                return j;
            }
            SQLiteException sQLiteException = new SQLiteException("Database returned empty set");
            MethodCollector.m26664o(5085);
            throw sQLiteException;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Database error", str, e);
            MethodCollector.m26664o(5085);
            throw e;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(5085);
            throw th;
        }
    }

    /* renamed from: e */
    public final int mo43094e(String str, String str2) {
        MethodCollector.m26663i(5672);
        C25565r.m49316a(str);
        C25565r.m49316a(str2);
        mo43002c();
        mo43486B();
        try {
            int delete = mo43105h().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
            MethodCollector.m26664o(5672);
            return delete;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43172a("Error deleting conditional property", C26350eb.m51691a(str), mo43013n().mo43064c(str2), e);
            MethodCollector.m26664o(5672);
            return 0;
        }
    }

    /* renamed from: a */
    private final Object m51636a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo43016q().f61827c.mo43169a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                mo43016q().f61827c.mo43170a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo43016q().f61827c.mo43169a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* renamed from: b */
    private final boolean m51641b(String str, List<Integer> list) {
        MethodCollector.m26663i(7180);
        C25565r.m49316a(str);
        mo43486B();
        mo43002c();
        SQLiteDatabase h = mo43105h();
        try {
            long b = m51640b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min((int) LiveNetAdaptiveHurryTimeSetting.DEFAULT, mo43018s().mo43636b(str, C26530p.f62467F)));
            if (b <= ((long) max)) {
                MethodCollector.m26664o(7180);
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    MethodCollector.m26664o(7180);
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            String sb = new StringBuilder(String.valueOf(join).length() + 2).append("(").append(join).append(")").toString();
            int delete = h.delete("audience_filter_values", new StringBuilder(String.valueOf(sb).length() + 140).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(sb).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(max)});
            MethodCollector.m26664o(7180);
            if (delete > 0) {
                return true;
            }
            return false;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Database error querying filters. appId", C26350eb.m51691a(str), e);
            MethodCollector.m26664o(7180);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C26507jw mo43090c(java.lang.String r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43090c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.jw");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final long mo43104h(String str, String str2) {
        Throwable th;
        long j;
        SQLiteException e;
        MethodCollector.m26663i(7328);
        C25565r.m49316a(str);
        C25565r.m49316a(str2);
        mo43002c();
        mo43486B();
        SQLiteDatabase h = mo43105h();
        h.beginTransaction();
        long j2 = 0;
        try {
            try {
                j = m51635a(new StringBuilder(String.valueOf(str2).length() + 32).append("select ").append(str2).append(" from app2 where app_id=?").toString(), new String[]{str}, -1);
                if (j == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (h.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        mo43016q().f61827c.mo43171a("Failed to insert column (got -1). appId", C26350eb.m51691a(str), str2);
                        h.endTransaction();
                        MethodCollector.m26664o(7328);
                        return -1;
                    }
                    j = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(j + 1));
                    if (((long) h.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                        mo43016q().f61827c.mo43171a("Failed to update column (got 0). appId", C26350eb.m51691a(str), str2);
                        h.endTransaction();
                        MethodCollector.m26664o(7328);
                        return -1;
                    }
                    h.setTransactionSuccessful();
                    h.endTransaction();
                    MethodCollector.m26664o(7328);
                    return j;
                } catch (SQLiteException e2) {
                    e = e2;
                    j2 = j;
                    try {
                        mo43016q().f61827c.mo43172a("Error inserting column. appId", C26350eb.m51691a(str), str2, e);
                        h.endTransaction();
                        j = j2;
                        MethodCollector.m26664o(7328);
                        return j;
                    } catch (Throwable th2) {
                        th = th2;
                        h.endTransaction();
                        MethodCollector.m26664o(7328);
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                mo43016q().f61827c.mo43172a("Error inserting column. appId", C26350eb.m51691a(str), str2, e);
                h.endTransaction();
                j = j2;
                MethodCollector.m26664o(7328);
                return j;
            }
        } catch (SQLiteException e4) {
            e = e4;
            mo43016q().f61827c.mo43172a("Error inserting column. appId", C26350eb.m51691a(str), str2, e);
            h.endTransaction();
            j = j2;
            MethodCollector.m26664o(7328);
            return j;
        } catch (Throwable th3) {
            th = th3;
            h.endTransaction();
            MethodCollector.m26664o(7328);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0127  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzw mo43091d(java.lang.String r31, java.lang.String r32) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43091d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzw");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C25773am.C25776b>> mo43098f(java.lang.String r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43098f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C25773am.C25783e>> mo43101g(java.lang.String r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26348e.mo43101g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: b */
    public final void mo43088b(String str, String str2) {
        MethodCollector.m26663i(5189);
        C25565r.m49316a(str);
        C25565r.m49316a(str2);
        mo43002c();
        mo43486B();
        try {
            mo43105h().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            MethodCollector.m26664o(5189);
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43172a("Error deleting user property. appId", C26350eb.m51691a(str), mo43013n().mo43064c(str2), e);
            MethodCollector.m26664o(5189);
        }
    }

    /* renamed from: a */
    private static void m51637a(ContentValues contentValues, String str, Object obj) {
        C25565r.m49316a(str);
        C25565r.m49314a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: a */
    private final long m51635a(String str, String[] strArr, long j) {
        MethodCollector.m26663i(5093);
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo43105h().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                MethodCollector.m26664o(5093);
                return j2;
            }
            rawQuery.close();
            MethodCollector.m26664o(5093);
            return j;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Database error", str, e);
            MethodCollector.m26664o(5093);
            throw e;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(5093);
            throw th;
        }
    }

    /* renamed from: a */
    private final boolean m51638a(String str, int i, C25773am.C25776b bVar) {
        Integer num;
        Boolean bool;
        MethodCollector.m26663i(6725);
        mo43486B();
        mo43002c();
        C25565r.m49316a(str);
        C25565r.m49314a(bVar);
        Integer num2 = null;
        if (TextUtils.isEmpty(bVar.zze)) {
            C26353ee eeVar = mo43016q().f61830f;
            Object a = C26350eb.m51691a(str);
            Integer valueOf = Integer.valueOf(i);
            if (bVar.mo42013a()) {
                num2 = Integer.valueOf(bVar.zzd);
            }
            eeVar.mo43172a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num2));
            MethodCollector.m26664o(6725);
            return false;
        }
        byte[] h = bVar.mo42364h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        if (bVar.mo42013a()) {
            num = Integer.valueOf(bVar.zzd);
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("event_name", bVar.zze);
        if ((bVar.zzc & 64) != 0) {
            bool = Boolean.valueOf(bVar.zzk);
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", h);
        try {
            if (mo43105h().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert event filter (got -1). appId", C26350eb.m51691a(str));
            }
            MethodCollector.m26664o(6725);
            return true;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing event filter. appId", C26350eb.m51691a(str), e);
            MethodCollector.m26664o(6725);
            return false;
        }
    }

    /* renamed from: b */
    public final List<zzw> mo43087b(String str, String str2, String str3) {
        C25565r.m49316a(str);
        mo43002c();
        mo43486B();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo43075a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: a */
    private final boolean m51639a(String str, int i, C25773am.C25783e eVar) {
        Integer num;
        Boolean bool;
        MethodCollector.m26663i(6727);
        mo43486B();
        mo43002c();
        C25565r.m49316a(str);
        C25565r.m49314a(eVar);
        Integer num2 = null;
        if (TextUtils.isEmpty(eVar.zze)) {
            C26353ee eeVar = mo43016q().f61830f;
            Object a = C26350eb.m51691a(str);
            Integer valueOf = Integer.valueOf(i);
            if (eVar.mo42034a()) {
                num2 = Integer.valueOf(eVar.zzd);
            }
            eeVar.mo43172a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num2));
            MethodCollector.m26664o(6727);
            return false;
        }
        byte[] h = eVar.mo42364h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        if (eVar.mo42034a()) {
            num = Integer.valueOf(eVar.zzd);
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("property_name", eVar.zze);
        if ((eVar.zzc & 32) != 0) {
            bool = Boolean.valueOf(eVar.zzi);
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", h);
        try {
            if (mo43105h().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                mo43016q().f61827c.mo43170a("Failed to insert property filter (got -1). appId", C26350eb.m51691a(str));
                MethodCollector.m26664o(6727);
                return false;
            }
            MethodCollector.m26664o(6727);
            return true;
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43171a("Error storing property filter. appId", C26350eb.m51691a(str), e);
            MethodCollector.m26664o(6727);
            return false;
        }
    }

    /* renamed from: a */
    public final C26321d mo43069a(long j, String str, boolean z, boolean z2) {
        return mo43068a(j, str, 1, false, false, z, false, z2);
    }
}
