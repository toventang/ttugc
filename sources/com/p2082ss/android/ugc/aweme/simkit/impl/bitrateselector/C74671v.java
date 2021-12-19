package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74665r;
import com.p2082ss.android.ugc.aweme.simkit.impl.p3911b.C74627a;
import com.p2082ss.android.ugc.aweme.simkit.impl.p3911b.C74628b;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.playerkit.p4324d.C84189d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84273i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84274j;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84281o;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.v */
public final class C74671v implements AbstractC63032b {

    /* renamed from: a */
    private List<AbstractC84278n> f167833a = new ArrayList();

    static {
        Covode.recordClassIndex(87494);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63033c
    /* renamed from: a */
    public final void mo101043a(int i, int i2, C63059e.C63060a aVar) {
    }

    public C74671v() {
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        ICommonConfig commonConfig = b.getCommonConfig();
        C89219l.m154709a((Object) commonConfig, "");
        if (commonConfig.getVideoUrlHooks() != null) {
            List<AbstractC84278n> list = this.f167833a;
            AbstractC74608c a2 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a2, "");
            ISimKitConfig b2 = a2.mo117290b();
            C89219l.m154709a((Object) b2, "");
            ICommonConfig commonConfig2 = b2.getCommonConfig();
            C89219l.m154709a((Object) commonConfig2, "");
            List<AbstractC84278n> videoUrlHooks = commonConfig2.getVideoUrlHooks();
            C89219l.m154709a((Object) videoUrlHooks, "");
            list.addAll(videoUrlHooks);
        }
        AbstractC74608c a3 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a3, "");
        ISimKitConfig b3 = a3.mo117290b();
        C89219l.m154709a((Object) b3, "");
        if (b3.getPreloaderExperiment().PreloadTypeExperiment() == AbstractC80918i.EnumC80919a.VideoCache) {
            this.f167833a.add(new C74628b(C80937s.m140453b()));
        } else {
            List<AbstractC84278n> list2 = this.f167833a;
            AbstractC80918i b4 = C80937s.m140453b();
            AbstractC74608c a4 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a4, "");
            ISimKitConfig b5 = a4.mo117290b();
            C89219l.m154709a((Object) b5, "");
            ICommonConfig commonConfig3 = b5.getCommonConfig();
            C89219l.m154709a((Object) commonConfig3, "");
            list2.add(new C74627a(b4, commonConfig3.getVideoUrlHookHook()));
        }
        List<AbstractC84278n> list3 = this.f167833a;
        if (list3 == null || list3.isEmpty()) {
            AbstractC84278n nVar = AbstractC84278n.f188471b;
            C89219l.m154709a((Object) nVar, "");
            this.f167833a = C89070n.m154524c(nVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: a */
    public final boolean mo101044a(int i, int i2, C63059e eVar) {
        C74665r rVar = C74665r.C74667a.f167829a;
        C89219l.m154709a((Object) rVar, "");
        if (rVar.mo117469a() == null || eVar == null || eVar.f143244i == null) {
            C74665r rVar2 = C74665r.C74667a.f167829a;
            C89219l.m154709a((Object) rVar2, "");
            rVar2.mo117469a();
            return false;
        }
        C84241i a = C84189d.m144772a(eVar);
        if (a == null) {
            return false;
        }
        AbstractC74608c a2 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a2, "");
        if (a2.mo117290b() != null) {
            AbstractC74608c a3 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a3, "");
            ISimKitConfig b = a3.mo117290b();
            C89219l.m154709a((Object) b, "");
            if (b.getCommonConfig() != null) {
                AbstractC74608c a4 = AbstractC74616d.m131036a();
                C89219l.m154709a((Object) a4, "");
                ISimKitConfig b2 = a4.mo117290b();
                C89219l.m154709a((Object) b2, "");
                if (b2.getCommonConfig().isSkipSelectBitrate(a)) {
                    AbstractC74608c a5 = AbstractC74616d.m131036a();
                    C89219l.m154709a((Object) a5, "");
                    ISimKitConfig b3 = a5.mo117290b();
                    C89219l.m154709a((Object) b3, "");
                    if (!TextUtils.isEmpty(b3.getCommonConfig().getLocalVideoPath(a))) {
                        C63059e.C63060a aVar = eVar.f143244i;
                        AbstractC74608c a6 = AbstractC74616d.m131036a();
                        C89219l.m154709a((Object) a6, "");
                        ISimKitConfig b4 = a6.mo117290b();
                        C89219l.m154709a((Object) b4, "");
                        aVar.f143274w = b4.getCommonConfig().getLocalVideoPath(a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: b */
    public final boolean mo101045b(int i, int i2, C63059e eVar) {
        if (eVar != null && eVar.f143241f) {
            return false;
        }
        C74665r rVar = C74665r.C74667a.f167829a;
        C89219l.m154709a((Object) rVar, "");
        if (rVar.mo117469a() == null || eVar == null || eVar.f143244i == null) {
            C74665r rVar2 = C74665r.C74667a.f167829a;
            C89219l.m154709a((Object) rVar2, "");
            rVar2.mo117469a();
            return false;
        }
        C84241i a = C84189d.m144772a(eVar);
        if (a == null) {
            return false;
        }
        AbstractC74608c a2 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a2, "");
        if (a2.mo117290b() != null) {
            AbstractC74608c a3 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a3, "");
            ISimKitConfig b = a3.mo117290b();
            C89219l.m154709a((Object) b, "");
            if (b.getCommonConfig() != null) {
                AbstractC74608c a4 = AbstractC74616d.m131036a();
                C89219l.m154709a((Object) a4, "");
                ISimKitConfig b2 = a4.mo117290b();
                C89219l.m154709a((Object) b2, "");
                if (b2.getCommonConfig().isSkipSelectBitrate(a)) {
                    AbstractC74608c a5 = AbstractC74616d.m131036a();
                    C89219l.m154709a((Object) a5, "");
                    ISimKitConfig b3 = a5.mo117290b();
                    C89219l.m154709a((Object) b3, "");
                    if (!TextUtils.isEmpty(b3.getCommonConfig().getLocalVideoPath(a))) {
                        C63059e.C63060a aVar = eVar.f143244i;
                        AbstractC74608c a6 = AbstractC74616d.m131036a();
                        C89219l.m154709a((Object) a6, "");
                        ISimKitConfig b4 = a6.mo117290b();
                        C89219l.m154709a((Object) b4, "");
                        aVar.f143274w = b4.getCommonConfig().getLocalVideoPath(a);
                        return true;
                    }
                }
            }
        }
        C63059e.C63060a aVar2 = eVar.f143244i;
        String str = aVar2.f143256e;
        List<String> list = aVar2.f143257f;
        C89219l.m154709a((Object) list, "");
        Object[] array = list.toArray(new String[0]);
        if (array != null) {
            C84273i iVar = new C84273i(a, str, (String[]) array);
            C84274j a7 = new C84281o(this.f167833a, iVar, 0).mo129303a(iVar);
            C63059e.C63060a aVar3 = eVar.f143244i;
            Object obj = a7.f188462a;
            if (!(obj instanceof String)) {
                obj = null;
            }
            aVar3.f143274w = (String) obj;
            aVar3.f143272u = a7.f188463b;
            aVar3.f143264m = a.getRatio();
            return false;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
