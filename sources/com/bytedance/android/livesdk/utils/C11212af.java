package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.android.livesdk.p672z.C11604a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.utils.af */
public final class C11212af {
    static {
        Covode.recordClassIndex(12840);
    }

    /* renamed from: a */
    public static Object m19869a(String str, int i) {
        File[] listFiles;
        MethodCollector.m26663i(12166);
        File file = new File(str);
        JSONObject jSONObject = null;
        if (file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null) {
            if (listFiles.length == 1) {
                try {
                    C11265g.m19960a(listFiles[0].getPath(), str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            HashMap<String, Bitmap> hashMap = new HashMap<>();
            String str2 = "";
            boolean z = false;
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File[] listFiles2 = file2.listFiles();
                    for (File file3 : listFiles2) {
                        String name2 = file3.getName();
                        if (name2.contains(".png")) {
                            hashMap.put(name2, BitmapFactory.decodeFile(file3.getAbsolutePath()));
                        }
                    }
                } else if (name.contains(".json") && !z) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        fileInputStream.close();
                        str2 = sb.toString();
                        jSONObject = new JSONObject(sb.toString());
                        z = true;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            C11604a aVar = new C11604a();
            aVar.f27761a = i;
            aVar.f27762b = str;
            aVar.f27763c = jSONObject;
            aVar.f27764d = str2;
            aVar.f27765e = hashMap;
            MethodCollector.m26664o(12166);
            return aVar;
        }
        MethodCollector.m26664o(12166);
        return null;
    }
}
