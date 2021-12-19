package com.p2082ss.android.ugc.aweme.app.launch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17871e;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.appcontext.C17882j;
import com.bytedance.keva.Keva;
import com.p2082ss.android.legoimpl.ProcessExceptionTask;
import com.p2082ss.android.ugc.aweme.experiment.C46899ep;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58189a;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58191c;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58193e;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58194f;
import com.p2082ss.android.ugc.aweme.lego.component.C58190b;
import com.p2082ss.android.ugc.aweme.lego.component.C58192d;
import com.p2082ss.android.ugc.aweme.lego.p3390a.EnumC58145f;
import com.p2082ss.android.ugc.aweme.lego.p3392b.C58172b;
import com.p2082ss.android.ugc.aweme.lego.p3394d.AbstractC58203a;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a;
import com.p2082ss.android.ugc.aweme.legoImp.C58283a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.app.launch.a */
public final class C33804a {

    /* renamed from: a */
    public static final C33804a f80050a = new C33804a();

    /* renamed from: b */
    private static final AbstractC89244h f80051b = C89250i.m154773a((AbstractC89171a) C33806b.f80054a);

    /* renamed from: c */
    private static final AbstractC89244h f80052c = C89250i.m154773a((AbstractC89171a) C33805a.f80053a);

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$d */
    public static final class C33809d implements AbstractC58191c {

        /* renamed from: a */
        final /* synthetic */ Application f80056a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f80057b;

        /* renamed from: c */
        final /* synthetic */ SparseBooleanArray f80058c;

        static {
            Covode.recordClassIndex(40709);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.launch.a$d$a */
        public static final class C33810a implements AbstractC58189a {
            static {
                Covode.recordClassIndex(40710);
            }

            C33810a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.lego.component.AbstractC58189a
            /* renamed from: a */
            public final void mo60047a(C58190b bVar) {
                C89219l.m154721d(bVar, "");
                C58221f.m105153e().mo95704a(new ProcessExceptionTask(bVar)).mo95706a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.component.AbstractC58191c
        /* renamed from: a */
        public final Context mo60043a() {
            return this.f80056a;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.component.AbstractC58191c
        /* renamed from: b */
        public final AbstractC58189a mo60044b() {
            return new C33810a();
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.component.AbstractC58191c
        /* renamed from: c */
        public final AbstractC58203a mo60045c() {
            return new C33811b(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.component.AbstractC58191c
        /* renamed from: d */
        public final boolean mo60046d() {
            return C46899ep.m90198b();
        }

        /* renamed from: com.ss.android.ugc.aweme.app.launch.a$d$b */
        public static final class C33811b implements AbstractC58203a {

            /* renamed from: a */
            final /* synthetic */ C33809d f80059a;

            static {
                Covode.recordClassIndex(40711);
            }

            @Override // com.p2082ss.android.ugc.aweme.lego.p3394d.AbstractC58203a
            /* renamed from: a */
            public final int mo60048a() {
                Integer num = (Integer) this.f80059a.f80057b.element.get(C58227a.m105171b(this.f80059a.f80056a));
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }

            @Override // com.p2082ss.android.ugc.aweme.lego.p3394d.AbstractC58203a
            /* renamed from: b */
            public final AbstractC58203a.EnumC58204a mo60049b() {
                if (mo60048a() == 0) {
                    return AbstractC58203a.EnumC58204a.WILD;
                }
                if (this.f80059a.f80058c.get(mo60048a())) {
                    return AbstractC58203a.EnumC58204a.PRISON;
                }
                return AbstractC58203a.EnumC58204a.NORMAL;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33811b(C33809d dVar) {
                this.f80059a = dVar;
            }
        }

        C33809d(Application application, C89233z.C89238e eVar, SparseBooleanArray sparseBooleanArray) {
            this.f80056a = application;
            this.f80057b = eVar;
            this.f80058c = sparseBooleanArray;
        }
    }

    /* renamed from: a */
    public static Keva m69167a() {
        return (Keva) f80051b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$e */
    public static final class C33812e implements AbstractC58193e<C58192d> {
        static {
            Covode.recordClassIndex(40712);
        }

        C33812e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.lego.component.AbstractC58193e
        /* renamed from: a */
        public final /* synthetic */ void mo60050a(C58192d dVar) {
            C58192d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C58945a.C58947b.f134185a.mo96425a(dVar2.f132505c, false);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.lego.component.AbstractC58193e
        /* renamed from: b */
        public final /* synthetic */ void mo60051b(C58192d dVar) {
            C58192d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C58945a.C58947b.f134185a.mo96429b(dVar2.f132505c, false);
        }
    }

    private C33804a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$a */
    static final class C33805a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C33805a f80053a = new C33805a();

        static {
            Covode.recordClassIndex(40705);
        }

        C33805a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("ab_repo_cold_boot", 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$b */
    static final class C33806b extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C33806b f80054a = new C33806b();

        static {
            Covode.recordClassIndex(40706);
        }

        C33806b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("main_process_runstate", 1);
        }
    }

    static {
        Covode.recordClassIndex(40704);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$f */
    public static final class C33813f implements AbstractC58194f {

        /* renamed from: a */
        final /* synthetic */ Application f80060a;

        static {
            Covode.recordClassIndex(40713);
        }

        C33813f(Application application) {
            this.f80060a = application;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.component.AbstractC58194f
        /* renamed from: a */
        public final void mo60052a(EnumC58145f fVar) {
            C89219l.m154721d(fVar, "");
            if (C58227a.m105170a(this.f80060a)) {
                C33804a.m69167a().storeInt("runstate", fVar.ordinal());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$c */
    static final class C33807c extends AbstractC89220m implements AbstractC89172b<C17871e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AppBuildConfig f80055a;

        static {
            Covode.recordClassIndex(40707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33807c(AppBuildConfig appBuildConfig) {
            super(1);
            this.f80055a = appBuildConfig;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C17871e eVar) {
            C17871e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f42613e = Integer.valueOf((int) R.string.u8);
            C89219l.m154716b("trill", "");
            C89219l.m154721d("trill", "");
            eVar2.f42614f = "trill";
            C89219l.m154721d("tiktok", "");
            eVar2.f42616h = "tiktok";
            eVar2.f42610b = false;
            String a = this.f80055a.mo28435a();
            C89219l.m154721d(a, "");
            eVar2.f42615g = a;
            eVar2.f42618j = 220405;
            C89219l.m154716b("trill-android", "");
            C89219l.m154721d("trill-android", "");
            eVar2.f42619k = "trill-android";
            eVar2.f42620l = 1180;
            eVar2.f42623o = 1;
            eVar2.f42624p = true;
            eVar2.f42617i = false;
            eVar2.f42621m = this.f80055a.mo28437c();
            eVar2.f42622n = true;
            eVar2.f42611c = new C17873f.AbstractC17877d() {
                /* class com.p2082ss.android.ugc.aweme.app.launch.C33804a.C33807c.C338081 */

                static {
                    Covode.recordClassIndex(40708);
                }

                @Override // com.bytedance.ies.ugc.appcontext.C17873f.AbstractC17877d
                /* renamed from: a */
                public final boolean mo28450a(Activity activity) {
                    if (activity != null && !(activity instanceof ActivityC17312a)) {
                        return true;
                    }
                    return false;
                }
            };
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m69168a(Application application) {
        C89219l.m154721d(application, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new HashMap();
        String packageName = application.getPackageName();
        C89219l.m154716b(packageName, "");
        eVar.element.put(packageName, 1);
        eVar.element.put(packageName + ":push", 2);
        eVar.element.put(packageName + ":pushservice", 32);
        eVar.element.put(packageName + ":ttplayer", 64);
        eVar.element.put(packageName + ":miniapp0", 16);
        eVar.element.put(packageName + ":miniapp1", 16);
        eVar.element.put(packageName + ":miniapp2", 16);
        eVar.element.put(packageName + ":miniapp3", 16);
        eVar.element.put(packageName + ":miniapp4", 16);
        eVar.element.put(packageName + ":miniapp100", 16);
        eVar.element.put(packageName + ":miniapp200", 16);
        eVar.element.put(packageName + ":error_activity", 256);
        eVar.element.put(packageName + ":safemode", 128);
        eVar.element.put(packageName + ":wallpaper", 1024);
        eVar.element.put(packageName + ":bm", 512);
        eVar.element.put(packageName + ":boost_multidex", 2048);
        eVar.element.put(packageName + ":downloader", 4);
        eVar.element.put(packageName + ":playcore_missing_splits_activity", 131072);
        eVar.element.put(packageName + ":feedbacker", 262144);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        sparseBooleanArray.put(16, true);
        sparseBooleanArray.put(8, true);
        C58221f.m105146a(new C33809d(application, eVar, sparseBooleanArray));
        if (!((Boolean) C58172b.f132463f.getValue()).booleanValue()) {
            C58283a aVar = new C58283a(new C33812e());
            C89219l.m154721d(aVar, "");
            C58221f.f132583g = aVar;
        }
        C58221f.f132587k = new C33813f(application);
    }

    /* renamed from: a */
    public static void m69169a(Application application, AppBuildConfig appBuildConfig) {
        boolean z;
        C89219l.m154721d(application, "");
        C89219l.m154721d(appBuildConfig, "");
        C33807c cVar = new C33807c(appBuildConfig);
        C89219l.m154721d(application, "");
        C89219l.m154721d(cVar, "");
        C17871e eVar = new C17871e(application, cVar);
        C89219l.m154721d(eVar, "");
        C17867d.f42578b = eVar.mo28446a();
        C17867d.f42577a = eVar.f42610b;
        C17867d.f42580d = eVar.f42613e;
        C17867d.f42579c = eVar.f42612d;
        String str = eVar.f42614f;
        if (str == null) {
            C89219l.m154710a("appName");
        }
        C17867d.f42581e = str;
        String str2 = eVar.f42616h;
        if (str2 == null) {
            C89219l.m154710a("flavor");
        }
        C17867d.f42583g = str2;
        long j = eVar.f42618j;
        String str3 = eVar.f42615g;
        if (str3 == null) {
            C89219l.m154710a("versionName");
        }
        C17867d.f42582f = new C17867d.C17870c(j, str3);
        String str4 = eVar.f42619k;
        if (str4 == null) {
            C89219l.m154710a("feedbackAppKey");
        }
        C17867d.f42585i = str4;
        C17867d.f42588l = eVar.f42623o;
        C17867d.f42589m = eVar.f42624p;
        C17867d.f42590n = eVar.f42620l;
        C17867d.f42596t = eVar.f42617i;
        C17867d.f42598v = eVar.f42621m;
        C17867d.f42599w = eVar.f42622n;
        C17867d.C17870c cVar2 = C17867d.f42582f;
        if (cVar2 == null) {
            C89219l.m154710a("versionInfo");
        }
        if (TextUtils.isEmpty(cVar2.f42607b) || cVar2.f42606a == 0 || cVar2.f42606a == -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Application application2 = C17867d.f42578b;
            if (application2 == null) {
                C89219l.m154710a("context");
            }
            C17867d.f42582f = C17882j.m33115a(application2);
        }
        Application application3 = C17867d.f42578b;
        if (application3 == null) {
            C89219l.m154710a("context");
        }
        C17867d.f42584h = C17882j.m33117b(application3);
        Application application4 = C17867d.f42578b;
        if (application4 == null) {
            C89219l.m154710a("context");
        }
        String a = C17882j.m33116a(application4, "meta_channel");
        if (a != null && a.length() > 0) {
            C17867d.f42595s = a;
            C17867d.f42597u = a;
        }
        Application application5 = C17867d.f42578b;
        if (application5 == null) {
            C89219l.m154710a("context");
        }
        String a2 = C17882j.m33116a(application5, "GIT_BRANCH");
        if (a2 != null) {
            C17867d.f42591o = a2;
        }
        Application application6 = C17867d.f42578b;
        if (application6 == null) {
            C89219l.m154710a("context");
        }
        String a3 = C17882j.m33116a(application6, "GIT_SHA");
        if (a3 != null) {
            C17867d.f42592p = a3;
        }
        Application application7 = C17867d.f42578b;
        if (application7 == null) {
            C89219l.m154710a("context");
        }
        String a4 = C17882j.m33116a(application7, "GIT_USERNAME");
        if (a4 != null) {
            C17867d.f42593q = a4;
        }
        Application application8 = C17867d.f42578b;
        if (application8 == null) {
            C89219l.m154710a("context");
        }
        String a5 = C17882j.m33116a(application8, "GIT_USER_EMAIL");
        if (a5 != null) {
            C17867d.f42594r = a5;
        }
        Application application9 = C17867d.f42578b;
        if (application9 == null) {
            C89219l.m154710a("context");
        }
        String a6 = C17882j.m33116a(application9, "release_build");
        if (a6 != null) {
            C17867d.f42586j = a6;
        }
        Application a7 = eVar.mo28446a();
        C89219l.m154721d(a7, "");
        a7.registerActivityLifecycleCallbacks(new C17873f.C17878e(a7));
        C17873f.f42640p = eVar.f42611c;
    }
}
