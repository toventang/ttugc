package com.p2082ss.android.ugc.aweme.p4173ug.praise.p4185b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79698c;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.p4184a.C79683a;
import com.p2082ss.android.ugc.aweme.pendant.C62766b;
import java.util.concurrent.TimeUnit;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.b.a */
public final class C79692a {

    /* renamed from: a */
    public static boolean f178810a;

    /* renamed from: b */
    public static final C79692a f178811b = new C79692a();

    private C79692a() {
    }

    static {
        Covode.recordClassIndex(92909);
    }

    /* renamed from: a */
    public static boolean m138507a() {
        C79698c cVar = new C79698c(C79684b.EnumC79686b.LIKE);
        if (cVar.f178822e == 0) {
            cVar.mo123234b(System.currentTimeMillis());
        }
        if (System.currentTimeMillis() - cVar.f178822e >= TimeUnit.DAYS.toMillis(7)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b.a$a */
    public static final class C79693a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Context f178812a;

        static {
            Covode.recordClassIndex(92910);
        }

        public C79693a(Context context) {
            this.f178812a = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            return Boolean.valueOf(C79692a.f178811b.mo123230a(this.f178812a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b.a$b */
    public static final class C79694b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Context f178813a;

        static {
            Covode.recordClassIndex(92911);
        }

        public C79694b(Context context) {
            this.f178813a = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            Boolean bool = (Boolean) iVar.mo5545d();
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                Context context = this.f178813a;
                if (context == null) {
                    C89219l.m154715b();
                }
                new C79684b(new C79697b(context, C79684b.EnumC79686b.ACTIVATION)).mo123228a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b.a$c */
    public static final class C79695c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Context f178814a;

        static {
            Covode.recordClassIndex(92912);
        }

        public C79695c(Context context) {
            this.f178814a = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            boolean z = false;
            if (C79692a.m138508a(this.f178814a, C79684b.EnumC79686b.LIKE)) {
                C79698c cVar = new C79698c(C79684b.EnumC79686b.LIKE);
                if (cVar.f178819b || cVar.f178820c) {
                    C79698c.C79699a.m138519a(C79684b.EnumC79686b.LIKE + " :Clicked the like dialog feedback or submit button");
                } else if (new C79698c(C79684b.EnumC79686b.ACTIVATION).f178820c) {
                    C79698c.C79699a.m138519a(C79684b.EnumC79686b.ACTIVATION + " :Clicked the active dialog submit button");
                } else if (C79684b.C79685a.m138506a()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b.a$d */
    public static final class C79696d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Context f178815a;

        static {
            Covode.recordClassIndex(92913);
        }

        public C79696d(Context context) {
            this.f178815a = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            Boolean bool = (Boolean) iVar.mo5545d();
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                Context context = this.f178815a;
                if (context == null) {
                    C89219l.m154715b();
                }
                new C79684b(new C79697b(context, C79684b.EnumC79686b.LIKE)).mo123228a();
                NoticeServiceImpl.m112566f().mo99375a((Bundle) null, 0);
            } else if (this.f178815a != null) {
                NoticeServiceImpl.m112566f().mo99374a(this.f178815a);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m138509a(C79684b.EnumC79686b bVar) {
        int a = C79683a.m138504a();
        if (a != 1 && (bVar != C79684b.EnumC79686b.ACTIVATION ? a != 2 : a != 0)) {
            return false;
        }
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AppStoreMessage appStoreScore = iESSettingsProxy.getAppStoreScore();
            C89219l.m154716b(appStoreScore, "");
            Integer switcher = appStoreScore.getSwitcher();
            if (switcher != null) {
                if (switcher.intValue() != 0) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (C16041a unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo123230a(Context context) {
        int i;
        if (!m138508a(context, C79684b.EnumC79686b.ACTIVATION)) {
            return false;
        }
        C79698c cVar = new C79698c(C79684b.EnumC79686b.ACTIVATION);
        if (cVar.f178819b || cVar.f178820c) {
            C79698c.C79699a.m138519a(C79684b.EnumC79686b.ACTIVATION + " :Clicked the active dialog feedback or submit button");
            return false;
        }
        C79698c cVar2 = new C79698c(C79684b.EnumC79686b.LIKE);
        if (cVar2.f178819b || cVar2.f178820c) {
            C79698c.C79699a.m138519a(C79684b.EnumC79686b.ACTIVATION + " :Clicked the like dialog feedback or submit button");
            return false;
        }
        int i2 = 7;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AppStoreMessage appStoreScore = iESSettingsProxy.getAppStoreScore();
            C89219l.m154716b(appStoreScore, "");
            Integer section = appStoreScore.getSection();
            C89219l.m154716b(section, "");
            i2 = section.intValue();
            Integer threshold = appStoreScore.getThreshold();
            C89219l.m154716b(threshold, "");
            i = threshold.intValue();
        } catch (C16041a unused) {
            i = 1;
        }
        if (context == null) {
            C89219l.m154715b();
        }
        if (!C62766b.m113131a(context, i2, i)) {
            C79698c.C79699a.m138519a(C79684b.EnumC79686b.ACTIVATION + " :not conditions " + i2 + " day " + i + " active");
            return false;
        } else if (!C79684b.C79685a.m138506a()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    static boolean m138508a(Context context, C79684b.EnumC79686b bVar) {
        if (context == null || ((context instanceof Activity) && ((Activity) context).isFinishing())) {
            C79698c.C79699a.m138519a(bVar + " :context invalid");
            return false;
        } else if (!m138509a(bVar)) {
            C79698c.C79699a.m138519a(bVar + " :switch is close，current showType：" + C79683a.m138504a());
            return false;
        } else {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                C79698c.C79699a.m138519a(bVar + " :not login");
                return false;
            }
            C79698c cVar = new C79698c(bVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - cVar.f178818a < TimeUnit.DAYS.toMillis(14)) {
                C79698c.C79699a.m138519a(bVar + " :It happened in 14 days");
                return false;
            } else if (!m138507a()) {
                C79698c.C79699a.m138519a(bVar + " :Installation time is less than 7 days");
                return false;
            } else if (TextUtils.equals(String.valueOf(C17867d.m33084e()), cVar.f178821d)) {
                C79698c.C79699a.m138519a(bVar + " :This version was shown");
                return false;
            } else {
                C79698c cVar2 = new C79698c(bVar);
                long j = 48;
                try {
                    IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                    C89219l.m154716b(iESSettingsProxy, "");
                    LikePraiseDialogInfo likePraiseDialogInfo = iESSettingsProxy.getLikePraiseDialogInfo();
                    C89219l.m154716b(likePraiseDialogInfo, "");
                    j = (long) likePraiseDialogInfo.getTwoDialogInterval().intValue();
                } catch (C16041a unused) {
                }
                if (cVar2.f178818a == 0 || Math.abs(currentTimeMillis - cVar2.f178818a) >= TimeUnit.HOURS.toMillis(j)) {
                    return true;
                }
                C79698c.C79699a.m138519a(bVar + " :Two popovers should be spaced apart " + j + " hour");
                return false;
            }
        }
    }
}
