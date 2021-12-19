package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C27910f;
import java.util.LinkedList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.s */
public final class C42047s implements AbstractC42020h {

    /* renamed from: a */
    public static final AbstractC89244h f98025a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C42049b.f98030a);

    /* renamed from: b */
    public static final C42048a f98026b = new C42048a((byte) 0);

    /* renamed from: c */
    private LinkedList<C42040m> f98027c;

    /* renamed from: d */
    private int f98028d;

    /* renamed from: e */
    private final C27910f f98029e;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.s$a */
    public static final class C42048a {
        static {
            Covode.recordClassIndex(49978);
        }

        /* renamed from: a */
        public static C42047s m84150a() {
            return (C42047s) C42047s.f98025a.getValue();
        }

        private C42048a() {
        }

        public /* synthetic */ C42048a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.s$b */
    static final class C42049b extends AbstractC89220m implements AbstractC89171a<C42047s> {

        /* renamed from: a */
        public static final C42049b f98030a = new C42049b();

        static {
            Covode.recordClassIndex(49979);
        }

        C42049b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42047s invoke() {
            return new C42047s((byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42020h
    /* renamed from: a */
    public final String mo71202a() {
        String b = this.f98029e.mo46674b(this.f98027c);
        C89219l.m154716b(b, "");
        return b;
    }

    static {
        Covode.recordClassIndex(49977);
    }

    private C42047s() {
        this.f98027c = new LinkedList<>();
        this.f98028d = SettingsManager.m29616a().mo25394a("query_list_local_storage", 10);
        this.f98029e = new C27910f();
    }

    public /* synthetic */ C42047s(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42020h
    /* renamed from: a */
    public final void mo71203a(C42040m mVar) {
        C89219l.m154721d(mVar, "");
        if (this.f98027c.size() < this.f98028d) {
            this.f98027c.addFirst(mVar);
            return;
        }
        this.f98027c.removeLast();
        this.f98027c.addFirst(mVar);
    }
}
