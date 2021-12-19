package com.bytedance.helios.api.p1087a;

import com.bytedance.covode.number.Covode;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.a.a */
public final class C15297a {

    /* renamed from: a */
    public static final C15297a f37315a = new C15297a();

    /* renamed from: b */
    private static final String[] f37316b = {"onActivityCreate", "onActivityStart", "onActivityResume", "onActivityPause", "onActivityStop", "onActivityDestroy", "appBackground", "appForeground", "onWindowViewAdd", "onWindowViewRemove"};

    private C15297a() {
    }

    static {
        Covode.recordClassIndex(17527);
    }

    /* renamed from: a */
    public static int m28205a(String str) {
        C89219l.m154719c(str, "");
        return C89064i.m154493b(f37316b, str);
    }

    /* renamed from: a */
    public static String m28206a(int i) {
        String[] strArr = f37316b;
        if (i < strArr.length) {
            return strArr[i];
        }
        return "unknownStage";
    }
}
