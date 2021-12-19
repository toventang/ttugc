package com.bytedance.android.livesdk.chatroom.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.chatroom.p488c.C7396m;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.r */
final /* synthetic */ class C8192r implements AbstractC88433f {

    /* renamed from: a */
    private final MessageBlockWidget f20317a;

    static {
        Covode.recordClassIndex(9015);
    }

    C8192r(MessageBlockWidget messageBlockWidget) {
        this.f20317a = messageBlockWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Drawable drawable;
        MessageBlockWidget messageBlockWidget = this.f20317a;
        C8454g gVar = (C8454g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f20901a;
        boolean z = false;
        boolean z2 = sparseBooleanArray.get(0);
        boolean z3 = sparseBooleanArray.get(2);
        boolean z4 = sparseBooleanArray.get(1);
        if (z2 || z3) {
            z = true;
        }
        C7573e.m15564a(messageBlockWidget.context, messageBlockWidget.getView(), !z, gVar.f20903c);
        C7396m mVar = new C7396m();
        mVar.f18324b = gVar.f20902b;
        mVar.f18323a = gVar.f20901a;
        mVar.f18325c = gVar.f20903c;
        C6779a.m14563a().mo13053a(mVar);
        if (messageBlockWidget.getContext() != null) {
            if (z4) {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable = messageBlockWidget.getContext().getDrawable(2131234648);
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = messageBlockWidget.getContext().getDrawable(2131234733);
            }
            if (!(drawable == null || messageBlockWidget.f20205a == null)) {
                messageBlockWidget.f20205a.setImageDrawable(drawable);
            }
        }
        if (gVar.f20902b == 1) {
            C6501b.C6502a.m13948a("livesdk_landscape_mute_gift_barrage_click").mo12643a(messageBlockWidget.dataChannel).mo12654b("live").mo12656c("click").mo12658d("live_landscape").mo12651a("room_orientation", "landscape").mo12651a("mute_barrage_type", sparseBooleanArray.get(1) ? "close" : "open").mo12655b();
        }
    }
}
