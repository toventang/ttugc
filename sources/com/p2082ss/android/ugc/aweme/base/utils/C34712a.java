package com.p2082ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.utils.a */
public final class C34712a {

    /* renamed from: a */
    public static final C34712a f82002a = new C34712a();

    /* renamed from: b */
    private static final AbstractC89244h f82003b = C89250i.m154773a((AbstractC89171a) C34714b.f82004a);

    /* renamed from: com.ss.android.ugc.aweme.base.utils.a$a */
    public interface AbstractC34713a {
        static {
            Covode.recordClassIndex(41705);
        }

        /* renamed from: a */
        void mo61391a(Activity activity, boolean z);
    }

    /* renamed from: a */
    public static List<AbstractC34713a> m70900a() {
        return (List) f82003b.getValue();
    }

    private C34712a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.base.utils.a$b */
    static final class C34714b extends AbstractC89220m implements AbstractC89171a<List<AbstractC34713a>> {

        /* renamed from: a */
        public static final C34714b f82004a = new C34714b();

        static {
            Covode.recordClassIndex(41706);
        }

        C34714b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<AbstractC34713a> invoke() {
            return new ArrayList();
        }
    }

    static {
        Covode.recordClassIndex(41704);
    }

    /* renamed from: a */
    public static final void m70901a(AbstractC34713a aVar) {
        C89219l.m154721d(aVar, "");
        m70900a().add(aVar);
    }
}
