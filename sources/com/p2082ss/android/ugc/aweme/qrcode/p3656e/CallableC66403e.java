package com.p2082ss.android.ugc.aweme.qrcode.p3656e;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.p909d.C13608a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1825b.C24019b;
import com.p2082ss.android.p2133d.C29847a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.e.e */
public final /* synthetic */ class CallableC66403e implements Callable {

    /* renamed from: a */
    private final String f149303a;

    /* renamed from: b */
    private final int f149304b = 0;

    static {
        Covode.recordClassIndex(77935);
    }

    public CallableC66403e(String str) {
        this.f149303a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AbstractC24018a a;
        File file;
        String str = this.f149303a;
        int i = this.f149304b;
        Context a2 = C17867d.m33078a();
        String str2 = "";
        if (!C13627m.m24498a(str)) {
            Uri parse = Uri.parse(str);
            if (!(!C34577e.m70603a(parse) || (a = C24428k.m46551a().mo40246d().mo39575a(C24389j.m46446a().mo40187a(C24636b.fromUri(parse)))) == null || (file = ((C24019b) a).f56886a) == null)) {
                new C29847a(a2);
                String a3 = C29847a.m60147a();
                String b = C13607d.m24442b(file.getName());
                File file2 = new File(a3, b);
                if (!file2.exists()) {
                    C13608a.m24448a(file.getAbsolutePath(), a3, b);
                }
                str2 = file2.getAbsolutePath();
            }
        }
        String a4 = C66402d.m118101a();
        if (TextUtils.isEmpty(a4) || TextUtils.isEmpty(str2)) {
            return null;
        }
        C13608a.m24448a(str2, a4, C66402d.m118102b(i));
        return null;
    }
}
