package com.p2082ss.android.ugc.aweme.commerce.p2513b;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28021n;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.p2929fe.method.CloseHalfDialogBridge;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.b.a */
public final class DialogC37485a extends Dialog implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private final Activity f88477a;

    /* renamed from: b */
    private final int f88478b;

    /* renamed from: c */
    private final String f88479c;

    /* renamed from: d */
    private final float f88480d;

    /* renamed from: e */
    private final boolean f88481e = true;

    /* renamed from: f */
    private final int f88482f;

    static {
        Covode.recordClassIndex(44871);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(382, new RunnableC90250g(DialogC37485a.class, "closeHalfDialog", CloseHalfDialogBridge.C47819a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final void dismiss() {
        super.dismiss();
        EventBus.m156962a().mo145395b(this);
        ((CrossPlatformWebView) findViewById(R.id.dmg)).mo69928d(this.f88477a);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void closeHalfDialog(CloseHalfDialogBridge.C47819a aVar) {
        boolean z;
        C89219l.m154721d(aVar, "");
        AbstractC28019l a = C28024q.m56139a(aVar.f110773a.toString());
        C89219l.m154716b(a, "");
        AbstractC28019l c = a.mo46789j().mo46803c("reactId");
        if (c == null || (c instanceof C28021n)) {
            z = false;
        } else {
            String c2 = c.mo46689c();
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) findViewById(R.id.dmg);
            C89219l.m154716b(crossPlatformWebView, "");
            z = C89219l.m154714a((Object) c2, (Object) crossPlatformWebView.getReactId());
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf.booleanValue()) {
            valueOf.booleanValue();
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(9191);
        super.onCreate(bundle);
        WindowManager.LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.x_, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(C34723i.m70928b(getContext()), this.f88478b));
        int i = this.f88482f;
        float f = this.f88480d;
        inflate.setBackground(new C37591b(i, f, f));
        setContentView(inflate);
        setCanceledOnTouchOutside(this.f88481e);
        ((CrossPlatformWebView) findViewById(R.id.dmg)).mo69912a(17, 0);
        findViewById(R.id.dmg);
        C89219l.m154721d(this.f88479c, "");
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = getWindow();
        if (!(window2 == null || (layoutParams = window2.getAttributes()) == null)) {
            layoutParams.width = -1;
            layoutParams.height = this.f88478b;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        EventBus.m156966a(EventBus.m156962a(), this);
        MethodCollector.m26664o(9191);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC37485a(Activity activity, int i, String str, float f, int i2) {
        super(activity, R.style.zn);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        this.f88477a = activity;
        this.f88478b = i;
        this.f88479c = str;
        this.f88480d = f;
        this.f88482f = i2;
    }
}
