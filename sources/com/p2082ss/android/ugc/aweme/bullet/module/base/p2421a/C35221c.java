package com.p2082ss.android.ugc.aweme.bullet.module.base.p2421a;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.c */
public final class C35221c {

    /* renamed from: a */
    public PopupWindow f83199a;

    /* renamed from: b */
    public View f83200b;

    /* renamed from: c */
    public View f83201c;

    /* renamed from: d */
    public View f83202d;

    /* renamed from: e */
    public List<Integer> f83203e;

    /* renamed from: f */
    private Activity f83204f;

    static {
        Covode.recordClassIndex(42383);
    }

    /* renamed from: a */
    public final PopupWindow mo62111a(View.OnClickListener onClickListener) {
        if (this.f83199a == null) {
            View a = C1764a.m5927a(LayoutInflater.from(this.f83204f), R.layout.v2, null, false);
            this.f83200b = a.findViewById(R.id.dh9);
            this.f83201c = a.findViewById(R.id.aeg);
            this.f83202d = a.findViewById(R.id.cwu);
            this.f83200b.setOnClickListener(onClickListener);
            this.f83201c.setOnClickListener(onClickListener);
            this.f83202d.setOnClickListener(onClickListener);
            PopupWindow popupWindow = new PopupWindow(a, -2, -2, true);
            this.f83199a = popupWindow;
            popupWindow.setTouchable(true);
            this.f83199a.setAnimationStyle(R.style.w5);
            this.f83199a.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.f83199a;
    }

    public C35221c(Activity activity, View.OnClickListener onClickListener) {
        this.f83204f = activity;
        mo62111a(onClickListener);
    }
}
