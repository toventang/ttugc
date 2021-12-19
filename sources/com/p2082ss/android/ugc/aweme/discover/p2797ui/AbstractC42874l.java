package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.l */
public abstract class AbstractC42874l extends AbstractC34488b {

    /* renamed from: b */
    public final String f99973b;

    /* renamed from: c */
    private long f99974c = -1;

    /* renamed from: d */
    private SparseArray f99975d;

    static {
        Covode.recordClassIndex(50979);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public View mo60929a(int i) {
        if (this.f99975d == null) {
            this.f99975d = new SparseArray();
        }
        View view = (View) this.f99975d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f99975d.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public void mo60930a() {
        SparseArray sparseArray = this.f99975d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public abstract int mo73059b();

    /* renamed from: c */
    public abstract String mo73060c();

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: a */
    public void mo73058a(boolean z, boolean z2) {
        if (!z) {
            if (this.f99974c <= 0) {
                this.f99974c = SystemClock.elapsedRealtime();
            }
        } else if (this.f99974c > 0) {
            String c = mo73060c();
            C89219l.m154721d(c, "");
            C39162r.m79460a("stay_time", new C33744d().mo59983a("enter_from", c).mo59981a("duration", SystemClock.elapsedRealtime() - this.f99974c).f79943a);
            this.f99974c = -1;
        }
    }
}
