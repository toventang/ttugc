package com.bytedance.keva;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class KevaFuture extends Keva {
    private static final IKevaPreLoader KEVA_PRELOADER = KevaPreLoaderHolder.getPreLoader();
    private KevaImpl mFallBackInstance;
    private FutureTask<KevaImpl> mFuture;
    private int mMode;
    private String mName;

    @Override // com.bytedance.keva.Keva
    public void clear() {
        obtain().clear();
    }

    @Override // com.bytedance.keva.Keva
    public void dump() {
        obtain().dump();
    }

    static {
        Covode.recordClassIndex(24220);
    }

    @Override // com.bytedance.keva.Keva
    public int count() {
        return obtain().count();
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        return obtain().getAll();
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return obtain().name();
    }

    private KevaImpl obtain() {
        KEVA_PRELOADER.access(this.mName, this.mMode);
        try {
            return this.mFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            KevaImpl.sMonitor.logDebug("fail to obtain keva future instance");
            KevaImpl.sMonitor.reportThrowable(5, this.mName, null, null, e);
            if (this.mFallBackInstance == null) {
                KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(this.mName, this.mMode);
                this.mFallBackInstance = emptyRepoImpl;
                emptyRepoImpl.init(false);
            }
            return this.mFallBackInstance;
        }
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        obtain().erase(str);
    }

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        obtain().registerChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        obtain().unRegisterChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        return obtain().buildNewMap(map);
    }

    /* access modifiers changed from: package-private */
    public void checkMode(int i) {
        if (this.mFuture.isDone()) {
            obtain().checkMode(i);
        }
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        return obtain().contains(str);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        obtain().storeBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        obtain().storeBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        obtain().storeBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        obtain().storeDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        obtain().storeFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        obtain().storeInt(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        obtain().storeLong(str, j);
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        obtain().storeString(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        obtain().storeStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        obtain().storeStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        obtain().storeStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        obtain().storeStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        obtain().storeStringSetJustDisk(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        return obtain().getBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        return obtain().getBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        return obtain().getBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        return obtain().getDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        return obtain().getFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        return obtain().getInt(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        return obtain().getLong(str, j);
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        return obtain().getString(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        return obtain().getStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        return obtain().getStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        return obtain().getStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        return obtain().getStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        return obtain().getStringSetJustDisk(str, set);
    }

    KevaFuture(String str, int i, Callable<KevaImpl> callable) {
        this.mName = str;
        this.mMode = i;
        this.mFuture = new FutureTask<>(callable);
        KevaImpl.sExecutor.execute(this.mFuture);
    }
}
