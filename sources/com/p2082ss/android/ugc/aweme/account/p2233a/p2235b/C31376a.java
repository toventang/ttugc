package com.p2082ss.android.ugc.aweme.account.p2233a.p2235b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.a.b.a */
public final class C31376a {

    /* renamed from: a */
    public Map<String, String> f75156a = new HashMap();

    static {
        Covode.recordClassIndex(38084);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.a.b.a$a */
    public interface AbstractC31377a {

        /* renamed from: a */
        public static final AbstractC31377a f75157a = new AbstractC31377a() {
            /* class com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a.AbstractC31377a.C313781 */

            static {
                Covode.recordClassIndex(38086);
            }

            @Override // com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a.AbstractC31377a
            /* renamed from: a */
            public final String mo57400a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final AbstractC31377a f75158b = new AbstractC31377a() {
            /* class com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a.AbstractC31377a.C313792 */

            static {
                Covode.recordClassIndex(38087);
            }

            @Override // com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a.AbstractC31377a
            /* renamed from: a */
            public final String mo57400a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo57400a(String str);

        static {
            Covode.recordClassIndex(38085);
        }
    }

    /* renamed from: a */
    public final C31376a mo57399a(String str, String str2) {
        return m65598a(str, str2, AbstractC31377a.f75157a);
    }

    /* renamed from: a */
    public final C31376a mo57397a(String str, int i) {
        return m65598a(str, String.valueOf(i), AbstractC31377a.f75157a);
    }

    /* renamed from: a */
    public final C31376a mo57398a(String str, long j) {
        return m65598a(str, String.valueOf(j), AbstractC31377a.f75157a);
    }

    /* renamed from: a */
    private C31376a m65598a(String str, String str2, AbstractC31377a aVar) {
        this.f75156a.put(str, aVar.mo57400a(str2));
        return this;
    }
}
