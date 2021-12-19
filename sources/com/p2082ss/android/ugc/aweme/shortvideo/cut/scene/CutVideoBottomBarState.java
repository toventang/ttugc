package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState */
public final class CutVideoBottomBarState implements AbstractC20368af {
    private final Boolean deleteEnable;
    private final Boolean deleteVisible;
    private final Boolean rotateEnable;
    private final Boolean rotateVisible;
    private final Float selectTime;
    private final Boolean speedChecked;
    private final Boolean speedEnable;
    private final Boolean speedVisible;

    static {
        Covode.recordClassIndex(82522);
    }

    public CutVideoBottomBarState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ CutVideoBottomBarState copy$default(CutVideoBottomBarState cutVideoBottomBarState, Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cutVideoBottomBarState.selectTime;
        }
        if ((i & 2) != 0) {
            bool = cutVideoBottomBarState.speedVisible;
        }
        if ((i & 4) != 0) {
            bool2 = cutVideoBottomBarState.speedChecked;
        }
        if ((i & 8) != 0) {
            bool3 = cutVideoBottomBarState.rotateVisible;
        }
        if ((i & 16) != 0) {
            bool4 = cutVideoBottomBarState.deleteVisible;
        }
        if ((i & 32) != 0) {
            bool5 = cutVideoBottomBarState.rotateEnable;
        }
        if ((i & 64) != 0) {
            bool6 = cutVideoBottomBarState.speedEnable;
        }
        if ((i & 128) != 0) {
            bool7 = cutVideoBottomBarState.deleteEnable;
        }
        return cutVideoBottomBarState.copy(f, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    public final Float component1() {
        return this.selectTime;
    }

    public final Boolean component2() {
        return this.speedVisible;
    }

    public final Boolean component3() {
        return this.speedChecked;
    }

    public final Boolean component4() {
        return this.rotateVisible;
    }

    public final Boolean component5() {
        return this.deleteVisible;
    }

    public final Boolean component6() {
        return this.rotateEnable;
    }

    public final Boolean component7() {
        return this.speedEnable;
    }

    public final Boolean component8() {
        return this.deleteEnable;
    }

    public final CutVideoBottomBarState copy(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        return new CutVideoBottomBarState(f, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoBottomBarState)) {
            return false;
        }
        CutVideoBottomBarState cutVideoBottomBarState = (CutVideoBottomBarState) obj;
        return C89219l.m154714a(this.selectTime, cutVideoBottomBarState.selectTime) && C89219l.m154714a(this.speedVisible, cutVideoBottomBarState.speedVisible) && C89219l.m154714a(this.speedChecked, cutVideoBottomBarState.speedChecked) && C89219l.m154714a(this.rotateVisible, cutVideoBottomBarState.rotateVisible) && C89219l.m154714a(this.deleteVisible, cutVideoBottomBarState.deleteVisible) && C89219l.m154714a(this.rotateEnable, cutVideoBottomBarState.rotateEnable) && C89219l.m154714a(this.speedEnable, cutVideoBottomBarState.speedEnable) && C89219l.m154714a(this.deleteEnable, cutVideoBottomBarState.deleteEnable);
    }

    public final int hashCode() {
        Float f = this.selectTime;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Boolean bool = this.speedVisible;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.speedChecked;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.rotateVisible;
        int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.deleteVisible;
        int hashCode5 = (hashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.rotateEnable;
        int hashCode6 = (hashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.speedEnable;
        int hashCode7 = (hashCode6 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Boolean bool7 = this.deleteEnable;
        if (bool7 != null) {
            i = bool7.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "CutVideoBottomBarState(selectTime=" + this.selectTime + ", speedVisible=" + this.speedVisible + ", speedChecked=" + this.speedChecked + ", rotateVisible=" + this.rotateVisible + ", deleteVisible=" + this.deleteVisible + ", rotateEnable=" + this.rotateEnable + ", speedEnable=" + this.speedEnable + ", deleteEnable=" + this.deleteEnable + ")";
    }

    public final Boolean getDeleteEnable() {
        return this.deleteEnable;
    }

    public final Boolean getDeleteVisible() {
        return this.deleteVisible;
    }

    public final Boolean getRotateEnable() {
        return this.rotateEnable;
    }

    public final Boolean getRotateVisible() {
        return this.rotateVisible;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final Boolean getSpeedChecked() {
        return this.speedChecked;
    }

    public final Boolean getSpeedEnable() {
        return this.speedEnable;
    }

    public final Boolean getSpeedVisible() {
        return this.speedVisible;
    }

    public CutVideoBottomBarState(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.selectTime = f;
        this.speedVisible = bool;
        this.speedChecked = bool2;
        this.rotateVisible = bool3;
        this.deleteVisible = bool4;
        this.rotateEnable = bool5;
        this.speedEnable = bool6;
        this.deleteEnable = bool7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoBottomBarState(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6, (i & 128) == 0 ? bool7 : null);
    }
}
