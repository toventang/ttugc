package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdkapi.model.C11836b;
import com.bytedance.android.livesdkapi.p691g.AbstractC11769i;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface IHostAction extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostAction$a */
    public interface AbstractC11786a {
        static {
            Covode.recordClassIndex(13477);
        }

        /* renamed from: a */
        void mo8360a(String str);

        /* renamed from: a */
        void mo8361a(String str, String str2);
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostAction$b */
    public interface AbstractC11787b {
        static {
            Covode.recordClassIndex(13478);
        }

        /* renamed from: a */
        void mo13358a();

        /* renamed from: a */
        void mo13359a(String str, String str2);
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostAction$c */
    public static class C11788c {

        /* renamed from: a */
        public double f28167a;

        /* renamed from: b */
        public int f28168b;

        static {
            Covode.recordClassIndex(13479);
        }
    }

    static {
        Covode.recordClassIndex(13476);
    }

    void finishLivePlayActivity();

    List<C11836b> getLiveActivityTasksSetting();

    String getReportUrl();

    AbstractC11769i getSearchComponent(String str);

    JSONObject getTTSetting();

    C11788c getVideoOnDemandParams();

    void goEditDoBAgeGatePage(Activity activity, String str, AbstractC11786a aVar);

    boolean handleSchema(Context context, String str, Bundle bundle);

    boolean handleSchema(Context context, String str, Bundle bundle, boolean z);

    void initLynxEnv();

    void notifyShowLiveIconEntrance(boolean z);

    void openFeedBack(String str, Context context);

    boolean openHostBrowser(String str, Bundle bundle, Context context);

    boolean openHostBrowser(String str, boolean z, String str2, Context context);

    void openLiveBrowser(String str, Bundle bundle, Context context);

    void openLiveBrowser(String str, String str2, Context context);

    void openLiveLynx(String str, Bundle bundle, Context context);

    void openLiveNewHybrid(Uri uri, Context context, Bundle bundle);

    void openRegionListPage(Activity activity, AbstractC11787b bVar);

    void openSignActivity(Context context, Intent intent);

    void openUserProfilePage(long j, Map<String, String> map);

    void openUserProfilePage(Context context, long j, Bundle bundle);

    void openVideoDetailPage(String str, String str2);

    void switchToLiveTab(int i, String str);

    boolean tryOpenAdByOpenUrl(Context context, long j, String str, String str2);

    boolean tryShowKoiRedPackageInLive(String str);
}
