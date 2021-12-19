package com.bytedance.push.settings.storage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.settings.AbstractC21887a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.storage.d */
final class C21903d implements AbstractC21912i {

    /* renamed from: a */
    private final Context f51881a;

    /* renamed from: b */
    private final String f51882b;

    /* renamed from: c */
    private Map<AbstractC21887a, ContentObserver> f51883c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25567);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final String mo35647a(String str) {
        return mo35648a(str, (String) null);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final String mo35648a(String str, String str2) {
        MethodCollector.m26663i(13032);
        try {
            String a = m41139a(this.f51881a.getContentResolver().query(m41138a(this.f51881a, this.f51882b, str, str2, "string"), null, null, null, null), str2);
            MethodCollector.m26664o(13032);
            return a;
        } catch (Throwable unused) {
            MethodCollector.m26664o(13032);
            return str2;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final int mo35645a(String str, int i) {
        MethodCollector.m26663i(13033);
        try {
            int a = m41135a(this.f51881a.getContentResolver().query(m41138a(this.f51881a, this.f51882b, str, String.valueOf(i), "integer"), null, null, null, null), i);
            MethodCollector.m26664o(13033);
            return a;
        } catch (Throwable unused) {
            MethodCollector.m26664o(13033);
            return i;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final long mo35646a(String str, long j) {
        MethodCollector.m26663i(13034);
        try {
            long a = m41136a(this.f51881a.getContentResolver().query(m41138a(this.f51881a, this.f51882b, str, String.valueOf(j), "long"), null, null, null, null), j);
            MethodCollector.m26664o(13034);
            return a;
        } catch (Throwable unused) {
            MethodCollector.m26664o(13034);
            return j;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final boolean mo35651a(String str, boolean z) {
        MethodCollector.m26663i(13036);
        try {
            boolean a = m41141a(this.f51881a.getContentResolver().query(m41138a(this.f51881a, this.f51882b, str, String.valueOf(z), "boolean"), null, null, null, null), z);
            MethodCollector.m26664o(13036);
            return a;
        } catch (Throwable unused) {
            MethodCollector.m26664o(13036);
            return z;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final SharedPreferences.Editor mo35633a() {
        return new SharedPreferences$EditorC21906a(this.f51881a, this.f51882b, new AbstractC21913j() {
            /* class com.bytedance.push.settings.storage.C21903d.C219041 */

            static {
                Covode.recordClassIndex(25568);
            }

            @Override // com.bytedance.push.settings.storage.AbstractC21913j
            /* renamed from: a */
            public final Uri mo35657a(Context context, C21900b bVar) {
                return C21903d.m41137a(context, bVar);
            }
        });
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final void mo35649a(Context context, String str, String str2, final AbstractC21887a aVar) {
        Uri b;
        if (aVar != null && (b = PushProvider.m41128b(context, this.f51882b, str, str2)) != null) {
            C219052 r2 = new ContentObserver(new Handler(Looper.getMainLooper())) {
                /* class com.bytedance.push.settings.storage.C21903d.C219052 */

                static {
                    Covode.recordClassIndex(25569);
                }

                public final void onChange(boolean z, Uri uri) {
                    super.onChange(z, uri);
                }
            };
            context.getContentResolver().registerContentObserver(b, true, r2);
            this.f51883c.put(aVar, r2);
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final void mo35650a(AbstractC21887a aVar) {
        ContentObserver remove;
        if (aVar != null && (remove = this.f51883c.remove(aVar)) != null) {
            this.f51881a.getContentResolver().unregisterContentObserver(remove);
        }
    }

    /* renamed from: com.bytedance.push.settings.storage.d$a */
    static final class SharedPreferences$EditorC21906a implements SharedPreferences.Editor {

        /* renamed from: a */
        private final AbstractC21913j f51887a;

        /* renamed from: b */
        private final String f51888b;

        /* renamed from: c */
        private Context f51889c;

        /* renamed from: d */
        private ContentValues f51890d = new ContentValues();

        static {
            Covode.recordClassIndex(25570);
        }

        public final boolean commit() {
            return false;
        }

        public final /* synthetic */ SharedPreferences.Editor clear() {
            throw new UnsupportedOperationException("not support clear");
        }

        public final synchronized void apply() {
            MethodCollector.m26663i(12845);
            try {
                this.f51889c.getContentResolver().insert(this.f51887a.mo35657a(this.f51889c, new C21900b(this.f51888b, "key", "val", StringSet.type)), this.f51890d);
                MethodCollector.m26664o(12845);
            } catch (Throwable unused) {
                MethodCollector.m26664o(12845);
            }
        }

        public final /* synthetic */ SharedPreferences.Editor remove(String str) {
            this.f51890d.putNull(str);
            return this;
        }

        public final /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
            this.f51890d.put(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new UnsupportedOperationException("putStringSet not support");
        }

        public final /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f51890d.put(str, Boolean.valueOf(z));
            return this;
        }

        public final /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
            this.f51890d.put(str, Float.valueOf(f));
            return this;
        }

        public final /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
            this.f51890d.put(str, Integer.valueOf(i));
            return this;
        }

        public final /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
            this.f51890d.put(str, Long.valueOf(j));
            return this;
        }

        SharedPreferences$EditorC21906a(Context context, String str, AbstractC21913j jVar) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f51889c = applicationContext;
            this.f51887a = jVar;
            this.f51888b = str;
        }
    }

    /* renamed from: a */
    private static void m41140a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: b */
    public final int mo35652b(String str) {
        return mo35645a(str, 0);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: c */
    public final long mo35653c(String str) {
        return mo35646a(str, 0L);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: d */
    public final float mo35654d(String str) {
        return mo35644a(str, 0.0f);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: e */
    public final boolean mo35655e(String str) {
        return mo35651a(str, false);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: f */
    public final boolean mo35656f(String str) {
        MethodCollector.m26663i(13117);
        try {
            Uri a = m41137a(this.f51881a, (C21900b) null);
            ContentResolver contentResolver = this.f51881a.getContentResolver();
            String str2 = this.f51882b;
            Bundle bundle = new Bundle();
            bundle.putString("_storage_key", str2);
            bundle.putString("_key", str);
            Bundle call = contentResolver.call(a, "_contains", (String) null, bundle);
            if (call == null) {
                MethodCollector.m26664o(13117);
                return false;
            }
            boolean z = call.getBoolean("_result");
            MethodCollector.m26664o(13117);
            return z;
        } catch (Throwable unused) {
            MethodCollector.m26664o(13117);
            return false;
        }
    }

    C21903d(Context context, String str) {
        this.f51881a = context;
        this.f51882b = str;
    }

    /* renamed from: a */
    private static float m41134a(Cursor cursor, float f) {
        if (cursor == null) {
            return f;
        }
        try {
            if (cursor.moveToFirst()) {
                f = cursor.getFloat(0);
            }
        } catch (Throwable unused) {
        }
        m41140a(cursor);
        return f;
    }

    /* renamed from: a */
    private static int m41135a(Cursor cursor, int i) {
        if (cursor == null) {
            return i;
        }
        try {
            if (cursor.moveToFirst()) {
                i = cursor.getInt(0);
            }
        } catch (Throwable unused) {
        }
        m41140a(cursor);
        return i;
    }

    /* renamed from: a */
    private static long m41136a(Cursor cursor, long j) {
        if (cursor == null) {
            return j;
        }
        try {
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
            }
        } catch (Throwable unused) {
        }
        m41140a(cursor);
        return j;
    }

    /* renamed from: a */
    public static synchronized Uri m41137a(Context context, C21900b bVar) {
        Uri a;
        synchronized (C21903d.class) {
            MethodCollector.m26663i(13184);
            a = PushProvider.m41123a(context, bVar);
            MethodCollector.m26664o(13184);
        }
        return a;
    }

    /* renamed from: a */
    private static String m41139a(Cursor cursor, String str) {
        if (cursor == null) {
            return str;
        }
        try {
            if (cursor.moveToFirst()) {
                str = cursor.getString(0);
            }
        } catch (Throwable unused) {
        }
        m41140a(cursor);
        return str;
    }

    /* renamed from: a */
    private static boolean m41141a(Cursor cursor, boolean z) {
        if (cursor == null) {
            return z;
        }
        try {
            if (cursor.moveToFirst()) {
                boolean z2 = false;
                if (cursor.getInt(0) > 0) {
                    z2 = true;
                }
                z = z2;
            }
        } catch (Throwable unused) {
        }
        m41140a(cursor);
        return z;
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final float mo35644a(String str, float f) {
        MethodCollector.m26663i(13035);
        try {
            float a = m41134a(this.f51881a.getContentResolver().query(m41138a(this.f51881a, this.f51882b, str, String.valueOf(f), "float"), null, null, null, null), f);
            MethodCollector.m26664o(13035);
            return a;
        } catch (Throwable unused) {
            MethodCollector.m26664o(13035);
            return f;
        }
    }

    /* renamed from: a */
    private static Uri m41138a(Context context, String str, String str2, String str3, String str4) {
        return m41137a(context, new C21900b(str, str2, str3, str4));
    }
}
