package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.view.AbstractC33062b;
import com.p2082ss.android.ugc.aweme.account.view.C33063c;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a */
public final class C32611a extends AbstractC32572b {

    /* renamed from: a */
    private HashMap f77795a;

    static {
        Covode.recordClassIndex(39390);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: b_ */
    public final void mo57470b_(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77795a == null) {
            this.f77795a = new HashMap();
        }
        View view = (View) this.f77795a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77795a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77795a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: q */
    public final boolean mo57458q() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onDestroyView() {
        super.onDestroyView();
        C33063c.f78615a.mo58489c();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C33063c.f78615a.mo58488b();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C33063c.f78615a.mo58485a();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a$a */
    public static final class C32612a implements AbstractC33062b {

        /* renamed from: a */
        final /* synthetic */ C32611a f77796a;

        static {
            Covode.recordClassIndex(39391);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.view.AbstractC33062b
        /* renamed from: a */
        public final void mo58492a() {
            Bundle arguments = this.f77796a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("next_page", EnumC32594j.FINISH.getValue());
            C32611a aVar = this.f77796a;
            Bundle arguments2 = aVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments2, "");
            aVar.mo58461a(arguments2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32612a(C32611a aVar) {
            this.f77796a = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33063c.f78615a.mo58486a(bundle);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C33063c.f78615a.mo58487a(view, new C32612a(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C33063c.f78615a.mo58484a(layoutInflater, viewGroup, bundle);
    }
}
