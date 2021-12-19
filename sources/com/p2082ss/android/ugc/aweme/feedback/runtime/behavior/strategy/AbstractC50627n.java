package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.C50580b;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.n */
public abstract class AbstractC50627n extends AbstractC50584a {

    /* renamed from: a */
    public static final C50628a f116933a = new C50628a((byte) 0);

    static {
        Covode.recordClassIndex(59783);
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.n$a */
    public static final class C50628a {
        static {
            Covode.recordClassIndex(59784);
        }

        private C50628a() {
        }

        public /* synthetic */ C50628a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: b */
    public final long mo85930b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: d */
    public final List<AwemeToolFeedbackInfo> mo85943d() {
        long currentTimeMillis = System.currentTimeMillis() - mo85930b();
        List<C67212c> a = C50580b.m94818a("record_start", currentTimeMillis);
        List<C67212c> a2 = C50580b.m94818a("record_error", currentTimeMillis);
        List<C67212c> a3 = C50580b.m94818a("record_success", currentTimeMillis);
        List<C67212c> a4 = C50580b.m94818a("camera_start", currentTimeMillis);
        List<C67212c> a5 = C50580b.m94818a("camera_error", currentTimeMillis);
        List<C67212c> a6 = C50580b.m94818a("camera_success", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new AwemeToolFeedbackECode(it.next().f150639d, null, 2, null));
        }
        arrayList.add(new AwemeToolFeedbackInfo("record", a.size(), a3.size(), 0, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it2 = a5.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new AwemeToolFeedbackECode(it2.next().f150639d, null, 2, null));
        }
        arrayList.add(new AwemeToolFeedbackInfo("camera start", a4.size(), a6.size(), 0, arrayList3));
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        switch (str.hashCode()) {
            case -2122358630:
                if (str.equals("record_error")) {
                    return true;
                }
                return false;
            case -2109385996:
                if (str.equals("record_start")) {
                    return true;
                }
                return false;
            case -785402647:
                if (str.equals("camera_success")) {
                    return true;
                }
                return false;
            case -603764626:
                if (str.equals("camera_error")) {
                    return true;
                }
                return false;
            case -590791992:
                if (str.equals("camera_start")) {
                    return true;
                }
                return false;
            case 134640149:
                if (str.equals("record_success")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
