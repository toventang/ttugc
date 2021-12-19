package com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64002ay;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.ui.e */
final /* synthetic */ class View$OnClickListenerC58922e implements View.OnClickListener {

    /* renamed from: a */
    private final LiveWallPaperPreviewActivity f134148a;

    static {
        Covode.recordClassIndex(69241);
    }

    View$OnClickListenerC58922e(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f134148a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.f134148a;
        C39110a aVar = new C39110a(liveWallPaperPreviewActivity);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C64002ay.C64003a(liveWallPaperPreviewActivity.getResources().getString(R.string.b4w)));
        arrayList.add(new C64002ay.C64003a(liveWallPaperPreviewActivity.getResources().getString(R.string.a8y)));
        C64002ay ayVar = new C64002ay(liveWallPaperPreviewActivity, arrayList);
        aVar.f92306a.mo448a(ayVar, new DialogInterface.OnClickListener(ayVar) {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.LiveWallPaperPreviewActivity.DialogInterface$OnClickListenerC589122 */

            /* renamed from: a */
            final /* synthetic */ C64002ay f134127a;

            static {
                Covode.recordClassIndex(69230);
            }

            {
                this.f134127a = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                if (LiveWallPaperPreviewActivity.this.getResources().getString(R.string.b4w).equals(this.f134127a.f145140a.get(i))) {
                    C17197a.C17200a aVar = new C17197a.C17200a(LiveWallPaperPreviewActivity.this);
                    aVar.f41071b = LiveWallPaperPreviewActivity.this.getResources().getString(R.string.b58);
                    aVar.mo27192a(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.as0), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.LiveWallPaperPreviewActivity.DialogInterface$OnClickListenerC589122.DialogInterface$OnClickListenerC589131 */

                        static {
                            Covode.recordClassIndex(69231);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C58895d dVar = C58895d.f134069e;
                            String id = LiveWallPaperPreviewActivity.this.f134120e.getId();
                            if (!C13603b.m24435a((Collection) dVar.f134070a) && !TextUtils.isEmpty(id)) {
                                Iterator<LiveWallPaperBean> it = dVar.f134070a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    LiveWallPaperBean next = it.next();
                                    if (id.equals(next.getId())) {
                                        dVar.mo96316a(next);
                                        it.remove();
                                        dVar.mo96319b();
                                        C1764a.m5928a("Remove wallpaper: %s", new Object[]{next});
                                        break;
                                    }
                                }
                            }
                            LiveWallPaperPreviewActivity.this.finish();
                        }
                    }, false).mo27196b(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.a8y), (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b();
                }
            }
        });
        try {
            aVar.f92306a.mo458b();
        } catch (Resources.NotFoundException e) {
            C51423a.m95790a((Throwable) e);
        }
    }
}
