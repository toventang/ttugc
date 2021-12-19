package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3341a.C57435a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.MarqueeView;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicInfoWidget */
public final class MusicInfoWidget extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(67357);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicInfoWidget$a */
    public static final class C57430a extends AbstractC57436a implements AbstractC1214u<C33942b> {

        /* renamed from: a */
        public MarqueeView f130930a;

        /* renamed from: b */
        final /* synthetic */ View f130931b;

        /* renamed from: c */
        private boolean f130932c;

        static {
            Covode.recordClassIndex(67358);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94687a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: b */
        public final String mo94694b() {
            return "music_info";
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: c */
        public final Map<String, String> mo94700c() {
            String str;
            Music music;
            HashMap hashMap = new HashMap();
            Aweme aweme = this.f130950d;
            if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMid()) == null) {
                str = "";
            }
            hashMap.put("music_id", str);
            return hashMap;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94690a(DataCenter dataCenter) {
            DataCenter a;
            DataCenter a2;
            if (dataCenter != null && (a = dataCenter.mo60189a("start_animation", (AbstractC1214u<C33942b>) this)) != null && (a2 = a.mo60189a("pause_animation", (AbstractC1214u<C33942b>) this)) != null) {
                a2.mo60189a("stop_animation", (AbstractC1214u<C33942b>) this);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94689a(View view) {
            MethodCollector.m26663i(6441);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.acv, (ViewGroup) null);
                this.f130930a = (MarqueeView) inflate.findViewById(R.id.b1_);
                frameLayout.addView(inflate);
            }
            MethodCollector.m26664o(6441);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94691a(C57435a aVar) {
            String str;
            Music music;
            super.mo94691a(aVar);
            this.f130932c = false;
            MarqueeView marqueeView = this.f130930a;
            if (marqueeView != null) {
                Aweme aweme = this.f130950d;
                if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMusicName()) == null) {
                    str = "";
                }
                marqueeView.setText(str);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C33942b bVar) {
            C33942b bVar2 = bVar;
            if (bVar2 != null) {
                String str = bVar2.f80277a;
                int hashCode = str.hashCode();
                if (hashCode != -463583257) {
                    if (hashCode != -301890681) {
                        if (hashCode == 64864379 && str.equals("pause_animation") && this.f130932c) {
                            MarqueeView marqueeView = this.f130930a;
                            if (marqueeView != null) {
                                marqueeView.mo94802b();
                            }
                            this.f130932c = false;
                        }
                    } else if (str.equals("stop_animation") && this.f130932c) {
                        MarqueeView marqueeView2 = this.f130930a;
                        if (marqueeView2 != null) {
                            marqueeView2.mo94803c();
                        }
                        this.f130932c = false;
                    }
                } else if (str.equals("start_animation") && !this.f130932c) {
                    MarqueeView marqueeView3 = this.f130930a;
                    if (marqueeView3 != null) {
                        marqueeView3.mo94801a();
                    }
                    this.f130932c = true;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57430a(View view, View view2) {
            super(view2);
            this.f130931b = view;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    /* renamed from: b */
    public final AbstractC57436a mo94686b(View view) {
        return new C57430a(view, view);
    }
}
