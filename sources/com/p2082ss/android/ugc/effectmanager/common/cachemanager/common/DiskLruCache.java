package com.p2082ss.android.ugc.effectmanager.common.cachemanager.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache */
public final class DiskLruCache implements Closeable {
    private static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() {
        /* class com.p2082ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.C819432 */

        static {
            Covode.recordClassIndex(95454);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
        }

        {
            MethodCollector.m26663i(4652);
            MethodCollector.m26664o(4652);
        }
    };
    private final int appVersion;
    private final Callable<Void> cleanupCallable = new Callable<Void>() {
        /* class com.p2082ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.CallableC819421 */

        static {
            Covode.recordClassIndex(95453);
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            MethodCollector.m26663i(6183);
            synchronized (DiskLruCache.this) {
                try {
                    if (DiskLruCache.this.journalWriter == null) {
                        return null;
                    }
                    DiskLruCache.this.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                    MethodCollector.m26664o(6183);
                    return null;
                } finally {
                    MethodCollector.m26664o(6183);
                }
            }
        }
    };
    public final File directory;
    private final ExecutorService executorService = m141888x231a608e();
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    public Writer journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private IAllowListRule mAllowKeyRule;
    private long maxSize;
    private long nextSequenceNumber = 0;
    public int redundantOpCount;
    private long size;
    public final int valueCount;

    public final File getDirectory() {
        return this.directory;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Editor */
    public final class Editor {
        private boolean committed;
        public final Entry entry;
        public boolean hasErrors;
        public final boolean[] written;

        static {
            Covode.recordClassIndex(95455);
        }

        public final void abort() {
            DiskLruCache.this.completeEdit(this, false);
        }

        public final void abortUnlessCommitted() {
            if (!this.committed) {
                try {
                    abort();
                } catch (IOException unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Editor$FaultHidingOutputStream */
        public class FaultHidingOutputStream extends FilterOutputStream {
            static {
                Covode.recordClassIndex(95456);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i) {
                MethodCollector.m26663i(4672);
                try {
                    this.out.write(i);
                    MethodCollector.m26664o(4672);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                    MethodCollector.m26664o(4672);
                }
            }

            private FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
                MethodCollector.m26663i(4670);
                MethodCollector.m26664o(4670);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) {
                MethodCollector.m26663i(4674);
                try {
                    this.out.write(bArr, i, i2);
                    MethodCollector.m26664o(4674);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                    MethodCollector.m26664o(4674);
                }
            }
        }

        public final void commit() {
            if (this.hasErrors) {
                DiskLruCache.this.completeEdit(this, false);
                DiskLruCache.this.remove(this.entry.key);
            } else {
                DiskLruCache.this.completeEdit(this, true);
            }
            this.committed = true;
        }

        public final String getString(int i) {
            InputStream newInputStream = newInputStream(i);
            if (newInputStream != null) {
                return DiskLruCache.inputStreamToString(newInputStream);
            }
            return null;
        }

        public final InputStream newInputStream(int i) {
            MethodCollector.m26663i(6189);
            synchronized (DiskLruCache.this) {
                try {
                    if (this.entry.currentEditor != this) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(6189);
                        throw illegalStateException;
                    } else if (!this.entry.readable) {
                        return null;
                    } else {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(this.entry.getCleanFile(i));
                            MethodCollector.m26664o(6189);
                            return fileInputStream;
                        } catch (FileNotFoundException unused) {
                            MethodCollector.m26664o(6189);
                            return null;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(6189);
                }
            }
        }

        public final OutputStream newOutputStream(int i) {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            MethodCollector.m26663i(6335);
            if (i < 0 || i >= DiskLruCache.this.valueCount) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + DiskLruCache.this.valueCount);
                MethodCollector.m26664o(6335);
                throw illegalArgumentException;
            }
            synchronized (DiskLruCache.this) {
                try {
                    if (this.entry.currentEditor == this) {
                        if (!this.entry.readable) {
                            this.written[i] = true;
                        }
                        File dirtyFile = this.entry.getDirtyFile(i);
                        try {
                            fileOutputStream = new FileOutputStream(dirtyFile);
                        } catch (FileNotFoundException unused) {
                            DiskLruCache.this.directory.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(dirtyFile);
                            } catch (FileNotFoundException unused2) {
                                OutputStream outputStream = DiskLruCache.NULL_OUTPUT_STREAM;
                                MethodCollector.m26664o(6335);
                                return outputStream;
                            }
                        }
                        faultHidingOutputStream = new FaultHidingOutputStream(fileOutputStream);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(6335);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.m26664o(6335);
                }
            }
            return faultHidingOutputStream;
        }

        private Editor(Entry entry2) {
            boolean[] zArr;
            this.entry = entry2;
            if (entry2.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }

        public final void set(int i, String str) {
            Throwable th;
            MethodCollector.m26663i(6337);
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i), FileUtils.INSTANCE.getUTF_8());
                try {
                    outputStreamWriter2.write(str);
                    FileUtils.INSTANCE.closeQuietly(outputStreamWriter2);
                    MethodCollector.m26664o(6337);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    FileUtils.INSTANCE.closeQuietly(outputStreamWriter);
                    MethodCollector.m26664o(6337);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                FileUtils.INSTANCE.closeQuietly(outputStreamWriter);
                MethodCollector.m26664o(6337);
                throw th;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Snapshot */
    public final class Snapshot implements Closeable {
        private final File[] cleanFiles;
        private final InputStream[] ins;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        static {
            Covode.recordClassIndex(95458);
        }

        public final Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.ins) {
                FileUtils.INSTANCE.closeQuietly(inputStream);
            }
        }

        public final File getCleanFile(int i) {
            return this.cleanFiles[i];
        }

        public final InputStream getInputStream(int i) {
            return this.ins[i];
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final String getString(int i) {
            return DiskLruCache.inputStreamToString(getInputStream(i));
        }

        private Snapshot(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.cleanFiles = fileArr;
            this.ins = inputStreamArr;
            this.lengths = jArr;
        }
    }

    private void checkNotClosed() {
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized long getMaxSize() {
        long j;
        MethodCollector.m26663i(10003);
        j = this.maxSize;
        MethodCollector.m26664o(10003);
        return j;
    }

    public final synchronized long size() {
        long j;
        MethodCollector.m26663i(10154);
        j = this.size;
        MethodCollector.m26664o(10154);
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Entry */
    public final class Entry {
        public Editor currentEditor;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        static {
            Covode.recordClassIndex(95457);
        }

        public final String getLengths() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lengths) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        private IOException invalidLengths(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File getCleanFile(int i) {
            if (i == 0) {
                return new File(DiskLruCache.this.directory, this.key);
            }
            return new File(DiskLruCache.this.directory, this.key + "." + i);
        }

        public final void setLengths(String[] strArr) {
            if (strArr.length == DiskLruCache.this.valueCount) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        public final File getDirtyFile(int i) {
            if (i == 0) {
                return new File(DiskLruCache.this.directory, this.key + ".tmp");
            }
            return new File(DiskLruCache.this.directory, this.key + "." + i + ".tmp");
        }

        private Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }
    }

    static {
        Covode.recordClassIndex(95452);
    }

    /* renamed from: com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m141888x231a608e() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    public final void delete() {
        EPLog.m141898d("DiskLruCache", "delete");
        close();
        FileUtils.INSTANCE.deleteContents(this.directory);
    }

    public final synchronized void flush() {
        MethodCollector.m26663i(10470);
        EPLog.m141898d("DiskLruCache", "flush");
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
        MethodCollector.m26664o(10470);
    }

    public final Set<String> getLruEntryKeys() {
        Set<String> unmodifiableSet;
        MethodCollector.m26663i(10928);
        synchronized (this) {
            try {
                unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.lruEntries.keySet()));
            } finally {
                MethodCollector.m26664o(10928);
            }
        }
        return unmodifiableSet;
    }

    public final synchronized boolean isClosed() {
        MethodCollector.m26663i(10320);
        if (this.journalWriter == null) {
            MethodCollector.m26664o(10320);
            return true;
        }
        MethodCollector.m26664o(10320);
        return false;
    }

    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i < 2000 || i < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    public final synchronized boolean isValid() {
        MethodCollector.m26663i(9404);
        File file = this.directory;
        if (file == null || !file.exists() || !this.journalFile.exists()) {
            MethodCollector.m26664o(9404);
            return false;
        }
        MethodCollector.m26664o(9404);
        return true;
    }

    private void processJournal() {
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    deleteIfExists(next.getCleanFile(i));
                    deleteIfExists(next.getDirtyFile(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.m26663i(10633);
        if (this.journalWriter == null) {
            MethodCollector.m26664o(10633);
            return;
        }
        Iterator it = new ArrayList(this.lruEntries.values()).iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (entry.currentEditor != null) {
                entry.currentEditor.abort();
            }
        }
        trimToSize();
        this.journalWriter.close();
        this.journalWriter = null;
        MethodCollector.m26664o(10633);
    }

    private void readJournal() {
        MethodCollector.m26663i(9406);
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), FileUtils.INSTANCE.getUS_ASCII());
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            String readLine4 = strictLineReader.readLine();
            String readLine5 = strictLineReader.readLine();
            if (!"libcore.io.DiskLruCache".equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.appVersion).equals(readLine3) || !Integer.toString(this.valueCount).equals(readLine4) || !"".equals(readLine5)) {
                IOException iOException = new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
                MethodCollector.m26664o(9406);
                throw iOException;
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (strictLineReader.hasUnterminatedLine()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), FileUtils.INSTANCE.getUS_ASCII()));
                    }
                    return;
                }
            }
        } finally {
            FileUtils.INSTANCE.closeQuietly(strictLineReader);
            MethodCollector.m26664o(9406);
        }
    }

    public final synchronized void rebuildJournal() {
        MethodCollector.m26663i(9409);
        Writer writer = this.journalWriter;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), FileUtils.INSTANCE.getUS_ASCII()));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.appVersion));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.valueCount));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    bufferedWriter.write("DIRTY " + entry.key + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.journalFile.exists()) {
                renameTo(this.journalFile, this.journalFileBackup, true);
            }
            renameTo(this.journalFileTmp, this.journalFile, false);
            m141889xe4a03937(this.journalFileBackup);
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), FileUtils.INSTANCE.getUS_ASCII()));
            MethodCollector.m26664o(9409);
        } catch (Throwable th) {
            bufferedWriter.close();
            MethodCollector.m26664o(9409);
            throw th;
        }
    }

    public final synchronized void trimToSize() {
        Map.Entry<String, Entry> next;
        MethodCollector.m26663i(10778);
        EPLog.m141898d("DiskLruCache", "trimToSize size: " + this.size);
        while (this.size > this.maxSize) {
            int size2 = this.lruEntries.size();
            int i = 0;
            Iterator<Map.Entry<String, Entry>> it = this.lruEntries.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                EPLog.m141898d("DiskLruCache", "trimToSize key:" + next.getKey());
                IAllowListRule iAllowListRule = this.mAllowKeyRule;
                if (iAllowListRule == null || !iAllowListRule.isAllowed(next.getKey())) {
                    EPLog.m141898d("DiskLruCache", "trimToSize exe");
                } else {
                    i++;
                }
            }
            EPLog.m141898d("DiskLruCache", "trimToSize exe");
            if (size2 - i < 10) {
                setMaxSize(getMaxSize() * 2);
            }
            remove(next.getKey());
        }
        MethodCollector.m26664o(10778);
    }

    public final Editor edit(String str) {
        return edit(str, -1);
    }

    private boolean validateKey(String str) {
        return LEGAL_KEY_PATTERN.matcher(str).matches();
    }

    private static void deleteIfExists(File file) {
        if (file.exists() && !m141889xe4a03937(file)) {
            throw new IOException();
        }
    }

    public static String inputStreamToString(InputStream inputStream) {
        return FileUtils.INSTANCE.readFully(new InputStreamReader(inputStream, FileUtils.INSTANCE.getUTF_8()));
    }

    public static String toDiskLruCacheKeyPattern(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == File.separatorChar) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    public final synchronized void readKeyInMemory(String str) {
        MethodCollector.m26663i(11076);
        checkNotClosed();
        this.lruEntries.get(str);
        MethodCollector.m26664o(11076);
    }

    public final synchronized void setMaxSize(long j) {
        MethodCollector.m26663i(10004);
        this.maxSize = j;
        this.executorService.submit(this.cleanupCallable);
        MethodCollector.m26664o(10004);
    }

    public static String toDiskLruCacheKey(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    /* renamed from: com_ss_android_ugc_effectmanager_common_cachemanager_common_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m141889xe4a03937(File file) {
        MethodCollector.m26663i(9403);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(9403);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(9403);
        return delete;
    }

    public final synchronized boolean has(String str) {
        MethodCollector.m26663i(11075);
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                MethodCollector.m26664o(11075);
                return false;
            } else if (!entry.readable) {
                MethodCollector.m26664o(11075);
                return false;
            } else {
                try {
                    this.redundantOpCount++;
                    this.journalWriter.write("READ " + str + '\n');
                    this.journalWriter.flush();
                    if (journalRebuildRequired()) {
                        this.executorService.submit(this.cleanupCallable);
                    }
                } catch (IOException unused) {
                }
                MethodCollector.m26664o(11075);
                return true;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            MethodCollector.m26664o(11075);
            throw illegalArgumentException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r5 == -1) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readJournalLine(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.readJournalLine(java.lang.String):void");
    }

    public final synchronized Snapshot get(String str) {
        MethodCollector.m26663i(9711);
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                MethodCollector.m26664o(9711);
                return null;
            } else if (!entry.readable) {
                MethodCollector.m26664o(9711);
                return null;
            } else {
                int i = this.valueCount;
                InputStream[] inputStreamArr = new InputStream[i];
                File[] fileArr = new File[i];
                int i2 = 0;
                for (int i3 = 0; i3 < this.valueCount; i3++) {
                    try {
                        fileArr[i3] = entry.getCleanFile(i3);
                        inputStreamArr[i3] = new FileInputStream(fileArr[i3]);
                    } catch (FileNotFoundException unused) {
                        while (i2 < this.valueCount && inputStreamArr[i2] != null) {
                            FileUtils.INSTANCE.closeQuietly(inputStreamArr[i2]);
                            i2++;
                        }
                        MethodCollector.m26664o(9711);
                        return null;
                    }
                }
                this.redundantOpCount++;
                this.journalWriter.append((CharSequence) ("READ " + str + '\n'));
                this.journalWriter.flush();
                if (journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                Snapshot snapshot = new Snapshot(str, entry.sequenceNumber, fileArr, inputStreamArr, entry.lengths);
                MethodCollector.m26664o(9711);
                return snapshot;
            }
        } else {
            remove(str);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            MethodCollector.m26664o(9711);
            throw illegalArgumentException;
        }
    }

    public final synchronized boolean addEntryToCache(String str) {
        MethodCollector.m26663i(10930);
        EPLog.m141898d("DiskLruCache", "addEntryToCache:".concat(String.valueOf(str)));
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
            } else if (entry.currentEditor != null) {
                MethodCollector.m26664o(10930);
                return false;
            }
            File cleanFile = entry.getCleanFile(0);
            if (cleanFile.exists()) {
                long j = entry.lengths[0];
                long length = cleanFile.length();
                if (cleanFile.isDirectory()) {
                    length = FileUtils.INSTANCE.getFolderSize(cleanFile);
                }
                entry.lengths[0] = length;
                this.size = (this.size - j) + length;
                this.redundantOpCount++;
                entry.currentEditor = null;
                entry.readable = true;
                this.journalWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry.sequenceNumber = j2;
                this.journalWriter.flush();
                if (this.size > this.maxSize || journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                MethodCollector.m26664o(10930);
                return true;
            }
            this.lruEntries.remove(entry.key);
            this.journalWriter.write("REMOVE " + entry.key + '\n');
            MethodCollector.m26664o(10930);
            return false;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.m26664o(10930);
        throw illegalArgumentException;
    }

    public final synchronized boolean remove(String str) {
        MethodCollector.m26663i(10158);
        EPLog.m141898d("DiskLruCache", "remove:".concat(String.valueOf(str)));
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            boolean z = true;
            if (entry == null || entry.currentEditor != null) {
                StringBuilder sb = new StringBuilder("remove: can not:");
                if (entry != null) {
                    z = false;
                }
                EPLog.m141899e("DiskLruCache", sb.append(z).toString());
                MethodCollector.m26664o(10158);
                return false;
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("REMOVE " + str + '\n'));
            this.journalWriter.flush();
            this.lruEntries.remove(str);
            for (int i = 0; i < this.valueCount; i++) {
                File cleanFile = entry.getCleanFile(i);
                if (cleanFile.exists()) {
                    if (cleanFile.isFile() && !m141889xe4a03937(cleanFile)) {
                        EPLog.m141899e("DiskLruCache", "remove  err:".concat(String.valueOf(str)));
                        IOException iOException = new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                        MethodCollector.m26664o(10158);
                        throw iOException;
                    } else if (cleanFile.isDirectory() && !FileUtils.INSTANCE.deleteDir(cleanFile)) {
                        EPLog.m141899e("DiskLruCache", "remove  err:".concat(String.valueOf(str)));
                        IOException iOException2 = new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                        MethodCollector.m26664o(10158);
                        throw iOException2;
                    }
                }
                this.size -= entry.lengths[i];
                entry.lengths[i] = 0;
            }
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            MethodCollector.m26664o(10158);
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.m26664o(10158);
        throw illegalArgumentException;
    }

    public final synchronized Editor edit(String str, long j) {
        MethodCollector.m26663i(9855);
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (j != -1) {
                if (entry == null || entry.sequenceNumber != j) {
                    MethodCollector.m26664o(9855);
                    return null;
                }
            } else if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
                Editor editor = new Editor(entry);
                entry.currentEditor = editor;
                this.journalWriter.write("DIRTY " + str + '\n');
                this.journalWriter.flush();
                MethodCollector.m26664o(9855);
                return editor;
            }
            if (entry.currentEditor != null) {
                MethodCollector.m26664o(9855);
                return null;
            }
            Editor editor2 = new Editor(entry);
            entry.currentEditor = editor2;
            this.journalWriter.write("DIRTY " + str + '\n');
            this.journalWriter.flush();
            MethodCollector.m26664o(9855);
            return editor2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.m26664o(9855);
        throw illegalArgumentException;
    }

    public final synchronized void completeEdit(Editor editor, boolean z) {
        String str;
        MethodCollector.m26663i(10156);
        Entry entry = editor.entry;
        StringBuilder sb = new StringBuilder("completeEdit start, key: ");
        if (entry == null) {
            str = "null";
        } else {
            str = entry.key;
        }
        EPLog.m141898d("DiskLruCache", sb.append(str).append(", success: ").append(z).toString());
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i = 0; i < this.valueCount; i++) {
                    if (!editor.written[i]) {
                        editor.abort();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                        MethodCollector.m26664o(10156);
                        throw illegalStateException;
                    } else if (!entry.getDirtyFile(i).exists()) {
                        editor.abort();
                        MethodCollector.m26664o(10156);
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                File dirtyFile = entry.getDirtyFile(i2);
                if (!z) {
                    deleteIfExists(dirtyFile);
                } else if (dirtyFile.exists()) {
                    File cleanFile = entry.getCleanFile(i2);
                    dirtyFile.renameTo(cleanFile);
                    long j = entry.lengths[i2];
                    long length = cleanFile.length();
                    entry.lengths[i2] = length;
                    this.size = (this.size - j) + length;
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable || z) {
                entry.readable = true;
                this.journalWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                if (z) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.sequenceNumber = j2;
                }
            } else {
                this.lruEntries.remove(entry.key);
                this.journalWriter.write("REMOVE " + entry.key + '\n');
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            MethodCollector.m26664o(10156);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.m26664o(10156);
        throw illegalStateException2;
    }

    private static void renameTo(File file, File file2, boolean z) {
        MethodCollector.m26663i(9565);
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.m26664o(9565);
            return;
        }
        IOException iOException = new IOException();
        MethodCollector.m26664o(9565);
        throw iOException;
    }

    private DiskLruCache(File file, int i, int i2, long j) {
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
    }

    public static synchronized DiskLruCache open(File file, int i, int i2, long j, IAllowListRule iAllowListRule) {
        synchronized (DiskLruCache.class) {
            MethodCollector.m26663i(9252);
            if (j <= 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("maxSize <= 0");
                MethodCollector.m26664o(9252);
                throw illegalArgumentException;
            } else if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        m141889xe4a03937(file2);
                    } else {
                        renameTo(file2, file3, false);
                    }
                }
                DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
                if (diskLruCache.journalFile.exists()) {
                    try {
                        diskLruCache.readJournal();
                        diskLruCache.processJournal();
                        MethodCollector.m26664o(9252);
                        return diskLruCache;
                    } catch (IOException e) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        diskLruCache.delete();
                    }
                }
                file.mkdirs();
                DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
                diskLruCache2.rebuildJournal();
                if (iAllowListRule != null) {
                    diskLruCache2.mAllowKeyRule = iAllowListRule;
                }
                MethodCollector.m26664o(9252);
                return diskLruCache2;
            } else {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("valueCount <= 0");
                MethodCollector.m26664o(9252);
                throw illegalArgumentException2;
            }
        }
    }
}
