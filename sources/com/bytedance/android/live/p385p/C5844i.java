package com.bytedance.android.live.p385p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.p.i */
public final class C5844i extends AbstractC5836a {
    static {
        Covode.recordClassIndex(6451);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.p385p.AbstractC5836a
    /* renamed from: a */
    public final EnumC5854q mo11606a() {
        return EnumC5854q.ICON_TITLE_HORIZONTAL;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.p385p.AbstractC5836a
    /* renamed from: a */
    public final LinearLayout mo11605a(View view) {
        return (LinearLayout) view.findViewById(R.id.ek7);
    }

    public C5844i(Context context, List<EnumC5847l> list, DataChannel dataChannel) {
        super(context, list, dataChannel);
    }
}
