package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5482a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5485d;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5590c;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdk.widget.AbstractDialogC11425g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog */
public final class MultiLiveAnchorOpenCameraDialog extends AbstractDialogC11425g implements AbstractC33974au {

    /* renamed from: c */
    public static final C5554a f14153c = new C5554a((byte) 0);
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a */
    public C5271a f14154a;

    /* renamed from: b */
    public Context f14155b;

    /* renamed from: d */
    private AbstractC88412b f14156d;

    /* renamed from: e */
    private boolean f14157e;

    /* renamed from: f */
    private DataChannel f14158f;

    /* renamed from: g */
    private AbstractC1204m f14159g;

    /* renamed from: h */
    private String f14160h;

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog$c */
    static final class C5557c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5557c f14163a = new C5557c();

        static {
            Covode.recordClassIndex(6153);
        }

        C5557c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(6149);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    /* renamed from: b */
    public final int mo8350b() {
        return R.layout.b6o;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        this.f14157e = true;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog$a */
    public static final class C5554a {
        static {
            Covode.recordClassIndex(6150);
        }

        private C5554a() {
        }

        public /* synthetic */ C5554a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo11338a() {
        m12081c();
        dismiss();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (this.f14157e) {
            mo11338a();
        }
        this.f14157e = false;
    }

    public final void show() {
        WindowManager.LayoutParams layoutParams;
        super.show();
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
            if (layoutParams != null) {
                layoutParams.dimAmount = 0.0f;
            }
        } else {
            layoutParams = null;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
    }

    /* renamed from: c */
    private final void m12081c() {
        C5271a aVar = this.f14154a;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar.f13633d = true;
        C6779a.m14563a().mo13053a(new C7400q(40));
        DataChannel dataChannel = this.f14158f;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5590c.class, true);
        }
    }

    public final void dismiss() {
        super.dismiss();
        DataChannel dataChannel = this.f14158f;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5482a.class, new C5485d(false, this.f14160h));
        }
        AbstractC88412b bVar = this.f14156d;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f14159g.getLifecycle().mo4013b(this);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog$d */
    static final class View$OnClickListenerC5558d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiLiveAnchorOpenCameraDialog f14164a;

        static {
            Covode.recordClassIndex(6154);
        }

        View$OnClickListenerC5558d(MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog) {
            this.f14164a = multiLiveAnchorOpenCameraDialog;
        }

        public final void onClick(View view) {
            this.f14164a.mo11338a();
            C5586a.m12134a("on", "floating_page", 1);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog$b */
    static final class C5555b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MultiLiveAnchorOpenCameraDialog f14161a;

        static {
            Covode.recordClassIndex(6151);
        }

        C5555b(MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog) {
            this.f14161a = multiLiveAnchorOpenCameraDialog;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = 5 - ((Number) obj).longValue();
            LiveButton liveButton = (LiveButton) this.f14161a.findViewById(R.id.cwp);
            C89219l.m154716b(liveButton, "");
            liveButton.setText(C11266h.m19968a(C3966y.m9657a((int) R.string.eew), Long.valueOf(longValue)));
            if (longValue == 0) {
                ((LiveButton) this.f14161a.findViewById(R.id.cwp)).post(new Runnable(this) {
                    /* class com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog.MultiLiveAnchorOpenCameraDialog.C5555b.RunnableC55561 */

                    /* renamed from: a */
                    final /* synthetic */ C5555b f14162a;

                    static {
                        Covode.recordClassIndex(6152);
                    }

                    {
                        this.f14162a = r1;
                    }

                    public final void run() {
                        this.f14162a.f14161a.mo11338a();
                        C5586a.m12134a("on", "time_out", 1);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14159g.getLifecycle().mo4012a(this);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        DataChannel dataChannel = this.f14158f;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5482a.class, new C5485d(true, this.f14160h));
        }
        this.f14156d = C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b(6).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5555b(this), C5557c.f14163a);
        ((LiveButton) findViewById(R.id.cwp)).setOnClickListener(new View$OnClickListenerC5558d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLiveAnchorOpenCameraDialog(Context context, DataChannel dataChannel, AbstractC1204m mVar, String str) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        this.f14155b = context;
        this.f14158f = dataChannel;
        this.f14159g = mVar;
        this.f14160h = str;
        C4431e.f12034a.mo10201a(this);
    }
}
