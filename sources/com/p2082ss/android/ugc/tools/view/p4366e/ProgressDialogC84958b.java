package com.p2082ss.android.ugc.tools.view.p4366e;

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
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.view.widget.CircularProgressView;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.tools.view.e.b */
public class ProgressDialogC84958b extends ProgressDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    private boolean f189853a;

    /* renamed from: b */
    private CharSequence f189854b;

    /* renamed from: c */
    private Drawable f189855c;

    /* renamed from: d */
    public boolean f189856d = true;

    /* renamed from: e */
    private String f189857e;

    /* renamed from: f */
    private long f189858f;

    /* renamed from: g */
    private Handler f189859g = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(98953);
    }

    /* renamed from: a */
    public final void mo129720a() {
        View findViewById = findViewById(R.id.d_3);
        if (findViewById != null) {
            if (this.f189856d) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo129721b() {
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
        RunnableC84959c cVar = new RunnableC84959c(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cVar.run();
        } else {
            this.f189859g.post(cVar);
        }
    }

    public ProgressDialogC84958b(Context context) {
        super(context, 3);
    }

    public void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f189853a) {
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
        if (this.f189853a && (textView = (TextView) findViewById(R.id.cj9)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f189854b = charSequence;
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
        setContentView(R.layout.b3u);
        this.f189853a = true;
        setMessage(this.f189854b);
        setIndeterminate(false);
        String str = this.f189857e;
        if (this.f189853a && (textView = (TextView) findViewById(R.id.eie)) != null && !C13627m.m24498a(str)) {
            textView.setText(str);
            C13628n.m24510a(textView, 0);
        }
        this.f189857e = str;
        Drawable drawable = this.f189855c;
        if (drawable != null) {
            if (this.f189853a && (findViewById = findViewById(R.id.dnb)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0643b.m2369a(getContext(), (int) R.drawable.bnd)}));
            }
            this.f189855c = drawable;
        }
        setOnKeyListener(this);
        this.f189858f = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static ProgressDialogC84958b m146021b(Context context, String str) {
        ProgressDialogC84958b bVar = new ProgressDialogC84958b(context);
        bVar.setCancelable(false);
        bVar.setIndeterminate(false);
        bVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            bVar.show();
        }
        bVar.setMessage(str);
        bVar.mo129720a();
        return bVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", (currentTimeMillis - this.f189858f) / 1000);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C63244g.m114602a().mo73263I().mo101635a("ug_save_video_click_back", jSONObject);
        return false;
    }
}
