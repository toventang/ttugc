package com.p2082ss.android.ugc.aweme.comment.p2496j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p122a.C2541b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36542d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;

/* renamed from: com.ss.android.ugc.aweme.comment.j.k */
public final class C36514k extends C39101b<C36510i> {

    /* renamed from: a */
    public boolean f86460a;

    static {
        Covode.recordClassIndex(43817);
    }

    /* renamed from: f */
    private static boolean m74310f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final long mo63984d() {
        if (this.f92286h == null) {
            return 0;
        }
        return ((C36510i) this.f92286h).mo63982b();
    }

    /* renamed from: e */
    public final String mo63985e() {
        if (this.f92286h == null) {
            return "";
        }
        return ((C36510i) this.f92286h).f86444d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57528c() {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2496j.C36514k.mo57528c():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        return super.mo57616a(objArr);
    }

    /* renamed from: a */
    private static String m74309a(C36510i iVar) {
        if (iVar == null || iVar.mData == null || iVar.mData.logPd == null) {
            return null;
        }
        return iVar.mData.logPd.getImprId();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("CommentFetchPresenter: onFailed() => aid = ");
        String str3 = null;
        if (this.f92286h != null) {
            str3 = ((C36510i) this.f92286h).f86442b;
        }
        C51423a.m95791b(6, "CommentLog", sb.append(str3).append(" logPb: impr_id = ").append(m74309a((C36510i) this.f92286h)).append(" exceptionType = ").append(C16105a.m29902a(C17867d.m33078a(), exc)).append(" ").append(exc.getMessage()).toString());
        C2541b.m7435a(UGCMonitor.EVENT_COMMENT, "info", C16105a.m29902a(C17867d.m33078a(), exc));
        if (this.f92286h != null && ((C36510i) this.f92286h).mo63981a()) {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m74310f();
            }
            if (C58029j.f132256h) {
                String str4 = ((C36510i) this.f92286h).f86443c;
                String str5 = ((C36510i) this.f92286h).f86442b;
                long j = ((C36510i) this.f92286h).f86446f;
                String str6 = "";
                Class<?> cls = exc.getClass();
                if (cls == null || (str = cls.getName()) == null) {
                    str = str6;
                }
                Throwable cause = exc.getCause();
                if (!((cause == null || (str2 = cause.getMessage()) == null) && (str2 = exc.getMessage()) == null)) {
                    str6 = str2;
                }
                C36542d.C36543a.m74397a(str4, str5, j, 201, str, str6);
            }
        }
        this.f86460a = true;
        super.mo57526a_(exc);
        exc.printStackTrace();
    }
}
