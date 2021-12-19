package com.p2082ss.android.ugc.aweme.anchor.liveevent;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity;
import com.p2082ss.android.ugc.aweme.liveevent.C58812j;
import com.p2082ss.android.ugc.aweme.liveevent.C58814l;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity */
public final class LiveEventSelectionActivity extends AnchorBaseActivity {

    /* renamed from: a */
    private C58814l f79599a;

    /* renamed from: b */
    private SparseArray f79600b;

    static {
        Covode.recordClassIndex(40363);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f79600b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f79600b == null) {
            this.f79600b = new SparseArray();
        }
        View view = (View) this.f79600b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79600b.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity
    /* renamed from: f */
    public final void mo59603f() {
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        if (this.f79599a == null) {
            this.f79599a = new C58814l();
        }
        C58814l lVar = this.f79599a;
        if (lVar != null) {
            a.mo3453a(R.id.b7z, lVar);
            a.mo3473c();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34884bl, com.p2082ss.android.ugc.aweme.anchor.AnchorBaseActivity
    /* renamed from: a */
    public final void mo59597a(C58812j jVar) {
        Iterable iterable;
        C58814l lVar = this.f79599a;
        if (!(lVar == null || jVar == null)) {
            lVar.f133866e = jVar;
            TuxTextView tuxTextView = (TuxTextView) lVar.mo57294a(R.id.xi);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setClickable(true);
            TuxTextView tuxTextView2 = (TuxTextView) lVar.mo57294a(R.id.xi);
            C89219l.m154716b(tuxTextView2, "");
            Context context = lVar.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            tuxTextView2.setBackground(new ColorDrawable(C0643b.m2378c(context, R.color.bh)));
            TuxTextView tuxTextView3 = (TuxTextView) lVar.mo57294a(R.id.xi);
            Context context2 = lVar.getContext();
            if (context2 == null) {
                C89219l.m154715b();
            }
            tuxTextView3.setTextColor(C0643b.m2378c(context2, R.color.a9));
            C89399f fVar = lVar.f133867f;
            if (fVar == null || (iterable = fVar.f203060b) == null) {
                iterable = C89086z.INSTANCE;
            }
            for (Object obj : iterable) {
                if ((obj instanceof C58812j) && (!C89219l.m154714a(obj, jVar))) {
                    C58812j jVar2 = (C58812j) obj;
                    if (!C89361p.m154872a(jVar2.f133855a, jVar.f133855a, true)) {
                        jVar2.f133858d = false;
                    }
                }
            }
            C89399f fVar2 = lVar.f133867f;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
        }
    }
}
