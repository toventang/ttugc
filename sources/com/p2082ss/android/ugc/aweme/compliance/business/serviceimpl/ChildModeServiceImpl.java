package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2640d.C39239a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.p2082ss.android.ugc.aweme.compliance.business.p2642b.C39309a;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2661b.C39614a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl */
public final class ChildModeServiceImpl implements IChildModeService {

    /* renamed from: a */
    private Boolean f93219a;

    static {
        Covode.recordClassIndex(47217);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    /* renamed from: c */
    public final List<String> mo68631c() {
        return C39608b.m80430p();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    /* renamed from: b */
    public final void mo68629b() {
        boolean z;
        C39614a aVar = C39608b.f93371b;
        Boolean bool = true;
        aVar.f93392d = bool;
        Keva keva = aVar.f93389a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        keva.storeBoolean("have_updated_and_checked", z);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl$a */
    static final class CallableC39521a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC39521a f93220a = new CallableC39521a();

        static {
            Covode.recordClassIndex(47218);
        }

        CallableC39521a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z = false;
            if (C34822d.m71158a(C17867d.m33078a(), C39239a.f92672a, 0).edit().putBoolean(C39239a.f92673b, false).commit() && C39239a.m79628b()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl$c */
    static final class CallableC39523c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC39523c f93223a = new CallableC39523c();

        static {
            Covode.recordClassIndex(47220);
        }

        CallableC39523c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z = false;
            if (C34822d.m71158a(C17867d.m33078a(), C39239a.f92672a, 0).edit().putBoolean(C39239a.f92673b, true).commit() && C39239a.m79626a()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: e */
    public static IChildModeService m80232e() {
        MethodCollector.m26663i(10277);
        Object a = C81908b.m141854a(IChildModeService.class, false);
        if (a != null) {
            IChildModeService iChildModeService = (IChildModeService) a;
            MethodCollector.m26664o(10277);
            return iChildModeService;
        }
        if (C81908b.f183146aB == null) {
            synchronized (IChildModeService.class) {
                try {
                    if (C81908b.f183146aB == null) {
                        C81908b.f183146aB = new ChildModeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10277);
                    throw th;
                }
            }
        }
        ChildModeServiceImpl childModeServiceImpl = (ChildModeServiceImpl) C81908b.f183146aB;
        MethodCollector.m26664o(10277);
        return childModeServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    /* renamed from: a */
    public final boolean mo68628a() {
        Boolean valueOf;
        C39614a aVar = C39608b.f93371b;
        if (aVar.f93392d != null) {
            valueOf = aVar.f93392d;
        } else {
            valueOf = Boolean.valueOf(aVar.f93389a.getBoolean("have_updated_and_checked", false));
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    /* renamed from: d */
    public final boolean mo68633d() {
        if (this.f93219a == null) {
            this.f93219a = Boolean.valueOf(Keva.getRepo("compliance_setting").getBoolean("update_and_check_new_kids_mode", false));
        }
        Boolean bool = this.f93219a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl$b */
    static final class C39522b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ ChildModeServiceImpl f93221a;

        /* renamed from: b */
        final /* synthetic */ Context f93222b;

        static {
            Covode.recordClassIndex(47219);
        }

        C39522b(ChildModeServiceImpl childModeServiceImpl, Context context) {
            this.f93221a = childModeServiceImpl;
            this.f93222b = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (iVar != null) {
                Object d = iVar.mo5545d();
                C89219l.m154716b(d, "");
                if (((Boolean) d).booleanValue()) {
                    ChildModeServiceImpl.m80231d(this.f93222b);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl$d */
    static final class C39524d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ ChildModeServiceImpl f93224a;

        /* renamed from: b */
        final /* synthetic */ Context f93225b;

        static {
            Covode.recordClassIndex(47221);
        }

        C39524d(ChildModeServiceImpl childModeServiceImpl, Context context) {
            this.f93224a = childModeServiceImpl;
            this.f93225b = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (iVar != null) {
                Object d = iVar.mo5545d();
                C89219l.m154716b(d, "");
                if (((Boolean) d).booleanValue()) {
                    ChildModeServiceImpl.m80231d(this.f93225b);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    /* renamed from: a */
    public final void mo68626a(Context context) {
        C89219l.m154721d(context, "");
        C1731i.m5640b(CallableC39523c.f93223a, C1731i.f5562a).mo5534a(new C39524d(this, context), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    /* renamed from: b */
    public final void mo68630b(Context context) {
        C89219l.m154721d(context, "");
        C1731i.m5640b(CallableC39521a.f93220a, C1731i.f5562a).mo5534a(new C39522b(this, context), C1731i.f5564c, null);
    }

    /* renamed from: d */
    public static void m80231d(Context context) {
        C89219l.m154721d(context, "");
        String packageName = context.getPackageName();
        C89219l.m154716b(packageName, "");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            C84349a.m145093a(launchIntentForPackage, context);
            context.startActivity(launchIntentForPackage);
            Activity[] activityStack = ActivityStack.getActivityStack();
            C89219l.m154716b(activityStack, "");
            for (Activity activity : C89064i.m154505f(activityStack)) {
                C89219l.m154716b(activity, "");
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
            Runtime.getRuntime().exit(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    /* renamed from: c */
    public final void mo68632c(Context context) {
        Boolean valueOf;
        if (context != null) {
            C39614a aVar = C39608b.f93371b;
            boolean z = false;
            if (aVar.f93391c != null) {
                valueOf = aVar.f93391c;
            } else {
                valueOf = Boolean.valueOf(aVar.f93389a.getBoolean("update_and_check_new_kids_mode", false));
            }
            if (valueOf == null || !valueOf.booleanValue()) {
                C39614a aVar2 = C39608b.f93371b;
                Boolean bool = true;
                aVar2.f93391c = bool;
                Keva keva = aVar2.f93389a;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                keva.storeBoolean("update_and_check_new_kids_mode", z);
                if (C80580in.m139687c()) {
                    C39223a.m79603q().mo68626a(context);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    /* renamed from: a */
    public final void mo68627a(boolean z, Runnable runnable) {
        C1731i.m5640b(new C39309a.CallableC39310a(z, runnable), C1731i.f5562a);
    }
}
