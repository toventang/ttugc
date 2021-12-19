package com.p2082ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p;
import com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41266ac;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.AbstractC47448c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.service.AbstractC59133a;
import com.p2082ss.android.ugc.aweme.p3060i.AbstractC53432c;
import com.p2082ss.android.ugc.aweme.p4071t.AbstractC77721c;
import com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils */
public class BusinessComponentServiceUtils {
    private static volatile IBusinessComponentService sBusinessComponentService;

    static {
        Covode.recordClassIndex(79602);
    }

    public static AbstractC53432c getAppStateReporter() {
        return getBusinessComponentService().getAppStateReporter();
    }

    public static AbstractC77721c getBusinessBridgeService() {
        return getBusinessComponentService().getBusinessBridgeService();
    }

    private static IBusinessComponentService getBusinessComponentService() {
        if (sBusinessComponentService == null) {
            sBusinessComponentService = BusinessComponentServiceImpl.createIBusinessComponentServicebyMonsterPlugin(false);
        }
        return sBusinessComponentService;
    }

    public static AbstractC41266ac getDetailPageOperatorProvider() {
        return getBusinessComponentService().getDetailPageOperatorProvider();
    }

    public static AbstractC77352b getLiveAllService() {
        return getBusinessComponentService().getLiveAllService();
    }

    public static AbstractC58619c getLiveStateManager() {
        return getBusinessComponentService().getLiveStateManager();
    }

    public static AbstractC59133a getMainHelperService() {
        return getBusinessComponentService().getMainHelperService();
    }

    public static AbstractC47448c getMediumWebViewRefHolder() {
        return getBusinessComponentService().getMediumWebViewRefHolder();
    }

    public static Class<? extends C34685e> getProfilePageClass() {
        return getBusinessComponentService().getProfilePageClass();
    }

    public static Dialog newOptionsDialog(Context context, Aweme aweme, String str) {
        return getBusinessComponentService().newOptionsDialog(context, aweme, str);
    }

    public static AbstractC59108o newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, C34700p pVar) {
        return getBusinessComponentService().newScrollSwitchHelper(context, scrollableViewPager, pVar);
    }
}
