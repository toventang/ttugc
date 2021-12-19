package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.h */
public final /* synthetic */ class C8034h implements AbstractC1214u {

    /* renamed from: a */
    private final C8024f f20027a;

    static {
        Covode.recordClassIndex(8841);
    }

    C8034h(C8024f fVar) {
        this.f20027a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C8024f fVar = this.f20027a;
        String str = (String) obj;
        if (fVar.f20006k != null) {
            fVar.f20006k.setText(str);
        }
    }
}
