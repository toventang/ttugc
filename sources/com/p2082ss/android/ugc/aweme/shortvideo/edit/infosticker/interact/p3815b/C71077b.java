package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.compile.AbstractC45860c;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b */
public class C71077b extends AbstractC45860c {
    static {
        Covode.recordClassIndex(83576);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.compile.AbstractC45860c
    /* renamed from: a */
    public String mo77213a(String str, int i) {
        StringBuilder append = new StringBuilder().append(str);
        String str2 = "interact_sticker.png";
        if (!str.endsWith(File.separator)) {
            str2 = File.separator + str2;
        }
        return append.append(str2).toString();
    }
}
