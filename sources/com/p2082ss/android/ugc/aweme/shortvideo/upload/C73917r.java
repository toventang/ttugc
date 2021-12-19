package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73920u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.r */
public final class C73917r {

    /* renamed from: a */
    public static final C73917r f165945a = new C73917r();

    /* renamed from: b */
    private static C73920u f165946b;

    /* renamed from: a */
    private static float m130005a(long j) {
        return (((float) j) / 1024.0f) / 1024.0f;
    }

    private C73917r() {
    }

    static {
        Covode.recordClassIndex(86663);
    }

    /* renamed from: a */
    public static final C73920u.C73921a m130006a() {
        C73920u uVar = f165946b;
        if (uVar != null) {
            return uVar.mo116367a();
        }
        return null;
    }

    /* renamed from: a */
    public static final void m130007a(String str) {
        if (str != null) {
            C73920u uVar = new C73920u(str, EnumC73919t.DirectRecord);
            f165946b = uVar;
            uVar.f165951c = m130005a(C70638dj.m124843b());
        }
    }

    /* renamed from: b */
    public static final void m130010b(String str) {
        if (str != null) {
            C73920u uVar = new C73920u(str, EnumC73919t.Draft);
            f165946b = uVar;
            uVar.f165951c = m130005a(C70638dj.m124843b());
        }
    }

    /* renamed from: a */
    public static final void m130008a(String str, long j) {
        if (str != null && f165946b != null) {
            m130011b(str, "onSyntheticFinish");
            C73920u uVar = f165946b;
            if (uVar != null) {
                uVar.f165953e = m130005a(C70638dj.m124843b());
            }
            C73920u uVar2 = f165946b;
            if (uVar2 != null) {
                uVar2.f165954f = m130005a(j);
            }
        }
    }

    /* renamed from: a */
    public static final void m130009a(String str, String str2) {
        C89219l.m154721d(str2, "");
        if (str != null && f165946b != null) {
            m130011b(str, "onSyntheticStart");
            C73920u uVar = f165946b;
            if (uVar != null) {
                uVar.f165952d = m130005a(C70638dj.m124843b());
            }
            C73920u uVar2 = f165946b;
            if (uVar2 != null) {
                uVar2.mo116368a(str2);
            }
        }
    }

    /* renamed from: b */
    private static void m130011b(String str, String str2) {
        C73920u uVar = f165946b;
        if (uVar != null) {
            String str3 = null;
            if (!C89219l.m154714a((Object) str, (Object) uVar.f165949a)) {
                C73920u uVar2 = f165946b;
                if (uVar2 == null) {
                    C89219l.m154715b();
                }
                StringBuilder append = new StringBuilder().append(uVar2.f165956h).append(str2).append(" creationId Error, start:");
                C73920u uVar3 = f165946b;
                if (uVar3 != null) {
                    str3 = uVar3.f165949a;
                }
                uVar2.mo116369b(append.append(str3).append(", now:").append(str).toString());
                C73920u uVar4 = f165946b;
                if (uVar4 != null) {
                    uVar4.f165957i = false;
                }
            }
        }
    }
}
