package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.n */
public final class C78973n {

    /* renamed from: a */
    public static final C78974a f177487a = new C78974a((byte) 0);

    static {
        Covode.recordClassIndex(92122);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.n$a */
    public static final class C78974a {
        static {
            Covode.recordClassIndex(92123);
        }

        private C78974a() {
        }

        public /* synthetic */ C78974a(byte b) {
            this();
        }

        /* renamed from: a */
        static String m137798a(Effect effect) {
            if (effect == null) {
                return null;
            }
            List<String> tags = effect.getTags();
            if (C13617h.m24465a(tags)) {
                return null;
            }
            if (tags == null) {
                C89219l.m154715b();
            }
            for (String str : tags) {
                if (C89361p.m154874b(str, "challenge:", false)) {
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String substring = str.substring(10);
                    C89219l.m154716b(substring, "");
                    return substring;
                }
            }
            return null;
        }
    }
}
