package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2531a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerOutService;
import com.p2082ss.android.ugc.aweme.commercialize.service.CommerceStickerOutService;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80367dz;
import com.p2082ss.android.ugc.aweme.utils.C80371eb;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.a.a */
public final class C37572a {

    /* renamed from: a */
    public static final AbstractC80367dz f88791a = C80371eb.m139349a(C37573a.f88793a);

    /* renamed from: b */
    public static final C37572a f88792b = new C37572a();

    private C37572a() {
    }

    /* renamed from: a */
    public static AbstractC37569a m75786a() {
        return (AbstractC37569a) f88791a.mo123714a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.a.a$a */
    static final class C37573a extends AbstractC89220m implements AbstractC89171a<AbstractC37569a> {

        /* renamed from: a */
        public static final C37573a f88793a = new C37573a();

        static {
            Covode.recordClassIndex(44975);
        }

        C37573a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC37569a invoke() {
            ICommerceStickerOutService commerceStickerOutService;
            Object a = C81908b.m141854a(ICommerceStickerOutService.class, false);
            if (a != null) {
                commerceStickerOutService = (ICommerceStickerOutService) a;
                if (commerceStickerOutService == null) {
                    return null;
                }
            } else {
                commerceStickerOutService = new CommerceStickerOutService();
            }
            return commerceStickerOutService.mo65418a();
        }
    }

    static {
        Covode.recordClassIndex(44974);
    }
}
