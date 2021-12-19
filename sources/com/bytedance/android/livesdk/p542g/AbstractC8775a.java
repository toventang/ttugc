package com.bytedance.android.livesdk.p542g;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.g.a */
public abstract class AbstractC8775a {

    /* renamed from: a */
    protected boolean f21636a;

    /* renamed from: b */
    protected Context f21637b;

    /* renamed from: c */
    protected View f21638c;

    /* renamed from: d */
    private Set<Dialog> f21639d = new HashSet();

    static {
        Covode.recordClassIndex(9652);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15047a() {
        this.f21636a = false;
        this.f21637b = null;
        this.f21638c = null;
        for (Dialog dialog : this.f21639d) {
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        this.f21639d.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15048a(Context context, View view) {
        this.f21637b = context;
        this.f21638c = view;
        this.f21636a = true;
    }
}
