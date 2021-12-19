package com.p2082ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.bytedance.business.base.IBusinessToolsService;
import com.bytedance.business.base.jira.IGoToFeedbackListener;
import com.bytedance.business.base.jira.IOnGetMoreParamsListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.util.e */
public final class C80127e {

    /* renamed from: a */
    static IBusinessToolsService f179535a;

    /* renamed from: b */
    private static IOnGetMoreParamsListener f179536b = C80128f.f179538a;

    /* renamed from: c */
    private static IGoToFeedbackListener f179537c = C80129g.f179539a;

    static {
        Covode.recordClassIndex(93371);
    }

    /* renamed from: a */
    public static IBusinessToolsService m138893a() {
        if (f179535a == null) {
            try {
                f179535a = (IBusinessToolsService) ServiceManager.get().getService(IBusinessToolsService.class);
            } catch (IllegalArgumentException unused) {
                f179535a = null;
            }
        }
        return f179535a;
    }

    /* renamed from: b */
    public static boolean m138894b() {
        if (TextUtils.equals(C17867d.f42595s, "business") || TextUtils.equals(C17867d.f42595s, "release_outer_test")) {
            return true;
        }
        return false;
    }
}
