package com.p2082ss.android.ugc.aweme.music.search;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.music.api.AbstractC60334b;
import com.p2082ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.p2082ss.android.ugc.aweme.music.model.OriginalMusicList;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.search.q */
public final class C61055q implements AbstractC12644a<AbstractC61057r> {

    /* renamed from: a */
    public final AbstractC61057r f138538a = new C61056a();

    static {
        Covode.recordClassIndex(71646);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.q$a */
    public static final class C61056a implements AbstractC61057r {
        static {
            Covode.recordClassIndex(71647);
        }

        C61056a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.api.AbstractC60334b
        /* renamed from: a */
        public final AbstractC88979t<BaseResponse> mo98018a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return AbstractC60334b.C60335a.m110050a(str, str2);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.api.AbstractC60334b
        /* renamed from: b */
        public final AbstractC88979t<BaseResponse> mo98019b(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return AbstractC60334b.C60335a.m110051b(str, str2);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.search.AbstractC61057r
        /* renamed from: a */
        public final OriginalMusicList mo98576a(String str, String str2, int i, int i2) {
            return MusicAwemeApi.f137506a.searchMusicList(str, str2, i, i2).get();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC61057r mo20458a() {
        return this.f138538a;
    }
}
