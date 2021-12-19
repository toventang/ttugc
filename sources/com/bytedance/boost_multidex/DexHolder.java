package com.bytedance.boost_multidex;

import android.content.SharedPreferences;
import com.bytedance.boost_multidex.DexLoader;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public abstract class DexHolder {
    File mFile;

    /* access modifiers changed from: package-private */
    public static class ApkBuffer extends DexHolder {
        private byte[] mBytes;
        private int mIndex;
        private File mOptFile;

        static {
            Covode.recordClassIndex(15311);
        }

        ApkBuffer(int i, byte[] bArr, File file, File file2) {
            this.mIndex = i;
            this.mBytes = bArr;
            this.mFile = file;
            this.mOptFile = file2;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public StoreInfo getInfo() {
            return null;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexFile() {
            MethodCollector.m26663i(9641);
            try {
                Object loadDirectDex = BoostNative.loadDirectDex(null, this.mBytes);
                MethodCollector.m26664o(9641);
                return loadDirectDex;
            } catch (Exception e) {
                Monitor.get().logError("Fail to create DexFile: " + toString(), e);
                Result.get().unFatalThrowable.add(e);
                MethodCollector.m26664o(9641);
                return null;
            }
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexListElement(DexLoader.ElementConstructor elementConstructor) {
            Object dexFile = toDexFile();
            if (dexFile == null) {
                return null;
            }
            return elementConstructor.newInstance(null, dexFile);
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            if (Utility.storeBytesToFile(this.mBytes, this.mFile)) {
                try {
                    return DexHolder.obtainValidDexBuffer(sharedPreferences, this.mIndex, this.mFile, this.mOptFile);
                } catch (IOException e) {
                    Monitor.get().logError("fail to get dex buffer", e);
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder append = new StringBuilder().append(super.toString()).append(", index: ").append(this.mIndex).append(", [file: ").append(this.mFile.getPath()).append(", size: ").append(this.mFile.length()).append("], [opt file: ").append(this.mOptFile).append(", size: ").append(this.mOptFile.length()).append("], bytes len: ");
            byte[] bArr = this.mBytes;
            return append.append(bArr == null ? null : Integer.valueOf(bArr.length)).toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static class DexBuffer extends DexHolder {
        private int mIndex;
        private File mOptFile;

        static {
            Covode.recordClassIndex(15312);
        }

        DexBuffer(int i, File file, File file2) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public StoreInfo getInfo() {
            return new StoreInfo(1, this.mIndex, this.mFile);
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexFile() {
            MethodCollector.m26663i(8782);
            try {
                Object loadDirectDex = BoostNative.loadDirectDex(this.mFile.getPath(), null);
                MethodCollector.m26664o(8782);
                return loadDirectDex;
            } catch (Exception e) {
                Monitor.get().logError("Fail to create DexFile: " + toString(), e);
                Result.get().unFatalThrowable.add(e);
                MethodCollector.m26664o(8782);
                return null;
            }
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            MethodCollector.m26663i(8923);
            try {
                if (!BoostNative.isSupportFastLoad() || !BoostNative.makeOptDexFile(this.mFile.getPath(), this.mOptFile.getPath())) {
                    Monitor.get().logWarning("Opt dex in origin way");
                    DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0).close();
                }
                DexHolder obtainValidDexOpt = obtainValidDexOpt(sharedPreferences, this.mIndex, this.mFile, this.mOptFile);
                MethodCollector.m26664o(8923);
                return obtainValidDexOpt;
            } catch (IOException e) {
                Monitor.get().logError("Fail to opt dex finally", e);
                MethodCollector.m26664o(8923);
                return null;
            }
        }

        public String toString() {
            return super.toString() + ", index: " + this.mIndex + ", [file: " + this.mFile.getPath() + ", size: " + this.mFile.length() + "], [opt file: " + this.mOptFile + ", size: " + this.mOptFile.length() + "]";
        }
    }

    /* access modifiers changed from: package-private */
    public static class DexOpt extends DexHolder {
        private boolean mForceOpt;
        private int mIndex;
        private File mOptFile;

        static {
            Covode.recordClassIndex(15313);
        }

        DexOpt(int i, File file, File file2, boolean z) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
            this.mForceOpt = z;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public StoreInfo getInfo() {
            return new StoreInfo(2, this.mIndex, this.mOptFile);
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexFile() {
            MethodCollector.m26663i(8777);
            try {
                DexFile loadDex = DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
                MethodCollector.m26664o(8777);
                return loadDex;
            } catch (IOException e) {
                Monitor.get().logError("Fail to load dex file first time", e);
                try {
                    if (this.mForceOpt) {
                        DexFile loadDex2 = DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
                        MethodCollector.m26664o(8777);
                        return loadDex2;
                    }
                    Object loadDirectDex = BoostNative.loadDirectDex(this.mFile.getPath(), null);
                    MethodCollector.m26664o(8777);
                    return loadDirectDex;
                } catch (IOException e2) {
                    Monitor.get().logError("Fail to load dex file", e2);
                    RuntimeException runtimeException = new RuntimeException(e2);
                    MethodCollector.m26664o(8777);
                    throw runtimeException;
                }
            }
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            return null;
        }

        public String toString() {
            return super.toString() + ", index: " + this.mIndex + ", [file: " + this.mFile.getPath() + ", size: " + this.mFile.length() + "], [opt file: " + this.mOptFile + ", size: " + this.mOptFile.length() + "], force: " + this.mForceOpt;
        }
    }

    class StoreInfo {
        File file;
        int index;
        int type;

        static {
            Covode.recordClassIndex(15314);
        }

        StoreInfo(int i, int i2, File file2) {
            this.type = i;
            this.index = i2;
            this.file = file2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class ZipOpt extends DexHolder {
        private int mIndex;
        private File mOptFile;

        static {
            Covode.recordClassIndex(15315);
        }

        ZipOpt(int i, File file, File file2) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public StoreInfo getInfo() {
            return null;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexFile() {
            MethodCollector.m26663i(9485);
            try {
                DexFile loadDex = DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
                MethodCollector.m26664o(9485);
                return loadDex;
            } catch (IOException e) {
                Monitor.get().logError("Fail to load dex file");
                RuntimeException runtimeException = new RuntimeException(e);
                MethodCollector.m26664o(9485);
                throw runtimeException;
            }
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            return null;
        }

        public String toString() {
            return super.toString() + ", index: " + this.mIndex + ", [file: " + this.mFile.getPath() + ", size: " + this.mFile.length() + "], [opt file: " + this.mOptFile + ", size: " + this.mOptFile.length() + "]";
        }
    }

    static {
        Covode.recordClassIndex(15310);
    }

    DexHolder() {
    }

    static DexHolder obtainValidDexBuffer(SharedPreferences sharedPreferences, int i, File file, File file2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i, 1);
        putDexFileInfo(edit, i, file);
        edit.commit();
        return new DexBuffer(i, file, file2);
    }

    static DexHolder obtainValidDexOpt(SharedPreferences sharedPreferences, int i, File file, File file2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i, 2);
        putDexOptInfo(edit, i, file2);
        edit.commit();
        return new DexOpt(i, file, file2, false);
    }

    static DexHolder obtainValidForceDexOpt(SharedPreferences sharedPreferences, int i, File file, File file2, ZipFile zipFile, ZipEntry zipEntry) {
        File obtainEntryFileInZip = Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i, 2);
        putDexFileInfo(edit, i, obtainEntryFileInZip);
        edit.commit();
        return new DexOpt(i, obtainEntryFileInZip, file2, true);
    }

    static ZipOpt obtainValidZipDex(SharedPreferences sharedPreferences, int i, File file, File file2, ZipFile zipFile, ZipEntry zipEntry) {
        Utility.obtainZipForEntryFileInZip(zipFile, zipEntry, file);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i, 3);
        putZipOptInfo(edit, i, file);
        edit.commit();
        return new ZipOpt(i, file, file2);
    }

    private static void putDexFileInfo(SharedPreferences.Editor editor, int i, File file) {
        long doFileCheckSum = Utility.doFileCheckSum(file);
        editor.putLong("dex.checksum." + i, doFileCheckSum);
        long lastModified = file.lastModified();
        editor.putLong("dex.time." + i, lastModified);
        Monitor.get().logInfo("Put f key " + "dex.checksum." + "dex.time." + i + " checksum=" + doFileCheckSum + ", time=" + lastModified);
    }

    private static void putDexOptInfo(SharedPreferences.Editor editor, int i, File file) {
        long length = file.length();
        editor.putLong("odex.checksum." + i, length);
        long lastModified = file.lastModified();
        editor.putLong("odex.time." + i, lastModified);
        Monitor.get().logInfo("Put o key " + "odex.checksum." + "odex.time." + i + " checksum=" + length + ", time=" + lastModified);
    }

    private static void putTypeInfo(SharedPreferences.Editor editor, int i, int i2) {
        editor.putInt("dex.obj.type".concat(String.valueOf(i)), i2);
    }

    private static void putZipOptInfo(SharedPreferences.Editor editor, int i, File file) {
        long doZipCheckSum = Utility.doZipCheckSum(file);
        editor.putLong("dex.checksum." + i, doZipCheckSum);
        long lastModified = file.lastModified();
        editor.putLong("dex.time." + i, lastModified);
        Monitor.get().logInfo("Put z key " + "dex.checksum." + "dex.time." + i + " checksum=" + doZipCheckSum + ", time=" + lastModified);
    }

    /* access modifiers changed from: package-private */
    public abstract StoreInfo getInfo();

    /* access modifiers changed from: package-private */
    public abstract Object toDexFile();

    /* access modifiers changed from: protected */
    public Object toDexListElement(DexLoader.ElementConstructor elementConstructor) {
        Object dexFile = toDexFile();
        if (dexFile == null) {
            return null;
        }
        return elementConstructor.newInstance(this.mFile, dexFile);
    }

    /* access modifiers changed from: package-private */
    public abstract DexHolder toFasterHolder(SharedPreferences sharedPreferences);
}
