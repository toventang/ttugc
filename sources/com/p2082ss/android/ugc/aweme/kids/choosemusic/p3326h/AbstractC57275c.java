package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractView$OnClickListenerC57193a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.c */
public abstract class AbstractC57275c {

    /* renamed from: a */
    public AbstractView$OnClickListenerC57193a f130474a;

    /* renamed from: b */
    public FrameLayout f130475b;

    /* renamed from: c */
    public TextView f130476c;

    /* renamed from: d */
    ImageView f130477d;

    /* renamed from: e */
    FrameLayout f130478e;

    /* renamed from: f */
    private int f130479f;

    /* renamed from: g */
    private TextWatcher f130480g;

    /* renamed from: h */
    private int f130481h;

    static {
        Covode.recordClassIndex(67180);
    }

    public AbstractC57275c(View view, AbstractView$OnClickListenerC57193a aVar, int i, TextWatcher textWatcher) {
        this.f130474a = aVar;
        this.f130479f = i;
        this.f130480g = textWatcher;
        this.f130475b = (FrameLayout) view.findViewById(R.id.adg);
        this.f130476c = (TextView) view.findViewById(R.id.a6h);
        this.f130477d = (ImageView) view.findViewById(R.id.bu2);
        this.f130478e = (FrameLayout) view.findViewById(R.id.avo);
        this.f130481h = C13628n.m24504a(view.getContext());
    }
}
