package com.p2082ss.android.ugc.aweme.feed.p2944e;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;

/* renamed from: com.ss.android.ugc.aweme.feed.e.d */
public class C49431d {

    /* renamed from: b */
    protected Activity f113599b;

    /* renamed from: c */
    protected Fragment f113600c;

    /* renamed from: d */
    public String f113601d;

    /* renamed from: e */
    public int f113602e;

    /* renamed from: f */
    protected String f113603f;

    /* renamed from: g */
    public String f113604g = "click";

    /* renamed from: h */
    public boolean f113605h;

    /* renamed from: i */
    public String f113606i;

    /* renamed from: j */
    public String f113607j;

    static {
        Covode.recordClassIndex(58244);
    }

    /* renamed from: b */
    public void mo81056b() {
        this.f113599b = null;
    }

    /* renamed from: c */
    public Activity mo81058c() {
        return this.f113599b;
    }

    /* renamed from: d */
    public Context mo81059d() {
        return this.f113599b;
    }

    /* renamed from: e */
    public Fragment mo81060e() {
        return this.f113600c;
    }

    /* renamed from: f */
    public String mo81061f() {
        return this.f113603f;
    }

    /* renamed from: j */
    public String mo81064j() {
        return this.f113601d;
    }

    /* renamed from: h */
    public final boolean mo81062h() {
        AbstractC18234b bVar = (AbstractC18234b) mo81060e();
        if (bVar != null) {
            return bVar.af_();
        }
        Activity activity = this.f113599b;
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final AbstractC0952i mo81063i() {
        Fragment e = mo81060e();
        if (e != null) {
            return e.getChildFragmentManager();
        }
        Activity activity = this.f113599b;
        if (activity instanceof ActivityC0945e) {
            return ((ActivityC0945e) activity).getSupportFragmentManager();
        }
        return null;
    }

    /* renamed from: b */
    public void mo81057b(String str) {
        this.f113603f = str;
    }

    /* renamed from: a */
    public void mo65520a(Activity activity, Fragment fragment) {
        this.f113599b = activity;
        this.f113600c = fragment;
    }

    public C49431d(String str, int i) {
        this.f113601d = str;
        this.f113602e = i;
    }
}
