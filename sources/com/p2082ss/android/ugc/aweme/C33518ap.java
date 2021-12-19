package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ap */
public final class C33518ap {

    /* renamed from: a */
    static final ArrayList<String> f79618a = C89070n.m154525d("US", "CA", "AU", "NZ", "GB", "IE", "IL", "MK", "JE", "IM", "ME", "GG", "CG", "AD", "RS", "FO", "GI", "SJ", "GR", "NL", "LT", "EE", "BA", "LV", "AL", "MT", "SM", "DE", "CH", "LI", "AT", "LU", "FR", "MA", "BE", "GF", "PF", "TF", "RU", "BY", "UA", "KZ", "MD", "GE", "AZ", "UZ", "TM", "KG", "TJ", "AM", "IT", "PL", "SE", "DK", "NO", "IS", "FI", "RO", "BG", "HU", "SK", "SI", "CZ", "HR");

    /* renamed from: b */
    public static final C33518ap f79619b = new C33518ap();

    private C33518ap() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ap$b */
    static final class C33520b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C33520b f79621a = new C33520b();

        static {
            Covode.recordClassIndex(40383);
        }

        C33520b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) R.string.a3p);
        }
    }

    /* renamed from: a */
    public static int m68682a() {
        return m68683a(C16048b.m29633a().mo25412a(true, "studio_beauty_button_title_strategy", 0), C33519a.f79620a);
    }

    /* renamed from: b */
    public static int m68684b() {
        return m68683a(C16048b.m29633a().mo25412a(true, "beauty_switch_button_title_strategy", 0), C33520b.f79621a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ap$a */
    static final class C33519a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C33519a f79620a = new C33519a();

        static {
            Covode.recordClassIndex(40382);
        }

        C33519a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            String a = C63244g.m114602a().mo73297y().mo93847a();
            C89219l.m154716b(a, "");
            Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a.toUpperCase();
            C89219l.m154716b(upperCase, "");
            if (C33518ap.f79618a.contains(upperCase)) {
                i = R.string.g7v;
            } else if (C89219l.m154714a((Object) "BR", (Object) upperCase) || C89219l.m154714a((Object) "JP", (Object) upperCase)) {
                i = R.string.g7w;
            } else {
                i = R.string.bw1;
            }
            return Integer.valueOf(i);
        }
    }

    static {
        Covode.recordClassIndex(40381);
    }

    /* renamed from: a */
    private static int m68683a(int i, AbstractC89171a<Integer> aVar) {
        if (i == 1) {
            return R.string.bw1;
        }
        if (i == 2) {
            return R.string.g7v;
        }
        if (i != 3) {
            return aVar.invoke().intValue();
        }
        return R.string.g7w;
    }
}
