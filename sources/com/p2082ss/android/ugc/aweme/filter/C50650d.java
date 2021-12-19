package com.p2082ss.android.ugc.aweme.filter;

import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.filter.d */
public final class C50650d {

    /* renamed from: a */
    public static final String f116988a;

    /* renamed from: b */
    public static final String f116989b;

    /* renamed from: c */
    private static final String f116990c;

    /* renamed from: d */
    private static final String f116991d;

    static {
        Covode.recordClassIndex(59812);
        String absolutePath = new File(C63247i.f143610a.getFilesDir(), "filter").getAbsolutePath();
        f116990c = absolutePath;
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath2 = new File(absolutePath, "reshape").getAbsolutePath();
        f116988a = absolutePath2;
        File file2 = new File(absolutePath2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String absolutePath3 = new File(absolutePath, "smooth").getAbsolutePath();
        f116989b = absolutePath3;
        File file3 = new File(absolutePath3);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        String absolutePath4 = new File(absolutePath, "contour").getAbsolutePath();
        f116991d = absolutePath4;
        File file4 = new File(absolutePath4);
        if (file4.exists()) {
            file4.mkdirs();
        }
        m94912a();
    }

    /* renamed from: a */
    public static boolean m94912a() {
        MethodCollector.m26663i(5408);
        AssetManager assets = C63247i.f143610a.getAssets();
        boolean ulikeBeautyCopied = C63244g.m114602a().mo73277e().getUlikeBeautyCopied(false);
        try {
            String str = f116988a;
            if (!C84902i.m145892a(str) || !ulikeBeautyCopied) {
                C84915u.m145942a(assets.open("reshape.zip"), str);
            }
            String str2 = f116989b;
            if (!C84902i.m145892a(str2) || !ulikeBeautyCopied) {
                C84915u.m145942a(assets.open("smooth.zip"), str2);
            }
            C63244g.m114602a().mo73277e().setUlikeBeautyCopied(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(5408);
        return false;
    }
}
