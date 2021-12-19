package com.p2082ss.android.ugc.aweme.video.simplayer;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.p1733u.C23435d;
import com.bytedance.p1733u.EnumC23438f;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2397bm.C34888b;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63034d;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63071d;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.util.C81077c;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.playerkit.C84180b;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84270f;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84271g;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h;
import java.io.File;
import java.net.URI;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl */
public class PlayerConfigImpl implements ISimPlayerConfig {
    static {
        Covode.recordClassIndex(94303);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public AbstractC84270f createAudioUrlProcessor() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public AbstractC84271g createSubUrlProcessor() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public AbstractC84272h createVideoUrlProcessor() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean disableSleepResume(String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void downloadFile(String str, String str2, String str3, String str4) {
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean enableByteVc1FailCheckCountPolicy() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean enableFileIoOpt(String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean enableForceUseH264CheckPolicy() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean enableForceUseH264Global() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public AbstractC63032b getBitrateSelectListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public AbstractC63034d getBitrateSelector() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public C84223u getDashProcessUrlData(String str, boolean z, long j) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public int getPlayerType() {
        return 0;
    }

    public boolean ignoreExoReleaseState() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPluginApplied() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public int getAverageSpeedInKBps() {
        return C84116g.m144637f();
    }

    public ISimPlayerConfig.AbstractC80715a getPreRenderConfig() {
        return 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
              (wrap: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1 : 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1) = (r1v0 'this' com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl A[IMMUTABLE_TYPE, THIS]) call: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig.1.<init>(com.ss.android.ugc.aweme.video.config.ISimPlayerConfig):void type: CONSTRUCTOR)
             in method: com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl.getPreRenderConfig():com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$a, file: classes4.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1) = (r1v0 'this' com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl A[IMMUTABLE_TYPE, THIS]) call: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig.1.<init>(com.ss.android.ugc.aweme.video.config.ISimPlayerConfig):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl.getPreRenderConfig():com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$a, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.config.ISimPlayerConfig, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1 r0 = new com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$1
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl.getPreRenderConfig():com.ss.android.ugc.aweme.video.config.ISimPlayerConfig$a");
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPlayerPreferchCaption() {
        return C62956e.m113379c();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPlayerPreferchTtsAudio() {
        return C62956e.m113378b();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isCache(C84241i iVar) {
        return C80937s.m140453b().mo124069a(iVar);
    }

    /* renamed from: com_ss_android_ugc_aweme_video_simplayer_PlayerConfigImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir */
    public static File m140517x588f4b81(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public String getThumbCacheDir(Context context) {
        File b;
        if (!C80720e.m139939e()) {
            b = m140517x588f4b81(context);
            if (C23435d.m44115a()) {
                b = C23435d.m44117b(context, EnumC23438f.PREFER_PRIVATE);
            }
        } else {
            b = C80720e.m139924b(context);
            if (C23435d.m44115a()) {
                b = C23435d.m44117b(context, EnumC23438f.PREFER_EXTERNAL);
            }
        }
        File file = new File(b, "cache/thumbs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isHttpsVideoUrlModel(C84241i iVar) {
        List<String> urlList;
        if (iVar == null || (urlList = iVar.getUrlList()) == null || urlList.size() <= 0) {
            return false;
        }
        for (String str : urlList) {
            if (!isCookieSharedUrl(C84231a.f188309a, str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public C63071d getISimPlayerPlaySessionConfig(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C63071d dVar = new C63071d();
        dVar.f143318d = z;
        boolean z10 = false;
        if (!C62956e.m113381e() || !C62956e.m113380d()) {
            dVar.f143321g = C16048b.m29633a().mo25412a(true, "player_v3_pool_max_size", 5);
            dVar.f143322h = C16048b.m29633a().mo25412a(true, "player_v3_pool_core_size", 3);
            if (!C62956e.m113382f() || C16048b.m29633a().mo25412a(true, "player_v3_session_reuse_enable", 0) != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            dVar.f143319e = z2;
            if (!C62956e.m113382f() || C16048b.m29633a().mo25412a(true, "player_v3_prerender_session_reuse_enable", 0) != 1) {
                z3 = false;
            } else {
                z3 = true;
            }
            dVar.f143324j = z3;
            dVar.f143323i = C16048b.m29633a().mo25412a(true, "player_v3_session_pool_size", 1);
        } else {
            dVar.f143321g = C16048b.m29633a().mo25412a(true, "player_v3_mtk_pool_max_size", 5);
            dVar.f143322h = C16048b.m29633a().mo25412a(true, "player_v3_mtk_pool_core_size", 3);
            if (!C62956e.m113382f() || C16048b.m29633a().mo25412a(true, "player_v3_mtk_session_reuse_enable", 0) != 1) {
                z7 = false;
            } else {
                z7 = true;
            }
            dVar.f143319e = z7;
            dVar.f143323i = C16048b.m29633a().mo25412a(true, "player_v3_mtk_session_pool_size", 1);
            if (C16048b.m29633a().mo25412a(true, "player_v3_mtk_bytevc1_reuse_enable", 0) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            dVar.f143330p = z8;
            if (!C62956e.m113382f() || C16048b.m29633a().mo25412a(true, "player_v3_prerender_session_reuse_enable", 0) != 1) {
                z9 = false;
            } else {
                z9 = true;
            }
            dVar.f143324j = z9;
            dVar.f143329o = true;
        }
        if (C16048b.m29633a().mo25412a(true, "player_v3_session_reuse_codec_type_enable", 0) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        dVar.f143320f = z4;
        if (C16048b.m29633a().mo25412a(true, "player_v3_single_reuse_h264_enable", 0) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        dVar.f143326l = z5;
        if (C16048b.m29633a().mo25412a(true, "player_v3_session_reuse_refactor_enable", 0) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        dVar.f143328n = z6;
        if (!z) {
            if (C16048b.m29633a().mo25412a(true, "player_shadow_mode_enable", 0) == 1) {
                z10 = true;
            }
            dVar.f143331q = z10;
        }
        if (C80695q.m139908a()) {
            C34888b.m71265a("SimPlayerBuilder", "PlayerManager con singleThreadMode:" + dVar.f143318d + ", maxPoolSize:" + dVar.f143321g + ", corePoolSize:" + dVar.f143322h + ", enableSessionPool:" + dVar.f143319e + ", sessionPoolSize:" + dVar.f143323i + ", enableSameCodecSessionReuse:" + dVar.f143320f + ", enableH264SingleSessionReuse:" + dVar.f143326l + ", enableSessionReuseRefactor:" + dVar.f143328n);
        }
        return dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public EnumC63056b getProperResolution(String str, AbstractC63057c cVar) {
        return AbstractC74616d.m131036a().mo117291c().mo117297a(str, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public C84241i getVideoPlayAddr(C84240h hVar, C84209m.EnumC84214e eVar) {
        if (hVar == null) {
            return null;
        }
        if (shouldPlayInBytevc1(hVar, eVar)) {
            return hVar.getPlayAddrBytevc1();
        }
        return hVar.getPlayAddrH264();
    }

    public boolean shouldPlayInBytevc1(C84240h hVar, C84209m.EnumC84214e eVar) {
        if (!C84180b.m144763a(hVar.getPlayAddrBytevc1()) || !C84180b.m144762a(eVar)) {
            return false;
        }
        return true;
    }

    public boolean isCookieSharedUrl(Context context, String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("https://")) {
            try {
                if (C22898a.m43150a(context).mo23739d(URI.create(str).getHost()) != null) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        AppLog.recordMiscLog(context, str, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public C84209m getPlayerConfig(C84209m.EnumC84214e eVar, boolean z, boolean z2) {
        return C80990a.m140518a(eVar, z, z2);
    }

    private JSONObject getPrepareOrFirstFrameExtraJSON(long j, boolean z, boolean z2) {
        C33743c a = new C33743c().mo59976a("duration", String.valueOf(j));
        a.mo59971a("is_cache", Boolean.valueOf(z));
        a.mo59971a("bytevc1", Boolean.valueOf(z2));
        a.mo59975a("video_duration", Long.valueOf(C81079v.m140776O().mo123887j()));
        C81077c.m140768a(a);
        return a.mo59977a();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2) {
        C33830n.m70668a(str, getPrepareOrFirstFrameExtraJSON(j, z, z2));
    }

    @Override // com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2) {
        C39162r.onEvent(MobClick.obtain().setEventName(str2).setLabelName("perf_monitor").setExtValueLong(j));
        C33830n.m70668a(str, getPrepareOrFirstFrameExtraJSON(j, z, z2));
    }
}
