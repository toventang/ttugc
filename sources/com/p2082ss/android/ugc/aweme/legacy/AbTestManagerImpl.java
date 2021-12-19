package com.p2082ss.android.ugc.aweme.legacy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68021bg;
import com.p2082ss.android.ugc.aweme.setting.IAbTestManager;
import com.p2082ss.android.ugc.aweme.settingsrequest.C68765a;

/* renamed from: com.ss.android.ugc.aweme.legacy.AbTestManagerImpl */
public class AbTestManagerImpl implements IAbTestManager {

    /* renamed from: a */
    private final IAbTestManager f132326a = C68765a.m121209b();

    static {
        Covode.recordClassIndex(68137);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
    public final void cG_() {
        this.f132326a.cG_();
    }

    /* renamed from: b */
    public static IAbTestManager m104980b() {
        MethodCollector.m26663i(6731);
        Object a = C81908b.m141854a(IAbTestManager.class, false);
        if (a != null) {
            IAbTestManager iAbTestManager = (IAbTestManager) a;
            MethodCollector.m26664o(6731);
            return iAbTestManager;
        }
        if (C81908b.f183279cc == null) {
            synchronized (IAbTestManager.class) {
                try {
                    if (C81908b.f183279cc == null) {
                        C81908b.f183279cc = new AbTestManagerImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6731);
                    throw th;
                }
            }
        }
        AbTestManagerImpl abTestManagerImpl = (AbTestManagerImpl) C81908b.f183279cc;
        MethodCollector.m26664o(6731);
        return abTestManagerImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
    /* renamed from: a */
    public final void mo95587a(AbstractC28019l lVar) {
        this.f132326a.mo95587a(lVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
    /* renamed from: a */
    public final void mo95588a(C28022o oVar) {
        this.f132326a.mo95588a(oVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
    /* renamed from: a */
    public final void mo95589a(AbstractC68021bg bgVar) {
        this.f132326a.mo95589a(bgVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
    /* renamed from: a */
    public final void mo95590a(boolean z) {
        this.f132326a.mo95590a(z);
    }
}
