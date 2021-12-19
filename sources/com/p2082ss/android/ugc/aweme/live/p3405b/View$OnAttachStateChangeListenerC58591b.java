package com.p2082ss.android.ugc.aweme.live.p3405b;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48025e;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.b.b */
public final class View$OnAttachStateChangeListenerC58591b implements View.OnAttachStateChangeListener {

    /* renamed from: i */
    public static final C58592a f133454i = new C58592a((byte) 0);

    /* renamed from: a */
    public final ViewGroup f133455a;

    /* renamed from: b */
    public final SmartImageView f133456b;

    /* renamed from: c */
    public final SmartImageView f133457c;

    /* renamed from: d */
    public final SmartImageView f133458d;

    /* renamed from: e */
    public final String f133459e = SettingsManager.m29616a().mo25398a("live_audio_animation_resource", "");

    /* renamed from: f */
    public final List<String> f133460f = C48025e.m91034a();

    /* renamed from: g */
    public LiveRoomStruct f133461g;

    /* renamed from: h */
    public boolean f133462h;

    /* renamed from: j */
    private final View f133463j;

    static {
        Covode.recordClassIndex(68887);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.b.b$a */
    public static final class C58592a {
        static {
            Covode.recordClassIndex(68888);
        }

        private C58592a() {
        }

        public /* synthetic */ C58592a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo96047a() {
        SmartImageView smartImageView = this.f133458d;
        if (smartImageView != null) {
            smartImageView.setUserVisibleHint(false);
        }
        SmartImageView smartImageView2 = this.f133458d;
        if (smartImageView2 != null) {
            smartImageView2.mo34198c();
        }
    }

    /* renamed from: c */
    public final boolean mo96049c() {
        LiveRoomStruct liveRoomStruct = this.f133461g;
        if (liveRoomStruct == null || !liveRoomStruct.liveTypeAudio || !this.f133462h) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo96048b() {
        if (mo96049c()) {
            SmartImageView smartImageView = this.f133458d;
            if (smartImageView != null) {
                smartImageView.setUserVisibleHint(true);
            }
            SmartImageView smartImageView2 = this.f133458d;
            if (smartImageView2 != null) {
                smartImageView2.mo34197b();
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        SmartImageView smartImageView = this.f133458d;
        if (smartImageView != null) {
            smartImageView.setAttached(true);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        SmartImageView smartImageView = this.f133458d;
        if (smartImageView != null) {
            smartImageView.setAttached(false);
        }
    }

    public View$OnAttachStateChangeListenerC58591b(View view) {
        C89219l.m154721d(view, "");
        this.f133463j = view;
        this.f133455a = (ViewGroup) view.findViewById(R.id.mo);
        this.f133456b = (SmartImageView) view.findViewById(R.id.mm);
        this.f133457c = (SmartImageView) view.findViewById(R.id.mn);
        this.f133458d = (SmartImageView) view.findViewById(R.id.ml);
        view.addOnAttachStateChangeListener(this);
    }

    /* renamed from: a */
    public static String m107697a(List<String> list, String str) {
        int i;
        long j;
        C89219l.m154721d(list, "");
        if (C13617h.m24465a(list)) {
            return null;
        }
        int i2 = 0;
        if (str != null) {
            try {
                j = Long.parseLong(str);
            } catch (Exception unused) {
                i = 0;
            }
        } else {
            j = 0;
        }
        i = (int) (j % ((long) list.size()));
        if (i >= 0 && i < list.size()) {
            i2 = i;
        }
        return list.get(i2);
    }
}
