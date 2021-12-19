package com.bytedance.common.jato.fdio;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class FDIOCollector implements AbstractC13574b {

    /* renamed from: a */
    public boolean f32996a;

    /* renamed from: b */
    private ExecutorService f32997b = Jato.getWorkExecutorService();

    /* renamed from: c */
    private Context f32998c = Jato.getContext();

    /* renamed from: d */
    private String f32999d;

    static {
        Covode.recordClassIndex(15577);
    }

    private static native void nativeEndCollect(String str, String str2, boolean z, boolean z2);

    private static native void nativeStartCollect(String str, String str2, List<String> list);

    @Override // com.bytedance.common.jato.fdio.AbstractC13574b
    /* renamed from: a */
    public final void mo21833a(boolean z) {
        MethodCollector.m26663i(11268);
        if (this.f32997b == null || this.f32998c == null || this.f32999d.isEmpty()) {
            MethodCollector.m26664o(11268);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Context context = this.f32998c;
        if (C58016d.f132221b == null || !C58016d.f132224e) {
            C58016d.f132221b = context.getCacheDir();
        }
        String sb2 = sb.append(C58016d.f132221b.getAbsolutePath()).append(File.separator).append("jato_fdio").append(File.separator).append(this.f32999d).toString();
        File parentFile = new File(sb2).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            nativeEndCollect(this.f32999d, sb2, this.f32996a, z);
            MethodCollector.m26664o(11268);
        } catch (Throwable unused) {
            MethodCollector.m26664o(11268);
        }
    }

    @Override // com.bytedance.common.jato.fdio.AbstractC13574b
    /* renamed from: a */
    public final void mo21832a(String str, boolean z) {
        Context context;
        String str2;
        MethodCollector.m26663i(11115);
        if (this.f32997b == null || (context = this.f32998c) == null) {
            MethodCollector.m26664o(11115);
            return;
        }
        this.f32999d = str;
        String packageCodePath = context.getPackageCodePath();
        String substring = packageCodePath.substring(0, packageCodePath.lastIndexOf("/"));
        if (Build.VERSION.SDK_INT < 29) {
            str2 = System.getenv("BOOTCLASSPATH");
        } else {
            str2 = System.getenv("DEX2OATBOOTCLASSPATH");
        }
        ArrayList arrayList = new ArrayList(30);
        if (str2 != null) {
            String[] split = str2.split(":");
            for (String str3 : split) {
                if (str3.endsWith(".apk")) {
                    arrayList.add(str3);
                }
                try {
                    arrayList.add(str3.substring(str3.lastIndexOf("/") + 1, str3.lastIndexOf(".")));
                } catch (Throwable unused) {
                }
            }
        }
        nativeStartCollect(str, substring, arrayList);
        MethodCollector.m26664o(11115);
    }
}
