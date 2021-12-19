package com.p2082ss.android.ugc.aweme.live;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51429c;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.a */
public class ActivityC58486a extends ActivityC17312a {

    /* renamed from: a */
    private C51429c f133161a;

    /* renamed from: b */
    private boolean f133162b;

    /* renamed from: c */
    private boolean f133163c;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo95845e() {
        return -1;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void dismissCustomToast() {
        C51429c cVar = this.f133161a;
        if (cVar != null) {
            cVar.mo86856c();
        }
    }

    static {
        Covode.recordClassIndex(68777);
        Live.getService();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        super.onDestroy();
        C51429c cVar = this.f133161a;
        if (cVar != null) {
            cVar.mo86850a();
        }
    }

    /* renamed from: a */
    private boolean mo16975a() {
        if (isDestroyed()) {
            return false;
        }
        if (this.f133161a != null) {
            return true;
        }
        C51429c cVar = new C51429c(this);
        this.f133161a = cVar;
        cVar.f118510g = this.f133162b;
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        super.onPause();
        C51429c cVar = this.f133161a;
        if (cVar != null) {
            cVar.mo86854b();
        }
        C17233a.f41165a = this.f133163c;
        IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.setCurrentPage(-1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo95856f() {
        List<Fragment> f = getSupportFragmentManager().mo3565f();
        if (!f.isEmpty()) {
            AbstractC0976n a = getSupportFragmentManager().mo3552a();
            for (Fragment fragment : f) {
                a.mo3455a(fragment);
            }
            a.mo3478e();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        super.onResume();
        C51429c cVar = this.f133161a;
        if (cVar != null) {
            cVar.f118509f = false;
        }
        this.f133163c = C17233a.f41165a;
        C17233a.f41165a = true;
        IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.setCurrentPage(mo95845e());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void showCustomToast(String str) {
        if (mo16975a()) {
            this.f133161a.mo86853a(str);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context a = C17867d.m33078a();
        if (a != null) {
            C53438a.m98620a(a);
        }
        this.f133162b = false;
        if (Build.VERSION.SDK_INT >= 21 && Live.getService() != null && ((Boolean) Live.getService().mo12981a("live_nav_black", (Object) false)).booleanValue()) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(256);
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(-16777216);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.common.utility.AbstractC13615f
    public void showCustomLongToast(int i, String str) {
        if (mo16975a()) {
            this.f133161a.mo86851a(i, str);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void showCustomToast(int i, String str) {
        if (mo16975a()) {
            this.f133161a.mo86855b(i, str);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void showCustomToast(String str, int i, int i2) {
        if (mo16975a()) {
            this.f133161a.mo86852a(0, str, i);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.common.utility.AbstractC13615f
    public void showCustomToast(int i, String str, int i2, int i3) {
        if (mo16975a()) {
            this.f133161a.mo86852a(i, str, i2);
        }
    }
}
