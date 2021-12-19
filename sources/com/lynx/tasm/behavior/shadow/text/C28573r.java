package com.lynx.tasm.behavior.shadow.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.p2055d.C28754c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.shadow.text.r */
public class C28573r {

    /* renamed from: a */
    private static final C0484a<String, Typeface[]> f67235a = new C0484a<>();

    /* renamed from: b */
    private static final C0484a<Typeface, Typeface[]> f67236b = new C0484a<>();

    /* renamed from: c */
    private static final String[] f67237c = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: d */
    private static final String[] f67238d = {".ttf", ".otf"};

    /* renamed from: e */
    private static final List<AbstractC28574a> f67239e = new ArrayList();

    /* renamed from: com.lynx.tasm.behavior.shadow.text.r$a */
    public interface AbstractC28574a {
        static {
            Covode.recordClassIndex(34590);
        }

        /* renamed from: a */
        Typeface mo14647a(String str, int i);
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.r$b */
    public interface AbstractC28575b {
        static {
            Covode.recordClassIndex(34591);
        }

        /* renamed from: a */
        void mo49157a();
    }

    static {
        Covode.recordClassIndex(34589);
    }

    /* renamed from: a */
    public static void m57143a(AbstractC28574a aVar) {
        if (aVar != null) {
            f67239e.add(aVar);
        }
    }

    /* renamed from: a */
    public static synchronized boolean m57145a(String str) {
        boolean containsKey;
        synchronized (C28573r.class) {
            MethodCollector.m26663i(4226);
            containsKey = f67235a.containsKey(str);
            MethodCollector.m26664o(4226);
        }
        return containsKey;
    }

    /* renamed from: a */
    public static void m57142a(AssetManager assetManager, String str, String str2) {
        int i = 0;
        do {
            Typeface a = m57140a(assetManager, str, i, str2);
            if (a != null) {
                m57144a(str, i, a);
            }
            i++;
        } while (i < 4);
    }

    /* renamed from: a */
    private static synchronized void m57144a(String str, int i, Typeface typeface) {
        synchronized (C28573r.class) {
            MethodCollector.m26663i(4231);
            C0484a<String, Typeface[]> aVar = f67235a;
            Typeface[] typefaceArr = aVar.get(str);
            if (typefaceArr == null) {
                typefaceArr = new Typeface[4];
                aVar.put(str, typefaceArr);
            }
            typefaceArr[i] = typeface;
            f67236b.put(typeface, typefaceArr);
            MethodCollector.m26664o(4231);
        }
    }

    /* renamed from: a */
    public static synchronized Typeface m57141a(AbstractC28520j jVar, String str, int i) {
        synchronized (C28573r.class) {
            MethodCollector.m26663i(4266);
            Typeface[] typefaceArr = f67235a.get(str);
            if (typefaceArr == null || typefaceArr[i] == null) {
                for (AbstractC28574a aVar : f67239e) {
                    Typeface a = aVar.mo14647a(str, i);
                    if (a != null) {
                        m57144a(str, i, a);
                        MethodCollector.m26664o(4266);
                        return a;
                    }
                }
                Typeface a2 = C28754c.C28765a.f67843a.mo49873a(jVar, str, i, (AbstractC28575b) null);
                if (a2 != null) {
                    MethodCollector.m26664o(4266);
                    return a2;
                }
                LLog.m56856a(2, "TypefaceCache", "Can't not find typeface for fontFamily: " + str + " in lynx.");
                MethodCollector.m26664o(4266);
                return null;
            }
            Typeface typeface = typefaceArr[i];
            MethodCollector.m26664o(4266);
            return typeface;
        }
    }

    /* renamed from: a */
    public static Typeface m57140a(AssetManager assetManager, String str, int i, String str2) {
        String str3 = f67237c[i];
        StringBuilder append = new StringBuilder(32).append(str2);
        String str4 = "/";
        if (str2.endsWith(str4)) {
            str4 = "";
        }
        StringBuilder append2 = append.append(str4).append(str).append(str3);
        int length = append2.length();
        for (String str5 : f67238d) {
            try {
                return Typeface.createFromAsset(assetManager, append2.append(str5).toString());
            } catch (RuntimeException e) {
                LLog.m56861c("TypefaceCache", "Exception happens whe cacheTypefaceFromAssets with message " + e.getMessage());
                append2.setLength(length);
            }
        }
        return null;
    }
}
