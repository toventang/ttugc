package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailDisclaimerLayout */
public final class CommerceStickerDetailDisclaimerLayout extends FrameLayout {

    /* renamed from: a */
    private HashMap f88810a;

    static {
        Covode.recordClassIndex(44986);
    }

    public CommerceStickerDetailDisclaimerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo65437a(int i) {
        if (this.f88810a == null) {
            this.f88810a = new HashMap();
        }
        View view = (View) this.f88810a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88810a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private /* synthetic */ CommerceStickerDetailDisclaimerLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceStickerDetailDisclaimerLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(794);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.r4, this, true);
        MethodCollector.m26664o(794);
    }
}
