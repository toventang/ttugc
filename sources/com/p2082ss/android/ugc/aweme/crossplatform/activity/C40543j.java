package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider;
import com.p2082ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40518a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40620b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.j */
public final class C40543j extends AbstractC18234b {

    /* renamed from: a */
    public MixActivityContainer f94864a;

    /* renamed from: b */
    private C40618a f94865b;

    /* renamed from: c */
    private Runnable f94866c;

    static {
        Covode.recordClassIndex(48364);
    }

    /* renamed from: a */
    public final void mo69667a(Runnable runnable) {
        this.f94866c = runnable;
        MixActivityContainer mixActivityContainer = this.f94864a;
        if (mixActivityContainer != null) {
            mixActivityContainer.f94815f = runnable;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.putBoolean("webview_progress_bar", AbstractC40518a.m81731a(arguments));
        C40618a a = C40620b.C40622b.m81989a(arguments);
        this.f94865b = a;
        IMixActivityContainerProvider a2 = MixActivityContainerProvider.m81898a();
        if (a2 != null) {
            this.f94864a = a2.mo69717a(getActivity(), a);
        }
        if (this.f94864a == null) {
            this.f94864a = new MixActivityContainer(getActivity(), a);
        }
        this.f94864a.f94812c = getArguments();
        this.f94864a.f94815f = this.f94866c;
        getLifecycle().mo4012a(this.f94864a);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.f94864a.mo69623k();
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.uz, viewGroup, false);
    }
}
