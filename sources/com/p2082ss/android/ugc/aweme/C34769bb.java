package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.bb */
public final class C34769bb {

    /* renamed from: a */
    private static final String[] f82112a = {"app_assets", "cache/gift_assets", "cache/WebView", "app_webview", "files/music", "files/mvtheme", "files/font"};

    /* renamed from: b */
    private final AbstractC34770a f82113b;

    /* renamed from: c */
    private final File f82114c;

    /* renamed from: com.ss.android.ugc.aweme.bb$a */
    public interface AbstractC34770a {
        static {
            Covode.recordClassIndex(41766);
        }

        /* renamed from: a */
        void mo61485a(String str);
    }

    static {
        Covode.recordClassIndex(41765);
    }

    /* renamed from: a */
    private void m71010a() {
        if (this.f82114c.exists()) {
            StringBuilder sb = new StringBuilder();
            m71013a(this.f82114c, sb, 0);
            this.f82113b.mo61485a(sb.toString());
        }
    }

    /* renamed from: a */
    private long m71009a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            j += m71009a(file2);
        }
        return j;
    }

    private C34769bb(String str, AbstractC34770a aVar) {
        this.f82114c = new File(str);
        this.f82113b = aVar;
    }

    /* renamed from: a */
    public static void m71011a(File file, String str) {
        if (file != null) {
            new C34769bb(file.getAbsolutePath(), new C34776bc(str)).m71010a();
        }
    }

    /* renamed from: a */
    private void m71012a(File file, StringBuilder sb) {
        sb.append("name = ").append(file.getAbsolutePath()).append(", size = ").append(m71009a(file)).append("\n");
    }

    /* renamed from: a */
    private void m71013a(File file, StringBuilder sb, int i) {
        if (i <= 4) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        m71012a(file2, sb);
                        String absolutePath = file2.getAbsolutePath();
                        String[] strArr = f82112a;
                        int length = strArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                m71013a(file2, sb, 1 + i);
                                break;
                            } else if (absolutePath.contains(strArr[i2])) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            } else if (i == 0) {
                m71012a(file, sb);
            }
        }
    }
}
