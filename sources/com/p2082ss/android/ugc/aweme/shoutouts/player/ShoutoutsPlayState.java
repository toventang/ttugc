package com.p2082ss.android.ugc.aweme.shoutouts.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayState */
public final class ShoutoutsPlayState implements AbstractC20368af {
    private final int progress;
    private final EnumC74482a status;

    static {
        Covode.recordClassIndex(87274);
    }

    public ShoutoutsPlayState() {
        this(0, null, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m130907xf17f965d(int i) {
        return i;
    }

    public static /* synthetic */ ShoutoutsPlayState copy$default(ShoutoutsPlayState shoutoutsPlayState, int i, EnumC74482a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shoutoutsPlayState.progress;
        }
        if ((i2 & 2) != 0) {
            aVar = shoutoutsPlayState.status;
        }
        return shoutoutsPlayState.copy(i, aVar);
    }

    public final int component1() {
        return this.progress;
    }

    public final EnumC74482a component2() {
        return this.status;
    }

    public final ShoutoutsPlayState copy(int i, EnumC74482a aVar) {
        C89219l.m154721d(aVar, "");
        return new ShoutoutsPlayState(i, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsPlayState)) {
            return false;
        }
        ShoutoutsPlayState shoutoutsPlayState = (ShoutoutsPlayState) obj;
        return this.progress == shoutoutsPlayState.progress && C89219l.m154714a(this.status, shoutoutsPlayState.status);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m130907xf17f965d(this.progress) * 31;
        EnumC74482a aVar = this.status;
        return com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShoutoutsPlayState(progress=" + this.progress + ", status=" + this.status + ")";
    }

    public final int getProgress() {
        return this.progress;
    }

    public final EnumC74482a getStatus() {
        return this.status;
    }

    public ShoutoutsPlayState(int i, EnumC74482a aVar) {
        C89219l.m154721d(aVar, "");
        this.progress = i;
        this.status = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoutoutsPlayState(int i, EnumC74482a aVar, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? EnumC74482a.PREPARED : aVar);
    }
}
