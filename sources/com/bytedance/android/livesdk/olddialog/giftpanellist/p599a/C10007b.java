package com.bytedance.android.livesdk.olddialog.giftpanellist.p599a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.a.b */
public final class C10007b extends AbstractC10004a {
    static {
        Covode.recordClassIndex(11561);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a
    public final /* synthetic */ AbstractC10019b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m18500a(this, viewGroup, i);
    }

    public C10007b(Context context, AbstractC10004a.AbstractC10006a aVar) {
        super(context, aVar, true);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a
    /* renamed from: a */
    public final AbstractC10019b mo16817a(ViewGroup viewGroup, int i) {
        AbstractC10019b a = super.mo16817a(viewGroup, i);
        WindowManager windowManager = (WindowManager) m18501a(this.f24303c, "window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        a.itemView.setLayoutParams(new ViewGroup.LayoutParams(point.x / 4, (int) C13628n.m24520b(this.f24303c, 110.0f)));
        return a;
    }

    /* renamed from: a */
    private static Object m18501a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6278);
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
                    MethodCollector.m26664o(6278);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m18500a(C10007b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6281);
        AbstractC10019b a2 = bVar.mo16817a(viewGroup, i);
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
        MethodCollector.m26664o(6281);
        return a2;
    }
}
