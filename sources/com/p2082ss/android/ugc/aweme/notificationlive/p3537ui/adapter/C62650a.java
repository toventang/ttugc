package com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.NotificationChoiceState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.a */
final /* synthetic */ class C62650a extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f142063a = new C62650a();

    static {
        Covode.recordClassIndex(73453);
    }

    C62650a() {
        super(NotificationChoiceState.class, "pushSwitchState", "getPushSwitchState()Z", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Boolean.valueOf(((NotificationChoiceState) obj).getPushSwitchState());
    }
}
