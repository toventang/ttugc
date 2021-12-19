package com.bytedance.android.live.p385p;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.p.a */
public abstract class AbstractC5836a extends PopupWindow {

    /* renamed from: a */
    protected Context f14699a;

    static {
        Covode.recordClassIndex(6443);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract LinearLayout mo11605a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract EnumC5854q mo11606a();

    public AbstractC5836a(Context context, List<EnumC5847l> list, DataChannel dataChannel) {
        super(context);
        this.f14699a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.b5g, (ViewGroup) null);
        setWidth(-1);
        setHeight(-2);
        setContentView(inflate);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setWindowLayoutMode(-1, -2);
        setAnimationStyle(R.style.a2i);
        EnumC5852o.POPUP.createHolder(dataChannel, mo11605a(inflate), list, mo11606a());
        dataChannel.mo28310a(C5839d.class, (AbstractC89172b) new C5837b(this));
        setOnDismissListener(new C5838c(dataChannel));
    }
}
