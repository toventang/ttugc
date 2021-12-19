package com.p2082ss.android.ugc.aweme.feed.background;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.p1380a.C19221b;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.C19242a;
import com.p2082ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49421a;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49427b;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49430c;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.background.b */
public final class ServiceConnectionC49285b implements ServiceConnection {

    /* renamed from: a */
    public final C49445o f113289a;

    /* renamed from: b */
    private BackgroundAudioBrowserService f113290b;

    static {
        Covode.recordClassIndex(58083);
    }

    public final void onBindingDied(ComponentName componentName) {
    }

    public final void onNullBinding(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo80888a() {
        BackgroundAudioBrowserService backgroundAudioBrowserService = this.f113290b;
        if (backgroundAudioBrowserService != null) {
            backgroundAudioBrowserService.mo80883a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f113290b = null;
    }

    public ServiceConnectionC49285b(C49445o oVar) {
        C89219l.m154721d(oVar, "");
        this.f113289a = oVar;
    }

    /* renamed from: a */
    public final void mo80889a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        BackgroundAudioBrowserService backgroundAudioBrowserService = this.f113290b;
        if (backgroundAudioBrowserService != null) {
            C89219l.m154721d(aweme, "");
            C19242a aVar = backgroundAudioBrowserService.f113260k;
            if (aVar == null) {
                C89219l.m154710a("xAndroidSessionController");
            }
            aVar.mo30597a(true);
            C19221b bVar = backgroundAudioBrowserService.f113259j;
            if (bVar == null) {
                C89219l.m154710a("xNotificationController");
            }
            bVar.mo30578a(true);
            C19242a aVar2 = backgroundAudioBrowserService.f113260k;
            if (aVar2 == null) {
                C89219l.m154710a("xAndroidSessionController");
            }
            aVar2.mo30596a(C49283a.m92317a(aweme));
            C19242a aVar3 = backgroundAudioBrowserService.f113260k;
            if (aVar3 == null) {
                C89219l.m154710a("xAndroidSessionController");
            }
            aVar3.mo30600d();
            C19242a aVar4 = backgroundAudioBrowserService.f113260k;
            if (aVar4 == null) {
                C89219l.m154710a("xAndroidSessionController");
            }
            aVar4.mo30598b();
            C19221b bVar2 = backgroundAudioBrowserService.f113259j;
            if (bVar2 == null) {
                C89219l.m154710a("xNotificationController");
            }
            bVar2.mo30576a(C49283a.m92317a(aweme));
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new BackgroundAudioBrowserService.C49281k(backgroundAudioBrowserService, aweme, null), 3);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C89219l.m154721d(iBinder, "");
        if (!(iBinder instanceof BackgroundAudioBrowserService.BinderC49272c)) {
            iBinder = null;
        }
        BackgroundAudioBrowserService.BinderC49272c cVar = (BackgroundAudioBrowserService.BinderC49272c) iBinder;
        if (cVar != null) {
            BackgroundAudioBrowserService backgroundAudioBrowserService = cVar.f113273b;
            C49445o oVar = this.f113289a;
            C89219l.m154721d(oVar, "");
            C49421a aVar = backgroundAudioBrowserService.f113256g;
            C89219l.m154721d(oVar, "");
            aVar.f113578a = oVar;
            C49430c cVar2 = backgroundAudioBrowserService.f113257h;
            C89219l.m154721d(oVar, "");
            cVar2.f113598a = oVar;
            C49427b bVar = backgroundAudioBrowserService.f113258i;
            C89219l.m154721d(oVar, "");
            bVar.f113593a = oVar;
            this.f113290b = cVar.f113273b;
            C49286c.f113291a = true;
        }
    }
}
