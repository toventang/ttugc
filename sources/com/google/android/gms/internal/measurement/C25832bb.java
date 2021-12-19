package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.bb */
public final class C25832bb implements AbstractC25836bf {

    /* renamed from: d */
    private static final Map<Uri, C25832bb> f60946d = new C0484a();

    /* renamed from: h */
    private static final String[] f60947h = {"key", "value"};

    /* renamed from: a */
    final Object f60948a = new Object();

    /* renamed from: b */
    volatile Map<String, String> f60949b;

    /* renamed from: c */
    final List<Object> f60950c = new ArrayList();

    /* renamed from: e */
    private final ContentResolver f60951e;

    /* renamed from: f */
    private final Uri f60952f;

    /* renamed from: g */
    private final ContentObserver f60953g;

    static {
        Covode.recordClassIndex(31247);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private final Map<String, String> m50021d() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) C25838bh.m50030a(new C25835be(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: b */
    public static synchronized void m50020b() {
        synchronized (C25832bb.class) {
            MethodCollector.m26663i(5316);
            for (C25832bb bbVar : f60946d.values()) {
                bbVar.f60951e.unregisterContentObserver(bbVar.f60953g);
            }
            f60946d.clear();
            MethodCollector.m26664o(5316);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo42188a() {
        MethodCollector.m26663i(5313);
        Map<String, String> map = this.f60949b;
        if (map == null) {
            synchronized (this.f60948a) {
                try {
                    map = this.f60949b;
                    if (map == null) {
                        map = m50021d();
                        this.f60949b = map;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5313);
                    throw th;
                }
            }
        }
        if (map != null) {
            MethodCollector.m26664o(5313);
            return map;
        }
        Map<String, String> emptyMap = Collections.emptyMap();
        MethodCollector.m26664o(5313);
        return emptyMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Map mo42189c() {
        Map map;
        MethodCollector.m26663i(5318);
        Cursor query = this.f60951e.query(this.f60952f, f60947h, null, null, null);
        if (query == null) {
            Map emptyMap = Collections.emptyMap();
            MethodCollector.m26664o(5318);
            return emptyMap;
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C0484a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            MethodCollector.m26664o(5318);
            return map;
        } finally {
            query.close();
            MethodCollector.m26664o(5318);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25836bf
    /* renamed from: a */
    public final /* synthetic */ Object mo42187a(String str) {
        return mo42188a().get(str);
    }

    private C25832bb(ContentResolver contentResolver, Uri uri) {
        C25834bd bdVar = new C25834bd(this);
        this.f60953g = bdVar;
        this.f60951e = contentResolver;
        this.f60952f = uri;
        contentResolver.registerContentObserver(uri, false, bdVar);
    }

    /* renamed from: a */
    public static C25832bb m50019a(ContentResolver contentResolver, Uri uri) {
        C25832bb bbVar;
        MethodCollector.m26663i(5311);
        synchronized (C25832bb.class) {
            try {
                Map<Uri, C25832bb> map = f60946d;
                bbVar = map.get(uri);
                if (bbVar == null) {
                    try {
                        C25832bb bbVar2 = new C25832bb(contentResolver, uri);
                        try {
                            map.put(uri, bbVar2);
                        } catch (SecurityException unused) {
                        }
                        bbVar = bbVar2;
                    } catch (SecurityException unused2) {
                    }
                }
            } finally {
                MethodCollector.m26664o(5311);
            }
        }
        return bbVar;
    }
}
