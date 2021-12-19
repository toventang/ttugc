package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.C7260a;
import com.bytedance.android.livesdk.chatroom.p488c.C7376ai;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11719c;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ay */
public final /* synthetic */ class C8075ay implements AbstractC88433f {

    /* renamed from: a */
    private final DecorationWrapperWidget f20087a;

    /* renamed from: b */
    private final C7376ai f20088b;

    static {
        Covode.recordClassIndex(8882);
    }

    C8075ay(DecorationWrapperWidget decorationWrapperWidget, C7376ai aiVar) {
        this.f20087a = decorationWrapperWidget;
        this.f20088b = aiVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11719c cVar;
        DecorationWrapperWidget decorationWrapperWidget = this.f20087a;
        C5832d dVar = (C5832d) obj;
        String str = this.f20088b.f18287a;
        String str2 = (dVar == null || (cVar = (C11719c) dVar.data) == null || TextUtils.isEmpty(cVar.f27998a)) ? "" : cVar.f27998a;
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        String encodedQuery = parse.getEncodedQuery();
        if (TextUtils.isEmpty(encodedQuery)) {
            buildUpon.encodedQuery(str2);
        } else {
            buildUpon.encodedQuery(encodedQuery + "&" + str2);
        }
        buildUpon.appendQueryParameter("ttScenario", "streaming");
        Context context = decorationWrapperWidget.getContext();
        AbstractC6956d.C6958b a = AbstractC6963e.m14871a(buildUpon.build().toString()).mo13259a(0, 0, 0, 0);
        a.f17407k = -1;
        double b = (double) C3966y.m9662b();
        Double.isNaN(b);
        a.f17399c = (int) C3966y.m9668e((int) (b * 0.7d));
        a.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
        a.f17406j = 80;
        C4031a a2 = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13246a(a, new C7260a(a.f17397a, null, C8078ba.f20091a));
        ActivityC0945e a3 = C11279p.m20001a(context);
        if (a2 != null && a3 != null) {
            C4031a.m9839a(a3, a2);
        }
    }
}
