package com.p2082ss.android.ugc.aweme.p3924sp;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.experiment.C46855dv;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sp.g */
public final class SharedPreferencesC74917g implements SharedPreferences {

    /* renamed from: l */
    private static final Object f168412l = new Object();

    /* renamed from: a */
    final File f168413a;

    /* renamed from: b */
    public final String f168414b;

    /* renamed from: c */
    final File f168415c;

    /* renamed from: d */
    public final Object f168416d;

    /* renamed from: e */
    public final Object f168417e = new Object();

    /* renamed from: f */
    public Map<String, Object> f168418f;

    /* renamed from: g */
    public int f168419g = 0;

    /* renamed from: h */
    boolean f168420h = false;

    /* renamed from: i */
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> f168421i = new WeakHashMap<>();

    /* renamed from: j */
    public long f168422j;

    /* renamed from: k */
    long f168423k;

    static {
        Covode.recordClassIndex(87782);
    }

    /* renamed from: com.ss.android.ugc.aweme.sp.g$a */
    public final class SharedPreferences$EditorC74920a implements SharedPreferences.Editor {

        /* renamed from: b */
        private final Object f168431b = new Object();

        /* renamed from: c */
        private final Map<String, Object> f168432c = new HashMap();

        /* renamed from: d */
        private boolean f168433d = false;

        static {
            Covode.recordClassIndex(87785);
        }

        public final SharedPreferences.Editor clear() {
            MethodCollector.m26663i(13406);
            synchronized (this.f168431b) {
                try {
                    this.f168433d = true;
                } finally {
                    MethodCollector.m26664o(13406);
                }
            }
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
            return false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean commit() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.sp.g$b r2 = r3.m131482a()
                com.ss.android.ugc.aweme.sp.g r1 = com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.this
                r0 = 0
                r1.mo117973a(r2, r0, r0)
                java.util.concurrent.CountDownLatch r0 = r2.f168444e     // Catch:{ InterruptedException -> 0x0017, all -> 0x0015 }
                r0.await()     // Catch:{ InterruptedException -> 0x0017, all -> 0x0015 }
                r3.mo117987a(r2)
                boolean r0 = r2.f168445f
                return r0
            L_0x0015:
                r0 = move-exception
                throw r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.SharedPreferences$EditorC74920a.commit():boolean");
        }

        public final void apply() {
            List<String> list;
            MethodCollector.m26663i(13471);
            try {
                list = new ArrayList<>(this.f168432c.keySet());
            } catch (Exception unused) {
                list = Collections.emptyList();
            }
            final C74924b a = m131482a();
            final RunnableC749211 r2 = new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.SharedPreferences$EditorC74920a.RunnableC749211 */

                static {
                    Covode.recordClassIndex(87786);
                }

                public final void run() {
                    try {
                        a.f168444e.await();
                    } catch (InterruptedException unused) {
                    }
                }
            };
            synchronized (C74913d.f168396a) {
                try {
                    C74913d.f168398c.add(r2);
                } catch (Throwable th) {
                    MethodCollector.m26664o(13471);
                    throw th;
                }
            }
            SharedPreferencesC74917g.this.mo117973a(a, new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.SharedPreferences$EditorC74920a.RunnableC749222 */

                static {
                    Covode.recordClassIndex(87787);
                }

                public final void run() {
                    MethodCollector.m26663i(14335);
                    r2.run();
                    Runnable runnable = r2;
                    synchronized (C74913d.f168396a) {
                        try {
                            C74913d.f168398c.remove(runnable);
                        } finally {
                            MethodCollector.m26664o(14335);
                        }
                    }
                }
            }, list);
            mo117987a(a);
            MethodCollector.m26664o(13471);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[SYNTHETIC, Splitter:B:18:0x005a] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf A[Catch:{ all -> 0x00f6 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.C74924b m131482a() {
            /*
            // Method dump skipped, instructions count: 258
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.SharedPreferences$EditorC74920a.m131482a():com.ss.android.ugc.aweme.sp.g$b");
        }

        public SharedPreferences$EditorC74920a() {
        }

        public final SharedPreferences.Editor remove(String str) {
            MethodCollector.m26663i(13405);
            synchronized (this.f168431b) {
                try {
                    this.f168432c.put(str, this);
                } finally {
                    MethodCollector.m26664o(13405);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final void mo117987a(final C74924b bVar) {
            if (!(bVar.f168442c == null || bVar.f168441b == null || bVar.f168441b.size() == 0)) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    for (int size = bVar.f168441b.size() - 1; size >= 0; size--) {
                        String str = bVar.f168441b.get(size);
                        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.f168442c) {
                            if (onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(SharedPreferencesC74917g.this, str);
                            }
                        }
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.SharedPreferences$EditorC74920a.RunnableC749233 */

                    static {
                        Covode.recordClassIndex(87788);
                    }

                    public final void run() {
                        SharedPreferences$EditorC74920a.this.mo117987a(bVar);
                    }
                });
            }
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            MethodCollector.m26663i(13404);
            synchronized (this.f168431b) {
                try {
                    this.f168432c.put(str, Boolean.valueOf(z));
                } finally {
                    MethodCollector.m26664o(13404);
                }
            }
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f) {
            MethodCollector.m26663i(13403);
            synchronized (this.f168431b) {
                try {
                    this.f168432c.put(str, Float.valueOf(f));
                } finally {
                    MethodCollector.m26664o(13403);
                }
            }
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            MethodCollector.m26663i(13401);
            synchronized (this.f168431b) {
                try {
                    this.f168432c.put(str, Integer.valueOf(i));
                } finally {
                    MethodCollector.m26664o(13401);
                }
            }
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j) {
            MethodCollector.m26663i(13402);
            synchronized (this.f168431b) {
                try {
                    this.f168432c.put(str, Long.valueOf(j));
                } finally {
                    MethodCollector.m26664o(13402);
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet;
            MethodCollector.m26663i(13400);
            synchronized (this.f168431b) {
                try {
                    Map<String, Object> map = this.f168432c;
                    if (set == null) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet(set);
                    }
                    map.put(str, hashSet);
                } finally {
                    MethodCollector.m26664o(13400);
                }
            }
            return this;
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            MethodCollector.m26663i(13399);
            synchronized (this.f168431b) {
                try {
                    this.f168432c.put(str, str2);
                    if (str2 != null && str2.length() > 500) {
                        String str3 = SharedPreferencesC74917g.this.f168414b;
                        str2.length();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sp_value_size", str2.length());
                            jSONObject.put("sp_file_name", str3);
                            jSONObject.put("sp_key", str);
                            C34611o.m70671b("sp_put_big_size_value", "sp_put_big_size_value", jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(13399);
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    private void m131478a() {
        MethodCollector.m26663i(13579);
        if (!this.f168420h) {
            C74907a.f168386b.get();
        }
        while (!this.f168420h) {
            try {
                this.f168416d.wait();
            } catch (InterruptedException unused) {
            }
        }
        MethodCollector.m26664o(13579);
    }

    public final SharedPreferences.Editor edit() {
        MethodCollector.m26663i(13856);
        synchronized (this.f168416d) {
            try {
                m131478a();
            } catch (Throwable th) {
                MethodCollector.m26664o(13856);
                throw th;
            }
        }
        SharedPreferences$EditorC74920a aVar = new SharedPreferences$EditorC74920a();
        MethodCollector.m26664o(13856);
        return aVar;
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap hashMap;
        MethodCollector.m26663i(13637);
        synchronized (this.f168416d) {
            try {
                m131478a();
                hashMap = new HashMap(this.f168418f);
            } finally {
                MethodCollector.m26664o(13637);
            }
        }
        return hashMap;
    }

    public final boolean contains(String str) {
        boolean containsKey;
        MethodCollector.m26663i(13855);
        synchronized (this.f168416d) {
            try {
                m131478a();
                containsKey = this.f168418f.containsKey(str);
            } finally {
                MethodCollector.m26664o(13855);
            }
        }
        return containsKey;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        MethodCollector.m26663i(13531);
        synchronized (this.f168416d) {
            try {
                this.f168421i.put(onSharedPreferenceChangeListener, f168412l);
            } finally {
                MethodCollector.m26664o(13531);
            }
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        MethodCollector.m26663i(13532);
        synchronized (this.f168416d) {
            try {
                this.f168421i.remove(onSharedPreferenceChangeListener);
            } finally {
                MethodCollector.m26664o(13532);
            }
        }
    }

    /* renamed from: b */
    static FileOutputStream m131480b(File file) {
        FileOutputStream fileOutputStream;
        MethodCollector.m26663i(13926);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                MethodCollector.m26664o(13926);
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
            }
        }
        fileOutputStream2 = fileOutputStream;
        MethodCollector.m26664o(13926);
        return fileOutputStream2;
    }

    /* renamed from: a */
    public static boolean m131479a(File file) {
        MethodCollector.m26663i(13530);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13530);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13530);
        return delete;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sp.g$b */
    public static class C74924b {

        /* renamed from: a */
        final long f168440a;

        /* renamed from: b */
        final List<String> f168441b;

        /* renamed from: c */
        final Set<SharedPreferences.OnSharedPreferenceChangeListener> f168442c;

        /* renamed from: d */
        final Map<String, Object> f168443d;

        /* renamed from: e */
        final CountDownLatch f168444e;

        /* renamed from: f */
        volatile boolean f168445f;

        /* renamed from: g */
        boolean f168446g;

        static {
            Covode.recordClassIndex(87789);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo118001a(boolean z, boolean z2) {
            this.f168446g = z;
            this.f168445f = z2;
            this.f168444e.countDown();
        }

        private C74924b(long j, List<String> list, Set<SharedPreferences.OnSharedPreferenceChangeListener> set, Map<String, Object> map) {
            this.f168444e = new CountDownLatch(1);
            this.f168445f = false;
            this.f168446g = false;
            this.f168440a = j;
            this.f168441b = list;
            this.f168442c = set;
            this.f168443d = map;
        }

        /* synthetic */ C74924b(long j, List list, Set set, Map map, byte b) {
            this(j, list, set, map);
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        MethodCollector.m26663i(13854);
        synchronized (this.f168416d) {
            try {
                m131478a();
                try {
                    Boolean bool = (Boolean) this.f168418f.get(str);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                } catch (ClassCastException e) {
                    e.printStackTrace();
                }
            } finally {
                MethodCollector.m26664o(13854);
            }
        }
        return z;
    }

    public final float getFloat(String str, float f) {
        MethodCollector.m26663i(13853);
        synchronized (this.f168416d) {
            try {
                m131478a();
                try {
                    Float f2 = (Float) this.f168418f.get(str);
                    if (f2 != null) {
                        f = f2.floatValue();
                    }
                } catch (ClassCastException e) {
                    e.printStackTrace();
                }
            } finally {
                MethodCollector.m26664o(13853);
            }
        }
        return f;
    }

    public final int getInt(String str, int i) {
        MethodCollector.m26663i(13753);
        synchronized (this.f168416d) {
            try {
                m131478a();
                try {
                    Integer num = (Integer) this.f168418f.get(str);
                    if (num != null) {
                        i = num.intValue();
                    }
                } catch (ClassCastException e) {
                    e.printStackTrace();
                }
            } finally {
                MethodCollector.m26664o(13753);
            }
        }
        return i;
    }

    public final long getLong(String str, long j) {
        MethodCollector.m26663i(13811);
        synchronized (this.f168416d) {
            try {
                m131478a();
                try {
                    Long l = (Long) this.f168418f.get(str);
                    if (l != null) {
                        j = l.longValue();
                    }
                } catch (ClassCastException e) {
                    e.printStackTrace();
                }
            } finally {
                MethodCollector.m26664o(13811);
            }
        }
        return j;
    }

    public final String getString(String str, String str2) {
        MethodCollector.m26663i(13697);
        synchronized (this.f168416d) {
            try {
                m131478a();
                String str3 = null;
                try {
                    str3 = (String) this.f168418f.get(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (str3 != null) {
                    str2 = str3;
                }
            } finally {
                MethodCollector.m26664o(13697);
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        MethodCollector.m26663i(13698);
        synchronized (this.f168416d) {
            try {
                m131478a();
                Set<String> set2 = null;
                try {
                    set2 = (Set) this.f168418f.get(str);
                } catch (ClassCastException e) {
                    e.printStackTrace();
                }
                if (set2 != null) {
                    set = set2;
                }
            } finally {
                MethodCollector.m26664o(13698);
            }
        }
        return set;
    }

    public SharedPreferencesC74917g(String str, File file) {
        Executor a;
        MethodCollector.m26663i(13408);
        Object obj = new Object();
        this.f168416d = obj;
        this.f168413a = file;
        this.f168414b = str;
        this.f168415c = new File(file.getPath() + ".bak");
        this.f168420h = false;
        this.f168418f = null;
        synchronized (obj) {
            try {
                this.f168420h = false;
            } catch (Throwable th) {
                MethodCollector.m26664o(13408);
                throw th;
            }
        }
        int a2 = C46855dv.m90166a() % 8;
        if (a2 == 1) {
            a = C74915e.m131476a(2);
        } else if (a2 == 2) {
            a = C40780g.m82245b();
        } else if (a2 == 3) {
            a = C74915e.m131476a(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
        } else if (a2 != 4) {
            if (C74915e.f168409e == null) {
                C74915e.f168409e = ExecutorC74916f.f168411a;
            }
            a = C74915e.f168409e;
        } else {
            a = C40780g.m82241a();
        }
        a.execute(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.RunnableC749181 */

            static {
                Covode.recordClassIndex(87783);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
                r4 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
                if (r3.f168413a.canRead() == false) goto L_0x0068;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r2 = new java.io.BufferedInputStream(new java.io.FileInputStream(r3.f168413a), 16384);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
                r1 = android.util.Xml.newPullParser();
                r1.setInput(r2, null);
                r0 = (java.util.HashMap) com.p2082ss.android.ugc.aweme.p3924sp.C74927j.m131485a(r1, new java.lang.String[1]);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                r2.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
                r0 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
                r2.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
                if (r2 != null) goto L_0x005e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
                r2.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
                r0 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13389);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
                throw r0;
             */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[SYNTHETIC, Splitter:B:36:0x006b] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 201
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.RunnableC749181.run():void");
            }
        });
        MethodCollector.m26664o(13408);
    }

    /* renamed from: a */
    public final void mo117973a(final C74924b bVar, final Runnable runnable, final List<String> list) {
        final boolean z;
        MethodCollector.m26663i(13891);
        boolean z2 = false;
        if (runnable == null) {
            z = true;
        } else {
            z = false;
        }
        RunnableC749192 r6 = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.RunnableC749192 */

            static {
                Covode.recordClassIndex(87784);
            }

            /* JADX WARNING: Removed duplicated region for block: B:48:0x00be A[SYNTHETIC, Splitter:B:48:0x00be] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 273
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3924sp.SharedPreferencesC74917g.RunnableC749192.run():void");
            }
        };
        if (z) {
            synchronized (this.f168416d) {
                try {
                    if (this.f168419g == 1) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13891);
                    throw th;
                }
            }
            if (z2) {
                r6.run();
                MethodCollector.m26664o(13891);
                return;
            }
        }
        boolean z3 = !z;
        Handler a = C74913d.m131473a();
        synchronized (C74913d.f168396a) {
            try {
                C74913d.f168399d.add(r6);
                if (!z3 || !C74913d.f168400e) {
                    a.sendEmptyMessage(1);
                } else {
                    a.sendEmptyMessageDelayed(1, 100);
                }
            } finally {
                MethodCollector.m26664o(13891);
            }
        }
    }
}
