package com.p2082ss.android.ugc.aweme.journey.step.p3297f;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.view.AbstractC33062b;
import com.p2082ss.android.ugc.aweme.account.view.C33063c;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.f.a */
public final class C56940a extends AbstractC34586a {

    /* renamed from: a */
    private SparseArray f129667a;

    static {
        Covode.recordClassIndex(66827);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.f.a$a */
    public static final class C56941a implements AbstractC33062b {
        static {
            Covode.recordClassIndex(66828);
        }

        C56941a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.account.view.AbstractC33062b
        /* renamed from: a */
        public final void mo58492a() {
            AbstractC81915c.m141874a(new C56955b());
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onDestroyView() {
        super.onDestroyView();
        C33063c.f78615a.mo58489c();
        SparseArray sparseArray = this.f129667a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C33063c.f78615a.mo58488b();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C33063c.f78615a.mo58485a();
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
        C33063c.f78615a.mo58487a(view, new C56941a());
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C33063c.f78615a.mo58484a(layoutInflater, viewGroup, bundle);
    }
}
