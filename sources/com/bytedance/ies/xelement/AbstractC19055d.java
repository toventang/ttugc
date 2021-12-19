package com.bytedance.ies.xelement;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.d */
public abstract class AbstractC19055d extends RelativeLayout {
    static {
        Covode.recordClassIndex(21818);
    }

    /* renamed from: a */
    public abstract void mo30341a();

    /* renamed from: a */
    public abstract void mo30342a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo30343a(AbstractC89171a<C89391z> aVar);

    /* renamed from: b */
    public abstract void mo30344b();

    /* renamed from: c */
    public abstract void mo30345c();

    /* renamed from: d */
    public abstract void mo30346d();

    public int getDuration() {
        return 0;
    }

    public abstract void setAutoLifecycle(boolean z);

    public abstract void setAutoPlay(boolean z);

    public void setBorderRadius(float[] fArr) {
    }

    public abstract void setDeviceChangeAware(boolean z);

    public abstract void setInitTime(int i);

    public void setLogExtra(HashMap<String, Object> hashMap) {
        C89219l.m154719c(hashMap, "");
    }

    public abstract void setLoop(boolean z);

    public abstract void setMuted(boolean z);

    public abstract void setObjectFit(String str);

    public void setPerformanceLog(String str) {
        C89219l.m154719c(str, "");
    }

    public abstract void setPoster(String str);

    public abstract void setPreload(boolean z);

    public abstract void setRate(int i);

    public abstract void setSinglePlayer(boolean z);

    public abstract void setSrc(String str);

    public abstract void setStateChangeReporter(AbstractC89187q<? super String, ? super Map<String, ? extends Object>, ? super AbstractC19055d, C89391z> qVar);

    public void setVideoHeight(int i) {
    }

    public void setVideoWidth(int i) {
    }

    public abstract void setVolume(float f);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC19055d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
    }
}
