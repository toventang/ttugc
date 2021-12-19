package com.p2082ss.android.ugc.aweme.feed.p2963q;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.ss.android.ugc.aweme.feed.q.w */
public abstract class AbstractC49887w extends AbstractC81910b {

    /* renamed from: bu */
    public boolean f114989bu;

    static {
        Covode.recordClassIndex(58994);
    }

    public boolean aE_() {
        return false;
    }

    /* renamed from: bX */
    public final boolean mo84912bX() {
        return this.f114989bu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aP */
    public boolean mo84708aP() {
        Fragment aH_ = aH_();
        if (aH_ == null || !aH_.isResumed()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bW */
    public final boolean mo84911bW() {
        AbstractC18234b bVar = (AbstractC18234b) aH_();
        if (bVar == null || !bVar.f43437f) {
            return false;
        }
        return true;
    }

    /* renamed from: bY */
    public final AbstractC0952i mo84913bY() {
        Fragment aH_ = aH_();
        if (aH_ == null) {
            return null;
        }
        return aH_.getChildFragmentManager();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bE */
    public boolean mo84730bE() {
        AbstractC18234b bVar = (AbstractC18234b) aH_();
        if (bVar == null || !bVar.af_()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: r */
    public void mo70413r() {
        super.mo70413r();
        if (aE_()) {
            EventBus.m156962a().mo145395b(this);
        }
    }

    /* renamed from: e */
    public void mo70492e(boolean z) {
        this.f114989bu = z;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: a */
    public void mo70393a(View view, Bundle bundle) {
        super.mo70393a(view, bundle);
        if (aE_()) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
    }
}
