package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89188r;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ag */
final /* synthetic */ class C7720ag implements AbstractC89188r {

    /* renamed from: a */
    private final AbstractC7703a f19184a;

    static {
        Covode.recordClassIndex(8515);
    }

    C7720ag(AbstractC7703a aVar) {
        this.f19184a = aVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89188r
    /* renamed from: a */
    public final Object mo8774a(Object obj, Object obj2, Object obj3, Object obj4) {
        float floatValue = ((Float) obj3).floatValue();
        ((Float) obj4).floatValue();
        return Boolean.valueOf(this.f19184a.mo13948a((MotionEvent) obj, (MotionEvent) obj2, floatValue));
    }
}
