package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40203j;
import com.p2082ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.p2082ss.android.ugc.aweme.contentlanguage.View$OnClickListenerC40200i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50099bb;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53446g;
import com.p2082ss.android.ugc.aweme.money.growth.C60180e;
import com.p2082ss.android.ugc.aweme.p4071t.C77717b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.util.CallableC80162t;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.aweme.utils.C80429fh;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.UgAllServiceImpl */
public class UgAllServiceImpl implements IUgAllService {
    static {
        Covode.recordClassIndex(37988);
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: a */
    public final void mo57251a() {
        C1731i.m5640b(CallableC80162t.f179602a, C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: b */
    public final void mo57256b() {
        C53446g.C53447a.f122670a.f122664b = false;
        View$OnClickListenerC40200i iVar = C40203j.C40204a.m81323a().f94398d;
        if (iVar != null) {
            iVar.mo69399b();
        }
    }

    /* renamed from: c */
    public static IUgAllService m65444c() {
        MethodCollector.m26663i(6346);
        Object a = C81908b.m141854a(IUgAllService.class, false);
        if (a != null) {
            IUgAllService iUgAllService = (IUgAllService) a;
            MethodCollector.m26664o(6346);
            return iUgAllService;
        }
        if (C81908b.f183414w == null) {
            synchronized (IUgAllService.class) {
                try {
                    if (C81908b.f183414w == null) {
                        C81908b.f183414w = new UgAllServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6346);
                    throw th;
                }
            }
        }
        UgAllServiceImpl ugAllServiceImpl = (UgAllServiceImpl) C81908b.f183414w;
        MethodCollector.m26664o(6346);
        return ugAllServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: c */
    public final void mo57258c(Context context) {
        C80428fg.m139435c(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: b */
    public final void mo57257b(Context context) {
        C40203j.C40204a.m81323a().mo69407b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: d */
    public final boolean mo57259d(Context context) {
        return C80429fh.m139432a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: a */
    public final void mo57252a(Context context) {
        new Handler(Looper.getMainLooper()).post(new RunnableC43045dk(context));
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: a */
    public final void mo57255a(String str, String str2) {
        C77717b.m135748a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: a */
    public final void mo57254a(Context context, String str) {
        C50099bb.f115642i = true;
        C60180e.m109671a(str, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.IUgAllService
    /* renamed from: a */
    public final void mo57253a(Context context, Aweme aweme) {
        View$OnClickListenerC40200i iVar;
        C40203j a = C40203j.C40204a.m81323a();
        C89219l.m154721d(context, "");
        if (a.f94398d == null || (iVar = a.f94398d) == null || !iVar.isShowing()) {
            a.mo69407b(context);
        } else if (ContentLanguageServiceImpl.m81266f().mo69375a(aweme)) {
            View$OnClickListenerC40200i iVar2 = a.f94398d;
            if (iVar2 != null) {
                iVar2.f94388c = System.currentTimeMillis();
            }
        } else {
            try {
                View$OnClickListenerC40200i iVar3 = a.f94398d;
                if (iVar3 != null) {
                    iVar3.dismiss();
                }
                a.f94396b = true;
                if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
                    IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                    C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                    User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                    C89219l.m154716b(currentUser, "");
                    currentUser.setContentLanguageDialogShown(false);
                    return;
                }
                a.f94395a.mo69424a(false);
                a.f94395a.mo69423a("");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
