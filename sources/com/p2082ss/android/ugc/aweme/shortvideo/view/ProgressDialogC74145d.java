package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.d */
public final class ProgressDialogC74145d extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public boolean f166540a = true;

    /* renamed from: b */
    private boolean f166541b;

    /* renamed from: c */
    private CharSequence f166542c;

    /* renamed from: d */
    private Drawable f166543d;

    /* renamed from: e */
    private String f166544e;

    /* renamed from: f */
    private long f166545f;

    static {
        Covode.recordClassIndex(86904);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo116615a() {
        try {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.bxi);
            if (circularProgressView != null) {
                circularProgressView.mo61409b();
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void dismiss() {
        RunnableC74146e eVar = new RunnableC74146e(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eVar.run();
        } else {
            C29339a.m58754b(eVar);
        }
    }

    private ProgressDialogC74145d(Context context) {
        super(context, 3);
    }

    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f166541b) {
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
        if (this.f166541b && (textView = (TextView) findViewById(R.id.cj9)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f166542c = charSequence;
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
        setContentView(R.layout.aec);
        this.f166541b = true;
        setMessage(this.f166542c);
        setIndeterminate(false);
        String str = this.f166544e;
        if (this.f166541b && (textView = (TextView) findViewById(R.id.eie)) != null && !C13627m.m24498a(str)) {
            textView.setText(str);
            C13628n.m24510a(textView, 0);
        }
        this.f166544e = str;
        Drawable drawable = this.f166543d;
        if (drawable != null) {
            if (this.f166541b && (findViewById = findViewById(R.id.dnb)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0643b.m2369a(getContext(), (int) R.drawable.pn)}));
            }
            this.f166543d = drawable;
        }
        setOnKeyListener(this);
        this.f166545f = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static ProgressDialogC74145d m130371a(Context context, String str) {
        ProgressDialogC74145d dVar = new ProgressDialogC74145d(context);
        dVar.setCancelable(false);
        dVar.setIndeterminate(false);
        dVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            dVar.show();
        }
        dVar.setMessage(str);
        View findViewById = dVar.findViewById(R.id.d_3);
        if (findViewById != null) {
            if (dVar.f166540a) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
        return dVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", (currentTimeMillis - this.f166545f) / 1000);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C34611o.m70668a("ug_save_video_click_back", jSONObject);
        return false;
    }
}
