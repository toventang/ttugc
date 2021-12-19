package com.p2082ss.android.ugc.aweme.discover.lynx.p2780b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.b.b */
public final class C42197b {

    /* renamed from: a */
    public static final C42197b f98357a = new C42197b();

    private C42197b() {
    }

    static {
        Covode.recordClassIndex(50136);
    }

    /* renamed from: a */
    public static int m84461a(C42345d dVar) {
        String schema;
        String rawData;
        if (dVar == null || (schema = dVar.getSchema()) == null || schema.length() == 0 || (rawData = dVar.getRawData()) == null || rawData.length() == 0) {
            return 3;
        }
        Uri parse = Uri.parse(dVar.getSchema());
        String queryParameter = parse.getQueryParameter("channel");
        String queryParameter2 = parse.getQueryParameter("bundle");
        if (queryParameter == null || queryParameter2 == null) {
            return 2;
        }
        if (C80333dc.m139278b(queryParameter)) {
            return 0;
        }
        return 1;
    }
}
