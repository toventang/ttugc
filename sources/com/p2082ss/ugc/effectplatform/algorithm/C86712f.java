package com.p2082ss.ugc.effectplatform.algorithm;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.ugc.effectplatform.util.C87000n;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import p4519d.p4520a.p4530d.p4531a.AbstractC88054k;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89388w;
import p4600h.p4601a.C89064i;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.ugc.effectplatform.algorithm.f */
public final class C86712f {

    /* renamed from: a */
    public final Object f195543a;

    /* renamed from: b */
    private final String f195544b;

    static {
        Covode.recordClassIndex(102411);
    }

    /* renamed from: a */
    private static Context m150213a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final boolean mo139954a(String str) {
        MethodCollector.m26663i(1227);
        C89219l.m154719c(str, "");
        boolean z = false;
        try {
            Object obj = this.f195543a;
            if (obj instanceof Context) {
                if (obj != null) {
                    Context a = m150213a((Context) obj);
                    C89219l.m154709a((Object) a, "");
                    AssetManager assets = a.getAssets();
                    String a2 = C87000n.m150684a(str);
                    if (this.f195544b == null || !new C89350l(this.f195544b).matches(a2)) {
                        C88044c cVar = new C88044c();
                        InputStream open = assets.open(str, 2);
                        C89219l.m154709a((Object) open, "");
                        cVar.mo142610a(open);
                        z = true;
                        C88045d.m153106a((AbstractC88054k) cVar);
                    } else {
                        RuntimeException runtimeException = new RuntimeException(str + " manually excluded by DownloadableModelSupport.exclusionPattern");
                        MethodCollector.m26664o(1227);
                        throw runtimeException;
                    }
                } else {
                    C89388w wVar = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(1227);
                    throw wVar;
                }
            }
            return z;
        } catch (Exception unused) {
            return false;
        } finally {
            MethodCollector.m26664o(1227);
        }
    }

    /* renamed from: c */
    public final List<String> mo139956c(String str) {
        MethodCollector.m26663i(1287);
        C89219l.m154719c(str, "");
        Object obj = this.f195543a;
        List<String> list = null;
        if (!(obj instanceof Context)) {
            MethodCollector.m26664o(1287);
            return null;
        }
        try {
            Context a = m150213a((Context) obj);
            C89219l.m154709a((Object) a, "");
            String[] list2 = a.getAssets().list(str);
            if (list2 != null) {
                list = C89064i.m154508i(list2);
            }
        } catch (Exception e) {
            C88060b.m153136a("effect_platform", "error in list file: ".concat(String.valueOf(str)), e);
        }
        MethodCollector.m26664o(1287);
        return list;
    }

    /* renamed from: b */
    public final String mo139955b(String str) {
        MethodCollector.m26663i(1254);
        C89219l.m154719c(str, "");
        Object obj = this.f195543a;
        if (!(obj instanceof Context)) {
            MethodCollector.m26664o(1254);
            return null;
        }
        try {
            Context a = m150213a((Context) obj);
            C89219l.m154709a((Object) a, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.getAssets().open(str)));
            try {
                BufferedReader bufferedReader2 = bufferedReader;
                StringBuilder sb = new StringBuilder();
                C89233z.C89238e eVar = new C89233z.C89238e();
                while (true) {
                    T t = (T) bufferedReader2.readLine();
                    eVar.element = t;
                    if (t != null) {
                        sb.append((String) eVar.element);
                    } else {
                        String sb2 = sb.toString();
                        C89146c.m154636a(bufferedReader, null);
                        MethodCollector.m26664o(1254);
                        return sb2;
                    }
                }
            } catch (Throwable th) {
                C89146c.m154636a(bufferedReader, th);
                MethodCollector.m26664o(1254);
                throw th;
            }
        } catch (Exception unused) {
            C88060b.m153135a("effect_platform", "AssetUtils#loadJson::jsonFilePath=" + str + ", file not exists");
            MethodCollector.m26664o(1254);
            return null;
        }
    }

    public C86712f(Object obj, String str) {
        this.f195543a = obj;
        this.f195544b = str;
    }
}
