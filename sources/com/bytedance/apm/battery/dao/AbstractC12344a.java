package com.bytedance.apm.battery.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.apm.battery.dao.a */
public abstract class AbstractC12344a<T> {

    /* renamed from: a */
    private final Context f29747a;

    /* renamed from: b */
    private final String f29748b;

    /* renamed from: c */
    private Uri f29749c;

    /* renamed from: d */
    private final HashMap<String, Integer> f29750d = new HashMap<>();

    /* renamed from: com.bytedance.apm.battery.dao.a$a */
    public interface AbstractC12345a<T> {
        static {
            Covode.recordClassIndex(14151);
        }

        /* renamed from: a */
        T mo20096a(C12346b bVar);
    }

    static {
        Covode.recordClassIndex(14150);
    }

    /* renamed from: a */
    public abstract String mo20093a();

    /* renamed from: b */
    public abstract String[] mo20095b();

    public AbstractC12344a() {
        Context context = C12397c.f29931a;
        this.f29747a = context;
        this.f29748b = context.getPackageName() + ".apm";
    }

    /* renamed from: c */
    private Uri m22171c() {
        if (this.f29749c == null) {
            this.f29749c = Uri.parse("content://" + this.f29748b + "/apm_monitor_t1.db/" + mo20093a());
        }
        return this.f29749c;
    }

    /* renamed from: com.bytedance.apm.battery.dao.a$b */
    public static class C12346b {

        /* renamed from: a */
        Cursor f29751a;

        /* renamed from: b */
        private final HashMap<String, Integer> f29752b;

        static {
            Covode.recordClassIndex(14152);
        }

        /* renamed from: a */
        public final long mo20097a(String str) {
            try {
                return this.f29751a.getLong(m22178d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public final int mo20098b(String str) {
            try {
                return this.f29751a.getInt(m22178d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* renamed from: c */
        public final String mo20099c(String str) {
            try {
                return this.f29751a.getString(m22178d(str));
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: d */
        private int m22178d(String str) {
            Integer num = this.f29752b.get(str);
            if (num == null) {
                try {
                    num = Integer.valueOf(this.f29751a.getColumnIndex(str));
                } catch (Throwable unused) {
                    num = -1;
                }
                this.f29752b.put(str, num);
            }
            return num.intValue();
        }

        private C12346b(Cursor cursor, HashMap<String, Integer> hashMap) {
            this.f29751a = cursor;
            this.f29752b = hashMap;
        }

        /* synthetic */ C12346b(Cursor cursor, HashMap hashMap, byte b) {
            this(cursor, hashMap);
        }
    }

    /* renamed from: a */
    private static void m22170a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <I extends T> long mo20092a(android.content.ContentValues r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r2 = -1
            android.content.Context r0 = com.bytedance.apm.C12397c.f29931a     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            android.net.Uri r0 = r4.m22171c()     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            android.net.Uri r0 = r1.insert(r0, r5)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r4)
            return r2
        L_0x0015:
            java.lang.String r0 = r0.getLastPathSegment()     // Catch:{ Exception -> 0x001f, all -> 0x0023 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x001f, all -> 0x0023 }
            monitor-exit(r4)
            return r0
        L_0x001f:
            r0 = 1
            monitor-exit(r4)
            return r0
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0026:
            monitor-exit(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.AbstractC12344a.mo20092a(android.content.ContentValues):long");
    }

    /* renamed from: a */
    public final int mo20091a(ContentValues contentValues, String str, String[] strArr) {
        try {
            return C12397c.f29931a.getContentResolver().update(m22171c(), contentValues, str, strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final List<T> mo20094a(String str, String[] strArr, String str2, AbstractC12345a<T> aVar) {
        Cursor cursor;
        int indexOf;
        try {
            cursor = this.f29747a.getContentResolver().query(m22171c(), mo20095b(), str, strArr, str2);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        int i = Integer.MAX_VALUE;
                        if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf("LIMIT")) > 0) {
                            int indexOf2 = str2.indexOf("OFF");
                            i = indexOf2 > 0 ? Integer.valueOf(str2.substring(indexOf + 5, indexOf2).trim()).intValue() : Integer.valueOf(str2.substring(indexOf + 5).trim()).intValue();
                        }
                        LinkedList linkedList = new LinkedList();
                        int i2 = 0;
                        while (cursor.moveToNext() && i2 < i) {
                            linkedList.add(aVar.mo20096a(new C12346b(cursor, this.f29750d, (byte) 0)));
                            i2++;
                        }
                        m22170a(cursor);
                        return linkedList;
                    }
                } catch (Throwable unused) {
                    m22170a(cursor);
                    return Collections.emptyList();
                }
            }
            List<T> emptyList = Collections.emptyList();
            m22170a(cursor);
            return emptyList;
        } catch (Throwable unused2) {
            cursor = null;
            m22170a(cursor);
            return Collections.emptyList();
        }
    }
}
