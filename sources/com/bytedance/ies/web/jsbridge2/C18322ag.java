package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;

/* renamed from: com.bytedance.ies.web.jsbridge2.ag */
final /* synthetic */ class C18322ag implements AbstractC18347m.AbstractC18348a.AbstractC18349a {

    /* renamed from: a */
    private final C18315ad f43827a;

    /* renamed from: b */
    private final C18364w.AbstractC18367b f43828b;

    static {
        Covode.recordClassIndex(20994);
    }

    C18322ag(C18315ad adVar, C18364w.AbstractC18367b bVar) {
        this.f43827a = adVar;
        this.f43828b = bVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a.AbstractC18349a
    /* renamed from: a */
    public final void mo29315a(String str) {
        C18315ad adVar = this.f43827a;
        C18364w.AbstractC18367b bVar = this.f43828b;
        if (TextUtils.isEmpty(str)) {
            str = adVar.f43809b.mo29382c();
            C18315ad.m34059a(str, TimeLineEvent.C18303b.f43693I, (String) null);
        } else {
            C18315ad.m34059a(str, TimeLineEvent.C18303b.f43694J, (String) null);
        }
        adVar.mo29322a(true, str, bVar);
    }
}
