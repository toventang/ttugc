package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.KeyboardShadowView */
public class KeyboardShadowView extends View {

    /* renamed from: a */
    private Activity f19077a;

    /* renamed from: b */
    private boolean f19078b;

    /* renamed from: c */
    private boolean f19079c;

    /* renamed from: d */
    private int f19080d;

    /* renamed from: e */
    private AbstractC7700a f19081e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.KeyboardShadowView$a */
    public interface AbstractC7700a {
        static {
            Covode.recordClassIndex(8486);
        }
    }

    static {
        Covode.recordClassIndex(8485);
    }

    public void setCallback(AbstractC7700a aVar) {
        this.f19081e = aVar;
    }

    public void setShowStatusBar(boolean z) {
        this.f19079c = z;
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity) {
        this.f19077a = activity;
        this.f19078b = C3931d.m9571a(activity);
        this.f19080d = C13628n.m24525e(activity);
    }

    public KeyboardShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10845);
        MethodCollector.m26664o(10845);
    }
}
