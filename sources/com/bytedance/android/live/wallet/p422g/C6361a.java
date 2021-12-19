package com.bytedance.android.live.wallet.p422g;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.C6336e;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveCustomRechargeFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeContactUsUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveSubscribeFeedbackUrlSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.wallet.p657a.C11310a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.g.a */
public final class C6361a {

    /* renamed from: a */
    public static final C6361a f15885a = new C6361a();

    private C6361a() {
    }

    static {
        Covode.recordClassIndex(7083);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.g.a$b */
    public static final class DialogInterface$OnClickListenerC6363b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC6363b f15891a = new DialogInterface$OnClickListenerC6363b();

        static {
            Covode.recordClassIndex(7085);
        }

        DialogInterface$OnClickListenerC6363b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.g.a$d */
    public static final class DialogInterface$OnClickListenerC6365d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11310a f15897a;

        static {
            Covode.recordClassIndex(7087);
        }

        DialogInterface$OnClickListenerC6365d(C11310a aVar) {
            this.f15897a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            if (this.f15897a.f27051h) {
                C6501b.C6502a.m13948a("livesdk_abnormal_subscribe_popup_click").mo12651a("failed_reason", this.f15897a.f27049f).mo12651a("click_type", "dismiss").mo12639a().mo12655b();
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    private static void m13733a(Throwable th, int i) {
        String a;
        if (th != null) {
            if (!(th instanceof C2912a)) {
                th = null;
            }
            C2912a aVar = (C2912a) th;
            if (aVar == null || (a = aVar.getPrompt()) == null || a.length() <= 0) {
                a = C3966y.m9657a(i);
            }
            C11226ao.m19883a(C3966y.m9669e(), a, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.g.a$a */
    public static final class DialogInterface$OnClickListenerC6362a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f15886a;

        /* renamed from: b */
        final /* synthetic */ Uri f15887b;

        /* renamed from: c */
        final /* synthetic */ C11310a f15888c;

        /* renamed from: d */
        final /* synthetic */ String f15889d;

        /* renamed from: e */
        final /* synthetic */ String f15890e;

        static {
            Covode.recordClassIndex(7084);
        }

        DialogInterface$OnClickListenerC6362a(Context context, Uri uri, C11310a aVar, String str, String str2) {
            this.f15886a = context;
            this.f15887b = uri;
            this.f15888c = aVar;
            this.f15889d = str;
            this.f15890e = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(this.f15886a, this.f15887b);
            C6501b.C6502a.m13948a("livesdk_recharge_fail_contact_us_click").mo12639a().mo12645a("package", this.f15888c.f27050g).mo12651a("fail_from", this.f15889d).mo12651a("fail_reason", this.f15890e).mo12651a("charge_reason", this.f15888c.f27049f).mo12655b();
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.g.a$c */
    public static final class DialogInterface$OnClickListenerC6364c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f15892a;

        /* renamed from: b */
        final /* synthetic */ Uri f15893b;

        /* renamed from: c */
        final /* synthetic */ C11310a f15894c;

        /* renamed from: d */
        final /* synthetic */ String f15895d;

        /* renamed from: e */
        final /* synthetic */ String f15896e;

        static {
            Covode.recordClassIndex(7086);
        }

        DialogInterface$OnClickListenerC6364c(Context context, Uri uri, C11310a aVar, String str, String str2) {
            this.f15892a = context;
            this.f15893b = uri;
            this.f15894c = aVar;
            this.f15895d = str;
            this.f15896e = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(this.f15892a, this.f15893b);
            if (this.f15894c.f27051h) {
                C6501b.C6502a.m13948a("livesdk_abnormal_subscribe_popup_click").mo12651a("failed_reason", this.f15894c.f27049f).mo12651a("click_type", "contact_us").mo12639a().mo12655b();
            } else {
                C6501b.C6502a.m13948a("livesdk_recharge_fail_contact_us_click").mo12645a("package", this.f15894c.f27050g).mo12651a("fail_from", this.f15895d).mo12651a("fail_reason", this.f15896e).mo12651a("charge_reason", this.f15894c.f27049f).mo12639a().mo12655b();
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static void m13732a(C11310a aVar, Context context) {
        String string;
        C89219l.m154721d(aVar, "");
        if (context != null) {
            if (aVar.f27044a == 3) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ef3);
                return;
            }
            Exception exc = aVar.f27047d;
            if (exc instanceof C2912a) {
                C2912a aVar2 = (C2912a) exc;
                switch (aVar2.getErrorCode()) {
                    case 41155:
                        m13733a(aVar.f27047d, (int) R.string.em8);
                        return;
                    case 4005189:
                        m13731a(context, exc, "other", "risk", aVar);
                        return;
                    case 4005208:
                        String string2 = context.getString(R.string.en9);
                        C89219l.m154716b(string2, "");
                        String prompt = aVar2.getPrompt();
                        C89219l.m154716b(prompt, "");
                        m13730a(context, string2, prompt, "refund", "other", aVar2.getErrorCode(), aVar);
                        return;
                    case 4005209:
                        String string3 = context.getString(R.string.en9);
                        C89219l.m154716b(string3, "");
                        String prompt2 = aVar2.getPrompt();
                        C89219l.m154716b(prompt2, "");
                        m13730a(context, string3, prompt2, "underground", "other", aVar2.getErrorCode(), aVar);
                        return;
                    case 4025001:
                        String string4 = context.getString(R.string.eln);
                        C89219l.m154716b(string4, "");
                        String prompt3 = aVar2.getPrompt();
                        C89219l.m154716b(prompt3, "");
                        m13730a(context, string4, prompt3, "risk", "other", aVar2.getErrorCode(), aVar);
                        return;
                    case 4025002:
                        String string5 = context.getString(R.string.elk);
                        C89219l.m154716b(string5, "");
                        String prompt4 = aVar2.getPrompt();
                        C89219l.m154716b(prompt4, "");
                        m13730a(context, string5, prompt4, "risk", "other", aVar2.getErrorCode(), aVar);
                        return;
                    default:
                        m13733a(exc, (int) R.string.edd);
                        return;
                }
            } else if (aVar.f27045b == 206 && aVar.f27046c == 1) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ef2);
            } else if (aVar.f27045b == 203) {
                if (C6336e.C6337a.m13682a()) {
                    string = context.getString(R.string.en9);
                } else {
                    string = context.getString(R.string.enb);
                }
                C89219l.m154716b(string, "");
                String string6 = context.getString(R.string.gic);
                C89219l.m154716b(string6, "");
                m13730a(context, string6, string, "google-apple", "pay", 203, aVar);
            } else if (aVar.f27045b == 205) {
                if (aVar.f27051h) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ene);
                } else {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.end);
                }
            } else if (aVar.f27045b == 204) {
                if (aVar.f27051h) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ene);
                } else {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.end);
                }
            } else if (aVar.f27045b == 208) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.enc);
            } else {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.edd);
            }
        }
    }

    /* renamed from: a */
    private static void m13731a(Context context, Throwable th, String str, String str2, C11310a aVar) {
        if (context != null) {
            String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
            if (TextUtils.isEmpty(value)) {
                AbstractC2953a a = C6193a.m13435a(IHostApp.class);
                C89219l.m154716b(a, "");
                if (((IHostApp) a).isInMusicallyRegion()) {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                } else {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                }
            }
            Uri parse = Uri.parse(value);
            String string = context.getString(R.string.dxz);
            C89219l.m154716b(string, "");
            if (th instanceof C2912a) {
                string = ((C2912a) th).getPrompt();
                C89219l.m154716b(string, "");
            }
            DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(context);
            aVar2.f22245b = string;
            DialogC9148b.C9149a b = aVar2.mo15244a(R.string.gjt, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6362a(context, parse, aVar, str, str2), false).mo15249b(R.string.gju, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC6363b.f15891a, false);
            b.f22256m = false;
            b.mo15247a().show();
            C6501b.C6502a.m13948a("livesdk_recharge_fail_popup_show").mo12639a().mo12645a("package", aVar.f27050g).mo12651a("fail_from", str).mo12651a("fail_reason", str2).mo12651a("charge_reason", aVar.f27049f).mo12655b();
        }
    }

    /* renamed from: a */
    public static void m13730a(Context context, String str, String str2, String str3, String str4, int i, C11310a aVar) {
        C29844g gVar;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(aVar, "");
        if (aVar.f27051h) {
            gVar = new C29844g(LiveSubscribeFeedbackUrlSetting.INSTANCE.getValue());
        } else if (LiveWebRechargeAuditing.INSTANCE.getValue() || !aVar.f27048e) {
            gVar = new C29844g(LiveRechargeContactUsUrlSetting.INSTANCE.getValue());
        } else {
            gVar = new C29844g(LiveCustomRechargeFeedbackUrlSetting.INSTANCE.getValue());
            gVar.mo52128a("error_code", i);
            gVar.mo52130a("fail_from", str4);
            gVar.mo52130a("fail_reason", str3);
            gVar.mo52130a("charge_reason", aVar.f27049f);
            gVar.mo52128a("package", aVar.f27050g);
        }
        Uri parse = Uri.parse(gVar.mo52126a());
        C89219l.m154716b(parse, "");
        DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(context);
        aVar2.f22244a = str;
        aVar2.f22245b = str2;
        DialogC9148b.C9149a b = aVar2.mo15244a(R.string.gjt, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6364c(context, parse, aVar, str4, str3), false).mo15249b(R.string.gju, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC6365d(aVar), false);
        b.f22256m = false;
        b.mo15247a().show();
        if (aVar.f27051h) {
            C6501b.C6502a.m13948a("livesdk_abnormal_subscribe_popup").mo12651a("failed_reason", aVar.f27049f).mo12639a().mo12655b();
        } else {
            C6501b.C6502a.m13948a("livesdk_recharge_fail_popup_show").mo12639a().mo12645a("package", aVar.f27050g).mo12651a("fail_from", str4).mo12651a("fail_reason", str3).mo12651a("charge_reason", aVar.f27049f).mo12655b();
        }
    }
}
