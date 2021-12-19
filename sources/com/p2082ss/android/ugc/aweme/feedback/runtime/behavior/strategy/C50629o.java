package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.o */
public final class C50629o extends AbstractC50627n {
    static {
        Covode.recordClassIndex(59785);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abnor_read_record";
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        List<AwemeToolFeedbackInfo> d = mo85943d();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) d, 10));
        for (T t : d) {
            String str = "";
            if (!t.getECode().isEmpty()) {
                StringBuilder sb = new StringBuilder("(");
                List<AwemeToolFeedbackECode> eCode = t.getECode();
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) eCode, 10));
                for (T t2 : eCode) {
                    String stage = t2.getStage();
                    arrayList2.add(((stage == null || stage.length() == 0) ? str : t2.getStage() + ':') + t2.getCode());
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = ((String) next) + ';' + ((String) it.next());
                    }
                    str = sb.append((String) next).append(')').toString();
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            arrayList.add("[" + t.getName() + ':' + t.getCount() + ' ' + t.getSuccessCount() + "Success|" + t.getCancelCount() + "Cancel|" + t.getECode().size() + "Failed" + str + ']');
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            while (it2.hasNext()) {
                next2 = ((String) next2) + ((String) it2.next());
            }
            return (String) next2;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
