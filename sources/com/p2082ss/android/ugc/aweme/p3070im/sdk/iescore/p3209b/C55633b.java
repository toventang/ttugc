package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.b */
public final class C55633b implements AbstractC17449b {

    /* renamed from: a */
    public static final C55633b f126893a = new C55633b();

    private C55633b() {
    }

    static {
        Covode.recordClassIndex(65415);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27835a(JSONObject jSONObject) {
        C12290b.m22064a("im_event", jSONObject);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27834a(Throwable th) {
        C89219l.m154721d(th, "");
        C56244a.m102187a("iesimcore", th);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: b */
    public final void mo27837b(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        mo27832a(str, jSONObject);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: c */
    public final void mo27839c(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        mo27832a(str, jSONObject);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27830a(String str, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(th, "");
        if (C89219l.m154714a((Object) str, (Object) "imsdk2")) {
            C56244a.m102187a(str, th);
        } else {
            C56244a.m102186a("iesimcore", str, th);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: d */
    public final void mo27840d(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC56220e b = C55076b.m100723b();
        if (b != null) {
            b.feedbackIm(str, str2);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27827a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C89219l.m154714a((Object) str, (Object) "imsdk2")) {
            C56244a.m102190b(str, str2);
        } else {
            C56244a.m102190b("iesimcore", str + ": " + str2);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: b */
    public final void mo27836b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C89219l.m154714a((Object) str, (Object) "imsdk2")) {
            C56244a.m102191c(str, str2);
        } else {
            C56244a.m102191c("iesimcore", str + ": " + str2);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: c */
    public final void mo27838c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C89219l.m154714a((Object) str, (Object) "imsdk2")) {
            C56244a.m102193e(str, str2);
        } else {
            C56244a.m102193e("iesimcore", str + ": " + str2);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27831a(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C39162r.m79460a(str, map);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27832a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C39162r.m79461a(str, jSONObject);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27829a(String str, String str2, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C55197c.m100914a(str, str2, map);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27828a(String str, String str2, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(th, "");
        if (C89219l.m154714a((Object) str, (Object) "imsdk2")) {
            C56244a.m102186a(str, str2, th);
        } else {
            C56244a.m102186a("iesimcore", str + ": " + str2, th);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b
    /* renamed from: a */
    public final void mo27833a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(str, "");
        C12290b.m22065a(str, jSONObject, (JSONObject) null);
    }
}
