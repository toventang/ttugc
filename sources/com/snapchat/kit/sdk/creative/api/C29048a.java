package com.snapchat.kit.sdk.creative.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
import com.snapchat.kit.sdk.creative.internal.C29062a;
import com.snapchat.kit.sdk.creative.internal.SnapCreativeShareResultHandler;
import com.snapchat.kit.sdk.creative.p2071a.C29045a;
import com.snapchat.kit.sdk.creative.p2071a.C29046b;
import com.snapchat.kit.sdk.creative.p2073c.C29056d;
import com.snapchat.kit.sdk.creative.p2074d.AbstractC29058a;
import com.snapchat.kit.sdk.creative.p2074d.C29059b;
import com.snapchat.kit.sdk.p2066b.C28948a;
import com.snapchat.kit.sdk.p2066b.C28949b;
import java.util.ArrayList;

/* renamed from: com.snapchat.kit.sdk.creative.api.a */
public class C29048a {

    /* renamed from: a */
    private final Context f68619a;

    /* renamed from: b */
    private final String f68620b;

    /* renamed from: c */
    private C29046b f68621c;

    /* renamed from: d */
    private final MetricQueue<ServerEvent> f68622d;

    /* renamed from: e */
    private final C29045a f68623e;

    /* renamed from: f */
    private String f68624f;

    /* renamed from: g */
    private KitPluginType f68625g;

    /* renamed from: h */
    private boolean f68626h;

    static {
        Covode.recordClassIndex(35395);
    }

    /* renamed from: a */
    public final void mo50723a(AbstractC29058a aVar) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        C29062a aVar2 = new C29062a(this.f68620b, aVar);
        String str2 = C28948a.f68393a;
        PackageManager packageManager = this.f68619a.getPackageManager();
        if (!C28949b.m57972a(packageManager, str2)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1764a.m5928a("https://play.google.com/store/apps/details?id=%s", new Object[]{str2})));
            intent.setFlags(268435456);
            m58035a(this.f68619a, intent);
            this.f68621c.mo50719a("sendToPlayStore");
            return;
        }
        this.f68621c.mo50719a("sendIntentToApp");
        Context context = this.f68619a;
        KitPluginType kitPluginType = this.f68625g;
        boolean z = this.f68626h;
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setDataAndType(Uri.parse(C1764a.m5928a("snapchat://%s?link=%s", new Object[]{aVar2.f68649a.mo50725a(), aVar2.f68650b})), aVar2.f68649a.mo50726b());
        Uri a = C28949b.m57970a(context, aVar2.f68649a.mo50727c());
        C29056d dVar = aVar2.f68649a.f68640a;
        if (dVar != null) {
            Uri a2 = C28949b.m57970a(context, dVar.f68630a);
            intent2.putExtra("sticker", dVar.mo50724a(a2, context).toString());
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (a != null) {
                arrayList.add(a);
            }
            arrayList.add(a2);
            if (arrayList.size() > 1) {
                intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
            } else if (!arrayList.isEmpty()) {
                intent2.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
            }
        } else if (a != null) {
            intent2.putExtra("android.intent.extra.STREAM", a);
        }
        String str3 = aVar2.f68649a.f68641b;
        if (!TextUtils.isEmpty(str3)) {
            intent2.putExtra("attachmentUrl", str3);
        }
        String str4 = aVar2.f68649a.f68642c;
        if (!TextUtils.isEmpty(str4)) {
            intent2.putExtra("captionText", str4);
        }
        if (aVar2.f68649a instanceof C29059b) {
            C29059b bVar = (C29059b) aVar2.f68649a;
            String str5 = bVar.f68643d;
            String str6 = bVar.f68644e;
            if (!TextUtils.isEmpty(str5)) {
                intent2.putExtra("lensUUID", str5);
            } else if (!TextUtils.isEmpty(str6)) {
                intent2.putExtra("lensId", str6);
            }
            if (!TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6)) {
                if (bVar.f68645f != null) {
                    str = bVar.f68645f.f68627a;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    intent2.putExtra("lensLaunchData", str);
                }
            }
        }
        if (kitPluginType != KitPluginType.NO_PLUGIN) {
            intent2.putExtra("kitPluginType", kitPluginType.toString());
        }
        intent2.putExtra("sdk_is_from_react_native_plugin", z);
        String a3 = C29062a.m58050a(context);
        if (!TextUtils.isEmpty(a3)) {
            intent2.putExtra("CLIENT_APP_NAME", a3);
        }
        intent2.setPackage(str2);
        intent2.putExtra("CLIENT_ID", this.f68620b);
        intent2.putExtra("KIT_VERSION", "1.12.0");
        intent2.putExtra("KIT_VERSION_CODE", 40);
        intent2.putExtra("deep_link_intent", true);
        if (!TextUtils.isEmpty(this.f68624f)) {
            intent2.putExtra("KIT_REDIRECT_URL", this.f68624f);
        }
        intent2.putExtra("RESULT_INTENT", PendingIntent.getBroadcast(this.f68619a, 17, new Intent(this.f68619a, SnapCreativeShareResultHandler.class), 1073741824));
        intent2.setFlags(335544320);
        if (intent2.resolveActivity(packageManager) != null) {
            this.f68622d.push(new ServerEvent.Builder().event_data(new ServerEventData.Builder().creative_kit_share_start(new CreativeKitShareStart.Builder().creative_kit_event_base(new CreativeKitEventBase.Builder().kit_event_base(this.f68623e.f68615a.mo50372a(KitType.CREATIVE_KIT, "1.12.0")).build()).build()).build()).build());
            m58035a(this.f68619a, intent2);
            this.f68621c.mo50720a("sendLatency", System.currentTimeMillis() - currentTimeMillis);
            return;
        }
        this.f68621c.mo50719a("cannotShareContent");
        Toast makeText = Toast.makeText(this.f68619a, (int) R.string.fyy, 0);
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(makeText);
        }
        makeText.show();
    }

    /* renamed from: a */
    private static void m58035a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    public C29048a(Context context, String str, String str2, C29046b bVar, MetricQueue<ServerEvent> metricQueue, C29045a aVar, KitPluginType kitPluginType, boolean z) {
        this.f68619a = context;
        this.f68620b = str;
        this.f68624f = str2;
        this.f68621c = bVar;
        this.f68622d = metricQueue;
        this.f68623e = aVar;
        this.f68625g = kitPluginType;
        this.f68626h = z;
    }
}
