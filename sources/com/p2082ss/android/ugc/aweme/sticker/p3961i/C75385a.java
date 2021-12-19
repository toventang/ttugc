package com.p2082ss.android.ugc.aweme.sticker.p3961i;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65400cm;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.a */
public class C75385a {

    /* renamed from: a */
    public static final String[] f169431a = {"default", "Proxima-Nova-Semibold.otf"};

    /* renamed from: f */
    private static C75385a f169432f;

    /* renamed from: b */
    public Map<String, C45995c> f169433b = new ConcurrentHashMap();

    /* renamed from: c */
    public Map<String, Typeface> f169434c = new ConcurrentHashMap();

    /* renamed from: d */
    public String f169435d = "default";

    /* renamed from: e */
    AbstractC46415f f169436e;

    /* renamed from: g */
    private String f169437g = "default";

    static {
        Covode.recordClassIndex(88304);
    }

    private C75385a() {
    }

    /* renamed from: a */
    public static C75385a m132218a() {
        MethodCollector.m26663i(5985);
        if (f169432f == null) {
            synchronized (C75385a.class) {
                try {
                    if (f169432f == null) {
                        f169432f = new C75385a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5985);
                    throw th;
                }
            }
        }
        C75385a aVar = f169432f;
        MethodCollector.m26664o(5985);
        return aVar;
    }

    /* renamed from: a */
    public static Typeface m132217a(String str) {
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
    private static void m132219a(C45995c cVar) {
        if (cVar != null) {
            C40982q.m82520a("font_resource_download_error_state", 0, new C69840ar().mo110189a("font_title", cVar.f107118b).mo110189a("font_name", cVar.f107121e).mo110191a());
        }
    }

    /* renamed from: a */
    public final C45995c mo118942a(Effect effect) {
        Typeface a;
        try {
            C45995c cVar = (C45995c) C63244g.m114602a().mo73261G().mo46670a(effect.getExtra(), C45995c.class);
            if (TextUtils.isEmpty(cVar.f107121e)) {
                return null;
            }
            C45995c cVar2 = this.f169433b.get(cVar.f107121e);
            if (cVar2 == null) {
                this.f169433b.put(cVar.f107121e, cVar);
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
            if (this.f169434c.get(cVar.f107121e) != null || TextUtils.isEmpty(effect.getUnzipPath()) || !C84902i.m145892a(effect.getUnzipPath())) {
                return null;
            }
            Typeface a2 = m132217a(effect.getUnzipPath() + File.separator + cVar.f107121e);
            if (a2 != null) {
                cVar.f107123g = effect.getUnzipPath() + File.separator + cVar.f107121e;
                cVar.f107124h = 1;
                this.f169434c.put(cVar.f107121e, a2);
                m132219a(cVar);
                return cVar;
            }
            File[] listFiles = new File(effect.getUnzipPath()).listFiles();
            for (File file : listFiles) {
                if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (a = m132217a(file.getAbsolutePath())) != null) {
                    cVar.f107123g = file.getAbsolutePath();
                    cVar.f107124h = 1;
                    this.f169434c.put(cVar.f107121e, a);
                    m132219a(cVar);
                    return cVar;
                }
            }
            return null;
        } catch (Exception e) {
            C73991bj.m130131b("parseTextFontStyleData err: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo118943a(Context context) {
        if (context != null) {
            if (this.f169436e == null) {
                this.f169436e = AVServiceImpl.m113116a().effectService().createFontEffectPlatform(C63247i.f143610a);
            }
            this.f169436e.mo78907a("textfont", false, (IFetchEffectChannelListener) new IFetchEffectChannelListener() {
                /* class com.p2082ss.android.ugc.aweme.sticker.p3961i.C75385a.C753861 */

                static {
                    Covode.recordClassIndex(88305);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C73991bj.m130131b("prefetch fail err: " + exceptionResult.getMsg());
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                    for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                        if (C65400cm.m117100a()) {
                            C1731i.m5640b(new CallableC75389c(this, effect), C1731i.f5562a);
                        } else {
                            C75385a.this.mo118942a(effect);
                        }
                    }
                    C75385a aVar = C75385a.this;
                    for (String str : aVar.f169433b.keySet()) {
                        if (aVar.f169434c.get(str) == null) {
                            C73991bj.m130133d("text font " + str + " is null");
                            aVar.f169436e.mo78907a("textfont", true, (IFetchEffectChannelListener) new IFetchEffectChannelListener() {
                                /* class com.p2082ss.android.ugc.aweme.sticker.p3961i.C75385a.C753872 */

                                static {
                                    Covode.recordClassIndex(88306);
                                }

                                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                                public final void onFail(ExceptionResult exceptionResult) {
                                    C73991bj.m130131b("textFontDownload err: " + exceptionResult.getMsg());
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                                    for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                                        if (C65400cm.m117100a()) {
                                            C1731i.m5640b(new CallableC75390d(this, effect), C1731i.f5562a);
                                        } else {
                                            C75385a.this.mo118942a(effect);
                                        }
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
}
