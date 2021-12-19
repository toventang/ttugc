package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.k */
public final class C71393k extends LinearLayout {

    /* renamed from: c */
    public static final C71394a f159980c = new C71394a((byte) 0);

    /* renamed from: a */
    public AVDmtTextView f159981a;

    /* renamed from: b */
    public SimpleDraweeView f159982b;

    static {
        Covode.recordClassIndex(83921);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.k$a */
    public static final class C71394a {
        static {
            Covode.recordClassIndex(83922);
        }

        private C71394a() {
        }

        public /* synthetic */ C71394a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C71393k m126095a(Context context, int i, int i2) {
            C89219l.m154721d(context, "");
            C71393k kVar = new C71393k(context);
            kVar.setText(i);
            kVar.setIcon(i2);
            return kVar;
        }
    }

    /* renamed from: a */
    public final void mo112869a() {
        View findViewById = findViewById(R.id.dh1);
        C89219l.m154716b(findViewById, "");
        findViewById.setVisibility(4);
    }

    /* renamed from: b */
    public final boolean mo112870b() {
        View findViewById = findViewById(R.id.dh1);
        C89219l.m154716b(findViewById, "");
        if (findViewById.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.k$b */
    public static final class C71395b extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71393k f159983a;

        static {
            Covode.recordClassIndex(83923);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71395b(C71393k kVar) {
            super(600);
            this.f159983a = kVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            new C23144b(this.f159983a).mo37635a(this.f159983a.getResources().getText(R.string.few)).mo37634a(3000L).mo37637b();
        }
    }

    public final void setContentDescription(int i) {
        AVDmtTextView aVDmtTextView = this.f159981a;
        if (aVDmtTextView == null) {
            C89219l.m154710a("mToolTv");
        }
        aVDmtTextView.setContentDescription(getContext().getString(i));
    }

    public final void setIcon(int i) {
        SimpleDraweeView simpleDraweeView = this.f159982b;
        if (simpleDraweeView == null) {
            C89219l.m154710a("mToolIv");
        }
        simpleDraweeView.setImageDrawable(getResources().getDrawable(i));
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        AVDmtTextView aVDmtTextView = this.f159981a;
        if (aVDmtTextView == null) {
            C89219l.m154710a("mToolTv");
        }
        aVDmtTextView.setText(str);
    }

    public final void setIcon(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        SimpleDraweeView simpleDraweeView = this.f159982b;
        if (simpleDraweeView == null) {
            C89219l.m154710a("mToolIv");
        }
        simpleDraweeView.setImageDrawable(drawable);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71393k(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12627);
        Object a = m126092a(getContext(), "layout_inflater");
        if (a != null) {
            ((LayoutInflater) a).inflate(R.layout.bia, this);
            View findViewById = findViewById(R.id.z8);
            C89219l.m154716b(findViewById, "");
            this.f159981a = (AVDmtTextView) findViewById;
            View findViewById2 = findViewById(R.id.z7);
            C89219l.m154716b(findViewById2, "");
            this.f159982b = (SimpleDraweeView) findViewById2;
            MethodCollector.m26664o(12627);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.m26664o(12627);
        throw nullPointerException;
    }

    public final void setText(int i) {
        AVDmtTextView aVDmtTextView = this.f159981a;
        if (aVDmtTextView == null) {
            C89219l.m154710a("mToolTv");
        }
        aVDmtTextView.setText(getContext().getString(i));
        AVDmtTextView aVDmtTextView2 = this.f159981a;
        if (aVDmtTextView2 == null) {
            C89219l.m154710a("mToolTv");
        }
        aVDmtTextView2.getText();
        getContext().getString(R.string.bkw);
        if (aVDmtTextView2.getText().equals(getContext().getString(R.string.bkw))) {
            Keva repo = Keva.getRepo("add_motion_tab");
            String.valueOf(repo.getBoolean("is_first_click_effect_reddot", true));
            if (C16048b.m29633a().mo25412a(true, "edit_effect_category_add_motion", 0) == 2 && repo.getBoolean("is_first_click_effect_reddot", true)) {
                repo.storeBoolean("is_first_click_effect_reddot", false);
                View findViewById = findViewById(R.id.dh1);
                C89219l.m154716b(findViewById, "");
                findViewById.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    private static Object m126092a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12523);
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
                    MethodCollector.m26664o(12523);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
