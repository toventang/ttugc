package com.p2082ss.android.ugc.aweme.qrcode.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.a */
public final class ProgressDialogC66468a extends ProgressDialog {

    /* renamed from: a */
    CharSequence f149426a;

    /* renamed from: b */
    Drawable f149427b;

    /* renamed from: c */
    private boolean f149428c;

    /* renamed from: d */
    private ImageView f149429d;

    /* renamed from: e */
    private ImageView f149430e;

    static {
        Covode.recordClassIndex(78004);
    }

    /* renamed from: b */
    public final void mo105416b() {
        this.f149429d.setVisibility(4);
        this.f149430e.setVisibility(0);
    }

    public final void dismiss() {
        ImageView imageView = this.f149429d;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        super.dismiss();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (isShowing()) {
            dismiss();
        }
    }

    /* renamed from: a */
    public final void mo105414a() {
        ImageView imageView = this.f149429d;
        if (imageView != null) {
            imageView.clearAnimation();
            ((AnimationDrawable) this.f149429d.getDrawable()).start();
        }
    }

    private ProgressDialogC66468a(Context context) {
        super(context, 3);
    }

    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        super.setMessage(charSequence);
        if (this.f149428c && (textView = (TextView) findViewById(R.id.cj9)) != null) {
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
        this.f149426a = charSequence;
    }

    /* renamed from: a */
    public final void mo105415a(Drawable drawable) {
        View findViewById;
        if (this.f149428c && (findViewById = findViewById(R.id.dnb)) != null) {
            findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0643b.m2369a(getContext(), (int) R.drawable.b2y)}));
        }
        this.f149427b = drawable;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aj5);
        this.f149428c = true;
        this.f149429d = (ImageView) findViewById(R.id.jz);
        this.f149430e = (ImageView) findViewById(R.id.anq);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.0f;
        getWindow().setAttributes(attributes);
        setMessage(this.f149426a);
        setIndeterminate(false);
        Drawable drawable = this.f149427b;
        if (drawable != null) {
            mo105415a(drawable);
        }
    }

    /* renamed from: a */
    public static ProgressDialogC66468a m118220a(Context context, String str) {
        ProgressDialogC66468a aVar = new ProgressDialogC66468a(context);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            try {
                aVar.show();
            } catch (Exception unused) {
            }
        }
        aVar.setMessage(str);
        aVar.mo105414a();
        return aVar;
    }
}
