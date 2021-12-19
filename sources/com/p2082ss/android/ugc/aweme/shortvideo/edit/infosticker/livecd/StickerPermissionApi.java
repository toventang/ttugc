package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionApi */
public interface StickerPermissionApi {

    /* renamed from: a */
    public static final C71371a f159949a = C71371a.f159951b;

    static {
        Covode.recordClassIndex(83896);
    }

    @AbstractC22000h(mo35789a = "tiktok/v1/sticker/permission/")
    AbstractC88979t<StickerPermissionResponse> getStickerPermission();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionApi$a */
    public static final class C71371a {

        /* renamed from: a */
        public static final String f159950a;

        /* renamed from: b */
        static final /* synthetic */ C71371a f159951b = new C71371a();

        private C71371a() {
        }

        static {
            Covode.recordClassIndex(83897);
            AVApi b = AVApiImpl.m123134b();
            C89219l.m154716b(b, "");
            f159950a = b.mo109850a();
        }
    }
}
