package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2680c.p2681a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40108a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.c.a.a */
public class C40100a extends AbstractC40108a {

    /* renamed from: a */
    TuxTextCell f94171a;

    /* renamed from: b */
    TuxTextCell f94172b;

    static {
        Covode.recordClassIndex(47877);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40108a
    /* renamed from: c */
    public final int mo69239c() {
        return R.layout.uc;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40108a
    /* renamed from: d */
    public final void mo69240d() {
        C39162r.m79460a("open_teen_mode", new C33744d().f79943a);
        super.mo69240d();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40108a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        this.f94171a = (TuxTextCell) view.findViewById(R.id.efd);
        this.f94172b = (TuxTextCell) view.findViewById(R.id.efe);
        super.onViewCreated(view, bundle);
        this.f94171a.setTitle(getString(R.string.fkk));
        this.f94172b.setTitle(getString(R.string.fkl));
        if (mo69259h()) {
            String str = mo69258g().getValue().f94263b.f94266c;
            if (!TextUtils.isEmpty(str)) {
                this.f94185c.setText(getString(R.string.bra, str));
            } else {
                this.f94185c.setText(getString(R.string.br_));
            }
            this.f94171a.setTitle(getString(R.string.fkk));
            this.f94172b.setTitle(getString(R.string.brb));
        }
    }
}
