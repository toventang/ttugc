package com.bytedance.keva.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KevaSpAdapter implements SharedPreferences {
    private static final Executor sApplyExecutor = Executors.newCachedThreadPool();
    public static final Executor sWriterExecutor = m38931xfd997421();
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = obtainMap();
    public Keva mKeva;
    public SharedPreferences mSp;

    public SharedPreferences.Editor edit() {
        return new Editor();
    }

    public static Map obtainMap() {
        int i = Build.VERSION.SDK_INT;
        return new ArrayMap();
    }

    public class Editor implements SharedPreferences.Editor {
        private boolean mClear;
        private Map<String, Object> mTempMap = KevaSpAdapter.obtainMap();

        static {
            Covode.recordClassIndex(24240);
        }

        public synchronized void apply() {
            MethodCollector.m26663i(2765);
            commit();
            MethodCollector.m26664o(2765);
        }

        public synchronized SharedPreferences.Editor clear() {
            MethodCollector.m26663i(2711);
            this.mClear = true;
            MethodCollector.m26664o(2711);
            return this;
        }

        public synchronized boolean commit() {
            MethodCollector.m26663i(2717);
            final Map<String, Object> map = this.mTempMap;
            final boolean z = this.mClear;
            if (KevaSpAdapter.this.mSp != null) {
                KevaSpAdapter.sWriterExecutor.execute(new Runnable() {
                    /* class com.bytedance.keva.adapter.KevaSpAdapter.Editor.RunnableC206841 */

                    static {
                        Covode.recordClassIndex(24241);
                    }

                    public void run() {
                        Editor.this.doWriteSp(map, z);
                    }
                });
            }
            doWriteKeva(map, z);
            this.mTempMap = KevaSpAdapter.obtainMap();
            if (this.mClear) {
                this.mClear = false;
            }
            MethodCollector.m26664o(2717);
            return true;
        }

        public Editor() {
        }

        public synchronized SharedPreferences.Editor remove(String str) {
            MethodCollector.m26663i(2598);
            this.mTempMap.put(str, this);
            MethodCollector.m26664o(2598);
            return this;
        }

        public synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
            MethodCollector.m26663i(2596);
            this.mTempMap.put(str, Boolean.valueOf(z));
            MethodCollector.m26664o(2596);
            return this;
        }

        public synchronized SharedPreferences.Editor putFloat(String str, float f) {
            MethodCollector.m26663i(2530);
            this.mTempMap.put(str, Float.valueOf(f));
            MethodCollector.m26664o(2530);
            return this;
        }

        public synchronized SharedPreferences.Editor putInt(String str, int i) {
            MethodCollector.m26663i(2525);
            this.mTempMap.put(str, Integer.valueOf(i));
            MethodCollector.m26664o(2525);
            return this;
        }

        public synchronized SharedPreferences.Editor putLong(String str, long j) {
            MethodCollector.m26663i(2528);
            this.mTempMap.put(str, Long.valueOf(j));
            MethodCollector.m26664o(2528);
            return this;
        }

        public synchronized SharedPreferences.Editor putString(String str, String str2) {
            MethodCollector.m26663i(2468);
            this.mTempMap.put(str, str2);
            MethodCollector.m26664o(2468);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            MethodCollector.m26663i(2519);
            this.mTempMap.put(str, set);
            MethodCollector.m26664o(2519);
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpAdapter.this.mKeva.clear();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        KevaSpAdapter.this.mKeva.storeInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        KevaSpAdapter.this.mKeva.storeBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        KevaSpAdapter.this.mKeva.storeString(key, (String) value);
                    } else if (value instanceof Long) {
                        KevaSpAdapter.this.mKeva.storeLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        KevaSpAdapter.this.mKeva.storeFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Set) {
                        KevaSpAdapter.this.mKeva.storeStringSet(key, (Set) value);
                    }
                }
                KevaSpAdapter.this.mKeva.erase(key);
            }
        }

        public void doWriteSp(Map<String, Object> map, boolean z) {
            SharedPreferences.Editor edit = KevaSpAdapter.this.mSp.edit();
            if (z) {
                edit.clear();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    edit.remove(key);
                } else if (value instanceof Integer) {
                    edit.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Boolean) {
                    edit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    edit.putString(key, (String) value);
                } else if (value instanceof Long) {
                    edit.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Set) {
                    edit.putStringSet(key, (Set) value);
                } else {
                    edit.remove(key);
                }
            }
            edit.commit();
        }
    }

    static {
        Covode.recordClassIndex(24238);
    }

    /* renamed from: com_bytedance_keva_adapter_KevaSpAdapter_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m38931xfd997421() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    @Override // android.content.SharedPreferences
    public synchronized Map<String, ?> getAll() {
        HashMap hashMap;
        MethodCollector.m26663i(2887);
        hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.mKeva.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String[]) {
                    HashSet hashSet = new HashSet(16, 0.75f);
                    for (String str : (String[]) value) {
                        hashSet.add(str);
                    }
                    value = hashSet;
                }
                hashMap.put(key, value);
            }
        }
        MethodCollector.m26664o(2887);
        return hashMap;
    }

    private KevaSpAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public synchronized boolean contains(String str) {
        boolean contains;
        MethodCollector.m26663i(3317);
        contains = this.mKeva.contains(str);
        MethodCollector.m26664o(3317);
        return contains;
    }

    public synchronized void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        MethodCollector.m26663i(3454);
        C206831 r1 = new Keva.OnChangeListener() {
            /* class com.bytedance.keva.adapter.KevaSpAdapter.C206831 */

            static {
                Covode.recordClassIndex(24239);
            }

            @Override // com.bytedance.keva.Keva.OnChangeListener
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(r1);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, r1);
        MethodCollector.m26664o(3454);
    }

    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        MethodCollector.m26663i(3471);
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
        MethodCollector.m26664o(3471);
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        boolean z2;
        MethodCollector.m26663i(3211);
        z2 = this.mKeva.getBoolean(str, z);
        MethodCollector.m26664o(3211);
        return z2;
    }

    public synchronized float getFloat(String str, float f) {
        float f2;
        MethodCollector.m26663i(3207);
        f2 = this.mKeva.getFloat(str, f);
        MethodCollector.m26664o(3207);
        return f2;
    }

    public synchronized int getInt(String str, int i) {
        int i2;
        MethodCollector.m26663i(3131);
        i2 = this.mKeva.getInt(str, i);
        MethodCollector.m26664o(3131);
        return i2;
    }

    public synchronized long getLong(String str, long j) {
        long j2;
        MethodCollector.m26663i(3137);
        j2 = this.mKeva.getLong(str, j);
        MethodCollector.m26664o(3137);
        return j2;
    }

    public synchronized String getString(String str, String str2) {
        MethodCollector.m26663i(2974);
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            MethodCollector.m26664o(2974);
            return string;
        }
        MethodCollector.m26664o(2974);
        return str2;
    }

    @Override // android.content.SharedPreferences
    public synchronized Set<String> getStringSet(String str, Set<String> set) {
        MethodCollector.m26663i(3128);
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            MethodCollector.m26664o(3128);
            return stringSet;
        }
        MethodCollector.m26664o(3128);
        return set;
    }

    public static KevaSpAdapter getSharedPreferences(Context context, String str, int i, boolean z) {
        int i2;
        MethodCollector.m26663i(2872);
        if (i == 4) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        KevaSpAdapter kevaSpAdapter = new KevaSpAdapter(Keva.getRepoFromSp(context, str, i2));
        if (z) {
            kevaSpAdapter.mSp = context.getSharedPreferences(str, i);
        }
        MethodCollector.m26664o(2872);
        return kevaSpAdapter;
    }
}
