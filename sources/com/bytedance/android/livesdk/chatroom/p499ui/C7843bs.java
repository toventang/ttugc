package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bs */
final /* synthetic */ class C7843bs implements AbstractC88433f {

    /* renamed from: a */
    private final C7822br f19563a;

    static {
        Covode.recordClassIndex(8638);
    }

    C7843bs(C7822br brVar) {
        this.f19563a = brVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7822br brVar = this.f19563a;
        if (brVar.getActivity() != null && !brVar.getActivity().isFinishing()) {
            try {
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(brVar.getActivity(), new Object[0]);
            } catch (Throwable unused) {
            }
        }
    }
}
