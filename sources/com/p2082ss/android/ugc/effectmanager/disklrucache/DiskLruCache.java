package com.p2082ss.android.ugc.effectmanager.disklrucache;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
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
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache */
public final class DiskLruCache implements Closeable {
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() {
        /* class com.p2082ss.android.ugc.effectmanager.disklrucache.DiskLruCache.C819462 */

        static {
            Covode.recordClassIndex(95532);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
        }

        {
            MethodCollector.m26663i(3134);
            MethodCollector.m26664o(3134);
        }
    };
    private final int appVersion;
    private final Callable<Void> cleanupCallable = new Callable<Void>() {
        /* class com.p2082ss.android.ugc.effectmanager.disklrucache.DiskLruCache.CallableC819451 */

        static {
            Covode.recordClassIndex(95531);
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            boolean z;
            MethodCollector.m26663i(60);
            synchronized (DiskLruCache.this) {
                try {
                    if (!DiskLruCache.this.initialized) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || DiskLruCache.this.closed) {
                        return null;
                    }
                    DiskLruCache.this.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                    MethodCollector.m26664o(60);
                    return null;
                } finally {
                    MethodCollector.m26664o(60);
                }
            }
        }
    };
    public boolean closed;
    public final File directory;
    final ExecutorService executorService = m141912x5ea26bc9();
    public boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private Writer journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    private long nextSequenceNumber = 0;
    public int redundantOpCount;
    private long size;
    public final int valueCount;

    public final File getDirectory() {
        return this.directory;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Editor */
    public final class Editor {
        private boolean committed;
        public final Entry entry;
        public boolean hasErrors;
        public final boolean[] written;

        static {
            Covode.recordClassIndex(95533);
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
        /* renamed from: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Editor$FaultHidingOutputStream */
        public class FaultHidingOutputStream extends FilterOutputStream {
            static {
                Covode.recordClassIndex(95534);
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
                MethodCollector.m26663i(1493);
                try {
                    this.out.write(i);
                    MethodCollector.m26664o(1493);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                    MethodCollector.m26664o(1493);
                }
            }

            private FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
                MethodCollector.m26663i(1490);
                MethodCollector.m26664o(1490);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) {
                MethodCollector.m26663i(1497);
                try {
                    this.out.write(bArr, i, i2);
                    MethodCollector.m26664o(1497);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                    MethodCollector.m26664o(1497);
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
            MethodCollector.m26663i(2832);
            synchronized (DiskLruCache.this) {
                try {
                    if (this.entry.currentEditor != this) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(2832);
                        throw illegalStateException;
                    } else if (!this.entry.readable) {
                        return null;
                    } else {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(this.entry.getCleanFile(i));
                            MethodCollector.m26664o(2832);
                            return fileInputStream;
                        } catch (FileNotFoundException unused) {
                            MethodCollector.m26664o(2832);
                            return null;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(2832);
                }
            }
        }

        public final OutputStream newOutputStream(int i) {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            MethodCollector.m26663i(2841);
            if (i < 0 || i >= DiskLruCache.this.valueCount) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + DiskLruCache.this.valueCount);
                MethodCollector.m26664o(2841);
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
                                MethodCollector.m26664o(2841);
                                return outputStream;
                            }
                        }
                        faultHidingOutputStream = new FaultHidingOutputStream(fileOutputStream);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(2841);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.m26664o(2841);
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
            MethodCollector.m26663i(2847);
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i), Util.UTF_8);
                try {
                    outputStreamWriter2.write(str);
                    Util.closeQuietly(outputStreamWriter2);
                    MethodCollector.m26664o(2847);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    Util.closeQuietly(outputStreamWriter);
                    MethodCollector.m26664o(2847);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                Util.closeQuietly(outputStreamWriter);
                MethodCollector.m26664o(2847);
                throw th;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Snapshot */
    public final class Snapshot implements Closeable {
        private final File[] cleanFiles;
        private final InputStream[] ins;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;

        static {
            Covode.recordClassIndex(95536);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.ins) {
                Util.closeQuietly(inputStream);
            }
        }

        public final Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
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
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void delete() {
        close();
        Util.deleteContents(this.directory);
    }

    public final synchronized long getMaxSize() {
        long j;
        MethodCollector.m26663i(2394);
        j = this.maxSize;
        MethodCollector.m26664o(2394);
        return j;
    }

    public final synchronized boolean isClosed() {
        boolean z;
        MethodCollector.m26663i(815);
        z = this.closed;
        MethodCollector.m26664o(815);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Entry */
    public final class Entry {
        public Editor currentEditor;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        static {
            Covode.recordClassIndex(95535);
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
        Covode.recordClassIndex(95530);
    }

    /* renamed from: com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m141912x5ea26bc9() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    public final boolean isValid() {
        File file = this.directory;
        if (file == null || !file.exists() || !this.journalFile.exists()) {
            return false;
        }
        return true;
    }

    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i < 2000 || i < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    public final synchronized long size() {
        long j;
        MethodCollector.m26663i(2660);
        initialize();
        j = this.size;
        MethodCollector.m26664o(2660);
        return j;
    }

    public final synchronized void flush() {
        MethodCollector.m26663i(823);
        if (!this.initialized) {
            MethodCollector.m26664o(823);
            return;
        }
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
        MethodCollector.m26664o(823);
    }

    public final Set<String> getLruEntryKeys() {
        Set<String> unmodifiableSet;
        MethodCollector.m26663i(994);
        synchronized (this) {
            try {
                initialize();
                unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.lruEntries.keySet()));
            } finally {
                MethodCollector.m26664o(994);
            }
        }
        return unmodifiableSet;
    }

    public final synchronized void trimToSize() {
        MethodCollector.m26663i(964);
        while (this.size > this.maxSize) {
            remove(this.lruEntries.entrySet().iterator().next().getKey());
        }
        MethodCollector.m26664o(964);
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
        MethodCollector.m26663i(951);
        if (!this.initialized || this.closed) {
            this.closed = true;
            MethodCollector.m26664o(951);
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
        this.closed = true;
        MethodCollector.m26664o(951);
    }

    private void readJournal() {
        MethodCollector.m26663i(2153);
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), Util.US_ASCII);
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            String readLine4 = strictLineReader.readLine();
            String readLine5 = strictLineReader.readLine();
            if (!"libcore.io.DiskLruCache".equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.appVersion).equals(readLine3) || !Integer.toString(this.valueCount).equals(readLine4) || !"".equals(readLine5)) {
                IOException iOException = new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
                MethodCollector.m26664o(2153);
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
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
                    }
                    return;
                }
            }
        } finally {
            Util.closeQuietly(strictLineReader);
            MethodCollector.m26664o(2153);
        }
    }

    public final synchronized void initialize() {
        MethodCollector.m26663i(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        if (this.initialized) {
            MethodCollector.m26664o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            return;
        }
        if (this.journalFileBackup.exists()) {
            if (!this.journalFile.exists()) {
                renameTo(this.journalFileBackup, this.journalFile, false);
            } else if (m141913xc9ff41c(this.journalFileBackup) && this.journalFileBackup.exists()) {
                IOException iOException = new IOException("failed to delete " + this.journalFileBackup);
                MethodCollector.m26664o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                throw iOException;
            }
        }
        if (this.journalFile.exists()) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                MethodCollector.m26664o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                return;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing");
                delete();
                this.closed = false;
            } catch (Throwable th) {
                this.closed = false;
                MethodCollector.m26664o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                throw th;
            }
        }
        rebuildJournal();
        this.initialized = true;
        MethodCollector.m26664o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    public final synchronized void rebuildJournal() {
        FileOutputStream fileOutputStream;
        MethodCollector.m26663i(2352);
        Writer writer = this.journalWriter;
        if (writer != null) {
            writer.close();
        }
        try {
            fileOutputStream = new FileOutputStream(this.journalFileTmp);
        } catch (FileNotFoundException unused) {
            this.journalFileTmp.getParentFile().mkdirs();
            fileOutputStream = new FileOutputStream(this.journalFileTmp);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, Util.US_ASCII));
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
            m141913xc9ff41c(this.journalFileBackup);
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
            MethodCollector.m26664o(2352);
        } catch (Throwable th) {
            bufferedWriter.close();
            MethodCollector.m26664o(2352);
            throw th;
        }
    }

    public final Editor edit(String str) {
        return edit(str, -1);
    }

    public static String inputStreamToString(InputStream inputStream) {
        return Util.readFully(new InputStreamReader(inputStream, Util.UTF_8));
    }

    private boolean validateKey(String str) {
        return LEGAL_KEY_PATTERN.matcher(str).matches();
    }

    private static void deleteIfExists(File file) {
        if (file.exists() && !m141913xc9ff41c(file)) {
            throw new IOException();
        }
    }

    public final synchronized void setMaxSize(long j) {
        MethodCollector.m26663i(2471);
        this.maxSize = j;
        if (this.initialized) {
            this.executorService.submit(this.cleanupCallable);
        }
        MethodCollector.m26664o(2471);
    }

    /* renamed from: com_ss_android_ugc_effectmanager_disklrucache_DiskLruCache_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m141913xc9ff41c(File file) {
        MethodCollector.m26663i(2035);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(2035);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(2035);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r5 == -1) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readJournalLine(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.disklrucache.DiskLruCache.readJournalLine(java.lang.String):void");
    }

    public final synchronized Snapshot get(String str) {
        MethodCollector.m26663i(2378);
        initialize();
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                MethodCollector.m26664o(2378);
                return null;
            } else if (!entry.readable) {
                MethodCollector.m26664o(2378);
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
                            Util.closeQuietly(inputStreamArr[i2]);
                            i2++;
                        }
                        MethodCollector.m26664o(2378);
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
                MethodCollector.m26664o(2378);
                return snapshot;
            }
        } else {
            remove(str);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            MethodCollector.m26664o(2378);
            throw illegalArgumentException;
        }
    }

    public final synchronized boolean remove(String str) {
        MethodCollector.m26663i(813);
        initialize();
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null || entry.currentEditor != null) {
                MethodCollector.m26664o(813);
                return false;
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("REMOVE " + str + '\n'));
            this.journalWriter.flush();
            this.lruEntries.remove(str);
            for (int i = 0; i < this.valueCount; i++) {
                File cleanFile = entry.getCleanFile(i);
                if (!cleanFile.exists() || m141913xc9ff41c(cleanFile)) {
                    this.size -= entry.lengths[i];
                    entry.lengths[i] = 0;
                } else {
                    IOException iOException = new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                    MethodCollector.m26664o(813);
                    throw iOException;
                }
            }
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            MethodCollector.m26664o(813);
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.m26664o(813);
        throw illegalArgumentException;
    }

    public final synchronized Editor edit(String str, long j) {
        MethodCollector.m26663i(2392);
        initialize();
        checkNotClosed();
        validateKey(str);
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (j != -1) {
                if (entry == null || entry.sequenceNumber != j) {
                    MethodCollector.m26664o(2392);
                    return null;
                }
            } else if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
                Editor editor = new Editor(entry);
                entry.currentEditor = editor;
                this.journalWriter.write("DIRTY " + str + '\n');
                this.journalWriter.flush();
                MethodCollector.m26664o(2392);
                return editor;
            }
            if (entry.currentEditor != null) {
                MethodCollector.m26664o(2392);
                return null;
            }
            Editor editor2 = new Editor(entry);
            entry.currentEditor = editor2;
            this.journalWriter.write("DIRTY " + str + '\n');
            this.journalWriter.flush();
            MethodCollector.m26664o(2392);
            return editor2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        MethodCollector.m26664o(2392);
        throw illegalArgumentException;
    }

    public final synchronized void completeEdit(Editor editor, boolean z) {
        MethodCollector.m26663i(2680);
        Entry entry = editor.entry;
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i = 0; i < this.valueCount; i++) {
                    if (!editor.written[i]) {
                        editor.abort();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                        MethodCollector.m26664o(2680);
                        throw illegalStateException;
                    } else if (!entry.getDirtyFile(i).exists()) {
                        editor.abort();
                        MethodCollector.m26664o(2680);
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
            MethodCollector.m26664o(2680);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.m26664o(2680);
        throw illegalStateException2;
    }

    private static void renameTo(File file, File file2, boolean z) {
        MethodCollector.m26663i(2358);
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.m26664o(2358);
            return;
        }
        IOException iOException = new IOException();
        MethodCollector.m26664o(2358);
        throw iOException;
    }

    public static DiskLruCache open(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new DiskLruCache(file, i, i2, j);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
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
}
