package com.p2082ss.android.ugc.aweme.share.p3746d;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b;
import com.p2082ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p2082ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.share.d.b */
public final class C68907b {

    /* renamed from: a */
    public static AbstractC49927b f154147a;

    /* renamed from: b */
    public static String f154148b;

    /* renamed from: c */
    public static String f154149c;

    /* renamed from: d */
    public static final AbstractC27255q<IWaterMarkService> f154150d = new C68908a();

    /* renamed from: e */
    public static final C68907b f154151e = new C68907b();

    /* renamed from: com.ss.android.ugc.aweme.share.d.b$a */
    public static final class C68908a implements AbstractC27255q<IWaterMarkService> {

        /* renamed from: a */
        public IWaterMarkService f154152a;

        static {
            Covode.recordClassIndex(81214);
        }

        C68908a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.p1998c.p1999a.AbstractC27255q
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ IWaterMarkService mo5560b() {
            if (this.f154152a == null) {
                this.f154152a = WaterMarkServiceImpl.m141254b();
            }
            return this.f154152a;
        }
    }

    private C68907b() {
    }

    static {
        Covode.recordClassIndex(81213);
    }
}
