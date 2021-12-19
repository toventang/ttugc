package com.bytedance.liko.leakdetector.strategy;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.liko.leakdetector.p1487a.C20852a;
import com.bytedance.liko.leakdetector.p1487a.C20853b;
import com.bytedance.liko.leakdetector.p1487a.C20854c;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.p1484b.C20840d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.liko.leakdetector.strategy.a */
public final class C20860a {

    /* renamed from: a */
    static volatile boolean f49318a;

    /* renamed from: b */
    public static final HandlerThread f49319b = new HandlerThread("MemoryPeakThread");

    /* renamed from: c */
    public static Handler f49320c;

    /* renamed from: d */
    public static Context f49321d;

    /* renamed from: e */
    public static volatile boolean f49322e;

    /* renamed from: f */
    public static boolean f49323f;

    /* renamed from: g */
    static final List<String> f49324g = new ArrayList();

    /* renamed from: h */
    public static final C20860a f49325h = new C20860a();

    /* renamed from: i */
    private static final List<String> f49326i = new ArrayList();

    /* renamed from: j */
    private static final List<String> f49327j = new ArrayList();

    private C20860a() {
    }

    static {
        Covode.recordClassIndex(24439);
    }

    /* renamed from: b */
    static File m39217b() {
        File file;
        Context context = f49321d;
        if (context == null) {
            C89219l.m154710a("context");
        }
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            file = context.getFilesDir();
            C58016d.f132222c = file;
        } else {
            file = C58016d.f132222c;
        }
        return new File(file, "leakcanary");
    }

    /* renamed from: a */
    static File m39215a() {
        File externalFilesDir;
        Context context = f49321d;
        if (context == null) {
            C89219l.m154710a("context");
        }
        if (!TextUtils.isEmpty("liko")) {
            externalFilesDir = context.getExternalFilesDir("liko");
        } else if (C58016d.f132223d == null || !C58016d.f132224e) {
            externalFilesDir = context.getExternalFilesDir("liko");
            C58016d.f132223d = externalFilesDir;
        } else {
            externalFilesDir = C58016d.f132223d;
        }
        StringBuilder sb = new StringBuilder("leakcanary-");
        Context context2 = f49321d;
        if (context2 == null) {
            C89219l.m154710a("context");
        }
        return new File(externalFilesDir, sb.append(context2.getPackageName()).toString());
    }

    /* renamed from: a */
    static boolean m39216a(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m39218b(File file) {
        MethodCollector.m26663i(13090);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13090);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13090);
        return delete;
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a$c */
    public static final class HandlerC20863c extends Handler {

        /* renamed from: a */
        final /* synthetic */ C20860a f49330a;

        static {
            Covode.recordClassIndex(24442);
        }

        public final void handleMessage(Message message) {
            File file;
            boolean z = false;
            if (C20860a.f49323f || C20853b.m39205a() <= C20840d.f49290d) {
                Handler handler = C20860a.f49320c;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(0, C20840d.f49289c);
                    return;
                }
                return;
            }
            if ("local_test".equals(MemoryConfig.getMemoryConfig().channel)) {
                C20862b bVar = C20862b.f49329a;
                C89219l.m154719c(bVar, "");
                ArrayList arrayList = new ArrayList();
                File[] listFiles = C20860a.m39215a().listFiles(bVar);
                if (listFiles != null) {
                    C89070n.m154536a((Collection) arrayList, (Object[]) listFiles);
                }
                File[] listFiles2 = C20860a.m39217b().listFiles(bVar);
                if (listFiles2 != null) {
                    C89070n.m154536a((Collection) arrayList, (Object[]) listFiles2);
                }
                int size = arrayList.size() - 7;
                if (size > 0) {
                    C89219l.m154719c("Removing " + size + " heap dumps", "");
                    C89070n.m154530a((List) arrayList, (Comparator) C20861a.f49328a);
                    int i = 0;
                    do {
                        String absolutePath = ((File) arrayList.get(i)).getAbsolutePath();
                        if (C20860a.m39218b((File) arrayList.get(i))) {
                            C20860a.f49324g.add(absolutePath);
                        } else {
                            C89219l.m154719c("Could not delete old hprof file " + ((File) arrayList.get(i)).getPath(), "");
                        }
                        i++;
                    } while (i < size);
                }
                File a = C20860a.m39215a();
                if (!C20860a.m39216a(a)) {
                    if (Build.VERSION.SDK_INT >= 23 && !C20860a.f49318a) {
                        Context context = C20860a.f49321d;
                        if (context == null) {
                            C89219l.m154710a("context");
                        }
                        if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                            z = true;
                        }
                        C20860a.f49318a = z;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        C89219l.m154719c("WRITE_EXTERNAL_STORAGE permission not granted, ignoring", "");
                    } else {
                        String externalStorageState = Environment.getExternalStorageState();
                        if (true ^ C89219l.m154714a((Object) "mounted", (Object) externalStorageState)) {
                            C89219l.m154719c("External storage not mounted, state: ".concat(String.valueOf(externalStorageState)), "");
                        } else {
                            C89219l.m154719c("Could not create heap dump directory in external storage: [" + a.getAbsolutePath() + ']', "");
                        }
                    }
                    a = C20860a.m39217b();
                    if (!C20860a.m39216a(a)) {
                        C89219l.m154719c("Could not create heap dump directory in app storage: [" + a.getAbsolutePath() + ']', "");
                        return;
                    }
                }
                file = new File(a, new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS'.hprof'", Locale.US).format(new Date()));
            } else {
                boolean z2 = MemoryConfig.getMemoryConfig().oversea;
                Context context2 = C20860a.f49321d;
                if (context2 == null) {
                    C89219l.m154710a("context");
                }
                file = C20852a.m39200a(z2, context2);
                if (file == null) {
                    return;
                }
            }
            try {
                Context context3 = C20860a.f49321d;
                if (context3 == null) {
                    C89219l.m154710a("context");
                }
                C20854c.m39206a(context3, file.getAbsolutePath());
                Npth.dumpHprof(file.getAbsolutePath());
                C89219l.m154719c("Npth dump heap", "");
            } catch (Exception unused) {
                C89219l.m154719c("Could not dump heap", "");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC20863c(C20860a aVar, Looper looper) {
            super(looper);
            this.f49330a = aVar;
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a$a */
    static final class C20861a<T> implements Comparator<File> {

        /* renamed from: a */
        public static final C20861a f49328a = new C20861a();

        static {
            Covode.recordClassIndex(24440);
        }

        C20861a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a$b */
    static final class C20862b implements FilenameFilter {

        /* renamed from: a */
        public static final C20862b f49329a = new C20862b();

        static {
            Covode.recordClassIndex(24441);
        }

        C20862b() {
        }

        public final boolean accept(File file, String str) {
            C89219l.m154709a((Object) str, "");
            return C89361p.m154876c(str, ".hprof", false);
        }
    }
}
