package com.p2082ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.language.p4382b.C85095a;
import com.p2082ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.trill.setting.DisplaySettingPage */
public final class DisplaySettingPage extends AbstractC68195a {

    /* renamed from: g */
    public static final C85109a f190422g = new C85109a((byte) 0);

    /* renamed from: e */
    public ViewGroup f190423e;

    /* renamed from: f */
    public AppLanguageViewModel f190424f;

    /* renamed from: h */
    private C85095a f190425h;

    /* renamed from: i */
    private SparseArray f190426i;

    static {
        Covode.recordClassIndex(99141);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f190426i == null) {
            this.f190426i = new SparseArray();
        }
        View view = (View) this.f190426i.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f190426i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f190426i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.axg;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.trill.setting.DisplaySettingPage$a */
    public static final class C85109a {
        static {
            Covode.recordClassIndex(99142);
        }

        private C85109a() {
        }

        public /* synthetic */ C85109a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC0952i supportFragmentManager;
        C89219l.m154721d(view, "");
        this.f190423e = (ViewGroup) view.findViewById(R.id.dnb);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = this.f190423e;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(C0643b.m2378c(viewGroup.getContext(), R.color.l));
        }
        ActivityC0945e activity = getActivity();
        if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
            Fragment a = supportFragmentManager.mo3551a("language_app_fragment");
            if (!(a instanceof C85095a)) {
                a = null;
            }
            C85095a aVar = (C85095a) a;
            if (aVar == null) {
                aVar = new C85095a();
            }
            this.f190425h = aVar;
            if (!aVar.isAdded()) {
                AbstractC0976n a2 = supportFragmentManager.mo3552a();
                C89219l.m154716b(a2, "");
                a2.mo3454a(R.id.b82, aVar, "language_app_fragment");
                a2.mo3457a((String) null);
                a2.mo3473c();
            }
        }
        this.f190424f = (AppLanguageViewModel) C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(AppLanguageViewModel.class);
    }
}
