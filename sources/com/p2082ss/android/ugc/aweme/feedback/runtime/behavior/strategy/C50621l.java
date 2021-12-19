package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50597i;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89376n;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.l */
public final class C50621l extends AbstractC50597i {

    /* renamed from: b */
    public static final C50622a f116930b = new C50622a((byte) 0);

    static {
        Covode.recordClassIndex(59777);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abnor_upload";
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.l$a */
    public static final class C50622a {
        static {
            Covode.recordClassIndex(59778);
        }

        private C50622a() {
        }

        public /* synthetic */ C50622a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        AwemeToolFeedbackECode awemeToolFeedbackECode;
        List<AbstractC50597i.C50600c> e = mo85933e();
        if (e.isEmpty()) {
            return "";
        }
        int size = e.size();
        ArrayList arrayList = new ArrayList();
        for (T t : e) {
            if (C89219l.m154714a(t.f116909f, AbstractC50597i.C50600c.AbstractC50601a.C50607c.f116917b)) {
                arrayList.add(t);
            }
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : e) {
            if (C89219l.m154714a(t2.f116909f, AbstractC50597i.C50600c.AbstractC50601a.C50602a.f116912b)) {
                arrayList2.add(t2);
            }
        }
        int size3 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (T t3 : e) {
            if (t3.f116909f instanceof AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b) {
                arrayList3.add(t3);
            }
        }
        ArrayList<AbstractC50597i.C50600c> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) arrayList4, 10));
        for (AbstractC50597i.C50600c cVar : arrayList4) {
            AbstractC50597i.C50600c.AbstractC50601a aVar = cVar.f116909f;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.PublishBaseStrategy.OncePublish.Type.Failed");
            AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b bVar = (AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b) aVar;
            if (bVar instanceof AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50604a) {
                AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50604a aVar2 = (AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50604a) bVar;
                awemeToolFeedbackECode = new AwemeToolFeedbackECode(aVar2.f116913b, aVar2.f116914c);
            } else if (bVar instanceof AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50606c) {
                awemeToolFeedbackECode = new AwemeToolFeedbackECode("LO", ((AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50606c) bVar).f116916b);
            } else if (bVar instanceof AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50605b) {
                awemeToolFeedbackECode = new AwemeToolFeedbackECode(((AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50605b) bVar).f116915b, "EX");
            } else {
                throw new C89376n();
            }
            arrayList5.add(awemeToolFeedbackECode);
        }
        String b = C80342dg.m139300a().mo46674b(C89070n.m154516a(new AwemeToolFeedbackInfo("Publish", size, size2, size3, arrayList5)));
        C89219l.m154716b(b, "");
        return b;
    }
}
