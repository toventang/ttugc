package com.p2082ss.android.ugc.aweme.out;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.aweme.C41467dg;
import com.p2082ss.android.ugc.aweme.badge.C34422a;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.external.C47050a;
import com.p2082ss.android.ugc.aweme.external.C47107b;
import com.p2082ss.android.ugc.aweme.external.C47142c;
import com.p2082ss.android.ugc.aweme.external.C47144d;
import com.p2082ss.android.ugc.aweme.external.C47147e;
import com.p2082ss.android.ugc.aweme.external.C47162f;
import com.p2082ss.android.ugc.aweme.external.C47164g;
import com.p2082ss.android.ugc.aweme.external.C47165h;
import com.p2082ss.android.ugc.aweme.external.C47168j;
import com.p2082ss.android.ugc.aweme.external.C47170k;
import com.p2082ss.android.ugc.aweme.external.C47172l;
import com.p2082ss.android.ugc.aweme.external.p2915a.C47092e;
import com.p2082ss.android.ugc.aweme.external.p2915a.C47104f;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63236br;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.AVPublishServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IAVFilterService;
import com.p2082ss.android.ugc.aweme.services.IAVMobService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.ITakeInSameOptimize;
import com.p2082ss.android.ugc.aweme.services.badge.IBadgeService;
import com.p2082ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p2082ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.p2082ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.p2082ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.p2082ss.android.ugc.aweme.services.external.IConfigService;
import com.p2082ss.android.ugc.aweme.services.external.IDonationService;
import com.p2082ss.android.ugc.aweme.services.external.IEnterFromService;
import com.p2082ss.android.ugc.aweme.services.external.IInfoService;
import com.p2082ss.android.ugc.aweme.services.external.IInitTaskService;
import com.p2082ss.android.ugc.aweme.services.external.ILargeTransactionService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.p2082ss.android.ugc.aweme.services.story.IStoryService;
import com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p2082ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.p2082ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.services.video.IActivityNameService;
import com.p2082ss.android.ugc.aweme.servicimpl.C67884a;
import com.p2082ss.android.ugc.aweme.servicimpl.C67909e;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shoutouts.C74420e;
import com.p2082ss.android.ugc.aweme.specialplus.C75210e;
import com.p2082ss.android.ugc.aweme.sticker.p3961i.C75385a;
import com.p2082ss.android.ugc.aweme.story.base.C76628f;
import com.p2082ss.android.ugc.aweme.ttep.p4151b.C79238a;
import com.p2082ss.android.ugc.aweme.utils.C80583iq;
import com.p2082ss.android.vesdk.C85378ay;
import com.p2082ss.android.vesdk.C85515j;
import dmt.p4542av.video.p4548e.C88254b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl */
public final class AVExternalServiceImpl implements IExternalService {

    /* renamed from: a */
    private final AbstractC89244h f142193a = C89250i.m154773a((AbstractC89171a) C62734h.f142217a);

    /* renamed from: b */
    private final AbstractC89244h f142194b = C89250i.m154773a((AbstractC89171a) C62736j.f142219a);

    /* renamed from: c */
    private final AbstractC89244h f142195c = C89250i.m154773a((AbstractC89171a) C62727a.f142210a);

    /* renamed from: d */
    private final AbstractC89244h f142196d = C89250i.m154773a((AbstractC89171a) C62732f.f142215a);

    /* renamed from: e */
    private final AbstractC89244h f142197e = C89250i.m154773a((AbstractC89171a) C62739l.f142221a);

    /* renamed from: f */
    private final AbstractC89244h f142198f = C89250i.m154773a((AbstractC89171a) C62728b.f142211a);

    /* renamed from: g */
    private final AbstractC89244h f142199g = C89250i.m154773a((AbstractC89171a) C62731e.f142214a);

    /* renamed from: h */
    private final AbstractC89244h f142200h = C89250i.m154773a((AbstractC89171a) C62743p.f142225a);

    /* renamed from: i */
    private final AbstractC89244h f142201i = C89250i.m154773a((AbstractC89171a) C62730d.f142213a);

    /* renamed from: j */
    private final AbstractC89244h f142202j = C89250i.m154773a((AbstractC89171a) C62741n.f142223a);

    /* renamed from: k */
    private final AbstractC89244h f142203k = C89250i.m154773a((AbstractC89171a) C62733g.f142216a);

    /* renamed from: l */
    private final AbstractC89244h f142204l = C89250i.m154773a((AbstractC89171a) C62735i.f142218a);

    /* renamed from: m */
    private final AbstractC89244h f142205m = C89250i.m154773a((AbstractC89171a) C62729c.f142212a);

    /* renamed from: n */
    private final AbstractC89244h f142206n = C89250i.m154773a((AbstractC89171a) C62744q.f142226a);

    /* renamed from: o */
    private final AbstractC89244h f142207o = C89250i.m154773a((AbstractC89171a) C62737k.f142220a);

    /* renamed from: p */
    private final AbstractC89244h f142208p = C89250i.m154773a((AbstractC89171a) C62742o.f142224a);

    /* renamed from: q */
    private final AbstractC89244h f142209q = C89250i.m154773a((AbstractC89171a) C62740m.f142222a);

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$r */
    public static final class C62745r implements IAVTypeFaceService {
        static {
            Covode.recordClassIndex(73566);
        }

        /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$r$a */
        public static final class C62746a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ Context f142227a;

            static {
                Covode.recordClassIndex(73567);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            C62746a(Context context) {
                this.f142227a = context;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                C75385a.m132218a().mo118943a(this.f142227a);
            }
        }

        C62745r() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.IAVTypeFaceService
        public final void prefetch(Context context) {
            C89219l.m154721d(context, "");
            AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("WaterMark", new C62746a(context));
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.IAVTypeFaceService
        public final Typeface getTypefaceByFontName(String str) {
            C89219l.m154721d(str, "");
            C75385a a = C75385a.m132218a();
            if (TextUtils.isEmpty(str) || a.f169433b.size() == 0) {
                return null;
            }
            for (C45995c cVar : a.f169433b.values()) {
                if (str.equals(cVar.f107117a)) {
                    String str2 = cVar.f107121e;
                    if (TextUtils.isEmpty(str2) || a.f169434c.size() == 0) {
                        return null;
                    }
                    Typeface typeface = a.f169434c.get(str2);
                    if (!(typeface != null || a.f169433b.get(str2) == null || (typeface = C75385a.m132217a(a.f169433b.get(str2).f107123g)) == null)) {
                        a.f169434c.put(str2, typeface);
                    }
                    return typeface;
                }
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(73547);
    }

    /* renamed from: b */
    private final C62749b m113115b() {
        return (C62749b) this.f142198f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$d */
    static final class C62730d extends AbstractC89220m implements AbstractC89171a<C73975b> {

        /* renamed from: a */
        public static final C62730d f142213a = new C62730d();

        static {
            Covode.recordClassIndex(73551);
        }

        C62730d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C73975b invoke() {
            return C73975b.C73976a.f166071a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$q */
    static final class C62744q extends AbstractC89220m implements AbstractC89171a<C41467dg> {

        /* renamed from: a */
        public static final C62744q f142226a = new C62744q();

        static {
            Covode.recordClassIndex(73565);
        }

        C62744q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C41467dg invoke() {
            return C41467dg.f96718a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAbnormalExitLogService abnormalExitLogService() {
        return C62748a.f142234a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IEnterFromService enterFromService() {
        return C47164g.f109787a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final ITTEPAbilityService ttepAbilityService() {
        return C79238a.f178060a;
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$a */
    static final class C62727a extends AbstractC89220m implements AbstractC89171a<C47092e> {

        /* renamed from: a */
        public static final C62727a f142210a = new C62727a();

        static {
            Covode.recordClassIndex(73548);
        }

        C62727a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47092e invoke() {
            return new C47092e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$b */
    static final class C62728b extends AbstractC89220m implements AbstractC89171a<C62749b> {

        /* renamed from: a */
        public static final C62728b f142211a = new C62728b();

        static {
            Covode.recordClassIndex(73549);
        }

        C62728b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62749b invoke() {
            return new C62749b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$c */
    static final class C62729c extends AbstractC89220m implements AbstractC89171a<C67884a> {

        /* renamed from: a */
        public static final C62729c f142212a = new C62729c();

        static {
            Covode.recordClassIndex(73550);
        }

        C62729c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67884a invoke() {
            return new C67884a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$e */
    static final class C62731e extends AbstractC89220m implements AbstractC89171a<C34422a> {

        /* renamed from: a */
        public static final C62731e f142214a = new C62731e();

        static {
            Covode.recordClassIndex(73552);
        }

        C62731e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34422a invoke() {
            return new C34422a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$f */
    static final class C62732f extends AbstractC89220m implements AbstractC89171a<C47147e> {

        /* renamed from: a */
        public static final C62732f f142215a = new C62732f();

        static {
            Covode.recordClassIndex(73553);
        }

        C62732f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47147e invoke() {
            return new C47147e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$g */
    static final class C62733g extends AbstractC89220m implements AbstractC89171a<C47050a> {

        /* renamed from: a */
        public static final C62733g f142216a = new C62733g();

        static {
            Covode.recordClassIndex(73554);
        }

        C62733g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47050a invoke() {
            return new C47050a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$h */
    static final class C62734h extends AbstractC89220m implements AbstractC89171a<C67909e> {

        /* renamed from: a */
        public static final C62734h f142217a = new C62734h();

        static {
            Covode.recordClassIndex(73555);
        }

        C62734h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67909e invoke() {
            return new C67909e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$i */
    static final class C62735i extends AbstractC89220m implements AbstractC89171a<C47162f> {

        /* renamed from: a */
        public static final C62735i f142218a = new C62735i();

        static {
            Covode.recordClassIndex(73556);
        }

        C62735i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47162f invoke() {
            return new C47162f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$j */
    static final class C62736j extends AbstractC89220m implements AbstractC89171a<C47107b> {

        /* renamed from: a */
        public static final C62736j f142219a = new C62736j();

        static {
            Covode.recordClassIndex(73557);
        }

        C62736j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47107b invoke() {
            return new C47107b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$k */
    static final class C62737k extends AbstractC89220m implements AbstractC89171a<C627381> {

        /* renamed from: a */
        public static final C62737k f142220a = new C62737k();

        static {
            Covode.recordClassIndex(73558);
        }

        C62737k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C627381 invoke() {
            return new IAVFilterService() {
                /* class com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl.C62737k.C627381 */

                static {
                    Covode.recordClassIndex(73559);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IAVFilterService
                public final String getFilterFolder(FilterBean filterBean) {
                    C89219l.m154721d(filterBean, "");
                    String filterFolder = filterBean.getFilterFolder();
                    C89219l.m154716b(filterFolder, "");
                    return filterFolder;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IAVFilterService
                public final void setFilterFolder(FilterBean filterBean, String str) {
                    C89219l.m154721d(filterBean, "");
                    C89219l.m154721d(str, "");
                    filterBean.setFilterFolder(str);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$l */
    static final class C62739l extends AbstractC89220m implements AbstractC89171a<C47168j> {

        /* renamed from: a */
        public static final C62739l f142221a = new C62739l();

        static {
            Covode.recordClassIndex(73560);
        }

        C62739l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47168j invoke() {
            return new C47168j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$m */
    static final class C62740m extends AbstractC89220m implements AbstractC89171a<C47172l> {

        /* renamed from: a */
        public static final C62740m f142222a = new C62740m();

        static {
            Covode.recordClassIndex(73561);
        }

        C62740m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47172l invoke() {
            return new C47172l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$n */
    static final class C62741n extends AbstractC89220m implements AbstractC89171a<C47104f> {

        /* renamed from: a */
        public static final C62741n f142223a = new C62741n();

        static {
            Covode.recordClassIndex(73562);
        }

        C62741n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47104f invoke() {
            return new C47104f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$o */
    static final class C62742o extends AbstractC89220m implements AbstractC89171a<C47142c> {

        /* renamed from: a */
        public static final C62742o f142224a = new C62742o();

        static {
            Covode.recordClassIndex(73563);
        }

        C62742o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47142c invoke() {
            return new C47142c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$p */
    static final class C62743p extends AbstractC89220m implements AbstractC89171a<C74420e> {

        /* renamed from: a */
        public static final C62743p f142225a = new C62743p();

        static {
            Covode.recordClassIndex(73564);
        }

        C62743p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74420e invoke() {
            return new C74420e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IExternalUploaderService externalUploaderService() {
        return new C47165h();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void initASVE() {
        C63238c.m114590a(C71815es.m126788a());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IInitTaskService initService() {
        return new C47170k();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final ISpecialPlusService specialPlusService() {
        return C75210e.C75211a.m131957a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IStoryService storyService() {
        return new C76628f();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final ISuperEntranceService superEntranceService() {
        return C88254b.C88255a.m153365a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAVTypeFaceService typeFaceService() {
        return new C62745r();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAbilityService abilityService() {
        return (C47092e) this.f142195c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IActivityNameService classnameService() {
        return (C47144d) C47144d.f109767a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IConfigService configService() {
        return (C47147e) this.f142196d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IDonationService donationService() {
        return (C47162f) this.f142204l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAVDraftService draftService() {
        return (C47107b) this.f142194b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAVFilterService filterService() {
        return (C62737k.C627381) this.f142207o.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAVMobService getAVMobService() {
        return (C67884a) this.f142205m.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IBadgeService getBadgeService() {
        return (C34422a) this.f142199g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IInfoService infoService() {
        return (C47168j) this.f142197e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final ILargeTransactionService largeTransactionService() {
        return (C47172l) this.f142209q.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IOpenPhotoNextService openGotoNextService() {
        return (C47104f) this.f142202j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final ICreativePerformanceMonitorService performanceMonitorService() {
        return (C67909e) this.f142193a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAVPerformance provideAVPerformance() {
        C73975b bVar = (C73975b) this.f142201i.getValue();
        C89219l.m154716b(bVar, "");
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final ICrashReportService provideErrorReporter() {
        return (C47050a) this.f142203k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final ITakeInSameOptimize provideTakeInSameOptimize() {
        return (ITakeInSameOptimize) this.f142206n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAVPublishService publishService() {
        AVPublishServiceImpl instance = AVPublishServiceImpl.getInstance();
        C89219l.m154716b(instance, "");
        return instance;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IAVScreenAdaptService screenAdaptService() {
        return (C47142c) this.f142208p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final IShoutOutsService shoutOutsService() {
        return (C74420e) this.f142200h.getValue();
    }

    /* renamed from: a */
    public static IExternalService m113114a() {
        MethodCollector.m26663i(6587);
        Object a = C81908b.m141854a(IExternalService.class, false);
        if (a != null) {
            IExternalService iExternalService = (IExternalService) a;
            MethodCollector.m26664o(6587);
            return iExternalService;
        }
        if (C81908b.f183274cX == null) {
            synchronized (IExternalService.class) {
                try {
                    if (C81908b.f183274cX == null) {
                        C81908b.f183274cX = new AVExternalServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6587);
                    throw th;
                }
            }
        }
        AVExternalServiceImpl aVExternalServiceImpl = (AVExternalServiceImpl) C81908b.f183274cX;
        MethodCollector.m26664o(6587);
        return aVExternalServiceImpl;
    }

    public AVExternalServiceImpl() {
        C80583iq.m139715b();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void setVideoIdParam(String str) {
        C89219l.m154721d(str, "");
        C70747dv.f158357a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void attachApplication(Application application) {
        C89219l.m154721d(application, "");
        C89219l.m154721d(application, "");
        C31012a.f74336b = application;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void updateVESDKDeviceId(String str) {
        C89219l.m154721d(str, "");
        if (C63236br.f143556a) {
            C85515j m = C31012a.m63724a().mo56199m();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            m.f191562c = str;
            C85378ay.m146875a(C31012a.m63724a().mo56199m());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceWithOutPanel(String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(m113115b(), 100);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void asyncService(String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(m113115b(), 100);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void asyncService(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(m113115b(), 100);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceForMainRecordService(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(m113115b(), 100);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceWithActivity(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(m113115b(), 100);
    }
}
