package com.p2082ss.android.ugc.aweme.hybridkit.task;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.bridge.magpie.p879a.C13415c;
import com.bytedance.bridge.magpie.p879a.p882c.C13422d;
import com.bytedance.bridge.magpie.p886e.C13453e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.AbstractC15528b;
import com.bytedance.hybrid.spark.C15534d;
import com.bytedance.hybrid.spark.p1107a.AbstractC15512h;
import com.bytedance.hybrid.spark.p1107a.AbstractC15513i;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.xelement.AbstractC19055d;
import com.bytedance.ies.xelement.C19294m;
import com.bytedance.ies.xelement.C19296n;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.C21145a;
import com.bytedance.lynx.hybrid.C21163c;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.C21176e;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21150d;
import com.bytedance.lynx.hybrid.p1515a.C21147a;
import com.bytedance.lynx.hybrid.p1515a.C21158l;
import com.bytedance.lynx.hybrid.p1515a.C21159m;
import com.bytedance.lynx.hybrid.p1518d.AbstractC21173a;
import com.bytedance.lynx.hybrid.p1519e.C21182b;
import com.bytedance.lynx.hybrid.p1519e.C21187d;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.p1531g.p1533b.C21319b;
import com.bytedance.lynx.hybrid.service.AbstractC21365f;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumCanvas;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.components.video.playbox.LynxDeclarativeVideoPlayBox;
import com.p2082ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.p2082ss.android.ugc.aweme.hybridkit.bridge.C53406a;
import com.p2082ss.android.ugc.aweme.hybridkit.bridge.C53410b;
import com.p2082ss.android.ugc.aweme.hybridkit.p3058a.C53396a;
import com.p2082ss.android.ugc.aweme.hybridkit.p3059b.C53398a;
import com.p2082ss.android.ugc.aweme.hybridkit.p3059b.C53400b;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2685cp.p2686a.C40240a;
import com.p2082ss.android.ugc.aweme.p2685cp.p2687b.C40253c;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.aweme.web.C81632l;
import com.p2082ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask */
public final class HybridKitConfigTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C53419a f122629a = new C53419a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$d */
    static final class C53422d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ HybridKitConfigTask f122636a;

        /* renamed from: b */
        final /* synthetic */ Context f122637b;

        static {
            Covode.recordClassIndex(62990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53422d(HybridKitConfigTask hybridKitConfigTask, Context context) {
            super(0);
            this.f122636a = hybridKitConfigTask;
            this.f122637b = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$d$b */
        public static final class C53424b implements AbstractC21150d {
            static {
                Covode.recordClassIndex(62992);
            }

            C53424b() {
            }

            @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21150d
            /* renamed from: a */
            public final AbstractC21365f mo34720a() {
                C21145a aVar = new C21145a();
                C53410b bVar = new C53410b();
                C89219l.m154719c(bVar, "");
                aVar.f50171a = bVar;
                return aVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            Context context = this.f122637b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) context;
            Keva.getRepo("__hybrid_local_test__").getBoolean("lynxDebugEnable", true);
            C21182b.C21183a aVar = new C21182b.C21183a(application);
            C21187d.f50266b = false;
            C21187d.f50267c = false;
            aVar.f50252a = false;
            C53423a aVar2 = new C53423a(this);
            C89219l.m154719c(aVar2, "");
            aVar.f50253b.add(aVar2);
            C40240a aVar3 = new C40240a();
            C89219l.m154719c(aVar3, "");
            aVar.f50258g = aVar3;
            aVar.mo34742a(C89070n.m154516a(new C53425c("canvas")));
            aVar.mo34742a(C40253c.m81398a(true));
            C21182b bVar = new C21182b(aVar.f50260i, aVar.f50252a, aVar.f50253b, aVar.f50254c, aVar.f50255d, aVar.f50256e, aVar.f50257f, aVar.f50258g, aVar.f50259h, (byte) 0);
            C89219l.m154716b(C81631k.f182525a, "");
            C89219l.m154716b("gecko-sg.tiktokv.com", "");
            List c = C89070n.m154524c("ecom_prefix");
            for (Pattern pattern : C81632l.m141482b()) {
                if (pattern != null) {
                    String pattern2 = pattern.toString();
                    C89219l.m154716b(pattern2, "");
                    if (pattern2.length() > 0) {
                        String pattern3 = pattern.toString();
                        C89219l.m154716b(pattern3, "");
                        c.add(pattern3);
                    }
                }
            }
            C81631k kVar = C81631k.f182525a;
            C89219l.m154716b(kVar, "");
            String c2 = kVar.mo125297c();
            C89219l.m154716b(c2, "");
            GeckoConfig geckoConfig = new GeckoConfig(c2, "offlineX", false, false, 12, null);
            geckoConfig.setGeckoDepender(new C21319b());
            C21277c cVar = new C21277c("gecko-sg.tiktokv.com", c, geckoConfig, null, new GeckoXNetImpl(C17867d.m33078a()), 8);
            C53424b bVar2 = new C53424b();
            C21159m mVar = new C21159m("https://mon-va.byteoversea.com");
            String a = C58071d.m104907a();
            String valueOf = String.valueOf(C17867d.f42590n);
            String serverDeviceId = AppLog.getServerDeviceId();
            String f = C17867d.m33085f();
            C89219l.m154716b(a, "");
            if (serverDeviceId == null) {
                str = "";
            } else {
                str = serverDeviceId;
            }
            C53421c cVar2 = new C53421c(a, valueOf, f, serverDeviceId, a, valueOf, f, str);
            cVar2.put("os", (Object) "android");
            String str2 = Build.VERSION.RELEASE;
            C89219l.m154716b(str2, "");
            cVar2.put("osVersion", (Object) str2);
            cVar2.put("channel", (Object) C17867d.f42595s);
            cVar2.put("region", (Object) a);
            cVar2.put("appName", (Object) C17867d.m33081b());
            cVar2.put("appVersion", (Object) f);
            cVar2.put("updateVersionCode", (Object) String.valueOf(C17867d.m33083d()));
            String locale = C80398en.m139370a().toString();
            C89219l.m154716b(locale, "");
            cVar2.put("language", (Object) locale);
            cVar2.put("appLanguage", (Object) SettingServiceImpl.m120782v().mo108872h());
            String b = C53438a.m98623b();
            C89219l.m154716b(b, "");
            cVar2.put("appLocale", (Object) b);
            cVar2.put("aid", (Object) valueOf);
            C89219l.m154716b(serverDeviceId, "");
            cVar2.put("deviceId", (Object) serverDeviceId);
            C21163c.C21164a aVar4 = new C21163c.C21164a(cVar2);
            aVar4.f50200a = bVar;
            aVar4.f50201b = cVar;
            aVar4.f50203d = bVar2;
            aVar4.f50204e = mVar;
            aVar4.f50205f = new C21158l(new C53396a());
            C21163c cVar3 = new C21163c(aVar4.f50206g, aVar4.f50204e, aVar4.f50200a, aVar4.f50201b, aVar4.f50202c, aVar4.f50203d, aVar4.f50205f, (byte) 0);
            C89219l.m154719c(cVar3, "");
            C89219l.m154719c(application, "");
            C21176e.f50231b = cVar3;
            C21170d a2 = C21170d.C21171a.m39868a();
            a2.f50223d = cVar3.f50193a;
            C89219l.m154719c(application, "");
            a2.f50221b = application;
            a2.f50220a = cVar3.f50193a.isDebug();
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$d$c */
        public static final class C53425c extends C28463a {
            static {
                Covode.recordClassIndex(62993);
            }

            C53425c(String str) {
                super(str);
            }

            @Override // com.lynx.tasm.behavior.C28463a
            /* renamed from: a */
            public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                return new LynxHeliumCanvas(jVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$d$a */
        public static final class C53423a implements AbstractC21173a {

            /* renamed from: a */
            final /* synthetic */ C53422d f122638a;

            /* renamed from: b */
            final /* synthetic */ boolean f122639b = false;

            static {
                Covode.recordClassIndex(62991);
            }

            C53423a(C53422d dVar) {
                this.f122638a = dVar;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$a */
    public static final class C53419a {
        static {
            Covode.recordClassIndex(62987);
        }

        private C53419a() {
        }

        public /* synthetic */ C53419a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$e */
    public static final class C53426e implements AbstractC15528b {
        static {
            Covode.recordClassIndex(62994);
        }

        C53426e() {
        }

        @Override // com.bytedance.hybrid.spark.AbstractC15528b
        /* renamed from: a */
        public final AbstractC15513i mo25313a() {
            return new C53400b();
        }

        @Override // com.bytedance.hybrid.spark.AbstractC15528b
        /* renamed from: b */
        public final AbstractC15512h mo25314b() {
            return new C53398a();
        }

        @Override // com.bytedance.hybrid.spark.AbstractC15528b
        /* renamed from: c */
        public final C15534d.C15536b mo25315c() {
            return new C15534d.C15536b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(62986);
        C19296n.C19297a.m36033a().mo30715a(new C19294m.C19295a().mo30713a(C53420b.f122630a).mo30714a());
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$b */
    static final class C53420b extends AbstractC89220m implements AbstractC89172b<Context, AbstractC19055d> {

        /* renamed from: a */
        public static final C53420b f122630a = new C53420b();

        static {
            Covode.recordClassIndex(62988);
        }

        C53420b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC19055d invoke(Context context) {
            Context context2 = context;
            C89219l.m154721d(context2, "");
            return new LynxDeclarativeVideoPlayBox(context2, (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask$c */
    public static final class C53421c extends C21147a {

        /* renamed from: a */
        final /* synthetic */ String f122631a;

        /* renamed from: b */
        final /* synthetic */ String f122632b;

        /* renamed from: c */
        final /* synthetic */ String f122633c;

        /* renamed from: d */
        final /* synthetic */ String f122634d;

        /* renamed from: e */
        final /* synthetic */ boolean f122635e = false;

        static {
            Covode.recordClassIndex(62989);
        }

        @Override // com.bytedance.lynx.hybrid.p1522h.C21198c
        public final Object getABParamsValue(String str) {
            Map<String, Object> map;
            C89219l.m154721d(str, "");
            JSONObject b = SettingsRequestServiceImpl.m65417i().mo57284b(str);
            return (b == null || (map = JsonExtKt.toMap(b)) == null) ? str : map;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53421c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(str5, str6, str7, str8, false);
            this.f122631a = str;
            this.f122632b = str2;
            this.f122633c = str3;
            this.f122634d = str4;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        C53422d dVar = new C53422d(this, context);
        C89219l.m154719c(dVar, "");
        C21176e.f50234e = dVar;
        C53426e eVar = new C53426e();
        C89219l.m154719c(eVar, "");
        C15534d.f37882a = eVar;
        if (context != null) {
            C89219l.m154721d(context, "");
            LinkedHashSet<String> linkedHashSet = C13415c.f32715b;
            linkedHashSet.add("openConfig");
            linkedHashSet.add("config");
            linkedHashSet.add("appInfo");
            linkedHashSet.add("close");
            linkedHashSet.add("gallery");
            linkedHashSet.add("toggleGalleryBars");
            linkedHashSet.add("slideShow");
            linkedHashSet.add("relatedShow");
            linkedHashSet.add("toast");
            linkedHashSet.add("slideDownload");
            linkedHashSet.add("requestChangeOrientation");
            linkedHashSet.add("adInfo");
            C53406a.C53408b bVar = new C53406a.C53408b(context);
            C89219l.m154719c(bVar, "");
            C13453e.m24179c("MagpiePermission", "start init");
            C13422d.C13423a.m24137a(false, bVar).mo21645b();
            bVar.mo21634a(new C13415c.C13416a.RunnableC13417a(C13422d.C13423a.m24137a(true, bVar)));
        }
        ALog.m59869i(C21176e.f50230a, "HybridKit Config Finish by LegoTask, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
