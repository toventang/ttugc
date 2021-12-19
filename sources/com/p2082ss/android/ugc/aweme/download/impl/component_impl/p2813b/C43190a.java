package com.p2082ss.android.ugc.aweme.download.impl.component_impl.p2813b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.b.a */
public final class C43190a {

    /* renamed from: a */
    public static final C43190a f100678a = new C43190a();

    private C43190a() {
    }

    static {
        Covode.recordClassIndex(51377);
    }

    /* renamed from: a */
    private static boolean m86131a(File file) {
        MethodCollector.m26663i(14294);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(14294);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(14294);
        return delete;
    }

    /* renamed from: a */
    public static final String m86129a(File file, File file2) {
        MethodCollector.m26663i(14276);
        C89219l.m154721d(file, "");
        C89219l.m154721d(file2, "");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String absolutePath = file2.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            m86130a(fileInputStream, absolutePath);
            String absolutePath2 = file2.getAbsolutePath();
            C89219l.m154716b(absolutePath2, "");
            MethodCollector.m26664o(14276);
            return absolutePath2;
        } catch (Exception e) {
            m86131a(file2);
            if (!(e instanceof IOException)) {
                IOException iOException = new IOException("Error when decompressing zip file.", e);
                MethodCollector.m26664o(14276);
                throw iOException;
            }
            MethodCollector.m26664o(14276);
            throw e;
        }
    }

    /* renamed from: a */
    private static void m86130a(InputStream inputStream, String str) {
        MethodCollector.m26663i(14296);
        C89219l.m154721d(inputStream, "");
        C89219l.m154721d(str, "");
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            ZipInputStream zipInputStream2 = zipInputStream;
            while (true) {
                ZipEntry nextEntry = zipInputStream2.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name != null) {
                        if (name.length() != 0) {
                            String name2 = nextEntry.getName();
                            C89219l.m154716b(name2, "");
                            if (!C89361p.m154929e((CharSequence) name2, (CharSequence) (".." + File.separator))) {
                                if (nextEntry.isDirectory()) {
                                    new File(str + File.separator + nextEntry.getName()).mkdirs();
                                } else {
                                    File file = new File(str + File.separator + nextEntry.getName());
                                    File parentFile = file.getParentFile();
                                    if (!parentFile.exists()) {
                                        parentFile.mkdirs();
                                    } else if (file.exists()) {
                                        m86131a(file);
                                    } else {
                                        file.createNewFile();
                                    }
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                                    try {
                                        BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
                                        byte[] bArr = new byte[2048];
                                        while (true) {
                                            int read = zipInputStream2.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            bufferedOutputStream2.write(bArr, 0, read);
                                        }
                                        bufferedOutputStream2.flush();
                                        C89146c.m154636a(bufferedOutputStream, null);
                                    } catch (Throwable th) {
                                        C89146c.m154636a(bufferedOutputStream, th);
                                        MethodCollector.m26664o(14296);
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    C89146c.m154636a(zipInputStream, null);
                    MethodCollector.m26664o(14296);
                    return;
                }
            }
        } catch (Throwable th2) {
            C89146c.m154636a(zipInputStream, th);
            MethodCollector.m26664o(14296);
            throw th2;
        }
    }
}
