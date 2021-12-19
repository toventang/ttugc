package com.p2082ss.ugc.live.p4460a.p4461a.p4462a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import java.io.File;

/* renamed from: com.ss.ugc.live.a.a.a.a */
public final class C87011a implements AbstractC87012b {

    /* renamed from: a */
    private Context f196180a;

    /* renamed from: b */
    private String f196181b;

    static {
        Covode.recordClassIndex(102777);
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b
    /* renamed from: a */
    public final String mo16300a() {
        return this.f196181b;
    }

    public C87011a(Context context) {
        this.f196180a = context;
        this.f196181b = context.getDir("gift_resource", 0).getAbsolutePath();
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b
    /* renamed from: a */
    public final String mo16301a(C87020c cVar) {
        return this.f196181b + File.separator + cVar.f196190b + File.separator + cVar.f196193e + File.separator;
    }
}
