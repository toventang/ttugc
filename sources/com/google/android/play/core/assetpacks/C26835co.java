package com.google.android.play.core.assetpacks;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26915bf;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.play.core.assetpacks.co */
final class C26835co {

    /* renamed from: a */
    static final Pattern f63666a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    static {
        Covode.recordClassIndex(32310);
    }

    /* renamed from: a */
    static List<File> m53302a(File file, File file2) {
        File[] fileArr;
        MethodCollector.m26663i(13610);
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C26834cn.f63665a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            int length = listFiles.length;
            fileArr = new File[length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr[parseInt] != null) {
                    C26787au auVar = new C26787au("Metadata folder ordering corrupt.");
                    MethodCollector.m26664o(13610);
                    throw auVar;
                }
                fileArr[parseInt] = file3;
            }
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C26839cs a = new C26778al(fileInputStream).mo44480a();
                    if (a.f63674a != null) {
                        File file5 = new File(file, a.f63674a);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            C26787au auVar2 = new C26787au(C1764a.m5928a("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                            MethodCollector.m26664o(13610);
                            throw auVar2;
                        }
                    } else {
                        C26787au auVar3 = new C26787au("Metadata files corrupt. Could not read local file header.");
                        MethodCollector.m26664o(13610);
                        throw auVar3;
                    }
                } catch (Throwable th) {
                    C26915bf.m53466a(th, th);
                }
            }
        }
        MethodCollector.m26664o(13610);
        return arrayList;
        MethodCollector.m26664o(13610);
        throw th;
    }
}
