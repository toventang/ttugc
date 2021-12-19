package com.bytedance.android.livesdk.p571m;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p571m.C9454b;
import com.bytedance.android.livesdk.watch.chatroom.C11324b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.m.d */
public final class DialogInterfaceC9457d extends AbstractC11293v implements DialogInterface {

    /* renamed from: a */
    public boolean f22991a;

    /* renamed from: b */
    public IHostLongPressCallback f22992b;

    /* renamed from: c */
    public Room f22993c;

    /* renamed from: d */
    public String f22994d;

    /* renamed from: e */
    public String f22995e;

    /* renamed from: f */
    public String f22996f;

    /* renamed from: g */
    private final AbstractC89172b<View, C89391z> f22997g = new C9458a(this);

    /* renamed from: h */
    private HashMap f22998h;

    /* renamed from: com.bytedance.android.livesdk.m.d$b */
    final /* synthetic */ class View$OnClickListenerC9459b implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f23000a;

        static {
            Covode.recordClassIndex(10967);
        }

        View$OnClickListenerC9459b(AbstractC89172b bVar) {
            this.f23000a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            C89219l.m154716b(this.f23000a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(10965);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f22998h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f22998h == null) {
            this.f22998h = new HashMap();
        }
        View view = (View) this.f22998h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f22998h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    public final void cancel() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b6l);
        bVar.f27015b = R.style.a37;
        bVar.f27020g = 17;
        bVar.f27022i = -1;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C9460e eVar = new C9460e();
        eVar.f23001a = true;
        C6779a.m14563a().mo13053a(eVar);
    }

    /* renamed from: com.bytedance.android.livesdk.m.d$a */
    static final class C9458a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogInterfaceC9457d f22999a;

        static {
            Covode.recordClassIndex(10966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9458a(DialogInterfaceC9457d dVar) {
            super(1);
            this.f22999a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            String str = "";
            C89219l.m154721d(view2, str);
            if (view2.getId() == R.id.ctq) {
                IHostLongPressCallback iHostLongPressCallback = this.f22999a.f22992b;
                if (iHostLongPressCallback != null) {
                    iHostLongPressCallback.onDislikePressed();
                }
                Room room = this.f22999a.f22993c;
                if (room != null) {
                    String str2 = this.f22999a.f22994d;
                    if (str2 == null) {
                        str2 = str;
                    }
                    String str3 = this.f22999a.f22995e;
                    if (str3 != null) {
                        str = str3;
                    }
                    C9454b.m17755a(room, str2, str, C9454b.EnumC9455a.LONG_PRESS);
                }
            } else if (view2.getId() == R.id.dit) {
                IHostLongPressCallback iHostLongPressCallback2 = this.f22999a.f22992b;
                if (iHostLongPressCallback2 != null) {
                    iHostLongPressCallback2.onReportPressed();
                }
                Room room2 = this.f22999a.f22993c;
                if (room2 != null) {
                    String str4 = this.f22999a.f22994d;
                    if (str4 == null) {
                        str4 = str;
                    }
                    String str5 = this.f22999a.f22995e;
                    if (str5 != null) {
                        str = str5;
                    }
                    C11324b.m20078a(room2, str4, str, this.f22999a.f22996f);
                }
            } else if (view2.getId() == R.id.am7) {
                this.f22999a.dismissAllowingStateLoss();
            }
            this.f22999a.dismissAllowingStateLoss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            try {
                Object a = m17756a(context, "vibrator");
                if (a != null) {
                    ((Vibrator) a).vibrate(15);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                }
            } catch (Exception unused) {
            }
        }
        Room room = this.f22993c;
        if (room != null) {
            String str = this.f22994d;
            if (str == null) {
                str = "";
            }
            String str2 = this.f22995e;
            if (str2 == null) {
                str2 = "";
            }
            C89219l.m154721d(room, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C11324b.m20079a(linkedHashMap, room, str, str2, "long_press");
            C6501b.C6502a.m13948a("live_report_icon_show").mo12651a("request_page", "long_press").mo12651a("report_type", "long_press").mo12651a("show_type", "long_press").mo12639a().mo12652a((Map<String, String>) linkedHashMap).mo12655b();
        }
        C9460e eVar = new C9460e();
        eVar.f23001a = false;
        C6779a.m14563a().mo13053a(eVar);
    }

    /* renamed from: a */
    private static Object m17756a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4691);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.m26664o(4691);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livesdk.m.d$b] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.livesdk.m.d$b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.livesdk.m.d$b] */
    /* JADX WARNING: Unknown variable types count: 3 */
    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
            r4 = 2131366661(0x7f0a1305, float:1.8353222E38)
            android.view.View r2 = r5.mo8166a_(r4)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            h.f.a.b<android.view.View, h.z> r1 = r5.f22997g
            if (r1 == 0) goto L_0x0018
            com.bytedance.android.livesdk.m.d$b r0 = new com.bytedance.android.livesdk.m.d$b
            r0.<init>(r1)
            r1 = r0
        L_0x0018:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
            r0 = 2131363640(0x7f0a0738, float:1.8347095E38)
            android.view.View r2 = r5.mo8166a_(r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            h.f.a.b<android.view.View, h.z> r1 = r5.f22997g
            if (r1 == 0) goto L_0x0030
            com.bytedance.android.livesdk.m.d$b r0 = new com.bytedance.android.livesdk.m.d$b
            r0.<init>(r1)
            r1 = r0
        L_0x0030:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
            r0 = 2131367626(0x7f0a16ca, float:1.835518E38)
            android.view.View r2 = r5.mo8166a_(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            h.f.a.b<android.view.View, h.z> r1 = r5.f22997g
            if (r1 == 0) goto L_0x0048
            com.bytedance.android.livesdk.m.d$b r0 = new com.bytedance.android.livesdk.m.d$b
            r0.<init>(r1)
            r1 = r0
        L_0x0048:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
            boolean r0 = r5.f22991a
            if (r0 == 0) goto L_0x005f
            android.view.View r1 = r5.mo8166a_(r4)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
            r0 = 8
            r1.setVisibility(r0)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p571m.DialogInterfaceC9457d.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
