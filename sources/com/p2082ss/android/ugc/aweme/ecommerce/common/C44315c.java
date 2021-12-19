package com.p2082ss.android.ugc.aweme.ecommerce.common;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.c */
public class C44315c extends AbstractC34586a {

    /* renamed from: a */
    private long f103338a = SystemClock.elapsedRealtime();

    /* renamed from: b */
    private SparseArray f103339b;

    static {
        Covode.recordClassIndex(52629);
    }

    /* renamed from: c */
    public View mo75223c() {
        if (this.f103339b == null) {
            this.f103339b = new SparseArray();
        }
        View view = (View) this.f103339b.get(R.id.dq7);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.dq7);
        this.f103339b.put(R.id.dq7, findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public void mo75224d() {
        SparseArray sparseArray = this.f103339b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo75224d();
    }

    /* renamed from: b */
    public final long mo75222b() {
        return SystemClock.elapsedRealtime() - this.f103338a;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        this.f103338a = SystemClock.elapsedRealtime();
        super.onStart();
    }
}
