package com.p2082ss.android.ugc.aweme.p3070im;

import android.app.Dialog;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.b */
public final /* synthetic */ class C53590b implements AbstractC34687g {

    /* renamed from: a */
    private final WeakReference f122999a;

    static {
        Covode.recordClassIndex(63168);
    }

    public C53590b(WeakReference weakReference) {
        this.f122999a = weakReference;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g
    /* renamed from: a */
    public final void mo61348a(String str, String str2, boolean z, boolean z2) {
        Dialog dialog = (Dialog) this.f122999a.get();
        if (dialog != null && !TextUtils.equals(str, "HOME")) {
            dialog.dismiss();
        }
    }
}
