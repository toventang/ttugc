package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.p024a.AbstractServiceConnectionC0481d;
import androidx.browser.p024a.C0471b;
import androidx.browser.p024a.C0483e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.login.a */
public final class C24846a extends AbstractServiceConnectionC0481d {

    /* renamed from: a */
    public static C0483e f58975a;

    /* renamed from: b */
    private static C0471b f58976b;

    static {
        Covode.recordClassIndex(29035);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    /* renamed from: a */
    private static void m47648a() {
        C0471b bVar;
        if (f58975a == null && (bVar = f58976b) != null) {
            f58975a = bVar.mo2032b();
        }
    }

    /* renamed from: a */
    public static void m47649a(Uri uri) {
        if (f58975a == null) {
            m47648a();
        }
        C0483e eVar = f58975a;
        if (eVar != null) {
            eVar.mo2043a(uri, null);
        }
    }

    @Override // androidx.browser.p024a.AbstractServiceConnectionC0481d
    /* renamed from: a */
    public final void mo2033a(C0471b bVar) {
        f58976b = bVar;
        bVar.mo2031a();
        m47648a();
    }
}
