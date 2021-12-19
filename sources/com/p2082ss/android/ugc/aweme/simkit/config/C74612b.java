package com.p2082ss.android.ugc.aweme.simkit.config;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63034d;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63071d;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74647c;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74651e;
import com.p2082ss.android.ugc.aweme.simkit.impl.p3911b.C74627a;
import com.p2082ss.android.ugc.aweme.simkit.impl.p3911b.C74628b;
import com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.session.Session;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84270f;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84271g;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84265b;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84277m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.config.b */
public final class C74612b implements ISimPlayerConfig {

    /* renamed from: a */
    private final ISimPlayerConfig f167752a;

    static {
        Covode.recordClassIndex(87433);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void downloadFile(String str, String str2, String str3, String str4) {
        this.f167752a.downloadFile(str, str2, str3, str4);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getAverageSpeedInKBps() {
        return this.f167752a.getAverageSpeedInKBps();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C63071d getISimPlayerPlaySessionConfig(boolean z) {
        return this.f167752a.getISimPlayerPlaySessionConfig(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C84209m getPlayerConfig(C84209m.EnumC84214e eVar, boolean z, boolean z2) {
        return this.f167752a.getPlayerConfig(eVar, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final EnumC63056b getProperResolution(String str, AbstractC63057c cVar) {
        return this.f167752a.getProperResolution(str, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C84241i getVideoPlayAddr(C84240h hVar, C84209m.EnumC84214e eVar) {
        return this.f167752a.getVideoPlayAddr(hVar, eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isCache(C84241i iVar) {
        return this.f167752a.isCache(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isHttpsVideoUrlModel(C84241i iVar) {
        return this.f167752a.isHttpsVideoUrlModel(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPluginApplied() {
        return this.f167752a.isPluginApplied();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2) {
        this.f167752a.onRecordFirstFrameTime(str, j, str2, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2) {
        this.f167752a.onRecordPrepareTime(str, j, str2, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        this.f167752a.recordMiscLog(context, str, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableByteVc1FailCheckCountPolicy() {
        return this.f167752a.enableByteVc1FailCheckCountPolicy();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableForceUseH264CheckPolicy() {
        return this.f167752a.enableForceUseH264CheckPolicy();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableForceUseH264Global() {
        return this.f167752a.enableForceUseH264Global();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getPlayerType() {
        return this.f167752a.getPlayerType();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPlayerPreferchCaption() {
        return this.f167752a.isPlayerPreferchCaption();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return this.f167752a.isPlayerPreferchTtsAudio();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final AbstractC84272h createVideoUrlProcessor() {
        AbstractC84272h createVideoUrlProcessor = this.f167752a.createVideoUrlProcessor();
        if (createVideoUrlProcessor != null) {
            return createVideoUrlProcessor;
        }
        return C74609a.m131031a();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final AbstractC63032b getBitrateSelectListener() {
        AbstractC63032b bitrateSelectListener = this.f167752a.getBitrateSelectListener();
        if (bitrateSelectListener != null) {
            return bitrateSelectListener;
        }
        return C74647c.f167791a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final AbstractC63034d getBitrateSelector() {
        AbstractC63034d bitrateSelector = this.f167752a.getBitrateSelector();
        if (bitrateSelector != null) {
            return bitrateSelector;
        }
        return C74651e.f167795a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final AbstractC84270f createAudioUrlProcessor() {
        AbstractC84270f createAudioUrlProcessor = this.f167752a.createAudioUrlProcessor();
        if (createAudioUrlProcessor != null) {
            return createAudioUrlProcessor;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        ICommonConfig commonConfig = b.getCommonConfig();
        C89219l.m154709a((Object) commonConfig, "");
        if (commonConfig.getVideoUrlHooks() != null) {
            AbstractC74608c a2 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a2, "");
            ISimKitConfig b2 = a2.mo117290b();
            C89219l.m154709a((Object) b2, "");
            ICommonConfig commonConfig2 = b2.getCommonConfig();
            C89219l.m154709a((Object) commonConfig2, "");
            List<AbstractC84278n> videoUrlHooks = commonConfig2.getVideoUrlHooks();
            C89219l.m154709a((Object) videoUrlHooks, "");
            arrayList.addAll(videoUrlHooks);
        }
        AbstractC74608c a3 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a3, "");
        ISimKitConfig b3 = a3.mo117290b();
        C89219l.m154709a((Object) b3, "");
        if (b3.getPreloaderExperiment().PreloadTypeExperiment() == AbstractC80918i.EnumC80919a.VideoCache) {
            arrayList.add(new C74628b(C80937s.m140453b()));
        } else {
            AbstractC80918i b4 = C80937s.m140453b();
            AbstractC74608c a4 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a4, "");
            ISimKitConfig b5 = a4.mo117290b();
            C89219l.m154709a((Object) b5, "");
            ICommonConfig commonConfig3 = b5.getCommonConfig();
            C89219l.m154709a((Object) commonConfig3, "");
            arrayList.add(new C74627a(b4, commonConfig3.getVideoUrlHookHook()));
        }
        AbstractC74608c a5 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a5, "");
        ISimKitConfig b6 = a5.mo117290b();
        C89219l.m154709a((Object) b6, "");
        ICommonConfig commonConfig4 = b6.getCommonConfig();
        C89219l.m154709a((Object) commonConfig4, "");
        return new C84265b(arrayList, (long) commonConfig4.getDefaultCDNTimeoutTime());
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final AbstractC84271g createSubUrlProcessor() {
        AbstractC84271g createSubUrlProcessor = this.f167752a.createSubUrlProcessor();
        if (createSubUrlProcessor != null) {
            return createSubUrlProcessor;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        ICommonConfig commonConfig = b.getCommonConfig();
        C89219l.m154709a((Object) commonConfig, "");
        if (commonConfig.getVideoUrlHooks() != null) {
            AbstractC74608c a2 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a2, "");
            ISimKitConfig b2 = a2.mo117290b();
            C89219l.m154709a((Object) b2, "");
            ICommonConfig commonConfig2 = b2.getCommonConfig();
            C89219l.m154709a((Object) commonConfig2, "");
            List<AbstractC84278n> videoUrlHooks = commonConfig2.getVideoUrlHooks();
            C89219l.m154709a((Object) videoUrlHooks, "");
            arrayList.addAll(videoUrlHooks);
        }
        AbstractC74608c a3 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a3, "");
        ISimKitConfig b3 = a3.mo117290b();
        C89219l.m154709a((Object) b3, "");
        if (b3.getPreloaderExperiment().PreloadTypeExperiment() == AbstractC80918i.EnumC80919a.VideoCache) {
            arrayList.add(new C74628b(C80937s.m140453b()));
        } else {
            AbstractC80918i b4 = C80937s.m140453b();
            AbstractC74608c a4 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a4, "");
            ISimKitConfig b5 = a4.mo117290b();
            C89219l.m154709a((Object) b5, "");
            ICommonConfig commonConfig3 = b5.getCommonConfig();
            C89219l.m154709a((Object) commonConfig3, "");
            arrayList.add(new C74627a(b4, commonConfig3.getVideoUrlHookHook()));
        }
        AbstractC74608c a5 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a5, "");
        ISimKitConfig b6 = a5.mo117290b();
        C89219l.m154709a((Object) b6, "");
        ICommonConfig commonConfig4 = b6.getCommonConfig();
        C89219l.m154709a((Object) commonConfig4, "");
        return new C84277m(arrayList, (long) commonConfig4.getDefaultCDNTimeoutTime());
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean disableSleepResume(String str) {
        return this.f167752a.disableSleepResume(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableFileIoOpt(String str) {
        return this.f167752a.enableFileIoOpt(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final String getThumbCacheDir(Context context) {
        return this.f167752a.getThumbCacheDir(context);
    }

    public C74612b(ISimPlayerConfig iSimPlayerConfig) {
        C89219l.m154719c(iSimPlayerConfig, "");
        this.f167752a = iSimPlayerConfig;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C84223u getDashProcessUrlData(String str, boolean z, long j) {
        int i;
        C84223u uVar = new C84223u();
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        ICommonConfig commonConfig = b.getCommonConfig();
        C89219l.m154709a((Object) commonConfig, "");
        AbstractC74605d superResolutionStrategy = commonConfig.getSuperResolutionStrategy();
        if (!z || superResolutionStrategy == null) {
            i = 1;
        } else {
            i = superResolutionStrategy.mo117328a(str, true, j, 0, "", 1.0f);
            if (i == 100) {
                uVar.f188238i = true;
            }
        }
        Session c = C84229a.f188297a.mo129052c(str);
        if (c != null) {
            if (uVar.f188238i) {
                i = 100;
            }
            c.preSuperResolution = i;
            c.isOpenSuperResolution = uVar.f188238i;
        }
        return uVar;
    }
}
