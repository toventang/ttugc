package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.c */
public final class C34320c extends Exception implements AbstractC34343p {

    /* renamed from: a */
    private final String f81173a;

    static {
        Covode.recordClassIndex(41264);
    }

    public final String getType() {
        return this.f81173a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34343p
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", this.f81173a);
        StringBuilder sb = new StringBuilder();
        Throwable cause = getCause();
        if (cause == null) {
            C89219l.m154715b();
        }
        StringBuilder append = sb.append(cause.getClass().getSimpleName()).append(": ");
        Throwable cause2 = getCause();
        if (cause2 == null) {
            C89219l.m154715b();
        }
        jSONObject.put("error_message", append.append(cause2.getMessage()).toString());
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34320c(String str, Throwable th) {
        super(str, th);
        C89219l.m154721d(str, "");
        C89219l.m154721d(th, "");
        this.f81173a = str;
    }
}
