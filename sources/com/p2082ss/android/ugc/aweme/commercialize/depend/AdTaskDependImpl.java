package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17979c;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17980d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37588c;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38163ai;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38673e;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a.C38665a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56252e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56254g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.api.C63431e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl */
public final class AdTaskDependImpl implements IAdTaskDepend {
    static {
        Covode.recordClassIndex(45085);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65621a(Aweme aweme) {
        return C37699a.m76199B(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65622a(AwemeRawAd awemeRawAd) {
        return C38703bs.m78531b(awemeRawAd) || C38703bs.m78533c(awemeRawAd);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65623a(String str, Context context, AwemeRawAd awemeRawAd) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        return C38665a.m78456a(str, context, awemeRawAd);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65620a(Context context, String str, String str2, String str3, String str4) {
        String b = C38024a.m77086b(str2);
        HandlerC37655a aVar = new HandlerC37655a(str, context, new C56252e(str3, str4), Looper.getMainLooper());
        C63431e.m115024a();
        C63431e.m115025a(aVar, b);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65624a(boolean z, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!z || !TextUtils.equals(str, "app")) {
            return false;
        }
        C17979c a = C17980d.m33499a();
        List arrayList = new ArrayList();
        if (!(a == null || a.f42820a == null)) {
            arrayList = Arrays.asList(a.f42820a);
        }
        return !arrayList.contains(str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: b */
    public final boolean mo65626b() {
        return C37588c.m75845a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final String mo65611a() {
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<String> jsActlogUrl = inst.getJsActlogUrl();
        C89219l.m154716b(jsActlogUrl, "");
        return jsActlogUrl.mo59941c();
    }

    /* renamed from: c */
    public static IAdTaskDepend m75938c() {
        MethodCollector.m26663i(9185);
        Object a = C81908b.m141854a(IAdTaskDepend.class, false);
        if (a != null) {
            IAdTaskDepend iAdTaskDepend = (IAdTaskDepend) a;
            MethodCollector.m26664o(9185);
            return iAdTaskDepend;
        }
        if (C81908b.f183181ak == null) {
            synchronized (IAdTaskDepend.class) {
                try {
                    if (C81908b.f183181ak == null) {
                        C81908b.f183181ak = new AdTaskDependImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9185);
                    throw th;
                }
            }
        }
        AdTaskDependImpl adTaskDependImpl = (AdTaskDependImpl) C81908b.f183181ak;
        MethodCollector.m26664o(9185);
        return adTaskDependImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final Intent mo65610a(Context context) {
        C89219l.m154721d(context, "");
        return new Intent(context, CrossPlatformActivity.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: b */
    public final void mo65625b(Context context) {
        C89219l.m154721d(context, "");
        C38673e.m78468a(context, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: c */
    public final boolean mo65628c(String str) {
        C89219l.m154721d(str, "");
        return C38024a.m77085a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: d */
    public final void mo65629d(String str) {
        C89219l.m154721d(str, "");
        C38163ai.m77367a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: b */
    public final boolean mo65627b(String str) {
        C89219l.m154721d(str, "");
        return C36125t.m73598a(C36125t.m73591a(), str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl$a */
    public static final class HandlerC37655a extends Handler {

        /* renamed from: a */
        final /* synthetic */ String f89023a;

        /* renamed from: b */
        final /* synthetic */ Context f89024b;

        /* renamed from: c */
        final /* synthetic */ C56252e f89025c;

        static {
            Covode.recordClassIndex(45086);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            super.handleMessage(message);
            if (message.obj instanceof User) {
                C56254g gVar = new C56254g();
                gVar.commerceScene = "video";
                gVar.objectId = this.f89023a;
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                Context context = this.f89024b;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102214a(context, IMUser.fromUser((User) obj)).mo93266a(this.f89025c).mo93267a(gVar).f128281a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC37655a(String str, Context context, C56252e eVar, Looper looper) {
            super(looper);
            this.f89023a = str;
            this.f89024b = context;
            this.f89025c = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final void mo65615a(String str) {
        C89219l.m154721d(str, "");
        C38673e.m78470a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65616a(Context context, int i) {
        C89219l.m154721d(context, "");
        return AbstractC38757n.m78631a(context, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65618a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        return C38669b.m78462a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65619a(Context context, String str, String str2) {
        return C33722d.C33723a.m69045a(context, str, (String) null, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final JSONObject mo65612a(Context context, Aweme aweme, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        return C38189j.m77468a(context, aweme, false, (Map<String, String>) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final void mo65613a(Context context, int i, int i2) {
        C89219l.m154721d(context, "");
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    new C23144b(activity).mo37640e(i).mo37637b();
                    return;
                }
                return;
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final void mo65614a(Context context, String str, String str2, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C34963b.m71413a(context, str, str2, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65617a(Context context, AwemeRawAd awemeRawAd, String str, String str2, String str3, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return C38767w.m78645a(new C37977b.C37978a().mo66199a(context).mo66201a(awemeRawAd).mo66202a(str).mo66205b(str2).mo66206c(str3).mo66204b(i));
    }
}
