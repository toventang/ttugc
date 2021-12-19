package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.sdk.activity.C30225a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38230ap;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.business.C40589e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness */
public class DownloadBusiness extends BusinessService.Business {

    /* renamed from: a */
    public int f89706a = 0;

    /* renamed from: b */
    public int f89707b = 0;

    /* renamed from: c */
    private String f89708c;

    /* renamed from: d */
    private C38230ap f89709d = new C38230ap();

    static {
        Covode.recordClassIndex(45433);
    }

    DownloadBusiness(C40589e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public final void mo66191a(Activity activity) {
        int i = this.f89706a;
        if (i == 0) {
            i = R.id.dw;
        }
        activity.findViewById(i);
    }

    /* renamed from: a */
    public final void mo66192a(Activity activity, AbstractC40746j jVar) {
        int i = this.f89706a;
        if (i == 0) {
            i = R.id.dw;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(i);
        frameLayout.setVisibility(8);
        C38230ap apVar = this.f89709d;
        Bundle bundle = this.f94935k.f95068a.f95053b;
        if (bundle != null) {
            apVar.f90319a = bundle.getString("aweme_creative_id", "");
            apVar.f90321c = bundle.getString("aweme_group_id", "");
            apVar.f90322d = bundle.getString("bundle_download_app_log_extra");
            apVar.f90323e = bundle.getString("aweme_package_name");
            apVar.f90325g = bundle.getString("bundle_download_url");
            apVar.f90324f = bundle.getString("bundle_download_app_name");
            apVar.f90326h = bundle.getInt("bundle_app_ad_from", 0);
            apVar.f90328j = bundle.getString("bundle_download_app_extra");
            apVar.f90331m = bundle.getInt("bundle_download_mode");
            apVar.f90332n = bundle.getBoolean("bundle_support_multiple_download");
            try {
                apVar.f90329k = new JSONObject(bundle.getString("aweme_json_extra", ""));
            } catch (Exception e) {
                e.printStackTrace();
            }
            apVar.f90330l = bundle.getString("bundle_ad_quick_app_url");
            apVar.f90327i = C38230ap.m77595a(apVar.f90326h);
            try {
                apVar.f90320b = Long.parseLong(apVar.f90319a);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        frameLayout.setOnClickListener(View$OnClickListenerC37983d.f89766a);
        jVar.mo69969a().setDownloadListener(new C37984e(this, jVar, activity));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo66193a(AbstractC40746j jVar, Activity activity, String str, String str2, String str3, String str4, long j) {
        AbstractC34340m mVar;
        C34337k monitorSession = jVar.mo69969a().getMonitorSession();
        if (!(monitorSession == null || (mVar = (AbstractC34340m) monitorSession.mo60793a(AbstractC34340m.class)) == null)) {
            mVar.mo60778a(str, str3, str4, j);
        }
        JSONObject a = C30225a.m61165a(activity, this.f94935k.f95069b.f95106a, this.f94935k.f95069b.f95114i, str, jVar.mo69969a().getUrl(), jVar.mo69969a().getUrl());
        if (!this.f94935k.f95069b.f95117l) {
            C13627m.m24498a(str);
        }
        this.f89708c = str;
        new Object() {
            /* class com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness.C379741 */

            static {
                Covode.recordClassIndex(45434);
            }
        };
        C30225a.m61164a(activity, str, str2, str4, str3, a);
    }
}
