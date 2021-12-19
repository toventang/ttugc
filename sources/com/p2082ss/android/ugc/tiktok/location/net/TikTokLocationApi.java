package com.p2082ss.android.ugc.tiktok.location.net;

import android.text.TextUtils;
import com.bytedance.bdlocation.p850e.AbstractC13168a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.location.net.TikTokLocationApi */
public final class TikTokLocationApi implements AbstractC13168a {

    /* renamed from: a */
    public static final TikTokLocationApi f188570a = new TikTokLocationApi();

    /* renamed from: com.ss.android.ugc.tiktok.location.net.TikTokLocationApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(98266);
        }

        @AbstractC22012t
        AbstractC21983b<String> doPostJson(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21984a boolean z);
    }

    private TikTokLocationApi() {
    }

    static {
        Covode.recordClassIndex(98265);
    }

    @Override // com.bytedance.bdlocation.p850e.AbstractC13168a
    /* renamed from: a */
    public final String mo21274a(String str, String str2, Map<String, String> map, TypedOutput typedOutput, List<C22027b> list, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C51423a.m95792b("TikTokLocationApi", "baseUrl or relativePath is null or empty");
            return null;
        }
        if (str == null) {
            try {
                C89219l.m154715b();
            } catch (Exception e) {
                e.printStackTrace();
                C51423a.m95790a((Throwable) e);
                return null;
            }
        }
        Object a = RetrofitFactory.m33635a().mo28816a(str).mo28858a(RealApi.class);
        C89219l.m154716b(a, "");
        RealApi realApi = (RealApi) a;
        if (str2 == null) {
            C89219l.m154715b();
        }
        return realApi.doPostJson(-1, str2, map, typedOutput, list, z).execute().f52262b;
    }
}
