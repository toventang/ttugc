package com.p2082ss.android.ugc.effectmanager.common.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.common.StrictLineReader;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.common.cache.EffectIdMapFile */
public class EffectIdMapFile {
    private final LinkedHashMap<String, String> effectidMap = new LinkedHashMap<>(0, 0.75f, true);
    private int mapCount;
    private final File mapFile;
    private final File mapFileBak;
    private final File mapFileTmp;
    private Writer mapWriter;

    static {
        Covode.recordClassIndex(95445);
    }

    private void checkNotClosed() {
        if (this.mapWriter == null) {
            throw new IllegalStateException("map file is closed");
        } else if (!this.mapFile.exists()) {
            rebuildMap();
        }
    }

    private void readMap() {
        MethodCollector.m26663i(1724);
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.mapFile), FileUtils.INSTANCE.getUS_ASCII());
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            if (!"id.to.effectid".equals(readLine) || !"1".equals(readLine2) || !"".equals(readLine3)) {
                IOException iOException = new IOException("unexpected Map header: [" + readLine + ", " + readLine2 + ", " + readLine3 + "]");
                MethodCollector.m26664o(1724);
                throw iOException;
            }
            int i = 0;
            while (true) {
                try {
                    readMapLine(strictLineReader.readLine());
                    i++;
                } catch (EOFException unused) {
                    this.mapCount = i;
                    if (strictLineReader.hasUnterminatedLine()) {
                        rebuildMap();
                    } else {
                        this.mapWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFile, true), FileUtils.INSTANCE.getUS_ASCII()));
                    }
                    return;
                }
            }
        } finally {
            FileUtils.INSTANCE.closeQuietly(strictLineReader);
            MethodCollector.m26664o(1724);
        }
    }

    private synchronized void rebuildMap() {
        MethodCollector.m26663i(1740);
        Writer writer = this.mapWriter;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFileTmp), FileUtils.INSTANCE.getUS_ASCII()));
        try {
            bufferedWriter.write("id.to.effectid");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            this.mapCount = 0;
            for (Map.Entry<String, String> entry : this.effectidMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + ' ' + entry.getValue() + '\n');
                this.mapCount++;
            }
            bufferedWriter.close();
            if (this.mapFile.exists()) {
                renameTo(this.mapFile, this.mapFileBak, true);
            }
            renameTo(this.mapFileTmp, this.mapFile, false);
            m141886xf5ec837c(this.mapFileBak);
            this.mapWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFile, true), FileUtils.INSTANCE.getUS_ASCII()));
            MethodCollector.m26664o(1740);
        } catch (Throwable th) {
            bufferedWriter.close();
            MethodCollector.m26664o(1740);
            throw th;
        }
    }

    public String getEffectId(String str) {
        return this.effectidMap.get(str);
    }

    private static void deleteIfExists(File file) {
        if (file.exists() && !m141886xf5ec837c(file)) {
            throw new IOException();
        }
    }

    private void readMapLine(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            this.effectidMap.put(str.substring(0, indexOf), str.substring(indexOf + 1));
            return;
        }
        throw new IOException("unexpected Map line: ".concat(String.valueOf(str)));
    }

    public EffectIdMapFile(File file) {
        File file2 = new File(file, "effectidmap");
        this.mapFile = file2;
        this.mapFileTmp = new File(file, "effectidmap.tmp");
        File file3 = new File(file, "effectidmap.bak");
        this.mapFileBak = file3;
        try {
            if (file3.exists()) {
                if (file2.exists()) {
                    m141886xf5ec837c(file3);
                } else {
                    renameTo(file3, file2, false);
                }
            }
            if (file2.exists()) {
                readMap();
            } else {
                rebuildMap();
            }
        } catch (IOException e) {
            System.out.println("EffectIdMapFile " + file + " is corrupt: " + e.getMessage() + ", removing");
            m141886xf5ec837c(this.mapFile);
        }
    }

    /* renamed from: com_ss_android_ugc_effectmanager_common_cache_EffectIdMapFile_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m141886xf5ec837c(File file) {
        MethodCollector.m26663i(1155);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1155);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1155);
        return delete;
    }

    public void writeEffectId(String str, String str2) {
        MethodCollector.m26663i(1193);
        if (this.effectidMap.containsKey(str)) {
            MethodCollector.m26664o(1193);
            return;
        }
        this.effectidMap.put(str, str2);
        try {
            checkNotClosed();
            this.mapWriter.write(str + ' ' + str2 + '\n');
            this.mapWriter.flush();
            MethodCollector.m26664o(1193);
        } catch (Exception e) {
            EPLog.m141899e("EffectIdMapFile", "EffectIdMapFile write failed by " + e.toString());
            MethodCollector.m26664o(1193);
        }
    }

    private static void renameTo(File file, File file2, boolean z) {
        MethodCollector.m26663i(1744);
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.m26664o(1744);
            return;
        }
        IOException iOException = new IOException();
        MethodCollector.m26664o(1744);
        throw iOException;
    }
}
