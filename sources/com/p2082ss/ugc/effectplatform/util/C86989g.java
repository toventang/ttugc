package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.g */
public final class C86989g {

    /* renamed from: a */
    public static final C86989g f196145a = new C86989g();

    private C86989g() {
    }

    static {
        Covode.recordClassIndex(102755);
    }

    /* renamed from: a */
    public static String m150647a(String str) {
        return str + C88045d.f199951a + "effect_version";
    }

    /* renamed from: b */
    public static String m150651b(String str, String str2) {
        return str + C88045d.f199951a + "category_version" + str2;
    }

    /* renamed from: a */
    public static String m150648a(String str, String str2) {
        return "effectchannel" + str2 + str;
    }

    /* renamed from: a */
    public static String m150649a(String str, String str2, int i, int i2, int i3) {
        C89219l.m154719c(str, "");
        return str + C88045d.f199951a + "effectchannel" + str2 + i + "_" + i2 + "_" + i3;
    }

    /* renamed from: a */
    public static String m150650a(String str, String str2, boolean z, String str3, int i, int i2) {
        C89219l.m154719c(str2, "");
        if (z) {
            str2 = str2 + str3 + i + i2;
        }
        return str2 + C88045d.f199951a + "effectchannel" + str;
    }
}
