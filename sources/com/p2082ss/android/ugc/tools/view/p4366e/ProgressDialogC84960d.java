package com.p2082ss.android.ugc.tools.view.p4366e;

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
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.view.widget.CircularProgressView;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.tools.view.e.d */
public class ProgressDialogC84960d extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    private boolean f189861a;

    /* renamed from: b */
    private CharSequence f189862b;

    /* renamed from: c */
    public boolean f189863c = true;

    /* renamed from: d */
    private Drawable f189864d;

    /* renamed from: e */
    private String f189865e;

    /* renamed from: f */
    private long f189866f;

    /* renamed from: g */
    private Handler f189867g = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(98955);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo129728a() {
        try {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.bxi);
            if (circularProgressView != null) {
                circularProgressView.mo129887b();
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public void dismiss() {
        RunnableC84961e eVar = new RunnableC84961e(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eVar.run();
        } else {
            this.f189867g.post(eVar);
        }
    }

    public ProgressDialogC84960d(Context context) {
        super(context, 3);
    }

    public void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f189861a) {
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

    public void setMessage(CharSequence charSequence) {
        TextView textView;
        int i;
        super.setMessage(charSequence);
        if (this.f189861a && (textView = (TextView) findViewById(R.id.cj9)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f189862b = charSequence;
    }

    public void setProgress(int i) {
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
    public void onCreate(Bundle bundle) {
        View findViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.b3a);
        this.f189861a = true;
        setMessage(this.f189862b);
        setIndeterminate(false);
        String str = this.f189865e;
        if (this.f189861a && (textView = (TextView) findViewById(R.id.eie)) != null && !C13627m.m24498a(str)) {
            textView.setText(str);
            C13628n.m24510a(textView, 0);
        }
        this.f189865e = str;
        Drawable drawable = this.f189864d;
        if (drawable != null) {
            if (this.f189861a && (findViewById = findViewById(R.id.dnb)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0643b.m2369a(getContext(), (int) R.drawable.bnd)}));
            }
            this.f189864d = drawable;
        }
        setOnKeyListener(this);
        this.f189866f = System.currentTimeMillis();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", (currentTimeMillis - this.f189866f) / 1000);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C63244g.m114602a().mo73263I().mo101635a("ug_save_video_click_back", jSONObject);
        return false;
    }
}
