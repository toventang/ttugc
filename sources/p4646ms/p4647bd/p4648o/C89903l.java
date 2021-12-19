package p4646ms.p4647bd.p4648o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p4646ms.p4647bd.p4648o.C89910n;

/* renamed from: ms.bd.o.l */
public class C89903l implements C89910n.AbstractC89911a {

    /* access modifiers changed from: package-private */
    /* renamed from: ms.bd.o.l$a */
    public static class C89904a {

        /* renamed from: a */
        public ZipFile f203789a;

        /* renamed from: b */
        public ZipEntry f203790b;

        static {
            Covode.recordClassIndex(106001);
        }

        public C89904a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f203789a = zipFile;
            this.f203790b = zipEntry;
        }
    }

    static {
        Covode.recordClassIndex(106000);
    }

    /* renamed from: a */
    static C89904a m155995a(Context context, String[] strArr, String str) {
        MethodCollector.m26663i(1211);
        String[] a = m155997a(context);
        int length = a.length;
        char c = 0;
        int i = 0;
        while (i < length) {
            String str2 = a[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    ZipFile zipFile = new ZipFile(new File(str2), 1);
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        if (i4 < 5) {
                            int length2 = strArr.length;
                            int i6 = 0;
                            while (i6 < length2) {
                                String str3 = "lib" + File.separatorChar + strArr[i6] + File.separatorChar + str;
                                Object[] objArr = new Object[2];
                                objArr[c] = str3;
                                objArr[1] = str2;
                                C89917o.m156019a("Looking for %s in APK %s...", objArr);
                                ZipEntry entry = zipFile.getEntry(str3);
                                if (entry != null) {
                                    C89904a aVar = new C89904a(zipFile, entry);
                                    MethodCollector.m26664o(1211);
                                    return aVar;
                                }
                                i6++;
                                c = 0;
                            }
                            i4 = i5;
                        } else {
                            try {
                                zipFile.close();
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                } catch (IOException unused2) {
                    i2 = i3;
                }
            }
            i++;
            c = 0;
        }
        MethodCollector.m26664o(1211);
        return null;
    }

    /* renamed from: a */
    static void m155996a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static String[] m155997a(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* renamed from: a */
    static String[] m155998a(Context context, String str) {
        MethodCollector.m26663i(1235);
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : m155997a(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
        MethodCollector.m26664o(1235);
        return strArr;
    }
}
