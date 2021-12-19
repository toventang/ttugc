package com.bytedance.android.livesdk.dialogv2.p515a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.dialogv2.p517c.C8350a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.a.b */
public final class C8337b extends C8332a {
    static {
        Covode.recordClassIndex(9175);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.bytedance.android.livesdk.dialogv2.p515a.C8332a
    public final /* synthetic */ C8350a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m16497a(this, viewGroup, i);
    }

    public C8337b(DataChannel dataChannel, LiveGiftDialogViewModel liveGiftDialogViewModel) {
        super(dataChannel, liveGiftDialogViewModel);
    }

    /* renamed from: a */
    private static Object m16498a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4779);
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
                    MethodCollector.m26664o(4779);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p515a.C8332a
    /* renamed from: a */
    public final C8350a mo14664a(ViewGroup viewGroup, int i) {
        Display defaultDisplay;
        C89219l.m154721d(viewGroup, "");
        C8350a a = super.mo14664a(viewGroup, i);
        Object a2 = m16498a(C3966y.m9669e(), "window");
        if (!(a2 instanceof WindowManager)) {
            a2 = null;
        }
        WindowManager windowManager = (WindowManager) a2;
        Point point = new Point();
        if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            defaultDisplay.getSize(point);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(point.x / 4, (int) C13628n.m24520b(C3966y.m9669e(), 110.0f));
        View view = a.itemView;
        C89219l.m154716b(view, "");
        view.setLayoutParams(layoutParams);
        return a;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m16497a(C8337b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4843);
        C8350a a2 = bVar.mo14664a(viewGroup, i);
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        MethodCollector.m26664o(4843);
        return a2;
    }
}
