package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b;

import com.bytedance.covode.number.Covode;
import java.lang.Character;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.e */
public final class C71294e {
    static {
        Covode.recordClassIndex(83813);
    }

    /* renamed from: a */
    public static final boolean m125979a(String str) {
        C89219l.m154721d(str, "");
        Character.UnicodeBlock of = Character.UnicodeBlock.of(str.charAt(0));
        if (!C89219l.m154714a(of, Character.UnicodeBlock.ARABIC) && !C89219l.m154714a(of, Character.UnicodeBlock.HEBREW) && !C89219l.m154714a(of, Character.UnicodeBlock.THAANA) && !C89219l.m154714a(of, Character.UnicodeBlock.SYRIAC) && !C89219l.m154714a(of, Character.UnicodeBlock.MANDAIC) && !C89219l.m154714a(of, Character.UnicodeBlock.SAMARITAN) && !C89219l.m154714a(of, Character.UnicodeBlock.NKO)) {
            return false;
        }
        return true;
    }
}
