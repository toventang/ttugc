package com.p2082ss.android.p2133d;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.common.p1831c.AbstractC24076b;
import com.facebook.common.p1831c.C24075a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.d.a */
public final class C29847a {

    /* renamed from: a */
    public static String f71195a = "joke_essay";

    /* renamed from: b */
    protected static String f71196b;

    /* renamed from: c */
    protected static String f71197c;

    /* renamed from: d */
    protected static String f71198d;

    /* renamed from: e */
    protected static String f71199e;

    /* renamed from: f */
    protected static String f71200f;

    /* renamed from: g */
    protected static boolean f71201g;

    /* renamed from: h */
    protected static String f71202h;

    /* renamed from: l */
    protected static volatile boolean f71203l;

    /* renamed from: i */
    protected final int f71204i;

    /* renamed from: j */
    protected final int f71205j;

    /* renamed from: k */
    protected final Context f71206k;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.d.a$a */
    public static class C29851a {

        /* renamed from: a */
        public long f71210a;

        /* renamed from: b */
        public long f71211b;

        /* renamed from: c */
        public String f71212c;

        static {
            Covode.recordClassIndex(36259);
        }

        private C29851a() {
        }

        /* synthetic */ C29851a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static String m60147a() {
        return f71199e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.d.a$b */
    public static class C29852b implements AbstractC24076b {

        /* renamed from: a */
        final List<C29851a> f71213a;

        static {
            Covode.recordClassIndex(36260);
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: a */
        public final void mo39560a(File file) {
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: c */
        public final void mo39562c(File file) {
        }

        private C29852b() {
            this.f71213a = new ArrayList();
        }

        /* synthetic */ C29852b(byte b) {
            this();
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: b */
        public final void mo39561b(File file) {
            C29851a aVar = new C29851a((byte) 0);
            aVar.f71210a = file.lastModified();
            aVar.f71211b = file.length();
            aVar.f71212c = file.getAbsolutePath();
            this.f71213a.add(aVar);
        }
    }

    static {
        Covode.recordClassIndex(36255);
    }

    /* renamed from: d */
    public static long m60153d() {
        try {
            return 0 + C29857e.m60164a(new File(f71197c), false);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private static boolean m60154e() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception e) {
            if (!Logger.debug()) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public final void mo52134c() {
        try {
            C29857e.m60166a(f71199e);
        } catch (Exception unused) {
        }
        if (m60153d() > 20971520) {
            long a = m60146a(20971520, f71198d);
            if (a < 20971520) {
                m60146a(20971520 - a, f71200f);
            }
        }
    }

    /* renamed from: b */
    public final void mo52133b() {
        if (!f71203l && m60153d() >= 62914560) {
            C29859g.f71219a.f71221b = System.currentTimeMillis();
            f71203l = true;
            new RunnableC13596e() {
                /* class com.p2082ss.android.p2133d.C29847a.C298492 */

                static {
                    Covode.recordClassIndex(36257);
                }

                @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                public final void run() {
                    Process.setThreadPriority(10);
                    System.currentTimeMillis();
                    try {
                        System.currentTimeMillis();
                        C29847a.this.mo52134c();
                    } catch (Exception unused) {
                    }
                    System.currentTimeMillis();
                    C29847a.f71203l = false;
                    try {
                        C29859g.f71219a.mo52142a(C29847a.this);
                    } catch (Exception unused2) {
                    }
                }
            }.mo21860a();
        }
        if (!f71203l) {
            long j = C29859g.f71219a.f71221b;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j < 86400000) {
                try {
                    C29859g.f71219a.mo52142a(this);
                } catch (Exception unused) {
                }
            } else {
                C29859g.f71219a.f71221b = currentTimeMillis;
                f71203l = true;
                new RunnableC13596e() {
                    /* class com.p2082ss.android.p2133d.C29847a.C298481 */

                    static {
                        Covode.recordClassIndex(36256);
                    }

                    @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                    public final void run() {
                        MethodCollector.m26663i(13699);
                        Process.setThreadPriority(10);
                        System.currentTimeMillis();
                        try {
                            Thread.sleep(10000);
                            System.currentTimeMillis();
                            C29847a.m60148a(C29847a.this.f71204i, C29847a.this.f71205j);
                        } catch (Exception unused) {
                        }
                        System.currentTimeMillis();
                        C29847a.f71203l = false;
                        try {
                            C29859g.f71219a.mo52142a(C29847a.this);
                            MethodCollector.m26664o(13699);
                        } catch (Exception unused2) {
                            MethodCollector.m26664o(13699);
                        }
                    }
                }.mo21860a();
            }
        }
    }

    public C29847a(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: b */
    private static File m60152b(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r0 != null) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m60150a(android.content.Context r4) {
        /*
        // Method dump skipped, instructions count: 279
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2133d.C29847a.m60150a(android.content.Context):void");
    }

    /* renamed from: a */
    private static boolean m60151a(File file) {
        MethodCollector.m26663i(13329);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13329);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13329);
        return delete;
    }

    private C29847a(Context context, byte b) {
        this.f71204i = 5;
        this.f71205j = 1;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f71206k = applicationContext;
        if (!f71201g) {
            m60150a(context);
        }
    }

    /* renamed from: a */
    protected static void m60148a(int i, int i2) {
        try {
            C29857e.m60166a(f71199e);
        } catch (Exception unused) {
        }
        m60149a(i, new File(f71198d));
        if (!C13627m.m24498a(f71200f)) {
            m60149a(i2, new File(f71200f));
        }
    }

    /* renamed from: a */
    private long m60146a(long j, String str) {
        C29852b bVar = new C29852b((byte) 0);
        C24075a.m45588a(new File(str), bVar);
        ArrayList<C29851a> arrayList = new ArrayList(Collections.unmodifiableList(bVar.f71213a));
        Collections.sort(arrayList, new Comparator<C29851a>() {
            /* class com.p2082ss.android.p2133d.C29847a.C298503 */

            static {
                Covode.recordClassIndex(36258);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C29851a aVar, C29851a aVar2) {
                C29851a aVar3 = aVar;
                C29851a aVar4 = aVar2;
                if (aVar3.f71210a == aVar4.f71210a) {
                    return 0;
                }
                if (aVar3.f71210a > aVar4.f71210a) {
                    return -1;
                }
                return 1;
            }
        });
        long j2 = 0;
        for (C29851a aVar : arrayList) {
            j2 += aVar.f71211b;
            if (j2 > j) {
                File file = new File(aVar.f71212c);
                file.getName();
                try {
                    m60151a(file);
                } catch (Exception unused) {
                }
            }
        }
        return j2;
    }

    /* renamed from: a */
    private static void m60149a(int i, File file) {
        File[] listFiles;
        File[] listFiles2;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.exists() && file2.isDirectory() && (listFiles2 = file2.listFiles()) != null && listFiles2.length != 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = ((long) (i * 24 * 3600)) * 1000;
                    for (File file3 : listFiles2) {
                        if (file3.isFile()) {
                            file3.getName();
                            try {
                                if (currentTimeMillis - file3.lastModified() > j) {
                                    m60151a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }
}
