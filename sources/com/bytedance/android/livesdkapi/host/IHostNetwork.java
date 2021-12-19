package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.C2959a;
import com.bytedance.android.livesdkapi.model.AbstractC11837c;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.android.livesdkapi.p702ws.AbstractC11884a;
import com.bytedance.android.livesdkapi.p702ws.AbstractC11887d;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface IHostNetwork extends AbstractC2953a {
    static {
        Covode.recordClassIndex(13483);
    }

    AbstractC11837c<C11835a> downloadFile(boolean z, int i, String str, List<C2959a> list, Object obj);

    AbstractC11837c<C11835a> get(String str, List<C2959a> list, Object obj);

    Map<String, String> getCommonParams();

    String getHostDomain();

    AbstractC11837c<C11835a> post(String str, List<C2959a> list, String str2, byte[] bArr, Object obj);

    AbstractC11884a registerWsChannel(Context context, String str, Map<String, String> map, AbstractC11887d dVar);

    AbstractC11837c<C11835a> uploadFile(int i, String str, List<C2959a> list, String str2, byte[] bArr, long j, String str3);
}
