package com.bytedance.p802b.p806b.p807a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p802b.p806b.p807a.p810c.C12943a;
import com.bytedance.p802b.p806b.p807a.p810c.C12945c;
import com.bytedance.p802b.p806b.p807a.p811d.C12959d;
import com.bytedance.p802b.p806b.p807a.p812e.AbstractC12974d;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.C13120c;
import com.bytedance.p802b.p841k.C13122d;
import com.bytedance.p802b.p841k.p842a.C13114a;
import com.bytedance.p802b.p841k.p843b.C13118b;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.bytedance.b.b.a.c */
public final class C12937c implements AbstractC12974d {

    /* renamed from: a */
    volatile long f31508a = 1048576;

    /* renamed from: b */
    public C13114a<C12943a> f31509b = new C13114a<>(10);

    /* renamed from: c */
    public volatile C12945c f31510c;

    /* renamed from: d */
    private volatile long f31511d = 60000;

    /* renamed from: e */
    private volatile AbstractRunnableC13123a f31512e;

    static {
        Covode.recordClassIndex(14773);
    }

    @Override // com.bytedance.p802b.p806b.p807a.p812e.AbstractC12974d
    /* renamed from: c */
    public final String mo20787c() {
        return "first_log_dir";
    }

    /* renamed from: com.bytedance.b.b.a.c$a */
    public static class C12942a {

        /* renamed from: a */
        public static final C12937c f31517a = new C12937c();

        static {
            Covode.recordClassIndex(14778);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20783a() {
        this.f31512e = new AbstractRunnableC13123a(this.f31511d) {
            /* class com.bytedance.p802b.p806b.p807a.C12937c.C129392 */

            static {
                Covode.recordClassIndex(14775);
            }

            public final void run() {
                C12937c.this.mo20785b();
            }
        };
        C13124b.m23597a(EnumC13126c.IO).mo20943a(this.f31512e);
        if (C13037a.m23435c()) {
            C13124b.m23597a(EnumC13126c.IO).mo20943a(new AbstractRunnableC13123a() {
                /* class com.bytedance.p802b.p806b.p807a.C12937c.C129403 */

                static {
                    Covode.recordClassIndex(14776);
                }

                public final void run() {
                    File[] listFiles;
                    File file = new File(C12930b.m23206a(), "child_process_persistent");
                    if (file.exists() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2 != null && file2.exists() && file2.length() > 0) {
                                try {
                                    if (Long.parseLong(file2.getName().split("_")[0]) < C13037a.m23434b()) {
                                        FileChannel fileChannel = null;
                                        try {
                                            fileChannel = new RandomAccessFile(file2, "rw").getChannel();
                                            FileLock tryLock = fileChannel.tryLock(0, Long.MAX_VALUE, false);
                                            if (tryLock != null && tryLock.isValid()) {
                                                File file3 = new File(C12930b.m23208c(), System.currentTimeMillis() + "_" + UUID.randomUUID().toString() + ".log");
                                                String absolutePath = file2.getAbsolutePath();
                                                String absolutePath2 = file3.getAbsolutePath();
                                                File file4 = new File(absolutePath);
                                                File file5 = new File(absolutePath2);
                                                if (file4.exists()) {
                                                    file4.renameTo(file5);
                                                }
                                                if (C13037a.m23579r()) {
                                                    file2.getAbsolutePath();
                                                    file3.getAbsolutePath();
                                                }
                                                tryLock.release();
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        C13122d.m23595a(fileChannel);
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.p802b.p806b.p807a.p812e.AbstractC12974d
    /* renamed from: d */
    public final long mo20788d() {
        String[] b = this.f31510c.mo20797b();
        long j = 0;
        if (!(b == null || b.length == 0)) {
            for (String str : b) {
                j += new File(C12930b.m23208c(), str).length();
            }
        }
        return j;
    }

    /* renamed from: b */
    public final void mo20785b() {
        System.currentTimeMillis();
        try {
            if (this.f31510c != null) {
                this.f31510c.mo20795a();
            }
        } catch (Throwable th) {
            C13118b.m23587a(C12927a.f31456a, "flushBuffer", th);
        }
        if (!this.f31509b.f31956a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (!this.f31509b.f31956a.isEmpty()) {
                arrayList.add(this.f31509b.f31956a.poll());
                T poll = this.f31509b.f31956a.poll();
                if (poll != null) {
                    int i2 = poll.f31520c;
                    if (i == 0 || ((long) (i + i2)) < this.f31508a) {
                        i += i2;
                        arrayList.add(poll);
                    } else {
                        C12959d.C12961a.f31575a.mo20818a(arrayList, 0);
                        arrayList.clear();
                        arrayList.add(poll);
                        i = i2;
                    }
                }
            }
            C12959d.C12961a.f31575a.mo20818a(arrayList, 0);
        }
        if (C13037a.m23435c()) {
            m23219e();
        }
        if (C13037a.m23579r()) {
            System.currentTimeMillis();
        }
    }

    /* renamed from: e */
    private void m23219e() {
        if (this.f31510c != null) {
            String[] b = this.f31510c.mo20797b();
            if (!(b == null || b.length == 0)) {
                List asList = Arrays.asList(b);
                Collections.sort(asList, new Comparator<String>() {
                    /* class com.bytedance.p802b.p806b.p807a.C12937c.C129414 */

                    static {
                        Covode.recordClassIndex(14777);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
                        return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
                    }
                });
                if (C13037a.m23579r()) {
                    asList.size();
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < asList.size(); i2++) {
                    File file = new File(C12930b.m23208c(), (String) asList.get(i2));
                    if (file.exists()) {
                        C12943a a = C12943a.m23226a(file);
                        if (a == null) {
                            m23217a(file);
                        } else {
                            int i3 = a.f31520c;
                            if (i == 0 || ((long) (i + i3)) < this.f31508a) {
                                i += i3;
                                arrayList.add(a);
                            } else {
                                C12959d.C12961a.f31575a.mo20818a(arrayList, asList.size() - arrayList.size());
                                return;
                            }
                        }
                    }
                }
                C12959d.C12961a.f31575a.mo20818a(arrayList, 0);
                return;
            }
            return;
        }
        C13118b.m23586a(C12927a.f31456a, "persistentBuffer is null");
    }

    /* renamed from: b */
    private static long m23218b(File file) {
        String name = file.getName();
        int indexOf = name.indexOf("_");
        if (indexOf == -1) {
            return -1;
        }
        try {
            return Long.parseLong(name.substring(0, indexOf));
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.p802b.p806b.p807a.p812e.AbstractC12974d
    /* renamed from: b */
    public final void mo20786b(long j) {
        String[] b;
        if (!(this.f31510c == null || (b = this.f31510c.mo20797b()) == null || b.length == 0)) {
            for (String str : b) {
                File file = new File(C12930b.m23208c(), str);
                long b2 = m23218b(file);
                if (b2 == -1) {
                    C13120c.m23592b(file);
                } else if (b2 <= j) {
                    C13120c.m23592b(file);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m23217a(File file) {
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

    /* renamed from: a */
    public final synchronized void mo20784a(long j) {
        C13037a.m23579r();
        if (j > 0) {
            if (this.f31511d != j) {
                this.f31511d = j;
                if (this.f31512e != null) {
                    C13124b.m23597a(EnumC13126c.IO).mo20944b(this.f31512e);
                    this.f31512e = new AbstractRunnableC13123a(this.f31511d, this.f31511d) {
                        /* class com.bytedance.p802b.p806b.p807a.C12937c.C129381 */

                        static {
                            Covode.recordClassIndex(14774);
                        }

                        public final void run() {
                            C12937c.this.mo20785b();
                        }
                    };
                    C13124b.m23597a(EnumC13126c.IO).mo20943a(this.f31512e);
                }
            }
        }
    }
}
