package com.p2082ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.be */
public final class C37881be {

    /* renamed from: a */
    public static final C37881be f89380a = new C37881be();

    private C37881be() {
    }

    static {
        Covode.recordClassIndex(45333);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.be$a */
    public static final class CallableC37882a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f89381a;

        static {
            Covode.recordClassIndex(45334);
        }

        public CallableC37882a(List list) {
            this.f89381a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (Aweme aweme : this.f89381a) {
                if (aweme != null && aweme.isAd()) {
                    C37881be.m76678a("feedApi", aweme);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m76677a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            return "{ adid = " + awemeRawAd.getAdId() + ", cid = " + awemeRawAd.getCreativeId() + ", title = " + awemeRawAd.getTitle() + ", buttonText = " + awemeRawAd.getButtonText() + " }";
        }
        return "";
    }

    /* renamed from: a */
    public static void m76678a(String str, Aweme aweme) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aweme, "");
        C51423a.m95784a(3, "MaskDebugLog", m76679b(str, aweme));
    }

    /* renamed from: b */
    private static String m76679b(String str, Aweme aweme) {
        return str + " : aid=  " + aweme.getAid() + ", isad= " + aweme.isAd() + ", desc= " + aweme.getDesc() + ", awemeRawAd= " + m76677a(aweme.getAwemeRawAd()) + ", shareUrl = " + aweme.getShareUrl();
    }
}
