package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.ai */
public abstract class AbstractC17099ai {

    /* renamed from: a */
    public final String f40699a;

    static {
        Covode.recordClassIndex(19556);
    }

    public int hashCode() {
        return this.f40699a.hashCode();
    }

    private AbstractC17099ai(String str) {
        this.f40699a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC17099ai) || obj == null) {
            return false;
        }
        AbstractC17099ai aiVar = (AbstractC17099ai) obj;
        if (!C89219l.m154714a(aiVar.getClass(), getClass())) {
            return false;
        }
        return C89219l.m154714a((Object) this.f40699a, (Object) aiVar.f40699a);
    }

    public /* synthetic */ AbstractC17099ai(String str, byte b) {
        this(str);
    }
}
