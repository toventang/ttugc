package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50528ad;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.AbstractC72888b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import java.util.WeakHashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.cd */
public interface AbstractC48234cd extends AbstractC1183ag, AbstractC1214u<C33942b>, C33403c.AbstractC33407c, AbstractC48147ag, AbstractC48148ah, AbstractC48149ai, AbstractC72888b, AbstractC72926g, AbstractC84295k {

    /* renamed from: aJ */
    public static final C48235a f111737aJ = C48235a.f111740c;

    static {
        Covode.recordClassIndex(56976);
    }

    /* renamed from: a */
    void mo80160a(View.OnTouchListener onTouchListener);

    /* renamed from: a */
    void mo80071a(Video video);

    /* renamed from: a */
    void mo80162a(LongPressLayout.AbstractC50014a aVar);

    /* renamed from: a */
    void mo80168a(boolean z, int i);

    /* renamed from: an */
    View mo80193an();

    /* renamed from: aq */
    void mo80196aq();

    /* renamed from: as */
    JSONObject mo80198as();

    /* renamed from: at */
    boolean mo80199at();

    /* renamed from: au */
    double mo80200au();

    /* renamed from: aw */
    DataCenter mo80202aw();

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.cd$a */
    public static final class C48235a {

        /* renamed from: a */
        public static final WeakHashMap<Context, C13605d<SurfaceView>> f111738a = new WeakHashMap<>();

        /* renamed from: b */
        static final WeakHashMap<Context, C13605d<AbstractC48234cd>> f111739b = new WeakHashMap<>();

        /* renamed from: c */
        static final /* synthetic */ C48235a f111740c = new C48235a();

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.cd$a$a */
        public static final class C48236a implements LongPressLayout.AbstractC50014a {

            /* renamed from: a */
            public static final C48236a f111741a = new C48236a();

            static {
                Covode.recordClassIndex(56978);
            }

            C48236a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout.AbstractC50014a
            /* renamed from: a */
            public final void mo80347a(float f, float f2) {
            }
        }

        private C48235a() {
        }

        static {
            Covode.recordClassIndex(56977);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.cd$a$b */
        public static final class C48237b implements LongPressLayout.AbstractC50014a {

            /* renamed from: a */
            final /* synthetic */ BaseFeedPageParams f111742a;

            /* renamed from: b */
            final /* synthetic */ Context f111743b;

            static {
                Covode.recordClassIndex(56979);
            }

            C48237b(BaseFeedPageParams baseFeedPageParams, Context context) {
                this.f111742a = baseFeedPageParams;
                this.f111743b = context;
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout.AbstractC50014a
            /* renamed from: a */
            public final void mo80347a(float f, float f2) {
                String str;
                Boolean isPlayListCleanMode = this.f111742a.isPlayListCleanMode();
                C89219l.m154716b(isPlayListCleanMode, "");
                if (!isPlayListCleanMode.booleanValue()) {
                    if (this.f111742a.eventType == null) {
                        str = "";
                    } else {
                        str = this.f111742a.eventType;
                    }
                    C89219l.m154716b(str, "");
                    if (C50528ad.m94717a(str)) {
                        AbstractC81915c.m141874a(new C49678f(this.f111742a.awemeFromPage, f, f2, this.f111743b.hashCode()));
                    }
                }
            }
        }
    }
}
