package com.p2082ss.android.ugc.aweme.account.login;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.uikit.p1280b.C18245c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.b */
public class ActivityC31890b extends ActivityC17312a {

    /* renamed from: a */
    protected int f76192a;

    /* renamed from: b */
    protected View f76193b;

    /* renamed from: c */
    protected View f76194c;

    /* renamed from: d */
    public TextView f76195d;

    /* renamed from: e */
    public TextView f76196e;

    /* renamed from: f */
    public TextView f76197f;

    /* renamed from: g */
    protected ProgressBar f76198g;

    /* renamed from: h */
    protected C18245c f76199h;

    static {
        Covode.recordClassIndex(38634);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo57794a() {
        return R.layout.g1;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            e.printStackTrace();
            finish();
        }
    }

    /* renamed from: b */
    public void mo57799b() {
        this.f76193b = findViewById(R.id.dnk);
        View findViewById = findViewById(R.id.eiz);
        this.f76194c = findViewById;
        if (findViewById != null) {
            this.f76195d = (TextView) findViewById.findViewById(R.id.pf);
            this.f76196e = (TextView) this.f76194c.findViewById(R.id.dkl);
            this.f76197f = (TextView) this.f76194c.findViewById(R.id.title);
            this.f76198g = (ProgressBar) this.f76194c.findViewById(R.id.dki);
        }
        TextView textView = this.f76195d;
        if (textView != null) {
            int i = Build.VERSION.SDK_INT;
            Drawable background = textView.getBackground();
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (background != null) {
                background.setAutoMirrored(true);
            }
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setAutoMirrored(true);
                }
            }
            for (Drawable drawable2 : compoundDrawablesRelative) {
                if (drawable2 != null) {
                    drawable2.setAutoMirrored(true);
                }
            }
            this.f76195d.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.account.login.ActivityC31890b.View$OnClickListenerC318911 */

                static {
                    Covode.recordClassIndex(38635);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    ActivityC31890b.this.onBackPressed();
                }
            });
        }
        View findViewById2 = findViewById(R.id.ed_);
        if (findViewById2 != null && (findViewById2 instanceof C18245c)) {
            this.f76199h = (C18245c) findViewById2;
        }
        C18245c cVar = this.f76199h;
        if (cVar != null) {
            cVar.setOnSwipeListener(new C18245c.AbstractC18246a() {
                /* class com.p2082ss.android.ugc.aweme.account.login.ActivityC31890b.C318922 */

                static {
                    Covode.recordClassIndex(38636);
                }
            });
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f76197f;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        activityConfiguration(C31894c.f76205a);
        this.f76192a = 0;
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(mo57794a());
        mo57799b();
    }
}
