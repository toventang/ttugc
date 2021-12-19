package com.bytedance.android.livesdk.chatroom.end;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.a */
public final class DialogC7511a extends Dialog {
    static {
        Covode.recordClassIndex(8283);
    }

    public DialogC7511a(Context context) {
        super(context, R.style.a31);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(5128);
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.b63, (ViewGroup) null));
        ((TextView) findViewById(R.id.c2a)).setText(C3966y.m9657a((int) R.string.e6t));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        MethodCollector.m26664o(5128);
    }
}
