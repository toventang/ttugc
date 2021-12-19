package com.p2082ss.android.ugc.aweme.feed.p2952k;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.io.IOException;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.k.c */
public final class C49719c {

    /* renamed from: a */
    public static final C49719c f114425a = new C49719c();

    private C49719c() {
    }

    static {
        Covode.recordClassIndex(58568);
    }

    /* renamed from: a */
    public static String m93133a() {
        String str;
        String language;
        String[] list;
        String str2 = "";
        MethodCollector.m26663i(5436);
        String str3 = null;
        try {
            String a = C58071d.m104907a();
            C89219l.m154716b(a, str2);
            Locale locale = Locale.getDefault();
            C89219l.m154716b(locale, str2);
            if (a != null) {
                String lowerCase = a.toLowerCase(locale);
                C89219l.m154716b(lowerCase, str2);
                Resources resources = C17867d.m33078a().getResources();
                C89219l.m154716b(resources, str2);
                String[] list2 = resources.getAssets().list(str2);
                if (list2 != null) {
                    int length = list2.length;
                    String str4 = null;
                    for (int i = 0; i < length; i++) {
                        String str5 = list2[i];
                        C89219l.m154716b(str5, str2);
                        if (C89361p.m154929e((CharSequence) str5, (CharSequence) "i18#lang_") && (list = resources.getAssets().list(list2[i])) != null) {
                            int length2 = list.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    break;
                                } else if (TextUtils.equals(list[i2], lowerCase + ".json")) {
                                    str4 = list2[i] + "/" + lowerCase + ".json";
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    if (str4 == null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Configuration configuration = resources.getConfiguration();
                            C89219l.m154716b(configuration, str2);
                            Locale locale2 = configuration.getLocales().get(0);
                            C89219l.m154716b(locale2, str2);
                            language = locale2.getLanguage();
                            C89219l.m154716b(language, str2);
                        } else {
                            Locale locale3 = resources.getConfiguration().locale;
                            C89219l.m154716b(locale3, str2);
                            language = locale3.getLanguage();
                            C89219l.m154716b(language, str2);
                        }
                        if (TextUtils.isEmpty(language)) {
                            language = "en";
                        }
                        str2 = language;
                        str4 = "i18#lang_" + str2 + "/default.json";
                    }
                    str3 = m93134a(C17867d.m33078a(), str4);
                    C33744d a2 = new C33744d().mo59983a("language", str2);
                    if (TextUtils.isEmpty(str3)) {
                        str = "default";
                    } else {
                        str = "languageDefault";
                    }
                    C39162r.m79460a("use_default_json", a2.mo59983a("isLanguageDefault", str).f79943a);
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = m93134a(C17867d.m33078a(), "feed_response.json");
                }
                MethodCollector.m26664o(5436);
                return str3;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            MethodCollector.m26664o(5436);
            throw nullPointerException;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC, Splitter:B:25:0x0045] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m93134a(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = 5440(0x1540, float:7.623E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            r4 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            java.io.InputStream r3 = r0.open(r7)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            int r0 = r3.available()     // Catch:{ IOException -> 0x002e }
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x002e }
            r3.read(r2)     // Catch:{ IOException -> 0x002e }
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)     // Catch:{ IOException -> 0x002e }
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)     // Catch:{ IOException -> 0x002e }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x002e }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x002e }
            r3.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r0
        L_0x002e:
            r0 = move-exception
            goto L_0x0034
        L_0x0030:
            r0 = move-exception
            goto L_0x003a
        L_0x0032:
            r0 = move-exception
            r3 = r4
        L_0x0034:
            r0.printStackTrace()     // Catch:{ all -> 0x0038 }
            goto L_0x0043
        L_0x0038:
            r0 = move-exception
            r4 = r3
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x0043:
            if (r3 == 0) goto L_0x0048
            r3.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2952k.C49719c.m93134a(android.content.Context, java.lang.String):java.lang.String");
    }
}
