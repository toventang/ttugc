package com.p2082ss.android.ugc.aweme.main.replace;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.replace.b */
public class C59117b extends AbstractC59115a {

    /* renamed from: d */
    private final List<String> f134522d;

    static {
        Covode.recordClassIndex(69471);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.replace.AbstractC59115a
    /* renamed from: a */
    public final String mo96624a() {
        List<String> list = this.f134522d;
        if (list != null) {
            return TextUtils.join(", ", list);
        }
        return "";
    }

    public C59117b(List<String> list, String str) {
        super(str);
        this.f134522d = list;
    }
}
