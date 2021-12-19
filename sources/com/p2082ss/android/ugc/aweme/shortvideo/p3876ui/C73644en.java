package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.graphics.drawable.AbstractC0706b;
import androidx.core.graphics.drawable.C0708d;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.en */
final /* synthetic */ class C73644en implements AbstractC85304ab {

    /* renamed from: a */
    private final C73560cj f165473a;

    static {
        Covode.recordClassIndex(86382);
    }

    C73644en(C73560cj cjVar) {
        this.f165473a = cjVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85304ab
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        MethodCollector.m26663i(10324);
        C73560cj cjVar = this.f165473a;
        ActivityC0945e activity = cjVar.getActivity();
        if (activity == null) {
            MethodCollector.m26664o(10324);
            return false;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        Bitmap mergeCoverText = cjVar.f165268K.getCoverPublishModel().getEffectTextModel().mergeCoverText(createBitmap);
        AbstractC0706b a = C0708d.m2514a(activity.getResources(), mergeCoverText);
        a.mo2738a(C13628n.m24520b(C63238c.f143574a, 4.0f));
        cjVar.f165346u.setImageDrawable(a);
        if (TextUtils.isEmpty(cjVar.f165268K.multiEditVideoRecordData.coverImagePath)) {
            cjVar.f165268K.multiEditVideoRecordData.coverImagePath = C71429d.m126154a();
        }
        C71429d.m126155a(mergeCoverText, cjVar.f165268K.multiEditVideoRecordData.coverImagePath);
        MethodCollector.m26664o(10324);
        return false;
    }
}
