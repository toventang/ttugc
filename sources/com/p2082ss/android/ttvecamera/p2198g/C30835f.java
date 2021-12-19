package com.p2082ss.android.ttvecamera.p2198g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.p2196e.C30821c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.f */
public final class C30835f extends C30834e {

    /* renamed from: d */
    private static String f73864d = ((String) C30821c.m63435a("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"}));

    /* renamed from: e */
    private static List<String> f73865e = new ArrayList();

    static {
        Covode.recordClassIndex(37460);
        Collections.addAll(f73865e, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    public C30835f(Context context) {
        super(context);
    }
}
