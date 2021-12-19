package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2306ah.C33457e;
import com.p2082ss.android.ugc.aweme.p2730de.C40973h;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.gr */
public final class C80510gr {

    /* renamed from: a */
    public static boolean f180106a = true;

    /* renamed from: b */
    public static boolean f180107b = true;

    /* renamed from: c */
    public static boolean f180108c = true;

    /* renamed from: d */
    public static AbstractC80210ae f180109d;

    /* renamed from: e */
    public static final C80510gr f180110e = new C80510gr();

    /* renamed from: a */
    public static final void m139532a(String str, String str2) {
        m139535a(str, str2, (String) null, (String) null, 12);
    }

    /* renamed from: a */
    public static final void m139533a(String str, String str2, String str3) {
        m139535a(str, str2, str3, (String) null, 8);
    }

    private C80510gr() {
    }

    /* renamed from: a */
    public static final void m139526a() {
        f180106a = true;
        f180107b = true;
        f180108c = true;
    }

    /* renamed from: b */
    public static final void m139536b() {
        f180106a = false;
        f180107b = false;
        f180108c = false;
    }

    /* renamed from: c */
    private static void m139541c() {
        if (f180109d == null) {
            throw new IllegalStateException("behavior reporter not init");
        }
    }

    static {
        Covode.recordClassIndex(93783);
    }

    /* renamed from: a */
    public static final void m139527a(String str) {
        C89219l.m154721d(str, "");
        m139549g(str);
    }

    /* renamed from: b */
    public static final void m139537b(String str) {
        C89219l.m154721d(str, "");
        m139549g(str);
    }

    /* renamed from: c */
    public static final void m139542c(String str) {
        C89219l.m154721d(str, "");
        m139531a("-1", BehaviorType.FAILED, "CK", str, null, 16);
    }

    /* renamed from: d */
    public static final void m139545d(String str) {
        C89219l.m154721d(str, "");
        m139531a(str, BehaviorType.SUCCESS, "UP", null, null, 24);
    }

    /* renamed from: e */
    public static final void m139547e(String str) {
        C89219l.m154721d(str, "");
        m139531a(str, BehaviorType.SUCCESS, "CA", null, null, 24);
    }

    /* renamed from: f */
    public static final void m139548f(String str) {
        C89219l.m154721d(str, "");
        m139531a(str, BehaviorType.EVENT, "CP", null, null, 24);
    }

    /* renamed from: g */
    private static void m139549g(String str) {
        m139541c();
        try {
            AbstractC80210ae aeVar = f180109d;
            if (aeVar == null) {
                C89219l.m154715b();
            }
            aeVar.mo73251a(str);
            C84911q.m145921a("RuntimeBehaviorManager---> EventType : ".concat(String.valueOf(str)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static final void m139546d(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m139530a(str, BehaviorType.SUCCESS, "AK", "", str2);
    }

    /* renamed from: b */
    public static final void m139539b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m139530a(str, BehaviorType.START, "SN", "", str2);
    }

    /* renamed from: c */
    public static final void m139544c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m139530a(str, BehaviorType.SUCCESS, "SN", "", str2);
    }

    /* renamed from: a */
    public static final void m139528a(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        BehaviorType behaviorType = BehaviorType.FAILED;
        String valueOf = String.valueOf(i);
        if (str2 == null) {
            str2 = "";
        }
        m139530a(str, behaviorType, "SN", valueOf, str2);
    }

    /* renamed from: b */
    public static final void m139538b(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m139530a(str, BehaviorType.FAILED, "UP", String.valueOf(i), str2);
    }

    /* renamed from: c */
    public static final void m139543c(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m139531a(str, BehaviorType.FAILED, "CA", C33457e.m68564a(i), null, 16);
    }

    /* renamed from: b */
    private static void m139540b(String str, String str2, String str3) {
        try {
            AbstractC80210ae aeVar = f180109d;
            if (aeVar == null) {
                C89219l.m154715b();
            }
            aeVar.mo73252a(str, str2);
            C84911q.m145921a("RuntimeBehaviorManager---> EventType : " + str + " , code : " + str2 + " , msg : " + str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static final void m139529a(String str, int i, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        BehaviorType behaviorType = BehaviorType.FAILED;
        String valueOf = String.valueOf(i);
        if (str3 == null) {
            str3 = "";
        }
        m139530a(str, behaviorType, "AK", valueOf, str3);
    }

    /* renamed from: a */
    private static void m139534a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (str4 == null || str4.length() == 0) {
            m139540b(str, str2, str3);
        } else {
            m139540b(str, str2 + '-' + str4, str3);
        }
    }

    /* renamed from: a */
    public static void m139530a(String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        try {
            AbstractC80210ae aeVar = f180109d;
            if (aeVar == null) {
                C89219l.m154715b();
            }
            String b = C40973h.m82494a().mo46674b(new PublishBehaviorModel(System.currentTimeMillis(), str, behaviorType, str2, str3, str4));
            C89219l.m154716b(b, "");
            aeVar.mo73252a("publish", b);
            C84911q.m145921a("RuntimeBehaviorManager|id:" + str + " type:" + behaviorType + " stage:" + str2 + " code:" + str3 + " info:" + str4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m139535a(String str, String str2, String str3, String str4, int i) {
        if ((i & 2) != 0) {
            str2 = "-1";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        m139534a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m139531a(String str, BehaviorType behaviorType, String str2, String str3, String str4, int i) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        m139530a(str, behaviorType, str2, str3, str4);
    }
}
