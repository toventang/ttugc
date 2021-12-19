package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.vesdk.C85581w;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl */
public class VEMultiEditVideoCoverGeneratorImpl extends VEVideoCoverGeneratorImpl implements AbstractC33974au {

    /* renamed from: a */
    public int f156392a;

    static {
        Covode.recordClassIndex(82390);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl
    /* renamed from: a */
    public final int[] mo110424a(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = (i3 * i4) + this.f156392a;
        }
        return iArr;
    }

    public VEMultiEditVideoCoverGeneratorImpl(AbstractC31071f fVar, AbstractC1204m mVar, int i, int i2, int i3, C85581w.EnumC85602a aVar) {
        super(fVar, mVar, i, aVar, "choose_cover");
        this.f156395c = i2;
        this.f156392a = i3;
    }
}
