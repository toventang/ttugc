package com.bytedance.apm.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.apm.core.d */
public final class SharedPreferencesC12438d implements SharedPreferences {

    /* renamed from: d */
    private static int f30192d = -1;

    /* renamed from: a */
    public Application f30193a;

    /* renamed from: b */
    public String f30194b;

    /* renamed from: c */
    public Uri f30195c;

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    /* renamed from: com.bytedance.apm.core.d$a */
    class SharedPreferences$EditorC12439a implements SharedPreferences.Editor {

        /* renamed from: b */
        private boolean f30197b;

        /* renamed from: c */
        private HashMap<String, Object> f30198c;

        static {
            Covode.recordClassIndex(14249);
        }

        public final boolean commit() {
            apply();
            return true;
        }

        public final SharedPreferences.Editor clear() {
            this.f30198c.clear();
            this.f30197b = true;
            return this;
        }

        public final void apply() {
            if (this.f30197b || !this.f30198c.isEmpty()) {
                Bundle bundle = new Bundle();
                if (this.f30197b) {
                    bundle.putBoolean("clear", true);
                }
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f30198c.size());
                for (Map.Entry<String, Object> entry : this.f30198c.entrySet()) {
                    arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
                }
                bundle.putParcelableArrayList("edit", arrayList);
                try {
                    SharedPreferencesC12438d.this.f30193a.getContentResolver().call(SharedPreferencesC12438d.this.f30195c, SharedPreferencesC12438d.this.f30194b, "edit", bundle);
                } catch (Exception unused) {
                }
            }
        }

        public final SharedPreferences.Editor remove(String str) {
            this.f30198c.put(str, null);
            return this;
        }

        private SharedPreferences$EditorC12439a() {
            this.f30198c = new HashMap<>();
        }

        /* synthetic */ SharedPreferences$EditorC12439a(SharedPreferencesC12438d dVar, byte b) {
            this();
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            this.f30198c.put(str, str2);
            return this;
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f30198c.put(str, Boolean.valueOf(z));
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f) {
            this.f30198c.put(str, Float.valueOf(f));
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            this.f30198c.put(str, Integer.valueOf(i));
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j) {
            this.f30198c.put(str, Long.valueOf(j));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.f30198c.put(str, C12585h.m22683a(set));
            return this;
        }
    }

    public final SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC12439a(this, (byte) 0);
    }

    static {
        Covode.recordClassIndex(14248);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        ArrayList<SpPair> a = m22397a((String) null, (Object) null);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<SpPair> it = a.iterator();
        while (it.hasNext()) {
            SpPair next = it.next();
            hashMap.put(next.f30190a, next.f30191b);
        }
        return hashMap;
    }

    /* renamed from: b */
    private static Context m22398b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: c */
    private static boolean m22400c(Context context) {
        if (f30192d == -1) {
            f30192d = m22395a(context);
        }
        if (f30192d == Process.myPid()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m22395a(Context context) {
        try {
            Bundle call = context.getContentResolver().call(Uri.parse("content://" + context.getPackageName() + ".apm"), "getPid", (String) null, (Bundle) null);
            if (call != null) {
                return call.getInt("Pid", -1);
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public final boolean contains(String str) {
        String str2;
        Bundle bundle = null;
        try {
            ContentResolver contentResolver = this.f30193a.getContentResolver();
            Uri uri = this.f30195c;
            if (str != null) {
                str2 = this.f30194b + "/" + str;
            } else {
                str2 = this.f30194b;
            }
            bundle = contentResolver.call(uri, str2, "contains", (Bundle) null);
        } catch (Exception unused) {
        }
        if (bundle == null || !bundle.getBoolean("contains")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static SharedPreferences m22396a(Context context, String str) {
        if (m22400c(context)) {
            return C34822d.m71158a(context, str, 0);
        }
        return m22399b(context, str);
    }

    /* renamed from: b */
    private static SharedPreferences m22399b(Context context, String str) {
        Application application;
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) m22398b(context);
        }
        return new SharedPreferencesC12438d(application, str);
    }

    public final String getString(String str, String str2) {
        ArrayList<SpPair> a = m22397a(str, str2);
        if (a == null) {
            return null;
        }
        return (String) a.get(0).f30191b;
    }

    private SharedPreferencesC12438d(Application application, String str) {
        this.f30193a = application;
        String str2 = "content://" + application.getPackageName() + ".apm/sp/" + str;
        this.f30194b = str2;
        this.f30195c = Uri.parse(str2);
    }

    public final boolean getBoolean(String str, boolean z) {
        ArrayList<SpPair> a = m22397a(str, String.valueOf(z));
        if (a == null) {
            return z;
        }
        Object obj = a.get(0).f30191b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public final float getFloat(String str, float f) {
        ArrayList<SpPair> a = m22397a(str, String.valueOf(f));
        if (a == null) {
            return f;
        }
        Object obj = a.get(0).f30191b;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return Float.valueOf((String) obj).floatValue();
        }
        return f;
    }

    public final int getInt(String str, int i) {
        ArrayList<SpPair> a = m22397a(str, String.valueOf(i));
        if (a == null) {
            return i;
        }
        Object obj = a.get(0).f30191b;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i;
    }

    public final long getLong(String str, long j) {
        ArrayList<SpPair> a = m22397a(str, String.valueOf(j));
        if (a == null) {
            return j;
        }
        Object obj = a.get(0).f30191b;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.decode((String) obj).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        ArrayList<SpPair> a = m22397a(str, set);
        if (a == null || a.get(0).f30191b == null) {
            return null;
        }
        String[] strArr = (String[]) a.get(0).f30191b;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    /* renamed from: a */
    private ArrayList<SpPair> m22397a(String str, Object obj) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.f30193a.getContentResolver();
            Uri uri = this.f30195c;
            if (str != null) {
                str2 = this.f30194b + "/" + str;
            } else {
                str2 = this.f30194b;
            }
            if (obj == null) {
                bundle2 = null;
            }
            bundle = contentResolver.call(uri, str2, "query", bundle2);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        return bundle.getParcelableArrayList("sp");
    }
}
