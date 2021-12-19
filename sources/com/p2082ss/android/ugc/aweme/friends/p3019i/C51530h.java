package com.p2082ss.android.ugc.aweme.friends.p3019i;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46912et;
import com.p2082ss.android.ugc.aweme.experiment.C46913eu;
import com.p2082ss.android.ugc.aweme.experiment.C46927fd;
import com.p2082ss.android.ugc.aweme.experiment.C46928fe;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.i.h */
public final class C51530h {

    /* renamed from: a */
    static AbstractC88412b f118751a;

    /* renamed from: b */
    static AbstractC88412b f118752b;

    /* renamed from: c */
    static AbstractC88412b f118753c;

    /* renamed from: d */
    static Keva f118754d = C66890a.C66891a.m118631a().f150169a;

    /* renamed from: e */
    public static final C51530h f118755e = new C51530h();

    /* renamed from: f */
    private static final C46928fe f118756f = C46913eu.m90215a();

    private C51530h() {
    }

    /* renamed from: a */
    public final C46927fd mo87028a(int i) {
        C46928fe feVar;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() || (feVar = f118756f) == null || feVar.f109364d != 4) {
            return new C46927fd(false, false, i);
        }
        return m95998a(i, Integer.valueOf(feVar.f109364d));
    }

    /* renamed from: a */
    public final void mo87029a(C46927fd fdVar, String str, String str2, ActivityC0945e eVar) {
        C89219l.m154721d(fdVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(eVar, "");
        if (m96003a()) {
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION);
        } else if (C46912et.m90214a()) {
            m96006b(fdVar, str, str2, eVar);
        } else {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            f118751a = C79515b.m138229a(eVar, ContactUFR.class, g.getCurUserId(), str, str2, true, true, null).mo143289d(new C51533c(fdVar, str, str2, eVar));
        }
    }

    /* renamed from: a */
    public final void mo87030a(boolean z, String str, String str2, ActivityC0945e eVar, int i) {
        if (!z) {
            m96001a(str, 1);
        } else if (m96004a(i, 2)) {
            User b = C80580in.m139683b();
            C89219l.m154716b(b, "");
            f118752b = C79515b.m138229a(eVar, C79496a.class, b.getUid(), str, str2, true, true, null).mo143289d(new C51532b(str));
        }
    }

    static {
        Covode.recordClassIndex(60795);
    }

    /* renamed from: a */
    private static boolean m96003a() {
        if (m96007c(1) || m96007c(2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final C46927fd m96005b(int i) {
        return new C46927fd(m96004a(i, 1), m96004a(i, 2), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.i.h$a */
    public static final class C51531a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f118757a;

        static {
            Covode.recordClassIndex(60796);
        }

        C51531a(String str) {
            this.f118757a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.AUTHORIZED) {
                C51530h.m96001a(this.f118757a, 1);
                C51530h.f118754d.storeBoolean("finish_contact_permission_process", true);
                AbstractC88412b bVar = C51530h.f118751a;
                if (bVar != null) {
                    bVar.dispose();
                }
                C51530h.f118751a = null;
            }
            if ((dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) && !dVar.f178517b.f178518a) {
                C51530h.m96001a(this.f118757a, 1);
                AbstractC88412b bVar2 = C51530h.f118751a;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                C51530h.f118751a = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.i.h$b */
    public static final class C51532b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f118758a;

        static {
            Covode.recordClassIndex(60797);
        }

        C51532b(String str) {
            this.f118758a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.AUTHORIZED) {
                C51530h.m96001a(this.f118758a, 2);
                C51530h.f118754d.storeBoolean("finish_facebook_permission_process", true);
                AbstractC88412b bVar = C51530h.f118752b;
                if (bVar != null) {
                    bVar.dispose();
                }
                C51530h.f118752b = null;
            }
            if ((dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) && !dVar.f178517b.f178518a) {
                C51530h.m96001a(this.f118758a, 2);
                AbstractC88412b bVar2 = C51530h.f118752b;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                C51530h.f118752b = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.i.h$c */
    public static final class C51533c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C46927fd f118759a;

        /* renamed from: b */
        final /* synthetic */ String f118760b;

        /* renamed from: c */
        final /* synthetic */ String f118761c;

        /* renamed from: d */
        final /* synthetic */ ActivityC0945e f118762d;

        static {
            Covode.recordClassIndex(60798);
        }

        C51533c(C46927fd fdVar, String str, String str2, ActivityC0945e eVar) {
            this.f118759a = fdVar;
            this.f118760b = str;
            this.f118761c = str2;
            this.f118762d = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.AUTHORIZED) {
                C51530h.f118755e.mo87030a(this.f118759a.f109359b, this.f118760b, this.f118761c, this.f118762d, this.f118759a.f109360c);
                C51530h.f118754d.storeBoolean("finish_contact_permission_process", true);
                AbstractC88412b bVar = C51530h.f118751a;
                if (bVar != null) {
                    bVar.dispose();
                }
                C51530h.f118751a = null;
            }
            if ((dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) && !dVar.f178517b.f178518a) {
                C51530h.m96001a(this.f118760b, 1);
                AbstractC88412b bVar2 = C51530h.f118751a;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                C51530h.f118751a = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.i.h$d */
    public static final class C51534d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f118763a;

        /* renamed from: b */
        final /* synthetic */ String f118764b;

        /* renamed from: c */
        final /* synthetic */ String f118765c;

        /* renamed from: d */
        final /* synthetic */ ActivityC0945e f118766d;

        /* renamed from: e */
        final /* synthetic */ int f118767e;

        static {
            Covode.recordClassIndex(60799);
        }

        C51534d(int i, String str, String str2, ActivityC0945e eVar, int i2) {
            this.f118763a = i;
            this.f118764b = str;
            this.f118765c = str2;
            this.f118766d = eVar;
            this.f118767e = i2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.AUTHORIZED) {
                if (this.f118763a == 2) {
                    C51530h.m96002a(this.f118764b, this.f118765c, this.f118766d);
                    C51530h.f118754d.storeBoolean("finish_facebook_permission_process", true);
                } else {
                    C51530h.f118755e.mo87030a(true, this.f118764b, this.f118765c, this.f118766d, this.f118767e);
                    C51530h.f118754d.storeBoolean("finish_contact_permission_process", true);
                }
                AbstractC88412b bVar = C51530h.f118753c;
                if (bVar != null) {
                    bVar.dispose();
                }
                C51530h.f118753c = null;
            }
            if ((dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) && !dVar.f178517b.f178518a) {
                C51530h.m96001a(this.f118764b, this.f118763a);
                AbstractC88412b bVar2 = C51530h.f118753c;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                C51530h.f118753c = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r0 == null) goto L_0x0036;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m96007c(int r9) {
        /*
            com.ss.android.ugc.aweme.friends.service.a r0 = com.p2082ss.android.ugc.aweme.friends.service.C51648a.f118980a
            com.ss.android.ugc.aweme.friends.service.b r0 = r0.mo87339s()
            r8 = 0
            if (r0 == 0) goto L_0x0048
            h.p r1 = r0.mo87352a(r9)
            java.lang.Object r0 = r1.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0048
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            com.ss.android.ugc.aweme.experiment.fe r0 = com.p2082ss.android.ugc.aweme.friends.p3019i.C51530h.f118756f
            if (r0 == 0) goto L_0x0046
            int r0 = r0.f109362b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0039
        L_0x0036:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0039:
            int r0 = r0.intValue()
            long r0 = (long) r0
            long r2 = r2 * r0
            long r4 = r4 + r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0048
            r0 = 1
            return r0
        L_0x0046:
            r0 = 0
            goto L_0x0036
        L_0x0048:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3019i.C51530h.m96007c(int):boolean");
    }

    /* renamed from: a */
    private final C46927fd m95998a(int i, Integer num) {
        if (C46912et.m90214a()) {
            return m96005b(i);
        }
        boolean z = true;
        boolean a = m96004a(i, 1);
        if (num == null || (!(num.intValue() == 4 || num.intValue() == 5) || C79519c.C79521b.f178476a.mo86993b())) {
            z = false;
        }
        return new C46927fd(a, z, i);
    }

    /* renamed from: a */
    private static void m96000a(Integer num, int i) {
        f118754d.storeInt("contact_pop_up_count", f118754d.getInt("contact_pop_up_count", 0) + 1);
        f118754d.storeLong("last_show_contact_time", System.currentTimeMillis());
        f118754d.storeInt("last_permission_pop_up_type", i);
        if (num == null || num.intValue() != 0) {
            f118754d.storeInt("rules_major_stage", f118754d.getInt("rules_major_stage", 0) + 1);
        }
    }

    /* renamed from: a */
    public static void m96001a(String str, int i) {
        Integer num;
        C46928fe feVar = f118756f;
        if (feVar != null) {
            num = Integer.valueOf(feVar.f109364d);
        } else {
            num = null;
        }
        m96000a(num, i);
        if (C89219l.m154714a((Object) str, (Object) "personal_homepage")) {
            C63419ae.f143971a.updateProfilePermission(false);
        }
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r1 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        p4600h.p4611f.p4613b.C89219l.m154715b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        if (r11 <= (((long) r1.intValue()) * 86400000)) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        r6 = com.p2082ss.android.ugc.aweme.friends.p3019i.C51530h.f118756f;
        r0 = r6.f109361a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (r0 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        r0 = r0.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r0 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        r0 = r0.f109441a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r0 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        p4600h.p4611f.p4613b.C89219l.m154715b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        if (r4 >= (r0.size() - 1)) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r11 = r11 - (((long) r1.intValue()) * 86400000);
        r4 = r4 + 1;
        r0 = r6.f109361a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        if (r0 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c3, code lost:
        r0 = r0.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
        if (r0 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        r0 = r0.f109442b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cd, code lost:
        if (r0 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d8, code lost:
        r0 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m96004a(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3019i.C51530h.m96004a(int, int):boolean");
    }

    /* renamed from: a */
    public static void m96002a(String str, String str2, ActivityC0945e eVar) {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        f118751a = C79515b.m138229a(eVar, ContactUFR.class, g.getCurUserId(), str, str2, true, true, null).mo143289d(new C51531a(str));
    }

    /* renamed from: b */
    private final void m96006b(C46927fd fdVar, String str, String str2, ActivityC0945e eVar) {
        int i = f118754d.getInt("last_permission_pop_up_type", 0);
        int i2 = f118754d.getInt("contact_pop_up_count", 0);
        int i3 = 1;
        if (i == 1 || (i == 0 && i2 != 0)) {
            i3 = 2;
        }
        if (fdVar.f109358a && fdVar.f109359b) {
            m95999a(i3, str, str2, eVar, fdVar.f109360c);
        } else if (fdVar.f109358a) {
            m96002a(str, str2, eVar);
        } else if (fdVar.f109359b) {
            mo87030a(true, str, str2, eVar, fdVar.f109360c);
        }
    }

    /* renamed from: a */
    private static void m95999a(int i, String str, String str2, ActivityC0945e eVar, int i2) {
        Class cls;
        if (i == 2) {
            cls = C79496a.class;
        } else {
            cls = ContactUFR.class;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        f118753c = C79515b.m138229a(eVar, cls, g.getCurUserId(), str, str2, true, true, null).mo143289d(new C51534d(i, str, str2, eVar, i2));
    }
}
