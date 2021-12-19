package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2680c.p2681a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34710c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.EnumC40076b;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.C40091a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.C40104a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40114f;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40135p;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.c.a.b */
public class C40101b extends AbstractC40114f {

    /* renamed from: d */
    private TuxTextCell f94173d;

    /* renamed from: e */
    private TuxTextCell f94174e;

    static {
        Covode.recordClassIndex(47878);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40114f
    /* renamed from: a */
    public final int mo69241a() {
        return R.layout.ud;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo69242b() {
        C39162r.m79460a("close_teen_mode", new C33744d().f79943a);
        if (mo69265d()) {
            mo69262a(1);
            return;
        }
        Fragment b = C40135p.m81186b(1);
        C34710c.m70888a().mo61386a("TimeLockEnterFragmentV2").mo61381a(b).mo61383a(this, new AbstractC34709b() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2680c.p2681a.C40101b.C401021 */

            static {
                Covode.recordClassIndex(47879);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
            /* renamed from: a */
            public final void mo61385a() {
                C40104a aVar = C40074a.f94127b;
                if (aVar != null) {
                    aVar.setRestrictModeSelf(false);
                }
                if (C40091a.m81077a()) {
                    C40074a.m81037a(EnumC40076b.CLOSE);
                }
                C39162r.m79460a("close_teen_mode_finish", new C33744d().f79943a);
                C40061a.m81025e();
                new C79459a(C17867d.m33078a()).mo123050a(R.string.fby).mo123053a();
                C40074a.m81038a(C40074a.f94127b);
                C40061a.m81020a(null);
            }
        });
        mo69263a(b);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40114f
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f94173d = (TuxTextCell) view.findViewById(R.id.efd);
        this.f94174e = (TuxTextCell) view.findViewById(R.id.efe);
        this.f94173d.setTitle(getString(R.string.fkk));
        this.f94174e.setTitle(getString(R.string.fkm));
        this.f94195b.setOnClickListener(new View$OnClickListenerC40103c(this));
        if (mo69265d()) {
            this.f94194a.setVisibility(8);
            this.f94195b.setBackgroundResource(R.drawable.cc1);
            this.f94195b.setTextColor(C0643b.m2378c(getContext(), R.color.om));
            String str = mo69264c().getValue().f94263b.f94266c;
            if (!TextUtils.isEmpty(str)) {
                this.f94195b.setText(getString(R.string.br9, str));
            } else {
                this.f94195b.setText(getString(R.string.br8));
            }
            this.f94173d.setTitle(getString(R.string.fkk));
            this.f94174e.setTitle(getString(R.string.brb));
        }
    }
}
