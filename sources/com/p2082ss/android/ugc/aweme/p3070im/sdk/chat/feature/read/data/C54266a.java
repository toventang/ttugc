package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a */
public final class C54266a {

    /* renamed from: d */
    public static final C54267a f124306d = new C54267a((byte) 0);

    /* renamed from: a */
    public int f124307a = -1;

    /* renamed from: b */
    public C19538ai f124308b;

    /* renamed from: c */
    public final C53709a f124309c;

    /* renamed from: e */
    private final AbstractC89244h f124310e = C89250i.m154773a((AbstractC89171a) C54268b.f124311a);

    static {
        Covode.recordClassIndex(63956);
    }

    /* renamed from: a */
    public final List<String> mo91345a() {
        return (List) this.f124310e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a$a */
    public static final class C54267a {
        static {
            Covode.recordClassIndex(63957);
        }

        private C54267a() {
        }

        public /* synthetic */ C54267a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a$b */
    static final class C54268b extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        public static final C54268b f124311a = new C54268b();

        static {
            Covode.recordClassIndex(63958);
        }

        C54268b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<String> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: b */
    public final boolean mo91347b() {
        int i = this.f124307a;
        if (i == 2 || i == 3) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "SpotReadState:{" + this.f124308b.getMsgId() + ", " + this.f124307a + ", [" + mo91345a() + "]}";
    }

    /* renamed from: a */
    public final void mo91346a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        this.f124308b = aiVar;
    }

    public C54266a(C19538ai aiVar, C53709a aVar) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(aVar, "");
        this.f124308b = aiVar;
        this.f124309c = aVar;
    }
}
