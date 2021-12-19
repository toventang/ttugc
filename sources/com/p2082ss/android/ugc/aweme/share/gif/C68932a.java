package com.p2082ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.AbstractC17765f;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.share.C68862ag;
import java.io.File;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.gif.a */
public final class C68932a {

    /* renamed from: a */
    public static List<? extends C68862ag> f154210a = C89086z.INSTANCE;

    /* renamed from: b */
    public static final C68932a f154211b = new C68932a();

    /* renamed from: c */
    private static final AbstractC89244h f154212c = C89250i.m154773a((AbstractC89171a) C68934b.f154218a);

    /* renamed from: a */
    public static String m121630a() {
        return (String) f154212c.getValue();
    }

    private C68932a() {
    }

    static {
        Covode.recordClassIndex(81242);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.gif.a$b */
    static final class C68934b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C68934b f154218a = new C68934b();

        static {
            Covode.recordClassIndex(81244);
        }

        C68934b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String path = new File(AVExternalServiceImpl.m113114a().configService().cacheConfig().cacheDir(), "gif").getPath();
            C89219l.m154716b(path, "");
            return path;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.gif.a$a */
    public static final class C68933a implements AbstractC17765f {

        /* renamed from: a */
        final /* synthetic */ AbstractC68942h f154213a;

        /* renamed from: b */
        final /* synthetic */ Activity f154214b;

        /* renamed from: c */
        final /* synthetic */ Aweme f154215c;

        /* renamed from: d */
        final /* synthetic */ String f154216d;

        /* renamed from: e */
        final /* synthetic */ String f154217e;

        static {
            Covode.recordClassIndex(81243);
        }

        @Override // com.bytedance.ies.powerpermissions.AbstractC17765f
        /* renamed from: a */
        public final void mo28241a(C17749a... aVarArr) {
            AbstractC68942h hVar;
            C89219l.m154721d(aVarArr, "");
            if (aVarArr[0].f42426b == C17749a.EnumC17750a.GRANTED && (hVar = this.f154213a) != null) {
                hVar.mo109492a(this.f154214b, this.f154215c, this.f154216d, this.f154217e);
            }
        }

        public C68933a(AbstractC68942h hVar, Activity activity, Aweme aweme, String str, String str2) {
            this.f154213a = hVar;
            this.f154214b = activity;
            this.f154215c = aweme;
            this.f154216d = str;
            this.f154217e = str2;
        }
    }

    /* renamed from: a */
    public static String m121631a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        String aid = aweme.getAid();
        C89219l.m154716b(aid, "");
        return aid;
    }
}
