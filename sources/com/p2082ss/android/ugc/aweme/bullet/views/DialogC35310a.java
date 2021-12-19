package com.p2082ss.android.ugc.aweme.bullet.views;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0240h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.p2415c.C35131b;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.views.a */
public final class DialogC35310a extends DialogC0240h implements AbstractC35316c, AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public static final C35312b f83335d = new C35312b((byte) 0);

    /* renamed from: a */
    public View f83336a;

    /* renamed from: b */
    public AbstractC16208i f83337b;

    /* renamed from: c */
    public int f83338c;

    /* renamed from: e */
    private final String f83339e;

    /* renamed from: f */
    private final String f83340f;

    /* renamed from: g */
    private final int f83341g;

    static {
        Covode.recordClassIndex(42478);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(381, new RunnableC90250g(DialogC35310a.class, "onCloseBulletBottomDialogEvent", C35131b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$b */
    public static final class C35312b {
        static {
            Covode.recordClassIndex(42480);
        }

        private C35312b() {
        }

        public /* synthetic */ C35312b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$d */
    public static final class RunnableC35314d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC35310a f83346a;

        static {
            Covode.recordClassIndex(42482);
        }

        RunnableC35314d(DialogC35310a aVar) {
            this.f83346a = aVar;
        }

        public final void run() {
            DialogC35310a.super.show();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.views.AbstractC35316c
    public final void dismiss() {
        BulletContainerView bulletContainerView;
        super.dismiss();
        View view = this.f83336a;
        if (!(view == null || (bulletContainerView = (BulletContainerView) view.findViewById(R.id.zu)) == null)) {
            bulletContainerView.mo25721a();
        }
        this.f83336a = null;
        EventBus.m156962a().mo145395b(this);
    }

    @AbstractC90264r
    public final void onCloseBulletBottomDialogEvent(C35131b bVar) {
        C89219l.m154721d(bVar, "");
        dismiss();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.views.AbstractC35316c
    public final void onEvent(AbstractC16191p pVar) {
        C89219l.m154721d(pVar, "");
        AbstractC16208i iVar = this.f83337b;
        if (iVar != null) {
            iVar.onEvent(pVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.views.AbstractC35316c
    /* renamed from: a */
    public final void mo62167a(Activity activity) {
        C89219l.m154721d(activity, "");
        if (!activity.isFinishing()) {
            EventBus.m156966a(EventBus.m156962a(), this);
            if (this.f83338c > 0) {
                new Handler().postDelayed(new RunnableC35314d(this), (long) this.f83338c);
            } else {
                super.show();
            }
        }
    }

    @Override // androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = this.f83336a;
        if (view != null) {
            setContentView(view);
        }
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            int i = this.f83341g;
            if (i > 0) {
                attributes.height = i;
            } else {
                attributes.height = -2;
            }
            window.setAttributes(attributes);
            window.setGravity(80);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setBackgroundDrawableResource(R.color.c9);
            window.setWindowAnimations(R.style.f3);
        }
        setOnKeyListener(new DialogInterface$OnKeyListenerC35313c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$a */
    public static final class C35311a implements AbstractC17046h.AbstractC17048b {

        /* renamed from: a */
        final /* synthetic */ View f83342a;

        /* renamed from: b */
        final /* synthetic */ DialogC35310a f83343b;

        /* renamed from: c */
        final /* synthetic */ Context f83344c;

        static {
            Covode.recordClassIndex(42479);
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25851a(Uri uri) {
            C89219l.m154721d(uri, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25852a(Uri uri, Throwable th) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(th, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(qVar, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
        }

        C35311a(View view, DialogC35310a aVar, Context context) {
            this.f83342a = view;
            this.f83343b = aVar;
            this.f83344c = context;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            this.f83343b.f83337b = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.a$c */
    static final class DialogInterface$OnKeyListenerC35313c implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ DialogC35310a f83345a;

        static {
            Covode.recordClassIndex(42481);
        }

        DialogInterface$OnKeyListenerC35313c(DialogC35310a aVar) {
            this.f83345a = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getAction() != 1) {
                return false;
            }
            this.f83345a.dismiss();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC35310a(Context context, String str, String str2, int i) {
        super(context, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        MethodCollector.m26663i(4257);
        this.f83339e = str;
        this.f83340f = str2;
        this.f83341g = i;
        View inflate = View.inflate(context, R.layout.m4, null);
        this.f83336a = inflate;
        if (inflate != null) {
            ((BulletContainerView) inflate.findViewById(R.id.zu)).mo25820a(BulletService.m71938f().mo61850a());
            ((BulletContainerView) inflate.findViewById(R.id.zu)).mo26839a(BulletService.m71938f().mo61849a(context), 17, 0, 0, 0, 0);
            Bundle bundle = new Bundle();
            bundle.putString("initial_data", str2);
            ((BulletContainerView) inflate.findViewById(R.id.zu)).mo26838a(C35301c.m72246a(str), bundle, new C35311a(inflate, this, context));
            MethodCollector.m26664o(4257);
            return;
        }
        MethodCollector.m26664o(4257);
    }
}
