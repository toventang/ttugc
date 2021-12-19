package com.p2082ss.android.ugc.aweme.download.component_api.p2811c;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15407j;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Objects;
import p078c.p080b.C1757e;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.c.a */
public final class C43177a {

    /* renamed from: a */
    public static final C43177a f100659a = new C43177a();

    private C43177a() {
    }

    static {
        Covode.recordClassIndex(51357);
    }

    /* renamed from: a */
    private static Uri m86107a(Context context, String str, String str2) {
        String str3;
        String str4;
        File file = new File(str);
        String str5 = Environment.DIRECTORY_DCIM;
        String str6 = "";
        C89219l.m154716b(str5, str6);
        if (C89361p.m154929e((CharSequence) str, (CharSequence) str5)) {
            String str7 = Environment.DIRECTORY_DCIM;
            C89219l.m154716b(str7, str6);
            int a = C89361p.m154888a((CharSequence) str, str7, 0, false, 6);
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            str3 = str.substring(a);
            C89219l.m154716b(str3, str6);
        } else if (!file.isAbsolute()) {
            str3 = Environment.DIRECTORY_DCIM + File.separator + str;
        } else {
            str3 = Environment.DIRECTORY_DCIM + File.separator + C15407j.f37618b + File.separator + file.getName();
        }
        File file2 = new File(str3);
        String name = file2.getName();
        File parentFile = file2.getParentFile();
        if (parentFile == null || (str4 = parentFile.getPath()) == null) {
            str4 = str6;
        }
        if (str2 == null) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(C89361p.m154939j(str3));
            if (mimeTypeFromExtension != null) {
                str6 = mimeTypeFromExtension;
            }
        } else {
            str6 = str2;
        }
        try {
            if (C89361p.m154874b(str6, "image", false)) {
                return C1757e.m5903a(context, name, str2, str4);
            }
            if (C89361p.m154874b(str6, "video", false)) {
                return C1757e.m5907b(context, name, str2, str4);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m86108a(Context context, String str, String str2, String str3) {
        MethodCollector.m26663i(825);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Uri a = m86107a(context, str2, str3);
        if (a == null) {
            MethodCollector.m26664o(825);
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(a);
            if (openOutputStream == null) {
                MethodCollector.m26664o(825);
                return false;
            }
            try {
                fileInputStream = new FileInputStream(new File(str));
            } catch (Exception unused) {
                if (0 == 0) {
                    MethodCollector.m26664o(825);
                    return false;
                }
            }
            boolean a2 = C80313cs.m139230a(fileInputStream, openOutputStream);
            MethodCollector.m26664o(825);
            return a2;
        } catch (Exception unused2) {
        }
    }
}
