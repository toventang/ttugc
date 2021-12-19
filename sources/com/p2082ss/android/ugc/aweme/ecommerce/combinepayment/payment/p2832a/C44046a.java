package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.a */
public final class C44046a {

    /* renamed from: a */
    View f102678a;

    /* renamed from: b */
    View f102679b;

    /* renamed from: c */
    int f102680c;

    /* renamed from: d */
    int f102681d;

    /* renamed from: e */
    int f102682e;

    /* renamed from: f */
    FrameLayout.LayoutParams f102683f;

    /* renamed from: g */
    int f102684g;

    /* renamed from: h */
    boolean f102685h = true;

    static {
        Covode.recordClassIndex(52351);
    }

    public C44046a(Fragment fragment) {
        View view = fragment.getView();
        if (view != null) {
            this.f102679b = ((ViewGroup) view.getRootView()).findViewById(R.id.acf);
            this.f102678a = view;
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC44047b(this));
            this.f102683f = (FrameLayout.LayoutParams) this.f102678a.getLayoutParams();
        }
    }
}
