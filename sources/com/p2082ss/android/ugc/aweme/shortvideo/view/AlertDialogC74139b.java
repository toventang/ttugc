package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.b */
public final class AlertDialogC74139b extends AlertDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public boolean f166518a = true;

    /* renamed from: b */
    public boolean f166519b;

    /* renamed from: c */
    public AbstractC74143a f166520c;

    /* renamed from: d */
    public TextView f166521d;

    /* renamed from: e */
    public ImageView f166522e;

    /* renamed from: f */
    public View f166523f;

    /* renamed from: g */
    private CharSequence f166524g;

    /* renamed from: h */
    private boolean f166525h;

    /* renamed from: i */
    private int f166526i;

    /* renamed from: j */
    private Drawable f166527j;

    /* renamed from: k */
    private String f166528k;

    /* renamed from: l */
    private long f166529l;

    /* renamed from: m */
    private int f166530m = 100;

    /* renamed from: n */
    private CircularProgressView f166531n;

    /* renamed from: o */
    private TextView f166532o;

    /* renamed from: p */
    private TextView f166533p;

    /* renamed from: q */
    private C69488a f166534q;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.b$a */
    public interface AbstractC74143a {
        static {
            Covode.recordClassIndex(86902);
        }

        /* renamed from: a */
        void mo116613a();
    }

    static {
        Covode.recordClassIndex(86898);
    }

    /* renamed from: b */
    private void m130366b() {
        if (!this.f166519b) {
            return;
        }
        if (this.f166518a) {
            this.f166533p.setVisibility(0);
        } else {
            this.f166533p.setVisibility(4);
        }
    }

    public final void dismiss() {
        RunnableC74144c cVar = new RunnableC74144c(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            cVar.run();
        } else {
            C29339a.m58754b(cVar);
        }
        this.f166534q.mo109736a("download_dialog", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo116601a() {
        if (this.f166531n == null) {
            this.f166531n = (CircularProgressView) findViewById(R.id.bxi);
        }
        this.f166531n.mo61409b();
        super.dismiss();
    }

    private AlertDialogC74139b(Context context) {
        super(context, R.style.fm);
    }

    /* renamed from: b */
    private void m130367b(int i) {
        if (this.f166519b) {
            this.f166531n.setMaxProgress((float) i);
        }
        this.f166530m = i;
    }

    /* renamed from: a */
    private void m130364a(String str) {
        if (this.f166519b && this.f166532o != null && !C13627m.m24498a(str)) {
            this.f166532o.setText(str);
            C13628n.m24510a(this.f166532o, 0);
        }
        this.f166528k = str;
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        if (this.f166519b) {
            this.f166521d.setText(charSequence);
            TextView textView = this.f166521d;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f166524g = charSequence;
    }

    /* renamed from: a */
    private void m130365a(boolean z) {
        int i;
        if (this.f166519b) {
            this.f166531n.setIndeterminate(z);
            TextView textView = this.f166533p;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f166525h = z;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mi);
        this.f166523f = findViewById(R.id.dnb);
        this.f166521d = (TextView) findViewById(R.id.cj9);
        this.f166531n = (CircularProgressView) findViewById(R.id.bxi);
        this.f166532o = (TextView) findViewById(R.id.eie);
        this.f166522e = (ImageView) findViewById(R.id.a0x);
        this.f166533p = (TextView) findViewById(R.id.d_3);
        this.f166519b = true;
        C69488a a = C69488a.C69489a.m122709a(getContext());
        this.f166534q = a;
        a.mo109736a("download_dialog", true);
        setMessage(this.f166524g);
        m130365a(this.f166525h);
        m130367b(this.f166530m);
        mo116602a(this.f166526i);
        m130364a(this.f166528k);
        m130366b();
        Drawable drawable = this.f166527j;
        if (drawable != null) {
            if (this.f166519b) {
                this.f166523f.setBackground(new LayerDrawable(new Drawable[]{drawable, C0643b.m2369a(getContext(), (int) R.drawable.pn)}));
            }
            this.f166527j = drawable;
        }
        setOnKeyListener(this);
        this.f166529l = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo116602a(int i) {
        if (this.f166519b) {
            this.f166533p.setText(i + "%");
            this.f166531n.setProgress((float) i);
        }
        this.f166526i = i;
    }

    /* renamed from: a */
    public static AlertDialogC74139b m130363a(Context context, String str) {
        AlertDialogC74139b bVar = new AlertDialogC74139b(context);
        bVar.setCancelable(false);
        bVar.m130365a(false);
        bVar.m130367b(100);
        bVar.setMessage(str);
        bVar.m130364a((String) null);
        bVar.m130366b();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (C33067a.m67726a(activity, true) && !activity.isFinishing()) {
                bVar.show();
            }
        }
        return bVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", (currentTimeMillis - this.f166529l) / 1000);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C34611o.m70668a("ug_save_video_click_back", jSONObject);
        return false;
    }
}
