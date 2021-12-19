package com.p2082ss.android.ugc.aweme.tile;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService */
public final class HotVideoTileService extends TileService {

    /* renamed from: b */
    public static final long f174526b = 2500;

    /* renamed from: c */
    public static final C77796a f174527c = new C77796a((byte) 0);

    /* renamed from: a */
    public volatile boolean f174528a;

    public final int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$a */
    public static final class C77796a {
        static {
            Covode.recordClassIndex(90875);
        }

        private C77796a() {
        }

        public /* synthetic */ C77796a(byte b) {
            this();
        }
    }

    public final void onStartListening() {
        super.onStartListening();
        m135916a();
    }

    static {
        Covode.recordClassIndex(90874);
    }

    /* renamed from: a */
    private final void m135916a() {
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(1);
            qsTile.setLabel(getString(R.string.b3j));
            qsTile.updateTile();
        }
    }

    public final void onTileAdded() {
        super.onTileAdded();
        C39162r.m79460a("add_to_notificationbar", new C33744d().mo59983a("features", "watch_video").f79943a);
    }

    public final void onTileRemoved() {
        super.onTileRemoved();
        C39162r.m79460a("delete_from_notificationbar", new C33744d().mo59983a("features", "watch_video").f79943a);
    }

    public final void onCreate() {
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis() - C58945a.C58947b.f134185a.f134182i;
        if (uptimeMillis <= 1000) {
            C39162r.m79460a("active_in_notificationbar", new C33744d().mo59981a("time", uptimeMillis).mo59983a("features", "watch_video").f79943a);
        }
        m135916a();
    }

    public final void onClick() {
        super.onClick();
        if (!C17873f.f42636l) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(this, DeepLinkActivityV2.class);
            intent.putExtra("from_tile_service", true);
            intent.addFlags(268435456);
            startActivityAndCollapse(intent);
            return;
        }
        int i = C17867d.f42590n;
        if (i <= 0) {
            i = 1180;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setClass(this, DeepLinkActivityV2.class);
        intent2.setData(Uri.parse("snssdk" + i + "://feed?tab=1"));
        try {
            intent2.addFlags(268435456);
            intent2.putExtra("from_tile_service", true);
            startActivityAndCollapse(intent2);
            this.f174528a = false;
            C17873f.m33095c().mo143289d(new C77797b(this));
            C1731i.m5631a(f174526b).mo5538b(new C77798c(this), C1731i.f5564c);
        } catch (Exception e) {
            e.printStackTrace();
            C13468b.m24210a(e);
        }
        C39162r.m79460a("click_notificationbar", new C33744d().mo59983a("features", "watch_video").f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$b */
    static final class C77797b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ HotVideoTileService f174529a;

        static {
            Covode.recordClassIndex(90876);
        }

        C77797b(HotVideoTileService hotVideoTileService) {
            this.f174529a = hotVideoTileService;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            if (obj instanceof C17873f.AbstractC17876c) {
                this.f174529a.f174528a = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$c */
    static final class C77798c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ HotVideoTileService f174530a;

        static {
            Covode.recordClassIndex(90877);
        }

        C77798c(HotVideoTileService hotVideoTileService) {
            this.f174530a = hotVideoTileService;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", this.f174530a.f174528a ? 1 : 0);
            C12290b.m22066a("tile_service_open", jSONObject, (JSONObject) null, (JSONObject) null);
            return iVar;
        }
    }
}
