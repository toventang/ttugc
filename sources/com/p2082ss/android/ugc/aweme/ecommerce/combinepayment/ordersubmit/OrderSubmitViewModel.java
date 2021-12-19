package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.SystemClock;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.p2019b.C27895a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Icon;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43740a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43741b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43742c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43743d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43744e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43745f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43746g;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43747h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43748i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43749j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.C43831a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.OrderSubmitApi;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Announcement;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillItem;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43848b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43849c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43850d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43851e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43852f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43853g;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43856j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43858l;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43859m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43860n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43863q;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43864r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43865s;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43866t;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.PackedSku;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShippingAddress;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopOrder;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Summary;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.C43939d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.AbstractC44169u;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44067c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44070d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44092e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44153r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44170v;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.C44276w;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44071a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44072b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44077f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44087p;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44088q;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44089r;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44091t;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.C44336a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43321d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.C44954h;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89699w;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.C89702y;
import kotlinx.coroutines.internal.C89652o;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel */
public final class OrderSubmitViewModel extends JediViewModel<OrderSubmitState> implements IEventCenter.AbstractC45375b {

    /* renamed from: P */
    public static final C43667a f101763P = new C43667a((byte) 0);

    /* renamed from: A */
    public boolean f101764A;

    /* renamed from: B */
    public boolean f101765B;

    /* renamed from: C */
    public boolean f101766C;

    /* renamed from: D */
    public boolean f101767D;

    /* renamed from: E */
    public boolean f101768E;

    /* renamed from: F */
    public HashMap<String, Object> f101769F;

    /* renamed from: G */
    public HashMap<String, Object> f101770G = new HashMap<>();

    /* renamed from: H */
    boolean f101771H;

    /* renamed from: I */
    public String f101772I = "default_repo_id";

    /* renamed from: J */
    public C43831a f101773J;

    /* renamed from: K */
    public List<String> f101774K = C89086z.INSTANCE;

    /* renamed from: L */
    public List<String> f101775L;

    /* renamed from: M */
    public List<String> f101776M;

    /* renamed from: N */
    public String f101777N;

    /* renamed from: O */
    public int f101778O;

    /* renamed from: Q */
    private Boolean f101779Q;

    /* renamed from: R */
    private boolean f101780R;

    /* renamed from: S */
    private Voucher f101781S;

    /* renamed from: a */
    public int f101782a;

    /* renamed from: b */
    public String f101783b;

    /* renamed from: c */
    public List<OrderShopDigest> f101784c;

    /* renamed from: d */
    public List<Region> f101785d;

    /* renamed from: e */
    public String f101786e;

    /* renamed from: f */
    public OrderSubmitRequestParam f101787f;

    /* renamed from: g */
    public ShippingAddress f101788g;

    /* renamed from: k */
    public BillInfoData f101789k;

    /* renamed from: l */
    public ExceptionUX f101790l;

    /* renamed from: m */
    public String f101791m = "";

    /* renamed from: n */
    public C44085n f101792n;

    /* renamed from: o */
    public C43860n f101793o;

    /* renamed from: p */
    public boolean f101794p;

    /* renamed from: q */
    public boolean f101795q;

    /* renamed from: r */
    public String f101796r = "";

    /* renamed from: s */
    public boolean f101797s;

    /* renamed from: t */
    public String f101798t;

    /* renamed from: u */
    public boolean f101799u;

    /* renamed from: v */
    public String f101800v = "";

    /* renamed from: w */
    public long f101801w;

    /* renamed from: x */
    public Keva f101802x;

    /* renamed from: y */
    public boolean f101803y;

    /* renamed from: z */
    public boolean f101804z;

    static {
        Covode.recordClassIndex(51930);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$a */
    public static final class C43667a {
        static {
            Covode.recordClassIndex(51931);
        }

        private C43667a() {
        }

        public /* synthetic */ C43667a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$h */
    public static final class C43689h extends C27895a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(51953);
        }

        C43689h() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$o */
    public static final class C43702o extends C27895a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(51966);
        }

        C43702o() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        String buyerAddressId;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        switch (str.hashCode()) {
            case -2019832472:
                if (str.equals("ec_address_select")) {
                    m86669c(AddressPageStarter.C43338a.C43339a.m86456a(str2).f101146a);
                    return;
                }
                return;
            case 1150715295:
                if (str.equals("ec_payment_method_activate_clicked")) {
                    this.f101771H = true;
                    C44085n nVar = this.f101792n;
                    if (nVar != null) {
                        nVar.f102789b = null;
                        return;
                    }
                    return;
                }
                return;
            case 1242205757:
                if (str.equals("ec_osp_resend_order_create")) {
                    mo33689c(C43703p.f101862a);
                    return;
                }
                return;
            case 1819520028:
                if (str.equals("ec_address_change")) {
                    AddressPageStarter.C43338a a = AddressPageStarter.C43338a.C43339a.m86456a(str2);
                    if (a.f101147b == 0) {
                        BillInfoData billInfoData = this.f101789k;
                        if (billInfoData == null || (buyerAddressId = billInfoData.getBuyerAddressId()) == null || buyerAddressId.length() == 0) {
                            m86669c(AddressPageStarter.C43338a.C43339a.m86456a(str2).f101146a);
                            return;
                        }
                        return;
                    } else if (!C89219l.m154714a((Object) AddressPageStarter.C43338a.C43339a.m86456a(str2).f101146a, (Object) this.f101783b)) {
                        return;
                    } else {
                        if (a.f101147b == 2) {
                            m86669c((String) null);
                            return;
                        } else {
                            m86669c(this.f101783b);
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo74407a(C43750c cVar) {
        if (C89219l.m154714a((Object) (cVar != null ? cVar.f102009a : null), (Object) "order_submit_fragment")) {
            this.f101794p = false;
        }
        mo33689c(new C43668aa(cVar));
    }

    /* renamed from: a */
    public final void mo74410a(C44085n nVar) {
        C89219l.m154721d(nVar, "");
        this.f101792n = nVar;
        mo33689c(new C43671ad(nVar));
    }

    /* renamed from: a */
    public final void mo74411a(Voucher voucher) {
        VoucherInfo voucherInfo;
        List<Voucher> vouchers;
        T t;
        String str = null;
        String voucherID = voucher != null ? voucher.getVoucherID() : null;
        BillInfoData billInfoData = this.f101789k;
        if (!(billInfoData == null || (voucherInfo = billInfoData.getVoucherInfo()) == null || (vouchers = voucherInfo.getVouchers()) == null)) {
            Iterator<T> it = vouchers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.getSelected(), (Object) true)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                str = t2.getVoucherID();
            }
        }
        if (!C89219l.m154714a((Object) voucherID, (Object) str)) {
            this.f101781S = voucher;
            this.f101780R = true;
            m86667a(this, false, false, false, false, null, 63);
        }
    }

    /* renamed from: a */
    public final void mo74409a(C43864r rVar) {
        C89219l.m154721d(rVar, "");
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C43678ag(this, rVar, null), 2);
    }

    /* renamed from: a */
    public final void mo74408a(BillInfoData billInfoData, BillInfoRequest billInfoRequest) {
        C44086o oVar;
        List<C44086o> list;
        C44089r paymentMethods;
        C44086o a;
        List<C44086o> list2;
        C44089r paymentMethods2;
        List<C44086o> list3;
        C44086o oVar2;
        C44086o oVar3;
        BillInfoData billInfoData2 = billInfoData;
        String str = null;
        if (C89219l.m154714a((Object) this.f101779Q, (Object) true)) {
            this.f101779Q = null;
        } else if (billInfoData2 == null) {
            C79459a aVar = new C79459a(C17867d.m33078a());
            Resources resources = C17867d.m33078a().getResources();
            if (resources != null) {
                str = resources.getString(R.string.fv9);
            }
            aVar.mo123052a(str).mo123053a();
            m86670m();
        } else {
            ExceptionUX exceptionUX = billInfoData2.getExceptionUX();
            this.f101790l = exceptionUX;
            if (exceptionUX != null) {
                this.f101800v = "query_bill_info";
                mo74415b(1);
                ExceptionUX exceptionUX2 = this.f101790l;
                if (!C89219l.m154714a((Object) (exceptionUX2 != null ? exceptionUX2.getRenderPage() : null), (Object) true)) {
                    m86670m();
                    return;
                }
            }
            BillInfoData billInfoData3 = this.f101789k;
            if (billInfoData3 != null) {
                billInfoData2 = billInfoData3.merge(billInfoData2, billInfoRequest);
            }
            this.f101789k = billInfoData2;
            this.f101788g = billInfoData2 != null ? billInfoData2.getShippingAddress() : null;
            BillInfoData billInfoData4 = this.f101789k;
            if (billInfoData4 != null) {
                mo74403a(-1);
                boolean hasAddress = billInfoData4.hasAddress();
                this.f101768E = billInfoData4.reachableAny();
                if (billInfoRequest.getWithShippingAddress()) {
                    this.f101783b = billInfoData4.getBuyerAddressId();
                }
                this.f101799u = billInfoData4.hasPromotion();
                C44085n nVar = this.f101792n;
                if ((nVar != null ? nVar.f102789b : null) != null) {
                    C44085n nVar2 = this.f101792n;
                    oVar = nVar2 != null ? nVar2.f102789b : null;
                    C44089r paymentMethods3 = billInfoData4.getPaymentMethods();
                    if (!(paymentMethods3 == null || (list2 = paymentMethods3.f102823c) == null || list2.isEmpty() || (paymentMethods2 = billInfoData4.getPaymentMethods()) == null || (list3 = paymentMethods2.f102823c) == null)) {
                        for (T t : list3) {
                            C44085n nVar3 = this.f101792n;
                            if (C89219l.m154714a((Object) ((nVar3 == null || (oVar3 = nVar3.f102789b) == null) ? null : oVar3.f102794a), (Object) t.f102794a)) {
                                C44085n nVar4 = this.f101792n;
                                if (C89219l.m154714a((Object) ((nVar4 == null || (oVar2 = nVar4.f102789b) == null) ? null : oVar2.f102809p), (Object) t.f102809p)) {
                                    C44087p pVar = new C44087p(t.f102794a, t.f102809p, t.mo74951b(), null);
                                    List<C44075e> list4 = t.f102811r;
                                    mo74410a(new C44085n(pVar, t, null, Boolean.valueOf(list4 == null || list4.isEmpty()), null, null, 48));
                                    oVar = t;
                                }
                            }
                        }
                    }
                } else {
                    C44089r paymentMethods4 = billInfoData4.getPaymentMethods();
                    if (paymentMethods4 == null || (list = paymentMethods4.f102823c) == null || list.isEmpty() || (paymentMethods = billInfoData4.getPaymentMethods()) == null || (a = paymentMethods.mo74973a()) == null) {
                        oVar = null;
                    } else {
                        C44087p pVar2 = new C44087p(a.f102794a, a.f102809p, a.mo74951b(), null);
                        C44086o a2 = billInfoData4.getPaymentMethods().mo74973a();
                        List<C44075e> list5 = a.f102811r;
                        mo74410a(new C44085n(pVar2, a2, null, Boolean.valueOf(list5 == null || list5.isEmpty()), null, null, 48));
                        oVar = billInfoData4.getPaymentMethods().mo74973a();
                    }
                }
                VoucherInfo voucherInfo = billInfoData4.getVoucherInfo();
                Voucher a3 = voucherInfo != null ? C44336a.m87058a(voucherInfo) : null;
                Voucher voucher = this.f101781S;
                String voucherID = a3 != null ? a3.getVoucherID() : null;
                String voucherID2 = voucher != null ? voucher.getVoucherID() : null;
                if (!C89219l.m154714a((Object) voucherID, (Object) voucherID2)) {
                    VoucherInfo voucherInfo2 = billInfoData4.getVoucherInfo();
                    this.f101781S = voucherInfo2 != null ? C44336a.m87058a(voucherInfo2) : null;
                    this.f101780R = false;
                }
                this.f101775L = null;
                this.f101784c = billInfoData4.getShopOrderDigestList(IPdpStarter.C44631a.m87368a(this.f101769F), m86666a(this.f101769F), this.f101782a);
                mo33689c(new C43679ah(hasAddress, billInfoData4, oVar, this, billInfoRequest));
                if (!this.f101794p) {
                    this.f101794p = true;
                    this.f101801w = System.currentTimeMillis();
                    this.f101804z = hasAddress;
                    this.f101764A = oVar != null;
                    C43732h.m86738c();
                    C43732h.m86715a(true, mo74424j(), null, null, null, mo74421g(), Integer.valueOf(this.f101778O), 28);
                    List<Region> list6 = this.f101785d;
                    if (!(list6 == null || list6.isEmpty())) {
                        mo74415b(3);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo74413a(boolean z) {
        mo33689c(new C43716z(z));
        this.f101795q = z;
    }

    /* renamed from: a */
    public final void mo74406a(Context context, boolean z) {
        C44089r rVar;
        List<C44086o> list;
        List<C44086o> list2;
        List<C44072b> list3;
        C44088q qVar;
        Integer num;
        String str;
        String str2;
        String str3;
        C44091t tVar;
        C89219l.m154721d(context, "");
        BillInfoData billInfoData = this.f101789k;
        Address address = null;
        C44089r paymentMethods = billInfoData != null ? billInfoData.getPaymentMethods() : null;
        if (z) {
            if (paymentMethods != null) {
                list = paymentMethods.f102821a;
                list2 = paymentMethods.f102823c;
                list3 = paymentMethods.f102824d;
                qVar = paymentMethods.f102825e;
                num = paymentMethods.f102826f;
                str = paymentMethods.f102827g;
                str2 = paymentMethods.f102828h;
                str3 = paymentMethods.f102829i;
                tVar = paymentMethods.f102830j;
            } else {
                list = null;
                list2 = null;
                list3 = null;
                qVar = null;
                num = null;
                str = null;
                str2 = null;
                str3 = null;
                tVar = null;
            }
            rVar = new C44089r(list, list2, list3, qVar, num, str, str2, str3, tVar);
        } else {
            rVar = paymentMethods;
        }
        Integer valueOf = Integer.valueOf(C44067c.EnumC44068a.CONTINUE.ordinal());
        C44085n nVar = this.f101792n;
        HashMap hashMap = new HashMap();
        HashMap<String, Object> hashMap2 = this.f101769F;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        hashMap.put("previous_page", "order_submit");
        hashMap.putAll(mo74424j());
        ShippingAddress shippingAddress = this.f101788g;
        if (shippingAddress != null) {
            address = shippingAddress.getShippingAddress();
        }
        C44067c cVar = new C44067c(null, null, valueOf, rVar, null, true, nVar, hashMap, null, address, 256);
        this.f101796r = "next";
        mo74425k();
        C44153r rVar2 = new C44153r();
        rVar2.mo75000a(cVar);
        rVar2.mo75001a(new C43705r(rVar2, cVar, this, context));
        AbstractC0952i supportFragmentManager = ((ActivityC0945e) context).getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, "");
        rVar2.show(supportFragmentManager, "payment_fragment");
    }

    /* renamed from: a */
    public final void mo74405a(Context context, C43850d dVar, Throwable th, long j) {
        String str;
        List<String> list;
        CharSequence a;
        String message;
        C89233z.C89238e eVar = new C89233z.C89238e();
        T t = (T) "";
        eVar.element = t;
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        mo33687b_(new C43693j(this, eVar, aVar));
        if (dVar == null) {
            mo33689c(C43694k.f101847a);
            mo74422h();
            boolean z = this.f101765B;
            boolean z2 = this.f101766C;
            if (!(th == null || (message = th.getMessage()) == null)) {
                t = (T) message;
            }
            C43732h.m86735a(z, z2, "", false, C43732h.m86736b(t), mo74424j(), eVar.element, SystemClock.elapsedRealtime() - j, mo74421g(), Boolean.valueOf(aVar.element));
            return;
        }
        T t2 = dVar.data;
        this.f101791m = String.valueOf(dVar.code);
        if (!dVar.isCodeOK()) {
            mo33689c(C43695l.f101848a);
            Boolean bool = null;
            ExceptionUX exceptionUX = t2 != null ? t2.f102162d : null;
            this.f101790l = exceptionUX;
            Integer exceptionUXType = exceptionUX != null ? exceptionUX.getExceptionUXType() : null;
            if (exceptionUXType == null || exceptionUXType.intValue() != 2) {
                ExceptionUX exceptionUX2 = this.f101790l;
                if (exceptionUX2 != null) {
                    bool = exceptionUX2.getRenderPage();
                }
                if (!C89219l.m154714a((Object) bool, (Object) true)) {
                    str = "create_order";
                    this.f101800v = str;
                    boolean z3 = this.f101765B;
                    boolean z4 = this.f101766C;
                    T t3 = dVar.data;
                    if (!(t3 == null || (list = t3.f102159a) == null || (a = C89070n.m154551a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)) == null)) {
                        t = (T) a;
                    }
                    C43732h.m86735a(z3, z4, t, false, String.valueOf(dVar.code), mo74424j(), eVar.element, SystemClock.elapsedRealtime() - j, mo74421g(), Boolean.valueOf(aVar.element));
                    mo74415b(1);
                    return;
                }
            }
            str = "query_bill_info";
            this.f101800v = str;
            boolean z32 = this.f101765B;
            boolean z42 = this.f101766C;
            T t32 = dVar.data;
            t = (T) a;
            C43732h.m86735a(z32, z42, t, false, String.valueOf(dVar.code), mo74424j(), eVar.element, SystemClock.elapsedRealtime() - j, mo74421g(), Boolean.valueOf(aVar.element));
            mo74415b(1);
            return;
        }
        mo33687b_(new C43696m(this, aVar, dVar, eVar, j));
        mo33687b_(new C43697n(this, context, t2, dVar));
    }

    /* renamed from: m */
    private final void m86670m() {
        mo33689c(C43712v.f101882a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$n */
    public static final class C43697n extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101854a;

        /* renamed from: b */
        final /* synthetic */ Context f101855b;

        /* renamed from: c */
        final /* synthetic */ C43848b f101856c;

        /* renamed from: d */
        final /* synthetic */ C43850d f101857d;

        static {
            Covode.recordClassIndex(51961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43697n(OrderSubmitViewModel orderSubmitViewModel, Context context, C43848b bVar, C43850d dVar) {
            super(1);
            this.f101854a = orderSubmitViewModel;
            this.f101855b = context;
            this.f101856c = bVar;
            this.f101857d = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$n$a */
        public static final class C43699a implements AbstractC44169u {

            /* renamed from: a */
            final /* synthetic */ C43697n f101859a;

            static {
                Covode.recordClassIndex(51963);
            }

            @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.AbstractC44169u
            /* renamed from: b */
            public final void mo74429b() {
                this.f101859a.f101854a.mo33689c(C43700a.f101860a);
            }

            @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.AbstractC44169u
            /* renamed from: a */
            public final void mo74428a() {
                this.f101859a.f101854a.mo74412a("next");
                this.f101859a.f101854a.mo33689c(C43701b.f101861a);
            }

            C43699a(C43697n nVar) {
                this.f101859a = nVar;
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$n$a$a */
            static final class C43700a extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

                /* renamed from: a */
                public static final C43700a f101860a = new C43700a();

                static {
                    Covode.recordClassIndex(51964);
                }

                C43700a() {
                    super(1);
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                    OrderSubmitState orderSubmitState2 = orderSubmitState;
                    C89219l.m154721d(orderSubmitState2, "");
                    return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 4, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16776191, null);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$n$a$b */
            static final class C43701b extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

                /* renamed from: a */
                public static final C43701b f101861a = new C43701b();

                static {
                    Covode.recordClassIndex(51965);
                }

                C43701b() {
                    super(1);
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                    OrderSubmitState orderSubmitState2 = orderSubmitState;
                    C89219l.m154721d(orderSubmitState2, "");
                    return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 4, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16759807, null);
                }
            }
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            C28022o oVar;
            C44077f fVar;
            List<String> list;
            String str;
            Boolean bool;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            if (this.f101855b == null) {
                C22708a.m42800a("create order context null");
            }
            if (this.f101855b != null) {
                final C44170v.C44171a aVar = new C44170v.C44171a(this.f101855b);
                C43848b bVar = this.f101856c;
                String str2 = null;
                if (bVar != null) {
                    oVar = bVar.f102161c;
                } else {
                    oVar = null;
                }
                aVar.f103001g = oVar;
                C43848b bVar2 = this.f101856c;
                if (bVar2 != null) {
                    fVar = bVar2.f102163e;
                } else {
                    fVar = null;
                }
                aVar.f102999e = fVar;
                C43848b bVar3 = this.f101856c;
                if (bVar3 != null) {
                    list = bVar3.f102159a;
                } else {
                    list = null;
                }
                aVar.f102996b = list;
                C43848b bVar4 = this.f101856c;
                if (bVar4 != null) {
                    str = bVar4.f102164f;
                } else {
                    str = null;
                }
                aVar.f102997c = str;
                C43848b bVar5 = this.f101856c;
                if (bVar5 != null) {
                    bool = bVar5.f102165g;
                } else {
                    bool = null;
                }
                aVar.f102998d = bool;
                aVar.f103004j = "ordersubmit";
                aVar.f103000f = new C43699a(this);
                aVar.f103002h = orderSubmitState2.getUserPaymentInfo();
                T t = this.f101857d.data;
                if (t != null) {
                    str2 = t.f102160b;
                }
                Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
                buildUpon.appendQueryParameter("source", "ordersubmit");
                buildUpon.appendQueryParameter("trackParams", C80342dg.m139300a().mo46674b(this.f101854a.f101770G));
                aVar.mo75013a(this.f101854a.f101770G);
                aVar.f103005k = buildUpon.toString();
                ExecutorC34605m.f81660a.execute(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.C43697n.RunnableC436981 */

                    static {
                        Covode.recordClassIndex(51962);
                    }

                    public final void run() {
                        C44276w.m87003a(aVar.mo75014a());
                    }
                });
            }
            EventCenter.m87158a().mo75479a("ec_order_list_state_changed", "{}");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$ae */
    public static final class C43672ae extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101809a;

        static {
            Covode.recordClassIndex(51936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43672ae(OrderSubmitViewModel orderSubmitViewModel) {
            super(1);
            this.f101809a = orderSubmitViewModel;
        }

        /* renamed from: a */
        private static boolean m86700a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            C17867d.m33078a();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m86700a();
            }
            if (!C58029j.f132253e) {
                if (orderSubmitState2.getLoadSuccess() || orderSubmitState2.getPageLoadStatus() == 2 || orderSubmitState2.getPageLoadStatus() == 3) {
                    this.f101809a.mo33689c(C436731.f101810a);
                } else {
                    this.f101809a.mo74403a(2);
                }
            } else if (orderSubmitState2.getLoadSuccess()) {
                this.f101809a.mo33689c(C436742.f101811a);
            } else {
                this.f101809a.mo74403a(3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo74402a() {
        mo33687b_(new C43690i(this));
    }

    /* renamed from: h */
    public final void mo74422h() {
        mo33687b_(new C43672ae(this));
    }

    /* renamed from: l */
    public final void mo74426l() {
        IEventCenter a = EventCenter.m87158a();
        a.mo75481b("ec_address_change", this);
        a.mo75481b("ec_address_select", this);
    }

    /* renamed from: b */
    public final void mo74414b() {
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            Keva keva = this.f101802x;
            if (keva != null) {
                keva.storeString("ecom_last_quit_reason_time_stamp", valueOf);
            }
        } catch (Throwable unused) {
            C22708a.m42800a("Keva Write Quit Reason Time Fail");
        }
    }

    /* renamed from: k */
    public final void mo74425k() {
        C43732h.m86732a(this.f101794p, this.f101796r, Boolean.valueOf(this.f101765B), Boolean.valueOf(this.f101766C), mo74424j(), (Long) null, (String) null, (String) null, 480);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ OrderSubmitState mo23027d() {
        return new OrderSubmitState(0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777215, null);
    }

    /* renamed from: i */
    public final String mo74423i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> hashMap = this.f101769F;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        linkedHashMap.put("previous_page", "order_submit");
        linkedHashMap.putAll(mo74424j());
        return C80342dg.m139300a().mo46674b(linkedHashMap);
    }

    /* renamed from: g */
    public final String mo74421g() {
        if (this.f101782a == 0) {
            return "-1";
        }
        ArrayList arrayList = new ArrayList();
        List<OrderShopDigest> list = this.f101784c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<OrderSKUDTO> orderSKUs = it.next().getOrderSKUs();
                if (orderSKUs != null) {
                    Iterator<T> it2 = orderSKUs.iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().f103634d;
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        return C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        mo74426l();
        if (this.f101773J != null) {
            String str = this.f101772I;
            C89219l.m154721d(str, "");
            C43831a aVar = C43831a.f102127d.get(str);
            if (aVar != null) {
                AbstractC89699w<BillInfoResponse> wVar = aVar.f102129b;
                if (wVar != null && wVar.mo143993b()) {
                    AbstractC89699w<BillInfoResponse> wVar2 = aVar.f102129b;
                    if (wVar2 != null) {
                        wVar2.mo143985a((CancellationException) null);
                    }
                    aVar.f102129b = null;
                }
                AbstractC88412b bVar = aVar.f102130c;
                if (bVar != null) {
                    bVar.dispose();
                }
                aVar.f102130c = null;
            }
            C43831a.f102127d.remove(str);
        }
        this.f101779Q = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x0220 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.String, java.lang.Object> mo74424j() {
        /*
        // Method dump skipped, instructions count: 605
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.mo74424j():java.util.HashMap");
    }

    /* renamed from: a */
    public final void mo74412a(String str) {
        C89219l.m154721d(str, "");
        this.f101796r = str;
    }

    /* renamed from: b */
    public final void mo74415b(int i) {
        mo33689c(new C43713w(i));
    }

    /* renamed from: c */
    public final void mo74419c(int i) {
        mo33689c(new C43714x(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$q */
    public static final class C43704q extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        public static final C43704q f101863a = new C43704q();

        static {
            Covode.recordClassIndex(51968);
        }

        C43704q() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            C43732h.m86719a("edit_address", Boolean.valueOf(orderSubmitState2.getReachableAny()), 4);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$t */
    public static final class C43707t extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101873a;

        static {
            Covode.recordClassIndex(51971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43707t(OrderSubmitViewModel orderSubmitViewModel) {
            super(1);
            this.f101873a = orderSubmitViewModel;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            if (orderSubmitState2.getLoadSuccess()) {
                this.f101873a.mo33689c(C437081.f101874a);
            } else {
                this.f101873a.mo74403a(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private final void m86669c(String str) {
        this.f101767D = true;
        this.f101783b = str;
        m86667a(this, false, false, false, false, null, 53);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$i */
    public static final class C43690i extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101841a;

        static {
            Covode.recordClassIndex(51954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43690i(OrderSubmitViewModel orderSubmitViewModel) {
            super(1);
            this.f101841a = orderSubmitViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$i$a */
        static final class C43692a extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

            /* renamed from: a */
            final /* synthetic */ String f101843a;

            static {
                Covode.recordClassIndex(51956);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43692a(String str) {
                super(1);
                this.f101843a = str;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                OrderSubmitState orderSubmitState2 = orderSubmitState;
                C89219l.m154721d(orderSubmitState2, "");
                return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, new C43750c(this.f101843a), false, 0, null, null, false, 16515071, null);
            }
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            String str;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            C43750c currentPage = orderSubmitState2.getCurrentPage();
            if (currentPage == null || (str = currentPage.f102009a) == null) {
                this.f101841a.mo33689c(new AbstractC89172b<OrderSubmitState, OrderSubmitState>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.C43690i.C436911 */

                    /* renamed from: a */
                    final /* synthetic */ C43690i f101842a;

                    static {
                        Covode.recordClassIndex(51955);
                    }

                    {
                        this.f101842a = r2;
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                        OrderSubmitState orderSubmitState2 = orderSubmitState;
                        String str = "";
                        C89219l.m154721d(orderSubmitState2, str);
                        String str2 = (String) C89070n.m154583g((List) this.f101842a.f101841a.f101774K);
                        if (str2 != null) {
                            str = str2;
                        }
                        return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, new C43750c(str), false, 0, null, null, false, 16515071, null);
                    }
                });
            } else {
                int i = 0;
                Iterator<String> it = this.f101841a.f101774K.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C89219l.m154714a((Object) it.next(), (Object) str)) {
                        break;
                    } else {
                        i++;
                    }
                }
                String str2 = (String) C89070n.m154561b((List) this.f101841a.f101774K, i + 1);
                if (str2 != null) {
                    this.f101841a.mo33689c(new C43692a(str2));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$aa */
    public static final class C43668aa extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ C43750c f101805a;

        static {
            Covode.recordClassIndex(51932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43668aa(C43750c cVar) {
            super(1);
            this.f101805a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, this.f101805a, false, 0, null, null, false, 16515071, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$ab */
    public static final class C43669ab extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ int f101806a;

        static {
            Covode.recordClassIndex(51933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43669ab(int i) {
            super(1);
            this.f101806a = i;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, this.f101806a, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777214, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$ac */
    public static final class C43670ac extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ boolean f101807a;

        static {
            Covode.recordClassIndex(51934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43670ac(boolean z) {
            super(1);
            this.f101807a = z;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, this.f101807a, 8388607, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$ad */
    public static final class C43671ad extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ C44085n f101808a;

        static {
            Covode.recordClassIndex(51935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43671ad(C44085n nVar) {
            super(1);
            this.f101808a = nVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, this.f101808a, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777199, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$af */
    public static final class C43675af extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101812a;

        /* renamed from: b */
        final /* synthetic */ Context f101813b;

        /* renamed from: c */
        final /* synthetic */ String f101814c;

        static {
            Covode.recordClassIndex(51939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43675af(OrderSubmitViewModel orderSubmitViewModel, Context context, String str) {
            super(1);
            this.f101812a = orderSubmitViewModel;
            this.f101813b = context;
            this.f101814c = str;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f101813b.getString(R.string.bhr);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.C43675af.C436761 */

                /* renamed from: a */
                final /* synthetic */ C43675af f101815a;

                static {
                    Covode.recordClassIndex(51940);
                }

                {
                    this.f101815a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C43732h.m86723a("balance_insufficient", "yes", (String) null, this.f101815a.f101814c);
                    this.f101815a.f101812a.mo74406a(this.f101815a.f101813b, false);
                    return C89391z.f203057a;
                }
            });
            String string2 = this.f101813b.getString(R.string.bhs);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.C43675af.C436772 */

                /* renamed from: a */
                final /* synthetic */ C43675af f101816a;

                static {
                    Covode.recordClassIndex(51941);
                }

                {
                    this.f101816a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C43732h.m86723a("balance_insufficient", "no", (String) null, this.f101816a.f101814c);
                    return C89391z.f203057a;
                }
            });
            bVar2.f54513b = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$c */
    static final class C43682c extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101829a;

        static {
            Covode.recordClassIndex(51946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43682c(OrderSubmitViewModel orderSubmitViewModel) {
            super(1);
            this.f101829a = orderSubmitViewModel;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            Boolean bool;
            C44086o oVar;
            C44071a aVar;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            C44085n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo == null || (oVar = userPaymentInfo.f102789b) == null || (aVar = oVar.f102813t) == null) {
                bool = null;
            } else {
                bool = aVar.f102725a;
            }
            if (C89219l.m154714a((Object) false, (Object) bool)) {
                OrderSubmitViewModel.m86667a(this.f101829a, false, false, false, false, null, 63);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$d */
    static final class C43683d extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        public static final C43683d f101830a = new C43683d();

        static {
            Covode.recordClassIndex(51947);
        }

        C43683d() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16744447, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$f */
    public static final class C43685f extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ boolean f101833a;

        static {
            Covode.recordClassIndex(51949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43685f(boolean z) {
            super(1);
            this.f101833a = z;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, this.f101833a, 0, null, null, false, 16252927, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$j */
    public static final class C43693j extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101844a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f101845b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f101846c;

        static {
            Covode.recordClassIndex(51957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43693j(OrderSubmitViewModel orderSubmitViewModel, C89233z.C89238e eVar, C89233z.C89234a aVar) {
            super(1);
            this.f101844a = orderSubmitViewModel;
            this.f101845b = eVar;
            this.f101846c = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            String str;
            C44086o oVar;
            C44086o oVar2;
            String c;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            T t = (T) "";
            C89219l.m154721d(orderSubmitState2, t);
            C89233z.C89238e eVar = this.f101845b;
            C44085n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (!(userPaymentInfo == null || (oVar2 = userPaymentInfo.f102789b) == null || (c = oVar2.mo74952c()) == null)) {
                t = c;
            }
            eVar.element = t;
            C89233z.C89234a aVar = this.f101846c;
            OrderSubmitViewModel orderSubmitViewModel = this.f101844a;
            C44085n userPaymentInfo2 = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo2 == null || (oVar = userPaymentInfo2.f102789b) == null) {
                str = null;
            } else {
                str = oVar.f102794a;
            }
            aVar.element = orderSubmitViewModel.mo74418b(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$k */
    public static final class C43694k extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        public static final C43694k f101847a = new C43694k();

        static {
            Covode.recordClassIndex(51958);
        }

        C43694k() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16760831, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$l */
    public static final class C43695l extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        public static final C43695l f101848a = new C43695l();

        static {
            Covode.recordClassIndex(51959);
        }

        C43695l() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16760831, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$p */
    static final class C43703p extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        public static final C43703p f101862a = new C43703p();

        static {
            Covode.recordClassIndex(51967);
        }

        C43703p() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, new Object(), false, 12582911, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$r */
    public static final class C43705r extends AbstractC89220m implements AbstractC89172b<C44085n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44153r f101864a;

        /* renamed from: b */
        final /* synthetic */ C44067c f101865b;

        /* renamed from: c */
        final /* synthetic */ OrderSubmitViewModel f101866c;

        /* renamed from: d */
        final /* synthetic */ Context f101867d;

        static {
            Covode.recordClassIndex(51969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43705r(C44153r rVar, C44067c cVar, OrderSubmitViewModel orderSubmitViewModel, Context context) {
            super(1);
            this.f101864a = rVar;
            this.f101865b = cVar;
            this.f101866c = orderSubmitViewModel;
            this.f101867d = context;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C44085n nVar) {
            C44085n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            this.f101864a.dismissAllowingStateLoss();
            OrderSubmitViewModel orderSubmitViewModel = this.f101866c;
            C89219l.m154721d(nVar2, "");
            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C43680b(orderSubmitViewModel, nVar2, null), 2);
            C43732h.f101922b = SystemClock.elapsedRealtime();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$v */
    public static final class C43712v extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        public static final C43712v f101882a = new C43712v();

        static {
            Covode.recordClassIndex(51976);
        }

        C43712v() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, orderSubmitState2.getRefreshCouponViewModel() + 1, null, false, 0, null, null, false, 16646143, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$w */
    public static final class C43713w extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ int f101883a;

        static {
            Covode.recordClassIndex(51977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43713w(int i) {
            super(1);
            this.f101883a = i;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, this.f101883a, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16776191, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$x */
    public static final class C43714x extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ int f101884a;

        static {
            Covode.recordClassIndex(51978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43714x(int i) {
            super(1);
            this.f101884a = i;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, null, null, 0, 0, this.f101884a, null, null, false, false, null, 0, null, false, 0, null, null, false, 16775167, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$y */
    public static final class C43715y extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ String f101885a;

        static {
            Covode.recordClassIndex(51979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43715y(String str) {
            super(1);
            this.f101885a = str;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, false, this.f101885a, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777087, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$z */
    public static final class C43716z extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

        /* renamed from: a */
        final /* synthetic */ boolean f101886a;

        static {
            Covode.recordClassIndex(51980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43716z(boolean z) {
            super(1);
            this.f101886a = z;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            return OrderSubmitState.copy$default(orderSubmitState2, 0, null, null, false, null, false, this.f101886a, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777151, null);
        }
    }

    /* renamed from: a */
    public final void mo74403a(int i) {
        mo33689c(new C43669ab(i));
    }

    /* renamed from: b */
    public final void mo74416b(Context context) {
        mo33687b_(new C43686g(this, context));
    }

    /* renamed from: c */
    public final void mo74420c(boolean z) {
        mo33689c(new C43670ac(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$b */
    public static final class C43680b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f101825a;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitViewModel f101826b;

        /* renamed from: c */
        final /* synthetic */ C44085n f101827c;

        static {
            Covode.recordClassIndex(51944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43680b(OrderSubmitViewModel orderSubmitViewModel, C44085n nVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f101826b = orderSubmitViewModel;
            this.f101827c = nVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C43680b(this.f101826b, this.f101827c, dVar);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C43680b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f101825a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f101826b.f101767D = true;
                AbstractC89699w a = OrderSubmitViewModel.m86667a(this.f101826b, false, false, false, false, null, 48);
                this.f101825a = 1;
                if (a.mo144106a((AbstractC89124d) this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f101826b.mo33689c(new AbstractC89172b<OrderSubmitState, OrderSubmitState>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.C43680b.C436811 */

                /* renamed from: a */
                final /* synthetic */ C43680b f101828a;

                static {
                    Covode.recordClassIndex(51945);
                }

                {
                    this.f101828a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                    OrderSubmitState orderSubmitState2 = orderSubmitState;
                    C89219l.m154721d(orderSubmitState2, "");
                    return OrderSubmitState.copy$default(orderSubmitState2, 0, this.f101828a.f101826b.mo74401a(this.f101828a.f101826b.f101789k, orderSubmitState2.getHasAddress(), this.f101828a.f101827c.f102789b, true), null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777213, null);
                }
            });
            this.f101826b.mo74410a(this.f101827c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$m */
    public static final class C43696m extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101849a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f101850b;

        /* renamed from: c */
        final /* synthetic */ C43850d f101851c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f101852d;

        /* renamed from: e */
        final /* synthetic */ long f101853e;

        static {
            Covode.recordClassIndex(51960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43696m(OrderSubmitViewModel orderSubmitViewModel, C89233z.C89234a aVar, C43850d dVar, C89233z.C89238e eVar, long j) {
            super(1);
            this.f101849a = orderSubmitViewModel;
            this.f101850b = aVar;
            this.f101851c = dVar;
            this.f101852d = eVar;
            this.f101853e = j;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            String str;
            List<String> list;
            String a;
            C44086o oVar;
            OrderSubmitState orderSubmitState2 = orderSubmitState;
            String str2 = "";
            C89219l.m154721d(orderSubmitState2, str2);
            C89233z.C89234a aVar = this.f101850b;
            OrderSubmitViewModel orderSubmitViewModel = this.f101849a;
            C44085n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo == null || (oVar = userPaymentInfo.f102789b) == null) {
                str = null;
            } else {
                str = oVar.f102794a;
            }
            aVar.element = orderSubmitViewModel.mo74418b(str);
            boolean z = this.f101849a.f101765B;
            boolean z2 = this.f101849a.f101766C;
            T t = this.f101851c.data;
            if (!(t == null || (list = t.f102159a) == null || (a = C89070n.m154551a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)) == null)) {
                str2 = a;
            }
            C43732h.m86735a(z, z2, str2, true, "", this.f101849a.mo74424j(), this.f101852d.element, SystemClock.elapsedRealtime() - this.f101853e, this.f101849a.mo74421g(), Boolean.valueOf(this.f101850b.element));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m86666a(HashMap<String, Object> hashMap) {
        Map map = null;
        try {
            C27910f fVar = new C27910f();
            Object obj = hashMap != null ? hashMap.get("entrance_info") : null;
            if (obj != null) {
                map = (Map) fVar.mo46671a((String) obj, new C43702o().type);
                List<String> list = C43321d.m86440a().f101113a;
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (list.contains(entry.getKey())) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                }
                String jSONObject2 = jSONObject.toString();
                C89219l.m154716b(jSONObject2, "");
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo74417b(boolean z) {
        mo33689c(new C43685f(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$e */
    static final class C43684e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f101831a;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitViewModel f101832b;

        static {
            Covode.recordClassIndex(51948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43684e(OrderSubmitViewModel orderSubmitViewModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f101832b = orderSubmitViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C43684e(this.f101832b, dVar);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C43684e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Long l;
            String string;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f101831a;
            C43612a aVar2 = null;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    int a = C16048b.m29633a().mo25412a(true, "ecom_quit_checkout_reason_collection_config", -1);
                    if (a >= 0) {
                        this.f101832b.f101802x = Keva.getRepo("ecom_keva_store");
                        Keva keva = this.f101832b.f101802x;
                        if (keva == null || (string = keva.getString("ecom_last_quit_reason_time_stamp", null)) == null) {
                            l = null;
                        } else {
                            l = C89108b.m154611a(Long.parseLong(string));
                        }
                        if (l == null) {
                            l = C89108b.m154611a(0L);
                        }
                        if ((System.currentTimeMillis() - l.longValue()) / 86400000 >= ((long) a)) {
                            if (this.f101832b.f101773J != null) {
                                this.f101831a = 1;
                                C89134h hVar = new C89134h(C89099b.m154605a(this));
                                ((OrderSubmitApi) OrderSubmitApi.C43842a.f102152a.mo28858a(OrderSubmitApi.class)).getQuitReason(0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C43831a.C43837f(hVar));
                                obj = hVar.mo143576a();
                                if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                                    C89219l.m154721d(this, "");
                                }
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            if (aVar2 != null && aVar2.isCodeOK()) {
                                this.f101832b.f101793o = aVar2.data;
                            }
                        }
                    }
                } catch (Throwable unused) {
                    C22708a.m42800a("Get quit reasons fail");
                }
                return C89391z.f203057a;
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (C43612a) obj;
            this.f101832b.f101793o = aVar2.data;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$g */
    public static final class C43686g extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderSubmitViewModel f101834a;

        /* renamed from: b */
        final /* synthetic */ Context f101835b;

        static {
            Covode.recordClassIndex(51950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43686g(OrderSubmitViewModel orderSubmitViewModel, Context context) {
            super(1);
            this.f101834a = orderSubmitViewModel;
            this.f101835b = context;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            Boolean bool;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            C44086o oVar;
            C44086o oVar2;
            C44086o oVar3;
            C44086o oVar4;
            final OrderSubmitState orderSubmitState2 = orderSubmitState;
            C89219l.m154721d(orderSubmitState2, "");
            C44085n userPaymentInfo = orderSubmitState2.getUserPaymentInfo();
            if (userPaymentInfo != null) {
                bool = userPaymentInfo.f102791d;
            } else {
                bool = null;
            }
            if (!C89219l.m154714a((Object) bool, (Object) true)) {
                this.f101834a.mo74417b(true);
            } else {
                this.f101834a.mo33689c(C436871.f101836a);
                C44085n userPaymentInfo2 = orderSubmitState2.getUserPaymentInfo();
                if (userPaymentInfo2 == null || (oVar4 = userPaymentInfo2.f102789b) == null) {
                    str = null;
                } else {
                    str = oVar4.f102796c;
                }
                C44085n userPaymentInfo3 = orderSubmitState2.getUserPaymentInfo();
                if (userPaymentInfo3 == null || (oVar3 = userPaymentInfo3.f102789b) == null) {
                    str2 = null;
                } else {
                    str2 = oVar3.f102797d;
                }
                if (!C89219l.m154714a((Object) str, (Object) str2)) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                C44085n userPaymentInfo4 = orderSubmitState2.getUserPaymentInfo();
                if (userPaymentInfo4 == null || (oVar2 = userPaymentInfo4.f102789b) == null || (str4 = oVar2.mo74952c()) == null) {
                    str4 = "";
                }
                boolean z = this.f101834a.f101765B;
                boolean z2 = this.f101834a.f101766C;
                HashMap<String, Object> j = this.f101834a.mo74424j();
                OrderSubmitViewModel orderSubmitViewModel = this.f101834a;
                C44085n userPaymentInfo5 = orderSubmitState2.getUserPaymentInfo();
                if (userPaymentInfo5 == null || (oVar = userPaymentInfo5.f102789b) == null) {
                    str5 = null;
                } else {
                    str5 = oVar.f102794a;
                }
                Boolean valueOf = Boolean.valueOf(orderSubmitViewModel.mo74418b(str5));
                C89219l.m154721d(str4, "");
                C89219l.m154721d(j, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(C43732h.f101921a);
                linkedHashMap.put("pay_type", str4);
                linkedHashMap.put("is_edit_address", Integer.valueOf(z ? 1 : 0));
                linkedHashMap.put("is_edit_quantity", Integer.valueOf(z2 ? 1 : 0));
                linkedHashMap.put("is_edit_pay_method", str3);
                if (valueOf != null) {
                    linkedHashMap.put("is_pay_saved", Integer.valueOf(valueOf.booleanValue() ? 1 : 0));
                }
                linkedHashMap.putAll(j);
                C45544c.m88082a("tiktokec_pay_order", linkedHashMap);
                AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.C43686g.C436882 */

                    /* renamed from: a */
                    long f101837a;

                    /* renamed from: b */
                    int f101838b;

                    /* renamed from: c */
                    final /* synthetic */ C43686g f101839c;

                    static {
                        Covode.recordClassIndex(51952);
                    }

                    {
                        this.f101839c = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$u */
                        public static final class C43709u extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f101875a;

                            /* renamed from: b */
                            final /* synthetic */ OrderSubmitViewModel f101876b;

                            /* renamed from: c */
                            final /* synthetic */ BillInfoRequest f101877c;

                            /* renamed from: d */
                            final /* synthetic */ boolean f101878d;

                            /* renamed from: e */
                            final /* synthetic */ AbstractC89699w f101879e;

                            static {
                                Covode.recordClassIndex(51973);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C43709u(OrderSubmitViewModel orderSubmitViewModel, BillInfoRequest billInfoRequest, boolean z, AbstractC89699w wVar, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f101876b = orderSubmitViewModel;
                                this.f101877c = billInfoRequest;
                                this.f101878d = z;
                                this.f101879e = wVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C43709u(this.f101876b, this.f101877c, this.f101878d, this.f101879e, dVar);
                            }

                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C43709u) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                                /*
                                // Method dump skipped, instructions count: 129
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.C43709u.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        /* renamed from: b */
                        public final boolean mo74418b(String str) {
                            BillInfoData billInfoData;
                            C44089r paymentMethods;
                            List<C44086o> list;
                            if (str != null && str.length() != 0 && (billInfoData = this.f101789k) != null && (paymentMethods = billInfoData.getPaymentMethods()) != null && (list = paymentMethods.f102823c) != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (C89219l.m154714a((Object) next.f102794a, (Object) str)) {
                                        if (next != null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                            return false;
                        }

                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$ag */
                        public static final class C43678ag extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f101817a;

                            /* renamed from: b */
                            final /* synthetic */ OrderSubmitViewModel f101818b;

                            /* renamed from: c */
                            final /* synthetic */ C43864r f101819c;

                            static {
                                Covode.recordClassIndex(51942);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C43678ag(OrderSubmitViewModel orderSubmitViewModel, C43864r rVar, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f101818b = orderSubmitViewModel;
                                this.f101819c = rVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C43678ag(this.f101818b, this.f101819c, dVar);
                            }

                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C43678ag) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                C43612a aVar;
                                EnumC89098a aVar2 = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f101817a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        List<OrderShopDigest> list = this.f101818b.f101784c;
                                        if (list != null) {
                                            Iterator<T> it = list.iterator();
                                            while (it.hasNext()) {
                                                List<OrderSKUDTO> orderSKUs = it.next().getOrderSKUs();
                                                if (orderSKUs != null) {
                                                    for (T t : orderSKUs) {
                                                        arrayList.add(new C43863q(t.f103631a, t.f103632b));
                                                    }
                                                }
                                            }
                                        }
                                        C43865s sVar = new C43865s(this.f101819c.f102238a, this.f101819c.f102239b, this.f101819c.f102240c, C80342dg.m139300a().mo46674b(new C43853g(arrayList)));
                                        if (this.f101818b.f101773J != null) {
                                            this.f101817a = 1;
                                            C89134h hVar = new C89134h(C89099b.m154605a(this));
                                            C89219l.m154721d(sVar, "");
                                            ((OrderSubmitApi) OrderSubmitApi.C43842a.f102152a.mo28858a(OrderSubmitApi.class)).submitQuitReason(sVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C43831a.C43840i(hVar));
                                            obj = hVar.mo143576a();
                                            if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                                                C89219l.m154721d(this, "");
                                            }
                                            if (obj == aVar2) {
                                                return aVar2;
                                            }
                                        } else {
                                            aVar = null;
                                            if (aVar != null || aVar.isCodeOK()) {
                                                new C79459a(C17867d.m33078a()).mo123052a(C17867d.m33078a().getResources().getString(R.string.bgf)).mo123053a();
                                                return C89391z.f203057a;
                                            }
                                            String str = aVar.message;
                                            if (str != null) {
                                                new C79459a(C17867d.m33078a()).mo123052a(str).mo123053a();
                                            }
                                            return C89391z.f203057a;
                                        }
                                    } catch (Throwable unused) {
                                        C22708a.m42800a("Submit Quit Reason Fail");
                                    }
                                } else if (i == 1) {
                                    C89382r.m154942a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar = (C43612a) obj;
                                if (aVar != null) {
                                }
                                new C79459a(C17867d.m33078a()).mo123052a(C17867d.m33078a().getResources().getString(R.string.bgf)).mo123053a();
                                return C89391z.f203057a;
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$ah */
                        public static final class C43679ah extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, OrderSubmitState> {

                            /* renamed from: a */
                            final /* synthetic */ boolean f101820a;

                            /* renamed from: b */
                            final /* synthetic */ BillInfoData f101821b;

                            /* renamed from: c */
                            final /* synthetic */ C44086o f101822c;

                            /* renamed from: d */
                            final /* synthetic */ OrderSubmitViewModel f101823d;

                            /* renamed from: e */
                            final /* synthetic */ BillInfoRequest f101824e;

                            static {
                                Covode.recordClassIndex(51943);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C43679ah(boolean z, BillInfoData billInfoData, C44086o oVar, OrderSubmitViewModel orderSubmitViewModel, BillInfoRequest billInfoRequest) {
                                super(1);
                                this.f101820a = z;
                                this.f101821b = billInfoData;
                                this.f101822c = oVar;
                                this.f101823d = orderSubmitViewModel;
                                this.f101824e = billInfoRequest;
                            }

                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
                                boolean z;
                                ArrayList arrayList;
                                int i;
                                List<BillItem> billItems;
                                String str;
                                Image image;
                                OrderSubmitState orderSubmitState2 = orderSubmitState;
                                C89219l.m154721d(orderSubmitState2, "");
                                boolean z2 = this.f101820a;
                                String total = this.f101821b.getTotal();
                                int totalItems = this.f101821b.getTotalItems();
                                boolean z3 = this.f101823d.f101768E;
                                OrderSubmitViewModel orderSubmitViewModel = this.f101823d;
                                BillInfoData billInfoData = this.f101821b;
                                boolean z4 = this.f101820a;
                                C44086o oVar = this.f101822c;
                                if (oVar == null) {
                                    C44089r paymentMethods = billInfoData.getPaymentMethods();
                                    oVar = paymentMethods != null ? paymentMethods.mo74973a() : null;
                                }
                                if (this.f101822c != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                List<Object> a = orderSubmitViewModel.mo74401a(billInfoData, z4, oVar, z);
                                BillInfoData billInfoData2 = this.f101821b;
                                C89219l.m154721d(billInfoData2, "");
                                Summary summary = billInfoData2.getSummary();
                                if (summary == null || (billItems = summary.getBillItems()) == null) {
                                    arrayList = C89086z.INSTANCE;
                                } else {
                                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) billItems, 10));
                                    for (T t : billItems) {
                                        String itemName = t.getItemName();
                                        if (itemName == null) {
                                            itemName = "";
                                        }
                                        Price itemPrice = t.getItemPrice();
                                        if (itemPrice == null || (str = itemPrice.getPriceStr()) == null) {
                                            str = "";
                                        }
                                        Price itemPrice2 = t.getItemPrice();
                                        Integer priceTextColor = itemPrice2 != null ? itemPrice2.getPriceTextColor() : null;
                                        Icon logo = t.getLogo();
                                        String str2 = logo != null ? logo.f101643c : null;
                                        Icon logo2 = t.getLogo();
                                        arrayList2.add(new C43748i(itemName, str, priceTextColor, str2, (logo2 == null || (image = logo2.f101641a) == null) ? null : image.toImageUrlModel(), t.getItemTextColor(), t.getItemType()));
                                    }
                                    arrayList = arrayList2;
                                }
                                C43749j jVar = new C43749j(arrayList);
                                VoucherInfo voucherInfo = this.f101821b.getVoucherInfo();
                                List<ShopOrder> shopOrders = this.f101821b.getShopOrders();
                                if (shopOrders != null) {
                                    i = shopOrders.size();
                                } else {
                                    i = 0;
                                }
                                return OrderSubmitState.copy$default(orderSubmitState2, 0, a, jVar, z2, null, z3, false, null, total, totalItems, 0, 0, null, null, false, true, voucherInfo, 0, null, false, i, this.f101821b.getBottomNotice(), null, false, 13532369, null);
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel$s */
                        public static final class C43706s extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f101868a;

                            /* renamed from: b */
                            final /* synthetic */ OrderSubmitViewModel f101869b;

                            /* renamed from: c */
                            final /* synthetic */ Context f101870c;

                            /* renamed from: d */
                            final /* synthetic */ List f101871d;

                            /* renamed from: e */
                            final /* synthetic */ C43745f f101872e;

                            static {
                                Covode.recordClassIndex(51970);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public C43706s(OrderSubmitViewModel orderSubmitViewModel, Context context, List list, C43745f fVar, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f101869b = orderSubmitViewModel;
                                this.f101870c = context;
                                this.f101871d = list;
                                this.f101872e = fVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C43706s(this.f101869b, this.f101870c, this.f101871d, this.f101872e, dVar);
                            }

                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C43706s) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                                /*
                                // Method dump skipped, instructions count: 322
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel.C43706s.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        /* renamed from: a */
                        public final C43849c mo74400a(OrderSubmitState orderSubmitState) {
                            Object obj;
                            List<BillItem> list;
                            Price price;
                            String str;
                            ArrayList arrayList;
                            String str2;
                            ShippingAddress shippingAddress;
                            VoucherInfo voucherInfo;
                            List<Voucher> vouchers;
                            ShippingAddress shippingAddress2;
                            Address shippingAddress3;
                            Summary summary;
                            Summary summary2;
                            List<ShopOrder> shopOrders;
                            Object obj2;
                            int i;
                            LogisticDTO logisticDTO;
                            T t;
                            String str3;
                            LogisticDTO logisticDTO2;
                            T t2;
                            int i2;
                            String str4;
                            String a;
                            Object obj3;
                            List<C43747h> list2;
                            T t3;
                            Object obj4;
                            HashMap<String, Object> hashMap = this.f101770G;
                            HashMap<String, Object> hashMap2 = this.f101769F;
                            if (hashMap2 != null) {
                                hashMap.putAll(hashMap2);
                            }
                            hashMap.remove("product_id");
                            hashMap.remove("author_id");
                            Object obj5 = hashMap.get("entrance_info");
                            if (!(obj5 instanceof String)) {
                                obj5 = null;
                            }
                            try {
                                obj = C45264j.m87844a().mo46670a((String) obj5, HashMap.class);
                            } catch (Exception unused) {
                                obj = null;
                            }
                            HashMap hashMap3 = (HashMap) obj;
                            if (hashMap3 != null) {
                                hashMap3.remove("product_id");
                                hashMap3.remove("author_id");
                            } else {
                                hashMap3 = null;
                            }
                            hashMap.put("entrance_info", C80342dg.m139300a().mo46674b(hashMap3));
                            HashMap<String, Object> hashMap4 = this.f101769F;
                            if (!(hashMap4 == null || (obj4 = hashMap4.get("previous_page")) == null || !(obj4 instanceof String))) {
                                hashMap.put("previous_page", obj4);
                            }
                            hashMap.putAll(mo74424j());
                            C44085n userPaymentInfo = orderSubmitState.getUserPaymentInfo();
                            int i3 = this.f101782a;
                            String valueOf = String.valueOf(this.f101801w);
                            ArrayList arrayList2 = new ArrayList();
                            List a2 = C89070n.m154544a((Iterable<?>) orderSubmitState.getAdapterList(), C43745f.class);
                            BillInfoData billInfoData = this.f101789k;
                            if (!(billInfoData == null || (shopOrders = billInfoData.getShopOrders()) == null)) {
                                for (T t4 : shopOrders) {
                                    Iterator it = a2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it.next();
                                        C43745f fVar = (C43745f) obj2;
                                        if (C89219l.m154714a((Object) fVar.f101978a, (Object) t4.getSellerId()) && C89219l.m154714a((Object) fVar.f101979b, (Object) t4.getWarehouseId())) {
                                            break;
                                        }
                                    }
                                    C43745f fVar2 = (C43745f) obj2;
                                    ArrayList arrayList3 = new ArrayList();
                                    List<PackedSku> packedSkus = t4.getPackedSkus();
                                    if (packedSkus != null) {
                                        for (T t5 : packedSkus) {
                                            if (fVar2 == null || (list2 = fVar2.f101982e) == null) {
                                                t2 = null;
                                            } else {
                                                Iterator<T> it2 = list2.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        t3 = null;
                                                        break;
                                                    }
                                                    t3 = it2.next();
                                                    if (C89219l.m154714a((Object) t3.f101990a, (Object) t5.getSkuId())) {
                                                        break;
                                                    }
                                                }
                                                t2 = t3;
                                            }
                                            String productId = t5.getProductId();
                                            if (productId == null) {
                                                productId = "";
                                            }
                                            String skuId = t5.getSkuId();
                                            if (skuId == null) {
                                                skuId = "";
                                            }
                                            if (t2 != null) {
                                                i2 = t2.f101991b;
                                            } else {
                                                i2 = 1;
                                            }
                                            SkuPrice price2 = t5.getPrice();
                                            if (price2 == null) {
                                                price2 = new SkuPrice(null, null, null, 7, null);
                                            }
                                            if (this.f101782a == 1) {
                                                str4 = t5.getChainKey();
                                            } else {
                                                str4 = this.f101786e;
                                            }
                                            if (this.f101782a == 1) {
                                                a = t5.getEntranceInfo();
                                            } else {
                                                a = m86666a(this.f101769F);
                                            }
                                            String cartItemId = t5.getCartItemId();
                                            Integer valueOf2 = Integer.valueOf(IPdpStarter.C44631a.m87368a(this.f101769F));
                                            String sourceInfo = t5.getSourceInfo();
                                            HashMap<String, Object> hashMap5 = this.f101769F;
                                            if (hashMap5 != null) {
                                                obj3 = hashMap5.get("author_id");
                                            } else {
                                                obj3 = null;
                                            }
                                            arrayList3.add(new C43851e(productId, skuId, i2, price2, str4, a, cartItemId, valueOf2, sourceInfo, String.valueOf(obj3)));
                                        }
                                    }
                                    String sellerId = t4.getSellerId();
                                    if (sellerId == null) {
                                        sellerId = "";
                                    }
                                    String warehouseId = t4.getWarehouseId();
                                    if (warehouseId == null) {
                                        warehouseId = "";
                                    }
                                    List<LogisticDTO> logistics = t4.getLogistics();
                                    if (logistics != null) {
                                        Iterator<T> it3 = logistics.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it3.next();
                                            String str5 = t.f103624k;
                                            if (fVar2 == null || (logisticDTO2 = fVar2.f101984g) == null) {
                                                str3 = null;
                                            } else {
                                                str3 = logisticDTO2.f103624k;
                                            }
                                            if (C89219l.m154714a((Object) str5, (Object) str3)) {
                                                break;
                                            }
                                        }
                                        T t6 = t;
                                        if (t6 != null) {
                                            i = t6.f103614a;
                                            if (fVar2 != null || (logisticDTO = fVar2.f101984g) == null || (r4 = logisticDTO.f103624k) == null) {
                                                String str6 = "";
                                            }
                                            arrayList2.add(new C43856j(arrayList3, sellerId, warehouseId, i, str6, this.f101798t));
                                        }
                                    }
                                    i = 0;
                                    if (fVar2 != null) {
                                    }
                                    String str62 = "";
                                    arrayList2.add(new C43856j(arrayList3, sellerId, warehouseId, i, str62, this.f101798t));
                                }
                            }
                            BillInfoData billInfoData2 = this.f101789k;
                            if (billInfoData2 == null || (summary2 = billInfoData2.getSummary()) == null) {
                                list = null;
                            } else {
                                list = summary2.getBillItems();
                            }
                            BillInfoData billInfoData3 = this.f101789k;
                            if (billInfoData3 == null || (summary = billInfoData3.getSummary()) == null) {
                                price = null;
                            } else {
                                price = summary.getTotal();
                            }
                            C43859m mVar = new C43859m(list, price);
                            BillInfoData billInfoData4 = this.f101789k;
                            if (billInfoData4 == null || (shippingAddress2 = billInfoData4.getShippingAddress()) == null || (shippingAddress3 = shippingAddress2.getShippingAddress()) == null || (str = shippingAddress3.f101191e) == null) {
                                str = "";
                            }
                            BillInfoData billInfoData5 = this.f101789k;
                            if (billInfoData5 == null || (voucherInfo = billInfoData5.getVoucherInfo()) == null || (vouchers = voucherInfo.getVouchers()) == null) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                for (T t7 : vouchers) {
                                    if (C89219l.m154714a((Object) t7.getSelected(), (Object) true)) {
                                        arrayList4.add(t7);
                                    }
                                }
                                ArrayList<Voucher> arrayList5 = arrayList4;
                                ArrayList arrayList6 = new ArrayList(C89070n.m154526a((Iterable) arrayList5, 10));
                                for (Voucher voucher : arrayList5) {
                                    String voucherID = voucher.getVoucherID();
                                    if (voucherID == null) {
                                        voucherID = "";
                                    }
                                    arrayList6.add(new C43866t(voucherID, voucher.getVoucherTypeID()));
                                }
                                arrayList = arrayList6;
                            }
                            BillInfoData billInfoData6 = this.f101789k;
                            if (billInfoData6 != null) {
                                str2 = billInfoData6.getOrderSecret();
                            } else {
                                str2 = null;
                            }
                            List<String> list3 = this.f101776M;
                            C44087p pVar = C44070d.m86906a(userPaymentInfo, false);
                            Address address = null;
                            String a3 = C44276w.m87002a(null, null, "ordersubmit", userPaymentInfo, this.f101770G, null);
                            String a4 = C44276w.m87000a("ordersubmit", userPaymentInfo, this.f101770G);
                            C43858l a5 = C44092e.C44093a.m86919a();
                            BillInfoData billInfoData7 = this.f101789k;
                            if (!(billInfoData7 == null || (shippingAddress = billInfoData7.getShippingAddress()) == null)) {
                                address = shippingAddress.getShippingAddress();
                            }
                            return new C43849c(valueOf, arrayList2, mVar, str, arrayList, str2, true, pVar, a3, a4, null, list3, i3, a5, address, 1024);
                        }

                        /* renamed from: a */
                        public final void mo74404a(Context context) {
                            String str;
                            C43852f schemaInfo;
                            this.f101796r = "next";
                            this.f101803y = true;
                            List<Region> list = this.f101785d;
                            String i = mo74423i();
                            BillInfoData billInfoData = this.f101789k;
                            if (billInfoData == null || (schemaInfo = billInfoData.getSchemaInfo()) == null) {
                                str = null;
                            } else {
                                str = schemaInfo.f102193c;
                            }
                            AddressPageStarter.m86450a(context, null, list, "order_submit", false, i, str, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                            C43732h.m86717a("top");
                            this.f101765B = true;
                        }

                        /* renamed from: a */
                        public final List<Object> mo74401a(BillInfoData billInfoData, boolean z, C44086o oVar, boolean z2) {
                            Address address;
                            String str;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            String str7;
                            Boolean bool;
                            Boolean bool2;
                            List<C44086o> list;
                            List<String> list2;
                            String str8;
                            C44091t tVar;
                            VoucherInfo voucherInfo;
                            List<Voucher> vouchers;
                            ArrayList arrayList = new ArrayList();
                            if (billInfoData != null) {
                                List<Announcement> announcement = billInfoData.getAnnouncement();
                                if (announcement != null) {
                                    for (T t : announcement) {
                                        C89219l.m154721d(t, "");
                                        String announcementId = t.getAnnouncementId();
                                        if (announcementId == null) {
                                            announcementId = "";
                                        }
                                        String text = t.getText();
                                        if (text == null) {
                                            text = "";
                                        }
                                        Image icon = t.getIcon();
                                        String link = t.getLink();
                                        if (link == null) {
                                            link = "";
                                        }
                                        arrayList.add(new C43741b(announcementId, text, icon, link, t.getBackground()));
                                    }
                                }
                                if (billInfoData.getAnnouncement() != null && (!billInfoData.getAnnouncement().isEmpty())) {
                                    arrayList.add(new C44954h(8.0f, false, C0643b.m2378c(C17879g.m33104a(), R.color.az), 4));
                                }
                                C89219l.m154721d(billInfoData, "");
                                ShippingAddress shippingAddress = billInfoData.getShippingAddress();
                                if (shippingAddress != null) {
                                    address = shippingAddress.getShippingAddress();
                                } else {
                                    address = null;
                                }
                                if (address != null) {
                                    str = address.mo73871a(StringSet.name);
                                    str2 = address.mo73871a("phone");
                                    str3 = Address.m86475a(address);
                                    str4 = address.mo73873b();
                                    str5 = address.mo73871a("zipcode");
                                    str6 = address.mo73871a("email");
                                } else {
                                    str = null;
                                    str2 = null;
                                    str3 = null;
                                    str4 = null;
                                    str5 = null;
                                    str6 = null;
                                }
                                ShippingAddress shippingAddress2 = billInfoData.getShippingAddress();
                                if (shippingAddress2 != null) {
                                    str7 = shippingAddress2.getInvalidHintMessage();
                                } else {
                                    str7 = null;
                                }
                                ShippingAddress shippingAddress3 = billInfoData.getShippingAddress();
                                if (shippingAddress3 != null) {
                                    bool = shippingAddress3.getAddressReachable();
                                } else {
                                    bool = null;
                                }
                                ShippingAddress shippingAddress4 = billInfoData.getShippingAddress();
                                if (shippingAddress4 != null) {
                                    bool2 = shippingAddress4.getAddressValid();
                                } else {
                                    bool2 = null;
                                }
                                arrayList.add(new C43740a(str, str2, str3, str4, str5, z, str6, str7, bool, bool2));
                                List<ShopOrder> shopOrders = billInfoData.getShopOrders();
                                if (shopOrders != null) {
                                    Iterator<T> it = shopOrders.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(C43746g.m86741a(it.next(), z, billInfoData.getVoucherInfo()));
                                    }
                                }
                                if (this.f101768E && (voucherInfo = billInfoData.getVoucherInfo()) != null && (vouchers = voucherInfo.getVouchers()) != null && (!vouchers.isEmpty())) {
                                    C89219l.m154721d(billInfoData, "");
                                    arrayList.add(new C43743d(billInfoData.getVoucherInfo()));
                                }
                                C44089r paymentMethods = billInfoData.getPaymentMethods();
                                if (paymentMethods != null) {
                                    list = paymentMethods.f102821a;
                                } else {
                                    list = null;
                                }
                                C44089r paymentMethods2 = billInfoData.getPaymentMethods();
                                if (paymentMethods2 == null || (tVar = paymentMethods2.f102830j) == null) {
                                    list2 = null;
                                } else {
                                    list2 = tVar.f102834a;
                                }
                                C44089r paymentMethods3 = billInfoData.getPaymentMethods();
                                if (paymentMethods3 != null) {
                                    str8 = paymentMethods3.f102829i;
                                } else {
                                    str8 = null;
                                }
                                arrayList.add(new C43742c(oVar, list, list2, str8, z2, this.f101768E));
                                if (this.f101768E) {
                                    arrayList.add(new C43939d(C45563h.f106109e, C0643b.m2378c(C17879g.m33104a(), R.color.b7)));
                                }
                                arrayList.add(new C43744e(this.f101768E));
                            }
                            return arrayList;
                        }

                        /* renamed from: a */
                        private AbstractC89699w<C89391z> m86668a(boolean z, boolean z2, boolean z3, boolean z4, List<OrderShopDigest> list) {
                            List list2;
                            String promotionID;
                            List<OrderShopDigest> list3 = list;
                            AbstractC89699w<C89391z> a = C89702y.m155736a();
                            mo33687b_(new C43707t(this));
                            String str = this.f101783b;
                            if (list3 == null) {
                                list3 = this.f101784c;
                            }
                            int i = this.f101782a;
                            C44087p a2 = C44070d.m86906a(this.f101792n, false);
                            Voucher voucher = this.f101781S;
                            if (voucher == null || (promotionID = voucher.getPromotionID()) == null || (list2 = C89070n.m154516a(promotionID)) == null) {
                                list2 = C89086z.INSTANCE;
                            }
                            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C43709u(this, new BillInfoRequest(str, i, list3, z, z2, z3, z4, list2, Boolean.valueOf(this.f101780R), this.f101775L, false, a2, null, this.f101777N, this.f101776M, 5120, null), false, a, null), 2);
                            return a;
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* renamed from: a */
                        public static /* synthetic */ AbstractC89699w m86667a(OrderSubmitViewModel orderSubmitViewModel, boolean z, boolean z2, boolean z3, boolean z4, List list, int i) {
                            if ((i & 1) != 0) {
                                z = true;
                            }
                            if ((i & 2) != 0) {
                                z2 = true;
                            }
                            if ((i & 4) != 0) {
                                z3 = true;
                            }
                            if ((i & 8) != 0) {
                                z4 = true;
                            }
                            if ((i & 16) != 0) {
                                list = null;
                            }
                            return orderSubmitViewModel.m86668a(z, z2, z3, z4, list);
                        }
                    }
