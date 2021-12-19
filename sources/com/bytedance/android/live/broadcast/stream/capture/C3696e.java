package com.bytedance.android.live.broadcast.stream.capture;

import com.bytedance.android.live.effect.model.AbstractC4314d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.filter.IFilterManager;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.stream.capture.e */
public final class C3696e implements AbstractC4314d {

    /* renamed from: a */
    IFilterManager f10164a;

    /* renamed from: b */
    boolean f10165b;

    static {
        Covode.recordClassIndex(4209);
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: b */
    public final void mo9004b() {
        this.f10165b = true;
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo9001a(String str, boolean z) {
        if (!this.f10165b) {
            this.f10164a.setEffect(str, z);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo8999a(String str, float f) {
        if (!this.f10165b) {
            IFilterManager iFilterManager = this.f10164a;
            if (str == null) {
                str = "";
            }
            iFilterManager.setFilter(str, f);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo9000a(String str, String str2) {
        if (!this.f10165b) {
            this.f10164a.setCustomEffect(str, str2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo9002a(boolean z) {
        if (!this.f10165b) {
            this.f10164a.enableMockFace(z);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo8996a(float f, float f2, float f3, float f4, float f5) {
        if (!this.f10165b) {
            this.f10164a.processPanEvent(f, f2, f3, f4, f5);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo8997a(float f, float f2, int i) {
        if (!this.f10165b) {
            this.f10164a.processTouchDownEvent(f, f2, i);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo8998a(long j, float f, float f2, float f3, float f4, int i, int i2) {
        if (!this.f10165b) {
            this.f10164a.processTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo8994a() {
        if (!this.f10165b) {
            this.f10164a.setEffect(null, false);
        }
    }

    public C3696e(IFilterManager iFilterManager) {
        this.f10164a = iFilterManager;
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final int mo8987a(int i) {
        if (this.f10165b) {
            return 0;
        }
        return this.f10164a.composerSetMode(i, 0);
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: b */
    public final int mo9003b(String[] strArr) {
        if (this.f10165b) {
            return 0;
        }
        return this.f10164a.composerRemoveNodes(strArr, strArr.length);
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final int mo8990a(String[] strArr) {
        if (this.f10165b) {
            return 0;
        }
        return this.f10164a.composerAppendNodes(strArr, strArr.length);
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: c */
    public final void mo9007c(float f, float f2) {
        if (!this.f10165b) {
            this.f10164a.processScaleEvent(f, f2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: b */
    public final void mo9005b(float f, float f2) {
        if (!this.f10165b) {
            this.f10164a.processLongPressEvent(f, f2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final int mo8991a(String[] strArr, int i) {
        if (this.f10165b) {
            return 0;
        }
        return this.f10164a.composerSetNodes(strArr, i);
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final int mo8993a(String[] strArr, String[] strArr2) {
        if (this.f10165b) {
            return 0;
        }
        return this.f10164a.composerAppendNodesWithTags(strArr, strArr.length, strArr2);
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final void mo8995a(float f, float f2) {
        if (!this.f10165b) {
            this.f10164a.processTouchEvent(f, f2);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final int mo8988a(String str, String str2, float f) {
        if (this.f10165b) {
            return 0;
        }
        return this.f10164a.composerUpdateNode(str, str2, f);
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final int mo8989a(String str, String str2, int[] iArr) {
        if (this.f10165b) {
            return 0;
        }
        return this.f10164a.composerCheckNodeExclusion(str, str2, iArr);
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: b */
    public final void mo9006b(float f, float f2, int i) {
        if (!this.f10165b) {
            this.f10164a.processTouchUpEvent(f, f2, i);
        }
    }

    @Override // com.bytedance.android.live.effect.model.AbstractC4314d
    /* renamed from: a */
    public final int mo8992a(String[] strArr, int i, String[] strArr2) {
        if (this.f10165b) {
            return 0;
        }
        return this.f10164a.composerSetNodesWithTags(strArr, i, strArr2);
    }
}
