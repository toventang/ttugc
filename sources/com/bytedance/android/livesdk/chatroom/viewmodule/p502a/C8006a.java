package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskListUrlSetting;
import com.bytedance.android.livesdk.model.utils.C9913b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.a */
public final class C8006a implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    private Context f19949a;

    /* renamed from: b */
    private C4031a f19950b;

    static {
        Covode.recordClassIndex(8813);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    public C8006a(Context context) {
        this.f19949a = context;
    }

    public final void onClick(View view) {
        C9913b bVar = new C9913b(LiveBroadcastTaskListUrlSetting.INSTANCE.getValue());
        bVar.mo16614a("enter_from", "mission_entrance");
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        int i = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
        C4031a aVar = this.f19950b;
        if (!(aVar == null || aVar.getDialog() == null || !aVar.getDialog().isShowing())) {
            this.f19950b.dismissAllowingStateLoss();
            this.f19950b = null;
        }
        AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
        AbstractC6956d.C6958b a = AbstractC6963e.m14871a(bVar.mo16611a());
        a.f17398b = i;
        a.f17399c = 400;
        AbstractC6956d.C6958b a2 = a.mo13259a(8, 8, 0, 0);
        a2.f17410n = false;
        a2.f17400d = 0;
        a2.f17406j = 80;
        C4031a a3 = webViewManager.mo13245a(a2);
        this.f19950b = a3;
        if (a3 != null) {
            Context context = this.f19949a;
            if (context instanceof ActivityC0945e) {
                C4031a.m9839a((ActivityC0945e) context, a3);
            }
        }
        C6501b.C6502a.m13948a("livesdk_anchor_mission_entrance_click").mo12651a("_param_live_platform", "live").mo12655b();
    }
}
