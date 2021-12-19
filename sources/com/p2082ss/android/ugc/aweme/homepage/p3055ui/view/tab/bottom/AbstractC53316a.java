package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a */
public abstract class AbstractC53316a extends FrameLayout {

    /* renamed from: a */
    public boolean f122393a;

    /* renamed from: b */
    protected boolean f122394b;

    /* renamed from: c */
    private String f122395c;

    /* renamed from: d */
    private boolean f122396d;

    static {
        Covode.recordClassIndex(62877);
    }

    /* renamed from: a */
    public abstract void mo89751a(int i);

    /* renamed from: b */
    public abstract void mo89753b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo89754c();

    /* renamed from: e */
    public abstract void mo89756e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo89757f();

    public ImageView getRefreshIcon() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo89761h();

    /* renamed from: i */
    public abstract void mo89762i();

    /* renamed from: j */
    public abstract void mo89764j();

    /* renamed from: k */
    public abstract void mo89765k();

    /* renamed from: l */
    public abstract void mo89766l();

    /* renamed from: m */
    public abstract void mo89767m();

    /* renamed from: n */
    public abstract void mo89768n();

    /* renamed from: o */
    public abstract void mo89769o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo89770p() {
    }

    public void setActivated(boolean z) {
    }

    public String getTabType() {
        return this.f122395c;
    }

    public boolean isSelected() {
        return this.f122396d;
    }

    /* renamed from: a */
    public final void mo89750a() {
        setSelected(false);
        if (this.f122393a) {
            mo89754c();
        } else {
            mo89753b();
        }
    }

    /* renamed from: d */
    public final void mo89755d() {
        setSelected(true);
        if (this.f122393a) {
            mo89757f();
        } else {
            mo89756e();
        }
    }

    /* renamed from: g */
    public final void mo89758g() {
        if (!this.f122393a) {
            this.f122393a = true;
            mo89761h();
        }
    }

    public void setRefreshing(boolean z) {
        this.f122393a = z;
    }

    public void setSelected(boolean z) {
        this.f122396d = z;
    }

    public AbstractC53316a(Context context, String str) {
        super(context);
        this.f122395c = str;
    }

    /* renamed from: a */
    public final void mo89752a(boolean z, int i) {
        if (z) {
            mo89751a(i);
        } else {
            mo89764j();
        }
    }
}
