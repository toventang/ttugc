package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63373m;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.f.o */
public final class C63786o {

    /* renamed from: a */
    public static String f144581a = "output";

    /* renamed from: b */
    public static boolean f144582b;

    /* renamed from: c */
    public static boolean f144583c;

    /* renamed from: d */
    public static boolean f144584d;

    /* renamed from: e */
    static int f144585e;

    /* renamed from: f */
    public static final C63786o f144586f = new C63786o();

    /* renamed from: g */
    private static final ArrayList<C63373m> f144587g = new ArrayList<>();

    /* renamed from: h */
    private static final Integer f144588h;

    private C63786o() {
    }

    /* renamed from: i */
    private static int m115359i() {
        Integer num = f144588h;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m115351b() {
        User user;
        List<String> list;
        IAccountUserService g = C31575b.m65865g();
        if (g != null) {
            user = g.getCurUser();
        } else {
            user = null;
        }
        if (user == null || (list = user.boldFields) == null || !list.contains("nickname")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m115353c() {
        User curUser;
        IAccountUserService g = C31575b.m65865g();
        String str = null;
        if (!(g == null || (curUser = g.getCurUser()) == null)) {
            str = curUser.getSignature();
        }
        if (C89361p.m154872a(str, "", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m115354d() {
        User user;
        IAccountUserService g = C31575b.m65865g();
        if (g != null) {
            user = g.getCurUser();
        } else {
            user = null;
        }
        if (user == null || user.getFansCount() < 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static int m115358h() {
        int i;
        if (m115349a()) {
            i = 1;
        } else {
            i = 0;
        }
        if (m115353c()) {
            i++;
        }
        if (m115351b()) {
            return i + 1;
        }
        return i;
    }

    static {
        Integer num;
        User curUser;
        Covode.recordClassIndex(75114);
        IAccountUserService g = C31575b.m65865g();
        if (g == null || (curUser = g.getCurUser()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(curUser.getCompleteProfileGuideStrategy());
        }
        f144588h = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3 != null) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m115349a() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
            if (r0 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getCurUser()
        L_0x000a:
            r2 = 0
            if (r3 == 0) goto L_0x0027
            java.util.List<java.lang.String> r1 = r3.boldFields
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "photo"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x002a
            if (r3 == 0) goto L_0x0027
        L_0x001b:
            java.util.List<java.lang.String> r1 = r3.boldFields
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = "video"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x002a
        L_0x0027:
            return r2
        L_0x0028:
            r3 = 0
            goto L_0x000a
        L_0x002a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o.m115349a():boolean");
    }

    /* renamed from: e */
    public static boolean m115355e() {
        if (C80580in.m139687c()) {
            return false;
        }
        if (m115359i() == 0) {
            return true;
        }
        if (m115359i() == 1) {
            return false;
        }
        if (m115359i() == 2) {
            if (!m115353c() || !m115351b() || !m115349a()) {
                return false;
            }
            return true;
        } else if (m115359i() == 3) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m115356f() {
        if (!C80580in.m139687c() && !m115353c() && !m115351b() && !m115349a() && (m115359i() == 1 || m115359i() == 2 || m115359i() == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static ArrayList<C63373m> m115357g() {
        ArrayList<C63373m> arrayList = f144587g;
        arrayList.clear();
        if (!m115349a()) {
            arrayList.add(new C63373m(R.drawable.b99, R.string.cm4, R.string.cm3, R.string.cm1, true));
        }
        if (!m115351b()) {
            arrayList.add(new C63373m(R.drawable.b8q, R.string.cm0, R.string.clz, R.string.clx, true));
        }
        if (!m115353c()) {
            arrayList.add(new C63373m(R.drawable.b86, R.string.clw, R.string.clv, R.string.clt, true));
        }
        if (m115349a()) {
            arrayList.add(new C63373m(R.drawable.b9_, R.string.cm4, R.string.cm3, R.string.cm2, false));
        }
        if (m115351b()) {
            arrayList.add(new C63373m(R.drawable.b8r, R.string.cm0, R.string.clz, R.string.cly, false));
        }
        if (m115353c()) {
            arrayList.add(new C63373m(R.drawable.b87, R.string.clw, R.string.clv, R.string.clu, false));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m115352b(int i) {
        if (i <= 0 && !C80580in.m139687c() && m115359i() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m115350a(int i) {
        f144585e = i;
        if (i > 3 || C80580in.m139687c()) {
            return false;
        }
        if (m115353c() && m115351b() && m115349a()) {
            return false;
        }
        if (m115359i() == 1 || m115359i() == 2) {
            return true;
        }
        if (m115359i() != 3 || i == 0) {
            return false;
        }
        return true;
    }
}
