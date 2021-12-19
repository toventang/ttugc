package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1216w;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.ActivityC17733a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.utils.C80501gj;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask */
public final class OverDrawMonitorTask implements AbstractC58264w {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$RenderNodeCollectThread */
    public static final class RenderNodeCollectThread extends HandlerThread implements AbstractC33974au {

        /* renamed from: d */
        public static final C58374a f132916d = new C58374a((byte) 0);

        /* renamed from: a */
        final C58378a f132917a = new C58378a();

        /* renamed from: b */
        String f132918b = "Nameless";

        /* renamed from: c */
        public final Context f132919c;

        /* renamed from: e */
        private Handler f132920e;

        static {
            Covode.recordClassIndex(68555);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                onAppBackground();
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
                onAppForeground();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$RenderNodeCollectThread$a */
        public static final class C58374a {
            static {
                Covode.recordClassIndex(68556);
            }

            private C58374a() {
            }

            public /* synthetic */ C58374a(byte b) {
                this();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
        public final void onAppBackground() {
            Handler handler = this.f132920e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
        public final void onAppForeground() {
            Handler handler = this.f132920e;
            if (handler != null) {
                handler.sendEmptyMessage(0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$RenderNodeCollectThread$c */
        static final class RunnableC58376c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RenderNodeCollectThread f132926a;

            static {
                Covode.recordClassIndex(68558);
            }

            RunnableC58376c(RenderNodeCollectThread renderNodeCollectThread) {
                this.f132926a = renderNodeCollectThread;
            }

            public final void run() {
                C1216w wVar = C1216w.f4006i;
                C89219l.m154716b(wVar, "");
                wVar.getLifecycle().mo4012a(this.f132926a);
            }
        }

        public final boolean quit() {
            C1216w wVar = C1216w.f4006i;
            C89219l.m154716b(wVar, "");
            wVar.getLifecycle().mo4013b(this);
            Handler handler = this.f132920e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f132920e = null;
            return super.quit();
        }

        public final boolean quitSafely() {
            C1216w wVar = C1216w.f4006i;
            C89219l.m154716b(wVar, "");
            wVar.getLifecycle().mo4013b(this);
            Handler handler = this.f132920e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f132920e = null;
            return super.quitSafely();
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            new Handler(Looper.getMainLooper()).post(new RunnableC58376c(this));
            HandlerC58377d dVar = new HandlerC58377d(this, getLooper());
            dVar.sendEmptyMessage(0);
            this.f132920e = dVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RenderNodeCollectThread(Context context) {
            super("RenderNodeCollect");
            C89219l.m154721d(context, "");
            this.f132919c = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$RenderNodeCollectThread$d */
        public static final class HandlerC58377d extends Handler {

            /* renamed from: a */
            final /* synthetic */ RenderNodeCollectThread f132927a;

            static {
                Covode.recordClassIndex(68559);
            }

            public final void dispatchMessage(Message message) {
                View findViewById;
                int i;
                int i2;
                int intValue;
                int intValue2;
                int intValue3;
                Fragment rootFragment;
                C89219l.m154721d(message, "");
                RenderNodeCollectThread renderNodeCollectThread = this.f132927a;
                long currentTimeMillis = System.currentTimeMillis();
                C58378a aVar = renderNodeCollectThread.f132917a;
                ActivityC0945e eVar = null;
                if (aVar.f132928a != null) {
                    ArrayList<View> arrayList = aVar.f132928a;
                    if (arrayList == null) {
                        C89219l.m154710a("views");
                    }
                    View view = (View) C89070n.m154588i((List) arrayList);
                    if (!(view == null || (findViewById = view.findViewById(16908290)) == null)) {
                        Activity j = C17873f.m33102j();
                        if (j instanceof ActivityC0945e) {
                            eVar = j;
                        }
                        ActivityC0945e eVar2 = eVar;
                        if (eVar2 != null) {
                            String simpleName = eVar2.getClass().getSimpleName();
                            C89219l.m154716b(simpleName, "");
                            renderNodeCollectThread.f132918b = simpleName;
                            if ((eVar2 instanceof ActivityC17733a) && (rootFragment = ((ActivityC17733a) eVar2).getRootFragment()) != null) {
                                String simpleName2 = rootFragment.getClass().getSimpleName();
                                C89219l.m154716b(simpleName2, "");
                                renderNodeCollectThread.f132918b = simpleName2;
                            }
                        }
                        Rect rect = new Rect();
                        findViewById.getGlobalVisibleRect(rect);
                        int width = rect.width() * rect.height();
                        ArrayList<C58375b> arrayList2 = new ArrayList();
                        renderNodeCollectThread.mo95749a(width, findViewById, 0, 0, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            ArrayList arrayList3 = arrayList2;
                            if (arrayList3.isEmpty()) {
                                i = 0;
                            } else {
                                i = 0;
                                for (C58375b bVar : arrayList2) {
                                    if ((C89219l.m154714a((Object) bVar.f132922b, (Object) "view_group_background") || C89219l.m154714a((Object) bVar.f132922b, (Object) "view_background")) && (i = i + 1) < 0) {
                                        C89070n.m154523b();
                                    }
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                                for (C58375b bVar2 : arrayList2) {
                                    if (C89219l.m154714a((Object) bVar2.f132922b, (Object) "view_group_background") && (i2 = i2 + 1) < 0) {
                                        C89070n.m154523b();
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                            for (C58375b bVar3 : arrayList2) {
                                arrayList4.add(Integer.valueOf(bVar3.f132923c.width() * bVar3.f132923c.height()));
                            }
                            ArrayList arrayList5 = arrayList4;
                            if (arrayList5.isEmpty()) {
                                intValue = 0;
                            } else {
                                Iterator it = arrayList5.iterator();
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    while (it.hasNext()) {
                                        next = Integer.valueOf(((Number) next).intValue() + ((Number) it.next()).intValue());
                                    }
                                    intValue = ((Number) next).intValue();
                                } else {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj : arrayList2) {
                                if (C89219l.m154714a((Object) ((C58375b) obj).f132922b, (Object) "view_group_background")) {
                                    arrayList6.add(obj);
                                }
                            }
                            ArrayList<C58375b> arrayList7 = arrayList6;
                            ArrayList arrayList8 = new ArrayList(C89070n.m154526a((Iterable) arrayList7, 10));
                            for (C58375b bVar4 : arrayList7) {
                                arrayList8.add(Integer.valueOf(bVar4.f132923c.width() * bVar4.f132923c.height()));
                            }
                            ArrayList arrayList9 = arrayList8;
                            if (arrayList9.isEmpty()) {
                                intValue2 = 0;
                            } else {
                                Iterator it2 = arrayList9.iterator();
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    while (it2.hasNext()) {
                                        next2 = Integer.valueOf(((Number) next2).intValue() + ((Number) it2.next()).intValue());
                                    }
                                    intValue2 = ((Number) next2).intValue();
                                } else {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                            }
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj2 : arrayList2) {
                                C58375b bVar5 = (C58375b) obj2;
                                if (C89219l.m154714a((Object) bVar5.f132922b, (Object) "view_group_background") || C89219l.m154714a((Object) bVar5.f132922b, (Object) "view_background")) {
                                    arrayList10.add(obj2);
                                }
                            }
                            ArrayList<C58375b> arrayList11 = arrayList10;
                            ArrayList arrayList12 = new ArrayList(C89070n.m154526a((Iterable) arrayList11, 10));
                            for (C58375b bVar6 : arrayList11) {
                                arrayList12.add(Integer.valueOf(bVar6.f132923c.width() * bVar6.f132923c.height()));
                            }
                            ArrayList arrayList13 = arrayList12;
                            if (arrayList13.isEmpty()) {
                                intValue3 = 0;
                            } else {
                                Iterator it3 = arrayList13.iterator();
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    while (it3.hasNext()) {
                                        next3 = Integer.valueOf(((Number) next3).intValue() + ((Number) it3.next()).intValue());
                                    }
                                    intValue3 = ((Number) next3).intValue();
                                } else {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                            }
                            C89378p[] pVarArr = new C89378p[8];
                            pVarArr[0] = C89387v.m154943a(Integer.valueOf(arrayList2.size()), "render_node_count");
                            pVarArr[1] = C89387v.m154943a(Integer.valueOf(i), "render_node_bg_count");
                            pVarArr[2] = C89387v.m154943a(Integer.valueOf(i2), "render_node_group_bg_count");
                            float f = (float) width;
                            pVarArr[3] = C89387v.m154943a(Float.valueOf(((float) intValue) / f), "render_times");
                            pVarArr[4] = C89387v.m154943a(Float.valueOf(((float) intValue3) / f), "bg_render_times");
                            pVarArr[5] = C89387v.m154943a(Float.valueOf(((float) intValue2) / f), "group_bg_render_times");
                            pVarArr[6] = C89387v.m154943a(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "cost");
                            String str = C80501gj.f180100a;
                            if (str == null) {
                                str = renderNodeCollectThread.f132918b;
                            }
                            pVarArr[7] = C89387v.m154943a(str, "event_page");
                            C39162r.m79462a("page_render_node_info", pVarArr);
                        }
                    }
                }
                sendEmptyMessageDelayed(0, 5000);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            HandlerC58377d(RenderNodeCollectThread renderNodeCollectThread, Looper looper) {
                super(looper);
                this.f132927a = renderNodeCollectThread;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$RenderNodeCollectThread$b */
        public static final class C58375b {

            /* renamed from: a */
            public final int f132921a;

            /* renamed from: b */
            public final String f132922b;

            /* renamed from: c */
            public final Rect f132923c;

            /* renamed from: d */
            public final int f132924d;

            /* renamed from: e */
            public final int f132925e;

            static {
                Covode.recordClassIndex(68557);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C58375b)) {
                    return false;
                }
                C58375b bVar = (C58375b) obj;
                return this.f132921a == bVar.f132921a && C89219l.m154714a(this.f132922b, bVar.f132922b) && C89219l.m154714a(this.f132923c, bVar.f132923c) && this.f132924d == bVar.f132924d && this.f132925e == bVar.f132925e;
            }

            public final int hashCode() {
                int i = this.f132921a * 31;
                String str = this.f132922b;
                int i2 = 0;
                int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
                Rect rect = this.f132923c;
                if (rect != null) {
                    i2 = rect.hashCode();
                }
                return ((((hashCode + i2) * 31) + this.f132924d) * 31) + this.f132925e;
            }

            public final String toString() {
                return "RenderNodeInfo(areaPresent=" + this.f132921a + ", renderNodeType=" + this.f132922b + ", rect=" + this.f132923c + ", layerCount=" + this.f132924d + ", reDrawCount=" + this.f132925e + ")";
            }

            public C58375b(int i, String str, Rect rect, int i2, int i3) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(rect, "");
                this.f132921a = i;
                this.f132922b = str;
                this.f132923c = rect;
                this.f132924d = i2;
                this.f132925e = i3;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo95749a(int i, View view, int i2, int i3, List<C58375b> list) {
            String str;
            int i4 = i3;
            if (view != null && !(view instanceof SurfaceView) && !(view instanceof TextureView)) {
                Rect rect = new Rect();
                if (view.getVisibility() == 0 && view.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                    if (view.getBackground() != null) {
                        int width = (int) (((((float) rect.width()) * 100.0f) * ((float) rect.height())) / ((float) i));
                        if (view instanceof ViewGroup) {
                            str = "view_group_background";
                        } else {
                            str = "view_background";
                        }
                        list.add(new C58375b(width, str, rect, i2, i4));
                        i4++;
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            mo95749a(i, viewGroup.getChildAt(i5), i2 + 1, i4, list);
                        }
                    } else if (!C89219l.m154714a(C89204ab.m154669a(view.getClass()), C89204ab.m154669a(View.class))) {
                        list.add(new C58375b((int) (((((float) rect.width()) * 100.0f) * ((float) rect.height())) / ((float) i)), "view", rect, i2, i4));
                    }
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(68554);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$a */
    public static final class C58378a {

        /* renamed from: a */
        public ArrayList<View> f132928a;

        static {
            Covode.recordClassIndex(68560);
        }

        public C58378a() {
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                C89219l.m154716b(declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj != null) {
                    this.f132928a = (ArrayList) obj;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<android.view.View>");
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (context != null) {
            new RenderNodeCollectThread(context).start();
        }
    }
}
