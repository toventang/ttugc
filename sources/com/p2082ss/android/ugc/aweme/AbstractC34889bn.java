package com.p2082ss.android.ugc.aweme;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.bn */
public interface AbstractC34889bn {

    /* renamed from: a */
    public static final C34890a f82338a = C34890a.f82339a;

    static {
        Covode.recordClassIndex(41900);
    }

    void fetchLoginHistoryState(AbstractC1204m mVar, AbstractC89172b<? super Integer, C89391z> bVar);

    String getLatestLoginMethodName();

    boolean getSaveLoginStatus();

    boolean isCurrentMethodAvaliable();

    boolean isOneKeyLoginExprimentEnable();

    boolean isTrustedEnvLoginFreshInstallEnable();

    void updateLoginHistoryState(int i, AbstractC89172b<? super Integer, C89391z> bVar);

    void updateMethodInfo(String str, Object... objArr);

    /* renamed from: com.ss.android.ugc.aweme.bn$a */
    public static final class C34890a {

        /* renamed from: a */
        static final /* synthetic */ C34890a f82339a = new C34890a();

        private C34890a() {
        }

        static {
            Covode.recordClassIndex(41901);
        }
    }
}
