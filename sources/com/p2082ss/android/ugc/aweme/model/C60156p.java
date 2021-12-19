package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.p */
public final class C60156p implements AbstractC60154n {

    /* renamed from: a */
    private final String f137126a;

    /* renamed from: b */
    private String f137127b;

    /* renamed from: c */
    private final AbstractC60142d f137128c;

    /* renamed from: d */
    private final Effect f137129d;

    /* renamed from: e */
    private String f137130e;

    static {
        Covode.recordClassIndex(70683);
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60160s
    /* renamed from: a */
    public final String mo97825a() {
        return this.f137126a;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60160s
    /* renamed from: b */
    public final String mo97826b() {
        return this.f137130e;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60160s
    /* renamed from: c */
    public final AbstractC60142d mo97827c() {
        return this.f137128c;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60154n
    /* renamed from: d */
    public final String mo97829d() {
        return this.f137127b;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60154n
    /* renamed from: e */
    public final Effect mo97830e() {
        return this.f137129d;
    }

    @Override // com.p2082ss.android.ugc.aweme.model.AbstractC60154n
    /* renamed from: a */
    public final void mo97828a(String str) {
        C89219l.m154721d(str, "");
        this.f137127b = str;
    }

    public C60156p(String str, String str2, AbstractC60142d dVar, Effect effect, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str3, "");
        this.f137126a = str;
        this.f137127b = str2;
        this.f137128c = dVar;
        this.f137129d = effect;
        this.f137130e = str3;
    }
}
