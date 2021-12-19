package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50597i;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.j */
public final class C50615j extends AbstractC50597i {

    /* renamed from: b */
    public static final C50616a f116927b = new C50616a((byte) 0);

    /* renamed from: c */
    private int f116928c = -1;

    static {
        Covode.recordClassIndex(59771);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "publish_log";
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.j$a */
    public static final class C50616a {
        static {
            Covode.recordClassIndex(59772);
        }

        private C50616a() {
        }

        public /* synthetic */ C50616a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        ArrayList arrayList;
        String str;
        if (this.f116928c <= 0) {
            this.f116928c = SettingsManager.m29616a().mo25394a("publish_log_max_length", 500);
        }
        if (this.f116928c <= 0) {
            return "Null maxTextLength:" + this.f116928c;
        }
        AbstractC50597i.C50612d d = mo85932d();
        List<AbstractC50597i.C50600c> list = d.f116922a;
        List d2 = C89070n.m154573d(C89070n.m154572d((Collection) d.f116924c, (Iterable) d.f116925d), 4);
        ArrayList<AbstractC50597i.C50600c> arrayList2 = new ArrayList(C89070n.m154526a((Iterable) d2, 10));
        int i = 0;
        for (Object obj : d2) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            AbstractC50597i.C50600c cVar = (AbstractC50597i.C50600c) obj;
            cVar.mo85935a(i);
            arrayList2.add(cVar);
            i = i2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (AbstractC50597i.C50600c cVar2 : arrayList2) {
            C89070n.m154535a((Collection) arrayList3, (Iterable) cVar2.f116910g);
        }
        List g = C89070n.m154585g((Collection) arrayList3);
        if (this.f116928c > 500) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C89070n.m154535a((Collection) arrayList4, (Iterable) it.next().f116910g);
            }
            arrayList = arrayList4;
        } else {
            arrayList = C89086z.INSTANCE;
        }
        g.addAll(arrayList);
        List a = C89070n.m154553a((Iterable) g, (Comparator) new C50617b());
        ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        Iterator it2 = a.iterator();
        while (true) {
            str = "";
            if (!it2.hasNext()) {
                break;
            }
            PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) it2.next();
            String str2 = C89361p.m154870a((CharSequence) publishBehaviorModel.code) ? str : " " + publishBehaviorModel.code;
            if (!C89361p.m154870a((CharSequence) publishBehaviorModel.info)) {
                str = " " + publishBehaviorModel.info;
            }
            arrayList5.add(publishBehaviorModel.getSimpleTime() + ' ' + publishBehaviorModel.idIndex + ' ' + publishBehaviorModel.stage + ' ' + publishBehaviorModel.type.getSimpleName() + str2 + str);
        }
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            str = str + '|' + ((String) it3.next());
        }
        return C89361p.m154824c(str, this.f116928c);
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.j$b */
    public static final class C50617b<T> implements Comparator {
        static {
            Covode.recordClassIndex(59773);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t2.timeStamp), Long.valueOf(t.timeStamp));
        }
    }
}
