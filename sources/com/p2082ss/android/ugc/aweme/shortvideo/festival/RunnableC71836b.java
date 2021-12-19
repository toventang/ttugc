package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.p2450f.C35518a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.b */
final /* synthetic */ class RunnableC71836b implements Runnable {

    /* renamed from: a */
    private final TextView f160986a;

    /* renamed from: b */
    private final SpannableString f160987b;

    /* renamed from: c */
    private final ImageView f160988c;

    /* renamed from: d */
    private final TextView f160989d;

    /* renamed from: e */
    private final ViewGroup f160990e;

    /* renamed from: f */
    private final SpannableString f160991f;

    static {
        Covode.recordClassIndex(84385);
    }

    RunnableC71836b(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2) {
        this.f160986a = textView;
        this.f160987b = spannableString;
        this.f160988c = imageView;
        this.f160989d = textView2;
        this.f160990e = viewGroup;
        this.f160991f = spannableString2;
    }

    public final void run() {
        TextView textView = this.f160986a;
        SpannableString spannableString = this.f160987b;
        ImageView imageView = this.f160988c;
        TextView textView2 = this.f160989d;
        ViewGroup viewGroup = this.f160990e;
        SpannableString spannableString2 = this.f160991f;
        int height = textView.getHeight();
        int intValue = C35518a.m72615a(textView, spannableString).f83759b.intValue();
        if (height == intValue) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new View$OnClickListenerC71837c(imageView));
        imageView.setOnClickListener(new View$OnClickListenerC71838d(imageView, viewGroup, textView, intValue, height, spannableString2, spannableString, textView2));
    }
}
