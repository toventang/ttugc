package com.p2082ss.android.ugc.aweme.service;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.bridge.GetContactMethod;
import com.p2082ss.android.ugc.aweme.bridge.GetEOYUserInfoMethod;
import com.p2082ss.android.ugc.aweme.bridge.OpenInviteHalfDialogMethod;
import com.p2082ss.android.ugc.aweme.bridge.OpenQuestionPostPageMethod;
import com.p2082ss.android.ugc.aweme.bridge.OpenRecordFromQaMethod;
import com.p2082ss.android.ugc.aweme.bridge.OpenVideoDetailMethod;
import com.p2082ss.android.ugc.aweme.bridge.RequestBarrageListMethod;
import com.p2082ss.android.ugc.aweme.bridge.RequestQuestionListMethod;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.C68719x;
import com.p2082ss.android.ugc.aweme.settings.C68740f;
import com.p2082ss.android.ugc.aweme.util.C80132i;
import com.p2082ss.android.ugc.aweme.util.C80138l;
import com.p2082ss.android.ugc.aweme.view.C81242f;
import java.util.Iterator;
import java.util.List;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.service.EOYServiceImpl */
public final class EOYServiceImpl implements IEOYService {
    static {
        Covode.recordClassIndex(79514);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IEOYService
    /* renamed from: a */
    public final String mo106955a() {
        if (!C68719x.m121152a()) {
            return null;
        }
        return C68740f.m121173a("applink", "click_link");
    }

    /* renamed from: b */
    public static IEOYService m120048b() {
        MethodCollector.m26663i(6607);
        Object a = C81908b.m141854a(IEOYService.class, false);
        if (a != null) {
            IEOYService iEOYService = (IEOYService) a;
            MethodCollector.m26664o(6607);
            return iEOYService;
        }
        if (C81908b.f183339dj == null) {
            synchronized (IEOYService.class) {
                try {
                    if (C81908b.f183339dj == null) {
                        C81908b.f183339dj = new EOYServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6607);
                    throw th;
                }
            }
        }
        EOYServiceImpl eOYServiceImpl = (EOYServiceImpl) C81908b.f183339dj;
        MethodCollector.m26664o(6607);
        return eOYServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IEOYService
    /* renamed from: a */
    public final boolean mo106960a(TextView textView) {
        if (textView == null) {
            return false;
        }
        return C80138l.m138903a(textView);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IEOYService
    /* renamed from: b */
    public final void mo106962b(String str) {
        C89219l.m154721d(str, "");
        if (C68719x.m121152a()) {
            C39162r.m79462a("eoy_banner_show", C89387v.m154943a(str, "enter_from"));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IEOYService
    /* renamed from: a */
    public final List<AbstractC16183k> mo106956a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        if (!C68719x.m121152a()) {
            return C89086z.INSTANCE;
        }
        return C89070n.m154525d(new GetContactMethod(bVar), new GetEOYUserInfoMethod(bVar), new OpenInviteHalfDialogMethod(bVar), new OpenQuestionPostPageMethod(bVar), new OpenVideoDetailMethod(bVar), new OpenRecordFromQaMethod(bVar), new RequestQuestionListMethod(bVar), new RequestBarrageListMethod(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IEOYService
    /* renamed from: a */
    public final boolean mo106961a(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        Iterator<T> it = C68719x.m121154c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89361p.m154908a((CharSequence) str, (CharSequence) next, false)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IEOYService
    /* renamed from: a */
    public final boolean mo106958a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (!C68719x.m121152a() || !C89219l.m154714a((Object) Uri.parse(str).getQueryParameter("_is_eoy"), (Object) "1")) {
            return false;
        }
        SmartRouter.buildRoute(context, C68740f.m121173a("chat", "click_message")).open();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IEOYService
    /* renamed from: a */
    public final boolean mo106959a(ViewGroup viewGroup, String str) {
        MethodCollector.m26663i(6605);
        C89219l.m154721d(str, "");
        if (!C68719x.m121152a()) {
            MethodCollector.m26664o(6605);
            return false;
        } else if (viewGroup == null) {
            MethodCollector.m26664o(6605);
            return false;
        } else {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewGroup.getChildAt(i) instanceof C81242f) {
                    MethodCollector.m26664o(6605);
                    return false;
                }
            }
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            C81242f fVar = new C81242f(context, (byte) 0);
            fVar.setEnterFrom(str);
            viewGroup.addView(fVar, 0, new ViewGroup.LayoutParams(-1, -2));
            MethodCollector.m26664o(6605);
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IEOYService
    /* renamed from: a */
    public final void mo106957a(boolean z, TextView textView, TextView textView2, View view) {
        String url;
        C89219l.m154721d(textView, "");
        C89219l.m154721d(textView2, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(textView2, "");
        C89219l.m154721d(view, "");
        C80138l.m138903a(textView2);
        if (C68719x.m121152a()) {
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            User curUser = e.getCurUser();
            C89219l.m154716b(curUser, "");
            ProfileBadgeStruct profileBadge = curUser.getProfileBadge();
            if (profileBadge != null && (url = profileBadge.getUrl()) != null && url.length() > 0) {
                view.setVisibility(0);
                ViewParent parent = textView.getParent();
                if (!(parent instanceof View)) {
                    parent = null;
                }
                View view2 = (View) parent;
                if (view2 != null) {
                    view2.setOnClickListener(new C80132i.View$OnClickListenerC80133a(z));
                }
            }
        }
    }
}
