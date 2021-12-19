package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4329e;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6246a;
import com.bytedance.android.live.wallet.C6305b;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.C6384g;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.livesdk.C6903bd;
import com.bytedance.android.livesdk.C6904be;
import com.bytedance.android.livesdk.C6906bg;
import com.bytedance.android.livesdk.C8312d;
import com.bytedance.android.livesdk.C8916h;
import com.bytedance.android.livesdk.gift.model.C8840e;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveSendGiftEnterFromParamSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p603q.C10146j;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.service.assets.C10689i;
import com.bytedance.android.livesdk.service.assets.C10690j;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.network.GiftRetrofitApi;
import com.bytedance.android.livesdk.service.network.PropApi;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ag */
public final class C11455ag {

    /* renamed from: a */
    LinkedList<C10700d> f27479a = new LinkedList<>();

    /* renamed from: b */
    boolean f27480b = false;

    /* renamed from: c */
    public DataChannel f27481c;

    /* renamed from: d */
    public Activity f27482d;

    /* renamed from: e */
    public AbstractC11461a f27483e;

    /* renamed from: f */
    public AbstractC89172b<C10700d, C89391z> f27484f = new C11462ah(this);

    /* renamed from: g */
    private C10700d f27485g;

    /* renamed from: h */
    private C6873g<AbstractC2994b> f27486h = new C6873g<AbstractC2994b>() {
        /* class com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag.C114561 */

        static {
            Covode.recordClassIndex(13115);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z, com.bytedance.android.livesdk.p456as.C6873g
        public final /* synthetic */ void onNext(AbstractC2994b bVar) {
            super.onNext(bVar);
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
        }
    };

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ag$a */
    public interface AbstractC11461a {
        static {
            Covode.recordClassIndex(13120);
        }

        /* renamed from: a */
        void mo18285a(Exception exc, C10700d dVar);
    }

    static {
        Covode.recordClassIndex(13114);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18307a(C10700d dVar, List<C8840e> list) {
        if (dVar.f25761c == 1) {
            if (!C13603b.m24435a((Collection) list)) {
                for (C8840e eVar : list) {
                    if (eVar != null && eVar.f21709b == 1) {
                        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12381e(eVar.f21708a.longValue());
                    }
                }
            }
            if (dVar.f25762d) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e13);
            } else {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e0w);
            }
            if (AbstractC6804a.f17011cG.mo13066a().intValue() > 0 && AbstractC6804a.f17012cH.mo13066a().booleanValue()) {
                ((IWalletService) C6193a.m13435a(IWalletService.class)).showTurnOnAutoExchangeDialog(this.f27482d, this.f27481c);
                C6806c.m14603a((C6800c) AbstractC6804a.f17012cH, (Object) false);
            }
            C6805b<Integer> bVar = AbstractC6804a.f17011cG;
            C6806c.m14603a(bVar, Integer.valueOf(bVar.mo13066a().intValue() + 1));
        }
    }

    /* renamed from: c */
    private void m20290c() {
        this.f27479a.clear();
        this.f27480b = false;
    }

    /* renamed from: d */
    private static boolean m20291d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18308b() {
        m20290c();
        this.f27481c.mo28319c(C8312d.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ag$4 */
    public static /* synthetic */ class C114604 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27502a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 13119(0x333f, float:1.8384E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel$a[] r0 = com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel.EnumC10039a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag.C114604.f27502a = r2
                com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel$a r0 = com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel.EnumC10039a.GIFT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag.C114604.f27502a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel$a r0 = com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel.EnumC10039a.PROP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag.C114604.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18302a() {
        boolean z;
        final boolean z2;
        boolean z3;
        boolean z4;
        int i;
        LinkedList<C10700d> linkedList = this.f27479a;
        if (linkedList != null && !linkedList.isEmpty()) {
            final C10700d pollFirst = this.f27479a.pollFirst();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                z = m20291d();
                C58029j.f132253e = z;
            } else {
                z = C58029j.f132253e;
            }
            if (!z) {
                C10715e.m19280a("-1: Network error", pollFirst.f25768j, pollFirst.f25777s);
                C10715e.m19284b("8", "network_error", pollFirst.f25768j, pollFirst.f25777s);
                C11226ao.m19882a(this.f27482d, (int) R.string.edd);
                mo18308b();
            } else if (!C11115u.m19743a().mo17915b().mo13165e()) {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                Activity activity = this.f27482d;
                C6876j.C6877a a = C6876j.m14732a();
                a.f17232a = C3966y.m9657a((int) R.string.gst);
                a.f17234c = 1001;
                a.f17236e = "live_detail";
                a.f17237f = "gift_send";
                a.f17235d = "enableGift";
                b.mo13149a(activity, a.mo13173a()).mo143062b(this.f27486h);
                mo18308b();
                C10715e.m19280a("-2: Not login error", pollFirst.f25768j, pollFirst.f25777s);
                C10715e.m19284b("2", "unlogin", pollFirst.f25768j, pollFirst.f25777s);
            } else if (C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.GIFT)) {
                mo18308b();
                C10715e.m19280a("-3: User center error", pollFirst.f25768j, pollFirst.f25777s);
                C10715e.m19284b("9", "intercept", pollFirst.f25768j, pollFirst.f25777s);
            } else if (((IHostContext) C6193a.m13435a(IHostContext.class)).isNeedProtectMinor()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gq8);
                mo18308b();
                C10715e.m19280a("-6: Restrict mode error", pollFirst.f25768j, pollFirst.f25777s);
                C10715e.m19284b("1", "forbidden", pollFirst.f25768j, pollFirst.f25777s);
            } else {
                int i2 = pollFirst.f25764f;
                if (pollFirst.f25759a != GiftDialogViewModel.EnumC10039a.PROP) {
                    long j = (long) i2;
                    if (!((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12375b(j)) {
                        final long b2 = j - ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b();
                        if (i2 > LiveExchangeConfirmThreshold.INSTANCE.getValue()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (AbstractC6804a.f17009cE.mo13066a().intValue() < 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        final boolean g = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12383g();
                        BalanceStruct e = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12380e();
                        final C6384g f = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12382f();
                        final RevenueExchange revenueExchange = f.f15957c;
                        if (revenueExchange == null || !revenueExchange.getEnableExchange() || revenueExchange.getBalance() <= 0 || f.f15958d == null || f.f15958d.getBasePackage() == null) {
                            if (e.getExchangeInfo() != null && b2 <= e.getExchangeInfo().getMaxCoins() && e.getValidUser() && (z3 || g)) {
                                pollFirst.f25763e = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b();
                                if ((!z2 || !g) && (!z3 || g)) {
                                    pollFirst.f25761c = 1;
                                } else {
                                    C11477aw.m20313a(this.f27481c, m20286a(Boolean.valueOf(z2)), pollFirst.f25760b);
                                    IWalletService iWalletService = (IWalletService) C6193a.m13435a(IWalletService.class);
                                    Activity activity2 = this.f27482d;
                                    C114593 r17 = new AbstractC6246a() {
                                        /* class com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag.C114593 */

                                        /* renamed from: a */
                                        boolean f27496a = true;

                                        static {
                                            Covode.recordClassIndex(13118);
                                        }

                                        @Override // com.bytedance.android.live.wallet.AbstractC6246a
                                        /* renamed from: b */
                                        public final void mo12254b() {
                                            C11477aw.m20317c(C11455ag.this.f27481c, C11455ag.m20286a(Boolean.valueOf(z2)), pollFirst.f25760b);
                                            if (!g) {
                                                C6805b<Integer> bVar = AbstractC6804a.f17009cE;
                                                C6806c.m14603a(bVar, Integer.valueOf(bVar.mo13066a().intValue() + 1));
                                            }
                                            if (!((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
                                                C11455ag agVar = C11455ag.this;
                                                C10700d dVar = pollFirst;
                                                agVar.mo18305a(dVar, dVar.f25764f);
                                                return;
                                            }
                                            C11455ag.this.mo18309b(pollFirst);
                                        }

                                        @Override // com.bytedance.android.live.wallet.AbstractC6246a
                                        /* renamed from: a */
                                        public final void mo12252a() {
                                            C11477aw.m20315b(C11455ag.this.f27481c, C11455ag.m20286a(Boolean.valueOf(z2)), pollFirst.f25760b);
                                            if (!this.f27496a) {
                                                ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12371a("not_auto_exchange");
                                            }
                                            if (!z2 || !g) {
                                                pollFirst.f25761c = 1;
                                                if (!this.f27496a) {
                                                    pollFirst.f25762d = true;
                                                }
                                                C11455ag.this.mo18309b(pollFirst);
                                                return;
                                            }
                                            C11477aw.m20313a(C11455ag.this.f27481c, "over_threshold_two", pollFirst.f25760b);
                                            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(C11455ag.this.f27482d);
                                            aVar.f22256m = false;
                                            DialogC9148b.C9149a a = aVar.mo15243a(R.string.e17);
                                            a.f22245b = C3966y.m9660a((int) R.string.e0j, ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12376c(b2));
                                            a.mo15249b(R.string.e0h, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11472ar(this, pollFirst), false).mo15244a(R.string.e14, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11473as(this, pollFirst), false).mo15247a().show();
                                        }

                                        @Override // com.bytedance.android.live.wallet.AbstractC6246a
                                        /* renamed from: a */
                                        public final void mo12253a(Boolean bool) {
                                            this.f27496a = !bool.booleanValue();
                                        }
                                    };
                                    String a2 = C3966y.m9660a((int) R.string.e0u, Long.valueOf(b2), ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12376c(b2), Long.valueOf(b2));
                                    if (AbstractC6804a.f17011cG.mo13066a().intValue() <= 1 || g) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    iWalletService.showExchangeConfirmDialog(activity2, r17, new C6305b(R.string.e0v, a2, R.string.e0s, R.string.e0r, R.string.e0t, z4));
                                    return;
                                }
                            } else if (!((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
                                mo18305a(pollFirst, pollFirst.f25764f);
                                return;
                            }
                        } else if (b2 > f.f15958d.getMaxCoins() || AbstractC6804a.f17010cF.mo13066a().intValue() >= 2) {
                            mo18305a(pollFirst, pollFirst.f25764f);
                            return;
                        } else {
                            C11477aw.m20312a(this.f27481c, pollFirst.f25760b);
                            IWalletService iWalletService2 = (IWalletService) C6193a.m13435a(IWalletService.class);
                            Activity activity3 = this.f27482d;
                            C114572 r172 = new AbstractC6246a() {
                                /* class com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag.C114572 */

                                static {
                                    Covode.recordClassIndex(13116);
                                }

                                @Override // com.bytedance.android.live.wallet.AbstractC6246a
                                /* renamed from: a */
                                public final void mo12253a(Boolean bool) {
                                }

                                @Override // com.bytedance.android.live.wallet.AbstractC6246a
                                /* renamed from: a */
                                public final void mo12252a() {
                                    int i;
                                    C11477aw.m20314b(C11455ag.this.f27481c, pollFirst.f25760b);
                                    C11477aw.m20312a(C11455ag.this.f27481c, pollFirst.f25760b);
                                    DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(C11455ag.this.f27482d);
                                    aVar.f22256m = false;
                                    DialogC9148b.C9149a a = aVar.mo15243a(R.string.e17);
                                    if (revenueExchange.isRevenue()) {
                                        i = R.string.e2p;
                                    } else {
                                        i = R.string.e2j;
                                    }
                                    a.f22245b = C3966y.m9660a(i, ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12378d(b2));
                                    a.mo15249b(R.string.e0h, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11470ap(this, pollFirst), false).mo15244a(R.string.e14, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC11471aq(this, f, pollFirst, revenueExchange, b2), false).mo15247a().show();
                                }

                                @Override // com.bytedance.android.live.wallet.AbstractC6246a
                                /* renamed from: b */
                                public final void mo12254b() {
                                    C11477aw.m20316c(C11455ag.this.f27481c, pollFirst.f25760b);
                                    C6805b<Integer> bVar = AbstractC6804a.f17010cF;
                                    C6806c.m14603a(bVar, Integer.valueOf(bVar.mo13066a().intValue() + 1));
                                    if (!((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
                                        C11455ag agVar = C11455ag.this;
                                        C10700d dVar = pollFirst;
                                        agVar.mo18305a(dVar, dVar.f25764f);
                                        return;
                                    }
                                    C11455ag.this.mo18309b(pollFirst);
                                }
                            };
                            if (revenueExchange.isRevenue()) {
                                i = R.string.e2p;
                            } else {
                                i = R.string.e2o;
                            }
                            iWalletService2.showExchangeConfirmDialog(activity3, r172, new C6305b(i, C3966y.m9660a((int) R.string.e0u, Long.valueOf(b2), ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12378d(b2), Long.valueOf(b2)), R.string.e0s, R.string.e0r, 0, false));
                            return;
                        }
                    }
                }
                mo18309b(pollFirst);
            }
        }
    }

    /* renamed from: a */
    public static String m20286a(Boolean bool) {
        if (bool.booleanValue()) {
            return "over_threshold_one";
        }
        if (AbstractC6804a.f17011cG.mo13066a().intValue() > 1) {
            return "not_auto";
        }
        return "first_two_times";
    }

    /* renamed from: a */
    private static String m20287a(String str) {
        if (TextUtils.equals(str, "wishlist")) {
            return "wishlist";
        }
        if (TextUtils.equals(str, "convenient_gift")) {
            return "shortcut_gift";
        }
        return "gift";
    }

    /* renamed from: b */
    public final void mo18309b(C10700d dVar) {
        int i = C114604.f27502a[dVar.f25759a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m20288a(dVar.f25760b, dVar.f25765g, dVar);
            }
        } else if (!dVar.f25776r) {
            mo18304a(dVar);
        } else if (C10146j.m18653a(dVar.f25760b)) {
            C10146j.m18651a((ActivityC0218d) this.f27482d, new C11469ao(this, dVar));
        } else {
            DataChannel dataChannel = this.f27481c;
            if (dataChannel != null) {
                dataChannel.mo28320c(C8916h.class, true);
            }
            mo18304a(dVar);
        }
    }

    /* renamed from: b */
    private void m20289b(C8859w wVar) {
        if (wVar.f21793n != null && !wVar.f21793n.isEmpty()) {
            C10690j a = C10690j.m19257a();
            List<Prop> list = wVar.f21793n;
            if (!list.isEmpty()) {
                for (Prop prop : list) {
                    Prop a2 = a.mo17628a(prop.f21689id);
                    if (a2 != null) {
                        a.f25745a.set(a.f25745a.indexOf(a2), prop);
                    }
                }
                for (C10690j.AbstractC10691a aVar : a.f25746b) {
                    aVar.mo16813b(a.f25745a);
                }
            }
        }
        C11115u.m19743a().mo17915b().mo13166f();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            IMessageManager iMessageManager = (IMessageManager) this.f27481c.mo28318b(C9068cg.class);
            User user = (User) this.f27481c.mo28318b(C9101dm.class);
            if (user != null) {
                List<C9895y> b = C10689i.m19256b(room.getId(), wVar, this.f27485g.f25767i, user);
                if (iMessageManager == null) {
                    return;
                }
                if (C13617h.m24465a(b)) {
                    iMessageManager.insertMessage(C10689i.m19254a(room.getId(), wVar, this.f27485g.f25767i, user));
                    return;
                }
                for (C9895y yVar : b) {
                    iMessageManager.insertMessage(yVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18303a(C8859w wVar) {
        ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12366a(wVar.f21783d);
        if (wVar.f21791l > 0) {
            wVar.f21796q = C10690j.m19257a().mo17628a(wVar.f21791l);
            if (wVar.f21796q != null) {
                wVar.f21785f = wVar.f21796q.gift.f23999d;
                if (!C13617h.m24465a(wVar.f21793n)) {
                    Iterator<Prop> it = wVar.f21793n.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().f21689id == wVar.f21791l) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Prop newInstance = Prop.newInstance(wVar.f21796q);
                newInstance.count -= wVar.f21786g;
                if (wVar.f21793n == null) {
                    wVar.f21793n = new ArrayList();
                }
                wVar.f21793n.add(newInstance);
            }
        } else {
            long j = wVar.f21785f;
            SharedPreferences.Editor edit = C34822d.m71158a(this.f27482d, "gift_dialog_storage", 0).edit();
            edit.putLong("default_dialog_item", j);
            edit.commit();
            if (this.f27485g.f25772n != -1) {
                Activity activity = this.f27482d;
                int i = this.f27485g.f25772n;
                SharedPreferences.Editor edit2 = C34822d.m71158a(activity, "gift_dialog_storage", 0).edit();
                edit2.putInt("sp_gift_page_type", i);
                edit2.commit();
            }
        }
        if (this.f27485g.f25766h) {
            this.f27481c.mo28320c(C4329e.class, false);
        }
        m20289b(wVar);
        C9904t findGiftById = GiftManager.inst().findGiftById(wVar.f21785f);
        if (findGiftById != null && findGiftById.mo16601a() && !C10715e.f25799h.f25802a) {
            this.f27481c.mo28320c(C6906bg.class, this.f27485g);
            C10715e.f25799h.f25802a = true;
        }
        mo18302a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18304a(C10700d dVar) {
        int i;
        String str;
        if (GiftManager.inst().findGiftById(dVar.f25760b) == null) {
            mo18308b();
            return;
        }
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            mo18308b();
            C10715e.m19280a("-4: Room info error", dVar.f25768j, dVar.f25777s);
            C10715e.m19284b("7", "room", dVar.f25768j, dVar.f25777s);
            return;
        }
        this.f27485g = dVar;
        this.f27480b = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        C10890a.EnumC10891a b = C10890a.m19496b();
        if (b == C10890a.EnumC10891a.LINK_MIC_GUEST) {
            i = 2;
        } else if (b == C10890a.EnumC10891a.LINK_MIC_PK) {
            i = 4;
        } else {
            i = 1;
        }
        if (LiveSendGiftEnterFromParamSetting.INSTANCE.getValue()) {
            str = C6544e.m13987a() + "-" + C6544e.m13990d();
        } else {
            str = "";
        }
        long a = C11200a.m19851a();
        ((GiftRetrofitApi) C5805e.m12718a().mo11572a(GiftRetrofitApi.class)).sendAddType(dVar.f25760b, room.getId(), dVar.f25767i.getId(), dVar.f25765g, i, 3, str, C11200a.m19851a(), dVar.f25761c).mo143271a(new C11191f()).mo143255a(new C11466al(this, dVar, room, a, uptimeMillis), new C11467am(this, dVar, room, a), new C11468an(this));
    }

    /* renamed from: a */
    public final void mo18305a(C10700d dVar, int i) {
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e2a);
        mo18306a(dVar, i, false);
    }

    /* renamed from: a */
    private void m20288a(long j, int i, C10700d dVar) {
        Prop a = C10690j.m19257a().mo17628a(j);
        if (a != null) {
            if (a.count <= 0) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gq7);
                mo18308b();
                return;
            }
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                this.f27485g = dVar;
                ((PropApi) C5805e.m12718a().mo11572a(PropApi.class)).sendProp(j, room.getId(), i, dVar.f25767i.getId(), a.isAwemeFreeGift).mo143271a(new C11191f()).mo143255a(new C11463ai(this, room, j, SystemClock.uptimeMillis(), dVar), new C11464aj(this, j, room), new C11465ak(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo18306a(C10700d dVar, int i, boolean z) {
        String a;
        long b = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b();
        DataChannel dataChannel = this.f27481c;
        if (z) {
            a = "anchor_income";
        } else {
            a = m20287a(dVar.f25768j);
        }
        dataChannel.mo28320c(C6904be.class, new C6903bd(a, ((long) i) - b, "normal", dVar.f25768j));
        mo18308b();
        C10715e.m19280a("-7: Balance error", dVar.f25768j, dVar.f25777s);
        C10715e.m19284b("3", "money", dVar.f25768j, dVar.f25777s);
    }
}
