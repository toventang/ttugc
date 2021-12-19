package com.p2082ss.android.socialbase.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22001i;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import java.util.List;

/* renamed from: com.ss.android.socialbase.ttnet.IDownloadApi */
public interface IDownloadApi {
    static {
        Covode.recordClassIndex(37152);
    }

    @AbstractC22000h
    @AbstractC21991ae
    AbstractC21983b<TypedInput> get(@AbstractC21984a boolean z, @AbstractC21993ag String str, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC21991ae
    @AbstractC22001i
    AbstractC21983b<Void> head(@AbstractC21984a boolean z, @AbstractC21993ag String str, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);
}
