package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49518j;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81987b;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FeedRequestParamPreloadTask */
public final class FeedRequestParamPreloadTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68449);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        if (C46807cw.m90146c()) {
            SettingsManager.m29616a().mo25397a("network_monitor_config", C81987b.class, C49518j.f113893a);
            C39223a.m79593g().mo68663b();
            DeviceRegisterManager.getSSIDs(new LinkedHashMap());
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
            createIMainServicebyMonsterPlugin.isLimitAdTrackingEnabled();
            if (TextUtils.isEmpty(C58029j.f132250b) || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132250b = C13624l.m24489e(context);
            }
            C89219l.m154716b(C53453b.C53456a.f122693a, "");
            C53453b.m98647a(C53438a.m98618a());
        }
    }
}
