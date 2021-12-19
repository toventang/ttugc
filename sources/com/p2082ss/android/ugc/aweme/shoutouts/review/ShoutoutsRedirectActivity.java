package com.p2082ss.android.ugc.aweme.shoutouts.review;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.p2082ss.android.ugc.aweme.shoutouts.C74381a;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.shoutouts.C74426g;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74443g;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsPrice;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsProduct;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsProductApi;
import com.p2082ss.android.ugc.aweme.shoutouts.model.StandardMoney;
import com.p2082ss.android.ugc.aweme.shoutouts.p3902b.C74387a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity */
public final class ShoutoutsRedirectActivity extends ActivityC17312a implements WeakHandler.IHandler {

    /* renamed from: c */
    public static final C74518a f167564c = new C74518a((byte) 0);

    /* renamed from: a */
    public int f167565a = -1;

    /* renamed from: b */
    public int f167566b = -1;

    /* renamed from: d */
    private int f167567d = -1;

    /* renamed from: e */
    private int f167568e = -1;

    /* renamed from: f */
    private String f167569f;

    /* renamed from: g */
    private final WeakHandler f167570g = new WeakHandler(this);

    /* renamed from: h */
    private SparseArray f167571h;

    static {
        Covode.recordClassIndex(87321);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f167571h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f167571h == null) {
            this.f167571h = new SparseArray();
        }
        View view = (View) this.f167571h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f167571h.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity$a */
    public static final class C74518a {
        static {
            Covode.recordClassIndex(87322);
        }

        private C74518a() {
        }

        public /* synthetic */ C74518a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity$c */
    public static final class C74521c implements AbstractC88406ae<C74443g> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsRedirectActivity f167574a;

        static {
            Covode.recordClassIndex(87325);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74521c(ShoutoutsRedirectActivity shoutoutsRedirectActivity) {
            this.f167574a = shoutoutsRedirectActivity;
        }

        /* renamed from: a */
        private static Bundle m130952a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            new C23144b(this.f167574a).mo37632a().mo37640e(R.string.fw_).mo37637b();
            this.f167574a.finish();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C74443g gVar) {
            Video video;
            UrlModel cover;
            List<String> urlList;
            String str;
            UrlModel cover2;
            List<String> urlList2;
            C74443g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            if (!this.f167574a.isFinishing()) {
                try {
                    if (gVar2.f167421a == 0) {
                        ShoutoutsProduct shoutoutsProduct = gVar2.f167422b;
                        if (shoutoutsProduct != null) {
                            int status = shoutoutsProduct.getStatus();
                            if ((this.f167574a.f167565a == 2 && status == 2) || (this.f167574a.f167565a == 7 && status == 7 && this.f167574a.f167566b == 1)) {
                                IShoutOutsService shoutOutsService = AVExternalServiceImpl.m113114a().shoutOutsService();
                                C74418d dVar = new C74418d();
                                dVar.setProductId(shoutoutsProduct.getProductId());
                                dVar.setDesc(shoutoutsProduct.getDescription());
                                Aweme videoInfo = shoutoutsProduct.getVideoInfo();
                                if (!(videoInfo == null || (video = videoInfo.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || !(!urlList.isEmpty()))) {
                                    Video video2 = shoutoutsProduct.getVideoInfo().getVideo();
                                    if (video2 == null || (cover2 = video2.getCover()) == null || (urlList2 = cover2.getUrlList()) == null) {
                                        str = null;
                                    } else {
                                        str = urlList2.get(0);
                                    }
                                    dVar.setCoverUrl(str);
                                }
                                ShoutoutsPrice price = shoutoutsProduct.getPrice();
                                if (price != null) {
                                    C74426g gVar3 = new C74426g();
                                    gVar3.setCoin(price.getCoin());
                                    StandardMoney creatorEarning = price.getCreatorEarning();
                                    if (creatorEarning != null) {
                                        gVar3.setMoneyDes(ShoutoutsRedirectActivity.m130948a(creatorEarning));
                                    }
                                    dVar.setPrice(gVar3);
                                    StandardMoney buyerPayment = price.getBuyerPayment();
                                    if (buyerPayment != null) {
                                        dVar.setBuyerMoneyDes(ShoutoutsRedirectActivity.m130948a(buyerPayment));
                                    }
                                }
                                shoutOutsService.startShoutoutsPublishActivityFromNative(this.f167574a, dVar);
                                this.f167574a.finish();
                                return;
                            }
                            ShoutoutsRedirectActivity shoutoutsRedirectActivity = this.f167574a;
                            shoutoutsRedirectActivity.mo117189a(m130952a(shoutoutsRedirectActivity.getIntent()));
                            return;
                        }
                        new C23144b(this.f167574a).mo37632a().mo37635a(this.f167574a.getResources().getString(R.string.fw_)).mo37637b();
                        this.f167574a.finish();
                        return;
                    }
                    new C23144b(this.f167574a).mo37632a().mo37635a(this.f167574a.getResources().getString(R.string.fw_)).mo37637b();
                    this.f167574a.finish();
                } catch (Exception e) {
                    e.printStackTrace();
                    new C23144b(this.f167574a).mo37632a().mo37635a(this.f167574a.getResources().getString(R.string.fw_)).mo37637b();
                    this.f167574a.finish();
                }
            }
        }
    }

    /* renamed from: a */
    private static Bundle m130947a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity$b */
    static final class C74519b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C74519b f167572a = new C74519b();

        static {
            Covode.recordClassIndex(87323);
        }

        C74519b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C745201.f167573a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static C74381a m130948a(StandardMoney standardMoney) {
        C74381a aVar = new C74381a();
        aVar.setCurrencyCharacter(standardMoney.getCurrencyCharacter());
        aVar.setCurrencyName(standardMoney.getCurrencyName());
        aVar.setMoney(standardMoney.getMoney());
        return aVar;
    }

    /* renamed from: a */
    public final void mo117189a(Bundle bundle) {
        Set<String> keySet;
        String str = "https://www.tiktok.com/web-inapp/shoutouts/creator/entry/?hide_nav_bar=1";
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str2 : keySet) {
                str = str + '&' + str2 + '=' + m130949a(bundle, str2);
            }
        }
        C74387a.m130855b(this, str);
        finish();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onCreate", true);
        activityConfiguration(C74519b.f167572a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.azk);
        String dataString = getIntent().getDataString();
        if (dataString == null || !C89361p.m154874b(dataString, "aweme://shoutouts/detail/redirect", false)) {
            Intent intent = getIntent();
            Integer num4 = null;
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("origin_product_status", -1));
            } else {
                num = null;
            }
            this.f167565a = num.intValue();
            Intent intent2 = getIntent();
            if (intent2 != null) {
                num2 = Integer.valueOf(intent2.getIntExtra("origin_enroll_status", -1));
            } else {
                num2 = null;
            }
            this.f167567d = num2.intValue();
            Intent intent3 = getIntent();
            if (intent3 != null) {
                num3 = Integer.valueOf(intent3.getIntExtra("origin_order_status", -1));
            } else {
                num3 = null;
            }
            this.f167568e = num3.intValue();
            Intent intent4 = getIntent();
            if (intent4 != null) {
                str = m130950a(intent4, "order_id");
            } else {
                str = null;
            }
            this.f167569f = str;
            Intent intent5 = getIntent();
            if (intent5 != null) {
                num4 = Integer.valueOf(intent5.getIntExtra("force_edit", -1));
            }
            int intValue = num4.intValue();
            this.f167566b = intValue;
            int i = this.f167565a;
            if (i == 2 || (i == 7 && intValue == 1)) {
                C31575b.m65865g().queryUser(this.f167570g);
            } else {
                mo117189a(m130947a(getIntent()));
            }
        } else {
            C31575b.m65865g().queryUser(this.f167570g);
        }
        Intent intent6 = getIntent();
        if (intent6 != null) {
            intent6.getDataString();
        }
        Intent intent7 = getIntent();
        if (intent7 != null) {
            m130947a(intent7);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onCreate", false);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        Set<String> keySet;
        if (message == null || message.what != 112 || !(message.obj instanceof User)) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            user = g.getCurUser();
        } else {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            user = (User) obj;
        }
        String dataString = getIntent().getDataString();
        String str = null;
        Bundle bundle = null;
        if (dataString == null || !C89361p.m154874b(dataString, "aweme://shoutouts/detail/redirect", false)) {
            if (user != null) {
                C89219l.m154721d(user, "");
                int i = user.shoutoutsStatus % 100;
                if (i == 2 || i == 7) {
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    ShoutoutsProductApi.C74433a.m130891a().getProduct(g2.getCurUserId(), null).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C74521c(this));
                    return;
                }
            }
            mo117189a(m130947a(getIntent()));
            return;
        }
        if (user != null) {
            C89219l.m154721d(user, "");
            if (user.shoutoutsStatus / 100 != 4) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this, "//shoutouts/detail");
                Intent intent = getIntent();
                if (intent != null) {
                    bundle = m130947a(intent);
                }
                buildRoute.withParam(bundle).open();
                finish();
                return;
            }
        }
        Bundle a = m130947a(getIntent());
        if (!(a == null || (keySet = a.keySet()) == null)) {
            for (String str2 : keySet) {
                Object a2 = m130949a(a, str2);
                str = str == null ? str2 + '=' + a2 : str + '&' + str2 + '=' + a2;
            }
            if (str != null) {
                C89219l.m154721d(this, "");
                C89219l.m154721d(str, "");
                C74387a.m130855b(this, "https://www.tiktok.com/web-inapp/shoutouts/creator/entry/?".concat(String.valueOf(str)));
            }
        }
        finish();
    }

    /* renamed from: a */
    private static Object m130949a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m130950a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
