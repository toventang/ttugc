package com.bytedance.android.livesdk.browser.p463d;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.d.e */
final /* synthetic */ class View$OnClickListenerC6983e implements View.OnClickListener {

    /* renamed from: a */
    private final C6972a f17511a;

    static {
        Covode.recordClassIndex(7722);
    }

    View$OnClickListenerC6983e(C6972a aVar) {
        this.f17511a = aVar;
    }

    public final void onClick(View view) {
        C6972a aVar = this.f17511a;
        C11666c.C11667a a = C11666c.m20575a();
        a.f27865l = aVar.f17483i;
        a.f27850N = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
        if (aVar.f17481g) {
            a.f27841E = "live_links";
            a.f27849M = aVar.f17482h;
        }
        ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share().mo11989a(aVar.getActivity(), a.mo18437a(), new AbstractC11665b() {
            /* class com.bytedance.android.livesdk.browser.p463d.C6972a.C69775 */

            static {
                Covode.recordClassIndex(7716);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8903a(String str, String str2, Bundle bundle) {
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8904a(Throwable th) {
            }
        });
    }
}
