package com.p2082ss.android.ugc.aweme.ttep.p4151b;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.p2082ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.p2082ss.android.ugc.aweme.ttep.effectapply.C79258a;
import com.p2082ss.android.ugc.aweme.ttep.effectapply.C79259b;
import com.p2082ss.android.ugc.aweme.ttep.effectapply.EffectFetchApi;
import com.p2082ss.android.ugc.aweme.ttep.p4151b.C79250b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.IFetchResourceListener;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.effectplatform.C86756c;
import com.p2082ss.ugc.effectplatform.util.C86990h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.b.a */
public final class C79238a implements ITTEPAbilityService {

    /* renamed from: a */
    public static final C79238a f178060a = new C79238a();

    /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$b */
    public static final class C79240b implements AbstractC63269z.AbstractC63270a {
        static {
            Covode.recordClassIndex(92427);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
        /* renamed from: a */
        public final void mo59543a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
        /* renamed from: b */
        public final void mo59544b() {
        }

        C79240b() {
        }
    }

    private C79238a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$c */
    static final class RunnableC79241c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f178063a;

        static {
            Covode.recordClassIndex(92428);
        }

        RunnableC79241c(AbstractC89172b bVar) {
            this.f178063a = bVar;
        }

        public final void run() {
            this.f178063a.invoke(300);
        }
    }

    static {
        Covode.recordClassIndex(92425);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$d */
    public static final class C79242d implements IDownloadCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f178064a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f178065b;

        static {
            Covode.recordClassIndex(92429);
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$d$a */
        static final class RunnableC79243a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C79242d f178066a;

            static {
                Covode.recordClassIndex(92430);
            }

            RunnableC79243a(C79242d dVar) {
                this.f178066a = dVar;
            }

            public final void run() {
                new C79459a(C63238c.f143574a).mo123052a(this.f178066a.f178065b.getString(R.string.s)).mo123053a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ttep.IDownloadCallback
        public final void onSuccess(Effect effect) {
            C89219l.m154721d(effect, "");
            AVExternalServiceImpl.m113114a().asyncService("scan", new C79244b(this, new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).setEnterTTEPPreviewPage(true).setTTEPPreviewEffect(effect).shootWay("scan")));
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$d$b */
        public static final class C79244b extends SimpleServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ C79242d f178067a;

            /* renamed from: b */
            final /* synthetic */ RecordConfig.Builder f178068b;

            static {
                Covode.recordClassIndex(92431);
            }

            C79244b(C79242d dVar, RecordConfig.Builder builder) {
                this.f178067a = dVar;
                this.f178068b = builder;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                this.f178067a.f178064a.invoke(300);
                asyncAVService.uiService().recordService().startRecord(this.f178067a.f178065b, this.f178068b.build());
            }
        }

        C79242d(AbstractC89172b bVar, ActivityC0945e eVar) {
            this.f178064a = bVar;
            this.f178065b = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.ttep.IDownloadCallback
        public final void onFail(int i, Exception exc) {
            if (i != 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC79243a(this), 500);
            }
            this.f178064a.invoke(300);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$a */
    static final class RunnableC79239a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f178061a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f178062b;

        static {
            Covode.recordClassIndex(92426);
        }

        RunnableC79239a(AbstractC89172b bVar, ActivityC0945e eVar) {
            this.f178061a = bVar;
            this.f178062b = eVar;
        }

        public final void run() {
            this.f178061a.invoke(0);
            new C79459a(C63238c.f143574a).mo123052a(this.f178062b.getString(R.string.r)).mo123053a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$f */
    public static final class C79246f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ IDownloadCallback f178069a;

        static {
            Covode.recordClassIndex(92433);
        }

        C79246f(IDownloadCallback iDownloadCallback) {
            this.f178069a = iDownloadCallback;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            boolean z;
            Map<String, List<String>> map;
            boolean z2 = true;
            if (iVar == null || iVar.mo5544c() || iVar.mo5539b() || iVar.mo5545d() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    C89219l.m154716b(iVar, "");
                    if (((C79258a) iVar.mo5545d()).f178079c != 0) {
                        this.f178069a.onFail(((C79258a) iVar.mo5545d()).f178079c, null);
                    } else {
                        if (C86756c.f195652a == null) {
                            Application application = C63238c.f143574a;
                            C89219l.m154716b(application, "");
                            C46404c.m89554a(application, null);
                        }
                        Object a = C79250b.m138060a().mo46670a(((C79258a) iVar.mo5545d()).f178077a, com.p2082ss.ugc.effectplatform.model.Effect.class);
                        C89219l.m154716b(a, "");
                        final com.p2082ss.ugc.effectplatform.model.Effect effect = (com.p2082ss.ugc.effectplatform.model.Effect) a;
                        if (effect.getRequirements() == null) {
                            effect.setRequirements(new ArrayList());
                        }
                        DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
                        Object[] array = effect.getRequirements().toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            String model_names = effect.getModel_names();
                            if (model_names != null) {
                                if (model_names.length() != 0) {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                map = C89041ag.m154415a();
                            } else {
                                Object a2 = C79250b.m138060a().mo46671a(model_names, new C79250b.C79251a().type);
                                C89219l.m154716b(a2, "");
                                map = (Map) a2;
                            }
                            instance.fetchResourcesByRequirementsAndModelNames(strArr, map, new IFetchResourceListener(this) {
                                /* class com.p2082ss.android.ugc.aweme.ttep.p4151b.C79238a.C79246f.C792471 */

                                /* renamed from: a */
                                final /* synthetic */ C79246f f178070a;

                                static {
                                    Covode.recordClassIndex(92434);
                                }

                                /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$f$1$a */
                                public static final class C79248a implements IFetchEffectListener {

                                    /* renamed from: a */
                                    final /* synthetic */ C792471 f178072a;

                                    static {
                                        Covode.recordClassIndex(92435);
                                    }

                                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                    public final void onStart(Effect effect) {
                                    }

                                    /* JADX WARN: Incorrect args count in method signature: ()V */
                                    C79248a(C792471 r1) {
                                        this.f178072a = r1;
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                    public final /* synthetic */ void onSuccess(Effect effect) {
                                        Effect effect2 = effect;
                                        C89219l.m154721d(effect2, "");
                                        effect2.setEffectId("123456");
                                        this.f178072a.f178070a.f178069a.onSuccess(effect2);
                                    }

                                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                                        C89219l.m154721d(exceptionResult, "");
                                        this.f178072a.f178070a.f178069a.onFail(-10, exceptionResult.getException());
                                    }
                                }

                                @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
                                public final void onFailure(Exception exc) {
                                    C89219l.m154721d(exc, "");
                                    this.f178070a.f178069a.onFail(-10, exc);
                                }

                                @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
                                public final void onSuccess(long j) {
                                    Effect effect = new Effect(effect);
                                    Application application = C63238c.f143574a;
                                    C89219l.m154716b(application, "");
                                    C46404c.m89554a(application, null).mo78887a(effect, new C79248a(this));
                                }

                                {
                                    this.f178070a = r1;
                                }
                            });
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } catch (Exception e) {
                    this.f178069a.onFail(-10, e);
                }
            } else {
                IDownloadCallback iDownloadCallback = this.f178069a;
                C89219l.m154716b(iVar, "");
                iDownloadCallback.onFail(-10, iVar.mo5546e());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadPreviewEffectAndResource(String str, String str2, IDownloadCallback iDownloadCallback) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(iDownloadCallback, "");
        m138057a(str, str2, iDownloadCallback, new C79245e(C79259b.f178081a));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadPreviewEffectAndResourceWithoutLogin(String str, String str2, IDownloadCallback iDownloadCallback) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(iDownloadCallback, "");
        m138057a(str, str2, iDownloadCallback, new C79249g(C79259b.f178081a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$e */
    public static final /* synthetic */ class C79245e extends C89217j implements AbstractC89187q<String, String, String, C1731i<C79258a>> {
        static {
            Covode.recordClassIndex(92432);
        }

        C79245e(C79259b bVar) {
            super(3, bVar, C79259b.class, "fetch", "fetch(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbolts/Task;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C1731i<C79258a> invoke(String str, String str2, String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            return ((EffectFetchApi) C63244g.m114602a().mo73257C().createRetrofit(str4, true, EffectFetchApi.class)).getEffectMeta(str5, str6, "android");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$g */
    static final /* synthetic */ class C79249g extends C89217j implements AbstractC89187q<String, String, String, C1731i<C79258a>> {
        static {
            Covode.recordClassIndex(92436);
        }

        C79249g(C79259b bVar) {
            super(3, bVar, C79259b.class, "fetchWithoutLogin", "fetchWithoutLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbolts/Task;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C1731i<C79258a> invoke(String str, String str2, String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            return ((EffectFetchApi) C63244g.m114602a().mo73257C().createRetrofit(str4, true, EffectFetchApi.class)).getEffectMetaWithoutLogin(str5, str6, "android");
        }
    }

    /* renamed from: a */
    private static void m138057a(String str, String str2, IDownloadCallback iDownloadCallback, AbstractC89187q<? super String, ? super String, ? super String, ? extends C1731i<C79258a>> qVar) {
        String str3 = C86990h.f196146a;
        if (str3 == null) {
            C89219l.m154715b();
        }
        ((C1731i) qVar.invoke(str, str2, str3)).mo5532a((AbstractC1729g) new C79246f(iDownloadCallback));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadEffectAndJumpShootPage(ActivityC0945e eVar, AbstractC89171a<Boolean> aVar, String str, AbstractC89172b<? super Integer, C89391z> bVar, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        String str2 = "";
        C89219l.m154721d(eVar, str2);
        C89219l.m154721d(aVar, str2);
        C89219l.m154721d(str, str2);
        C89219l.m154721d(bVar, str2);
        C89219l.m154721d(bVar2, str2);
        if (aVar.invoke().booleanValue()) {
            if (!C63238c.f143594u.mo93903b()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC79239a(bVar, eVar), 0);
                C63238c.f143594u.mo93897a(eVar, "", "schema_record", null, new C79240b());
            } else if (!C16048b.m29633a().mo25421a(true, "creator_preview_enable", false)) {
                new Handler(Looper.getMainLooper()).post(new RunnableC79241c(bVar));
            } else {
                bVar2.invoke(true);
                try {
                    str2 = Uri.parse(str).getQueryParameter("object_id");
                } catch (Exception unused) {
                }
                if (str2 != null && str2.length() != 0) {
                    downloadPreviewEffectAndResource("https://effecthouse.tiktok.com", str2, new C79242d(bVar, eVar));
                }
            }
        }
    }
}
