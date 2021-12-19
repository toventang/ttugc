package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.tooltip.C23342c;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$showGroupChatGuideBubble$1 */
final class IMService$showGroupChatGuideBubble$1 implements Runnable {
    final /* synthetic */ View $anchor;
    final /* synthetic */ Context $context;
    final /* synthetic */ Keva $keva;

    static {
        Covode.recordClassIndex(64893);
    }

    IMService$showGroupChatGuideBubble$1(Context context, View view, Keva keva) {
        this.$context = context;
        this.$anchor = view;
        this.$keva = keva;
    }

    public final void run() {
        ((C23329a) new C23329a(this.$context).mo38041b(this.$anchor).mo38027a().mo38034a(EnumC23352h.BOTTOM)).mo38023e(R.string.c8e).mo38033a(new C23342c.AbstractC23345c(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService$showGroupChatGuideBubble$1.C551601 */
            final /* synthetic */ IMService$showGroupChatGuideBubble$1 this$0;

            static {
                Covode.recordClassIndex(64894);
            }

            @Override // com.bytedance.tux.tooltip.C23342c.AbstractC23345c
            public final void onShow() {
                this.this$0.$keva.storeBoolean("im_key_guide_show", true);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.this$0 = r1;
            }
        }).mo38012d().mo38001a();
    }
}
