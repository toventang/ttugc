package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.api.C66012i;
import com.p2082ss.android.ugc.aweme.qna.api.C66014k;
import com.p2082ss.android.ugc.aweme.qna.fragment.EnumC66276w;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.o */
public final class C66339o {

    /* renamed from: a */
    public static final C66339o f149168a = new C66339o();

    private C66339o() {
    }

    static {
        Covode.recordClassIndex(77850);
    }

    /* renamed from: a */
    public static EnumC66276w m117989a(C66012i iVar, List<C66504c> list) {
        C89219l.m154721d(list, "");
        if (iVar != null && iVar.f148619a != 0) {
            return EnumC66276w.FAILURE;
        }
        if (!list.isEmpty()) {
            return EnumC66276w.SUCCESS;
        }
        return EnumC66276w.SUCCESS_EMPTY;
    }

    /* renamed from: a */
    public static EnumC66276w m117990a(C66014k kVar, List<C66504c> list) {
        C89219l.m154721d(list, "");
        if (kVar != null && kVar.f148628a != 0) {
            return EnumC66276w.FAILURE;
        }
        if (!list.isEmpty()) {
            return EnumC66276w.SUCCESS;
        }
        return EnumC66276w.SUCCESS_EMPTY;
    }
}
