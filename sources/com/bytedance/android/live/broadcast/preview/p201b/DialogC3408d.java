package com.bytedance.android.live.broadcast.preview.p201b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.b.d */
public final class DialogC3408d extends Dialog {
    static {
        Covode.recordClassIndex(3892);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.d$a */
    static final class View$OnClickListenerC3409a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC3408d f9640a;

        static {
            Covode.recordClassIndex(3893);
        }

        View$OnClickListenerC3409a(DialogC3408d dVar) {
            this.f9640a = dVar;
        }

        public final void onClick(View view) {
            this.f9640a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC3408d(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        setContentView(R.layout.b6u);
        C3941k.m9607a((HSImageView) findViewById(R.id.bld), "tiktok_live_broadcast_resource", "ttlive_bg_preview_setting_update.png");
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.c9);
        }
        Window window2 = getWindow();
        if (!(window2 == null || (attributes = window2.getAttributes()) == null)) {
            attributes.width = C3966y.m9653a(310.0f);
        }
        ((LiveTextView) findViewById(R.id.f0h)).setOnClickListener(new View$OnClickListenerC3409a(this));
    }
}
