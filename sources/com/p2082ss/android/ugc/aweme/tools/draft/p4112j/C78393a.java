package com.p2082ss.android.ugc.aweme.tools.draft.p4112j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.AbstractC43215m;
import com.p2082ss.android.ugc.aweme.draft.AbstractC43239n;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63276d;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63277e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.C78133ai;
import com.p2082ss.android.ugc.aweme.tools.draft.p4110h.C78384c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.j.a */
public final class C78393a implements AbstractC63275c {

    /* renamed from: a */
    private final AbstractC89244h f176133a = C89250i.m154773a((AbstractC89171a) C78395b.f176138a);

    /* renamed from: b */
    private final AbstractC89244h f176134b = C89250i.m154773a((AbstractC89171a) C78394a.f176137a);

    /* renamed from: c */
    private boolean f176135c = true;

    /* renamed from: d */
    private final List<AbstractC43239n> f176136d = new ArrayList();

    static {
        Covode.recordClassIndex(91519);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: a */
    public final AbstractC63277e mo101843a() {
        return (AbstractC63277e) this.f176133a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: b */
    public final AbstractC63276d mo101847b() {
        return (AbstractC63276d) this.f176134b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: d */
    public final boolean mo101852d() {
        return this.f176135c;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.j.a$a */
    static final class C78394a extends AbstractC89220m implements AbstractC89171a<C78396b> {

        /* renamed from: a */
        public static final C78394a f176137a = new C78394a();

        static {
            Covode.recordClassIndex(91520);
        }

        C78394a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78396b invoke() {
            return new C78396b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.j.a$b */
    static final class C78395b extends AbstractC89220m implements AbstractC89171a<C78384c> {

        /* renamed from: a */
        public static final C78395b f176138a = new C78395b();

        static {
            Covode.recordClassIndex(91521);
        }

        C78395b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C78384c invoke() {
            return new C78384c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: c */
    public final List<C43223c> mo101850c() {
        List<C43223c> a = C78133ai.m136600a().mo122065a((AbstractC43215m) null);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: a */
    public final void mo101846a(boolean z) {
        this.f176135c = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: b */
    public final VideoPublishEditModel mo101848b(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        new C70974bn("DraftInternalService");
        VideoPublishEditModel a = C70974bn.m125289a(cVar);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: c */
    public final void mo101851c(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C78397c.m136927a().notifyDraftUpdate(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: a */
    public final DraftDBSaveResult mo101842a(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        DraftDBSaveResult a = C78133ai.m136600a().mo122064a(cVar);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: a */
    public final void mo101845a(AbstractC43239n nVar) {
        C89219l.m154721d(nVar, "");
        if (!this.f176136d.contains(nVar)) {
            this.f176136d.add(nVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: a */
    public final int mo101841a(C43223c cVar, String str) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        return C78133ai.m136600a().mo122063a(cVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: b */
    public final VideoPublishEditModel mo101849b(C43223c cVar, String str) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        new C70974bn(str);
        VideoPublishEditModel a = C70974bn.m125289a(cVar);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c
    /* renamed from: a */
    public final void mo101844a(C43223c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        Iterator<T> it = this.f176136d.iterator();
        while (it.hasNext()) {
            it.next().mo69463a(cVar, z);
        }
    }
}
