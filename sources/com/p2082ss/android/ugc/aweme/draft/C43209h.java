package com.p2082ss.android.ugc.aweme.draft;

import android.app.Application;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import java.io.File;
import java.nio.channels.FileChannel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.draft.h */
public final class C43209h {
    static {
        Covode.recordClassIndex(51396);
    }

    /* renamed from: a */
    private static final long m86167a() {
        File file = new File(C70638dj.f158103f);
        m86174b(file);
        return C13609b.m24456d(file.getAbsolutePath());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.draft.h$a */
    public static final class C43210a extends AbstractC89220m implements AbstractC89172b<File, Boolean> {

        /* renamed from: a */
        public static final C43210a f100703a = new C43210a();

        static {
            Covode.recordClassIndex(51397);
        }

        C43210a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(File file) {
            C89219l.m154721d(file, "");
            return true;
        }
    }

    /* renamed from: b */
    private static final boolean m86174b(File file) {
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }

    /* renamed from: d */
    public static final long m86177d(String str) {
        C89219l.m154721d(str, "");
        return C84896h.m145876i(str);
    }

    /* renamed from: b */
    public static final boolean m86175b(String str) {
        C89219l.m154721d(str, "");
        if (C84896h.m145869b(str)) {
            return C84896h.m145864a(str, (C84896h.AbstractC84898b) null);
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static final String m86171a(String str) {
        C89219l.m154721d(str, "");
        String str2 = File.separator;
        C89219l.m154716b(str2, "");
        if (C89361p.m154876c(str, str2, false)) {
            return str;
        }
        return str + File.separator;
    }

    /* renamed from: c */
    public static final boolean m86176c(String str) {
        boolean z;
        C89219l.m154721d(str, "");
        try {
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            File externalCacheDir = application.getExternalCacheDir();
            if (externalCacheDir != null) {
                C89219l.m154716b(externalCacheDir, "");
                String absolutePath = externalCacheDir.getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                z = C89361p.m154908a((CharSequence) absolutePath, (CharSequence) str, false);
                String str2 = C70638dj.f158101d;
                C89219l.m154716b(str2, "");
                if (C89361p.m154908a(str, str2, false) && !z) {
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        z = false;
        String str22 = C70638dj.f158101d;
        C89219l.m154716b(str22, "");
        return C89361p.m154908a(str, str22, false) ? true : true;
    }

    /* renamed from: a */
    private static final void m86172a(FileChannel fileChannel) {
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static boolean m86173a(File file) {
        MethodCollector.m26663i(1229);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1229);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1229);
        return delete;
    }

    /* renamed from: a */
    private static DraftFileSaveException m86168a(String str, String str2, AbstractC89172b<? super File, Boolean> bVar) {
        boolean z;
        DraftFileSaveException draftFileSaveException;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        if (C89219l.m154714a((Object) str2, (Object) str)) {
            return new DraftFileSaveException(0, null, 3, null);
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            draftFileSaveException = new DraftFileSaveException(-500, null, 2, null);
        } else {
            File file = new File(str);
            if (!file.exists()) {
                draftFileSaveException = new DraftFileSaveException(-502, new RuntimeException("path : ".concat(String.valueOf(str))));
            } else if (!file.isDirectory()) {
                draftFileSaveException = new DraftFileSaveException(-500, new RuntimeException("path : ".concat(String.valueOf(str))));
            } else if (str2.length() == 0) {
                draftFileSaveException = new DraftFileSaveException(-505, null, 2, null);
            } else {
                draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
            }
        }
        if (!draftFileSaveException.isSuc()) {
            return draftFileSaveException;
        }
        long d = m86177d(str);
        long a = m86167a();
        String str3 = "dstPath : " + str2 + " ; availableBytes : " + a + " ; srcFileLength : " + d;
        if (a < d) {
            return new DraftFileSaveException(-553, new C43203c(str3));
        }
        String a2 = m86171a(str2);
        if (!m86174b(new File(a2))) {
            return new DraftFileSaveException(-506, new RuntimeException("path : ".concat(String.valueOf(str2))));
        }
        DraftFileSaveException draftFileSaveException2 = new DraftFileSaveException(0, null, 3, null);
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                C89219l.m154716b(file2, "");
                if (bVar.invoke(file2).booleanValue()) {
                    if (file2.isDirectory()) {
                        String path = file2.getPath();
                        C89219l.m154716b(path, "");
                        draftFileSaveException2 = m86169a(path, a2 + file2.getName(), null, 4);
                    } else {
                        String path2 = file2.getPath();
                        C89219l.m154716b(path2, "");
                        draftFileSaveException2 = m86170a(path2, a2 + file2.getName(), false);
                    }
                    if (!draftFileSaveException2.isSuc()) {
                        break;
                    }
                }
            }
        }
        return draftFileSaveException2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0180  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException m86170a(java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 501
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.draft.C43209h.m86170a(java.lang.String, java.lang.String, boolean):com.ss.android.ugc.aweme.draft.model.DraftFileSaveException");
    }

    /* renamed from: a */
    public static /* synthetic */ DraftFileSaveException m86169a(String str, String str2, AbstractC89172b bVar, int i) {
        if ((i & 4) != 0) {
            bVar = C43210a.f100703a;
        }
        return m86168a(str, str2, bVar);
    }
}
