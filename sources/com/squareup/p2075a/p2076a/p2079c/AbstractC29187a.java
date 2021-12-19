package com.squareup.p2075a.p2076a.p2079c;

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

/* renamed from: com.squareup.a.a.c.a */
public interface AbstractC29187a {

    /* renamed from: a */
    public static final AbstractC29187a f69124a = new AbstractC29187a() {
        /* class com.squareup.p2075a.p2076a.p2079c.AbstractC29187a.C291881 */

        static {
            Covode.recordClassIndex(35537);
        }

        @Override // com.squareup.p2075a.p2076a.p2079c.AbstractC29187a
        /* renamed from: a */
        public final AbstractC89408aa mo50896a(File file) {
            return C89436q.m155168c(file);
        }

        @Override // com.squareup.p2075a.p2076a.p2079c.AbstractC29187a
        /* renamed from: e */
        public final boolean mo50901e(File file) {
            return file.exists();
        }

        @Override // com.squareup.p2075a.p2076a.p2079c.AbstractC29187a
        /* renamed from: f */
        public final long mo50902f(File file) {
            return file.length();
        }

        @Override // com.squareup.p2075a.p2076a.p2079c.AbstractC29187a
        /* renamed from: b */
        public final AbstractC89447y mo50898b(File file) {
            try {
                return C89436q.m155162a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C89436q.m155162a(file);
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2079c.AbstractC29187a
        /* renamed from: c */
        public final AbstractC89447y mo50899c(File file) {
            try {
                return C89436q.m155167b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C89436q.m155167b(file);
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2079c.AbstractC29187a
        /* renamed from: d */
        public final void mo50900d(File file) {
            if (!m58360h(file) && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2079c.AbstractC29187a
        /* renamed from: g */
        public final void mo50903g(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        mo50903g(file2);
                    }
                    if (!m58360h(file2)) {
                        throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }

        /* renamed from: h */
        private static boolean m58360h(File file) {
            MethodCollector.m26663i(4176);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(4176);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(4176);
            return delete;
        }

        @Override // com.squareup.p2075a.p2076a.p2079c.AbstractC29187a
        /* renamed from: a */
        public final void mo50897a(File file, File file2) {
            MethodCollector.m26663i(4189);
            mo50900d(file2);
            if (file.renameTo(file2)) {
                MethodCollector.m26664o(4189);
                return;
            }
            IOException iOException = new IOException("failed to rename " + file + " to " + file2);
            MethodCollector.m26664o(4189);
            throw iOException;
        }
    };

    /* renamed from: a */
    AbstractC89408aa mo50896a(File file);

    /* renamed from: a */
    void mo50897a(File file, File file2);

    /* renamed from: b */
    AbstractC89447y mo50898b(File file);

    /* renamed from: c */
    AbstractC89447y mo50899c(File file);

    /* renamed from: d */
    void mo50900d(File file);

    /* renamed from: e */
    boolean mo50901e(File file);

    /* renamed from: f */
    long mo50902f(File file);

    /* renamed from: g */
    void mo50903g(File file);

    static {
        Covode.recordClassIndex(35536);
    }
}
