package com.p2082ss.android.ugc.tiktok.deeplink.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.JSONObject;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89167q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.b */
public final class C84301b {

    /* renamed from: a */
    static final String f188513a = "use_gecko_config";

    /* renamed from: b */
    static C84300a f188514b;

    /* renamed from: c */
    public static final C84301b f188515c = new C84301b();

    private C84301b() {
    }

    static {
        Covode.recordClassIndex(98225);
    }

    /* renamed from: a */
    static C84300a m145002a(Context context) {
        Throwable th;
        MethodCollector.m26663i(9346);
        if (context != null) {
            try {
                InputStream open = context.getAssets().open("roma_schema_config.json");
                try {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read, C89338d.f202990a));
                    }
                    String sb2 = sb.toString();
                    C89219l.m154716b(sb2, "");
                    if (!TextUtils.isEmpty(sb2)) {
                        JSONObject jSONObject = new JSONObject(sb2);
                        C84300a aVar = new C84300a(jSONObject.optJSONObject("payload"), Long.valueOf(jSONObject.optLong("version", -1)));
                        open.close();
                        MethodCollector.m26664o(9346);
                        return aVar;
                    }
                    open.close();
                } catch (Exception unused) {
                    if (open != null) {
                        open.close();
                    }
                    MethodCollector.m26664o(9346);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (open != null) {
                        open.close();
                    }
                    MethodCollector.m26664o(9346);
                    throw th;
                }
            } catch (Exception unused2) {
                MethodCollector.m26664o(9346);
                return null;
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(9346);
                throw th;
            }
        }
        MethodCollector.m26664o(9346);
        return null;
    }

    /* renamed from: a */
    static String m145003a(String str) {
        boolean z;
        MethodCollector.m26663i(9348);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(9348);
            return null;
        }
        File file = new File(str);
        if (file.exists() && file.listFiles() != null) {
            File[] listFiles = file.listFiles();
            C89219l.m154716b(listFiles, "");
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                File[] listFiles2 = file.listFiles();
                for (File file2 : listFiles2) {
                    C89219l.m154716b(file2, "");
                    if (C89361p.m154872a("roma_schema_config.json", file2.getName(), true)) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), C89338d.f202990a), 8192);
                            try {
                                String a = C89167q.m154662a((Reader) bufferedReader);
                                C89146c.m154636a(bufferedReader, null);
                                MethodCollector.m26664o(9348);
                                return a;
                            } catch (Throwable th) {
                                C89146c.m154636a(bufferedReader, th);
                                MethodCollector.m26664o(9348);
                                throw th;
                            }
                        } catch (Exception e) {
                            C51423a.m95790a((Throwable) e);
                        }
                    }
                }
                MethodCollector.m26664o(9348);
                return null;
            }
        }
        MethodCollector.m26664o(9348);
        return null;
    }
}
