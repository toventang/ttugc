package com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.m */
public final class C68375m {

    /* renamed from: a */
    public final LiveData<EnumC68374l> f153024a;

    /* renamed from: b */
    private final C1213t<EnumC68374l> f153025b;

    static {
        Covode.recordClassIndex(80603);
    }

    public C68375m() {
        C1213t<EnumC68374l> tVar = new C1213t<>();
        this.f153025b = tVar;
        this.f153024a = tVar;
    }

    /* renamed from: a */
    public final void mo108820a(boolean z) {
        if (z) {
            this.f153025b.setValue(EnumC68374l.HIDDEN);
            return;
        }
        C39162r.m79460a("notifications_show", C89041ag.m154412a(C89387v.m154943a("status", "off")));
        this.f153025b.setValue(EnumC68374l.WITH_TEXT);
    }
}
