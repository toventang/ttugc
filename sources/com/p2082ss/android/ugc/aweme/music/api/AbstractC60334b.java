package com.p2082ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.music.api.PinApi;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.api.b */
public interface AbstractC60334b {
    static {
        Covode.recordClassIndex(70881);
    }

    /* renamed from: a */
    AbstractC88979t<BaseResponse> mo98018a(String str, String str2);

    /* renamed from: b */
    AbstractC88979t<BaseResponse> mo98019b(String str, String str2);

    /* renamed from: com.ss.android.ugc.aweme.music.api.b$a */
    public static final class C60335a {
        static {
            Covode.recordClassIndex(70882);
        }

        /* renamed from: a */
        public static AbstractC88979t<BaseResponse> m110050a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return PinApi.C60332a.m110047a().pinMusic(str, str2);
        }

        /* renamed from: b */
        public static AbstractC88979t<BaseResponse> m110051b(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return PinApi.C60332a.m110047a().unpinMusic(str, str2);
        }
    }
}
