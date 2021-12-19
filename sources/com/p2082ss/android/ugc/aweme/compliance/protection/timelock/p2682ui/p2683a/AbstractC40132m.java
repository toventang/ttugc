package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2679b.C40097a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.m */
public abstract class AbstractC40132m extends AbstractC40120j implements AbstractC39236g {

    /* renamed from: c */
    private TuxStatusView f94226c;

    /* renamed from: d */
    private C40097a f94227d;

    /* renamed from: e */
    private SparseArray f94228e;

    static {
        Covode.recordClassIndex(47915);
    }

    /* renamed from: d */
    public abstract void mo69283d();

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g
    /* renamed from: a */
    public final void mo68125a() {
        mo69286e();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g
    /* renamed from: b */
    public void mo68126b() {
        mo69286e();
        mo69283d();
    }

    /* renamed from: e */
    private final void mo69286e() {
        TuxStatusView tuxStatusView;
        if (af_() && (tuxStatusView = this.f94226c) != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C40097a aVar = this.f94227d;
        if (aVar != null) {
            aVar.f94166a = null;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f94228e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final void mo69282b(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxStatusView tuxStatusView = this.f94226c;
            if (tuxStatusView != null) {
                tuxStatusView.mo37867a();
            }
            TuxStatusView tuxStatusView2 = this.f94226c;
            if (tuxStatusView2 != null) {
                tuxStatusView2.setVisibility(0);
            }
            C40097a aVar = this.f94227d;
            if (aVar != null) {
                if (str == null) {
                    str = "";
                }
                aVar.mo69237a(str);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f94226c = (TuxStatusView) view.findViewById(R.id.e7i);
        C40097a aVar = new C40097a();
        this.f94227d = aVar;
        aVar.mo69236a(this);
    }
}
