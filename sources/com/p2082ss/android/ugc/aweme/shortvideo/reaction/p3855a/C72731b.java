package com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.b */
public class C72731b extends AbstractC72729a {

    /* renamed from: a */
    private final List<String> f163061a;

    static {
        Covode.recordClassIndex(85416);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.AbstractC72729a
    /* renamed from: b */
    public final String mo115012b() {
        List<String> list = this.f163061a;
        if (list != null) {
            return TextUtils.join(", ", list);
        }
        return "";
    }

    public C72731b(List<String> list, String str) {
        super(str);
        this.f163061a = list;
    }
}
