package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.C50580b;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f */
public final class C50592f extends AbstractC50584a {

    /* renamed from: a */
    private final String f116899a = "follow_user";

    /* renamed from: b */
    private final String f116900b = "unfollow_user";

    static {
        Covode.recordClassIndex(59748);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abnor_follow";
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
        List<C67212c> a = C50580b.m94818a(this.f116899a, currentTimeMillis);
        List<C67212c> a2 = C50580b.m94818a(this.f116900b, currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!a.isEmpty()) {
            sb.append("FollowError: " + a.size() + "(ECode:");
            Iterator<C67212c> it = a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().f150639d + ',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        if (!a2.isEmpty()) {
            sb.append("UnFollowError: " + a2.size() + "(ECode:");
            Iterator<C67212c> it2 = a2.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().f150639d + ',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) this.f116899a) || C89219l.m154714a((Object) str, (Object) this.f116900b)) {
            return true;
        }
        return false;
    }
}
