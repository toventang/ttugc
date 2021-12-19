package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6171g;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.p2866a.C45683a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45781b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45782c;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.AbstractC45791c;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45790b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45793e;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2870c.C45799c;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.b */
public final class C45711b extends AbstractC45791c<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> implements AbstractC18511d {

    /* renamed from: h */
    public static final C45712a f106450h = new C45712a((byte) 0);

    /* renamed from: A */
    private final Context f106451A;

    /* renamed from: c */
    public Room f106452c;

    /* renamed from: d */
    public Boolean f106453d = false;

    /* renamed from: e */
    public Map<String, String> f106454e = new HashMap();

    /* renamed from: f */
    public Map<String, String> f106455f;

    /* renamed from: g */
    public final C45806a f106456g;

    /* renamed from: j */
    private IIconSlot.SlotViewModel f106457j;

    /* renamed from: k */
    private AbstractC6157ab.AbstractC6158a f106458k;

    /* renamed from: l */
    private String f106459l;

    /* renamed from: m */
    private String f106460m;

    /* renamed from: n */
    private String f106461n;

    /* renamed from: o */
    private String f106462o;

    /* renamed from: p */
    private String f106463p;

    /* renamed from: q */
    private String f106464q;

    /* renamed from: r */
    private String f106465r;

    /* renamed from: s */
    private String f106466s;

    /* renamed from: t */
    private long f106467t;

    /* renamed from: u */
    private long f106468u;

    /* renamed from: v */
    private long f106469v;

    /* renamed from: w */
    private long f106470w;

    /* renamed from: x */
    private DialogInterface$OnCancelListenerC0944d f106471x;

    /* renamed from: y */
    private C45782c f106472y;

    /* renamed from: z */
    private final C45710a f106473z = new C45710a(new C45713b(this), new C45714c());

    static {
        Covode.recordClassIndex(54228);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "ec_shop";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.b$a */
    public static final class C45712a {
        static {
            Covode.recordClassIndex(54229);
        }

        private C45712a() {
        }

        public /* synthetic */ C45712a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.b$c */
    public static final class C45714c extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(54231);
        }

        C45714c() {
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12079f() {
        return this.f106473z;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final List<Integer> mo12069a() {
        return C89070n.m154524c(Integer.valueOf(C45781b.f106656h));
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b, com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.AbstractC45791c
    /* renamed from: d */
    public final void mo12077d() {
        super.mo12077d();
        DialogInterface$OnCancelListenerC0944d dVar = this.f106471x;
        if (dVar != null) {
            dVar.dismissAllowingStateLoss();
        }
        C18494b.m34422b("redeem_live_product_list", this);
        C18494b.m34422b("ec_open_live_bag", this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.b$b */
    public static final class C45713b extends AbstractC6171g {

        /* renamed from: c */
        final /* synthetic */ C45711b f106474c;

        static {
            Covode.recordClassIndex(54230);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45713b(C45711b bVar) {
            this.f106474c = bVar;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6171g
        /* renamed from: a */
        public final void mo12084a(String str) {
            Long l;
            C89219l.m154721d(str, "");
            C45806a aVar = this.f106474c.f106456g;
            Room room = this.f106474c.f106452c;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            Boolean bool = this.f106474c.f106453d;
            Map<String, String> map = this.f106474c.f106454e;
            HashMap hashMap = new HashMap();
            Map<String, String> map2 = this.f106474c.f106455f;
            if (map2 != null) {
                hashMap.putAll(map2);
                hashMap.put("refer", "icon");
                hashMap.put("label", "user_otherclick");
            }
            C45790b.m88393b(aVar, valueOf, bool, map, hashMap, "icon", null, null);
            this.f106474c.m88209a((C45711b) "live_cart", (String) null);
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b, com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.AbstractC45791c
    /* renamed from: a */
    public final void mo12070a(Bundle bundle) {
        super.mo12070a(bundle);
        C18494b.m34417a("redeem_live_product_list", this);
        C18494b.m34417a("ec_open_live_bag", this);
    }

    public C45711b(Context context) {
        C89219l.m154721d(context, "");
        this.f106451A = context;
        String name = C45711b.class.getName();
        C89219l.m154716b(name, "");
        this.f106456g = new C45806a(name);
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        C89219l.m154721d(cVar, "");
        Map<String, Object> map = null;
        if (TextUtils.equals(cVar.f44153a, "redeem_live_product_list")) {
            m88209a("redeem_live_product_list", (Map<String, ? extends Object>) null);
        }
        if (TextUtils.equals(cVar.f44153a, "ec_open_live_bag")) {
            AbstractC18754n nVar = cVar.f44154b;
            if (nVar != null) {
                map = nVar.mo29758b();
            }
            m88209a("ec_open_live_bag", map);
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12072a(IMessage iMessage) {
        Boolean bool;
        C1213t<Boolean> tVar;
        C1213t<String> tVar2;
        if (iMessage instanceof C45781b) {
            C45781b bVar = (C45781b) iMessage;
            if (bVar.f106657i != C45781b.f106653a) {
                return;
            }
            if (bVar.f106658j <= 0) {
                IIconSlot.SlotViewModel slotViewModel = this.f106457j;
                if (slotViewModel != null) {
                    C45799c.m88409a(slotViewModel, false);
                    return;
                }
                return;
            }
            IIconSlot.SlotViewModel slotViewModel2 = this.f106457j;
            if (!(slotViewModel2 == null || (tVar2 = slotViewModel2.f15352c) == null)) {
                tVar2.setValue(String.valueOf(bVar.f106658j));
            }
            IIconSlot.SlotViewModel slotViewModel3 = this.f106457j;
            Long l = null;
            if (slotViewModel3 == null || (tVar = slotViewModel3.f15351b) == null) {
                bool = null;
            } else {
                bool = tVar.getValue();
            }
            if (!C89219l.m154714a((Object) bool, (Object) true)) {
                IIconSlot.SlotViewModel slotViewModel4 = this.f106457j;
                if (slotViewModel4 != null) {
                    C45799c.m88409a(slotViewModel4, true);
                }
                C45806a aVar = this.f106456g;
                Room room = this.f106452c;
                if (room != null) {
                    l = Long.valueOf(room.getId());
                }
                String valueOf = String.valueOf(l);
                Boolean bool2 = this.f106453d;
                Map<String, String> map = this.f106454e;
                HashMap hashMap = new HashMap();
                Map<String, String> map2 = this.f106455f;
                if (map2 != null) {
                    hashMap.putAll(map2);
                    hashMap.put("refer", "icon");
                    hashMap.put("label", "user_othershow");
                }
                C45790b.m88391a(aVar, valueOf, bool2, map, hashMap, "icon", null, null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m88209a(String str, Map<String, ? extends Object> map) {
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        Object obj;
        C1213t<String> tVar;
        String a = C45683a.m88192a();
        if (a.length() > 0) {
            Uri.Builder builder = new Uri.Builder();
            Uri parse = Uri.parse(a);
            C89219l.m154716b(parse, "");
            Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
            }
            Room room = this.f106452c;
            if (room == null || (str2 = room.getIdStr()) == null) {
                str2 = "";
            }
            Uri.Builder appendQueryParameter = encodedPath.appendQueryParameter("room_id", str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Room room2 = this.f106452c;
            if (room2 == null || (str3 = room2.getIdStr()) == null) {
                str3 = "";
            }
            linkedHashMap.put("room_id", str3);
            String str6 = this.f106459l;
            if (str6 == null) {
                str6 = "";
            }
            linkedHashMap.put("enter_from_merge", str6);
            String str7 = this.f106460m;
            if (str7 == null) {
                str7 = "";
            }
            linkedHashMap.put("enter_method", str7);
            String str8 = this.f106461n;
            if (str8 == null) {
                str8 = "";
            }
            linkedHashMap.put("action_type", str8);
            Room room3 = this.f106452c;
            if (room3 != null) {
                l = Long.valueOf(room3.getOwnerUserId());
            } else {
                l = null;
            }
            linkedHashMap.put("author_id", String.valueOf(l));
            linkedHashMap.put("follow_status", this.f106690i);
            IIconSlot.SlotViewModel slotViewModel = this.f106457j;
            if (slotViewModel == null || (tVar = slotViewModel.f15352c) == null || (str4 = tVar.getValue()) == null) {
                str4 = "";
            }
            C89219l.m154716b(str4, "");
            linkedHashMap.put("bag_product_num", str4);
            Room room4 = this.f106452c;
            if (room4 == null || (str5 = room4.getRequestId()) == null) {
                str5 = "";
            }
            linkedHashMap.put("request_id", str5);
            linkedHashMap.put("is_ad", Integer.valueOf(C89219l.m154714a(this.f106453d, true) ? 1 : 0));
            Map<String, String> map2 = this.f106454e;
            if (map2 != null) {
                linkedHashMap.put("effect_ad_extra", map2);
            }
            String str9 = this.f106462o;
            if (str9 != null && str9.length() > 0) {
                linkedHashMap.put("rec_content_id", str9);
            }
            String str10 = this.f106463p;
            if (str10 != null && str10.length() > 0) {
                linkedHashMap.put("rec_content_type", str10);
            }
            if (!(!TextUtils.equals(str, "ec_open_live_bag") || map == null || (obj = map.get("track_params")) == null)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<out kotlin.String, kotlin.Any>");
                linkedHashMap.putAll((Map) obj);
            }
            if (TextUtils.equals(str, "live_cart")) {
                linkedHashMap.put("enter_from", "live_cart");
            }
            String str11 = this.f106465r;
            if (str11 == null) {
                str11 = "";
            }
            linkedHashMap.put("search_id", str11);
            String str12 = this.f106466s;
            if (str12 == null) {
                str12 = "";
            }
            linkedHashMap.put("search_result_id", str12);
            appendQueryParameter.appendQueryParameter("track_params", C80342dg.m139300a().mo46674b(linkedHashMap));
            if (TextUtils.equals(str, "ec_open_live_bag") && map != null) {
                builder.appendQueryParameter("page_params", C80342dg.m139300a().mo46674b(map.get("content_params")));
            }
            String uri = builder.build().toString();
            C89219l.m154716b(uri, "");
            SmartRouter.buildRoute(this.f106451A, uri).open();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(AbstractC1174ac acVar, AbstractC6157ab.AbstractC6158a aVar) {
        String str;
        Long l;
        Long l2;
        String str2;
        String str3;
        int i;
        Long l3;
        Long l4;
        String str4;
        C1213t<String> tVar;
        User owner;
        FollowInfo followInfo;
        C1213t<String> tVar2;
        IIconSlot.SlotViewModel slotViewModel;
        C1213t<Drawable> tVar3;
        IIconSlot.SlotViewModel slotViewModel2;
        C1213t<Drawable> tVar4;
        IIconSlot.SlotViewModel slotViewModel3 = (IIconSlot.SlotViewModel) acVar;
        String str5 = "";
        C89219l.m154721d(slotViewModel3, str5);
        C89219l.m154721d(aVar, str5);
        super.mo12071a(slotViewModel3, aVar);
        this.f106457j = slotViewModel3;
        Drawable a = C0643b.m2369a(this.f106451A, (int) R.drawable.ai_);
        if (!(a == null || (slotViewModel2 = this.f106457j) == null || (tVar4 = slotViewModel2.f15354e) == null)) {
            tVar4.setValue(a);
        }
        Drawable a2 = C0643b.m2369a(this.f106451A, (int) R.drawable.aia);
        if (!(a2 == null || (slotViewModel = this.f106457j) == null || (tVar3 = slotViewModel.f15355f) == null)) {
            tVar3.setValue(a2);
        }
        IIconSlot.SlotViewModel slotViewModel4 = this.f106457j;
        if (!(slotViewModel4 == null || (tVar2 = slotViewModel4.f15358i) == null)) {
            tVar2.setValue(this.f106451A.getString(R.string.eds));
        }
        this.f106458k = aVar;
        Room room = this.f106452c;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || (str = String.valueOf(followInfo.getFollowStatus())) == null) {
            str = "-1";
        }
        C89219l.m154721d(str, str5);
        this.f106690i = str;
        C45806a aVar2 = this.f106456g;
        Room room2 = this.f106452c;
        Long l5 = null;
        if (room2 != null) {
            l = Long.valueOf(room2.getOwnerUserId());
        } else {
            l = null;
        }
        aVar2.mo77117a("author_id", String.valueOf(l), false);
        aVar2.mo77117a("EVENT_ORIGIN_FEATURE", "TEMAI", false);
        Room room3 = this.f106452c;
        if (room3 != null) {
            l2 = Long.valueOf(room3.getId());
        } else {
            l2 = null;
        }
        aVar2.mo77117a("room_id", String.valueOf(l2), false);
        String str6 = this.f106459l;
        if (str6 == null) {
            str6 = str5;
        }
        aVar2.mo77117a("enter_from_merge", str6, false);
        String str7 = this.f106460m;
        if (str7 == null) {
            str7 = str5;
        }
        aVar2.mo77117a("enter_method", str7, false);
        String str8 = this.f106461n;
        if (str8 == null) {
            str8 = str5;
        }
        aVar2.mo77117a("action_type", str8, false);
        aVar2.mo77117a("carrier_type", "live_cart_tag", false);
        aVar2.mo77117a("page_type", "live", false);
        aVar2.mo77117a("anchor_show_type", "live_cart_tag", false);
        aVar2.mo77117a("follow_status", this.f106690i, false);
        aVar2.mo77117a("entrance_form", "live_cart", false);
        aVar2.mo77117a("page_name", "live", false);
        if (C89219l.m154714a((Object) this.f106453d, (Object) true)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        aVar2.mo77117a("is_ad", str2, false);
        aVar2.mo77117a("rec_content_id", this.f106462o, false);
        aVar2.mo77117a("rec_content_type", this.f106463p, false);
        Room room4 = this.f106452c;
        if (room4 != null) {
            str3 = room4.getRequestId();
        } else {
            str3 = null;
        }
        aVar2.mo77117a("request_id", str3, true);
        String str9 = this.f106465r;
        if (str9 == null) {
            str9 = str5;
        }
        aVar2.mo77117a("search_id", str9, false);
        String str10 = this.f106466s;
        if (str10 != null) {
            str5 = str10;
        }
        aVar2.mo77117a("search_result_id", str5, false);
        C45782c cVar = this.f106472y;
        if (cVar != null && (i = cVar.f106661a) > 0) {
            IIconSlot.SlotViewModel slotViewModel5 = this.f106457j;
            if (!(slotViewModel5 == null || (tVar = slotViewModel5.f15352c) == null)) {
                tVar.postValue(String.valueOf(i));
            }
            IIconSlot.SlotViewModel slotViewModel6 = this.f106457j;
            if (slotViewModel6 != null) {
                C45799c.m88409a(slotViewModel6, true);
            }
            C45806a aVar3 = this.f106456g;
            Room room5 = this.f106452c;
            if (room5 != null) {
                l3 = Long.valueOf(room5.getId());
            } else {
                l3 = null;
            }
            String valueOf = String.valueOf(l3);
            Boolean bool = this.f106453d;
            Map<String, String> map = this.f106454e;
            HashMap hashMap = new HashMap();
            Map<String, String> map2 = this.f106455f;
            if (map2 != null) {
                hashMap.putAll(map2);
                hashMap.put("refer", "icon");
                hashMap.put("label", "user_othershow");
            }
            C45790b.m88391a(aVar3, valueOf, bool, map, hashMap, "icon", null, null);
            if (this.f106467t > 0) {
                long j = this.f106468u;
                if (j > 0) {
                    long j2 = this.f106469v;
                    if (j2 > 0 && this.f106470w > 0 && j2 > j) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j3 = this.f106467t;
                        long j4 = currentTimeMillis - j3;
                        long j5 = this.f106468u;
                        long j6 = j5 - j3;
                        long j7 = this.f106469v;
                        long j8 = j7 - j5;
                        long j9 = this.f106470w - j7;
                        long currentTimeMillis2 = System.currentTimeMillis() - this.f106470w;
                        Room room6 = this.f106452c;
                        if (room6 != null) {
                            str4 = room6.getIdStr();
                        } else {
                            str4 = null;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("room_id", str4);
                            jSONObject.put("total_duration", j4);
                            jSONObject.put("before_enter_room_interface_duration", j6);
                            jSONObject.put("enter_room_interface_duration", j8);
                            jSONObject.put("live_process_data_duration", j9);
                            jSONObject.put("ec_process_data_duration", currentTimeMillis2);
                            C39162r.m79461a("rd_tiktokec_live_shopping_bag_show", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            Room room7 = this.f106452c;
            if (room7 != null) {
                l4 = Long.valueOf(room7.getOwnerUserId());
            } else {
                l4 = null;
            }
            String valueOf2 = String.valueOf(l4);
            Room room8 = this.f106452c;
            if (room8 != null) {
                l5 = Long.valueOf(room8.getId());
            }
            mo77098a(new C45793e("rd_tiktokec_audience_icon_show", valueOf2, String.valueOf(l5)));
        }
        String str11 = this.f106464q;
        if (str11 != null) {
            SmartRouter.buildRoute(this.f106451A, str11).open();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0115 A[Catch:{ Exception -> 0x0155 }] */
    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12074a(java.util.Map<java.lang.String, ? extends java.lang.Object> r8, com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6159b r9) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.C45711b.mo12074a(java.util.Map, com.bytedance.android.live.slot.ab$b):void");
    }
}
