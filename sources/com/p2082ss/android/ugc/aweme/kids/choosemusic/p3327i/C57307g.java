package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.g */
public final class C57307g extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public int f130570a;

    /* renamed from: b */
    SmartImageView f130571b;

    /* renamed from: c */
    protected Banner f130572c;

    /* renamed from: d */
    private int f130573d;

    /* renamed from: e */
    private int[] f130574e = new int[2];

    static {
        Covode.recordClassIndex(67212);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.g$a */
    class View$OnAttachStateChangeListenerC57308a implements View.OnAttachStateChangeListener, Runnable {

        /* renamed from: b */
        private boolean f130576b;

        static {
            Covode.recordClassIndex(67213);
        }

        /* renamed from: a */
        private void m103901a() {
            this.f130576b = false;
            C57307g.this.itemView.removeCallbacks(this);
        }

        public final void run() {
            boolean z;
            Banner banner = C57307g.this.f130572c;
            Rect rect = new Rect();
            if (!C57307g.m103898a(C57307g.this.itemView) || !C57307g.this.itemView.getGlobalVisibleRect(rect) || rect.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (banner != null) {
                if (z && !this.f130576b) {
                    C39162r.m79460a("banner_show", new C33744d().mo59983a("enter_from", "change_music_page").mo59983a("banner_id", C57307g.this.f130572c.getBid()).mo59983a("client_order", Integer.toString(C57307g.this.f130570a)).f79943a);
                }
                this.f130576b = z;
            }
            C57307g.this.itemView.postDelayed(this, 250);
        }

        public final void onViewDetachedFromWindow(View view) {
            m103901a();
        }

        private View$OnAttachStateChangeListenerC57308a() {
        }

        public final void onViewAttachedToWindow(View view) {
            m103901a();
            run();
        }

        /* synthetic */ View$OnAttachStateChangeListenerC57308a(C57307g gVar, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo94515a() {
        String str;
        Banner banner = this.f130572c;
        if (banner != null && !TextUtils.isEmpty(banner.getSchema())) {
            String schema = this.f130572c.getSchema();
            String str2 = "";
            if (schema != null && schema.startsWith("aweme://assmusic/category/")) {
                if (!schema.contains("?")) {
                    str = schema + "?musicType=" + this.f130573d;
                } else {
                    str = schema + "&musicType=" + this.f130573d;
                }
                SmartRouter.buildRoute(this.itemView.getContext(), str).open(10086);
                String b = C36132v.m73608b(this.f130572c.getSchema(), StringSet.name);
                String bid = this.f130572c.getBid();
                List<String> a = C36132v.m73606a(str);
                if (!C13603b.m24435a((Collection) a) && a.size() >= 2) {
                    str2 = a.get(1);
                }
                C57268c.m103829a(b, "click_banner", bid, "change_music_page", str2);
            } else if (TextUtils.isEmpty(schema) || (!schema.startsWith("http://") && !schema.startsWith("https://"))) {
                SmartRouter.buildRoute(this.itemView.getContext(), this.f130572c.getSchema()).withParam("process_id", UUID.randomUUID().toString()).open(10086);
                List<String> a2 = C36132v.m73606a(this.f130572c.getSchema());
                if (!C13603b.m24435a((Collection) a2) && a2.size() > 1) {
                    new C57171a("change_music_page", str2, "click_banner", C57268c.f130442a);
                }
            } else {
                try {
                    SmartRouter.buildRoute(this.itemView.getContext(), "aweme://webview/?url=" + URLEncoder.encode(schema, "UTF-8")).open(10086);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m103898a(View view) {
        if (view == null || !C0792v.m2791y(view)) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() != 16908290) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return true;
        }
        return false;
    }

    public C57307g(View view, int i) {
        super(view);
        this.f130573d = i;
        View$OnAttachStateChangeListenerC57308a aVar = new View$OnAttachStateChangeListenerC57308a(this, (byte) 0);
        view.addOnAttachStateChangeListener(aVar);
        if (C0792v.m2791y(view)) {
            aVar.run();
        }
        this.f130571b = (SmartImageView) view.findViewById(R.id.dqg);
        View findViewById = view.findViewById(R.id.dqg);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC57309h(this));
        }
        this.f130574e[0] = C13628n.m24504a(view.getContext()) - ((int) (C13628n.m24520b(view.getContext(), 16.0f) * 2.0f));
        int[] iArr = this.f130574e;
        iArr[1] = (int) (((float) iArr[0]) * 0.26239067f);
    }

    /* renamed from: a */
    public final void mo94516a(Banner banner, int i) {
        if (banner != null && banner != this.f130572c) {
            this.f130572c = banner;
            if (banner.getBannerUrl() != null && !C13603b.m24435a((Collection) this.f130572c.getBannerUrl().getUrlList())) {
                C20766v a = C20761r.m39060a(C34735v.m70965a(this.f130572c.getBannerUrl())).mo34185b(C80397em.m139369a(601)).mo34180a(this.f130574e);
                a.f49106c = true;
                C20766v a2 = a.mo34179a("MusicBannerViewHolder");
                a2.f49092E = this.f130571b;
                a2.mo34186c();
            }
            new C37591b((float) C34728n.m70946a(4.0d), this.itemView.getContext().getResources().getColor(R.color.o_)).setAlpha(76);
            this.f130570a = i + 1;
        }
    }
}
