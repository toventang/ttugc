package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34710c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.C40104a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.q */
public class C40136q extends AbstractC40114f {

    /* renamed from: d */
    private TuxTextCell f94235d;

    /* renamed from: e */
    private TuxTextCell f94236e;

    /* renamed from: j */
    private TuxTextCell f94237j;

    /* renamed from: k */
    private int f94238k;

    static {
        Covode.recordClassIndex(47919);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40114f
    /* renamed from: a */
    public final int mo69241a() {
        return R.layout.uf;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo69284b() {
        C39162r.m79460a("close_time_lock", new C33744d().f79943a);
        if (mo69265d()) {
            mo69262a(0);
            return;
        }
        Fragment b = C40135p.m81186b(1);
        C34710c.m70888a().mo61386a("TimeLockEnterFragmentV2").mo61381a(b).mo61383a(this, new AbstractC34709b() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40136q.C401371 */

            static {
                Covode.recordClassIndex(47920);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
            /* renamed from: a */
            public final void mo61385a() {
                ActivityC0945e activity = C40136q.this.getActivity();
                C40104a aVar = C40074a.f94127b;
                if (aVar != null) {
                    aVar.setTimeLockSelfInMin(0);
                }
                C39162r.m79460a("close_time_lock_finish", new C33744d().f79943a);
                new C79459a(C17867d.m33078a()).mo123050a(R.string.gdp).mo123053a();
                if (activity != null) {
                    C40106a.m81130b(activity, 0);
                }
                C40074a.m81038a(C40074a.f94127b);
            }
        });
        mo69263a(b);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40114f
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f94235d = (TuxTextCell) view.findViewById(R.id.ehy);
        this.f94236e = (TuxTextCell) view.findViewById(R.id.ehz);
        this.f94237j = (TuxTextCell) view.findViewById(R.id.ehx);
        if (mo69265d()) {
            this.f94238k = ((TimeLockOptionViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class)).f94261a.getValue().f94225b;
        } else {
            this.f94238k = C40074a.m81041d();
        }
        this.f94235d.setTitle(getString(R.string.gdc, Integer.valueOf(this.f94238k)));
        this.f94236e.setTitle(getString(R.string.brg));
        this.f94195b.setOnClickListener(new View$OnClickListenerC40138r(this));
        if (mo69265d()) {
            this.f94194a.setText(getString(R.string.c3q));
            this.f94235d.setTitle(getString(R.string.dmq, Integer.valueOf(this.f94238k)));
            this.f94236e.setTitle(getString(R.string.brg));
            this.f94237j.setVisibility(0);
            this.f94237j.setTitle(getString(R.string.brh));
            String str = mo69264c().getValue().f94263b.f94266c;
            if (!TextUtils.isEmpty(str)) {
                this.f94195b.setText(getString(R.string.bre, str));
                return;
            }
            this.f94195b.setText(getString(R.string.brd));
        }
    }
}
