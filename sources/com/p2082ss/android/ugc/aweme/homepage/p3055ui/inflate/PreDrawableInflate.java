package com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate */
public class PreDrawableInflate implements AbstractC58258q {

    /* renamed from: a */
    public final Map<String, Object> f122356a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map<Integer, Drawable> f122357b = new ConcurrentHashMap();

    /* renamed from: c */
    private Class<? extends Activity> f122358c;

    static {
        Covode.recordClassIndex(62860);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "inflate_";
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return EnumC58150ad.INFLATE;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: b */
    public final Class<? extends Activity> mo28743b() {
        Class<? extends Activity> cls = this.f122358c;
        if (cls != null) {
            return cls;
        }
        return HomePageUIFrameServiceImpl.m108627e().mo89381a();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: b */
    private void m98264b(int i, Context context) {
        try {
            this.f122357b.put(Integer.valueOf(i), context.getResources().getDrawable(i));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final Drawable mo89730a(int i, Context context) {
        Drawable remove = this.f122357b.remove(Integer.valueOf(i));
        if (remove == null) {
            return context.getResources().getDrawable(i);
        }
        return remove;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: a */
    public final void mo28741a(Context context, Activity activity) {
        m98264b(R.drawable.b1h, context);
        m98264b(R.drawable.c4, context);
        m98264b(2131232121, context);
        if (SearchServiceImpl.m119336t().mo106220i()) {
            m98264b(2131232110, context);
            m98264b(2131232108, context);
            m98264b(2131232109, context);
        } else {
            m98264b(2131232123, context);
            m98264b(2131232122, context);
            m98264b(2131232125, context);
        }
        m98264b(2131232120, context);
        m98264b(2131232112, context);
        m98264b(2131232117, context);
        m98264b(R.drawable.aag, context);
        m98264b(2131232131, context);
        if (((Boolean) C67214a.f150651e.getValue()).booleanValue()) {
            m98264b(2131232314, context);
            m98264b(R.drawable.a_j, context);
            m98264b(2131233182, context);
            m98264b(R.drawable.b2x, context);
            m98264b(2131233902, context);
            m98264b(R.drawable.a_l, context);
            m98264b(R.color.a2, context);
        }
        try {
            this.f122356a.put("status_bar_height", Integer.valueOf(context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
        } catch (Exception unused) {
        }
    }
}
