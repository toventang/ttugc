package com.p2082ss.android.ugc.aweme.draft;

import android.text.TextUtils;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.C77807b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.g */
public final class C43207g {

    /* renamed from: a */
    public static final C43207g f100700a = new C43207g();

    private C43207g() {
    }

    static {
        Covode.recordClassIndex(51394);
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.g$a */
    static final class RunnableC43208a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f100701a;

        /* renamed from: b */
        final /* synthetic */ String f100702b;

        static {
            Covode.recordClassIndex(51395);
        }

        RunnableC43208a(String str, String str2) {
            this.f100701a = str;
            this.f100702b = str2;
        }

        public final void run() {
            long j;
            File file = new File(this.f100701a);
            if (file.exists() && file.isDirectory()) {
                C43213k.m86181a("[logFileInfo]: current creation id: " + this.f100702b);
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        C89219l.m154716b(file2, "");
                        if (file2.isFile()) {
                            j = file2.length();
                        } else {
                            j = -1;
                        }
                        C43213k.m86181a("[logFileInfo]: file path : " + file2 + " exist : " + file2.exists() + ", size: " + j);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static void m86165c(String str, String str2) {
        if (str != null && str.length() != 0) {
            C77807b.f174559a.execute(new RunnableC43208a(str, str2));
        }
    }

    /* renamed from: b */
    public static String m86164b(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return "file path empty";
        }
        if (!C84902i.m145892a(str)) {
            return "src file not exist";
        }
        File file = new File(str2);
        if (!C84902i.m145892a(str2)) {
            C84902i.m145883a(str2, true);
        }
        if (!file.exists()) {
            return "dest not exist";
        }
        C43213k.m86181a("file size =  " + C13609b.m24455c(str) + " availableBytes = " + C13609b.m24456d(str2));
        String d = m86166d(str, str2);
        C43213k.m86181a("src file =  " + str + " dest file = " + str2 + " ret = " + d + ' ');
        return d;
    }

    /* renamed from: a */
    public static String m86163a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "file path empty";
        }
        File file = new File(str);
        String str3 = "src file not exist";
        if (!file.exists()) {
            return str3;
        }
        if (!file.isDirectory()) {
            C43213k.m86181a("src is not a directory");
            return str3;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            if (listFiles.length != 0) {
                File file2 = new File(str2);
                if (!file2.exists() || !file2.isDirectory()) {
                    file2.mkdirs();
                }
                if (!file2.exists()) {
                    return "dest not exist";
                }
                C43213k.m86181a("file size =  " + C13609b.m24455c(str) + " availableBytes = " + C13609b.m24456d(str2));
                str3 = "success";
                for (File file3 : listFiles) {
                    C89219l.m154716b(file3, "");
                    if (file3.isDirectory()) {
                        String path = file3.getPath();
                        C89219l.m154716b(path, "");
                        m86163a(path, str2 + file3.getName() + File.separator);
                    } else {
                        String d = m86166d(file3.getPath(), str2 + file3.getName());
                        C43213k.m86181a("src file =  " + file3.getPath() + " dest file = " + str2 + file3.getName() + " ret = " + d + ' ');
                        if (!C89219l.m154714a((Object) d, (Object) "success")) {
                            str3 = d;
                        }
                    }
                }
            }
        }
        return str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0106 A[SYNTHETIC, Splitter:B:112:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x010b A[Catch:{ IOException -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0110 A[Catch:{ IOException -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0115 A[Catch:{ IOException -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0149 A[SYNTHETIC, Splitter:B:139:0x0149] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x014e A[Catch:{ IOException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0153 A[Catch:{ IOException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0158 A[Catch:{ IOException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x016c A[SYNTHETIC, Splitter:B:157:0x016c] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0171 A[Catch:{ IOException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0176 A[Catch:{ IOException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x017b A[Catch:{ IOException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00b5 A[Catch:{ all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00b8 A[Catch:{ all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00c3 A[SYNTHETIC, Splitter:B:85:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00c8 A[Catch:{ IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00cd A[Catch:{ IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00d2 A[Catch:{ IOException -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00e0  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m86166d(java.lang.String r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 391
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.draft.C43207g.m86166d(java.lang.String, java.lang.String):java.lang.String");
    }
}
