package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView */
public class SmartAvatarBorderView extends SmartCircleImageView {

    /* renamed from: e */
    private static boolean f81896e;

    /* renamed from: d */
    private UrlModel f81897d;

    static {
        Covode.recordClassIndex(41643);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, com.bytedance.lighten.loader.SmartCircleImageView
    /* renamed from: a */
    public final void mo34192a() {
        super.mo34192a();
        ((C24246a) getHierarchy()).mo39954a(2131232314, C24229q.AbstractC24231b.f57452b);
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.mo39985c(C13628n.m24520b(getContext(), 1.0f));
            ((C24246a) getHierarchy()).f57470a.f57504f = C0643b.m2378c(getContext(), R.color.l);
            ((C24246a) getHierarchy()).f57470a.mo39986d(C13628n.m24520b(getContext(), 1.0f));
        }
    }

    public SmartAvatarBorderView(Context context) {
        super(context);
    }

    public static void setOpt(boolean z) {
        f81896e = z;
    }

    public void setBorderColor(int i) {
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.f57504f = C0643b.m2378c(getContext(), i);
        }
    }

    public void setBorderWidth(int i) {
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.mo39985c(C13628n.m24520b(getContext(), (float) i));
        }
    }

    public void setBorderWidthPx(int i) {
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.mo39985c((float) i);
        }
    }

    public void setRoundingParamsPadding(float f) {
        if (((C24246a) getHierarchy()).f57470a != null) {
            ((C24246a) getHierarchy()).f57470a.mo39986d(f);
        }
    }

    public SmartAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo61310a(final UrlModel urlModel, final int[] iArr, final int i, final int i2, final String str) {
        if (this.f81897d != urlModel) {
            this.f81897d = urlModel;
            if (f81896e) {
                C58254p.f132679a.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView.RunnableC346631 */

                    /* renamed from: f */
                    final /* synthetic */ boolean f81903f = true;

                    static {
                        Covode.recordClassIndex(41644);
                    }

                    public final void run() {
                        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
                        int[] iArr = iArr;
                        if (iArr != null) {
                            a.mo34185b(iArr);
                        }
                        C20766v a2 = a.mo34176a(i, i2).mo34179a(str);
                        a2.f49098K = this.f81903f;
                        a2.f49092E = SmartAvatarBorderView.this;
                        a2.mo34186c();
                    }
                });
                return;
            }
            C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
            if (iArr != null) {
                a.mo34185b(iArr);
            }
            C20766v a2 = a.mo34176a(i, i2).mo34179a(str);
            a2.f49098K = true;
            a2.f49092E = this;
            a2.mo34186c();
        }
    }
}
