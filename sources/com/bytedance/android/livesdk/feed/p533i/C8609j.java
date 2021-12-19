package com.bytedance.android.livesdk.feed.p533i;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.i.j */
public final /* synthetic */ class C8609j implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC8597a f21276a;

    static {
        Covode.recordClassIndex(9466);
    }

    C8609j(AbstractC8597a aVar) {
        this.f21276a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Context context = this.f21276a.itemView.getContext();
        if (th instanceof C2912a) {
            C2912a aVar = (C2912a) th;
            String alert = aVar.getAlert();
            String prompt = aVar.getPrompt();
            if (!TextUtils.isEmpty(alert)) {
                String string = context.getResources().getString(R.string.gir);
                DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(context);
                aVar2.f22244a = context.getResources().getString(R.string.gj9);
                aVar2.f22245b = alert;
                aVar2.mo15245a((CharSequence) string, (DialogInterface.OnClickListener) null, false);
                aVar2.mo15247a().show();
            } else if (!TextUtils.isEmpty(prompt)) {
                C11226ao.m19883a(context, prompt, 0);
            }
        } else {
            C11226ao.m19882a(context, (int) R.string.gj8);
        }
    }
}
