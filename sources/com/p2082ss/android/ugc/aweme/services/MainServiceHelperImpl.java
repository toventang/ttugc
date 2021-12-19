package com.p2082ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.p3070im.C53588a;
import com.p2082ss.android.ugc.aweme.p3070im.C53590b;
import com.p2082ss.android.ugc.aweme.p3070im.p3071a.C53589a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56255h;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceHelperImpl */
public final class MainServiceHelperImpl implements IMainServiceHelper {
    static {
        Covode.recordClassIndex(79686);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper
    public final void goToTipsPage() {
        IMUnder16ProxyImpl.m102047n().mo93026h();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper
    public final boolean isChatFunOfflineUnder16() {
        return C53589a.m98814a();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper
    public final boolean shouldRedictToTipsPage() {
        return C53589a.m98815b();
    }

    public final boolean shouldHideYellowDot() {
        return IMUnder16ProxyImpl.m102047n().mo93020b();
    }

    public final Pair<Boolean, String> getBoeConfig() {
        Boolean valueOf = Boolean.valueOf(C58939a.C58940a.f134171a.f134170a.enableBoe());
        LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
        C89219l.m154716b(localTestApi, "");
        return new Pair<>(valueOf, localTestApi.getBoeLane());
    }

    public static IMainServiceHelper createIMainServiceHelperbyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(8754);
        Object a = C81908b.m141854a(IMainServiceHelper.class, z);
        if (a != null) {
            IMainServiceHelper iMainServiceHelper = (IMainServiceHelper) a;
            MethodCollector.m26664o(8754);
            return iMainServiceHelper;
        }
        if (C81908b.f183349dt == null) {
            synchronized (IMainServiceHelper.class) {
                try {
                    if (C81908b.f183349dt == null) {
                        C81908b.f183349dt = new MainServiceHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8754);
                    throw th;
                }
            }
        }
        MainServiceHelperImpl mainServiceHelperImpl = (MainServiceHelperImpl) C81908b.f183349dt;
        MethodCollector.m26664o(8754);
        return mainServiceHelperImpl;
    }

    public final void commentReplyToIM(Context context, Comment comment, UrlModel urlModel, String str, int i, String str2, String str3) {
        C89219l.m154721d(context, "");
        C56255h hVar = new C56255h();
        hVar.f128301a = urlModel;
        hVar.f128308h = C53588a.m98833a(comment.getUser());
        hVar.f128303c = str;
        hVar.f128302b = comment.getCid();
        hVar.f128306f = i;
        hVar.f128304d = str2;
        hVar.f128305e = str3;
        hVar.f128307g = comment.getText();
        Dialog commentReply = IMService.createIIMServicebyMonsterPlugin(false).commentReply(context, hVar);
        if (commentReply != null && (context instanceof MainActivity)) {
            TabChangeManager.C59002a.m108439a((ActivityC0945e) context).mo96531a(new C53590b(new WeakReference(commentReply)));
        }
    }
}
