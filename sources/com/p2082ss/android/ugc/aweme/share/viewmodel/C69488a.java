package com.p2082ss.android.ugc.aweme.share.viewmodel;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a */
public final class C69488a {

    /* renamed from: c */
    public static final C69499d f155241c = new C69499d();

    /* renamed from: d */
    public static final C69489a f155242d = new C69489a((byte) 0);

    /* renamed from: a */
    public final FeedPanelStateViewModel f155243a;

    /* renamed from: b */
    public final Context f155244b;

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$b */
    public interface AbstractC69490b {
        static {
            Covode.recordClassIndex(81831);
        }

        /* renamed from: a */
        void mo87085a();

        /* renamed from: b */
        void mo87086b();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$a */
    public static final class C69489a {
        static {
            Covode.recordClassIndex(81830);
        }

        private C69489a() {
        }

        public /* synthetic */ C69489a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C69488a m122709a(Context context) {
            FeedPanelStateViewModel feedPanelStateViewModel;
            C89219l.m154721d(context, "");
            if (context instanceof ActivityC0945e) {
                feedPanelStateViewModel = (FeedPanelStateViewModel) C1181ae.m3881a((ActivityC0945e) context, C69488a.f155241c).mo3983a(FeedPanelStateViewModel.class);
            } else {
                feedPanelStateViewModel = null;
            }
            return new C69488a(feedPanelStateViewModel, context, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(81829);
    }

    /* renamed from: a */
    public final void mo109734a(AbstractC69490b bVar) {
        C89219l.m154721d(bVar, "");
        mo109735a("swipe_up_guide", bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$c */
    public static final class C69491c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC69490b f155245a;

        static {
            Covode.recordClassIndex(81832);
        }

        C69491c(AbstractC69490b bVar) {
            this.f155245a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f155245a.mo87085a();
                } else {
                    this.f155245a.mo87086b();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo109737a(String str) {
        Boolean value;
        C1213t<Boolean> b = m122704b(str);
        if (b == null || (value = b.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    /* renamed from: b */
    private final C1213t<Boolean> m122704b(String str) {
        FeedPanelStateViewModel feedPanelStateViewModel;
        FeedPanelStateViewModel feedPanelStateViewModel2;
        FeedPanelStateViewModel feedPanelStateViewModel3;
        FeedPanelStateViewModel feedPanelStateViewModel4;
        FeedPanelStateViewModel feedPanelStateViewModel5;
        FeedPanelStateViewModel feedPanelStateViewModel6;
        FeedPanelStateViewModel feedPanelStateViewModel7;
        FeedPanelStateViewModel feedPanelStateViewModel8;
        FeedPanelStateViewModel feedPanelStateViewModel9;
        FeedPanelStateViewModel feedPanelStateViewModel10;
        FeedPanelStateViewModel feedPanelStateViewModel11;
        FeedPanelStateViewModel feedPanelStateViewModel12;
        FeedPanelStateViewModel feedPanelStateViewModel13;
        switch (str.hashCode()) {
            case -2144360174:
                if (!str.equals("long_press_layer") || (feedPanelStateViewModel = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel.f155239m;
            case -1109403612:
                if (!str.equals("comment_panel") || (feedPanelStateViewModel2 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel2.f155229c;
            case -208635325:
                if (!str.equals("gif_share_dialog") || (feedPanelStateViewModel3 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel3.f155235i;
            case -67089052:
                if (!str.equals("upload_progress_fragment") || (feedPanelStateViewModel4 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel4.f155240n;
            case -18099452:
                if (!str.equals("downloaded_video_share_dialog") || (feedPanelStateViewModel5 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel5.f155236j;
            case 106825951:
                if (!str.equals("download_dialog") || (feedPanelStateViewModel6 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel6.f155233g;
            case 403708324:
                if (!str.equals("share_panel") || (feedPanelStateViewModel7 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel7.f155230d;
            case 684302462:
                if (!str.equals("privacy_policy_dialog") || (feedPanelStateViewModel8 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel8.f155232f;
            case 1049683556:
                if (!str.equals("gif_download_dialog") || (feedPanelStateViewModel9 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel9.f155234h;
            case 1316323261:
                if (!str.equals("swipe_up_guide") || (feedPanelStateViewModel10 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel10.f155227a;
            case 1494381465:
                if (!str.equals("story_page") || (feedPanelStateViewModel11 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel11.f155231e;
            case 1654221230:
                if (!str.equals("login_panel") || (feedPanelStateViewModel12 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel12.f155228b;
            case 2144107035:
                if (!str.equals("follow_guide_popup") || (feedPanelStateViewModel13 = this.f155243a) == null) {
                    return null;
                }
                return feedPanelStateViewModel13.f155237k;
            default:
                return null;
        }
    }

    private C69488a(FeedPanelStateViewModel feedPanelStateViewModel, Context context) {
        this.f155243a = feedPanelStateViewModel;
        this.f155244b = context;
    }

    /* renamed from: a */
    public final void mo109735a(String str, AbstractC69490b bVar) {
        C1213t<Boolean> b;
        if (this.f155243a != null && (this.f155244b instanceof AbstractC1204m) && (b = m122704b(str)) != null) {
            b.observe((AbstractC1204m) this.f155244b, new C69491c(bVar));
        }
    }

    /* renamed from: a */
    public final void mo109736a(String str, boolean z) {
        C1213t<Boolean> b = m122704b(str);
        if (b != null && (!C89219l.m154714a(b.getValue(), Boolean.valueOf(z)))) {
            b.setValue(Boolean.valueOf(z));
        }
    }

    public /* synthetic */ C69488a(FeedPanelStateViewModel feedPanelStateViewModel, Context context, byte b) {
        this(feedPanelStateViewModel, context);
    }
}
