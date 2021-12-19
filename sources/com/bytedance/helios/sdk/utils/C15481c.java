package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.api.p1090c.C15326b;
import com.google.gson.C27910f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.utils.c */
public final class C15481c {

    /* renamed from: a */
    public static final C15481c f37727a = new C15481c();

    /* renamed from: b */
    private static final C27910f f37728b = new C27910f();

    private C15481c() {
    }

    static {
        Covode.recordClassIndex(17735);
    }

    /* renamed from: a */
    public static final String m28482a(Object obj) {
        if (obj == null) {
            return "";
        }
        String b = f37728b.mo46674b(obj);
        C89219l.m154709a((Object) b, "");
        return b;
    }

    /* renamed from: a */
    public static final <T> T m28481a(String str, Type type) {
        C89219l.m154719c(type, "");
        try {
            return (T) f37728b.mo46671a(str, type);
        } catch (Exception e) {
            C89378p[] pVarArr = new C89378p[1];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = C89387v.m154943a("json_string", str);
            C15320o.m28230a(new C15326b(null, e, "label_gson_utils", C89041ag.m154427b(pVarArr), 1));
            return null;
        }
    }

    /* renamed from: b */
    public static final <T> T m28484b(String str, Class<T> cls) {
        C89219l.m154719c(cls, "");
        try {
            return (T) f37728b.mo46670a(str, (Class) cls);
        } catch (Exception e) {
            C89378p[] pVarArr = new C89378p[1];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = C89387v.m154943a("json_string", str);
            C15320o.m28230a(new C15326b(null, e, "label_gson_utils", C89041ag.m154427b(pVarArr), 1));
            return null;
        }
    }

    /* renamed from: a */
    public static final <T> List<T> m28483a(String str, Class<T[]> cls) {
        C89219l.m154719c(cls, "");
        try {
            Object[] objArr = (Object[]) f37728b.mo46670a(str, (Class) cls);
            if (objArr != null) {
                return C89064i.m154509j(objArr);
            }
            return new ArrayList();
        } catch (Exception e) {
            C89378p[] pVarArr = new C89378p[1];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = C89387v.m154943a("json_string", str);
            C15320o.m28230a(new C15326b(null, e, "label_gson_utils", C89041ag.m154427b(pVarArr), 1));
            return new ArrayList();
        }
    }
}
