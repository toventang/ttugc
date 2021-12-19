package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.d */
public final /* synthetic */ class C8019d implements AbstractC1214u {

    /* renamed from: a */
    private final C8007b f19988a;

    static {
        Covode.recordClassIndex(8826);
    }

    C8019d(C8007b bVar) {
        this.f19988a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C8007b bVar = this.f19988a;
        String str = (String) obj;
        if (bVar.f19963m != null) {
            bVar.f19963m.setText(str);
        }
    }
}
