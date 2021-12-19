package com.p2082ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.profile.api.BlockApi */
public final class BlockApi {

    /* renamed from: a */
    private static final BlockService f144002a = ((BlockService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(BlockService.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.BlockApi$BlockService */
    public interface BlockService {
        static {
            Covode.recordClassIndex(74723);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/user/block/")
        AbstractC21983b<BlockStruct> block(@AbstractC22018z(mo35807a = "user_id") String str, @AbstractC22018z(mo35807a = "sec_user_id") String str2, @AbstractC22018z(mo35807a = "block_type") int i, @AbstractC22018z(mo35807a = "source") int i2);
    }

    static {
        Covode.recordClassIndex(74722);
    }

    /* renamed from: a */
    public static BlockStruct m115011a(String str, String str2, int i, int i2) {
        return f144002a.block(str, str2, i, i2).execute().f52262b;
    }

    /* renamed from: a */
    public static void m115012a(Handler handler, String str, String str2, int i, int i2) {
        int i3;
        C34608n a = C34608n.m70658a();
        CallableC63428b bVar = new CallableC63428b(str, str2, i, i2);
        if (i2 == 1) {
            i3 = 32;
        } else {
            i3 = 31;
        }
        a.mo61083a(handler, bVar, i3);
    }
}
