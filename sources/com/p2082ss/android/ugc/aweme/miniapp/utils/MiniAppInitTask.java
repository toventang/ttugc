package com.p2082ss.android.ugc.aweme.miniapp.utils;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.miniapp.p3441d.C59272a;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59306c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.utils.MiniAppInitTask */
public class MiniAppInitTask implements AbstractC58264w {

    /* renamed from: a */
    private EnumC58151ae f135511a;

    static {
        Covode.recordClassIndex(69662);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
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
        return this.f135511a;
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

    public MiniAppInitTask(EnumC58151ae aeVar) {
        this.f135511a = aeVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            IPluginService d = AabPluginServiceImpl.m114069d();
            boolean z = false;
            if (d != null && d.mo28892b() && d.mo28890a("com.ss.android.ugc.i18n.miniapp") && d.mo28890a("com.ss.android.ugc.aweme.rn_kit")) {
                z = true;
            }
            if (!z) {
                C59306c.m109001a("com.ss.android.ugc.i18n.miniapp", Arrays.asList("com.ss.android.ugc.aweme.rn_kit"), true, null);
            }
            IMiniAppService a = C59320c.C59324a.f135560a.mo96989a();
            if (a != null && C59272a.m108980a()) {
                a.initMiniApp(null);
            }
        }
    }
}
