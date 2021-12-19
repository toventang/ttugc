package com.p2082ss.android.ugc.aweme.journey;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.p */
public abstract class AbstractC56869p {

    /* renamed from: i */
    public static final AbstractC89244h f129506i = C89250i.m154773a((AbstractC89171a) C56871b.f129516a);

    /* renamed from: j */
    public static final C56870a f129507j = new C56870a((byte) 0);

    /* renamed from: a */
    public boolean f129508a;

    /* renamed from: b */
    public String f129509b;

    /* renamed from: c */
    public int f129510c;

    /* renamed from: d */
    public boolean f129511d;

    /* renamed from: e */
    public final AbstractC89244h f129512e = C89250i.m154774a(EnumC89331m.NONE, new C56872c(this));

    /* renamed from: f */
    public boolean f129513f;

    /* renamed from: g */
    public int f129514g = -1;

    /* renamed from: h */
    public StringBuilder f129515h = new StringBuilder();

    /* renamed from: W_ */
    public boolean mo70121W_() {
        return false;
    }

    /* renamed from: a */
    public C56877r mo63251a(Context context, Boolean bool) {
        C89219l.m154721d(context, "");
        return null;
    }

    /* renamed from: a */
    public void mo70122a(boolean z) {
    }

    /* renamed from: c */
    public abstract int mo63252c();

    /* renamed from: d */
    public abstract int mo63253d();

    /* renamed from: e */
    public abstract int mo63254e();

    /* renamed from: f */
    public abstract int mo63255f();

    /* renamed from: g */
    public abstract String mo63256g();

    /* renamed from: com.ss.android.ugc.aweme.journey.p$a */
    public static final class C56870a {
        static {
            Covode.recordClassIndex(66756);
        }

        /* renamed from: a */
        public static AbstractC56869p m103133a() {
            return (AbstractC56869p) AbstractC56869p.f129506i.getValue();
        }

        private C56870a() {
        }

        public /* synthetic */ C56870a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m103135a(Intent intent) {
            String str;
            if (intent != null) {
                str = m103134a(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, "HOME")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private static String m103134a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(66755);
    }

    /* renamed from: h */
    public final boolean mo94055h() {
        if (mo63253d() != 2 || this.f129508a || this.f129511d) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.p$b */
    static final class C56871b extends AbstractC89220m implements AbstractC89171a<AbstractC56869p> {

        /* renamed from: a */
        public static final C56871b f129516a = new C56871b();

        static {
            Covode.recordClassIndex(66757);
        }

        C56871b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC56869p invoke() {
            AbstractC56869p a = C57058z.f129923a.mo57260a(1);
            if (a.mo63253d() != 0) {
                return a;
            }
            AbstractC56869p a2 = C57058z.f129923a.mo57260a(2);
            if (a2.mo63253d() != 0) {
                return a2;
            }
            AbstractC56869p a3 = C57058z.f129923a.mo57260a(3);
            if (a3.mo63253d() != 0) {
                return a3;
            }
            return new C56851c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.p$c */
    static final class C56872c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC56869p f129517a;

        static {
            Covode.recordClassIndex(66758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56872c(AbstractC56869p pVar) {
            super(0);
            this.f129517a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C56873q.f129521d.contains(C56873q.m103136a()) || C56873q.f129523f.contains(C56873q.m103136a()) ? this.f129517a.mo63254e() == 10 : C56873q.f129520c.contains(C56873q.m103136a())) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public final String mo94051a(int i) {
        if (mo63253d() == 0) {
            return null;
        }
        if (i == 4) {
            HashMap hashMap = new HashMap();
            hashMap.put("recommend_group", Integer.valueOf(mo63254e()));
            hashMap.put("special_type", Integer.valueOf(this.f129510c));
            return C80342dg.m139300a().mo46674b(hashMap);
        } else if (TextUtils.isEmpty(this.f129509b)) {
            return null;
        } else {
            String str = this.f129509b;
            this.f129509b = null;
            return str;
        }
    }

    /* renamed from: a */
    public final void mo94053a(String str) {
        C89219l.m154721d(str, "");
        try {
            this.f129515h.append(str + ' ');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final String mo94054b(List<C57054w> list, int i) {
        C89219l.m154721d(list, "");
        C27917g gVar = new C27917g();
        gVar.f65565e = false;
        String b = gVar.mo46682b().mo46674b(new C56846af(list, Integer.valueOf(mo63255f()), Integer.valueOf(this.f129510c), Integer.valueOf(i)));
        this.f129509b = b;
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: a */
    public final String mo94052a(List<C57054w> list, int i) {
        C89219l.m154721d(list, "");
        C27917g gVar = new C27917g();
        gVar.f65565e = false;
        String b = gVar.mo46682b().mo46674b(new C56846af(list, Integer.valueOf(mo63255f()), Integer.valueOf(this.f129510c), Integer.valueOf(i)));
        this.f129509b = b;
        if (b == null) {
            return "";
        }
        return b;
    }
}
