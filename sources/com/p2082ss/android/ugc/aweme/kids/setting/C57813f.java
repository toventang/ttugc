package com.p2082ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.f */
public final class C57813f implements AbstractC57982o {

    /* renamed from: a */
    private final Activity f131852a;

    static {
        Covode.recordClassIndex(67817);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final String mo95127a() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: b */
    public final Activity mo95130b() {
        return this.f131852a;
    }

    public C57813f(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f131852a = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final CommonItemView mo95126a(View view) {
        C89219l.m154721d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.ahk);
        C89219l.m154716b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final void mo95128a(CommonItemView commonItemView) {
        C89219l.m154721d(commonItemView, "");
        SmartRouter.buildRoute(this.f131852a, "aweme://setting/datasaver").open();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final void mo95129a(String str, String str2, Boolean bool) {
        C89219l.m154721d(str, "");
        AbstractC57982o.C57983a.m104792a(this, str, str2, bool, (Boolean) null);
    }
}
