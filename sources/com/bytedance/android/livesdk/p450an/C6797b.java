package com.bytedance.android.livesdk.p450an;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3965x;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.livesdk.p450an.p451a.C6783a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.an.b */
public final class C6797b extends C10935a {

    /* renamed from: a */
    private HashMap f16857a;

    static {
        Covode.recordClassIndex(7535);
    }

    /* renamed from: a */
    private View m14580a(int i) {
        if (this.f16857a == null) {
            this.f16857a = new HashMap();
        }
        View view = (View) this.f16857a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16857a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16857a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.an.b$b */
    static final class View$OnClickListenerC6799b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6797b f16859a;

        static {
            Covode.recordClassIndex(7537);
        }

        View$OnClickListenerC6799b(C6797b bVar) {
            this.f16859a = bVar;
        }

        public final void onClick(View view) {
            this.f16859a.mo13063a(new C6783a());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.an.b$a */
    static final class View$OnClickListenerC6798a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6797b f16858a;

        static {
            Covode.recordClassIndex(7536);
        }

        View$OnClickListenerC6798a(C6797b bVar) {
            this.f16858a = bVar;
        }

        public final void onClick(View view) {
            try {
                Object newInstance = C3965x.m9652a("com.bytedance.android.debug_tool.ui.MainDebugFragment").newInstance();
                if (!(newInstance instanceof Fragment)) {
                    newInstance = null;
                }
                Fragment fragment = (Fragment) newInstance;
                if (fragment != null) {
                    this.f16858a.mo13063a(fragment);
                }
            } catch (Exception unused) {
                C11226ao.m19883a(C3966y.m9669e(), "live-settings debug page exception", 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo13063a(Fragment fragment) {
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        if (!fragment.isAdded()) {
            a.mo3454a(R.id.acf, fragment, fragment.getClass().getName()).mo3473c();
        } else {
            a.mo3474c(fragment).mo3473c();
        }
        getChildFragmentManager().mo3560b();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((LiveButton) m14580a(R.id.dwu)).setOnClickListener(new View$OnClickListenerC6798a(this));
        ((LiveButton) m14580a(R.id.c23)).setOnClickListener(new View$OnClickListenerC6799b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.afc, viewGroup, false);
    }
}
