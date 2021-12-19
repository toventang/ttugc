package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.m */
public abstract class AbstractC80773m implements AbstractC63041i {

    /* renamed from: a */
    protected boolean f180601a;

    static {
        Covode.recordClassIndex(94064);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.m$1 */
    static /* synthetic */ class C807741 {

        /* renamed from: a */
        static final /* synthetic */ int[] f180602a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 94065(0x16f71, float:1.31813E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.playerkit.model.m$e[] r0 = com.p2082ss.android.ugc.playerkit.model.C84209m.EnumC84214e.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.video.AbstractC80773m.C807741.f180602a = r2
                com.ss.android.ugc.playerkit.model.m$e r0 = com.p2082ss.android.ugc.playerkit.model.C84209m.EnumC84214e.Ijk     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.video.AbstractC80773m.C807741.f180602a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.p2082ss.android.ugc.playerkit.model.C84209m.EnumC84214e.EXO     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.video.AbstractC80773m.C807741.f180602a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.p2082ss.android.ugc.playerkit.model.C84209m.EnumC84214e.TT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.video.AbstractC80773m.C807741.f180602a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.p2082ss.android.ugc.playerkit.model.C84209m.EnumC84214e.IjkHardware     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.video.AbstractC80773m.C807741.f180602a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.p2082ss.android.ugc.playerkit.model.C84209m.EnumC84214e.TT_IJK_ENGINE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.p2082ss.android.ugc.aweme.video.AbstractC80773m.C807741.f180602a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.p2082ss.android.ugc.playerkit.model.C84209m.EnumC84214e.TT_HARDWARE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.AbstractC80773m.C807741.<clinit>():void");
        }
    }

    public AbstractC80773m(boolean z) {
        this.f180601a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i
    /* renamed from: a */
    public final void mo101179a(String str, long j, C84209m.EnumC84214e eVar, boolean z, boolean z2) {
        String str2;
        if (j > 0) {
            int i = C807741.f180602a[eVar.ordinal()];
            if (i == 2) {
                str2 = "aweme_movie_play_exo";
            } else if (i == 3) {
                str2 = "aweme_movie_play_tt";
            } else if (i == 4) {
                str2 = "aweme_movie_ijk_hardware";
            } else if (i != 5) {
                str2 = "aweme_movie_play";
            } else {
                str2 = "aweme_movie_tt_ijk_engine";
            }
            C80716a.C80717a.f180462a.mo123864a().onRecordPrepareTime(str, j, str2, z, z2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                jSONObject.put("player_type", str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j);
                C84231a.m144836b().monitorEvent("ttmp_play_info_prepare", jSONObject, jSONObject2, null);
            } catch (Throwable th) {
                C84231a.m144836b().ensureNotReachHere(th);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i
    /* renamed from: b */
    public final void mo101180b(String str, long j, C84209m.EnumC84214e eVar, boolean z, boolean z2) {
        String str2;
        if (j > 0) {
            int i = C807741.f180602a[eVar.ordinal()];
            if (i == 2) {
                str2 = "aweme_movie_play_exo";
            } else if (i == 3) {
                str2 = "aweme_movie_play_tt";
            } else if (i == 4) {
                str2 = "aweme_movie_ijk_hardware";
            } else if (i == 5) {
                str2 = "aweme_movie_tt_ijk_engine";
            } else if (i != 6) {
                str2 = "aweme_movie_play";
            } else {
                str2 = "aweme_movie_tt_hardware";
            }
            C80716a.C80717a.f180462a.mo123864a().onRecordFirstFrameTime(str, j, str2, z, z2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                jSONObject.put("player_type", str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j);
                C84231a.m144836b().monitorEvent("ttmp_play_info_ff", jSONObject, jSONObject2, null);
            } catch (Throwable th) {
                C84231a.m144836b().ensureNotReachHere(th);
            }
        }
    }
}
