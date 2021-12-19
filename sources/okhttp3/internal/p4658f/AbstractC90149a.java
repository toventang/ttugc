package okhttp3.internal.p4658f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89447y;
import p4632k.C89436q;

/* renamed from: okhttp3.internal.f.a */
public interface AbstractC90149a {

    /* renamed from: a */
    public static final AbstractC90149a f204692a = new AbstractC90149a() {
        /* class okhttp3.internal.p4658f.AbstractC90149a.C901501 */

        static {
            Covode.recordClassIndex(106322);
        }

        @Override // okhttp3.internal.p4658f.AbstractC90149a
        /* renamed from: a */
        public final AbstractC89408aa mo144934a(File file) {
            return C89436q.m155168c(file);
        }

        @Override // okhttp3.internal.p4658f.AbstractC90149a
        /* renamed from: e */
        public final boolean mo144939e(File file) {
            return file.exists();
        }

        @Override // okhttp3.internal.p4658f.AbstractC90149a
        /* renamed from: f */
        public final long mo144940f(File file) {
            return file.length();
        }

        @Override // okhttp3.internal.p4658f.AbstractC90149a
        /* renamed from: b */
        public final AbstractC89447y mo144936b(File file) {
            try {
                return C89436q.m155162a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C89436q.m155162a(file);
            }
        }

        @Override // okhttp3.internal.p4658f.AbstractC90149a
        /* renamed from: c */
        public final AbstractC89447y mo144937c(File file) {
            try {
                return C89436q.m155167b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C89436q.m155167b(file);
            }
        }

        @Override // okhttp3.internal.p4658f.AbstractC90149a
        /* renamed from: d */
        public final void mo144938d(File file) {
            if (!m156620h(file) && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        @Override // okhttp3.internal.p4658f.AbstractC90149a
        /* renamed from: g */
        public final void mo144941g(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        mo144941g(file2);
                    }
                    if (!m156620h(file2)) {
                        throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }

        /* renamed from: h */
        private static boolean m156620h(File file) {
            MethodCollector.m26663i(6270);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(6270);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(6270);
            return delete;
        }

        @Override // okhttp3.internal.p4658f.AbstractC90149a
        /* renamed from: a */
        public final void mo144935a(File file, File file2) {
            MethodCollector.m26663i(6430);
            mo144938d(file2);
            if (file.renameTo(file2)) {
                MethodCollector.m26664o(6430);
                return;
            }
            IOException iOException = new IOException("failed to rename " + file + " to " + file2);
            MethodCollector.m26664o(6430);
            throw iOException;
        }
    };

    /* renamed from: a */
    AbstractC89408aa mo144934a(File file);

    /* renamed from: a */
    void mo144935a(File file, File file2);

    /* renamed from: b */
    AbstractC89447y mo144936b(File file);

    /* renamed from: c */
    AbstractC89447y mo144937c(File file);

    /* renamed from: d */
    void mo144938d(File file);

    /* renamed from: e */
    boolean mo144939e(File file);

    /* renamed from: f */
    long mo144940f(File file);

    /* renamed from: g */
    void mo144941g(File file);

    static {
        Covode.recordClassIndex(106321);
    }
}
