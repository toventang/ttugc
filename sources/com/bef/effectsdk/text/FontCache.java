package com.bef.effectsdk.text;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;

public class FontCache {
    private static Hashtable<String, Typeface> fontCache = new Hashtable<>();
    private static LinkedList<String> lruQueue = new LinkedList<>();

    static {
        Covode.recordClassIndex(2731);
    }

    /* renamed from: com_bef_effectsdk_text_FontCache_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile */
    public static Typeface m7253x7721065a(File file) {
        String path;
        if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
            if (TypeFaceLancet.cache.contains(path)) {
                return (Typeface) TypeFaceLancet.cache.get(path);
            }
            Typeface createFromFile = Typeface.createFromFile(file);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(path, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(file);
    }

    public static synchronized Typeface getFromFile(String str, String str2) {
        Typeface typeface;
        synchronized (FontCache.class) {
            MethodCollector.m26663i(4571);
            String str3 = "FILE_" + str + "_" + str2;
            typeface = fontCache.get(str3);
            if (typeface == null) {
                try {
                    typeface = m7253x7721065a(new File(str, str2));
                    if (lruQueue.size() >= 32) {
                        fontCache.remove(lruQueue.removeLast());
                        System.gc();
                    }
                    fontCache.put(str3, typeface);
                    lruQueue.addFirst(str3);
                } catch (Exception unused) {
                    MethodCollector.m26664o(4571);
                    return null;
                }
            } else {
                lruQueue.remove(str3);
                lruQueue.addFirst(str3);
            }
            MethodCollector.m26664o(4571);
        }
        return typeface;
    }

    public static synchronized Typeface getFromSystem(String str, int i) {
        Typeface typeface;
        synchronized (FontCache.class) {
            MethodCollector.m26663i(4627);
            String str2 = "SYSTEM_" + str + "_" + i;
            typeface = fontCache.get(str2);
            if (typeface == null) {
                try {
                    typeface = Typeface.create(str, i);
                    if (lruQueue.size() >= 32) {
                        fontCache.remove(lruQueue.removeLast());
                        System.gc();
                    }
                    fontCache.put(str2, typeface);
                    lruQueue.addFirst(str2);
                } catch (Exception unused) {
                    MethodCollector.m26664o(4627);
                    return null;
                }
            } else {
                lruQueue.remove(str2);
                lruQueue.addFirst(str2);
            }
            MethodCollector.m26664o(4627);
        }
        return typeface;
    }
}
