package com.p2082ss.android.ugc.aweme.editSticker.text.p2885a;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.a.b */
public class C45989b {

    /* renamed from: a */
    public static final String[] f107105a = {"default", "Proxima-Nova-Semibold.otf"};

    /* renamed from: e */
    private static C45989b f107106e;

    /* renamed from: b */
    public Map<String, C45995c> f107107b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: c */
    public Map<String, Typeface> f107108c = new ConcurrentHashMap();

    /* renamed from: d */
    public String f107109d = "default";

    /* renamed from: f */
    private String f107110f = "default";

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a.b$a */
    public interface AbstractC45994a {
        static {
            Covode.recordClassIndex(54527);
        }

        /* renamed from: a */
        void mo77575a();
    }

    /* renamed from: e */
    private static boolean m88768e(int i) {
        return i == 1;
    }

    /* renamed from: d */
    public final int mo77598d() {
        return m88767e(this.f107109d);
    }

    static {
        Covode.recordClassIndex(54522);
    }

    private C45989b() {
    }

    /* renamed from: c */
    public final Typeface mo77595c() {
        if (this.f107108c.get(this.f107109d) != null) {
            return this.f107108c.get(this.f107109d);
        }
        return Typeface.DEFAULT_BOLD;
    }

    /* renamed from: e */
    public final C45995c mo77600e() {
        return this.f107107b.get(this.f107109d);
    }

    /* renamed from: a */
    public static C45989b m88764a() {
        MethodCollector.m26663i(12117);
        if (f107106e == null) {
            synchronized (C45989b.class) {
                try {
                    if (f107106e == null) {
                        f107106e = new C45989b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12117);
                    throw th;
                }
            }
        }
        C45989b bVar = f107106e;
        MethodCollector.m26664o(12117);
        return bVar;
    }

    /* renamed from: b */
    public final List<C45995c> mo77594b() {
        if (this.f107107b.size() == 0) {
            return new ArrayList();
        }
        for (C45995c cVar : this.f107107b.values()) {
            if (cVar != null) {
                if (TextUtils.isEmpty(cVar.f107121e) || this.f107108c.get(cVar.f107121e) == null) {
                    Typeface d = m88766d(cVar.f107123g);
                    if (d != null) {
                        this.f107108c.put(cVar.f107121e, d);
                        cVar.f107124h = 1;
                    } else {
                        cVar.f107124h = 2;
                    }
                } else {
                    cVar.f107124h = 1;
                }
            }
        }
        return new ArrayList(this.f107107b.values());
    }

    /* renamed from: e */
    private int m88767e(String str) {
        C45995c cVar = this.f107107b.get(str);
        if (cVar != null) {
            return cVar.f107122f;
        }
        return 0;
    }

    /* renamed from: b */
    public final String mo77593b(int i) {
        if (m88768e(i)) {
            return this.f107110f;
        }
        return this.f107109d;
    }

    /* renamed from: d */
    public final C45995c mo77599d(int i) {
        return this.f107107b.get(mo77593b(i));
    }

    /* renamed from: a */
    public final C45995c mo77588a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f107107b.get(str);
    }

    /* renamed from: b */
    public final Typeface mo77592b(String str) {
        if (TextUtils.isEmpty(str) || this.f107108c.size() == 0) {
            return null;
        }
        Typeface typeface = this.f107108c.get(str);
        if (!(typeface != null || this.f107107b.get(str) == null || (typeface = m88766d(this.f107107b.get(str).f107123g)) == null)) {
            this.f107108c.put(str, typeface);
        }
        return typeface;
    }

    /* renamed from: c */
    public final Typeface mo77596c(int i) {
        if (!m88768e(i)) {
            return mo77595c();
        }
        if (this.f107108c.get(this.f107110f) != null) {
            return this.f107108c.get(this.f107110f);
        }
        return Typeface.DEFAULT_BOLD;
    }

    /* renamed from: d */
    private static Typeface m88766d(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return null;
        }
        try {
            if (TypeFaceOptimizer.getSwitch() && str != null) {
                if (TypeFaceLancet.cache.contains(str)) {
                    return (Typeface) TypeFaceLancet.cache.get(str);
                }
                Typeface createFromFile = Typeface.createFromFile(str);
                if (createFromFile != null) {
                    TypeFaceLancet.cache.put(str, createFromFile);
                    return createFromFile;
                }
            }
            return Typeface.createFromFile(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo77589a(int i) {
        List<C45995c> b = mo77594b();
        if (!b.isEmpty() && b.get(0).mo77602b()) {
            mo77591a(b.get(0).f107121e, i);
        }
    }

    /* renamed from: c */
    public final Typeface mo77597c(String str) {
        if (TextUtils.isEmpty(str) || this.f107107b.size() == 0) {
            return null;
        }
        for (C45995c cVar : this.f107107b.values()) {
            if (str.equals(cVar.f107117a)) {
                return mo77592b(cVar.f107121e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo77590a(Context context) {
        if (context != null) {
            C45890g.m88536b().mo78910a(C45890g.m88534a().f106861a, false, false, (IFetchEffectChannelListener) new IFetchEffectChannelListener() {
                /* class com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b.C459901 */

                static {
                    Covode.recordClassIndex(54523);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C45866d.m88491d().mo77253b("prefetch fail err: " + exceptionResult.getMsg());
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                    for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                        C45989b.this.mo77587a(effect);
                    }
                    C45989b bVar = C45989b.this;
                    for (String str : bVar.f107107b.keySet()) {
                        if (bVar.f107108c.get(str) == null) {
                            C45866d.m88491d().mo77254c("text font " + str + " is null");
                            C45890g.m88536b().mo78910a(C45890g.m88534a().f106861a, false, true, (IFetchEffectChannelListener) new IFetchEffectChannelListener() {
                                /* class com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b.C459912 */

                                static {
                                    Covode.recordClassIndex(54524);
                                }

                                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                                public final void onFail(ExceptionResult exceptionResult) {
                                    C45866d.m88491d().mo77253b("textFontDownload err: " + exceptionResult.getMsg());
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                                    for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                                        C45989b.this.mo77587a(effect);
                                    }
                                }
                            });
                            return;
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final C45995c mo77587a(Effect effect) {
        Typeface d;
        try {
            C45995c cVar = (C45995c) C45866d.m88489b().mo46670a(effect.getExtra(), C45995c.class);
            if (!TextUtils.isEmpty(cVar.f107121e)) {
                C45995c cVar2 = this.f107107b.get(cVar.f107121e);
                if (cVar2 == null) {
                    this.f107107b.put(cVar.f107121e, cVar);
                } else {
                    cVar2.f107121e = cVar.f107121e;
                    cVar2.f107117a = cVar.f107117a;
                    cVar2.f107122f = cVar.f107122f;
                    cVar2.f107118b = cVar.f107118b;
                    cVar2.f107119c = cVar.f107119c;
                    cVar2.f107120d = cVar.f107120d;
                    cVar = cVar2;
                }
                cVar.f107125i = effect;
                if (this.f107108c.get(cVar.f107121e) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && C84902i.m145892a(effect.getUnzipPath())) {
                    Typeface d2 = m88766d(effect.getUnzipPath() + File.separator + cVar.f107121e);
                    if (d2 != null) {
                        cVar.f107123g = effect.getUnzipPath() + File.separator + cVar.f107121e;
                        cVar.f107124h = 1;
                        this.f107108c.put(cVar.f107121e, d2);
                        m88765a(cVar, true, null);
                        return cVar;
                    }
                    File[] listFiles = new File(effect.getUnzipPath()).listFiles();
                    for (File file : listFiles) {
                        if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (d = m88766d(file.getAbsolutePath())) != null) {
                            cVar.f107123g = file.getAbsolutePath();
                            cVar.f107124h = 1;
                            this.f107108c.put(cVar.f107121e, d);
                            m88765a(cVar, true, null);
                            return cVar;
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (C45866d.m88491d() != null) {
                C45866d.m88491d().mo77253b("parseTextFontStyleData err: " + e.getMessage());
            }
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo77591a(String str, int i) {
        if (m88768e(i)) {
            this.f107110f = str;
        } else {
            this.f107109d = str;
        }
    }

    /* renamed from: a */
    public static void m88765a(C45995c cVar, boolean z, Exception exc) {
        if (cVar != null && C45890g.f106879b != null) {
            C45890g.f106879b.mo77231a(cVar, z, exc);
        }
    }
}
