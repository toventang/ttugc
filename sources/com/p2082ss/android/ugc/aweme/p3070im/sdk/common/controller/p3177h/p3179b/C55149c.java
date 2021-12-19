package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3179b;

import android.view.View;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53697j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3179b.ViewTreeObserver$OnDrawListenerC55141a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.c */
public final class C55149c implements AbstractC55147b {

    /* renamed from: c */
    public static final C55150a f126189c = new C55150a((byte) 0);

    /* renamed from: b */
    public final Map<String, C53697j> f126190b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(64877);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.c$a */
    public static final class C55150a {
        static {
            Covode.recordClassIndex(64878);
        }

        private C55150a() {
        }

        public /* synthetic */ C55150a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.c$b */
    public static final class C55151b implements ViewTreeObserver$OnDrawListenerC55141a.AbstractC55143b {

        /* renamed from: a */
        final /* synthetic */ C55149c f126191a;

        /* renamed from: b */
        final /* synthetic */ String f126192b;

        static {
            Covode.recordClassIndex(64879);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3179b.ViewTreeObserver$OnDrawListenerC55141a.AbstractC55143b
        /* renamed from: a */
        public final void mo92065a() {
            C53697j jVar = this.f126191a.f126190b.get(this.f126192b);
            if (jVar != null) {
                jVar.mo90242b();
                String str = this.f126192b;
                long c = jVar.mo90243c();
                String concat = "im_first_frame_".concat(String.valueOf(str));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("draw_time", c);
                C12290b.m22066a(concat, new JSONObject(), jSONObject, (JSONObject) null);
            }
        }

        C55151b(C55149c cVar, String str) {
            this.f126191a = cVar;
            this.f126192b = str;
        }
    }

    /* renamed from: a */
    public final void mo92073a(String str) {
        C89219l.m154721d(str, "");
        this.f126190b.put(str, C53697j.C53699a.m98968a());
    }

    /* renamed from: a */
    public final void mo92072a(View view, String str) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        ViewTreeObserver$OnDrawListenerC55141a.C55142a.m100854a(view, new C55151b(this, str));
    }
}
