package com.bytedance.bpea.entry.common;

import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.EnumC13348i;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.entry.common.a */
public final class C13397a {

    /* renamed from: a */
    public static final C13398a f32687a = new C13398a((byte) 0);

    static {
        Covode.recordClassIndex(15396);
    }

    /* renamed from: com.bytedance.bpea.entry.common.a$a */
    public static final class C13398a {
        static {
            Covode.recordClassIndex(15397);
        }

        private C13398a() {
        }

        public /* synthetic */ C13398a(byte b) {
            this();
        }

        /* renamed from: b */
        public static void m24084b(AbstractC13343d dVar, String str) {
            C89219l.m154719c(str, "");
            m24082a(dVar, new String[]{DataType.AUDIO}, str);
        }

        /* renamed from: c */
        public static void m24085c(AbstractC13343d dVar, String str) {
            C89219l.m154719c(str, "");
            m24082a(dVar, new String[]{"clipboard"}, str);
        }

        /* renamed from: d */
        public static void m24086d(AbstractC13343d dVar, String str) {
            C89219l.m154719c(str, "");
            m24082a(dVar, new String[]{"latitudeAndLongitude"}, str);
        }

        /* renamed from: a */
        public static void m24081a(AbstractC13343d dVar, String str) {
            C89219l.m154719c(str, "");
            m24082a(dVar, new String[]{"video"}, str);
        }

        /* renamed from: a */
        private static C13345f m24080a(String[] strArr, String str, int i) {
            C13345f fVar = new C13345f();
            fVar.f32612b = strArr;
            fVar.f32611a = str;
            fVar.f32613c = Integer.valueOf(i);
            return fVar;
        }

        /* renamed from: a */
        public static void m24082a(AbstractC13343d dVar, String[] strArr, String str) {
            C89219l.m154719c(str, "");
            C13399b.m24087a(dVar, m24080a(strArr, str, EnumC13348i.BPEA_ENTRY.getType()));
        }

        /* renamed from: a */
        public static void m24083a(AbstractC13343d dVar, String[] strArr, String str, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            C13345f a = m24080a(strArr, str + '_' + str2, EnumC13348i.DIRECT_AUTH.getType());
            a.mo21568a("sdkName", str);
            a.mo21568a("methodName", str2);
            C13399b.m24087a(dVar, a);
        }
    }
}
