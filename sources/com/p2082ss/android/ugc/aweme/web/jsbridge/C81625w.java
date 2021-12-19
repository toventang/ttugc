package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.w */
public final class C81625w implements AbstractC18293d {

    /* renamed from: a */
    private final WeakReference<Context> f182516a;

    static {
        Covode.recordClassIndex(95022);
    }

    public C81625w(WeakReference<Context> weakReference) {
        C89219l.m154721d(weakReference, "");
        this.f182516a = weakReference;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(jSONObject, "");
        if (this.f182516a.get() != null) {
            C36125t a = C36125t.m73591a();
            Context context = this.f182516a.get();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            C36125t.m73596a(a, (Activity) context, C36131u.m73602a("aweme://profile_edit").mo63247a("jump_school_edit", 1).mo63249a());
        }
    }
}
