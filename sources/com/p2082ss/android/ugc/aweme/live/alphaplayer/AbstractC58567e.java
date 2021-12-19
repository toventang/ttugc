package com.p2082ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.controller.AbstractC58539a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58522a;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58527b;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3403e.AbstractC58568a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.e */
public interface AbstractC58567e {
    static {
        Covode.recordClassIndex(68862);
    }

    /* renamed from: a */
    void mo95883a();

    /* renamed from: a */
    void mo95884a(float f, float f2);

    /* renamed from: a */
    void mo95885a(List<C58527b> list);

    /* renamed from: a */
    boolean mo95886a(ViewGroup viewGroup);

    /* renamed from: b */
    void mo95887b();

    /* renamed from: b */
    boolean mo95888b(ViewGroup viewGroup);

    void bringToFront();

    /* renamed from: c */
    boolean mo95889c();

    /* renamed from: d */
    void mo95890d();

    Context getContext();

    int getMeasuredHeight();

    int getMeasuredWidth();

    Resources getResources();

    C58522a.EnumC58526d getScaleType();

    View getView();

    void onPause();

    void requestRender();

    void setConfigParams(C58522a.C58524b bVar);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPlayerController(AbstractC58539a aVar);

    void setVideoRenderer(AbstractC58568a aVar);

    void setVisibility(int i);
}
