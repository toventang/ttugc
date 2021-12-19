package com.p2082ss.android.ugc.aweme.account.experiment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.h */
public final class C31650h extends AbstractC31648g {

    /* renamed from: a */
    public static final int f75705a = 1;

    /* renamed from: b */
    public static final C31650h f75706b = new C31650h();

    /* renamed from: c */
    private static final int f75707c = 2;

    /* renamed from: d */
    private static final int f75708d = 3;

    /* renamed from: e */
    private static final int f75709e = 4;

    /* renamed from: f */
    private static final int f75710f = 5;

    /* renamed from: g */
    private static final int f75711g = 6;

    /* renamed from: h */
    private static final AbstractC89244h f75712h = C89250i.m154773a((AbstractC89171a) C31651a.f75713a);

    /* renamed from: f */
    private static int m65957f() {
        return ((Number) f75712h.getValue()).intValue();
    }

    private C31650h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.h$a */
    static final class C31651a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C31651a f75713a = new C31651a();

        static {
            Covode.recordClassIndex(38382);
        }

        C31651a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("gm_btn_appearance_optimize", ClientExpManager.gm_btn_appearance_optimize()));
        }
    }

    /* renamed from: b */
    public final boolean mo57655b() {
        if (!mo57652c()) {
            return false;
        }
        if (m65957f() == f75707c || m65957f() == f75708d) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo57657e() {
        if (mo57652c() && m65957f() == f75711g) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(38381);
    }

    /* renamed from: d */
    public final boolean mo57656d() {
        if (!mo57652c()) {
            return false;
        }
        if (m65957f() == f75709e || m65957f() == f75710f || m65957f() == f75711g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo57654a() {
        if (!mo57652c()) {
            return false;
        }
        if (m65957f() == f75708d || m65957f() == f75710f || m65957f() == f75711g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo57653a(Context context) {
        C89219l.m154721d(context, "");
        if (!mo57652c() || m65957f() == f75705a || m65957f() == f75707c || m65957f() == f75709e) {
            return null;
        }
        return context.getString(R.string.c9f);
    }
}
