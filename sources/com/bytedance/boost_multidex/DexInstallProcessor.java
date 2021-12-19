package com.bytedance.boost_multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import com.bytedance.boost_multidex.DexHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public class DexInstallProcessor {
    private boolean mDoCheckSum;
    private SharedPreferences mPreferences;

    static {
        Covode.recordClassIndex(15316);
    }

    DexInstallProcessor() {
        this.mDoCheckSum = new Random().nextInt(3) == 0;
        Monitor.get().logInfo("Do checksum " + this.mDoCheckSum);
    }

    private boolean checkFileValid(int i, String str, String str2, File file, boolean z) {
        long j;
        if (!file.exists()) {
            Monitor.get().logWarning("File does not exist! " + file.getPath());
            return false;
        }
        long j2 = this.mPreferences.getLong(str2 + i, -1);
        long lastModified = file.lastModified();
        if (j2 != lastModified) {
            Monitor.get().logWarning("Invalid file:  (key \"" + str + str2 + i + "\"), expected modification time: " + j2 + ", modification time: " + lastModified);
            return false;
        }
        if ("dex.checksum.".equals(str)) {
            if (z) {
                try {
                    j = Utility.doZipCheckSum(file);
                } catch (IOException unused) {
                    return false;
                }
            } else {
                if (this.mDoCheckSum) {
                    j = Utility.doFileCheckSum(file);
                }
                return true;
            }
        } else if ("odex.checksum.".equals(str)) {
            j = file.length();
        } else {
            Monitor.get().logWarning("unsupported checksum key: ".concat(String.valueOf(str)));
            return false;
        }
        long j3 = this.mPreferences.getLong(str + i, -1);
        if (j3 != j) {
            Monitor.get().logWarning("Invalid file:  (key \"" + str + str2 + i + "\"), expected checksum: " + j3 + ", file checksum: " + j);
            return false;
        }
        return true;
    }

    /* renamed from: com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m24010x31b0a122(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    private File getValidDexFile(File file, int i) {
        if (!checkFileValid(i, "dex.checksum.", "dex.time.", file, false)) {
            return null;
        }
        return file;
    }

    private File getValidOptDexFile(File file, int i) {
        if (!file.exists()) {
            Monitor.get().logInfo("opt file does not exist: " + file.getPath());
            return null;
        } else if (!checkFileValid(i, "odex.checksum.", "odex.time.", file, false)) {
            return null;
        } else {
            return file;
        }
    }

    private void installSecondaryDexes(ClassLoader classLoader, List<DexHolder> list) {
        MethodCollector.m26663i(9964);
        DexLoader.create(Build.VERSION.SDK_INT).install(classLoader, list, this.mPreferences);
        try {
            BoostNative.recoverAction();
        } catch (UnsatisfiedLinkError unused) {
        }
        Monitor.get().logDebug("After install all, sp value is " + this.mPreferences.getAll());
        MethodCollector.m26664o(9964);
    }

    private boolean isZipFileValid(File file, int i) {
        return checkFileValid(i, "dex.checksum.", "dex.time.", file, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.boost_multidex.DexHolder obtainDexHolder(int r18, java.io.File r19, java.io.File r20, java.io.File r21, java.io.File r22) {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.DexInstallProcessor.obtainDexHolder(int, java.io.File, java.io.File, java.io.File, java.io.File):com.bytedance.boost_multidex.DexHolder");
    }

    private List<DexHolder> obtainDexObjectList(File file, File file2, File file3, File file4, File file5, Result result) {
        Object obj;
        MethodCollector.m26663i(9966);
        File file6 = file;
        long doZipCheckSum = Utility.doZipCheckSum(file6);
        long lastModified = file6.lastModified();
        boolean z = (this.mPreferences.getLong("timestamp", -1) == lastModified && this.mPreferences.getLong("crc", -1) == doZipCheckSum) ? false : true;
        result.modified = z;
        ArrayList arrayList = new ArrayList();
        int i = 2;
        if (z) {
            Utility.clearDirFiles(file3);
            Utility.clearDirFiles(file4);
            Utility.clearDirFiles(file5);
            SharedPreferences.Editor edit = this.mPreferences.edit();
            edit.clear();
            edit.commit();
            ZipFile zipFile = new ZipFile(file6);
            while (true) {
                ZipEntry entry = zipFile.getEntry("classes" + i + ".dex");
                if (entry == null) {
                    break;
                }
                File file7 = new File(file3, i + ".dex");
                File file8 = new File(file4, i + ".odex");
                if (!BoostNative.isSupportFastLoad()) {
                    obj = Environment.getDataDirectory().getFreeSpace() > 150000000 ? DexHolder.obtainValidForceDexOpt(this.mPreferences, i, file7, file8, zipFile, entry) : DexHolder.obtainValidZipDex(this.mPreferences, i, new File(file5, i + ".zip"), new File(file5, i + ".odex"), zipFile, entry);
                    arrayList.add(obj);
                } else if (Utility.isBetterUseApkBuf()) {
                    arrayList.add(new DexHolder.ApkBuffer(i, obtainEntryBytesInApk(zipFile, entry), file7, file8));
                } else {
                    obj = DexHolder.obtainValidDexBuffer(this.mPreferences, i, obtainEntryFileInApk(zipFile, entry, file7), file8);
                    arrayList.add(obj);
                }
                i++;
            }
            zipFile.close();
            edit.putInt("dex.number", i - 1);
            edit.putLong("timestamp", lastModified);
            edit.putLong("crc", doZipCheckSum);
            edit.commit();
        } else {
            int i2 = this.mPreferences.getInt("dex.number", 0);
            while (i <= i2) {
                file6 = file6;
                arrayList.add(obtainDexHolder(i, file6, file3, file4, file5));
                i++;
            }
        }
        MethodCollector.m26664o(9966);
        return arrayList;
    }

    private byte[] obtainEntryBytesInApk(ZipFile zipFile, ZipEntry zipEntry) {
        return Utility.obtainEntryBytesInZip(zipFile, zipEntry);
    }

    private File obtainEntryFileInApk(ZipFile zipFile, ZipEntry zipEntry, File file) {
        return Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
    }

    /* access modifiers changed from: package-private */
    public void doInstallation(final Context context, File file, Result result) {
        File com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = m24010x31b0a122(context);
        if (!com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.exists()) {
            Utility.mkdirChecked(com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir);
        }
        Utility.clearDirFiles(new File(com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getParent(), "code_cache/secondary-dexes"));
        File ensureDirCreated = Utility.ensureDirCreated(com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, "boost_multidex");
        File ensureDirCreated2 = Utility.ensureDirCreated(ensureDirCreated, "dex_cache");
        File ensureDirCreated3 = Utility.ensureDirCreated(ensureDirCreated, "odex_cache");
        File ensureDirCreated4 = Utility.ensureDirCreated(ensureDirCreated, "zip_cache");
        result.setDirs(com_bytedance_boost_multidex_DexInstallProcessor_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4);
        Locker locker = new Locker(new File(ensureDirCreated, "boost_multidex.prepare.lock"));
        locker.lock();
        Locker locker2 = new Locker(new File(ensureDirCreated, "boost_multidex.install.lock"));
        locker2.lock();
        locker.close();
        try {
            this.mPreferences = C34822d.m71158a(context, "boost_multidex.records", 0);
            result.freeSpaceBefore = Environment.getDataDirectory().getFreeSpace();
            List<DexHolder> obtainDexObjectList = obtainDexObjectList(file, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4, result);
            installSecondaryDexes(context.getClassLoader(), obtainDexObjectList);
            locker2.close();
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            result.freeSpaceAfter = freeSpace;
            if (freeSpace < 20000000) {
                Monitor.get().logWarning("Free space is too small: " + freeSpace + ", compare to 20000000");
                return;
            }
            for (DexHolder dexHolder : obtainDexObjectList) {
                if (!((dexHolder instanceof DexHolder.ZipOpt) || (dexHolder instanceof DexHolder.DexOpt))) {
                    Monitor.get().doAfterInstall(new Runnable() {
                        /* class com.bytedance.boost_multidex.DexInstallProcessor.RunnableC133371 */

                        static {
                            Covode.recordClassIndex(15317);
                        }

                        public void run() {
                            OptimizeService.startOptimizeService(context);
                        }
                    });
                    return;
                }
            }
        } catch (Throwable th) {
            locker2.close();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void doInstallationInOptProcess(Context context, File file) {
        MethodCollector.m26663i(9963);
        if (!BoostNative.isSupportFastLoad()) {
            Monitor.get().logError("Fast load is not supported!");
            MethodCollector.m26664o(9963);
            return;
        }
        int i = 2;
        ZipFile zipFile = new ZipFile(file);
        ArrayList arrayList = new ArrayList();
        while (true) {
            ZipEntry entry = zipFile.getEntry("classes" + i + ".dex");
            if (entry != null) {
                arrayList.add(new DexHolder.ApkBuffer(i, obtainEntryBytesInApk(zipFile, entry), null, null));
                i++;
            } else {
                DexLoader.create(Build.VERSION.SDK_INT).installInOptProcess(context.getClassLoader(), arrayList);
                zipFile.close();
                try {
                    BoostNative.recoverAction();
                    MethodCollector.m26664o(9963);
                    return;
                } catch (UnsatisfiedLinkError unused) {
                    MethodCollector.m26664o(9963);
                    return;
                }
            }
        }
    }
}
