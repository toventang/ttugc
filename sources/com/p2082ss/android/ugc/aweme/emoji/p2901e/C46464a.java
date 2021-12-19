package com.p2082ss.android.ugc.aweme.emoji.p2901e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.a */
public final class C46464a {

    /* renamed from: a */
    public static final AbstractC89244h f108241a = C89250i.m154774a(EnumC89331m.NONE, C46466b.f108246a);

    /* renamed from: b */
    public static final C46464a f108242b = new C46464a();

    /* renamed from: c */
    private static final C27910f f108243c = C80342dg.m139300a();

    /* renamed from: d */
    private static final Type f108244d = new C46465a().type;

    /* renamed from: e */
    private static final AtomicBoolean f108245e = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.emoji.e.a$a */
    public static final class C46465a extends C27895a<LinkedList<String>> {
        static {
            Covode.recordClassIndex(55048);
        }

        C46465a() {
        }
    }

    private C46464a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.e.a$b */
    static final class C46466b extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C46466b f108246a = new C46466b();

        static {
            Covode.recordClassIndex(55049);
        }

        C46466b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] stringArray = C17867d.m33078a().getResources().getStringArray(R.array.a7);
            C89219l.m154716b(stringArray, "");
            return C89064i.m154508i(stringArray);
        }
    }

    static {
        Covode.recordClassIndex(55047);
    }
}
