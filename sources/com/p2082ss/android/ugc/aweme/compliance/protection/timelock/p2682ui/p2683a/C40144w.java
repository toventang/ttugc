package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34708a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.p2677b.C40090a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.w */
public class C40144w extends AbstractC40132m {

    /* renamed from: c */
    TextView f94248c;

    /* renamed from: d */
    TuxTextView f94249d;

    /* renamed from: e */
    private String f94250e;

    static {
        Covode.recordClassIndex(47927);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40132m
    /* renamed from: b */
    public final void mo68126b() {
        super.mo68126b();
        mo69283d();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40132m
    /* renamed from: d */
    public final void mo69283d() {
        if (getActivity() != null) {
            getActivity().finish();
        }
        mo69269a(this.f94203a);
        C34708a<Boolean> a = C40106a.m81124a();
        if (a != null) {
            Boolean.valueOf(true);
            a.mo61382a();
        } else if (!TextUtils.equals(this.f94250e, "logout") && !TextUtils.equals(this.f94250e, "add_account") && !TextUtils.equals(this.f94250e, "switch_account")) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.ge9).mo123053a();
            SharePrefCache.inst().getLastUnlockTime().mo59940b(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo69286e() {
        getActivity().finish();
        mo69269a(this.f94203a);
        C34708a<Boolean> a = C40106a.m81124a();
        if (a != null) {
            Boolean.valueOf(true);
            a.mo61382a();
            return;
        }
        new C79459a(C17867d.m33078a()).mo123050a(R.string.ge9).mo123053a();
        SharePrefCache.inst().getLastUnlockTime().mo59940b(Long.valueOf(System.currentTimeMillis()));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j
    /* renamed from: a */
    public final void mo69270a(String str) {
        if (FamilyPiaringManager.m81048a() == IFamilyPairingService.EnumC39276a.CHILD) {
            FamilyPairingApi.f94156b.verifyPassword(C40090a.m81076a(str)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C40146x(this), new C40147y(this));
            return;
        }
        mo69282b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40120j, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40132m, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        this.f94248c = (TextView) view.findViewById(R.id.f82);
        this.f94249d = (TuxTextView) view.findViewById(R.id.f8o);
        super.onViewCreated(view, bundle);
        C34708a<Boolean> a = C40106a.m81124a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = "";
        }
        this.f94250e = str;
        if (a != null) {
            boolean b = C40061a.m81022b();
            TextView textView = this.f94248c;
            if (!b) {
                i = R.string.geb;
            } else if (TextUtils.equals(this.f94250e, "add_account")) {
                i = R.string.ot;
            } else if (TextUtils.equals(this.f94250e, "switch_account")) {
                i = R.string.g92;
            } else if (!C31575b.m65865g().isLogin()) {
                i = R.string.fl0;
            } else {
                i = R.string.gea;
            }
            textView.setText(getString(i));
            TuxTextView tuxTextView = this.f94249d;
            if (b) {
                i2 = R.string.gee;
            } else {
                i2 = R.string.gef;
            }
            tuxTextView.setText(getString(i2));
            this.f94249d.mo37697a(26.0f);
            ImageView imageView = (ImageView) view.findViewById(R.id.ei3);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40144w.View$OnClickListenerC401451 */

                static {
                    Covode.recordClassIndex(47928);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (C40144w.this.f94203a != null) {
                        C40144w wVar = C40144w.this;
                        wVar.mo69269a(wVar.f94203a);
                    }
                    if (C40144w.this.getActivity() != null) {
                        C40144w.this.getActivity().finish();
                    }
                }
            });
            return;
        }
        this.f94248c.setText(getString(R.string.gec, String.valueOf(C40061a.m81023c())));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.u9, viewGroup, false);
    }
}
