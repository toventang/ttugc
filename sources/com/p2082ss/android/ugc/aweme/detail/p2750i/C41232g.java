package com.p2082ss.android.ugc.aweme.detail.p2750i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.detail.api.DetailApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.i.g */
public final class C41232g extends AbstractC39085b<Aweme> {
    static {
        Covode.recordClassIndex(49115);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.i.g$a */
    static final class CallableC41233a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f96347a;

        /* renamed from: b */
        final /* synthetic */ String f96348b;

        static {
            Covode.recordClassIndex(49116);
        }

        CallableC41233a(String str, String str2) {
            this.f96347a = str;
            this.f96348b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return GsonHolder.m138943c().mo123620b().mo46670a(new JSONObject((String) DetailApi.f96100a.queryAwemeFromInbox(this.f96347a, this.f96348b).execute().f52262b).optString("data"), Aweme.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC41233a((String) objArr[0], (String) objArr[1]), 0);
        return true;
    }
}
