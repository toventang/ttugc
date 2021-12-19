package com.p2082ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi */
public interface GifEmojiApi {

    /* renamed from: a */
    public static final C36262a f85692a = C36262a.f85694b;

    static {
        Covode.recordClassIndex(43533);
    }

    @AbstractC89722f(mo144276a = "aweme/v1/im/resources/sticker/collect/")
    AbstractC88979t<BaseResponse> collectGifEmoji(@AbstractC89736t(mo144292a = "action") int i, @AbstractC89736t(mo144292a = "sticker_ids") String str, @AbstractC89736t(mo144292a = "sticker_source") int i2);

    @AbstractC89722f(mo144276a = "aweme/v1/im/resources/emoticon/search/")
    AbstractC88979t<GifEmojiResponse> searchGifEmoji(@AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "source") String str2, @AbstractC89736t(mo144292a = "group_id") String str3);

    /* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi$a */
    public static final class C36262a {

        /* renamed from: a */
        public static final AbstractC89244h f85693a;

        /* renamed from: b */
        static final /* synthetic */ C36262a f85694b;

        private C36262a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi$a$a */
        static final class C36263a extends AbstractC89220m implements AbstractC89171a<GifEmojiApi> {

            /* renamed from: a */
            final /* synthetic */ C36262a f85695a;

            static {
                Covode.recordClassIndex(43535);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36263a(C36262a aVar) {
                super(0);
                this.f85695a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ GifEmojiApi invoke() {
                IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
                IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
                C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
                Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createIMainServicebyMonsterPlugin.getApiUrlPrefix()).create(GifEmojiApi.class);
                C89219l.m154716b(create, "");
                return create;
            }
        }

        static {
            Covode.recordClassIndex(43534);
            C36262a aVar = new C36262a();
            f85694b = aVar;
            f85693a = C89250i.m154773a((AbstractC89171a) new C36263a(aVar));
        }
    }
}
