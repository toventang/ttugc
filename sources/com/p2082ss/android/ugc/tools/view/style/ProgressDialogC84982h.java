package com.p2082ss.android.ugc.tools.view.style;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.CircularProgressView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.style.h */
public final class ProgressDialogC84982h extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public boolean f190019a = true;

    /* renamed from: b */
    private boolean f190020b;

    /* renamed from: c */
    private CharSequence f190021c;

    /* renamed from: d */
    private Drawable f190022d;

    /* renamed from: e */
    private String f190023e;

    /* renamed from: f */
    private Handler f190024f = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(98987);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo129813a() {
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.bxi);
        if (circularProgressView != null) {
            circularProgressView.mo129887b();
        }
        super.dismiss();
    }

    public final void dismiss() {
        RunnableC84983i iVar = new RunnableC84983i(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            iVar.run();
        } else {
            this.f190024f.post(iVar);
        }
    }

    private ProgressDialogC84982h(Context context) {
        super(context, 3);
    }

    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f190020b) {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.bxi);
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
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

    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        int i;
        super.setMessage(charSequence);
        if (this.f190020b && (textView = (TextView) findViewById(R.id.cj9)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f190021c = charSequence;
    }

    public final void setProgress(int i) {
        super.setProgress(i);
        TextView textView = (TextView) findViewById(R.id.d_3);
        if (textView != null) {
            textView.setText(i + "%");
        }
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.bxi);
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        View findViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.b3u);
        this.f190020b = true;
        setMessage(this.f190021c);
        setIndeterminate(false);
        String str = this.f190023e;
        if (this.f190020b && (textView = (TextView) findViewById(R.id.eie)) != null && str != null && str.length() == 0) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        this.f190023e = str;
        Drawable drawable = this.f190022d;
        if (drawable != null) {
            if (this.f190020b && (findViewById = findViewById(R.id.dnb)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0643b.m2369a(getContext(), (int) R.drawable.bnd)}));
            }
            this.f190022d = drawable;
        }
        setOnKeyListener(this);
    }

    /* renamed from: a */
    public static ProgressDialogC84982h m146057a(Context context, String str) {
        ProgressDialogC84982h hVar = new ProgressDialogC84982h(context);
        hVar.setCancelable(false);
        hVar.setIndeterminate(false);
        hVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            hVar.show();
        }
        hVar.setMessage(str);
        View findViewById = hVar.findViewById(R.id.d_3);
        if (findViewById != null) {
            if (hVar.f190019a) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
        return hVar;
    }
}
