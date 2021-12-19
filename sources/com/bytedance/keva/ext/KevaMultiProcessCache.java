package com.bytedance.keva.ext;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class KevaMultiProcessCache extends Keva {
    private static final ConcurrentHashMap<String, Keva> sInstanceMap = new ConcurrentHashMap<>();
    private final CombinedMap<String, Object> mCombinedCache;
    private final Keva mInstance;

    /* renamed from: com.bytedance.keva.ext.KevaMultiProcessCache$1 */
    static /* synthetic */ class C206871 {
        static {
            Covode.recordClassIndex(24250);
        }
    }

    @Override // com.bytedance.keva.Keva
    public int count() {
        return this.mInstance.count();
    }

    @Override // com.bytedance.keva.Keva
    public void dump() {
        this.mInstance.dump();
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        return this.mInstance.getAll();
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return this.mInstance.name();
    }

    /* access modifiers changed from: package-private */
    public static class CombinedMap<K, V> extends AbstractMap<K, V> {
        private final Map<K, V> mCache;
        private final Map<K, V> mNullValuesCache;

        static {
            Covode.recordClassIndex(24251);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return null;
        }

        public void clear() {
            this.mCache.clear();
            this.mNullValuesCache.clear();
        }

        private CombinedMap() {
            this.mCache = new ConcurrentHashMap();
            this.mNullValuesCache = new ConcurrentHashMap();
        }

        /* synthetic */ CombinedMap(C206871 r1) {
            this();
        }

        public V getNotNull(Object obj) {
            return this.mCache.get(obj);
        }

        public boolean isNullValue(V v) {
            return this.mNullValuesCache.containsKey(v);
        }

        public boolean containsKey(Object obj) {
            if (this.mCache.containsKey(obj) || this.mNullValuesCache.containsKey(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (this.mCache.containsKey(obj)) {
                return this.mCache.remove(obj);
            }
            return this.mNullValuesCache.remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            if (v != null) {
                return this.mCache.put(k, v);
            }
            return this.mNullValuesCache.put(k, v);
        }
    }

    static {
        Covode.recordClassIndex(24249);
    }

    @Override // com.bytedance.keva.Keva
    public void clear() {
        this.mInstance.clear();
        this.mCombinedCache.clear();
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        return this.mInstance.buildNewMap(map);
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        return this.mCombinedCache.containsKey(str);
    }

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        this.mInstance.erase(str);
        this.mCombinedCache.remove(str);
    }

    private KevaMultiProcessCache(String str) {
        CombinedMap<String, Object> combinedMap = new CombinedMap<>(null);
        this.mCombinedCache = combinedMap;
        Keva repoSync = Keva.getRepoSync(str, 1);
        this.mInstance = repoSync;
        repoSync.buildNewMap(combinedMap);
    }

    public static Keva getRepoSync(String str) {
        ConcurrentHashMap<String, Keva> concurrentHashMap = sInstanceMap;
        Keva keva = concurrentHashMap.get(str);
        if (keva != null) {
            return keva;
        }
        KevaMultiProcessCache kevaMultiProcessCache = new KevaMultiProcessCache(str);
        concurrentHashMap.put(str, kevaMultiProcessCache);
        return kevaMultiProcessCache;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        this.mInstance.storeBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        this.mInstance.storeStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        this.mInstance.storeStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        this.mInstance.storeStringSetJustDisk(str, set);
    }

    private Object getBasicTypeValue(String str, Object obj) {
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull == null) {
            return obj;
        }
        return notNull;
    }

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        try {
            return ((Boolean) getBasicTypeValue(str, Boolean.valueOf(z))).booleanValue();
        } catch (Throwable unused) {
            return z;
        }
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        try {
            return ((Double) getBasicTypeValue(str, Double.valueOf(d))).doubleValue();
        } catch (Throwable unused) {
            return d;
        }
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        try {
            return ((Float) getBasicTypeValue(str, Float.valueOf(f))).floatValue();
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        try {
            return ((Integer) getBasicTypeValue(str, Integer.valueOf(i))).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        try {
            return ((Long) getBasicTypeValue(str, Long.valueOf(j))).longValue();
        } catch (Throwable unused) {
            return j;
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        this.mCombinedCache.put(str, Boolean.valueOf(z));
        this.mInstance.storeBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        this.mCombinedCache.put(str, bArr);
        this.mInstance.storeBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        this.mCombinedCache.put(str, Double.valueOf(d));
        this.mInstance.storeDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        this.mCombinedCache.put(str, Float.valueOf(f));
        this.mInstance.storeFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        this.mCombinedCache.put(str, Integer.valueOf(i));
        this.mInstance.storeInt(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        this.mCombinedCache.put(str, Long.valueOf(j));
        this.mInstance.storeLong(str, j);
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        this.mCombinedCache.put(str, str2);
        this.mInstance.storeString(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        this.mCombinedCache.put(str, strArr);
        this.mInstance.storeStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        this.mCombinedCache.put(str, set);
        this.mInstance.storeStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        if (this.mCombinedCache.isNullValue(str)) {
            return null;
        }
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull instanceof byte[]) {
            return (byte[]) notNull;
        }
        return bArr;
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        if (this.mCombinedCache.isNullValue(str)) {
            return null;
        }
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull instanceof String) {
            return (String) notNull;
        }
        return str2;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        if (this.mCombinedCache.isNullValue(str)) {
            return null;
        }
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull instanceof String[]) {
            return (String[]) notNull;
        }
        return strArr;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        if (this.mCombinedCache.isNullValue(str)) {
            return null;
        }
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull instanceof Set) {
            return (Set) notNull;
        }
        return set;
    }
}
