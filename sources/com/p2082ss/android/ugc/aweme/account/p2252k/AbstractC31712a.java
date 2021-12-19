package com.p2082ss.android.ugc.aweme.account.p2252k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.k.a */
public abstract class AbstractC31712a {

    /* renamed from: a */
    protected final String f75853a;

    /* renamed from: b */
    private final Map<String, String> f75854b = new HashMap();

    /* renamed from: c */
    private boolean f75855c = false;

    /* renamed from: d */
    private Map<String, String> f75856d = new HashMap();

    static {
        Covode.recordClassIndex(38446);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo57685b();

    /* renamed from: com.ss.android.ugc.aweme.account.k.a$a */
    public interface AbstractC31713a {

        /* renamed from: a */
        public static final AbstractC31713a f75857a = new AbstractC31713a() {
            /* class com.p2082ss.android.ugc.aweme.account.p2252k.AbstractC31712a.AbstractC31713a.C317141 */

            static {
                Covode.recordClassIndex(38448);
            }

            @Override // com.p2082ss.android.ugc.aweme.account.p2252k.AbstractC31712a.AbstractC31713a
            /* renamed from: a */
            public final String mo57687a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final AbstractC31713a f75858b = new AbstractC31713a() {
            /* class com.p2082ss.android.ugc.aweme.account.p2252k.AbstractC31712a.AbstractC31713a.C317152 */

            static {
                Covode.recordClassIndex(38449);
            }

            @Override // com.p2082ss.android.ugc.aweme.account.p2252k.AbstractC31712a.AbstractC31713a
            /* renamed from: a */
            public final String mo57687a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo57687a(String str);

        static {
            Covode.recordClassIndex(38447);
        }
    }

    /* renamed from: a */
    public final void mo57683a() {
        mo57685b();
        this.f75854b.putAll(this.f75856d);
        C29339a.m58752a(new RunnableC31716b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo57686c() {
        try {
            if (this.f75855c) {
                C29819a.m60077a(this.f75853a, C31717c.m66046a(this.f75854b));
                return;
            }
            C39161q.m79451a(this.f75853a, this.f75854b);
        } catch (Throwable unused) {
        }
    }

    AbstractC31712a(String str) {
        this.f75853a = str;
    }

    /* renamed from: a */
    public final void mo57684a(String str, String str2, AbstractC31713a aVar) {
        this.f75854b.put(str, aVar.mo57687a(str2));
    }
}
