package com.p2082ss.android.ugc.aweme.comment.p2499m;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.m.d */
public final class C36542d {

    /* renamed from: c */
    public static int f86522c;

    /* renamed from: d */
    public static long f86523d;

    /* renamed from: e */
    public static final C36543a f86524e = new C36543a((byte) 0);

    /* renamed from: a */
    public final ConcurrentHashMap<String, String> f86525a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public long f86526b;

    static {
        Covode.recordClassIndex(43845);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.m.d$a */
    public static final class C36543a {
        static {
            Covode.recordClassIndex(43846);
        }

        private C36543a() {
        }

        public /* synthetic */ C36543a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m74397a(String str, String str2, long j, int i, String str3, String str4) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("unexpectedType", String.valueOf(i));
                HashMap hashMap2 = new HashMap();
                if (str != null) {
                    if (str.length() != 0) {
                        hashMap2.put("MethodName", str);
                    }
                }
                if (!(str2 == null || str2.length() == 0)) {
                    hashMap2.put("GroupId", str2);
                }
                hashMap2.put("expectedCount", String.valueOf(j));
                if (str3.length() > 0) {
                    hashMap2.put("errorType", str3);
                }
                if (str4.length() > 0) {
                    hashMap2.put("errorDescription", str4);
                }
                C12290b.m22066a("aweme_comment_list_unexpected", new JSONObject(C89041ag.m154429c(hashMap)), (JSONObject) null, new JSONObject(C89041ag.m154429c(hashMap2)));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo64007a() {
        this.f86525a.clear();
        long currentTimeMillis = System.currentTimeMillis();
        this.f86526b = currentTimeMillis;
        this.f86525a.put("TimeStamp", String.valueOf(currentTimeMillis));
    }

    /* renamed from: a */
    public final void mo64008a(BaseResponse baseResponse) {
        LogPbBean logPbBean;
        String imprId;
        C89219l.m154721d(baseResponse, "");
        if (!(!(baseResponse instanceof BaseCommentResponse) || (logPbBean = ((BaseCommentResponse) baseResponse).logPd) == null || (imprId = logPbBean.getImprId()) == null)) {
            this.f86525a.put("LogID", imprId);
        }
        this.f86525a.put("ErrorCode", String.valueOf(baseResponse.status_code));
    }

    /* renamed from: a */
    public static final void m74393a(int i, long j) {
        f86522c = i;
        f86523d = j;
    }
}
