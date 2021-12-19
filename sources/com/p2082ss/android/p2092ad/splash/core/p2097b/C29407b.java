package com.p2082ss.android.p2092ad.splash.core.p2097b;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.ad.splash.core.b.b */
public class C29407b {

    /* renamed from: b */
    public static final Object f69837b = new Object();

    /* renamed from: a */
    public Context f69838a;

    /* renamed from: c */
    private C29410c f69839c;

    /* renamed from: a */
    public C29410c mo51432a() {
        return this.f69839c;
    }

    static {
        Covode.recordClassIndex(35801);
    }

    /* renamed from: com.ss.android.ad.splash.core.b.b$c */
    public class C29410c {

        /* renamed from: b */
        private volatile SQLiteDatabase f69844b;

        static {
            Covode.recordClassIndex(35804);
        }

        /* renamed from: a */
        private void m58906a() {
            MethodCollector.m26663i(11645);
            try {
                synchronized (C29407b.f69837b) {
                    try {
                        if (this.f69844b == null || !this.f69844b.isOpen()) {
                            C29407b bVar = C29407b.this;
                            this.f69844b = new C29408a(bVar.f69838a).getWritableDatabase();
                            this.f69844b.setLockingEnabled(false);
                        }
                    } finally {
                        MethodCollector.m26664o(11645);
                    }
                }
            } catch (Throwable unused) {
                MethodCollector.m26664o(11645);
            }
        }

        public C29410c() {
        }

        /* renamed from: a */
        public final Cursor mo51447a(String str) {
            Cursor cursor;
            MethodCollector.m26663i(11810);
            try {
                m58906a();
                cursor = this.f69844b.query(str, null, null, null, null, null, null);
            } catch (Throwable unused) {
                cursor = new C29409b();
            }
            MethodCollector.m26664o(11810);
            return cursor;
        }

        /* renamed from: a */
        public final long mo51446a(String str, ContentValues contentValues) {
            long j;
            MethodCollector.m26663i(12104);
            try {
                m58906a();
                j = this.f69844b.insert(str, null, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
                j = -1;
            }
            MethodCollector.m26664o(12104);
            return j;
        }

        /* renamed from: a */
        public final int mo51445a(String str, String str2, String[] strArr) {
            int i;
            MethodCollector.m26663i(12105);
            try {
                m58906a();
                i = this.f69844b.delete(str, str2, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                i = 0;
            }
            MethodCollector.m26664o(12105);
            return i;
        }

        /* renamed from: a */
        public final int mo51444a(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            MethodCollector.m26663i(11964);
            try {
                m58906a();
                i = this.f69844b.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                i = 0;
            }
            MethodCollector.m26664o(11964);
            return i;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.b.b$b */
    public class C29409b extends AbstractCursor {
        static {
            Covode.recordClassIndex(35803);
        }

        public final String[] getColumnNames() {
            return new String[0];
        }

        public final int getCount() {
            return 0;
        }

        public final double getDouble(int i) {
            return 0.0d;
        }

        public final float getFloat(int i) {
            return 0.0f;
        }

        public final int getInt(int i) {
            return 0;
        }

        public final long getLong(int i) {
            return 0;
        }

        public final short getShort(int i) {
            return 0;
        }

        public final String getString(int i) {
            return null;
        }

        public final boolean isNull(int i) {
            return true;
        }

        public C29409b() {
        }
    }

    C29407b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f69838a = applicationContext;
        if (this.f69839c == null) {
            this.f69839c = new C29410c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.ad.splash.core.b.b$a */
    public class C29408a extends SQLiteOpenHelper {

        /* renamed from: a */
        Context f69840a;

        static {
            Covode.recordClassIndex(35802);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            MethodCollector.m26663i(10728);
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ," + "replaceholder INTEGER default 0, retry INTEGER default 0, type INTEGER default 0, cid BIGINT default 0, " + "log_extra TEXT)");
            MethodCollector.m26664o(10728);
        }

        public C29408a(Context context) {
            super(context, "splashsdk.db", (SQLiteDatabase.CursorFactory) null, 1);
            this.f69840a = context;
        }
    }
}
