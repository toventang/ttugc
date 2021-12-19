package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* access modifiers changed from: package-private */
public final class MultiDexExtractor implements Closeable {
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    static {
        Covode.recordClassIndex(1456);
    }

    /* renamed from: androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m4110xd3340ff4(String str, String str2) {
        return 0;
    }

    /* renamed from: androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m4111xd3341002(String str, String str2) {
        return 0;
    }

    /* renamed from: androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m4112xd3341002(String str, String str2, Throwable th) {
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    private void clearDexDir() {
        File[] listFiles = this.dexDir.listFiles(new FileFilter() {
            /* class androidx.multidex.MultiDexExtractor.C13341 */

            static {
                Covode.recordClassIndex(1457);
            }

            public boolean accept(File file) {
                if (!file.getName().equals("MultiDex.lock")) {
                    return true;
                }
                return false;
            }
        });
        if (listFiles == null) {
            m4111xd3341002("MultiDex", "Failed to list secondary dex dir content (" + this.dexDir.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            m4110xd3340ff4("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!m4113x328ab21e(file)) {
                m4111xd3341002("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                m4110xd3340ff4("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    private List<ExtractedDex> performExtractions() {
        String str;
        String str2 = this.sourceApk.getName() + ".classes";
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.sourceApk);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry(new StringBuilder("classes2.dex").toString());
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i + ".zip");
                arrayList.add(extractedDex);
                m4110xd3340ff4("MultiDex", "Extraction is needed for file ".concat(String.valueOf(extractedDex)));
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    extract(zipFile, entry, extractedDex, str2);
                    try {
                        extractedDex.crc = getZipCrc(extractedDex);
                        z = true;
                    } catch (IOException e) {
                        m4112xd3341002("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder("Extraction ");
                    if (z) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    m4110xd3340ff4("MultiDex", sb.append(str).append(" '").append(extractedDex.getAbsolutePath()).append("': length ").append(extractedDex.length()).append(" - crc: ").append(extractedDex.crc).toString());
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            m4111xd3341002("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                }
                if (z) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e2) {
                m4112xd3341002("MultiDex", "Failed to close resource", e2);
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            m4112xd3341002("MultiDex", "Failed to close resource", e);
        }
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        int i = Build.VERSION.SDK_INT;
        return C34822d.m71158a(context, "multidex.version", 4);
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static long getZipCrc(File file) {
        long zipCrc = ZipUtil.getZipCrc(file);
        if (zipCrc == -1) {
            return zipCrc - 1;
        }
        return zipCrc;
    }

    /* renamed from: androidx_multidex_MultiDexExtractor_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m4113x328ab21e(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* access modifiers changed from: package-private */
    public static class ExtractedDex extends File {
        public long crc = -1;

        static {
            Covode.recordClassIndex(1458);
        }

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    MultiDexExtractor(File file, File file2) {
        m4110xd3340ff4("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                m4110xd3340ff4("MultiDex", "Blocking on lock " + file3.getPath());
                this.cacheLock = channel.lock();
                m4110xd3340ff4("MultiDex", file3.getPath() + " locked");
            } catch (IOException | Error | RuntimeException e) {
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e2) {
            closeQuietly(this.lockRaf);
            throw e2;
        }
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) {
        m4110xd3340ff4("MultiDex", "loading existing secondary dex files");
        String str2 = this.sourceApk.getName() + ".classes";
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i = multiDexPreferences.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        for (int i2 = 2; i2 <= i; i2++) {
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i2 + ".zip");
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                long j = multiDexPreferences.getLong(str + "dex.crc." + i2, -1);
                long j2 = multiDexPreferences.getLong(str + "dex.time." + i2, -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified && j == extractedDex.crc) {
                    arrayList.add(extractedDex);
                } else {
                    throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List<? extends File> load(Context context, String str, boolean z) {
        List<ExtractedDex> list;
        m4110xd3340ff4("MultiDex", "MultiDexExtractor.load(" + this.sourceApk.getPath() + ", " + z + ", " + str + ")");
        if (this.cacheLock.isValid()) {
            if (!z && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
                try {
                    list = loadExistingExtractions(context, str);
                } catch (IOException e) {
                    m4112xd3341002("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                }
                m4110xd3340ff4("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            } else if (z) {
                m4110xd3340ff4("MultiDex", "Forced extraction must be performed.");
            } else {
                m4110xd3340ff4("MultiDex", "Detected that extraction must be performed.");
            }
            list = performExtractions();
            putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, list);
            m4110xd3340ff4("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    private static boolean isModified(Context context, File file, long j, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        if (multiDexPreferences.getLong(str + "timestamp", -1) == getTimeStamp(file) && multiDexPreferences.getLong(str + "crc", -1) == j) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-".concat(String.valueOf(str)), ".zip", file.getParentFile());
        m4110xd3340ff4("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    m4110xd3340ff4("MultiDex", "Renaming to " + file.getPath());
                    if (!createTempFile.renameTo(file)) {
                        throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                    }
                    return;
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            closeQuietly(inputStream);
            m4113x328ab21e(createTempFile);
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + "dex.crc." + i, extractedDex.crc);
            edit.putLong(str + "dex.time." + i, extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }
}
