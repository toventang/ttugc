package com.bytedance.android.livesdk.manage.p572a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.C87034e;
import com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87027a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87031d;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.C87028b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.C87033f;

/* renamed from: com.bytedance.android.livesdk.manage.a.c */
public final class C9481c implements AbstractC87027a<String> {

    /* renamed from: a */
    private static AbstractC87031d<String> f23025a;

    /* renamed from: b */
    private static AbstractC87031d<String> f23026b;

    static {
        Covode.recordClassIndex(10989);
    }

    /* renamed from: a */
    private static AbstractC87031d<String> m17778a(AbstractC87012b bVar) {
        return new C87028b(new C9479b(bVar));
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87027a
    /* renamed from: a */
    public final AbstractC87031d<String> mo16298a(C87020c cVar, C87034e eVar) {
        if (!cVar.f196194f) {
            AbstractC87031d<String> dVar = f23026b;
            if (dVar != null) {
                return dVar;
            }
            AbstractC87031d<String> a = m17778a(eVar.f196214a);
            f23026b = a;
            return a;
        }
        AbstractC87031d<String> dVar2 = f23025a;
        if (dVar2 != null) {
            return dVar2;
        }
        C87033f fVar = new C87033f(m17778a(eVar.f196214a));
        f23025a = fVar;
        return fVar;
    }
}
