package com.p2082ss.android.ugc.effectmanager.common.utils;

import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.AssetUtils */
public final class AssetUtils {
    public static final AssetUtils INSTANCE = new AssetUtils();

    private AssetUtils() {
    }

    static {
        Covode.recordClassIndex(95502);
    }

    public static final String loadJson(AssetManager assetManager, String str) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStreamReader inputStreamReader;
        Exception e;
        MethodCollector.m26663i(409);
        C89219l.m154719c(assetManager, "");
        InputStreamReader inputStreamReader2 = null;
        if (str != null) {
            try {
                inputStreamReader = new InputStreamReader(assetManager.open(str));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader = null;
                    try {
                        EPLog.m141900e("AssetUtils", "#loadJson::jsonFilePath=".concat(String.valueOf(str)), e);
                        CloseUtil.close(inputStreamReader);
                        CloseUtil.close(bufferedReader);
                        MethodCollector.m26664o(409);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader2 = inputStreamReader;
                        CloseUtil.close(inputStreamReader2);
                        CloseUtil.close(bufferedReader);
                        MethodCollector.m26664o(409);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                    inputStreamReader2 = inputStreamReader;
                    CloseUtil.close(inputStreamReader2);
                    CloseUtil.close(bufferedReader);
                    MethodCollector.m26664o(409);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedReader = null;
                inputStreamReader = null;
                EPLog.m141900e("AssetUtils", "#loadJson::jsonFilePath=".concat(String.valueOf(str)), e);
                CloseUtil.close(inputStreamReader);
                CloseUtil.close(bufferedReader);
                MethodCollector.m26664o(409);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                CloseUtil.close(inputStreamReader2);
                CloseUtil.close(bufferedReader);
                MethodCollector.m26664o(409);
                throw th;
            }
            try {
                StringBuilder sb = new StringBuilder();
                C89233z.C89238e eVar = new C89233z.C89238e();
                while (true) {
                    T t = (T) bufferedReader.readLine();
                    eVar.element = t;
                    if (t != null) {
                        sb.append((String) eVar.element);
                    } else {
                        String sb2 = sb.toString();
                        CloseUtil.close(inputStreamReader);
                        CloseUtil.close(bufferedReader);
                        MethodCollector.m26664o(409);
                        return sb2;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                EPLog.m141900e("AssetUtils", "#loadJson::jsonFilePath=".concat(String.valueOf(str)), e);
                CloseUtil.close(inputStreamReader);
                CloseUtil.close(bufferedReader);
                MethodCollector.m26664o(409);
                return null;
            }
        } else {
            CloseUtil.close(null);
            CloseUtil.close(null);
            MethodCollector.m26664o(409);
            return null;
        }
    }
}
