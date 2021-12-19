package com.p2082ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p;
import com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41266ac;
import com.p2082ss.android.ugc.aweme.detail.operators.C41315t;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.AbstractC47448c;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.C47449d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.C59032ar;
import com.p2082ss.android.ugc.aweme.main.C59052bb;
import com.p2082ss.android.ugc.aweme.main.service.AbstractC59133a;
import com.p2082ss.android.ugc.aweme.p3060i.AbstractC53432c;
import com.p2082ss.android.ugc.aweme.p3060i.C53429a;
import com.p2082ss.android.ugc.aweme.p4071t.AbstractC77721c;
import com.p2082ss.android.ugc.aweme.p4071t.C77715a;
import com.p2082ss.android.ugc.aweme.profile.C63810k;
import com.p2082ss.android.ugc.aweme.share.DialogC69418s;
import com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessComponentServiceImpl */
public class BusinessComponentServiceImpl implements IBusinessComponentService {
    private AbstractC77721c businessBridgeService;
    private AbstractC41266ac detailPageOperatorProvider;

    static {
        Covode.recordClassIndex(79601);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public AbstractC47448c getMediumWebViewRefHolder() {
        return C47449d.f110206b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public Class<? extends C34685e> getProfilePageClass() {
        return C63810k.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public AbstractC53432c getAppStateReporter() {
        return C53429a.m98598c();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public AbstractC59133a getMainHelperService() {
        return new C59032ar();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public AbstractC77721c getBusinessBridgeService() {
        if (this.businessBridgeService == null) {
            this.businessBridgeService = new C77715a();
        }
        return this.businessBridgeService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public AbstractC41266ac getDetailPageOperatorProvider() {
        if (this.detailPageOperatorProvider == null) {
            this.detailPageOperatorProvider = new C41315t();
        }
        return this.detailPageOperatorProvider;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public AbstractC77352b getLiveAllService() {
        return LiveOuterService.m107269s().mo95832f();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public AbstractC58619c getLiveStateManager() {
        return LiveOuterService.m107269s().mo95828b();
    }

    public static IBusinessComponentService createIBusinessComponentServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(8600);
        Object a = C81908b.m141854a(IBusinessComponentService.class, z);
        if (a != null) {
            IBusinessComponentService iBusinessComponentService = (IBusinessComponentService) a;
            MethodCollector.m26664o(8600);
            return iBusinessComponentService;
        }
        if (C81908b.f183343dn == null) {
            synchronized (IBusinessComponentService.class) {
                try {
                    if (C81908b.f183343dn == null) {
                        C81908b.f183343dn = new BusinessComponentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8600);
                    throw th;
                }
            }
        }
        BusinessComponentServiceImpl businessComponentServiceImpl = (BusinessComponentServiceImpl) C81908b.f183343dn;
        MethodCollector.m26664o(8600);
        return businessComponentServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public Dialog newOptionsDialog(Context context, Aweme aweme, String str) {
        return DialogC69418s.C69419a.m122624a(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessComponentService
    public AbstractC59108o newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, C34700p pVar) {
        return new C59052bb(context, scrollableViewPager, pVar);
    }
}
