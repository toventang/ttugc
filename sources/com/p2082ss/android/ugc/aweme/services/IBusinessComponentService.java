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

/* renamed from: com.ss.android.ugc.aweme.services.IBusinessComponentService */
public interface IBusinessComponentService {
    static {
        Covode.recordClassIndex(79621);
    }

    AbstractC53432c getAppStateReporter();

    AbstractC77721c getBusinessBridgeService();

    AbstractC41266ac getDetailPageOperatorProvider();

    AbstractC77352b getLiveAllService();

    AbstractC58619c getLiveStateManager();

    AbstractC59133a getMainHelperService();

    AbstractC47448c getMediumWebViewRefHolder();

    Class<? extends C34685e> getProfilePageClass();

    Dialog newOptionsDialog(Context context, Aweme aweme, String str);

    AbstractC59108o newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, C34700p pVar);
}
