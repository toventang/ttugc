package com.lynx.tasm.p2056e;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.p2055d.C28751a;
import com.lynx.tasm.utils.C28928l;

/* renamed from: com.lynx.tasm.e.c */
public class C28770c {

    /* renamed from: a */
    public static AbstractC28772a f67848a = new AbstractC28772a() {
        /* class com.lynx.tasm.p2056e.C28770c.C287711 */

        static {
            Covode.recordClassIndex(34870);
        }
    };

    static {
        Covode.recordClassIndex(34869);
    }

    /* renamed from: a */
    public static void m57583a(AbstractC28772a aVar) {
        f67848a = aVar;
    }

    /* renamed from: com.lynx.tasm.e.c$a */
    public static abstract class AbstractC28772a {
        static {
            Covode.recordClassIndex(34871);
        }

        /* renamed from: a */
        public static void m57584a(AbstractC28520j jVar, String str) {
            if (jVar.f67072m != null) {
                jVar.f67072m.mo19151a(new C28816j(str, 301));
            }
        }

        /* renamed from: b */
        public final Typeface mo49890b(AbstractC28520j jVar, C28751a.EnumC28752a aVar, String str) {
            return mo33430a(jVar, aVar, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Typeface mo33430a(AbstractC28520j jVar, C28751a.EnumC28752a aVar, String str) {
            if (!TextUtils.isEmpty(str) && aVar != C28751a.EnumC28752a.LOCAL) {
                int indexOf = str.indexOf("base64,");
                if (str.startsWith("data:") && indexOf != -1) {
                    try {
                        return C28928l.m57943a(jVar, Base64.decode(str.substring(indexOf + 7), 0));
                    } catch (Exception e) {
                        jVar.mo49039a(str, "font", e.getMessage());
                    }
                }
            }
            return null;
        }
    }
}
