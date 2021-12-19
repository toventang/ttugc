package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.z */
public abstract class AbstractC50477z extends AbstractC34586a {

    /* renamed from: s */
    protected long f116584s = -1;

    /* renamed from: t */
    public String f116585t;

    /* renamed from: u */
    protected int f116586u;

    /* renamed from: v */
    public Fragment f116587v;

    /* renamed from: w */
    protected String f116588w;

    /* renamed from: y */
    public String f116589y;

    static {
        Covode.recordClassIndex(59613);
    }

    /* renamed from: a */
    public abstract boolean mo85156a(boolean z);

    /* renamed from: q */
    public abstract void mo85173q();

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        mo85720w();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo80042b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo85721x() {
        AbstractC59103j jVar;
        if (getUserVisibleHint() && (getActivity() instanceof AbstractC59103j) && (jVar = (AbstractC59103j) getActivity()) != null) {
            jVar.setTabBackground(false);
        }
    }

    /* renamed from: b */
    private void mo80042b() {
        if (getUserVisibleHint() && (getActivity() instanceof AbstractC59103j) && this.f116584s == -1 && ((AbstractC59103j) getActivity()).isMainTabVisible()) {
            this.f116584s = System.currentTimeMillis();
        }
    }

    /* renamed from: w */
    public final void mo85720w() {
        if (getUserVisibleHint() && this.f116584s != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f116584s;
            if (currentTimeMillis > 0) {
                if ("nearby".equals(this.f116585t)) {
                    this.f116585t = "homepage_fresh";
                }
                C29339a.m58752a(new RunnableC50036aa(this, currentTimeMillis));
            }
            this.f116584s = -1;
        }
    }

    /* renamed from: c */
    public void mo85158c(boolean z) {
        mo80042b();
    }

    /* renamed from: d */
    public void mo85159d(boolean z) {
        mo85720w();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f116586u = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
            this.f116585t = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
            this.f116588w = arguments.getString("extra_follow_type", "extra_follow_type_follow");
        }
    }
}
