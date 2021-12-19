package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i */
public final class C72990i extends LinearLayout {

    /* renamed from: a */
    private final ImageView f163789a;

    /* renamed from: b */
    private final TuxButton f163790b;

    static {
        Covode.recordClassIndex(85693);
    }

    public final TuxButton getBtnDismiss() {
        return this.f163790b;
    }

    public final ImageView getIvClose() {
        return this.f163789a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C72990i(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6333);
        View inflate = View.inflate(context, R.layout.azi, this);
        View findViewById = inflate.findViewById(R.id.bu5);
        C89219l.m154716b(findViewById, "");
        this.f163789a = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.xg);
        C89219l.m154716b(findViewById2, "");
        this.f163790b = (TuxButton) findViewById2;
        MethodCollector.m26664o(6333);
    }

    public /* synthetic */ C72990i(Context context, byte b) {
        this(context);
    }
}
