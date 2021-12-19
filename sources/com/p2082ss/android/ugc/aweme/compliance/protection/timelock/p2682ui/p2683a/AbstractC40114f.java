package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34710c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.p2676a.C40088a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.C40154a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.SetLockParamViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.f */
public abstract class AbstractC40114f extends AbstractC34586a {

    /* renamed from: a */
    protected Button f94194a;

    /* renamed from: b */
    protected Button f94195b;

    /* renamed from: c */
    protected View f94196c;

    static {
        Covode.recordClassIndex(47897);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo69241a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final LiveData<C40154a> mo69264c() {
        if (getActivity() == null) {
            return null;
        }
        return ((SetLockParamViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SetLockParamViewModel.class)).f94260a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo69265d() {
        if (mo69264c() == null || mo69264c().getValue().f94263b == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo69266e() {
        AbstractC88979t<C40088a> dynamicPassword;
        String str = "";
        if (!mo69265d()) {
            C33744d dVar = new C33744d();
            if (mo69264c() != null) {
                if (mo69264c().getValue().f94262a == 0) {
                    str = "time_lock";
                } else {
                    str = "teen_mode";
                }
            }
            C39162r.m79460a("qa_enter_change_passport", dVar.mo59983a("enter_method", str).f79943a);
            Fragment b = C40135p.m81186b(2);
            C34710c.m70888a().mo61386a("TimeLockEnterFragmentV2").mo61381a(b).mo61383a(this, new AbstractC34709b<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40114f.C401162 */

                static {
                    Covode.recordClassIndex(47899);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo61385a() {
                    AbstractC40114f.this.mo69263a(C40135p.m81185a(true));
                }
            });
            mo69263a(b);
        } else if (mo69264c() != null && mo69264c().getValue() != null && mo69264c().getValue().f94263b != null) {
            String str2 = mo69264c().getValue().f94263b.f94264a;
            String str3 = mo69264c().getValue().f94263b.f94265b;
            Context context = getContext();
            C89219l.m154721d(str2, str);
            C89219l.m154721d(str3, str);
            C89219l.m154721d(context, str);
            if (!TextUtils.isEmpty(str2) && (dynamicPassword = FamilyPairingApi.f94156b.getDynamicPassword(str2, str3)) != null) {
                C89219l.m154716b(dynamicPassword, str);
                dynamicPassword.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new FamilyPiaringManager.C40082a(context), new FamilyPiaringManager.C40083b(context));
            }
        }
    }

    /* renamed from: a */
    public final void mo69263a(Fragment fragment) {
        ((AbstractActivityC40107a) getActivity()).mo69256a(fragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69262a(int i) {
        HashMap hashMap = new HashMap();
        if (i == 1) {
            hashMap.put("teen_mode", "0");
        } else {
            hashMap.put("screen_time_management", "0");
        }
        if (mo69264c() != null && mo69264c().getValue() != null && mo69264c().getValue().f94263b != null) {
            C40154a.C40155a aVar = mo69264c().getValue().f94263b;
            AbstractC88979t<BaseResponse> a = FamilyPairingApi.m81069a(aVar.f94264a, aVar.f94265b, hashMap);
            if (a != null) {
                a.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C40118h(this, i), new C40119i(this));
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f94194a = (Button) view.findViewById(R.id.y7);
        View findViewById = view.findViewById(R.id.pi);
        this.f94196c = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40114f.View$OnClickListenerC401151 */

            static {
                Covode.recordClassIndex(47898);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC40114f.this.getActivity().onBackPressed();
            }
        });
        this.f94195b = (Button) view.findViewById(R.id.y6);
        this.f94194a.setOnClickListener(new View$OnClickListenerC40117g(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, mo69241a(), viewGroup, false);
    }
}
