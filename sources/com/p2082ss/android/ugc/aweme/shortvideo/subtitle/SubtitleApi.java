package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22006n;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi */
public interface SubtitleApi {
    static {
        Covode.recordClassIndex(85915);
    }

    @AbstractC22012t(mo35799a = "/tiktok/v1/videocaption/feedback/")
    @AbstractC22006n(mo35795a = {"Content-Type: application/json"})
    C1731i<Object> feedback(@AbstractC22018z(mo35807a = "vid") String str, @AbstractC22018z(mo35807a = "aweme_id") String str2, @AbstractC22018z(mo35807a = "task_id") String str3, @AbstractC21994b C73231j jVar);

    @AbstractC22000h(mo35789a = "/tiktok/v1/videocaption/query/")
    AbstractC21983b<C73265s> query(@AbstractC22018z(mo35807a = "task_id") String str);

    @AbstractC22012t(mo35799a = "/tiktok/v1/videocaption/submit/")
    AbstractC21983b<C73265s> submit(@AbstractC22018z(mo35807a = "tos_key") String str, @AbstractC22018z(mo35807a = "max_lines") int i, @AbstractC22018z(mo35807a = "words_per_line") int i2);
}
