package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.C50580b;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.b */
public final class C50585b extends AbstractC50584a {

    /* renamed from: a */
    public static final C50586a f116896a = new C50586a((byte) 0);

    static {
        Covode.recordClassIndex(59741);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abnor_im";
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.b$a */
    public static final class C50586a {
        static {
            Covode.recordClassIndex(59742);
        }

        private C50586a() {
        }

        public /* synthetic */ C50586a(byte b) {
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
        List<C67212c> a = C50580b.m94818a("message_send_fail", currentTimeMillis);
        List<C67212c> a2 = C50580b.m94818a("message_self_visiable", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        arrayList.addAll(a2);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((C67212c) arrayList.get(i)).f150639d);
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1082517890) {
            if (hashCode == 171840317 && str.equals("message_send_fail")) {
                return true;
            }
            return false;
        } else if (str.equals("message_self_visiable")) {
            return true;
        } else {
            return false;
        }
    }
}
