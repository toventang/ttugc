package com.bytedance.android.livesdk.chatroom.interaction;

import android.content.ClipboardManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.widget.C11431l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.interaction.c */
public final class C7634c extends C11431l {

    /* renamed from: a */
    private final C10935a f18925a;

    /* renamed from: b */
    private final DataChannel f18926b;

    /* renamed from: c */
    private final View f18927c;

    /* renamed from: d */
    private final AbstractC89171a<C89391z> f18928d;

    /* renamed from: e */
    private final AbstractC89172b<MotionEvent, Boolean> f18929e;

    /* renamed from: f */
    private final AbstractC89188r<MotionEvent, MotionEvent, Float, Float, Boolean> f18930f;

    /* renamed from: g */
    private final AbstractC89188r<MotionEvent, MotionEvent, Float, Float, Boolean> f18931g;

    /* renamed from: h */
    private final AbstractC89172b<MotionEvent, Boolean> f18932h;

    static {
        Covode.recordClassIndex(8411);
    }

    @Override // com.bytedance.android.livesdk.widget.C11431l
    /* renamed from: a */
    public final boolean mo13849a(MotionEvent motionEvent) {
        Boolean invoke;
        AbstractC89172b<MotionEvent, Boolean> bVar = this.f18932h;
        if (bVar == null || (invoke = bVar.invoke(motionEvent)) == null) {
            return super.mo13849a(motionEvent);
        }
        return invoke.booleanValue();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Boolean invoke;
        AbstractC89172b<MotionEvent, Boolean> bVar = this.f18929e;
        if (bVar == null || (invoke = bVar.invoke(motionEvent)) == null) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        return invoke.booleanValue();
    }

    public final boolean onDown(MotionEvent motionEvent) {
        Object obj;
        if (!this.f18925a.isViewValid()) {
            return true;
        }
        try {
            ActivityC0945e activity = this.f18925a.getActivity();
            InputMethodManager inputMethodManager = null;
            if (activity != null) {
                obj = m15646a(activity, "input_method");
            } else {
                obj = null;
            }
            if (obj instanceof InputMethodManager) {
                inputMethodManager = obj;
            }
            InputMethodManager inputMethodManager2 = inputMethodManager;
            if (inputMethodManager2 == null) {
                return true;
            }
            inputMethodManager2.hideSoftInputFromWindow(this.f18927c.getWindowToken(), 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        Room room = (Room) this.f18926b.mo28318b(C9093de.class);
        if (room != null) {
            C6779a.m14563a().mo13053a(new C7400q(room));
            AbstractC89171a<C89391z> aVar = this.f18928d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: a */
    private static Object m15646a(ActivityC0945e eVar, String str) {
        Object obj;
        MethodCollector.m26663i(11168);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = eVar.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = eVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11168);
                }
            }
        } else {
            obj = eVar.getSystemService(str);
        }
        return obj;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || !this.f18930f.mo8774a(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC89188r<MotionEvent, MotionEvent, Float, Float, Boolean> rVar;
        Boolean a;
        if (motionEvent == null || motionEvent2 == null || (rVar = this.f18931g) == null || (a = rVar.mo8774a(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2))) == null || !a.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super android.view.MotionEvent, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.r<? super android.view.MotionEvent, ? super android.view.MotionEvent, ? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.r<? super android.view.MotionEvent, ? super android.view.MotionEvent, ? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super android.view.MotionEvent, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7634c(C10935a aVar, DataChannel dataChannel, View view, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super MotionEvent, Boolean> bVar, AbstractC89188r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar, AbstractC89188r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar2, AbstractC89172b<? super MotionEvent, Boolean> bVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(rVar, "");
        this.f18925a = aVar;
        this.f18926b = dataChannel;
        this.f18927c = view;
        this.f18928d = aVar2;
        this.f18929e = bVar;
        this.f18930f = rVar;
        this.f18931g = rVar2;
        this.f18932h = bVar2;
    }
}
