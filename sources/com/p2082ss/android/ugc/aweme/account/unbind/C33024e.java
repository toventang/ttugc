package com.p2082ss.android.ugc.aweme.account.unbind;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.unbind.e */
public final class C33024e {

    /* renamed from: a */
    public static final C33024e f78566a = new C33024e();

    private C33024e() {
    }

    static {
        Covode.recordClassIndex(39830);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.e$a */
    static final class C33025a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f78567a;

        static {
            Covode.recordClassIndex(39831);
        }

        C33025a(AbstractC89171a aVar) {
            this.f78567a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f78567a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.e$b */
    static final class C33026b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f78568a;

        static {
            Covode.recordClassIndex(39832);
        }

        C33026b(AbstractC89171a aVar) {
            this.f78568a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f78568a.invoke();
        }
    }

    /* renamed from: b */
    public static boolean m67663b(AbstractC32572b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar.mo58460Z_() == EnumC32594j.UNBIND_EMAIL_VERIFY_USING_PHONE || bVar.mo58460Z_() == EnumC32594j.UNBIND_PHONE_VERIFY) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m67664c(AbstractC32572b bVar) {
        C89219l.m154721d(bVar, "");
        Bundle arguments = bVar.getArguments();
        if (arguments == null || !arguments.getBoolean("is_email_verified")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m67661a(AbstractC32572b bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        Bundle arguments = bVar.getArguments();
        if (arguments != null) {
            i = arguments.getInt("current_scene");
        } else {
            i = -1;
        }
        if (i == EnumC32592i.UNBIND_PHONE.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m67660a(AbstractC32572b bVar, String str, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C32407x.m66797a(bVar, "", EnumC32594j.UNBIND_PHONE_CONFIRM, str).mo143251d(new C33026b(aVar)).mo143246c();
    }

    /* renamed from: b */
    public static void m67662b(AbstractC32572b bVar, String str, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C32407x.m66788a(bVar, "", 6, str, (Map) null, (String) null, 112).mo143251d(new C33025a(aVar)).mo143246c();
    }
}
