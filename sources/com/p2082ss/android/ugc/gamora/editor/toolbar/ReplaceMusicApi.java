package com.p2082ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicApi */
public final class ReplaceMusicApi {

    /* renamed from: a */
    public static final C83121a f185732a = new C83121a((byte) 0);

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(97000);
        }

        @AbstractC89731o(mo144285a = "tiktok/video/music/edit/v1/")
        @AbstractC89721e
        AbstractC21983b<BaseResponse> get(@AbstractC89719c(mo144273a = "item_id") String str, @AbstractC89719c(mo144273a = "original_vid") String str2, @AbstractC89719c(mo144273a = "new_music_info") String str3);
    }

    static {
        Covode.recordClassIndex(96999);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicApi$a */
    public static final class C83121a {
        static {
            Covode.recordClassIndex(97001);
        }

        private C83121a() {
        }

        public /* synthetic */ C83121a(byte b) {
            this();
        }
    }
}
