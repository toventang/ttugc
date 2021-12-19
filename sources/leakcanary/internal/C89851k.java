package leakcanary.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: leakcanary.internal.k */
public final class C89851k {

    /* renamed from: c */
    public static final List<String> f203738c = new ArrayList();

    /* renamed from: d */
    public static final List<String> f203739d = new ArrayList();

    /* renamed from: e */
    public static final List<String> f203740e = new ArrayList();

    /* renamed from: f */
    public static final C89852a f203741f = new C89852a((byte) 0);

    /* renamed from: a */
    final AbstractC89171a<Integer> f203742a;

    /* renamed from: b */
    final AbstractC89171a<Boolean> f203743b;

    /* renamed from: g */
    private final Context f203744g;

    /* renamed from: h */
    private volatile boolean f203745h;

    /* renamed from: leakcanary.internal.k$a */
    public static final class C89852a {
        static {
            Covode.recordClassIndex(105949);
        }

        private C89852a() {
        }

        public /* synthetic */ C89852a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo144436c() {
        return new File(m155926a(this.f203744g), "leakcanary");
    }

    static {
        Covode.recordClassIndex(105948);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo144435b() {
        return new File(m155927a(this.f203744g, "liko"), "leakcanary-" + this.f203744g.getPackageName());
    }

    /* renamed from: a */
    public final boolean mo144434a() {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23 || this.f203745h) {
            return true;
        }
        if (this.f203744g.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z = false;
        }
        this.f203745h = z;
        return this.f203745h;
    }

    /* renamed from: a */
    private static File m155926a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: b */
    static boolean m155929b(File file) {
        if ((file.mkdirs() || file.exists()) && file.canWrite()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m155928a(File file) {
        MethodCollector.m26663i(2433);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(2433);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(2433);
        return delete;
    }

    /* renamed from: leakcanary.internal.k$b */
    static final class C89853b<T> implements Comparator<File> {

        /* renamed from: a */
        public static final C89853b f203746a = new C89853b();

        static {
            Covode.recordClassIndex(105950);
        }

        C89853b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
        }
    }

    /* renamed from: leakcanary.internal.k$c */
    static final class C89854c implements FilenameFilter {

        /* renamed from: a */
        public static final C89854c f203747a = new C89854c();

        static {
            Covode.recordClassIndex(105951);
        }

        C89854c() {
        }

        public final boolean accept(File file, String str) {
            C89219l.m154709a((Object) str, "");
            return C89361p.m154876c(str, ".hprof", false);
        }
    }

    /* renamed from: a */
    private static File m155927a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    public C89851k(Context context, AbstractC89171a<Integer> aVar, AbstractC89171a<Boolean> aVar2) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        this.f203742a = aVar;
        this.f203743b = aVar2;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154709a((Object) applicationContext, "");
        this.f203744g = applicationContext;
    }
}
