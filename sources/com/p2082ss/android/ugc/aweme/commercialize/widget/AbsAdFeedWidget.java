package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget */
public abstract class AbsAdFeedWidget extends Widget implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: o */
    public Aweme f92081o;

    /* renamed from: p */
    public Fragment f92082p;

    /* renamed from: q */
    public String f92083q;

    /* renamed from: r */
    public boolean f92084r;

    static {
        Covode.recordClassIndex(46570);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        mo59238a();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        this.f92084r = false;
        super.onPause();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        super.onResume();
        this.f92084r = true;
    }

    /* renamed from: a */
    public void mo59238a() {
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_video_params", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60188a(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        C39039a aVar;
        super.mo60206a(view);
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null && (aVar = (C39039a) dataCenter.mo60192a("ad_feed_video_params")) != null) {
            mo59240a(aVar);
        }
    }

    /* renamed from: a */
    public void onChanged(C33942b bVar) {
        String str;
        C39039a aVar;
        if (bVar != null && (str = bVar.f80277a) != null && str.hashCode() == 1512987055 && str.equals("ad_feed_video_params") && (aVar = (C39039a) bVar.mo60212a()) != null) {
            mo59240a(aVar);
        }
    }

    /* renamed from: a */
    public void mo59240a(C39039a aVar) {
        C89219l.m154721d(aVar, "");
        this.f92081o = aVar.f92198a;
        this.f92082p = aVar.f92199b;
        this.f92083q = aVar.f92200c;
    }
}
