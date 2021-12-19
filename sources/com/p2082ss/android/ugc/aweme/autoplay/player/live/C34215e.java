package com.p2082ss.android.ugc.aweme.autoplay.player.live;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.e */
public final class C34215e implements AbstractC34186b.AbstractC34188b {

    /* renamed from: a */
    public AbstractC51043a f80892a;

    /* renamed from: b */
    public AbstractC51044b f80893b;

    /* renamed from: c */
    public C51060g f80894c;

    /* renamed from: d */
    public AbstractC51064i f80895d;

    /* renamed from: e */
    public AbstractC34186b.AbstractC34189c f80896e;

    /* renamed from: f */
    public int f80897f;

    /* renamed from: g */
    public Aweme f80898g;

    /* renamed from: h */
    public C67568r f80899h;

    /* renamed from: i */
    public AbstractC58608c f80900i;

    /* renamed from: j */
    public boolean f80901j;

    /* renamed from: k */
    public boolean f80902k;

    /* renamed from: l */
    public AbstractC34204c f80903l;

    /* renamed from: m */
    public AbstractC34202a f80904m;

    static {
        Covode.recordClassIndex(41150);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34188b
    /* renamed from: a */
    public final Aweme mo60511a() {
        return this.f80898g;
    }

    /* renamed from: b */
    public final LiveRoomStruct mo60575b() {
        Aweme aweme = this.f80898g;
        if (aweme != null) {
            return aweme.getNewLiveRoomData();
        }
        return null;
    }

    private C34215e() {
        this.f80892a = null;
        this.f80893b = null;
        this.f80894c = null;
        this.f80895d = null;
        this.f80896e = null;
        this.f80897f = -1;
        this.f80898g = null;
        this.f80899h = null;
        this.f80900i = null;
        this.f80901j = false;
        this.f80902k = false;
        this.f80903l = null;
        this.f80904m = null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        AbstractC51043a aVar = this.f80892a;
        int i10 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i11 = i * 31;
        AbstractC51044b bVar = this.f80893b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        C51060g gVar = this.f80894c;
        if (gVar != null) {
            i3 = gVar.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        AbstractC51064i iVar = this.f80895d;
        if (iVar != null) {
            i4 = iVar.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        AbstractC34186b.AbstractC34189c cVar = this.f80896e;
        if (cVar != null) {
            i5 = cVar.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (((i14 + i5) * 31) + this.f80897f) * 31;
        Aweme aweme = this.f80898g;
        if (aweme != null) {
            i6 = aweme.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        C67568r rVar = this.f80899h;
        if (rVar != null) {
            i7 = rVar.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        AbstractC58608c cVar2 = this.f80900i;
        if (cVar2 != null) {
            i8 = cVar2.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        boolean z = this.f80901j;
        int i19 = 1;
        if (z) {
            z = true;
        }
        int i20 = z ? 1 : 0;
        int i21 = z ? 1 : 0;
        int i22 = z ? 1 : 0;
        int i23 = (i18 + i20) * 31;
        if (!this.f80902k) {
            i19 = 0;
        }
        int i24 = (i23 + i19) * 31;
        AbstractC34204c cVar3 = this.f80903l;
        if (cVar3 != null) {
            i9 = cVar3.hashCode();
        } else {
            i9 = 0;
        }
        int i25 = (i24 + i9) * 31;
        AbstractC34202a aVar2 = this.f80904m;
        if (aVar2 != null) {
            i10 = aVar2.hashCode();
        }
        return i25 + i10;
    }

    public final String toString() {
        return "SearchLiveDataProvider(containerStatusProvider=" + this.f80892a + ", mPlayVideoObserver=" + this.f80893b + ", mScrollStateManager=" + this.f80894c + ", mScrollStateObserver=" + this.f80895d + ", searchMediaLiveHelper=" + this.f80896e + ", rank=" + this.f80897f + ", aweme=" + this.f80898g + ", itemMobParam=" + this.f80899h + ", mLivePlayHelper=" + this.f80900i + ", mLiveStarted=" + this.f80901j + ", mAttached=" + this.f80902k + ", mobListener=" + this.f80903l + ", defaultSearchLivePlayListener=" + this.f80904m + ")";
    }

    public /* synthetic */ C34215e(byte b) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34215e)) {
            return false;
        }
        C34215e eVar = (C34215e) obj;
        if (!C89219l.m154714a(this.f80892a, eVar.f80892a) || !C89219l.m154714a(this.f80893b, eVar.f80893b) || !C89219l.m154714a(this.f80894c, eVar.f80894c) || !C89219l.m154714a(this.f80895d, eVar.f80895d) || !C89219l.m154714a(this.f80896e, eVar.f80896e) || this.f80897f != eVar.f80897f || !C89219l.m154714a(this.f80898g, eVar.f80898g) || !C89219l.m154714a(this.f80899h, eVar.f80899h) || !C89219l.m154714a(this.f80900i, eVar.f80900i) || this.f80901j != eVar.f80901j || this.f80902k != eVar.f80902k || !C89219l.m154714a(this.f80903l, eVar.f80903l) || !C89219l.m154714a(this.f80904m, eVar.f80904m)) {
            return false;
        }
        return true;
    }
}
