package com.bytedance.android.livesdk.olddialog;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p600b.C10010b;
import com.bytedance.android.livesdk.olddialog.p598b.C9998b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.olddialog.c */
final /* synthetic */ class C9999c implements AbstractC1214u {

    /* renamed from: a */
    private final C9991a f24296a;

    static {
        Covode.recordClassIndex(11553);
    }

    C9999c(C9991a aVar) {
        this.f24296a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C9991a aVar = this.f24296a;
        C10010b bVar = (C10010b) obj;
        if (bVar != null) {
            C9998b bVar2 = aVar.f24273c;
            String str = bVar.f24317a;
            String str2 = bVar.f24318b;
            if (bVar2.f24294a != null && str != null && !str.isEmpty()) {
                int b = C11227ap.m19887b(bVar2.f24294a, (float) C11227ap.m19886a(bVar2.f24294a));
                AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
                AbstractC6956d.C6958b a = AbstractC6963e.m14871a(str);
                a.f17398b = b;
                a.f17399c = (int) ((((float) b) / 375.0f) * 275.0f);
                a.f17407k = 0;
                AbstractC6956d.C6958b a2 = a.mo13259a(8, 8, 0, 0);
                a2.f17406j = 80;
                a2.f17413q = false;
                C4031a a3 = webViewManager.mo13245a(a2);
                if (bVar2.f24294a instanceof ActivityC0945e) {
                    C4031a.m9839a((ActivityC0945e) bVar2.f24294a, a3);
                    C89219l.m154721d(str2, "");
                    if (C89219l.m154714a((Object) "gray_prop", (Object) str2)) {
                        C6501b.C6502a.m13948a("gray_prop_click").mo12639a().mo12655b();
                    } else if (C89219l.m154714a((Object) "more_prop", (Object) str2)) {
                        C6501b.C6502a.m13948a("more_prop_click").mo12639a().mo12655b();
                    }
                    C6501b.C6502a.m13948a("task_show").mo12639a().mo12651a("request_page", str2).mo12655b();
                }
            }
        }
    }
}
