package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event.C44614j;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event.C44616k;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.api.OrderEntranceApi;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.GetEntranceInfoResponse;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.OrderEntranceType;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.TradeEntranceInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.service.AbstractC45377b;
import java.util.Set;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterEntry */
public final class OrderCenterEntry implements AbstractC33974au, AbstractC45377b {

    /* renamed from: f */
    private static final C44592a f104054f = new C44592a((byte) 0);

    /* renamed from: a */
    public AbstractC45377b.AbstractC45378a f104055a;

    /* renamed from: b */
    private final Handler f104056b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Keva f104057c = Keva.getRepo("ec_order_center_entrance_infos");

    /* renamed from: d */
    private final Keva.OnChangeListener f104058d = new C44595d(this);

    /* renamed from: e */
    private boolean f104059e;

    static {
        Covode.recordClassIndex(52957);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestory();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterEntry$a */
    static final class C44592a {
        static {
            Covode.recordClassIndex(52958);
        }

        private C44592a() {
        }

        public /* synthetic */ C44592a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterEntry$c */
    public static final class C44594c extends AbstractC88922b<GetEntranceInfoResponse> {

        /* renamed from: a */
        final /* synthetic */ OrderCenterEntry f104063a;

        static {
            Covode.recordClassIndex(52960);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            dispose();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44594c(OrderCenterEntry orderCenterEntry) {
            this.f104063a = orderCenterEntry;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Object obj) {
            C43612a aVar = (C43612a) obj;
            C89219l.m154721d(aVar, "");
            if (aVar.isCodeOK()) {
                if (aVar.data == null) {
                    this.f104063a.mo75654a(new TradeEntranceInfo(0, null, null, null, 15, null));
                } else {
                    int type = aVar.data.getType();
                    if (type == OrderEntranceType.OPEN.ordinal() || type == OrderEntranceType.CLOSE.ordinal()) {
                        this.f104063a.mo75654a((TradeEntranceInfo) aVar.data);
                    }
                }
            }
            dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterEntry$b */
    public static final class RunnableC44593b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OrderCenterEntry f104060a;

        /* renamed from: b */
        final /* synthetic */ boolean f104061b;

        /* renamed from: c */
        final /* synthetic */ String f104062c;

        static {
            Covode.recordClassIndex(52959);
        }

        RunnableC44593b(OrderCenterEntry orderCenterEntry, boolean z, String str) {
            this.f104060a = orderCenterEntry;
            this.f104061b = z;
            this.f104062c = str;
        }

        public final void run() {
            AbstractC45377b.AbstractC45378a aVar = this.f104060a.f104055a;
            if (aVar != null) {
                aVar.mo76431a(this.f104061b, this.f104062c);
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestory() {
        this.f104057c.unRegisterChangeListener(this.f104058d);
        this.f104056b.removeCallbacksAndMessages(null);
        this.f104055a = null;
    }

    /* renamed from: b */
    private static String m87346b() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            return "unknown";
        }
        return curUserId;
    }

    /* renamed from: c */
    private final TradeEntranceInfo m87347c() {
        try {
            Object a = new C27910f().mo46670a(this.f104057c.getString(m87346b(), "{}"), TradeEntranceInfo.class);
            C89219l.m154716b(a, "");
            return (TradeEntranceInfo) a;
        } catch (Throwable th) {
            C22708a.m42802a(th);
            return new TradeEntranceInfo(0, null, null, null, 15, null);
        }
    }

    /* renamed from: a */
    public final void mo75651a() {
        boolean z;
        TradeEntranceInfo c = m87347c();
        if (c.getType() == OrderEntranceType.OPEN.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        String tips = c.getTips();
        if (tips == null) {
            tips = "";
        }
        Integer toReviewCount = c.getToReviewCount();
        if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
            AbstractC45377b.AbstractC45378a aVar = this.f104055a;
            if (aVar != null) {
                aVar.mo76431a(z, tips);
            }
        } else {
            this.f104056b.post(new RunnableC44593b(this, z, tips));
        }
        if (z && !this.f104059e) {
            new C44616k(toReviewCount).mo76747d();
            this.f104059e = true;
        }
    }

    /* renamed from: a */
    public final void mo75654a(TradeEntranceInfo tradeEntranceInfo) {
        TradeEntranceInfo tradeEntranceInfo2 = tradeEntranceInfo;
        Keva keva = this.f104057c;
        String b = m87346b();
        C27910f fVar = new C27910f();
        if (tradeEntranceInfo2 == null) {
            tradeEntranceInfo2 = new TradeEntranceInfo(0, null, null, null, 15, null);
        }
        keva.storeString(b, fVar.mo46674b(tradeEntranceInfo2));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.AbstractC45377b
    /* renamed from: a */
    public final void mo75652a(Activity activity) {
        String str;
        C89219l.m154721d(activity, "");
        TradeEntranceInfo c = m87347c();
        String schema = c.getSchema();
        if (schema == null || schema.length() == 0) {
            str = "aweme://ec/order_center";
        } else {
            str = c.getSchema();
        }
        Uri parse = Uri.parse(str);
        Uri.Builder builder = new Uri.Builder();
        C89219l.m154716b(parse, "");
        Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
        }
        if (!parse.getQueryParameterNames().contains("previous_page")) {
            encodedPath.appendQueryParameter("previous_page", "Personal_Home_Page");
        }
        SmartRouter.buildRoute(activity, encodedPath.build().toString()).open();
        c.setTips("");
        c.setSchema("");
        mo75654a(c);
        new C44614j(c.getToReviewCount()).mo76747d();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterEntry$d */
    static final class C44595d implements Keva.OnChangeListener {

        /* renamed from: a */
        final /* synthetic */ OrderCenterEntry f104064a;

        static {
            Covode.recordClassIndex(52961);
        }

        C44595d(OrderCenterEntry orderCenterEntry) {
            this.f104064a = orderCenterEntry;
        }

        @Override // com.bytedance.keva.Keva.OnChangeListener
        public final void onChanged(Keva keva, String str) {
            this.f104064a.mo75651a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.AbstractC45377b
    /* renamed from: a */
    public final void mo75653a(AbstractC1196i iVar, AbstractC45377b.AbstractC45378a aVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(aVar, "");
        if (this.f104055a == null) {
            this.f104055a = aVar;
            iVar.mo4012a(this);
            this.f104057c.registerChangeListener(this.f104058d);
            AbstractC88979t<GetEntranceInfoResponse> b = ((OrderEntranceApi) OrderEntranceApi.C44618a.f104083a.mo28858a(OrderEntranceApi.class)).getEntranceInfo().mo143278b(C88925a.m154180b(C88946a.f201991c));
            C89219l.m154716b(b, "");
            b.mo143062b(new C44594c(this));
            mo75651a();
            return;
        }
        throw new RuntimeException("Do not init reduplicative!");
    }
}
