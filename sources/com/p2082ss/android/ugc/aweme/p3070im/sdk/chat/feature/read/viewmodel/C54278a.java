package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data.C54266a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data.manager.C54272a;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a */
public final class C54278a {

    /* renamed from: a */
    public final AbstractC17434e f124336a;

    /* renamed from: b */
    public final C53709a f124337b;

    /* renamed from: c */
    private final AbstractC89244h f124338c = C89250i.m154773a((AbstractC89171a) new C54280b(this));

    /* renamed from: d */
    private final AbstractC89244h f124339d = C89250i.m154773a((AbstractC89171a) C54279a.f124341a);

    /* renamed from: e */
    private final AbstractC89244h f124340e = C89250i.m154773a((AbstractC89171a) C54281c.f124343a);

    static {
        Covode.recordClassIndex(63972);
    }

    /* renamed from: a */
    public final C54272a mo91365a() {
        return (C54272a) this.f124338c.getValue();
    }

    /* renamed from: b */
    public final List<C19538ai> mo91368b() {
        return (List) this.f124339d.getValue();
    }

    /* renamed from: c */
    public final C33943c<C54266a> mo91369c() {
        return (C33943c) this.f124340e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a$a */
    static final class C54279a extends AbstractC89220m implements AbstractC89171a<List<C19538ai>> {

        /* renamed from: a */
        public static final C54279a f124341a = new C54279a();

        static {
            Covode.recordClassIndex(63973);
        }

        C54279a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C19538ai> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a$c */
    static final class C54281c extends AbstractC89220m implements AbstractC89171a<C33943c<C54266a>> {

        /* renamed from: a */
        public static final C54281c f124343a = new C54281c();

        static {
            Covode.recordClassIndex(63975);
        }

        C54281c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<C54266a> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a$b */
    static final class C54280b extends AbstractC89220m implements AbstractC89171a<C54272a> {

        /* renamed from: a */
        final /* synthetic */ C54278a f124342a;

        static {
            Covode.recordClassIndex(63974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54280b(C54278a aVar) {
            super(0);
            this.f124342a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C54272a invoke() {
            C19638h d = this.f124342a.mo91370d();
            if (d != null) {
                return new C54272a(d);
            }
            return null;
        }
    }

    /* renamed from: d */
    public final C19638h mo91370d() {
        return AbstractC17420a.C17421a.m32276a().mo27720a(this.f124337b.getConversationId());
    }

    /* renamed from: a */
    public final void mo91366a(int i) {
        C54266a value = mo91369c().getValue();
        if (value != null) {
            value.f124307a = i;
            value.mo91345a().clear();
            mo91369c().setValue(mo91369c().getValue());
            C54272a a = mo91365a();
            if (a != null) {
                C19538ai aiVar = value.f124308b;
                String str = "";
                C89219l.m154721d(aiVar, str);
                if (i != -1) {
                    if (a.f124324d.isGroupChat() && i == 1) {
                        i = 2;
                    }
                    if (!C89219l.m154714a(a.f124321a, aiVar) || a.f124322b != i) {
                        a.f124321a = aiVar;
                        a.f124322b = i;
                        if (i == 0) {
                            str = "send";
                        } else if (i == 2) {
                            str = "read";
                        }
                        a.mo91358a(str);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo91367a(C19538ai aiVar) {
        if (aiVar == null) {
            mo91369c().setValue(null);
            return true;
        }
        if (mo91369c().getValue() != null) {
            C54266a value = mo91369c().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            if (C89219l.m154714a(aiVar, value.f124308b)) {
                C54266a value2 = mo91369c().getValue();
                if (value2 == null) {
                    C89219l.m154715b();
                }
                value2.mo91346a(aiVar);
                return false;
            }
        }
        mo91369c().setValue(new C54266a(aiVar, this.f124337b));
        return true;
    }

    public C54278a(AbstractC17434e eVar, C53709a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        this.f124336a = eVar;
        this.f124337b = aVar;
    }
}
