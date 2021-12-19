package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a;

import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67600b;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.a.e */
public final class C67598e extends C67593a {

    /* renamed from: i */
    public static final C67599a f151406i = new C67599a((byte) 0);

    /* renamed from: b */
    public String f151407b;

    /* renamed from: c */
    public Integer f151408c;

    /* renamed from: d */
    public Integer f151409d = -2;

    /* renamed from: e */
    public Integer f151410e;

    /* renamed from: f */
    public Integer f151411f;

    /* renamed from: g */
    public Integer f151412g;

    /* renamed from: h */
    public String f151413h;

    static {
        Covode.recordClassIndex(79237);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.l.a.a.e$a */
    public static final class C67599a {
        static {
            Covode.recordClassIndex(79238);
        }

        private C67599a() {
        }

        public /* synthetic */ C67599a(byte b) {
            this();
        }
    }

    public final String toString() {
        return "SearchChainStatus(status=" + this.f151411f + ", errorCode=" + this.f151412g + ", errorDesc=" + this.f151413h + ')';
    }

    /* renamed from: a */
    public final void mo106570a(Integer num) {
        if (this.f151408c == null) {
            this.f151408c = num;
            String str = num;
            if (num == null) {
                str = "";
            }
            mo106552a("request_type", str);
        }
    }

    /* renamed from: a */
    public final void mo106567a(int i) {
        this.f151411f = Integer.valueOf(i);
        HashMap<String, Object> hashMap = this.f151375a;
        Object obj = this.f151411f;
        if (obj == null) {
            obj = "";
        }
        hashMap.put("status", obj);
    }

    /* renamed from: b */
    public final void mo106573b(int i) {
        int i2;
        this.f151412g = Integer.valueOf(i);
        HashMap<String, Object> hashMap = this.f151375a;
        Integer num = this.f151412g;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        hashMap.put("error_code", Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo106571a(String str) {
        this.f151413h = str;
        HashMap<String, Object> hashMap = this.f151375a;
        String str2 = this.f151413h;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("error_desc", str2);
    }

    /* renamed from: a */
    public final void mo106572a(Throwable th) {
        C67592a.f151371d.mo106561b();
        C67600b.m119709a(this, th);
        Integer num = this.f151411f;
        if (num == null || num.intValue() != 0) {
            C2688c.m7778a(1, "SearchEventTrackerV2", "markThrowableStatus");
            C67592a.f151373f.mo106550a();
        }
    }

    /* renamed from: a */
    public final void mo106569a(int i, String str) {
        C89219l.m154721d(str, "");
        if (C67592a.f151371d.mo106563d()) {
            C2688c.m7778a(1, "SearchEventTrackerV2", "markCanceled: isFinishNetwork");
            C67592a.f151373f.mo106550a();
        } else {
            mo106568a(1, i, "cancel, from: ".concat(String.valueOf(str)));
        }
        C67592a.f151369b = true;
    }

    /* renamed from: a */
    public final void mo106568a(int i, int i2, String str) {
        C2688c.m7778a(1, "SearchEventTrackerV2", "mark: status = " + i + ", errorCode = " + i2 + ", errorDesc: " + str);
        mo106567a(i);
        mo106573b(i2);
        if (str == null) {
            str = "not define";
        }
        mo106571a(str);
        if (i != 0) {
            C67592a.f151373f.mo106550a();
        }
    }
}
