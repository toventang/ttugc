package com.bytedance.android.livesdk.toolbar;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.p022b.p023a.C0464a;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Stack;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.l */
public class C10924l implements AbstractC5843h {
    static {
        Covode.recordClassIndex(12532);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5843h
    public Class<LiveAudienceToolbarWidget> audienceToolbarWidget() {
        return LiveAudienceToolbarWidget.class;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5843h
    public Class<LiveBroadcastToolbarWidget> broadcastToolbarWidget() {
        return LiveBroadcastToolbarWidget.class;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5843h
    public C10923k toolbarManager() {
        return C10923k.f26245a;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5843h
    public Class<LiveToolbarWidget> toolbarWidget() {
        return LiveToolbarWidget.class;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5843h
    public void preloadAudienceToolbarWidget() {
        C2690b.m7787a((int) R.layout.bek);
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5843h
    public void preloadBroadcastToolbarWidget() {
        C2690b.m7787a((int) R.layout.bej);
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5843h
    public void releaseToolbarView() {
        C10925m.f26248a.clear();
        C10925m.f26249b = null;
        C10925m.f26250c = null;
    }

    @Override // com.bytedance.android.live.p385p.AbstractC5843h
    public void preloadToolbarView(Context context, int i, EnumC5854q qVar) {
        int i2;
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(qVar, "");
        if (LiveLayoutPreloadSetting.INSTANCE.enable() && context != null) {
            C10925m.f26249b = new C0464a(new MutableContextWrapper(context));
            C10925m.f26250c = LayoutInflater.from(new MutableContextWrapper(context));
            Stack<View> stack = C10925m.f26248a.get(qVar);
            if (stack != null) {
                for (T t : stack) {
                    C89219l.m154716b(t, "");
                    Context context2 = t.getContext();
                    if (!(context2 instanceof MutableContextWrapper)) {
                        context2 = null;
                    }
                    MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context2;
                    if (mutableContextWrapper != null) {
                        mutableContextWrapper.setBaseContext(context);
                    }
                }
            }
            Stack<View> stack2 = C10925m.f26248a.get(qVar);
            if (stack2 != null) {
                i2 = stack2.size();
            } else {
                C10925m.f26248a.put(qVar, new Stack<>());
                i2 = 0;
            }
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                C10925m.m19554a(qVar);
            }
        }
    }
}
