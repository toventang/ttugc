package com.p2082ss.android.ugc.aweme.p4173ug.p4177c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1721g.C23144b;
import com.google.android.play.core.install.AbstractC27057b;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.p1961a.AbstractC26736a;
import com.google.android.play.core.p1961a.AbstractC26739b;
import com.google.android.play.core.p1961a.AbstractC26741d;
import com.google.android.play.core.p1961a.C26740c;
import com.google.android.play.core.tasks.AbstractC27060b;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79596d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.c.a */
public final class C79591a implements AbstractC79596d {

    /* renamed from: a */
    static AbstractC26736a f178589a;

    /* renamed from: b */
    static AbstractC26739b f178590b;

    /* renamed from: c */
    static AbstractC27057b f178591c;

    /* renamed from: d */
    static boolean f178592d;

    /* renamed from: e */
    static WeakReference<Activity> f178593e;

    /* renamed from: f */
    public static final C79591a f178594f = new C79591a();

    /* renamed from: g */
    private static boolean f178595g;

    /* renamed from: h */
    private static long f178596h;

    private C79591a() {
    }

    static {
        Covode.recordClassIndex(92799);
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC26736a m138348b() {
        AbstractC26736a aVar = f178589a;
        if (aVar == null) {
            C89219l.m154710a("mAppUpdateInfo");
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m138344a() {
        Activity j = C17873f.m33102j();
        if (j != null) {
            Dialog b = m138347b(j);
            if (!b.isShowing()) {
                b.show();
            }
        }
    }

    /* renamed from: c */
    private static boolean m138350c() {
        int i;
        int i2;
        if (C36145b.m73641b().mo63267b(C17867d.m33078a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE") != ((int) C17867d.m33084e())) {
            C36145b.m73641b().mo63262a(C17867d.m33078a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE", (int) C17867d.m33084e());
            C36145b.m73641b().mo63263a(C17867d.m33078a(), "KEY_LAST_CHECK_UPDATE_TIME", 0L);
            C36145b.m73641b().mo63262a(C17867d.m33078a(), "KEY_SHOW_UPDATE_TIMES", 0);
            C36145b.m73641b().mo63266a(C17867d.m33078a(), "KEY_DOWNLOADED_FOR_UPDATE", false);
            C36145b.m73641b().mo63266a(C17867d.m33078a(), "KEY_UPDATE_IN_PROGRESS", false);
        }
        int b = C36145b.m73641b().mo63267b(C17867d.m33078a(), "KEY_SHOW_UPDATE_TIMES");
        f178596h = C36145b.m73641b().mo63272d(C17867d.m33078a(), "KEY_LAST_CHECK_UPDATE_TIME");
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            FlexibleUpdateStrategy flexibleUpdateStrategy = iESSettingsProxy.getFlexibleUpdateStrategy();
            C89219l.m154716b(flexibleUpdateStrategy, "");
            Integer allowShowAllTimes = flexibleUpdateStrategy.getAllowShowAllTimes();
            C89219l.m154716b(allowShowAllTimes, "");
            i2 = allowShowAllTimes.intValue();
            IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy2, "");
            FlexibleUpdateStrategy flexibleUpdateStrategy2 = iESSettingsProxy2.getFlexibleUpdateStrategy();
            C89219l.m154716b(flexibleUpdateStrategy2, "");
            Integer intervalDays = flexibleUpdateStrategy2.getIntervalDays();
            C89219l.m154716b(intervalDays, "");
            i = intervalDays.intValue();
        } catch (C16041a unused) {
            i = 0;
            i2 = 0;
        }
        if (b >= i2 || System.currentTimeMillis() - f178596h < ((long) i) * 86400000) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static Context m138349c(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static void m138345a(Activity activity) {
        C89219l.m154721d(activity, "");
        if (Build.VERSION.SDK_INT >= 21 && C36145b.m73641b().mo63270b(C17867d.m33078a(), "KEY_UPDATE_IN_PROGRESS", false)) {
            m138346a(activity, "");
        }
    }

    /* renamed from: b */
    public static Dialog m138347b(Activity activity) {
        C89219l.m154721d(activity, "");
        C17197a.C17200a aVar = new C17197a.C17200a(activity);
        C17197a.C17200a a = aVar.mo27189a(R.string.cmz);
        a.f41071b = activity.getString(R.string.cmy);
        a.mo27190a(R.string.cmu, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC79593b.f178599a, false).mo27195b(R.string.dhl, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC79594c.f178600a, false);
        Dialog c = aVar.mo27193a().mo27185c();
        c.setCanceledOnTouchOutside(false);
        C89219l.m154716b(c, "");
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ug.c.a$d */
    public static final class C79595d implements AbstractC27057b {

        /* renamed from: a */
        public static final C79595d f178601a = new C79595d();

        static {
            Covode.recordClassIndex(92803);
        }

        C79595d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.android.play.core.p1964c.AbstractC26967a
        /* renamed from: a */
        public final /* synthetic */ void mo35005a(InstallState installState) {
            Activity activity;
            if (installState.mo44752a() == 11) {
                C36145b.m73641b().mo63266a(C17867d.m33078a(), "KEY_DOWNLOADED_FOR_UPDATE", true);
                C36145b.m73641b().mo63266a(C17867d.m33078a(), "KEY_UPDATE_IN_PROGRESS", false);
                C79591a.f178594f.mo123140a("app_update_download_finish");
                if (C17873f.f42636l) {
                    AbstractC26739b bVar = C79591a.f178590b;
                    if (bVar != null) {
                        bVar.mo44404b();
                    }
                } else if (!C79591a.f178592d) {
                    C79591a.f178592d = true;
                    WeakReference<Activity> weakReference = C79591a.f178593e;
                    if (weakReference != null && (activity = weakReference.get()) != null) {
                        C89219l.m154716b(activity, "");
                        if (activity.isFinishing()) {
                            C79591a.m138344a();
                            return;
                        }
                        Dialog b = C79591a.m138347b(activity);
                        if (!b.isShowing()) {
                            b.show();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.c.a$a */
    static final class C79592a<ResultT> implements AbstractC27060b {

        /* renamed from: a */
        final /* synthetic */ boolean f178597a;

        /* renamed from: b */
        final /* synthetic */ Activity f178598b;

        static {
            Covode.recordClassIndex(92800);
        }

        C79592a(boolean z, Activity activity) {
            this.f178597a = z;
            this.f178598b = activity;
        }

        @Override // com.google.android.play.core.tasks.AbstractC27060b
        /* renamed from: a */
        public final /* synthetic */ void mo35009a(Object obj) {
            AbstractC26736a aVar = (AbstractC26736a) obj;
            if (!this.f178597a) {
                C36145b.m73641b().mo63263a(C17867d.m33078a(), "KEY_LAST_CHECK_UPDATE_TIME", System.currentTimeMillis());
            }
            C89219l.m154716b(aVar, "");
            C79591a.f178589a = aVar;
            if (C79591a.m138348b().mo44389c() == 2) {
                if (C79591a.m138348b().mo44386a(AbstractC26741d.m53104c().mo44409b()) != null) {
                    C79591a.f178594f.mo123140a("app_update_toast_show");
                    if (!this.f178597a) {
                        C36145b.m73641b().mo63262a(C17867d.m33078a(), "KEY_SHOW_UPDATE_TIMES", C36145b.m73641b().mo63267b(C17867d.m33078a(), "KEY_SHOW_UPDATE_TIMES") + 1);
                    }
                    C36145b.m73641b().mo63266a(C17867d.m33078a(), "KEY_UPDATE_IN_PROGRESS", true);
                    AbstractC26739b bVar = C79591a.f178590b;
                    if (bVar != null) {
                        bVar.mo44403a(C79591a.m138348b(), this.f178598b);
                    }
                }
            } else if (C79591a.m138348b().mo44389c() == 3) {
                if (!this.f178597a) {
                    C36145b.m73641b().mo63262a(C17867d.m33078a(), "KEY_SHOW_UPDATE_TIMES", C36145b.m73641b().mo63267b(C17867d.m33078a(), "KEY_SHOW_UPDATE_TIMES") + 1);
                }
                if (!C36145b.m73641b().mo63270b(C17867d.m33078a(), "KEY_DOWNLOADED_FOR_UPDATE", false)) {
                    if (this.f178597a) {
                        new C23144b(this.f178598b).mo37640e(R.string.t2).mo37637b();
                    }
                    AbstractC26739b bVar2 = C79591a.f178590b;
                    if (bVar2 != null) {
                        bVar2.mo44403a(C79591a.m138348b(), this.f178598b);
                    }
                } else if (this.f178598b.isFinishing()) {
                    C79591a.m138344a();
                } else {
                    Dialog b = C79591a.m138347b(this.f178598b);
                    if (!b.isShowing()) {
                        b.show();
                    }
                }
            } else {
                if (this.f178597a) {
                    new C23144b(this.f178598b).mo37640e(R.string.ctx).mo37637b();
                }
                AbstractC26739b bVar3 = C79591a.f178590b;
                if (bVar3 != null) {
                    bVar3.mo44405b(C79591a.f178591c);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79596d
    /* renamed from: a */
    public final void mo123140a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a(str, new C33744d().mo59983a(StringSet.type, "flexible").f79943a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ug.c.a$b */
    public static final class DialogInterface$OnClickListenerC79593b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC79593b f178599a = new DialogInterface$OnClickListenerC79593b();

        static {
            Covode.recordClassIndex(92801);
        }

        DialogInterface$OnClickListenerC79593b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C79591a.f178594f.mo123140a("app_update_install");
            AbstractC26739b bVar = C79591a.f178590b;
            if (bVar != null) {
                bVar.mo44404b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ug.c.a$c */
    public static final class DialogInterface$OnClickListenerC79594c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC79594c f178600a = new DialogInterface$OnClickListenerC79594c();

        static {
            Covode.recordClassIndex(92802);
        }

        DialogInterface$OnClickListenerC79594c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC26739b bVar = C79591a.f178590b;
            if (bVar != null) {
                bVar.mo44405b(C79591a.f178591c);
            }
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m138346a(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        if (f178590b == null) {
            f178590b = C26740c.m53103a(m138349c(activity));
        }
        C79595d dVar = C79595d.f178601a;
        f178591c = dVar;
        AbstractC26739b bVar = f178590b;
        if (bVar != null) {
            bVar.mo44402a(dVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79596d
    /* renamed from: a */
    public final void mo123139a(Activity activity, boolean z, String str) {
        AbstractC27062d<AbstractC26736a> a;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        if (Build.VERSION.SDK_INT >= 21) {
            if (!z) {
                if (!f178595g) {
                    IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                    C89219l.m154716b(iESSettingsProxy, "");
                    Integer inappUpdateSwitchStrategy = iESSettingsProxy.getInappUpdateSwitchStrategy();
                    if (inappUpdateSwitchStrategy == null || inappUpdateSwitchStrategy.intValue() != 3) {
                        IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
                        C89219l.m154716b(iESSettingsProxy2, "");
                        Integer inappUpdateSwitchStrategy2 = iESSettingsProxy2.getInappUpdateSwitchStrategy();
                        if (inappUpdateSwitchStrategy2 == null || inappUpdateSwitchStrategy2.intValue() != 1) {
                            return;
                        }
                    }
                    Boolean a2 = C49907s.m93685a();
                    C89219l.m154716b(a2, "");
                    if (a2.booleanValue()) {
                        C36145b.m73641b().mo63263a(C17867d.m33078a(), "KEY_LAST_CHECK_UPDATE_TIME", System.currentTimeMillis());
                        C36145b.m73641b().mo63262a(C17867d.m33078a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE", (int) C17867d.m33084e());
                        return;
                    } else if (!m138350c()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            f178595g = true;
            f178593e = new WeakReference<>(activity);
            m138346a(activity, str);
            AbstractC26739b bVar = f178590b;
            if (bVar != null && (a = bVar.mo44401a()) != null) {
                a.mo44770a(new C79592a(z, activity));
            }
        }
    }
}
