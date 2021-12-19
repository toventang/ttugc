package com.p2082ss.android.newmedia.p2167e.p2168a;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.newmedia.e.a.c */
final /* synthetic */ class C30139c implements AbstractC1729g {

    /* renamed from: a */
    private final Context f71906a;

    static {
        Covode.recordClassIndex(36638);
    }

    C30139c(Context context) {
        this.f71906a = context;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        Context context = this.f71906a;
        if (!((Boolean) iVar.mo5545d()).booleanValue()) {
            return null;
        }
        Toast makeText = Toast.makeText(context, (int) R.string.geo, 1);
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(makeText);
        }
        makeText.show();
        return null;
    }
}
