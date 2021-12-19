package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55885e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55889f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55894g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.ImplService */
public class ImplService implements IImplService {
    static {
        Covode.recordClassIndex(64905);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService
    public boolean enableExpressionTab() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService
    public boolean isMtCase() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService
    public boolean needAwemeMsgShowFollow() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService
    public boolean needSessionListShowMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService
    public boolean isUserVerified(IMUser iMUser) {
        if (!TextUtils.isEmpty(iMUser.getCustomVerify())) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService
    public void setupStatusBar(Activity activity) {
        setStatusBarColor(activity, C0643b.m2378c(activity, R.color.nc));
        setLightStatusBar(activity);
    }

    private static void setLightStatusBar(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IImplService
    public AbstractC55867a getRelationListAdapter(boolean z) {
        if (!C80398en.m139371b()) {
            return new C55894g();
        }
        if (z) {
            return new C55885e();
        }
        return new C55889f();
    }

    public static IImplService createIImplServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(4330);
        Object a = C81908b.m141854a(IImplService.class, z);
        if (a != null) {
            IImplService iImplService = (IImplService) a;
            MethodCollector.m26664o(4330);
            return iImplService;
        }
        if (C81908b.f183246bw == null) {
            synchronized (IImplService.class) {
                try {
                    if (C81908b.f183246bw == null) {
                        C81908b.f183246bw = new ImplService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4330);
                    throw th;
                }
            }
        }
        ImplService implService = (ImplService) C81908b.f183246bw;
        MethodCollector.m26664o(4330);
        return implService;
    }

    private static void setStatusBarColor(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        C18247a.m33947a(activity, i);
    }
}
