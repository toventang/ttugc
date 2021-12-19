package com.p2082ss.android.ugc.aweme.bullet.module.p2422default;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16387b;
import com.bytedance.ies.bullet.kit.lynx.p1153b.C16388a;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletHostProxy;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import com.p2082ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.b */
public final class C35271b extends C16388a {

    /* renamed from: a */
    public static final C35272a f83285a = new C35272a((byte) 0);

    static {
        Covode.recordClassIndex(42436);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.b$a */
    public static final class C35272a {
        static {
            Covode.recordClassIndex(42437);
        }

        private C35272a() {
        }

        public /* synthetic */ C35272a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.p1153b.C16388a, com.bytedance.ies.bullet.kit.lynx.AbstractC16412e
    /* renamed from: a */
    public final Map<String, Object> mo26018a(AbstractC16387b bVar, C16248b bVar2) {
        int i;
        int i2;
        String str;
        String str2;
        Activity a;
        AbstractC16203d<?, ?, ?, ?> a2;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        Context context = (Context) bVar2.mo25832c(Context.class);
        int i3 = 0;
        if (context != null) {
            i2 = C34728n.m70948b((double) C34723i.m70928b(context));
            i = C34728n.m70948b((double) C34723i.m70924a(context));
        } else {
            i = 0;
            i2 = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("screenWidth", Integer.valueOf(i2));
        linkedHashMap.put("screenHeight", Integer.valueOf(i));
        linkedHashMap.put("os", "android");
        String str3 = Build.VERSION.RELEASE;
        C89219l.m154716b(str3, "");
        linkedHashMap.put("osVersion", str3);
        linkedHashMap.put("channel", C17867d.f42595s);
        String a3 = C58071d.m104907a();
        C89219l.m154716b(a3, "");
        linkedHashMap.put("region", a3);
        linkedHashMap.put("appName", C17867d.m33081b());
        linkedHashMap.put("appVersion", C17867d.m33085f());
        linkedHashMap.put("updateVersionCode", String.valueOf(C17867d.m33083d()));
        String locale = C80398en.m139370a().toString();
        C89219l.m154716b(locale, "");
        linkedHashMap.put("language", locale);
        linkedHashMap.put("appLanguage", SettingServiceImpl.m120782v().mo108872h());
        String b = C53438a.m98623b();
        C89219l.m154716b(b, "");
        linkedHashMap.put("appLocale", b);
        AbstractC16239d dVar = (AbstractC16239d) bVar2.mo25832c(AbstractC16239d.class);
        if (dVar == null || (a2 = dVar.mo25681a(EnumC16723b.LYNX)) == null || (str = a2.mo25713d()) == null) {
            str = "";
        }
        linkedHashMap.put("lynxSdkVersion", str);
        linkedHashMap.put("aid", Integer.valueOf(C17867d.f42590n));
        String serverDeviceId = AppLog.getServerDeviceId();
        C89219l.m154716b(serverDeviceId, "");
        linkedHashMap.put("deviceId", serverDeviceId);
        int b2 = C34728n.m70948b((double) C34723i.m70927b());
        Rect rect = new Rect();
        AbstractC17045g gVar = (AbstractC17045g) bVar2.mo25832c(AbstractC17045g.class);
        if (!(gVar == null || (a = gVar.mo26816a()) == null)) {
            Window window = a.getWindow();
            C89219l.m154716b(window, "");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i3 = C34728n.m70948b((double) rect.top) >= b2 ? C34728n.m70948b((double) rect.height()) : C34728n.m70948b((double) rect.height()) - b2;
        }
        linkedHashMap.put("statusBarHeight", Integer.valueOf(b2));
        linkedHashMap.put("safeAreaHeight", Integer.valueOf(i3));
        IBulletHostProxy b3 = BulletHostProxy.m71370b();
        Uri e = bVar.mo25772e();
        if (e == null || (str2 = e.toString()) == null) {
            str2 = "";
        }
        C89219l.m154716b(str2, "");
        JSONObject a4 = b3.mo61836a(str2);
        if (a4 != null) {
            linkedHashMap.put("abParams", JsonExtKt.toMap(a4));
        }
        return linkedHashMap;
    }
}
