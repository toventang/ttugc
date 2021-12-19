package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.aa */
final class C25175aa extends SQLiteOpenHelper {

    /* renamed from: a */
    static int f59635a = 3;

    /* renamed from: d */
    private static final AbstractC25176a f59636d;

    /* renamed from: e */
    private static final AbstractC25176a f59637e;

    /* renamed from: f */
    private static final AbstractC25176a f59638f;

    /* renamed from: g */
    private static final List<AbstractC25176a> f59639g;

    /* renamed from: b */
    private final int f59640b;

    /* renamed from: c */
    private boolean f59641c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.aa$a */
    public interface AbstractC25176a {
        static {
            Covode.recordClassIndex(30542);
        }

        /* renamed from: a */
        void mo41167a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        Covode.recordClassIndex(30541);
        C25177ab abVar = C25177ab.f59642a;
        f59636d = abVar;
        C25178ac acVar = C25178ac.f59643a;
        f59637e = acVar;
        C25179ad adVar = C25179ad.f59644a;
        f59638f = adVar;
        f59639g = Arrays.asList(abVar, acVar, adVar);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        m48289a(sQLiteDatabase);
    }

    /* renamed from: a */
    private void m48289a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f59641c) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m48289a(sQLiteDatabase);
        m48290a(sQLiteDatabase, 0, this.f59640b);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(2102);
        this.f59641c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        int i = Build.VERSION.SDK_INT;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        MethodCollector.m26664o(2102);
    }

    C25175aa(Context context, int i) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i);
        this.f59640b = i;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m48289a(sQLiteDatabase);
        m48290a(sQLiteDatabase, i, i2);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(2111);
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
        MethodCollector.m26664o(2111);
    }

    /* renamed from: a */
    private static void m48290a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<AbstractC25176a> list = f59639g;
        if (i2 <= list.size()) {
            while (i < i2) {
                f59639g.get(i).mo41167a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
