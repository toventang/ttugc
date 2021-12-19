package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.p2450f.C35518a;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.m */
public final /* synthetic */ class RunnableC35647m implements Runnable {

    /* renamed from: a */
    private final TextView f84070a;

    /* renamed from: b */
    private final SpannableString f84071b;

    /* renamed from: c */
    private final TextView f84072c;

    /* renamed from: d */
    private final ImageView f84073d;

    /* renamed from: e */
    private final View f84074e;

    /* renamed from: f */
    private final ViewGroup f84075f;

    /* renamed from: g */
    private final SpannableString f84076g;

    /* renamed from: h */
    private final Challenge f84077h;

    /* renamed from: i */
    private final boolean f84078i;

    static {
        Covode.recordClassIndex(42871);
    }

    public RunnableC35647m(TextView textView, SpannableString spannableString, TextView textView2, ImageView imageView, View view, ViewGroup viewGroup, SpannableString spannableString2, Challenge challenge, boolean z) {
        this.f84070a = textView;
        this.f84071b = spannableString;
        this.f84072c = textView2;
        this.f84073d = imageView;
        this.f84074e = view;
        this.f84075f = viewGroup;
        this.f84076g = spannableString2;
        this.f84077h = challenge;
        this.f84078i = z;
    }

    public final void run() {
        TextView textView = this.f84070a;
        SpannableString spannableString = this.f84071b;
        TextView textView2 = this.f84072c;
        ImageView imageView = this.f84073d;
        ViewGroup viewGroup = this.f84075f;
        SpannableString spannableString2 = this.f84076g;
        Challenge challenge = this.f84077h;
        boolean z = this.f84078i;
        if (textView.getHeight() == C35518a.m72615a(textView, spannableString).f83759b.intValue()) {
            textView.setText(spannableString);
            textView2.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new View$OnClickListenerC35648n(imageView));
        imageView.setOnClickListener(new View$OnClickListenerC35649o(imageView, viewGroup, textView, spannableString2, challenge, z, spannableString, textView2));
    }
}
