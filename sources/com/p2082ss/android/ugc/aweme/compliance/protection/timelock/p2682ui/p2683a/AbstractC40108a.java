package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34710c;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2679b.C40097a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.C40154a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.SetLockParamViewModel;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.a */
public abstract class AbstractC40108a extends AbstractC34586a implements AbstractC39236g {

    /* renamed from: a */
    private TuxStatusView f94184a;

    /* renamed from: c */
    protected Button f94185c;

    /* renamed from: d */
    protected View f94186d;

    /* renamed from: e */
    protected TuxTextView f94187e;

    /* renamed from: j */
    protected C40097a f94188j;

    static {
        Covode.recordClassIndex(47891);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo69239c();

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g
    /* renamed from: a */
    public final void mo68125a() {
        m81144i();
    }

    /* renamed from: i */
    private void m81144i() {
        TuxStatusView tuxStatusView = this.f94184a;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g
    /* renamed from: b */
    public final void mo68126b() {
        m81144i();
        C40074a.m81036a(getActivity(), mo69257e(), false);
    }

    /* renamed from: e */
    public final int mo69257e() {
        return ((SetLockParamViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SetLockParamViewModel.class)).f94260a.getValue().f94262a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final LiveData<C40154a> mo69258g() {
        if (getActivity() == null) {
            return null;
        }
        return ((SetLockParamViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SetLockParamViewModel.class)).f94260a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo69259h() {
        if (mo69258g() == null || mo69258g().getValue().f94263b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo69240d() {
        Fragment b;
        if (mo69259h()) {
            HashMap hashMap = new HashMap();
            if (mo69257e() == 0) {
                hashMap.put("screen_time_management", String.valueOf(((TimeLockOptionViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class)).f94261a.getValue().f94225b));
            } else {
                hashMap.put("teen_mode", "1");
            }
            if (mo69258g() != null && mo69258g().getValue() != null && mo69258g().getValue().f94263b != null) {
                C40154a.C40155a aVar = mo69258g().getValue().f94263b;
                AbstractC88979t<BaseResponse> a = FamilyPairingApi.m81069a(aVar.f94264a, aVar.f94265b, hashMap);
                if (a != null) {
                    a.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C40112d(this), new C40113e(this));
                    return;
                }
                return;
            }
            return;
        }
        if (!C40074a.m81042e()) {
            b = C40135p.m81185a(false);
        } else {
            b = C40135p.m81186b(0);
            C34710c.m70888a().mo61386a("TimeLockEnterFragmentV2").mo61381a(b).mo61383a(this, new AbstractC34709b() {
                /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40108a.C401091 */

                static {
                    Covode.recordClassIndex(47892);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
                /* renamed from: a */
                public final void mo61385a() {
                    C40074a.m81036a(AbstractC40108a.this.getActivity(), AbstractC40108a.this.mo69257e(), false);
                }
            });
        }
        ((AbstractActivityC40107a) getActivity()).mo69256a(b);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f94185c = (Button) view.findViewById(R.id.y7);
        this.f94187e = (TuxTextView) view.findViewById(R.id.eht);
        View findViewById = view.findViewById(R.id.pi);
        this.f94186d = findViewById;
        findViewById.setOnClickListener(new View$OnClickListenerC40110b(this));
        this.f94185c.setOnClickListener(new View$OnClickListenerC40111c(this));
        this.f94184a = (TuxStatusView) view.findViewById(R.id.e7i);
        C40097a aVar = new C40097a();
        this.f94188j = aVar;
        aVar.mo69236a(this);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, mo69239c(), viewGroup, false);
    }
}
