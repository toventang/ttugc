package com.p2082ss.android.ugc.aweme.story.interaction.p4057b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.story.model.C77385h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.b.h */
public final class C77303h implements AbstractC17641a {

    /* renamed from: d */
    public static final C77304a f173425d = new C77304a((byte) 0);

    /* renamed from: a */
    public final C77385h f173426a;

    /* renamed from: b */
    public final int f173427b;

    /* renamed from: c */
    public final C77306j f173428c;

    static {
        Covode.recordClassIndex(90322);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77303h)) {
            return false;
        }
        C77303h hVar = (C77303h) obj;
        return C89219l.m154714a(this.f173426a, hVar.f173426a) && this.f173427b == hVar.f173427b && C89219l.m154714a(this.f173428c, hVar.f173428c);
    }

    public final int hashCode() {
        C77385h hVar = this.f173426a;
        int i = 0;
        int hashCode = (((hVar != null ? hVar.hashCode() : 0) * 31) + this.f173427b) * 31;
        C77306j jVar = this.f173428c;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StoryViewerAndLikerItem(user=" + this.f173426a + ", type=" + this.f173427b + ", mobEventParam=" + this.f173428c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.b.h$a */
    public static final class C77304a {
        static {
            Covode.recordClassIndex(90323);
        }

        private C77304a() {
        }

        public /* synthetic */ C77304a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C77303h(C77385h hVar, int i, C77306j jVar) {
        C89219l.m154721d(hVar, "");
        this.f173426a = hVar;
        this.f173427b = i;
        this.f173428c = jVar;
    }
}
