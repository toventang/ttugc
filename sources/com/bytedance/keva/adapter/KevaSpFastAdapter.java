package com.bytedance.keva.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.adapter.xml.XmlUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParserException;

public class KevaSpFastAdapter implements SharedPreferences {
    private static final Executor sApplyExecutor = Executors.newCachedThreadPool();
    public static final Executor sWriterExecutor = m38933xbc386925();
    private File mBackupFile;
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = new C0484a();
    public File mFile;
    public Keva mKeva;

    public class Editor implements SharedPreferences.Editor {
        private boolean mClear;
        private Map<String, Object> mTempMap = new C0484a();

        static {
            Covode.recordClassIndex(24244);
        }

        public SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        public void apply() {
            commit();
        }

        public boolean commit() {
            doWriteKeva(this.mTempMap, this.mClear);
            if (KevaSpFastAdapter.this.mFile != null) {
                KevaSpFastAdapter.sWriterExecutor.execute(new Runnable() {
                    /* class com.bytedance.keva.adapter.KevaSpFastAdapter.Editor.RunnableC206861 */

                    static {
                        Covode.recordClassIndex(24245);
                    }

                    public void run() {
                        KevaSpFastAdapter.this.doWriteSp(KevaSpFastAdapter.this.getAll());
                    }
                });
            }
            this.mTempMap = new C0484a();
            if (!this.mClear) {
                return true;
            }
            this.mClear = false;
            return true;
        }

        public Editor() {
        }

        public SharedPreferences.Editor remove(String str) {
            MethodCollector.m26663i(2294);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, this);
                } finally {
                    MethodCollector.m26664o(2294);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            MethodCollector.m26663i(2292);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Boolean.valueOf(z));
                } finally {
                    MethodCollector.m26664o(2292);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            MethodCollector.m26663i(2285);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Float.valueOf(f));
                } finally {
                    MethodCollector.m26664o(2285);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            MethodCollector.m26663i(2260);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Integer.valueOf(i));
                } finally {
                    MethodCollector.m26664o(2260);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            MethodCollector.m26663i(2282);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, Long.valueOf(j));
                } finally {
                    MethodCollector.m26664o(2282);
                }
            }
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            MethodCollector.m26663i(2252);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, str2);
                } finally {
                    MethodCollector.m26664o(2252);
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            MethodCollector.m26663i(2256);
            Map<String, Object> map = this.mTempMap;
            synchronized (map) {
                try {
                    map.put(str, set);
                } finally {
                    MethodCollector.m26664o(2256);
                }
            }
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            MethodCollector.m26663i(2375);
            if (z) {
                KevaSpFastAdapter.this.mKeva.clear();
            }
            synchronized (map) {
                try {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == null) {
                            KevaSpFastAdapter.this.mKeva.erase(key);
                        }
                        if (value instanceof Integer) {
                            KevaSpFastAdapter.this.mKeva.storeInt(key, ((Integer) value).intValue());
                        } else if (value instanceof Boolean) {
                            KevaSpFastAdapter.this.mKeva.storeBoolean(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof String) {
                            KevaSpFastAdapter.this.mKeva.storeString(key, (String) value);
                        } else if (value instanceof Long) {
                            KevaSpFastAdapter.this.mKeva.storeLong(key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            KevaSpFastAdapter.this.mKeva.storeFloat(key, ((Float) value).floatValue());
                        } else if (value instanceof Set) {
                            KevaSpFastAdapter.this.mKeva.storeStringSet(key, (Set) value);
                        } else {
                            KevaSpFastAdapter.this.mKeva.erase(key);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(2375);
                }
            }
        }
    }

    public SharedPreferences.Editor edit() {
        return new Editor();
    }

    static {
        Covode.recordClassIndex(24242);
    }

    /* renamed from: com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m38933xbc386925() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
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
        return hashMap;
    }

    public boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    private KevaSpFastAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        C206851 r1 = new Keva.OnChangeListener() {
            /* class com.bytedance.keva.adapter.KevaSpFastAdapter.C206851 */

            static {
                Covode.recordClassIndex(24243);
            }

            @Override // com.bytedance.keva.Keva.OnChangeListener
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpFastAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(r1);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, r1);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    /* renamed from: com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m38932xe97533a0(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    private static FileOutputStream createFileOutputStream(File file) {
        FileOutputStream fileOutputStream;
        MethodCollector.m26663i(1223);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                MethodCollector.m26664o(1223);
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
            }
        }
        fileOutputStream2 = fileOutputStream;
        MethodCollector.m26664o(1223);
        return fileOutputStream2;
    }

    /* renamed from: com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m38934xb6143940(File file) {
        MethodCollector.m26663i(1118);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1118);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1118);
        return delete;
    }

    public void doWriteSp(Map<String, ?> map) {
        MethodCollector.m26663i(1107);
        boolean exists = this.mBackupFile.exists();
        if (this.mFile.exists()) {
            if (!exists) {
                this.mFile.renameTo(this.mBackupFile);
            } else {
                m38934xb6143940(this.mFile);
            }
        }
        FileOutputStream createFileOutputStream = createFileOutputStream(this.mFile);
        if (createFileOutputStream == null) {
            MethodCollector.m26664o(1107);
            return;
        }
        try {
            XmlUtils.writeMapXml(map, createFileOutputStream);
            createFileOutputStream.getFD().sync();
            m38934xb6143940(this.mBackupFile);
            try {
                createFileOutputStream.close();
                MethodCollector.m26664o(1107);
            } catch (IOException unused) {
                MethodCollector.m26664o(1107);
            }
        } catch (IOException unused2) {
            m38934xb6143940(this.mFile);
            try {
                createFileOutputStream.close();
                MethodCollector.m26664o(1107);
            } catch (IOException unused3) {
                MethodCollector.m26664o(1107);
            }
        } catch (XmlPullParserException unused4) {
            m38934xb6143940(this.mFile);
            try {
                createFileOutputStream.close();
                MethodCollector.m26664o(1107);
            } catch (IOException unused5) {
                MethodCollector.m26664o(1107);
            }
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException("fail to write " + this.mFile.getName() + ", dump: " + map.keySet(), e);
            MethodCollector.m26664o(1107);
            throw runtimeException;
        } catch (Throwable th) {
            try {
                createFileOutputStream.close();
            } catch (IOException unused6) {
            }
            MethodCollector.m26664o(1107);
            throw th;
        }
    }

    public boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    public float getFloat(String str, float f) {
        return this.mKeva.getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return this.mKeva.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.mKeva.getLong(str, j);
    }

    public String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            return stringSet;
        }
        return set;
    }

    public static KevaSpFastAdapter getSharedPreferences(Context context, String str, int i, boolean z) {
        int i2;
        if (i == 4) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        KevaSpFastAdapter kevaSpFastAdapter = new KevaSpFastAdapter(Keva.getRepoFromSp(context, str, i2));
        if (z) {
            File com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = m38932xe97533a0(context);
            if (!com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.exists()) {
                com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.mkdirs();
            }
            kevaSpFastAdapter.mFile = new File(com_bytedance_keva_adapter_KevaSpFastAdapter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getParent(), "shared_prefs/" + str + ".xml");
            kevaSpFastAdapter.mBackupFile = new File(kevaSpFastAdapter.mFile.getPath() + ".bak");
        }
        return kevaSpFastAdapter;
    }
}
