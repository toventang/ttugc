package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.p2450f.C35518a;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.d */
public final /* synthetic */ class RunnableC35603d implements Runnable {

    /* renamed from: a */
    private final TextView f83965a;

    /* renamed from: b */
    private final SpannableString f83966b;

    /* renamed from: c */
    private final ImageView f83967c;

    /* renamed from: d */
    private final TextView f83968d;

    /* renamed from: e */
    private final ViewGroup f83969e;

    /* renamed from: f */
    private final boolean f83970f;

    /* renamed from: g */
    private final SpannableString f83971g;

    static {
        Covode.recordClassIndex(42827);
    }

    public RunnableC35603d(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f83965a = textView;
        this.f83966b = spannableString;
        this.f83967c = imageView;
        this.f83968d = textView2;
        this.f83969e = viewGroup;
        this.f83970f = z;
        this.f83971g = spannableString2;
    }

    public final void run() {
        TextView textView = this.f83965a;
        SpannableString spannableString = this.f83966b;
        ImageView imageView = this.f83967c;
        TextView textView2 = this.f83968d;
        ViewGroup viewGroup = this.f83969e;
        boolean z = this.f83970f;
        SpannableString spannableString2 = this.f83971g;
        int height = textView.getHeight();
        int intValue = C35518a.m72615a(textView, spannableString).f83759b.intValue();
        if (height == intValue) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new View$OnClickListenerC35604e(imageView));
        imageView.setOnClickListener(new View$OnClickListenerC35605f(imageView, viewGroup, textView, intValue, height, z, spannableString2, spannableString, textView2));
    }
}
