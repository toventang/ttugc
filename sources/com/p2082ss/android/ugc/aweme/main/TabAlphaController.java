package com.p2082ss.android.ugc.aweme.main;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.main.TabAlphaController */
public class TabAlphaController extends Handler implements AbstractC33974au {

    /* renamed from: c */
    private static final String[] f134303c = {"SM-G9500", "SM-G9550", "SM-G9600", "SM-G9608", "SM-G9650", "SM-N9500"};

    /* renamed from: d */
    private static TabAlphaController f134304d;

    /* renamed from: a */
    View f134305a;

    /* renamed from: b */
    public boolean f134306b;

    /* renamed from: e */
    private boolean f134307e;

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume(mVar);
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        mo96525a(false);
    }

    /* renamed from: a */
    public static TabAlphaController m108430a() {
        if (f134304d == null) {
            f134304d = new TabAlphaController();
        }
        return f134304d;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        if (hasMessages(1)) {
            removeMessages(1);
        }
        this.f134305a = null;
    }

    static {
        Covode.recordClassIndex(69342);
    }

    private TabAlphaController() {
        if (TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            for (String str : f134303c) {
                if (TextUtils.equals(str, Build.MODEL)) {
                    this.f134307e = true;
                    return;
                }
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume(AbstractC1204m mVar) {
        mo96525a(true);
    }

    public void handleMessage(Message message) {
        View view;
        if (message.what == 1 && (view = this.f134305a) != null && !this.f134306b) {
            view.getAlpha();
            View view2 = this.f134305a;
            view2.setAlpha(view2.getAlpha() / 2.0f);
            this.f134306b = true;
        }
    }

    /* renamed from: a */
    public final void mo96525a(boolean z) {
        if (this.f134305a != null && this.f134307e) {
            if (!z || this.f134306b) {
                if (hasMessages(1)) {
                    removeMessages(1);
                }
            } else if (!hasMessages(1)) {
                sendEmptyMessageDelayed(1, 1200000);
            }
        }
    }
}
