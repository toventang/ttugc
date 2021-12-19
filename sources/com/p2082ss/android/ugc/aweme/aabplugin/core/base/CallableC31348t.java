package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18127c;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.C31357c;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.t */
final /* synthetic */ class CallableC31348t implements Callable {

    /* renamed from: a */
    private final AbstractC31339n f75095a;

    /* renamed from: b */
    private final int f75096b;

    static {
        Covode.recordClassIndex(38048);
    }

    CallableC31348t(AbstractC31339n nVar, int i) {
        this.f75095a = nVar;
        this.f75096b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        AbstractC31339n nVar = this.f75095a;
        int i = this.f75096b;
        boolean z = nVar.f75078b.f43123j;
        C31357c a = C31357c.m65568a();
        AbstractC18127c cVar = nVar.f75078b.f43124k;
        if (i == 0) {
            if (!nVar.f75077a && z) {
                String str2 = nVar.f75088l;
                if (!a.f75136b) {
                    Activity validTopActivity = ActivityStack.getValidTopActivity();
                    if (validTopActivity != null) {
                        validTopActivity.getLocalClassName();
                        Intent intent = new Intent(validTopActivity, DFInstallBlankActivity.class);
                        intent.putExtra("module_name", str2);
                        intent.putExtra("is_hold_progress_dialog", true);
                        C84349a.m145093a(intent, validTopActivity);
                        validTopActivity.startActivity(intent);
                        validTopActivity.overridePendingTransition(0, 0);
                        a.f75136b = true;
                    }
                } else if (!(a.f75135a == null || a.f75135a.f75129b == null || a.f75135a.f75129b.isFinishing())) {
                    a.f75135a.show();
                }
            }
            if (cVar != null) {
                cVar.mo28883a(nVar.f75077a);
            }
        } else if (i == 1) {
            if (!nVar.f75077a && z) {
                a.mo57382a(nVar.f75083g, nVar.f75082f);
            }
            if (cVar != null) {
                cVar.mo28884a(nVar.f75077a, nVar.f75083g, nVar.f75082f);
            }
        } else if (i == 2) {
            if (!nVar.f75077a && z) {
                a.mo57382a(nVar.f75083g, nVar.f75082f);
                if (!(a.f75135a == null || a.f75135a.f75129b == null)) {
                    Context context = a.f75135a.getContext();
                    if (nVar.f75079c == null || (str = nVar.f75079c.f43164g) == null) {
                        str = context.getString(R.string.g1j);
                    }
                    a.f75135a.setMessage(str);
                }
            }
            if (cVar != null) {
                cVar.mo28884a(nVar.f75077a, nVar.f75083g, nVar.f75082f);
                cVar.mo28885b(nVar.f75077a);
            }
        } else if (i == 3) {
            if (z) {
                a.mo57383b();
            }
            if (cVar != null) {
                cVar.mo28886c(nVar.f75077a);
            }
        }
        return null;
    }
}
