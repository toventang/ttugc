package com.lynx.tasm.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.provider.AbstractC28846d;
import com.lynx.tasm.provider.AbstractC28853k;
import com.lynx.tasm.provider.C28847e;
import com.lynx.tasm.provider.C28848f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lynx.tasm.core.b */
public class C28748b {

    /* renamed from: a */
    private static C28748b f67794a;

    /* renamed from: b */
    private LruCache<String, Integer> f67795b = new LruCache<>(100);

    static {
        Covode.recordClassIndex(34847);
    }

    private C28748b() {
    }

    /* renamed from: a */
    public static C28748b m57567a() {
        MethodCollector.m26663i(267);
        if (f67794a == null) {
            synchronized (C28748b.class) {
                try {
                    if (f67794a == null) {
                        f67794a = new C28748b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(267);
                    throw th;
                }
            }
        }
        C28748b bVar = f67794a;
        MethodCollector.m26664o(267);
        return bVar;
    }

    /* renamed from: a */
    public final Integer mo49865a(Context context, String str) {
        String str2;
        MethodCollector.m26663i(297);
        if (str == null || str.isEmpty()) {
            MethodCollector.m26664o(297);
            return null;
        }
        try {
            Integer valueOf = Integer.valueOf(Integer.parseInt(str));
            MethodCollector.m26664o(297);
            return valueOf;
        } catch (NumberFormatException unused) {
            String replace = str.toLowerCase().replace("-", "_");
            Integer num = this.f67795b.get(replace);
            if (num != null) {
                MethodCollector.m26664o(297);
                return num;
            }
            int indexOf = replace.indexOf(".");
            if (indexOf <= 0 || indexOf >= replace.length()) {
                str2 = null;
            } else {
                str2 = replace.substring(0, indexOf);
            }
            if (TextUtils.isEmpty(str2)) {
                MethodCollector.m26664o(297);
                return null;
            }
            synchronized (this) {
                Integer valueOf2 = Integer.valueOf(context.getResources().getIdentifier(replace, str2, context.getPackageName()));
                if (valueOf2.intValue() > 0) {
                    this.f67795b.put(replace, valueOf2);
                }
                MethodCollector.m26664o(297);
                return valueOf2;
            }
        } catch (Throwable th) {
            MethodCollector.m26664o(297);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo49866a(final C28847e eVar, final AbstractC28846d dVar) {
        final C28848f fVar = new C28848f();
        final String str = eVar.f68086a;
        if (TextUtils.isEmpty(str)) {
            fVar.f68093b = "url is empty!";
            dVar.onFailed(fVar);
            LLog.m56861c("lynx_ResManager", "url:" + str + " is empty!");
            return;
        }
        C28745a.m57564a().execute(new Runnable() {
            /* class com.lynx.tasm.core.C28748b.RunnableC287491 */

            static {
                Covode.recordClassIndex(34848);
            }

            public final void run() {
                MethodCollector.m26663i(639);
                if ((str.startsWith("http://") || str.startsWith("https://")) && str.length() > 8) {
                    C28847e eVar = eVar;
                    AbstractC28846d dVar = dVar;
                    AbstractC28853k kVar = LynxEnv.m56706b().f66636c;
                    if (kVar == null) {
                        C28848f fVar = new C28848f();
                        fVar.f68093b = "don't have ResProvider.Can't Get Resource.";
                        dVar.onFailed(fVar);
                        MethodCollector.m26664o(639);
                        return;
                    }
                    kVar.mo33447a(eVar, dVar);
                    MethodCollector.m26664o(639);
                } else if (str.startsWith("asset:///") && str.length() > 9) {
                    String str = str;
                    AbstractC28846d dVar2 = dVar;
                    InputStream inputStream = null;
                    C28848f fVar2 = new C28848f();
                    try {
                        InputStream open = LynxEnv.m56706b().f66634a.getAssets().open(str.substring(9));
                        StringBuilder sb = new StringBuilder(open.available());
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read != -1) {
                                sb.append(new String(bArr, 0, read));
                            } else {
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes());
                                fVar2.f68095d = byteArrayInputStream;
                                dVar2.onSuccess(fVar2);
                                byteArrayInputStream.close();
                                try {
                                    open.close();
                                    MethodCollector.m26664o(639);
                                    return;
                                } catch (IOException unused) {
                                    MethodCollector.m26664o(639);
                                    return;
                                }
                            }
                        }
                    } catch (IOException e) {
                        fVar2.f68093b = e.toString();
                        dVar2.onFailed(fVar2);
                        if (0 != 0) {
                            try {
                                inputStream.close();
                                MethodCollector.m26664o(639);
                            } catch (IOException unused2) {
                                MethodCollector.m26664o(639);
                            }
                        } else {
                            MethodCollector.m26664o(639);
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        MethodCollector.m26664o(639);
                        throw th;
                    }
                } else if (!str.startsWith("res:///") || str.length() <= 7) {
                    new RuntimeException("illegal url:" + str);
                    fVar.f68093b = "url is illegal:" + str;
                    dVar.onFailed(fVar);
                    MethodCollector.m26664o(639);
                } else {
                    C28748b bVar = C28748b.this;
                    String str2 = str;
                    AbstractC28846d dVar3 = dVar;
                    Integer a = bVar.mo49865a(LynxEnv.m56706b().f66634a, str2.substring(7));
                    C28848f fVar3 = new C28848f();
                    if (a != null) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(new byte[]{a.byteValue()});
                        fVar3.f68095d = byteArrayInputStream2;
                        dVar3.onSuccess(fVar3);
                        try {
                            byteArrayInputStream2.close();
                            MethodCollector.m26664o(639);
                        } catch (IOException unused4) {
                            MethodCollector.m26664o(639);
                        }
                    } else {
                        fVar3.f68093b = "resource not found!";
                        dVar3.onFailed(fVar3);
                        MethodCollector.m26664o(639);
                    }
                }
            }
        });
    }
}
