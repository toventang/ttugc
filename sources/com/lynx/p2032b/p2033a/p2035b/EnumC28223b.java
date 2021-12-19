package com.lynx.p2032b.p2033a.p2035b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.b.a.b.b */
public enum EnumC28223b {
    None(0, false, false, false, false, false),
    PullDownToRefresh(1, true, false, false, false, false),
    PullUpToLoad(2, true, false, false, false, false),
    PullDownCanceled(1, false, false, false, false, false),
    PullUpCanceled(2, false, false, false, false, false),
    ReleaseToRefresh(1, true, false, false, false, true),
    ReleaseToLoad(2, true, false, false, false, true),
    ReleaseToTwoLevel(1, true, false, false, true, true),
    TwoLevelReleased(1, false, false, false, true, false),
    RefreshReleased(1, false, false, false, false, false),
    LoadReleased(2, false, false, false, false, false),
    Refreshing(1, false, true, false, false, false),
    Loading(2, false, true, false, false, false),
    TwoLevel(1, false, true, false, true, false),
    RefreshFinish(1, false, false, true, false, false),
    LoadFinish(2, false, false, true, false, false),
    TwoLevelFinish(1, false, false, true, true, false);
    
    public final boolean isDragging;
    public final boolean isFinishing;
    public final boolean isFooter;
    public final boolean isHeader;
    public final boolean isOpening;
    public final boolean isReleaseToOpening;
    public final boolean isTwoLevel;

    public final EnumC28223b toFooter() {
        if (!this.isHeader || this.isTwoLevel) {
            return this;
        }
        return values()[ordinal() + 1];
    }

    public final EnumC28223b toHeader() {
        if (!this.isFooter || this.isTwoLevel) {
            return this;
        }
        return values()[ordinal() - 1];
    }

    static {
        Covode.recordClassIndex(34169);
    }

    private EnumC28223b(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7 = false;
        if (i == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isHeader = z6;
        this.isFooter = i == 2 ? true : z7;
        this.isDragging = z;
        this.isOpening = z2;
        this.isFinishing = z3;
        this.isTwoLevel = z4;
        this.isReleaseToOpening = z5;
    }
}
