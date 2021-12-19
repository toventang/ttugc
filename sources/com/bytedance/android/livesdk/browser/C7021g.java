package com.bytedance.android.livesdk.browser;

import android.view.View;
import com.bytedance.android.live.p176b.AbstractC2938l;
import com.bytedance.android.livesdk.C6417a;
import com.bytedance.android.livesdk.C6910bj;
import com.bytedance.android.livesdk.container.p513j.C8273c;
import com.bytedance.android.livesdk.lynx.lynxcard.C9371e;
import com.bytedance.android.livesdk.lynx.lynxcard.C9375h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.g */
public final class C7021g implements AbstractC2938l {

    /* renamed from: b */
    public static final C7022a f17616b = new C7022a((byte) 0);

    /* renamed from: a */
    public final Map<String, View> f17617a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(7760);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.g$a */
    public static final class C7022a {
        static {
            Covode.recordClassIndex(7761);
        }

        private C7022a() {
        }

        public /* synthetic */ C7022a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.g$b */
    public static final class C7023b {

        /* renamed from: a */
        public static final C7021g f17618a = new C7021g();

        /* renamed from: b */
        public static final C7023b f17619b = new C7023b();

        private C7023b() {
        }

        static {
            Covode.recordClassIndex(7762);
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2938l
    /* renamed from: a */
    public final void mo7679a(C9371e eVar) {
        C89219l.m154721d(eVar, "");
        DataChannelGlobal.f42558d.mo28328c(C6417a.class, eVar);
    }

    /* renamed from: a */
    public final View mo13328a(String str) {
        C89219l.m154721d(str, "");
        View view = this.f17617a.get(str);
        if (view != null) {
            return (C8273c) view;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo13329a(View view) {
        C89219l.m154721d(view, "");
        for (Map.Entry<String, View> entry : this.f17617a.entrySet()) {
            if (C89219l.m154714a(entry.getValue(), view)) {
                this.f17617a.remove(entry.getKey());
            }
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2938l
    /* renamed from: a */
    public final void mo7680a(C9375h hVar) {
        C89219l.m154721d(hVar, "");
        DataChannelGlobal.f42558d.mo28328c(C6910bj.class, hVar);
    }
}
