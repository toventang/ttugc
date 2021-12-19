package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

public final class BattleResource {
    public static final C9299a Companion = new C9299a((byte) 0);
    @AbstractC27891c(mo46611a = "battle_draw")
    private final String battleDraw;
    @AbstractC27891c(mo46611a = "battle_lose")
    private final String battleLose;
    @AbstractC27891c(mo46611a = "battle_score_clap")
    private final String battleScoreClap;
    @AbstractC27891c(mo46611a = "battle_score_cry")
    private final String battleScoreCry;
    @AbstractC27891c(mo46611a = "battle_score_initial")
    private final String battleScoreInitial;
    @AbstractC27891c(mo46611a = "battle_score_strive")
    private final String battleScoreStrive;
    @AbstractC27891c(mo46611a = "battle_score_strong")
    private final String battleScoreStrong;
    @AbstractC27891c(mo46611a = "battle_score_tongue")
    private final String battleScoreTongue;
    @AbstractC27891c(mo46611a = "battle_score_weak")
    private final String battleScoreWeak;
    @AbstractC27891c(mo46611a = "battle_start")
    private final String battleStart;
    @AbstractC27891c(mo46611a = "battle_win")
    private final String battleWin;

    static {
        Covode.recordClassIndex(10221);
    }

    public BattleResource() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ BattleResource copy$default(BattleResource battleResource, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = battleResource.battleStart;
        }
        if ((i & 2) != 0) {
            str2 = battleResource.battleDraw;
        }
        if ((i & 4) != 0) {
            str3 = battleResource.battleWin;
        }
        if ((i & 8) != 0) {
            str4 = battleResource.battleLose;
        }
        if ((i & 16) != 0) {
            str5 = battleResource.battleScoreClap;
        }
        if ((i & 32) != 0) {
            str6 = battleResource.battleScoreCry;
        }
        if ((i & 64) != 0) {
            str7 = battleResource.battleScoreInitial;
        }
        if ((i & 128) != 0) {
            str8 = battleResource.battleScoreStrive;
        }
        if ((i & 256) != 0) {
            str9 = battleResource.battleScoreTongue;
        }
        if ((i & 512) != 0) {
            str10 = battleResource.battleScoreStrong;
        }
        if ((i & 1024) != 0) {
            str11 = battleResource.battleScoreWeak;
        }
        return battleResource.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public static final BattleResource defaultResource() {
        return C9299a.m17574a();
    }

    public final String component1() {
        return this.battleStart;
    }

    public final String component10() {
        return this.battleScoreStrong;
    }

    public final String component11() {
        return this.battleScoreWeak;
    }

    public final String component2() {
        return this.battleDraw;
    }

    public final String component3() {
        return this.battleWin;
    }

    public final String component4() {
        return this.battleLose;
    }

    public final String component5() {
        return this.battleScoreClap;
    }

    public final String component6() {
        return this.battleScoreCry;
    }

    public final String component7() {
        return this.battleScoreInitial;
    }

    public final String component8() {
        return this.battleScoreStrive;
    }

    public final String component9() {
        return this.battleScoreTongue;
    }

    public final BattleResource copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(str8, "");
        C89219l.m154721d(str9, "");
        C89219l.m154721d(str10, "");
        C89219l.m154721d(str11, "");
        return new BattleResource(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BattleResource)) {
            return false;
        }
        BattleResource battleResource = (BattleResource) obj;
        return C89219l.m154714a(this.battleStart, battleResource.battleStart) && C89219l.m154714a(this.battleDraw, battleResource.battleDraw) && C89219l.m154714a(this.battleWin, battleResource.battleWin) && C89219l.m154714a(this.battleLose, battleResource.battleLose) && C89219l.m154714a(this.battleScoreClap, battleResource.battleScoreClap) && C89219l.m154714a(this.battleScoreCry, battleResource.battleScoreCry) && C89219l.m154714a(this.battleScoreInitial, battleResource.battleScoreInitial) && C89219l.m154714a(this.battleScoreStrive, battleResource.battleScoreStrive) && C89219l.m154714a(this.battleScoreTongue, battleResource.battleScoreTongue) && C89219l.m154714a(this.battleScoreStrong, battleResource.battleScoreStrong) && C89219l.m154714a(this.battleScoreWeak, battleResource.battleScoreWeak);
    }

    public final int hashCode() {
        String str = this.battleStart;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.battleDraw;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.battleWin;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.battleLose;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.battleScoreClap;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.battleScoreCry;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.battleScoreInitial;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.battleScoreStrive;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.battleScoreTongue;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.battleScoreStrong;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.battleScoreWeak;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "BattleResource(battleStart=" + this.battleStart + ", battleDraw=" + this.battleDraw + ", battleWin=" + this.battleWin + ", battleLose=" + this.battleLose + ", battleScoreClap=" + this.battleScoreClap + ", battleScoreCry=" + this.battleScoreCry + ", battleScoreInitial=" + this.battleScoreInitial + ", battleScoreStrive=" + this.battleScoreStrive + ", battleScoreTongue=" + this.battleScoreTongue + ", battleScoreStrong=" + this.battleScoreStrong + ", battleScoreWeak=" + this.battleScoreWeak + ")";
    }

    /* renamed from: com.bytedance.android.livesdk.live.model.BattleResource$a */
    public static final class C9299a {
        static {
            Covode.recordClassIndex(10222);
        }

        private C9299a() {
        }

        /* renamed from: a */
        public static BattleResource m17574a() {
            return new BattleResource(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public /* synthetic */ C9299a(byte b) {
            this();
        }
    }

    public final String getBattleDraw() {
        return this.battleDraw;
    }

    public final String getBattleLose() {
        return this.battleLose;
    }

    public final String getBattleScoreClap() {
        return this.battleScoreClap;
    }

    public final String getBattleScoreCry() {
        return this.battleScoreCry;
    }

    public final String getBattleScoreInitial() {
        return this.battleScoreInitial;
    }

    public final String getBattleScoreStrive() {
        return this.battleScoreStrive;
    }

    public final String getBattleScoreStrong() {
        return this.battleScoreStrong;
    }

    public final String getBattleScoreTongue() {
        return this.battleScoreTongue;
    }

    public final String getBattleScoreWeak() {
        return this.battleScoreWeak;
    }

    public final String getBattleStart() {
        return this.battleStart;
    }

    public final String getBattleWin() {
        return this.battleWin;
    }

    public BattleResource(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(str8, "");
        C89219l.m154721d(str9, "");
        C89219l.m154721d(str10, "");
        C89219l.m154721d(str11, "");
        this.battleStart = str;
        this.battleDraw = str2;
        this.battleWin = str3;
        this.battleLose = str4;
        this.battleScoreClap = str5;
        this.battleScoreCry = str6;
        this.battleScoreInitial = str7;
        this.battleScoreStrive = str8;
        this.battleScoreTongue = str9;
        this.battleScoreStrong = str10;
        this.battleScoreWeak = str11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BattleResource(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, p4600h.p4611f.p4613b.C89214g r26) {
        /*
            r13 = this;
            r5 = r17
            r4 = r16
            r3 = r15
            r2 = r14
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r1 = r25
            r11 = r23
            r0 = r1 & 1
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x001b
            r2 = r12
        L_0x001b:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0020
            r3 = r12
        L_0x0020:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0025
            r4 = r12
        L_0x0025:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x002a
            r5 = r12
        L_0x002a:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002f
            r6 = r12
        L_0x002f:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0034
            r7 = r12
        L_0x0034:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0039
            r8 = r12
        L_0x0039:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
            r9 = r12
        L_0x003e:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            r10 = r12
        L_0x0043:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0048
            r11 = r12
        L_0x0048:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0051
        L_0x004c:
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0051:
            r12 = r24
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.live.model.BattleResource.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
