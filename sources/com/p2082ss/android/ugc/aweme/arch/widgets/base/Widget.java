package com.p2082ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1182af;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.Widget */
public abstract class Widget implements AbstractC1183ag, AbstractC33974au {

    /* renamed from: a */
    private boolean f80269a;

    /* renamed from: b */
    public Context f80270b;

    /* renamed from: c */
    protected View f80271c;

    /* renamed from: d */
    public View f80272d;

    /* renamed from: e */
    public DataCenter f80273e;

    /* renamed from: f */
    public AbstractC33940a f80274f;

    /* renamed from: g */
    boolean f80275g;

    /* renamed from: h */
    private C1182af f80276h;

    /* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.Widget$a */
    protected interface AbstractC33940a {
        static {
            Covode.recordClassIndex(40865);
        }

        /* renamed from: a */
        AbstractC1204m mo60209a();

        /* renamed from: a */
        void mo60210a(Intent intent, int i);

        /* renamed from: b */
        Activity mo60211b();
    }

    static {
        Covode.recordClassIndex(40864);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60204a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo60206a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo60207c() {
        return 0;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
    }

    public boolean ai_() {
        return this.f80269a;
    }

    /* access modifiers changed from: protected */
    public AbstractC1204m aj_() {
        return this.f80274f.mo60209a();
    }

    /* renamed from: d */
    public final Activity mo60208d() {
        return this.f80274f.mo60211b();
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public C1182af getViewModelStore() {
        if (this.f80276h == null) {
            this.f80276h = new C1182af();
        }
        return this.f80276h;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        this.f80269a = true;
        this.f80275g = false;
        mo60206a(this.f80272d);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f80269a = false;
        this.f80275g = true;
        C1182af afVar = this.f80276h;
        if (afVar != null) {
            afVar.mo3997a();
        }
    }

    /* renamed from: a */
    public final void mo60205a(Intent intent, int i) {
        this.f80274f.mo60210a(intent, i);
    }
}
