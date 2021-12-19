package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72175bj;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bk */
public final /* synthetic */ class C72177bk implements AbstractC63264v.AbstractC63265a {

    /* renamed from: a */
    private final C72175bj.AbstractC72176a f161793a;

    /* renamed from: b */
    private final Context f161794b;

    static {
        Covode.recordClassIndex(84842);
    }

    C72177bk(C72175bj.AbstractC72176a aVar, Context context) {
        this.f161793a = aVar;
        this.f161794b = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
    /* renamed from: a */
    public final void mo87657a(String[] strArr, int[] iArr) {
        boolean z;
        C72175bj.AbstractC72176a aVar = this.f161793a;
        Context context = this.f161794b;
        if (iArr == null || iArr.length == 0 || strArr == null || strArr.length == 0) {
            C73991bj.m130131b("reuse mv permission is empty!");
            aVar.mo114423a();
            return;
        }
        for (int i : iArr) {
            if (i == -1) {
                C73991bj.m130131b("reuse mv deny permission");
                String[] strArr2 = {"android.permission.WRITE_EXTERNAL_STORAGE"};
                int i2 = 0;
                while (true) {
                    String str = strArr2[0];
                    if (C63238c.f143566D.mo73307c().mo101670a(context, str) == -1 && !C63238c.f143566D.mo73307c().mo101672a((Activity) context, str)) {
                        z = true;
                        break;
                    }
                    i2++;
                    if (i2 > 0) {
                        z = false;
                        break;
                    }
                }
                C85056k.m146252a(new C17197a.C17200a(context).mo27194b(R.string.v0).mo27195b(R.string.v1, DialogInterface$OnClickListenerC72178bl.f161795a, false).mo27190a(R.string.as2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC72179bm(z, context, aVar), false).mo27193a().mo27184b());
                aVar.mo114424b();
                return;
            }
        }
        C73991bj.m130128a("reuse mv allow permission");
        aVar.mo114423a();
    }
}
