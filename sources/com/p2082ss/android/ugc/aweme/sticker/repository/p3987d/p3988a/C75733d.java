package com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.d.a.d */
public final class C75733d extends AbstractC75730a {

    /* renamed from: a */
    public static final C75733d f170152a = new C75733d();

    private C75733d() {
    }

    static {
        Covode.recordClassIndex(88664);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a
    /* renamed from: a */
    public final boolean mo109792a(String str, Effect effect) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(effect, "");
        if (effect.getTags() == null) {
            return false;
        }
        List<String> tags = effect.getTags();
        if (tags == null) {
            C89219l.m154715b();
        }
        if (tags.contains("forbid_for_all_duet")) {
            return true;
        }
        return false;
    }
}
