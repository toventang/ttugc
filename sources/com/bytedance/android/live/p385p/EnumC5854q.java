package com.bytedance.android.live.p385p;

import android.view.ViewGroup;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89376n;

/* renamed from: com.bytedance.android.live.p.q */
public enum EnumC5854q {
    ICON(R.layout.bbb),
    ICON_WITH_TEXT(R.layout.bbc),
    ICON_TITLE_HORIZONTAL(R.layout.bbd);
    

    /* renamed from: b */
    private final ViewGroup.MarginLayoutParams f14715b;

    /* renamed from: c */
    private final ViewGroup.LayoutParams f14716c = new ViewGroup.LayoutParams(-1, C3966y.m9653a(48.0f));

    /* renamed from: d */
    private final ViewGroup.LayoutParams f14717d = new ViewGroup.LayoutParams(C3966y.m9653a(44.0f), C3966y.m9653a(36.0f));

    /* renamed from: e */
    private final int f14718e;

    public final int getLayoutId() {
        return this.f14718e;
    }

    public final boolean getHasText() {
        if (this == ICON_WITH_TEXT) {
            return true;
        }
        return false;
    }

    public final boolean getHasTitle() {
        if (this == ICON_TITLE_HORIZONTAL) {
            return true;
        }
        return false;
    }

    public final boolean isPopup() {
        if (this == ICON_TITLE_HORIZONTAL) {
            return true;
        }
        return false;
    }

    public final ViewGroup.LayoutParams getLayoutParams() {
        int i = C5855r.f14719a[ordinal()];
        if (i == 1) {
            return this.f14715b;
        }
        if (i == 2) {
            return this.f14717d;
        }
        if (i == 3) {
            return this.f14716c;
        }
        throw new C89376n();
    }

    static {
        Covode.recordClassIndex(6461);
    }

    private EnumC5854q(int i) {
        this.f14718e = i;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C3966y.m9653a(36.0f), C3966y.m9653a(36.0f));
        marginLayoutParams.leftMargin = C3966y.m9653a(8.0f);
        this.f14715b = marginLayoutParams;
    }
}
