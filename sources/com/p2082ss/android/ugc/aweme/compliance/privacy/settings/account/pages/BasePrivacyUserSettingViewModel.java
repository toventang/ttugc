package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39259r;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39660c;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel */
public abstract class BasePrivacyUserSettingViewModel extends BasePrivacySettingViewModel implements AbstractC90252i, AbstractC90253j {
    static {
        Covode.recordClassIndex(47588);
    }

    /* renamed from: a */
    public abstract Integer mo69143a(C39258q qVar);

    /* renamed from: a */
    public abstract void mo69144a(C39258q qVar, int i);

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(324, new RunnableC90250g(BasePrivacyUserSettingViewModel.class, "onPrivacyUserSettingsChange", C39259r.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        C80298cg.m139205b(this);
    }

    public BasePrivacyUserSettingViewModel() {
        Integer num;
        C80298cg.m139204a(this);
        C1213t<Integer> tVar = this.f93798d;
        C39258q b = C39659b.m80540b();
        if (b != null) {
            num = mo69143a(b);
        } else {
            num = null;
        }
        tVar.setValue(num);
        C39659b.m80542b(false);
    }

    @AbstractC90264r
    public final void onPrivacyUserSettingsChange(C39259r rVar) {
        C89219l.m154721d(rVar, "");
        this.f93798d.setValue(mo69143a(rVar.f92750a));
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    /* renamed from: a */
    public void mo69141a(int i, BaseResponse baseResponse) {
        C89219l.m154721d(baseResponse, "");
        super.mo69141a(i, baseResponse);
        C39258q b = C39659b.m80540b();
        if (b != null) {
            mo69144a(b, i);
            C39660c.m80544a(b);
        }
    }
}
