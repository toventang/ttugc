package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.AbstractC53317a;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.b */
public final class C53330b extends C53332d {

    /* renamed from: h */
    private boolean f122429h;

    /* renamed from: i */
    private View f122430i;

    /* renamed from: j */
    private int f122431j;

    /* renamed from: k */
    private ProgressBar f122432k;

    /* renamed from: l */
    private AbstractC53317a f122433l;

    static {
        Covode.recordClassIndex(62891);
    }

    /* renamed from: w */
    private void m98372w() {
        ProgressBar progressBar = this.f122432k;
        if (progressBar != null) {
            progressBar.setProgress(this.f122431j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a, com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53332d
    /* renamed from: n */
    public final void mo89768n() {
        if (!this.f122429h) {
            super.mo89768n();
        }
        m98371v();
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53332d
    /* renamed from: q */
    public final View mo89795q() {
        if (!this.f122429h) {
            return super.mo89795q();
        }
        m98371v();
        return super.mo89795q();
    }

    /* renamed from: v */
    private void m98371v() {
        if (this.f122429h) {
            if (this.f122430i == null) {
                View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.a3i, this, false);
                this.f122430i = a;
                addView(a);
                this.f122432k = (ProgressBar) this.f122430i.findViewById(R.id.agu);
            }
            this.f122430i.setVisibility(0);
            m98372w();
            if (this.f122434c != null) {
                this.f122434c.setVisibility(4);
            }
            if (this.f122435d != null) {
                this.f122435d.setVisibility(4);
            }
            if (this.f122436e != null) {
                this.f122436e.setVisibility(4);
                return;
            }
            return;
        }
        View view = this.f122430i;
        if (view != null) {
            view.setVisibility(8);
        }
        super.mo89768n();
        if (this.f122434c != null) {
            this.f122434c.setVisibility(0);
        }
        if (this.f122435d != null) {
            this.f122435d.setVisibility(0);
        }
    }

    public final void setPublishAnim(AbstractC53317a aVar) {
        this.f122433l = aVar;
    }

    public final void setProgress(int i) {
        this.f122431j = i;
        m98372w();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53332d
    /* renamed from: a */
    public final void mo89794a(View view, int i, Callable<View> callable) {
        if (this.f122429h && i == 0) {
            i = 4;
        }
        super.mo89794a(view, i, callable);
    }

    public C53330b(Context context, String str, boolean z, boolean z2, int i) {
        super(context, str, z, z2, i);
    }
}
