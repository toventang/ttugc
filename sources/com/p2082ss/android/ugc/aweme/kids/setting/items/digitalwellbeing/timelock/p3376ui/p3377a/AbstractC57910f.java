package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.p3375a.C57879a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.f */
public abstract class AbstractC57910f extends AbstractC57897c implements AbstractC57877a {

    /* renamed from: d */
    private TuxStatusView f132005d;

    /* renamed from: e */
    private C57879a f132006e;

    /* renamed from: j */
    private HashMap f132007j;

    static {
        Covode.recordClassIndex(67927);
    }

    /* renamed from: d */
    public abstract void mo95235d();

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a
    /* renamed from: a */
    public final void mo95178a() {
        m104688e();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a
    /* renamed from: b */
    public void mo95179b() {
        m104688e();
        mo95235d();
    }

    /* renamed from: e */
    private final void m104688e() {
        TuxStatusView tuxStatusView;
        if (af_() && (tuxStatusView = this.f132005d) != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C57879a aVar = this.f132006e;
        if (aVar != null) {
            aVar.f131955a = null;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f132007j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    public final void mo95234c(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxStatusView tuxStatusView = this.f132005d;
            if (tuxStatusView != null) {
                tuxStatusView.mo37867a();
            }
            TuxStatusView tuxStatusView2 = this.f132005d;
            if (tuxStatusView2 != null) {
                tuxStatusView2.setVisibility(0);
            }
            C57879a aVar = this.f132006e;
            if (aVar != null) {
                if (str == null) {
                    str = "";
                }
                aVar.mo95198a(str);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f132005d = (TuxStatusView) view.findViewById(R.id.e7i);
        C57879a aVar = new C57879a();
        this.f132006e = aVar;
        aVar.mo95197a(this);
    }
}
