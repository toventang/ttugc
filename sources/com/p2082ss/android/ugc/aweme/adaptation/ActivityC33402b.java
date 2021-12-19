package com.p2082ss.android.ugc.aweme.adaptation;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.google.android.play.core.p1965d.C26975a;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.setting.C68024bj;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.greenrobot.eventbus.EventBus;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.adaptation.b */
public class ActivityC33402b extends ActivityC0218d implements AbstractC33401b {

    /* renamed from: a */
    public boolean f79366a;

    /* renamed from: b */
    public boolean f79367b;

    /* renamed from: c */
    public boolean f79368c;

    /* renamed from: d */
    private final String f79369d;

    /* renamed from: e */
    private HashMap f79370e;

    static {
        Covode.recordClassIndex(40259);
    }

    public boolean bA_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean cz_() {
        return true;
    }

    /* renamed from: d_ */
    public View mo59481d_(int i) {
        if (this.f79370e == null) {
            this.f79370e = new HashMap();
        }
        View view = (View) this.f79370e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79370e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public String bz_() {
        return this.f79369d;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        super.onStop();
        this.f79366a = false;
    }

    /* access modifiers changed from: protected */
    public int bB_() {
        return C0643b.m2378c(this, R.color.a2);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        this.f79367b = false;
        super.onResume();
        this.f79366a = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.analysis.AbstractC33401b
    /* renamed from: f */
    public Analysis mo59474f() {
        String bz_ = bz_();
        if (bz_ == null || bz_.length() <= 0) {
            return null;
        }
        return new Analysis().setLabelName(bz_());
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        EventBus a = EventBus.m156962a();
        if (bA_() && a.mo145393a(this)) {
            a.mo145395b(this);
        }
        super.onDestroy();
        this.f79368c = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo59480d() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            C89219l.m154716b(window, "");
            window.setStatusBarColor(bB_());
            return;
        }
        int i = Build.VERSION.SDK_INT;
        C18247a.m33947a(this, bB_());
    }

    public void attachBaseContext(Context context) {
        Context b = C53457c.m98656b(context);
        C26975a.m53596a(b, false);
        super.attachBaseContext(b);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        this.f79367b = true;
    }

    @Override // androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        if (cz_()) {
            mo59480d();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        if (cz_()) {
            mo59480d();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C68024bj.m120326a()) {
            getWindow().addFlags(128);
        }
        C40970e.m82485a("current page: " + getClass().getSimpleName());
        getLifecycle().mo4012a(new AnalysisActivityComponent(this, this));
        EventBus a = EventBus.m156962a();
        if (!a.mo145393a(this) && bA_()) {
            EventBus.m156966a(a, this);
        }
    }
}
