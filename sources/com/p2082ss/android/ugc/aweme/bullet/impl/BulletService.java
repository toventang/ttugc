package com.p2082ss.android.ugc.aweme.bullet.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.kit.p1156rn.IRnKitApi;
import com.bytedance.ies.bullet.kit.web.IWebKitApi;
import com.bytedance.ies.bullet.p1125a.AbstractC16114a;
import com.bytedance.ies.bullet.p1125a.AbstractC16133g;
import com.bytedance.ies.bullet.p1125a.AbstractC16134h;
import com.bytedance.ies.bullet.p1125a.C16117b;
import com.bytedance.ies.bullet.p1128b.C16137a;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.C16139a;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1130a.C16149b;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1140d.C16259a;
import com.bytedance.ies.bullet.p1140d.C16261b;
import com.bytedance.ies.bullet.p1141e.C16269b;
import com.bytedance.ies.bullet.p1141e.C16288d;
import com.bytedance.ies.bullet.p1145f.C16289a;
import com.bytedance.ies.bullet.p1146g.p1147a.C16293b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c;
import com.bytedance.ies.bullet.service.base.AbstractC16589aa;
import com.bytedance.ies.bullet.service.base.AbstractC16593ad;
import com.bytedance.ies.bullet.service.base.AbstractC16599ai;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.AbstractC16653n;
import com.bytedance.ies.bullet.service.base.AbstractC16655p;
import com.bytedance.ies.bullet.service.base.AbstractC16668s;
import com.bytedance.ies.bullet.service.base.AbstractC16671v;
import com.bytedance.ies.bullet.service.base.AbstractC16699y;
import com.bytedance.ies.bullet.service.base.AbstractC16700z;
import com.bytedance.ies.bullet.service.base.C16602ak;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16569d;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16570e;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16580l;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1164b.C16624f;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16627a;
import com.bytedance.ies.bullet.service.base.p1166d.p1167a.C16631a;
import com.bytedance.ies.bullet.service.base.p1166d.p1167a.C16632b;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.web.AbstractC16676d;
import com.bytedance.ies.bullet.service.base.web.AbstractC16678e;
import com.bytedance.ies.bullet.service.base.web.AbstractC16679f;
import com.bytedance.ies.bullet.service.base.web.AbstractC16683j;
import com.bytedance.ies.bullet.service.p1169c.C16701a;
import com.bytedance.ies.bullet.service.p1170d.C16708b;
import com.bytedance.ies.bullet.service.p1172f.C16861f;
import com.bytedance.ies.bullet.service.p1178g.p1179a.C16867a;
import com.bytedance.ies.bullet.service.p1178g.p1180b.C16868a;
import com.bytedance.ies.bullet.service.p1178g.p1181c.C16874b;
import com.bytedance.ies.bullet.service.popup.C16942e;
import com.bytedance.ies.bullet.service.popup.C16978i;
import com.bytedance.ies.bullet.service.webkit.C16983b;
import com.bytedance.ies.p1191d.p1192a.AbstractC17075a;
import com.bytedance.ies.p1191d.p1192a.C17111d;
import com.bytedance.ies.p1191d.p1192a.p1193a.C17076a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.p1436j.p1437a.p1439b.AbstractC20069a;
import com.bytedance.p1436j.p1437a.p1440c.AbstractC20073a;
import com.bytedance.p1436j.p1437a.p1440c.C20074b;
import com.bytedance.p1436j.p1437a.p1440c.C20083e;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1722h.C23155d;
import com.lynx.tasm.AbstractC28773f;
import com.lynx.tasm.C28438b;
import com.lynx.tasm.C28785i;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium;
import com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumCanvas;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.p2082ss.android.ugc.aweme.bullet.BulletEventObserver;
import com.p2082ss.android.ugc.aweme.bullet.C35128c;
import com.p2082ss.android.ugc.aweme.bullet.C35132d;
import com.p2082ss.android.ugc.aweme.bullet.C35147f;
import com.p2082ss.android.ugc.aweme.bullet.api.AbstractC34962a;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.p2416d.C35133a;
import com.p2082ss.android.ugc.aweme.bullet.p2418f.C35151c;
import com.p2082ss.android.ugc.aweme.bullet.p2418f.C35153d;
import com.p2082ss.android.ugc.aweme.bullet.p2418f.C35158e;
import com.p2082ss.android.ugc.aweme.bullet.views.AbstractC35316c;
import com.p2082ss.android.ugc.aweme.bullet.views.C35315b;
import com.p2082ss.android.ugc.aweme.bullet.views.DialogC35310a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2713f.C40656a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4162c.C79366a;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.aweme.web.C81632l;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService */
public final class BulletService implements IBulletService {

    /* renamed from: a */
    public static final List<String> f82960a = C89070n.m154522b("ProximaNova-Bold", "'ProximaNova-Bold'", "\"ProximaNova-Bold\"");

    /* renamed from: b */
    public static final List<String> f82961b = C89070n.m154522b("ProximaNova-Semibold", "'ProximaNova-Semibold'", "\"ProximaNova-Semibold\"", "ProximaNova-SemiBold", "'ProximaNova-SemiBold'", "\"ProximaNova-SemiBold\"");

    /* renamed from: c */
    public static final List<String> f82962c = C89070n.m154522b("ProximaNova-Regular", "'ProximaNova-Regular'", "\"ProximaNova-Regular\"");

    /* renamed from: d */
    public static final C35162a f82963d = new C35162a((byte) 0);

    /* renamed from: e */
    private volatile boolean f82964e;

    /* renamed from: f */
    private final AbstractC89244h f82965f = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C35165d(this));

    /* renamed from: g */
    private final AbstractC89244h f82966g = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C35164c(this));

    /* renamed from: g */
    private final C16117b m71939g() {
        return (C16117b) this.f82966g.getValue();
    }

    /* renamed from: d */
    public final AbstractC16114a mo61997d() {
        return (AbstractC16114a) this.f82965f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$a */
    public static final class C35162a {
        static {
            Covode.recordClassIndex(42318);
        }

        private C35162a() {
        }

        public /* synthetic */ C35162a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$i */
    public static final class C35178i extends AbstractC16570e.C16571a {

        /* renamed from: a */
        public BulletEventObserver f83001a;

        static {
            Covode.recordClassIndex(42334);
        }

        C35178i() {
        }

        @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16570e, com.bytedance.ies.bullet.service.base.p1163a.AbstractC16570e.C16571a
        /* renamed from: a */
        public final void mo26330a(AbstractC16569d dVar) {
            C89219l.m154721d(dVar, "");
            if (dVar instanceof C16942e) {
                this.f83001a = new BulletEventObserver(((C16942e) dVar).f40340a, null);
                EventBus.m156966a(EventBus.m156962a(), this.f83001a);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16570e, com.bytedance.ies.bullet.service.base.p1163a.AbstractC16570e.C16571a
        /* renamed from: b */
        public final void mo26332b(AbstractC16569d dVar) {
            C89219l.m154721d(dVar, "");
            if ((dVar instanceof C16942e) && this.f83001a != null) {
                EventBus.m156962a().mo145395b(this.f83001a);
                this.f83001a = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$e */
    static final class C35174e implements C28785i.AbstractC28786a {

        /* renamed from: a */
        final /* synthetic */ BulletService f82985a;

        static {
            Covode.recordClassIndex(42330);
        }

        C35174e(BulletService bulletService) {
            this.f82985a = bulletService;
        }

        @Override // com.lynx.tasm.C28785i.AbstractC28786a
        /* renamed from: a */
        public final void mo49901a() {
            this.f82985a.mo61855a(ILynxKitApi.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final AbstractC16239d.AbstractC16241b mo61850a() {
        return m71939g();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: b */
    public final AbstractC16114a mo61856b() {
        return mo61997d();
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$c */
    static final class C35164c extends AbstractC89220m implements AbstractC89171a<C16117b> {

        /* renamed from: a */
        final /* synthetic */ BulletService f82968a;

        static {
            Covode.recordClassIndex(42320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35164c(BulletService bulletService) {
            super(0);
            this.f82968a = bulletService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16117b invoke() {
            return this.f82968a.mo61997d().mo25651a("default_bid");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d */
    static final class C35165d extends AbstractC89220m implements AbstractC89171a<AbstractC16114a> {

        /* renamed from: a */
        final /* synthetic */ BulletService f82969a;

        static {
            Covode.recordClassIndex(42321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35165d(BulletService bulletService) {
            super(0);
            this.f82969a = bulletService;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16114a invoke() {
            Context a = C17867d.m33078a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.Application");
            this.f82969a.mo61998e();
            Keva.getRepo("__hybrid_local_test__").getBoolean("lynxDebugEnable", true);
            C351661 r0 = new AbstractC16134h.AbstractC16135a(this, (Application) a) {
                /* class com.p2082ss.android.ugc.aweme.bullet.impl.BulletService.C35165d.C351661 */

                /* renamed from: a */
                final /* synthetic */ C35165d f82970a;

                /* renamed from: b */
                final /* synthetic */ Application f82971b;

                /* renamed from: c */
                final /* synthetic */ boolean f82972c = false;

                /* renamed from: d */
                private C16148a f82973d;

                /* renamed from: e */
                private C16861f f82974e;

                /* renamed from: f */
                private C16666i f82975f;

                /* renamed from: g */
                private AbstractC16627a f82976g;

                /* renamed from: h */
                private AbstractC16589aa f82977h;

                /* renamed from: i */
                private C16602ak f82978i;

                /* renamed from: j */
                private AbstractC16655p f82979j;

                /* renamed from: k */
                private AbstractC16671v f82980k;

                static {
                    Covode.recordClassIndex(42322);
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$b */
                public static final class C35168b extends AbstractC20073a {
                    static {
                        Covode.recordClassIndex(42324);
                    }

                    C35168b() {
                    }

                    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$b$a */
                    static final class C35169a implements LynxHelium.ErrorHandler {

                        /* renamed from: a */
                        public static final C35169a f82982a = new C35169a();

                        static {
                            Covode.recordClassIndex(42325);
                        }

                        C35169a() {
                        }

                        @Override // com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.ErrorHandler
                        public final void onReceivedError(C28816j jVar) {
                            ALog.m59866e("LynxCanvas", jVar.toString());
                        }
                    }

                    @Override // com.bytedance.p1436j.p1437a.p1440c.AbstractC20073a
                    /* renamed from: a */
                    public final void mo33428a(Application application, AbstractC28773f fVar) {
                        C89219l.m154721d(application, "");
                        LynxHelium.getInstance().setSmashUrlFallback("https://sf16-muse-va.ibytedtos.com/obj/developer-alisg/misc/", true);
                        LynxHelium.getInstance().init(application, fVar, C35169a.f82982a, null);
                        LynxEnv b = LynxEnv.m56706b();
                        C89219l.m154716b(b, "");
                        b.f66650q = LynxHelium.getInstance();
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$d */
                public static final class C35171d implements AbstractC16589aa {
                    static {
                        Covode.recordClassIndex(42327);
                    }

                    C35171d() {
                    }

                    @Override // com.bytedance.ies.bullet.service.base.AbstractC16589aa
                    /* renamed from: a */
                    public final void mo26351a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                        C12290b.m22061a(str, i, jSONObject, jSONObject2);
                    }
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16134h
                /* renamed from: a */
                public final C16148a mo25672a() {
                    return this.f82973d;
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16134h
                /* renamed from: b */
                public final C16861f mo25673b() {
                    return this.f82974e;
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16134h
                /* renamed from: c */
                public final C16666i mo25674c() {
                    return this.f82975f;
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16134h
                /* renamed from: d */
                public final AbstractC16589aa mo25675d() {
                    return this.f82977h;
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16134h
                /* renamed from: e */
                public final C16602ak mo25676e() {
                    return this.f82978i;
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16134h
                /* renamed from: f */
                public final AbstractC16627a mo25677f() {
                    return this.f82976g;
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16134h
                /* renamed from: g */
                public final AbstractC16655p mo25678g() {
                    return this.f82979j;
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16134h, com.bytedance.ies.bullet.p1125a.AbstractC16134h.AbstractC16135a
                /* renamed from: h */
                public final AbstractC16671v mo25679h() {
                    return this.f82980k;
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$c */
                public static final class C35170c extends C28463a {
                    static {
                        Covode.recordClassIndex(42326);
                    }

                    C35170c(String str) {
                        super(str);
                    }

                    @Override // com.lynx.tasm.behavior.C28463a
                    /* renamed from: a */
                    public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                        return new LynxHeliumCanvas(jVar);
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$a */
                public static final class C35167a implements AbstractC20069a {

                    /* renamed from: a */
                    final /* synthetic */ C351661 f82981a;

                    static {
                        Covode.recordClassIndex(42323);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    C35167a(C351661 r1) {
                        this.f82981a = r1;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$d$1$e */
                static final class C35172e extends AbstractC89220m implements AbstractC89172b<Context, AbstractC16650k> {

                    /* renamed from: a */
                    public static final C35172e f82983a = new C35172e();

                    static {
                        Covode.recordClassIndex(42328);
                    }

                    C35172e() {
                        super(1);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ AbstractC16650k invoke(Context context) {
                        Context context2 = context;
                        C89219l.m154721d(context2, "");
                        return new C35315b(context2, (byte) 0);
                    }
                }

                {
                    this.f82970a = r25;
                    this.f82971b = r26;
                    C16148a aVar = new C16148a(r26);
                    C16149b bVar = new C16149b();
                    bVar.f38894a = false;
                    bVar.f38895b = C58939a.C58940a.f134171a.f134170a.shouldBulletShowDebugTagView();
                    aVar.mo25697a(bVar);
                    this.f82973d = aVar;
                    C16861f.C16862a aVar2 = new C16861f.C16862a();
                    C89219l.m154719c("aweme", "");
                    aVar2.f40078a = "aweme";
                    this.f82974e = aVar2.mo26660a();
                    C89219l.m154716b(C81631k.f182525a, "");
                    C89219l.m154716b("gecko-sg.tiktokv.com", "");
                    String a = C58071d.m104907a();
                    C89219l.m154716b(a, "");
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
                    String valueOf = String.valueOf(C17867d.f42590n);
                    String f = C17867d.m33085f();
                    String serverDeviceId = AppLog.getServerDeviceId();
                    serverDeviceId = serverDeviceId == null ? "" : serverDeviceId;
                    C16289a aVar3 = new C16289a();
                    GeckoXNetImpl geckoXNetImpl = new GeckoXNetImpl(C17867d.m33078a());
                    C81631k kVar = C81631k.f182525a;
                    C89219l.m154716b(kVar, "");
                    String c2 = kVar.mo125297c();
                    C89219l.m154716b(c2, "");
                    this.f82975f = new C16666i("gecko-sg.tiktokv.com", a, c, valueOf, f, serverDeviceId, new GeckoConfig(c2, "offlineX", new C16293b(), false, false, 24, null), null, aVar3, geckoXNetImpl, 128);
                    C20074b.C20075a aVar4 = new C20074b.C20075a(r26);
                    aVar4.f47784a = false;
                    C35167a aVar5 = new C35167a(this);
                    C89219l.m154719c(aVar5, "");
                    aVar4.f47785b.add(aVar5);
                    C20083e.f47807b = false;
                    C35168b bVar2 = new C35168b();
                    C89219l.m154719c(bVar2, "");
                    aVar4.f47790g = bVar2;
                    List a2 = C89070n.m154516a(new C35170c("canvas"));
                    C89219l.m154719c(a2, "");
                    aVar4.f47788e.addAll(a2);
                    this.f82976g = aVar4.mo33429a();
                    this.f82977h = new C35171d();
                    C16602ak.C16603a aVar6 = new C16602ak.C16603a();
                    C89219l.m154719c("bullet", "");
                    aVar6.f39731d = "bullet";
                    this.f82978i = aVar6.mo26368a();
                    C16701a.C16702a aVar7 = new C16701a.C16702a();
                    C89219l.m154719c(BulletContainerActivity.class, "");
                    aVar7.f39874a = BulletContainerActivity.class;
                    this.f82979j = new C16701a(aVar7, (byte) 0);
                    C16978i.C16979a aVar8 = new C16978i.C16979a();
                    C35172e eVar = C35172e.f82983a;
                    C89219l.m154719c(eVar, "");
                    aVar8.f40432a = eVar;
                    this.f82980k = new C16978i(aVar8, (byte) 0);
                }
            };
            C89219l.m154719c(r0, "");
            C16137a aVar = new C16137a(r0);
            C351732 r02 = new AbstractC16133g(this) {
                /* class com.p2082ss.android.ugc.aweme.bullet.impl.BulletService.C35165d.C351732 */

                /* renamed from: a */
                final /* synthetic */ C35165d f82984a;

                static {
                    Covode.recordClassIndex(42329);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f82984a = r1;
                }

                @Override // com.bytedance.ies.bullet.p1125a.AbstractC16133g
                /* renamed from: a */
                public final void mo25671a(C16117b.C16118a aVar, C16148a aVar2) {
                    C89219l.m154721d(aVar, "");
                    C89219l.m154721d(aVar2, "");
                    aVar.mo25657a(IRnKitApi.class, true);
                    aVar.mo25661a(IWebKitApi.class);
                    aVar.mo25658a(new C35128c());
                    C35132d dVar = new C35132d();
                    C89219l.m154719c(dVar, "");
                    aVar.f38816c.put("defaultPackageBundle", dVar);
                    aVar.mo25659a("ad_commerce", new C35133a());
                    C35147f fVar = C35147f.f82938a;
                    C89219l.m154719c(fVar, "");
                    C16139a.C16140a aVar3 = aVar.f38815b;
                    C89219l.m154719c(fVar, "");
                    aVar3.f38845d = fVar;
                    LynxEnv b = LynxEnv.m56706b();
                    C89219l.m154716b(b, "");
                    b.mo48567b(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).lynxDevToolDebugEnable());
                    AbstractC16580l a = C16622e.C16623a.m30858a();
                    String str = aVar2.f38891a;
                    C16624f.C16625a a2 = new C16624f.C16625a().mo26383a(AbstractC16676d.class, new C16983b()).mo26383a(AbstractC16683j.class, new C16867a()).mo26383a(AbstractC16678e.class, new C16868a());
                    C16259a.C16260a aVar4 = new C16259a.C16260a();
                    aVar4.f39062a = false;
                    a.mo26349a(str, a2.mo26383a(AbstractC16652m.class, new C16261b(new C16259a(aVar4))).mo26383a(AbstractC16668s.class, new C16288d(new C16269b(new C16269b.C16270a(), (byte) 0))).mo26385a());
                }
            };
            C89219l.m154719c(r02, "");
            aVar.f38808a = r02;
            return aVar;
        }
    }

    /* renamed from: f */
    public static IBulletService m71938f() {
        MethodCollector.m26663i(1511);
        Object a = C81908b.m141854a(IBulletService.class, false);
        if (a != null) {
            IBulletService iBulletService = (IBulletService) a;
            MethodCollector.m26664o(1511);
            return iBulletService;
        }
        if (C81908b.f183139V == null) {
            synchronized (IBulletService.class) {
                try {
                    if (C81908b.f183139V == null) {
                        C81908b.f183139V = new BulletService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1511);
                    throw th;
                }
            }
        }
        BulletService bulletService = (BulletService) C81908b.f183139V;
        MethodCollector.m26664o(1511);
        return bulletService;
    }

    /* renamed from: e */
    public final void mo61998e() {
        MethodCollector.m26663i(1383);
        synchronized (BulletService.class) {
            try {
                if (!this.f82964e) {
                    C28573r.m57143a(new C35163b(C79366a.m138155b()));
                    this.f82964e = true;
                }
            } finally {
                MethodCollector.m26664o(1383);
            }
        }
    }

    static {
        Covode.recordClassIndex(42317);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: c */
    public final void mo61860c() {
        m71939g();
        LynxEnv b = LynxEnv.m56706b();
        C89219l.m154716b(b, "");
        b.f66652s = false;
        C28438b.m56840a();
        mo61998e();
        if (C16048b.m29633a().mo25421a(true, "bullet_service_preload", true)) {
            LynxEnv.m56706b().mo48562a();
        }
        List a = C89070n.m154516a(new C35151c(C89070n.m154522b("gecko_hybrid_prefetch_config", "fe_tiktok_ecommerce_affiliate_prefetch", "resso-tt-lynx_full_song")));
        C89219l.m154721d(a, "");
        C17076a.C17078b a2 = C17076a.C17077a.m31550a();
        a2.f40642i = 32;
        AbstractC17075a a3 = a2.mo26977a(new C17111d(C17867d.m33078a(), "bullet_prefetch_store")).mo26976a(new C35158e.C35159a(a)).mo26980a(new C35158e.C35160b()).mo26978a(new C35158e.C35161c()).mo26979a(new C35153d());
        ExecutorService executorService = C1731i.f5562a;
        C89219l.m154716b(executorService, "");
        C16622e.C16623a.m30858a().mo26348a(AbstractC16699y.class, new C16708b(a3.mo26981a(executorService).mo26982a(), "__prefetch"));
        C16622e.C16623a.m30858a().mo26348a(AbstractC16679f.class, new C16874b());
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final View mo61849a(Context context) {
        C89219l.m154721d(context, "");
        return new C35315b(context, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: b */
    public final String mo61857b(String str) {
        C89219l.m154721d(str, "");
        String a = C40656a.m82027a(str);
        return a == null ? str : a;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: b */
    public final void mo61858b(Context context) {
        C89219l.m154721d(context, "");
        C28785i.f67896a = new C35174e(this);
    }

    /* renamed from: c */
    private static String m71937c(Context context) {
        Object obj;
        String str;
        String str2 = null;
        try {
            Integer a = C23155d.m43641a(context, R.attr.m);
            if (a != null) {
                str = Integer.toHexString(a.intValue());
            } else {
                str = null;
            }
            obj = C89379q.m157068constructorimpl(str);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (!C89379q.m157073isFailureimpl(obj)) {
            str2 = obj;
        }
        return str2;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final Activity mo61848a(String str) {
        AbstractC17045g z;
        C89219l.m154721d(str, "");
        AbstractC16208i a = m71939g().f38812a.mo25683a(str);
        if (a != null) {
            if (!(a instanceof AbstractC17026c)) {
                a = null;
            }
            AbstractC17026c cVar = (AbstractC17026c) a;
            if (!(cVar == null || (z = cVar.mo26902z()) == null)) {
                return z.mo26816a();
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final void mo61855a(Class<?> cls) {
        T t;
        C89219l.m154721d(cls, "");
        Iterator<T> it = m71939g().f38812a.mo25684a().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            t2.mo25712c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$h */
    public static final class C35177h implements AbstractC16653n {

        /* renamed from: a */
        final /* synthetic */ BulletService f82996a;

        /* renamed from: b */
        final /* synthetic */ Bundle f82997b;

        /* renamed from: c */
        final /* synthetic */ String f82998c;

        /* renamed from: d */
        final /* synthetic */ Context f82999d;

        /* renamed from: e */
        final /* synthetic */ AbstractC34962a f83000e = null;

        static {
            Covode.recordClassIndex(42333);
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16646g
        /* renamed from: a */
        public final Uri mo26406a(Uri uri, Bundle bundle) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(bundle, "");
            return BulletService.m71935a(this.f82999d, uri);
        }

        C35177h(BulletService bulletService, Bundle bundle, String str, Context context) {
            this.f82996a = bulletService;
            this.f82997b = bundle;
            this.f82998c = str;
            this.f82999d = context;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final void mo61852a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        mo61854a(context, str, null, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$f */
    public static final class C35175f implements AbstractC16599ai {

        /* renamed from: a */
        final /* synthetic */ BulletService f82986a;

        /* renamed from: b */
        final /* synthetic */ Bundle f82987b;

        /* renamed from: c */
        final /* synthetic */ String f82988c;

        /* renamed from: d */
        final /* synthetic */ Context f82989d;

        /* renamed from: e */
        final /* synthetic */ AbstractC34962a f82990e = null;

        static {
            Covode.recordClassIndex(42331);
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16646g
        /* renamed from: a */
        public final Uri mo26406a(Uri uri, Bundle bundle) {
            Uri a;
            C89219l.m154721d(uri, "");
            C89219l.m154721d(bundle, "");
            Uri a2 = BulletService.m71935a(this.f82989d, uri);
            IBulletService f = BulletService.m71938f();
            String uri2 = a2.toString();
            C89219l.m154716b(uri2, "");
            String b = f.mo61857b(uri2);
            AbstractC34962a aVar = this.f82990e;
            if (aVar != null && (a = aVar.mo61861a(b, bundle)) != null) {
                return a;
            }
            Uri parse = Uri.parse(b);
            C89219l.m154716b(parse, "");
            return parse;
        }

        C35175f(BulletService bulletService, Bundle bundle, String str, Context context) {
            this.f82986a = bulletService;
            this.f82987b = bundle;
            this.f82988c = str;
            this.f82989d = context;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: b */
    public final boolean mo61859b(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        AbstractC16593ad adVar = (AbstractC16593ad) C16622e.C16623a.m30858a().mo26346a(AbstractC16593ad.class);
        if (adVar != null) {
            return adVar.mo26361a(str, new C16631a());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$b */
    public static final class C35163b implements C28573r.AbstractC28574a {

        /* renamed from: a */
        final /* synthetic */ Map f82967a;

        static {
            Covode.recordClassIndex(42319);
        }

        C35163b(Map map) {
            this.f82967a = map;
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C28573r.AbstractC28574a
        /* renamed from: a */
        public final Typeface mo14647a(String str, int i) {
            String str2;
            if (BulletService.f82960a.contains(str)) {
                str2 = (String) this.f82967a.get("ProximaNova-Bold");
            } else if (BulletService.f82961b.contains(str)) {
                str2 = (String) this.f82967a.get("ProximaNova-Semibold");
            } else {
                if (BulletService.f82962c.contains(str)) {
                    str2 = (String) this.f82967a.get("ProximaNova-Reg");
                }
                return null;
            }
            if (str2 != null) {
                return C28573r.m57140a(C17867d.m33078a().getAssets(), str2, i, "font/");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$g */
    public static final class C35176g implements AbstractC16700z {

        /* renamed from: a */
        final /* synthetic */ BulletService f82991a;

        /* renamed from: b */
        final /* synthetic */ Bundle f82992b;

        /* renamed from: c */
        final /* synthetic */ String f82993c;

        /* renamed from: d */
        final /* synthetic */ Context f82994d;

        /* renamed from: e */
        final /* synthetic */ AbstractC34962a f82995e = null;

        static {
            Covode.recordClassIndex(42332);
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16646g
        /* renamed from: a */
        public final Uri mo26406a(Uri uri, Bundle bundle) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(bundle, "");
            Uri a = BulletService.m71935a(this.f82994d, uri);
            IBulletService f = BulletService.m71938f();
            String uri2 = a.toString();
            C89219l.m154716b(uri2, "");
            Uri parse = Uri.parse(f.mo61857b(uri2));
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Boolean> rnFallback = inst.getRnFallback();
            C89219l.m154716b(rnFallback, "");
            Boolean c = rnFallback.mo59941c();
            C89219l.m154716b(c, "");
            if (c.booleanValue()) {
                Uri build = parse.buildUpon().appendQueryParameter("force_h5", "1").build();
                C89219l.m154716b(build, "");
                return build;
            }
            C89219l.m154716b(parse, "");
            return parse;
        }

        C35176g(BulletService bulletService, Bundle bundle, String str, Context context) {
            this.f82991a = bulletService;
            this.f82992b = bundle;
            this.f82993c = str;
            this.f82994d = context;
        }
    }

    /* renamed from: a */
    public static Uri m71935a(Context context, Uri uri) {
        if (!uri.isHierarchical() || !C89219l.m154714a((Object) uri.getQueryParameter("container_bgcolor"), (Object) "app_theme")) {
            return uri;
        }
        Uri uri2 = uri;
        String c = m71937c(context);
        if (c != null) {
            ALog.m59865d("BulletService", "replace app_theme with ".concat(String.valueOf(c)));
            if (uri2.isHierarchical()) {
                Uri.Builder clearQuery = uri2.buildUpon().clearQuery();
                Set<String> queryParameterNames = uri2.getQueryParameterNames();
                C89219l.m154716b(queryParameterNames, "");
                for (T t : queryParameterNames) {
                    if (!C89219l.m154714a((Object) t, (Object) "container_bgcolor")) {
                        clearQuery.appendQueryParameter(t, uri2.getQueryParameter(t));
                    }
                }
                clearQuery.appendQueryParameter("container_bgcolor", c);
                uri2 = clearQuery.build();
                C89219l.m154716b(uri2, "");
                if (uri2 == null) {
                    return uri;
                }
            }
        }
        return uri2;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final void mo61853a(Context context, String str, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        mo61854a(context, str, null, bundle);
    }

    /* renamed from: b */
    private void m71936b(Context context, String str, String str2, Bundle bundle) {
        Bundle bundle2;
        String str3;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        m71939g();
        boolean z = false;
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                str3 = parse.getQueryParameter("use_spark");
            } else {
                str3 = null;
            }
            z = C89219l.m154714a((Object) str3, (Object) "1");
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (z) {
            SmartRouter.buildRoute(context, str).open();
            return;
        }
        AbstractC16593ad adVar = (AbstractC16593ad) C16622e.C16623a.m30858a().mo26346a(AbstractC16593ad.class);
        if (adVar != null) {
            Uri parse2 = Uri.parse(str);
            C89219l.m154716b(parse2, "");
            C16632b bVar = new C16632b();
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = bundle;
            }
            bVar.mo26396a(bundle2);
            ArrayList arrayList = new ArrayList();
            if (str2 != null) {
                arrayList.add(str2);
            }
            bVar.mo26398a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C35175f(this, bundle, str2, context));
            arrayList2.add(new C35176g(this, bundle, str2, context));
            arrayList2.add(new C35177h(this, bundle, str2, context));
            bVar.f39792d = arrayList2;
            bVar.mo26397a(new C35178i());
            adVar.mo26360a(context, parse2, bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final void mo61854a(Context context, String str, String str2, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        m71936b(context, str, str2, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final AbstractC35316c mo61851a(Context context, String str, String str2, int i, int i2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        DialogC35310a aVar = new DialogC35310a(context, str, str2, i);
        aVar.f83338c = i2;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            aVar.mo62167a(activity);
        }
        return aVar;
    }
}
