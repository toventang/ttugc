package com.bytedance.ies.xelement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1362a.AbstractC18943a;
import com.bytedance.ies.xelement.p1362a.C18945c;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public abstract class DeclarativeVideoPlayBoxViewDelegate extends RelativeLayout {
    private HashMap _$_findViewCache;

    static {
        Covode.recordClassIndex(21622);
    }

    public DeclarativeVideoPlayBoxViewDelegate(Context context) {
        this(context, null, 0, 6, null);
    }

    public DeclarativeVideoPlayBoxViewDelegate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void destroy() {
    }

    public int getDuration() {
        return 0;
    }

    public abstract void onPropsUpdateOnce();

    public abstract void pause();

    public abstract void performZoom();

    public abstract void performZoomOut();

    public abstract void playReal(AbstractC89171a<C89391z> aVar);

    public abstract void seek(int i, boolean z);

    public void setAutoLifecycle(boolean z) {
    }

    public abstract void setAutoPlay(boolean z);

    public void setBorderRadius(float[] fArr) {
    }

    public abstract void setDeviceChangeAware(boolean z);

    public void setEnablePlayListener(boolean z) {
    }

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

    public void setResourceLoader(AbstractC18943a<C18945c> aVar) {
        C89219l.m154719c(aVar, "");
    }

    public abstract void setSinglePlayer(boolean z);

    public abstract void setSrc(String str);

    public void setStateChangeReporter(AbstractC89187q<? super String, ? super Map<String, ? extends Object>, ? super DeclarativeVideoPlayBoxViewDelegate, C89391z> qVar) {
    }

    public void setVideoHeight(int i) {
    }

    public void setVideoTag(String str) {
    }

    public void setVideoWidth(int i) {
    }

    public abstract void setVolume(float f);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeclarativeVideoPlayBoxViewDelegate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.xelement.DeclarativeVideoPlayBoxViewDelegate */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playReal$default(DeclarativeVideoPlayBoxViewDelegate declarativeVideoPlayBoxViewDelegate, AbstractC89171a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                aVar = null;
            }
            declarativeVideoPlayBoxViewDelegate.playReal(aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playReal");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeclarativeVideoPlayBoxViewDelegate(Context context, AttributeSet attributeSet, int i, int i2, C89214g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
