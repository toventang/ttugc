package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.experiment.C46998gw;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C56877r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cl */
public final class C36135cl extends AbstractC56869p {

    /* renamed from: k */
    private final AbstractC89244h f85360k = C89250i.m154773a((AbstractC89171a) new C36137b(this));

    /* renamed from: l */
    private final AbstractC89244h f85361l = C89250i.m154773a((AbstractC89171a) new C36136a(this));

    /* renamed from: m */
    private final AbstractC89244h f85362m = C89250i.m154774a(EnumC89331m.NONE, new C36138c(this));

    static {
        Covode.recordClassIndex(43388);
    }

    /* renamed from: a */
    public final int mo63250a() {
        return ((Number) this.f85361l.getValue()).intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: c */
    public final int mo63252c() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: g */
    public final String mo63256g() {
        return "new";
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: e */
    public final int mo63254e() {
        return mo63250a();
    }

    /* renamed from: com.ss.android.ugc.aweme.cl$b */
    static final class C36137b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C36135cl f85364a;

        static {
            Covode.recordClassIndex(43390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36137b(C36135cl clVar) {
            super(0);
            this.f85364a = clVar;
        }

        /* renamed from: a */
        private static boolean m73617a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            int i;
            boolean z;
            if (C36135cl.m73609b()) {
                i = 1;
            } else if (!C49907s.m93685a().booleanValue() || Keva.getRepo("new_user_journey").contains("new_user_journey_show")) {
                i = -1;
            } else {
                i = this.f85364a.mo63250a();
            }
            boolean z2 = false;
            if (i > 0) {
                z = true;
                C17867d.m33078a();
                if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132253e = m73617a();
                }
                if (!C58029j.f132253e) {
                    Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
                }
                z2 = z;
            } else {
                z = false;
                z2 = z;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: b */
    public static boolean m73609b() {
        return C16048b.m29633a().mo25421a(true, "lanuch_new_user_journey_next_time", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: f */
    public final int mo63255f() {
        return ((Number) this.f85362m.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.cl$c */
    static final class C36138c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C36135cl f85365a;

        static {
            Covode.recordClassIndex(43391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36138c(C36135cl clVar) {
            super(0);
            this.f85365a = clVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int a = this.f85365a.mo63250a();
            Keva.getRepo("new_user_journey").storeInt("update_interest_recommend_group_new_user", a);
            return Integer.valueOf(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: d */
    public final int mo63253d() {
        if (((Boolean) this.f85360k.getValue()).booleanValue()) {
            return 2;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.cl$a */
    static final class C36136a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C36135cl f85363a;

        static {
            Covode.recordClassIndex(43389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36136a(C36135cl clVar) {
            super(0);
            this.f85363a = clVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Integer invoke() {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.C36135cl.C36136a.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: a */
    public final C56877r mo63251a(Context context, Boolean bool) {
        int i;
        int i2;
        C89219l.m154721d(context, "");
        if (C46998gw.m90276b()) {
            i = R.string.gh1;
        } else {
            i = R.string.den;
        }
        String string = context.getString(R.string.deg);
        String string2 = context.getString(i);
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            i2 = R.string.cn1;
        } else {
            i2 = R.string.del;
        }
        return new C56877r(string, string2, context.getString(i2));
    }
}
