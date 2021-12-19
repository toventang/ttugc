package com.p2082ss.android.ugc.tools.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tools.utils.u */
public final class C84915u {

    /* renamed from: a */
    public static final C84915u f189752a = new C84915u();

    private C84915u() {
    }

    /* renamed from: a */
    private static boolean m145945a(ZipEntry zipEntry) {
        String name;
        if (!(zipEntry == null || (name = zipEntry.getName()) == null || name.length() == 0)) {
            String name2 = zipEntry.getName();
            C89219l.m154716b(name2, "");
            if (!C89361p.m154929e((CharSequence) name2, (CharSequence) (".." + File.separator))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m145944a(File file) {
        MethodCollector.m26663i(11307);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11307);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11307);
        return delete;
    }

    static {
        Covode.recordClassIndex(98909);
    }

    /* renamed from: a */
    public static final String m145938a(File file, File file2) {
        MethodCollector.m26663i(11305);
        C89219l.m154721d(file, "");
        C89219l.m154721d(file2, "");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String absolutePath = file2.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            m145942a(fileInputStream, absolutePath);
            String absolutePath2 = file2.getAbsolutePath();
            C89219l.m154716b(absolutePath2, "");
            MethodCollector.m26664o(11305);
            return absolutePath2;
        } catch (Exception e) {
            m145944a(file2);
            if (!(e instanceof IOException)) {
                IOException iOException = new IOException("Error when decompressing zip file.", e);
                MethodCollector.m26664o(11305);
                throw iOException;
            }
            MethodCollector.m26664o(11305);
            throw e;
        }
    }

    /* renamed from: a */
    public static final String m145940a(String str, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        return m145939a(str, "ame-extract-frames" + System.currentTimeMillis() + ".zip", list);
    }

    /* renamed from: a */
    public static final void m145942a(InputStream inputStream, String str) {
        MethodCollector.m26663i(11630);
        C89219l.m154721d(inputStream, "");
        C89219l.m154721d(str, "");
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            ZipInputStream zipInputStream2 = zipInputStream;
            while (true) {
                ZipEntry nextEntry = zipInputStream2.getNextEntry();
                if (nextEntry == null) {
                    C89146c.m154636a(zipInputStream, null);
                    MethodCollector.m26664o(11630);
                    return;
                } else if (m145945a(nextEntry)) {
                    if (nextEntry.isDirectory()) {
                        new File(str + File.separator + nextEntry.getName()).mkdirs();
                    } else {
                        File file = new File(str + File.separator + nextEntry.getName());
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        } else if (file.exists()) {
                            m145944a(file);
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
                            MethodCollector.m26664o(11630);
                            throw th;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C89146c.m154636a(zipInputStream, th);
            MethodCollector.m26664o(11630);
            throw th2;
        }
    }

    /* renamed from: a */
    private static String m145939a(String str, String str2, List<String> list) {
        MethodCollector.m26663i(11162);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        String str3 = null;
        if (list.isEmpty()) {
            MethodCollector.m26664o(11162);
            return null;
        }
        try {
            File file = new File(str + File.separator + str2);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                ZipOutputStream zipOutputStream2 = zipOutputStream;
                for (String str4 : list) {
                    File file2 = new File(str4);
                    if (file2.exists()) {
                        if (file2.isDirectory()) {
                            f189752a.m145943a(zipOutputStream2, file2, file2.getName() + File.separator);
                        } else {
                            f189752a.m145943a(zipOutputStream2, file2, "");
                        }
                    }
                }
                zipOutputStream2.flush();
                String absolutePath = file.getAbsolutePath();
                C89146c.m154636a(zipOutputStream, null);
                str3 = absolutePath;
                MethodCollector.m26664o(11162);
                return str3;
            } catch (Throwable th) {
                C89146c.m154636a(zipOutputStream, th);
                MethodCollector.m26664o(11162);
                throw th;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m145941a(Context context, int i, String str) {
        MethodCollector.m26663i(11460);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (i == 0 || TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(11460);
            return;
        }
        Resources resources = context.getResources();
        if (resources != null) {
            InputStream openRawResource = resources.openRawResource(i);
            C89219l.m154716b(openRawResource, "");
            m145942a(openRawResource, str);
            MethodCollector.m26664o(11460);
            return;
        }
        MethodCollector.m26664o(11460);
    }

    /* renamed from: a */
    private final void m145943a(ZipOutputStream zipOutputStream, File file, String str) {
        MethodCollector.m26663i(11775);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        m145943a(zipOutputStream, file2, file.getName() + File.separator + file2.getName() + File.separator);
                    } else {
                        m145943a(zipOutputStream, file2, str);
                    }
                }
            }
            MethodCollector.m26664o(11775);
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
            while (true) {
                int read = bufferedInputStream2.read(bArr);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    C89146c.m154636a(bufferedInputStream, null);
                    MethodCollector.m26664o(11775);
                    return;
                }
            }
        } catch (Throwable th) {
            C89146c.m154636a(bufferedInputStream, th);
            MethodCollector.m26664o(11775);
            throw th;
        }
    }
}
