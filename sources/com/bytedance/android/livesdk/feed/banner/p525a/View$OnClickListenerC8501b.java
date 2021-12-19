package com.bytedance.android.livesdk.feed.banner.p525a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.banner.a.b */
public final /* synthetic */ class View$OnClickListenerC8501b implements View.OnClickListener {

    /* renamed from: a */
    private final C8500a f21029a;

    static {
        Covode.recordClassIndex(9355);
    }

    View$OnClickListenerC8501b(C8500a aVar) {
        this.f21029a = aVar;
    }

    public final void onClick(View view) {
        C8500a aVar = this.f21029a;
        if (aVar.f21025e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", aVar.f21026f);
            hashMap.put("banner_id", String.valueOf(aVar.f21025e.getId()));
            C6501b.C6502a.m13948a("banner_click").mo12652a((Map<String, String>) hashMap).mo12639a().mo12645a("banner_position", aVar.f21027g + 1).mo12655b();
            if (!TextUtils.isEmpty(aVar.f21025e.f23278g) && C6193a.m13435a(IHostAction.class) != null) {
                ((IHostAction) C6193a.m13435a(IHostAction.class)).handleSchema(aVar.f21024d, aVar.f21025e.f23278g, new Bundle());
            }
        }
    }
}
