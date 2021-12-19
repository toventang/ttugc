package com.p2082ss.android.ugc.aweme.share;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.StringTokenizer;

/* renamed from: com.ss.android.ugc.aweme.share.g */
public class C68927g extends LinearLayout {

    /* renamed from: a */
    protected ImageView f154187a = ((ImageView) findViewById(R.id.dx6));

    /* renamed from: b */
    protected TextView f154188b = ((TextView) findViewById(R.id.dx7));

    /* renamed from: c */
    protected View f154189c;

    static {
        Covode.recordClassIndex(81236);
    }

    public int getLayoutResource() {
        return R.layout.lx;
    }

    public ImageView getShareImageView() {
        return this.f154187a;
    }

    public TextView getShareTextView() {
        return this.f154188b;
    }

    public void setIcon(int i) {
        this.f154187a.setImageResource(i);
    }

    public void setIconAlpha(float f) {
        this.f154187a.setAlpha(f);
    }

    public void setText(int i) {
        this.f154188b.setText(i);
    }

    public void setTextAlpha(float f) {
        this.f154188b.setAlpha(f);
    }

    public void setTextSize(float f) {
        this.f154188b.setTextSize(f);
    }

    public void setIcon(Drawable drawable) {
        this.f154187a.setImageDrawable(drawable);
    }

    public void setTextColor(int i) {
        this.f154188b.setTextColor(getResources().getColor(i));
    }

    public void setText(String str) {
        int i;
        TextView textView = this.f154188b;
        if (str.contains(" ")) {
            i = 2;
        } else {
            i = 1;
        }
        textView.setMaxLines(i);
        TextView textView2 = this.f154188b;
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        sb.append(stringTokenizer.nextToken());
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() >= 8) {
                sb.append(" \n").append(nextToken);
            } else {
                sb.append(" ").append(nextToken);
            }
        }
        textView2.setText(sb.toString());
    }

    public C68927g(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        MethodCollector.m26663i(9506);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        View findViewById = findViewById(R.id.v_);
        this.f154189c = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(1);
        setGravity(1);
        MethodCollector.m26664o(9506);
    }
}
