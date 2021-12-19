package p4519d.p4520a.p4530d.p4531a;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: d.a.d.a.d */
public final class C88045d {

    /* renamed from: a */
    public static final String f199951a;

    /* renamed from: b */
    public static final C88045d f199952b = new C88045d();

    /* renamed from: c */
    private static final String f199953c = "";

    private C88045d() {
    }

    /* renamed from: a */
    public static boolean m153108a(String str, String str2) {
        MethodCollector.m26663i(2586);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        boolean renameTo = new File(str).getAbsoluteFile().renameTo(new File(str2).getAbsoluteFile());
        MethodCollector.m26664o(2586);
        return renameTo;
    }

    /* renamed from: a */
    public static boolean m153107a(C88051h hVar, C88051h hVar2) {
        MethodCollector.m26663i(2592);
        if (hVar == null) {
            MethodCollector.m26664o(2592);
            return false;
        } else if (hVar2 == null) {
            MethodCollector.m26664o(2592);
            return false;
        } else {
            if (m153110b(hVar2)) {
                m153114c(hVar2);
            }
            File file = new File(hVar.f199967a);
            File file2 = new File(hVar2.f199967a);
            if (!file.exists()) {
                MethodCollector.m26664o(2592);
                return false;
            }
            boolean renameTo = file.renameTo(file2);
            MethodCollector.m26664o(2592);
            return renameTo;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d.a.d.a.d$a */
    public static final class C88046a extends AbstractC89220m implements AbstractC89171a<EnumC88052i> {

        /* renamed from: a */
        final /* synthetic */ File f199954a;

        static {
            Covode.recordClassIndex(104072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88046a(File file) {
            super(0);
            this.f199954a = file;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EnumC88052i invoke() {
            if (this.f199954a.isDirectory()) {
                return EnumC88052i.Directory;
            }
            if (this.f199954a.isFile()) {
                return EnumC88052i.Regular;
            }
            return EnumC88052i.Unknown;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d.a.d.a.d$b */
    public static final class C88047b extends AbstractC89220m implements AbstractC89171a<Charset> {

        /* renamed from: a */
        final /* synthetic */ EnumC88043b f199955a;

        static {
            Covode.recordClassIndex(104073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88047b(EnumC88043b bVar) {
            super(0);
            this.f199955a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Charset invoke() {
            if (C88048e.f199958c[this.f199955a.ordinal()] != 1) {
                return C89338d.f202990a;
            }
            return C89338d.f202994e;
        }
    }

    static {
        Covode.recordClassIndex(104071);
        String str = File.separator;
        C89219l.m154709a((Object) str, "");
        f199951a = str;
    }

    /* renamed from: a */
    public static C88049f m153099a(C88051h hVar) {
        String str;
        if (hVar == null || (str = hVar.f199967a) == null) {
            return null;
        }
        return m153113c(str);
    }

    /* renamed from: b */
    public static boolean m153110b(C88051h hVar) {
        String str;
        if (hVar == null || (str = hVar.f199967a) == null) {
            return false;
        }
        return m153118f(str);
    }

    /* renamed from: c */
    public static C88049f m153113c(String str) {
        C89219l.m154719c(str, "");
        return m153100a(new File(str));
    }

    /* renamed from: d */
    public static String m153116d(String str) {
        if (str == null) {
            return null;
        }
        return new File(str).getName();
    }

    /* renamed from: c */
    public static boolean m153114c(C88051h hVar) {
        String str;
        if (hVar == null || (str = hVar.f199967a) == null) {
            return false;
        }
        return m153119g(str);
    }

    /* renamed from: e */
    public static boolean m153117e(String str) {
        C89219l.m154719c(str, "");
        return new File(str).getAbsoluteFile().mkdirs();
    }

    /* renamed from: f */
    public static boolean m153118f(String str) {
        if (str == null) {
            return false;
        }
        return new File(str).getAbsoluteFile().exists();
    }

    /* renamed from: d */
    public static C88044c m153115d(C88051h hVar) {
        MethodCollector.m26663i(2607);
        if (hVar == null) {
            MethodCollector.m26664o(2607);
            return null;
        }
        String str = hVar.f199967a;
        if (str == null) {
            MethodCollector.m26664o(2607);
            return null;
        }
        C89219l.m154719c(str, "");
        FileInputStream fileInputStream = new FileInputStream(new File(str).getAbsoluteFile());
        C88044c cVar = new C88044c();
        cVar.mo142610a(fileInputStream);
        MethodCollector.m26664o(2607);
        return cVar;
    }

    /* renamed from: g */
    public static boolean m153119g(String str) {
        C89219l.m154719c(str, "");
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File absoluteFile = file.getAbsoluteFile();
        C89219l.m154709a((Object) absoluteFile, "");
        if (C89159j.m154656g(absoluteFile)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C88049f m153100a(File file) {
        String name = file.getName();
        C89219l.m154709a((Object) name, "");
        return new C88049f(name, new C88051h(file.getAbsolutePath()), new C88051h(file.getCanonicalPath()), Double.valueOf(0.0d), Double.valueOf((double) file.lastModified()), Long.valueOf(file.length()), (EnumC88052i) new C88046a(file).invoke());
    }

    /* renamed from: b */
    public static List<String> m153109b(String str) {
        File absoluteFile;
        Object valueOf;
        if (str == null || (absoluteFile = new File(str).getAbsoluteFile()) == null || !absoluteFile.exists()) {
            return null;
        }
        if (!absoluteFile.isDirectory()) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = absoluteFile.listFiles();
        if (listFiles != null) {
            ArrayList arrayList2 = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                C89219l.m154709a((Object) file, "");
                if (file.isDirectory()) {
                    String name = file.getName();
                    C89219l.m154709a((Object) name, "");
                    if (!C89361p.m154929e((CharSequence) name, (CharSequence) "__MACOSX")) {
                        List<String> b = m153109b(file.getAbsolutePath());
                        valueOf = b != null ? Boolean.valueOf(arrayList.addAll(b)) : null;
                    } else {
                        valueOf = C89391z.f203057a;
                    }
                } else {
                    String absolutePath = file.getAbsolutePath();
                    C89219l.m154709a((Object) absolutePath, "");
                    valueOf = Boolean.valueOf(arrayList.add(absolutePath));
                }
                arrayList2.add(valueOf);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m153111b(File file) {
        MethodCollector.m26663i(2661);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(2661);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(2661);
        return delete;
    }

    /* renamed from: a */
    public static List<C88049f> m153105a(String str) {
        C89219l.m154719c(str, "");
        File[] listFiles = new File(str).getAbsoluteFile().listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            C89219l.m154709a((Object) file, "");
            arrayList.add(m153100a(file));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m153106a(AbstractC88054k kVar) {
        C89219l.m154719c(kVar, "");
        try {
            kVar.mo139996a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C88050g m153101a(C88051h hVar, boolean z) {
        String str;
        if (hVar == null || (str = hVar.f199967a) == null) {
            return null;
        }
        return m153102a(str, z);
    }

    /* renamed from: a */
    public static C88050g m153102a(String str, boolean z) {
        MethodCollector.m26663i(2613);
        C89219l.m154719c(str, "");
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str).getAbsoluteFile(), z);
        C88050g gVar = new C88050g();
        gVar.mo142614a(fileOutputStream);
        MethodCollector.m26664o(2613);
        return gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m153104a(C88044c cVar, EnumC88043b bVar) {
        MethodCollector.m26663i(2625);
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar, "");
        InputStream inputStream = cVar.f199950a;
        if (inputStream == null) {
            C89219l.m154710a("inputStream");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, ((Charset) new C88047b(bVar).invoke()).name());
        try {
            InputStreamReader inputStreamReader2 = inputStreamReader;
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            for (int read = inputStreamReader2.read(cArr); read != -1; read = inputStreamReader2.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            C89219l.m154709a((Object) stringWriter2, "");
            C89146c.m154636a(inputStreamReader, null);
            MethodCollector.m26664o(2625);
            return stringWriter2;
        } catch (Throwable th) {
            C89146c.m154636a(inputStreamReader, th);
            MethodCollector.m26664o(2625);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        if (r2 == null) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100 A[Catch:{ all -> 0x0102 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m153112b(java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: p4519d.p4520a.p4530d.p4531a.C88045d.m153112b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static long m153098a(String str, String str2, EnumC88043b bVar) {
        long j;
        MethodCollector.m26663i(2539);
        File absoluteFile = new File(str).getAbsoluteFile();
        if (!absoluteFile.exists()) {
            absoluteFile.createNewFile();
        }
        if (bVar == EnumC88043b.Base64) {
            Charset charset = C89338d.f202990a;
            if (str2 != null) {
                byte[] bytes = str2.getBytes(charset);
                C89219l.m154709a((Object) bytes, "");
                str2 = Base64.encodeToString(bytes, 0);
                C89219l.m154709a((Object) str2, "");
            } else {
                C89388w wVar = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(2539);
                throw wVar;
            }
        } else if (C88048e.f199957b[bVar.ordinal()] == 1) {
            Charset charset2 = C89338d.f202990a;
            if (str2 != null) {
                byte[] bytes2 = str2.getBytes(charset2);
                C89219l.m154709a((Object) bytes2, "");
                str2 = new String(bytes2, C89338d.f202994e);
            } else {
                C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(2539);
                throw wVar2;
            }
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(absoluteFile, false));
            try {
                OutputStreamWriter outputStreamWriter2 = outputStreamWriter;
                outputStreamWriter2.write(str2);
                outputStreamWriter2.flush();
                C89146c.m154636a(outputStreamWriter, null);
                j = (long) str2.length();
                MethodCollector.m26664o(2539);
                return j;
            } catch (Throwable th) {
                C89146c.m154636a(outputStreamWriter, th);
                MethodCollector.m26664o(2539);
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
            j = 0;
        }
    }
}
