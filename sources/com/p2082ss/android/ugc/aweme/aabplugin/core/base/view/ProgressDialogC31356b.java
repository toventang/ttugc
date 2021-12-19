package com.p2082ss.android.ugc.aweme.aabplugin.core.base.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.view.b */
public final class ProgressDialogC31356b extends ProgressDialog {

    /* renamed from: a */
    public boolean f75128a = true;

    /* renamed from: b */
    public Activity f75129b;

    /* renamed from: c */
    private boolean f75130c;

    /* renamed from: d */
    private CharSequence f75131d;

    /* renamed from: e */
    private Drawable f75132e;

    /* renamed from: f */
    private int f75133f;

    static {
        Covode.recordClassIndex(38058);
    }

    public ProgressDialogC31356b(Context context) {
        super(context, 3);
        this.f75129b = (Activity) context;
    }

    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        super.setMessage(charSequence);
        if (this.f75130c && (textView = (TextView) findViewById(R.id.cj9)) != null) {
            textView.setText(charSequence);
        }
        this.f75131d = charSequence;
    }

    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f75130c) {
            DFCircularProgressView dFCircularProgressView = (DFCircularProgressView) findViewById(R.id.bxi);
            if (dFCircularProgressView != null) {
                dFCircularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.d_3);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public final void setProgress(int i) {
        super.setProgress(i);
        if (this.f75130c) {
            TextView textView = (TextView) findViewById(R.id.d_3);
            if (textView != null) {
                textView.setText(i + "%");
            }
            DFCircularProgressView dFCircularProgressView = (DFCircularProgressView) findViewById(R.id.bxi);
            if (dFCircularProgressView != null) {
                dFCircularProgressView.setProgress((float) i);
            }
        }
        this.f75133f = i;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        setContentView(R.layout.ago);
        this.f75130c = true;
        setMessage(this.f75131d);
        setIndeterminate(false);
        setProgress(this.f75133f);
        Drawable drawable = this.f75132e;
        if (drawable != null) {
            if (this.f75130c && (findViewById = findViewById(R.id.dnb)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, getContext().getResources().getDrawable(R.drawable.t1)}));
            }
            this.f75132e = drawable;
        }
    }
}
