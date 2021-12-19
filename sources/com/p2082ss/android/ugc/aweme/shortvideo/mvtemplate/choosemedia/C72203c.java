package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.c */
public final class C72203c {

    /* renamed from: a */
    public static final C72203c f161869a = new C72203c();

    /* renamed from: b */
    private static final AbstractC89244h f161870b = C89250i.m154773a((AbstractC89171a) C72204a.f161871a);

    /* renamed from: a */
    static Keva m127401a() {
        return (Keva) f161870b.getValue();
    }

    private C72203c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.c$a */
    static final class C72204a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C72204a f161871a = new C72204a();

        static {
            Covode.recordClassIndex(84869);
        }

        C72204a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("allow_ten_minute_video_uploading");
        }
    }

    static {
        Covode.recordClassIndex(84868);
    }
}
