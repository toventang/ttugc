package com.bytedance.android.livesdk.chatroom.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.m */
final /* synthetic */ class C8185m implements AbstractC88433f {

    /* renamed from: a */
    private final LockScreenWidget f20310a;

    static {
        Covode.recordClassIndex(9008);
    }

    C8185m(LockScreenWidget lockScreenWidget) {
        this.f20310a = lockScreenWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        boolean z;
        Drawable drawable;
        LockScreenWidget lockScreenWidget = this.f20310a;
        C8454g gVar = (C8454g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f20901a;
        boolean z2 = gVar.f20903c;
        boolean z3 = sparseBooleanArray.get(0);
        boolean z4 = sparseBooleanArray.get(2);
        C7573e.m15564a(lockScreenWidget.context, lockScreenWidget.getView(), !z3, z2);
        if (lockScreenWidget.getContext() != null) {
            if (z4) {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable = lockScreenWidget.getContext().getDrawable(2131234694);
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = lockScreenWidget.getContext().getDrawable(R.drawable.c7m);
            }
            if (!(drawable == null || lockScreenWidget.f20203a == null)) {
                lockScreenWidget.f20203a.setImageDrawable(drawable);
            }
        }
        if (gVar.f20902b == 2 && (z = sparseBooleanArray.get(2)) != lockScreenWidget.f20204b) {
            lockScreenWidget.f20204b = z;
            boolean z5 = lockScreenWidget.f20204b;
            HashMap hashMap = new HashMap();
            if (z5) {
                hashMap.put("lock_type", "lock");
            } else {
                hashMap.put("lock_type", "unlock");
            }
            hashMap.put("room_orientation", "landscape");
            C6501b.C6502a.m13948a("livesdk_landscape_screen_lock_click").mo12652a((Map<String, String>) hashMap).mo12643a(lockScreenWidget.dataChannel).mo12654b("live").mo12656c("click").mo12658d("live_landscape").mo12655b();
        }
    }
}
