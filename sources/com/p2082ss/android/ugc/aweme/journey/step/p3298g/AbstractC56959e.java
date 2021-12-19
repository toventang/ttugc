package com.p2082ss.android.ugc.aweme.journey.step.p3298g;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.C40313cq;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.journey.C56878s;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.g.e */
public abstract class AbstractC56959e extends AbstractC34586a {

    /* renamed from: a */
    private SparseArray f129691a;

    /* renamed from: j */
    public long f129692j = System.currentTimeMillis();

    /* renamed from: k */
    public boolean f129693k;

    /* renamed from: l */
    public final Handler f129694l = new Handler();

    /* renamed from: m */
    public DmtStatusView f129695m;

    /* renamed from: n */
    public ViewStub f129696n;

    static {
        Covode.recordClassIndex(66846);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* renamed from: a */
    public View mo94130a(int i) {
        if (this.f129691a == null) {
            this.f129691a = new SparseArray();
        }
        View view = (View) this.f129691a.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129691a.put(i, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract ViewStub mo94136g();

    /* renamed from: h */
    public void mo94137h() {
        SparseArray sparseArray = this.f129691a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo94137h();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.e$a */
    static final class RunnableC56960a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC56959e f129697a;

        static {
            Covode.recordClassIndex(66847);
        }

        RunnableC56960a(AbstractC56959e eVar) {
            this.f129697a = eVar;
        }

        public final void run() {
            Intent intent;
            Intent intent2;
            Bundle arguments = this.f129697a.getArguments();
            if (arguments != null && arguments.getInt("extra_optimize_option", 0) == 2 && !arguments.getBoolean("extra_is_saveinstance", false) && !C56878s.f129535a) {
                C56878s.f129535a = true;
                ActivityC0945e activity = this.f129697a.getActivity();
                if (activity == null || (intent2 = activity.getIntent()) == null) {
                    intent = null;
                } else {
                    ActivityC0945e activity2 = this.f129697a.getActivity();
                    if (activity2 == null) {
                        C89219l.m154715b();
                    }
                    intent = intent2.setClassName(activity2, C40313cq.f94478a.mo60097f().getName());
                    if (intent != null) {
                        Intent flags = intent.setFlags(268435456);
                        if (flags != null) {
                            flags.addFlags(67108864);
                        }
                        intent.putExtra("reorder_new_journey_front", true);
                        intent.putExtra("from_new_user_journey", true);
                    }
                }
                ActivityC0945e activity3 = this.f129697a.getActivity();
                if (activity3 != null) {
                    C84349a.m145093a(intent, activity3);
                    activity3.startActivity(intent);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo94153i() {
        DmtStatusView dmtStatusView;
        View view;
        if (this.f129696n == null && getContext() != null) {
            ViewStub g = mo94136g();
            this.f129696n = g;
            DmtStatusView dmtStatusView2 = null;
            if (g != null) {
                view = g.inflate();
            } else {
                view = null;
            }
            if (view instanceof DmtStatusView) {
                dmtStatusView2 = view;
            }
            DmtStatusView dmtStatusView3 = dmtStatusView2;
            this.f129695m = dmtStatusView3;
            if (dmtStatusView3 != null) {
                dmtStatusView3.setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
            }
        }
        DmtStatusView dmtStatusView4 = this.f129695m;
        if ((dmtStatusView4 == null || !dmtStatusView4.mo27389j()) && (dmtStatusView = this.f129695m) != null) {
            dmtStatusView.mo27384f();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f129692j = System.currentTimeMillis();
    }
}
