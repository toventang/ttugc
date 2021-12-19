package com.p2082ss.android.ugc.aweme.music.assem.list;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.music.api.AbstractC60334b;
import com.p2082ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.p2082ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.q */
public final class C60619q implements AbstractC12644a<AbstractC60621r> {

    /* renamed from: a */
    public final AbstractC60621r f137835a = new C60620a();

    static {
        Covode.recordClassIndex(71173);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.q$a */
    public static final class C60620a implements AbstractC60621r {
        static {
            Covode.recordClassIndex(71174);
        }

        C60620a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60621r
        /* renamed from: a */
        public final PinnedMusicList mo98117a(String str) {
            return MusicAwemeApi.f137506a.getPinnedMusicList(str).get();
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

        @Override // com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60621r
        /* renamed from: a */
        public final OriginalMusicList mo98116a(String str, String str2, int i, int i2) {
            return MusicAwemeApi.m110046a(str, str2, i, i2);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC60621r mo20458a() {
        return this.f137835a;
    }
}
