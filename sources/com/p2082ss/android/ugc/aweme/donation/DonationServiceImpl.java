package com.p2082ss.android.ugc.aweme.donation;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.donation.detail.C43116b;
import com.p2082ss.android.ugc.aweme.donation.detail.C43137c;
import com.p2082ss.android.ugc.aweme.donation.token.C43150a;
import com.p2082ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.DonationServiceImpl */
public final class DonationServiceImpl implements IDonationService {

    /* renamed from: a */
    public static final C43109a f100452a = new C43109a((byte) 0);

    static {
        Covode.recordClassIndex(51277);
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.DonationServiceImpl$a */
    public static final class C43109a {
        static {
            Covode.recordClassIndex(51278);
        }

        private C43109a() {
        }

        public /* synthetic */ C43109a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.donation.IDonationService
    /* renamed from: a */
    public final IInterceptor mo73339a() {
        return new C43137c();
    }

    /* renamed from: b */
    public static IDonationService m86009b() {
        MethodCollector.m26663i(9083);
        Object a = C81908b.m141854a(IDonationService.class, false);
        if (a != null) {
            IDonationService iDonationService = (IDonationService) a;
            MethodCollector.m26664o(9083);
            return iDonationService;
        }
        if (C81908b.f183225bb == null) {
            synchronized (IDonationService.class) {
                try {
                    if (C81908b.f183225bb == null) {
                        C81908b.f183225bb = new DonationServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9083);
                    throw th;
                }
            }
        }
        DonationServiceImpl donationServiceImpl = (DonationServiceImpl) C81908b.f183225bb;
        MethodCollector.m26664o(9083);
        return donationServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.DonationServiceImpl$b */
    static final class C43110b extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f100453a;

        /* renamed from: b */
        final /* synthetic */ Bundle f100454b = null;

        static {
            Covode.recordClassIndex(51279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43110b(Context context, Bundle bundle) {
            super(1);
            this.f100453a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putString("title", this.f100453a.getString(R.string.baa));
            bundle.putString("enter_from", "donation_sticker_consume");
            bundle.putString("hide_more", "false");
            Bundle bundle2 = this.f100454b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            DonationWebPageDialogActivity.C43156a.m86055a(this.f100453a, bundle);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.donation.IDonationService
    /* renamed from: a */
    public final void mo73341a(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        C43150a.m86050a(context, str, 1, str2, new JSONObject().toString(), new C43110b(context, null));
    }

    @Override // com.p2082ss.android.ugc.aweme.donation.IDonationService
    /* renamed from: a */
    public final C23226a mo73340a(int i, String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        C43116b bVar = new C43116b();
        bundle.putInt("ngo_id", i);
        bundle.putString("profile_uid", str);
        bundle.putInt("item_type", 3);
        bVar.setArguments(bundle);
        return new C23226a.C23227a().mo37817a(bVar).mo37812a(0).mo37822b(false).f55057a;
    }

    @Override // com.p2082ss.android.ugc.aweme.donation.IDonationService
    /* renamed from: b */
    public final C23226a mo73342b(int i, String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        C43116b bVar = new C43116b();
        bundle.putInt("ngo_id", i);
        bundle.putString("sticker_id", str);
        bundle.putInt("item_type", 4);
        bVar.setArguments(bundle);
        return new C23226a.C23227a().mo37817a(bVar).mo37812a(0).mo37822b(false).f55057a;
    }
}
