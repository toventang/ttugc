package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b;

import com.bytedance.covode.number.Covode;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f */
public final class C71083f extends C71077b {

    /* renamed from: a */
    public static final C71084a f159201a = new C71084a((byte) 0);

    static {
        Covode.recordClassIndex(83582);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f$a */
    public static final class C71084a {
        static {
            Covode.recordClassIndex(83583);
        }

        private C71084a() {
        }

        public /* synthetic */ C71084a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.C71077b, com.p2082ss.android.ugc.aweme.editSticker.compile.AbstractC45860c
    /* renamed from: a */
    public final String mo77213a(String str, int i) {
        String str2 = "";
        if (str != null) {
            String str3 = File.separator;
            C89219l.m154716b(str3, str2);
            if (C89361p.m154876c(str, str3, false) || (str + File.separator) != null) {
                str2 = str;
            }
        }
        return str2 + "interact_sticker_" + i + ".png";
    }
}
