package com.bytedance.keva;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KevaPrivateImpl extends KevaImpl {
    static {
        Covode.recordClassIndex(24236);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void dump() {
        super.dump();
    }

    @Override // com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void dumpNative() {
        super.dumpNative();
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String name() {
        return super.name();
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        Map<String, ?> buildNewMap;
        MethodCollector.m26663i(2534);
        synchronized (this) {
            try {
                buildNewMap = buildNewMap(new HashMap());
            } finally {
                MethodCollector.m26664o(2534);
            }
        }
        return buildNewMap;
    }

    @Override // com.bytedance.keva.Keva
    public int count() {
        int i;
        MethodCollector.m26663i(2604);
        synchronized (this) {
            try {
                i = 0;
                for (Map.Entry entry : this.mValueMap.entrySet()) {
                    if (((KevaImpl.KevaValueWrapper) entry.getValue()).offset != 0) {
                        i++;
                    }
                }
            } finally {
                MethodCollector.m26664o(2604);
            }
        }
        return i;
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void erase(String str) {
        super.erase(str);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        super.registerChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        super.unRegisterChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ Map buildNewMap(Map map) {
        return super.buildNewMap(map);
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        boolean z;
        MethodCollector.m26663i(2536);
        synchronized (this) {
            try {
                KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
                if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } finally {
                MethodCollector.m26664o(2536);
            }
        }
        return z;
    }

    KevaPrivateImpl(String str, int i) {
        super(str, i);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeBoolean(String str, boolean z) {
        super.storeBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeBytes(String str, byte[] bArr) {
        super.storeBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeBytesJustDisk(String str, byte[] bArr) {
        super.storeBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeDouble(String str, double d) {
        super.storeDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeFloat(String str, float f) {
        super.storeFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeInt(String str, int i) {
        super.storeInt(str, i);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeLong(String str, long j) {
        super.storeLong(str, j);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeString(String str, String str2) {
        super.storeString(str, str2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringArray(String str, String[] strArr) {
        super.storeStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringArrayJustDisk(String str, String[] strArr) {
        super.storeStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringJustDisk(String str, String str2) {
        super.storeStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringSet(String str, Set set) {
        super.storeStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringSetJustDisk(String str, Set set) {
        super.storeStringSetJustDisk(str, set);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ boolean getBoolean(String str, boolean z) {
        return super.getBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ byte[] getBytes(String str, byte[] bArr) {
        return super.getBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ byte[] getBytesJustDisk(String str, byte[] bArr) {
        return super.getBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ double getDouble(String str, double d) {
        return super.getDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ float getFloat(String str, float f) {
        return super.getFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ int getInt(String str, int i) {
        return super.getInt(str, i);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ long getLong(String str, long j) {
        return super.getLong(str, j);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String getString(String str, String str2) {
        return super.getString(str, str2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String[] getStringArray(String str, String[] strArr) {
        return super.getStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String[] getStringArrayJustDisk(String str, String[] strArr) {
        return super.getStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String getStringJustDisk(String str, String str2) {
        return super.getStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ Set getStringSet(String str, Set set) {
        return super.getStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ Set getStringSetJustDisk(String str, Set set) {
        return super.getStringSetJustDisk(str, set);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public boolean fetchBoolean(String str, boolean z) {
        return ((Boolean) fetchObject(str, Boolean.valueOf(z))).booleanValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public double fetchDouble(String str, double d) {
        return ((Double) fetchObject(str, Double.valueOf(d))).doubleValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public float fetchFloat(String str, float f) {
        return ((Float) fetchObject(str, Float.valueOf(f))).floatValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public int fetchInt(String str, int i) {
        return ((Integer) fetchObject(str, Integer.valueOf(i))).intValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public long fetchLong(String str, long j) {
        return ((Long) fetchObject(str, Long.valueOf(j))).longValue();
    }

    private Object fetchObject(String str, Object obj) {
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
            return obj;
        }
        return kevaValueWrapper.value;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public String fetchString(String str, String str2, boolean z) {
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
            return str2;
        }
        if (kevaValueWrapper.loaded) {
            return (String) kevaValueWrapper.value;
        }
        String fetchString = fetchString(this.mHandle, str, kevaValueWrapper.offset, str2);
        if (z) {
            kevaValueWrapper.value = null;
            kevaValueWrapper.loaded = false;
        } else if (fetchString != str2) {
            kevaValueWrapper.value = fetchString;
            kevaValueWrapper.loaded = true;
        }
        return fetchString;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public String[] fetchStringArray(String str, String[] strArr, boolean z) {
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
            return strArr;
        }
        if (kevaValueWrapper.loaded) {
            return (String[]) kevaValueWrapper.value;
        }
        String[] fetchStringArray = fetchStringArray(this.mHandle, str, kevaValueWrapper.offset, strArr, 3);
        if (z) {
            kevaValueWrapper.value = null;
            kevaValueWrapper.loaded = false;
        } else if (fetchStringArray != strArr) {
            kevaValueWrapper.value = fetchStringArray;
            kevaValueWrapper.loaded = true;
        }
        return fetchStringArray;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public byte[] fetchBytes(String str, byte[] bArr, int i, boolean z) {
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        if (kevaValueWrapper == null || kevaValueWrapper.offset == 0) {
            return bArr;
        }
        if (kevaValueWrapper.loaded) {
            return (byte[]) kevaValueWrapper.value;
        }
        byte[] fetchBytes = fetchBytes(this.mHandle, str, kevaValueWrapper.offset, bArr, i);
        if (z) {
            kevaValueWrapper.value = null;
            kevaValueWrapper.loaded = false;
        } else if (fetchBytes != bArr) {
            kevaValueWrapper.value = fetchBytes;
            kevaValueWrapper.loaded = true;
        }
        return fetchBytes;
    }
}
