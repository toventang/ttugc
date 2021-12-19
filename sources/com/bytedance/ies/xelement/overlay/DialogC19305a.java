package com.bytedance.ies.xelement.overlay;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.overlay.C19307b;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.overlay.a */
public final class DialogC19305a extends Dialog {

    /* renamed from: a */
    public final LynxOverlayView f45621a;

    /* renamed from: b */
    private final AbstractC89244h f45622b = C89250i.m154773a((AbstractC89171a) new C19306a(this));

    static {
        Covode.recordClassIndex(22090);
    }

    /* renamed from: com.bytedance.ies.xelement.overlay.a$a */
    static final class C19306a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ DialogC19305a f45623a;

        static {
            Covode.recordClassIndex(22091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19306a(DialogC19305a aVar) {
            super(0);
            this.f45623a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            AbstractC28520j jVar = this.f45623a.f45621a.mContext;
            C89219l.m154709a((Object) jVar, "");
            int identifier = jVar.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = jVar.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }
    }

    public final void show() {
        Window window;
        View decorView;
        View decorView2;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(131072);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setFlags(8, 8);
        }
        super.show();
        Activity ownerActivity = getOwnerActivity();
        if (!(ownerActivity == null || (window = ownerActivity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            Window window4 = getWindow();
            if (!(window4 == null || (decorView2 = window4.getDecorView()) == null)) {
                decorView2.setSystemUiVisibility(systemUiVisibility);
            }
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.clearFlags(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Activity activity;
        C89219l.m154719c(motionEvent, "");
        if (m36038a(motionEvent.getX(), motionEvent.getY())) {
            AbstractC28520j jVar = this.f45621a.mContext;
            C89219l.m154709a((Object) jVar, "");
            jVar.f67065f.mo49830a(motionEvent, this.f45621a);
        }
        C89219l.m154719c(motionEvent, "");
        for (T t : C19307b.f45624a) {
            if (t.f45628b.m36038a(motionEvent.getX(), motionEvent.getY())) {
                DialogC19305a aVar = t.f45628b;
                C89219l.m154719c(motionEvent, "");
                float left = (float) aVar.f45621a.getLeft();
                float top = (float) aVar.f45621a.getTop();
                motionEvent.offsetLocation(-left, -top);
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                motionEvent.offsetLocation(left, top);
                return dispatchTouchEvent;
            }
        }
        List<C19307b.C19308a> list = C19307b.f45624a;
        if (!(!list.isEmpty())) {
            list = null;
        }
        int i = 0;
        if (list != null) {
            DialogC19305a aVar2 = list.get(0).f45628b;
            C89219l.m154719c(motionEvent, "");
            AbstractC28520j jVar2 = aVar2.f45621a.mContext;
            C89219l.m154709a((Object) jVar2, "");
            Context baseContext = jVar2.getBaseContext();
            if (!(baseContext == null || !(baseContext instanceof Activity) || (activity = (Activity) baseContext) == null)) {
                if (!aVar2.f45621a.mo30717a()) {
                    i = -((Number) aVar2.f45622b.getValue()).intValue();
                }
                float f = (float) i;
                motionEvent.offsetLocation(-0.0f, -f);
                boolean dispatchTouchEvent2 = activity.dispatchTouchEvent(motionEvent);
                motionEvent.offsetLocation(0.0f, f);
                return dispatchTouchEvent2;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m36038a(float f, float f2) {
        return this.f45621a.mo30718a(f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC19305a(Context context, LynxOverlayView lynxOverlayView) {
        super(context, R.style.gg);
        C89219l.m154719c(context, "");
        C89219l.m154719c(lynxOverlayView, "");
        this.f45621a = lynxOverlayView;
    }
}
