package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.p3354a;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.a.a */
public abstract class AbstractC57625a extends FrameLayout {

    /* renamed from: a */
    public boolean f131527a;

    /* renamed from: b */
    private boolean f131528b;

    static {
        Covode.recordClassIndex(67586);
    }

    /* renamed from: a */
    public abstract void mo94924a();

    /* renamed from: a */
    public abstract void mo94925a(boolean z);

    public boolean isSelected() {
        return this.f131528b;
    }

    public AbstractC57625a(Context context) {
        super(context);
    }

    public void setRefreshing(boolean z) {
        this.f131527a = z;
    }

    public void setSelected(boolean z) {
        this.f131528b = z;
    }
}
