package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.C71436a;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import dmt.p4542av.video.C88151a;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.b */
final /* synthetic */ class C71440b implements AbstractC85304ab {

    /* renamed from: a */
    private final C71436a.HandlerC714371 f160061a;

    /* renamed from: b */
    private final String f160062b;

    static {
        Covode.recordClassIndex(83974);
    }

    C71440b(C71436a.HandlerC714371 r1, String str) {
        this.f160061a = r1;
        this.f160062b = str;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85304ab
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        MethodCollector.m26663i(11685);
        C71436a.HandlerC714371 r6 = this.f160061a;
        String str = this.f160062b;
        C88151a.m153229a("extracting_frame");
        Message message = new Message();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        Bundle bundle = new Bundle();
        bundle.putParcelable("bitmap", createBitmap);
        bundle.putString("path", str);
        message.what = 2;
        message.setData(bundle);
        C71436a.this.f160055a.sendMessage(message);
        MethodCollector.m26664o(11685);
        return false;
    }
}
