package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.C50580b;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.e */
public final class C50590e extends AbstractC50584a {

    /* renamed from: a */
    public static final C50591a f116898a = new C50591a((byte) 0);

    static {
        Covode.recordClassIndex(59746);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abor_draft_operation";
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.e$a */
    public static final class C50591a {
        static {
            Covode.recordClassIndex(59747);
        }

        private C50591a() {
        }

        public /* synthetic */ C50591a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: b */
    public final long mo85930b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        long currentTimeMillis = System.currentTimeMillis() - mo85930b();
        List<C67212c> a = C50580b.m94818a("draft_load_success", currentTimeMillis);
        List<C67212c> a2 = C50580b.m94818a("draft_load_error", currentTimeMillis);
        List<C67212c> a3 = C50580b.m94818a("draft_save_success", currentTimeMillis);
        List<C67212c> a4 = C50580b.m94818a("draft_save_error", currentTimeMillis);
        List<C67212c> a5 = C50580b.m94818a("draft_delete_success", currentTimeMillis);
        List<C67212c> a6 = C50580b.m94818a("draft_delete_error", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new DraftOperationCode(it.next().f150639d));
        }
        arrayList.add(new DraftOperationLog("draft_load", linkedHashSet.size() + a.size(), C89070n.m154590j(linkedHashSet), a.size()));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator<T> it2 = a4.iterator();
        while (it2.hasNext()) {
            linkedHashSet2.add(new DraftOperationCode(it2.next().f150639d));
        }
        arrayList.add(new DraftOperationLog("draft_save", a3.size() + linkedHashSet2.size(), C89070n.m154590j(linkedHashSet2), a3.size()));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator<T> it3 = a6.iterator();
        while (it3.hasNext()) {
            linkedHashSet3.add(new DraftOperationCode(it3.next().f150639d));
        }
        arrayList.add(new DraftOperationLog("draft_delete", a5.size() + linkedHashSet3.size(), C89070n.m154590j(linkedHashSet3), a5.size()));
        GsonProvider c = GsonHolder.m138943c();
        C89219l.m154716b(c, "");
        String b = c.mo123620b().mo46674b(arrayList);
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        switch (str.hashCode()) {
            case -2112523571:
                if (str.equals("draft_load_error")) {
                    return true;
                }
                return false;
            case -1144329134:
                if (str.equals("draft_delete_error")) {
                    return true;
                }
                return false;
            case -826777052:
                if (str.equals("draft_save_error")) {
                    return true;
                }
                return false;
            case -576852019:
                if (str.equals("draft_delete_success")) {
                    return true;
                }
                return false;
            case -351979233:
                if (str.equals("draft_save_success")) {
                    return true;
                }
                return false;
            case 996197256:
                if (str.equals("draft_load_success")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
