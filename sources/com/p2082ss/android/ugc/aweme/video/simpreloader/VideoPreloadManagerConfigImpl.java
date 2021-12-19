package com.p2082ss.android.ugc.aweme.video.simpreloader;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.p3452ml.C59974a;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63034d;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63037g;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80685k;
import com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80828a;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80843b;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80844c;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80845d;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80846e;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80847f;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80848g;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80849h;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80852j;
import com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.p2082ss.android.ugc.aweme.video.simplayer.C81019o;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h;

/* renamed from: com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl */
public class VideoPreloadManagerConfigImpl implements IVideoPreloadConfig {
    static {
        Covode.recordClassIndex(94370);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC84272h createVideoUrlProcessor() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC63032b getBitrateSelectListener() {
        return null;
    }

    public AbstractC63034d getBitrateSelector() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public C84223u getSelectedBitrateForColdBoot(C84241i iVar) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean useSyncPreloadStyle() {
        return C80685k.f180387a;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80828a getAppLog() {
        return new C81053b();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80843b getCacheHelper() {
        return new C81054c();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public IPreloaderExperiment getExperiment() {
        return new PreloaderExperiment();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80844c getMLServiceSpeedModel() {
        return new AbstractC80844c() {
            /* class com.p2082ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.C810501 */

            static {
                Covode.recordClassIndex(94371);
            }

            @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80844c
            /* renamed from: a */
            public final Integer mo124199a() {
                int i;
                MLModel mLModel = C59974a.f136568a.f136569b;
                if (mLModel == null) {
                    return null;
                }
                if (mLModel.params == null || mLModel.params.length <= 0) {
                    i = 500;
                } else {
                    i = mLModel.params[0];
                }
                return Integer.valueOf(i);
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80845d getMusicService() {
        return new AbstractC80845d() {
            /* class com.p2082ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.C810512 */

            static {
                Covode.recordClassIndex(94372);
            }

            @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80845d
            /* renamed from: a */
            public final int mo124200a() {
                return MusicService.m81198m().mo69318g();
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80848g getPlayerCommonParamManager() {
        return new C81059f();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80847f getPlayerEventReportService() {
        return new C81060g();
    }

    public AbstractC80849h getPreloadStrategy() {
        return 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
              (wrap: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1 : 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1) = (r1v0 'this' com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl A[IMMUTABLE_TYPE, THIS]) call: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig.1.<init>(com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig):void type: CONSTRUCTOR)
             in method: com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.getPreloadStrategy():com.ss.android.ugc.aweme.video.preload.api.h, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1) = (r1v0 'this' com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl A[IMMUTABLE_TYPE, THIS]) call: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig.1.<init>(com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.getPreloadStrategy():com.ss.android.ugc.aweme.video.preload.api.h, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1 r0 = new com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig$1
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl.getPreloadStrategy():com.ss.android.ugc.aweme.video.preload.api.h");
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80846e getSpeedManager() {
        return new C81058e();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80850i getStorageManager() {
        return new C81063j();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC80852j getVideoCachePlugin() {
        return new C81065k();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPlayerPreferchCaption() {
        return C62956e.m113379c();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPlayerPreferchTtsAudio() {
        return C62956e.m113378b();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPreloadV3Enabled() {
        if (C16048b.m29633a().mo25412a(true, "player_preload_v3", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public int playerPreferchTtsAudioSize() {
        return C16048b.m29633a().mo25412a(true, "player_preferch_tts_audio_size", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean canPreload() {
        if (!AwemeApplicationServiceImpl.m68723c().mo59702a() || C16048b.m29633a().mo25412a(true, "enable_preload_background", 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public AbstractC63037g getNetClient() {
        return new C81019o(C18097a.m33697a(C1764a.m5928a("https://%s/", new Object[]{"tiktokv.com"})));
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isDashABREnabled() {
        if (C62956e.f142895d == null) {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "player_abr_enable", 0) != 1) {
                z = false;
            }
            C62956e.f142895d = Boolean.valueOf(z);
        }
        return C62956e.f142895d.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public EnumC63056b getProperResolution(String str, AbstractC63057c cVar) {
        if (VideoBitRateABManager.f180314a.mo123829d()) {
            return AbstractC74616d.m131036a().mo117291c().mo117297a(str, cVar);
        }
        return null;
    }
}
