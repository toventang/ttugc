package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.g */
public abstract class AbstractC50304g {

    /* renamed from: a */
    public Aweme f116150a;

    /* renamed from: b */
    protected String f116151b;

    /* renamed from: c */
    protected JSONObject f116152c;

    /* renamed from: d */
    protected boolean f116153d;

    /* renamed from: e */
    protected int f116154e;

    /* renamed from: f */
    protected DataCenter f116155f;

    /* renamed from: g */
    protected final Context f116156g;

    /* renamed from: h */
    public final View f116157h;

    /* renamed from: i */
    protected String f116158i = "click";

    /* renamed from: j */
    protected Fragment f116159j;

    /* renamed from: k */
    protected int f116160k;

    static {
        Covode.recordClassIndex(59431);
    }

    /* renamed from: a */
    public abstract void mo85143a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo85144a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo85145a(DataCenter dataCenter);

    /* renamed from: b */
    public void mo85147b() {
    }

    /* renamed from: b */
    public final void mo85469b(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.f116155f = dataCenter;
            mo85145a(dataCenter);
        }
    }

    public AbstractC50304g(View view) {
        this.f116156g = view.getContext();
        this.f116157h = view;
        mo85144a(view);
    }

    /* renamed from: a */
    public void mo85146a(VideoItemParams videoItemParams) {
        if (videoItemParams != null) {
            this.f116150a = videoItemParams.mAweme;
            this.f116154e = videoItemParams.mPageType;
            this.f116151b = videoItemParams.mEventType;
            this.f116152c = videoItemParams.mRequestId;
            this.f116153d = videoItemParams.isMyProfile;
            this.f116158i = videoItemParams.mEnterMethodValue;
            this.f116159j = videoItemParams.fragment;
            this.f116160k = videoItemParams.mAwemeFromPage;
        }
    }
}
