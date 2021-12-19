package com.p2082ss.android.ugc.aweme.commerce.p2505a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.i */
public final class C37473i {
    static {
        Covode.recordClassIndex(44858);
    }

    /* renamed from: a */
    public static String m75557a(Context context) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStreamReader inputStreamReader;
        UnsupportedEncodingException e;
        IOException e2;
        MethodCollector.m26663i(2754);
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(context.getResources().getAssets().open("omsdk_v1.js"));
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (UnsupportedEncodingException e3) {
                        e = e3;
                        e.printStackTrace();
                        C80313cs.m139228a(inputStreamReader);
                        C80313cs.m139228a(bufferedReader);
                        String sb2 = sb.toString();
                        MethodCollector.m26664o(2754);
                        return sb2;
                    } catch (IOException e4) {
                        e2 = e4;
                        try {
                            e2.printStackTrace();
                            C80313cs.m139228a(inputStreamReader);
                            C80313cs.m139228a(bufferedReader);
                            String sb22 = sb.toString();
                            MethodCollector.m26664o(2754);
                            return sb22;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (UnsupportedEncodingException e5) {
                e = e5;
                bufferedReader = null;
                e.printStackTrace();
                C80313cs.m139228a(inputStreamReader);
                C80313cs.m139228a(bufferedReader);
                String sb222 = sb.toString();
                MethodCollector.m26664o(2754);
                return sb222;
            } catch (IOException e6) {
                e2 = e6;
                bufferedReader = null;
                e2.printStackTrace();
                C80313cs.m139228a(inputStreamReader);
                C80313cs.m139228a(bufferedReader);
                String sb2222 = sb.toString();
                MethodCollector.m26664o(2754);
                return sb2222;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                inputStreamReader2 = inputStreamReader;
                C80313cs.m139228a(inputStreamReader2);
                C80313cs.m139228a(bufferedReader);
                MethodCollector.m26664o(2754);
                throw th;
            }
        } catch (UnsupportedEncodingException e7) {
            e = e7;
            inputStreamReader = null;
            bufferedReader = null;
            e.printStackTrace();
            C80313cs.m139228a(inputStreamReader);
            C80313cs.m139228a(bufferedReader);
            String sb22222 = sb.toString();
            MethodCollector.m26664o(2754);
            return sb22222;
        } catch (IOException e8) {
            e2 = e8;
            inputStreamReader = null;
            bufferedReader = null;
            e2.printStackTrace();
            C80313cs.m139228a(inputStreamReader);
            C80313cs.m139228a(bufferedReader);
            String sb222222 = sb.toString();
            MethodCollector.m26664o(2754);
            return sb222222;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            C80313cs.m139228a(inputStreamReader2);
            C80313cs.m139228a(bufferedReader);
            MethodCollector.m26664o(2754);
            throw th;
        }
        C80313cs.m139228a(inputStreamReader);
        C80313cs.m139228a(bufferedReader);
        String sb2222222 = sb.toString();
        MethodCollector.m26664o(2754);
        return sb2222222;
    }
}
