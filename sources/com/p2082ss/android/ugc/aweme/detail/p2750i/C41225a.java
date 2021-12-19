package com.p2082ss.android.ugc.aweme.detail.p2750i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.detail.api.DetailApi;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41128a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.detail.i.a */
public final class C41225a extends AbstractC39085b<C41128a> {

    /* renamed from: a */
    public int f96340a;

    static {
        Covode.recordClassIndex(49108);
    }

    public C41225a(int i) {
        this.f96340a = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2750i.C41225a.CallableC412261 */

            static {
                Covode.recordClassIndex(49109);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                Object[] objArr = objArr;
                String str2 = "";
                if (objArr.length <= 1 || objArr[1] == null) {
                    str = str2;
                } else {
                    str = (String) objArr[1];
                }
                if (objArr.length > 2 && objArr[2] != null) {
                    str2 = (String) objArr[2];
                }
                return DetailApi.m82808a((String) objArr[0], str, str2, 0);
            }
        }, 0);
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(C41128a aVar) {
        C41128a aVar2 = aVar;
        if (aVar2 == null || aVar2.f96125a == null) {
            C51423a.m95784a(6, "BatchDetailModel", "data is null or items null!");
            return;
        }
        super.handleData(aVar2);
        int size = aVar2.f96125a.size();
        for (int i = 0; i < size; i++) {
            Aweme a = AwemeService.m70060b().mo60677a(aVar2.f96125a.get(i));
            String str = aVar2.f96126b;
            if (TextUtils.isEmpty(str) && aVar2.f96127c != null) {
                str = aVar2.f96127c.getImprId();
            }
            RequestIdService.m70076a().mo60694a(a.getAid() + this.f96340a, str, i);
            aVar2.f96125a.set(i, a);
        }
    }
}
